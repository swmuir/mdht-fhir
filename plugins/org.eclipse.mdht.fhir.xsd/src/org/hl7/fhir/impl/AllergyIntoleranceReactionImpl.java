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

import org.hl7.fhir.AllergyIntoleranceCertainty;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceReactionImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceReactionImpl#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceReactionImpl#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceReactionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceReactionImpl#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceReactionImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceReactionImpl#getExposureRoute <em>Exposure Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceReactionImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllergyIntoleranceReactionImpl extends BackboneElementImpl implements AllergyIntoleranceReaction {
	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substance;

	/**
	 * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntoleranceCertainty certainty;

	/**
	 * The cached value of the '{@link #getManifestation() <em>Manifestation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> manifestation;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getOnset() <em>Onset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnset()
	 * @generated
	 * @ordered
	 */
	protected DateTime onset;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntoleranceSeverity severity;

	/**
	 * The cached value of the '{@link #getExposureRoute() <em>Exposure Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept exposureRoute;

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
	protected AllergyIntoleranceReactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAllergyIntoleranceReaction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(CodeableConcept newSubstance, NotificationChain msgs) {
		CodeableConcept oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE, oldSubstance, newSubstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstance(CodeableConcept newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertainty getCertainty() {
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertainty(AllergyIntoleranceCertainty newCertainty, NotificationChain msgs) {
		AllergyIntoleranceCertainty oldCertainty = certainty;
		certainty = newCertainty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY, oldCertainty, newCertainty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertainty(AllergyIntoleranceCertainty newCertainty) {
		if (newCertainty != certainty) {
			NotificationChain msgs = null;
			if (certainty != null)
				msgs = ((InternalEObject)certainty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY, null, msgs);
			if (newCertainty != null)
				msgs = ((InternalEObject)newCertainty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY, null, msgs);
			msgs = basicSetCertainty(newCertainty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY, newCertainty, newCertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getManifestation() {
		if (manifestation == null) {
			manifestation = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION);
		}
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOnset() {
		return onset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnset(DateTime newOnset, NotificationChain msgs) {
		DateTime oldOnset = onset;
		onset = newOnset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET, oldOnset, newOnset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnset(DateTime newOnset) {
		if (newOnset != onset) {
			NotificationChain msgs = null;
			if (onset != null)
				msgs = ((InternalEObject)onset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET, null, msgs);
			if (newOnset != null)
				msgs = ((InternalEObject)newOnset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET, null, msgs);
			msgs = basicSetOnset(newOnset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET, newOnset, newOnset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(AllergyIntoleranceSeverity newSeverity, NotificationChain msgs) {
		AllergyIntoleranceSeverity oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(AllergyIntoleranceSeverity newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getExposureRoute() {
		return exposureRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureRoute(CodeableConcept newExposureRoute, NotificationChain msgs) {
		CodeableConcept oldExposureRoute = exposureRoute;
		exposureRoute = newExposureRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE, oldExposureRoute, newExposureRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureRoute(CodeableConcept newExposureRoute) {
		if (newExposureRoute != exposureRoute) {
			NotificationChain msgs = null;
			if (exposureRoute != null)
				msgs = ((InternalEObject)exposureRoute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE, null, msgs);
			if (newExposureRoute != null)
				msgs = ((InternalEObject)newExposureRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE, null, msgs);
			msgs = basicSetExposureRoute(newExposureRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE, newExposureRoute, newExposureRoute));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE, oldNote, newNote);
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
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				return basicSetCertainty(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				return ((InternalEList<?>)getManifestation()).basicRemove(otherEnd, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				return basicSetOnset(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				return basicSetExposureRoute(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
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
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				return getSubstance();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				return getCertainty();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				return getManifestation();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				return getDescription();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				return getOnset();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				return getSeverity();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				return getExposureRoute();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
				return getNote();
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
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				setSubstance((CodeableConcept)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				setCertainty((AllergyIntoleranceCertainty)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				getManifestation().clear();
				getManifestation().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				setOnset((DateTime)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				setSeverity((AllergyIntoleranceSeverity)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				setExposureRoute((CodeableConcept)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
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
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				setSubstance((CodeableConcept)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				setCertainty((AllergyIntoleranceCertainty)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				getManifestation().clear();
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				setOnset((DateTime)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				setSeverity((AllergyIntoleranceSeverity)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				setExposureRoute((CodeableConcept)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
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
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				return substance != null;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				return certainty != null;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				return manifestation != null && !manifestation.isEmpty();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				return description != null;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				return onset != null;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				return severity != null;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				return exposureRoute != null;
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
				return note != null;
		}
		return super.eIsSet(featureID);
	}

} //AllergyIntoleranceReactionImpl
