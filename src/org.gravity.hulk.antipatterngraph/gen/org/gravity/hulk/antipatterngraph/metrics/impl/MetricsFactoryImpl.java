/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.antipatterngraph.metrics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsFactoryImpl extends EFactoryImpl implements MetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricsFactory init() {
		try {
			MetricsFactory theMetricsFactory = (MetricsFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetricsPackage.eNS_URI);
			if (theMetricsFactory != null) {
				return theMetricsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetricsPackage.HNACC_METRIC:
			return createHNACCMetric();
		case MetricsPackage.HLCOM5_METRIC:
			return createHLCOM5Metric();
		case MetricsPackage.HNUMBER_OF_MEMBERS_METRIC:
			return createHNumberOfMembersMetric();
		case MetricsPackage.HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC:
			return createHNumberOfIncommingInvocationsMetric();
		case MetricsPackage.HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC:
			return createHNumberOfOutgoingInvocationsMetric();
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC:
			return createHLocalAccessRelationMetric();
		case MetricsPackage.HINVOCATION_RELATION:
			return createHInvocationRelation();
		case MetricsPackage.HNUMBER_OF_CHILD_METRIC:
			return createHNumberOfChildMetric();
		case MetricsPackage.HNUMBER_OF_GETTERS_METRIC:
			return createHNumberOfGettersMetric();
		case MetricsPackage.HNUMBER_OF_SETTERS_METRIC:
			return createHNumberOfSettersMetric();
		case MetricsPackage.HNUMBER_OF_METHODS_METRIC:
			return createHNumberOfMethodsMetric();
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			return createHAverageOverloadingInClassMetric();
		case MetricsPackage.HAVERAGE_PARAMETERS_METRIC:
			return createHAverageParametersMetric();
		case MetricsPackage.HLOCAL_METHOD_ACCESSES_METRIC:
			return createHLocalMethodAccessesMetric();
		case MetricsPackage.HLOCAL_FIELD_ACCESSES_METRIC:
			return createHLocalFieldAccessesMetric();
		case MetricsPackage.HDEPTH_OF_INHERITANCE_METRIC:
			return createHDepthOfInheritanceMetric();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNACCMetric createHNACCMetric() {
		HNACCMetricImpl hnaccMetric = new HNACCMetricImpl();
		return hnaccMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLCOM5Metric createHLCOM5Metric() {
		HLCOM5MetricImpl hlcom5Metric = new HLCOM5MetricImpl();
		return hlcom5Metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfMembersMetric createHNumberOfMembersMetric() {
		HNumberOfMembersMetricImpl hNumberOfMembersMetric = new HNumberOfMembersMetricImpl();
		return hNumberOfMembersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfIncommingInvocationsMetric createHNumberOfIncommingInvocationsMetric() {
		HNumberOfIncommingInvocationsMetricImpl hNumberOfIncommingInvocationsMetric = new HNumberOfIncommingInvocationsMetricImpl();
		return hNumberOfIncommingInvocationsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfOutgoingInvocationsMetric createHNumberOfOutgoingInvocationsMetric() {
		HNumberOfOutgoingInvocationsMetricImpl hNumberOfOutgoingInvocationsMetric = new HNumberOfOutgoingInvocationsMetricImpl();
		return hNumberOfOutgoingInvocationsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalAccessRelationMetric createHLocalAccessRelationMetric() {
		HLocalAccessRelationMetricImpl hLocalAccessRelationMetric = new HLocalAccessRelationMetricImpl();
		return hLocalAccessRelationMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HInvocationRelation createHInvocationRelation() {
		HInvocationRelationImpl hInvocationRelation = new HInvocationRelationImpl();
		return hInvocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfChildMetric createHNumberOfChildMetric() {
		HNumberOfChildMetricImpl hNumberOfChildMetric = new HNumberOfChildMetricImpl();
		return hNumberOfChildMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfGettersMetric createHNumberOfGettersMetric() {
		HNumberOfGettersMetricImpl hNumberOfGettersMetric = new HNumberOfGettersMetricImpl();
		return hNumberOfGettersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfSettersMetric createHNumberOfSettersMetric() {
		HNumberOfSettersMetricImpl hNumberOfSettersMetric = new HNumberOfSettersMetricImpl();
		return hNumberOfSettersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfMethodsMetric createHNumberOfMethodsMetric() {
		HNumberOfMethodsMetricImpl hNumberOfMethodsMetric = new HNumberOfMethodsMetricImpl();
		return hNumberOfMethodsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageOverloadingInClassMetric createHAverageOverloadingInClassMetric() {
		HAverageOverloadingInClassMetricImpl hAverageOverloadingInClassMetric = new HAverageOverloadingInClassMetricImpl();
		return hAverageOverloadingInClassMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageParametersMetric createHAverageParametersMetric() {
		HAverageParametersMetricImpl hAverageParametersMetric = new HAverageParametersMetricImpl();
		return hAverageParametersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalMethodAccessesMetric createHLocalMethodAccessesMetric() {
		HLocalMethodAccessesMetricImpl hLocalMethodAccessesMetric = new HLocalMethodAccessesMetricImpl();
		return hLocalMethodAccessesMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalFieldAccessesMetric createHLocalFieldAccessesMetric() {
		HLocalFieldAccessesMetricImpl hLocalFieldAccessesMetric = new HLocalFieldAccessesMetricImpl();
		return hLocalFieldAccessesMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDepthOfInheritanceMetric createHDepthOfInheritanceMetric() {
		HDepthOfInheritanceMetricImpl hDepthOfInheritanceMetric = new HDepthOfInheritanceMetricImpl();
		return hDepthOfInheritanceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsPackage getMetricsPackage() {
		return (MetricsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetricsPackage getPackage() {
		return MetricsPackage.eINSTANCE;
	}

} //MetricsFactoryImpl
