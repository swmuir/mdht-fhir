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
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanParticipant;
import org.hl7.fhir.CarePlanRelatedPlan;
import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getSupport <em>Support</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getRelatedPlan <em>Related Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanImpl extends DomainResourceImpl implements CarePlan {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CarePlanStatus status;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> author;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected DateTime modified;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

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
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> addresses;

	/**
	 * The cached value of the '{@link #getSupport() <em>Support</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> support;

	/**
	 * The cached value of the '{@link #getRelatedPlan() <em>Related Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<CarePlanRelatedPlan> relatedPlan;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<CarePlanParticipant> participant;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> goal;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<CarePlanActivity> activity;

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
	protected CarePlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCarePlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CARE_PLAN__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CarePlanStatus newStatus, NotificationChain msgs) {
		CarePlanStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CarePlanStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModified(DateTime newModified, NotificationChain msgs) {
		DateTime oldModified = modified;
		modified = newModified;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__MODIFIED, oldModified, newModified);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(DateTime newModified) {
		if (newModified != modified) {
			NotificationChain msgs = null;
			if (modified != null)
				msgs = ((InternalEObject)modified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__MODIFIED, null, msgs);
			if (newModified != null)
				msgs = ((InternalEObject)newModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__MODIFIED, null, msgs);
			msgs = basicSetModified(newModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__MODIFIED, newModified, newModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CARE_PLAN__CATEGORY);
		}
		return category;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupport() {
		if (support == null) {
			support = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN__SUPPORT);
		}
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarePlanRelatedPlan> getRelatedPlan() {
		if (relatedPlan == null) {
			relatedPlan = new EObjectContainmentEList<CarePlanRelatedPlan>(CarePlanRelatedPlan.class, this, FhirPackage.CARE_PLAN__RELATED_PLAN);
		}
		return relatedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarePlanParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<CarePlanParticipant>(CarePlanParticipant.class, this, FhirPackage.CARE_PLAN__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarePlanActivity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<CarePlanActivity>(CarePlanActivity.class, this, FhirPackage.CARE_PLAN__ACTIVITY);
		}
		return activity;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__NOTE, oldNote, newNote);
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
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CARE_PLAN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.CARE_PLAN__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CARE_PLAN__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.CARE_PLAN__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.CARE_PLAN__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__MODIFIED:
				return basicSetModified(null, msgs);
			case FhirPackage.CARE_PLAN__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CARE_PLAN__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__SUPPORT:
				return ((InternalEList<?>)getSupport()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__RELATED_PLAN:
				return ((InternalEList<?>)getRelatedPlan()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN__NOTE:
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
			case FhirPackage.CARE_PLAN__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CARE_PLAN__SUBJECT:
				return getSubject();
			case FhirPackage.CARE_PLAN__STATUS:
				return getStatus();
			case FhirPackage.CARE_PLAN__CONTEXT:
				return getContext();
			case FhirPackage.CARE_PLAN__PERIOD:
				return getPeriod();
			case FhirPackage.CARE_PLAN__AUTHOR:
				return getAuthor();
			case FhirPackage.CARE_PLAN__MODIFIED:
				return getModified();
			case FhirPackage.CARE_PLAN__CATEGORY:
				return getCategory();
			case FhirPackage.CARE_PLAN__DESCRIPTION:
				return getDescription();
			case FhirPackage.CARE_PLAN__ADDRESSES:
				return getAddresses();
			case FhirPackage.CARE_PLAN__SUPPORT:
				return getSupport();
			case FhirPackage.CARE_PLAN__RELATED_PLAN:
				return getRelatedPlan();
			case FhirPackage.CARE_PLAN__PARTICIPANT:
				return getParticipant();
			case FhirPackage.CARE_PLAN__GOAL:
				return getGoal();
			case FhirPackage.CARE_PLAN__ACTIVITY:
				return getActivity();
			case FhirPackage.CARE_PLAN__NOTE:
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
			case FhirPackage.CARE_PLAN__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CARE_PLAN__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN__STATUS:
				setStatus((CarePlanStatus)newValue);
				return;
			case FhirPackage.CARE_PLAN__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.CARE_PLAN__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN__MODIFIED:
				setModified((DateTime)newValue);
				return;
			case FhirPackage.CARE_PLAN__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CARE_PLAN__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CARE_PLAN__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN__SUPPORT:
				getSupport().clear();
				getSupport().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN__RELATED_PLAN:
				getRelatedPlan().clear();
				getRelatedPlan().addAll((Collection<? extends CarePlanRelatedPlan>)newValue);
				return;
			case FhirPackage.CARE_PLAN__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends CarePlanParticipant>)newValue);
				return;
			case FhirPackage.CARE_PLAN__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends CarePlanActivity>)newValue);
				return;
			case FhirPackage.CARE_PLAN__NOTE:
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
			case FhirPackage.CARE_PLAN__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CARE_PLAN__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.CARE_PLAN__STATUS:
				setStatus((CarePlanStatus)null);
				return;
			case FhirPackage.CARE_PLAN__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.CARE_PLAN__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.CARE_PLAN__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.CARE_PLAN__MODIFIED:
				setModified((DateTime)null);
				return;
			case FhirPackage.CARE_PLAN__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.CARE_PLAN__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CARE_PLAN__ADDRESSES:
				getAddresses().clear();
				return;
			case FhirPackage.CARE_PLAN__SUPPORT:
				getSupport().clear();
				return;
			case FhirPackage.CARE_PLAN__RELATED_PLAN:
				getRelatedPlan().clear();
				return;
			case FhirPackage.CARE_PLAN__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.CARE_PLAN__GOAL:
				getGoal().clear();
				return;
			case FhirPackage.CARE_PLAN__ACTIVITY:
				getActivity().clear();
				return;
			case FhirPackage.CARE_PLAN__NOTE:
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
			case FhirPackage.CARE_PLAN__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CARE_PLAN__SUBJECT:
				return subject != null;
			case FhirPackage.CARE_PLAN__STATUS:
				return status != null;
			case FhirPackage.CARE_PLAN__CONTEXT:
				return context != null;
			case FhirPackage.CARE_PLAN__PERIOD:
				return period != null;
			case FhirPackage.CARE_PLAN__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.CARE_PLAN__MODIFIED:
				return modified != null;
			case FhirPackage.CARE_PLAN__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.CARE_PLAN__DESCRIPTION:
				return description != null;
			case FhirPackage.CARE_PLAN__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case FhirPackage.CARE_PLAN__SUPPORT:
				return support != null && !support.isEmpty();
			case FhirPackage.CARE_PLAN__RELATED_PLAN:
				return relatedPlan != null && !relatedPlan.isEmpty();
			case FhirPackage.CARE_PLAN__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.CARE_PLAN__GOAL:
				return goal != null && !goal.isEmpty();
			case FhirPackage.CARE_PLAN__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case FhirPackage.CARE_PLAN__NOTE:
				return note != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanImpl
