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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getNotPerformed <em>Not Performed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReasonNotPerformed <em>Reason Not Performed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformedDateTime <em>Performed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformedPeriod <em>Performed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getComplication <em>Complication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getFollowUp <em>Follow Up</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getFocalDevice <em>Focal Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getUsed <em>Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends DomainResourceImpl implements Procedure {
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
	protected ProcedureStatus status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getNotPerformed() <em>Not Performed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotPerformed()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean notPerformed;

	/**
	 * The cached value of the '{@link #getReasonNotPerformed() <em>Reason Not Performed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotPerformed()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotPerformed;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySite;

	/**
	 * The cached value of the '{@link #getReasonCodeableConcept() <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonCodeableConcept;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reasonReference;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedurePerformer> performer;

	/**
	 * The cached value of the '{@link #getPerformedDateTime() <em>Performed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime performedDateTime;

	/**
	 * The cached value of the '{@link #getPerformedPeriod() <em>Performed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period performedPeriod;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

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
	 * The cached value of the '{@link #getReport() <em>Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> report;

	/**
	 * The cached value of the '{@link #getComplication() <em>Complication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> complication;

	/**
	 * The cached value of the '{@link #getFollowUp() <em>Follow Up</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUp()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> followUp;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getFocalDevice() <em>Focal Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureFocalDevice> focalDevice;

	/**
	 * The cached value of the '{@link #getUsed() <em>Used</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> used;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCEDURE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ProcedureStatus newStatus, NotificationChain msgs) {
		ProcedureStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ProcedureStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getNotPerformed() {
		return notPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotPerformed(org.hl7.fhir.Boolean newNotPerformed, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNotPerformed = notPerformed;
		notPerformed = newNotPerformed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__NOT_PERFORMED, oldNotPerformed, newNotPerformed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotPerformed(org.hl7.fhir.Boolean newNotPerformed) {
		if (newNotPerformed != notPerformed) {
			NotificationChain msgs = null;
			if (notPerformed != null)
				msgs = ((InternalEObject)notPerformed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__NOT_PERFORMED, null, msgs);
			if (newNotPerformed != null)
				msgs = ((InternalEObject)newNotPerformed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__NOT_PERFORMED, null, msgs);
			msgs = basicSetNotPerformed(newNotPerformed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__NOT_PERFORMED, newNotPerformed, newNotPerformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotPerformed() {
		if (reasonNotPerformed == null) {
			reasonNotPerformed = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__REASON_NOT_PERFORMED);
		}
		return reasonNotPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__BODY_SITE);
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonCodeableConcept() {
		return reasonCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonCodeableConcept(CodeableConcept newReasonCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldReasonCodeableConcept = reasonCodeableConcept;
		reasonCodeableConcept = newReasonCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT, oldReasonCodeableConcept, newReasonCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonCodeableConcept(CodeableConcept newReasonCodeableConcept) {
		if (newReasonCodeableConcept != reasonCodeableConcept) {
			NotificationChain msgs = null;
			if (reasonCodeableConcept != null)
				msgs = ((InternalEObject)reasonCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT, null, msgs);
			if (newReasonCodeableConcept != null)
				msgs = ((InternalEObject)newReasonCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetReasonCodeableConcept(newReasonCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT, newReasonCodeableConcept, newReasonCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReasonReference() {
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonReference(Reference newReasonReference, NotificationChain msgs) {
		Reference oldReasonReference = reasonReference;
		reasonReference = newReasonReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REASON_REFERENCE, oldReasonReference, newReasonReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonReference(Reference newReasonReference) {
		if (newReasonReference != reasonReference) {
			NotificationChain msgs = null;
			if (reasonReference != null)
				msgs = ((InternalEObject)reasonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REASON_REFERENCE, null, msgs);
			if (newReasonReference != null)
				msgs = ((InternalEObject)newReasonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REASON_REFERENCE, null, msgs);
			msgs = basicSetReasonReference(newReasonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REASON_REFERENCE, newReasonReference, newReasonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedurePerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ProcedurePerformer>(ProcedurePerformer.class, this, FhirPackage.PROCEDURE__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPerformedDateTime() {
		return performedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedDateTime(DateTime newPerformedDateTime, NotificationChain msgs) {
		DateTime oldPerformedDateTime = performedDateTime;
		performedDateTime = newPerformedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, oldPerformedDateTime, newPerformedDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedDateTime(DateTime newPerformedDateTime) {
		if (newPerformedDateTime != performedDateTime) {
			NotificationChain msgs = null;
			if (performedDateTime != null)
				msgs = ((InternalEObject)performedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, null, msgs);
			if (newPerformedDateTime != null)
				msgs = ((InternalEObject)newPerformedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, null, msgs);
			msgs = basicSetPerformedDateTime(newPerformedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, newPerformedDateTime, newPerformedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPerformedPeriod() {
		return performedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedPeriod(Period newPerformedPeriod, NotificationChain msgs) {
		Period oldPerformedPeriod = performedPeriod;
		performedPeriod = newPerformedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_PERIOD, oldPerformedPeriod, newPerformedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedPeriod(Period newPerformedPeriod) {
		if (newPerformedPeriod != performedPeriod) {
			NotificationChain msgs = null;
			if (performedPeriod != null)
				msgs = ((InternalEObject)performedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_PERIOD, null, msgs);
			if (newPerformedPeriod != null)
				msgs = ((InternalEObject)newPerformedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_PERIOD, null, msgs);
			msgs = basicSetPerformedPeriod(newPerformedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_PERIOD, newPerformedPeriod, newPerformedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__LOCATION, newLocation, newLocation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReport() {
		if (report == null) {
			report = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__REPORT);
		}
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getComplication() {
		if (complication == null) {
			complication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__COMPLICATION);
		}
		return complication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFollowUp() {
		if (followUp == null) {
			followUp = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__FOLLOW_UP);
		}
		return followUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.PROCEDURE__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureFocalDevice> getFocalDevice() {
		if (focalDevice == null) {
			focalDevice = new EObjectContainmentEList<ProcedureFocalDevice>(ProcedureFocalDevice.class, this, FhirPackage.PROCEDURE__FOCAL_DEVICE);
		}
		return focalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getUsed() {
		if (used == null) {
			used = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__USED);
		}
		return used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.PROCEDURE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PROCEDURE__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.PROCEDURE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.PROCEDURE__NOT_PERFORMED:
				return basicSetNotPerformed(null, msgs);
			case FhirPackage.PROCEDURE__REASON_NOT_PERFORMED:
				return ((InternalEList<?>)getReasonNotPerformed()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				return basicSetReasonCodeableConcept(null, msgs);
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				return basicSetReasonReference(null, msgs);
			case FhirPackage.PROCEDURE__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return basicSetPerformedDateTime(null, msgs);
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return basicSetPerformedPeriod(null, msgs);
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.PROCEDURE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.PROCEDURE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.PROCEDURE__REPORT:
				return ((InternalEList<?>)getReport()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__COMPLICATION:
				return ((InternalEList<?>)getComplication()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return ((InternalEList<?>)getFollowUp()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.PROCEDURE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return ((InternalEList<?>)getFocalDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__USED:
				return ((InternalEList<?>)getUsed()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCEDURE__SUBJECT:
				return getSubject();
			case FhirPackage.PROCEDURE__STATUS:
				return getStatus();
			case FhirPackage.PROCEDURE__CATEGORY:
				return getCategory();
			case FhirPackage.PROCEDURE__CODE:
				return getCode();
			case FhirPackage.PROCEDURE__NOT_PERFORMED:
				return getNotPerformed();
			case FhirPackage.PROCEDURE__REASON_NOT_PERFORMED:
				return getReasonNotPerformed();
			case FhirPackage.PROCEDURE__BODY_SITE:
				return getBodySite();
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				return getReasonCodeableConcept();
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.PROCEDURE__PERFORMER:
				return getPerformer();
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return getPerformedDateTime();
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return getPerformedPeriod();
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return getEncounter();
			case FhirPackage.PROCEDURE__LOCATION:
				return getLocation();
			case FhirPackage.PROCEDURE__OUTCOME:
				return getOutcome();
			case FhirPackage.PROCEDURE__REPORT:
				return getReport();
			case FhirPackage.PROCEDURE__COMPLICATION:
				return getComplication();
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return getFollowUp();
			case FhirPackage.PROCEDURE__REQUEST:
				return getRequest();
			case FhirPackage.PROCEDURE__NOTES:
				return getNotes();
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return getFocalDevice();
			case FhirPackage.PROCEDURE__USED:
				return getUsed();
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCEDURE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__STATUS:
				setStatus((ProcedureStatus)newValue);
				return;
			case FhirPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__NOT_PERFORMED:
				setNotPerformed((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PROCEDURE__REASON_NOT_PERFORMED:
				getReasonNotPerformed().clear();
				getReasonNotPerformed().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				setReasonReference((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends ProcedurePerformer>)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				setPerformedDateTime((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				setPerformedPeriod((Period)newValue);
				return;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__REPORT:
				getReport().clear();
				getReport().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__COMPLICATION:
				getComplication().clear();
				getComplication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				getFollowUp().clear();
				getFollowUp().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevice().clear();
				getFocalDevice().addAll((Collection<? extends ProcedureFocalDevice>)newValue);
				return;
			case FhirPackage.PROCEDURE__USED:
				getUsed().clear();
				getUsed().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCEDURE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.PROCEDURE__STATUS:
				setStatus((ProcedureStatus)null);
				return;
			case FhirPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__NOT_PERFORMED:
				setNotPerformed((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PROCEDURE__REASON_NOT_PERFORMED:
				getReasonNotPerformed().clear();
				return;
			case FhirPackage.PROCEDURE__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				setReasonReference((Reference)null);
				return;
			case FhirPackage.PROCEDURE__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				setPerformedDateTime((DateTime)null);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				setPerformedPeriod((Period)null);
				return;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.PROCEDURE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__REPORT:
				getReport().clear();
				return;
			case FhirPackage.PROCEDURE__COMPLICATION:
				getComplication().clear();
				return;
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				getFollowUp().clear();
				return;
			case FhirPackage.PROCEDURE__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.PROCEDURE__NOTES:
				getNotes().clear();
				return;
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevice().clear();
				return;
			case FhirPackage.PROCEDURE__USED:
				getUsed().clear();
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCEDURE__SUBJECT:
				return subject != null;
			case FhirPackage.PROCEDURE__STATUS:
				return status != null;
			case FhirPackage.PROCEDURE__CATEGORY:
				return category != null;
			case FhirPackage.PROCEDURE__CODE:
				return code != null;
			case FhirPackage.PROCEDURE__NOT_PERFORMED:
				return notPerformed != null;
			case FhirPackage.PROCEDURE__REASON_NOT_PERFORMED:
				return reasonNotPerformed != null && !reasonNotPerformed.isEmpty();
			case FhirPackage.PROCEDURE__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				return reasonCodeableConcept != null;
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				return reasonReference != null;
			case FhirPackage.PROCEDURE__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return performedDateTime != null;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return performedPeriod != null;
			case FhirPackage.PROCEDURE__ENCOUNTER:
				return encounter != null;
			case FhirPackage.PROCEDURE__LOCATION:
				return location != null;
			case FhirPackage.PROCEDURE__OUTCOME:
				return outcome != null;
			case FhirPackage.PROCEDURE__REPORT:
				return report != null && !report.isEmpty();
			case FhirPackage.PROCEDURE__COMPLICATION:
				return complication != null && !complication.isEmpty();
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return followUp != null && !followUp.isEmpty();
			case FhirPackage.PROCEDURE__REQUEST:
				return request != null;
			case FhirPackage.PROCEDURE__NOTES:
				return notes != null && !notes.isEmpty();
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return focalDevice != null && !focalDevice.isEmpty();
			case FhirPackage.PROCEDURE__USED:
				return used != null && !used.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedureImpl
