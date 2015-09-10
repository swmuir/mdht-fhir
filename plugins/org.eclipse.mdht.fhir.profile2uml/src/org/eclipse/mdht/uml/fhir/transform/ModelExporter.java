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

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Id;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionKindList;
import org.hl7.fhir.Uri;

public class ModelExporter implements ModelConstants {

	private ModelIndexer modelIndexer = new ModelIndexer();
	
	public void indexContents(Package umlPackage) {
		modelIndexer.indexMembers(umlPackage);
	}
	
	public StructureDefinition createStrucureDefinition(Class umlClass) {
		org.eclipse.mdht.uml.fhir.StructureDefinition structureDefStereotype = FhirModelUtil.getStructureDefinition(umlClass);
		
		if (structureDefStereotype == null) {
			System.err.println("Skipping class without <<StructureDefinition>>");
			return null;
		}
		
		StructureDefinition structureDef = FhirFactory.eINSTANCE.createStructureDefinition();
		structureDef.setAbstract(createFhirBoolean(umlClass.isAbstract()));

		String id = structureDefStereotype.getId() != null 
				? structureDefStereotype.getId() : umlClass.getName().toLowerCase();
		String uri = structureDefStereotype.getUri() != null 
						? structureDefStereotype.getUri() : MDHT_STRUCTURE_URI_BASE + id;
		String publisher = structureDefStereotype.getPublisher() != null 
								? structureDefStereotype.getPublisher() : "Model Driven Health Tools (MDHT)";
		
		structureDef.setId(createFhirId(id));
		structureDef.setUrl(createFhirUri(uri));
		structureDef.setStatus(createFhirCode("draft"));
		structureDef.setDate(createFhirDateTimeNow());
		structureDef.setPublisher(createFhirString(publisher));

		if (structureDefStereotype.getName() != null) {
			structureDef.setName(createFhirString(structureDefStereotype.getName()));
		}
		if (structureDefStereotype.getDisplay() != null) {
			structureDef.setDisplay(createFhirString(structureDefStereotype.getDisplay()));
		}
		
		for (Classifier parent : umlClass.getGenerals()) {
			Uri baseUri = FhirModelUtil.getStructureDefinitionUri(parent);
			if (baseUri != null) {
				structureDef.setBase(baseUri);
			}
		}
		
		// Set 'constrainedType'
		Classifier constrainedType = getConstrainedType(umlClass);
		if (!umlClass.equals(constrainedType)) {
			structureDef.setConstrainedType(createFhirCode(constrainedType.getName()));
		}
		
		// Set 'kind'
		StructureDefinitionKindList kindList = StructureDefinitionKindList.LOGICAL;
		if (modelIndexer.isKindOfDataType(umlClass)) {
			kindList = StructureDefinitionKindList.DATATYPE;
		}
		else if (modelIndexer.isKindOfResource(umlClass)) {
			kindList = StructureDefinitionKindList.RESOURCE;
		}
		StructureDefinitionKind kind = FhirFactory.eINSTANCE.createStructureDefinitionKind();
		kind.setValue(kindList);
		structureDef.setKind(kind);
		
		// Add 'contextType' and 'context'
		if (modelIndexer.isExtension(umlClass)) {
			
		}
		
		// Add differential ElementDefinitions
		StructureDefinitionDifferential differential = FhirFactory.eINSTANCE.createStructureDefinitionDifferential();
		structureDef.setDifferential(differential);
		
		// Add profile element definition for the Class
		ElementDefinition elementDef = FhirFactory.eINSTANCE.createElementDefinition();
		differential.getElement().add(elementDef);
		String path = constrainedType.getName();
		elementDef.setPath(createFhirString(path));
		elementDef.setMin(createFhirInteger(0));
		elementDef.setMax(createFhirString("*"));
		if (!umlClass.getName().equals(constrainedType.getName())) {
			elementDef.setName(createFhirString(umlClass.getName()));
		}
		ElementDefinitionType elementDefType = FhirFactory.eINSTANCE.createElementDefinitionType();
		elementDefType.setCode(createFhirCode(constrainedType.getName()));
		elementDef.getType().add(elementDefType);

		// Add element definition for each Property
		addElementDefinitions(umlClass, differential);
		
		return structureDef;
	}
	
	private void addElementDefinitions(Class umlClass, StructureDefinitionDifferential differential) {
		for (Property property : umlClass.getOwnedAttributes()) {
			ElementDefinition elementDef = createElementDefinition(property);
			differential.getElement().add(elementDef);
			// only if type is nested in this class, not nested class inherited from superclass.
			if (FhirModelUtil.hasNestedType(property) && property.getType().getOwner() == umlClass) {
				addElementDefinitions((Class) property.getType(), differential);
			}
		}
	}

	private ElementDefinition createElementDefinition(Property property) {
		org.eclipse.mdht.uml.fhir.ElementDefinition elementDefStereotype = 
				(org.eclipse.mdht.uml.fhir.ElementDefinition) EcoreUtil.getObjectByType(
						property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getElementDefinition());
		ElementDefinition elementDef = FhirFactory.eINSTANCE.createElementDefinition();

		String path = getPath(property);
		elementDef.setPath(createFhirString(path));
		elementDef.setMin(createFhirInteger(property.getLower()));
		elementDef.setMax(createFhirString(property.getUpper() == -1 ? "*" : Integer.toString(property.getUpper())));

		// Add type(s)
		if (property.getType() != null && !FhirModelUtil.hasNestedType(property)) {
			TypeChoice typeChoice = (TypeChoice) EcoreUtil.getObjectByType(
					property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getTypeChoice());
			if (typeChoice != null) {
				for (Classifier type : typeChoice.getTypes()) {
					ElementDefinitionType elementType = createType(type);
					elementDef.getType().add(elementType);
				}
			}
			else if (property.getType() instanceof Classifier) {
				ElementDefinitionType elementType = createType((Classifier)property.getType());
				elementDef.getType().add(elementType);
			}
		}
		
		// Add other element metadata
		if (elementDefStereotype != null) {
			if (elementDefStereotype.getId() != null) {
				elementDef.setId(elementDefStereotype.getId());
			}
			if (elementDefStereotype.getName() != null) {
				elementDef.setName(createFhirString(elementDefStereotype.getName()));
			}
			if (elementDefStereotype.getIsSummary() != null) {
				elementDef.setIsSummary(createFhirBoolean(elementDefStereotype.getIsSummary()));
			}
			if (elementDefStereotype.getIsModifier() != null) {
				elementDef.setIsModifier(createFhirBoolean(elementDefStereotype.getIsModifier()));
			}
			if (elementDefStereotype.getMustSupport() != null) {
				elementDef.setMustSupport(createFhirBoolean(elementDefStereotype.getMustSupport()));
			}
		}
		
		return elementDef;
	}

	private String getPathOLD(Property property) {
		StringBuffer qname = new StringBuffer(property.getName());
		Element container = property.getOwner();
		while (container instanceof NamedElement) {
			if (container instanceof Package) {
				break;
			}
			qname.insert(0, ".");
			qname.insert(0, ((NamedElement) container).getName());
			container = container.getOwner();
		}
		
		String path = qname.toString();
		
		return path;
	}

	private String getPath(Property property) {
		List<NamedElement> pathSegments = new ArrayList<NamedElement>();
		
		pathSegments.add(property);;
		Element container = property.getOwner();
		while (container instanceof NamedElement) {
			if (container instanceof Package) {
				break;
			}
			pathSegments.add(0, ((NamedElement) container));
			container = container.getOwner();
		}
		
		String[] pathNames = new String[pathSegments.size()];
		for (int i = 0; i < pathSegments.size(); i++) {
			NamedElement pathSegment = pathSegments.get(i);
//			NamedElement nextSegment = (i == pathSegments.size() -1)  ? null : pathSegments.get(i+1);
			if (i == 0) {
				// This must be a Class
				Classifier constrainedType = getConstrainedType((Classifier)pathSegment);
				pathNames[i] = constrainedType.getName();
			}
			if (pathSegment instanceof Classifier && ((Classifier)pathSegment).getOwner() instanceof Class) {
				// Nested class. Find property from containing class that has this class as its type.
				Classifier nestedClass = (Classifier) pathSegment;
				Class nestingClass = (Class) nestedClass.getOwner();
				Property referencingProperty = nestingClass.getAttribute(null, nestedClass);
				if (referencingProperty != null) {
					pathNames[i] = referencingProperty.getName();
				}
			}
			else if (pathSegment instanceof Property) {
				Property constrainedProperty = getConstrainedProperty(((Property)pathSegment));
				if (constrainedProperty != null) {
					pathNames[i] = constrainedProperty.getName();
				}
				else {
					pathNames[i] = ((Property)pathSegment).getName();
				}
			}
		}

		StringBuffer path = new StringBuffer();
		for (int i = 0; i < pathNames.length; i++) {
			path.append(i>0 ? "." : "");
			path.append(pathNames[i]);
		}
		return path.toString();
	}

	private ElementDefinitionType createType(Classifier type) {
		ElementDefinitionType elementDefType = FhirFactory.eINSTANCE.createElementDefinitionType();
		Classifier elementType = null;
		if (modelIndexer.isCoreDataType(type)) {
			elementType = type;
		}
		else if (FhirModelUtil.isKindOf(type, RESOURCE_CLASS_NAME)) {
			elementType = modelIndexer.getStructureDefinitionForName(REFERENCE_CLASS_NAME);
		}
		else {
			elementType = getConstrainedType(type);
		}
		elementDefType.setCode(createFhirCode(elementType.getName()));
		
		if (!type.equals(elementType)) {
			org.eclipse.mdht.uml.fhir.StructureDefinition structureDefStereotype = FhirModelUtil.getStructureDefinition(type);
			if (structureDefStereotype != null) {
				elementDefType.getProfile().add(createFhirUri(structureDefStereotype.getUri()));
			}
		}
		return elementDefType;
	}

	private Classifier getConstrainedType(Classifier profileClass) {
		if (modelIndexer.isDefinedType(profileClass)) {
			return profileClass;
		}
		for (Classifier parent : profileClass.allParents()) {
			if (modelIndexer.isDefinedType(parent)) {
				return parent;
			}
		}
		
		return null;
	}
	
	private Property getConstrainedProperty(Property property) {
		Property coreProperty = null;
		Classifier constrainedType = getConstrainedType((Classifier)property.getOwner());
		if (constrainedType != null) {
			coreProperty = constrainedType.getAttribute(property.getName(), null);
		}

		if (coreProperty == null) {
			for (Property redefined : property.getRedefinedProperties()) {
				coreProperty = getConstrainedProperty(redefined);
			}
		}
		if (coreProperty == null) {
			for (Property subsetted : property.getSubsettedProperties()) {
				coreProperty = getConstrainedProperty(subsetted);
			}
		}
		
		return coreProperty;
	}
	
	private Id createFhirId(String value) {
		Id id = FhirFactory.eINSTANCE.createId();
		id.setValue(value);
		return id;
	}

	private Uri createFhirUri(String value) {
		Uri uri = FhirFactory.eINSTANCE.createUri();
		uri.setValue(value);
		return uri;
	}

	private org.hl7.fhir.String createFhirString(String value) {
		org.hl7.fhir.String fhirString = FhirFactory.eINSTANCE.createString();
		fhirString.setValue(value);
		return fhirString;
	}

	private org.hl7.fhir.Boolean createFhirBoolean(boolean value) {
		org.hl7.fhir.Boolean fhirBoolean = FhirFactory.eINSTANCE.createBoolean();
		fhirBoolean.setValue(value);
		return fhirBoolean;
	}

	private org.hl7.fhir.Integer createFhirInteger(int value) {
		org.hl7.fhir.Integer fhirInteger = FhirFactory.eINSTANCE.createInteger();
		fhirInteger.setValue(value);
		return fhirInteger;
	}

	private org.hl7.fhir.Code createFhirCode(String value) {
		org.hl7.fhir.Code fhirCode = FhirFactory.eINSTANCE.createCode();
		fhirCode.setValue(value);
		return fhirCode;
	}

	private org.hl7.fhir.DateTime createFhirDateTime(XMLGregorianCalendar value) {
		org.hl7.fhir.DateTime fhirDate = FhirFactory.eINSTANCE.createDateTime();
		fhirDate.setValue(value);
		return fhirDate;
	}

	private org.hl7.fhir.DateTime createFhirDateTimeNow() {
		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(new Date());
			XMLGregorianCalendar xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			return createFhirDateTime(xmlCal);
			
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
