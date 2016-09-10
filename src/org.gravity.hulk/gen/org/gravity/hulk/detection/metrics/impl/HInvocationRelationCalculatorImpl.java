/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HInvocationRelationCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HInvocation Relation Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HInvocationRelationCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HInvocationRelationCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HInvocationRelationCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HINVOCATION_RELATION_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {
		// ActivityNode6
		Object[] result1_black = HInvocationRelationCalculatorImpl
				.pattern_HInvocationRelationCalculator_0_1_ActivityNode6_blackBBFF(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode6] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[tClass] = " + tClass + ".");
		}
		HNumberOfIncommingInvocationsMetric nii = (HNumberOfIncommingInvocationsMetric) result1_black[2];
		HNumberOfOutgoingInvocationsMetric noi = (HNumberOfOutgoingInvocationsMetric) result1_black[3];
		Object[] result1_green = HInvocationRelationCalculatorImpl
				.pattern_HInvocationRelationCalculator_0_1_ActivityNode6_greenBBFBB(this, tClass, nii, noi);
		HInvocationRelation metric = (HInvocationRelation) result1_green[2];

		return HInvocationRelationCalculatorImpl.pattern_HInvocationRelationCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateInvocValue(HNumberOfIncommingInvocationsMetric nii, HNumberOfOutgoingInvocationsMetric noi) {
		// [user code injected with eMoflon]
		return (noi.getValue()) / (nii.getValue() + 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// ActivityNode15
		Object[] result1_black = HInvocationRelationCalculatorImpl
				.pattern_HInvocationRelationCalculator_2_1_ActivityNode15_blackBBFF(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode15] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[tClass] = " + tClass + ".");
		}
		HNumberOfIncommingInvocationsMetric nii = (HNumberOfIncommingInvocationsMetric) result1_black[2];
		HNumberOfOutgoingInvocationsMetric noi = (HNumberOfOutgoingInvocationsMetric) result1_black[3];
		return HInvocationRelationCalculatorImpl.pattern_HInvocationRelationCalculator_2_2_expressionFBBB(this, nii,
				noi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR___CALCULATE_INVOC_VALUE__HNUMBEROFINCOMMINGINVOCATIONSMETRIC_HNUMBEROFOUTGOINGINVOCATIONSMETRIC:
			return calculateInvocValue((HNumberOfIncommingInvocationsMetric) arguments.get(0),
					(HNumberOfOutgoingInvocationsMetric) arguments.get(1));
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HInvocationRelationCalculator_0_1_ActivityNode6_blackBBFF(
			HInvocationRelationCalculator _this, TClass tClass) {
		for (TAnnotation tmpNii : tClass.getTAnnotation()) {
			if (tmpNii instanceof HNumberOfIncommingInvocationsMetric) {
				HNumberOfIncommingInvocationsMetric nii = (HNumberOfIncommingInvocationsMetric) tmpNii;
				for (TAnnotation tmpNoi : tClass.getTAnnotation()) {
					if (tmpNoi instanceof HNumberOfOutgoingInvocationsMetric) {
						HNumberOfOutgoingInvocationsMetric noi = (HNumberOfOutgoingInvocationsMetric) tmpNoi;
						return new Object[] { _this, tClass, nii, noi };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HInvocationRelationCalculator_0_1_ActivityNode6_greenBBFBB(
			HInvocationRelationCalculator _this, TClass tClass, HNumberOfIncommingInvocationsMetric nii,
			HNumberOfOutgoingInvocationsMetric noi) {
		HInvocationRelation metric = MetricsFactory.eINSTANCE.createHInvocationRelation();
		double _localVariable_0 = _this.calculateInvocValue(nii, noi);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		metric.setHNumberOfOutgoingInvocationsMetric(noi);
		metric.setHNumberOfIncommingInvocationsMetric(nii);
		nii.getPartOf().add(metric);
		noi.getPartOf().add(metric);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, tClass, metric, nii, noi };
	}

	public static final HMetric pattern_HInvocationRelationCalculator_0_2_expressionFB(HInvocationRelation metric) {
		HMetric _result = metric;
		return _result;
	}

	public static final Object[] pattern_HInvocationRelationCalculator_2_1_ActivityNode15_blackBBFF(
			HInvocationRelationCalculator _this, TClass tClass) {
		for (TAnnotation tmpNii : tClass.getTAnnotation()) {
			if (tmpNii instanceof HNumberOfIncommingInvocationsMetric) {
				HNumberOfIncommingInvocationsMetric nii = (HNumberOfIncommingInvocationsMetric) tmpNii;
				for (TAnnotation tmpNoi : tClass.getTAnnotation()) {
					if (tmpNoi instanceof HNumberOfOutgoingInvocationsMetric) {
						HNumberOfOutgoingInvocationsMetric noi = (HNumberOfOutgoingInvocationsMetric) tmpNoi;
						return new Object[] { _this, tClass, nii, noi };
					}
				}
			}
		}
		return null;
	}

	public static final double pattern_HInvocationRelationCalculator_2_2_expressionFBBB(
			HInvocationRelationCalculator _this, HNumberOfIncommingInvocationsMetric nii,
			HNumberOfOutgoingInvocationsMetric noi) {
		double _localVariable_0 = _this.calculateInvocValue(nii, noi);
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Relation between Incoming and Outgoing Invocations";
	}
	// [user code injected with eMoflon] -->
} //HInvocationRelationCalculatorImpl
