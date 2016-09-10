/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter;

import org.gravity.hulk.antipatterngraph.HMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HOutgoing Invocations Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage#getHOutgoingInvocationsCalculator()
 * @model
 * @generated
 */
public interface HOutgoingInvocationsCalculator extends HSourcemeterMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HSoureMeterMetricType whichMetric();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HMetric createMetric(double value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HOutgoingInvocationsCalculator
