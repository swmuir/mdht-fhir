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
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcedureRequestPriority;
import org.hl7.fhir.ProcedureRequestStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getScheduledDateTime <em>Scheduled Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getScheduledPeriod <em>Scheduled Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getScheduledTiming <em>Scheduled Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureRequestImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureRequestImpl extends DomainResourceImpl implements ProcedureRequest {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getScheduledDateTime() <em>Scheduled Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime scheduledDateTime;

	/**
	 * The cached value of the '{@link #getScheduledPeriod() <em>Scheduled Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period scheduledPeriod;

	/**
	 * The cached value of the '{@link #getScheduledTiming() <em>Scheduled Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing scheduledTiming;

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
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ProcedureRequestStatus status;

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
	 * The cached value of the '{@link #getAsNeededBoolean() <em>As Needed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean asNeededBoolean;

	/**
	 * The cached value of the '{@link #getAsNeededCodeableConcept() <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept asNeededCodeableConcept;

	/**
	 * The cached value of the '{@link #getOrderedOn() <em>Ordered On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime orderedOn;

	/**
	 * The cached value of the '{@link #getOrderer() <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderer()
	 * @generated
	 * @ordered
	 */
	protected Reference orderer;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected ProcedureRequestPriority priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcedureRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCEDURE_REQUEST__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE_REQUEST__BODY_SITE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT, oldReasonCodeableConcept, newReasonCodeableConcept);
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
				msgs = ((InternalEObject)reasonCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT, null, msgs);
			if (newReasonCodeableConcept != null)
				msgs = ((InternalEObject)newReasonCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetReasonCodeableConcept(newReasonCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT, newReasonCodeableConcept, newReasonCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE, oldReasonReference, newReasonReference);
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
				msgs = ((InternalEObject)reasonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE, null, msgs);
			if (newReasonReference != null)
				msgs = ((InternalEObject)newReasonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE, null, msgs);
			msgs = basicSetReasonReference(newReasonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE, newReasonReference, newReasonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getScheduledDateTime() {
		return scheduledDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledDateTime(DateTime newScheduledDateTime, NotificationChain msgs) {
		DateTime oldScheduledDateTime = scheduledDateTime;
		scheduledDateTime = newScheduledDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME, oldScheduledDateTime, newScheduledDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledDateTime(DateTime newScheduledDateTime) {
		if (newScheduledDateTime != scheduledDateTime) {
			NotificationChain msgs = null;
			if (scheduledDateTime != null)
				msgs = ((InternalEObject)scheduledDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME, null, msgs);
			if (newScheduledDateTime != null)
				msgs = ((InternalEObject)newScheduledDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME, null, msgs);
			msgs = basicSetScheduledDateTime(newScheduledDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME, newScheduledDateTime, newScheduledDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getScheduledPeriod() {
		return scheduledPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledPeriod(Period newScheduledPeriod, NotificationChain msgs) {
		Period oldScheduledPeriod = scheduledPeriod;
		scheduledPeriod = newScheduledPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD, oldScheduledPeriod, newScheduledPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledPeriod(Period newScheduledPeriod) {
		if (newScheduledPeriod != scheduledPeriod) {
			NotificationChain msgs = null;
			if (scheduledPeriod != null)
				msgs = ((InternalEObject)scheduledPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD, null, msgs);
			if (newScheduledPeriod != null)
				msgs = ((InternalEObject)newScheduledPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD, null, msgs);
			msgs = basicSetScheduledPeriod(newScheduledPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD, newScheduledPeriod, newScheduledPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getScheduledTiming() {
		return scheduledTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledTiming(Timing newScheduledTiming, NotificationChain msgs) {
		Timing oldScheduledTiming = scheduledTiming;
		scheduledTiming = newScheduledTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING, oldScheduledTiming, newScheduledTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledTiming(Timing newScheduledTiming) {
		if (newScheduledTiming != scheduledTiming) {
			NotificationChain msgs = null;
			if (scheduledTiming != null)
				msgs = ((InternalEObject)scheduledTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING, null, msgs);
			if (newScheduledTiming != null)
				msgs = ((InternalEObject)newScheduledTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING, null, msgs);
			msgs = basicSetScheduledTiming(newScheduledTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING, newScheduledTiming, newScheduledTiming));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ProcedureRequestStatus newStatus, NotificationChain msgs) {
		ProcedureRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ProcedureRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.PROCEDURE_REQUEST__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAsNeededBoolean() {
		return asNeededBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededBoolean(org.hl7.fhir.Boolean newAsNeededBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAsNeededBoolean = asNeededBoolean;
		asNeededBoolean = newAsNeededBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN, oldAsNeededBoolean, newAsNeededBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededBoolean(org.hl7.fhir.Boolean newAsNeededBoolean) {
		if (newAsNeededBoolean != asNeededBoolean) {
			NotificationChain msgs = null;
			if (asNeededBoolean != null)
				msgs = ((InternalEObject)asNeededBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN, null, msgs);
			if (newAsNeededBoolean != null)
				msgs = ((InternalEObject)newAsNeededBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN, null, msgs);
			msgs = basicSetAsNeededBoolean(newAsNeededBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN, newAsNeededBoolean, newAsNeededBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAsNeededCodeableConcept() {
		return asNeededCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededCodeableConcept(CodeableConcept newAsNeededCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAsNeededCodeableConcept = asNeededCodeableConcept;
		asNeededCodeableConcept = newAsNeededCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT, oldAsNeededCodeableConcept, newAsNeededCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededCodeableConcept(CodeableConcept newAsNeededCodeableConcept) {
		if (newAsNeededCodeableConcept != asNeededCodeableConcept) {
			NotificationChain msgs = null;
			if (asNeededCodeableConcept != null)
				msgs = ((InternalEObject)asNeededCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			if (newAsNeededCodeableConcept != null)
				msgs = ((InternalEObject)newAsNeededCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAsNeededCodeableConcept(newAsNeededCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT, newAsNeededCodeableConcept, newAsNeededCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOrderedOn() {
		return orderedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedOn(DateTime newOrderedOn, NotificationChain msgs) {
		DateTime oldOrderedOn = orderedOn;
		orderedOn = newOrderedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ORDERED_ON, oldOrderedOn, newOrderedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedOn(DateTime newOrderedOn) {
		if (newOrderedOn != orderedOn) {
			NotificationChain msgs = null;
			if (orderedOn != null)
				msgs = ((InternalEObject)orderedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ORDERED_ON, null, msgs);
			if (newOrderedOn != null)
				msgs = ((InternalEObject)newOrderedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ORDERED_ON, null, msgs);
			msgs = basicSetOrderedOn(newOrderedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ORDERED_ON, newOrderedOn, newOrderedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrderer() {
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderer(Reference newOrderer, NotificationChain msgs) {
		Reference oldOrderer = orderer;
		orderer = newOrderer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ORDERER, oldOrderer, newOrderer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderer(Reference newOrderer) {
		if (newOrderer != orderer) {
			NotificationChain msgs = null;
			if (orderer != null)
				msgs = ((InternalEObject)orderer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ORDERER, null, msgs);
			if (newOrderer != null)
				msgs = ((InternalEObject)newOrderer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__ORDERER, null, msgs);
			msgs = basicSetOrderer(newOrderer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__ORDERER, newOrderer, newOrderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(ProcedureRequestPriority newPriority, NotificationChain msgs) {
		ProcedureRequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(ProcedureRequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT:
				return basicSetReasonCodeableConcept(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE:
				return basicSetReasonReference(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME:
				return basicSetScheduledDateTime(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD:
				return basicSetScheduledPeriod(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING:
				return basicSetScheduledTiming(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				return basicSetAsNeededBoolean(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				return basicSetAsNeededCodeableConcept(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				return basicSetOrderedOn(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				return basicSetOrderer(null, msgs);
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
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
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				return getSubject();
			case FhirPackage.PROCEDURE_REQUEST__CODE:
				return getCode();
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				return getBodySite();
			case FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT:
				return getReasonCodeableConcept();
			case FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME:
				return getScheduledDateTime();
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD:
				return getScheduledPeriod();
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING:
				return getScheduledTiming();
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				return getEncounter();
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				return getPerformer();
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				return getNotes();
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				return getAsNeededBoolean();
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				return getAsNeededCodeableConcept();
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				return getOrderedOn();
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				return getOrderer();
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
				return getPriority();
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
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE:
				setReasonReference((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME:
				setScheduledDateTime((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING:
				setScheduledTiming((Timing)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				setStatus((ProcedureRequestStatus)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				setOrderer((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
				setPriority((ProcedureRequestPriority)newValue);
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
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT:
				setReasonCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE:
				setReasonReference((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME:
				setScheduledDateTime((DateTime)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING:
				setScheduledTiming((Timing)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				setStatus((ProcedureRequestStatus)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				getNotes().clear();
				return;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				setOrderer((Reference)null);
				return;
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
				setPriority((ProcedureRequestPriority)null);
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
			case FhirPackage.PROCEDURE_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCEDURE_REQUEST__SUBJECT:
				return subject != null;
			case FhirPackage.PROCEDURE_REQUEST__CODE:
				return code != null;
			case FhirPackage.PROCEDURE_REQUEST__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.PROCEDURE_REQUEST__REASON_CODEABLE_CONCEPT:
				return reasonCodeableConcept != null;
			case FhirPackage.PROCEDURE_REQUEST__REASON_REFERENCE:
				return reasonReference != null;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_DATE_TIME:
				return scheduledDateTime != null;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_PERIOD:
				return scheduledPeriod != null;
			case FhirPackage.PROCEDURE_REQUEST__SCHEDULED_TIMING:
				return scheduledTiming != null;
			case FhirPackage.PROCEDURE_REQUEST__ENCOUNTER:
				return encounter != null;
			case FhirPackage.PROCEDURE_REQUEST__PERFORMER:
				return performer != null;
			case FhirPackage.PROCEDURE_REQUEST__STATUS:
				return status != null;
			case FhirPackage.PROCEDURE_REQUEST__NOTES:
				return notes != null && !notes.isEmpty();
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_BOOLEAN:
				return asNeededBoolean != null;
			case FhirPackage.PROCEDURE_REQUEST__AS_NEEDED_CODEABLE_CONCEPT:
				return asNeededCodeableConcept != null;
			case FhirPackage.PROCEDURE_REQUEST__ORDERED_ON:
				return orderedOn != null;
			case FhirPackage.PROCEDURE_REQUEST__ORDERER:
				return orderer != null;
			case FhirPackage.PROCEDURE_REQUEST__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcedureRequestImpl
