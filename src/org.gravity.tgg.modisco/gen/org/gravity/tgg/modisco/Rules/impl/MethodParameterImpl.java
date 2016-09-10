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

import org.eclipse.gmt.modisco.java.Type;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;

import org.gravity.tgg.modisco.MEntryToTParameter;
import org.gravity.tgg.modisco.MMethodSignatureToTParameterList;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.MethodParameter;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Method Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterImpl extends AbstractRuleImpl implements MethodParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodSignature mMethodSignature, MEntry mEntry) {
		// initial bindings
		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_0_1_initialbindings_blackBBBB(this, match,
				mMethodSignature, mEntry);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mMethodSignature] = "
					+ mMethodSignature + ", " + "[mEntry] = " + mEntry + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mMethodSignature, mEntry);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mMethodSignature] = " + mMethodSignature + ", "
					+ "[mEntry] = " + mEntry + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodParameterImpl.pattern_MethodParameter_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodParameterImpl
					.pattern_MethodParameter_0_4_collectelementstobetranslated_blackBBB(match, mMethodSignature,
							mEntry);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mMethodSignature] = " + mMethodSignature
						+ ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_0_4_collectelementstobetranslated_greenBBBF(match,
					mMethodSignature, mEntry);
			// EMoflonEdge mMethodSignature__mEntry____mEntrys = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MethodParameterImpl
					.pattern_MethodParameter_0_5_collectcontextelements_blackBBB(match, mMethodSignature, mEntry);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mMethodSignature] = " + mMethodSignature
						+ ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_0_5_collectcontextelements_greenBB(match, mMethodSignature);

			// register objects to match
			MethodParameterImpl.pattern_MethodParameter_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mMethodSignature, mEntry);
			return MethodParameterImpl.pattern_MethodParameter_0_7_expressionF();
		} else {
			return MethodParameterImpl.pattern_MethodParameter_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result1_bindingAndBlack[0];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[1];
		MMethodSignature mMethodSignature = (MMethodSignature) result1_bindingAndBlack[2];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_1_1_performtransformation_greenBBFF(tParameterList, mEntry);
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[2];
		TParameter tParameter = (TParameter) result1_green[3];

		// collect translated elements
		Object[] result2_black = MethodParameterImpl
				.pattern_MethodParameter_1_2_collecttranslatedelements_blackBBB(mEntry, mEntryToTParameter, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mEntry] = " + mEntry + ", " + "[mEntryToTParameter] = " + mEntryToTParameter + ", "
					+ "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterImpl.pattern_MethodParameter_1_2_collecttranslatedelements_greenFBBB(
				mEntry, mEntryToTParameter, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodParameterImpl.pattern_MethodParameter_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry,
				mEntryToTParameter, tParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mMethodSignatureToTParameterList] = "
					+ mMethodSignatureToTParameterList + ", " + "[tParameterList] = " + tParameterList + ", "
					+ "[mMethodSignature] = " + mMethodSignature + ", " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[tParameter] = " + tParameter + ".");
		}
		MethodParameterImpl.pattern_MethodParameter_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, tParameterList,
				mMethodSignature, mEntry, mEntryToTParameter, tParameter);
		// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[6];
		// EMoflonEdge mMethodSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		MethodParameterImpl.pattern_MethodParameter_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry, mEntryToTParameter,
				tParameter);
		return MethodParameterImpl.pattern_MethodParameter_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodParameterImpl.pattern_MethodParameter_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodSignature mMethodSignature = (MMethodSignature) result2_binding[0];
		MEntry mEntry = (MEntry) result2_binding[1];
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_2_2_corematch_blackFFBBB(mMethodSignature, mEntry, match)) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result2_black[0];
			TParameterList tParameterList = (TParameterList) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : MethodParameterImpl.pattern_MethodParameter_2_3_findcontext_blackBBBB(
					mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry)) {
				Object[] result3_green = MethodParameterImpl.pattern_MethodParameter_2_3_findcontext_greenBBBBFFFF(
						mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge mMethodSignatureToTParameterList__mMethodSignature____source = (EMoflonEdge) result3_green[5];
				// EMoflonEdge mMethodSignatureToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mMethodSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodParameterImpl
						.pattern_MethodParameter_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mMethodSignatureToTParameterList] = " + mMethodSignatureToTParameterList + ", "
							+ "[tParameterList] = " + tParameterList + ", " + "[mMethodSignature] = " + mMethodSignature
							+ ", " + "[mEntry] = " + mEntry + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodParameterImpl.pattern_MethodParameter_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodParameterImpl
							.pattern_MethodParameter_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterImpl.pattern_MethodParameter_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mMethodSignature, MEntry mEntry) {
		match.registerObject("mMethodSignature", mMethodSignature);
		match.registerObject("mEntry", mEntry);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mMethodSignature, MEntry mEntry) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, MEntry mEntry) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("mMethodSignature", mMethodSignature);
		isApplicableMatch.registerObject("mEntry", mEntry);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList,
			EObject tParameterList, EObject mMethodSignature, EObject mEntry, EObject mEntryToTParameter,
			EObject tParameter) {
		ruleresult.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("mMethodSignature", mMethodSignature);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mEntry").eClass()).equals("modisco.MEntry.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TParameterList tParameterList, TParameter tParameter) {
		// initial bindings
		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_10_1_initialbindings_blackBBBB(this, match,
				tParameterList, tParameter);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tParameterList] = " + tParameterList
					+ ", " + "[tParameter] = " + tParameter + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tParameterList, tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tParameterList] = " + tParameterList + ", "
					+ "[tParameter] = " + tParameter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodParameterImpl.pattern_MethodParameter_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodParameterImpl
					.pattern_MethodParameter_10_4_collectelementstobetranslated_blackBBB(match, tParameterList,
							tParameter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tParameterList] = " + tParameterList + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_10_4_collectelementstobetranslated_greenBBBF(match,
					tParameterList, tParameter);
			// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = MethodParameterImpl
					.pattern_MethodParameter_10_5_collectcontextelements_blackBBB(match, tParameterList, tParameter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tParameterList] = " + tParameterList + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_10_5_collectcontextelements_greenBB(match, tParameterList);

			// register objects to match
			MethodParameterImpl.pattern_MethodParameter_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tParameterList, tParameter);
			return MethodParameterImpl.pattern_MethodParameter_10_7_expressionF();
		} else {
			return MethodParameterImpl.pattern_MethodParameter_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result1_bindingAndBlack[0];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[1];
		MMethodSignature mMethodSignature = (MMethodSignature) result1_bindingAndBlack[2];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_11_1_performtransformation_greenBFFB(mMethodSignature, tParameter);
		MEntry mEntry = (MEntry) result1_green[1];
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[2];

		// collect translated elements
		Object[] result2_black = MethodParameterImpl.pattern_MethodParameter_11_2_collecttranslatedelements_blackBBB(
				mEntry, mEntryToTParameter, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mEntry] = " + mEntry + ", " + "[mEntryToTParameter] = " + mEntryToTParameter + ", "
					+ "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterImpl.pattern_MethodParameter_11_2_collecttranslatedelements_greenFBBB(
				mEntry, mEntryToTParameter, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodParameterImpl.pattern_MethodParameter_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry,
				mEntryToTParameter, tParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mMethodSignatureToTParameterList] = "
					+ mMethodSignatureToTParameterList + ", " + "[tParameterList] = " + tParameterList + ", "
					+ "[mMethodSignature] = " + mMethodSignature + ", " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[tParameter] = " + tParameter + ".");
		}
		MethodParameterImpl.pattern_MethodParameter_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, tParameterList,
				mMethodSignature, mEntry, mEntryToTParameter, tParameter);
		// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[6];
		// EMoflonEdge mMethodSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		MethodParameterImpl.pattern_MethodParameter_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry, mEntryToTParameter,
				tParameter);
		return MethodParameterImpl.pattern_MethodParameter_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodParameterImpl.pattern_MethodParameter_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TParameterList tParameterList = (TParameterList) result2_binding[0];
		TParameter tParameter = (TParameter) result2_binding[1];
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_12_2_corematch_blackFBFBB(tParameterList, tParameter, match)) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result2_black[0];
			MMethodSignature mMethodSignature = (MMethodSignature) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : MethodParameterImpl.pattern_MethodParameter_12_3_findcontext_blackBBBB(
					mMethodSignatureToTParameterList, tParameterList, mMethodSignature, tParameter)) {
				Object[] result3_green = MethodParameterImpl.pattern_MethodParameter_12_3_findcontext_greenBBBBFFFF(
						mMethodSignatureToTParameterList, tParameterList, mMethodSignature, tParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge mMethodSignatureToTParameterList__mMethodSignature____source = (EMoflonEdge) result3_green[5];
				// EMoflonEdge mMethodSignatureToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodParameterImpl
						.pattern_MethodParameter_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mMethodSignatureToTParameterList, tParameterList, mMethodSignature, tParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mMethodSignatureToTParameterList] = " + mMethodSignatureToTParameterList + ", "
							+ "[tParameterList] = " + tParameterList + ", " + "[mMethodSignature] = " + mMethodSignature
							+ ", " + "[tParameter] = " + tParameter + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodParameterImpl.pattern_MethodParameter_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodParameterImpl
							.pattern_MethodParameter_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterImpl.pattern_MethodParameter_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TParameterList tParameterList, TParameter tParameter) {
		match.registerObject("tParameterList", tParameterList);
		match.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TParameterList tParameterList, TParameter tParameter) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, TParameter tParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("mMethodSignature", mMethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList,
			EObject tParameterList, EObject mMethodSignature, EObject mEntry, EObject mEntryToTParameter,
			EObject tParameter) {
		ruleresult.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("mMethodSignature", mMethodSignature);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tParameter").eClass())
				.equals("basic.TParameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_45(EMoflonEdge _edge_mEntrys) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterImpl.pattern_MethodParameter_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_20_2_testcorematchandDECs_blackFFB(_edge_mEntrys)) {
			MMethodSignature mMethodSignature = (MMethodSignature) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			Object[] result2_green = MethodParameterImpl
					.pattern_MethodParameter_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodParameterImpl
					.pattern_MethodParameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							mMethodSignature, mEntry)) {
				// Ensure that the correct types of elements are matched
				if (MethodParameterImpl
						.pattern_MethodParameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodParameterImpl
							.pattern_MethodParameter_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterImpl.pattern_MethodParameter_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_42(EMoflonEdge _edge_entries) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterImpl.pattern_MethodParameter_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_21_2_testcorematchandDECs_blackFFB(_edge_entries)) {
			TParameterList tParameterList = (TParameterList) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[1];
			Object[] result2_green = MethodParameterImpl
					.pattern_MethodParameter_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodParameterImpl
					.pattern_MethodParameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							tParameterList, tParameter)) {
				// Ensure that the correct types of elements are matched
				if (MethodParameterImpl
						.pattern_MethodParameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodParameterImpl
							.pattern_MethodParameter_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterImpl.pattern_MethodParameter_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameter");
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
		ruleResult.setRule("MethodParameter");
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
		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterImpl.pattern_MethodParameter_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = MethodParameterImpl
				.pattern_MethodParameter_24_2_matchcontext_bindingFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TParameterList tParameterList = (TParameterList) result2_binding[0];
		MMethodSignature mMethodSignature = (MMethodSignature) result2_binding[1];
		MEntry mEntry = (MEntry) result2_binding[2];
		TParameter tParameter = (TParameter) result2_binding[3];
		for (Object[] result2_black : MethodParameterImpl.pattern_MethodParameter_24_2_matchcontext_blackFBBBBBB(
				tParameterList, mMethodSignature, mEntry, tParameter, sourceMatch, targetMatch)) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result2_black[0];
			Object[] result2_green = MethodParameterImpl.pattern_MethodParameter_24_2_matchcontext_greenBBBBBBFB(
					mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry, tParameter, sourceMatch,
					targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[6];

			// check csp
			Object[] result3_bindingAndBlack = MethodParameterImpl
					.pattern_MethodParameter_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry, tParameter,
							sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = MethodParameterImpl
						.pattern_MethodParameter_24_4_createcorrespondence_blackBBBBB(tParameterList, mMethodSignature,
								mEntry, tParameter, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tParameterList] = " + tParameterList + ", " + "[mMethodSignature] = "
							+ mMethodSignature + ", " + "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter
							+ ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodParameterImpl.pattern_MethodParameter_24_4_createcorrespondence_greenBFBB(mEntry, tParameter,
						isApplicableMatch);
				// MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result4_green[1];

				// add to returned result
				Object[] result5_black = MethodParameterImpl
						.pattern_MethodParameter_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodParameterImpl.pattern_MethodParameter_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return MethodParameterImpl.pattern_MethodParameter_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, MEntry mEntry, TParameter tParameter, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("mMethodSignature", mMethodSignature);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameter", tParameter);
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
	public boolean checkDEC_FWD(MMethodSignature mMethodSignature, MEntry mEntry) {// match tgg pattern
		Object[] result1_black = MethodParameterImpl
				.pattern_MethodParameter_27_1_matchtggpattern_blackBB(mMethodSignature, mEntry);
		if (result1_black != null) {
			return MethodParameterImpl.pattern_MethodParameter_27_2_expressionF();
		} else {
			return MethodParameterImpl.pattern_MethodParameter_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TParameterList tParameterList, TParameter tParameter) {// match tgg pattern
		Object[] result1_black = MethodParameterImpl
				.pattern_MethodParameter_28_1_matchtggpattern_blackBB(tParameterList, tParameter);
		if (result1_black != null) {
			return MethodParameterImpl.pattern_MethodParameter_28_2_expressionF();
		} else {
			return MethodParameterImpl.pattern_MethodParameter_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterListParameter) {
		// create result
		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterImpl.pattern_MethodParameter_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mMethodSignatureToTParameterListList = (RuleEntryList) result2_black[0];
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result2_black[1];
			MMethodSignature mMethodSignature = (MMethodSignature) result2_black[2];
			TParameterList tParameterList = (TParameterList) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = MethodParameterImpl
					.pattern_MethodParameter_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mMethodSignatureToTParameterList, tParameterList, mMethodSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[mMethodSignatureToTParameterList] = " + mMethodSignatureToTParameterList + ", "
						+ "[tParameterList] = " + tParameterList + ", " + "[mMethodSignature] = " + mMethodSignature
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (MethodParameterImpl.pattern_MethodParameter_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = MethodParameterImpl.pattern_MethodParameter_29_5_checknacs_blackBBB(
						mMethodSignatureToTParameterList, tParameterList, mMethodSignature);
				if (result5_black != null) {

					// perform
					Object[] result6_black = MethodParameterImpl.pattern_MethodParameter_29_6_perform_blackBBBB(
							mMethodSignatureToTParameterList, tParameterList, mMethodSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mMethodSignatureToTParameterList] = " + mMethodSignatureToTParameterList + ", "
								+ "[tParameterList] = " + tParameterList + ", " + "[mMethodSignature] = "
								+ mMethodSignature + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_29_6_perform_greenBBFFFB(tParameterList,
							mMethodSignature, ruleResult);
					// MEntry mEntry = (MEntry) result6_green[2];
					// MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[3];
					// TParameter tParameter = (TParameter) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return MethodParameterImpl.pattern_MethodParameter_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("mMethodSignature", mMethodSignature);
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
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
			return null;
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODSIGNATURETOTPARAMETERLIST_TPARAMETERLIST_MMETHODSIGNATURE_MENTRY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TParameterList) arguments.get(2),
					(MMethodSignature) arguments.get(3), (MEntry) arguments.get(4));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_PARAMETER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_BWD__MATCH_TPARAMETERLIST_TPARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0), (TParameterList) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETERLIST_TPARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TParameterList) arguments.get(1),
					(TParameter) arguments.get(2));
			return null;
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETERLIST_TPARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TParameterList) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURETOTPARAMETERLIST_TPARAMETERLIST_MMETHODSIGNATURE_TPARAMETER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TParameterList) arguments.get(2),
					(MMethodSignature) arguments.get(3), (TParameter) arguments.get(4));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_PARAMETER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_45((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_42__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_42((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MMETHODSIGNATURETOTPARAMETERLIST_TPARAMETERLIST_MMETHODSIGNATURE_MENTRY_TPARAMETER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TParameterList) arguments.get(2),
					(MMethodSignature) arguments.get(3), (MEntry) arguments.get(4), (TParameter) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_DEC_FWD__MMETHODSIGNATURE_MENTRY:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (MEntry) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER___CHECK_DEC_BWD__TPARAMETERLIST_TPARAMETER:
			return checkDEC_BWD((TParameterList) arguments.get(0), (TParameter) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL__RULEENTRYCONTAINER_MMETHODSIGNATURETOTPARAMETERLIST:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURETOTPARAMETERLIST_TPARAMETERLIST_MMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TParameterList) arguments.get(2),
					(MMethodSignature) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameter_0_1_initialbindings_blackBBBB(MethodParameter _this,
			Match match, MMethodSignature mMethodSignature, MEntry mEntry) {
		return new Object[] { _this, match, mMethodSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_bindingFBBBB(MethodParameter _this, Match match,
			MMethodSignature mMethodSignature, MEntry mEntry) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mMethodSignature, mEntry);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mMethodSignature, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_bindingAndBlackFBBBB(MethodParameter _this,
			Match match, MMethodSignature mMethodSignature, MEntry mEntry) {
		Object[] result_pattern_MethodParameter_0_2_SolveCSP_binding = pattern_MethodParameter_0_2_SolveCSP_bindingFBBBB(
				_this, match, mMethodSignature, mEntry);
		if (result_pattern_MethodParameter_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameter_0_2_SolveCSP_black = pattern_MethodParameter_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mMethodSignature, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_0_3_CheckCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_0_4_collectelementstobetranslated_blackBBB(Match match,
			MMethodSignature mMethodSignature, MEntry mEntry) {
		return new Object[] { match, mMethodSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameter_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MMethodSignature mMethodSignature, MEntry mEntry) {
		EMoflonEdge mMethodSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mEntry);
		String mMethodSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mMethodSignature__mEntry____mEntrys.setSrc(mMethodSignature);
		mMethodSignature__mEntry____mEntrys.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mMethodSignature__mEntry____mEntrys);
		mMethodSignature__mEntry____mEntrys.setName(mMethodSignature__mEntry____mEntrys_name_prime);
		return new Object[] { match, mMethodSignature, mEntry, mMethodSignature__mEntry____mEntrys };
	}

	public static final Object[] pattern_MethodParameter_0_5_collectcontextelements_blackBBB(Match match,
			MMethodSignature mMethodSignature, MEntry mEntry) {
		return new Object[] { match, mMethodSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameter_0_5_collectcontextelements_greenBB(Match match,
			MMethodSignature mMethodSignature) {
		match.getContextNodes().add(mMethodSignature);
		return new Object[] { match, mMethodSignature };
	}

	public static final void pattern_MethodParameter_0_6_registerobjectstomatch_expressionBBBB(MethodParameter _this,
			Match match, MMethodSignature mMethodSignature, MEntry mEntry) {
		_this.registerObjectsToMatch_FWD(match, mMethodSignature, mEntry);

	}

	public static final boolean pattern_MethodParameter_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameter_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMethodSignatureToTParameterList");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParameterList");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEntry");
		EObject tmpMMethodSignatureToTParameterList = _localVariable_0;
		EObject tmpTParameterList = _localVariable_1;
		EObject tmpMMethodSignature = _localVariable_2;
		EObject tmpMEntry = _localVariable_3;
		if (tmpMMethodSignatureToTParameterList instanceof MMethodSignatureToTParameterList) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) tmpMMethodSignatureToTParameterList;
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				if (tmpMMethodSignature instanceof MMethodSignature) {
					MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
					if (tmpMEntry instanceof MEntry) {
						MEntry mEntry = (MEntry) tmpMEntry;
						return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
								mEntry, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_blackBBBBFBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, MEntry mEntry, MethodParameter _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_bindingAndBlackFFFFFBB(
			MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameter_1_1_performtransformation_binding = pattern_MethodParameter_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameter_1_1_performtransformation_binding != null) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result_pattern_MethodParameter_1_1_performtransformation_binding[0];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodParameter_1_1_performtransformation_binding[1];
			MMethodSignature mMethodSignature = (MMethodSignature) result_pattern_MethodParameter_1_1_performtransformation_binding[2];
			MEntry mEntry = (MEntry) result_pattern_MethodParameter_1_1_performtransformation_binding[3];

			Object[] result_pattern_MethodParameter_1_1_performtransformation_black = pattern_MethodParameter_1_1_performtransformation_blackBBBBFBB(
					mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry, _this,
					isApplicableMatch);
			if (result_pattern_MethodParameter_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameter_1_1_performtransformation_black[4];

				return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_greenBBFF(
			TParameterList tParameterList, MEntry mEntry) {
		MEntryToTParameter mEntryToTParameter = ModiscoFactory.eINSTANCE.createMEntryToTParameter();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		mEntryToTParameter.setSource(mEntry);
		tParameterList.getEntries().add(tParameter);
		mEntryToTParameter.setTarget(tParameter);
		return new Object[] { tParameterList, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_1_2_collecttranslatedelements_blackBBB(MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		return new Object[] { mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_1_2_collecttranslatedelements_greenFBBB(MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getCreatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList, EObject tParameterList,
			EObject mMethodSignature, EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		if (!mMethodSignatureToTParameterList.equals(tParameterList)) {
			if (!mMethodSignatureToTParameterList.equals(tParameter)) {
				if (!mMethodSignature.equals(mMethodSignatureToTParameterList)) {
					if (!mMethodSignature.equals(tParameterList)) {
						if (!mMethodSignature.equals(tParameter)) {
							if (!mEntry.equals(mMethodSignatureToTParameterList)) {
								if (!mEntry.equals(tParameterList)) {
									if (!mEntry.equals(mMethodSignature)) {
										if (!mEntry.equals(mEntryToTParameter)) {
											if (!mEntry.equals(tParameter)) {
												if (!mEntryToTParameter.equals(mMethodSignatureToTParameterList)) {
													if (!mEntryToTParameter.equals(tParameterList)) {
														if (!mEntryToTParameter.equals(mMethodSignature)) {
															if (!mEntryToTParameter.equals(tParameter)) {
																if (!tParameter.equals(tParameterList)) {
																	return new Object[] { ruleresult,
																			mMethodSignatureToTParameterList,
																			tParameterList, mMethodSignature, mEntry,
																			mEntryToTParameter, tParameter };
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

	public static final Object[] pattern_MethodParameter_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tParameterList, EObject mMethodSignature, EObject mEntry,
			EObject mEntryToTParameter, EObject tParameter) {
		EMoflonEdge tParameterList__tParameter____entries = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameter";
		String tParameterList__tParameter____entries_name_prime = "entries";
		String mMethodSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tParameterList__tParameter____entries);
		mMethodSignature__mEntry____mEntrys.setSrc(mMethodSignature);
		mMethodSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mMethodSignature__mEntry____mEntrys);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tParameterList__tParameter____entries.setName(tParameterList__tParameter____entries_name_prime);
		mMethodSignature__mEntry____mEntrys.setName(mMethodSignature__mEntry____mEntrys_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		return new Object[] { ruleresult, tParameterList, mMethodSignature, mEntry, mEntryToTParameter, tParameter,
				tParameterList__tParameter____entries, mMethodSignature__mEntry____mEntrys,
				mEntryToTParameter__mEntry____source, mEntryToTParameter__tParameter____target };
	}

	public static final void pattern_MethodParameter_1_5_registerobjects_expressionBBBBBBBB(MethodParameter _this,
			PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList, EObject tParameterList,
			EObject mMethodSignature, EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		_this.registerObjects_FWD(ruleresult, mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
				mEntry, mEntryToTParameter, tParameter);

	}

	public static final PerformRuleResult pattern_MethodParameter_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_2_1_preparereturnvalue_bindingFB(MethodParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameter _this) {
		Object[] result_pattern_MethodParameter_2_1_preparereturnvalue_binding = pattern_MethodParameter_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameter_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameter_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameter_2_1_preparereturnvalue_black = pattern_MethodParameter_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameter_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameter_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodParameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameter_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mMethodSignature");
		EObject _localVariable_1 = match.getObject("mEntry");
		EObject tmpMMethodSignature = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		if (tmpMMethodSignature instanceof MMethodSignature) {
			MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				return new Object[] { mMethodSignature, mEntry, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_2_2_corematch_blackFFBBB(
			MMethodSignature mMethodSignature, MEntry mEntry, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignatureToTParameterList mMethodSignatureToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMethodSignature, MMethodSignatureToTParameterList.class, "source")) {
			TParameterList tParameterList = mMethodSignatureToTParameterList.getTarget();
			if (tParameterList != null) {
				_result.add(new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry,
						match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_2_3_findcontext_blackBBBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, MEntry mEntry) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMethodSignature.equals(mMethodSignatureToTParameterList.getSource())) {
			if (tParameterList.equals(mMethodSignatureToTParameterList.getTarget())) {
				if (mMethodSignature.getMEntrys().contains(mEntry)) {
					_result.add(new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
							mEntry });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameter_2_3_findcontext_greenBBBBFFFF(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, MEntry mEntry) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMethodSignatureToTParameterList__mMethodSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTParameterList__tParameterList____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMethodSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMethodSignatureToTParameterList__mMethodSignature____source_name_prime = "source";
		String mMethodSignatureToTParameterList__tParameterList____target_name_prime = "target";
		String mMethodSignature__mEntry____mEntrys_name_prime = "mEntrys";
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(mEntry);
		mMethodSignatureToTParameterList__mMethodSignature____source.setSrc(mMethodSignatureToTParameterList);
		mMethodSignatureToTParameterList__mMethodSignature____source.setTrg(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList__mMethodSignature____source);
		mMethodSignatureToTParameterList__tParameterList____target.setSrc(mMethodSignatureToTParameterList);
		mMethodSignatureToTParameterList__tParameterList____target.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList__tParameterList____target);
		mMethodSignature__mEntry____mEntrys.setSrc(mMethodSignature);
		mMethodSignature__mEntry____mEntrys.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mMethodSignature__mEntry____mEntrys);
		mMethodSignatureToTParameterList__mMethodSignature____source
				.setName(mMethodSignatureToTParameterList__mMethodSignature____source_name_prime);
		mMethodSignatureToTParameterList__tParameterList____target
				.setName(mMethodSignatureToTParameterList__tParameterList____target_name_prime);
		mMethodSignature__mEntry____mEntrys.setName(mMethodSignature__mEntry____mEntrys_name_prime);
		return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry,
				isApplicableMatch, mMethodSignatureToTParameterList__mMethodSignature____source,
				mMethodSignatureToTParameterList__tParameterList____target, mMethodSignature__mEntry____mEntrys };
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_bindingFBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TParameterList tParameterList, MMethodSignature mMethodSignature, MEntry mEntry) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mMethodSignatureToTParameterList,
				tParameterList, mMethodSignature, mEntry);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList,
					mMethodSignature, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_bindingAndBlackFBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TParameterList tParameterList, MMethodSignature mMethodSignature, MEntry mEntry) {
		Object[] result_pattern_MethodParameter_2_4_solveCSP_binding = pattern_MethodParameter_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry);
		if (result_pattern_MethodParameter_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_2_4_solveCSP_black = pattern_MethodParameter_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList,
						mMethodSignature, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_2_5_checkCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameter_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameter_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_10_1_initialbindings_blackBBBB(MethodParameter _this,
			Match match, TParameterList tParameterList, TParameter tParameter) {
		return new Object[] { _this, match, tParameterList, tParameter };
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_bindingFBBBB(MethodParameter _this, Match match,
			TParameterList tParameterList, TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tParameterList, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tParameterList, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_bindingAndBlackFBBBB(MethodParameter _this,
			Match match, TParameterList tParameterList, TParameter tParameter) {
		Object[] result_pattern_MethodParameter_10_2_SolveCSP_binding = pattern_MethodParameter_10_2_SolveCSP_bindingFBBBB(
				_this, match, tParameterList, tParameter);
		if (result_pattern_MethodParameter_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameter_10_2_SolveCSP_black = pattern_MethodParameter_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tParameterList, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_10_3_CheckCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_10_4_collectelementstobetranslated_blackBBB(Match match,
			TParameterList tParameterList, TParameter tParameter) {
		return new Object[] { match, tParameterList, tParameter };
	}

	public static final Object[] pattern_MethodParameter_10_4_collectelementstobetranslated_greenBBBF(Match match,
			TParameterList tParameterList, TParameter tParameter) {
		EMoflonEdge tParameterList__tParameter____entries = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tParameter);
		String tParameterList__tParameter____entries_name_prime = "entries";
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(tParameterList__tParameter____entries);
		tParameterList__tParameter____entries.setName(tParameterList__tParameter____entries_name_prime);
		return new Object[] { match, tParameterList, tParameter, tParameterList__tParameter____entries };
	}

	public static final Object[] pattern_MethodParameter_10_5_collectcontextelements_blackBBB(Match match,
			TParameterList tParameterList, TParameter tParameter) {
		return new Object[] { match, tParameterList, tParameter };
	}

	public static final Object[] pattern_MethodParameter_10_5_collectcontextelements_greenBB(Match match,
			TParameterList tParameterList) {
		match.getContextNodes().add(tParameterList);
		return new Object[] { match, tParameterList };
	}

	public static final void pattern_MethodParameter_10_6_registerobjectstomatch_expressionBBBB(MethodParameter _this,
			Match match, TParameterList tParameterList, TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tParameterList, tParameter);

	}

	public static final boolean pattern_MethodParameter_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameter_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMethodSignatureToTParameterList");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParameterList");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("tParameter");
		EObject tmpMMethodSignatureToTParameterList = _localVariable_0;
		EObject tmpTParameterList = _localVariable_1;
		EObject tmpMMethodSignature = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		if (tmpMMethodSignatureToTParameterList instanceof MMethodSignatureToTParameterList) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) tmpMMethodSignatureToTParameterList;
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				if (tmpMMethodSignature instanceof MMethodSignature) {
					MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
								tParameter, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_blackBBBBFBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, TParameter tParameter, MethodParameter _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, tParameter,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_bindingAndBlackFFFFFBB(
			MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameter_11_1_performtransformation_binding = pattern_MethodParameter_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameter_11_1_performtransformation_binding != null) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result_pattern_MethodParameter_11_1_performtransformation_binding[0];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodParameter_11_1_performtransformation_binding[1];
			MMethodSignature mMethodSignature = (MMethodSignature) result_pattern_MethodParameter_11_1_performtransformation_binding[2];
			TParameter tParameter = (TParameter) result_pattern_MethodParameter_11_1_performtransformation_binding[3];

			Object[] result_pattern_MethodParameter_11_1_performtransformation_black = pattern_MethodParameter_11_1_performtransformation_blackBBBBFBB(
					mMethodSignatureToTParameterList, tParameterList, mMethodSignature, tParameter, _this,
					isApplicableMatch);
			if (result_pattern_MethodParameter_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameter_11_1_performtransformation_black[4];

				return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, tParameter,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_greenBFFB(
			MMethodSignature mMethodSignature, TParameter tParameter) {
		MEntry mEntry = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = ModiscoFactory.eINSTANCE.createMEntryToTParameter();
		mMethodSignature.getMEntrys().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		return new Object[] { mMethodSignature, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_11_2_collecttranslatedelements_blackBBB(MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		return new Object[] { mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_11_2_collecttranslatedelements_greenFBBB(MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getTranslatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList, EObject tParameterList,
			EObject mMethodSignature, EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		if (!mMethodSignatureToTParameterList.equals(tParameterList)) {
			if (!mMethodSignatureToTParameterList.equals(tParameter)) {
				if (!mMethodSignature.equals(mMethodSignatureToTParameterList)) {
					if (!mMethodSignature.equals(tParameterList)) {
						if (!mMethodSignature.equals(tParameter)) {
							if (!mEntry.equals(mMethodSignatureToTParameterList)) {
								if (!mEntry.equals(tParameterList)) {
									if (!mEntry.equals(mMethodSignature)) {
										if (!mEntry.equals(mEntryToTParameter)) {
											if (!mEntry.equals(tParameter)) {
												if (!mEntryToTParameter.equals(mMethodSignatureToTParameterList)) {
													if (!mEntryToTParameter.equals(tParameterList)) {
														if (!mEntryToTParameter.equals(mMethodSignature)) {
															if (!mEntryToTParameter.equals(tParameter)) {
																if (!tParameter.equals(tParameterList)) {
																	return new Object[] { ruleresult,
																			mMethodSignatureToTParameterList,
																			tParameterList, mMethodSignature, mEntry,
																			mEntryToTParameter, tParameter };
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

	public static final Object[] pattern_MethodParameter_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tParameterList, EObject mMethodSignature, EObject mEntry,
			EObject mEntryToTParameter, EObject tParameter) {
		EMoflonEdge tParameterList__tParameter____entries = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameter";
		String tParameterList__tParameter____entries_name_prime = "entries";
		String mMethodSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tParameterList__tParameter____entries);
		mMethodSignature__mEntry____mEntrys.setSrc(mMethodSignature);
		mMethodSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mMethodSignature__mEntry____mEntrys);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tParameterList__tParameter____entries.setName(tParameterList__tParameter____entries_name_prime);
		mMethodSignature__mEntry____mEntrys.setName(mMethodSignature__mEntry____mEntrys_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		return new Object[] { ruleresult, tParameterList, mMethodSignature, mEntry, mEntryToTParameter, tParameter,
				tParameterList__tParameter____entries, mMethodSignature__mEntry____mEntrys,
				mEntryToTParameter__mEntry____source, mEntryToTParameter__tParameter____target };
	}

	public static final void pattern_MethodParameter_11_5_registerobjects_expressionBBBBBBBB(MethodParameter _this,
			PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList, EObject tParameterList,
			EObject mMethodSignature, EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		_this.registerObjects_BWD(ruleresult, mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
				mEntry, mEntryToTParameter, tParameter);

	}

	public static final PerformRuleResult pattern_MethodParameter_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_12_1_preparereturnvalue_bindingFB(MethodParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameter _this) {
		Object[] result_pattern_MethodParameter_12_1_preparereturnvalue_binding = pattern_MethodParameter_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameter_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameter_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameter_12_1_preparereturnvalue_black = pattern_MethodParameter_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameter_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameter_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodParameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameter_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tParameterList");
		EObject _localVariable_1 = match.getObject("tParameter");
		EObject tmpTParameterList = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				return new Object[] { tParameterList, tParameter, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_12_2_corematch_blackFBFBB(
			TParameterList tParameterList, TParameter tParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignatureToTParameterList mMethodSignatureToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParameterList, MMethodSignatureToTParameterList.class, "target")) {
			MMethodSignature mMethodSignature = mMethodSignatureToTParameterList.getSource();
			if (mMethodSignature != null) {
				_result.add(new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
						tParameter, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_12_3_findcontext_blackBBBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, TParameter tParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMethodSignature.equals(mMethodSignatureToTParameterList.getSource())) {
			if (tParameterList.equals(mMethodSignatureToTParameterList.getTarget())) {
				if (tParameterList.getEntries().contains(tParameter)) {
					_result.add(new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
							tParameter });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameter_12_3_findcontext_greenBBBBFFFF(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, TParameter tParameter) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMethodSignatureToTParameterList__mMethodSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTParameterList__tParameterList____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMethodSignatureToTParameterList__mMethodSignature____source_name_prime = "source";
		String mMethodSignatureToTParameterList__tParameterList____target_name_prime = "target";
		String tParameterList__tParameter____entries_name_prime = "entries";
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameter);
		mMethodSignatureToTParameterList__mMethodSignature____source.setSrc(mMethodSignatureToTParameterList);
		mMethodSignatureToTParameterList__mMethodSignature____source.setTrg(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList__mMethodSignature____source);
		mMethodSignatureToTParameterList__tParameterList____target.setSrc(mMethodSignatureToTParameterList);
		mMethodSignatureToTParameterList__tParameterList____target.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList__tParameterList____target);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList__tParameter____entries);
		mMethodSignatureToTParameterList__mMethodSignature____source
				.setName(mMethodSignatureToTParameterList__mMethodSignature____source_name_prime);
		mMethodSignatureToTParameterList__tParameterList____target
				.setName(mMethodSignatureToTParameterList__tParameterList____target_name_prime);
		tParameterList__tParameter____entries.setName(tParameterList__tParameter____entries_name_prime);
		return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, tParameter,
				isApplicableMatch, mMethodSignatureToTParameterList__mMethodSignature____source,
				mMethodSignatureToTParameterList__tParameterList____target, tParameterList__tParameter____entries };
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_bindingFBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TParameterList tParameterList, MMethodSignature mMethodSignature, TParameter tParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMethodSignatureToTParameterList,
				tParameterList, mMethodSignature, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList,
					mMethodSignature, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_bindingAndBlackFBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TParameterList tParameterList, MMethodSignature mMethodSignature, TParameter tParameter) {
		Object[] result_pattern_MethodParameter_12_4_solveCSP_binding = pattern_MethodParameter_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
				tParameter);
		if (result_pattern_MethodParameter_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_12_4_solveCSP_black = pattern_MethodParameter_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList,
						mMethodSignature, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_12_5_checkCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameter_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameter_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_20_1_preparereturnvalue_bindingFB(MethodParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameter _this) {
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

	public static final Object[] pattern_MethodParameter_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameter _this) {
		Object[] result_pattern_MethodParameter_20_1_preparereturnvalue_binding = pattern_MethodParameter_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameter_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameter_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameter_20_1_preparereturnvalue_black = pattern_MethodParameter_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameter_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameter_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameter_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodParameter_20_2_testcorematchandDECs_black_nac_0B(MEntry mEntry) {
		Type __DEC_mEntry_type_542101 = mEntry.getType();
		if (__DEC_mEntry_type_542101 != null) {
			return new Object[] { mEntry };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mEntrys) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMethodSignature = _edge_mEntrys.getSrc();
		if (tmpMMethodSignature instanceof MMethodSignature) {
			MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
			EObject tmpMEntry = _edge_mEntrys.getTrg();
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (mMethodSignature.getMEntrys().contains(mEntry)) {
					if (pattern_MethodParameter_20_2_testcorematchandDECs_black_nac_0B(mEntry) == null) {
						_result.add(new Object[] { mMethodSignature, mEntry, _edge_mEntrys });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameter_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameter _this, Match match, MMethodSignature mMethodSignature, MEntry mEntry) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mMethodSignature, mEntry);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameter_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_21_1_preparereturnvalue_bindingFB(MethodParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameter _this) {
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

	public static final Object[] pattern_MethodParameter_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameter _this) {
		Object[] result_pattern_MethodParameter_21_1_preparereturnvalue_binding = pattern_MethodParameter_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameter_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameter_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameter_21_1_preparereturnvalue_black = pattern_MethodParameter_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameter_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameter_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameter_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodParameter_21_2_testcorematchandDECs_black_nac_0B(TParameter tParameter) {
		TAbstractType __DEC_tParameter_type_736332 = tParameter.getType();
		if (__DEC_tParameter_type_736332 != null) {
			return new Object[] { tParameter };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_entries) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameterList = _edge_entries.getSrc();
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			EObject tmpTParameter = _edge_entries.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tParameterList.getEntries().contains(tParameter)) {
					if (pattern_MethodParameter_21_2_testcorematchandDECs_black_nac_0B(tParameter) == null) {
						_result.add(new Object[] { tParameterList, tParameter, _edge_entries });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameter_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameter _this, Match match, TParameterList tParameterList, TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParameterList, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameter_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_24_1_prepare_blackB(MethodParameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameter_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameter_24_2_matchcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tParameterList");
		EObject _localVariable_1 = sourceMatch.getObject("mMethodSignature");
		EObject _localVariable_2 = sourceMatch.getObject("mEntry");
		EObject _localVariable_3 = targetMatch.getObject("tParameter");
		EObject tmpTParameterList = _localVariable_0;
		EObject tmpMMethodSignature = _localVariable_1;
		EObject tmpMEntry = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			if (tmpMMethodSignature instanceof MMethodSignature) {
				MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
				if (tmpMEntry instanceof MEntry) {
					MEntry mEntry = (MEntry) tmpMEntry;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						return new Object[] { tParameterList, mMethodSignature, mEntry, tParameter, targetMatch,
								sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_24_2_matchcontext_blackFBBBBBB(
			TParameterList tParameterList, MMethodSignature mMethodSignature, MEntry mEntry, TParameter tParameter,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tParameterList.getEntries().contains(tParameter)) {
				if (mMethodSignature.getMEntrys().contains(mEntry)) {
					for (MMethodSignatureToTParameterList mMethodSignatureToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mMethodSignature, MMethodSignatureToTParameterList.class,
									"source")) {
						if (tParameterList.equals(mMethodSignatureToTParameterList.getTarget())) {
							_result.add(new Object[] { mMethodSignatureToTParameterList, tParameterList,
									mMethodSignature, mEntry, tParameter, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameter_24_2_matchcontext_greenBBBBBBFB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, MEntry mEntry, TParameter tParameter, Match sourceMatch,
			Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "MethodParameter";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry, tParameter,
				sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_MethodParameter_24_3_checkcsp_bindingFBBBBBBBBB(MethodParameter _this,
			CCMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TParameterList tParameterList, MMethodSignature mMethodSignature, MEntry mEntry, TParameter tParameter,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mMethodSignatureToTParameterList,
				tParameterList, mMethodSignature, mEntry, tParameter, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList,
					mMethodSignature, mEntry, tParameter, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			CCMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TParameterList tParameterList, MMethodSignature mMethodSignature, MEntry mEntry, TParameter tParameter,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameter_24_3_checkcsp_binding = pattern_MethodParameter_24_3_checkcsp_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList, mMethodSignature, mEntry,
				tParameter, sourceMatch, targetMatch);
		if (result_pattern_MethodParameter_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_24_3_checkcsp_binding[0];

			Object[] result_pattern_MethodParameter_24_3_checkcsp_black = pattern_MethodParameter_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_MethodParameter_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList,
						mMethodSignature, mEntry, tParameter, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_4_createcorrespondence_blackBBBBB(
			TParameterList tParameterList, MMethodSignature mMethodSignature, MEntry mEntry, TParameter tParameter,
			CCMatch isApplicableMatch) {
		return new Object[] { tParameterList, mMethodSignature, mEntry, tParameter, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameter_24_4_createcorrespondence_greenBFBB(MEntry mEntry,
			TParameter tParameter, CCMatch isApplicableMatch) {
		MEntryToTParameter mEntryToTParameter = ModiscoFactory.eINSTANCE.createMEntryToTParameter();
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		isApplicableMatch.getCreateCorr().add(mEntryToTParameter);
		return new Object[] { mEntry, mEntryToTParameter, tParameter, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameter_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameter_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameter";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameter_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_27_1_matchtggpattern_black_nac_0B(MEntry mEntry) {
		Type __DEC_mEntry_type_803816 = mEntry.getType();
		if (__DEC_mEntry_type_803816 != null) {
			return new Object[] { mEntry };
		}

		return null;
	}

	public static final Object[] pattern_MethodParameter_27_1_matchtggpattern_blackBB(MMethodSignature mMethodSignature,
			MEntry mEntry) {
		if (mMethodSignature.getMEntrys().contains(mEntry)) {
			if (pattern_MethodParameter_27_1_matchtggpattern_black_nac_0B(mEntry) == null) {
				return new Object[] { mMethodSignature, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameter_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_28_1_matchtggpattern_black_nac_0B(TParameter tParameter) {
		TAbstractType __DEC_tParameter_type_128524 = tParameter.getType();
		if (__DEC_tParameter_type_128524 != null) {
			return new Object[] { tParameter };
		}

		return null;
	}

	public static final Object[] pattern_MethodParameter_28_1_matchtggpattern_blackBB(TParameterList tParameterList,
			TParameter tParameter) {
		if (tParameterList.getEntries().contains(tParameter)) {
			if (pattern_MethodParameter_28_1_matchtggpattern_black_nac_0B(tParameter) == null) {
				return new Object[] { tParameterList, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameter_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_29_1_createresult_blackB(MethodParameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameter_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignatureToTParameterList mMethodSignatureToTParameterList) {
		if (ruleResult.getCorrObjects().contains(mMethodSignatureToTParameterList)) {
			return new Object[] { ruleResult, mMethodSignatureToTParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mMethodSignature) {
		if (ruleResult.getSourceObjects().contains(mMethodSignature)) {
			return new Object[] { ruleResult, mMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TParameterList tParameterList) {
		if (ruleResult.getTargetObjects().contains(tParameterList)) {
			return new Object[] { ruleResult, tParameterList };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMethodSignatureToTParameterListList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMethodSignatureToTParameterList : mMethodSignatureToTParameterListList.getEntryObjects()) {
				if (tmpMMethodSignatureToTParameterList instanceof MMethodSignatureToTParameterList) {
					MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) tmpMMethodSignatureToTParameterList;
					MMethodSignature mMethodSignature = mMethodSignatureToTParameterList.getSource();
					if (mMethodSignature != null) {
						TParameterList tParameterList = mMethodSignatureToTParameterList.getTarget();
						if (tParameterList != null) {
							if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mMethodSignatureToTParameterList) == null) {
								if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mMethodSignature) == null) {
									if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											tParameterList) == null) {
										_result.add(new Object[] { mMethodSignatureToTParameterListList,
												mMethodSignatureToTParameterList, mMethodSignature, tParameterList,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_MethodParameter_29_3_solveCSP_bindingFBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TParameterList tParameterList, MMethodSignature mMethodSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMethodSignatureToTParameterList,
				tParameterList, mMethodSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList,
					mMethodSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_29_3_solveCSP_bindingAndBlackFBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TParameterList tParameterList, MMethodSignature mMethodSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameter_29_3_solveCSP_binding = pattern_MethodParameter_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList, mMethodSignature,
				ruleResult);
		if (result_pattern_MethodParameter_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_29_3_solveCSP_black = pattern_MethodParameter_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tParameterList,
						mMethodSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_29_4_checkCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_29_5_checknacs_blackBBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature) {
		return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature };
	}

	public static final Object[] pattern_MethodParameter_29_6_perform_blackBBBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TParameterList tParameterList,
			MMethodSignature mMethodSignature, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mMethodSignatureToTParameterList, tParameterList, mMethodSignature, ruleResult };
	}

	public static final Object[] pattern_MethodParameter_29_6_perform_greenBBFFFB(TParameterList tParameterList,
			MMethodSignature mMethodSignature, ModelgeneratorRuleResult ruleResult) {
		MEntry mEntry = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = ModiscoFactory.eINSTANCE.createMEntryToTParameter();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mMethodSignature.getMEntrys().add(mEntry);
		ruleResult.getSourceObjects().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		ruleResult.getCorrObjects().add(mEntryToTParameter);
		tParameterList.getEntries().add(tParameter);
		mEntryToTParameter.setTarget(tParameter);
		ruleResult.getTargetObjects().add(tParameter);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tParameterList, mMethodSignature, mEntry, mEntryToTParameter, tParameter, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameter_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterImpl
