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

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.StructureDefinition;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.common.ui.search.IElementFilter;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class AddStructureDefinitionHandler extends AddUMLClassHandler {

	@Override
	protected String getClassName(IWorkbenchPart activePart) {
		String className = null;

		InputDialog inputDialog = new InputDialog(
			activePart.getSite().getShell(), "New Structure Definition", "Enter profile name", "", null);
		if (inputDialog.open() == Window.OK) {
			className = inputDialog.getValue();
		}
		return className;
	}

	@Override
	protected Class selectSuperClass(Class newClass, IWorkbenchPart activePart) {
		// select a structure definition
		Profile fhirProfile = org.eclipse.uml2.uml.util.UMLUtil.getProfile(FHIRPackage.eINSTANCE.getStructureDefinition().getEPackage(), newClass);
		if (fhirProfile == null) {
			return null;
		}
		
		Stereotype structureDefStereotype = fhirProfile.getOwnedStereotype(org.eclipse.mdht.uml.fhir.FHIRPackage.eINSTANCE.getStructureDefinition().getName());
		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				return (element instanceof Class) && element.isStereotypeApplied(structureDefStereotype);
			}
		};

		final Class general = (Class) DialogLaunchUtil.chooseElement(
			filter, UMLUtil.getTopPackage(newClass), activePart.getSite().getShell(), null, "Select a base type or profile");

		return general;
	}

	@Override
	protected void addProperties(Class newClass, Class superClass, IWorkbenchPart activePart) {
		super.addProperties(newClass, superClass, activePart);
	}

	@Override
	protected void postProcess(Class newClass) {
		Profile fhirUmlProfile = org.eclipse.uml2.uml.util.UMLUtil.getProfile(
				org.eclipse.mdht.uml.fhir.FHIRPackage.eINSTANCE.getStructureDefinition().getEPackage(), newClass);
		if (fhirUmlProfile != null) {
			StructureDefinition structureDefinition = (StructureDefinition) org.eclipse.uml2.uml.util.UMLUtil.safeApplyStereotype(newClass, fhirUmlProfile.getOwnedStereotype(FHIRPackage.eINSTANCE.getStructureDefinition().getName()));
			structureDefinition.setName(newClass.getName());
		}
	}
}
