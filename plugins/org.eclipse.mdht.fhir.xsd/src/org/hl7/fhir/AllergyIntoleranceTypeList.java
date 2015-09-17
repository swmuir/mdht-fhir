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
 * A representation of the literals of the enumeration '<em><b>Allergy Intolerance Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceTypeList()
 * @model extendedMetaData="name='AllergyIntoleranceType-list'"
 * @generated
 */
public enum AllergyIntoleranceTypeList implements Enumerator {
	/**
	 * The '<em><b>Allergy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLERGY_VALUE
	 * @generated
	 * @ordered
	 */
	ALLERGY(0, "allergy", "allergy"),

	/**
	 * The '<em><b>Intolerance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTOLERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INTOLERANCE(1, "intolerance", "intolerance");

	/**
	 * The '<em><b>Allergy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A propensity for hypersensitivity reaction(s) to a substance.  These reactions are most typically type I hypersensitivity, plus other "allergy-like" reactions, including pseudoallergy.
	 * <!-- end-model-doc -->
	 * @see #ALLERGY
	 * @model name="allergy"
	 * @generated
	 * @ordered
	 */
	public static final int ALLERGY_VALUE = 0;

	/**
	 * The '<em><b>Intolerance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A propensity for adverse reactions to a substance that is not judged to be allergic or "allergy-like".  These reactions are typically (but not necessarily) non-immune.  They are to some degree idiosyncratic and/or individually specific (i.e. are not a reaction that is expected to occur with most or all patients given similar circumstances).
	 * <!-- end-model-doc -->
	 * @see #INTOLERANCE
	 * @model name="intolerance"
	 * @generated
	 * @ordered
	 */
	public static final int INTOLERANCE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Allergy Intolerance Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllergyIntoleranceTypeList[] VALUES_ARRAY =
		new AllergyIntoleranceTypeList[] {
			ALLERGY,
			INTOLERANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Allergy Intolerance Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllergyIntoleranceTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allergy Intolerance Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceTypeList get(int value) {
		switch (value) {
			case ALLERGY_VALUE: return ALLERGY;
			case INTOLERANCE_VALUE: return INTOLERANCE;
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
	private AllergyIntoleranceTypeList(int value, String name, String literal) {
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
	
} //AllergyIntoleranceTypeList
