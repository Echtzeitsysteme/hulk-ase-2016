/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage
 * @generated
 */
public interface SourcemeterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourcemeterFactory eINSTANCE = org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HLCOM5 Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLCOM5 Calculator</em>'.
	 * @generated
	 */
	HLCOM5Calculator createHLCOM5Calculator();

	/**
	 * Returns a new object of class '<em>HSetters Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSetters Calculator</em>'.
	 * @generated
	 */
	HSettersCalculator createHSettersCalculator();

	/**
	 * Returns a new object of class '<em>HIncomming Invocations Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIncomming Invocations Calculator</em>'.
	 * @generated
	 */
	HIncommingInvocationsCalculator createHIncommingInvocationsCalculator();

	/**
	 * Returns a new object of class '<em>HSoure Meter Metric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSoure Meter Metric Type</em>'.
	 * @generated
	 */
	HSoureMeterMetricType createHSoureMeterMetricType();

	/**
	 * Returns a new object of class '<em>HOutgoing Invocations Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HOutgoing Invocations Calculator</em>'.
	 * @generated
	 */
	HOutgoingInvocationsCalculator createHOutgoingInvocationsCalculator();

	/**
	 * Returns a new object of class '<em>HGetters Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HGetters Calculator</em>'.
	 * @generated
	 */
	HGettersCalculator createHGettersCalculator();

	/**
	 * Returns a new object of class '<em>HDepth Of Inheritance Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HDepth Of Inheritance Calculator</em>'.
	 * @generated
	 */
	HDepthOfInheritanceCalculator createHDepthOfInheritanceCalculator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SourcemeterPackage getSourcemeterPackage();

} //SourcemeterFactory
