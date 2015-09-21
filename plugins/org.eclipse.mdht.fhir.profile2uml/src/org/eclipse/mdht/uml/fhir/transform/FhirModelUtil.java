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

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.StructureDefinition;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Property;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Uri;

public class FhirModelUtil {

	public static StructureDefinition getStructureDefinition(Classifier umlClass) {
		return (StructureDefinition) EcoreUtil.getObjectByType(
				umlClass.getStereotypeApplications(), FHIRPackage.eINSTANCE.getStructureDefinition());
	}

	public static Uri getStructureDefinitionUri(Classifier umlClass) {
		Uri uri = null;
		StructureDefinition structureDefStereotype = getStructureDefinition(umlClass);
		if (structureDefStereotype != null && structureDefStereotype.getUri() != null) {
			uri = FhirFactory.eINSTANCE.createUri();
			uri.setValue(structureDefStereotype.getUri());
		}
		
		return uri;
	}
	
	public static ValueSet getValueSet(Enumeration umlEnum) {
		return (ValueSet) EcoreUtil.getObjectByType(
				umlEnum.getStereotypeApplications(), FHIRPackage.eINSTANCE.getValueSet());
	}

	public static TypeChoice getTypeChoice(Property property) {
		return (TypeChoice) EcoreUtil.getObjectByType(
				property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getTypeChoice());
	}

	/**
	 * Classifier is subclass of a FHIR Extension type.
	 */
	public static boolean isExtension(Classifier classifier) {
		return FhirModelUtil.isKindOf(classifier, ModelConstants.EXTENSION_CLASS_NAME);
	}

	/**
	 * Classifier is subclass of a FHIR Extension type, and has extension attributes.
	 */
	public static boolean isComplexExtension(Classifier classifier) {
		boolean isComplex = false;
		if (isExtension(classifier)) {
			for (Property property : classifier.getAttributes()) {
				if (property.getType() instanceof Classifier && isExtension((Classifier)property.getType())) {
					isComplex = true;
					break;
				}
			}
		}

		return isComplex;
	}

	public static boolean isNestedType(Classifier classifier) {
		return classifier.getOwner() instanceof Class;
	}

	public static boolean hasNestedType(Property property) {
		return property.getType() != null && property.getType().getOwner() instanceof Class;
	}

	public static boolean isSliced(Property property) {
		return !property.getSubsettedProperties().isEmpty();
	}

	public static boolean hasTypeChoice(Property property) {
		return property.getType() != null && property.getType().getOwner() instanceof Class;
	}

	public static boolean isKindOf(Classifier umlClass, String parentName) {
		if (umlClass.getName().equals(parentName)) {
			return true;
		}
		else {
			return isSubclassOf(umlClass, parentName);
		}
	}
	
	public static boolean isSubclassOf(Classifier umlClass, String parentName) {
		for (Classifier parent : umlClass.allParents()) {
			if (parentName.equals(parent.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * All members of typeList are subclasses of Classifier with parentName.
	 */
	public static boolean allSubclassOf(List<Classifier> typeList, String parentName) {
		for (Classifier classifier : typeList) {
			boolean foundIt = false;
			for (Classifier parent : classifier.allParents()) {
				if (parentName.equals(parent.getName())) {
					foundIt = true;
					break;
				}
			}
			if (!foundIt) {
				return false;
			}
		}
		return true;
	}
}
