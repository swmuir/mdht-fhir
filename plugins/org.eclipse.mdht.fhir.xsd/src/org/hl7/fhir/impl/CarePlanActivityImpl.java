/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getActionResulting <em>Action Resulting</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanActivityImpl extends BackboneElementImpl implements CarePlanActivity {
	/**
	 * The cached value of the '{@link #getActionResulting() <em>Action Resulting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionResulting()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> actionResulting;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> progress;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected CarePlanDetail detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCarePlanActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getActionResulting() {
		if (actionResulting == null) {
			actionResulting = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING);
		}
		return actionResulting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getProgress() {
		if (progress == null) {
			progress = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS);
		}
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanDetail getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(CarePlanDetail newDetail, NotificationChain msgs) {
		CarePlanDetail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(CarePlanDetail newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				return ((InternalEList<?>)getActionResulting()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return ((InternalEList<?>)getProgress()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				return basicSetDetail(null, msgs);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				return getActionResulting();
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return getProgress();
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return getReference();
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				return getDetail();
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
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				getActionResulting().clear();
				getActionResulting().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				getProgress().clear();
				getProgress().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				setReference((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				setDetail((CarePlanDetail)newValue);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				getActionResulting().clear();
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				getProgress().clear();
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				setReference((Reference)null);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				setDetail((CarePlanDetail)null);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				return actionResulting != null && !actionResulting.isEmpty();
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return progress != null && !progress.isEmpty();
			case FhirPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return reference != null;
			case FhirPackage.CARE_PLAN_ACTIVITY__DETAIL:
				return detail != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanActivityImpl
