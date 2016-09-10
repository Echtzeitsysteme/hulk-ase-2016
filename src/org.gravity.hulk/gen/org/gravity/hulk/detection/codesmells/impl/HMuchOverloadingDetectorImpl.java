/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMuch Overloading Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HMuchOverloadingDetectorImpl extends HCodeSmellDetectorImpl implements HMuchOverloadingDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMuchOverloadingDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HMUCH_OVERLOADING_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		// ActivityNode62
		Object[] result1_black = HMuchOverloadingDetectorImpl
				.pattern_HMuchOverloadingDetector_0_1_ActivityNode62_blackBF(tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode62] failed." + " Variables: "
					+ "[tClass] = " + tClass + ".");
		}
		HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) result1_black[1];
		// ActivityNode63
		Object[] result2_bindingAndBlack = HMuchOverloadingDetectorImpl
				.pattern_HMuchOverloadingDetector_0_2_ActivityNode63_bindingAndBlackFB(over);
		if (result2_bindingAndBlack != null) {
			// HRelativeValue relative = (HRelativeValue) result2_bindingAndBlack[0];

			// ActivityNode64
			Object[] result3_black = HMuchOverloadingDetectorImpl
					.pattern_HMuchOverloadingDetector_0_3_ActivityNode64_blackBBB(this, tClass, over);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching in node [ActivityNode64] failed." + " Variables: "
						+ "[this] = " + this + ", " + "[tClass] = " + tClass + ", " + "[over] = " + over + ".");
			}
			Object[] result3_green = HMuchOverloadingDetectorImpl
					.pattern_HMuchOverloadingDetector_0_3_ActivityNode64_greenBBFB(this, tClass, over);
			HMuchOverloadingCodeSmell smell = (HMuchOverloadingCodeSmell) result3_green[2];

			return HMuchOverloadingDetectorImpl.pattern_HMuchOverloadingDetector_0_4_expressionFB(smell);
		} else {
			return HMuchOverloadingDetectorImpl.pattern_HMuchOverloadingDetector_0_5_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph pg) {// ForEach ActivityNode6
		for (Object[] result1_black : HClassBasedCalculatorImpl
				.pattern_HClassBasedCalculator_1_1_ActivityNode6_blackFBFB(pg, this)) {
			TClass tClass = (TClass) result1_black[0];
			// TypeGraph o = (TypeGraph) result1_black[2];
			// ActivityNode7
			Object[] result2_bindingAndBlack = HClassBasedCalculatorImpl
					.pattern_HClassBasedCalculator_1_2_ActivityNode7_bindingAndBlackFBBB(tClass, this, pg);
			if (result2_bindingAndBlack != null) {
				HAnnotation metric = (HAnnotation) result2_bindingAndBlack[0];
				HClassBasedCalculatorImpl.pattern_HClassBasedCalculator_1_2_ActivityNode7_greenBBBB(metric, tClass,
						this, pg);

			} else {
			}

		}
		return HClassBasedCalculatorImpl.pattern_HClassBasedCalculator_1_3_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == HDetector.class) {
			switch (baseOperationID) {
			case HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_1_ActivityNode62_blackBF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HAverageOverloadingInClassMetric) {
				HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) tmpOver;
				return new Object[] { tClass, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_2_ActivityNode63_bindingFB(
			HAverageOverloadingInClassMetric over) {
		HRelativeValue _localVariable_0 = over.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, over };
		}
		return null;
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_2_ActivityNode63_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_2_ActivityNode63_bindingAndBlackFB(
			HAverageOverloadingInClassMetric over) {
		Object[] result_pattern_HMuchOverloadingDetector_0_2_ActivityNode63_binding = pattern_HMuchOverloadingDetector_0_2_ActivityNode63_bindingFB(
				over);
		if (result_pattern_HMuchOverloadingDetector_0_2_ActivityNode63_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HMuchOverloadingDetector_0_2_ActivityNode63_binding[0];

			Object[] result_pattern_HMuchOverloadingDetector_0_2_ActivityNode63_black = pattern_HMuchOverloadingDetector_0_2_ActivityNode63_blackB(
					relative);
			if (result_pattern_HMuchOverloadingDetector_0_2_ActivityNode63_black != null) {

				return new Object[] { relative, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_3_ActivityNode64_blackBBB(
			HMuchOverloadingDetector _this, TClass tClass, HAverageOverloadingInClassMetric over) {
		return new Object[] { _this, tClass, over };
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_3_ActivityNode64_greenBBFB(
			HMuchOverloadingDetector _this, TClass tClass, HAverageOverloadingInClassMetric over) {
		HMuchOverloadingCodeSmell smell = CodesmellsFactory.eINSTANCE.createHMuchOverloadingCodeSmell();
		_this.getHAnnotation().add(smell);
		smell.setTAnnotated(tClass);
		smell.setHAverageOverloadingInClassMetric(over);
		over.getPartOf().add(smell);
		return new Object[] { _this, tClass, smell, over };
	}

	public static final HAnnotation pattern_HMuchOverloadingDetector_0_4_expressionFB(HMuchOverloadingCodeSmell smell) {
		HAnnotation _result = smell;
		return _result;
	}

	public static final HAnnotation pattern_HMuchOverloadingDetector_0_5_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Much Overloading Code Smell";
	}
	// [user code injected with eMoflon] -->
} //HMuchOverloadingDetectorImpl
