/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes;
import org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSetters Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSettersCalculatorImpl extends HSourcemeterMetricCalculatorImpl implements HSettersCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSettersCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcemeterPackage.Literals.HSETTERS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSoureMeterMetricType whichMetric() {
		// ActivityNode7
		Object[] result1_green = HSettersCalculatorImpl.pattern_HSettersCalculator_0_1_ActivityNode7_greenF();
		if (result1_green == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode7] failed.");
		}
		HSoureMeterMetricType type = (HSoureMeterMetricType) result1_green[0];
		return HSettersCalculatorImpl.pattern_HSettersCalculator_0_2_expressionFB(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric createMetric(double value) {
		// ActivityNode14
		Object[] result1_green = HSettersCalculatorImpl.pattern_HSettersCalculator_1_1_ActivityNode14_greenFB(value);
		if (result1_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode14] failed." + " Variables: " + "[value] = " + value + ".");
		}
		HNumberOfSettersMetric ns = (HNumberOfSettersMetric) result1_green[0];
		return HSettersCalculatorImpl.pattern_HSettersCalculator_1_2_expressionFB(ns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SourcemeterPackage.HSETTERS_CALCULATOR___WHICH_METRIC:
			return whichMetric();
		case SourcemeterPackage.HSETTERS_CALCULATOR___CREATE_METRIC__DOUBLE:
			return createMetric((Double) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HSettersCalculator_0_1_ActivityNode7_greenF() {
		HSoureMeterMetricType type = SourcemeterFactory.eINSTANCE.createHSoureMeterMetricType();
		HSourceMeterMetricTypes type_type_prime = HSourceMeterMetricTypes.NS;
		type.setType(type_type_prime);
		return new Object[] { type };
	}

	public static final HSoureMeterMetricType pattern_HSettersCalculator_0_2_expressionFB(HSoureMeterMetricType type) {
		HSoureMeterMetricType _result = type;
		return _result;
	}

	public static final Object[] pattern_HSettersCalculator_1_1_ActivityNode14_greenFB(double value) {
		HNumberOfSettersMetric ns = MetricsFactory.eINSTANCE.createHNumberOfSettersMetric();
		double ns_value_prime = Double.valueOf(value);
		ns.setValue(Double.valueOf(ns_value_prime));
		return new Object[] { ns, value };
	}

	public static final HMetric pattern_HSettersCalculator_1_2_expressionFB(HNumberOfSettersMetric ns) {
		HMetric _result = ns;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Number of Setters";
	}
	// [user code injected with eMoflon] -->
} //HSettersCalculatorImpl
