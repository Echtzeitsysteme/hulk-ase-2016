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
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;

import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HContollerClassDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HContoller Class Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HContollerClassDetectorImpl extends HCodeSmellDetectorImpl implements HContollerClassDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HContollerClassDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HCONTOLLER_CLASS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		// ActivityNode38
		Object[] result1_black = HContollerClassDetectorImpl
				.pattern_HContollerClassDetector_0_1_ActivityNode38_blackBF(tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode38] failed." + " Variables: "
					+ "[tClass] = " + tClass + ".");
		}
		HInvocationRelation relation = (HInvocationRelation) result1_black[1];

		// ActivityNode72
		Object[] result2_bindingAndBlack = HContollerClassDetectorImpl
				.pattern_HContollerClassDetector_0_2_ActivityNode72_bindingAndBlackFB(relation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode72] failed." + " Variables: "
					+ "[relation] = " + relation + ".");
		}
		HRelativeValue relative = (HRelativeValue) result2_bindingAndBlack[0];
		// ActivityNode42
		Object[] result3_black = HContollerClassDetectorImpl
				.pattern_HContollerClassDetector_0_3_ActivityNode42_blackB(relative);
		if (result3_black != null) {
		} else {
			// ActivityNode42
			Object[] result4_black = HContollerClassDetectorImpl
					.pattern_HContollerClassDetector_0_4_ActivityNode42_blackB(relative);
			if (result4_black != null) {
			} else {
				// ActivityNode42
				Object[] result5_black = HContollerClassDetectorImpl
						.pattern_HContollerClassDetector_0_5_ActivityNode42_blackB(relative);
				if (result5_black != null) {
				} else {
					return HContollerClassDetectorImpl.pattern_HContollerClassDetector_0_6_expressionF();
				}

			}

		}

		// ActivityNode58
		Object[] result7_black = HContollerClassDetectorImpl
				.pattern_HContollerClassDetector_0_7_ActivityNode58_blackBBB(tClass, this, relation);
		if (result7_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode58] failed." + " Variables: "
					+ "[tClass] = " + tClass + ", " + "[this] = " + this + ", " + "[relation] = " + relation + ".");
		}
		Object[] result7_green = HContollerClassDetectorImpl
				.pattern_HContollerClassDetector_0_7_ActivityNode58_greenBBFB(tClass, this, relation);
		HControllerClassSmell controller = (HControllerClassSmell) result7_green[2];

		return HContollerClassDetectorImpl.pattern_HContollerClassDetector_0_8_expressionFB(controller);
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
				return CodesmellsPackage.HCONTOLLER_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HCONTOLLER_CLASS_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HCONTOLLER_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case CodesmellsPackage.HCONTOLLER_CLASS_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HCONTOLLER_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HContollerClassDetector_0_1_ActivityNode38_blackBF(TClass tClass) {
		for (TAnnotation tmpRelation : tClass.getTAnnotation()) {
			if (tmpRelation instanceof HInvocationRelation) {
				HInvocationRelation relation = (HInvocationRelation) tmpRelation;
				return new Object[] { tClass, relation };
			}
		}
		return null;
	}

	public static final Object[] pattern_HContollerClassDetector_0_2_ActivityNode72_bindingFB(
			HInvocationRelation relation) {
		HRelativeValue _localVariable_0 = relation.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, relation };
		}
		return null;
	}

	public static final Object[] pattern_HContollerClassDetector_0_2_ActivityNode72_blackB(HRelativeValue relative) {
		return new Object[] { relative };
	}

	public static final Object[] pattern_HContollerClassDetector_0_2_ActivityNode72_bindingAndBlackFB(
			HInvocationRelation relation) {
		Object[] result_pattern_HContollerClassDetector_0_2_ActivityNode72_binding = pattern_HContollerClassDetector_0_2_ActivityNode72_bindingFB(
				relation);
		if (result_pattern_HContollerClassDetector_0_2_ActivityNode72_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HContollerClassDetector_0_2_ActivityNode72_binding[0];

			Object[] result_pattern_HContollerClassDetector_0_2_ActivityNode72_black = pattern_HContollerClassDetector_0_2_ActivityNode72_blackB(
					relative);
			if (result_pattern_HContollerClassDetector_0_2_ActivityNode72_black != null) {

				return new Object[] { relative, relation };
			}
		}
		return null;
	}

	public static final Object[] pattern_HContollerClassDetector_0_3_ActivityNode42_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.VERY_HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HContollerClassDetector_0_4_ActivityNode42_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HContollerClassDetector_0_5_ActivityNode42_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.MEDIUM)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final HAnnotation pattern_HContollerClassDetector_0_6_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HContollerClassDetector_0_7_ActivityNode58_blackBBB(TClass tClass,
			HContollerClassDetector _this, HInvocationRelation relation) {
		return new Object[] { tClass, _this, relation };
	}

	public static final Object[] pattern_HContollerClassDetector_0_7_ActivityNode58_greenBBFB(TClass tClass,
			HContollerClassDetector _this, HInvocationRelation relation) {
		HControllerClassSmell controller = CodesmellsFactory.eINSTANCE.createHControllerClassSmell();
		_this.getHAnnotation().add(controller);
		controller.setTAnnotated(tClass);
		controller.setHInvocationRelation(relation);
		relation.getPartOf().add(controller);
		return new Object[] { tClass, _this, controller, relation };
	}

	public static final HAnnotation pattern_HContollerClassDetector_0_8_expressionFB(HControllerClassSmell controller) {
		HAnnotation _result = controller;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	private final String[] controller_names = { "main", "run", "controller", "process", "control", "ctrl", "system",
			"cmd" };

	@Override
	public String getGuiName() {
		return "Controller Class Smell";
	}
	// [user code injected with eMoflon] -->
} //HContollerClassDetectorImpl
