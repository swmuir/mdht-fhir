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

import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceRelatedAgent;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getRelatedAgent <em>Related Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvenanceAgentImpl extends BackboneElementImpl implements ProvenanceAgent {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Coding role;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Reference actor;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected Identifier userId;

	/**
	 * The cached value of the '{@link #getRelatedAgent() <em>Related Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceRelatedAgent> relatedAgent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProvenanceAgent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Coding newRole, NotificationChain msgs) {
		Coding oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Coding newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(Reference newActor, NotificationChain msgs) {
		Reference oldActor = actor;
		actor = newActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ACTOR, oldActor, newActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Reference newActor) {
		if (newActor != actor) {
			NotificationChain msgs = null;
			if (actor != null)
				msgs = ((InternalEObject)actor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ACTOR, null, msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ACTOR, null, msgs);
			msgs = basicSetActor(newActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserId(Identifier newUserId, NotificationChain msgs) {
		Identifier oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__USER_ID, oldUserId, newUserId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(Identifier newUserId) {
		if (newUserId != userId) {
			NotificationChain msgs = null;
			if (userId != null)
				msgs = ((InternalEObject)userId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__USER_ID, null, msgs);
			if (newUserId != null)
				msgs = ((InternalEObject)newUserId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__USER_ID, null, msgs);
			msgs = basicSetUserId(newUserId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__USER_ID, newUserId, newUserId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvenanceRelatedAgent> getRelatedAgent() {
		if (relatedAgent == null) {
			relatedAgent = new EObjectContainmentEList<ProvenanceRelatedAgent>(ProvenanceRelatedAgent.class, this, FhirPackage.PROVENANCE_AGENT__RELATED_AGENT);
		}
		return relatedAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__ACTOR:
				return basicSetActor(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__USER_ID:
				return basicSetUserId(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT:
				return ((InternalEList<?>)getRelatedAgent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return getRole();
			case FhirPackage.PROVENANCE_AGENT__ACTOR:
				return getActor();
			case FhirPackage.PROVENANCE_AGENT__USER_ID:
				return getUserId();
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT:
				return getRelatedAgent();
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				setRole((Coding)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__ACTOR:
				setActor((Reference)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__USER_ID:
				setUserId((Identifier)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT:
				getRelatedAgent().clear();
				getRelatedAgent().addAll((Collection<? extends ProvenanceRelatedAgent>)newValue);
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				setRole((Coding)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__ACTOR:
				setActor((Reference)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__USER_ID:
				setUserId((Identifier)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT:
				getRelatedAgent().clear();
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return role != null;
			case FhirPackage.PROVENANCE_AGENT__ACTOR:
				return actor != null;
			case FhirPackage.PROVENANCE_AGENT__USER_ID:
				return userId != null;
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT:
				return relatedAgent != null && !relatedAgent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceAgentImpl
