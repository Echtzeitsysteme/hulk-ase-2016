/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TAnnotationType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
import java.util.ArrayList;
import java.util.List;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSpaghetti Code Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSpaghettiCodeDetectorImpl extends HClassBasedCalculatorImpl implements HSpaghettiCodeDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSpaghettiCodeDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HSPAGHETTI_CODE_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		// ActivityNode55
		Object[] result1_black = HSpaghettiCodeDetectorImpl
				.pattern_HSpaghettiCodeDetector_0_1_ActivityNode55_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode55] failed." + " Variables: " + "[this] = " + this + ".");
		}
		// ActivityNode41
		Object[] result2_black = HSpaghettiCodeDetectorImpl
				.pattern_HSpaghettiCodeDetector_0_2_ActivityNode41_blackBF(tClass);
		if (result2_black != null) {
			// HLargeClassSmell large = (HLargeClassSmell) result2_black[1];
			return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_3_expressionF();
		} else {
			// ActivityNode43
			Object[] result4_black = HSpaghettiCodeDetectorImpl
					.pattern_HSpaghettiCodeDetector_0_4_ActivityNode43_blackBF(tClass);
			if (result4_black != null) {
				HIntenseFieldUsageCodeSmell field = (HIntenseFieldUsageCodeSmell) result4_black[1];
				// ActivityNode45
				HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_5_ActivityNode45_expressionFBB(this, field);

				// ActivityNode42
				Object[] result6_black = HSpaghettiCodeDetectorImpl
						.pattern_HSpaghettiCodeDetector_0_6_ActivityNode42_blackBF(tClass);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching in node [ActivityNode42] failed." + " Variables: "
							+ "[tClass] = " + tClass + ".");
				}
				HAverageParametersMetric param = (HAverageParametersMetric) result6_black[1];
				// ActivityNode57
				Object[] result7_bindingAndBlack = HSpaghettiCodeDetectorImpl
						.pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_bindingAndBlackFB(param);
				if (result7_bindingAndBlack != null) {
					// HRelativeValue pRelative = (HRelativeValue) result7_bindingAndBlack[0];
					// ActivityNode46
					HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_8_ActivityNode46_expressionFBB(this,
							param);

					// ActivityNode42
					Object[] result9_black = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_9_ActivityNode42_blackBF(tClass);
					if (result9_black == null) {
						throw new RuntimeException("Pattern matching in node [ActivityNode42] failed." + " Variables: "
								+ "[tClass] = " + tClass + ".");
					}
					HDepthOfInheritanceMetric inher = (HDepthOfInheritanceMetric) result9_black[1];
					// ActivityNode58
					Object[] result10_bindingAndBlack = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_bindingAndBlackFB(inher);
					if (result10_bindingAndBlack != null) {
						// HRelativeValue iRelative = (HRelativeValue) result10_bindingAndBlack[0];
						// ActivityNode48
						HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_11_ActivityNode48_expressionFBB(this, inher);

						// ActivityNode42
						Object[] result12_black = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_12_ActivityNode42_blackBF(tClass);
						if (result12_black == null) {
							throw new RuntimeException("Pattern matching in node [ActivityNode42] failed."
									+ " Variables: " + "[tClass] = " + tClass + ".");
						}
						HNumberOfChildMetric child = (HNumberOfChildMetric) result12_black[1];
						// ActivityNode60
						Object[] result13_bindingAndBlack = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_bindingAndBlackFB(child);
						if (result13_bindingAndBlack != null) {
							// HRelativeValue cRelative = (HRelativeValue) result13_bindingAndBlack[0];
							// ActivityNode49
							HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_14_ActivityNode49_expressionFBB(this, child);

						} else {
						}

						// ActivityNode42
						Object[] result15_black = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_15_ActivityNode42_blackBF(tClass);
						if (result15_black == null) {
							throw new RuntimeException("Pattern matching in node [ActivityNode42] failed."
									+ " Variables: " + "[tClass] = " + tClass + ".");
						}
						HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) result15_black[1];
						// ActivityNode63
						Object[] result16_bindingAndBlack = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_bindingAndBlackFB(over);
						if (result16_bindingAndBlack != null) {
							// HRelativeValue oRelative = (HRelativeValue) result16_bindingAndBlack[0];
							// ActivityNode51
							HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_17_ActivityNode51_expressionFBB(this, over);

						} else {
						}

					} else {

						// ActivityNode42
						Object[] result18_black = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_18_ActivityNode42_blackBF(tClass);
						if (result18_black == null) {
							throw new RuntimeException("Pattern matching in node [ActivityNode42] failed."
									+ " Variables: " + "[tClass] = " + tClass + ".");
						}
						HNumberOfChildMetric child = (HNumberOfChildMetric) result18_black[1];
						// ActivityNode59
						Object[] result19_bindingAndBlack = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_bindingAndBlackFB(child);
						if (result19_bindingAndBlack != null) {
							// HRelativeValue cRelative = (HRelativeValue) result19_bindingAndBlack[0];
							// ActivityNode50
							HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_20_ActivityNode50_expressionFBB(this, child);

							// ActivityNode42
							Object[] result21_black = HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_21_ActivityNode42_blackBF(tClass);
							if (result21_black == null) {
								throw new RuntimeException("Pattern matching in node [ActivityNode42] failed."
										+ " Variables: " + "[tClass] = " + tClass + ".");
							}
							HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) result21_black[1];
							// ActivityNode62
							Object[] result22_bindingAndBlack = HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_bindingAndBlackFB(over);
							if (result22_bindingAndBlack != null) {
								// HRelativeValue oRelative = (HRelativeValue) result22_bindingAndBlack[0];
								// ActivityNode52
								HSpaghettiCodeDetectorImpl
										.pattern_HSpaghettiCodeDetector_0_23_ActivityNode52_expressionFBB(this, over);

							} else {
							}

						} else {

							// ActivityNode42
							Object[] result24_black = HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_24_ActivityNode42_blackBF(tClass);
							if (result24_black == null) {
								throw new RuntimeException("Pattern matching in node [ActivityNode42] failed."
										+ " Variables: " + "[tClass] = " + tClass + ".");
							}
							HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) result24_black[1];
							// ActivityNode61
							Object[] result25_bindingAndBlack = HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_bindingAndBlackFB(over);
							if (result25_bindingAndBlack != null) {
								// HRelativeValue oRelative = (HRelativeValue) result25_bindingAndBlack[0];
								// ActivityNode53
								HSpaghettiCodeDetectorImpl
										.pattern_HSpaghettiCodeDetector_0_26_ActivityNode53_expressionFBB(this, over);

							} else {
								return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_27_expressionF();
							}

						}

					}

					// ActivityNode44
					Object[] result28_black = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_28_ActivityNode44_blackBB(tClass, this);
					if (result28_black == null) {
						throw new RuntimeException("Pattern matching in node [ActivityNode44] failed." + " Variables: "
								+ "[tClass] = " + tClass + ", " + "[this] = " + this + ".");
					}
					Object[] result28_green = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_28_ActivityNode44_greenBFB(tClass, this);
					HSpaghettiCodeAntiPattern anti = (HSpaghettiCodeAntiPattern) result28_green[1];

					// ActivityNode54
					HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_29_ActivityNode54_expressionFBB(this,
							anti);
					// ActivityNode71
					Object[] result30_black = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_30_ActivityNode71_blackFBF(tClass);
					if (result30_black != null) {
						TAnnotationType tType = (TAnnotationType) result30_black[0];
						// TypeGraph pg = (TypeGraph) result30_black[2];
						HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_30_ActivityNode71_greenFBBB(tType,
								tClass, this);
						// TAnnotation tAnnotation = (TAnnotation) result30_green[0];

					} else {
					}
					return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_31_expressionFB(anti);
				} else {
					return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_32_expressionF();
				}

			} else {
				return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_33_expressionF();
			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean collect(HAnnotation hAnnotation) {
		// [user code injected with eMoflon]
		return annotations.add(hAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean connect(HSpaghettiCodeAntiPattern hAntiPattern) {
		// [user code injected with eMoflon]
		for (HAnnotation a : annotations) {
			a.getPartOf().add(hAntiPattern);
			if (a instanceof HIntenseFieldUsageCodeSmell) {
				hAntiPattern.setHIntenseFieldUsageCodeSmell((HIntenseFieldUsageCodeSmell) a);
			} else if (a instanceof HAverageParametersMetric) {
				hAntiPattern.setHAverageParametersMetric((HAverageParametersMetric) a);
			} else if (a instanceof HAverageOverloadingInClassMetric) {
				hAntiPattern.setHAverageOverloadingInClassMetric((HAverageOverloadingInClassMetric) a);
			} else if (a instanceof HNumberOfChildMetric) {
				hAntiPattern.setHNumberOfChild((HNumberOfChildMetric) a);
			} else if (a instanceof HDepthOfInheritanceMetric) {
				hAntiPattern.setHDepthOfInheritance((HDepthOfInheritanceMetric) a);
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___COLLECT__HANNOTATION:
			return collect((HAnnotation) arguments.get(0));
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___CONNECT__HSPAGHETTICODEANTIPATTERN:
			return connect((HSpaghettiCodeAntiPattern) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_1_ActivityNode55_blackB(
			HSpaghettiCodeDetector _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_2_ActivityNode41_blackBF(TClass tClass) {
		for (TAnnotation tmpLarge : tClass.getTAnnotation()) {
			if (tmpLarge instanceof HLargeClassSmell) {
				HLargeClassSmell large = (HLargeClassSmell) tmpLarge;
				return new Object[] { tClass, large };
			}
		}
		return null;
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_3_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_4_ActivityNode43_blackBF(TClass tClass) {
		for (TAnnotation tmpField : tClass.getTAnnotation()) {
			if (tmpField instanceof HIntenseFieldUsageCodeSmell) {
				HIntenseFieldUsageCodeSmell field = (HIntenseFieldUsageCodeSmell) tmpField;
				return new Object[] { tClass, field };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_5_ActivityNode45_expressionFBB(
			HSpaghettiCodeDetector _this, HIntenseFieldUsageCodeSmell field) {
		boolean _localVariable_0 = _this.collect(field);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_6_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpParam : tClass.getTAnnotation()) {
			if (tmpParam instanceof HAverageParametersMetric) {
				HAverageParametersMetric param = (HAverageParametersMetric) tmpParam;
				return new Object[] { tClass, param };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_bindingFB(
			HAverageParametersMetric param) {
		HRelativeValue _localVariable_0 = param.getRelativeAmount();
		HRelativeValue pRelative = _localVariable_0;
		if (pRelative != null) {
			return new Object[] { pRelative, param };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_blackB(HRelativeValue pRelative) {
		HRelativeValueConstants pRelative_value = pRelative.getValue();
		if (pRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { pRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_bindingAndBlackFB(
			HAverageParametersMetric param) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_binding = pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_bindingFB(
				param);
		if (result_pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_binding != null) {
			HRelativeValue pRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_black = pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_blackB(
					pRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_7_ActivityNode57_black != null) {

				return new Object[] { pRelative, param };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_8_ActivityNode46_expressionFBB(
			HSpaghettiCodeDetector _this, HAverageParametersMetric param) {
		boolean _localVariable_0 = _this.collect(param);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_9_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpInher : tClass.getTAnnotation()) {
			if (tmpInher instanceof HDepthOfInheritanceMetric) {
				HDepthOfInheritanceMetric inher = (HDepthOfInheritanceMetric) tmpInher;
				return new Object[] { tClass, inher };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_bindingFB(
			HDepthOfInheritanceMetric inher) {
		HRelativeValue _localVariable_0 = inher.getRelativeAmount();
		HRelativeValue iRelative = _localVariable_0;
		if (iRelative != null) {
			return new Object[] { iRelative, inher };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_blackB(HRelativeValue iRelative) {
		HRelativeValueConstants iRelative_value = iRelative.getValue();
		if (iRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { iRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_bindingAndBlackFB(
			HDepthOfInheritanceMetric inher) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_binding = pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_bindingFB(
				inher);
		if (result_pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_binding != null) {
			HRelativeValue iRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_black = pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_blackB(
					iRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_10_ActivityNode58_black != null) {

				return new Object[] { iRelative, inher };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_11_ActivityNode48_expressionFBB(
			HSpaghettiCodeDetector _this, HDepthOfInheritanceMetric inher) {
		boolean _localVariable_0 = _this.collect(inher);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_12_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpChild : tClass.getTAnnotation()) {
			if (tmpChild instanceof HNumberOfChildMetric) {
				HNumberOfChildMetric child = (HNumberOfChildMetric) tmpChild;
				return new Object[] { tClass, child };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_bindingFB(
			HNumberOfChildMetric child) {
		HRelativeValue _localVariable_0 = child.getRelativeAmount();
		HRelativeValue cRelative = _localVariable_0;
		if (cRelative != null) {
			return new Object[] { cRelative, child };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_blackB(HRelativeValue cRelative) {
		HRelativeValueConstants cRelative_value = cRelative.getValue();
		if (cRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { cRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_bindingAndBlackFB(
			HNumberOfChildMetric child) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_binding = pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_bindingFB(
				child);
		if (result_pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_binding != null) {
			HRelativeValue cRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_black = pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_blackB(
					cRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_13_ActivityNode60_black != null) {

				return new Object[] { cRelative, child };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_14_ActivityNode49_expressionFBB(
			HSpaghettiCodeDetector _this, HNumberOfChildMetric child) {
		boolean _localVariable_0 = _this.collect(child);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_15_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HAverageOverloadingInClassMetric) {
				HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) tmpOver;
				return new Object[] { tClass, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_bindingFB(
			HAverageOverloadingInClassMetric over) {
		HRelativeValue _localVariable_0 = over.getRelativeAmount();
		HRelativeValue oRelative = _localVariable_0;
		if (oRelative != null) {
			return new Object[] { oRelative, over };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_blackB(HRelativeValue oRelative) {
		HRelativeValueConstants oRelative_value = oRelative.getValue();
		if (oRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { oRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_bindingAndBlackFB(
			HAverageOverloadingInClassMetric over) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_binding = pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_bindingFB(
				over);
		if (result_pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_binding != null) {
			HRelativeValue oRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_black = pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_blackB(
					oRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_16_ActivityNode63_black != null) {

				return new Object[] { oRelative, over };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_17_ActivityNode51_expressionFBB(
			HSpaghettiCodeDetector _this, HAverageOverloadingInClassMetric over) {
		boolean _localVariable_0 = _this.collect(over);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_18_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpChild : tClass.getTAnnotation()) {
			if (tmpChild instanceof HNumberOfChildMetric) {
				HNumberOfChildMetric child = (HNumberOfChildMetric) tmpChild;
				return new Object[] { tClass, child };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_bindingFB(
			HNumberOfChildMetric child) {
		HRelativeValue _localVariable_0 = child.getRelativeAmount();
		HRelativeValue cRelative = _localVariable_0;
		if (cRelative != null) {
			return new Object[] { cRelative, child };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_blackB(HRelativeValue cRelative) {
		HRelativeValueConstants cRelative_value = cRelative.getValue();
		if (cRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { cRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_bindingAndBlackFB(
			HNumberOfChildMetric child) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_binding = pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_bindingFB(
				child);
		if (result_pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_binding != null) {
			HRelativeValue cRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_black = pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_blackB(
					cRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_19_ActivityNode59_black != null) {

				return new Object[] { cRelative, child };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_20_ActivityNode50_expressionFBB(
			HSpaghettiCodeDetector _this, HNumberOfChildMetric child) {
		boolean _localVariable_0 = _this.collect(child);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_21_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HAverageOverloadingInClassMetric) {
				HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) tmpOver;
				return new Object[] { tClass, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_bindingFB(
			HAverageOverloadingInClassMetric over) {
		HRelativeValue _localVariable_0 = over.getRelativeAmount();
		HRelativeValue oRelative = _localVariable_0;
		if (oRelative != null) {
			return new Object[] { oRelative, over };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_blackB(HRelativeValue oRelative) {
		HRelativeValueConstants oRelative_value = oRelative.getValue();
		if (oRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { oRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_bindingAndBlackFB(
			HAverageOverloadingInClassMetric over) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_binding = pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_bindingFB(
				over);
		if (result_pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_binding != null) {
			HRelativeValue oRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_black = pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_blackB(
					oRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_22_ActivityNode62_black != null) {

				return new Object[] { oRelative, over };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_23_ActivityNode52_expressionFBB(
			HSpaghettiCodeDetector _this, HAverageOverloadingInClassMetric over) {
		boolean _localVariable_0 = _this.collect(over);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_24_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HAverageOverloadingInClassMetric) {
				HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) tmpOver;
				return new Object[] { tClass, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_bindingFB(
			HAverageOverloadingInClassMetric over) {
		HRelativeValue _localVariable_0 = over.getRelativeAmount();
		HRelativeValue oRelative = _localVariable_0;
		if (oRelative != null) {
			return new Object[] { oRelative, over };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_blackB(HRelativeValue oRelative) {
		HRelativeValueConstants oRelative_value = oRelative.getValue();
		if (oRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { oRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_bindingAndBlackFB(
			HAverageOverloadingInClassMetric over) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_binding = pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_bindingFB(
				over);
		if (result_pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_binding != null) {
			HRelativeValue oRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_black = pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_blackB(
					oRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_25_ActivityNode61_black != null) {

				return new Object[] { oRelative, over };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_26_ActivityNode53_expressionFBB(
			HSpaghettiCodeDetector _this, HAverageOverloadingInClassMetric over) {
		boolean _localVariable_0 = _this.collect(over);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_27_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_28_ActivityNode44_blackBB(TClass tClass,
			HSpaghettiCodeDetector _this) {
		return new Object[] { tClass, _this };
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_28_ActivityNode44_greenBFB(TClass tClass,
			HSpaghettiCodeDetector _this) {
		HSpaghettiCodeAntiPattern anti = AntipatternFactory.eINSTANCE.createHSpaghettiCodeAntiPattern();
		anti.setTAnnotated(tClass);
		_this.getHAnnotation().add(anti);
		return new Object[] { tClass, anti, _this };
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_29_ActivityNode54_expressionFBB(
			HSpaghettiCodeDetector _this, HSpaghettiCodeAntiPattern anti) {
		boolean _localVariable_0 = _this.connect(anti);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_30_ActivityNode71_blackFBF(TClass tClass) {
		TypeGraph pg = tClass.getPg();
		if (pg != null) {
			for (TAnnotationType tType : pg.getTAnnotationTypes()) {
				String tType_tName = tType.getTName();
				if (tType_tName.equals("SpaghettiCode")) {
					return new Object[] { tType, tClass, pg };
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_30_ActivityNode71_greenFBBB(TAnnotationType tType,
			TClass tClass, HSpaghettiCodeDetector _this) {
		TAnnotation tAnnotation = BasicFactory.eINSTANCE.createTAnnotation();
		int _localVariable_0 = _this.getNextID();
		tAnnotation.setTAnnotated(tClass);
		tType.getAnnotations().add(tAnnotation);
		int tAnnotation_ID_prime = Integer.valueOf(_localVariable_0);
		tAnnotation.setID(Integer.valueOf(tAnnotation_ID_prime));
		return new Object[] { tAnnotation, tType, tClass, _this };
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_31_expressionFB(HSpaghettiCodeAntiPattern anti) {
		HAnnotation _result = anti;
		return _result;
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_32_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_33_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	private List<HAnnotation> annotations = new ArrayList<>();

	@Override
	public String getGuiName() {
		return "Spaghetti Code";
	}
	// [user code injected with eMoflon] -->
} //HSpaghettiCodeDetectorImpl
