/**
 */
package org.gravity.eval.ase.deltas;

import org.eclipse.gmt.modisco.java.ClassDeclaration;

import org.gravity.modisco.MGravityModel;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.eval.ase.deltas.DeltasPackage#getRenameClass()
 * @model
 * @generated
 */
public interface RenameClass extends Delta {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void rename(ClassDeclaration mclass);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // RenameClass
