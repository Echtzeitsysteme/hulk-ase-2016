/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes;
import org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HGetters Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGettersCalculatorImpl extends HSourcemeterMetricCalculatorImpl implements HGettersCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HGettersCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcemeterPackage.Literals.HGETTERS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSoureMeterMetricType whichMetric() {
		// ActivityNode10
		Object[] result1_green = HGettersCalculatorImpl.pattern_HGettersCalculator_0_1_ActivityNode10_greenF();
		if (result1_green == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode10] failed.");
		}
		HSoureMeterMetricType type = (HSoureMeterMetricType) result1_green[0];
		return HGettersCalculatorImpl.pattern_HGettersCalculator_0_2_expressionFB(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric createMetric(double value) {
		// ActivityNode13
		Object[] result1_green = HGettersCalculatorImpl.pattern_HGettersCalculator_1_1_ActivityNode13_greenFB(value);
		if (result1_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode13] failed." + " Variables: " + "[value] = " + value + ".");
		}
		HNumberOfGettersMetric ng = (HNumberOfGettersMetric) result1_green[0];
		return HGettersCalculatorImpl.pattern_HGettersCalculator_1_2_expressionFB(ng);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SourcemeterPackage.HGETTERS_CALCULATOR___WHICH_METRIC:
			return whichMetric();
		case SourcemeterPackage.HGETTERS_CALCULATOR___CREATE_METRIC__DOUBLE:
			return createMetric((Double) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HGettersCalculator_0_1_ActivityNode10_greenF() {
		HSoureMeterMetricType type = SourcemeterFactory.eINSTANCE.createHSoureMeterMetricType();
		HSourceMeterMetricTypes type_type_prime = HSourceMeterMetricTypes.NG;
		type.setType(type_type_prime);
		return new Object[] { type };
	}

	public static final HSoureMeterMetricType pattern_HGettersCalculator_0_2_expressionFB(HSoureMeterMetricType type) {
		HSoureMeterMetricType _result = type;
		return _result;
	}

	public static final Object[] pattern_HGettersCalculator_1_1_ActivityNode13_greenFB(double value) {
		HNumberOfGettersMetric ng = MetricsFactory.eINSTANCE.createHNumberOfGettersMetric();
		double ng_value_prime = Double.valueOf(value);
		ng.setValue(Double.valueOf(ng_value_prime));
		return new Object[] { ng, value };
	}

	public static final HMetric pattern_HGettersCalculator_1_2_expressionFB(HNumberOfGettersMetric ng) {
		HMetric _result = ng;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Number of Getters";
	}
	// [user code injected with eMoflon] -->
} //HGettersCalculatorImpl
