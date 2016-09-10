/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;

import org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes;
import org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;
// <-- [user defined imports]
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.hulk.help.HFullyqualifiedName;
import org.gravity.hulk.sourcemeter.SourcemeterActivator;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLCOM5 Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLCOM5CalculatorImpl extends HSourcemeterMetricCalculatorImpl implements HLCOM5Calculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLCOM5CalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcemeterPackage.Literals.HLCOM5_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSoureMeterMetricType whichMetric() {
		// ActivityNode8
		Object[] result1_green = HLCOM5CalculatorImpl.pattern_HLCOM5Calculator_0_1_ActivityNode8_greenF();
		if (result1_green == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode8] failed.");
		}
		HSoureMeterMetricType type = (HSoureMeterMetricType) result1_green[0];
		return HLCOM5CalculatorImpl.pattern_HLCOM5Calculator_0_2_expressionFB(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric createMetric(double value) {
		// ActivityNode11
		Object[] result1_green = HLCOM5CalculatorImpl.pattern_HLCOM5Calculator_1_1_ActivityNode11_greenFB(value);
		if (result1_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode11] failed." + " Variables: " + "[value] = " + value + ".");
		}
		HLCOM5Metric lcom = (HLCOM5Metric) result1_green[0];
		return HLCOM5CalculatorImpl.pattern_HLCOM5Calculator_1_2_expressionFB(lcom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SourcemeterPackage.HLCOM5_CALCULATOR___WHICH_METRIC:
			return whichMetric();
		case SourcemeterPackage.HLCOM5_CALCULATOR___CREATE_METRIC__DOUBLE:
			return createMetric((Double) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLCOM5Calculator_0_1_ActivityNode8_greenF() {
		HSoureMeterMetricType type = SourcemeterFactory.eINSTANCE.createHSoureMeterMetricType();
		HSourceMeterMetricTypes type_type_prime = HSourceMeterMetricTypes.LCOM;
		type.setType(type_type_prime);
		return new Object[] { type };
	}

	public static final HSoureMeterMetricType pattern_HLCOM5Calculator_0_2_expressionFB(HSoureMeterMetricType type) {
		HSoureMeterMetricType _result = type;
		return _result;
	}

	public static final Object[] pattern_HLCOM5Calculator_1_1_ActivityNode11_greenFB(double value) {
		HLCOM5Metric lcom = MetricsFactory.eINSTANCE.createHLCOM5Metric();
		double lcom_value_prime = Double.valueOf(value);
		lcom.setValue(Double.valueOf(lcom_value_prime));
		return new Object[] { lcom, value };
	}

	public static final HMetric pattern_HLCOM5Calculator_1_2_expressionFB(HLCOM5Metric lcom) {
		HMetric _result = lcom;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "LCOM5";
	}
	// [user code injected with eMoflon] -->
} //HLCOM5CalculatorImpl
