/**
 */
package org.gravity.hulk.detection.metrics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.gravity.hulk.detection.DetectionPackage;

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
 * @see org.gravity.hulk.detection.metrics.MetricsFactory
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
	String eNS_URI = "platform:/plugin/org.gravity.hulk/model/Hulk.ecore#//detection/metrics";

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
	MetricsPackage eINSTANCE = org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculatorImpl <em>HInvocation Relation Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHInvocationRelationCalculator()
	 * @generated
	 */
	int HINVOCATION_RELATION_CALCULATOR = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HInvocation Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Invoc Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___CALCULATE_INVOC_VALUE__HNUMBEROFINCOMMINGINVOCATIONSMETRIC_HNUMBEROFOUTGOINGINVOCATIONSMETRIC = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HInvocation Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINVOCATION_RELATION_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculatorImpl <em>HNumber Of Child Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHNumberOfChildCalculator()
	 * @generated
	 */
	int HNUMBER_OF_CHILD_CALCULATOR = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HNumber Of Child Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HNumber Of Child Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNUMBER_OF_CHILD_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculatorImpl <em>HMember Number Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHMemberNumberCalculator()
	 * @generated
	 */
	int HMEMBER_NUMBER_CALCULATOR = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HMember Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HMember Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMEMBER_NUMBER_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculatorImpl <em>HLocal Access Relation Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalAccessRelationCalculator()
	 * @generated
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HLocal Access Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__HLOCALFIELDACCESSESMETRIC_HLOCALMETHODACCESSESMETRIC = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HLocal Access Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_ACCESS_RELATION_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculatorImpl <em>HMethod Number Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHMethodNumberCalculator()
	 * @generated
	 */
	int HMETHOD_NUMBER_CALCULATOR = 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HMethod Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HMethod Number Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_NUMBER_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculatorImpl <em>HGetter Setter Method Relation Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHGetterSetterMethodRelationCalculator()
	 * @generated
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR = 5;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HGetter Setter Method Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__HNUMBEROFSETTERSMETRIC_HNUMBEROFGETTERSMETRIC_HNUMBEROFMETHODSMETRIC = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>HGetter Setter Method Relation Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_METHOD_RELATION_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 3;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HAverageParamtersCalculatorImpl <em>HAverage Paramters Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HAverageParamtersCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAverageParamtersCalculator()
	 * @generated
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR = 6;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HAverage Paramters Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HAverage Paramters Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_PARAMTERS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculatorImpl <em>HAverage Overloading In Class Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAverageOverloadingInClassCalculator()
	 * @generated
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR = 7;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HAverage Overloading In Class Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HAverage Overloading In Class Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculatorImpl <em>HLocal Method Access Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalMethodAccessCalculator()
	 * @generated
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR = 8;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HLocal Method Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HLocal Method Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_METHOD_ACCESS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculatorImpl <em>HLocal Fields Access Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalFieldsAccessCalculator()
	 * @generated
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR = 9;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HLocal Fields Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>HLocal Fields Access Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOCAL_FIELDS_ACCESS_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator <em>HInvocation Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HInvocation Relation Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator
	 * @generated
	 */
	EClass getHInvocationRelationCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHInvocationRelationCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateInvocValue(org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric) <em>Calculate Invoc Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Invoc Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateInvocValue(org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric)
	 * @generated
	 */
	EOperation getHInvocationRelationCalculator__CalculateInvocValue__HNumberOfIncommingInvocationsMetric_HNumberOfOutgoingInvocationsMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HInvocationRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHInvocationRelationCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HNumberOfChildCalculator <em>HNumber Of Child Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNumber Of Child Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HNumberOfChildCalculator
	 * @generated
	 */
	EClass getHNumberOfChildCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HNumberOfChildCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HNumberOfChildCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHNumberOfChildCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HNumberOfChildCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HNumberOfChildCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHNumberOfChildCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HMemberNumberCalculator <em>HMember Number Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMember Number Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HMemberNumberCalculator
	 * @generated
	 */
	EClass getHMemberNumberCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HMemberNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HMemberNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMemberNumberCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HMemberNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HMemberNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMemberNumberCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator <em>HLocal Access Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Access Relation Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator
	 * @generated
	 */
	EClass getHLocalAccessRelationCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalAccessRelationCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateValue(org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric, org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateValue(org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric, org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric)
	 * @generated
	 */
	EOperation getHLocalAccessRelationCalculator__CalculateValue__HLocalFieldAccessesMetric_HLocalMethodAccessesMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalAccessRelationCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HMethodNumberCalculator <em>HMethod Number Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMethod Number Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HMethodNumberCalculator
	 * @generated
	 */
	EClass getHMethodNumberCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HMethodNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HMethodNumberCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMethodNumberCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HMethodNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HMethodNumberCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHMethodNumberCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator <em>HGetter Setter Method Relation Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGetter Setter Method Relation Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator
	 * @generated
	 */
	EClass getHGetterSetterMethodRelationCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHGetterSetterMethodRelationCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateValue(org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateValue(org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric, org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric)
	 * @generated
	 */
	EOperation getHGetterSetterMethodRelationCalculator__CalculateValue__HNumberOfSettersMetric_HNumberOfGettersMetric_HNumberOfMethodsMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHGetterSetterMethodRelationCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HAverageParamtersCalculator <em>HAverage Paramters Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAverage Paramters Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HAverageParamtersCalculator
	 * @generated
	 */
	EClass getHAverageParamtersCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAverageParamtersCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAverageParamtersCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAverageParamtersCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAverageParamtersCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAverageParamtersCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAverageParamtersCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator <em>HAverage Overloading In Class Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAverage Overloading In Class Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator
	 * @generated
	 */
	EClass getHAverageOverloadingInClassCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAverageOverloadingInClassCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHAverageOverloadingInClassCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator <em>HLocal Method Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Method Access Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator
	 * @generated
	 */
	EClass getHLocalMethodAccessCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalMethodAccessCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalMethodAccessCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator <em>HLocal Fields Access Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLocal Fields Access Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator
	 * @generated
	 */
	EClass getHLocalFieldsAccessCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalFieldsAccessCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHLocalFieldsAccessCalculator__CalculateValue__TClass();

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
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculatorImpl <em>HInvocation Relation Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHInvocationRelationCalculator()
		 * @generated
		 */
		EClass HINVOCATION_RELATION_CALCULATOR = eINSTANCE.getHInvocationRelationCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINVOCATION_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHInvocationRelationCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Invoc Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINVOCATION_RELATION_CALCULATOR___CALCULATE_INVOC_VALUE__HNUMBEROFINCOMMINGINVOCATIONSMETRIC_HNUMBEROFOUTGOINGINVOCATIONSMETRIC = eINSTANCE
				.getHInvocationRelationCalculator__CalculateInvocValue__HNumberOfIncommingInvocationsMetric_HNumberOfOutgoingInvocationsMetric();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINVOCATION_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHInvocationRelationCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculatorImpl <em>HNumber Of Child Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHNumberOfChildCalculator()
		 * @generated
		 */
		EClass HNUMBER_OF_CHILD_CALCULATOR = eINSTANCE.getHNumberOfChildCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHNumberOfChildCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHNumberOfChildCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculatorImpl <em>HMember Number Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHMemberNumberCalculator()
		 * @generated
		 */
		EClass HMEMBER_NUMBER_CALCULATOR = eINSTANCE.getHMemberNumberCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMEMBER_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHMemberNumberCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMEMBER_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHMemberNumberCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculatorImpl <em>HLocal Access Relation Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalAccessRelationCalculator()
		 * @generated
		 */
		EClass HLOCAL_ACCESS_RELATION_CALCULATOR = eINSTANCE.getHLocalAccessRelationCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHLocalAccessRelationCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__HLOCALFIELDACCESSESMETRIC_HLOCALMETHODACCESSESMETRIC = eINSTANCE
				.getHLocalAccessRelationCalculator__CalculateValue__HLocalFieldAccessesMetric_HLocalMethodAccessesMetric();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHLocalAccessRelationCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculatorImpl <em>HMethod Number Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHMethodNumberCalculator()
		 * @generated
		 */
		EClass HMETHOD_NUMBER_CALCULATOR = eINSTANCE.getHMethodNumberCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETHOD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHMethodNumberCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETHOD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHMethodNumberCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculatorImpl <em>HGetter Setter Method Relation Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHGetterSetterMethodRelationCalculator()
		 * @generated
		 */
		EClass HGETTER_SETTER_METHOD_RELATION_CALCULATOR = eINSTANCE.getHGetterSetterMethodRelationCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHGetterSetterMethodRelationCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__HNUMBEROFSETTERSMETRIC_HNUMBEROFGETTERSMETRIC_HNUMBEROFMETHODSMETRIC = eINSTANCE
				.getHGetterSetterMethodRelationCalculator__CalculateValue__HNumberOfSettersMetric_HNumberOfGettersMetric_HNumberOfMethodsMetric();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHGetterSetterMethodRelationCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HAverageParamtersCalculatorImpl <em>HAverage Paramters Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HAverageParamtersCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAverageParamtersCalculator()
		 * @generated
		 */
		EClass HAVERAGE_PARAMTERS_CALCULATOR = eINSTANCE.getHAverageParamtersCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAVERAGE_PARAMTERS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHAverageParamtersCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAVERAGE_PARAMTERS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHAverageParamtersCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculatorImpl <em>HAverage Overloading In Class Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHAverageOverloadingInClassCalculator()
		 * @generated
		 */
		EClass HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR = eINSTANCE.getHAverageOverloadingInClassCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHAverageOverloadingInClassCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHAverageOverloadingInClassCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculatorImpl <em>HLocal Method Access Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalMethodAccessCalculator()
		 * @generated
		 */
		EClass HLOCAL_METHOD_ACCESS_CALCULATOR = eINSTANCE.getHLocalMethodAccessCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHLocalMethodAccessCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHLocalMethodAccessCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculatorImpl <em>HLocal Fields Access Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl#getHLocalFieldsAccessCalculator()
		 * @generated
		 */
		EClass HLOCAL_FIELDS_ACCESS_CALCULATOR = eINSTANCE.getHLocalFieldsAccessCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHLocalFieldsAccessCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHLocalFieldsAccessCalculator__CalculateValue__TClass();

	}

} //MetricsPackage
