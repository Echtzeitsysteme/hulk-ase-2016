/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes;
import org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIncomming Invocations Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIncommingInvocationsCalculatorImpl extends HSourcemeterMetricCalculatorImpl
		implements HIncommingInvocationsCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HIncommingInvocationsCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcemeterPackage.Literals.HINCOMMING_INVOCATIONS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSoureMeterMetricType whichMetric() {
		// ActivityNode6
		Object[] result1_green = HIncommingInvocationsCalculatorImpl
				.pattern_HIncommingInvocationsCalculator_0_1_ActivityNode6_greenF();
		if (result1_green == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode6] failed.");
		}
		HSoureMeterMetricType type = (HSoureMeterMetricType) result1_green[0];
		return HIncommingInvocationsCalculatorImpl.pattern_HIncommingInvocationsCalculator_0_2_expressionFB(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric createMetric(double value) {
		// ActivityNode12
		Object[] result1_green = HIncommingInvocationsCalculatorImpl
				.pattern_HIncommingInvocationsCalculator_1_1_ActivityNode12_greenFB(value);
		if (result1_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode12] failed." + " Variables: " + "[value] = " + value + ".");
		}
		HNumberOfIncommingInvocationsMetric nii = (HNumberOfIncommingInvocationsMetric) result1_green[0];
		return HIncommingInvocationsCalculatorImpl.pattern_HIncommingInvocationsCalculator_1_2_expressionFB(nii);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SourcemeterPackage.HINCOMMING_INVOCATIONS_CALCULATOR___WHICH_METRIC:
			return whichMetric();
		case SourcemeterPackage.HINCOMMING_INVOCATIONS_CALCULATOR___CREATE_METRIC__DOUBLE:
			return createMetric((Double) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HIncommingInvocationsCalculator_0_1_ActivityNode6_greenF() {
		HSoureMeterMetricType type = SourcemeterFactory.eINSTANCE.createHSoureMeterMetricType();
		HSourceMeterMetricTypes type_type_prime = HSourceMeterMetricTypes.NII;
		type.setType(type_type_prime);
		return new Object[] { type };
	}

	public static final HSoureMeterMetricType pattern_HIncommingInvocationsCalculator_0_2_expressionFB(
			HSoureMeterMetricType type) {
		HSoureMeterMetricType _result = type;
		return _result;
	}

	public static final Object[] pattern_HIncommingInvocationsCalculator_1_1_ActivityNode12_greenFB(double value) {
		HNumberOfIncommingInvocationsMetric nii = MetricsFactory.eINSTANCE.createHNumberOfIncommingInvocationsMetric();
		double nii_value_prime = Double.valueOf(value);
		nii.setValue(Double.valueOf(nii_value_prime));
		return new Object[] { nii, value };
	}

	public static final HMetric pattern_HIncommingInvocationsCalculator_1_2_expressionFB(
			HNumberOfIncommingInvocationsMetric nii) {
		HMetric _result = nii;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Number of Incomming Invocations";
	}
	// [user code injected with eMoflon] -->
} //HIncommingInvocationsCalculatorImpl
