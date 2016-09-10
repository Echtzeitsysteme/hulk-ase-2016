/**
 */
package org.gravity.hulk.detection.metrics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.metrics.MetricsPackage
 * @generated
 */
public interface MetricsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsFactory eINSTANCE = org.gravity.hulk.detection.metrics.impl.MetricsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HInvocation Relation Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HInvocation Relation Calculator</em>'.
	 * @generated
	 */
	HInvocationRelationCalculator createHInvocationRelationCalculator();

	/**
	 * Returns a new object of class '<em>HNumber Of Child Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HNumber Of Child Calculator</em>'.
	 * @generated
	 */
	HNumberOfChildCalculator createHNumberOfChildCalculator();

	/**
	 * Returns a new object of class '<em>HMember Number Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMember Number Calculator</em>'.
	 * @generated
	 */
	HMemberNumberCalculator createHMemberNumberCalculator();

	/**
	 * Returns a new object of class '<em>HLocal Access Relation Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLocal Access Relation Calculator</em>'.
	 * @generated
	 */
	HLocalAccessRelationCalculator createHLocalAccessRelationCalculator();

	/**
	 * Returns a new object of class '<em>HMethod Number Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMethod Number Calculator</em>'.
	 * @generated
	 */
	HMethodNumberCalculator createHMethodNumberCalculator();

	/**
	 * Returns a new object of class '<em>HGetter Setter Method Relation Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HGetter Setter Method Relation Calculator</em>'.
	 * @generated
	 */
	HGetterSetterMethodRelationCalculator createHGetterSetterMethodRelationCalculator();

	/**
	 * Returns a new object of class '<em>HAverage Paramters Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAverage Paramters Calculator</em>'.
	 * @generated
	 */
	HAverageParamtersCalculator createHAverageParamtersCalculator();

	/**
	 * Returns a new object of class '<em>HAverage Overloading In Class Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAverage Overloading In Class Calculator</em>'.
	 * @generated
	 */
	HAverageOverloadingInClassCalculator createHAverageOverloadingInClassCalculator();

	/**
	 * Returns a new object of class '<em>HLocal Method Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLocal Method Access Calculator</em>'.
	 * @generated
	 */
	HLocalMethodAccessCalculator createHLocalMethodAccessCalculator();

	/**
	 * Returns a new object of class '<em>HLocal Fields Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLocal Fields Access Calculator</em>'.
	 * @generated
	 */
	HLocalFieldsAccessCalculator createHLocalFieldsAccessCalculator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetricsPackage getMetricsPackage();

} //MetricsFactory
