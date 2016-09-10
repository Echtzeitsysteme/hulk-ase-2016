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
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HGodClassDetector;

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
 * An implementation of the model object '<em><b>HGod Class Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGodClassDetectorImpl extends HAntiPatternDetectorImpl implements HGodClassDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HGodClassDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HGOD_CLASS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// ActivityNode36
		Object[] result1_black = HGodClassDetectorImpl.pattern_HGodClassDetector_0_1_ActivityNode36_blackFFB(tClass);
		if (result1_black != null) {
			HControllerClassSmell controller = (HControllerClassSmell) result1_black[0];
			HLargeClassLowCohesionSmell lclc = (HLargeClassLowCohesionSmell) result1_black[1];
			// ActivityNode37
			Object[] result2_black = HGodClassDetectorImpl
					.pattern_HGodClassDetector_0_2_ActivityNode37_blackBBBB(controller, lclc, tClass, this);
			if (result2_black != null) {
				Object[] result2_green = HGodClassDetectorImpl
						.pattern_HGodClassDetector_0_2_ActivityNode37_greenBBFBB(controller, lclc, tClass, this);
				HGodClassAntiPattern mc = (HGodClassAntiPattern) result2_green[2];

				// ActivityNode68
				Object[] result3_black = HGodClassDetectorImpl
						.pattern_HGodClassDetector_0_3_ActivityNode68_blackFBF(tClass);
				if (result3_black != null) {
					TAnnotationType tAnnotationType = (TAnnotationType) result3_black[0];
					// TypeGraph pg = (TypeGraph) result3_black[2];
					HGodClassDetectorImpl.pattern_HGodClassDetector_0_3_ActivityNode68_greenBFBB(tAnnotationType,
							tClass, this);
					// TAnnotation annotation = (TAnnotation) result3_green[1];

				} else {
				}
				return HGodClassDetectorImpl.pattern_HGodClassDetector_0_4_expressionFB(mc);
			} else {
				return HGodClassDetectorImpl.pattern_HGodClassDetector_0_5_expressionF();
			}

		} else {
			return HGodClassDetectorImpl.pattern_HGodClassDetector_0_6_expressionF();
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
				return AntipatternPackage.HGOD_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return AntipatternPackage.HGOD_CLASS_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return AntipatternPackage.HGOD_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case AntipatternPackage.HGOD_CLASS_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HGOD_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HGodClassDetector_0_1_ActivityNode36_blackFFB(TClass tClass) {
		for (TAnnotation tmpLclc : tClass.getTAnnotation()) {
			if (tmpLclc instanceof HLargeClassLowCohesionSmell) {
				HLargeClassLowCohesionSmell lclc = (HLargeClassLowCohesionSmell) tmpLclc;
				for (TAnnotation tmpController : tClass.getTAnnotation()) {
					if (tmpController instanceof HControllerClassSmell) {
						HControllerClassSmell controller = (HControllerClassSmell) tmpController;
						return new Object[] { controller, lclc, tClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HGodClassDetector_0_2_ActivityNode37_blackBBBB(
			HControllerClassSmell controller, HLargeClassLowCohesionSmell lclc, TClass tClass,
			HGodClassDetector _this) {
		return new Object[] { controller, lclc, tClass, _this };
	}

	public static final Object[] pattern_HGodClassDetector_0_2_ActivityNode37_greenBBFBB(
			HControllerClassSmell controller, HLargeClassLowCohesionSmell lclc, TClass tClass,
			HGodClassDetector _this) {
		HGodClassAntiPattern mc = AntipatternFactory.eINSTANCE.createHGodClassAntiPattern();
		controller.getPartOf().add(mc);
		lclc.getPartOf().add(mc);
		mc.setHLargeClassLowCohesionSmell(lclc);
		mc.setHControllerClassSmell(controller);
		mc.setTAnnotated(tClass);
		_this.getHAnnotation().add(mc);
		return new Object[] { controller, lclc, mc, tClass, _this };
	}

	public static final Object[] pattern_HGodClassDetector_0_3_ActivityNode68_blackFBF(TClass tClass) {
		TypeGraph pg = tClass.getPg();
		if (pg != null) {
			for (TAnnotationType tAnnotationType : pg.getTAnnotationTypes()) {
				String tAnnotationType_tName = tAnnotationType.getTName();
				if (tAnnotationType_tName.equals("GodClass")) {
					return new Object[] { tAnnotationType, tClass, pg };
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_HGodClassDetector_0_3_ActivityNode68_greenBFBB(TAnnotationType tAnnotationType,
			TClass tClass, HGodClassDetector _this) {
		TAnnotation annotation = BasicFactory.eINSTANCE.createTAnnotation();
		int _localVariable_0 = _this.getNextID();
		tAnnotationType.getAnnotations().add(annotation);
		annotation.setTAnnotated(tClass);
		int annotation_ID_prime = Integer.valueOf(_localVariable_0);
		annotation.setID(Integer.valueOf(annotation_ID_prime));
		return new Object[] { tAnnotationType, annotation, tClass, _this };
	}

	public static final HAnnotation pattern_HGodClassDetector_0_4_expressionFB(HGodClassAntiPattern mc) {
		HAnnotation _result = mc;
		return _result;
	}

	public static final HAnnotation pattern_HGodClassDetector_0_5_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HGodClassDetector_0_6_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public String getGuiName() {
		return "God Class Anit-Pattern";
	}
	// [user code injected with eMoflon] -->
} //HGodClassDetectorImpl
