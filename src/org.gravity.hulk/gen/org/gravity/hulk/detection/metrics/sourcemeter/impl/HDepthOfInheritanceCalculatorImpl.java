/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes;
import org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDepth Of Inheritance Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDepthOfInheritanceCalculatorImpl extends HSourcemeterMetricCalculatorImpl
		implements HDepthOfInheritanceCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDepthOfInheritanceCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcemeterPackage.Literals.HDEPTH_OF_INHERITANCE_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric createMetric(double value) {
		// ActivityNode17
		Object[] result1_green = HDepthOfInheritanceCalculatorImpl
				.pattern_HDepthOfInheritanceCalculator_0_1_ActivityNode17_greenF();
		if (result1_green == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode17] failed.");
		}
		HDepthOfInheritanceMetric metric = (HDepthOfInheritanceMetric) result1_green[0];
		return HDepthOfInheritanceCalculatorImpl.pattern_HDepthOfInheritanceCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSoureMeterMetricType whichMetric() {
		// ActivityNode16
		Object[] result1_green = HDepthOfInheritanceCalculatorImpl
				.pattern_HDepthOfInheritanceCalculator_1_1_ActivityNode16_greenF();
		if (result1_green == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode16] failed.");
		}
		HSoureMeterMetricType type = (HSoureMeterMetricType) result1_green[0];
		return HDepthOfInheritanceCalculatorImpl.pattern_HDepthOfInheritanceCalculator_1_2_expressionFB(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SourcemeterPackage.HDEPTH_OF_INHERITANCE_CALCULATOR___CREATE_METRIC__DOUBLE:
			return createMetric((Double) arguments.get(0));
		case SourcemeterPackage.HDEPTH_OF_INHERITANCE_CALCULATOR___WHICH_METRIC:
			return whichMetric();
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HDepthOfInheritanceCalculator_0_1_ActivityNode17_greenF() {
		HDepthOfInheritanceMetric metric = MetricsFactory.eINSTANCE.createHDepthOfInheritanceMetric();
		return new Object[] { metric };
	}

	public static final HMetric pattern_HDepthOfInheritanceCalculator_0_2_expressionFB(
			HDepthOfInheritanceMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	public static final Object[] pattern_HDepthOfInheritanceCalculator_1_1_ActivityNode16_greenF() {
		HSoureMeterMetricType type = SourcemeterFactory.eINSTANCE.createHSoureMeterMetricType();
		HSourceMeterMetricTypes type_type_prime = HSourceMeterMetricTypes.DIT;
		type.setType(type_type_prime);
		return new Object[] { type };
	}

	public static final HSoureMeterMetricType pattern_HDepthOfInheritanceCalculator_1_2_expressionFB(
			HSoureMeterMetricType type) {
		HSoureMeterMetricType _result = type;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Depth of Inheritance Tree";
	}
	// [user code injected with eMoflon] -->
} //HDepthOfInheritanceCalculatorImpl
