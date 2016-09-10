/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HGetter Setter Method Relation Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGetterSetterMethodRelationCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HGetterSetterMethodRelationCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HGetterSetterMethodRelationCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HGETTER_SETTER_METHOD_RELATION_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {
		// ActivityNode5
		Object[] result1_black = HGetterSetterMethodRelationCalculatorImpl
				.pattern_HGetterSetterMethodRelationCalculator_0_1_ActivityNode5_blackFFBBF(tClass, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode5] failed." + " Variables: "
					+ "[tClass] = " + tClass + ", " + "[this] = " + this + ".");
		}
		HNumberOfSettersMetric setter = (HNumberOfSettersMetric) result1_black[0];
		HNumberOfGettersMetric getter = (HNumberOfGettersMetric) result1_black[1];
		HNumberOfMethodsMetric methods = (HNumberOfMethodsMetric) result1_black[4];
		Object[] result1_green = HGetterSetterMethodRelationCalculatorImpl
				.pattern_HGetterSetterMethodRelationCalculator_0_1_ActivityNode5_greenBBBFBB(setter, getter, tClass,
						this, methods);
		HNACCMetric metric = (HNACCMetric) result1_green[3];

		return HGetterSetterMethodRelationCalculatorImpl
				.pattern_HGetterSetterMethodRelationCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(HNumberOfSettersMetric setter, HNumberOfGettersMetric getter,
			HNumberOfMethodsMetric methods) {
		// [user code injected with eMoflon]
		double methods_value = methods.getValue();
		if (methods_value == 0) {
			return 0;
		}
		return (setter.getValue() + getter.getValue()) / methods_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// ActivityNode14
		Object[] result1_black = HGetterSetterMethodRelationCalculatorImpl
				.pattern_HGetterSetterMethodRelationCalculator_2_1_ActivityNode14_blackBFFFB(tClass, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode14] failed." + " Variables: "
					+ "[tClass] = " + tClass + ", " + "[this] = " + this + ".");
		}
		HNumberOfSettersMetric setter = (HNumberOfSettersMetric) result1_black[1];
		HNumberOfGettersMetric getter = (HNumberOfGettersMetric) result1_black[2];
		HNumberOfMethodsMetric methods = (HNumberOfMethodsMetric) result1_black[3];
		return HGetterSetterMethodRelationCalculatorImpl
				.pattern_HGetterSetterMethodRelationCalculator_2_2_expressionFBBBB(this, setter, getter, methods);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__HNUMBEROFSETTERSMETRIC_HNUMBEROFGETTERSMETRIC_HNUMBEROFMETHODSMETRIC:
			return calculateValue((HNumberOfSettersMetric) arguments.get(0), (HNumberOfGettersMetric) arguments.get(1),
					(HNumberOfMethodsMetric) arguments.get(2));
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HGetterSetterMethodRelationCalculator_0_1_ActivityNode5_blackFFBBF(
			TClass tClass, HGetterSetterMethodRelationCalculator _this) {
		for (TAnnotation tmpSetter : tClass.getTAnnotation()) {
			if (tmpSetter instanceof HNumberOfSettersMetric) {
				HNumberOfSettersMetric setter = (HNumberOfSettersMetric) tmpSetter;
				for (TAnnotation tmpGetter : tClass.getTAnnotation()) {
					if (tmpGetter instanceof HNumberOfGettersMetric) {
						HNumberOfGettersMetric getter = (HNumberOfGettersMetric) tmpGetter;
						for (TAnnotation tmpMethods : tClass.getTAnnotation()) {
							if (tmpMethods instanceof HNumberOfMethodsMetric) {
								HNumberOfMethodsMetric methods = (HNumberOfMethodsMetric) tmpMethods;
								return new Object[] { setter, getter, tClass, _this, methods };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HGetterSetterMethodRelationCalculator_0_1_ActivityNode5_greenBBBFBB(
			HNumberOfSettersMetric setter, HNumberOfGettersMetric getter, TClass tClass,
			HGetterSetterMethodRelationCalculator _this, HNumberOfMethodsMetric methods) {
		HNACCMetric metric = MetricsFactory.eINSTANCE.createHNACCMetric();
		double _localVariable_0 = _this.calculateValue(setter, getter, methods);
		setter.getPartOf().add(metric);
		getter.getPartOf().add(metric);
		metric.setTAnnotated(tClass);
		metric.setHNumberOfSettersMetric(setter);
		metric.setHNumberOfGettersMetric(getter);
		metric.setHNumberOfMethodsMetric(methods);
		_this.getHAnnotation().add(metric);
		methods.getPartOf().add(metric);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { setter, getter, tClass, metric, _this, methods };
	}

	public static final HMetric pattern_HGetterSetterMethodRelationCalculator_0_2_expressionFB(HNACCMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	public static final Object[] pattern_HGetterSetterMethodRelationCalculator_2_1_ActivityNode14_blackBFFFB(
			TClass tClass, HGetterSetterMethodRelationCalculator _this) {
		for (TAnnotation tmpGetter : tClass.getTAnnotation()) {
			if (tmpGetter instanceof HNumberOfGettersMetric) {
				HNumberOfGettersMetric getter = (HNumberOfGettersMetric) tmpGetter;
				for (TAnnotation tmpMethods : tClass.getTAnnotation()) {
					if (tmpMethods instanceof HNumberOfMethodsMetric) {
						HNumberOfMethodsMetric methods = (HNumberOfMethodsMetric) tmpMethods;
						for (TAnnotation tmpSetter : tClass.getTAnnotation()) {
							if (tmpSetter instanceof HNumberOfSettersMetric) {
								HNumberOfSettersMetric setter = (HNumberOfSettersMetric) tmpSetter;
								return new Object[] { tClass, setter, getter, methods, _this };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final double pattern_HGetterSetterMethodRelationCalculator_2_2_expressionFBBBB(
			HGetterSetterMethodRelationCalculator _this, HNumberOfSettersMetric setter, HNumberOfGettersMetric getter,
			HNumberOfMethodsMetric methods) {
		double _localVariable_0 = _this.calculateValue(setter, getter, methods);
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Relation between Methods and Getters/Setters";
	}
	// [user code injected with eMoflon] -->
} //HGetterSetterMethodRelationCalculatorImpl
