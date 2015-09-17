/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.;.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Goal#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStartCodeableConcept <em>Start Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getTargetDate <em>Target Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getTargetQuantity <em>Target Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getOutcome <em>Outcome</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGoal()
 * @model extendedMetaData="name='Goal' kind='elementOnly'"
 * @generated
 */
public interface Goal extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the patient, group or organization for whom the goal is being established.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' containment reference.
	 * @see #setStartDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StartDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStartDate <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' containment reference.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Codeable Concept</em>' containment reference.
	 * @see #setStartCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StartCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStartCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStartCodeableConcept <em>Start Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Codeable Concept</em>' containment reference.
	 * @see #getStartCodeableConcept()
	 * @generated
	 */
	void setStartCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Target Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Date</em>' containment reference.
	 * @see #setTargetDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getGoal_TargetDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getTargetDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getTargetDate <em>Target Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Date</em>' containment reference.
	 * @see #getTargetDate()
	 * @generated
	 */
	void setTargetDate(Date value);

	/**
	 * Returns the value of the '<em><b>Target Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Quantity</em>' containment reference.
	 * @see #setTargetQuantity(Duration)
	 * @see org.hl7.fhir.FhirPackage#getGoal_TargetQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getTargetQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getTargetQuantity <em>Target Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Quantity</em>' containment reference.
	 * @see #getTargetQuantity()
	 * @generated
	 */
	void setTargetQuantity(Duration value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a category the goal falls within.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable description of a specific desired objective of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the goal has been reached and is still considered relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(GoalStatus)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	GoalStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GoalStatus value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures the reason for the current status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whose goal this is - patient goal, practitioner goal, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the mutually agreed level of importance associated with reaching/sustaining the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identified conditions and other health record elements that are intended to be addressed by the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Addresses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addresses' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAddresses();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any comments related to the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GoalOutcome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GoalOutcome> getOutcome();

} // Goal
