/**
 */
package org.gravity.tgg.modisco.preprocessing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.preprocessing.PreprocessingPackage
 * @generated
 */
public interface PreprocessingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PreprocessingFactory eINSTANCE = org.gravity.tgg.modisco.preprocessing.impl.PreprocessingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mo Disco TGG Preprocessing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo Disco TGG Preprocessing</em>'.
	 * @generated
	 */
	MoDiscoTGGPreprocessing createMoDiscoTGGPreprocessing();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PreprocessingPackage getPreprocessingPackage();

} //PreprocessingFactory
