/**
 */
package org.gravity.hulk.antipatterngraph.metrics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsFactory
 * @model kind="package"
 * @generated
 */
public interface MetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.hulk.antipatterngraph/model/Antipatterngraph.ecore#//metrics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metrics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsPackage eINSTANCE = org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl <em>HNACC Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNACCMetric()
	 * @generated
	 */
	int HNACC_METRIC = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HGetter Setter Smells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__HGETTER_SETTER_SMELLS = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HNumber Of Getters Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HNumber Of Setters Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>HNumber Of Methods Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC__HNUMBER_OF_METHODS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>HNACC Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNACC Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNACC_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl <em>HLCOM5 Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLCOM5Metric()
	 * @generated
	 */
	int HLCOM5_METRIC = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HLCOM5 Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLCOM5 Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMembersMetricImpl <em>HNumber Of Members Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMembersMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfMembersMetric()
	 * @generated
	 */
	int HNUMBER_OF_MEMBERS_METRIC = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Members Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Members Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_MEMBERS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfIncommingInvocationsMetricImpl <em>HNumber Of Incomming Invocations Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfIncommingInvocationsMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfIncommingInvocationsMetric()
	 * @generated
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Incomming Invocations Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Incomming Invocations Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfOutgoingInvocationsMetricImpl <em>HNumber Of Outgoing Invocations Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfOutgoingInvocationsMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfOutgoingInvocationsMetric()
	 * @generated
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Outgoing Invocations Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Outgoing Invocations Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl <em>HLocal Access Relation Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalAccessRelationMetric()
	 * @generated
	 */
	int HLOCAL_ACCESS_RELATION_METRIC = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HLocal Field Accesses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HLocal Method Accesses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HLocal Access Relation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLocal Access Relation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl <em>HInvocation Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHInvocationRelation()
	 * @generated
	 */
	int HINVOCATION_RELATION = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HNumber Of Outgoing Invocations Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>HNumber Of Incomming Invocations Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>HInvocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HInvocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfChildMetricImpl <em>HNumber Of Child Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfChildMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfChildMetric()
	 * @generated
	 */
	int HNUMBER_OF_CHILD_METRIC = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Child Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Child Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfGettersMetricImpl <em>HNumber Of Getters Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfGettersMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfGettersMetric()
	 * @generated
	 */
	int HNUMBER_OF_GETTERS_METRIC = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Getters Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Getters Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_GETTERS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfSettersMetricImpl <em>HNumber Of Setters Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfSettersMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfSettersMetric()
	 * @generated
	 */
	int HNUMBER_OF_SETTERS_METRIC = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Setters Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Setters Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_SETTERS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMethodsMetricImpl <em>HNumber Of Methods Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMethodsMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfMethodsMetric()
	 * @generated
	 */
	int HNUMBER_OF_METHODS_METRIC = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HNumber Of Methods Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HNumber Of Methods Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_METHODS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAverageOverloadingInClassMetricImpl <em>HAverage Overloading In Class Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAverageOverloadingInClassMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAverageOverloadingInClassMetric()
	 * @generated
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HAverage Overloading In Class Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HAverage Overloading In Class Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAverageParametersMetricImpl <em>HAverage Parameters Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAverageParametersMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAverageParametersMetric()
	 * @generated
	 */
	int HAVERAGE_PARAMETERS_METRIC = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HAverage Parameters Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HAverage Parameters Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMETERS_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalMethodAccessesMetricImpl <em>HLocal Method Accesses Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalMethodAccessesMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalMethodAccessesMetric()
	 * @generated
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HLocal Method Accesses Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLocal Method Accesses Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESSES_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldAccessesMetricImpl <em>HLocal Field Accesses Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldAccessesMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalFieldAccessesMetric()
	 * @generated
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HLocal Field Accesses Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HLocal Field Accesses Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELD_ACCESSES_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HDepthOfInheritanceMetricImpl <em>HDepth Of Inheritance Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HDepthOfInheritanceMetricImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHDepthOfInheritanceMetric()
	 * @generated
	 */
	int HDEPTH_OF_INHERITANCE_METRIC = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__ID = AntipatterngraphPackage.HMETRIC__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HDepth Of Inheritance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HDepth Of Inheritance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_METRIC_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric <em>HNACC Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNACC Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric
	 * @generated
	 */
	EClass getHNACCMetric();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterSetterSmells <em>HGetter Setter Smells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HGetter Setter Smells</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHGetterSetterSmells()
	 * @see #getHNACCMetric()
	 * @generated
	 */
	EReference getHNACCMetric_HGetterSetterSmells();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfGettersMetric <em>HNumber Of Getters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Getters Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfGettersMetric()
	 * @see #getHNACCMetric()
	 * @generated
	 */
	EReference getHNACCMetric_HNumberOfGettersMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfSettersMetric <em>HNumber Of Setters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Setters Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfSettersMetric()
	 * @see #getHNACCMetric()
	 * @generated
	 */
	EReference getHNACCMetric_HNumberOfSettersMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Methods Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNACCMetric#getHNumberOfMethodsMetric()
	 * @see #getHNACCMetric()
	 * @generated
	 */
	EReference getHNACCMetric_HNumberOfMethodsMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric <em>HLCOM5 Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLCOM5 Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric
	 * @generated
	 */
	EClass getHLCOM5Metric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric <em>HNumber Of Members Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Members Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric
	 * @generated
	 */
	EClass getHNumberOfMembersMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric <em>HNumber Of Incomming Invocations Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Incomming Invocations Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric
	 * @generated
	 */
	EClass getHNumberOfIncommingInvocationsMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric <em>HNumber Of Outgoing Invocations Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Outgoing Invocations Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric
	 * @generated
	 */
	EClass getHNumberOfOutgoingInvocationsMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric <em>HLocal Access Relation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Access Relation Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric
	 * @generated
	 */
	EClass getHLocalAccessRelationMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalFieldAccesses <em>HLocal Field Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLocal Field Accesses</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalFieldAccesses()
	 * @see #getHLocalAccessRelationMetric()
	 * @generated
	 */
	EReference getHLocalAccessRelationMetric_HLocalFieldAccesses();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalMethodAccesses <em>HLocal Method Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLocal Method Accesses</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalMethodAccesses()
	 * @see #getHLocalAccessRelationMetric()
	 * @generated
	 */
	EReference getHLocalAccessRelationMetric_HLocalMethodAccesses();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation <em>HInvocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HInvocation Relation</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation
	 * @generated
	 */
	EClass getHInvocationRelation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHNumberOfOutgoingInvocationsMetric <em>HNumber Of Outgoing Invocations Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Outgoing Invocations Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHNumberOfOutgoingInvocationsMetric()
	 * @see #getHInvocationRelation()
	 * @generated
	 */
	EReference getHInvocationRelation_HNumberOfOutgoingInvocationsMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHNumberOfIncommingInvocationsMetric <em>HNumber Of Incomming Invocations Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Incomming Invocations Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation#getHNumberOfIncommingInvocationsMetric()
	 * @see #getHInvocationRelation()
	 * @generated
	 */
	EReference getHInvocationRelation_HNumberOfIncommingInvocationsMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric <em>HNumber Of Child Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Child Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric
	 * @generated
	 */
	EClass getHNumberOfChildMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric <em>HNumber Of Getters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Getters Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric
	 * @generated
	 */
	EClass getHNumberOfGettersMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric <em>HNumber Of Setters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Setters Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric
	 * @generated
	 */
	EClass getHNumberOfSettersMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Methods Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric
	 * @generated
	 */
	EClass getHNumberOfMethodsMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAverage Overloading In Class Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric
	 * @generated
	 */
	EClass getHAverageOverloadingInClassMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric <em>HAverage Parameters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAverage Parameters Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric
	 * @generated
	 */
	EClass getHAverageParametersMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric <em>HLocal Method Accesses Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Method Accesses Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric
	 * @generated
	 */
	EClass getHLocalMethodAccessesMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric <em>HLocal Field Accesses Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Field Accesses Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric
	 * @generated
	 */
	EClass getHLocalFieldAccessesMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric <em>HDepth Of Inheritance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDepth Of Inheritance Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric
	 * @generated
	 */
	EClass getHDepthOfInheritanceMetric();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricsFactory getMetricsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl <em>HNACC Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNACCMetric()
		 * @generated
		 */
		EClass HNACC_METRIC = eINSTANCE.getHNACCMetric();

		/**
		 * The meta object literal for the '<em><b>HGetter Setter Smells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNACC_METRIC__HGETTER_SETTER_SMELLS = eINSTANCE.getHNACCMetric_HGetterSetterSmells();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Getters Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC = eINSTANCE.getHNACCMetric_HNumberOfGettersMetric();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Setters Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC = eINSTANCE.getHNACCMetric_HNumberOfSettersMetric();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Methods Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNACC_METRIC__HNUMBER_OF_METHODS_METRIC = eINSTANCE.getHNACCMetric_HNumberOfMethodsMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl <em>HLCOM5 Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLCOM5MetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLCOM5Metric()
		 * @generated
		 */
		EClass HLCOM5_METRIC = eINSTANCE.getHLCOM5Metric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMembersMetricImpl <em>HNumber Of Members Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMembersMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfMembersMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_MEMBERS_METRIC = eINSTANCE.getHNumberOfMembersMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfIncommingInvocationsMetricImpl <em>HNumber Of Incomming Invocations Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfIncommingInvocationsMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfIncommingInvocationsMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC = eINSTANCE.getHNumberOfIncommingInvocationsMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfOutgoingInvocationsMetricImpl <em>HNumber Of Outgoing Invocations Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfOutgoingInvocationsMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfOutgoingInvocationsMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC = eINSTANCE.getHNumberOfOutgoingInvocationsMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl <em>HLocal Access Relation Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalAccessRelationMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalAccessRelationMetric()
		 * @generated
		 */
		EClass HLOCAL_ACCESS_RELATION_METRIC = eINSTANCE.getHLocalAccessRelationMetric();

		/**
		 * The meta object literal for the '<em><b>HLocal Field Accesses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES = eINSTANCE
				.getHLocalAccessRelationMetric_HLocalFieldAccesses();

		/**
		 * The meta object literal for the '<em><b>HLocal Method Accesses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES = eINSTANCE
				.getHLocalAccessRelationMetric_HLocalMethodAccesses();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl <em>HInvocation Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHInvocationRelation()
		 * @generated
		 */
		EClass HINVOCATION_RELATION = eINSTANCE.getHInvocationRelation();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Outgoing Invocations Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC = eINSTANCE
				.getHInvocationRelation_HNumberOfOutgoingInvocationsMetric();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Incomming Invocations Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC = eINSTANCE
				.getHInvocationRelation_HNumberOfIncommingInvocationsMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfChildMetricImpl <em>HNumber Of Child Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfChildMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfChildMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_CHILD_METRIC = eINSTANCE.getHNumberOfChildMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfGettersMetricImpl <em>HNumber Of Getters Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfGettersMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfGettersMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_GETTERS_METRIC = eINSTANCE.getHNumberOfGettersMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfSettersMetricImpl <em>HNumber Of Setters Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfSettersMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfSettersMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_SETTERS_METRIC = eINSTANCE.getHNumberOfSettersMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMethodsMetricImpl <em>HNumber Of Methods Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HNumberOfMethodsMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHNumberOfMethodsMetric()
		 * @generated
		 */
		EClass HNUMBER_OF_METHODS_METRIC = eINSTANCE.getHNumberOfMethodsMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAverageOverloadingInClassMetricImpl <em>HAverage Overloading In Class Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAverageOverloadingInClassMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAverageOverloadingInClassMetric()
		 * @generated
		 */
		EClass HAVERAGE_OVERLOADING_IN_CLASS_METRIC = eINSTANCE.getHAverageOverloadingInClassMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HAverageParametersMetricImpl <em>HAverage Parameters Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HAverageParametersMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHAverageParametersMetric()
		 * @generated
		 */
		EClass HAVERAGE_PARAMETERS_METRIC = eINSTANCE.getHAverageParametersMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalMethodAccessesMetricImpl <em>HLocal Method Accesses Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalMethodAccessesMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalMethodAccessesMetric()
		 * @generated
		 */
		EClass HLOCAL_METHOD_ACCESSES_METRIC = eINSTANCE.getHLocalMethodAccessesMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldAccessesMetricImpl <em>HLocal Field Accesses Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HLocalFieldAccessesMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHLocalFieldAccessesMetric()
		 * @generated
		 */
		EClass HLOCAL_FIELD_ACCESSES_METRIC = eINSTANCE.getHLocalFieldAccessesMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.impl.HDepthOfInheritanceMetricImpl <em>HDepth Of Inheritance Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.HDepthOfInheritanceMetricImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl#getHDepthOfInheritanceMetric()
		 * @generated
		 */
		EClass HDEPTH_OF_INHERITANCE_METRIC = eINSTANCE.getHDepthOfInheritanceMetric();

	}

} //MetricsPackage
