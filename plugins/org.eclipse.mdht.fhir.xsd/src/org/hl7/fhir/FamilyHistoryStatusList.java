/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Family History Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getFamilyHistoryStatusList()
 * @model extendedMetaData="name='FamilyHistoryStatus-list'"
 * @generated
 */
public enum FamilyHistoryStatusList implements Enumerator {
	/**
	 * The '<em><b>Partial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL(0, "partial", "partial"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(1, "completed", "completed"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(2, "enteredInError", "entered-in-error"),

	/**
	 * The '<em><b>Health Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTH_UNKNOWN(3, "healthUnknown", "health-unknown");

	/**
	 * The '<em><b>Partial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some health information is known and captured, but not complete - see notes for details.
	 * <!-- end-model-doc -->
	 * @see #PARTIAL
	 * @model name="partial"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_VALUE = 0;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All relevant health information is known and captured.
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 1;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This instance should not have been part of this patient's medical record.
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 2;

	/**
	 * The '<em><b>Health Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Health information for this individual is unavailable/unknown.
	 * <!-- end-model-doc -->
	 * @see #HEALTH_UNKNOWN
	 * @model name="healthUnknown" literal="health-unknown"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTH_UNKNOWN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Family History Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FamilyHistoryStatusList[] VALUES_ARRAY =
		new FamilyHistoryStatusList[] {
			PARTIAL,
			COMPLETED,
			ENTERED_IN_ERROR,
			HEALTH_UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Family History Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FamilyHistoryStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Family History Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FamilyHistoryStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FamilyHistoryStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Family History Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FamilyHistoryStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FamilyHistoryStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Family History Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FamilyHistoryStatusList get(int value) {
		switch (value) {
			case PARTIAL_VALUE: return PARTIAL;
			case COMPLETED_VALUE: return COMPLETED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
			case HEALTH_UNKNOWN_VALUE: return HEALTH_UNKNOWN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FamilyHistoryStatusList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FamilyHistoryStatusList
