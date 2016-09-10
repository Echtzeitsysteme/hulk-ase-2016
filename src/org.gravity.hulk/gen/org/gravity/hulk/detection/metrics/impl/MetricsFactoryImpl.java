/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.detection.metrics.*;

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
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR:
			return createHInvocationRelationCalculator();
		case MetricsPackage.HNUMBER_OF_CHILD_CALCULATOR:
			return createHNumberOfChildCalculator();
		case MetricsPackage.HMEMBER_NUMBER_CALCULATOR:
			return createHMemberNumberCalculator();
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR:
			return createHLocalAccessRelationCalculator();
		case MetricsPackage.HMETHOD_NUMBER_CALCULATOR:
			return createHMethodNumberCalculator();
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR:
			return createHGetterSetterMethodRelationCalculator();
		case MetricsPackage.HAVERAGE_PARAMTERS_CALCULATOR:
			return createHAverageParamtersCalculator();
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR:
			return createHAverageOverloadingInClassCalculator();
		case MetricsPackage.HLOCAL_METHOD_ACCESS_CALCULATOR:
			return createHLocalMethodAccessCalculator();
		case MetricsPackage.HLOCAL_FIELDS_ACCESS_CALCULATOR:
			return createHLocalFieldsAccessCalculator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HInvocationRelationCalculator createHInvocationRelationCalculator() {
		HInvocationRelationCalculatorImpl hInvocationRelationCalculator = new HInvocationRelationCalculatorImpl();
		return hInvocationRelationCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfChildCalculator createHNumberOfChildCalculator() {
		HNumberOfChildCalculatorImpl hNumberOfChildCalculator = new HNumberOfChildCalculatorImpl();
		return hNumberOfChildCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMemberNumberCalculator createHMemberNumberCalculator() {
		HMemberNumberCalculatorImpl hMemberNumberCalculator = new HMemberNumberCalculatorImpl();
		return hMemberNumberCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalAccessRelationCalculator createHLocalAccessRelationCalculator() {
		HLocalAccessRelationCalculatorImpl hLocalAccessRelationCalculator = new HLocalAccessRelationCalculatorImpl();
		return hLocalAccessRelationCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMethodNumberCalculator createHMethodNumberCalculator() {
		HMethodNumberCalculatorImpl hMethodNumberCalculator = new HMethodNumberCalculatorImpl();
		return hMethodNumberCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGetterSetterMethodRelationCalculator createHGetterSetterMethodRelationCalculator() {
		HGetterSetterMethodRelationCalculatorImpl hGetterSetterMethodRelationCalculator = new HGetterSetterMethodRelationCalculatorImpl();
		return hGetterSetterMethodRelationCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageParamtersCalculator createHAverageParamtersCalculator() {
		HAverageParamtersCalculatorImpl hAverageParamtersCalculator = new HAverageParamtersCalculatorImpl();
		return hAverageParamtersCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageOverloadingInClassCalculator createHAverageOverloadingInClassCalculator() {
		HAverageOverloadingInClassCalculatorImpl hAverageOverloadingInClassCalculator = new HAverageOverloadingInClassCalculatorImpl();
		return hAverageOverloadingInClassCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalMethodAccessCalculator createHLocalMethodAccessCalculator() {
		HLocalMethodAccessCalculatorImpl hLocalMethodAccessCalculator = new HLocalMethodAccessCalculatorImpl();
		return hLocalMethodAccessCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalFieldsAccessCalculator createHLocalFieldsAccessCalculator() {
		HLocalFieldsAccessCalculatorImpl hLocalFieldsAccessCalculator = new HLocalFieldsAccessCalculatorImpl();
		return hLocalFieldsAccessCalculator;
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
