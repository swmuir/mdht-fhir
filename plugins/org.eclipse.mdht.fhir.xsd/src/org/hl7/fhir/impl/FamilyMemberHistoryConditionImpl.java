/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Age;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Member History Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOnsetQuantity <em>Onset Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryConditionImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyMemberHistoryConditionImpl extends BackboneElementImpl implements FamilyMemberHistoryCondition {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getOnsetQuantity() <em>Onset Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetQuantity()
	 * @generated
	 * @ordered
	 */
	protected Age onsetQuantity;

	/**
	 * The cached value of the '{@link #getOnsetRange() <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetRange()
	 * @generated
	 * @ordered
	 */
	protected Range onsetRange;

	/**
	 * The cached value of the '{@link #getOnsetPeriod() <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period onsetPeriod;

	/**
	 * The cached value of the '{@link #getOnsetString() <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String onsetString;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected Annotation note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyMemberHistoryConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getFamilyMemberHistoryCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age getOnsetQuantity() {
		return onsetQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetQuantity(Age newOnsetQuantity, NotificationChain msgs) {
		Age oldOnsetQuantity = onsetQuantity;
		onsetQuantity = newOnsetQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY, oldOnsetQuantity, newOnsetQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnsetQuantity(Age newOnsetQuantity) {
		if (newOnsetQuantity != onsetQuantity) {
			NotificationChain msgs = null;
			if (onsetQuantity != null)
				msgs = ((InternalEObject)onsetQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY, null, msgs);
			if (newOnsetQuantity != null)
				msgs = ((InternalEObject)newOnsetQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY, null, msgs);
			msgs = basicSetOnsetQuantity(newOnsetQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY, newOnsetQuantity, newOnsetQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getOnsetRange() {
		return onsetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetRange(Range newOnsetRange, NotificationChain msgs) {
		Range oldOnsetRange = onsetRange;
		onsetRange = newOnsetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE, oldOnsetRange, newOnsetRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnsetRange(Range newOnsetRange) {
		if (newOnsetRange != onsetRange) {
			NotificationChain msgs = null;
			if (onsetRange != null)
				msgs = ((InternalEObject)onsetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE, null, msgs);
			if (newOnsetRange != null)
				msgs = ((InternalEObject)newOnsetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE, null, msgs);
			msgs = basicSetOnsetRange(newOnsetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE, newOnsetRange, newOnsetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getOnsetPeriod() {
		return onsetPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetPeriod(Period newOnsetPeriod, NotificationChain msgs) {
		Period oldOnsetPeriod = onsetPeriod;
		onsetPeriod = newOnsetPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD, oldOnsetPeriod, newOnsetPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnsetPeriod(Period newOnsetPeriod) {
		if (newOnsetPeriod != onsetPeriod) {
			NotificationChain msgs = null;
			if (onsetPeriod != null)
				msgs = ((InternalEObject)onsetPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD, null, msgs);
			if (newOnsetPeriod != null)
				msgs = ((InternalEObject)newOnsetPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD, null, msgs);
			msgs = basicSetOnsetPeriod(newOnsetPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD, newOnsetPeriod, newOnsetPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getOnsetString() {
		return onsetString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetString(org.hl7.fhir.String newOnsetString, NotificationChain msgs) {
		org.hl7.fhir.String oldOnsetString = onsetString;
		onsetString = newOnsetString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING, oldOnsetString, newOnsetString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnsetString(org.hl7.fhir.String newOnsetString) {
		if (newOnsetString != onsetString) {
			NotificationChain msgs = null;
			if (onsetString != null)
				msgs = ((InternalEObject)onsetString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING, null, msgs);
			if (newOnsetString != null)
				msgs = ((InternalEObject)newOnsetString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING, null, msgs);
			msgs = basicSetOnsetString(newOnsetString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING, newOnsetString, newOnsetString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(Annotation newNote, NotificationChain msgs) {
		Annotation oldNote = note;
		note = newNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE, oldNote, newNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(Annotation newNote) {
		if (newNote != note) {
			NotificationChain msgs = null;
			if (note != null)
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY:
				return basicSetOnsetQuantity(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				return basicSetOnsetRange(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				return basicSetOnsetPeriod(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				return basicSetOnsetString(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				return basicSetNote(null, msgs);
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
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return getCode();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return getOutcome();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY:
				return getOnsetQuantity();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				return getOnsetRange();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				return getOnsetPeriod();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				return getOnsetString();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				return getNote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY:
				setOnsetQuantity((Age)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				setOnsetRange((Range)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				setOnsetPeriod((Period)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				setOnsetString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				setNote((Annotation)newValue);
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
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY:
				setOnsetQuantity((Age)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				setOnsetRange((Range)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				setOnsetPeriod((Period)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				setOnsetString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				setNote((Annotation)null);
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
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return code != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return outcome != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_QUANTITY:
				return onsetQuantity != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_RANGE:
				return onsetRange != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_PERIOD:
				return onsetPeriod != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSET_STRING:
				return onsetString != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				return note != null;
		}
		return super.eIsSet(featureID);
	}

} //FamilyMemberHistoryConditionImpl
