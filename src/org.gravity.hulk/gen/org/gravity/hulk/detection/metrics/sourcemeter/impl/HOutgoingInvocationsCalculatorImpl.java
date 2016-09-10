/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes;
import org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HOutgoing Invocations Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HOutgoingInvocationsCalculatorImpl extends HSourcemeterMetricCalculatorImpl
		implements HOutgoingInvocationsCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HOutgoingInvocationsCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcemeterPackage.Literals.HOUTGOING_INVOCATIONS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSoureMeterMetricType whichMetric() {
		// ActivityNode9
		Object[] result1_green = HOutgoingInvocationsCalculatorImpl
				.pattern_HOutgoingInvocationsCalculator_0_1_ActivityNode9_greenF();
		if (result1_green == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode9] failed.");
		}
		HSoureMeterMetricType type = (HSoureMeterMetricType) result1_green[0];
		return HOutgoingInvocationsCalculatorImpl.pattern_HOutgoingInvocationsCalculator_0_2_expressionFB(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric createMetric(double value) {
		// ActivityNode15
		Object[] result1_green = HOutgoingInvocationsCalculatorImpl
				.pattern_HOutgoingInvocationsCalculator_1_1_ActivityNode15_greenFB(value);
		if (result1_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode15] failed." + " Variables: " + "[value] = " + value + ".");
		}
		HNumberOfOutgoingInvocationsMetric noi = (HNumberOfOutgoingInvocationsMetric) result1_green[0];
		return HOutgoingInvocationsCalculatorImpl.pattern_HOutgoingInvocationsCalculator_1_2_expressionFB(noi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SourcemeterPackage.HOUTGOING_INVOCATIONS_CALCULATOR___WHICH_METRIC:
			return whichMetric();
		case SourcemeterPackage.HOUTGOING_INVOCATIONS_CALCULATOR___CREATE_METRIC__DOUBLE:
			return createMetric((Double) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HOutgoingInvocationsCalculator_0_1_ActivityNode9_greenF() {
		HSoureMeterMetricType type = SourcemeterFactory.eINSTANCE.createHSoureMeterMetricType();
		HSourceMeterMetricTypes type_type_prime = HSourceMeterMetricTypes.NOI;
		type.setType(type_type_prime);
		return new Object[] { type };
	}

	public static final HSoureMeterMetricType pattern_HOutgoingInvocationsCalculator_0_2_expressionFB(
			HSoureMeterMetricType type) {
		HSoureMeterMetricType _result = type;
		return _result;
	}

	public static final Object[] pattern_HOutgoingInvocationsCalculator_1_1_ActivityNode15_greenFB(double value) {
		HNumberOfOutgoingInvocationsMetric noi = MetricsFactory.eINSTANCE.createHNumberOfOutgoingInvocationsMetric();
		double noi_value_prime = Double.valueOf(value);
		noi.setValue(Double.valueOf(noi_value_prime));
		return new Object[] { noi, value };
	}

	public static final HMetric pattern_HOutgoingInvocationsCalculator_1_2_expressionFB(
			HNumberOfOutgoingInvocationsMetric noi) {
		HMetric _result = noi;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Number of Outgoing Invocations";
	}
	// [user code injected with eMoflon] -->
} //HOutgoingInvocationsCalculatorImpl
