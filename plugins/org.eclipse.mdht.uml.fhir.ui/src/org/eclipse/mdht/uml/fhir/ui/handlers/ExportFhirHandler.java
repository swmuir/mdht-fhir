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

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.mdht.uml.fhir.transform.ModelExporter;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.util.FhirResourceFactoryImpl;
import org.openhealthtools.mdht.uml.common.ui.util.UMLHandlerUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class ExportFhirHandler extends AbstractGenerateHandler {

	public ExportFhirHandler() {
		super();
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// these APIs throw if the requested thing isn't available
		Class umlClass = UMLHandlerUtil.getSelectedElementChecked(event, Class.class);
		IWorkbenchPart activePart = HandlerUtil.getActivePartChecked(event);

		IFolder profileFolder = getOutputFolder(umlClass);
//		IContainer profileFolder = selectOutputFolder();

		Package model = UMLUtil.getTopPackage(umlClass);
		ModelExporter umlExporter = new ModelExporter();
		umlExporter.indexContents(model);
		
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlClass);

		IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Export FHIR definition") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
				if (profileFolder != null) {
					StructureDefinition structureDef = umlExporter.createStrucureDefinition(umlClass);
					if (structureDef != null) {
						String structureId = structureDef.getId().getValue();
						URI resourceURI = URI.createFileURI(profileFolder.getLocation() + "/" + structureId + ".xml");
						
						FhirResourceFactoryImpl fhirResourceFactory = new FhirResourceFactoryImpl();
						Resource resource = fhirResourceFactory.createResource(resourceURI);
						resource.getContents().add(structureDef);
						try {
							resource.save(new HashMap<String,String>());
							
							profileFolder.getParent().refreshLocal(IFolder.DEPTH_INFINITE, null);
							openDefaultEditor(resourceURI, activePart);
							
						} catch (IOException | CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						return Status.OK_STATUS;
					}
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
