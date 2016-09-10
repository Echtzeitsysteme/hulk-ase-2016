/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HSoure Meter Metric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage#getHSoureMeterMetricType()
 * @model
 * @generated
 */
public interface HSoureMeterMetricType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes
	 * @see #setType(HSourceMeterMetricTypes)
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage#getHSoureMeterMetricType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HSourceMeterMetricTypes getType();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(HSourceMeterMetricTypes value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HSoureMeterMetricType
