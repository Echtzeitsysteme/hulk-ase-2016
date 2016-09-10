/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLow Cohesion Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell#getHLCOM5 <em>HLCOM5</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLowCohesionSmell()
 * @model
 * @generated
 */
public interface HLowCohesionSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HLCOM5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLCOM5</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLCOM5</em>' reference.
	 * @see #setHLCOM5(HLCOM5Metric)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLowCohesionSmell_HLCOM5()
	 * @model
	 * @generated
	 */
	HLCOM5Metric getHLCOM5();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell#getHLCOM5 <em>HLCOM5</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLCOM5</em>' reference.
	 * @see #getHLCOM5()
	 * @generated
	 */
	void setHLCOM5(HLCOM5Metric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HLowCohesionSmell
