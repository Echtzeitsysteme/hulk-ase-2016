/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector;

import org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TAnnotationType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSwiss Army Knife Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSwissArmyKnifeDetectorImpl extends HAntiPatternDetectorImpl implements HSwissArmyKnifeDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSwissArmyKnifeDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HSWISS_ARMY_KNIFE_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// ActivityNode38
		Object[] result1_black = HSwissArmyKnifeDetectorImpl
				.pattern_HSwissArmyKnifeDetector_0_1_ActivityNode38_blackBFFF(tClass);
		if (result1_black != null) {
			HMuchOverloadingCodeSmell over = (HMuchOverloadingCodeSmell) result1_black[1];
			HLargeClassSmell large = (HLargeClassSmell) result1_black[2];
			HNumberOfIncommingInvocationsMetric invoc = (HNumberOfIncommingInvocationsMetric) result1_black[3];
			// ActivityNode39
			Object[] result2_bindingAndBlack = HSwissArmyKnifeDetectorImpl
					.pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_bindingAndBlackFB(invoc);
			if (result2_bindingAndBlack != null) {
				// HRelativeValue relative = (HRelativeValue) result2_bindingAndBlack[0];
			} else {
				// ActivityNode39
				Object[] result3_bindingAndBlack = HSwissArmyKnifeDetectorImpl
						.pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_bindingAndBlackFB(invoc);
				if (result3_bindingAndBlack != null) {
					// HRelativeValue relative = (HRelativeValue) result3_bindingAndBlack[0];
				} else {
					return HSwissArmyKnifeDetectorImpl.pattern_HSwissArmyKnifeDetector_0_4_expressionF();
				}

			}

			// ActivityNode40
			Object[] result5_black = HSwissArmyKnifeDetectorImpl
					.pattern_HSwissArmyKnifeDetector_0_5_ActivityNode40_blackBBBBB(tClass, this, large, invoc, over);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [ActivityNode40] failed." + " Variables: "
						+ "[tClass] = " + tClass + ", " + "[this] = " + this + ", " + "[large] = " + large + ", "
						+ "[invoc] = " + invoc + ", " + "[over] = " + over + ".");
			}
			Object[] result5_green = HSwissArmyKnifeDetectorImpl
					.pattern_HSwissArmyKnifeDetector_0_5_ActivityNode40_greenBBFBBB(tClass, this, large, invoc, over);
			HSwissArmyKnifeAntiPattern pattern = (HSwissArmyKnifeAntiPattern) result5_green[2];

			// ActivityNode70
			Object[] result6_black = HSwissArmyKnifeDetectorImpl
					.pattern_HSwissArmyKnifeDetector_0_6_ActivityNode70_blackBFF(tClass);
			if (result6_black != null) {
				TAnnotationType type = (TAnnotationType) result6_black[1];
				// TypeGraph pg = (TypeGraph) result6_black[2];
				HSwissArmyKnifeDetectorImpl.pattern_HSwissArmyKnifeDetector_0_6_ActivityNode70_greenBBFB(tClass, type,
						this);
				// TAnnotation tAnnotation = (TAnnotation) result6_green[2];

			} else {
			}
			return HSwissArmyKnifeDetectorImpl.pattern_HSwissArmyKnifeDetector_0_7_expressionFB(pattern);
		} else {
			return HSwissArmyKnifeDetectorImpl.pattern_HSwissArmyKnifeDetector_0_8_expressionF();
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
				return AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_1_ActivityNode38_blackBFFF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HMuchOverloadingCodeSmell) {
				HMuchOverloadingCodeSmell over = (HMuchOverloadingCodeSmell) tmpOver;
				for (TAnnotation tmpLarge : tClass.getTAnnotation()) {
					if (tmpLarge instanceof HLargeClassSmell) {
						HLargeClassSmell large = (HLargeClassSmell) tmpLarge;
						for (TAnnotation tmpInvoc : tClass.getTAnnotation()) {
							if (tmpInvoc instanceof HNumberOfIncommingInvocationsMetric) {
								HNumberOfIncommingInvocationsMetric invoc = (HNumberOfIncommingInvocationsMetric) tmpInvoc;
								return new Object[] { tClass, over, large, invoc };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_bindingFB(
			HNumberOfIncommingInvocationsMetric invoc) {
		HRelativeValue _localVariable_0 = invoc.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, invoc };
		}
		return null;
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_bindingAndBlackFB(
			HNumberOfIncommingInvocationsMetric invoc) {
		Object[] result_pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_binding = pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_bindingFB(
				invoc);
		if (result_pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_binding[0];

			Object[] result_pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_black = pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_blackB(
					relative);
			if (result_pattern_HSwissArmyKnifeDetector_0_2_ActivityNode39_black != null) {

				return new Object[] { relative, invoc };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_bindingFB(
			HNumberOfIncommingInvocationsMetric invoc) {
		HRelativeValue _localVariable_1 = invoc.getRelativeAmount();
		HRelativeValue relative = _localVariable_1;
		if (relative != null) {
			return new Object[] { relative, invoc };
		}
		return null;
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.VERY_HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_bindingAndBlackFB(
			HNumberOfIncommingInvocationsMetric invoc) {
		Object[] result_pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_binding = pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_bindingFB(
				invoc);
		if (result_pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_binding[0];

			Object[] result_pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_black = pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_blackB(
					relative);
			if (result_pattern_HSwissArmyKnifeDetector_0_3_ActivityNode39_black != null) {

				return new Object[] { relative, invoc };
			}
		}
		return null;
	}

	public static final HAnnotation pattern_HSwissArmyKnifeDetector_0_4_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_5_ActivityNode40_blackBBBBB(TClass tClass,
			HSwissArmyKnifeDetector _this, HLargeClassSmell large, HNumberOfIncommingInvocationsMetric invoc,
			HMuchOverloadingCodeSmell over) {
		return new Object[] { tClass, _this, large, invoc, over };
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_5_ActivityNode40_greenBBFBBB(TClass tClass,
			HSwissArmyKnifeDetector _this, HLargeClassSmell large, HNumberOfIncommingInvocationsMetric invoc,
			HMuchOverloadingCodeSmell over) {
		HSwissArmyKnifeAntiPattern pattern = AntipatternFactory.eINSTANCE.createHSwissArmyKnifeAntiPattern();
		_this.getHAnnotation().add(pattern);
		pattern.setTAnnotated(tClass);
		pattern.setHLargeClassSmell(large);
		pattern.setHMuchOverloadingCodeSmell(over);
		pattern.setHNumberOfIncommingInvocationsMetric(invoc);
		large.getPartOf().add(pattern);
		invoc.getPartOf().add(pattern);
		over.getPartOf().add(pattern);
		return new Object[] { tClass, _this, pattern, large, invoc, over };
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_6_ActivityNode70_blackBFF(TClass tClass) {
		TypeGraph pg = tClass.getPg();
		if (pg != null) {
			for (TAnnotationType type : pg.getTAnnotationTypes()) {
				String type_tName = type.getTName();
				if (type_tName.equals("SwissArmyKnife")) {
					return new Object[] { tClass, type, pg };
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_6_ActivityNode70_greenBBFB(TClass tClass,
			TAnnotationType type, HSwissArmyKnifeDetector _this) {
		TAnnotation tAnnotation = BasicFactory.eINSTANCE.createTAnnotation();
		int _localVariable_0 = _this.getNextID();
		type.getAnnotations().add(tAnnotation);
		tAnnotation.setTAnnotated(tClass);
		int tAnnotation_ID_prime = Integer.valueOf(_localVariable_0);
		tAnnotation.setID(Integer.valueOf(tAnnotation_ID_prime));
		return new Object[] { tClass, type, tAnnotation, _this };
	}

	public static final HAnnotation pattern_HSwissArmyKnifeDetector_0_7_expressionFB(
			HSwissArmyKnifeAntiPattern pattern) {
		HAnnotation _result = pattern;
		return _result;
	}

	public static final HAnnotation pattern_HSwissArmyKnifeDetector_0_8_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Swiss Army Knife";
	}
	// [user code injected with eMoflon] -->
} //HSwissArmyKnifeDetectorImpl
