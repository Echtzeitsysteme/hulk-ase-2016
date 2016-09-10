/**
 */
package org.gravity.eval.ase.deltas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.eval.ase.deltas.DeltasPackage
 * @generated
 */
public interface DeltasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeltasFactory eINSTANCE = org.gravity.eval.ase.deltas.impl.DeltasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Delete Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Method</em>'.
	 * @generated
	 */
	DeleteMethod createDeleteMethod();

	/**
	 * Returns a new object of class '<em>Rename Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Class</em>'.
	 * @generated
	 */
	RenameClass createRenameClass();

	/**
	 * Returns a new object of class '<em>Create Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Method</em>'.
	 * @generated
	 */
	CreateMethod createCreateMethod();

	/**
	 * Returns a new object of class '<em>Create Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Class</em>'.
	 * @generated
	 */
	CreateClass createCreateClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeltasPackage getDeltasPackage();

} //DeltasFactory
