/*******************************************************************************
 * Copyright (c) 2015 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.transform;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.mdht.uml.fhir.StructureDefinition;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;

public class ModelIndexer implements ModelConstants {

	// These three sets are populated from FHIR defined ValueSets
	private Set<String> resourceTypes = new HashSet<String>();
	private Set<String> dataTypes = new HashSet<String>();
	private Set<String> definedTypes = new HashSet<String>();
	
	// key = FHIR ValueSet URI, value = UML Enumeration
	private Map<String,Enumeration> valueSetMap = new HashMap<String,Enumeration>();

//	private Map<String,Class> structureDefinitionNameMap = new HashMap<String,Class>();
	private Map<String,Class> structureDefinitionUriMap = new HashMap<String,Class>();
	
	/*
	 * Reference by name can be used only for members of 'defined-types' value set.
	 * Add FHIR_STRUCTURE_URI_BASE prefix and redirect to structureDefinitionUriMap.
	 */
	public Class getStructureDefinitionForName(String name) {
		return structureDefinitionUriMap.get(FHIR_STRUCTURE_URI_BASE + name);
	}

	public Class getStructureDefinitionForURI(String uri) {
		return structureDefinitionUriMap.get(uri);
	}

	public Enumeration getValueSetForURI(String uri) {
		return valueSetMap.get(uri);
	}
	
	public boolean isDefinedType(Classifier classifier) {
		return isDefinedType(classifier.getName());
	}

	public boolean isDefinedType(String typeName) {
		return definedTypes.contains(typeName);
	}

	public boolean isCoreResourceType(Classifier classifier) {
		// TODO also test that classifier is subclass of Resource
		return isCoreResourceType(classifier.getName());
	}

	public boolean isCoreResourceType(String typeName) {
		return resourceTypes.contains(typeName);
	}

	public boolean isCoreDataType(Classifier classifier) {
		// TODO also test that classifier is subclass of DataType
		return isCoreDataType(classifier.getName());
	}

	public boolean isCoreDataType(String typeName) {
		return dataTypes.contains(typeName);
	}

	public boolean isKindOfDataType(Classifier classifier) {
		boolean isDataType = isCoreDataType(classifier);
		for (Classifier parent : classifier.allParents()) {
			if (isDataType) {
				break;
			}
			isDataType = isCoreDataType(parent);
		}
		return isDataType;
	}

	public boolean isKindOfResource(Classifier classifier) {
		boolean isResource = isCoreResourceType(classifier);
		for (Classifier parent : classifier.allParents()) {
			if (isResource) {
				break;
			}
			isResource = isCoreResourceType(parent);
		}
		return isResource;
	}
	
	/**
	 * Classifier is subclass of a FHIR defined-type.
	 */
	public boolean isProfile(Classifier classifier) {
		return !isDefinedType(classifier);
	}

	/**
	 * Classifier is subclass of a FHIR Extension type.
	 */
	public boolean isExtension(Classifier classifier) {
		return FhirModelUtil.isSubclassOf(classifier, EXTENSION_CLASS_NAME);
	}

	public void indexMembers(Package umlPackage) {
		for (NamedElement member : umlPackage.getMembers()) {
			if (member instanceof Class) {
				StructureDefinition structureDefinition = FhirModelUtil.getStructureDefinition((Class)member);
				if (structureDefinition != null) {
					addElement(structureDefinition);
				}
			}
			else if (member instanceof Enumeration) {
				ValueSet valueSet = FhirModelUtil.getValueSet((Enumeration)member);
				if (valueSet != null) {
					addElement(valueSet);
				}
			}
			else if (member instanceof Package) {
				indexMembers((Package)member);
			}
			else if (member instanceof PackageImport) {
				indexMembers(((PackageImport)member).getImportedPackage());
			}
		}
	}
	
	public void addElement(StructureDefinition structureDefinition) {
		Class baseClass = structureDefinition.getBase_Class();
		if (baseClass != null) {
//			structureDefinitionNameMap.put(baseClass.getName(), baseClass);
			if (structureDefinition.getUri() != null) {
				structureDefinitionUriMap.put(structureDefinition.getUri(), baseClass);
			}
		}
	}

	public void addElement(ValueSet valueSet) {
		Enumeration umlEnumeration = valueSet.getBase_Enumeration();
		if (umlEnumeration != null) {
			if (valueSet.getUri() != null) {
				valueSetMap.put(valueSet.getUri(), umlEnumeration);
				
				// Create a Set for codes from these three ValueSets
				if (valueSet.getUri().equals(FHIR_VALUESET_URI_BASE + VALUESET_ID_RESOURCE_TYPES)) {
					for (EnumerationLiteral literal : umlEnumeration.getOwnedLiterals()) {
						resourceTypes.add(literal.getName());
					}
				}
				else if (valueSet.getUri().equals(FHIR_VALUESET_URI_BASE + VALUESET_ID_DATA_TYPES)) {
					for (EnumerationLiteral literal : umlEnumeration.getOwnedLiterals()) {
						dataTypes.add(literal.getName());
					}
				}
				else if (valueSet.getUri().equals(FHIR_VALUESET_URI_BASE + VALUESET_ID_DEFINED_TYPES)) {
					for (EnumerationLiteral literal : umlEnumeration.getOwnedLiterals()) {
						definedTypes.add(literal.getName());
					}
				}
			}
		}
	}

}
