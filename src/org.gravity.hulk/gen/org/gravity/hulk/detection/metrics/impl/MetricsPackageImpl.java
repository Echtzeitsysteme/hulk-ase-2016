/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.detection.DetectionPackage;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;

import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;

import org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.detection.impl.DetectionPackageImpl;

import org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.HAverageParamtersCalculator;
import org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator;
import org.gravity.hulk.detection.metrics.HInvocationRelationCalculator;
import org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator;
import org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator;
import org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator;
import org.gravity.hulk.detection.metrics.HMemberNumberCalculator;
import org.gravity.hulk.detection.metrics.HMethodNumberCalculator;
import org.gravity.hulk.detection.metrics.HNumberOfChildCalculator;
import org.gravity.hulk.detection.metrics.MetricsFactory;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;

import org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl;

import org.gravity.hulk.impl.HulkPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.core.dfs.DfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsPackageImpl extends EPackageImpl implements MetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hInvocationRelationCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfChildCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMemberNumberCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalAccessRelationCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMethodNumberCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGetterSetterMethodRelationCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAverageParamtersCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAverageOverloadingInClassCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalMethodAccessCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalFieldsAccessCalculatorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gravity.hulk.detection.metrics.MetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricsPackageImpl() {
		super(eNS_URI, MetricsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricsPackage init() {
		if (isInited)
			return (MetricsPackage) EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Obtain or create and register package
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new MetricsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DfsPackage.eINSTANCE.eClass();
		AntipatterngraphPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		HulkPackageImpl theHulkPackage = (HulkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(HulkPackage.eNS_URI) instanceof HulkPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(HulkPackage.eNS_URI) : HulkPackage.eINSTANCE);
		DetectionPackageImpl theDetectionPackage = (DetectionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DetectionPackage.eNS_URI) instanceof DetectionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(DetectionPackage.eNS_URI)
						: DetectionPackage.eINSTANCE);
		AntipatternPackageImpl theAntipatternPackage = (AntipatternPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(AntipatternPackage.eNS_URI) instanceof AntipatternPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI)
						: AntipatternPackage.eINSTANCE);
		CodesmellsPackageImpl theCodesmellsPackage = (CodesmellsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CodesmellsPackage.eNS_URI) instanceof CodesmellsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI)
						: CodesmellsPackage.eINSTANCE);
		SourcemeterPackageImpl theSourcemeterPackage = (SourcemeterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SourcemeterPackage.eNS_URI) instanceof SourcemeterPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(SourcemeterPackage.eNS_URI)
						: SourcemeterPackage.eINSTANCE);

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theSourcemeterPackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theSourcemeterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetricsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricsPackage.eNS_URI, theMetricsPackage);
		return theMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHInvocationRelationCalculator() {
		return hInvocationRelationCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHInvocationRelationCalculator__CalculateMetric__TClass() {
		return hInvocationRelationCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHInvocationRelationCalculator__CalculateInvocValue__HNumberOfIncommingInvocationsMetric_HNumberOfOutgoingInvocationsMetric() {
		return hInvocationRelationCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHInvocationRelationCalculator__CalculateValue__TClass() {
		return hInvocationRelationCalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfChildCalculator() {
		return hNumberOfChildCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHNumberOfChildCalculator__CalculateMetric__TClass() {
		return hNumberOfChildCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHNumberOfChildCalculator__CalculateValue__TClass() {
		return hNumberOfChildCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMemberNumberCalculator() {
		return hMemberNumberCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMemberNumberCalculator__CalculateMetric__TClass() {
		return hMemberNumberCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMemberNumberCalculator__CalculateValue__TClass() {
		return hMemberNumberCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalAccessRelationCalculator() {
		return hLocalAccessRelationCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalAccessRelationCalculator__CalculateMetric__TClass() {
		return hLocalAccessRelationCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalAccessRelationCalculator__CalculateValue__HLocalFieldAccessesMetric_HLocalMethodAccessesMetric() {
		return hLocalAccessRelationCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalAccessRelationCalculator__CalculateValue__TClass() {
		return hLocalAccessRelationCalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMethodNumberCalculator() {
		return hMethodNumberCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMethodNumberCalculator__CalculateMetric__TClass() {
		return hMethodNumberCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMethodNumberCalculator__CalculateValue__TClass() {
		return hMethodNumberCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHGetterSetterMethodRelationCalculator() {
		return hGetterSetterMethodRelationCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterSetterMethodRelationCalculator__CalculateMetric__TClass() {
		return hGetterSetterMethodRelationCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterSetterMethodRelationCalculator__CalculateValue__HNumberOfSettersMetric_HNumberOfGettersMetric_HNumberOfMethodsMetric() {
		return hGetterSetterMethodRelationCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterSetterMethodRelationCalculator__CalculateValue__TClass() {
		return hGetterSetterMethodRelationCalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAverageParamtersCalculator() {
		return hAverageParamtersCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAverageParamtersCalculator__CalculateMetric__TClass() {
		return hAverageParamtersCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAverageParamtersCalculator__CalculateValue__TClass() {
		return hAverageParamtersCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAverageOverloadingInClassCalculator() {
		return hAverageOverloadingInClassCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAverageOverloadingInClassCalculator__CalculateMetric__TClass() {
		return hAverageOverloadingInClassCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAverageOverloadingInClassCalculator__CalculateValue__TClass() {
		return hAverageOverloadingInClassCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalMethodAccessCalculator() {
		return hLocalMethodAccessCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalMethodAccessCalculator__CalculateMetric__TClass() {
		return hLocalMethodAccessCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalMethodAccessCalculator__CalculateValue__TClass() {
		return hLocalMethodAccessCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalFieldsAccessCalculator() {
		return hLocalFieldsAccessCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalFieldsAccessCalculator__CalculateMetric__TClass() {
		return hLocalFieldsAccessCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalFieldsAccessCalculator__CalculateValue__TClass() {
		return hLocalFieldsAccessCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactory getMetricsFactory() {
		return (MetricsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		hInvocationRelationCalculatorEClass = createEClass(HINVOCATION_RELATION_CALCULATOR);
		createEOperation(hInvocationRelationCalculatorEClass,
				HINVOCATION_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hInvocationRelationCalculatorEClass,
				HINVOCATION_RELATION_CALCULATOR___CALCULATE_INVOC_VALUE__HNUMBEROFINCOMMINGINVOCATIONSMETRIC_HNUMBEROFOUTGOINGINVOCATIONSMETRIC);
		createEOperation(hInvocationRelationCalculatorEClass,
				HINVOCATION_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hNumberOfChildCalculatorEClass = createEClass(HNUMBER_OF_CHILD_CALCULATOR);
		createEOperation(hNumberOfChildCalculatorEClass, HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hNumberOfChildCalculatorEClass, HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hMemberNumberCalculatorEClass = createEClass(HMEMBER_NUMBER_CALCULATOR);
		createEOperation(hMemberNumberCalculatorEClass, HMEMBER_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hMemberNumberCalculatorEClass, HMEMBER_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hLocalAccessRelationCalculatorEClass = createEClass(HLOCAL_ACCESS_RELATION_CALCULATOR);
		createEOperation(hLocalAccessRelationCalculatorEClass,
				HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hLocalAccessRelationCalculatorEClass,
				HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__HLOCALFIELDACCESSESMETRIC_HLOCALMETHODACCESSESMETRIC);
		createEOperation(hLocalAccessRelationCalculatorEClass,
				HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hMethodNumberCalculatorEClass = createEClass(HMETHOD_NUMBER_CALCULATOR);
		createEOperation(hMethodNumberCalculatorEClass, HMETHOD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hMethodNumberCalculatorEClass, HMETHOD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hGetterSetterMethodRelationCalculatorEClass = createEClass(HGETTER_SETTER_METHOD_RELATION_CALCULATOR);
		createEOperation(hGetterSetterMethodRelationCalculatorEClass,
				HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hGetterSetterMethodRelationCalculatorEClass,
				HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__HNUMBEROFSETTERSMETRIC_HNUMBEROFGETTERSMETRIC_HNUMBEROFMETHODSMETRIC);
		createEOperation(hGetterSetterMethodRelationCalculatorEClass,
				HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hAverageParamtersCalculatorEClass = createEClass(HAVERAGE_PARAMTERS_CALCULATOR);
		createEOperation(hAverageParamtersCalculatorEClass, HAVERAGE_PARAMTERS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hAverageParamtersCalculatorEClass, HAVERAGE_PARAMTERS_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hAverageOverloadingInClassCalculatorEClass = createEClass(HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR);
		createEOperation(hAverageOverloadingInClassCalculatorEClass,
				HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hAverageOverloadingInClassCalculatorEClass,
				HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hLocalMethodAccessCalculatorEClass = createEClass(HLOCAL_METHOD_ACCESS_CALCULATOR);
		createEOperation(hLocalMethodAccessCalculatorEClass,
				HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hLocalMethodAccessCalculatorEClass, HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hLocalFieldsAccessCalculatorEClass = createEClass(HLOCAL_FIELDS_ACCESS_CALCULATOR);
		createEOperation(hLocalFieldsAccessCalculatorEClass,
				HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hLocalFieldsAccessCalculatorEClass, HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SourcemeterPackage theSourcemeterPackage = (SourcemeterPackage) EPackage.Registry.INSTANCE
				.getEPackage(SourcemeterPackage.eNS_URI);
		DetectionPackage theDetectionPackage = (DetectionPackage) EPackage.Registry.INSTANCE
				.getEPackage(DetectionPackage.eNS_URI);
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		org.gravity.hulk.antipatterngraph.metrics.MetricsPackage theMetricsPackage_1 = (org.gravity.hulk.antipatterngraph.metrics.MetricsPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSourcemeterPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hInvocationRelationCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hNumberOfChildCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hMemberNumberCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hLocalAccessRelationCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hMethodNumberCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hGetterSetterMethodRelationCalculatorEClass.getESuperTypes()
				.add(theDetectionPackage.getHClassBasedMetricCalculator());
		hAverageParamtersCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hAverageOverloadingInClassCalculatorEClass.getESuperTypes()
				.add(theDetectionPackage.getHClassBasedMetricCalculator());
		hLocalMethodAccessCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hLocalFieldsAccessCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());

		// Initialize classes, features, and operations; add parameters
		initEClass(hInvocationRelationCalculatorEClass, HInvocationRelationCalculator.class,
				"HInvocationRelationCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHInvocationRelationCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getHInvocationRelationCalculator__CalculateInvocValue__HNumberOfIncommingInvocationsMetric_HNumberOfOutgoingInvocationsMetric(),
				ecorePackage.getEDouble(), "calculateInvocValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHNumberOfIncommingInvocationsMetric(), "nii", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHNumberOfOutgoingInvocationsMetric(), "noi", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getHInvocationRelationCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hNumberOfChildCalculatorEClass, HNumberOfChildCalculator.class, "HNumberOfChildCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHNumberOfChildCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHNumberOfChildCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hMemberNumberCalculatorEClass, HMemberNumberCalculator.class, "HMemberNumberCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHMemberNumberCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHMemberNumberCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLocalAccessRelationCalculatorEClass, HLocalAccessRelationCalculator.class,
				"HLocalAccessRelationCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLocalAccessRelationCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getHLocalAccessRelationCalculator__CalculateValue__HLocalFieldAccessesMetric_HLocalMethodAccessesMetric(),
				ecorePackage.getEDouble(), "calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHLocalFieldAccessesMetric(), "fa", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHLocalMethodAccessesMetric(), "ma", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLocalAccessRelationCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hMethodNumberCalculatorEClass, HMethodNumberCalculator.class, "HMethodNumberCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHMethodNumberCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHMethodNumberCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hGetterSetterMethodRelationCalculatorEClass, HGetterSetterMethodRelationCalculator.class,
				"HGetterSetterMethodRelationCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHGetterSetterMethodRelationCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getHGetterSetterMethodRelationCalculator__CalculateValue__HNumberOfSettersMetric_HNumberOfGettersMetric_HNumberOfMethodsMetric(),
				ecorePackage.getEDouble(), "calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHNumberOfSettersMetric(), "setter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHNumberOfGettersMetric(), "getter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHNumberOfMethodsMetric(), "methods", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHGetterSetterMethodRelationCalculator__CalculateValue__TClass(),
				ecorePackage.getEDouble(), "calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hAverageParamtersCalculatorEClass, HAverageParamtersCalculator.class, "HAverageParamtersCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHAverageParamtersCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAverageParamtersCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hAverageOverloadingInClassCalculatorEClass, HAverageOverloadingInClassCalculator.class,
				"HAverageOverloadingInClassCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHAverageOverloadingInClassCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAverageOverloadingInClassCalculator__CalculateValue__TClass(),
				ecorePackage.getEDouble(), "calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLocalMethodAccessCalculatorEClass, HLocalMethodAccessCalculator.class,
				"HLocalMethodAccessCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLocalMethodAccessCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLocalMethodAccessCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLocalFieldsAccessCalculatorEClass, HLocalFieldsAccessCalculator.class,
				"HLocalFieldsAccessCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLocalFieldsAccessCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLocalFieldsAccessCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //MetricsPackageImpl
