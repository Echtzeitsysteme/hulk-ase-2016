/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory
 * @model kind="package"
 * @generated
 */
public interface SourcemeterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sourcemeter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.hulk/model/Hulk.ecore#//detection/metrics/sourcemeter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sourcemeter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourcemeterPackage eINSTANCE = org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HSourcemeterMetricCalculatorImpl <em>HSourcemeter Metric Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HSourcemeterMetricCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHSourcemeterMetricCalculator()
	 * @generated
	 */
	int HSOURCEMETER_METRIC_CALCULATOR = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR__INCOMING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR__GRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR__ORIGIN = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR__OUTGOING = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR__POST_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR__PRE_TRAVERSAL = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR__HULK = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR__HANNOTATION = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HSourcemeter Metric Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR_FEATURE_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR___GET_NEXT_ID = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR___CALCULATE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Which Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR___WHICH_METRIC = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Create Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR___CREATE_METRIC__DOUBLE = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 3;

	/**
	 * The number of operations of the '<em>HSourcemeter Metric Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT = DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT
			+ 4;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HLCOM5CalculatorImpl <em>HLCOM5 Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HLCOM5CalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHLCOM5Calculator()
	 * @generated
	 */
	int HLCOM5_CALCULATOR = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__INCOMING = HSOURCEMETER_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__GRAPH = HSOURCEMETER_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__ORIGIN = HSOURCEMETER_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__OUTGOING = HSOURCEMETER_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__POST_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__PRE_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__HULK = HSOURCEMETER_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR__HANNOTATION = HSOURCEMETER_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HLCOM5 Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR_FEATURE_COUNT = HSOURCEMETER_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___GET_NEXT_ID = HSOURCEMETER_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___CALCULATE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HSOURCEMETER_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___CALCULATE_METRIC__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___CALCULATE_VALUE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS;

	/**
	 * The operation id for the '<em>Which Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___WHICH_METRIC = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR___CREATE_METRIC__DOUBLE = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HLCOM5 Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLCOM5_CALCULATOR_OPERATION_COUNT = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HSettersCalculatorImpl <em>HSetters Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HSettersCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHSettersCalculator()
	 * @generated
	 */
	int HSETTERS_CALCULATOR = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR__INCOMING = HSOURCEMETER_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR__GRAPH = HSOURCEMETER_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR__ORIGIN = HSOURCEMETER_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR__OUTGOING = HSOURCEMETER_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR__POST_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR__PRE_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR__HULK = HSOURCEMETER_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR__HANNOTATION = HSOURCEMETER_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HSetters Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR_FEATURE_COUNT = HSOURCEMETER_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR___GET_NEXT_ID = HSOURCEMETER_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR___CALCULATE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HSOURCEMETER_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR___CALCULATE_METRIC__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR___CALCULATE_VALUE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS;

	/**
	 * The operation id for the '<em>Which Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR___WHICH_METRIC = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR___CREATE_METRIC__DOUBLE = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HSetters Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSETTERS_CALCULATOR_OPERATION_COUNT = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HIncommingInvocationsCalculatorImpl <em>HIncomming Invocations Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HIncommingInvocationsCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHIncommingInvocationsCalculator()
	 * @generated
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR__INCOMING = HSOURCEMETER_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR__GRAPH = HSOURCEMETER_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR__ORIGIN = HSOURCEMETER_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR__OUTGOING = HSOURCEMETER_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR__POST_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR__PRE_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR__HULK = HSOURCEMETER_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR__HANNOTATION = HSOURCEMETER_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HIncomming Invocations Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR_FEATURE_COUNT = HSOURCEMETER_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR___GET_NEXT_ID = HSOURCEMETER_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR___CALCULATE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HSOURCEMETER_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR___CALCULATE_METRIC__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR___CALCULATE_VALUE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS;

	/**
	 * The operation id for the '<em>Which Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR___WHICH_METRIC = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR___CREATE_METRIC__DOUBLE = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HIncomming Invocations Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINCOMMING_INVOCATIONS_CALCULATOR_OPERATION_COUNT = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HSoureMeterMetricTypeImpl <em>HSoure Meter Metric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HSoureMeterMetricTypeImpl
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHSoureMeterMetricType()
	 * @generated
	 */
	int HSOURE_METER_METRIC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURE_METER_METRIC_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>HSoure Meter Metric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURE_METER_METRIC_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>HSoure Meter Metric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSOURE_METER_METRIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HOutgoingInvocationsCalculatorImpl <em>HOutgoing Invocations Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HOutgoingInvocationsCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHOutgoingInvocationsCalculator()
	 * @generated
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR = 5;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR__INCOMING = HSOURCEMETER_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR__GRAPH = HSOURCEMETER_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR__ORIGIN = HSOURCEMETER_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR__OUTGOING = HSOURCEMETER_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR__POST_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR__PRE_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR__HULK = HSOURCEMETER_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR__HANNOTATION = HSOURCEMETER_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HOutgoing Invocations Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR_FEATURE_COUNT = HSOURCEMETER_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR___GET_NEXT_ID = HSOURCEMETER_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR___CALCULATE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HSOURCEMETER_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR___CALCULATE_METRIC__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR___CALCULATE_VALUE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS;

	/**
	 * The operation id for the '<em>Which Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR___WHICH_METRIC = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR___CREATE_METRIC__DOUBLE = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HOutgoing Invocations Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUTGOING_INVOCATIONS_CALCULATOR_OPERATION_COUNT = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HGettersCalculatorImpl <em>HGetters Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HGettersCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHGettersCalculator()
	 * @generated
	 */
	int HGETTERS_CALCULATOR = 6;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR__INCOMING = HSOURCEMETER_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR__GRAPH = HSOURCEMETER_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR__ORIGIN = HSOURCEMETER_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR__OUTGOING = HSOURCEMETER_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR__POST_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR__PRE_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR__HULK = HSOURCEMETER_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR__HANNOTATION = HSOURCEMETER_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HGetters Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR_FEATURE_COUNT = HSOURCEMETER_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR___GET_NEXT_ID = HSOURCEMETER_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR___CALCULATE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HSOURCEMETER_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR___CALCULATE_METRIC__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR___CALCULATE_VALUE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS;

	/**
	 * The operation id for the '<em>Which Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR___WHICH_METRIC = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR___CREATE_METRIC__DOUBLE = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HGetters Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTERS_CALCULATOR_OPERATION_COUNT = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HDepthOfInheritanceCalculatorImpl <em>HDepth Of Inheritance Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HDepthOfInheritanceCalculatorImpl
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHDepthOfInheritanceCalculator()
	 * @generated
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR = 7;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__INCOMING = HSOURCEMETER_METRIC_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__GRAPH = HSOURCEMETER_METRIC_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__ORIGIN = HSOURCEMETER_METRIC_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__OUTGOING = HSOURCEMETER_METRIC_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__POST_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__PRE_TRAVERSAL = HSOURCEMETER_METRIC_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__HULK = HSOURCEMETER_METRIC_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR__HANNOTATION = HSOURCEMETER_METRIC_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HDepth Of Inheritance Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR_FEATURE_COUNT = HSOURCEMETER_METRIC_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___GET_NEXT_ID = HSOURCEMETER_METRIC_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE__TCLASS;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HSOURCEMETER_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_METRIC__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_VALUE__TCLASS = HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS;

	/**
	 * The operation id for the '<em>Create Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___CREATE_METRIC__DOUBLE = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Which Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR___WHICH_METRIC = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HDepth Of Inheritance Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEPTH_OF_INHERITANCE_CALCULATOR_OPERATION_COUNT = HSOURCEMETER_METRIC_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes <em>HSource Meter Metric Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHSourceMeterMetricTypes()
	 * @generated
	 */
	int HSOURCE_METER_METRIC_TYPES = 8;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator <em>HLCOM5 Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLCOM5 Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator
	 * @generated
	 */
	EClass getHLCOM5Calculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator#whichMetric() <em>Which Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Which Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator#whichMetric()
	 * @generated
	 */
	EOperation getHLCOM5Calculator__WhichMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator#createMetric(double) <em>Create Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator#createMetric(double)
	 * @generated
	 */
	EOperation getHLCOM5Calculator__CreateMetric__double();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator <em>HSetters Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSetters Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator
	 * @generated
	 */
	EClass getHSettersCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator#whichMetric() <em>Which Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Which Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator#whichMetric()
	 * @generated
	 */
	EOperation getHSettersCalculator__WhichMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator#createMetric(double) <em>Create Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator#createMetric(double)
	 * @generated
	 */
	EOperation getHSettersCalculator__CreateMetric__double();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator <em>HIncomming Invocations Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIncomming Invocations Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator
	 * @generated
	 */
	EClass getHIncommingInvocationsCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator#whichMetric() <em>Which Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Which Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator#whichMetric()
	 * @generated
	 */
	EOperation getHIncommingInvocationsCalculator__WhichMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator#createMetric(double) <em>Create Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator#createMetric(double)
	 * @generated
	 */
	EOperation getHIncommingInvocationsCalculator__CreateMetric__double();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator <em>HSourcemeter Metric Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSourcemeter Metric Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator
	 * @generated
	 */
	EClass getHSourcemeterMetricCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHSourcemeterMetricCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator#whichMetric() <em>Which Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Which Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator#whichMetric()
	 * @generated
	 */
	EOperation getHSourcemeterMetricCalculator__WhichMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator#createMetric(double) <em>Create Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator#createMetric(double)
	 * @generated
	 */
	EOperation getHSourcemeterMetricCalculator__CreateMetric__double();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHSourcemeterMetricCalculator__CalculateValue__TClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType <em>HSoure Meter Metric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSoure Meter Metric Type</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType
	 * @generated
	 */
	EClass getHSoureMeterMetricType();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType#getType()
	 * @see #getHSoureMeterMetricType()
	 * @generated
	 */
	EAttribute getHSoureMeterMetricType_Type();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator <em>HOutgoing Invocations Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HOutgoing Invocations Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator
	 * @generated
	 */
	EClass getHOutgoingInvocationsCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator#whichMetric() <em>Which Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Which Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator#whichMetric()
	 * @generated
	 */
	EOperation getHOutgoingInvocationsCalculator__WhichMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator#createMetric(double) <em>Create Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator#createMetric(double)
	 * @generated
	 */
	EOperation getHOutgoingInvocationsCalculator__CreateMetric__double();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator <em>HGetters Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGetters Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator
	 * @generated
	 */
	EClass getHGettersCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator#whichMetric() <em>Which Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Which Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator#whichMetric()
	 * @generated
	 */
	EOperation getHGettersCalculator__WhichMetric();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator#createMetric(double) <em>Create Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator#createMetric(double)
	 * @generated
	 */
	EOperation getHGettersCalculator__CreateMetric__double();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator <em>HDepth Of Inheritance Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDepth Of Inheritance Calculator</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator
	 * @generated
	 */
	EClass getHDepthOfInheritanceCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator#createMetric(double) <em>Create Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator#createMetric(double)
	 * @generated
	 */
	EOperation getHDepthOfInheritanceCalculator__CreateMetric__double();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator#whichMetric() <em>Which Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Which Metric</em>' operation.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator#whichMetric()
	 * @generated
	 */
	EOperation getHDepthOfInheritanceCalculator__WhichMetric();

	/**
	 * Returns the meta object for enum '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes <em>HSource Meter Metric Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HSource Meter Metric Types</em>'.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes
	 * @generated
	 */
	EEnum getHSourceMeterMetricTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SourcemeterFactory getSourcemeterFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HLCOM5CalculatorImpl <em>HLCOM5 Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HLCOM5CalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHLCOM5Calculator()
		 * @generated
		 */
		EClass HLCOM5_CALCULATOR = eINSTANCE.getHLCOM5Calculator();

		/**
		 * The meta object literal for the '<em><b>Which Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLCOM5_CALCULATOR___WHICH_METRIC = eINSTANCE.getHLCOM5Calculator__WhichMetric();

		/**
		 * The meta object literal for the '<em><b>Create Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HLCOM5_CALCULATOR___CREATE_METRIC__DOUBLE = eINSTANCE.getHLCOM5Calculator__CreateMetric__double();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HSettersCalculatorImpl <em>HSetters Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HSettersCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHSettersCalculator()
		 * @generated
		 */
		EClass HSETTERS_CALCULATOR = eINSTANCE.getHSettersCalculator();

		/**
		 * The meta object literal for the '<em><b>Which Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSETTERS_CALCULATOR___WHICH_METRIC = eINSTANCE.getHSettersCalculator__WhichMetric();

		/**
		 * The meta object literal for the '<em><b>Create Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSETTERS_CALCULATOR___CREATE_METRIC__DOUBLE = eINSTANCE
				.getHSettersCalculator__CreateMetric__double();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HIncommingInvocationsCalculatorImpl <em>HIncomming Invocations Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HIncommingInvocationsCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHIncommingInvocationsCalculator()
		 * @generated
		 */
		EClass HINCOMMING_INVOCATIONS_CALCULATOR = eINSTANCE.getHIncommingInvocationsCalculator();

		/**
		 * The meta object literal for the '<em><b>Which Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINCOMMING_INVOCATIONS_CALCULATOR___WHICH_METRIC = eINSTANCE
				.getHIncommingInvocationsCalculator__WhichMetric();

		/**
		 * The meta object literal for the '<em><b>Create Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HINCOMMING_INVOCATIONS_CALCULATOR___CREATE_METRIC__DOUBLE = eINSTANCE
				.getHIncommingInvocationsCalculator__CreateMetric__double();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HSourcemeterMetricCalculatorImpl <em>HSourcemeter Metric Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HSourcemeterMetricCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHSourcemeterMetricCalculator()
		 * @generated
		 */
		EClass HSOURCEMETER_METRIC_CALCULATOR = eINSTANCE.getHSourcemeterMetricCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHSourcemeterMetricCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Which Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSOURCEMETER_METRIC_CALCULATOR___WHICH_METRIC = eINSTANCE
				.getHSourcemeterMetricCalculator__WhichMetric();

		/**
		 * The meta object literal for the '<em><b>Create Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSOURCEMETER_METRIC_CALCULATOR___CREATE_METRIC__DOUBLE = eINSTANCE
				.getHSourcemeterMetricCalculator__CreateMetric__double();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHSourcemeterMetricCalculator__CalculateValue__TClass();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HSoureMeterMetricTypeImpl <em>HSoure Meter Metric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HSoureMeterMetricTypeImpl
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHSoureMeterMetricType()
		 * @generated
		 */
		EClass HSOURE_METER_METRIC_TYPE = eINSTANCE.getHSoureMeterMetricType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HSOURE_METER_METRIC_TYPE__TYPE = eINSTANCE.getHSoureMeterMetricType_Type();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HOutgoingInvocationsCalculatorImpl <em>HOutgoing Invocations Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HOutgoingInvocationsCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHOutgoingInvocationsCalculator()
		 * @generated
		 */
		EClass HOUTGOING_INVOCATIONS_CALCULATOR = eINSTANCE.getHOutgoingInvocationsCalculator();

		/**
		 * The meta object literal for the '<em><b>Which Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOUTGOING_INVOCATIONS_CALCULATOR___WHICH_METRIC = eINSTANCE
				.getHOutgoingInvocationsCalculator__WhichMetric();

		/**
		 * The meta object literal for the '<em><b>Create Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOUTGOING_INVOCATIONS_CALCULATOR___CREATE_METRIC__DOUBLE = eINSTANCE
				.getHOutgoingInvocationsCalculator__CreateMetric__double();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HGettersCalculatorImpl <em>HGetters Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HGettersCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHGettersCalculator()
		 * @generated
		 */
		EClass HGETTERS_CALCULATOR = eINSTANCE.getHGettersCalculator();

		/**
		 * The meta object literal for the '<em><b>Which Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTERS_CALCULATOR___WHICH_METRIC = eINSTANCE.getHGettersCalculator__WhichMetric();

		/**
		 * The meta object literal for the '<em><b>Create Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HGETTERS_CALCULATOR___CREATE_METRIC__DOUBLE = eINSTANCE
				.getHGettersCalculator__CreateMetric__double();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.impl.HDepthOfInheritanceCalculatorImpl <em>HDepth Of Inheritance Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.HDepthOfInheritanceCalculatorImpl
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHDepthOfInheritanceCalculator()
		 * @generated
		 */
		EClass HDEPTH_OF_INHERITANCE_CALCULATOR = eINSTANCE.getHDepthOfInheritanceCalculator();

		/**
		 * The meta object literal for the '<em><b>Create Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDEPTH_OF_INHERITANCE_CALCULATOR___CREATE_METRIC__DOUBLE = eINSTANCE
				.getHDepthOfInheritanceCalculator__CreateMetric__double();

		/**
		 * The meta object literal for the '<em><b>Which Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDEPTH_OF_INHERITANCE_CALCULATOR___WHICH_METRIC = eINSTANCE
				.getHDepthOfInheritanceCalculator__WhichMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes <em>HSource Meter Metric Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes
		 * @see org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl#getHSourceMeterMetricTypes()
		 * @generated
		 */
		EEnum HSOURCE_METER_METRIC_TYPES = eINSTANCE.getHSourceMeterMetricTypes();

	}

} //SourcemeterPackage
