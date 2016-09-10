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

import org.gravity.modisco.MMethodSignature;

import org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature;

import org.gravity.tgg.modisco.Rules.RulesPackage;
import org.gravity.tgg.modisco.Rules.SignatureReturnType;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodSignature;

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
 * An implementation of the model object '<em><b>Signature Return Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SignatureReturnTypeImpl extends AbstractRuleImpl implements SignatureReturnType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureReturnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSignatureReturnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodSignature mSignature, Type mType) {
		// initial bindings
		Object[] result1_black = SignatureReturnTypeImpl.pattern_SignatureReturnType_0_1_initialbindings_blackBBBB(this,
				match, mSignature, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mType] = " + mType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mSignature, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", " + "[mType] = "
					+ mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SignatureReturnTypeImpl.pattern_SignatureReturnType_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_0_4_collectelementstobetranslated_blackBBB(match, mSignature, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mType] = " + mType + ".");
			}
			SignatureReturnTypeImpl.pattern_SignatureReturnType_0_4_collectelementstobetranslated_greenBBBF(match,
					mSignature, mType);
			// EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_0_5_collectcontextelements_blackBBB(match, mSignature, mType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[mSignature] = " + mSignature + ", " + "[mType] = " + mType + ".");
			}
			SignatureReturnTypeImpl.pattern_SignatureReturnType_0_5_collectcontextelements_greenBBB(match, mSignature,
					mType);

			// register objects to match
			SignatureReturnTypeImpl.pattern_SignatureReturnType_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mSignature, mType);
			return SignatureReturnTypeImpl.pattern_SignatureReturnType_0_7_expressionF();
		} else {
			return SignatureReturnTypeImpl.pattern_SignatureReturnType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[1];
		MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) result1_bindingAndBlack[2];
		Type mType = (Type) result1_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[4];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		SignatureReturnTypeImpl.pattern_SignatureReturnType_1_1_performtransformation_greenBB(tSignature, tType);

		// collect translated elements
		Object[] result2_green = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mSignature, tSignature,
						mSignatureToTSignature, mType, tType, mTypeToTType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mSignature] = " + mSignature + ", " + "[tSignature] = "
					+ tSignature + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
					+ mType + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ".");
		}
		SignatureReturnTypeImpl.pattern_SignatureReturnType_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult, mSignature,
				tSignature, mType, tType);
		// EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		SignatureReturnTypeImpl.pattern_SignatureReturnType_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType);
		return SignatureReturnTypeImpl.pattern_SignatureReturnType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SignatureReturnTypeImpl.pattern_SignatureReturnType_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodSignature mSignature = (MMethodSignature) result2_binding[0];
		Type mType = (Type) result2_binding[1];
		for (Object[] result2_black : SignatureReturnTypeImpl
				.pattern_SignatureReturnType_2_2_corematch_blackBFFBFFB(mSignature, mType, match)) {
			TMethodSignature tSignature = (TMethodSignature) result2_black[1];
			MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) result2_black[2];
			TAbstractType tType = (TAbstractType) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : SignatureReturnTypeImpl
					.pattern_SignatureReturnType_2_3_findcontext_blackBBBBBB(mSignature, tSignature,
							mSignatureToTSignature, mType, tType, mTypeToTType)) {
				Object[] result3_green = SignatureReturnTypeImpl
						.pattern_SignatureReturnType_2_3_findcontext_greenBBBBBBFFFFFF(mSignature, tSignature,
								mSignatureToTSignature, mType, tType, mTypeToTType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = SignatureReturnTypeImpl
						.pattern_SignatureReturnType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
							+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
							+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SignatureReturnTypeImpl.pattern_SignatureReturnType_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SignatureReturnTypeImpl
							.pattern_SignatureReturnType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SignatureReturnTypeImpl.pattern_SignatureReturnType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SignatureReturnTypeImpl.pattern_SignatureReturnType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mSignature, Type mType) {
		match.registerObject("mSignature", mSignature);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mSignature, Type mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mSignatureToTSignature, EObject mType, EObject tType, EObject mTypeToTType) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);

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
	public boolean isAppropriate_BWD(Match match, TMethodSignature tSignature, TAbstractType tType) {
		// initial bindings
		Object[] result1_black = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_10_1_initialbindings_blackBBBB(this, match, tSignature, tType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tType] = " + tType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tSignature, tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = "
					+ tType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SignatureReturnTypeImpl.pattern_SignatureReturnType_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_10_4_collectelementstobetranslated_blackBBB(match, tSignature, tType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", "
						+ "[tType] = " + tType + ".");
			}
			SignatureReturnTypeImpl.pattern_SignatureReturnType_10_4_collectelementstobetranslated_greenBBBF(match,
					tSignature, tType);
			// EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_10_5_collectcontextelements_blackBBB(match, tSignature, tType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ".");
			}
			SignatureReturnTypeImpl.pattern_SignatureReturnType_10_5_collectcontextelements_greenBBB(match, tSignature,
					tType);

			// register objects to match
			SignatureReturnTypeImpl.pattern_SignatureReturnType_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tSignature, tType);
			return SignatureReturnTypeImpl.pattern_SignatureReturnType_10_7_expressionF();
		} else {
			return SignatureReturnTypeImpl.pattern_SignatureReturnType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[1];
		MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) result1_bindingAndBlack[2];
		Type mType = (Type) result1_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[4];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		SignatureReturnTypeImpl.pattern_SignatureReturnType_11_1_performtransformation_greenBB(mSignature, mType);

		// collect translated elements
		Object[] result2_green = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mSignature, tSignature,
						mSignatureToTSignature, mType, tType, mTypeToTType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mSignature] = " + mSignature + ", " + "[tSignature] = "
					+ tSignature + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
					+ mType + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ".");
		}
		SignatureReturnTypeImpl.pattern_SignatureReturnType_11_3_bookkeepingforedges_greenBBBBBFF(ruleresult,
				mSignature, tSignature, mType, tType);
		// EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		SignatureReturnTypeImpl.pattern_SignatureReturnType_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType);
		return SignatureReturnTypeImpl.pattern_SignatureReturnType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SignatureReturnTypeImpl.pattern_SignatureReturnType_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		for (Object[] result2_black : SignatureReturnTypeImpl
				.pattern_SignatureReturnType_12_2_corematch_blackFBFFBFB(tSignature, tType, match)) {
			MMethodSignature mSignature = (MMethodSignature) result2_black[0];
			MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) result2_black[2];
			Type mType = (Type) result2_black[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : SignatureReturnTypeImpl
					.pattern_SignatureReturnType_12_3_findcontext_blackBBBBBB(mSignature, tSignature,
							mSignatureToTSignature, mType, tType, mTypeToTType)) {
				Object[] result3_green = SignatureReturnTypeImpl
						.pattern_SignatureReturnType_12_3_findcontext_greenBBBBBBFFFFFF(mSignature, tSignature,
								mSignatureToTSignature, mType, tType, mTypeToTType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = SignatureReturnTypeImpl
						.pattern_SignatureReturnType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
							+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
							+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SignatureReturnTypeImpl.pattern_SignatureReturnType_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SignatureReturnTypeImpl
							.pattern_SignatureReturnType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SignatureReturnTypeImpl.pattern_SignatureReturnType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SignatureReturnTypeImpl.pattern_SignatureReturnType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tSignature, TAbstractType tType) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tSignature, TAbstractType tType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mSignatureToTSignature, EObject mType, EObject tType, EObject mTypeToTType) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_6(EMoflonEdge _edge_returnType) {
		// prepare return value
		Object[] result1_bindingAndBlack = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SignatureReturnTypeImpl.pattern_SignatureReturnType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SignatureReturnTypeImpl
				.pattern_SignatureReturnType_20_2_testcorematchandDECs_blackFFB(_edge_returnType)) {
			MMethodSignature mSignature = (MMethodSignature) result2_black[0];
			Type mType = (Type) result2_black[1];
			Object[] result2_green = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SignatureReturnTypeImpl
					.pattern_SignatureReturnType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mSignature, mType)) {
				// Ensure that the correct types of elements are matched
				if (SignatureReturnTypeImpl
						.pattern_SignatureReturnType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SignatureReturnTypeImpl
							.pattern_SignatureReturnType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					SignatureReturnTypeImpl.pattern_SignatureReturnType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SignatureReturnTypeImpl.pattern_SignatureReturnType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_4(EMoflonEdge _edge_returnType) {
		// prepare return value
		Object[] result1_bindingAndBlack = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SignatureReturnTypeImpl.pattern_SignatureReturnType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SignatureReturnTypeImpl
				.pattern_SignatureReturnType_21_2_testcorematchandDECs_blackFFB(_edge_returnType)) {
			TMethodSignature tSignature = (TMethodSignature) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			Object[] result2_green = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SignatureReturnTypeImpl
					.pattern_SignatureReturnType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tSignature, tType)) {
				// Ensure that the correct types of elements are matched
				if (SignatureReturnTypeImpl
						.pattern_SignatureReturnType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SignatureReturnTypeImpl
							.pattern_SignatureReturnType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					SignatureReturnTypeImpl.pattern_SignatureReturnType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SignatureReturnTypeImpl.pattern_SignatureReturnType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SignatureReturnType");
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
		ruleResult.setRule("SignatureReturnType");
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
		Object[] result1_black = SignatureReturnTypeImpl.pattern_SignatureReturnType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SignatureReturnTypeImpl.pattern_SignatureReturnType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_24_2_matchcontext_bindingFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodSignature mSignature = (MMethodSignature) result2_binding[0];
		TMethodSignature tSignature = (TMethodSignature) result2_binding[1];
		Type mType = (Type) result2_binding[2];
		TAbstractType tType = (TAbstractType) result2_binding[3];
		for (Object[] result2_black : SignatureReturnTypeImpl
				.pattern_SignatureReturnType_24_2_matchcontext_blackBBFBBFBB(mSignature, tSignature, mType, tType,
						sourceMatch, targetMatch)) {
			MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			Object[] result2_green = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_24_2_matchcontext_greenBBBBBBBFB(mSignature, tSignature,
							mSignatureToTSignature, mType, tType, mTypeToTType, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = SignatureReturnTypeImpl
						.pattern_SignatureReturnType_24_4_createcorrespondence_blackBBBBB(mSignature, tSignature, mType,
								tType, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature
							+ ", " + "[mType] = " + mType + ", " + "[tType] = " + tType + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = SignatureReturnTypeImpl
						.pattern_SignatureReturnType_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				SignatureReturnTypeImpl.pattern_SignatureReturnType_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return SignatureReturnTypeImpl.pattern_SignatureReturnType_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public boolean checkDEC_FWD(MMethodSignature mSignature, Type mType) {// match tgg pattern
		Object[] result1_black = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_27_1_matchtggpattern_blackBB(mSignature, mType);
		if (result1_black != null) {
			return SignatureReturnTypeImpl.pattern_SignatureReturnType_27_2_expressionF();
		} else {
			return SignatureReturnTypeImpl.pattern_SignatureReturnType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSignature, TAbstractType tType) {// match tgg pattern
		Object[] result1_black = SignatureReturnTypeImpl
				.pattern_SignatureReturnType_28_1_matchtggpattern_blackBB(tSignature, tType);
		if (result1_black != null) {
			return SignatureReturnTypeImpl.pattern_SignatureReturnType_28_2_expressionF();
		} else {
			return SignatureReturnTypeImpl.pattern_SignatureReturnType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MMethodSignatureToTMethodSignature mSignatureToTSignatureParameter,
			TypeToTAbstractType mTypeToTTypeParameter) {
		// create result
		Object[] result1_black = SignatureReturnTypeImpl.pattern_SignatureReturnType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SignatureReturnTypeImpl.pattern_SignatureReturnType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SignatureReturnTypeImpl
				.pattern_SignatureReturnType_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mSignatureToTSignatureList = (RuleEntryList) result2_black[0];
			MMethodSignature mSignature = (MMethodSignature) result2_black[1];
			MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) result2_black[2];
			TMethodSignature tSignature = (TMethodSignature) result2_black[3];
			// RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[4];
			Type mType = (Type) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			TAbstractType tType = (TAbstractType) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = SignatureReturnTypeImpl
					.pattern_SignatureReturnType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = "
						+ mSignature + ", " + "[tSignature] = " + tSignature + ", " + "[mSignatureToTSignature] = "
						+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[tType] = " + tType + ", "
						+ "[mTypeToTType] = " + mTypeToTType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SignatureReturnTypeImpl.pattern_SignatureReturnType_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = SignatureReturnTypeImpl.pattern_SignatureReturnType_29_5_checknacs_blackBBBBBB(
						mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SignatureReturnTypeImpl
							.pattern_SignatureReturnType_29_6_perform_blackBBBBBBB(mSignature, tSignature,
									mSignatureToTSignature, mType, tType, mTypeToTType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
								+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
								+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					SignatureReturnTypeImpl.pattern_SignatureReturnType_29_6_perform_greenBBBBB(mSignature, tSignature,
							mType, tType, ruleResult);

				} else {
				}

			} else {
			}

		}
		return SignatureReturnTypeImpl.pattern_SignatureReturnType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.SIGNATURE_RETURN_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(Type) arguments.get(2));
			return null;
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_TMETHODSIGNATURE_MMETHODSIGNATURETOTMETHODSIGNATURE_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TMethodSignature) arguments.get(2), (MMethodSignatureToTMethodSignature) arguments.get(3),
					(Type) arguments.get(4), (TAbstractType) arguments.get(5), (TypeToTAbstractType) arguments.get(6));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SIGNATURE_RETURN_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.SIGNATURE_RETURN_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
			return null;
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_TMETHODSIGNATURE_MMETHODSIGNATURETOTMETHODSIGNATURE_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TMethodSignature) arguments.get(2), (MMethodSignatureToTMethodSignature) arguments.get(3),
					(Type) arguments.get(4), (TAbstractType) arguments.get(5), (TypeToTAbstractType) arguments.get(6));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SIGNATURE_RETURN_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MMETHODSIGNATURE_TMETHODSIGNATURE_MMETHODSIGNATURETOTMETHODSIGNATURE_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TMethodSignature) arguments.get(2), (MMethodSignatureToTMethodSignature) arguments.get(3),
					(Type) arguments.get(4), (TAbstractType) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.SIGNATURE_RETURN_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SIGNATURE_RETURN_TYPE___CHECK_DEC_FWD__MMETHODSIGNATURE_TYPE:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (Type) arguments.get(1));
		case RulesPackage.SIGNATURE_RETURN_TYPE___CHECK_DEC_BWD__TMETHODSIGNATURE_TABSTRACTTYPE:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.SIGNATURE_RETURN_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MMETHODSIGNATURETOTMETHODSIGNATURE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(MMethodSignatureToTMethodSignature) arguments.get(1), (TypeToTAbstractType) arguments.get(2));
		case RulesPackage.SIGNATURE_RETURN_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_TMETHODSIGNATURE_MMETHODSIGNATURETOTMETHODSIGNATURE_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TMethodSignature) arguments.get(2), (MMethodSignatureToTMethodSignature) arguments.get(3),
					(Type) arguments.get(4), (TAbstractType) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.SIGNATURE_RETURN_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SignatureReturnType_0_1_initialbindings_blackBBBB(SignatureReturnType _this,
			Match match, MMethodSignature mSignature, Type mType) {
		return new Object[] { _this, match, mSignature, mType };
	}

	public static final Object[] pattern_SignatureReturnType_0_2_SolveCSP_bindingFBBBB(SignatureReturnType _this,
			Match match, MMethodSignature mSignature, Type mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSignature, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSignature, mType };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SignatureReturnType_0_2_SolveCSP_bindingAndBlackFBBBB(
			SignatureReturnType _this, Match match, MMethodSignature mSignature, Type mType) {
		Object[] result_pattern_SignatureReturnType_0_2_SolveCSP_binding = pattern_SignatureReturnType_0_2_SolveCSP_bindingFBBBB(
				_this, match, mSignature, mType);
		if (result_pattern_SignatureReturnType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SignatureReturnType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SignatureReturnType_0_2_SolveCSP_black = pattern_SignatureReturnType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SignatureReturnType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSignature, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_SignatureReturnType_0_3_CheckCSP_expressionFBB(SignatureReturnType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_0_4_collectelementstobetranslated_blackBBB(Match match,
			MMethodSignature mSignature, Type mType) {
		return new Object[] { match, mSignature, mType };
	}

	public static final Object[] pattern_SignatureReturnType_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MMethodSignature mSignature, Type mType) {
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignature__mType____returnType_name_prime = "returnType";
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		match.getToBeTranslatedEdges().add(mSignature__mType____returnType);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { match, mSignature, mType, mSignature__mType____returnType };
	}

	public static final Object[] pattern_SignatureReturnType_0_5_collectcontextelements_blackBBB(Match match,
			MMethodSignature mSignature, Type mType) {
		return new Object[] { match, mSignature, mType };
	}

	public static final Object[] pattern_SignatureReturnType_0_5_collectcontextelements_greenBBB(Match match,
			MMethodSignature mSignature, Type mType) {
		match.getContextNodes().add(mSignature);
		match.getContextNodes().add(mType);
		return new Object[] { match, mSignature, mType };
	}

	public static final void pattern_SignatureReturnType_0_6_registerobjectstomatch_expressionBBBB(
			SignatureReturnType _this, Match match, MMethodSignature mSignature, Type mType) {
		_this.registerObjectsToMatch_FWD(match, mSignature, mType);

	}

	public static final boolean pattern_SignatureReturnType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SignatureReturnType_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeToTType");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpMSignatureToTSignature = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpMTypeToTType = _localVariable_5;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpMSignatureToTSignature instanceof MMethodSignatureToTMethodSignature) {
					MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) tmpMSignatureToTSignature;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpMTypeToTType instanceof TypeToTAbstractType) {
								TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
								return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType,
										mTypeToTType, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_1_1_performtransformation_blackBBBBBBFBB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, SignatureReturnType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			SignatureReturnType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SignatureReturnType_1_1_performtransformation_binding = pattern_SignatureReturnType_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SignatureReturnType_1_1_performtransformation_binding != null) {
			MMethodSignature mSignature = (MMethodSignature) result_pattern_SignatureReturnType_1_1_performtransformation_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_SignatureReturnType_1_1_performtransformation_binding[1];
			MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) result_pattern_SignatureReturnType_1_1_performtransformation_binding[2];
			Type mType = (Type) result_pattern_SignatureReturnType_1_1_performtransformation_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_SignatureReturnType_1_1_performtransformation_binding[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_SignatureReturnType_1_1_performtransformation_binding[5];

			Object[] result_pattern_SignatureReturnType_1_1_performtransformation_black = pattern_SignatureReturnType_1_1_performtransformation_blackBBBBBBFBB(
					mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, _this,
					isApplicableMatch);
			if (result_pattern_SignatureReturnType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SignatureReturnType_1_1_performtransformation_black[6];

				return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_1_1_performtransformation_greenBB(
			TMethodSignature tSignature, TAbstractType tType) {
		tSignature.setReturnType(tType);
		return new Object[] { tSignature, tType };
	}

	public static final Object[] pattern_SignatureReturnType_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_SignatureReturnType_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature, EObject mSignatureToTSignature,
			EObject mType, EObject tType, EObject mTypeToTType) {
		if (!mSignature.equals(tSignature)) {
			if (!mSignature.equals(mSignatureToTSignature)) {
				if (!mSignature.equals(mType)) {
					if (!mSignature.equals(tType)) {
						if (!mSignature.equals(mTypeToTType)) {
							if (!tSignature.equals(tType)) {
								if (!mSignatureToTSignature.equals(tSignature)) {
									if (!mSignatureToTSignature.equals(mType)) {
										if (!mSignatureToTSignature.equals(tType)) {
											if (!mSignatureToTSignature.equals(mTypeToTType)) {
												if (!mType.equals(tSignature)) {
													if (!mType.equals(tType)) {
														if (!mType.equals(mTypeToTType)) {
															if (!mTypeToTType.equals(tSignature)) {
																if (!mTypeToTType.equals(tType)) {
																	return new Object[] { ruleresult, mSignature,
																			tSignature, mSignatureToTSignature, mType,
																			tType, mTypeToTType };
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

	public static final Object[] pattern_SignatureReturnType_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature, EObject mType, EObject tType) {
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SignatureReturnType";
		String mSignature__mType____returnType_name_prime = "returnType";
		String tSignature__tType____returnType_name_prime = "returnType";
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mSignature__mType____returnType);
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		ruleresult.getCreatedEdges().add(tSignature__tType____returnType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		return new Object[] { ruleresult, mSignature, tSignature, mType, tType, mSignature__mType____returnType,
				tSignature__tType____returnType };
	}

	public static final void pattern_SignatureReturnType_1_5_registerobjects_expressionBBBBBBBB(
			SignatureReturnType _this, PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mSignatureToTSignature, EObject mType, EObject tType, EObject mTypeToTType) {
		_this.registerObjects_FWD(ruleresult, mSignature, tSignature, mSignatureToTSignature, mType, tType,
				mTypeToTType);

	}

	public static final PerformRuleResult pattern_SignatureReturnType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_2_1_preparereturnvalue_bindingFB(
			SignatureReturnType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SignatureReturnType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_2_1_preparereturnvalue_bindingAndBlackFFB(
			SignatureReturnType _this) {
		Object[] result_pattern_SignatureReturnType_2_1_preparereturnvalue_binding = pattern_SignatureReturnType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SignatureReturnType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SignatureReturnType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SignatureReturnType_2_1_preparereturnvalue_black = pattern_SignatureReturnType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SignatureReturnType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SignatureReturnType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SignatureReturnType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SignatureReturnType_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mSignature");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				return new Object[] { mSignature, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SignatureReturnType_2_2_corematch_blackBFFBFFB(
			MMethodSignature mSignature, Type mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignatureToTMethodSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MMethodSignatureToTMethodSignature.class, "source")) {
			TMethodSignature tSignature = mSignatureToTSignature.getTarget();
			if (tSignature != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tType = mTypeToTType.getTarget();
					if (tType != null) {
						_result.add(new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType,
								mTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SignatureReturnType_2_3_findcontext_blackBBBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mSignature.getReturnType())) {
			if (mSignature.equals(mSignatureToTSignature.getSource())) {
				if (tSignature.equals(mSignatureToTSignature.getTarget())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (tType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType,
									mTypeToTType });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_2_3_findcontext_greenBBBBBBFFFFFF(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignature__mType____returnType_name_prime = "returnType";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____returnType);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType,
				isApplicableMatch, mSignature__mType____returnType, mSignatureToTSignature__mSignature____source,
				mSignatureToTSignature__tSignature____target, mTypeToTType__mType____source,
				mTypeToTType__tType____target };
	}

	public static final Object[] pattern_SignatureReturnType_2_4_solveCSP_bindingFBBBBBBBB(SignatureReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSignature, tSignature,
				mSignatureToTSignature, mType, tType, mTypeToTType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature, mType,
					tType, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SignatureReturnType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			SignatureReturnType _this, IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType) {
		Object[] result_pattern_SignatureReturnType_2_4_solveCSP_binding = pattern_SignatureReturnType_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType);
		if (result_pattern_SignatureReturnType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SignatureReturnType_2_4_solveCSP_binding[0];

			Object[] result_pattern_SignatureReturnType_2_4_solveCSP_black = pattern_SignatureReturnType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SignatureReturnType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature,
						mType, tType, mTypeToTType };
			}
		}
		return null;
	}

	public static final boolean pattern_SignatureReturnType_2_5_checkCSP_expressionFBB(SignatureReturnType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SignatureReturnType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SignatureReturnType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SignatureReturnType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_10_1_initialbindings_blackBBBB(SignatureReturnType _this,
			Match match, TMethodSignature tSignature, TAbstractType tType) {
		return new Object[] { _this, match, tSignature, tType };
	}

	public static final Object[] pattern_SignatureReturnType_10_2_SolveCSP_bindingFBBBB(SignatureReturnType _this,
			Match match, TMethodSignature tSignature, TAbstractType tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tType };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SignatureReturnType_10_2_SolveCSP_bindingAndBlackFBBBB(
			SignatureReturnType _this, Match match, TMethodSignature tSignature, TAbstractType tType) {
		Object[] result_pattern_SignatureReturnType_10_2_SolveCSP_binding = pattern_SignatureReturnType_10_2_SolveCSP_bindingFBBBB(
				_this, match, tSignature, tType);
		if (result_pattern_SignatureReturnType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SignatureReturnType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SignatureReturnType_10_2_SolveCSP_black = pattern_SignatureReturnType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SignatureReturnType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_SignatureReturnType_10_3_CheckCSP_expressionFBB(SignatureReturnType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_10_4_collectelementstobetranslated_blackBBB(Match match,
			TMethodSignature tSignature, TAbstractType tType) {
		return new Object[] { match, tSignature, tType };
	}

	public static final Object[] pattern_SignatureReturnType_10_4_collectelementstobetranslated_greenBBBF(Match match,
			TMethodSignature tSignature, TAbstractType tType) {
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSignature__tType____returnType_name_prime = "returnType";
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		match.getToBeTranslatedEdges().add(tSignature__tType____returnType);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		return new Object[] { match, tSignature, tType, tSignature__tType____returnType };
	}

	public static final Object[] pattern_SignatureReturnType_10_5_collectcontextelements_blackBBB(Match match,
			TMethodSignature tSignature, TAbstractType tType) {
		return new Object[] { match, tSignature, tType };
	}

	public static final Object[] pattern_SignatureReturnType_10_5_collectcontextelements_greenBBB(Match match,
			TMethodSignature tSignature, TAbstractType tType) {
		match.getContextNodes().add(tSignature);
		match.getContextNodes().add(tType);
		return new Object[] { match, tSignature, tType };
	}

	public static final void pattern_SignatureReturnType_10_6_registerobjectstomatch_expressionBBBB(
			SignatureReturnType _this, Match match, TMethodSignature tSignature, TAbstractType tType) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tType);

	}

	public static final boolean pattern_SignatureReturnType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SignatureReturnType_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeToTType");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpMSignatureToTSignature = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpMTypeToTType = _localVariable_5;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpMSignatureToTSignature instanceof MMethodSignatureToTMethodSignature) {
					MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) tmpMSignatureToTSignature;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpMTypeToTType instanceof TypeToTAbstractType) {
								TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
								return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType,
										mTypeToTType, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_11_1_performtransformation_blackBBBBBBFBB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, SignatureReturnType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			SignatureReturnType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SignatureReturnType_11_1_performtransformation_binding = pattern_SignatureReturnType_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SignatureReturnType_11_1_performtransformation_binding != null) {
			MMethodSignature mSignature = (MMethodSignature) result_pattern_SignatureReturnType_11_1_performtransformation_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_SignatureReturnType_11_1_performtransformation_binding[1];
			MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) result_pattern_SignatureReturnType_11_1_performtransformation_binding[2];
			Type mType = (Type) result_pattern_SignatureReturnType_11_1_performtransformation_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_SignatureReturnType_11_1_performtransformation_binding[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_SignatureReturnType_11_1_performtransformation_binding[5];

			Object[] result_pattern_SignatureReturnType_11_1_performtransformation_black = pattern_SignatureReturnType_11_1_performtransformation_blackBBBBBBFBB(
					mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, _this,
					isApplicableMatch);
			if (result_pattern_SignatureReturnType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SignatureReturnType_11_1_performtransformation_black[6];

				return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_11_1_performtransformation_greenBB(
			MMethodSignature mSignature, Type mType) {
		mSignature.setReturnType(mType);
		return new Object[] { mSignature, mType };
	}

	public static final Object[] pattern_SignatureReturnType_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_SignatureReturnType_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature, EObject mSignatureToTSignature,
			EObject mType, EObject tType, EObject mTypeToTType) {
		if (!mSignature.equals(tSignature)) {
			if (!mSignature.equals(mSignatureToTSignature)) {
				if (!mSignature.equals(mType)) {
					if (!mSignature.equals(tType)) {
						if (!mSignature.equals(mTypeToTType)) {
							if (!tSignature.equals(tType)) {
								if (!mSignatureToTSignature.equals(tSignature)) {
									if (!mSignatureToTSignature.equals(mType)) {
										if (!mSignatureToTSignature.equals(tType)) {
											if (!mSignatureToTSignature.equals(mTypeToTType)) {
												if (!mType.equals(tSignature)) {
													if (!mType.equals(tType)) {
														if (!mType.equals(mTypeToTType)) {
															if (!mTypeToTType.equals(tSignature)) {
																if (!mTypeToTType.equals(tType)) {
																	return new Object[] { ruleresult, mSignature,
																			tSignature, mSignatureToTSignature, mType,
																			tType, mTypeToTType };
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

	public static final Object[] pattern_SignatureReturnType_11_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature, EObject mType, EObject tType) {
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SignatureReturnType";
		String mSignature__mType____returnType_name_prime = "returnType";
		String tSignature__tType____returnType_name_prime = "returnType";
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getCreatedEdges().add(mSignature__mType____returnType);
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tSignature__tType____returnType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		return new Object[] { ruleresult, mSignature, tSignature, mType, tType, mSignature__mType____returnType,
				tSignature__tType____returnType };
	}

	public static final void pattern_SignatureReturnType_11_5_registerobjects_expressionBBBBBBBB(
			SignatureReturnType _this, PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mSignatureToTSignature, EObject mType, EObject tType, EObject mTypeToTType) {
		_this.registerObjects_BWD(ruleresult, mSignature, tSignature, mSignatureToTSignature, mType, tType,
				mTypeToTType);

	}

	public static final PerformRuleResult pattern_SignatureReturnType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_12_1_preparereturnvalue_bindingFB(
			SignatureReturnType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SignatureReturnType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_12_1_preparereturnvalue_bindingAndBlackFFB(
			SignatureReturnType _this) {
		Object[] result_pattern_SignatureReturnType_12_1_preparereturnvalue_binding = pattern_SignatureReturnType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SignatureReturnType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SignatureReturnType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SignatureReturnType_12_1_preparereturnvalue_black = pattern_SignatureReturnType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SignatureReturnType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SignatureReturnType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SignatureReturnType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SignatureReturnType_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				return new Object[] { tSignature, tType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SignatureReturnType_12_2_corematch_blackFBFFBFB(
			TMethodSignature tSignature, TAbstractType tType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignatureToTMethodSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSignature, MMethodSignatureToTMethodSignature.class, "target")) {
			MMethodSignature mSignature = mSignatureToTSignature.getSource();
			if (mSignature != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type mType = mTypeToTType.getSource();
					if (mType != null) {
						_result.add(new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType,
								mTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SignatureReturnType_12_3_findcontext_blackBBBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.equals(tSignature.getReturnType())) {
			if (mSignature.equals(mSignatureToTSignature.getSource())) {
				if (tSignature.equals(mSignatureToTSignature.getTarget())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (tType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType,
									mTypeToTType });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_12_3_findcontext_greenBBBBBBFFFFFF(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSignature__tType____returnType_name_prime = "returnType";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tSignature__tType____returnType);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType,
				isApplicableMatch, tSignature__tType____returnType, mSignatureToTSignature__mSignature____source,
				mSignatureToTSignature__tSignature____target, mTypeToTType__mType____source,
				mTypeToTType__tType____target };
	}

	public static final Object[] pattern_SignatureReturnType_12_4_solveCSP_bindingFBBBBBBBB(SignatureReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mSignature, tSignature,
				mSignatureToTSignature, mType, tType, mTypeToTType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature, mType,
					tType, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SignatureReturnType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			SignatureReturnType _this, IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType) {
		Object[] result_pattern_SignatureReturnType_12_4_solveCSP_binding = pattern_SignatureReturnType_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType);
		if (result_pattern_SignatureReturnType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SignatureReturnType_12_4_solveCSP_binding[0];

			Object[] result_pattern_SignatureReturnType_12_4_solveCSP_black = pattern_SignatureReturnType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SignatureReturnType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature,
						mType, tType, mTypeToTType };
			}
		}
		return null;
	}

	public static final boolean pattern_SignatureReturnType_12_5_checkCSP_expressionFBB(SignatureReturnType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SignatureReturnType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SignatureReturnType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SignatureReturnType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_20_1_preparereturnvalue_bindingFB(
			SignatureReturnType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SignatureReturnType _this) {
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

	public static final Object[] pattern_SignatureReturnType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SignatureReturnType _this) {
		Object[] result_pattern_SignatureReturnType_20_1_preparereturnvalue_binding = pattern_SignatureReturnType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SignatureReturnType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SignatureReturnType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SignatureReturnType_20_1_preparereturnvalue_black = pattern_SignatureReturnType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SignatureReturnType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SignatureReturnType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SignatureReturnType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SignatureReturnType_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_returnType.getSrc();
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			EObject tmpMType = _edge_returnType.getTrg();
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				if (mType.equals(mSignature.getReturnType())) {
					_result.add(new Object[] { mSignature, mType, _edge_returnType });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SignatureReturnType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SignatureReturnType _this, Match match, MMethodSignature mSignature, Type mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSignature, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SignatureReturnType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SignatureReturnType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SignatureReturnType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_21_1_preparereturnvalue_bindingFB(
			SignatureReturnType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SignatureReturnType _this) {
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

	public static final Object[] pattern_SignatureReturnType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SignatureReturnType _this) {
		Object[] result_pattern_SignatureReturnType_21_1_preparereturnvalue_binding = pattern_SignatureReturnType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SignatureReturnType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SignatureReturnType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SignatureReturnType_21_1_preparereturnvalue_black = pattern_SignatureReturnType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SignatureReturnType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SignatureReturnType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SignatureReturnType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SignatureReturnType_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSignature = _edge_returnType.getSrc();
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			EObject tmpTType = _edge_returnType.getTrg();
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tType.equals(tSignature.getReturnType())) {
					_result.add(new Object[] { tSignature, tType, _edge_returnType });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SignatureReturnType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SignatureReturnType _this, Match match, TMethodSignature tSignature, TAbstractType tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SignatureReturnType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SignatureReturnType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SignatureReturnType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_24_1_prepare_blackB(SignatureReturnType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SignatureReturnType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SignatureReturnType_24_2_matchcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mSignature");
		EObject _localVariable_1 = targetMatch.getObject("tSignature");
		EObject _localVariable_2 = sourceMatch.getObject("mType");
		EObject _localVariable_3 = targetMatch.getObject("tType");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					if (tmpTType instanceof TAbstractType) {
						TAbstractType tType = (TAbstractType) tmpTType;
						return new Object[] { mSignature, tSignature, mType, tType, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SignatureReturnType_24_2_matchcontext_blackBBFBBFBB(
			MMethodSignature mSignature, TMethodSignature tSignature, Type mType, TAbstractType tType,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (mType.equals(mSignature.getReturnType())) {
				if (tType.equals(tSignature.getReturnType())) {
					for (MMethodSignatureToTMethodSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mSignature, MMethodSignatureToTMethodSignature.class,
									"source")) {
						if (tSignature.equals(mSignatureToTSignature.getTarget())) {
							for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
								if (tType.equals(mTypeToTType.getTarget())) {
									_result.add(new Object[] { mSignature, tSignature, mSignatureToTSignature, mType,
											tType, mTypeToTType, sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_24_2_matchcontext_greenBBBBBBBFB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "SignatureReturnType";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_SignatureReturnType_24_3_checkcsp_bindingFBBBBBBBBBB(SignatureReturnType _this,
			CCMatch isApplicableMatch, MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mSignature, tSignature,
				mSignatureToTSignature, mType, tType, mTypeToTType, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature, mType,
					tType, mTypeToTType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SignatureReturnType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(
			SignatureReturnType _this, CCMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SignatureReturnType_24_3_checkcsp_binding = pattern_SignatureReturnType_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType,
				sourceMatch, targetMatch);
		if (result_pattern_SignatureReturnType_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_SignatureReturnType_24_3_checkcsp_binding[0];

			Object[] result_pattern_SignatureReturnType_24_3_checkcsp_black = pattern_SignatureReturnType_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_SignatureReturnType_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature,
						mType, tType, mTypeToTType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_24_4_createcorrespondence_blackBBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature, Type mType, TAbstractType tType,
			CCMatch isApplicableMatch) {
		return new Object[] { mSignature, tSignature, mType, tType, isApplicableMatch };
	}

	public static final Object[] pattern_SignatureReturnType_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_SignatureReturnType_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SignatureReturnType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SignatureReturnType_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_27_1_matchtggpattern_blackBB(MMethodSignature mSignature,
			Type mType) {
		if (mType.equals(mSignature.getReturnType())) {
			return new Object[] { mSignature, mType };
		}
		return null;
	}

	public static final boolean pattern_SignatureReturnType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SignatureReturnType_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_28_1_matchtggpattern_blackBB(TMethodSignature tSignature,
			TAbstractType tType) {
		if (tType.equals(tSignature.getReturnType())) {
			return new Object[] { tSignature, tType };
		}
		return null;
	}

	public static final boolean pattern_SignatureReturnType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SignatureReturnType_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_29_1_createresult_blackB(SignatureReturnType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SignatureReturnType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignatureToTMethodSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tSignature) {
		if (ruleResult.getTargetObjects().contains(tSignature)) {
			return new Object[] { ruleResult, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SignatureReturnType_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSignatureToTSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mSignatureToTSignatureList.equals(mTypeToTTypeList)) {
					for (EObject tmpMSignatureToTSignature : mSignatureToTSignatureList.getEntryObjects()) {
						if (tmpMSignatureToTSignature instanceof MMethodSignatureToTMethodSignature) {
							MMethodSignatureToTMethodSignature mSignatureToTSignature = (MMethodSignatureToTMethodSignature) tmpMSignatureToTSignature;
							MMethodSignature mSignature = mSignatureToTSignature.getSource();
							if (mSignature != null) {
								TMethodSignature tSignature = mSignatureToTSignature.getTarget();
								if (tSignature != null) {
									if (pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mSignatureToTSignature) == null) {
										if (pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mSignature) == null) {
											if (pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tSignature) == null) {
												for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
													if (tmpMTypeToTType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
														Type mType = mTypeToTType.getSource();
														if (mType != null) {
															TAbstractType tType = mTypeToTType.getTarget();
															if (tType != null) {
																if (pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mTypeToTType) == null) {
																	if (pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, mType) == null) {
																		if (pattern_SignatureReturnType_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, tType) == null) {
																			_result.add(new Object[] {
																					mSignatureToTSignatureList,
																					mSignature, mSignatureToTSignature,
																					tSignature, mTypeToTTypeList, mType,
																					mTypeToTType, tType,
																					ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_SignatureReturnType_29_3_solveCSP_bindingFBBBBBBBBB(SignatureReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mSignature, tSignature,
				mSignatureToTSignature, mType, tType, mTypeToTType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature, mType,
					tType, mTypeToTType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SignatureReturnType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SignatureReturnType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			SignatureReturnType _this, IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SignatureReturnType_29_3_solveCSP_binding = pattern_SignatureReturnType_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType,
				ruleResult);
		if (result_pattern_SignatureReturnType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SignatureReturnType_29_3_solveCSP_binding[0];

			Object[] result_pattern_SignatureReturnType_29_3_solveCSP_black = pattern_SignatureReturnType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SignatureReturnType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mSignatureToTSignature,
						mType, tType, mTypeToTType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SignatureReturnType_29_4_checkCSP_expressionFBB(SignatureReturnType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SignatureReturnType_29_5_checknacs_blackBBBBBB(MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType) {
		return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType };
	}

	public static final Object[] pattern_SignatureReturnType_29_6_perform_blackBBBBBBB(MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodSignatureToTMethodSignature mSignatureToTSignature, Type mType,
			TAbstractType tType, TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mSignature, tSignature, mSignatureToTSignature, mType, tType, mTypeToTType, ruleResult };
	}

	public static final Object[] pattern_SignatureReturnType_29_6_perform_greenBBBBB(MMethodSignature mSignature,
			TMethodSignature tSignature, Type mType, TAbstractType tType, ModelgeneratorRuleResult ruleResult) {
		mSignature.setReturnType(mType);
		tSignature.setReturnType(tType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mSignature, tSignature, mType, tType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_SignatureReturnType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SignatureReturnTypeImpl
