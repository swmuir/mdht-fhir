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
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalOutcome;
import org.hl7.fhir.GoalStatus;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStartCodeableConcept <em>Start Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getTargetDate <em>Target Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getTargetQuantity <em>Target Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalImpl#getOutcome <em>Outcome</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends DomainResourceImpl implements Goal {
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
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate;

	/**
	 * The cached value of the '{@link #getStartCodeableConcept() <em>Start Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept startCodeableConcept;

	/**
	 * The cached value of the '{@link #getTargetDate() <em>Target Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDate()
	 * @generated
	 * @ordered
	 */
	protected Date targetDate;

	/**
	 * The cached value of the '{@link #getTargetQuantity() <em>Target Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQuantity()
	 * @generated
	 * @ordered
	 */
	protected Duration targetQuantity;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected GoalStatus status;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalOutcome> outcome;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGoal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.GOAL__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartDate(Date newStartDate, NotificationChain msgs) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__START_DATE, oldStartDate, newStartDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		if (newStartDate != startDate) {
			NotificationChain msgs = null;
			if (startDate != null)
				msgs = ((InternalEObject)startDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__START_DATE, null, msgs);
			if (newStartDate != null)
				msgs = ((InternalEObject)newStartDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__START_DATE, null, msgs);
			msgs = basicSetStartDate(newStartDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__START_DATE, newStartDate, newStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStartCodeableConcept() {
		return startCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartCodeableConcept(CodeableConcept newStartCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldStartCodeableConcept = startCodeableConcept;
		startCodeableConcept = newStartCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__START_CODEABLE_CONCEPT, oldStartCodeableConcept, newStartCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartCodeableConcept(CodeableConcept newStartCodeableConcept) {
		if (newStartCodeableConcept != startCodeableConcept) {
			NotificationChain msgs = null;
			if (startCodeableConcept != null)
				msgs = ((InternalEObject)startCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__START_CODEABLE_CONCEPT, null, msgs);
			if (newStartCodeableConcept != null)
				msgs = ((InternalEObject)newStartCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__START_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetStartCodeableConcept(newStartCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__START_CODEABLE_CONCEPT, newStartCodeableConcept, newStartCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTargetDate() {
		return targetDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetDate(Date newTargetDate, NotificationChain msgs) {
		Date oldTargetDate = targetDate;
		targetDate = newTargetDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__TARGET_DATE, oldTargetDate, newTargetDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDate(Date newTargetDate) {
		if (newTargetDate != targetDate) {
			NotificationChain msgs = null;
			if (targetDate != null)
				msgs = ((InternalEObject)targetDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__TARGET_DATE, null, msgs);
			if (newTargetDate != null)
				msgs = ((InternalEObject)newTargetDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__TARGET_DATE, null, msgs);
			msgs = basicSetTargetDate(newTargetDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__TARGET_DATE, newTargetDate, newTargetDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTargetQuantity() {
		return targetQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetQuantity(Duration newTargetQuantity, NotificationChain msgs) {
		Duration oldTargetQuantity = targetQuantity;
		targetQuantity = newTargetQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__TARGET_QUANTITY, oldTargetQuantity, newTargetQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetQuantity(Duration newTargetQuantity) {
		if (newTargetQuantity != targetQuantity) {
			NotificationChain msgs = null;
			if (targetQuantity != null)
				msgs = ((InternalEObject)targetQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__TARGET_QUANTITY, null, msgs);
			if (newTargetQuantity != null)
				msgs = ((InternalEObject)newTargetQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__TARGET_QUANTITY, null, msgs);
			msgs = basicSetTargetQuantity(newTargetQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__TARGET_QUANTITY, newTargetQuantity, newTargetQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.GOAL__CATEGORY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(GoalStatus newStatus, NotificationChain msgs) {
		GoalStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(GoalStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDate(Date newStatusDate, NotificationChain msgs) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__STATUS_DATE, oldStatusDate, newStatusDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(Date newStatusDate) {
		if (newStatusDate != statusDate) {
			NotificationChain msgs = null;
			if (statusDate != null)
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__STATUS_DATE, newStatusDate, newStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(CodeableConcept newStatusReason, NotificationChain msgs) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__STATUS_REASON, oldStatusReason, newStatusReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GOAL__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.GOAL__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalOutcome> getOutcome() {
		if (outcome == null) {
			outcome = new EObjectContainmentEList<GoalOutcome>(GoalOutcome.class, this, FhirPackage.GOAL__OUTCOME);
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GOAL__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.GOAL__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.GOAL__START_DATE:
				return basicSetStartDate(null, msgs);
			case FhirPackage.GOAL__START_CODEABLE_CONCEPT:
				return basicSetStartCodeableConcept(null, msgs);
			case FhirPackage.GOAL__TARGET_DATE:
				return basicSetTargetDate(null, msgs);
			case FhirPackage.GOAL__TARGET_QUANTITY:
				return basicSetTargetQuantity(null, msgs);
			case FhirPackage.GOAL__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.GOAL__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.GOAL__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.GOAL__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case FhirPackage.GOAL__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FhirPackage.GOAL__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FhirPackage.GOAL__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.GOAL__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case FhirPackage.GOAL__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.GOAL__OUTCOME:
				return ((InternalEList<?>)getOutcome()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GOAL__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.GOAL__SUBJECT:
				return getSubject();
			case FhirPackage.GOAL__START_DATE:
				return getStartDate();
			case FhirPackage.GOAL__START_CODEABLE_CONCEPT:
				return getStartCodeableConcept();
			case FhirPackage.GOAL__TARGET_DATE:
				return getTargetDate();
			case FhirPackage.GOAL__TARGET_QUANTITY:
				return getTargetQuantity();
			case FhirPackage.GOAL__CATEGORY:
				return getCategory();
			case FhirPackage.GOAL__DESCRIPTION:
				return getDescription();
			case FhirPackage.GOAL__STATUS:
				return getStatus();
			case FhirPackage.GOAL__STATUS_DATE:
				return getStatusDate();
			case FhirPackage.GOAL__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.GOAL__AUTHOR:
				return getAuthor();
			case FhirPackage.GOAL__PRIORITY:
				return getPriority();
			case FhirPackage.GOAL__ADDRESSES:
				return getAddresses();
			case FhirPackage.GOAL__NOTE:
				return getNote();
			case FhirPackage.GOAL__OUTCOME:
				return getOutcome();
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
			case FhirPackage.GOAL__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.GOAL__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.GOAL__START_DATE:
				setStartDate((Date)newValue);
				return;
			case FhirPackage.GOAL__START_CODEABLE_CONCEPT:
				setStartCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.GOAL__TARGET_DATE:
				setTargetDate((Date)newValue);
				return;
			case FhirPackage.GOAL__TARGET_QUANTITY:
				setTargetQuantity((Duration)newValue);
				return;
			case FhirPackage.GOAL__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.GOAL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GOAL__STATUS:
				setStatus((GoalStatus)newValue);
				return;
			case FhirPackage.GOAL__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case FhirPackage.GOAL__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FhirPackage.GOAL__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FhirPackage.GOAL__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.GOAL__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GOAL__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.GOAL__OUTCOME:
				getOutcome().clear();
				getOutcome().addAll((Collection<? extends GoalOutcome>)newValue);
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
			case FhirPackage.GOAL__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.GOAL__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.GOAL__START_DATE:
				setStartDate((Date)null);
				return;
			case FhirPackage.GOAL__START_CODEABLE_CONCEPT:
				setStartCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.GOAL__TARGET_DATE:
				setTargetDate((Date)null);
				return;
			case FhirPackage.GOAL__TARGET_QUANTITY:
				setTargetQuantity((Duration)null);
				return;
			case FhirPackage.GOAL__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.GOAL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GOAL__STATUS:
				setStatus((GoalStatus)null);
				return;
			case FhirPackage.GOAL__STATUS_DATE:
				setStatusDate((Date)null);
				return;
			case FhirPackage.GOAL__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FhirPackage.GOAL__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FhirPackage.GOAL__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.GOAL__ADDRESSES:
				getAddresses().clear();
				return;
			case FhirPackage.GOAL__NOTE:
				getNote().clear();
				return;
			case FhirPackage.GOAL__OUTCOME:
				getOutcome().clear();
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
			case FhirPackage.GOAL__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.GOAL__SUBJECT:
				return subject != null;
			case FhirPackage.GOAL__START_DATE:
				return startDate != null;
			case FhirPackage.GOAL__START_CODEABLE_CONCEPT:
				return startCodeableConcept != null;
			case FhirPackage.GOAL__TARGET_DATE:
				return targetDate != null;
			case FhirPackage.GOAL__TARGET_QUANTITY:
				return targetQuantity != null;
			case FhirPackage.GOAL__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.GOAL__DESCRIPTION:
				return description != null;
			case FhirPackage.GOAL__STATUS:
				return status != null;
			case FhirPackage.GOAL__STATUS_DATE:
				return statusDate != null;
			case FhirPackage.GOAL__STATUS_REASON:
				return statusReason != null;
			case FhirPackage.GOAL__AUTHOR:
				return author != null;
			case FhirPackage.GOAL__PRIORITY:
				return priority != null;
			case FhirPackage.GOAL__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case FhirPackage.GOAL__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.GOAL__OUTCOME:
				return outcome != null && !outcome.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
