/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;

import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HDataClassDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HData Class Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDataClassDetectorImpl extends HCodeSmellDetectorImpl implements HDataClassDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDataClassDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HDATA_CLASS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// ActivityNode28
		Object[] result1_black = HDataClassDetectorImpl.pattern_HDataClassDetector_0_1_ActivityNode28_blackBF(tClass);
		if (result1_black != null) {
			HNACCMetric nm = (HNACCMetric) result1_black[1];
			// ActivityNode79
			Object[] result2_black = HDataClassDetectorImpl
					.pattern_HDataClassDetector_0_2_ActivityNode79_blackFB(tClass);
			if (result2_black != null) {
				// HDataClassSmell dc = (HDataClassSmell) result2_black[0];
				return HDataClassDetectorImpl.pattern_HDataClassDetector_0_3_expressionF();
			} else {
				// ActivityNode29
				Object[] result4_bindingAndBlack = HDataClassDetectorImpl
						.pattern_HDataClassDetector_0_4_ActivityNode29_bindingAndBlackFB(nm);
				if (result4_bindingAndBlack != null) {
					// HRelativeValue relative = (HRelativeValue) result4_bindingAndBlack[0];
				} else {
					// ActivityNode70
					Object[] result5_bindingAndBlack = HDataClassDetectorImpl
							.pattern_HDataClassDetector_0_5_ActivityNode70_bindingAndBlackFB(nm);
					if (result5_bindingAndBlack != null) {
						// HRelativeValue relative = (HRelativeValue) result5_bindingAndBlack[0];
					} else {
						return HDataClassDetectorImpl.pattern_HDataClassDetector_0_6_expressionF();
					}

				}

				// ActivityNode27
				Object[] result7_black = HDataClassDetectorImpl
						.pattern_HDataClassDetector_0_7_ActivityNode27_blackBBB(tClass, this, nm);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching in node [ActivityNode27] failed." + " Variables: "
							+ "[tClass] = " + tClass + ", " + "[this] = " + this + ", " + "[nm] = " + nm + ".");
				}
				Object[] result7_green = HDataClassDetectorImpl
						.pattern_HDataClassDetector_0_7_ActivityNode27_greenBFBB(tClass, this, nm);
				HDataClassSmell dataClassSmell = (HDataClassSmell) result7_green[1];

				// ForEach ActivityNode46
				for (Object[] result8_black : HDataClassDetectorImpl
						.pattern_HDataClassDetector_0_8_ActivityNode46_blackBF(nm)) {
					HGetterSetterSmell getterSetter = (HGetterSetterSmell) result8_black[1];

					// ActivityNode47
					Object[] result9_black = HDataClassDetectorImpl
							.pattern_HDataClassDetector_0_9_ActivityNode47_blackBB(getterSetter, dataClassSmell);
					if (result9_black == null) {
						throw new RuntimeException("Pattern matching in node [ActivityNode47] failed." + " Variables: "
								+ "[getterSetter] = " + getterSetter + ", " + "[dataClassSmell] = " + dataClassSmell
								+ ".");
					}
					HDataClassDetectorImpl.pattern_HDataClassDetector_0_9_ActivityNode47_greenBB(getterSetter,
							dataClassSmell);

				}
				// ForEach ActivityNode77
				for (Object[] result10_black : HDataClassDetectorImpl
						.pattern_HDataClassDetector_0_10_ActivityNode77_blackBF(tClass)) {
					TClass tChild = (TClass) result10_black[1];
					// ActivityNode78
					HDataClassDetectorImpl.pattern_HDataClassDetector_0_11_ActivityNode78_expressionBBB(this, tChild,
							dataClassSmell);

				}
				return HDataClassDetectorImpl.pattern_HDataClassDetector_0_12_expressionFB(dataClassSmell);
			}

		} else {
			return HDataClassDetectorImpl.pattern_HDataClassDetector_0_13_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeChildDC(TClass tChild, HDataClassSmell tSmell) {// ActivityNode73
		Object[] result1_black = HDataClassDetectorImpl.pattern_HDataClassDetector_1_1_ActivityNode73_blackBB(tChild,
				this);
		if (result1_black != null) {

			// ActivityNode74
			Object[] result2_black = HDataClassDetectorImpl
					.pattern_HDataClassDetector_1_2_ActivityNode74_blackBB(tChild, tSmell);
			if (result2_black == null) {
				throw new RuntimeException("Pattern matching in node [ActivityNode74] failed." + " Variables: "
						+ "[tChild] = " + tChild + ", " + "[tSmell] = " + tSmell + ".");
			}
			Object[] result2_green = HDataClassDetectorImpl
					.pattern_HDataClassDetector_1_2_ActivityNode74_greenBFB(tChild, tSmell);
			HDataClassSmell data = (HDataClassSmell) result2_green[1];

			// ForEach ActivityNode75
			for (Object[] result3_black : HDataClassDetectorImpl
					.pattern_HDataClassDetector_1_3_ActivityNode75_blackBF(tChild)) {
				TClass next = (TClass) result3_black[1];
				// ActivityNode76
				HDataClassDetectorImpl.pattern_HDataClassDetector_1_4_ActivityNode76_expressionBBB(this, next, data);

			}
			return;
		} else {
			return;
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
				return CodesmellsPackage.HDATA_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HDATA_CLASS_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HDATA_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case CodesmellsPackage.HDATA_CLASS_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HDATA_CLASS_DETECTOR___MAKE_CHILD_DC__TCLASS_HDATACLASSSMELL:
			makeChildDC((TClass) arguments.get(0), (HDataClassSmell) arguments.get(1));
			return null;
		case CodesmellsPackage.HDATA_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HDataClassDetector_0_1_ActivityNode28_blackBF(TClass tClass) {
		for (TAnnotation tmpNm : tClass.getTAnnotation()) {
			if (tmpNm instanceof HNACCMetric) {
				HNACCMetric nm = (HNACCMetric) tmpNm;
				return new Object[] { tClass, nm };
			}
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_2_ActivityNode79_blackFB(TClass tClass) {
		for (TAnnotation tmpDc : tClass.getTAnnotation()) {
			if (tmpDc instanceof HDataClassSmell) {
				HDataClassSmell dc = (HDataClassSmell) tmpDc;
				return new Object[] { dc, tClass };
			}
		}
		return null;
	}

	public static final HAnnotation pattern_HDataClassDetector_0_3_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HDataClassDetector_0_4_ActivityNode29_bindingFB(HNACCMetric nm) {
		HRelativeValue _localVariable_0 = nm.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, nm };
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_4_ActivityNode29_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.VERY_HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_4_ActivityNode29_bindingAndBlackFB(HNACCMetric nm) {
		Object[] result_pattern_HDataClassDetector_0_4_ActivityNode29_binding = pattern_HDataClassDetector_0_4_ActivityNode29_bindingFB(
				nm);
		if (result_pattern_HDataClassDetector_0_4_ActivityNode29_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HDataClassDetector_0_4_ActivityNode29_binding[0];

			Object[] result_pattern_HDataClassDetector_0_4_ActivityNode29_black = pattern_HDataClassDetector_0_4_ActivityNode29_blackB(
					relative);
			if (result_pattern_HDataClassDetector_0_4_ActivityNode29_black != null) {

				return new Object[] { relative, nm };
			}
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_5_ActivityNode70_bindingFB(HNACCMetric nm) {
		HRelativeValue _localVariable_1 = nm.getRelativeAmount();
		HRelativeValue relative = _localVariable_1;
		if (relative != null) {
			return new Object[] { relative, nm };
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_5_ActivityNode70_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (relative_value.equals(HRelativeValueConstants.HIGH)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_5_ActivityNode70_bindingAndBlackFB(HNACCMetric nm) {
		Object[] result_pattern_HDataClassDetector_0_5_ActivityNode70_binding = pattern_HDataClassDetector_0_5_ActivityNode70_bindingFB(
				nm);
		if (result_pattern_HDataClassDetector_0_5_ActivityNode70_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HDataClassDetector_0_5_ActivityNode70_binding[0];

			Object[] result_pattern_HDataClassDetector_0_5_ActivityNode70_black = pattern_HDataClassDetector_0_5_ActivityNode70_blackB(
					relative);
			if (result_pattern_HDataClassDetector_0_5_ActivityNode70_black != null) {

				return new Object[] { relative, nm };
			}
		}
		return null;
	}

	public static final HAnnotation pattern_HDataClassDetector_0_6_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HDataClassDetector_0_7_ActivityNode27_blackBBB(TClass tClass,
			HDataClassDetector _this, HNACCMetric nm) {
		return new Object[] { tClass, _this, nm };
	}

	public static final Object[] pattern_HDataClassDetector_0_7_ActivityNode27_greenBFBB(TClass tClass,
			HDataClassDetector _this, HNACCMetric nm) {
		HDataClassSmell dataClassSmell = CodesmellsFactory.eINSTANCE.createHDataClassSmell();
		dataClassSmell.setTAnnotated(tClass);
		dataClassSmell.setHNACCMetric(nm);
		_this.getHAnnotation().add(dataClassSmell);
		nm.getPartOf().add(dataClassSmell);
		return new Object[] { tClass, dataClassSmell, _this, nm };
	}

	public static final Iterable<Object[]> pattern_HDataClassDetector_0_8_ActivityNode46_blackBF(HNACCMetric nm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HGetterSetterSmell getterSetter : nm.getHGetterSetterSmells()) {
			_result.add(new Object[] { nm, getterSetter });
		}
		return _result;
	}

	public static final Object[] pattern_HDataClassDetector_0_9_ActivityNode47_blackBB(HGetterSetterSmell getterSetter,
			HDataClassSmell dataClassSmell) {
		return new Object[] { getterSetter, dataClassSmell };
	}

	public static final Object[] pattern_HDataClassDetector_0_9_ActivityNode47_greenBB(HGetterSetterSmell getterSetter,
			HDataClassSmell dataClassSmell) {
		getterSetter.getPartOf().add(dataClassSmell);
		dataClassSmell.getGetterSetterSmells().add(getterSetter);
		return new Object[] { getterSetter, dataClassSmell };
	}

	public static final Iterable<Object[]> pattern_HDataClassDetector_0_10_ActivityNode77_blackBF(TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChild : tClass.getChildClasses()) {
			if (!tChild.equals(tClass)) {
				_result.add(new Object[] { tClass, tChild });
			}
		}
		return _result;
	}

	public static final void pattern_HDataClassDetector_0_11_ActivityNode78_expressionBBB(HDataClassDetector _this,
			TClass tChild, HDataClassSmell dataClassSmell) {
		_this.makeChildDC(tChild, dataClassSmell);

	}

	public static final HAnnotation pattern_HDataClassDetector_0_12_expressionFB(HDataClassSmell dataClassSmell) {
		HAnnotation _result = dataClassSmell;
		return _result;
	}

	public static final HAnnotation pattern_HDataClassDetector_0_13_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HDataClassDetector_1_1_ActivityNode73_black_nac_0B(TClass tChild) {
		for (TAnnotation tmpSmell : tChild.getTAnnotation()) {
			if (tmpSmell instanceof HDataClassSmell) {
				HDataClassSmell smell = (HDataClassSmell) tmpSmell;
				return new Object[] { tChild };
			}
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_1_1_ActivityNode73_blackBB(TClass tChild,
			HDataClassDetector _this) {
		if (pattern_HDataClassDetector_1_1_ActivityNode73_black_nac_0B(tChild) == null) {
			return new Object[] { tChild, _this };
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_1_2_ActivityNode74_blackBB(TClass tChild,
			HDataClassSmell tSmell) {
		return new Object[] { tChild, tSmell };
	}

	public static final Object[] pattern_HDataClassDetector_1_2_ActivityNode74_greenBFB(TClass tChild,
			HDataClassSmell tSmell) {
		HDataClassSmell data = CodesmellsFactory.eINSTANCE.createHDataClassSmell();
		data.setTAnnotated(tChild);
		data.getPartOf().add(tSmell);
		return new Object[] { tChild, data, tSmell };
	}

	public static final Iterable<Object[]> pattern_HDataClassDetector_1_3_ActivityNode75_blackBF(TClass tChild) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass next : tChild.getChildClasses()) {
			if (!next.equals(tChild)) {
				_result.add(new Object[] { tChild, next });
			}
		}
		return _result;
	}

	public static final void pattern_HDataClassDetector_1_4_ActivityNode76_expressionBBB(HDataClassDetector _this,
			TClass next, HDataClassSmell data) {
		_this.makeChildDC(next, data);

	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "Data Class Smell";
	}
	// [user code injected with eMoflon] -->
} //HDataClassDetectorImpl
