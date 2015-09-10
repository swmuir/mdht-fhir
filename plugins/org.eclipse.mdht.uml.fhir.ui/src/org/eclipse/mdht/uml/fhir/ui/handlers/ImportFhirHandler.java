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

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.mdht.uml.fhir.transform.ModelImporter;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.common.ui.util.UMLHandlerUtil;

public class ImportFhirHandler extends AbstractHandler {

	public ImportFhirHandler() {
		super();
	}

	private IContainer getProfileFolder(IWorkbenchPart activePart) {
		IContainer profileFolder = null;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResource resource = workspace.getRoot().findMember("FHIR-DSTU2/current");
		if (resource instanceof IContainer) {
			profileFolder = (IContainer) resource;
		}
		
		if (profileFolder == null) {
			IContainer[] containers = WorkspaceResourceDialog.openFolderSelection(activePart.getSite().getShell(), 
					"Select Profile Folder", "Folder containing reference profiles", false, null, null);
			if (containers.length > 0) {
				profileFolder = containers[0];
			}
		}
		
		return profileFolder;
	}
	
	private List<URI> selectProfileFiles(IWorkbenchPart activePart) {
		ResourceDialog dialog = new ResourceDialog(activePart.getSite().getShell(), "Select FHIR Profiles", SWT.OPEN|SWT.MULTI);
		dialog.open();
		return dialog.getURIs();
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// these APIs throw if the requested thing isn't available
		Package umlPackage = UMLHandlerUtil.getSelectedElementChecked(event, Package.class);
		IWorkbenchPart activePart = HandlerUtil.getActivePartChecked(event);

		// select the profile folder first, then optionally a list of profiles
		IContainer profileFolder = getProfileFolder(activePart);
//		List<URI> profiles = selectProfileFiles();
		
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlPackage);

		IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Export FHIR definition") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
				if (profileFolder != null) {
					ModelImporter umlImporter = new ModelImporter(umlPackage, profileFolder);
//					for (URI profileURI : profiles) {
//						umlImporter.importProfile(profileURI);
//					}

					umlImporter.importStructureDefinition("extension-definitions");
//					umlImporter.indexBundle("valuesets");
					
//					umlImporter.importStructureDefinition("Condition");
//					umlImporter.importStructureDefinition("StructureDefinition");
//					umlImporter.importStructureDefinition("Conformance");
//					umlImporter.importStructureDefinition("ImplementationGuide");
//					umlImporter.importStructureDefinition("observation-daf-results-dafresultobsquantity");
//					umlImporter.importStructureDefinition("observation-hspc-standardlabobs-quantitative-stdqty");
//					umlImporter.importStructureDefinition("observation-hspc-heartrate-hspcheartrate");
//
//					umlImporter.importStructureDefinition("lipidprofile");
					
					
					umlImporter.importAllFiles();
					
					return Status.OK_STATUS;
				}

				return Status.CANCEL_STATUS;
			}
		};

		IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
		operation.addContext(commandStack.getDefaultUndoContext());
		commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		return null;
	}

}
