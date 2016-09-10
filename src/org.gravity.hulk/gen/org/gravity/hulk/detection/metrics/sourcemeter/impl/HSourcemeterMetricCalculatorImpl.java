/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.help.HFullyqualifiedName;
import org.gravity.hulk.sourcemeter.SourcemeterActivator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSourcemeter Metric Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HSourcemeterMetricCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HSourcemeterMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSourcemeterMetricCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcemeterPackage.Literals.HSOURCEMETER_METRIC_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {
		// [user code injected with eMoflon]
		double value = calculateValue(tClass);
		HMetric metric = createMetric(value);
		metric.setValue(value);
		metric.setTAnnotated(tClass);
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSoureMeterMetricType whichMetric() {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric createMetric(double value) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]
		String fullyqualified_name = HFullyqualifiedName.getFullyqualifiedName(tClass);
		return SourcemeterActivator.getInstance().getMetricCalculator().getMetric(fullyqualified_name,
				whichMetric().getType().getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SourcemeterPackage.HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case SourcemeterPackage.HSOURCEMETER_METRIC_CALCULATOR___WHICH_METRIC:
			return whichMetric();
		case SourcemeterPackage.HSOURCEMETER_METRIC_CALCULATOR___CREATE_METRIC__DOUBLE:
			return createMetric((Double) arguments.get(0));
		case SourcemeterPackage.HSOURCEMETER_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HSourcemeterMetricCalculatorImpl
