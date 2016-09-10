/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HSource Meter Metric Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage#getHSourceMeterMetricTypes()
 * @model
 * @generated
 */
public enum HSourceMeterMetricTypes implements Enumerator {
	/**
	 * The '<em><b>LCOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LCOM_VALUE
	 * @generated
	 * @ordered
	 */
	LCOM(18, "LCOM", "LCOM"),

	/**
	 * The '<em><b>NII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NII_VALUE
	 * @generated
	 * @ordered
	 */
	NII(24, "NII", "NII"),

	/**
	 * The '<em><b>NOI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOI_VALUE
	 * @generated
	 * @ordered
	 */
	NOI(25, "NOI", "NOI"),

	/**
	 * The '<em><b>NG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NG_VALUE
	 * @generated
	 * @ordered
	 */
	NG(43, "NG", "NG"),

	/**
	 * The '<em><b>NS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NS_VALUE
	 * @generated
	 * @ordered
	 */
	NS(54, "NS", "NS"),

	/**
	 * The '<em><b>DIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIT_VALUE
	 * @generated
	 * @ordered
	 */
	DIT(35, "DIT", "DIT");

	/**
	 * The '<em><b>LCOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LCOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LCOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LCOM_VALUE = 18;

	/**
	 * The '<em><b>NII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NII</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NII
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NII_VALUE = 24;

	/**
	 * The '<em><b>NOI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOI_VALUE = 25;

	/**
	 * The '<em><b>NG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NG_VALUE = 43;

	/**
	 * The '<em><b>NS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NS_VALUE = 54;

	/**
	 * The '<em><b>DIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIT_VALUE = 35;

	/**
	 * An array of all the '<em><b>HSource Meter Metric Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HSourceMeterMetricTypes[] VALUES_ARRAY = new HSourceMeterMetricTypes[] { LCOM, NII, NOI, NG,
			NS, DIT, };

	/**
	 * A public read-only list of all the '<em><b>HSource Meter Metric Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HSourceMeterMetricTypes> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HSource Meter Metric Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HSourceMeterMetricTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HSourceMeterMetricTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HSource Meter Metric Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HSourceMeterMetricTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HSourceMeterMetricTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HSource Meter Metric Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HSourceMeterMetricTypes get(int value) {
		switch (value) {
		case LCOM_VALUE:
			return LCOM;
		case NII_VALUE:
			return NII;
		case NOI_VALUE:
			return NOI;
		case NG_VALUE:
			return NG;
		case NS_VALUE:
			return NS;
		case DIT_VALUE:
			return DIT;
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
	private HSourceMeterMetricTypes(int value, String name, String literal) {
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

} //HSourceMeterMetricTypes
