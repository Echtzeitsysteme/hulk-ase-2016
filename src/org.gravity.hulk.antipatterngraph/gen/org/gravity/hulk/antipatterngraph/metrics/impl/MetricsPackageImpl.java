/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;

import org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;

import org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;

import org.gravity.hulk.antipatterngraph.values.ValuesPackage;

import org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

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
	private EClass hnaccMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlcom5MetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfMembersMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfIncommingInvocationsMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfOutgoingInvocationsMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalAccessRelationMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hInvocationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfChildMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfGettersMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfSettersMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfMethodsMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAverageOverloadingInClassMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAverageParametersMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalMethodAccessesMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalFieldAccessesMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDepthOfInheritanceMetricEClass = null;

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
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#eNS_URI
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
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AntipatterngraphPackageImpl theAntipatterngraphPackage = (AntipatterngraphPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI) instanceof AntipatterngraphPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(AntipatterngraphPackage.eNS_URI)
						: AntipatterngraphPackage.eINSTANCE);
		AntipatternPackageImpl theAntipatternPackage = (AntipatternPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(AntipatternPackage.eNS_URI) instanceof AntipatternPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI)
						: AntipatternPackage.eINSTANCE);
		CodesmellsPackageImpl theCodesmellsPackage = (CodesmellsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CodesmellsPackage.eNS_URI) instanceof CodesmellsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI)
						: CodesmellsPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();
		theAntipatterngraphPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();
		theAntipatterngraphPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

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
	public EClass getHNACCMetric() {
		return hnaccMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHNACCMetric_HGetterSetterSmells() {
		return (EReference) hnaccMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHNACCMetric_HNumberOfGettersMetric() {
		return (EReference) hnaccMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHNACCMetric_HNumberOfSettersMetric() {
		return (EReference) hnaccMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHNACCMetric_HNumberOfMethodsMetric() {
		return (EReference) hnaccMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLCOM5Metric() {
		return hlcom5MetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfMembersMetric() {
		return hNumberOfMembersMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfIncommingInvocationsMetric() {
		return hNumberOfIncommingInvocationsMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfOutgoingInvocationsMetric() {
		return hNumberOfOutgoingInvocationsMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalAccessRelationMetric() {
		return hLocalAccessRelationMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHLocalAccessRelationMetric_HLocalFieldAccesses() {
		return (EReference) hLocalAccessRelationMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHLocalAccessRelationMetric_HLocalMethodAccesses() {
		return (EReference) hLocalAccessRelationMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHInvocationRelation() {
		return hInvocationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHInvocationRelation_HNumberOfOutgoingInvocationsMetric() {
		return (EReference) hInvocationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHInvocationRelation_HNumberOfIncommingInvocationsMetric() {
		return (EReference) hInvocationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfChildMetric() {
		return hNumberOfChildMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfGettersMetric() {
		return hNumberOfGettersMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfSettersMetric() {
		return hNumberOfSettersMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfMethodsMetric() {
		return hNumberOfMethodsMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAverageOverloadingInClassMetric() {
		return hAverageOverloadingInClassMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAverageParametersMetric() {
		return hAverageParametersMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalMethodAccessesMetric() {
		return hLocalMethodAccessesMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalFieldAccessesMetric() {
		return hLocalFieldAccessesMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDepthOfInheritanceMetric() {
		return hDepthOfInheritanceMetricEClass;
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
		hnaccMetricEClass = createEClass(HNACC_METRIC);
		createEReference(hnaccMetricEClass, HNACC_METRIC__HGETTER_SETTER_SMELLS);
		createEReference(hnaccMetricEClass, HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC);
		createEReference(hnaccMetricEClass, HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC);
		createEReference(hnaccMetricEClass, HNACC_METRIC__HNUMBER_OF_METHODS_METRIC);

		hlcom5MetricEClass = createEClass(HLCOM5_METRIC);

		hNumberOfMembersMetricEClass = createEClass(HNUMBER_OF_MEMBERS_METRIC);

		hNumberOfIncommingInvocationsMetricEClass = createEClass(HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC);

		hNumberOfOutgoingInvocationsMetricEClass = createEClass(HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC);

		hLocalAccessRelationMetricEClass = createEClass(HLOCAL_ACCESS_RELATION_METRIC);
		createEReference(hLocalAccessRelationMetricEClass, HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES);
		createEReference(hLocalAccessRelationMetricEClass, HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES);

		hInvocationRelationEClass = createEClass(HINVOCATION_RELATION);
		createEReference(hInvocationRelationEClass, HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
		createEReference(hInvocationRelationEClass, HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC);

		hNumberOfChildMetricEClass = createEClass(HNUMBER_OF_CHILD_METRIC);

		hNumberOfGettersMetricEClass = createEClass(HNUMBER_OF_GETTERS_METRIC);

		hNumberOfSettersMetricEClass = createEClass(HNUMBER_OF_SETTERS_METRIC);

		hNumberOfMethodsMetricEClass = createEClass(HNUMBER_OF_METHODS_METRIC);

		hAverageOverloadingInClassMetricEClass = createEClass(HAVERAGE_OVERLOADING_IN_CLASS_METRIC);

		hAverageParametersMetricEClass = createEClass(HAVERAGE_PARAMETERS_METRIC);

		hLocalMethodAccessesMetricEClass = createEClass(HLOCAL_METHOD_ACCESSES_METRIC);

		hLocalFieldAccessesMetricEClass = createEClass(HLOCAL_FIELD_ACCESSES_METRIC);

		hDepthOfInheritanceMetricEClass = createEClass(HDEPTH_OF_INHERITANCE_METRIC);
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
		CodesmellsPackage theCodesmellsPackage = (CodesmellsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodesmellsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hnaccMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hlcom5MetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfMembersMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfIncommingInvocationsMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfOutgoingInvocationsMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hLocalAccessRelationMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hInvocationRelationEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfChildMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfGettersMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfSettersMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfMethodsMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hAverageOverloadingInClassMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hAverageParametersMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hLocalMethodAccessesMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hLocalFieldAccessesMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hDepthOfInheritanceMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(hnaccMetricEClass, HNACCMetric.class, "HNACCMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHNACCMetric_HGetterSetterSmells(), theCodesmellsPackage.getHGetterSetterSmell(), null,
				"hGetterSetterSmells", null, 0, -1, HNACCMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHNACCMetric_HNumberOfGettersMetric(), this.getHNumberOfGettersMetric(), null,
				"hNumberOfGettersMetric", null, 0, 1, HNACCMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHNACCMetric_HNumberOfSettersMetric(), this.getHNumberOfSettersMetric(), null,
				"hNumberOfSettersMetric", null, 0, 1, HNACCMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHNACCMetric_HNumberOfMethodsMetric(), this.getHNumberOfMethodsMetric(), null,
				"hNumberOfMethodsMetric", null, 0, 1, HNACCMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hlcom5MetricEClass, HLCOM5Metric.class, "HLCOM5Metric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hNumberOfMembersMetricEClass, HNumberOfMembersMetric.class, "HNumberOfMembersMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hNumberOfIncommingInvocationsMetricEClass, HNumberOfIncommingInvocationsMetric.class,
				"HNumberOfIncommingInvocationsMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hNumberOfOutgoingInvocationsMetricEClass, HNumberOfOutgoingInvocationsMetric.class,
				"HNumberOfOutgoingInvocationsMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hLocalAccessRelationMetricEClass, HLocalAccessRelationMetric.class, "HLocalAccessRelationMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHLocalAccessRelationMetric_HLocalFieldAccesses(), this.getHLocalFieldAccessesMetric(), null,
				"hLocalFieldAccesses", null, 0, 1, HLocalAccessRelationMetric.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHLocalAccessRelationMetric_HLocalMethodAccesses(), this.getHLocalMethodAccessesMetric(), null,
				"hLocalMethodAccesses", null, 0, 1, HLocalAccessRelationMetric.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hInvocationRelationEClass, HInvocationRelation.class, "HInvocationRelation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHInvocationRelation_HNumberOfOutgoingInvocationsMetric(),
				this.getHNumberOfOutgoingInvocationsMetric(), null, "hNumberOfOutgoingInvocationsMetric", null, 0, 1,
				HInvocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHInvocationRelation_HNumberOfIncommingInvocationsMetric(),
				this.getHNumberOfIncommingInvocationsMetric(), null, "hNumberOfIncommingInvocationsMetric", null, 0, 1,
				HInvocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hNumberOfChildMetricEClass, HNumberOfChildMetric.class, "HNumberOfChildMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hNumberOfGettersMetricEClass, HNumberOfGettersMetric.class, "HNumberOfGettersMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hNumberOfSettersMetricEClass, HNumberOfSettersMetric.class, "HNumberOfSettersMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hNumberOfMethodsMetricEClass, HNumberOfMethodsMetric.class, "HNumberOfMethodsMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hAverageOverloadingInClassMetricEClass, HAverageOverloadingInClassMetric.class,
				"HAverageOverloadingInClassMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hAverageParametersMetricEClass, HAverageParametersMetric.class, "HAverageParametersMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hLocalMethodAccessesMetricEClass, HLocalMethodAccessesMetric.class, "HLocalMethodAccessesMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hLocalFieldAccessesMetricEClass, HLocalFieldAccessesMetric.class, "HLocalFieldAccessesMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hDepthOfInheritanceMetricEClass, HDepthOfInheritanceMetric.class, "HDepthOfInheritanceMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //MetricsPackageImpl
