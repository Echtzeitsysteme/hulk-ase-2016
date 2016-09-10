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

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;

import org.gravity.tgg.modisco.MEntryToTParameter;
import org.gravity.tgg.modisco.MMethodSignatureToTParameterList;

import org.gravity.tgg.modisco.Rules.MethodParameterLinkFirst;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TParameterList;

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
 * An implementation of the model object '<em><b>Method Parameter Link First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterLinkFirstImpl extends AbstractRuleImpl implements MethodParameterLinkFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterLinkFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameterLinkFirst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		// initial bindings
		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_0_1_initialbindings_blackBBBB(this, match, mmethodSignature, mEntry);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mmethodSignature] = "
					+ mmethodSignature + ", " + "[mEntry] = " + mEntry + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mmethodSignature,
						mEntry);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mmethodSignature] = " + mmethodSignature + ", "
					+ "[mEntry] = " + mEntry + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_0_4_collectelementstobetranslated_blackBBB(match,
							mmethodSignature, mEntry);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mmethodSignature] = " + mmethodSignature
						+ ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_4_collectelementstobetranslated_greenBBBF(
					match, mmethodSignature, mEntry);
			// EMoflonEdge mmethodSignature__mEntry____mFirstEntry = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_0_5_collectcontextelements_blackBBB(match, mmethodSignature,
							mEntry);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mmethodSignature] = " + mmethodSignature
						+ ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_5_collectcontextelements_greenBBB(match,
					mmethodSignature, mEntry);

			// register objects to match
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_6_registerobjectstomatch_expressionBBBB(
					this, match, mmethodSignature, mEntry);
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_7_expressionF();
		} else {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignature mmethodSignature = (MMethodSignature) result1_bindingAndBlack[0];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[1];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[2];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[3];
		MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result1_bindingAndBlack[4];
		MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_1_1_performtransformation_greenBB(tParameter,
				tParameterList);

		// collect translated elements
		Object[] result2_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mmethodSignature,
						tParameter, mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
						mmethodSignatureToTMethodSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mmethodSignature] = " + mmethodSignature + ", "
					+ "[tParameter] = " + tParameter + ", " + "[mEntry] = " + mEntry + ", " + "[tParameterList] = "
					+ tParameterList + ", " + "[eSingleVariableDeclarationToTParameter] = "
					+ eSingleVariableDeclarationToTParameter + ", " + "[mmethodSignatureToTMethodSignature] = "
					+ mmethodSignatureToTMethodSignature + ".");
		}
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult,
				mmethodSignature, tParameter, mEntry, tParameterList);
		// EMoflonEdge mmethodSignature__mEntry____mFirstEntry = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tParameterList__tParameter____first = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodSignature mmethodSignature = (MMethodSignature) result2_binding[0];
		MEntry mEntry = (MEntry) result2_binding[1];
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_2_2_corematch_blackBFBFFFB(mmethodSignature, mEntry, match)) {
			TParameter tParameter = (TParameter) result2_black[1];
			TParameterList tParameterList = (TParameterList) result2_black[3];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[4];
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_2_3_findcontext_blackBBBBBB(mmethodSignature, tParameter, mEntry,
							tParameterList, eSingleVariableDeclarationToTParameter,
							mmethodSignatureToTMethodSignature)) {
				Object[] result3_green = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_2_3_findcontext_greenBBBBBBFFFFFF(mmethodSignature,
								tParameter, mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
								mmethodSignatureToTMethodSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge mmethodSignature__mEntry____mFirstEntry = (EMoflonEdge) result3_green[7];
				// EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mmethodSignatureToTMethodSignature__mmethodSignature____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mmethodSignatureToTMethodSignature__tParameterList____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mmethodSignature, tParameter, mEntry, tParameterList,
								eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mmethodSignature] = " + mmethodSignature + ", " + "[tParameter] = " + tParameter + ", "
							+ "[mEntry] = " + mEntry + ", " + "[tParameterList] = " + tParameterList + ", "
							+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
							+ ", " + "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_2_5_checkCSP_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		match.registerObject("mmethodSignature", mmethodSignature);
		match.registerObject("mEntry", mEntry);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mmethodSignature, MEntry mEntry) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignature", mmethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mmethodSignature, EObject tParameter,
			EObject mEntry, EObject tParameterList, EObject eSingleVariableDeclarationToTParameter,
			EObject mmethodSignatureToTMethodSignature) {
		ruleresult.registerObject("mmethodSignature", mmethodSignature);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("eSingleVariableDeclarationToTParameter", eSingleVariableDeclarationToTParameter);
		ruleresult.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TParameter tParameter, TParameterList tParameterList) {
		// initial bindings
		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_10_1_initialbindings_blackBBBB(this, match, tParameter,
						tParameterList);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tParameter] = " + tParameter + ", "
					+ "[tParameterList] = " + tParameterList + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tParameter,
						tParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tParameter] = " + tParameter + ", "
					+ "[tParameterList] = " + tParameterList + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_10_4_collectelementstobetranslated_blackBBB(match, tParameter,
							tParameterList);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tParameter] = " + tParameter + ", "
						+ "[tParameterList] = " + tParameterList + ".");
			}
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_4_collectelementstobetranslated_greenBBBF(
					match, tParameter, tParameterList);
			// EMoflonEdge tParameterList__tParameter____first = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_10_5_collectcontextelements_blackBBB(match, tParameter,
							tParameterList);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tParameter] = " + tParameter + ", "
						+ "[tParameterList] = " + tParameterList + ".");
			}
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_5_collectcontextelements_greenBBB(match,
					tParameter, tParameterList);

			// register objects to match
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_6_registerobjectstomatch_expressionBBBB(
					this, match, tParameter, tParameterList);
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_7_expressionF();
		} else {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignature mmethodSignature = (MMethodSignature) result1_bindingAndBlack[0];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[1];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[2];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[3];
		MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result1_bindingAndBlack[4];
		MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_11_1_performtransformation_greenBB(mmethodSignature, mEntry);

		// collect translated elements
		Object[] result2_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mmethodSignature,
						tParameter, mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
						mmethodSignatureToTMethodSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mmethodSignature] = " + mmethodSignature + ", "
					+ "[tParameter] = " + tParameter + ", " + "[mEntry] = " + mEntry + ", " + "[tParameterList] = "
					+ tParameterList + ", " + "[eSingleVariableDeclarationToTParameter] = "
					+ eSingleVariableDeclarationToTParameter + ", " + "[mmethodSignatureToTMethodSignature] = "
					+ mmethodSignatureToTMethodSignature + ".");
		}
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_11_3_bookkeepingforedges_greenBBBBBFF(ruleresult,
				mmethodSignature, tParameter, mEntry, tParameterList);
		// EMoflonEdge mmethodSignature__mEntry____mFirstEntry = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tParameterList__tParameter____first = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TParameter tParameter = (TParameter) result2_binding[0];
		TParameterList tParameterList = (TParameterList) result2_binding[1];
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_12_2_corematch_blackFBFBFFB(tParameter, tParameterList, match)) {
			MMethodSignature mmethodSignature = (MMethodSignature) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[2];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[4];
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_12_3_findcontext_blackBBBBBB(mmethodSignature, tParameter, mEntry,
							tParameterList, eSingleVariableDeclarationToTParameter,
							mmethodSignatureToTMethodSignature)) {
				Object[] result3_green = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_12_3_findcontext_greenBBBBBBFFFFFF(mmethodSignature,
								tParameter, mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
								mmethodSignatureToTMethodSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge tParameterList__tParameter____first = (EMoflonEdge) result3_green[7];
				// EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mmethodSignatureToTMethodSignature__mmethodSignature____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mmethodSignatureToTMethodSignature__tParameterList____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
								eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mmethodSignature] = " + mmethodSignature + ", " + "[tParameter] = " + tParameter + ", "
							+ "[mEntry] = " + mEntry + ", " + "[tParameterList] = " + tParameterList + ", "
							+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
							+ ", " + "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_12_5_checkCSP_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TParameter tParameter, TParameterList tParameterList) {
		match.registerObject("tParameter", tParameter);
		match.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TParameter tParameter, TParameterList tParameterList) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignature", mmethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mmethodSignature, EObject tParameter,
			EObject mEntry, EObject tParameterList, EObject eSingleVariableDeclarationToTParameter,
			EObject mmethodSignatureToTMethodSignature) {
		ruleresult.registerObject("mmethodSignature", mmethodSignature);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("eSingleVariableDeclarationToTParameter", eSingleVariableDeclarationToTParameter);
		ruleresult.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_27(EMoflonEdge _edge_mFirstEntry) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_20_2_testcorematchandDECs_blackFFB(_edge_mFirstEntry)) {
			MMethodSignature mmethodSignature = (MMethodSignature) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			Object[] result2_green = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mmethodSignature, mEntry)) {
				// Ensure that the correct types of elements are matched
				if (MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_25(EMoflonEdge _edge_first) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_21_2_testcorematchandDECs_blackFFB(_edge_first)) {
			TParameter tParameter = (TParameter) result2_black[0];
			TParameterList tParameterList = (TParameterList) result2_black[1];
			Object[] result2_green = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tParameter, tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameterLinkFirst");
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
		ruleResult.setRule("MethodParameterLinkFirst");
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
		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_24_2_matchcontext_bindingFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodSignature mmethodSignature = (MMethodSignature) result2_binding[0];
		TParameter tParameter = (TParameter) result2_binding[1];
		MEntry mEntry = (MEntry) result2_binding[2];
		TParameterList tParameterList = (TParameterList) result2_binding[3];
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_24_2_matchcontext_blackBBBBFFBB(mmethodSignature, tParameter, mEntry,
						tParameterList, sourceMatch, targetMatch)) {
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[4];
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) result2_black[5];
			Object[] result2_green = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_24_2_matchcontext_greenBBBBBBBFB(mmethodSignature, tParameter,
							mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
							mmethodSignatureToTMethodSignature, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mmethodSignature, tParameter, mEntry, tParameterList,
							eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_24_4_createcorrespondence_blackBBBBB(mmethodSignature,
								tParameter, mEntry, tParameterList, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mmethodSignature] = " + mmethodSignature + ", " + "[tParameter] = "
							+ tParameter + ", " + "[mEntry] = " + mEntry + ", " + "[tParameterList] = " + tParameterList
							+ ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignature", mmethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
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
	public boolean checkDEC_FWD(MMethodSignature mmethodSignature, MEntry mEntry) {// match tgg pattern
		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_27_1_matchtggpattern_blackBB(mmethodSignature, mEntry);
		if (result1_black != null) {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_27_2_expressionF();
		} else {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TParameter tParameter, TParameterList tParameterList) {// match tgg pattern
		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_28_1_matchtggpattern_blackBB(tParameter, tParameterList);
		if (result1_black != null) {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_28_2_expressionF();
		} else {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignatureParameter,
			MEntryToTParameter eSingleVariableDeclarationToTParameterParameter) {
		// create result
		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList mmethodSignatureToTMethodSignatureList = (RuleEntryList) result2_black[0];
			MMethodSignature mmethodSignature = (MMethodSignature) result2_black[1];
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) result2_black[2];
			TParameterList tParameterList = (TParameterList) result2_black[3];
			// RuleEntryList eSingleVariableDeclarationToTParameterList = (RuleEntryList) result2_black[4];
			TParameter tParameter = (TParameter) result2_black[5];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[6];
			MEntry mEntry = (MEntry) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mmethodSignature, tParameter, mEntry, tParameterList,
							eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mmethodSignature] = "
						+ mmethodSignature + ", " + "[tParameter] = " + tParameter + ", " + "[mEntry] = " + mEntry
						+ ", " + "[tParameterList] = " + tParameterList + ", "
						+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter + ", "
						+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_29_5_checknacs_blackBBBBBB(mmethodSignature, tParameter,
								mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
								mmethodSignatureToTMethodSignature);
				if (result5_black != null) {

					// perform
					Object[] result6_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_29_6_perform_blackBBBBBBB(mmethodSignature, tParameter,
									mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
									mmethodSignatureToTMethodSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mmethodSignature] = " + mmethodSignature + ", " + "[tParameter] = " + tParameter
								+ ", " + "[mEntry] = " + mEntry + ", " + "[tParameterList] = " + tParameterList + ", "
								+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
								+ ", " + "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_29_6_perform_greenBBBBB(
							mmethodSignature, tParameter, mEntry, tParameterList, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignature", mmethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
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
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
			return null;
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_TPARAMETER_MENTRY_TPARAMETERLIST_MENTRYTOTPARAMETER_MMETHODSIGNATURETOTPARAMETERLIST:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TParameter) arguments.get(2), (MEntry) arguments.get(3), (TParameterList) arguments.get(4),
					(MEntryToTParameter) arguments.get(5), (MMethodSignatureToTParameterList) arguments.get(6));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_BWD__MATCH_TPARAMETER_TPARAMETERLIST:
			return isAppropriate_BWD((Match) arguments.get(0), (TParameter) arguments.get(1),
					(TParameterList) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER_TPARAMETERLIST:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TParameter) arguments.get(1),
					(TParameterList) arguments.get(2));
			return null;
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER_TPARAMETERLIST:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TParameter) arguments.get(1),
					(TParameterList) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_TPARAMETER_MENTRY_TPARAMETERLIST_MENTRYTOTPARAMETER_MMETHODSIGNATURETOTPARAMETERLIST:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TParameter) arguments.get(2), (MEntry) arguments.get(3), (TParameterList) arguments.get(4),
					(MEntryToTParameter) arguments.get(5), (MMethodSignatureToTParameterList) arguments.get(6));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_27((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_25((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MMETHODSIGNATURE_TPARAMETER_MENTRY_TPARAMETERLIST_MENTRYTOTPARAMETER_MMETHODSIGNATURETOTPARAMETERLIST_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TParameter) arguments.get(2), (MEntry) arguments.get(3), (TParameterList) arguments.get(4),
					(MEntryToTParameter) arguments.get(5), (MMethodSignatureToTParameterList) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_DEC_FWD__MMETHODSIGNATURE_MENTRY:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (MEntry) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_DEC_BWD__TPARAMETER_TPARAMETERLIST:
			return checkDEC_BWD((TParameter) arguments.get(0), (TParameterList) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_MMETHODSIGNATURETOTPARAMETERLIST_MENTRYTOTPARAMETER:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (MEntryToTParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_TPARAMETER_MENTRY_TPARAMETERLIST_MENTRYTOTPARAMETER_MMETHODSIGNATURETOTPARAMETERLIST_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TParameter) arguments.get(2), (MEntry) arguments.get(3), (TParameterList) arguments.get(4),
					(MEntryToTParameter) arguments.get(5), (MMethodSignatureToTParameterList) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_1_initialbindings_blackBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		return new Object[] { _this, match, mmethodSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_2_SolveCSP_bindingFBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mmethodSignature, mEntry);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mmethodSignature, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_2_SolveCSP_bindingAndBlackFBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		Object[] result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_binding = pattern_MethodParameterLinkFirst_0_2_SolveCSP_bindingFBBBB(
				_this, match, mmethodSignature, mEntry);
		if (result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_black = pattern_MethodParameterLinkFirst_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mmethodSignature, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_0_3_CheckCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_4_collectelementstobetranslated_blackBBB(
			Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		return new Object[] { match, mmethodSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		EMoflonEdge mmethodSignature__mEntry____mFirstEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mmethodSignature__mEntry____mFirstEntry_name_prime = "mFirstEntry";
		mmethodSignature__mEntry____mFirstEntry.setSrc(mmethodSignature);
		mmethodSignature__mEntry____mFirstEntry.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mmethodSignature__mEntry____mFirstEntry);
		mmethodSignature__mEntry____mFirstEntry.setName(mmethodSignature__mEntry____mFirstEntry_name_prime);
		return new Object[] { match, mmethodSignature, mEntry, mmethodSignature__mEntry____mFirstEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_5_collectcontextelements_blackBBB(Match match,
			MMethodSignature mmethodSignature, MEntry mEntry) {
		return new Object[] { match, mmethodSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_5_collectcontextelements_greenBBB(Match match,
			MMethodSignature mmethodSignature, MEntry mEntry) {
		match.getContextNodes().add(mmethodSignature);
		match.getContextNodes().add(mEntry);
		return new Object[] { match, mmethodSignature, mEntry };
	}

	public static final void pattern_MethodParameterLinkFirst_0_6_registerobjectstomatch_expressionBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		_this.registerObjectsToMatch_FWD(match, mmethodSignature, mEntry);

	}

	public static final boolean pattern_MethodParameterLinkFirst_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mmethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_2 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_3 = isApplicableMatch.getObject("tParameterList");
		EObject _localVariable_4 = isApplicableMatch.getObject("eSingleVariableDeclarationToTParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("mmethodSignatureToTMethodSignature");
		EObject tmpMmethodSignature = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		EObject tmpMEntry = _localVariable_2;
		EObject tmpTParameterList = _localVariable_3;
		EObject tmpESingleVariableDeclarationToTParameter = _localVariable_4;
		EObject tmpMmethodSignatureToTMethodSignature = _localVariable_5;
		if (tmpMmethodSignature instanceof MMethodSignature) {
			MMethodSignature mmethodSignature = (MMethodSignature) tmpMmethodSignature;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tmpMEntry instanceof MEntry) {
					MEntry mEntry = (MEntry) tmpMEntry;
					if (tmpTParameterList instanceof TParameterList) {
						TParameterList tParameterList = (TParameterList) tmpTParameterList;
						if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
							MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
							if (tmpMmethodSignatureToTMethodSignature instanceof MMethodSignatureToTParameterList) {
								MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) tmpMmethodSignatureToTMethodSignature;
								return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
										eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_1_performtransformation_blackBBBBBBFBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, MethodParameterLinkFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
						eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding = pattern_MethodParameterLinkFirst_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding != null) {
			MMethodSignature mmethodSignature = (MMethodSignature) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[0];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[1];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[2];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[3];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[4];
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[5];

			Object[] result_pattern_MethodParameterLinkFirst_1_1_performtransformation_black = pattern_MethodParameterLinkFirst_1_1_performtransformation_blackBBBBBBFBB(
					mmethodSignature, tParameter, mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
					mmethodSignatureToTMethodSignature, _this, isApplicableMatch);
			if (result_pattern_MethodParameterLinkFirst_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_black[6];

				return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
						eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_1_performtransformation_greenBB(
			TParameter tParameter, TParameterList tParameterList) {
		tParameterList.setFirst(tParameter);
		return new Object[] { tParameter, tParameterList };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mmethodSignature, EObject tParameter, EObject mEntry,
			EObject tParameterList, EObject eSingleVariableDeclarationToTParameter,
			EObject mmethodSignatureToTMethodSignature) {
		if (!mmethodSignature.equals(tParameter)) {
			if (!mmethodSignature.equals(tParameterList)) {
				if (!mmethodSignature.equals(mmethodSignatureToTMethodSignature)) {
					if (!tParameter.equals(tParameterList)) {
						if (!mEntry.equals(mmethodSignature)) {
							if (!mEntry.equals(tParameter)) {
								if (!mEntry.equals(tParameterList)) {
									if (!mEntry.equals(mmethodSignatureToTMethodSignature)) {
										if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignature)) {
											if (!eSingleVariableDeclarationToTParameter.equals(tParameter)) {
												if (!eSingleVariableDeclarationToTParameter.equals(mEntry)) {
													if (!eSingleVariableDeclarationToTParameter
															.equals(tParameterList)) {
														if (!eSingleVariableDeclarationToTParameter
																.equals(mmethodSignatureToTMethodSignature)) {
															if (!mmethodSignatureToTMethodSignature
																	.equals(tParameter)) {
																if (!mmethodSignatureToTMethodSignature
																		.equals(tParameterList)) {
																	return new Object[] { ruleresult, mmethodSignature,
																			tParameter, mEntry, tParameterList,
																			eSingleVariableDeclarationToTParameter,
																			mmethodSignatureToTMethodSignature };
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

	public static final Object[] pattern_MethodParameterLinkFirst_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject mmethodSignature, EObject tParameter, EObject mEntry,
			EObject tParameterList) {
		EMoflonEdge mmethodSignature__mEntry____mFirstEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterLinkFirst";
		String mmethodSignature__mEntry____mFirstEntry_name_prime = "mFirstEntry";
		String tParameterList__tParameter____first_name_prime = "first";
		mmethodSignature__mEntry____mFirstEntry.setSrc(mmethodSignature);
		mmethodSignature__mEntry____mFirstEntry.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mmethodSignature__mEntry____mFirstEntry);
		tParameterList__tParameter____first.setSrc(tParameterList);
		tParameterList__tParameter____first.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tParameterList__tParameter____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mmethodSignature__mEntry____mFirstEntry.setName(mmethodSignature__mEntry____mFirstEntry_name_prime);
		tParameterList__tParameter____first.setName(tParameterList__tParameter____first_name_prime);
		return new Object[] { ruleresult, mmethodSignature, tParameter, mEntry, tParameterList,
				mmethodSignature__mEntry____mFirstEntry, tParameterList__tParameter____first };
	}

	public static final void pattern_MethodParameterLinkFirst_1_5_registerobjects_expressionBBBBBBBB(
			MethodParameterLinkFirst _this, PerformRuleResult ruleresult, EObject mmethodSignature, EObject tParameter,
			EObject mEntry, EObject tParameterList, EObject eSingleVariableDeclarationToTParameter,
			EObject mmethodSignatureToTMethodSignature) {
		_this.registerObjects_FWD(ruleresult, mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);

	}

	public static final PerformRuleResult pattern_MethodParameterLinkFirst_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_bindingFB(
			MethodParameterLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterLinkFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterLinkFirst _this) {
		Object[] result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_binding = pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_black = pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodParameterLinkFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mmethodSignature");
		EObject _localVariable_1 = match.getObject("mEntry");
		EObject tmpMmethodSignature = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		if (tmpMmethodSignature instanceof MMethodSignature) {
			MMethodSignature mmethodSignature = (MMethodSignature) tmpMmethodSignature;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				return new Object[] { mmethodSignature, mEntry, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_2_2_corematch_blackBFBFFFB(
			MMethodSignature mmethodSignature, MEntry mEntry, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mEntry, MEntryToTParameter.class, "source")) {
			TParameter tParameter = eSingleVariableDeclarationToTParameter.getTarget();
			if (tParameter != null) {
				for (MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mmethodSignature, MMethodSignatureToTParameterList.class,
								"source")) {
					TParameterList tParameterList = mmethodSignatureToTMethodSignature.getTarget();
					if (tParameterList != null) {
						_result.add(new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
								eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_2_3_findcontext_blackBBBBBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mEntry.equals(mmethodSignature.getMFirstEntry())) {
			if (mEntry.equals(eSingleVariableDeclarationToTParameter.getSource())) {
				if (tParameter.equals(eSingleVariableDeclarationToTParameter.getTarget())) {
					if (mmethodSignature.equals(mmethodSignatureToTMethodSignature.getSource())) {
						if (tParameterList.equals(mmethodSignatureToTMethodSignature.getTarget())) {
							_result.add(new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
									eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_3_findcontext_greenBBBBBBFFFFFF(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mmethodSignature__mEntry____mFirstEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__mmethodSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__tParameterList____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String mmethodSignature__mEntry____mFirstEntry_name_prime = "mFirstEntry";
		String eSingleVariableDeclarationToTParameter__mEntry____source_name_prime = "source";
		String eSingleVariableDeclarationToTParameter__tParameter____target_name_prime = "target";
		String mmethodSignatureToTMethodSignature__mmethodSignature____source_name_prime = "source";
		String mmethodSignatureToTMethodSignature__tParameterList____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mmethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		mmethodSignature__mEntry____mFirstEntry.setSrc(mmethodSignature);
		mmethodSignature__mEntry____mFirstEntry.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mmethodSignature__mEntry____mFirstEntry);
		eSingleVariableDeclarationToTParameter__mEntry____source.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__mEntry____source.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__mEntry____source);
		eSingleVariableDeclarationToTParameter__tParameter____target.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__tParameter____target);
		mmethodSignatureToTMethodSignature__mmethodSignature____source.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__mmethodSignature____source.setTrg(mmethodSignature);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__mmethodSignature____source);
		mmethodSignatureToTMethodSignature__tParameterList____target.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__tParameterList____target.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__tParameterList____target);
		mmethodSignature__mEntry____mFirstEntry.setName(mmethodSignature__mEntry____mFirstEntry_name_prime);
		eSingleVariableDeclarationToTParameter__mEntry____source
				.setName(eSingleVariableDeclarationToTParameter__mEntry____source_name_prime);
		eSingleVariableDeclarationToTParameter__tParameter____target
				.setName(eSingleVariableDeclarationToTParameter__tParameter____target_name_prime);
		mmethodSignatureToTMethodSignature__mmethodSignature____source
				.setName(mmethodSignatureToTMethodSignature__mmethodSignature____source_name_prime);
		mmethodSignatureToTMethodSignature__tParameterList____target
				.setName(mmethodSignatureToTMethodSignature__tParameterList____target_name_prime);
		return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, isApplicableMatch,
				mmethodSignature__mEntry____mFirstEntry, eSingleVariableDeclarationToTParameter__mEntry____source,
				eSingleVariableDeclarationToTParameter__tParameter____target,
				mmethodSignatureToTMethodSignature__mmethodSignature____source,
				mmethodSignatureToTMethodSignature__tParameterList____target };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_4_solveCSP_bindingFBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mmethodSignature, tParameter, mEntry,
				tParameterList, eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
					eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		Object[] result_pattern_MethodParameterLinkFirst_2_4_solveCSP_binding = pattern_MethodParameterLinkFirst_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);
		if (result_pattern_MethodParameterLinkFirst_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_2_4_solveCSP_black = pattern_MethodParameterLinkFirst_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignature, tParameter, mEntry,
						tParameterList, eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_2_5_checkCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterLinkFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLinkFirst_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_1_initialbindings_blackBBBB(
			MethodParameterLinkFirst _this, Match match, TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { _this, match, tParameter, tParameterList };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_2_SolveCSP_bindingFBBBB(
			MethodParameterLinkFirst _this, Match match, TParameter tParameter, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tParameter, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tParameter, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_2_SolveCSP_bindingAndBlackFBBBB(
			MethodParameterLinkFirst _this, Match match, TParameter tParameter, TParameterList tParameterList) {
		Object[] result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_binding = pattern_MethodParameterLinkFirst_10_2_SolveCSP_bindingFBBBB(
				_this, match, tParameter, tParameterList);
		if (result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_black = pattern_MethodParameterLinkFirst_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tParameter, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_10_3_CheckCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_4_collectelementstobetranslated_blackBBB(
			Match match, TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { match, tParameter, tParameterList };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TParameter tParameter, TParameterList tParameterList) {
		EMoflonEdge tParameterList__tParameter____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tParameterList__tParameter____first_name_prime = "first";
		tParameterList__tParameter____first.setSrc(tParameterList);
		tParameterList__tParameter____first.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(tParameterList__tParameter____first);
		tParameterList__tParameter____first.setName(tParameterList__tParameter____first_name_prime);
		return new Object[] { match, tParameter, tParameterList, tParameterList__tParameter____first };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_5_collectcontextelements_blackBBB(Match match,
			TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { match, tParameter, tParameterList };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_5_collectcontextelements_greenBBB(Match match,
			TParameter tParameter, TParameterList tParameterList) {
		match.getContextNodes().add(tParameter);
		match.getContextNodes().add(tParameterList);
		return new Object[] { match, tParameter, tParameterList };
	}

	public static final void pattern_MethodParameterLinkFirst_10_6_registerobjectstomatch_expressionBBBB(
			MethodParameterLinkFirst _this, Match match, TParameter tParameter, TParameterList tParameterList) {
		_this.registerObjectsToMatch_BWD(match, tParameter, tParameterList);

	}

	public static final boolean pattern_MethodParameterLinkFirst_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mmethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_2 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_3 = isApplicableMatch.getObject("tParameterList");
		EObject _localVariable_4 = isApplicableMatch.getObject("eSingleVariableDeclarationToTParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("mmethodSignatureToTMethodSignature");
		EObject tmpMmethodSignature = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		EObject tmpMEntry = _localVariable_2;
		EObject tmpTParameterList = _localVariable_3;
		EObject tmpESingleVariableDeclarationToTParameter = _localVariable_4;
		EObject tmpMmethodSignatureToTMethodSignature = _localVariable_5;
		if (tmpMmethodSignature instanceof MMethodSignature) {
			MMethodSignature mmethodSignature = (MMethodSignature) tmpMmethodSignature;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tmpMEntry instanceof MEntry) {
					MEntry mEntry = (MEntry) tmpMEntry;
					if (tmpTParameterList instanceof TParameterList) {
						TParameterList tParameterList = (TParameterList) tmpTParameterList;
						if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
							MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
							if (tmpMmethodSignatureToTMethodSignature instanceof MMethodSignatureToTParameterList) {
								MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) tmpMmethodSignatureToTMethodSignature;
								return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
										eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_1_performtransformation_blackBBBBBBFBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, MethodParameterLinkFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
						eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding = pattern_MethodParameterLinkFirst_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding != null) {
			MMethodSignature mmethodSignature = (MMethodSignature) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[0];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[1];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[2];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[3];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[4];
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[5];

			Object[] result_pattern_MethodParameterLinkFirst_11_1_performtransformation_black = pattern_MethodParameterLinkFirst_11_1_performtransformation_blackBBBBBBFBB(
					mmethodSignature, tParameter, mEntry, tParameterList, eSingleVariableDeclarationToTParameter,
					mmethodSignatureToTMethodSignature, _this, isApplicableMatch);
			if (result_pattern_MethodParameterLinkFirst_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_black[6];

				return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
						eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_1_performtransformation_greenBB(
			MMethodSignature mmethodSignature, MEntry mEntry) {
		mmethodSignature.setMFirstEntry(mEntry);
		return new Object[] { mmethodSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mmethodSignature, EObject tParameter, EObject mEntry,
			EObject tParameterList, EObject eSingleVariableDeclarationToTParameter,
			EObject mmethodSignatureToTMethodSignature) {
		if (!mmethodSignature.equals(tParameter)) {
			if (!mmethodSignature.equals(tParameterList)) {
				if (!mmethodSignature.equals(mmethodSignatureToTMethodSignature)) {
					if (!tParameter.equals(tParameterList)) {
						if (!mEntry.equals(mmethodSignature)) {
							if (!mEntry.equals(tParameter)) {
								if (!mEntry.equals(tParameterList)) {
									if (!mEntry.equals(mmethodSignatureToTMethodSignature)) {
										if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignature)) {
											if (!eSingleVariableDeclarationToTParameter.equals(tParameter)) {
												if (!eSingleVariableDeclarationToTParameter.equals(mEntry)) {
													if (!eSingleVariableDeclarationToTParameter
															.equals(tParameterList)) {
														if (!eSingleVariableDeclarationToTParameter
																.equals(mmethodSignatureToTMethodSignature)) {
															if (!mmethodSignatureToTMethodSignature
																	.equals(tParameter)) {
																if (!mmethodSignatureToTMethodSignature
																		.equals(tParameterList)) {
																	return new Object[] { ruleresult, mmethodSignature,
																			tParameter, mEntry, tParameterList,
																			eSingleVariableDeclarationToTParameter,
																			mmethodSignatureToTMethodSignature };
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

	public static final Object[] pattern_MethodParameterLinkFirst_11_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject mmethodSignature, EObject tParameter, EObject mEntry,
			EObject tParameterList) {
		EMoflonEdge mmethodSignature__mEntry____mFirstEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterLinkFirst";
		String mmethodSignature__mEntry____mFirstEntry_name_prime = "mFirstEntry";
		String tParameterList__tParameter____first_name_prime = "first";
		mmethodSignature__mEntry____mFirstEntry.setSrc(mmethodSignature);
		mmethodSignature__mEntry____mFirstEntry.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mmethodSignature__mEntry____mFirstEntry);
		tParameterList__tParameter____first.setSrc(tParameterList);
		tParameterList__tParameter____first.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tParameterList__tParameter____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mmethodSignature__mEntry____mFirstEntry.setName(mmethodSignature__mEntry____mFirstEntry_name_prime);
		tParameterList__tParameter____first.setName(tParameterList__tParameter____first_name_prime);
		return new Object[] { ruleresult, mmethodSignature, tParameter, mEntry, tParameterList,
				mmethodSignature__mEntry____mFirstEntry, tParameterList__tParameter____first };
	}

	public static final void pattern_MethodParameterLinkFirst_11_5_registerobjects_expressionBBBBBBBB(
			MethodParameterLinkFirst _this, PerformRuleResult ruleresult, EObject mmethodSignature, EObject tParameter,
			EObject mEntry, EObject tParameterList, EObject eSingleVariableDeclarationToTParameter,
			EObject mmethodSignatureToTMethodSignature) {
		_this.registerObjects_BWD(ruleresult, mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);

	}

	public static final PerformRuleResult pattern_MethodParameterLinkFirst_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_bindingFB(
			MethodParameterLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterLinkFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterLinkFirst _this) {
		Object[] result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_binding = pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_black = pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodParameterLinkFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tParameter");
		EObject _localVariable_1 = match.getObject("tParameterList");
		EObject tmpTParameter = _localVariable_0;
		EObject tmpTParameterList = _localVariable_1;
		if (tmpTParameter instanceof TParameter) {
			TParameter tParameter = (TParameter) tmpTParameter;
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				return new Object[] { tParameter, tParameterList, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_12_2_corematch_blackFBFBFFB(
			TParameter tParameter, TParameterList tParameterList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParameter, MEntryToTParameter.class, "target")) {
			MEntry mEntry = eSingleVariableDeclarationToTParameter.getSource();
			if (mEntry != null) {
				for (MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tParameterList, MMethodSignatureToTParameterList.class, "target")) {
					MMethodSignature mmethodSignature = mmethodSignatureToTMethodSignature.getSource();
					if (mmethodSignature != null) {
						_result.add(new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
								eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_12_3_findcontext_blackBBBBBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tParameter.equals(tParameterList.getFirst())) {
			if (mEntry.equals(eSingleVariableDeclarationToTParameter.getSource())) {
				if (tParameter.equals(eSingleVariableDeclarationToTParameter.getTarget())) {
					if (mmethodSignature.equals(mmethodSignatureToTMethodSignature.getSource())) {
						if (tParameterList.equals(mmethodSignatureToTMethodSignature.getTarget())) {
							_result.add(new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
									eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_3_findcontext_greenBBBBBBFFFFFF(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tParameterList__tParameter____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__mmethodSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__tParameterList____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tParameterList__tParameter____first_name_prime = "first";
		String eSingleVariableDeclarationToTParameter__mEntry____source_name_prime = "source";
		String eSingleVariableDeclarationToTParameter__tParameter____target_name_prime = "target";
		String mmethodSignatureToTMethodSignature__mmethodSignature____source_name_prime = "source";
		String mmethodSignatureToTMethodSignature__tParameterList____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mmethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		tParameterList__tParameter____first.setSrc(tParameterList);
		tParameterList__tParameter____first.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList__tParameter____first);
		eSingleVariableDeclarationToTParameter__mEntry____source.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__mEntry____source.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__mEntry____source);
		eSingleVariableDeclarationToTParameter__tParameter____target.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__tParameter____target);
		mmethodSignatureToTMethodSignature__mmethodSignature____source.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__mmethodSignature____source.setTrg(mmethodSignature);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__mmethodSignature____source);
		mmethodSignatureToTMethodSignature__tParameterList____target.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__tParameterList____target.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__tParameterList____target);
		tParameterList__tParameter____first.setName(tParameterList__tParameter____first_name_prime);
		eSingleVariableDeclarationToTParameter__mEntry____source
				.setName(eSingleVariableDeclarationToTParameter__mEntry____source_name_prime);
		eSingleVariableDeclarationToTParameter__tParameter____target
				.setName(eSingleVariableDeclarationToTParameter__tParameter____target_name_prime);
		mmethodSignatureToTMethodSignature__mmethodSignature____source
				.setName(mmethodSignatureToTMethodSignature__mmethodSignature____source_name_prime);
		mmethodSignatureToTMethodSignature__tParameterList____target
				.setName(mmethodSignatureToTMethodSignature__tParameterList____target_name_prime);
		return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, isApplicableMatch,
				tParameterList__tParameter____first, eSingleVariableDeclarationToTParameter__mEntry____source,
				eSingleVariableDeclarationToTParameter__tParameter____target,
				mmethodSignatureToTMethodSignature__mmethodSignature____source,
				mmethodSignatureToTMethodSignature__tParameterList____target };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_4_solveCSP_bindingFBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mmethodSignature, tParameter, mEntry,
				tParameterList, eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
					eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		Object[] result_pattern_MethodParameterLinkFirst_12_4_solveCSP_binding = pattern_MethodParameterLinkFirst_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature);
		if (result_pattern_MethodParameterLinkFirst_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_12_4_solveCSP_black = pattern_MethodParameterLinkFirst_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignature, tParameter, mEntry,
						tParameterList, eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_12_5_checkCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterLinkFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLinkFirst_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_bindingFB(
			MethodParameterLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterLinkFirst _this) {
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

	public static final Object[] pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterLinkFirst _this) {
		Object[] result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_binding = pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_black = pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mFirstEntry) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMmethodSignature = _edge_mFirstEntry.getSrc();
		if (tmpMmethodSignature instanceof MMethodSignature) {
			MMethodSignature mmethodSignature = (MMethodSignature) tmpMmethodSignature;
			EObject tmpMEntry = _edge_mFirstEntry.getTrg();
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (mEntry.equals(mmethodSignature.getMFirstEntry())) {
					_result.add(new Object[] { mmethodSignature, mEntry, _edge_mFirstEntry });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterLinkFirst_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mmethodSignature, MEntry mEntry) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mmethodSignature, mEntry);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterLinkFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterLinkFirst_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_bindingFB(
			MethodParameterLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterLinkFirst _this) {
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

	public static final Object[] pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterLinkFirst _this) {
		Object[] result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_binding = pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_black = pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameterList = _edge_first.getSrc();
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			EObject tmpTParameter = _edge_first.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tParameter.equals(tParameterList.getFirst())) {
					_result.add(new Object[] { tParameter, tParameterList, _edge_first });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterLinkFirst_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameterLinkFirst _this, Match match, TParameter tParameter, TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParameter, tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterLinkFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterLinkFirst_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_1_prepare_blackB(MethodParameterLinkFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_2_matchcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mmethodSignature");
		EObject _localVariable_1 = targetMatch.getObject("tParameter");
		EObject _localVariable_2 = sourceMatch.getObject("mEntry");
		EObject _localVariable_3 = targetMatch.getObject("tParameterList");
		EObject tmpMmethodSignature = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		EObject tmpMEntry = _localVariable_2;
		EObject tmpTParameterList = _localVariable_3;
		if (tmpMmethodSignature instanceof MMethodSignature) {
			MMethodSignature mmethodSignature = (MMethodSignature) tmpMmethodSignature;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tmpMEntry instanceof MEntry) {
					MEntry mEntry = (MEntry) tmpMEntry;
					if (tmpTParameterList instanceof TParameterList) {
						TParameterList tParameterList = (TParameterList) tmpTParameterList;
						return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_24_2_matchcontext_blackBBBBFFBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (mEntry.equals(mmethodSignature.getMFirstEntry())) {
				if (tParameter.equals(tParameterList.getFirst())) {
					for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mEntry, MEntryToTParameter.class, "source")) {
						if (tParameter.equals(eSingleVariableDeclarationToTParameter.getTarget())) {
							for (MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mmethodSignature, MMethodSignatureToTParameterList.class,
											"source")) {
								if (tParameterList.equals(mmethodSignatureToTMethodSignature.getTarget())) {
									_result.add(new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
											eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature,
											sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_2_matchcontext_greenBBBBBBBFB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "MethodParameterLinkFirst";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mmethodSignature);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_3_checkcsp_bindingFBBBBBBBBBB(
			MethodParameterLinkFirst _this, CCMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mmethodSignature, tParameter, mEntry,
				tParameterList, eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
					eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(
			MethodParameterLinkFirst _this, CCMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterLinkFirst_24_3_checkcsp_binding = pattern_MethodParameterLinkFirst_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, sourceMatch, targetMatch);
		if (result_pattern_MethodParameterLinkFirst_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_24_3_checkcsp_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_24_3_checkcsp_black = pattern_MethodParameterLinkFirst_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignature, tParameter, mEntry,
						tParameterList, eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_4_createcorrespondence_blackBBBBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			CCMatch isApplicableMatch) {
		return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterLinkFirst";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLinkFirst_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_27_1_matchtggpattern_blackBB(
			MMethodSignature mmethodSignature, MEntry mEntry) {
		if (mEntry.equals(mmethodSignature.getMFirstEntry())) {
			return new Object[] { mmethodSignature, mEntry };
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_28_1_matchtggpattern_blackBB(TParameter tParameter,
			TParameterList tParameterList) {
		if (tParameter.equals(tParameterList.getFirst())) {
			return new Object[] { tParameter, tParameterList };
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_1_createresult_blackB(
			MethodParameterLinkFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mmethodSignature) {
		if (ruleResult.getSourceObjects().contains(mmethodSignature)) {
			return new Object[] { ruleResult, mmethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		if (ruleResult.getCorrObjects().contains(mmethodSignatureToTMethodSignature)) {
			return new Object[] { ruleResult, mmethodSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TParameterList tParameterList) {
		if (ruleResult.getTargetObjects().contains(tParameterList)) {
			return new Object[] { ruleResult, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TParameter tParameter) {
		if (ruleResult.getTargetObjects().contains(tParameter)) {
			return new Object[] { ruleResult, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		if (ruleResult.getCorrObjects().contains(eSingleVariableDeclarationToTParameter)) {
			return new Object[] { ruleResult, eSingleVariableDeclarationToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MEntry mEntry) {
		if (ruleResult.getSourceObjects().contains(mEntry)) {
			return new Object[] { ruleResult, mEntry };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mmethodSignatureToTMethodSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eSingleVariableDeclarationToTParameterList : ruleEntryContainer.getRuleEntryList()) {
				if (!eSingleVariableDeclarationToTParameterList.equals(mmethodSignatureToTMethodSignatureList)) {
					for (EObject tmpMmethodSignatureToTMethodSignature : mmethodSignatureToTMethodSignatureList
							.getEntryObjects()) {
						if (tmpMmethodSignatureToTMethodSignature instanceof MMethodSignatureToTParameterList) {
							MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature = (MMethodSignatureToTParameterList) tmpMmethodSignatureToTMethodSignature;
							MMethodSignature mmethodSignature = mmethodSignatureToTMethodSignature.getSource();
							if (mmethodSignature != null) {
								TParameterList tParameterList = mmethodSignatureToTMethodSignature.getTarget();
								if (tParameterList != null) {
									if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mmethodSignatureToTMethodSignature) == null) {
										if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, mmethodSignature) == null) {
											if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tParameterList) == null) {
												for (EObject tmpESingleVariableDeclarationToTParameter : eSingleVariableDeclarationToTParameterList
														.getEntryObjects()) {
													if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
														MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
														TParameter tParameter = eSingleVariableDeclarationToTParameter
																.getTarget();
														if (tParameter != null) {
															MEntry mEntry = eSingleVariableDeclarationToTParameter
																	.getSource();
															if (mEntry != null) {
																if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult,
																		eSingleVariableDeclarationToTParameter) == null) {
																	if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tParameter) == null) {
																		if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mEntry) == null) {
																			_result.add(new Object[] {
																					mmethodSignatureToTMethodSignatureList,
																					mmethodSignature,
																					mmethodSignatureToTMethodSignature,
																					tParameterList,
																					eSingleVariableDeclarationToTParameterList,
																					tParameter,
																					eSingleVariableDeclarationToTParameter,
																					mEntry, ruleEntryContainer,
																					ruleResult });
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
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_3_solveCSP_bindingFBBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mmethodSignature, tParameter, mEntry,
				tParameterList, eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
					eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch, MMethodSignature mmethodSignature,
			TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameterLinkFirst_29_3_solveCSP_binding = pattern_MethodParameterLinkFirst_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, ruleResult);
		if (result_pattern_MethodParameterLinkFirst_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_29_3_solveCSP_black = pattern_MethodParameterLinkFirst_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignature, tParameter, mEntry,
						tParameterList, eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_29_4_checkCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_5_checknacs_blackBBBBBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature) {
		return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_6_perform_blackBBBBBBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MMethodSignatureToTParameterList mmethodSignatureToTMethodSignature, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList,
				eSingleVariableDeclarationToTParameter, mmethodSignatureToTMethodSignature, ruleResult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_6_perform_greenBBBBB(
			MMethodSignature mmethodSignature, TParameter tParameter, MEntry mEntry, TParameterList tParameterList,
			ModelgeneratorRuleResult ruleResult) {
		mmethodSignature.setMFirstEntry(mEntry);
		tParameterList.setFirst(tParameter);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mmethodSignature, tParameter, mEntry, tParameterList, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameterLinkFirst_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterLinkFirstImpl
