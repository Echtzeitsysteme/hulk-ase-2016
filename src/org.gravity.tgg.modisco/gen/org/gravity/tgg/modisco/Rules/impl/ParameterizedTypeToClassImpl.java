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
import org.eclipse.gmt.modisco.java.ParameterizedType;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.ModelToTypeGraph;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.ParameterizedTypeToClass;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Parameterized Type To Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterizedTypeToClassImpl extends AbstractRuleImpl implements ParameterizedTypeToClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTypeToClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterizedTypeToClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model eModel, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess, Type eType) {
		// initial bindings
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_0_1_initialbindings_blackBBBBBB(this, match, eModel,
						eParameterizedType, eTypeAccess, eType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[eModel] = " + eModel + ", "
					+ "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eType] = " + eType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, eModel,
						eParameterizedType, eTypeAccess, eType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[eModel] = " + eModel + ", "
					+ "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eType] = " + eType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(match, eModel,
							eParameterizedType, eTypeAccess, eType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eModel] = " + eModel + ", "
						+ "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess
						+ ", " + "[eType] = " + eType + ".");
			}
			ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, eModel,
							eParameterizedType, eTypeAccess, eType);
			// EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result4_green[5];
			// EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result4_green[6];
			// EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result4_green[7];
			// EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[8];

			// collect context elements
			Object[] result5_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_5_collectcontextelements_blackBBBBB(match, eModel,
							eParameterizedType, eTypeAccess, eType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eModel] = " + eModel + ", "
						+ "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess
						+ ", " + "[eType] = " + eType + ".");
			}
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_5_collectcontextelements_greenBBB(match,
					eModel, eType);

			// register objects to match
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, eModel, eParameterizedType, eTypeAccess, eType);
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_7_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[0];
		Model eModel = (Model) result1_bindingAndBlack[1];
		ParameterizedType eParameterizedType = (ParameterizedType) result1_bindingAndBlack[2];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[3];
		Type eType = (Type) result1_bindingAndBlack[4];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[5];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[6];
		TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_1_performtransformation_greenBBF(eParameterizedType, tAbstractType);
		TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result1_green[2];

		// collect translated elements
		Object[] result2_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_blackBBB(eParameterizedType,
						eTypeAccess, eParameterizedTypeToTAbstractType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eParameterizedTypeToTAbstractType] = " + eParameterizedTypeToTAbstractType + ".");
		}
		Object[] result2_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_greenFBBB(eParameterizedType,
						eTypeAccess, eParameterizedTypeToTAbstractType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, eModelToPg,
						eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType,
						eParameterizedTypeToTAbstractType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[eModel] = "
					+ eModel + ", " + "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = "
					+ eTypeAccess + ", " + "[eType] = " + eType + ", " + "[pg] = " + pg + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[eTypeToTAbstractType] = " + eTypeToTAbstractType + ", "
					+ "[eParameterizedTypeToTAbstractType] = " + eParameterizedTypeToTAbstractType + ".");
		}
		ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, eModel, eParameterizedType, eTypeAccess, eType, tAbstractType,
				eParameterizedTypeToTAbstractType);
		// EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result3_green[7];
		// EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result3_green[8];
		// EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[9];
		// EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
		// EMoflonEdge eParameterizedTypeToTAbstractType__eParameterizedType____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge eParameterizedTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
				eTypeToTAbstractType, eParameterizedTypeToTAbstractType);
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model eModel = (Model) result2_binding[0];
		ParameterizedType eParameterizedType = (ParameterizedType) result2_binding[1];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[2];
		Type eType = (Type) result2_binding[3];
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_2_corematch_blackFBBBBFFFB(eModel, eParameterizedType, eTypeAccess,
						eType, match)) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[0];
			TypeGraph pg = (TypeGraph) result2_black[5];
			TAbstractType tAbstractType = (TAbstractType) result2_black[6];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_2_3_findcontext_blackBBBBBBBB(eModelToPg, eModel,
							eParameterizedType, eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType)) {
				Object[] result3_green = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(eModelToPg, eModel,
								eParameterizedType, eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[13];
				// EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pg__tAbstractType____ownedTypes = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tAbstractType__pg____pg = (EMoflonEdge) result3_green[16];
				// EMoflonEdge eTypeToTAbstractType__eType____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge eTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg,
								tAbstractType, eTypeToTAbstractType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eModelToPg] = " + eModelToPg + ", " + "[eModel] = " + eModel + ", "
							+ "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess
							+ ", " + "[eType] = " + eType + ", " + "[pg] = " + pg + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[eTypeToTAbstractType] = " + eTypeToTAbstractType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_5_checkCSP_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model eModel, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess, Type eType) {
		match.registerObject("eModel", eModel);
		match.registerObject("eParameterizedType", eParameterizedType);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eType", eType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model eModel, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess, Type eType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg, Model eModel,
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("eParameterizedType", eParameterizedType);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eModelToPg, EObject eModel,
			EObject eParameterizedType, EObject eTypeAccess, EObject eType, EObject pg, EObject tAbstractType,
			EObject eTypeToTAbstractType, EObject eParameterizedTypeToTAbstractType) {
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("eParameterizedType", eParameterizedType);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
		ruleresult.registerObject("eParameterizedTypeToTAbstractType", eParameterizedTypeToTAbstractType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eParameterizedType").eClass())
						.equals("java.ParameterizedType.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
						.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(EMoflonEdge _edge_orphanTypes) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_10_2_testcorematchandDECs_blackFFFFB(_edge_orphanTypes)) {
			Model eModel = (Model) result2_black[0];
			ParameterizedType eParameterizedType = (ParameterizedType) result2_black[1];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[2];
			Type eType = (Type) result2_black[3];
			Object[] result2_green = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, eModel, eParameterizedType, eTypeAccess, eType)) {
				// Ensure that the correct types of elements are matched
				if (ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_10_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParameterizedTypeToClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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
		ruleResult.setRule("ParameterizedTypeToClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_13_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_13_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_13_2_matchcontext_bindingFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model eModel = (Model) result2_binding[0];
		ParameterizedType eParameterizedType = (ParameterizedType) result2_binding[1];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[2];
		Type eType = (Type) result2_binding[3];
		TypeGraph pg = (TypeGraph) result2_binding[4];
		TAbstractType tAbstractType = (TAbstractType) result2_binding[5];
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_13_2_matchcontext_blackFBBBBBBFBB(eModel, eParameterizedType,
						eTypeAccess, eType, pg, tAbstractType, sourceMatch, targetMatch)) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[0];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[7];
			Object[] result2_green = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_13_2_matchcontext_greenBBBBBBBBBFB(eModelToPg, eModel,
							eParameterizedType, eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType,
							sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[9];

			// check csp
			Object[] result3_bindingAndBlack = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_13_3_checkcsp_bindingAndBlackFBBBBBBBBBBBB(this,
							isApplicableMatch, eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg,
							tAbstractType, eTypeToTAbstractType, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_13_4_createcorrespondence_blackBBBBBBB(eModel,
								eParameterizedType, eTypeAccess, eType, pg, tAbstractType, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[eModel] = " + eModel + ", " + "[eParameterizedType] = "
							+ eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType
							+ ", " + "[pg] = " + pg + ", " + "[tAbstractType] = " + tAbstractType + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_13_4_createcorrespondence_greenBBFB(
						eParameterizedType, tAbstractType, isApplicableMatch);
				// TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result4_green[2];

				// add to returned result
				Object[] result5_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_13_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_13_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_13_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, ModelToTypeGraph eModelToPg, Model eModel,
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("eParameterizedType", eParameterizedType);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
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
	public boolean checkDEC_FWD(Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			Type eType) {// match tgg pattern
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_16_1_matchtggpattern_blackBBBB(eModel, eParameterizedType,
						eTypeAccess, eType);
		if (result1_black != null) {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_16_2_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_16_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph pg, TAbstractType tAbstractType) {// match tgg pattern
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_17_1_matchtggpattern_blackBB(pg, tAbstractType);
		if (result1_black != null) {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_17_2_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_17_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph eModelToPgParameter) {
		// create result
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList eModelToPgList = (RuleEntryList) result2_black[0];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[1];
			Model eModel = (Model) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TAbstractType tAbstractType = (TAbstractType) result2_black[4];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[5];
			Type eType = (Type) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_18_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eModelToPg, eModel, eType, pg, tAbstractType, eTypeToTAbstractType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModelToPg] = "
						+ eModelToPg + ", " + "[eModel] = " + eModel + ", " + "[eType] = " + eType + ", " + "[pg] = "
						+ pg + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[eTypeToTAbstractType] = "
						+ eTypeToTAbstractType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_18_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_18_5_checknacs_blackBBBBBB(eModelToPg, eModel, eType, pg,
								tAbstractType, eTypeToTAbstractType);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_18_6_perform_blackBBBBBBB(eModelToPg, eModel, eType, pg,
									tAbstractType, eTypeToTAbstractType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[eModelToPg] = " + eModelToPg + ", " + "[eModel] = " + eModel + ", " + "[eType] = "
								+ eType + ", " + "[pg] = " + pg + ", " + "[tAbstractType] = " + tAbstractType + ", "
								+ "[eTypeToTAbstractType] = " + eTypeToTAbstractType + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_18_6_perform_greenBFFBBFB(eModel,
							eType, tAbstractType, ruleResult);
					// ParameterizedType eParameterizedType = (ParameterizedType) result6_green[1];
					// TypeAccess eTypeAccess = (TypeAccess) result6_green[2];
					// TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_18_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			Model eModel, Type eType, TypeGraph pg, TAbstractType tAbstractType,
			TypeToTAbstractType eTypeToTAbstractType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
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
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_FWD__MATCH_MODEL_PARAMETERIZEDTYPE_TYPEACCESS_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2), (TypeAccess) arguments.get(3), (Type) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_PARAMETERIZEDTYPE_TYPEACCESS_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2), (TypeAccess) arguments.get(3), (Type) arguments.get(4));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_PARAMETERIZEDTYPE_TYPEACCESS_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2), (TypeAccess) arguments.get(3), (Type) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_MODEL_PARAMETERIZEDTYPE_TYPEACCESS_TYPE_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(Model) arguments.get(2), (ParameterizedType) arguments.get(3), (TypeAccess) arguments.get(4),
					(Type) arguments.get(5), (TypeGraph) arguments.get(6), (TAbstractType) arguments.get(7),
					(TypeToTAbstractType) arguments.get(8));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MODELTOTYPEGRAPH_MODEL_PARAMETERIZEDTYPE_TYPEACCESS_TYPE_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(Model) arguments.get(2), (ParameterizedType) arguments.get(3), (TypeAccess) arguments.get(4),
					(Type) arguments.get(5), (TypeGraph) arguments.get(6), (TAbstractType) arguments.get(7),
					(TypeToTAbstractType) arguments.get(8), (Match) arguments.get(9), (Match) arguments.get(10));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_DEC_FWD__MODEL_PARAMETERIZEDTYPE_TYPEACCESS_TYPE:
			return checkDEC_FWD((Model) arguments.get(0), (ParameterizedType) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_DEC_BWD__TYPEGRAPH_TABSTRACTTYPE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_MODEL_TYPE_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(Model) arguments.get(2), (Type) arguments.get(3), (TypeGraph) arguments.get(4),
					(TAbstractType) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_1_initialbindings_blackBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess, Type eType) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { _this, match, eModel, eParameterizedType, eTypeAccess, eType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingFBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess, Type eType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eModel, eParameterizedType, eTypeAccess, eType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eModel, eParameterizedType, eTypeAccess, eType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess, Type eType) {
		Object[] result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding = pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, eModel, eParameterizedType, eTypeAccess, eType);
		if (result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_black = pattern_ParameterizedTypeToClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eModel, eParameterizedType, eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_0_3_CheckCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { match, eModel, eParameterizedType, eTypeAccess, eType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType) {
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eParameterizedType);
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		match.getToBeTranslatedEdges().add(eModel__eParameterizedType____orphanTypes);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, eModel, eParameterizedType, eTypeAccess, eType,
				eModel__eParameterizedType____orphanTypes, eParameterizedType__eTypeAccess____type,
				eTypeAccess__eType____type, eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_5_collectcontextelements_blackBBBBB(Match match,
			Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { match, eModel, eParameterizedType, eTypeAccess, eType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_5_collectcontextelements_greenBBB(Match match,
			Model eModel, Type eType) {
		match.getContextNodes().add(eModel);
		match.getContextNodes().add(eType);
		return new Object[] { match, eModel, eType };
	}

	public static final void pattern_ParameterizedTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess, Type eType) {
		_this.registerObjectsToMatch_FWD(match, eModel, eParameterizedType, eTypeAccess, eType);

	}

	public static final boolean pattern_ParameterizedTypeToClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("eParameterizedType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_4 = isApplicableMatch.getObject("eType");
		EObject _localVariable_5 = isApplicableMatch.getObject("pg");
		EObject _localVariable_6 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_7 = isApplicableMatch.getObject("eTypeToTAbstractType");
		EObject tmpEModelToPg = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		EObject tmpEParameterizedType = _localVariable_2;
		EObject tmpETypeAccess = _localVariable_3;
		EObject tmpEType = _localVariable_4;
		EObject tmpPg = _localVariable_5;
		EObject tmpTAbstractType = _localVariable_6;
		EObject tmpETypeToTAbstractType = _localVariable_7;
		if (tmpEModelToPg instanceof ModelToTypeGraph) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
			if (tmpEModel instanceof Model) {
				Model eModel = (Model) tmpEModel;
				if (tmpEParameterizedType instanceof ParameterizedType) {
					ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
					if (tmpETypeAccess instanceof TypeAccess) {
						TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
						if (tmpEType instanceof Type) {
							Type eType = (Type) tmpEType;
							if (tmpPg instanceof TypeGraph) {
								TypeGraph pg = (TypeGraph) tmpPg;
								if (tmpTAbstractType instanceof TAbstractType) {
									TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
									if (tmpETypeToTAbstractType instanceof TypeToTAbstractType) {
										TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) tmpETypeToTAbstractType;
										return new Object[] { eModelToPg, eModel, eParameterizedType, eTypeAccess,
												eType, pg, tAbstractType, eTypeToTAbstractType, isApplicableMatch };
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

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
			ModelToTypeGraph eModelToPg, Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			Type eType, TypeGraph pg, TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType,
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		if (!eParameterizedType.equals(eType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
							eTypeToTAbstractType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding = pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding != null) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[0];
			Model eModel = (Model) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[1];
			ParameterizedType eParameterizedType = (ParameterizedType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[2];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[3];
			Type eType = (Type) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[4];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[5];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[6];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[7];

			Object[] result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black = pattern_ParameterizedTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
					eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType,
					_this, isApplicableMatch);
			if (result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black[8];

				return new Object[] { eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
						eTypeToTAbstractType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_greenBBF(
			ParameterizedType eParameterizedType, TAbstractType tAbstractType) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		return new Object[] { eParameterizedType, tAbstractType, eParameterizedTypeToTAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_blackBBB(
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			TypeToTAbstractType eParameterizedTypeToTAbstractType) {
		return new Object[] { eParameterizedType, eTypeAccess, eParameterizedTypeToTAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_greenFBBB(
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			TypeToTAbstractType eParameterizedTypeToTAbstractType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eParameterizedType);
		ruleresult.getTranslatedElements().add(eTypeAccess);
		ruleresult.getCreatedLinkElements().add(eParameterizedTypeToTAbstractType);
		return new Object[] { ruleresult, eParameterizedType, eTypeAccess, eParameterizedTypeToTAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eModelToPg, EObject eModel, EObject eParameterizedType,
			EObject eTypeAccess, EObject eType, EObject pg, EObject tAbstractType, EObject eTypeToTAbstractType,
			EObject eParameterizedTypeToTAbstractType) {
		if (!eModelToPg.equals(eParameterizedType)) {
			if (!eModelToPg.equals(eTypeAccess)) {
				if (!eModelToPg.equals(eType)) {
					if (!eModelToPg.equals(pg)) {
						if (!eModelToPg.equals(tAbstractType)) {
							if (!eModelToPg.equals(eTypeToTAbstractType)) {
								if (!eModelToPg.equals(eParameterizedTypeToTAbstractType)) {
									if (!eModel.equals(eModelToPg)) {
										if (!eModel.equals(eParameterizedType)) {
											if (!eModel.equals(eTypeAccess)) {
												if (!eModel.equals(eType)) {
													if (!eModel.equals(pg)) {
														if (!eModel.equals(tAbstractType)) {
															if (!eModel.equals(eTypeToTAbstractType)) {
																if (!eModel.equals(eParameterizedTypeToTAbstractType)) {
																	if (!eParameterizedType.equals(eTypeAccess)) {
																		if (!eParameterizedType.equals(eType)) {
																			if (!eParameterizedType.equals(pg)) {
																				if (!eParameterizedType
																						.equals(tAbstractType)) {
																					if (!eParameterizedType.equals(
																							eTypeToTAbstractType)) {
																						if (!eParameterizedType.equals(
																								eParameterizedTypeToTAbstractType)) {
																							if (!eTypeAccess
																									.equals(pg)) {
																								if (!eTypeAccess.equals(
																										tAbstractType)) {
																									if (!eTypeAccess
																											.equals(eTypeToTAbstractType)) {
																										if (!eType
																												.equals(eTypeAccess)) {
																											if (!eType
																													.equals(pg)) {
																												if (!eType
																														.equals(tAbstractType)) {
																													if (!eType
																															.equals(eTypeToTAbstractType)) {
																														if (!pg.equals(
																																tAbstractType)) {
																															if (!eTypeToTAbstractType
																																	.equals(pg)) {
																																if (!eTypeToTAbstractType
																																		.equals(tAbstractType)) {
																																	if (!eParameterizedTypeToTAbstractType
																																			.equals(eTypeAccess)) {
																																		if (!eParameterizedTypeToTAbstractType
																																				.equals(eType)) {
																																			if (!eParameterizedTypeToTAbstractType
																																					.equals(pg)) {
																																				if (!eParameterizedTypeToTAbstractType
																																						.equals(tAbstractType)) {
																																					if (!eParameterizedTypeToTAbstractType
																																							.equals(eTypeToTAbstractType)) {
																																						return new Object[] {
																																								ruleresult,
																																								eModelToPg,
																																								eModel,
																																								eParameterizedType,
																																								eTypeAccess,
																																								eType,
																																								pg,
																																								tAbstractType,
																																								eTypeToTAbstractType,
																																								eParameterizedTypeToTAbstractType };
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

	public static final Object[] pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject eModel, EObject eParameterizedType, EObject eTypeAccess,
			EObject eType, EObject tAbstractType, EObject eParameterizedTypeToTAbstractType) {
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedTypeToTAbstractType__eParameterizedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eParameterizedTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterizedTypeToClass";
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eParameterizedTypeToTAbstractType__eParameterizedType____source_name_prime = "source";
		String eParameterizedTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		ruleresult.getTranslatedEdges().add(eModel__eParameterizedType____orphanTypes);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eParameterizedTypeToTAbstractType__eParameterizedType____source.setSrc(eParameterizedTypeToTAbstractType);
		eParameterizedTypeToTAbstractType__eParameterizedType____source.setTrg(eParameterizedType);
		ruleresult.getCreatedEdges().add(eParameterizedTypeToTAbstractType__eParameterizedType____source);
		eParameterizedTypeToTAbstractType__tAbstractType____target.setSrc(eParameterizedTypeToTAbstractType);
		eParameterizedTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(eParameterizedTypeToTAbstractType__tAbstractType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eParameterizedTypeToTAbstractType__eParameterizedType____source
				.setName(eParameterizedTypeToTAbstractType__eParameterizedType____source_name_prime);
		eParameterizedTypeToTAbstractType__tAbstractType____target
				.setName(eParameterizedTypeToTAbstractType__tAbstractType____target_name_prime);
		return new Object[] { ruleresult, eModel, eParameterizedType, eTypeAccess, eType, tAbstractType,
				eParameterizedTypeToTAbstractType, eModel__eParameterizedType____orphanTypes,
				eParameterizedType__eTypeAccess____type, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess,
				eParameterizedTypeToTAbstractType__eParameterizedType____source,
				eParameterizedTypeToTAbstractType__tAbstractType____target };
	}

	public static final void pattern_ParameterizedTypeToClass_1_5_registerobjects_expressionBBBBBBBBBBB(
			ParameterizedTypeToClass _this, PerformRuleResult ruleresult, EObject eModelToPg, EObject eModel,
			EObject eParameterizedType, EObject eTypeAccess, EObject eType, EObject pg, EObject tAbstractType,
			EObject eTypeToTAbstractType, EObject eParameterizedTypeToTAbstractType) {
		_this.registerObjects_FWD(ruleresult, eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg,
				tAbstractType, eTypeToTAbstractType, eParameterizedTypeToTAbstractType);

	}

	public static final PerformRuleResult pattern_ParameterizedTypeToClass_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ParameterizedTypeToClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterizedTypeToClass _this) {
		Object[] result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding = pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black = pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParameterizedTypeToClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eModel");
		EObject _localVariable_1 = match.getObject("eParameterizedType");
		EObject _localVariable_2 = match.getObject("eTypeAccess");
		EObject _localVariable_3 = match.getObject("eType");
		EObject tmpEModel = _localVariable_0;
		EObject tmpEParameterizedType = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpEType = _localVariable_3;
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			if (tmpEParameterizedType instanceof ParameterizedType) {
				ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpEType instanceof Type) {
						Type eType = (Type) tmpEType;
						return new Object[] { eModel, eParameterizedType, eTypeAccess, eType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_2_2_corematch_blackFBBBBFFFB(Model eModel,
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eParameterizedType.equals(eType)) {
			for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
				TypeGraph pg = eModelToPg.getTarget();
				if (pg != null) {
					for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
						TAbstractType tAbstractType = eTypeToTAbstractType.getTarget();
						if (tAbstractType != null) {
							_result.add(new Object[] { eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg,
									tAbstractType, eTypeToTAbstractType, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_2_3_findcontext_blackBBBBBBBB(
			ModelToTypeGraph eModelToPg, Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			Type eType, TypeGraph pg, TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eParameterizedType.equals(eType)) {
			if (eModel.equals(eModelToPg.getSource())) {
				if (pg.equals(eModelToPg.getTarget())) {
					if (eModel.getOrphanTypes().contains(eParameterizedType)) {
						if (eTypeAccess.equals(eParameterizedType.getType())) {
							if (eType.equals(eTypeAccess.getType())) {
								if (pg.getOwnedTypes().contains(tAbstractType)) {
									if (eType.equals(eTypeToTAbstractType.getSource())) {
										if (tAbstractType.equals(eTypeToTAbstractType.getTarget())) {
											_result.add(new Object[] { eModelToPg, eModel, eParameterizedType,
													eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType });
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

	public static final Object[] pattern_ParameterizedTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			ModelToTypeGraph eModelToPg, Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			Type eType, TypeGraph pg, TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAbstractType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAbstractType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTAbstractType__eType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModelToPg__eModel____source_name_prime = "source";
		String eModelToPg__pg____target_name_prime = "target";
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String pg__tAbstractType____ownedTypes_name_prime = "ownedTypes";
		String tAbstractType__pg____pg_name_prime = "pg";
		String eTypeToTAbstractType__eType____source_name_prime = "source";
		String eTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(eParameterizedType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		isApplicableMatch.getAllContextElements().add(eModel__eParameterizedType____orphanTypes);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eTypeAccess____usagesInTypeAccess);
		pg__tAbstractType____ownedTypes.setSrc(pg);
		pg__tAbstractType____ownedTypes.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(pg__tAbstractType____ownedTypes);
		tAbstractType__pg____pg.setSrc(tAbstractType);
		tAbstractType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tAbstractType__pg____pg);
		eTypeToTAbstractType__eType____source.setSrc(eTypeToTAbstractType);
		eTypeToTAbstractType__eType____source.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType__eType____source);
		eTypeToTAbstractType__tAbstractType____target.setSrc(eTypeToTAbstractType);
		eTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType__tAbstractType____target);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		pg__tAbstractType____ownedTypes.setName(pg__tAbstractType____ownedTypes_name_prime);
		tAbstractType__pg____pg.setName(tAbstractType__pg____pg_name_prime);
		eTypeToTAbstractType__eType____source.setName(eTypeToTAbstractType__eType____source_name_prime);
		eTypeToTAbstractType__tAbstractType____target.setName(eTypeToTAbstractType__tAbstractType____target_name_prime);
		return new Object[] { eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
				eTypeToTAbstractType, isApplicableMatch, eModelToPg__eModel____source, eModelToPg__pg____target,
				eModel__eParameterizedType____orphanTypes, eParameterizedType__eTypeAccess____type,
				eTypeAccess__eType____type, eType__eTypeAccess____usagesInTypeAccess, pg__tAbstractType____ownedTypes,
				tAbstractType__pg____pg, eTypeToTAbstractType__eType____source,
				eTypeToTAbstractType__tAbstractType____target };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eModelToPg, eModel,
				eParameterizedType, eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, eParameterizedType, eTypeAccess,
					eType, pg, tAbstractType, eTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType) {
		Object[] result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding = pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
				eTypeToTAbstractType);
		if (result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_2_4_solveCSP_black = pattern_ParameterizedTypeToClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, eParameterizedType,
						eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_2_5_checkCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedTypeToClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedTypeToClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedTypeToClass _this) {
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

	public static final Object[] pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedTypeToClass _this) {
		Object[] result_pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_binding = pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_black = pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_orphanTypes.getSrc();
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			EObject tmpEParameterizedType = _edge_orphanTypes.getTrg();
			if (tmpEParameterizedType instanceof ParameterizedType) {
				ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
				if (eModel.getOrphanTypes().contains(eParameterizedType)) {
					TypeAccess eTypeAccess = eParameterizedType.getType();
					if (eTypeAccess != null) {
						Type eType = eTypeAccess.getType();
						if (eType != null) {
							if (!eParameterizedType.equals(eType)) {
								_result.add(new Object[] { eModel, eParameterizedType, eTypeAccess, eType,
										_edge_orphanTypes });
							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedTypeToClass_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess, Type eType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eModel, eParameterizedType, eTypeAccess, eType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedTypeToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedTypeToClass_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_1_prepare_blackB(ParameterizedTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_2_matchcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eModel");
		EObject _localVariable_1 = sourceMatch.getObject("eParameterizedType");
		EObject _localVariable_2 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_3 = sourceMatch.getObject("eType");
		EObject _localVariable_4 = targetMatch.getObject("pg");
		EObject _localVariable_5 = targetMatch.getObject("tAbstractType");
		EObject tmpEModel = _localVariable_0;
		EObject tmpEParameterizedType = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpEType = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		EObject tmpTAbstractType = _localVariable_5;
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			if (tmpEParameterizedType instanceof ParameterizedType) {
				ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpEType instanceof Type) {
						Type eType = (Type) tmpEType;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							if (tmpTAbstractType instanceof TAbstractType) {
								TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
								return new Object[] { eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_13_2_matchcontext_blackFBBBBBBFBB(
			Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eParameterizedType.equals(eType)) {
			if (!sourceMatch.equals(targetMatch)) {
				if (eModel.getOrphanTypes().contains(eParameterizedType)) {
					if (eTypeAccess.equals(eParameterizedType.getType())) {
						if (eType.equals(eTypeAccess.getType())) {
							if (pg.getOwnedTypes().contains(tAbstractType)) {
								for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
									if (pg.equals(eModelToPg.getTarget())) {
										for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(eType, TypeToTAbstractType.class,
														"source")) {
											if (tAbstractType.equals(eTypeToTAbstractType.getTarget())) {
												_result.add(new Object[] { eModelToPg, eModel, eParameterizedType,
														eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType,
														sourceMatch, targetMatch });
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
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_2_matchcontext_greenBBBBBBBBBFB(
			ModelToTypeGraph eModelToPg, Model eModel, ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			Type eType, TypeGraph pg, TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType,
			Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "ParameterizedTypeToClass";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(eParameterizedType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
				eTypeToTAbstractType, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_3_checkcsp_bindingFBBBBBBBBBBBB(
			ParameterizedTypeToClass _this, CCMatch isApplicableMatch, ModelToTypeGraph eModelToPg, Model eModel,
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, eModelToPg, eModel, eParameterizedType,
				eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, eParameterizedType, eTypeAccess,
					eType, pg, tAbstractType, eTypeToTAbstractType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_3_checkcsp_bindingAndBlackFBBBBBBBBBBBB(
			ParameterizedTypeToClass _this, CCMatch isApplicableMatch, ModelToTypeGraph eModelToPg, Model eModel,
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ParameterizedTypeToClass_13_3_checkcsp_binding = pattern_ParameterizedTypeToClass_13_3_checkcsp_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, eModelToPg, eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
				eTypeToTAbstractType, sourceMatch, targetMatch);
		if (result_pattern_ParameterizedTypeToClass_13_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_13_3_checkcsp_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_13_3_checkcsp_black = pattern_ParameterizedTypeToClass_13_3_checkcsp_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_13_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, eParameterizedType,
						eTypeAccess, eType, pg, tAbstractType, eTypeToTAbstractType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_4_createcorrespondence_blackBBBBBBB(Model eModel,
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			TAbstractType tAbstractType, CCMatch isApplicableMatch) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { eModel, eParameterizedType, eTypeAccess, eType, pg, tAbstractType,
					isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_4_createcorrespondence_greenBBFB(
			ParameterizedType eParameterizedType, TAbstractType tAbstractType, CCMatch isApplicableMatch) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		isApplicableMatch.getCreateCorr().add(eParameterizedTypeToTAbstractType);
		return new Object[] { eParameterizedType, tAbstractType, eParameterizedTypeToTAbstractType, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_13_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedTypeToClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedTypeToClass_13_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_16_1_matchtggpattern_blackBBBB(Model eModel,
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Type eType) {
		if (!eParameterizedType.equals(eType)) {
			if (eModel.getOrphanTypes().contains(eParameterizedType)) {
				if (eTypeAccess.equals(eParameterizedType.getType())) {
					if (eType.equals(eTypeAccess.getType())) {
						return new Object[] { eModel, eParameterizedType, eTypeAccess, eType };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_16_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_16_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_matchtggpattern_blackBB(TypeGraph pg,
			TAbstractType tAbstractType) {
		if (pg.getOwnedTypes().contains(tAbstractType)) {
			return new Object[] { pg, tAbstractType };
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_17_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_17_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_createresult_blackB(
			ParameterizedTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToPg) {
		if (ruleResult.getCorrObjects().contains(eModelToPg)) {
			return new Object[] { ruleResult, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Model eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eTypeToTAbstractType) {
		if (ruleResult.getCorrObjects().contains(eTypeToTAbstractType)) {
			return new Object[] { ruleResult, eTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Type eType) {
		if (ruleResult.getSourceObjects().contains(eType)) {
			return new Object[] { ruleResult, eType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_18_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eModelToPgList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEModelToPg : eModelToPgList.getEntryObjects()) {
				if (tmpEModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
					Model eModel = eModelToPg.getSource();
					if (eModel != null) {
						TypeGraph pg = eModelToPg.getTarget();
						if (pg != null) {
							if (pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_0BB(ruleResult,
									eModelToPg) == null) {
								if (pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_1BB(ruleResult,
										eModel) == null) {
									if (pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_2BB(ruleResult,
											pg) == null) {
										for (TAbstractType tAbstractType : pg.getOwnedTypes()) {
											if (pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_3BB(
													ruleResult, tAbstractType) == null) {
												for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(tAbstractType,
																TypeToTAbstractType.class, "target")) {
													Type eType = eTypeToTAbstractType.getSource();
													if (eType != null) {
														if (pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_4BB(
																ruleResult, eTypeToTAbstractType) == null) {
															if (pattern_ParameterizedTypeToClass_18_2_isapplicablecore_black_nac_5BB(
																	ruleResult, eType) == null) {
																_result.add(new Object[] { eModelToPgList, eModelToPg,
																		eModel, pg, tAbstractType, eTypeToTAbstractType,
																		eType, ruleEntryContainer, ruleResult });
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
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_3_solveCSP_bindingFBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			Model eModel, Type eType, TypeGraph pg, TAbstractType tAbstractType,
			TypeToTAbstractType eTypeToTAbstractType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eModelToPg, eModel, eType, pg,
				tAbstractType, eTypeToTAbstractType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, eType, pg, tAbstractType,
					eTypeToTAbstractType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			Model eModel, Type eType, TypeGraph pg, TAbstractType tAbstractType,
			TypeToTAbstractType eTypeToTAbstractType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParameterizedTypeToClass_18_3_solveCSP_binding = pattern_ParameterizedTypeToClass_18_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eModelToPg, eModel, eType, pg, tAbstractType, eTypeToTAbstractType,
				ruleResult);
		if (result_pattern_ParameterizedTypeToClass_18_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_18_3_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_18_3_solveCSP_black = pattern_ParameterizedTypeToClass_18_3_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_18_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, eType, pg, tAbstractType,
						eTypeToTAbstractType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_18_4_checkCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_5_checknacs_blackBBBBBB(
			ModelToTypeGraph eModelToPg, Model eModel, Type eType, TypeGraph pg, TAbstractType tAbstractType,
			TypeToTAbstractType eTypeToTAbstractType) {
		return new Object[] { eModelToPg, eModel, eType, pg, tAbstractType, eTypeToTAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_6_perform_blackBBBBBBB(ModelToTypeGraph eModelToPg,
			Model eModel, Type eType, TypeGraph pg, TAbstractType tAbstractType,
			TypeToTAbstractType eTypeToTAbstractType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eModelToPg, eModel, eType, pg, tAbstractType, eTypeToTAbstractType, ruleResult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_6_perform_greenBFFBBFB(Model eModel, Type eType,
			TAbstractType tAbstractType, ModelgeneratorRuleResult ruleResult) {
		ParameterizedType eParameterizedType = JavaFactory.eINSTANCE.createParameterizedType();
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		TypeToTAbstractType eParameterizedTypeToTAbstractType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eModel.getOrphanTypes().add(eParameterizedType);
		ruleResult.getSourceObjects().add(eParameterizedType);
		eParameterizedType.setType(eTypeAccess);
		eTypeAccess.setType(eType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		ruleResult.getCorrObjects().add(eParameterizedTypeToTAbstractType);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eModel, eParameterizedType, eTypeAccess, eType, tAbstractType,
				eParameterizedTypeToTAbstractType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ParameterizedTypeToClass_18_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterizedTypeToClassImpl
