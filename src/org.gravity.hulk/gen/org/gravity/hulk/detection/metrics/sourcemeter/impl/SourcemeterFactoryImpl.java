/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.detection.metrics.sourcemeter.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourcemeterFactoryImpl extends EFactoryImpl implements SourcemeterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourcemeterFactory init() {
		try {
			SourcemeterFactory theSourcemeterFactory = (SourcemeterFactory) EPackage.Registry.INSTANCE
					.getEFactory(SourcemeterPackage.eNS_URI);
			if (theSourcemeterFactory != null) {
				return theSourcemeterFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SourcemeterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcemeterFactoryImpl() {
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
		case SourcemeterPackage.HLCOM5_CALCULATOR:
			return createHLCOM5Calculator();
		case SourcemeterPackage.HSETTERS_CALCULATOR:
			return createHSettersCalculator();
		case SourcemeterPackage.HINCOMMING_INVOCATIONS_CALCULATOR:
			return createHIncommingInvocationsCalculator();
		case SourcemeterPackage.HSOURE_METER_METRIC_TYPE:
			return createHSoureMeterMetricType();
		case SourcemeterPackage.HOUTGOING_INVOCATIONS_CALCULATOR:
			return createHOutgoingInvocationsCalculator();
		case SourcemeterPackage.HGETTERS_CALCULATOR:
			return createHGettersCalculator();
		case SourcemeterPackage.HDEPTH_OF_INHERITANCE_CALCULATOR:
			return createHDepthOfInheritanceCalculator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SourcemeterPackage.HSOURCE_METER_METRIC_TYPES:
			return createHSourceMeterMetricTypesFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SourcemeterPackage.HSOURCE_METER_METRIC_TYPES:
			return convertHSourceMeterMetricTypesToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLCOM5Calculator createHLCOM5Calculator() {
		HLCOM5CalculatorImpl hlcom5Calculator = new HLCOM5CalculatorImpl();
		return hlcom5Calculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSettersCalculator createHSettersCalculator() {
		HSettersCalculatorImpl hSettersCalculator = new HSettersCalculatorImpl();
		return hSettersCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIncommingInvocationsCalculator createHIncommingInvocationsCalculator() {
		HIncommingInvocationsCalculatorImpl hIncommingInvocationsCalculator = new HIncommingInvocationsCalculatorImpl();
		return hIncommingInvocationsCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSoureMeterMetricType createHSoureMeterMetricType() {
		HSoureMeterMetricTypeImpl hSoureMeterMetricType = new HSoureMeterMetricTypeImpl();
		return hSoureMeterMetricType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HOutgoingInvocationsCalculator createHOutgoingInvocationsCalculator() {
		HOutgoingInvocationsCalculatorImpl hOutgoingInvocationsCalculator = new HOutgoingInvocationsCalculatorImpl();
		return hOutgoingInvocationsCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGettersCalculator createHGettersCalculator() {
		HGettersCalculatorImpl hGettersCalculator = new HGettersCalculatorImpl();
		return hGettersCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDepthOfInheritanceCalculator createHDepthOfInheritanceCalculator() {
		HDepthOfInheritanceCalculatorImpl hDepthOfInheritanceCalculator = new HDepthOfInheritanceCalculatorImpl();
		return hDepthOfInheritanceCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSourceMeterMetricTypes createHSourceMeterMetricTypesFromString(EDataType eDataType, String initialValue) {
		HSourceMeterMetricTypes result = HSourceMeterMetricTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHSourceMeterMetricTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcemeterPackage getSourcemeterPackage() {
		return (SourcemeterPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SourcemeterPackage getPackage() {
		return SourcemeterPackage.eINSTANCE;
	}

} //SourcemeterFactoryImpl
