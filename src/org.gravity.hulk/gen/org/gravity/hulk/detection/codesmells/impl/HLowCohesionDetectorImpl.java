/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;

import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HLowCohesionDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLow Cohesion Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLowCohesionDetectorImpl extends HClassBasedCalculatorImpl implements HLowCohesionDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLowCohesionDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLOW_COHESION_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// ActivityNode30
		Object[] result1_black = HLowCohesionDetectorImpl
				.pattern_HLowCohesionDetector_0_1_ActivityNode30_blackFB(tClass);
		if (result1_black != null) {
			HLCOM5Metric lcom = (HLCOM5Metric) result1_black[0];

			// ActivityNode80
			Object[] result2_bindingAndBlack = HLowCohesionDetectorImpl
					.pattern_HLowCohesionDetector_0_2_ActivityNode80_bindingAndBlackFB(lcom);
			if (result2_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [ActivityNode80] failed." + " Variables: "
						+ "[lcom] = " + lcom + ".");
			}
			HRelativeValue relative = (HRelativeValue) result2_bindingAndBlack[0];
			// ActivityNode31
			Object[] result3_black = HLowCohesionDetectorImpl
					.pattern_HLowCohesionDetector_0_3_ActivityNode31_blackB(relative);
			if (result3_black != null) {
			} else {
				// ActivityNode31
				Object[] result4_black = HLowCohesionDetectorImpl
						.pattern_HLowCohesionDetector_0_4_ActivityNode31_blackB(relative);
				if (result4_black != null) {
				} else {
					return HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_5_expressionF();
				}

			}
			// ActivityNode32
			Object[] result6_black = HLowCohesionDetectorImpl
					.pattern_HLowCohesionDetector_0_6_ActivityNode32_blackBBB(lcom, tClass, this);
			if (result6_black != null) {
				Object[] result6_green = HLowCohesionDetectorImpl
						.pattern_HLowCohesionDetector_0_6_ActivityNode32_greenBFBB(lcom, tClass, this);
				HLowCohesionSmell smell = (HLowCohesionSmell) result6_green[1];

				return HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_7_expressionFB(smell);
			} else {
				return HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_8_expressionF();
			}

		} else {
			return HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_9_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLowCohesionDetector_0_1_ActivityNode30_blackFB(TClass tClass) {
		boolean tClass_tLib = tClass.isTLib();
		if (Boolean.valueOf(tClass_tLib).equals(false)) {
			for (TAnnotation tmpLcom : tClass.getTAnnotation()) {
				if (tmpLcom instanceof HLCOM5Metric) {
					HLCOM5Metric lcom = (HLCOM5Metric) tmpLcom;
					return new Object[] { lcom, tClass };
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_HLowCohesionDetector_0_2_ActivityNode80_bindingFB(HLCOM5Metric lcom) {
		HRelativeValue _localVariable_0 = lcom.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, lcom };
		}
		return null;
	}

	public static final Object[] pattern_HLowCohesionDetector_0_2_ActivityNode80_blackB(HRelativeValue relative) {
		return new Object[] { relative };
	}

	public static final Object[] pattern_HLowCohesionDetector_0_2_ActivityNode80_bindingAndBlackFB(HLCOM5Metric lcom) {
		Object[] result_pattern_HLowCohesionDetector_0_2_ActivityNode80_binding = pattern_HLowCohesionDetector_0_2_ActivityNode80_bindingFB(
				lcom);
		if (result_pattern_HLowCohesionDetector_0_2_ActivityNode80_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HLowCohesionDetector_0_2_ActivityNode80_binding[0];

			Object[] result_pattern_HLowCohesionDetector_0_2_ActivityNode80_black = pattern_HLowCohesionDetector_0_2_ActivityNode80_blackB(
					relative);
			if (result_pattern_HLowCohesionDetector_0_2_ActivityNode80_black != null) {

				return new Object[] { relative, lcom };
			}
		}
		return null;
	}

	public static final Object[] pattern_HLowCohesionDetector_0_3_ActivityNode31_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.VERY_HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HLowCohesionDetector_0_4_ActivityNode31_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final HAnnotation pattern_HLowCohesionDetector_0_5_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HLowCohesionDetector_0_6_ActivityNode32_blackBBB(HLCOM5Metric lcom,
			TClass tClass, HLowCohesionDetector _this) {
		return new Object[] { lcom, tClass, _this };
	}

	public static final Object[] pattern_HLowCohesionDetector_0_6_ActivityNode32_greenBFBB(HLCOM5Metric lcom,
			TClass tClass, HLowCohesionDetector _this) {
		HLowCohesionSmell smell = CodesmellsFactory.eINSTANCE.createHLowCohesionSmell();
		lcom.getPartOf().add(smell);
		smell.setTAnnotated(tClass);
		smell.setHLCOM5(lcom);
		_this.getHAnnotation().add(smell);
		return new Object[] { lcom, smell, tClass, _this };
	}

	public static final HAnnotation pattern_HLowCohesionDetector_0_7_expressionFB(HLowCohesionSmell smell) {
		HAnnotation _result = smell;
		return _result;
	}

	public static final HAnnotation pattern_HLowCohesionDetector_0_8_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HLowCohesionDetector_0_9_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Low Cohesion Smell";
	}
	// [user code injected with eMoflon] -->
} //HLowCohesionDetectorImpl
