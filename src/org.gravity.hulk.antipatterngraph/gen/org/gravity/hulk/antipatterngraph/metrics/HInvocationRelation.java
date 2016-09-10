/**
 */
package org.gravity.hulk.antipatterngraph.metrics;

import org.gravity.hulk.antipatterngraph.HMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HInvocation Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHNumberOfOutgoingInvocationsMetric <em>HNumber Of Outgoing Invocations Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHNumberOfIncommingInvocationsMetric <em>HNumber Of Incomming Invocations Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHInvocationRelation()
 * @model
 * @generated
 */
public interface HInvocationRelation extends HMetric {
	/**
	 * Returns the value of the '<em><b>HNumber Of Outgoing Invocations Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HNumber Of Outgoing Invocations Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HNumber Of Outgoing Invocations Metric</em>' reference.
	 * @see #setHNumberOfOutgoingInvocationsMetric(HNumberOfOutgoingInvocationsMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHInvocationRelation_HNumberOfOutgoingInvocationsMetric()
	 * @model
	 * @generated
	 */
	HNumberOfOutgoingInvocationsMetric getHNumberOfOutgoingInvocationsMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHNumberOfOutgoingInvocationsMetric <em>HNumber Of Outgoing Invocations Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HNumber Of Outgoing Invocations Metric</em>' reference.
	 * @see #getHNumberOfOutgoingInvocationsMetric()
	 * @generated
	 */
	void setHNumberOfOutgoingInvocationsMetric(HNumberOfOutgoingInvocationsMetric value);

	/**
	 * Returns the value of the '<em><b>HNumber Of Incomming Invocations Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HNumber Of Incomming Invocations Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HNumber Of Incomming Invocations Metric</em>' reference.
	 * @see #setHNumberOfIncommingInvocationsMetric(HNumberOfIncommingInvocationsMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHInvocationRelation_HNumberOfIncommingInvocationsMetric()
	 * @model
	 * @generated
	 */
	HNumberOfIncommingInvocationsMetric getHNumberOfIncommingInvocationsMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHNumberOfIncommingInvocationsMetric <em>HNumber Of Incomming Invocations Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HNumber Of Incomming Invocations Metric</em>' reference.
	 * @see #getHNumberOfIncommingInvocationsMetric()
	 * @generated
	 */
	void setHNumberOfIncommingInvocationsMetric(HNumberOfIncommingInvocationsMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HInvocationRelation
