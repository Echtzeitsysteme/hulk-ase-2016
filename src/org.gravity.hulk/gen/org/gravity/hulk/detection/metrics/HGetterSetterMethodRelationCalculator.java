/**
 */
package org.gravity.hulk.detection.metrics;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric;

import org.gravity.hulk.detection.HClassBasedMetricCalculator;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HGetter Setter Method Relation Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.metrics.MetricsPackage#getHGetterSetterMethodRelationCalculator()
 * @model
 * @generated
 */
public interface HGetterSetterMethodRelationCalculator extends HClassBasedMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HMetric calculateMetric(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double calculateValue(HNumberOfSettersMetric setter, HNumberOfGettersMetric getter, HNumberOfMethodsMetric methods);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double calculateValue(TClass tClass);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HGetterSetterMethodRelationCalculator
