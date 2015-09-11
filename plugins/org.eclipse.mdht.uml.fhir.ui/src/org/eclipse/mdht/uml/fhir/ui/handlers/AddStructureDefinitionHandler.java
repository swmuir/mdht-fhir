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
package org.eclipse.mdht.uml.fhir.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.StructureDefinition;
import org.eclipse.mdht.uml.fhir.transform.FhirModelUtil;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.common.ui.search.IElementFilter;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class AddStructureDefinitionHandler extends AddUMLClassHandler {

	private static final String HAS_BASE_TYPES_PARAMETER = "org.eclipse.mdht.uml.fhir.ui.commandParameter.hasBaseTypes";
	private static final String NOT_BASE_TYPES_PARAMETER = "org.eclipse.mdht.uml.fhir.ui.commandParameter.notBaseTypes";

	@Override
	protected String getClassName(ExecutionEvent event, IWorkbenchPart activePart) {
		String className = null;

		String hasBaseTypeNames = event.getParameter(HAS_BASE_TYPES_PARAMETER);
		String baseTypeLabel = (hasBaseTypeNames != null) ? " for " + hasBaseTypeNames : "";

		InputDialog inputDialog = new InputDialog(
			activePart.getSite().getShell(), "New Profile" + baseTypeLabel, "Enter profile name", "", null);
		if (inputDialog.open() == Window.OK) {
			className = inputDialog.getValue();
		}
		return className;
	}

	@Override
	protected Class selectSuperClass(Class newClass, ExecutionEvent event, IWorkbenchPart activePart) {
		// select a structure definition
		Profile fhirProfile = org.eclipse.uml2.uml.util.UMLUtil.getProfile(FHIRPackage.eINSTANCE.getStructureDefinition().getEPackage(), newClass);
		if (fhirProfile == null) {
			return null;
		}

		String hasBaseTypeNames = event.getParameter(HAS_BASE_TYPES_PARAMETER);
		String notBaseTypeNames = event.getParameter(NOT_BASE_TYPES_PARAMETER);
		
		Stereotype structureDefStereotype = fhirProfile.getOwnedStereotype(org.eclipse.mdht.uml.fhir.FHIRPackage.eINSTANCE.getStructureDefinition().getName());
		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				boolean hasStereotype =  (element instanceof Class) && element.isStereotypeApplied(structureDefStereotype);
				boolean hasBaseType = true;
				boolean notBaseType = true;
				
				if (hasStereotype && hasBaseTypeNames != null) {
					hasBaseType = false;
					String[] names = hasBaseTypeNames.split(",| ");
					for (int i = 0; i < names.length; i++) {
						boolean isKindOf = FhirModelUtil.isKindOf((Class)element, names[i]);
						if (isKindOf) {
							hasBaseType = true;
							break;
						}
					}
				}
				if (hasStereotype && hasBaseType && notBaseTypeNames != null) {
					String[] names = notBaseTypeNames.split(",| ");
					for (int i = 0; i < names.length; i++) {
						boolean isKindOf = FhirModelUtil.isKindOf((Class)element, names[i]);
						if (isKindOf) {
							notBaseType = false;
							break;
						}
					}
				}
				
				return hasStereotype && hasBaseType && notBaseType;
			}
		};

		final Class general = (Class) DialogLaunchUtil.chooseElement(
			filter, UMLUtil.getTopPackage(newClass), activePart.getSite().getShell(), null, "Select a base type or profile");

		return general;
	}

	@Override
	protected void addProperties(Class newClass, Class superClass, ExecutionEvent event, IWorkbenchPart activePart) {
		super.addProperties(newClass, superClass, event, activePart);
	}

	@Override
	protected void postProcess(Class newClass, ExecutionEvent event, IWorkbenchPart activePart) {
		Profile fhirUmlProfile = org.eclipse.uml2.uml.util.UMLUtil.getProfile(
				org.eclipse.mdht.uml.fhir.FHIRPackage.eINSTANCE.getStructureDefinition().getEPackage(), newClass);
		if (fhirUmlProfile != null) {
			StructureDefinition structureDefinition = (StructureDefinition) org.eclipse.uml2.uml.util.UMLUtil.safeApplyStereotype(newClass, fhirUmlProfile.getOwnedStereotype(FHIRPackage.eINSTANCE.getStructureDefinition().getName()));
			structureDefinition.setName(newClass.getName());
		}
	}
}
