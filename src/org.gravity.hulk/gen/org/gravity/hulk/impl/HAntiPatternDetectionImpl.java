/**
 */
package org.gravity.hulk.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.antipattern.AntipatternFactory;
import org.gravity.hulk.detection.antipattern.HBlobDetector;
import org.gravity.hulk.detection.antipattern.HGodClassDetector;
import org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector;
import org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector;

import org.gravity.hulk.detection.codesmells.CodesmellsFactory;
import org.gravity.hulk.detection.codesmells.HContollerClassDetector;
import org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector;
import org.gravity.hulk.detection.codesmells.HDataClassDetector;
import org.gravity.hulk.detection.codesmells.HEmptyClassDetector;
import org.gravity.hulk.detection.codesmells.HGetterSetterDetector;
import org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector;
import org.gravity.hulk.detection.codesmells.HLargeClassDetector;
import org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector;
import org.gravity.hulk.detection.codesmells.HLowCohesionDetector;
import org.gravity.hulk.detection.codesmells.HManyParametersDetector;
import org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector;

import org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.HAverageParamtersCalculator;
import org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator;
import org.gravity.hulk.detection.metrics.HInvocationRelationCalculator;
import org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator;
import org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator;
import org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator;
import org.gravity.hulk.detection.metrics.HMemberNumberCalculator;
import org.gravity.hulk.detection.metrics.HMethodNumberCalculator;
import org.gravity.hulk.detection.metrics.HNumberOfChildCalculator;
import org.gravity.hulk.detection.metrics.MetricsFactory;

import org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator;
import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterFactory;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAnti Pattern Detection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.impl.HAntiPatternDetectionImpl#getApg <em>Apg</em>}</li>
 *   <li>{@link org.gravity.hulk.impl.HAntiPatternDetectionImpl#getDetectors <em>Detectors</em>}</li>
 *   <li>{@link org.gravity.hulk.impl.HAntiPatternDetectionImpl#getProgramlocation <em>Programlocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HAntiPatternDetectionImpl extends EObjectImpl implements HAntiPatternDetection {
	/**
	 * The cached value of the '{@link #getApg() <em>Apg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph apg;

	/**
	 * The cached value of the '{@link #getDetectors() <em>Detectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectors()
	 * @generated
	 * @ordered
	 */
	protected EList<HDetector> detectors;

	/**
	 * The default value of the '{@link #getProgramlocation() <em>Programlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramlocation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramlocation() <em>Programlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramlocation()
	 * @generated
	 * @ordered
	 */
	protected String programlocation = PROGRAMLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAntiPatternDetectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HulkPackage.Literals.HANTI_PATTERN_DETECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternGraph getApg() {
		return apg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApg(HAntiPatternGraph newApg, NotificationChain msgs) {
		HAntiPatternGraph oldApg = apg;
		apg = newApg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HulkPackage.HANTI_PATTERN_DETECTION__APG, oldApg, newApg);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApg(HAntiPatternGraph newApg) {
		if (newApg != apg) {
			NotificationChain msgs = null;
			if (apg != null)
				msgs = ((InternalEObject) apg).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HulkPackage.HANTI_PATTERN_DETECTION__APG, null, msgs);
			if (newApg != null)
				msgs = ((InternalEObject) newApg).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HulkPackage.HANTI_PATTERN_DETECTION__APG, null, msgs);
			msgs = basicSetApg(newApg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HulkPackage.HANTI_PATTERN_DETECTION__APG, newApg,
					newApg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HDetector> getDetectors() {
		if (detectors == null) {
			detectors = new EObjectWithInverseResolvingEList<HDetector>(HDetector.class, this,
					HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS, HulkPackage.HDETECTOR__HULK);
		}
		return detectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramlocation() {
		return programlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramlocation(String newProgramlocation) {
		String oldProgramlocation = programlocation;
		programlocation = newProgramlocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HulkPackage.HANTI_PATTERN_DETECTION__PROGRAMLOCATION,
					oldProgramlocation, programlocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAntiPatternDependencies(DFSGraph graph) {
		// ActivityNode1
		Object[] result1_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_0_1_ActivityNode1_blackBBFF(graph, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode1] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		HGodClassDetector god = (HGodClassDetector) result1_black[2];
		HDataClassAccessorDetector dacAccessor = (HDataClassAccessorDetector) result1_black[3];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_0_1_ActivityNode1_greenFBFBBBF(graph, this, god,
				dacAccessor);
		// Edge blobReqDataClass = (Edge) result1_green[0];
		// HBlobDetector tbeBlob = (HBlobDetector) result1_green[2];
		// Edge blobReqDataCAccessor = (Edge) result1_green[6];

		// ActivityNode1
		Object[] result2_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_0_2_ActivityNode1_blackBFBFF(this, graph);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode1] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[graph] = " + graph + ".");
		}
		HLargeClassDetector largeClassDetector = (HLargeClassDetector) result2_black[1];
		HMuchOverloadingDetector overloadingDetector = (HMuchOverloadingDetector) result2_black[3];
		HIncommingInvocationsCalculator niiCalculator = (HIncommingInvocationsCalculator) result2_black[4];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_0_2_ActivityNode1_greenFBFBBBFBF(this,
				largeClassDetector, graph, overloadingDetector, niiCalculator);
		// Edge largeclassEdge = (Edge) result2_green[0];
		// HSwissArmyKnifeDetector swa = (HSwissArmyKnifeDetector) result2_green[2];
		// Edge overloadingEdge = (Edge) result2_green[6];
		// Edge niiEdge = (Edge) result2_green[8];

		// ActivityNode15
		Object[] result3_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_0_3_ActivityNode15_blackBBFFFFFB(this, graph, largeClassDetector);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode15] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[graph] = " + graph + ", " + "[largeClassDetector] = " + largeClassDetector + ".");
		}
		HDepthOfInheritanceCalculator inh = (HDepthOfInheritanceCalculator) result3_black[2];
		HNumberOfChildCalculator child = (HNumberOfChildCalculator) result3_black[3];
		HAverageOverloadingInClassCalculator over = (HAverageOverloadingInClassCalculator) result3_black[4];
		HAverageParamtersCalculator param = (HAverageParamtersCalculator) result3_black[5];
		HIntenseFieldUsageDetector field = (HIntenseFieldUsageDetector) result3_black[6];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_0_3_ActivityNode15_greenBBFBBBBBBFFFFFF(this, graph,
				inh, child, over, param, field, largeClassDetector);
		// HSpaghettiCodeDetector spaghetti = (HSpaghettiCodeDetector) result3_green[2];
		// Edge edgeS1 = (Edge) result3_green[9];
		// Edge edgeS2 = (Edge) result3_green[10];
		// Edge edgeS3 = (Edge) result3_green[11];
		// Edge edgeS4 = (Edge) result3_green[12];
		// Edge edgeS5 = (Edge) result3_green[13];
		// Edge edgeS6 = (Edge) result3_green[14];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createCodeSmellDependencies(DFSGraph graph) {
		// Dependencies of EmptyClassDetector
		Object[] result1_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_1_DependenciesofEmptyClassDetector_blackBB(graph, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [Dependencies of EmptyClassDetector] failed."
					+ " Variables: " + "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_1_DependenciesofEmptyClassDetector_greenFBB(graph,
				this);
		// HEmptyClassDetector emptyClassDetector = (HEmptyClassDetector) result1_green[0];

		// Dependencies of GetterSetterDetector
		Object[] result2_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_2_DependenciesofGetterSetterDetector_blackBBF(graph, this);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [Dependencies of GetterSetterDetector] failed."
					+ " Variables: " + "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		HGetterSetterMethodRelationCalculator nacc = (HGetterSetterMethodRelationCalculator) result2_black[2];
		Object[] result2_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_2_DependenciesofGetterSetterDetector_greenFBBBF(graph, this, nacc);
		HGetterSetterDetector getterSetterDetector = (HGetterSetterDetector) result2_green[0];
		// Edge edge8 = (Edge) result2_green[4];

		// Dependencies of DataClassDetector
		Object[] result3_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_3_DependenciesofDataClassDetector_blackBBB(getterSetterDetector, graph,
						this);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [Dependencies of DataClassDetector] failed."
					+ " Variables: " + "[getterSetterDetector] = " + getterSetterDetector + ", " + "[graph] = " + graph
					+ ", " + "[this] = " + this + ".");
		}
		Object[] result3_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_3_DependenciesofDataClassDetector_greenFFBBB(getterSetterDetector,
						graph, this);
		HDataClassDetector dataclassDetector = (HDataClassDetector) result3_green[0];
		// Edge edge = (Edge) result3_green[1];

		// Dependencies of HDataClassAccessorDetector
		Object[] result4_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_4_DependenciesofHDataClassAccessorDetector_blackBBB(this, graph,
						dataclassDetector);
		if (result4_black == null) {
			throw new RuntimeException("Pattern matching in node [Dependencies of HDataClassAccessorDetector] failed."
					+ " Variables: " + "[this] = " + this + ", " + "[graph] = " + graph + ", "
					+ "[dataclassDetector] = " + dataclassDetector + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_4_DependenciesofHDataClassAccessorDetector_greenBBFFB(
				this, graph, dataclassDetector);
		// HDataClassAccessorDetector dca = (HDataClassAccessorDetector) result4_green[2];
		// Edge edge2 = (Edge) result4_green[3];

		// Dependencies of LowCohesionDetector
		Object[] result5_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_5_DependenciesofLowCohesionDetector_blackBFB(graph, this);
		if (result5_black == null) {
			throw new RuntimeException("Pattern matching in node [Dependencies of LowCohesionDetector] failed."
					+ " Variables: " + "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		HLCOM5Calculator lcom = (HLCOM5Calculator) result5_black[1];
		Object[] result5_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_5_DependenciesofLowCohesionDetector_greenFBBFB(graph, lcom, this);
		// Edge edge3 = (Edge) result5_green[0];
		HLowCohesionDetector low = (HLowCohesionDetector) result5_green[3];

		// Dependencies of LargeClassDetector
		Object[] result6_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_6_DependenciesofLargeClassDetector_blackBFB(graph, this);
		if (result6_black == null) {
			throw new RuntimeException("Pattern matching in node [Dependencies of LargeClassDetector] failed."
					+ " Variables: " + "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		HMemberNumberCalculator nmd = (HMemberNumberCalculator) result6_black[1];
		Object[] result6_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_6_DependenciesofLargeClassDetector_greenFBFBB(graph, nmd, this);
		// Edge edge1 = (Edge) result6_green[0];
		HLargeClassDetector largeClassDetector = (HLargeClassDetector) result6_green[2];

		// Dependencies of LargeClassLowCohesionDetector
		Object[] result7_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_7_DependenciesofLargeClassLowCohesionDetector_blackBBBB(graph,
						largeClassDetector, low, this);
		if (result7_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [Dependencies of LargeClassLowCohesionDetector] failed." + " Variables: "
							+ "[graph] = " + graph + ", " + "[largeClassDetector] = " + largeClassDetector + ", "
							+ "[low] = " + low + ", " + "[this] = " + this + ".");
		}
		Object[] result7_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_7_DependenciesofLargeClassLowCohesionDetector_greenFFBBFBB(graph,
						largeClassDetector, low, this);
		// Edge edge4 = (Edge) result7_green[0];
		// Edge edge5 = (Edge) result7_green[1];
		HLargeClassLowCohesionDetector lclc = (HLargeClassLowCohesionDetector) result7_green[4];

		// Dependencies of ControllerClassDetector
		Object[] result8_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_8_DependenciesofControllerClassDetector_blackFBB(graph, this);
		if (result8_black == null) {
			throw new RuntimeException("Pattern matching in node [Dependencies of ControllerClassDetector] failed."
					+ " Variables: " + "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		HInvocationRelationCalculator inc = (HInvocationRelationCalculator) result8_black[0];
		Object[] result8_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_8_DependenciesofControllerClassDetector_greenBFBBF(inc, graph, this);
		HContollerClassDetector controller = (HContollerClassDetector) result8_green[1];
		// Edge edge9 = (Edge) result8_green[4];

		// Dependencies of MainClassDetector
		Object[] result9_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_9_DependenciesofMainClassDetector_blackBBBB(controller, graph, lclc,
						this);
		if (result9_black == null) {
			throw new RuntimeException("Pattern matching in node [Dependencies of MainClassDetector] failed."
					+ " Variables: " + "[controller] = " + controller + ", " + "[graph] = " + graph + ", " + "[lclc] = "
					+ lclc + ", " + "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_9_DependenciesofMainClassDetector_greenBFFBBFB(
				controller, graph, lclc, this);
		// Edge edge6 = (Edge) result9_green[1];
		// Edge edge7 = (Edge) result9_green[2];
		// HGodClassDetector mc = (HGodClassDetector) result9_green[5];

		// ActivityNode12
		Object[] result10_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_10_ActivityNode12_blackBBF(this, graph);
		if (result10_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode12] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		HAverageParamtersCalculator paramMetric = (HAverageParamtersCalculator) result10_black[2];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_10_ActivityNode12_greenBBFBF(this, graph,
				paramMetric);
		// HManyParametersDetector param = (HManyParametersDetector) result10_green[2];
		// Edge edge10 = (Edge) result10_green[4];

		// ActivityNode12
		Object[] result11_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_11_ActivityNode12_blackBBF(this, graph);
		if (result11_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode12] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		HAverageOverloadingInClassCalculator overMetric = (HAverageOverloadingInClassCalculator) result11_black[2];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_11_ActivityNode12_greenBBFBF(this, graph, overMetric);
		// HMuchOverloadingDetector over = (HMuchOverloadingDetector) result11_green[2];
		// Edge edge11 = (Edge) result11_green[4];

		// ActivityNode14
		Object[] result12_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_12_ActivityNode14_blackBBF(this, graph);
		if (result12_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode14] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		HLocalAccessRelationCalculator local = (HLocalAccessRelationCalculator) result12_black[2];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_12_ActivityNode14_greenBBFBF(this, graph, local);
		// HIntenseFieldUsageDetector infuse = (HIntenseFieldUsageDetector) result12_green[2];
		// Edge edge12 = (Edge) result12_green[4];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createMetricDependencies(DFSGraph graph) {
		// number Of Members Metric
		Object[] result1_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_1_numberOfMembersMetric_blackBB(graph, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [number Of Members Metric] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_1_numberOfMembersMetric_greenBFB(graph, this);
		// HMemberNumberCalculator nmd = (HMemberNumberCalculator) result1_green[1];

		// ActivityNode2
		Object[] result2_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_2_ActivityNode2_blackBB(graph, this);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode2] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		Object[] result2_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_2_ActivityNode2_greenBBF(graph, this);
		HMethodNumberCalculator methods = (HMethodNumberCalculator) result2_green[2];

		// ActivityNode3
		Object[] result3_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_3_ActivityNode3_blackBB(graph, this);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode3] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_3_ActivityNode3_greenBFB(graph, this);
		// HLCOM5Calculator lcom = (HLCOM5Calculator) result3_green[1];

		// ActivityNode4
		Object[] result4_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_4_ActivityNode4_blackBB(graph, this);
		if (result4_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode4] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		Object[] result4_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_4_ActivityNode4_greenFBB(graph, this);
		HSettersCalculator ns = (HSettersCalculator) result4_green[0];

		// ActivityNode5
		Object[] result5_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_5_ActivityNode5_blackBB(graph, this);
		if (result5_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode5] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		Object[] result5_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_5_ActivityNode5_greenBFB(graph, this);
		HGettersCalculator ng = (HGettersCalculator) result5_green[1];

		// ActivityNode6
		Object[] result6_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_6_ActivityNode6_blackBB(graph, this);
		if (result6_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode6] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		Object[] result6_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_6_ActivityNode6_greenBFB(graph, this);
		HIncommingInvocationsCalculator nii = (HIncommingInvocationsCalculator) result6_green[1];

		// ActivityNode7
		Object[] result7_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_7_ActivityNode7_blackBB(graph, this);
		if (result7_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode7] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		Object[] result7_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_7_ActivityNode7_greenBFB(graph, this);
		HOutgoingInvocationsCalculator noi = (HOutgoingInvocationsCalculator) result7_green[1];

		// ActivityNode9
		Object[] result8_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_8_ActivityNode9_blackBBBB(graph, this, noi, nii);
		if (result8_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode9] failed." + " Variables: " + "[graph] = " + graph + ", "
							+ "[this] = " + this + ", " + "[noi] = " + noi + ", " + "[nii] = " + nii + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_8_ActivityNode9_greenBBFBBFF(graph, this, noi, nii);
		// HInvocationRelationCalculator relation = (HInvocationRelationCalculator) result8_green[2];
		// Edge edge3 = (Edge) result8_green[5];
		// Edge edge4 = (Edge) result8_green[6];

		// ActivityNode8
		Object[] result9_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_9_ActivityNode8_blackBBBBB(graph, ng, ns, methods, this);
		if (result9_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode8] failed." + " Variables: "
					+ "[graph] = " + graph + ", " + "[ng] = " + ng + ", " + "[ns] = " + ns + ", " + "[methods] = "
					+ methods + ", " + "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_9_ActivityNode8_greenBFBBBFFFB(graph, ng, ns, methods,
				this);
		// HGetterSetterMethodRelationCalculator getterSetterRelation = (HGetterSetterMethodRelationCalculator) result9_green[1];
		// Edge edge0 = (Edge) result9_green[5];
		// Edge edge1 = (Edge) result9_green[6];
		// Edge edge2 = (Edge) result9_green[7];

		// ActivityNode10
		Object[] result10_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_10_ActivityNode10_blackBB(this, graph);
		if (result10_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode10] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_10_ActivityNode10_greenBBF(this, graph);
		// HAverageParamtersCalculator params = (HAverageParamtersCalculator) result10_green[2];

		// ActivityNode11
		Object[] result11_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_11_ActivityNode11_blackBB(this, graph);
		if (result11_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode11] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_11_ActivityNode11_greenBBF(this, graph);
		// HAverageOverloadingInClassCalculator over = (HAverageOverloadingInClassCalculator) result11_green[2];

		// ActivityNode13
		Object[] result12_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_12_ActivityNode13_blackBB(this, graph);
		if (result12_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode13] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_12_ActivityNode13_greenBFB(this, graph);
		// HDepthOfInheritanceCalculator inh = (HDepthOfInheritanceCalculator) result12_green[1];

		// ActivityNode13
		Object[] result13_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_13_ActivityNode13_blackBB(this, graph);
		if (result13_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode13] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_13_ActivityNode13_greenBFB(this, graph);
		// HNumberOfChildCalculator child = (HNumberOfChildCalculator) result13_green[1];

		// ActivityNode13
		Object[] result14_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_14_ActivityNode13_blackBB(this, graph);
		if (result14_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode13] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		Object[] result14_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_14_ActivityNode13_greenBFB(this, graph);
		HLocalMethodAccessCalculator lma = (HLocalMethodAccessCalculator) result14_green[1];

		// ActivityNode13
		Object[] result15_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_15_ActivityNode13_blackBB(this, graph);
		if (result15_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode13] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ".");
		}
		Object[] result15_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_15_ActivityNode13_greenBFB(this, graph);
		HLocalFieldsAccessCalculator lfa = (HLocalFieldsAccessCalculator) result15_green[1];

		// ActivityNode13
		Object[] result16_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_16_ActivityNode13_blackBBBB(this, graph, lfa, lma);
		if (result16_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode13] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[graph] = " + graph + ", " + "[lfa] = " + lfa + ", " + "[lma] = " + lma + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_16_ActivityNode13_greenBFBBBFF(this, graph, lfa, lma);
		// HLocalAccessRelationCalculator far = (HLocalAccessRelationCalculator) result16_green[1];
		// Edge edge5 = (Edge) result16_green[5];
		// Edge edge6 = (Edge) result16_green[6];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect() {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFSGraph getDependencyGraph() {
		// Create Dependency Graph
		Object[] result1_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_4_1_CreateDependencyGraph_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [Create Dependency Graph] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		Object[] result1_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_4_1_CreateDependencyGraph_greenF();
		DFSGraph graph = (DFSGraph) result1_green[0];

		// Call extracted method
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_2_Callextractedmethod_expressionBB(this, graph);
		// Call extracted method
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_3_Callextractedmethod_expressionBB(this, graph);
		// Call extracted method
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_4_Callextractedmethod_expressionBB(this, graph);
		return HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_5_expressionFB(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDetectors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HulkPackage.HANTI_PATTERN_DETECTION__APG:
			return basicSetApg(null, msgs);
		case HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS:
			return ((InternalEList<?>) getDetectors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HulkPackage.HANTI_PATTERN_DETECTION__APG:
			return getApg();
		case HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS:
			return getDetectors();
		case HulkPackage.HANTI_PATTERN_DETECTION__PROGRAMLOCATION:
			return getProgramlocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HulkPackage.HANTI_PATTERN_DETECTION__APG:
			setApg((HAntiPatternGraph) newValue);
			return;
		case HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS:
			getDetectors().clear();
			getDetectors().addAll((Collection<? extends HDetector>) newValue);
			return;
		case HulkPackage.HANTI_PATTERN_DETECTION__PROGRAMLOCATION:
			setProgramlocation((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HulkPackage.HANTI_PATTERN_DETECTION__APG:
			setApg((HAntiPatternGraph) null);
			return;
		case HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS:
			getDetectors().clear();
			return;
		case HulkPackage.HANTI_PATTERN_DETECTION__PROGRAMLOCATION:
			setProgramlocation(PROGRAMLOCATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HulkPackage.HANTI_PATTERN_DETECTION__APG:
			return apg != null;
		case HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS:
			return detectors != null && !detectors.isEmpty();
		case HulkPackage.HANTI_PATTERN_DETECTION__PROGRAMLOCATION:
			return PROGRAMLOCATION_EDEFAULT == null ? programlocation != null
					: !PROGRAMLOCATION_EDEFAULT.equals(programlocation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case HulkPackage.HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH:
			createAntiPatternDependencies((DFSGraph) arguments.get(0));
			return null;
		case HulkPackage.HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH:
			createCodeSmellDependencies((DFSGraph) arguments.get(0));
			return null;
		case HulkPackage.HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH:
			createMetricDependencies((DFSGraph) arguments.get(0));
			return null;
		case HulkPackage.HANTI_PATTERN_DETECTION___DETECT:
			return detect();
		case HulkPackage.HANTI_PATTERN_DETECTION___GET_DEPENDENCY_GRAPH:
			return getDependencyGraph();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (programlocation: ");
		result.append(programlocation);
		result.append(')');
		return result.toString();
	}

	public static final Object[] pattern_HAntiPatternDetection_0_1_ActivityNode1_blackBBFF(DFSGraph graph,
			HAntiPatternDetection _this) {
		for (Node tmpDacAccessor : graph.getNodes()) {
			if (tmpDacAccessor instanceof HDataClassAccessorDetector) {
				HDataClassAccessorDetector dacAccessor = (HDataClassAccessorDetector) tmpDacAccessor;
				if (_this.equals(dacAccessor.getHulk())) {
					for (HDetector tmpGod : _this.getDetectors()) {
						if (tmpGod instanceof HGodClassDetector) {
							HGodClassDetector god = (HGodClassDetector) tmpGod;
							if (graph.equals(god.getGraph())) {
								return new Object[] { graph, _this, god, dacAccessor };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_0_1_ActivityNode1_greenFBFBBBF(DFSGraph graph,
			HAntiPatternDetection _this, HGodClassDetector god, HDataClassAccessorDetector dacAccessor) {
		Edge blobReqDataClass = DfsFactory.eINSTANCE.createEdge();
		HBlobDetector tbeBlob = AntipatternFactory.eINSTANCE.createHBlobDetector();
		Edge blobReqDataCAccessor = DfsFactory.eINSTANCE.createEdge();
		god.getIncoming().add(blobReqDataClass);
		blobReqDataClass.setGraph(graph);
		tbeBlob.setGraph(graph);
		tbeBlob.getOutgoing().add(blobReqDataClass);
		tbeBlob.setHulk(_this);
		blobReqDataCAccessor.setGraph(graph);
		tbeBlob.getOutgoing().add(blobReqDataCAccessor);
		dacAccessor.getIncoming().add(blobReqDataCAccessor);
		return new Object[] { blobReqDataClass, graph, tbeBlob, _this, god, dacAccessor, blobReqDataCAccessor };
	}

	public static final Object[] pattern_HAntiPatternDetection_0_2_ActivityNode1_blackBFBFF(HAntiPatternDetection _this,
			DFSGraph graph) {
		for (HDetector tmpLargeClassDetector : _this.getDetectors()) {
			if (tmpLargeClassDetector instanceof HLargeClassDetector) {
				HLargeClassDetector largeClassDetector = (HLargeClassDetector) tmpLargeClassDetector;
				if (graph.equals(largeClassDetector.getGraph())) {
					for (HDetector tmpOverloadingDetector : _this.getDetectors()) {
						if (tmpOverloadingDetector instanceof HMuchOverloadingDetector) {
							HMuchOverloadingDetector overloadingDetector = (HMuchOverloadingDetector) tmpOverloadingDetector;
							if (graph.equals(overloadingDetector.getGraph())) {
								for (Node tmpNiiCalculator : graph.getNodes()) {
									if (tmpNiiCalculator instanceof HIncommingInvocationsCalculator) {
										HIncommingInvocationsCalculator niiCalculator = (HIncommingInvocationsCalculator) tmpNiiCalculator;
										if (_this.equals(niiCalculator.getHulk())) {
											return new Object[] { _this, largeClassDetector, graph, overloadingDetector,
													niiCalculator };
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_0_2_ActivityNode1_greenFBFBBBFBF(
			HAntiPatternDetection _this, HLargeClassDetector largeClassDetector, DFSGraph graph,
			HMuchOverloadingDetector overloadingDetector, HIncommingInvocationsCalculator niiCalculator) {
		Edge largeclassEdge = DfsFactory.eINSTANCE.createEdge();
		HSwissArmyKnifeDetector swa = AntipatternFactory.eINSTANCE.createHSwissArmyKnifeDetector();
		Edge overloadingEdge = DfsFactory.eINSTANCE.createEdge();
		Edge niiEdge = DfsFactory.eINSTANCE.createEdge();
		largeClassDetector.getIncoming().add(largeclassEdge);
		largeclassEdge.setGraph(graph);
		swa.setHulk(_this);
		swa.setGraph(graph);
		swa.getOutgoing().add(largeclassEdge);
		swa.getOutgoing().add(overloadingEdge);
		overloadingDetector.getIncoming().add(overloadingEdge);
		overloadingEdge.setGraph(graph);
		swa.getOutgoing().add(niiEdge);
		niiEdge.setGraph(graph);
		niiCalculator.getIncoming().add(niiEdge);
		return new Object[] { largeclassEdge, _this, swa, largeClassDetector, graph, overloadingDetector,
				overloadingEdge, niiCalculator, niiEdge };
	}

	public static final Object[] pattern_HAntiPatternDetection_0_3_ActivityNode15_blackBBFFFFFB(
			HAntiPatternDetection _this, DFSGraph graph, HLargeClassDetector largeClassDetector) {
		for (HDetector tmpInh : _this.getDetectors()) {
			if (tmpInh instanceof HDepthOfInheritanceCalculator) {
				HDepthOfInheritanceCalculator inh = (HDepthOfInheritanceCalculator) tmpInh;
				if (graph.equals(inh.getGraph())) {
					for (HDetector tmpChild : _this.getDetectors()) {
						if (tmpChild instanceof HNumberOfChildCalculator) {
							HNumberOfChildCalculator child = (HNumberOfChildCalculator) tmpChild;
							if (graph.equals(child.getGraph())) {
								for (HDetector tmpOver : _this.getDetectors()) {
									if (tmpOver instanceof HAverageOverloadingInClassCalculator) {
										HAverageOverloadingInClassCalculator over = (HAverageOverloadingInClassCalculator) tmpOver;
										if (graph.equals(over.getGraph())) {
											for (HDetector tmpParam : _this.getDetectors()) {
												if (tmpParam instanceof HAverageParamtersCalculator) {
													HAverageParamtersCalculator param = (HAverageParamtersCalculator) tmpParam;
													if (graph.equals(param.getGraph())) {
														for (HDetector tmpField : _this.getDetectors()) {
															if (tmpField instanceof HIntenseFieldUsageDetector) {
																HIntenseFieldUsageDetector field = (HIntenseFieldUsageDetector) tmpField;
																if (graph.equals(field.getGraph())) {
																	return new Object[] { _this, graph, inh, child,
																			over, param, field, largeClassDetector };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_0_3_ActivityNode15_greenBBFBBBBBBFFFFFF(
			HAntiPatternDetection _this, DFSGraph graph, HDepthOfInheritanceCalculator inh,
			HNumberOfChildCalculator child, HAverageOverloadingInClassCalculator over,
			HAverageParamtersCalculator param, HIntenseFieldUsageDetector field,
			HLargeClassDetector largeClassDetector) {
		HSpaghettiCodeDetector spaghetti = AntipatternFactory.eINSTANCE.createHSpaghettiCodeDetector();
		Edge edgeS1 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS2 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS3 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS4 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS5 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS6 = DfsFactory.eINSTANCE.createEdge();
		spaghetti.setGraph(graph);
		spaghetti.setHulk(_this);
		spaghetti.getOutgoing().add(edgeS1);
		edgeS1.setGraph(graph);
		largeClassDetector.getIncoming().add(edgeS1);
		spaghetti.getOutgoing().add(edgeS2);
		edgeS2.setGraph(graph);
		child.getIncoming().add(edgeS2);
		spaghetti.getOutgoing().add(edgeS3);
		edgeS3.setGraph(graph);
		inh.getIncoming().add(edgeS3);
		spaghetti.getOutgoing().add(edgeS4);
		edgeS4.setGraph(graph);
		over.getIncoming().add(edgeS4);
		spaghetti.getOutgoing().add(edgeS5);
		edgeS5.setGraph(graph);
		param.getIncoming().add(edgeS5);
		spaghetti.getOutgoing().add(edgeS6);
		edgeS6.setGraph(graph);
		field.getIncoming().add(edgeS6);
		return new Object[] { _this, graph, spaghetti, inh, child, over, param, field, largeClassDetector, edgeS1,
				edgeS2, edgeS3, edgeS4, edgeS5, edgeS6 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_1_DependenciesofEmptyClassDetector_blackBB(
			DFSGraph graph, HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_1_DependenciesofEmptyClassDetector_greenFBB(
			DFSGraph graph, HAntiPatternDetection _this) {
		HEmptyClassDetector emptyClassDetector = CodesmellsFactory.eINSTANCE.createHEmptyClassDetector();
		emptyClassDetector.setGraph(graph);
		emptyClassDetector.setHulk(_this);
		return new Object[] { emptyClassDetector, graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_2_DependenciesofGetterSetterDetector_blackBBF(
			DFSGraph graph, HAntiPatternDetection _this) {
		for (HDetector tmpNacc : _this.getDetectors()) {
			if (tmpNacc instanceof HGetterSetterMethodRelationCalculator) {
				HGetterSetterMethodRelationCalculator nacc = (HGetterSetterMethodRelationCalculator) tmpNacc;
				if (graph.equals(nacc.getGraph())) {
					return new Object[] { graph, _this, nacc };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_2_DependenciesofGetterSetterDetector_greenFBBBF(
			DFSGraph graph, HAntiPatternDetection _this, HGetterSetterMethodRelationCalculator nacc) {
		HGetterSetterDetector getterSetterDetector = CodesmellsFactory.eINSTANCE.createHGetterSetterDetector();
		Edge edge8 = DfsFactory.eINSTANCE.createEdge();
		getterSetterDetector.setGraph(graph);
		getterSetterDetector.setHulk(_this);
		getterSetterDetector.getOutgoing().add(edge8);
		nacc.getIncoming().add(edge8);
		edge8.setGraph(graph);
		return new Object[] { getterSetterDetector, graph, _this, nacc, edge8 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_3_DependenciesofDataClassDetector_blackBBB(
			HGetterSetterDetector getterSetterDetector, DFSGraph graph, HAntiPatternDetection _this) {
		return new Object[] { getterSetterDetector, graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_3_DependenciesofDataClassDetector_greenFFBBB(
			HGetterSetterDetector getterSetterDetector, DFSGraph graph, HAntiPatternDetection _this) {
		HDataClassDetector dataclassDetector = CodesmellsFactory.eINSTANCE.createHDataClassDetector();
		Edge edge = DfsFactory.eINSTANCE.createEdge();
		dataclassDetector.setGraph(graph);
		dataclassDetector.setHulk(_this);
		edge.setGraph(graph);
		dataclassDetector.getOutgoing().add(edge);
		getterSetterDetector.getIncoming().add(edge);
		return new Object[] { dataclassDetector, edge, getterSetterDetector, graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_4_DependenciesofHDataClassAccessorDetector_blackBBB(
			HAntiPatternDetection _this, DFSGraph graph, HDataClassDetector dataclassDetector) {
		return new Object[] { _this, graph, dataclassDetector };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_4_DependenciesofHDataClassAccessorDetector_greenBBFFB(
			HAntiPatternDetection _this, DFSGraph graph, HDataClassDetector dataclassDetector) {
		HDataClassAccessorDetector dca = CodesmellsFactory.eINSTANCE.createHDataClassAccessorDetector();
		Edge edge2 = DfsFactory.eINSTANCE.createEdge();
		dca.setHulk(_this);
		dca.setGraph(graph);
		edge2.setGraph(graph);
		dca.getOutgoing().add(edge2);
		dataclassDetector.getIncoming().add(edge2);
		return new Object[] { _this, graph, dca, edge2, dataclassDetector };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_5_DependenciesofLowCohesionDetector_blackBFB(
			DFSGraph graph, HAntiPatternDetection _this) {
		for (Node tmpLcom : graph.getNodes()) {
			if (tmpLcom instanceof HLCOM5Calculator) {
				HLCOM5Calculator lcom = (HLCOM5Calculator) tmpLcom;
				if (_this.equals(lcom.getHulk())) {
					return new Object[] { graph, lcom, _this };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_5_DependenciesofLowCohesionDetector_greenFBBFB(
			DFSGraph graph, HLCOM5Calculator lcom, HAntiPatternDetection _this) {
		Edge edge3 = DfsFactory.eINSTANCE.createEdge();
		HLowCohesionDetector low = CodesmellsFactory.eINSTANCE.createHLowCohesionDetector();
		lcom.getIncoming().add(edge3);
		edge3.setGraph(graph);
		low.setGraph(graph);
		low.getOutgoing().add(edge3);
		low.setHulk(_this);
		return new Object[] { edge3, graph, lcom, low, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_6_DependenciesofLargeClassDetector_blackBFB(
			DFSGraph graph, HAntiPatternDetection _this) {
		for (Node tmpNmd : graph.getNodes()) {
			if (tmpNmd instanceof HMemberNumberCalculator) {
				HMemberNumberCalculator nmd = (HMemberNumberCalculator) tmpNmd;
				if (_this.equals(nmd.getHulk())) {
					return new Object[] { graph, nmd, _this };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_6_DependenciesofLargeClassDetector_greenFBFBB(
			DFSGraph graph, HMemberNumberCalculator nmd, HAntiPatternDetection _this) {
		Edge edge1 = DfsFactory.eINSTANCE.createEdge();
		HLargeClassDetector largeClassDetector = CodesmellsFactory.eINSTANCE.createHLargeClassDetector();
		edge1.setGraph(graph);
		nmd.getIncoming().add(edge1);
		largeClassDetector.setGraph(graph);
		largeClassDetector.getOutgoing().add(edge1);
		largeClassDetector.setHulk(_this);
		return new Object[] { edge1, graph, largeClassDetector, nmd, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_7_DependenciesofLargeClassLowCohesionDetector_blackBBBB(
			DFSGraph graph, HLargeClassDetector largeClassDetector, HLowCohesionDetector low,
			HAntiPatternDetection _this) {
		return new Object[] { graph, largeClassDetector, low, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_7_DependenciesofLargeClassLowCohesionDetector_greenFFBBFBB(
			DFSGraph graph, HLargeClassDetector largeClassDetector, HLowCohesionDetector low,
			HAntiPatternDetection _this) {
		Edge edge4 = DfsFactory.eINSTANCE.createEdge();
		Edge edge5 = DfsFactory.eINSTANCE.createEdge();
		HLargeClassLowCohesionDetector lclc = CodesmellsFactory.eINSTANCE.createHLargeClassLowCohesionDetector();
		largeClassDetector.getIncoming().add(edge4);
		edge4.setGraph(graph);
		low.getIncoming().add(edge5);
		edge5.setGraph(graph);
		lclc.getOutgoing().add(edge5);
		lclc.setGraph(graph);
		lclc.getOutgoing().add(edge4);
		lclc.setHulk(_this);
		return new Object[] { edge4, edge5, graph, largeClassDetector, lclc, low, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_8_DependenciesofControllerClassDetector_blackFBB(
			DFSGraph graph, HAntiPatternDetection _this) {
		for (Node tmpInc : graph.getNodes()) {
			if (tmpInc instanceof HInvocationRelationCalculator) {
				HInvocationRelationCalculator inc = (HInvocationRelationCalculator) tmpInc;
				if (_this.equals(inc.getHulk())) {
					return new Object[] { inc, graph, _this };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_8_DependenciesofControllerClassDetector_greenBFBBF(
			HInvocationRelationCalculator inc, DFSGraph graph, HAntiPatternDetection _this) {
		HContollerClassDetector controller = CodesmellsFactory.eINSTANCE.createHContollerClassDetector();
		Edge edge9 = DfsFactory.eINSTANCE.createEdge();
		controller.setGraph(graph);
		controller.setHulk(_this);
		controller.getOutgoing().add(edge9);
		edge9.setGraph(graph);
		inc.getIncoming().add(edge9);
		return new Object[] { inc, controller, graph, _this, edge9 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_9_DependenciesofMainClassDetector_blackBBBB(
			HContollerClassDetector controller, DFSGraph graph, HLargeClassLowCohesionDetector lclc,
			HAntiPatternDetection _this) {
		return new Object[] { controller, graph, lclc, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_9_DependenciesofMainClassDetector_greenBFFBBFB(
			HContollerClassDetector controller, DFSGraph graph, HLargeClassLowCohesionDetector lclc,
			HAntiPatternDetection _this) {
		Edge edge6 = DfsFactory.eINSTANCE.createEdge();
		Edge edge7 = DfsFactory.eINSTANCE.createEdge();
		HGodClassDetector mc = AntipatternFactory.eINSTANCE.createHGodClassDetector();
		controller.getIncoming().add(edge6);
		edge6.setGraph(graph);
		lclc.getIncoming().add(edge7);
		edge7.setGraph(graph);
		mc.setGraph(graph);
		mc.getOutgoing().add(edge6);
		mc.getOutgoing().add(edge7);
		mc.setHulk(_this);
		return new Object[] { controller, edge6, edge7, graph, lclc, mc, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_10_ActivityNode12_blackBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		for (Node tmpParamMetric : graph.getNodes()) {
			if (tmpParamMetric instanceof HAverageParamtersCalculator) {
				HAverageParamtersCalculator paramMetric = (HAverageParamtersCalculator) tmpParamMetric;
				if (_this.equals(paramMetric.getHulk())) {
					return new Object[] { _this, graph, paramMetric };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_10_ActivityNode12_greenBBFBF(
			HAntiPatternDetection _this, DFSGraph graph, HAverageParamtersCalculator paramMetric) {
		HManyParametersDetector param = CodesmellsFactory.eINSTANCE.createHManyParametersDetector();
		Edge edge10 = DfsFactory.eINSTANCE.createEdge();
		param.setHulk(_this);
		param.setGraph(graph);
		param.getOutgoing().add(edge10);
		paramMetric.getIncoming().add(edge10);
		edge10.setGraph(graph);
		return new Object[] { _this, graph, param, paramMetric, edge10 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_11_ActivityNode12_blackBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		for (Node tmpOverMetric : graph.getNodes()) {
			if (tmpOverMetric instanceof HAverageOverloadingInClassCalculator) {
				HAverageOverloadingInClassCalculator overMetric = (HAverageOverloadingInClassCalculator) tmpOverMetric;
				if (_this.equals(overMetric.getHulk())) {
					return new Object[] { _this, graph, overMetric };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_11_ActivityNode12_greenBBFBF(
			HAntiPatternDetection _this, DFSGraph graph, HAverageOverloadingInClassCalculator overMetric) {
		HMuchOverloadingDetector over = CodesmellsFactory.eINSTANCE.createHMuchOverloadingDetector();
		Edge edge11 = DfsFactory.eINSTANCE.createEdge();
		over.setHulk(_this);
		over.setGraph(graph);
		over.getOutgoing().add(edge11);
		overMetric.getIncoming().add(edge11);
		edge11.setGraph(graph);
		return new Object[] { _this, graph, over, overMetric, edge11 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_12_ActivityNode14_blackBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		for (HDetector tmpLocal : _this.getDetectors()) {
			if (tmpLocal instanceof HLocalAccessRelationCalculator) {
				HLocalAccessRelationCalculator local = (HLocalAccessRelationCalculator) tmpLocal;
				if (graph.equals(local.getGraph())) {
					return new Object[] { _this, graph, local };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_12_ActivityNode14_greenBBFBF(
			HAntiPatternDetection _this, DFSGraph graph, HLocalAccessRelationCalculator local) {
		HIntenseFieldUsageDetector infuse = CodesmellsFactory.eINSTANCE.createHIntenseFieldUsageDetector();
		Edge edge12 = DfsFactory.eINSTANCE.createEdge();
		infuse.setGraph(graph);
		infuse.setHulk(_this);
		edge12.setGraph(graph);
		infuse.getOutgoing().add(edge12);
		local.getIncoming().add(edge12);
		return new Object[] { _this, graph, infuse, local, edge12 };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_1_numberOfMembersMetric_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_1_numberOfMembersMetric_greenBFB(DFSGraph graph,
			HAntiPatternDetection _this) {
		HMemberNumberCalculator nmd = MetricsFactory.eINSTANCE.createHMemberNumberCalculator();
		nmd.setGraph(graph);
		nmd.setHulk(_this);
		return new Object[] { graph, nmd, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_2_ActivityNode2_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_2_ActivityNode2_greenBBF(DFSGraph graph,
			HAntiPatternDetection _this) {
		HMethodNumberCalculator methods = MetricsFactory.eINSTANCE.createHMethodNumberCalculator();
		methods.setHulk(_this);
		methods.setGraph(graph);
		return new Object[] { graph, _this, methods };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_3_ActivityNode3_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_3_ActivityNode3_greenBFB(DFSGraph graph,
			HAntiPatternDetection _this) {
		HLCOM5Calculator lcom = SourcemeterFactory.eINSTANCE.createHLCOM5Calculator();
		lcom.setGraph(graph);
		lcom.setHulk(_this);
		return new Object[] { graph, lcom, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_4_ActivityNode4_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_4_ActivityNode4_greenFBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		HSettersCalculator ns = SourcemeterFactory.eINSTANCE.createHSettersCalculator();
		ns.setGraph(graph);
		ns.setHulk(_this);
		return new Object[] { ns, graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_5_ActivityNode5_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_5_ActivityNode5_greenBFB(DFSGraph graph,
			HAntiPatternDetection _this) {
		HGettersCalculator ng = SourcemeterFactory.eINSTANCE.createHGettersCalculator();
		ng.setGraph(graph);
		ng.setHulk(_this);
		return new Object[] { graph, ng, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_6_ActivityNode6_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_6_ActivityNode6_greenBFB(DFSGraph graph,
			HAntiPatternDetection _this) {
		HIncommingInvocationsCalculator nii = SourcemeterFactory.eINSTANCE.createHIncommingInvocationsCalculator();
		nii.setGraph(graph);
		nii.setHulk(_this);
		return new Object[] { graph, nii, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_7_ActivityNode7_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_7_ActivityNode7_greenBFB(DFSGraph graph,
			HAntiPatternDetection _this) {
		HOutgoingInvocationsCalculator noi = SourcemeterFactory.eINSTANCE.createHOutgoingInvocationsCalculator();
		noi.setGraph(graph);
		noi.setHulk(_this);
		return new Object[] { graph, noi, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_8_ActivityNode9_blackBBBB(DFSGraph graph,
			HAntiPatternDetection _this, HOutgoingInvocationsCalculator noi, HIncommingInvocationsCalculator nii) {
		return new Object[] { graph, _this, noi, nii };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_8_ActivityNode9_greenBBFBBFF(DFSGraph graph,
			HAntiPatternDetection _this, HOutgoingInvocationsCalculator noi, HIncommingInvocationsCalculator nii) {
		HInvocationRelationCalculator relation = MetricsFactory.eINSTANCE.createHInvocationRelationCalculator();
		Edge edge3 = DfsFactory.eINSTANCE.createEdge();
		Edge edge4 = DfsFactory.eINSTANCE.createEdge();
		relation.setHulk(_this);
		relation.setGraph(graph);
		relation.getOutgoing().add(edge3);
		noi.getIncoming().add(edge3);
		edge3.setGraph(graph);
		edge4.setGraph(graph);
		relation.getOutgoing().add(edge4);
		nii.getIncoming().add(edge4);
		return new Object[] { graph, _this, relation, noi, nii, edge3, edge4 };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_9_ActivityNode8_blackBBBBB(DFSGraph graph,
			HGettersCalculator ng, HSettersCalculator ns, HMethodNumberCalculator methods,
			HAntiPatternDetection _this) {
		return new Object[] { graph, ng, ns, methods, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_9_ActivityNode8_greenBFBBBFFFB(DFSGraph graph,
			HGettersCalculator ng, HSettersCalculator ns, HMethodNumberCalculator methods,
			HAntiPatternDetection _this) {
		HGetterSetterMethodRelationCalculator getterSetterRelation = MetricsFactory.eINSTANCE
				.createHGetterSetterMethodRelationCalculator();
		Edge edge0 = DfsFactory.eINSTANCE.createEdge();
		Edge edge1 = DfsFactory.eINSTANCE.createEdge();
		Edge edge2 = DfsFactory.eINSTANCE.createEdge();
		getterSetterRelation.setGraph(graph);
		getterSetterRelation.setHulk(_this);
		edge0.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge0);
		ng.getIncoming().add(edge0);
		edge1.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge1);
		ns.getIncoming().add(edge1);
		edge2.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge2);
		methods.getIncoming().add(edge2);
		return new Object[] { graph, getterSetterRelation, ng, ns, methods, edge0, edge1, edge2, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_10_ActivityNode10_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_10_ActivityNode10_greenBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		HAverageParamtersCalculator params = MetricsFactory.eINSTANCE.createHAverageParamtersCalculator();
		params.setGraph(graph);
		params.setHulk(_this);
		return new Object[] { _this, graph, params };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_11_ActivityNode11_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_11_ActivityNode11_greenBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		HAverageOverloadingInClassCalculator over = MetricsFactory.eINSTANCE
				.createHAverageOverloadingInClassCalculator();
		over.setGraph(graph);
		over.setHulk(_this);
		return new Object[] { _this, graph, over };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_12_ActivityNode13_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_12_ActivityNode13_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HDepthOfInheritanceCalculator inh = SourcemeterFactory.eINSTANCE.createHDepthOfInheritanceCalculator();
		inh.setHulk(_this);
		inh.setGraph(graph);
		return new Object[] { _this, inh, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_13_ActivityNode13_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_13_ActivityNode13_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HNumberOfChildCalculator child = MetricsFactory.eINSTANCE.createHNumberOfChildCalculator();
		child.setHulk(_this);
		child.setGraph(graph);
		return new Object[] { _this, child, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_14_ActivityNode13_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_14_ActivityNode13_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HLocalMethodAccessCalculator lma = MetricsFactory.eINSTANCE.createHLocalMethodAccessCalculator();
		lma.setHulk(_this);
		lma.setGraph(graph);
		return new Object[] { _this, lma, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_15_ActivityNode13_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_15_ActivityNode13_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HLocalFieldsAccessCalculator lfa = MetricsFactory.eINSTANCE.createHLocalFieldsAccessCalculator();
		lfa.setHulk(_this);
		lfa.setGraph(graph);
		return new Object[] { _this, lfa, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_16_ActivityNode13_blackBBBB(
			HAntiPatternDetection _this, DFSGraph graph, HLocalFieldsAccessCalculator lfa,
			HLocalMethodAccessCalculator lma) {
		return new Object[] { _this, graph, lfa, lma };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_16_ActivityNode13_greenBFBBBFF(
			HAntiPatternDetection _this, DFSGraph graph, HLocalFieldsAccessCalculator lfa,
			HLocalMethodAccessCalculator lma) {
		HLocalAccessRelationCalculator far = MetricsFactory.eINSTANCE.createHLocalAccessRelationCalculator();
		Edge edge5 = DfsFactory.eINSTANCE.createEdge();
		Edge edge6 = DfsFactory.eINSTANCE.createEdge();
		far.setHulk(_this);
		far.setGraph(graph);
		far.getOutgoing().add(edge5);
		lfa.getIncoming().add(edge5);
		edge5.setGraph(graph);
		far.getOutgoing().add(edge6);
		lma.getIncoming().add(edge6);
		edge6.setGraph(graph);
		return new Object[] { _this, far, graph, lfa, lma, edge5, edge6 };
	}

	public static final Object[] pattern_HAntiPatternDetection_4_1_CreateDependencyGraph_blackB(
			HAntiPatternDetection _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_4_1_CreateDependencyGraph_greenF() {
		DFSGraph graph = DfsFactory.eINSTANCE.createDFSGraph();
		return new Object[] { graph };
	}

	public static final void pattern_HAntiPatternDetection_4_2_Callextractedmethod_expressionBB(
			HAntiPatternDetection _this, DFSGraph graph) {
		_this.createMetricDependencies(graph);

	}

	public static final void pattern_HAntiPatternDetection_4_3_Callextractedmethod_expressionBB(
			HAntiPatternDetection _this, DFSGraph graph) {
		_this.createCodeSmellDependencies(graph);

	}

	public static final void pattern_HAntiPatternDetection_4_4_Callextractedmethod_expressionBB(
			HAntiPatternDetection _this, DFSGraph graph) {
		_this.createAntiPatternDependencies(graph);

	}

	public static final DFSGraph pattern_HAntiPatternDetection_4_5_expressionFB(DFSGraph graph) {
		DFSGraph _result = graph;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HAntiPatternDetectionImpl
