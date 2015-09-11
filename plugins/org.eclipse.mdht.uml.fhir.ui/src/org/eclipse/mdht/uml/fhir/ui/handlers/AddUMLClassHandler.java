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
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassHandler;
import org.openhealthtools.mdht.uml.common.ui.search.GeneralizationTypeFilter;
import org.openhealthtools.mdht.uml.common.ui.util.UMLHandlerUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class AddUMLClassHandler extends AbstractHandler {

	public AddUMLClassHandler() {
		super();
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// these APIs throw if the requested thing isn't available
		Element selectedElement = UMLHandlerUtil.getSelectedElementChecked(event, Element.class);
		IWorkbenchPart activePart = HandlerUtil.getActivePartChecked(event);

		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedElement);

		IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Add UML class") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
				// prompt for new class name
				String className = getClassName(event, activePart);
				if (className == null || className.length() == 0) {
					return Status.CANCEL_STATUS;
				}

				Class newClass = UMLFactory.eINSTANCE.createClass();
				newClass.setName(className);

				if (selectedElement instanceof Package) {
					((Package) selectedElement).getOwnedTypes().add(newClass);
				} else if (selectedElement instanceof Class) {
					((Class) selectedElement).getNestedClassifiers().add(newClass);
				}

				Class superClass = selectSuperClass(newClass, event, activePart);
				if (superClass != null) {
					newClass.createGeneralization(superClass);
				}

				addProperties(newClass, superClass, event, activePart);

				postProcess(newClass, event, activePart);

				// TODO this does not select in CommonNavigator. maybe need a refresh first?
				if (activePart instanceof ISetSelectionTarget) {
					((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(newClass));
				}
				return Status.OK_STATUS;
			}
		};

		IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
		operation.addContext(commandStack.getDefaultUndoContext());
		commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		return null;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open dialog containing all available classes.
	 * @throws ExecutionException 
	 */
	protected String getClassName(ExecutionEvent event, IWorkbenchPart activePart) {
		String className = null;

		InputDialog inputDialog = new InputDialog(
			activePart.getSite().getShell(), "New Class", "Enter class name", "", null);
		if (inputDialog.open() == Window.OK) {
			className = inputDialog.getValue();
		}
		return className;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open dialog containing all available classes.
	 * 
	 * @param new class
	 */
	protected Class selectSuperClass(Class newClass, ExecutionEvent event, IWorkbenchPart activePart) {
		Class superClass = (Class) DialogLaunchUtil.chooseElement(
			new GeneralizationTypeFilter(newClass), UMLUtil.getTopPackage(newClass), activePart.getSite().getShell(),
			"Class Selection", "Select base class (Cancel for none):");

		return superClass;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open subclass redefinition dialog.
	 * 
	 * @param new class
	 */
	protected void addProperties(Class newClass, Class superClass, ExecutionEvent event, IWorkbenchPart activePart) {
		if (superClass != null) {
			// prompt for selection of redefined properties
			// TODO customize dialog title and prompt
			SubclassHandler subclassHandler = new SubclassHandler(activePart.getSite().getShell(), newClass);
			subclassHandler.openSubclassDialog();
		}
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Do nothing by default.
	 * 
	 * @param new class
	 */
	protected void postProcess(Class newClass, ExecutionEvent event, IWorkbenchPart activePart) {
		// do nothing by default
	}

}
