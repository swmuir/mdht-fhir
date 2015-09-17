/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ListEntryImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListEntryImpl#getDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListEntryImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ListEntryImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListEntryImpl extends BackboneElementImpl implements ListEntry {
	/**
	 * The cached value of the '{@link #getFlag() <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept flag;

	/**
	 * The cached value of the '{@link #getDeleted() <em>Deleted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleted()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean deleted;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Reference item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getListEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFlag() {
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlag(CodeableConcept newFlag, NotificationChain msgs) {
		CodeableConcept oldFlag = flag;
		flag = newFlag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIST_ENTRY__FLAG, oldFlag, newFlag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(CodeableConcept newFlag) {
		if (newFlag != flag) {
			NotificationChain msgs = null;
			if (flag != null)
				msgs = ((InternalEObject)flag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIST_ENTRY__FLAG, null, msgs);
			if (newFlag != null)
				msgs = ((InternalEObject)newFlag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIST_ENTRY__FLAG, null, msgs);
			msgs = basicSetFlag(newFlag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIST_ENTRY__FLAG, newFlag, newFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getDeleted() {
		return deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleted(org.hl7.fhir.Boolean newDeleted, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldDeleted = deleted;
		deleted = newDeleted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIST_ENTRY__DELETED, oldDeleted, newDeleted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleted(org.hl7.fhir.Boolean newDeleted) {
		if (newDeleted != deleted) {
			NotificationChain msgs = null;
			if (deleted != null)
				msgs = ((InternalEObject)deleted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIST_ENTRY__DELETED, null, msgs);
			if (newDeleted != null)
				msgs = ((InternalEObject)newDeleted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIST_ENTRY__DELETED, null, msgs);
			msgs = basicSetDeleted(newDeleted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIST_ENTRY__DELETED, newDeleted, newDeleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIST_ENTRY__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIST_ENTRY__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIST_ENTRY__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIST_ENTRY__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(Reference newItem, NotificationChain msgs) {
		Reference oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIST_ENTRY__ITEM, oldItem, newItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(Reference newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIST_ENTRY__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIST_ENTRY__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIST_ENTRY__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.LIST_ENTRY__FLAG:
				return basicSetFlag(null, msgs);
			case FhirPackage.LIST_ENTRY__DELETED:
				return basicSetDeleted(null, msgs);
			case FhirPackage.LIST_ENTRY__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.LIST_ENTRY__ITEM:
				return basicSetItem(null, msgs);
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
			case FhirPackage.LIST_ENTRY__FLAG:
				return getFlag();
			case FhirPackage.LIST_ENTRY__DELETED:
				return getDeleted();
			case FhirPackage.LIST_ENTRY__DATE:
				return getDate();
			case FhirPackage.LIST_ENTRY__ITEM:
				return getItem();
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
			case FhirPackage.LIST_ENTRY__FLAG:
				setFlag((CodeableConcept)newValue);
				return;
			case FhirPackage.LIST_ENTRY__DELETED:
				setDeleted((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.LIST_ENTRY__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.LIST_ENTRY__ITEM:
				setItem((Reference)newValue);
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
			case FhirPackage.LIST_ENTRY__FLAG:
				setFlag((CodeableConcept)null);
				return;
			case FhirPackage.LIST_ENTRY__DELETED:
				setDeleted((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.LIST_ENTRY__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.LIST_ENTRY__ITEM:
				setItem((Reference)null);
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
			case FhirPackage.LIST_ENTRY__FLAG:
				return flag != null;
			case FhirPackage.LIST_ENTRY__DELETED:
				return deleted != null;
			case FhirPackage.LIST_ENTRY__DATE:
				return date != null;
			case FhirPackage.LIST_ENTRY__ITEM:
				return item != null;
		}
		return super.eIsSet(featureID);
	}

} //ListEntryImpl
