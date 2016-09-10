/**
 */
package org.gravity.eval.ase.deltas;

import org.gravity.modisco.MGravityModel;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.eval.ase.deltas.DeltasPackage#getCreateClass()
 * @model
 * @generated
 */
public interface CreateClass extends Delta {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getProjectName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void perform(MGravityModel modisco);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CreateClass
