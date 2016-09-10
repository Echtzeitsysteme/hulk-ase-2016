/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HLargeClassDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLarge Class Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLargeClassDetectorImpl extends HClassBasedCalculatorImpl implements HLargeClassDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLargeClassDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLARGE_CLASS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// ActivityNode28
		Object[] result1_black = HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_1_ActivityNode28_blackFB(tClass);
		if (result1_black != null) {
			HNumberOfMembersMetric nm = (HNumberOfMembersMetric) result1_black[0];

			// ActivityNode71
			Object[] result2_bindingAndBlack = HLargeClassDetectorImpl
					.pattern_HLargeClassDetector_0_2_ActivityNode71_bindingAndBlackFB(nm);
			if (result2_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode71] failed." + " Variables: " + "[nm] = " + nm + ".");
			}
			HRelativeValue relative = (HRelativeValue) result2_bindingAndBlack[0];
			// ActivityNode29
			Object[] result3_black = HLargeClassDetectorImpl
					.pattern_HLargeClassDetector_0_3_ActivityNode29_blackB(relative);
			if (result3_black != null) {

				// ActivityNode27
				Object[] result4_black = HLargeClassDetectorImpl
						.pattern_HLargeClassDetector_0_4_ActivityNode27_blackBBB(nm, tClass, this);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [ActivityNode27] failed." + " Variables: "
							+ "[nm] = " + nm + ", " + "[tClass] = " + tClass + ", " + "[this] = " + this + ".");
				}
				Object[] result4_green = HLargeClassDetectorImpl
						.pattern_HLargeClassDetector_0_4_ActivityNode27_greenFBBB(nm, tClass, this);
				HLargeClassSmell largeClassSmell = (HLargeClassSmell) result4_green[0];

				return HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_5_expressionFB(largeClassSmell);
			} else {
				return HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_6_expressionF();
			}

		} else {
			return HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_7_expressionF();
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
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLargeClassDetector_0_1_ActivityNode28_blackFB(TClass tClass) {
		boolean tClass_tLib = tClass.isTLib();
		if (Boolean.valueOf(tClass_tLib).equals(false)) {
			for (TAnnotation tmpNm : tClass.getTAnnotation()) {
				if (tmpNm instanceof HNumberOfMembersMetric) {
					HNumberOfMembersMetric nm = (HNumberOfMembersMetric) tmpNm;
					return new Object[] { nm, tClass };
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_HLargeClassDetector_0_2_ActivityNode71_bindingFB(HNumberOfMembersMetric nm) {
		HRelativeValue _localVariable_0 = nm.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, nm };
		}
		return null;
	}

	public static final Object[] pattern_HLargeClassDetector_0_2_ActivityNode71_blackB(HRelativeValue relative) {
		return new Object[] { relative };
	}

	public static final Object[] pattern_HLargeClassDetector_0_2_ActivityNode71_bindingAndBlackFB(
			HNumberOfMembersMetric nm) {
		Object[] result_pattern_HLargeClassDetector_0_2_ActivityNode71_binding = pattern_HLargeClassDetector_0_2_ActivityNode71_bindingFB(
				nm);
		if (result_pattern_HLargeClassDetector_0_2_ActivityNode71_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HLargeClassDetector_0_2_ActivityNode71_binding[0];

			Object[] result_pattern_HLargeClassDetector_0_2_ActivityNode71_black = pattern_HLargeClassDetector_0_2_ActivityNode71_blackB(
					relative);
			if (result_pattern_HLargeClassDetector_0_2_ActivityNode71_black != null) {

				return new Object[] { relative, nm };
			}
		}
		return null;
	}

	public static final Object[] pattern_HLargeClassDetector_0_3_ActivityNode29_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.VERY_HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HLargeClassDetector_0_4_ActivityNode27_blackBBB(HNumberOfMembersMetric nm,
			TClass tClass, HLargeClassDetector _this) {
		return new Object[] { nm, tClass, _this };
	}

	public static final Object[] pattern_HLargeClassDetector_0_4_ActivityNode27_greenFBBB(HNumberOfMembersMetric nm,
			TClass tClass, HLargeClassDetector _this) {
		HLargeClassSmell largeClassSmell = CodesmellsFactory.eINSTANCE.createHLargeClassSmell();
		largeClassSmell.setTAnnotated(tClass);
		largeClassSmell.setHNumberOfMembers(nm);
		nm.getPartOf().add(largeClassSmell);
		_this.getHAnnotation().add(largeClassSmell);
		return new Object[] { largeClassSmell, nm, tClass, _this };
	}

	public static final HAnnotation pattern_HLargeClassDetector_0_5_expressionFB(HLargeClassSmell largeClassSmell) {
		HAnnotation _result = largeClassSmell;
		return _result;
	}

	public static final HAnnotation pattern_HLargeClassDetector_0_6_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HLargeClassDetector_0_7_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Large Class Smell";
	}
	// [user code injected with eMoflon] -->
} //HLargeClassDetectorImpl
