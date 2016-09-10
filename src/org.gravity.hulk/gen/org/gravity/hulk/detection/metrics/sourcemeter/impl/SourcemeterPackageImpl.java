/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl;

import org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;

import org.gravity.hulk.impl.HulkPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.core.dfs.DfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourcemeterPackageImpl extends EPackageImpl implements SourcemeterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlcom5CalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSettersCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hIncommingInvocationsCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSourcemeterMetricCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSoureMeterMetricTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hOutgoingInvocationsCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGettersCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDepthOfInheritanceCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hSourceMeterMetricTypesEEnum = null;

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
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SourcemeterPackageImpl() {
		super(eNS_URI, SourcemeterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SourcemeterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SourcemeterPackage init() {
		if (isInited)
			return (SourcemeterPackage) EPackage.Registry.INSTANCE.getEPackage(SourcemeterPackage.eNS_URI);

		// Obtain or create and register package
		SourcemeterPackageImpl theSourcemeterPackage = (SourcemeterPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SourcemeterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SourcemeterPackageImpl());

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
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);

		// Create package meta-data objects
		theSourcemeterPackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theSourcemeterPackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSourcemeterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SourcemeterPackage.eNS_URI, theSourcemeterPackage);
		return theSourcemeterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLCOM5Calculator() {
		return hlcom5CalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLCOM5Calculator__WhichMetric() {
		return hlcom5CalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLCOM5Calculator__CreateMetric__double() {
		return hlcom5CalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSettersCalculator() {
		return hSettersCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSettersCalculator__WhichMetric() {
		return hSettersCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSettersCalculator__CreateMetric__double() {
		return hSettersCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHIncommingInvocationsCalculator() {
		return hIncommingInvocationsCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHIncommingInvocationsCalculator__WhichMetric() {
		return hIncommingInvocationsCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHIncommingInvocationsCalculator__CreateMetric__double() {
		return hIncommingInvocationsCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSourcemeterMetricCalculator() {
		return hSourcemeterMetricCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSourcemeterMetricCalculator__CalculateMetric__TClass() {
		return hSourcemeterMetricCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSourcemeterMetricCalculator__WhichMetric() {
		return hSourcemeterMetricCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSourcemeterMetricCalculator__CreateMetric__double() {
		return hSourcemeterMetricCalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSourcemeterMetricCalculator__CalculateValue__TClass() {
		return hSourcemeterMetricCalculatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSoureMeterMetricType() {
		return hSoureMeterMetricTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHSoureMeterMetricType_Type() {
		return (EAttribute) hSoureMeterMetricTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHOutgoingInvocationsCalculator() {
		return hOutgoingInvocationsCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHOutgoingInvocationsCalculator__WhichMetric() {
		return hOutgoingInvocationsCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHOutgoingInvocationsCalculator__CreateMetric__double() {
		return hOutgoingInvocationsCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHGettersCalculator() {
		return hGettersCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGettersCalculator__WhichMetric() {
		return hGettersCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGettersCalculator__CreateMetric__double() {
		return hGettersCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDepthOfInheritanceCalculator() {
		return hDepthOfInheritanceCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDepthOfInheritanceCalculator__CreateMetric__double() {
		return hDepthOfInheritanceCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDepthOfInheritanceCalculator__WhichMetric() {
		return hDepthOfInheritanceCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHSourceMeterMetricTypes() {
		return hSourceMeterMetricTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcemeterFactory getSourcemeterFactory() {
		return (SourcemeterFactory) getEFactoryInstance();
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
		hlcom5CalculatorEClass = createEClass(HLCOM5_CALCULATOR);
		createEOperation(hlcom5CalculatorEClass, HLCOM5_CALCULATOR___WHICH_METRIC);
		createEOperation(hlcom5CalculatorEClass, HLCOM5_CALCULATOR___CREATE_METRIC__DOUBLE);

		hSettersCalculatorEClass = createEClass(HSETTERS_CALCULATOR);
		createEOperation(hSettersCalculatorEClass, HSETTERS_CALCULATOR___WHICH_METRIC);
		createEOperation(hSettersCalculatorEClass, HSETTERS_CALCULATOR___CREATE_METRIC__DOUBLE);

		hIncommingInvocationsCalculatorEClass = createEClass(HINCOMMING_INVOCATIONS_CALCULATOR);
		createEOperation(hIncommingInvocationsCalculatorEClass, HINCOMMING_INVOCATIONS_CALCULATOR___WHICH_METRIC);
		createEOperation(hIncommingInvocationsCalculatorEClass,
				HINCOMMING_INVOCATIONS_CALCULATOR___CREATE_METRIC__DOUBLE);

		hSourcemeterMetricCalculatorEClass = createEClass(HSOURCEMETER_METRIC_CALCULATOR);
		createEOperation(hSourcemeterMetricCalculatorEClass, HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hSourcemeterMetricCalculatorEClass, HSOURCEMETER_METRIC_CALCULATOR___WHICH_METRIC);
		createEOperation(hSourcemeterMetricCalculatorEClass, HSOURCEMETER_METRIC_CALCULATOR___CREATE_METRIC__DOUBLE);
		createEOperation(hSourcemeterMetricCalculatorEClass, HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hSoureMeterMetricTypeEClass = createEClass(HSOURE_METER_METRIC_TYPE);
		createEAttribute(hSoureMeterMetricTypeEClass, HSOURE_METER_METRIC_TYPE__TYPE);

		hOutgoingInvocationsCalculatorEClass = createEClass(HOUTGOING_INVOCATIONS_CALCULATOR);
		createEOperation(hOutgoingInvocationsCalculatorEClass, HOUTGOING_INVOCATIONS_CALCULATOR___WHICH_METRIC);
		createEOperation(hOutgoingInvocationsCalculatorEClass,
				HOUTGOING_INVOCATIONS_CALCULATOR___CREATE_METRIC__DOUBLE);

		hGettersCalculatorEClass = createEClass(HGETTERS_CALCULATOR);
		createEOperation(hGettersCalculatorEClass, HGETTERS_CALCULATOR___WHICH_METRIC);
		createEOperation(hGettersCalculatorEClass, HGETTERS_CALCULATOR___CREATE_METRIC__DOUBLE);

		hDepthOfInheritanceCalculatorEClass = createEClass(HDEPTH_OF_INHERITANCE_CALCULATOR);
		createEOperation(hDepthOfInheritanceCalculatorEClass, HDEPTH_OF_INHERITANCE_CALCULATOR___CREATE_METRIC__DOUBLE);
		createEOperation(hDepthOfInheritanceCalculatorEClass, HDEPTH_OF_INHERITANCE_CALCULATOR___WHICH_METRIC);

		// Create enums
		hSourceMeterMetricTypesEEnum = createEEnum(HSOURCE_METER_METRIC_TYPES);
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
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		DetectionPackage theDetectionPackage = (DetectionPackage) EPackage.Registry.INSTANCE
				.getEPackage(DetectionPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hlcom5CalculatorEClass.getESuperTypes().add(this.getHSourcemeterMetricCalculator());
		hSettersCalculatorEClass.getESuperTypes().add(this.getHSourcemeterMetricCalculator());
		hIncommingInvocationsCalculatorEClass.getESuperTypes().add(this.getHSourcemeterMetricCalculator());
		hSourcemeterMetricCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hOutgoingInvocationsCalculatorEClass.getESuperTypes().add(this.getHSourcemeterMetricCalculator());
		hGettersCalculatorEClass.getESuperTypes().add(this.getHSourcemeterMetricCalculator());
		hDepthOfInheritanceCalculatorEClass.getESuperTypes().add(this.getHSourcemeterMetricCalculator());

		// Initialize classes, features, and operations; add parameters
		initEClass(hlcom5CalculatorEClass, HLCOM5Calculator.class, "HLCOM5Calculator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHLCOM5Calculator__WhichMetric(), this.getHSoureMeterMetricType(), "whichMetric", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getHLCOM5Calculator__CreateMetric__double(),
				theAntipatterngraphPackage.getHMetric(), "createMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hSettersCalculatorEClass, HSettersCalculator.class, "HSettersCalculator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHSettersCalculator__WhichMetric(), this.getHSoureMeterMetricType(), "whichMetric", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHSettersCalculator__CreateMetric__double(), theAntipatterngraphPackage.getHMetric(),
				"createMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hIncommingInvocationsCalculatorEClass, HIncommingInvocationsCalculator.class,
				"HIncommingInvocationsCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHIncommingInvocationsCalculator__WhichMetric(), this.getHSoureMeterMetricType(),
				"whichMetric", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHIncommingInvocationsCalculator__CreateMetric__double(),
				theAntipatterngraphPackage.getHMetric(), "createMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hSourcemeterMetricCalculatorEClass, HSourcemeterMetricCalculator.class,
				"HSourcemeterMetricCalculator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHSourcemeterMetricCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHSourcemeterMetricCalculator__WhichMetric(), this.getHSoureMeterMetricType(), "whichMetric",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHSourcemeterMetricCalculator__CreateMetric__double(),
				theAntipatterngraphPackage.getHMetric(), "createMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHSourcemeterMetricCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hSoureMeterMetricTypeEClass, HSoureMeterMetricType.class, "HSoureMeterMetricType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHSoureMeterMetricType_Type(), this.getHSourceMeterMetricTypes(), "type", null, 1, 1,
				HSoureMeterMetricType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hOutgoingInvocationsCalculatorEClass, HOutgoingInvocationsCalculator.class,
				"HOutgoingInvocationsCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHOutgoingInvocationsCalculator__WhichMetric(), this.getHSoureMeterMetricType(), "whichMetric",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHOutgoingInvocationsCalculator__CreateMetric__double(),
				theAntipatterngraphPackage.getHMetric(), "createMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hGettersCalculatorEClass, HGettersCalculator.class, "HGettersCalculator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHGettersCalculator__WhichMetric(), this.getHSoureMeterMetricType(), "whichMetric", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHGettersCalculator__CreateMetric__double(), theAntipatterngraphPackage.getHMetric(),
				"createMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hDepthOfInheritanceCalculatorEClass, HDepthOfInheritanceCalculator.class,
				"HDepthOfInheritanceCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHDepthOfInheritanceCalculator__CreateMetric__double(),
				theAntipatterngraphPackage.getHMetric(), "createMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHDepthOfInheritanceCalculator__WhichMetric(), this.getHSoureMeterMetricType(), "whichMetric",
				0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(hSourceMeterMetricTypesEEnum, HSourceMeterMetricTypes.class, "HSourceMeterMetricTypes");
		addEEnumLiteral(hSourceMeterMetricTypesEEnum, HSourceMeterMetricTypes.LCOM);
		addEEnumLiteral(hSourceMeterMetricTypesEEnum, HSourceMeterMetricTypes.NII);
		addEEnumLiteral(hSourceMeterMetricTypesEEnum, HSourceMeterMetricTypes.NOI);
		addEEnumLiteral(hSourceMeterMetricTypesEEnum, HSourceMeterMetricTypes.NG);
		addEEnumLiteral(hSourceMeterMetricTypesEEnum, HSourceMeterMetricTypes.NS);
		addEEnumLiteral(hSourceMeterMetricTypesEEnum, HSourceMeterMetricTypes.DIT);
	}

} //SourcemeterPackageImpl
