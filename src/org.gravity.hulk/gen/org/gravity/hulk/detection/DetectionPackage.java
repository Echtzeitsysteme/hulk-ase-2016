/**
 */
package org.gravity.hulk.detection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.gravity.hulk.HulkPackage;

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
 * @see org.gravity.hulk.detection.DetectionFactory
 * @model kind="package"
 * @generated
 */
public interface DetectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "detection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.hulk/model/Hulk.ecore#//detection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "detection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DetectionPackage eINSTANCE = org.gravity.hulk.detection.impl.DetectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl <em>HCode Smell Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl
	 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHCodeSmellDetector()
	 * @generated
	 */
	int HCODE_SMELL_DETECTOR = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR__INCOMING = HulkPackage.HDETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR__GRAPH = HulkPackage.HDETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR__ORIGIN = HulkPackage.HDETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR__OUTGOING = HulkPackage.HDETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR__POST_TRAVERSAL = HulkPackage.HDETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR__PRE_TRAVERSAL = HulkPackage.HDETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR__HULK = HulkPackage.HDETECTOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR__HANNOTATION = HulkPackage.HDETECTOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HCode Smell Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR_FEATURE_COUNT = HulkPackage.HDETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR___DETECT__HANTIPATTERNGRAPH = HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR___GET_NEXT_ID = HulkPackage.HDETECTOR___GET_NEXT_ID;

	/**
	 * The number of operations of the '<em>HCode Smell Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCODE_SMELL_DETECTOR_OPERATION_COUNT = HulkPackage.HDETECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.impl.HMetricCalculatorImpl <em>HMetric Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.impl.HMetricCalculatorImpl
	 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHMetricCalculator()
	 * @generated
	 */
	int HMETRIC_CALCULATOR = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR__INCOMING = HulkPackage.HDETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR__GRAPH = HulkPackage.HDETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR__ORIGIN = HulkPackage.HDETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR__OUTGOING = HulkPackage.HDETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR__POST_TRAVERSAL = HulkPackage.HDETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR__PRE_TRAVERSAL = HulkPackage.HDETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR__HULK = HulkPackage.HDETECTOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR__HANNOTATION = HulkPackage.HDETECTOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HMetric Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR_FEATURE_COUNT = HulkPackage.HDETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR___GET_NEXT_ID = HulkPackage.HDETECTOR___GET_NEXT_ID;

	/**
	 * The number of operations of the '<em>HMetric Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETRIC_CALCULATOR_OPERATION_COUNT = HulkPackage.HDETECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl <em>HAnti Pattern Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl
	 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHAntiPatternDetector()
	 * @generated
	 */
	int HANTI_PATTERN_DETECTOR = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR__INCOMING = HulkPackage.HDETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR__GRAPH = HulkPackage.HDETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR__ORIGIN = HulkPackage.HDETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR__OUTGOING = HulkPackage.HDETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR__POST_TRAVERSAL = HulkPackage.HDETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR__PRE_TRAVERSAL = HulkPackage.HDETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR__HULK = HulkPackage.HDETECTOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR__HANNOTATION = HulkPackage.HDETECTOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HAnti Pattern Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR_FEATURE_COUNT = HulkPackage.HDETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR___DETECT__HANTIPATTERNGRAPH = HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR___GET_NEXT_ID = HulkPackage.HDETECTOR___GET_NEXT_ID;

	/**
	 * The number of operations of the '<em>HAnti Pattern Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTOR_OPERATION_COUNT = HulkPackage.HDETECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl <em>HClass Based Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl
	 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHClassBasedCalculator()
	 * @generated
	 */
	int HCLASS_BASED_CALCULATOR = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR__INCOMING = HulkPackage.HDETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR__GRAPH = HulkPackage.HDETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR__ORIGIN = HulkPackage.HDETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR__OUTGOING = HulkPackage.HDETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR__POST_TRAVERSAL = HulkPackage.HDETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR__PRE_TRAVERSAL = HulkPackage.HDETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR__HULK = HulkPackage.HDETECTOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR__HANNOTATION = HulkPackage.HDETECTOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HClass Based Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR_FEATURE_COUNT = HulkPackage.HDETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR___GET_NEXT_ID = HulkPackage.HDETECTOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS = HulkPackage.HDETECTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HulkPackage.HDETECTOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HClass Based Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_CALCULATOR_OPERATION_COUNT = HulkPackage.HDETECTOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl <em>HClass Based Metric Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl
	 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHClassBasedMetricCalculator()
	 * @generated
	 */
	int HCLASS_BASED_METRIC_CALCULATOR = 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR__INCOMING = HCLASS_BASED_CALCULATOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR__GRAPH = HCLASS_BASED_CALCULATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR__ORIGIN = HCLASS_BASED_CALCULATOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR__OUTGOING = HCLASS_BASED_CALCULATOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR__POST_TRAVERSAL = HCLASS_BASED_CALCULATOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR__PRE_TRAVERSAL = HCLASS_BASED_CALCULATOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR__HULK = HCLASS_BASED_CALCULATOR__HULK;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR__HANNOTATION = HCLASS_BASED_CALCULATOR__HANNOTATION;

	/**
	 * The number of structural features of the '<em>HClass Based Metric Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR_FEATURE_COUNT = HCLASS_BASED_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR___GET_NEXT_ID = HCLASS_BASED_CALCULATOR___GET_NEXT_ID;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS = HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS = HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH = HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS = HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>HClass Based Metric Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_BASED_METRIC_CALCULATOR_OPERATION_COUNT = HCLASS_BASED_CALCULATOR_OPERATION_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.HCodeSmellDetector <em>HCode Smell Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HCode Smell Detector</em>'.
	 * @see org.gravity.hulk.detection.HCodeSmellDetector
	 * @generated
	 */
	EClass getHCodeSmellDetector();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.HMetricCalculator <em>HMetric Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMetric Calculator</em>'.
	 * @see org.gravity.hulk.detection.HMetricCalculator
	 * @generated
	 */
	EClass getHMetricCalculator();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.HAntiPatternDetector <em>HAnti Pattern Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnti Pattern Detector</em>'.
	 * @see org.gravity.hulk.detection.HAntiPatternDetector
	 * @generated
	 */
	EClass getHAntiPatternDetector();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.HClassBasedCalculator <em>HClass Based Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HClass Based Calculator</em>'.
	 * @see org.gravity.hulk.detection.HClassBasedCalculator
	 * @generated
	 */
	EClass getHClassBasedCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.HClassBasedCalculator#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.HClassBasedCalculator#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHClassBasedCalculator__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.HClassBasedCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.detection.HClassBasedCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHClassBasedCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.detection.HClassBasedMetricCalculator <em>HClass Based Metric Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HClass Based Metric Calculator</em>'.
	 * @see org.gravity.hulk.detection.HClassBasedMetricCalculator
	 * @generated
	 */
	EClass getHClassBasedMetricCalculator();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.HClassBasedMetricCalculator#calculate(org.gravity.typegraph.basic.TClass) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see org.gravity.hulk.detection.HClassBasedMetricCalculator#calculate(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHClassBasedMetricCalculator__Calculate__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.HClassBasedMetricCalculator#calculateMetric(org.gravity.typegraph.basic.TClass) <em>Calculate Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Metric</em>' operation.
	 * @see org.gravity.hulk.detection.HClassBasedMetricCalculator#calculateMetric(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHClassBasedMetricCalculator__CalculateMetric__TClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.HClassBasedMetricCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.detection.HClassBasedMetricCalculator#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHClassBasedMetricCalculator__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.detection.HClassBasedMetricCalculator#calculateValue(org.gravity.typegraph.basic.TClass) <em>Calculate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Value</em>' operation.
	 * @see org.gravity.hulk.detection.HClassBasedMetricCalculator#calculateValue(org.gravity.typegraph.basic.TClass)
	 * @generated
	 */
	EOperation getHClassBasedMetricCalculator__CalculateValue__TClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DetectionFactory getDetectionFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl <em>HCode Smell Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl
		 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHCodeSmellDetector()
		 * @generated
		 */
		EClass HCODE_SMELL_DETECTOR = eINSTANCE.getHCodeSmellDetector();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.impl.HMetricCalculatorImpl <em>HMetric Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.impl.HMetricCalculatorImpl
		 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHMetricCalculator()
		 * @generated
		 */
		EClass HMETRIC_CALCULATOR = eINSTANCE.getHMetricCalculator();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl <em>HAnti Pattern Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl
		 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHAntiPatternDetector()
		 * @generated
		 */
		EClass HANTI_PATTERN_DETECTOR = eINSTANCE.getHAntiPatternDetector();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl <em>HClass Based Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl
		 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHClassBasedCalculator()
		 * @generated
		 */
		EClass HCLASS_BASED_CALCULATOR = eINSTANCE.getHClassBasedCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS = eINSTANCE
				.getHClassBasedCalculator__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHClassBasedCalculator__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl <em>HClass Based Metric Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl
		 * @see org.gravity.hulk.detection.impl.DetectionPackageImpl#getHClassBasedMetricCalculator()
		 * @generated
		 */
		EClass HCLASS_BASED_METRIC_CALCULATOR = eINSTANCE.getHClassBasedMetricCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS = eINSTANCE
				.getHClassBasedMetricCalculator__Calculate__TClass();

		/**
		 * The meta object literal for the '<em><b>Calculate Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLASS_BASED_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS = eINSTANCE
				.getHClassBasedMetricCalculator__CalculateMetric__TClass();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLASS_BASED_METRIC_CALCULATOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE
				.getHClassBasedMetricCalculator__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '<em><b>Calculate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HCLASS_BASED_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS = eINSTANCE
				.getHClassBasedMetricCalculator__CalculateValue__TClass();

	}

} //DetectionPackage
