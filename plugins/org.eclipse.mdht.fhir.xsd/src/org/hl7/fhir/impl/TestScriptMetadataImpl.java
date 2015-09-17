/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptMetadataImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptMetadataImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptMetadataImpl extends BackboneElementImpl implements TestScriptMetadata {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptLink> link;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptCapability> capability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptMetadata();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<TestScriptLink>(TestScriptLink.class, this, FhirPackage.TEST_SCRIPT_METADATA__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptCapability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<TestScriptCapability>(TestScriptCapability.class, this, FhirPackage.TEST_SCRIPT_METADATA__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_METADATA__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_METADATA__LINK:
				return getLink();
			case FhirPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return getCapability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_METADATA__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends TestScriptLink>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				getCapability().clear();
				getCapability().addAll((Collection<? extends TestScriptCapability>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_METADATA__LINK:
				getLink().clear();
				return;
			case FhirPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				getCapability().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_METADATA__LINK:
				return link != null && !link.isEmpty();
			case FhirPackage.TEST_SCRIPT_METADATA__CAPABILITY:
				return capability != null && !capability.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestScriptMetadataImpl
