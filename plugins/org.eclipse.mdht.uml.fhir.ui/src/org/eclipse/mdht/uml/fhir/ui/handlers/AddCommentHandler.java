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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.common.ui.util.UMLHandlerUtil;

public class AddCommentHandler extends AbstractHandler {
	
	private static final String COMMENT_TYPE_PARAMETER = "org.eclipse.mdht.uml.fhir.ui.commandParameter.commentType";

	public AddCommentHandler() {
		super();
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// these APIs throw if the requested thing isn't available
		Element umlElement = UMLHandlerUtil.getSelectedElementChecked(event, Element.class);
		IWorkbenchPart activePart = HandlerUtil.getActivePartChecked(event);

		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlElement);

		IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Add Comment") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
				Comment comment = UMLFactory.eINSTANCE.createComment();
				umlElement.getOwnedComments().add(comment);
				
				String commentType = event.getParameter(COMMENT_TYPE_PARAMETER);
				if (commentType != null) {
					Profile fhirProfile = UMLUtil.getProfile(org.eclipse.mdht.uml.fhir.FHIRPackage.eINSTANCE.getTypeChoice().getEPackage(), umlElement);
					Stereotype stereotype = fhirProfile.getOwnedStereotype(commentType);
					if (stereotype != null) {
						UMLUtil.safeApplyStereotype(comment, stereotype);
					}
				}

				// TODO this does not select in CommonNavigator. maybe need a refresh first?
				if (activePart instanceof ISetSelectionTarget) {
					((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(comment));
				}
				return Status.OK_STATUS;
			}
		};

		IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
		operation.addContext(commandStack.getDefaultUndoContext());
		commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		return null;
	}

}
