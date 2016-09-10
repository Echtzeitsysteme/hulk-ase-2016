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
import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIntense Field Usage Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIntenseFieldUsageDetectorImpl extends HCodeSmellDetectorImpl implements HIntenseFieldUsageDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HIntenseFieldUsageDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HINTENSE_FIELD_USAGE_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		// ActivityNode67
		Object[] result1_black = HIntenseFieldUsageDetectorImpl
				.pattern_HIntenseFieldUsageDetector_0_1_ActivityNode67_blackBF(tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode67] failed." + " Variables: "
					+ "[tClass] = " + tClass + ".");
		}
		HLocalAccessRelationMetric hMetric = (HLocalAccessRelationMetric) result1_black[1];
		// ActivityNode68
		Object[] result2_bindingAndBlack = HIntenseFieldUsageDetectorImpl
				.pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_bindingAndBlackFB(hMetric);
		if (result2_bindingAndBlack != null) {
			// HRelativeValue relative = (HRelativeValue) result2_bindingAndBlack[0];

			// ActivityNode69
			Object[] result3_black = HIntenseFieldUsageDetectorImpl
					.pattern_HIntenseFieldUsageDetector_0_3_ActivityNode69_blackBBB(tClass, this, hMetric);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching in node [ActivityNode69] failed." + " Variables: "
						+ "[tClass] = " + tClass + ", " + "[this] = " + this + ", " + "[hMetric] = " + hMetric + ".");
			}
			Object[] result3_green = HIntenseFieldUsageDetectorImpl
					.pattern_HIntenseFieldUsageDetector_0_3_ActivityNode69_greenBFBB(tClass, this, hMetric);
			HIntenseFieldUsageCodeSmell smell = (HIntenseFieldUsageCodeSmell) result3_green[1];

			return HIntenseFieldUsageDetectorImpl.pattern_HIntenseFieldUsageDetector_0_4_expressionFB(smell);
		} else {
			return HIntenseFieldUsageDetectorImpl.pattern_HIntenseFieldUsageDetector_0_5_expressionF();
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
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_1_ActivityNode67_blackBF(TClass tClass) {
		for (TAnnotation tmpHMetric : tClass.getTAnnotation()) {
			if (tmpHMetric instanceof HLocalAccessRelationMetric) {
				HLocalAccessRelationMetric hMetric = (HLocalAccessRelationMetric) tmpHMetric;
				return new Object[] { tClass, hMetric };
			}
		}
		return null;
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_bindingFB(
			HLocalAccessRelationMetric hMetric) {
		HRelativeValue _localVariable_0 = hMetric.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, hMetric };
		}
		return null;
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.VERY_HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_bindingAndBlackFB(
			HLocalAccessRelationMetric hMetric) {
		Object[] result_pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_binding = pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_bindingFB(
				hMetric);
		if (result_pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_binding[0];

			Object[] result_pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_black = pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_blackB(
					relative);
			if (result_pattern_HIntenseFieldUsageDetector_0_2_ActivityNode68_black != null) {

				return new Object[] { relative, hMetric };
			}
		}
		return null;
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_3_ActivityNode69_blackBBB(TClass tClass,
			HIntenseFieldUsageDetector _this, HLocalAccessRelationMetric hMetric) {
		return new Object[] { tClass, _this, hMetric };
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_3_ActivityNode69_greenBFBB(TClass tClass,
			HIntenseFieldUsageDetector _this, HLocalAccessRelationMetric hMetric) {
		HIntenseFieldUsageCodeSmell smell = CodesmellsFactory.eINSTANCE.createHIntenseFieldUsageCodeSmell();
		smell.setHLocalAccessRelationMetric(hMetric);
		smell.setTAnnotated(tClass);
		_this.getHAnnotation().add(smell);
		hMetric.getPartOf().add(smell);
		return new Object[] { tClass, smell, _this, hMetric };
	}

	public static final HAnnotation pattern_HIntenseFieldUsageDetector_0_4_expressionFB(
			HIntenseFieldUsageCodeSmell smell) {
		HAnnotation _result = smell;
		return _result;
	}

	public static final HAnnotation pattern_HIntenseFieldUsageDetector_0_5_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Intense usage of local fields";
	}
	// [user code injected with eMoflon] -->
} //HIntenseFieldUsageDetectorImpl
