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
import org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HManyParametersDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMany Parameters Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HManyParametersDetectorImpl extends HCodeSmellDetectorImpl implements HManyParametersDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HManyParametersDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HMANY_PARAMETERS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		// ActivityNode59
		Object[] result1_black = HManyParametersDetectorImpl
				.pattern_HManyParametersDetector_0_1_ActivityNode59_blackBF(tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode59] failed." + " Variables: "
					+ "[tClass] = " + tClass + ".");
		}
		HAverageParametersMetric parameters = (HAverageParametersMetric) result1_black[1];
		// ActivityNode60
		Object[] result2_bindingAndBlack = HManyParametersDetectorImpl
				.pattern_HManyParametersDetector_0_2_ActivityNode60_bindingAndBlackFB(parameters);
		if (result2_bindingAndBlack != null) {
			// HRelativeValue relative = (HRelativeValue) result2_bindingAndBlack[0];

			// ActivityNode61
			Object[] result3_black = HManyParametersDetectorImpl
					.pattern_HManyParametersDetector_0_3_ActivityNode61_blackBBB(this, tClass, parameters);
			if (result3_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode61] failed." + " Variables: " + "[this] = " + this + ", "
								+ "[tClass] = " + tClass + ", " + "[parameters] = " + parameters + ".");
			}
			Object[] result3_green = HManyParametersDetectorImpl
					.pattern_HManyParametersDetector_0_3_ActivityNode61_greenBBFB(this, tClass, parameters);
			HManyParametersCodeSmell smell = (HManyParametersCodeSmell) result3_green[2];

			return HManyParametersDetectorImpl.pattern_HManyParametersDetector_0_4_expressionFB(smell);
		} else {
			return HManyParametersDetectorImpl.pattern_HManyParametersDetector_0_5_expressionF();
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
				return CodesmellsPackage.HMANY_PARAMETERS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HMANY_PARAMETERS_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HMANY_PARAMETERS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case CodesmellsPackage.HMANY_PARAMETERS_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HMANY_PARAMETERS_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HManyParametersDetector_0_1_ActivityNode59_blackBF(TClass tClass) {
		for (TAnnotation tmpParameters : tClass.getTAnnotation()) {
			if (tmpParameters instanceof HAverageParametersMetric) {
				HAverageParametersMetric parameters = (HAverageParametersMetric) tmpParameters;
				return new Object[] { tClass, parameters };
			}
		}
		return null;
	}

	public static final Object[] pattern_HManyParametersDetector_0_2_ActivityNode60_bindingFB(
			HAverageParametersMetric parameters) {
		HRelativeValue _localVariable_0 = parameters.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, parameters };
		}
		return null;
	}

	public static final Object[] pattern_HManyParametersDetector_0_2_ActivityNode60_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.VERY_HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HManyParametersDetector_0_2_ActivityNode60_bindingAndBlackFB(
			HAverageParametersMetric parameters) {
		Object[] result_pattern_HManyParametersDetector_0_2_ActivityNode60_binding = pattern_HManyParametersDetector_0_2_ActivityNode60_bindingFB(
				parameters);
		if (result_pattern_HManyParametersDetector_0_2_ActivityNode60_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HManyParametersDetector_0_2_ActivityNode60_binding[0];

			Object[] result_pattern_HManyParametersDetector_0_2_ActivityNode60_black = pattern_HManyParametersDetector_0_2_ActivityNode60_blackB(
					relative);
			if (result_pattern_HManyParametersDetector_0_2_ActivityNode60_black != null) {

				return new Object[] { relative, parameters };
			}
		}
		return null;
	}

	public static final Object[] pattern_HManyParametersDetector_0_3_ActivityNode61_blackBBB(
			HManyParametersDetector _this, TClass tClass, HAverageParametersMetric parameters) {
		return new Object[] { _this, tClass, parameters };
	}

	public static final Object[] pattern_HManyParametersDetector_0_3_ActivityNode61_greenBBFB(
			HManyParametersDetector _this, TClass tClass, HAverageParametersMetric parameters) {
		HManyParametersCodeSmell smell = CodesmellsFactory.eINSTANCE.createHManyParametersCodeSmell();
		_this.getHAnnotation().add(smell);
		smell.setTAnnotated(tClass);
		smell.setHAverageParametersMetric(parameters);
		parameters.getPartOf().add(smell);
		return new Object[] { _this, tClass, smell, parameters };
	}

	public static final HAnnotation pattern_HManyParametersDetector_0_4_expressionFB(HManyParametersCodeSmell smell) {
		HAnnotation _result = smell;
		return _result;
	}

	public static final HAnnotation pattern_HManyParametersDetector_0_5_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Many Parameters Code Smell";
	}
	// [user code injected with eMoflon] -->
} //HManyParametersDetectorImpl
