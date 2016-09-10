/**
 */
package org.gravity.tgg.modisco.Rules.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.PrimitiveTypeBoolean;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.ModelToTypeGraph;
import org.gravity.tgg.modisco.ModiscoFactory;
import org.gravity.tgg.modisco.PrimitiveTypeToTClass;

import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsBoolean;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Is Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeIsBooleanImpl extends AbstractRuleImpl implements PrimitiveTypeIsBoolean {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeIsBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPrimitiveTypeIsBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		// initial bindings
		Object[] result1_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_0_1_initialbindings_blackBBBB(this, match, ePrimitiveType, eModel);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[ePrimitiveType] = " + ePrimitiveType
					+ ", " + "[eModel] = " + eModel + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, ePrimitiveType, eModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", "
					+ "[eModel] = " + eModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_0_4_collectelementstobetranslated_blackBBB(match, ePrimitiveType,
							eModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", "
						+ "[eModel] = " + eModel + ".");
			}
			PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_0_4_collectelementstobetranslated_greenBBBF(match,
					ePrimitiveType, eModel);
			// EMoflonEdge eModel__ePrimitiveType____orphanTypes = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_0_5_collectcontextelements_blackBBB(match, ePrimitiveType, eModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", "
						+ "[eModel] = " + eModel + ".");
			}
			PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_0_5_collectcontextelements_greenBB(match, eModel);

			// register objects to match
			PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_0_6_registerobjectstomatch_expressionBBBB(this,
					match, ePrimitiveType, eModel);
			return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_0_7_expressionF();
		} else {
			return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) result1_bindingAndBlack[0];
		ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		Model eModel = (Model) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_greenBBFFF(ePrimitiveType, typeGraph);
		PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass = (PrimitiveTypeToTClass) result1_green[2];
		TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) result1_green[3];
		TClass tPrimitiveClass = (TClass) result1_green[4];

		// collect translated elements
		Object[] result2_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_1_2_collecttranslatedelements_blackBBBB(ePrimitiveType,
						ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[ePrimitiveType] = " + ePrimitiveType + ", " + "[ePrimitiveTypeToTPrimitiveClass] = "
					+ ePrimitiveTypeToTPrimitiveClass + ", " + "[typeToTAbstractType] = " + typeToTAbstractType + ", "
					+ "[tPrimitiveClass] = " + tPrimitiveClass + ".");
		}
		Object[] result2_green = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_1_2_collecttranslatedelements_greenFBBBB(ePrimitiveType,
						ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, ePrimitiveType,
						eModelToTypeGraph, typeGraph, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType,
						tPrimitiveClass, eModel);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", "
					+ "[eModelToTypeGraph] = " + eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[ePrimitiveTypeToTPrimitiveClass] = " + ePrimitiveTypeToTPrimitiveClass + ", "
					+ "[typeToTAbstractType] = " + typeToTAbstractType + ", " + "[tPrimitiveClass] = " + tPrimitiveClass
					+ ", " + "[eModel] = " + eModel + ".");
		}
		PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
				ruleresult, ePrimitiveType, typeGraph, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType,
				tPrimitiveClass, eModel);
		// EMoflonEdge eModel__ePrimitiveType____orphanTypes = (EMoflonEdge) result3_green[7];
		// EMoflonEdge typeGraph__tPrimitiveClass____classes = (EMoflonEdge) result3_green[8];
		// EMoflonEdge ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge typeToTAbstractType__ePrimitiveType____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge typeToTAbstractType__tPrimitiveClass____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tPrimitiveClass__typeGraph____pg = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, ePrimitiveType, eModelToTypeGraph, typeGraph, ePrimitiveTypeToTPrimitiveClass,
				typeToTAbstractType, tPrimitiveClass, eModel);
		return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) result2_binding[0];
		Model eModel = (Model) result2_binding[1];
		for (Object[] result2_black : PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_2_2_corematch_blackBFFBB(ePrimitiveType, eModel, match)) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_2_3_findcontext_blackBBBB(ePrimitiveType, eModelToTypeGraph,
							typeGraph, eModel)) {
				Object[] result3_green = PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_2_3_findcontext_greenBBBBFFFF(ePrimitiveType, eModelToTypeGraph,
								typeGraph, eModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge eModel__ePrimitiveType____orphanTypes = (EMoflonEdge) result3_green[5];
				// EMoflonEdge eModelToTypeGraph__eModel____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge eModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								ePrimitiveType, eModelToTypeGraph, typeGraph, eModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ePrimitiveType] = "
									+ ePrimitiveType + ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph + ", "
									+ "[typeGraph] = " + typeGraph + ", " + "[eModel] = " + eModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PrimitiveTypeIsBooleanImpl
							.pattern_PrimitiveTypeIsBoolean_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		match.registerObject("ePrimitiveType", ePrimitiveType);
		match.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, PrimitiveTypeBoolean ePrimitiveType, Model eModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, PrimitiveTypeBoolean ePrimitiveType,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ePrimitiveType", ePrimitiveType);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eModel", eModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph,
			EObject typeGraph, EObject ePrimitiveTypeToTPrimitiveClass, EObject typeToTAbstractType,
			EObject tPrimitiveClass, EObject eModel) {
		ruleresult.registerObject("ePrimitiveType", ePrimitiveType);
		ruleresult.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("ePrimitiveTypeToTPrimitiveClass", ePrimitiveTypeToTPrimitiveClass);
		ruleresult.registerObject("typeToTAbstractType", typeToTAbstractType);
		ruleresult.registerObject("tPrimitiveClass", tPrimitiveClass);
		ruleresult.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("ePrimitiveType").eClass())
				.equals("java.PrimitiveTypeBoolean.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		// initial bindings
		Object[] result1_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_10_1_initialbindings_blackBBBB(this, match, typeGraph, tPrimitiveClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[tPrimitiveClass] = " + tPrimitiveClass + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, typeGraph,
						tPrimitiveClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[tPrimitiveClass] = " + tPrimitiveClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_10_4_collectelementstobetranslated_blackBBB(match, typeGraph,
							tPrimitiveClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[tPrimitiveClass] = " + tPrimitiveClass + ".");
			}
			PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_10_4_collectelementstobetranslated_greenBBBFFF(
					match, typeGraph, tPrimitiveClass);
			// EMoflonEdge typeGraph__tPrimitiveClass____classes = (EMoflonEdge) result4_green[3];
			// EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tPrimitiveClass__typeGraph____pg = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_10_5_collectcontextelements_blackBBB(match, typeGraph,
							tPrimitiveClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[tPrimitiveClass] = " + tPrimitiveClass + ".");
			}
			PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_10_5_collectcontextelements_greenBB(match,
					typeGraph);

			// register objects to match
			PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_10_6_registerobjectstomatch_expressionBBBB(this,
					match, typeGraph, tPrimitiveClass);
			return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_10_7_expressionF();
		} else {
			return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TClass tPrimitiveClass = (TClass) result1_bindingAndBlack[2];
		Model eModel = (Model) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_greenFFFBB(tPrimitiveClass, eModel);
		PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) result1_green[0];
		PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass = (PrimitiveTypeToTClass) result1_green[1];
		TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) result1_green[2];

		// collect translated elements
		Object[] result2_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_11_2_collecttranslatedelements_blackBBBB(ePrimitiveType,
						ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[ePrimitiveType] = " + ePrimitiveType + ", " + "[ePrimitiveTypeToTPrimitiveClass] = "
					+ ePrimitiveTypeToTPrimitiveClass + ", " + "[typeToTAbstractType] = " + typeToTAbstractType + ", "
					+ "[tPrimitiveClass] = " + tPrimitiveClass + ".");
		}
		Object[] result2_green = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_11_2_collecttranslatedelements_greenFBBBB(ePrimitiveType,
						ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, ePrimitiveType,
						eModelToTypeGraph, typeGraph, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType,
						tPrimitiveClass, eModel);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", "
					+ "[eModelToTypeGraph] = " + eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[ePrimitiveTypeToTPrimitiveClass] = " + ePrimitiveTypeToTPrimitiveClass + ", "
					+ "[typeToTAbstractType] = " + typeToTAbstractType + ", " + "[tPrimitiveClass] = " + tPrimitiveClass
					+ ", " + "[eModel] = " + eModel + ".");
		}
		PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
				ruleresult, ePrimitiveType, typeGraph, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType,
				tPrimitiveClass, eModel);
		// EMoflonEdge eModel__ePrimitiveType____orphanTypes = (EMoflonEdge) result3_green[7];
		// EMoflonEdge typeGraph__tPrimitiveClass____classes = (EMoflonEdge) result3_green[8];
		// EMoflonEdge ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge typeToTAbstractType__ePrimitiveType____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge typeToTAbstractType__tPrimitiveClass____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tPrimitiveClass__typeGraph____pg = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, ePrimitiveType, eModelToTypeGraph, typeGraph, ePrimitiveTypeToTPrimitiveClass,
				typeToTAbstractType, tPrimitiveClass, eModel);
		return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result2_binding[0];
		TClass tPrimitiveClass = (TClass) result2_binding[1];
		for (Object[] result2_black : PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_12_2_corematch_blackFBBFB(typeGraph, tPrimitiveClass, match)) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[0];
			Model eModel = (Model) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_12_3_findcontext_blackBBBB(eModelToTypeGraph, typeGraph,
							tPrimitiveClass, eModel)) {
				Object[] result3_green = PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_12_3_findcontext_greenBBBBFFFFFF(eModelToTypeGraph, typeGraph,
								tPrimitiveClass, eModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge typeGraph__tPrimitiveClass____classes = (EMoflonEdge) result3_green[5];
				// EMoflonEdge eModelToTypeGraph__eModel____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge eModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tPrimitiveClass__typeGraph____pg = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eModelToTypeGraph] = " + eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[tPrimitiveClass] = " + tPrimitiveClass + ", " + "[eModel] = " + eModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PrimitiveTypeIsBooleanImpl
							.pattern_PrimitiveTypeIsBoolean_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tPrimitiveClass", tPrimitiveClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tPrimitiveClass", tPrimitiveClass);
		isApplicableMatch.registerObject("eModel", eModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph,
			EObject typeGraph, EObject ePrimitiveTypeToTPrimitiveClass, EObject typeToTAbstractType,
			EObject tPrimitiveClass, EObject eModel) {
		ruleresult.registerObject("ePrimitiveType", ePrimitiveType);
		ruleresult.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("ePrimitiveTypeToTPrimitiveClass", ePrimitiveTypeToTPrimitiveClass);
		ruleresult.registerObject("typeToTAbstractType", typeToTAbstractType);
		ruleresult.registerObject("tPrimitiveClass", tPrimitiveClass);
		ruleresult.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tPrimitiveClass").eClass())
				.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_30(EMoflonEdge _edge_orphanTypes) {
		// prepare return value
		Object[] result1_bindingAndBlack = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_20_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) result2_black[0];
			Model eModel = (Model) result2_black[1];
			Object[] result2_green = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, ePrimitiveType, eModel)) {
				// Ensure that the correct types of elements are matched
				if (PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = PrimitiveTypeIsBooleanImpl
							.pattern_PrimitiveTypeIsBoolean_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_27(EMoflonEdge _edge_classes) {
		// prepare return value
		Object[] result1_bindingAndBlack = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_blackFFB(_edge_classes)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[0];
			TClass tPrimitiveClass = (TClass) result2_black[1];
			Object[] result2_green = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, typeGraph, tPrimitiveClass)) {
				// Ensure that the correct types of elements are matched
				if (PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = PrimitiveTypeIsBooleanImpl
							.pattern_PrimitiveTypeIsBoolean_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PrimitiveTypeIsBoolean");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tPrimitiveClass", "tName", "boolean", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tPrimitiveClass", "tLib", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PrimitiveTypeIsBoolean");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tPrimitiveClass", "tName", "boolean", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tPrimitiveClass", "tLib", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_24_2_matchcontext_bindingFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		TClass tPrimitiveClass = (TClass) result2_binding[2];
		Model eModel = (Model) result2_binding[3];
		for (Object[] result2_black : PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_24_2_matchcontext_blackBFBBBBB(ePrimitiveType, typeGraph,
						tPrimitiveClass, eModel, sourceMatch, targetMatch)) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			Object[] result2_green = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_24_2_matchcontext_greenBBBBBBFB(ePrimitiveType, eModelToTypeGraph,
							typeGraph, tPrimitiveClass, eModel, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[6];

			// check csp
			Object[] result3_bindingAndBlack = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							ePrimitiveType, eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_24_4_createcorrespondence_blackBBBBB(ePrimitiveType, typeGraph,
								tPrimitiveClass, eModel, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[ePrimitiveType] = " + ePrimitiveType + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[tPrimitiveClass] = " + tPrimitiveClass + ", " + "[eModel] = "
							+ eModel + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_24_4_createcorrespondence_greenBFFBB(
						ePrimitiveType, tPrimitiveClass, isApplicableMatch);
				// PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass = (PrimitiveTypeToTClass) result4_green[1];
				// TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) result4_green[2];

				// add to returned result
				Object[] result5_black = PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, PrimitiveTypeBoolean ePrimitiveType,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ePrimitiveType", ePrimitiveType);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tPrimitiveClass", tPrimitiveClass);
		isApplicableMatch.registerObject("eModel", eModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(PrimitiveTypeBoolean ePrimitiveType, Model eModel) {// match tgg pattern
		Object[] result1_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_27_1_matchtggpattern_blackBB(ePrimitiveType, eModel);
		if (result1_black != null) {
			return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_27_2_expressionF();
		} else {
			return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TClass tPrimitiveClass) {// match tgg pattern
		Object[] result1_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_blackBB(typeGraph, tPrimitiveClass);
		if (result1_black != null) {
			PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_greenB(tPrimitiveClass);

			return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_28_2_expressionF();
		} else {
			return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph eModelToTypeGraphParameter) {
		// create result
		Object[] result1_black = PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : PrimitiveTypeIsBooleanImpl
				.pattern_PrimitiveTypeIsBoolean_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eModelToTypeGraphList = (RuleEntryList) result2_black[0];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			Model eModel = (Model) result2_black[2];
			TypeGraph typeGraph = (TypeGraph) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = PrimitiveTypeIsBooleanImpl
					.pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							eModelToTypeGraph, typeGraph, eModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModelToTypeGraph] = "
						+ eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", " + "[eModel] = " + eModel + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = PrimitiveTypeIsBooleanImpl
						.pattern_PrimitiveTypeIsBoolean_29_5_checknacs_blackBBB(eModelToTypeGraph, typeGraph, eModel);
				if (result5_black != null) {

					// perform
					Object[] result6_black = PrimitiveTypeIsBooleanImpl
							.pattern_PrimitiveTypeIsBoolean_29_6_perform_blackBBBB(eModelToTypeGraph, typeGraph, eModel,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[eModelToTypeGraph] = " + eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph
								+ ", " + "[eModel] = " + eModel + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_29_6_perform_greenFBFFFBB(typeGraph,
							eModel, ruleResult);
					// PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) result6_green[0];
					// PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass = (PrimitiveTypeToTClass) result6_green[2];
					// TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) result6_green[3];
					// TClass tPrimitiveClass = (TClass) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeIsBooleanImpl.pattern_PrimitiveTypeIsBoolean_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, Model eModel, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eModel", eModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPROPRIATE_FWD__MATCH_PRIMITIVETYPEBOOLEAN_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (PrimitiveTypeBoolean) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PRIMITIVETYPEBOOLEAN_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (PrimitiveTypeBoolean) arguments.get(1),
					(Model) arguments.get(2));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PRIMITIVETYPEBOOLEAN_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (PrimitiveTypeBoolean) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PRIMITIVETYPEBOOLEAN_MODELTOTYPEGRAPH_TYPEGRAPH_MODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(PrimitiveTypeBoolean) arguments.get(1), (ModelToTypeGraph) arguments.get(2),
					(TypeGraph) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_TYPEGRAPH_TCLASS_MODEL:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_27((EMoflonEdge) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_PRIMITIVETYPEBOOLEAN_MODELTOTYPEGRAPH_TYPEGRAPH_TCLASS_MODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (PrimitiveTypeBoolean) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (TypeGraph) arguments.get(3), (TClass) arguments.get(4),
					(Model) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___CHECK_DEC_FWD__PRIMITIVETYPEBOOLEAN_MODEL:
			return checkDEC_FWD((PrimitiveTypeBoolean) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___CHECK_DEC_BWD__TYPEGRAPH_TCLASS:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TClass) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_TYPEGRAPH_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(TypeGraph) arguments.get(2), (Model) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_0_1_initialbindings_blackBBBB(
			PrimitiveTypeIsBoolean _this, Match match, PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		return new Object[] { _this, match, ePrimitiveType, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_bindingFBBBB(PrimitiveTypeIsBoolean _this,
			Match match, PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, ePrimitiveType, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, ePrimitiveType, eModel };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_bindingAndBlackFBBBB(
			PrimitiveTypeIsBoolean _this, Match match, PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_binding = pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_bindingFBBBB(
				_this, match, ePrimitiveType, eModel);
		if (result_pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_black = pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsBoolean_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, ePrimitiveType, eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_0_3_CheckCSP_expressionFBB(PrimitiveTypeIsBoolean _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_0_4_collectelementstobetranslated_blackBBB(Match match,
			PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		return new Object[] { match, ePrimitiveType, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_0_4_collectelementstobetranslated_greenBBBF(Match match,
			PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		EMoflonEdge eModel__ePrimitiveType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(ePrimitiveType);
		String eModel__ePrimitiveType____orphanTypes_name_prime = "orphanTypes";
		eModel__ePrimitiveType____orphanTypes.setSrc(eModel);
		eModel__ePrimitiveType____orphanTypes.setTrg(ePrimitiveType);
		match.getToBeTranslatedEdges().add(eModel__ePrimitiveType____orphanTypes);
		eModel__ePrimitiveType____orphanTypes.setName(eModel__ePrimitiveType____orphanTypes_name_prime);
		return new Object[] { match, ePrimitiveType, eModel, eModel__ePrimitiveType____orphanTypes };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_0_5_collectcontextelements_blackBBB(Match match,
			PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		return new Object[] { match, ePrimitiveType, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_0_5_collectcontextelements_greenBB(Match match,
			Model eModel) {
		match.getContextNodes().add(eModel);
		return new Object[] { match, eModel };
	}

	public static final void pattern_PrimitiveTypeIsBoolean_0_6_registerobjectstomatch_expressionBBBB(
			PrimitiveTypeIsBoolean _this, Match match, PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		_this.registerObjectsToMatch_FWD(match, ePrimitiveType, eModel);

	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("ePrimitiveType");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModelToTypeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("eModel");
		EObject tmpEPrimitiveType = _localVariable_0;
		EObject tmpEModelToTypeGraph = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpEModel = _localVariable_3;
		if (tmpEPrimitiveType instanceof PrimitiveTypeBoolean) {
			PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) tmpEPrimitiveType;
			if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
				ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpEModel instanceof Model) {
						Model eModel = (Model) tmpEModel;
						return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_blackBBBBFBB(
			PrimitiveTypeBoolean ePrimitiveType, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel,
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_bindingAndBlackFFFFFBB(
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_binding = pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_binding != null) {
			PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_binding[0];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_binding[2];
			Model eModel = (Model) result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_binding[3];

			Object[] result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_black = pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_blackBBBBFBB(
					ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, _this, isApplicableMatch);
			if (result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_black[4];

				return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_1_1_performtransformation_greenBBFFF(
			PrimitiveTypeBoolean ePrimitiveType, TypeGraph typeGraph) {
		PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass = ModiscoFactory.eINSTANCE.createPrimitiveTypeToTClass();
		TypeToTAbstractType typeToTAbstractType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tPrimitiveClass = BasicFactory.eINSTANCE.createTClass();
		String tPrimitiveClass_tName_prime = "boolean";
		boolean tPrimitiveClass_tLib_prime = Boolean.valueOf(true);
		ePrimitiveTypeToTPrimitiveClass.setSource(ePrimitiveType);
		typeToTAbstractType.setSource(ePrimitiveType);
		typeGraph.getClasses().add(tPrimitiveClass);
		ePrimitiveTypeToTPrimitiveClass.setTarget(tPrimitiveClass);
		typeToTAbstractType.setTarget(tPrimitiveClass);
		typeGraph.getOwnedTypes().add(tPrimitiveClass);
		tPrimitiveClass.setTName(tPrimitiveClass_tName_prime);
		tPrimitiveClass.setTLib(Boolean.valueOf(tPrimitiveClass_tLib_prime));
		return new Object[] { ePrimitiveType, typeGraph, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType,
				tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_1_2_collecttranslatedelements_blackBBBB(
			PrimitiveTypeBoolean ePrimitiveType, PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass,
			TypeToTAbstractType typeToTAbstractType, TClass tPrimitiveClass) {
		return new Object[] { ePrimitiveType, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_1_2_collecttranslatedelements_greenFBBBB(
			PrimitiveTypeBoolean ePrimitiveType, PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass,
			TypeToTAbstractType typeToTAbstractType, TClass tPrimitiveClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(ePrimitiveType);
		ruleresult.getCreatedLinkElements().add(ePrimitiveTypeToTPrimitiveClass);
		ruleresult.getCreatedLinkElements().add(typeToTAbstractType);
		ruleresult.getCreatedElements().add(tPrimitiveClass);
		return new Object[] { ruleresult, ePrimitiveType, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType,
				tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph, EObject typeGraph,
			EObject ePrimitiveTypeToTPrimitiveClass, EObject typeToTAbstractType, EObject tPrimitiveClass,
			EObject eModel) {
		if (!ePrimitiveType.equals(typeGraph)) {
			if (!ePrimitiveType.equals(ePrimitiveTypeToTPrimitiveClass)) {
				if (!ePrimitiveType.equals(typeToTAbstractType)) {
					if (!ePrimitiveType.equals(tPrimitiveClass)) {
						if (!eModelToTypeGraph.equals(ePrimitiveType)) {
							if (!eModelToTypeGraph.equals(typeGraph)) {
								if (!eModelToTypeGraph.equals(ePrimitiveTypeToTPrimitiveClass)) {
									if (!eModelToTypeGraph.equals(typeToTAbstractType)) {
										if (!eModelToTypeGraph.equals(tPrimitiveClass)) {
											if (!typeGraph.equals(typeToTAbstractType)) {
												if (!ePrimitiveTypeToTPrimitiveClass.equals(typeGraph)) {
													if (!ePrimitiveTypeToTPrimitiveClass.equals(typeToTAbstractType)) {
														if (!ePrimitiveTypeToTPrimitiveClass.equals(tPrimitiveClass)) {
															if (!tPrimitiveClass.equals(typeGraph)) {
																if (!tPrimitiveClass.equals(typeToTAbstractType)) {
																	if (!eModel.equals(ePrimitiveType)) {
																		if (!eModel.equals(eModelToTypeGraph)) {
																			if (!eModel.equals(typeGraph)) {
																				if (!eModel.equals(
																						ePrimitiveTypeToTPrimitiveClass)) {
																					if (!eModel.equals(
																							typeToTAbstractType)) {
																						if (!eModel.equals(
																								tPrimitiveClass)) {
																							return new Object[] {
																									ruleresult,
																									ePrimitiveType,
																									eModelToTypeGraph,
																									typeGraph,
																									ePrimitiveTypeToTPrimitiveClass,
																									typeToTAbstractType,
																									tPrimitiveClass,
																									eModel };
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject ePrimitiveType, EObject typeGraph,
			EObject ePrimitiveTypeToTPrimitiveClass, EObject typeToTAbstractType, EObject tPrimitiveClass,
			EObject eModel) {
		EMoflonEdge eModel__ePrimitiveType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeToTAbstractType__ePrimitiveType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAbstractType__tPrimitiveClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrimitiveClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrimitiveTypeIsBoolean";
		String eModel__ePrimitiveType____orphanTypes_name_prime = "orphanTypes";
		String typeGraph__tPrimitiveClass____classes_name_prime = "classes";
		String ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source_name_prime = "source";
		String ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target_name_prime = "target";
		String typeToTAbstractType__ePrimitiveType____source_name_prime = "source";
		String typeToTAbstractType__tPrimitiveClass____target_name_prime = "target";
		String typeGraph__tPrimitiveClass____ownedTypes_name_prime = "ownedTypes";
		String tPrimitiveClass__typeGraph____pg_name_prime = "pg";
		eModel__ePrimitiveType____orphanTypes.setSrc(eModel);
		eModel__ePrimitiveType____orphanTypes.setTrg(ePrimitiveType);
		ruleresult.getTranslatedEdges().add(eModel__ePrimitiveType____orphanTypes);
		typeGraph__tPrimitiveClass____classes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____classes.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(typeGraph__tPrimitiveClass____classes);
		ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source.setSrc(ePrimitiveTypeToTPrimitiveClass);
		ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source);
		ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target.setSrc(ePrimitiveTypeToTPrimitiveClass);
		ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target);
		typeToTAbstractType__ePrimitiveType____source.setSrc(typeToTAbstractType);
		typeToTAbstractType__ePrimitiveType____source.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(typeToTAbstractType__ePrimitiveType____source);
		typeToTAbstractType__tPrimitiveClass____target.setSrc(typeToTAbstractType);
		typeToTAbstractType__tPrimitiveClass____target.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(typeToTAbstractType__tPrimitiveClass____target);
		typeGraph__tPrimitiveClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____ownedTypes.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(typeGraph__tPrimitiveClass____ownedTypes);
		tPrimitiveClass__typeGraph____pg.setSrc(tPrimitiveClass);
		tPrimitiveClass__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tPrimitiveClass__typeGraph____pg);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__ePrimitiveType____orphanTypes.setName(eModel__ePrimitiveType____orphanTypes_name_prime);
		typeGraph__tPrimitiveClass____classes.setName(typeGraph__tPrimitiveClass____classes_name_prime);
		ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source
				.setName(ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source_name_prime);
		ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target
				.setName(ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target_name_prime);
		typeToTAbstractType__ePrimitiveType____source.setName(typeToTAbstractType__ePrimitiveType____source_name_prime);
		typeToTAbstractType__tPrimitiveClass____target
				.setName(typeToTAbstractType__tPrimitiveClass____target_name_prime);
		typeGraph__tPrimitiveClass____ownedTypes.setName(typeGraph__tPrimitiveClass____ownedTypes_name_prime);
		tPrimitiveClass__typeGraph____pg.setName(tPrimitiveClass__typeGraph____pg_name_prime);
		return new Object[] { ruleresult, ePrimitiveType, typeGraph, ePrimitiveTypeToTPrimitiveClass,
				typeToTAbstractType, tPrimitiveClass, eModel, eModel__ePrimitiveType____orphanTypes,
				typeGraph__tPrimitiveClass____classes, ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source,
				ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target,
				typeToTAbstractType__ePrimitiveType____source, typeToTAbstractType__tPrimitiveClass____target,
				typeGraph__tPrimitiveClass____ownedTypes, tPrimitiveClass__typeGraph____pg };
	}

	public static final void pattern_PrimitiveTypeIsBoolean_1_5_registerobjects_expressionBBBBBBBBB(
			PrimitiveTypeIsBoolean _this, PerformRuleResult ruleresult, EObject ePrimitiveType,
			EObject eModelToTypeGraph, EObject typeGraph, EObject ePrimitiveTypeToTPrimitiveClass,
			EObject typeToTAbstractType, EObject tPrimitiveClass, EObject eModel) {
		_this.registerObjects_FWD(ruleresult, ePrimitiveType, eModelToTypeGraph, typeGraph,
				ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass, eModel);

	}

	public static final PerformRuleResult pattern_PrimitiveTypeIsBoolean_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_bindingFB(
			PrimitiveTypeIsBoolean _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PrimitiveTypeIsBoolean _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_bindingAndBlackFFB(
			PrimitiveTypeIsBoolean _this) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_binding = pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_black = pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PrimitiveTypeIsBoolean";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("ePrimitiveType");
		EObject _localVariable_1 = match.getObject("eModel");
		EObject tmpEPrimitiveType = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		if (tmpEPrimitiveType instanceof PrimitiveTypeBoolean) {
			PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) tmpEPrimitiveType;
			if (tmpEModel instanceof Model) {
				Model eModel = (Model) tmpEModel;
				return new Object[] { ePrimitiveType, eModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsBoolean_2_2_corematch_blackBFFBB(
			PrimitiveTypeBoolean ePrimitiveType, Model eModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
			TypeGraph typeGraph = eModelToTypeGraph.getTarget();
			if (typeGraph != null) {
				_result.add(new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsBoolean_2_3_findcontext_blackBBBB(
			PrimitiveTypeBoolean ePrimitiveType, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph,
			Model eModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eModel.getOrphanTypes().contains(ePrimitiveType)) {
			if (eModel.equals(eModelToTypeGraph.getSource())) {
				if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_3_findcontext_greenBBBBFFFF(
			PrimitiveTypeBoolean ePrimitiveType, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph,
			Model eModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModel__ePrimitiveType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModel__ePrimitiveType____orphanTypes_name_prime = "orphanTypes";
		String eModelToTypeGraph__eModel____source_name_prime = "source";
		String eModelToTypeGraph__typeGraph____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModel);
		eModel__ePrimitiveType____orphanTypes.setSrc(eModel);
		eModel__ePrimitiveType____orphanTypes.setTrg(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(eModel__ePrimitiveType____orphanTypes);
		eModelToTypeGraph__eModel____source.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__eModel____source);
		eModelToTypeGraph__typeGraph____target.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__typeGraph____target);
		eModel__ePrimitiveType____orphanTypes.setName(eModel__ePrimitiveType____orphanTypes_name_prime);
		eModelToTypeGraph__eModel____source.setName(eModelToTypeGraph__eModel____source_name_prime);
		eModelToTypeGraph__typeGraph____target.setName(eModelToTypeGraph__typeGraph____target_name_prime);
		return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, isApplicableMatch,
				eModel__ePrimitiveType____orphanTypes, eModelToTypeGraph__eModel____source,
				eModelToTypeGraph__typeGraph____target };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_bindingFBBBBBB(
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch, PrimitiveTypeBoolean ePrimitiveType,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, ePrimitiveType, eModelToTypeGraph,
				typeGraph, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph, eModel };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch, PrimitiveTypeBoolean ePrimitiveType,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_binding = pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph, eModel);
		if (result_pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_black = pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsBoolean_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph,
						eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_2_5_checkCSP_expressionFBB(PrimitiveTypeIsBoolean _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeIsBoolean";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeIsBoolean_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_10_1_initialbindings_blackBBBB(
			PrimitiveTypeIsBoolean _this, Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		return new Object[] { _this, match, typeGraph, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_bindingFBBBB(PrimitiveTypeIsBoolean _this,
			Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, typeGraph, tPrimitiveClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph, tPrimitiveClass };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_bindingAndBlackFBBBB(
			PrimitiveTypeIsBoolean _this, Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_binding = pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_bindingFBBBB(
				_this, match, typeGraph, tPrimitiveClass);
		if (result_pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_black = pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsBoolean_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeGraph, tPrimitiveClass };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_10_3_CheckCSP_expressionFBB(PrimitiveTypeIsBoolean _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph typeGraph, TClass tPrimitiveClass) {
		return new Object[] { match, typeGraph, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_10_4_collectelementstobetranslated_greenBBBFFF(
			Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		EMoflonEdge typeGraph__tPrimitiveClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrimitiveClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tPrimitiveClass);
		String typeGraph__tPrimitiveClass____classes_name_prime = "classes";
		String typeGraph__tPrimitiveClass____ownedTypes_name_prime = "ownedTypes";
		String tPrimitiveClass__typeGraph____pg_name_prime = "pg";
		typeGraph__tPrimitiveClass____classes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____classes.setTrg(tPrimitiveClass);
		match.getToBeTranslatedEdges().add(typeGraph__tPrimitiveClass____classes);
		typeGraph__tPrimitiveClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____ownedTypes.setTrg(tPrimitiveClass);
		match.getToBeTranslatedEdges().add(typeGraph__tPrimitiveClass____ownedTypes);
		tPrimitiveClass__typeGraph____pg.setSrc(tPrimitiveClass);
		tPrimitiveClass__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tPrimitiveClass__typeGraph____pg);
		typeGraph__tPrimitiveClass____classes.setName(typeGraph__tPrimitiveClass____classes_name_prime);
		typeGraph__tPrimitiveClass____ownedTypes.setName(typeGraph__tPrimitiveClass____ownedTypes_name_prime);
		tPrimitiveClass__typeGraph____pg.setName(tPrimitiveClass__typeGraph____pg_name_prime);
		return new Object[] { match, typeGraph, tPrimitiveClass, typeGraph__tPrimitiveClass____classes,
				typeGraph__tPrimitiveClass____ownedTypes, tPrimitiveClass__typeGraph____pg };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_10_5_collectcontextelements_blackBBB(Match match,
			TypeGraph typeGraph, TClass tPrimitiveClass) {
		return new Object[] { match, typeGraph, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_10_5_collectcontextelements_greenBB(Match match,
			TypeGraph typeGraph) {
		match.getContextNodes().add(typeGraph);
		return new Object[] { match, typeGraph };
	}

	public static final void pattern_PrimitiveTypeIsBoolean_10_6_registerobjectstomatch_expressionBBBB(
			PrimitiveTypeIsBoolean _this, Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		_this.registerObjectsToMatch_BWD(match, typeGraph, tPrimitiveClass);

	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eModelToTypeGraph");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPrimitiveClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("eModel");
		EObject tmpEModelToTypeGraph = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTPrimitiveClass = _localVariable_2;
		EObject tmpEModel = _localVariable_3;
		if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTPrimitiveClass instanceof TClass) {
					TClass tPrimitiveClass = (TClass) tmpTPrimitiveClass;
					if (tmpEModel instanceof Model) {
						Model eModel = (Model) tmpEModel;
						return new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_blackBBBBFBB(
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_bindingAndBlackFFFFFBB(
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_binding = pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_binding != null) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_binding[1];
			TClass tPrimitiveClass = (TClass) result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_binding[2];
			Model eModel = (Model) result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_binding[3];

			Object[] result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_black = pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_blackBBBBFBB(
					eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, _this, isApplicableMatch);
			if (result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_black[4];

				return new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_11_1_performtransformation_greenFFFBB(
			TClass tPrimitiveClass, Model eModel) {
		PrimitiveTypeBoolean ePrimitiveType = JavaFactory.eINSTANCE.createPrimitiveTypeBoolean();
		PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass = ModiscoFactory.eINSTANCE.createPrimitiveTypeToTClass();
		TypeToTAbstractType typeToTAbstractType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		eModel.getOrphanTypes().add(ePrimitiveType);
		ePrimitiveTypeToTPrimitiveClass.setSource(ePrimitiveType);
		ePrimitiveTypeToTPrimitiveClass.setTarget(tPrimitiveClass);
		typeToTAbstractType.setSource(ePrimitiveType);
		typeToTAbstractType.setTarget(tPrimitiveClass);
		return new Object[] { ePrimitiveType, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass,
				eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_11_2_collecttranslatedelements_blackBBBB(
			PrimitiveTypeBoolean ePrimitiveType, PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass,
			TypeToTAbstractType typeToTAbstractType, TClass tPrimitiveClass) {
		return new Object[] { ePrimitiveType, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_11_2_collecttranslatedelements_greenFBBBB(
			PrimitiveTypeBoolean ePrimitiveType, PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass,
			TypeToTAbstractType typeToTAbstractType, TClass tPrimitiveClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(ePrimitiveType);
		ruleresult.getCreatedLinkElements().add(ePrimitiveTypeToTPrimitiveClass);
		ruleresult.getCreatedLinkElements().add(typeToTAbstractType);
		ruleresult.getTranslatedElements().add(tPrimitiveClass);
		return new Object[] { ruleresult, ePrimitiveType, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType,
				tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph, EObject typeGraph,
			EObject ePrimitiveTypeToTPrimitiveClass, EObject typeToTAbstractType, EObject tPrimitiveClass,
			EObject eModel) {
		if (!ePrimitiveType.equals(typeGraph)) {
			if (!ePrimitiveType.equals(ePrimitiveTypeToTPrimitiveClass)) {
				if (!ePrimitiveType.equals(typeToTAbstractType)) {
					if (!ePrimitiveType.equals(tPrimitiveClass)) {
						if (!eModelToTypeGraph.equals(ePrimitiveType)) {
							if (!eModelToTypeGraph.equals(typeGraph)) {
								if (!eModelToTypeGraph.equals(ePrimitiveTypeToTPrimitiveClass)) {
									if (!eModelToTypeGraph.equals(typeToTAbstractType)) {
										if (!eModelToTypeGraph.equals(tPrimitiveClass)) {
											if (!typeGraph.equals(typeToTAbstractType)) {
												if (!ePrimitiveTypeToTPrimitiveClass.equals(typeGraph)) {
													if (!ePrimitiveTypeToTPrimitiveClass.equals(typeToTAbstractType)) {
														if (!ePrimitiveTypeToTPrimitiveClass.equals(tPrimitiveClass)) {
															if (!tPrimitiveClass.equals(typeGraph)) {
																if (!tPrimitiveClass.equals(typeToTAbstractType)) {
																	if (!eModel.equals(ePrimitiveType)) {
																		if (!eModel.equals(eModelToTypeGraph)) {
																			if (!eModel.equals(typeGraph)) {
																				if (!eModel.equals(
																						ePrimitiveTypeToTPrimitiveClass)) {
																					if (!eModel.equals(
																							typeToTAbstractType)) {
																						if (!eModel.equals(
																								tPrimitiveClass)) {
																							return new Object[] {
																									ruleresult,
																									ePrimitiveType,
																									eModelToTypeGraph,
																									typeGraph,
																									ePrimitiveTypeToTPrimitiveClass,
																									typeToTAbstractType,
																									tPrimitiveClass,
																									eModel };
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject ePrimitiveType, EObject typeGraph,
			EObject ePrimitiveTypeToTPrimitiveClass, EObject typeToTAbstractType, EObject tPrimitiveClass,
			EObject eModel) {
		EMoflonEdge eModel__ePrimitiveType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeToTAbstractType__ePrimitiveType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAbstractType__tPrimitiveClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrimitiveClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrimitiveTypeIsBoolean";
		String eModel__ePrimitiveType____orphanTypes_name_prime = "orphanTypes";
		String typeGraph__tPrimitiveClass____classes_name_prime = "classes";
		String ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source_name_prime = "source";
		String ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target_name_prime = "target";
		String typeToTAbstractType__ePrimitiveType____source_name_prime = "source";
		String typeToTAbstractType__tPrimitiveClass____target_name_prime = "target";
		String typeGraph__tPrimitiveClass____ownedTypes_name_prime = "ownedTypes";
		String tPrimitiveClass__typeGraph____pg_name_prime = "pg";
		eModel__ePrimitiveType____orphanTypes.setSrc(eModel);
		eModel__ePrimitiveType____orphanTypes.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(eModel__ePrimitiveType____orphanTypes);
		typeGraph__tPrimitiveClass____classes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____classes.setTrg(tPrimitiveClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tPrimitiveClass____classes);
		ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source.setSrc(ePrimitiveTypeToTPrimitiveClass);
		ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source);
		ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target.setSrc(ePrimitiveTypeToTPrimitiveClass);
		ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target);
		typeToTAbstractType__ePrimitiveType____source.setSrc(typeToTAbstractType);
		typeToTAbstractType__ePrimitiveType____source.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(typeToTAbstractType__ePrimitiveType____source);
		typeToTAbstractType__tPrimitiveClass____target.setSrc(typeToTAbstractType);
		typeToTAbstractType__tPrimitiveClass____target.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(typeToTAbstractType__tPrimitiveClass____target);
		typeGraph__tPrimitiveClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____ownedTypes.setTrg(tPrimitiveClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tPrimitiveClass____ownedTypes);
		tPrimitiveClass__typeGraph____pg.setSrc(tPrimitiveClass);
		tPrimitiveClass__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tPrimitiveClass__typeGraph____pg);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__ePrimitiveType____orphanTypes.setName(eModel__ePrimitiveType____orphanTypes_name_prime);
		typeGraph__tPrimitiveClass____classes.setName(typeGraph__tPrimitiveClass____classes_name_prime);
		ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source
				.setName(ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source_name_prime);
		ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target
				.setName(ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target_name_prime);
		typeToTAbstractType__ePrimitiveType____source.setName(typeToTAbstractType__ePrimitiveType____source_name_prime);
		typeToTAbstractType__tPrimitiveClass____target
				.setName(typeToTAbstractType__tPrimitiveClass____target_name_prime);
		typeGraph__tPrimitiveClass____ownedTypes.setName(typeGraph__tPrimitiveClass____ownedTypes_name_prime);
		tPrimitiveClass__typeGraph____pg.setName(tPrimitiveClass__typeGraph____pg_name_prime);
		return new Object[] { ruleresult, ePrimitiveType, typeGraph, ePrimitiveTypeToTPrimitiveClass,
				typeToTAbstractType, tPrimitiveClass, eModel, eModel__ePrimitiveType____orphanTypes,
				typeGraph__tPrimitiveClass____classes, ePrimitiveTypeToTPrimitiveClass__ePrimitiveType____source,
				ePrimitiveTypeToTPrimitiveClass__tPrimitiveClass____target,
				typeToTAbstractType__ePrimitiveType____source, typeToTAbstractType__tPrimitiveClass____target,
				typeGraph__tPrimitiveClass____ownedTypes, tPrimitiveClass__typeGraph____pg };
	}

	public static final void pattern_PrimitiveTypeIsBoolean_11_5_registerobjects_expressionBBBBBBBBB(
			PrimitiveTypeIsBoolean _this, PerformRuleResult ruleresult, EObject ePrimitiveType,
			EObject eModelToTypeGraph, EObject typeGraph, EObject ePrimitiveTypeToTPrimitiveClass,
			EObject typeToTAbstractType, EObject tPrimitiveClass, EObject eModel) {
		_this.registerObjects_BWD(ruleresult, ePrimitiveType, eModelToTypeGraph, typeGraph,
				ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass, eModel);

	}

	public static final PerformRuleResult pattern_PrimitiveTypeIsBoolean_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_bindingFB(
			PrimitiveTypeIsBoolean _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_blackFBB(EClass eClass,
			PrimitiveTypeIsBoolean _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_bindingAndBlackFFB(
			PrimitiveTypeIsBoolean _this) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_binding = pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_black = pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PrimitiveTypeIsBoolean";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeGraph");
		EObject _localVariable_1 = match.getObject("tPrimitiveClass");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTPrimitiveClass = _localVariable_1;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTPrimitiveClass instanceof TClass) {
				TClass tPrimitiveClass = (TClass) tmpTPrimitiveClass;
				return new Object[] { typeGraph, tPrimitiveClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsBoolean_12_2_corematch_blackFBBFB(TypeGraph typeGraph,
			TClass tPrimitiveClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String tPrimitiveClass_tName = tPrimitiveClass.getTName();
		if (tPrimitiveClass_tName.equals("boolean")) {
			boolean tPrimitiveClass_tLib = tPrimitiveClass.isTLib();
			if (Boolean.valueOf(tPrimitiveClass_tLib).equals(Boolean.valueOf(true))) {
				for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(typeGraph, ModelToTypeGraph.class, "target")) {
					Model eModel = eModelToTypeGraph.getSource();
					if (eModel != null) {
						_result.add(new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, match });
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsBoolean_12_3_findcontext_blackBBBB(
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeGraph.getClasses().contains(tPrimitiveClass)) {
			if (eModel.equals(eModelToTypeGraph.getSource())) {
				if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
					if (typeGraph.getOwnedTypes().contains(tPrimitiveClass)) {
						String tPrimitiveClass_tName = tPrimitiveClass.getTName();
						if (tPrimitiveClass_tName.equals("boolean")) {
							boolean tPrimitiveClass_tLib = tPrimitiveClass.isTLib();
							if (Boolean.valueOf(tPrimitiveClass_tLib).equals(Boolean.valueOf(true))) {
								_result.add(new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel });
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_3_findcontext_greenBBBBFFFFFF(
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge typeGraph__tPrimitiveClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrimitiveClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String typeGraph__tPrimitiveClass____classes_name_prime = "classes";
		String eModelToTypeGraph__eModel____source_name_prime = "source";
		String eModelToTypeGraph__typeGraph____target_name_prime = "target";
		String typeGraph__tPrimitiveClass____ownedTypes_name_prime = "ownedTypes";
		String tPrimitiveClass__typeGraph____pg_name_prime = "pg";
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tPrimitiveClass);
		isApplicableMatch.getAllContextElements().add(eModel);
		typeGraph__tPrimitiveClass____classes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____classes.setTrg(tPrimitiveClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tPrimitiveClass____classes);
		eModelToTypeGraph__eModel____source.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__eModel____source);
		eModelToTypeGraph__typeGraph____target.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__typeGraph____target);
		typeGraph__tPrimitiveClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____ownedTypes.setTrg(tPrimitiveClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tPrimitiveClass____ownedTypes);
		tPrimitiveClass__typeGraph____pg.setSrc(tPrimitiveClass);
		tPrimitiveClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tPrimitiveClass__typeGraph____pg);
		typeGraph__tPrimitiveClass____classes.setName(typeGraph__tPrimitiveClass____classes_name_prime);
		eModelToTypeGraph__eModel____source.setName(eModelToTypeGraph__eModel____source_name_prime);
		eModelToTypeGraph__typeGraph____target.setName(eModelToTypeGraph__typeGraph____target_name_prime);
		typeGraph__tPrimitiveClass____ownedTypes.setName(typeGraph__tPrimitiveClass____ownedTypes_name_prime);
		tPrimitiveClass__typeGraph____pg.setName(tPrimitiveClass__typeGraph____pg_name_prime);
		return new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, isApplicableMatch,
				typeGraph__tPrimitiveClass____classes, eModelToTypeGraph__eModel____source,
				eModelToTypeGraph__typeGraph____target, typeGraph__tPrimitiveClass____ownedTypes,
				tPrimitiveClass__typeGraph____pg };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_bindingFBBBBBB(
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eModelToTypeGraph, typeGraph,
				tPrimitiveClass, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToTypeGraph, typeGraph, tPrimitiveClass,
					eModel };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_binding = pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel);
		if (result_pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_black = pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsBoolean_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToTypeGraph, typeGraph, tPrimitiveClass,
						eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_12_5_checkCSP_expressionFBB(PrimitiveTypeIsBoolean _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeIsBoolean";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeIsBoolean_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_bindingFB(
			PrimitiveTypeIsBoolean _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrimitiveTypeIsBoolean _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_bindingAndBlackFFBF(
			PrimitiveTypeIsBoolean _this) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_binding = pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_black = pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsBoolean_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_orphanTypes.getSrc();
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			EObject tmpEPrimitiveType = _edge_orphanTypes.getTrg();
			if (tmpEPrimitiveType instanceof PrimitiveTypeBoolean) {
				PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) tmpEPrimitiveType;
				if (eModel.getOrphanTypes().contains(ePrimitiveType)) {
					_result.add(new Object[] { ePrimitiveType, eModel, _edge_orphanTypes });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			PrimitiveTypeIsBoolean _this, Match match, PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ePrimitiveType, eModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrimitiveTypeIsBoolean _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrimitiveTypeIsBoolean_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_bindingFB(
			PrimitiveTypeIsBoolean _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrimitiveTypeIsBoolean _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_bindingAndBlackFFBF(
			PrimitiveTypeIsBoolean _this) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_binding = pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_black = pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_black_nac_0B(
			TClass tPrimitiveClass) {
		for (TPackage __DEC_tPrimitiveClass_classes_670443 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiveClass, TPackage.class, "classes")) {
			return new Object[] { tPrimitiveClass };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_black_nac_1BB(
			TClass tPrimitiveClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tPrimitiveClass_classes_347991 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiveClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tPrimitiveClass_classes_347991)) {
				return new Object[] { tPrimitiveClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_black_nac_2B(
			TClass tPrimitiveClass) {
		TPackage __DEC_tPrimitiveClass_ownedTypes_587416 = tPrimitiveClass.getPackage();
		if (__DEC_tPrimitiveClass_ownedTypes_587416 != null) {
			return new Object[] { tPrimitiveClass };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_classes.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTPrimitiveClass = _edge_classes.getTrg();
			if (tmpTPrimitiveClass instanceof TClass) {
				TClass tPrimitiveClass = (TClass) tmpTPrimitiveClass;
				if (typeGraph.getClasses().contains(tPrimitiveClass)) {
					if (typeGraph.getOwnedTypes().contains(tPrimitiveClass)) {
						String tPrimitiveClass_tName = tPrimitiveClass.getTName();
						if (tPrimitiveClass_tName.equals("boolean")) {
							boolean tPrimitiveClass_tLib = tPrimitiveClass.isTLib();
							if (Boolean.valueOf(tPrimitiveClass_tLib).equals(Boolean.valueOf(true))) {
								if (pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_black_nac_0B(
										tPrimitiveClass) == null) {
									if (pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_black_nac_1BB(
											tPrimitiveClass, typeGraph) == null) {
										if (pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_black_nac_2B(
												tPrimitiveClass) == null) {
											_result.add(new Object[] { typeGraph, tPrimitiveClass, _edge_classes });
										}
									}
								}
							}

						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			PrimitiveTypeIsBoolean _this, Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph, tPrimitiveClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrimitiveTypeIsBoolean _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrimitiveTypeIsBoolean_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_1_prepare_blackB(PrimitiveTypeIsBoolean _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_2_matchcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("ePrimitiveType");
		EObject _localVariable_1 = targetMatch.getObject("typeGraph");
		EObject _localVariable_2 = targetMatch.getObject("tPrimitiveClass");
		EObject _localVariable_3 = sourceMatch.getObject("eModel");
		EObject tmpEPrimitiveType = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTPrimitiveClass = _localVariable_2;
		EObject tmpEModel = _localVariable_3;
		if (tmpEPrimitiveType instanceof PrimitiveTypeBoolean) {
			PrimitiveTypeBoolean ePrimitiveType = (PrimitiveTypeBoolean) tmpEPrimitiveType;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTPrimitiveClass instanceof TClass) {
					TClass tPrimitiveClass = (TClass) tmpTPrimitiveClass;
					if (tmpEModel instanceof Model) {
						Model eModel = (Model) tmpEModel;
						return new Object[] { ePrimitiveType, typeGraph, tPrimitiveClass, eModel, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsBoolean_24_2_matchcontext_blackBFBBBBB(
			PrimitiveTypeBoolean ePrimitiveType, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (eModel.getOrphanTypes().contains(ePrimitiveType)) {
				if (typeGraph.getClasses().contains(tPrimitiveClass)) {
					if (typeGraph.getOwnedTypes().contains(tPrimitiveClass)) {
						String tPrimitiveClass_tName = tPrimitiveClass.getTName();
						if (tPrimitiveClass_tName.equals("boolean")) {
							boolean tPrimitiveClass_tLib = tPrimitiveClass.isTLib();
							if (Boolean.valueOf(tPrimitiveClass_tLib).equals(Boolean.valueOf(true))) {
								for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
									if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
										_result.add(new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph,
												tPrimitiveClass, eModel, sourceMatch, targetMatch });
									}
								}
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_2_matchcontext_greenBBBBBBFB(
			PrimitiveTypeBoolean ePrimitiveType, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph,
			TClass tPrimitiveClass, Model eModel, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeIsBoolean";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tPrimitiveClass);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_bindingFBBBBBBBBB(
			PrimitiveTypeIsBoolean _this, CCMatch isApplicableMatch, PrimitiveTypeBoolean ePrimitiveType,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, ePrimitiveType, eModelToTypeGraph,
				typeGraph, tPrimitiveClass, eModel, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph,
					tPrimitiveClass, eModel, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(
			PrimitiveTypeIsBoolean _this, CCMatch isApplicableMatch, PrimitiveTypeBoolean ePrimitiveType,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_binding = pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel,
				sourceMatch, targetMatch);
		if (result_pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_black = pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsBoolean_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph,
						tPrimitiveClass, eModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_4_createcorrespondence_blackBBBBB(
			PrimitiveTypeBoolean ePrimitiveType, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			CCMatch isApplicableMatch) {
		return new Object[] { ePrimitiveType, typeGraph, tPrimitiveClass, eModel, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_4_createcorrespondence_greenBFFBB(
			PrimitiveTypeBoolean ePrimitiveType, TClass tPrimitiveClass, CCMatch isApplicableMatch) {
		PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass = ModiscoFactory.eINSTANCE.createPrimitiveTypeToTClass();
		TypeToTAbstractType typeToTAbstractType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		ePrimitiveTypeToTPrimitiveClass.setSource(ePrimitiveType);
		ePrimitiveTypeToTPrimitiveClass.setTarget(tPrimitiveClass);
		isApplicableMatch.getCreateCorr().add(ePrimitiveTypeToTPrimitiveClass);
		typeToTAbstractType.setSource(ePrimitiveType);
		typeToTAbstractType.setTarget(tPrimitiveClass);
		isApplicableMatch.getCreateCorr().add(typeToTAbstractType);
		return new Object[] { ePrimitiveType, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType, tPrimitiveClass,
				isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeIsBoolean";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeIsBoolean_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_27_1_matchtggpattern_blackBB(
			PrimitiveTypeBoolean ePrimitiveType, Model eModel) {
		if (eModel.getOrphanTypes().contains(ePrimitiveType)) {
			return new Object[] { ePrimitiveType, eModel };
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_black_nac_0B(
			TClass tPrimitiveClass) {
		for (TPackage __DEC_tPrimitiveClass_classes_21893 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiveClass, TPackage.class, "classes")) {
			return new Object[] { tPrimitiveClass };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_black_nac_1BB(
			TClass tPrimitiveClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tPrimitiveClass_classes_347721 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiveClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tPrimitiveClass_classes_347721)) {
				return new Object[] { tPrimitiveClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_black_nac_2B(
			TClass tPrimitiveClass) {
		TPackage __DEC_tPrimitiveClass_ownedTypes_3779 = tPrimitiveClass.getPackage();
		if (__DEC_tPrimitiveClass_ownedTypes_3779 != null) {
			return new Object[] { tPrimitiveClass };
		}

		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_blackBB(TypeGraph typeGraph,
			TClass tPrimitiveClass) {
		if (typeGraph.getClasses().contains(tPrimitiveClass)) {
			if (typeGraph.getOwnedTypes().contains(tPrimitiveClass)) {
				if (pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_black_nac_0B(tPrimitiveClass) == null) {
					if (pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_black_nac_1BB(tPrimitiveClass,
							typeGraph) == null) {
						if (pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_black_nac_2B(tPrimitiveClass) == null) {
							return new Object[] { typeGraph, tPrimitiveClass };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_28_1_matchtggpattern_greenB(TClass tPrimitiveClass) {
		String tPrimitiveClass_tName_prime = "boolean";
		boolean tPrimitiveClass_tLib_prime = Boolean.valueOf(true);
		tPrimitiveClass.setTName(tPrimitiveClass_tName_prime);
		tPrimitiveClass.setTLib(Boolean.valueOf(tPrimitiveClass_tLib_prime));
		return new Object[] { tPrimitiveClass };
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_1_createresult_blackB(PrimitiveTypeIsBoolean _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(eModelToTypeGraph)) {
			return new Object[] { ruleResult, eModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Model eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsBoolean_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eModelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEModelToTypeGraph : eModelToTypeGraphList.getEntryObjects()) {
				if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
					Model eModel = eModelToTypeGraph.getSource();
					if (eModel != null) {
						TypeGraph typeGraph = eModelToTypeGraph.getTarget();
						if (typeGraph != null) {
							if (pattern_PrimitiveTypeIsBoolean_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									eModelToTypeGraph) == null) {
								if (pattern_PrimitiveTypeIsBoolean_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										eModel) == null) {
									if (pattern_PrimitiveTypeIsBoolean_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											typeGraph) == null) {
										_result.add(new Object[] { eModelToTypeGraphList, eModelToTypeGraph, eModel,
												typeGraph, ruleEntryContainer, ruleResult });
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_bindingFBBBBBB(
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, Model eModel, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eModelToTypeGraph, typeGraph, eModel,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToTypeGraph, typeGraph, eModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeIsBoolean _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, Model eModel, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_binding = pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModelToTypeGraph, typeGraph, eModel, ruleResult);
		if (result_pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_black = pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsBoolean_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToTypeGraph, typeGraph, eModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsBoolean_29_4_checkCSP_expressionFBB(PrimitiveTypeIsBoolean _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_5_checknacs_blackBBB(
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel) {
		return new Object[] { eModelToTypeGraph, typeGraph, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_6_perform_blackBBBB(
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eModelToTypeGraph, typeGraph, eModel, ruleResult };
	}

	public static final Object[] pattern_PrimitiveTypeIsBoolean_29_6_perform_greenFBFFFBB(TypeGraph typeGraph,
			Model eModel, ModelgeneratorRuleResult ruleResult) {
		PrimitiveTypeBoolean ePrimitiveType = JavaFactory.eINSTANCE.createPrimitiveTypeBoolean();
		PrimitiveTypeToTClass ePrimitiveTypeToTPrimitiveClass = ModiscoFactory.eINSTANCE.createPrimitiveTypeToTClass();
		TypeToTAbstractType typeToTAbstractType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tPrimitiveClass = BasicFactory.eINSTANCE.createTClass();
		String tPrimitiveClass_tName_prime = "boolean";
		boolean tPrimitiveClass_tLib_prime = Boolean.valueOf(true);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eModel.getOrphanTypes().add(ePrimitiveType);
		ruleResult.getSourceObjects().add(ePrimitiveType);
		ePrimitiveTypeToTPrimitiveClass.setSource(ePrimitiveType);
		ruleResult.getCorrObjects().add(ePrimitiveTypeToTPrimitiveClass);
		typeToTAbstractType.setSource(ePrimitiveType);
		ruleResult.getCorrObjects().add(typeToTAbstractType);
		typeGraph.getClasses().add(tPrimitiveClass);
		ePrimitiveTypeToTPrimitiveClass.setTarget(tPrimitiveClass);
		typeToTAbstractType.setTarget(tPrimitiveClass);
		typeGraph.getOwnedTypes().add(tPrimitiveClass);
		ruleResult.getTargetObjects().add(tPrimitiveClass);
		tPrimitiveClass.setTName(tPrimitiveClass_tName_prime);
		tPrimitiveClass.setTLib(Boolean.valueOf(tPrimitiveClass_tLib_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { ePrimitiveType, typeGraph, ePrimitiveTypeToTPrimitiveClass, typeToTAbstractType,
				tPrimitiveClass, eModel, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_PrimitiveTypeIsBoolean_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PrimitiveTypeIsBooleanImpl