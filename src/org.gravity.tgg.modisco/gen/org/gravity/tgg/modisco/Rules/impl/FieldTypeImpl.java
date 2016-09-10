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

import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MSignature;

import org.gravity.tgg.modisco.MSignatureToTSignature;

import org.gravity.tgg.modisco.Rules.FieldType;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TSignature;

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
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldTypeImpl extends AbstractRuleImpl implements FieldType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type ePrimitiveType, MFieldSignature mSignature) {
		// initial bindings
		Object[] result1_black = FieldTypeImpl.pattern_FieldType_0_1_initialbindings_blackBBBB(this, match,
				ePrimitiveType, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[ePrimitiveType] = " + ePrimitiveType
					+ ", " + "[mSignature] = " + mSignature + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldTypeImpl.pattern_FieldType_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, ePrimitiveType, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldTypeImpl.pattern_FieldType_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldTypeImpl.pattern_FieldType_0_4_collectelementstobetranslated_blackBBB(match,
					ePrimitiveType, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", "
						+ "[mSignature] = " + mSignature + ".");
			}
			FieldTypeImpl.pattern_FieldType_0_4_collectelementstobetranslated_greenBBBF(match, ePrimitiveType,
					mSignature);
			// EMoflonEdge mSignature__ePrimitiveType____type = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = FieldTypeImpl.pattern_FieldType_0_5_collectcontextelements_blackBBB(match,
					ePrimitiveType, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", "
						+ "[mSignature] = " + mSignature + ".");
			}
			FieldTypeImpl.pattern_FieldType_0_5_collectcontextelements_greenBBB(match, ePrimitiveType, mSignature);

			// register objects to match
			FieldTypeImpl.pattern_FieldType_0_6_registerobjectstomatch_expressionBBBB(this, match, ePrimitiveType,
					mSignature);
			return FieldTypeImpl.pattern_FieldType_0_7_expressionF();
		} else {
			return FieldTypeImpl.pattern_FieldType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldTypeImpl
				.pattern_FieldType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TFieldSignature tFieldSignature = (TFieldSignature) result1_bindingAndBlack[0];
		Type ePrimitiveType = (Type) result1_bindingAndBlack[1];
		TAbstractType tPrimitiv = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) result1_bindingAndBlack[3];
		MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result1_bindingAndBlack[4];
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		FieldTypeImpl.pattern_FieldType_1_1_performtransformation_greenBB(tFieldSignature, tPrimitiv);

		// collect translated elements
		Object[] result2_green = FieldTypeImpl.pattern_FieldType_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldTypeImpl.pattern_FieldType_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature,
				mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tFieldSignature] = " + tFieldSignature + ", "
					+ "[ePrimitiveType] = " + ePrimitiveType + ", " + "[tPrimitiv] = " + tPrimitiv + ", "
					+ "[ePrimitiveTypeToTPrimitiv] = " + ePrimitiveTypeToTPrimitiv + ", "
					+ "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", " + "[mSignature] = "
					+ mSignature + ".");
		}
		FieldTypeImpl.pattern_FieldType_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult, tFieldSignature,
				ePrimitiveType, tPrimitiv, mSignature);
		// EMoflonEdge tFieldSignature__tPrimitiv____type = (EMoflonEdge) result3_green[5];
		// EMoflonEdge mSignature__ePrimitiveType____type = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		FieldTypeImpl.pattern_FieldType_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, tFieldSignature,
				ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature);
		return FieldTypeImpl.pattern_FieldType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldTypeImpl
				.pattern_FieldType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldTypeImpl.pattern_FieldType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldTypeImpl.pattern_FieldType_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type ePrimitiveType = (Type) result2_binding[0];
		MFieldSignature mSignature = (MFieldSignature) result2_binding[1];
		for (Object[] result2_black : FieldTypeImpl.pattern_FieldType_2_2_corematch_blackFBFFFBB(ePrimitiveType,
				mSignature, match)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TAbstractType tPrimitiv = (TAbstractType) result2_black[2];
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) result2_black[3];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : FieldTypeImpl.pattern_FieldType_2_3_findcontext_blackBBBBBB(tFieldSignature,
					ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature)) {
				Object[] result3_green = FieldTypeImpl.pattern_FieldType_2_3_findcontext_greenBBBBBBFFFFFF(
						tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
						mSignatureToTFieldSignature, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge ePrimitiveTypeToTPrimitiv__ePrimitiveType____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge ePrimitiveTypeToTPrimitiv__tPrimitiv____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mSignatureToTFieldSignature__mSignature____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mSignature__ePrimitiveType____type = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldTypeImpl
						.pattern_FieldType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
								mSignatureToTFieldSignature, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tFieldSignature] = " + tFieldSignature + ", " + "[ePrimitiveType] = " + ePrimitiveType
							+ ", " + "[tPrimitiv] = " + tPrimitiv + ", " + "[ePrimitiveTypeToTPrimitiv] = "
							+ ePrimitiveTypeToTPrimitiv + ", " + "[mSignatureToTFieldSignature] = "
							+ mSignatureToTFieldSignature + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldTypeImpl.pattern_FieldType_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldTypeImpl
							.pattern_FieldType_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldTypeImpl.pattern_FieldType_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldTypeImpl.pattern_FieldType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type ePrimitiveType, MFieldSignature mSignature) {
		match.registerObject("ePrimitiveType", ePrimitiveType);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type ePrimitiveType, MFieldSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("ePrimitiveType", ePrimitiveType);
		isApplicableMatch.registerObject("tPrimitiv", tPrimitiv);
		isApplicableMatch.registerObject("ePrimitiveTypeToTPrimitiv", ePrimitiveTypeToTPrimitiv);
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tFieldSignature, EObject ePrimitiveType,
			EObject tPrimitiv, EObject ePrimitiveTypeToTPrimitiv, EObject mSignatureToTFieldSignature,
			EObject mSignature) {
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("ePrimitiveType", ePrimitiveType);
		ruleresult.registerObject("tPrimitiv", tPrimitiv);
		ruleresult.registerObject("ePrimitiveTypeToTPrimitiv", ePrimitiveTypeToTPrimitiv);
		ruleresult.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		ruleresult.registerObject("mSignature", mSignature);

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
	public boolean isAppropriate_BWD(Match match, TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		// initial bindings
		Object[] result1_black = FieldTypeImpl.pattern_FieldType_10_1_initialbindings_blackBBBB(this, match,
				tFieldSignature, tPrimitiv);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tFieldSignature] = " + tFieldSignature
					+ ", " + "[tPrimitiv] = " + tPrimitiv + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldTypeImpl.pattern_FieldType_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, tFieldSignature, tPrimitiv);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tFieldSignature] = " + tFieldSignature + ", "
					+ "[tPrimitiv] = " + tPrimitiv + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldTypeImpl.pattern_FieldType_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldTypeImpl.pattern_FieldType_10_4_collectelementstobetranslated_blackBBB(match,
					tFieldSignature, tPrimitiv);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tFieldSignature] = " + tFieldSignature + ", "
						+ "[tPrimitiv] = " + tPrimitiv + ".");
			}
			FieldTypeImpl.pattern_FieldType_10_4_collectelementstobetranslated_greenBBBF(match, tFieldSignature,
					tPrimitiv);
			// EMoflonEdge tFieldSignature__tPrimitiv____type = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = FieldTypeImpl.pattern_FieldType_10_5_collectcontextelements_blackBBB(match,
					tFieldSignature, tPrimitiv);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tFieldSignature] = " + tFieldSignature + ", "
						+ "[tPrimitiv] = " + tPrimitiv + ".");
			}
			FieldTypeImpl.pattern_FieldType_10_5_collectcontextelements_greenBBB(match, tFieldSignature, tPrimitiv);

			// register objects to match
			FieldTypeImpl.pattern_FieldType_10_6_registerobjectstomatch_expressionBBBB(this, match, tFieldSignature,
					tPrimitiv);
			return FieldTypeImpl.pattern_FieldType_10_7_expressionF();
		} else {
			return FieldTypeImpl.pattern_FieldType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldTypeImpl
				.pattern_FieldType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TFieldSignature tFieldSignature = (TFieldSignature) result1_bindingAndBlack[0];
		Type ePrimitiveType = (Type) result1_bindingAndBlack[1];
		TAbstractType tPrimitiv = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) result1_bindingAndBlack[3];
		MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result1_bindingAndBlack[4];
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		FieldTypeImpl.pattern_FieldType_11_1_performtransformation_greenBB(ePrimitiveType, mSignature);

		// collect translated elements
		Object[] result2_green = FieldTypeImpl.pattern_FieldType_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldTypeImpl.pattern_FieldType_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature,
				mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tFieldSignature] = " + tFieldSignature + ", "
					+ "[ePrimitiveType] = " + ePrimitiveType + ", " + "[tPrimitiv] = " + tPrimitiv + ", "
					+ "[ePrimitiveTypeToTPrimitiv] = " + ePrimitiveTypeToTPrimitiv + ", "
					+ "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", " + "[mSignature] = "
					+ mSignature + ".");
		}
		FieldTypeImpl.pattern_FieldType_11_3_bookkeepingforedges_greenBBBBBFF(ruleresult, tFieldSignature,
				ePrimitiveType, tPrimitiv, mSignature);
		// EMoflonEdge tFieldSignature__tPrimitiv____type = (EMoflonEdge) result3_green[5];
		// EMoflonEdge mSignature__ePrimitiveType____type = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		FieldTypeImpl.pattern_FieldType_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, tFieldSignature,
				ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature);
		return FieldTypeImpl.pattern_FieldType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldTypeImpl
				.pattern_FieldType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldTypeImpl.pattern_FieldType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldTypeImpl.pattern_FieldType_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TFieldSignature tFieldSignature = (TFieldSignature) result2_binding[0];
		TAbstractType tPrimitiv = (TAbstractType) result2_binding[1];
		for (Object[] result2_black : FieldTypeImpl.pattern_FieldType_12_2_corematch_blackBFBFFFB(tFieldSignature,
				tPrimitiv, match)) {
			Type ePrimitiveType = (Type) result2_black[1];
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) result2_black[3];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[4];
			MFieldSignature mSignature = (MFieldSignature) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : FieldTypeImpl.pattern_FieldType_12_3_findcontext_blackBBBBBB(tFieldSignature,
					ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature)) {
				Object[] result3_green = FieldTypeImpl.pattern_FieldType_12_3_findcontext_greenBBBBBBFFFFFF(
						tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
						mSignatureToTFieldSignature, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge tFieldSignature__tPrimitiv____type = (EMoflonEdge) result3_green[7];
				// EMoflonEdge ePrimitiveTypeToTPrimitiv__ePrimitiveType____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge ePrimitiveTypeToTPrimitiv__tPrimitiv____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mSignatureToTFieldSignature__mSignature____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldTypeImpl
						.pattern_FieldType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
								mSignatureToTFieldSignature, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tFieldSignature] = " + tFieldSignature + ", " + "[ePrimitiveType] = " + ePrimitiveType
							+ ", " + "[tPrimitiv] = " + tPrimitiv + ", " + "[ePrimitiveTypeToTPrimitiv] = "
							+ ePrimitiveTypeToTPrimitiv + ", " + "[mSignatureToTFieldSignature] = "
							+ mSignatureToTFieldSignature + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldTypeImpl.pattern_FieldType_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldTypeImpl
							.pattern_FieldType_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldTypeImpl.pattern_FieldType_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldTypeImpl.pattern_FieldType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		match.registerObject("tFieldSignature", tFieldSignature);
		match.registerObject("tPrimitiv", tPrimitiv);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("ePrimitiveType", ePrimitiveType);
		isApplicableMatch.registerObject("tPrimitiv", tPrimitiv);
		isApplicableMatch.registerObject("ePrimitiveTypeToTPrimitiv", ePrimitiveTypeToTPrimitiv);
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tFieldSignature, EObject ePrimitiveType,
			EObject tPrimitiv, EObject ePrimitiveTypeToTPrimitiv, EObject mSignatureToTFieldSignature,
			EObject mSignature) {
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("ePrimitiveType", ePrimitiveType);
		ruleresult.registerObject("tPrimitiv", tPrimitiv);
		ruleresult.registerObject("ePrimitiveTypeToTPrimitiv", ePrimitiveTypeToTPrimitiv);
		ruleresult.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		ruleresult.registerObject("mSignature", mSignature);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_22(EMoflonEdge _edge_type) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldTypeImpl
				.pattern_FieldType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldTypeImpl.pattern_FieldType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldTypeImpl.pattern_FieldType_20_2_testcorematchandDECs_blackFFB(_edge_type)) {
			Type ePrimitiveType = (Type) result2_black[0];
			MFieldSignature mSignature = (MFieldSignature) result2_black[1];
			Object[] result2_green = FieldTypeImpl.pattern_FieldType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldTypeImpl.pattern_FieldType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, ePrimitiveType, mSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldTypeImpl.pattern_FieldType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldTypeImpl.pattern_FieldType_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldTypeImpl.pattern_FieldType_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldTypeImpl.pattern_FieldType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_20(EMoflonEdge _edge_type) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldTypeImpl
				.pattern_FieldType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldTypeImpl.pattern_FieldType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldTypeImpl.pattern_FieldType_21_2_testcorematchandDECs_blackFFB(_edge_type)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TAbstractType tPrimitiv = (TAbstractType) result2_black[1];
			Object[] result2_green = FieldTypeImpl.pattern_FieldType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldTypeImpl.pattern_FieldType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, tFieldSignature, tPrimitiv)) {
				// Ensure that the correct types of elements are matched
				if (FieldTypeImpl.pattern_FieldType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldTypeImpl.pattern_FieldType_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldTypeImpl.pattern_FieldType_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldTypeImpl.pattern_FieldType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldType");
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
		ruleResult.setRule("FieldType");
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
		Object[] result1_black = FieldTypeImpl.pattern_FieldType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldTypeImpl.pattern_FieldType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = FieldTypeImpl.pattern_FieldType_24_2_matchcontext_bindingFFFFBB(targetMatch,
				sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TFieldSignature tFieldSignature = (TFieldSignature) result2_binding[0];
		Type ePrimitiveType = (Type) result2_binding[1];
		TAbstractType tPrimitiv = (TAbstractType) result2_binding[2];
		MFieldSignature mSignature = (MFieldSignature) result2_binding[3];
		for (Object[] result2_black : FieldTypeImpl.pattern_FieldType_24_2_matchcontext_blackBBBFFBBB(tFieldSignature,
				ePrimitiveType, tPrimitiv, mSignature, sourceMatch, targetMatch)) {
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) result2_black[3];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[4];
			Object[] result2_green = FieldTypeImpl.pattern_FieldType_24_2_matchcontext_greenBBBBBBBFB(tFieldSignature,
					ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature,
					sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = FieldTypeImpl.pattern_FieldType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(
					this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
					mSignatureToTFieldSignature, mSignature, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = FieldTypeImpl.pattern_FieldType_24_4_createcorrespondence_blackBBBBB(
						tFieldSignature, ePrimitiveType, tPrimitiv, mSignature, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tFieldSignature] = " + tFieldSignature + ", " + "[ePrimitiveType] = "
							+ ePrimitiveType + ", " + "[tPrimitiv] = " + tPrimitiv + ", " + "[mSignature] = "
							+ mSignature + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = FieldTypeImpl.pattern_FieldType_24_5_addtoreturnedresult_blackBB(result,
						isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldTypeImpl.pattern_FieldType_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return FieldTypeImpl.pattern_FieldType_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType,
			TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("ePrimitiveType", ePrimitiveType);
		isApplicableMatch.registerObject("tPrimitiv", tPrimitiv);
		isApplicableMatch.registerObject("ePrimitiveTypeToTPrimitiv", ePrimitiveTypeToTPrimitiv);
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
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
	public boolean checkDEC_FWD(Type ePrimitiveType, MFieldSignature mSignature) {// match tgg pattern
		Object[] result1_black = FieldTypeImpl.pattern_FieldType_27_1_matchtggpattern_blackBB(ePrimitiveType,
				mSignature);
		if (result1_black != null) {
			return FieldTypeImpl.pattern_FieldType_27_2_expressionF();
		} else {
			return FieldTypeImpl.pattern_FieldType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {// match tgg pattern
		Object[] result1_black = FieldTypeImpl.pattern_FieldType_28_1_matchtggpattern_blackBB(tFieldSignature,
				tPrimitiv);
		if (result1_black != null) {
			return FieldTypeImpl.pattern_FieldType_28_2_expressionF();
		} else {
			return FieldTypeImpl.pattern_FieldType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MSignatureToTSignature mSignatureToTFieldSignatureParameter,
			TypeToTAbstractType ePrimitiveTypeToTPrimitivParameter) {
		// create result
		Object[] result1_black = FieldTypeImpl.pattern_FieldType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldTypeImpl.pattern_FieldType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : FieldTypeImpl
				.pattern_FieldType_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mSignatureToTFieldSignatureList = (RuleEntryList) result2_black[0];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[1];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[2];
			MFieldSignature mSignature = (MFieldSignature) result2_black[3];
			// RuleEntryList ePrimitiveTypeToTPrimitivList = (RuleEntryList) result2_black[4];
			Type ePrimitiveType = (Type) result2_black[5];
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) result2_black[6];
			TAbstractType tPrimitiv = (TAbstractType) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = FieldTypeImpl.pattern_FieldType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
					this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
					mSignatureToTFieldSignature, mSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tFieldSignature] = "
						+ tFieldSignature + ", " + "[ePrimitiveType] = " + ePrimitiveType + ", " + "[tPrimitiv] = "
						+ tPrimitiv + ", " + "[ePrimitiveTypeToTPrimitiv] = " + ePrimitiveTypeToTPrimitiv + ", "
						+ "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", " + "[mSignature] = "
						+ mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (FieldTypeImpl.pattern_FieldType_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = FieldTypeImpl.pattern_FieldType_29_5_checknacs_blackBBBBBB(tFieldSignature,
						ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature);
				if (result5_black != null) {

					// perform
					Object[] result6_black = FieldTypeImpl.pattern_FieldType_29_6_perform_blackBBBBBBB(tFieldSignature,
							ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature,
							mSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[tFieldSignature] = " + tFieldSignature + ", " + "[ePrimitiveType] = "
								+ ePrimitiveType + ", " + "[tPrimitiv] = " + tPrimitiv + ", "
								+ "[ePrimitiveTypeToTPrimitiv] = " + ePrimitiveTypeToTPrimitiv + ", "
								+ "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", "
								+ "[mSignature] = " + mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldTypeImpl.pattern_FieldType_29_6_perform_greenBBBBB(tFieldSignature, ePrimitiveType, tPrimitiv,
							mSignature, ruleResult);

				} else {
				}

			} else {
			}

		}
		return FieldTypeImpl.pattern_FieldType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("ePrimitiveType", ePrimitiveType);
		isApplicableMatch.registerObject("tPrimitiv", tPrimitiv);
		isApplicableMatch.registerObject("ePrimitiveTypeToTPrimitiv", ePrimitiveTypeToTPrimitiv);
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
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
		case RulesPackage.FIELD_TYPE___IS_APPROPRIATE_FWD__MATCH_TYPE_MFIELDSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MFieldSignature) arguments.get(2));
		case RulesPackage.FIELD_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_MFIELDSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MFieldSignature) arguments.get(2));
			return null;
		case RulesPackage.FIELD_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_MFIELDSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MFieldSignature) arguments.get(2));
		case RulesPackage.FIELD_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TFIELDSIGNATURE_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE_MFIELDSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TFieldSignature) arguments.get(1),
					(Type) arguments.get(2), (TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (MFieldSignature) arguments.get(6));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_TYPE___IS_APPROPRIATE_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.FIELD_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
			return null;
		case RulesPackage.FIELD_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.FIELD_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TFIELDSIGNATURE_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE_MFIELDSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TFieldSignature) arguments.get(1),
					(Type) arguments.get(2), (TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (MFieldSignature) arguments.get(6));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_22((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_20((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TFIELDSIGNATURE_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE_MFIELDSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TFieldSignature) arguments.get(1),
					(Type) arguments.get(2), (TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (MFieldSignature) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.FIELD_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_TYPE___CHECK_DEC_FWD__TYPE_MFIELDSIGNATURE:
			return checkDEC_FWD((Type) arguments.get(0), (MFieldSignature) arguments.get(1));
		case RulesPackage.FIELD_TYPE___CHECK_DEC_BWD__TFIELDSIGNATURE_TABSTRACTTYPE:
			return checkDEC_BWD((TFieldSignature) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.FIELD_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MSIGNATURETOTSIGNATURE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MSignatureToTSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.FIELD_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TFIELDSIGNATURE_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE_MFIELDSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TFieldSignature) arguments.get(1),
					(Type) arguments.get(2), (TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (MFieldSignature) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.FIELD_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldType_0_1_initialbindings_blackBBBB(FieldType _this, Match match,
			Type ePrimitiveType, MFieldSignature mSignature) {
		return new Object[] { _this, match, ePrimitiveType, mSignature };
	}

	public static final Object[] pattern_FieldType_0_2_SolveCSP_bindingFBBBB(FieldType _this, Match match,
			Type ePrimitiveType, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, ePrimitiveType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, ePrimitiveType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldType_0_2_SolveCSP_bindingAndBlackFBBBB(FieldType _this, Match match,
			Type ePrimitiveType, MFieldSignature mSignature) {
		Object[] result_pattern_FieldType_0_2_SolveCSP_binding = pattern_FieldType_0_2_SolveCSP_bindingFBBBB(_this,
				match, ePrimitiveType, mSignature);
		if (result_pattern_FieldType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldType_0_2_SolveCSP_black = pattern_FieldType_0_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, ePrimitiveType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldType_0_3_CheckCSP_expressionFBB(FieldType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldType_0_4_collectelementstobetranslated_blackBBB(Match match,
			Type ePrimitiveType, MFieldSignature mSignature) {
		return new Object[] { match, ePrimitiveType, mSignature };
	}

	public static final Object[] pattern_FieldType_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Type ePrimitiveType, MFieldSignature mSignature) {
		EMoflonEdge mSignature__ePrimitiveType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignature__ePrimitiveType____type_name_prime = "type";
		mSignature__ePrimitiveType____type.setSrc(mSignature);
		mSignature__ePrimitiveType____type.setTrg(ePrimitiveType);
		match.getToBeTranslatedEdges().add(mSignature__ePrimitiveType____type);
		mSignature__ePrimitiveType____type.setName(mSignature__ePrimitiveType____type_name_prime);
		return new Object[] { match, ePrimitiveType, mSignature, mSignature__ePrimitiveType____type };
	}

	public static final Object[] pattern_FieldType_0_5_collectcontextelements_blackBBB(Match match, Type ePrimitiveType,
			MFieldSignature mSignature) {
		return new Object[] { match, ePrimitiveType, mSignature };
	}

	public static final Object[] pattern_FieldType_0_5_collectcontextelements_greenBBB(Match match, Type ePrimitiveType,
			MFieldSignature mSignature) {
		match.getContextNodes().add(ePrimitiveType);
		match.getContextNodes().add(mSignature);
		return new Object[] { match, ePrimitiveType, mSignature };
	}

	public static final void pattern_FieldType_0_6_registerobjectstomatch_expressionBBBB(FieldType _this, Match match,
			Type ePrimitiveType, MFieldSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, ePrimitiveType, mSignature);

	}

	public static final boolean pattern_FieldType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldType_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldType_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tFieldSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("ePrimitiveType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPrimitiv");
		EObject _localVariable_3 = isApplicableMatch.getObject("ePrimitiveTypeToTPrimitiv");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignatureToTFieldSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSignature");
		EObject tmpTFieldSignature = _localVariable_0;
		EObject tmpEPrimitiveType = _localVariable_1;
		EObject tmpTPrimitiv = _localVariable_2;
		EObject tmpEPrimitiveTypeToTPrimitiv = _localVariable_3;
		EObject tmpMSignatureToTFieldSignature = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			if (tmpEPrimitiveType instanceof Type) {
				Type ePrimitiveType = (Type) tmpEPrimitiveType;
				if (tmpTPrimitiv instanceof TAbstractType) {
					TAbstractType tPrimitiv = (TAbstractType) tmpTPrimitiv;
					if (tmpEPrimitiveTypeToTPrimitiv instanceof TypeToTAbstractType) {
						TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) tmpEPrimitiveTypeToTPrimitiv;
						if (tmpMSignatureToTFieldSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) tmpMSignatureToTFieldSignature;
							if (tmpMSignature instanceof MFieldSignature) {
								MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
								return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv,
										ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_1_1_performtransformation_blackBBBBBBFBB(
			TFieldSignature tFieldSignature, Type ePrimitiveType, TAbstractType tPrimitiv,
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldSignature mSignature, FieldType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
						mSignatureToTFieldSignature, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(FieldType _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldType_1_1_performtransformation_binding = pattern_FieldType_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldType_1_1_performtransformation_binding != null) {
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldType_1_1_performtransformation_binding[0];
			Type ePrimitiveType = (Type) result_pattern_FieldType_1_1_performtransformation_binding[1];
			TAbstractType tPrimitiv = (TAbstractType) result_pattern_FieldType_1_1_performtransformation_binding[2];
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) result_pattern_FieldType_1_1_performtransformation_binding[3];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result_pattern_FieldType_1_1_performtransformation_binding[4];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldType_1_1_performtransformation_binding[5];

			Object[] result_pattern_FieldType_1_1_performtransformation_black = pattern_FieldType_1_1_performtransformation_blackBBBBBBFBB(
					tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature,
					mSignature, _this, isApplicableMatch);
			if (result_pattern_FieldType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldType_1_1_performtransformation_black[6];

				return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
						mSignatureToTFieldSignature, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_1_1_performtransformation_greenBB(TFieldSignature tFieldSignature,
			TAbstractType tPrimitiv) {
		tFieldSignature.setType(tPrimitiv);
		return new Object[] { tFieldSignature, tPrimitiv };
	}

	public static final Object[] pattern_FieldType_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_FieldType_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject tFieldSignature, EObject ePrimitiveType, EObject tPrimitiv, EObject ePrimitiveTypeToTPrimitiv,
			EObject mSignatureToTFieldSignature, EObject mSignature) {
		if (!tFieldSignature.equals(tPrimitiv)) {
			if (!ePrimitiveType.equals(tFieldSignature)) {
				if (!ePrimitiveType.equals(tPrimitiv)) {
					if (!ePrimitiveType.equals(ePrimitiveTypeToTPrimitiv)) {
						if (!ePrimitiveType.equals(mSignatureToTFieldSignature)) {
							if (!ePrimitiveType.equals(mSignature)) {
								if (!ePrimitiveTypeToTPrimitiv.equals(tFieldSignature)) {
									if (!ePrimitiveTypeToTPrimitiv.equals(tPrimitiv)) {
										if (!ePrimitiveTypeToTPrimitiv.equals(mSignatureToTFieldSignature)) {
											if (!ePrimitiveTypeToTPrimitiv.equals(mSignature)) {
												if (!mSignatureToTFieldSignature.equals(tFieldSignature)) {
													if (!mSignatureToTFieldSignature.equals(tPrimitiv)) {
														if (!mSignature.equals(tFieldSignature)) {
															if (!mSignature.equals(tPrimitiv)) {
																if (!mSignature.equals(mSignatureToTFieldSignature)) {
																	return new Object[] { ruleresult, tFieldSignature,
																			ePrimitiveType, tPrimitiv,
																			ePrimitiveTypeToTPrimitiv,
																			mSignatureToTFieldSignature, mSignature };
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

	public static final Object[] pattern_FieldType_1_3_bookkeepingforedges_greenBBBBBFF(PerformRuleResult ruleresult,
			EObject tFieldSignature, EObject ePrimitiveType, EObject tPrimitiv, EObject mSignature) {
		EMoflonEdge tFieldSignature__tPrimitiv____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__ePrimitiveType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldType";
		String tFieldSignature__tPrimitiv____type_name_prime = "type";
		String mSignature__ePrimitiveType____type_name_prime = "type";
		tFieldSignature__tPrimitiv____type.setSrc(tFieldSignature);
		tFieldSignature__tPrimitiv____type.setTrg(tPrimitiv);
		ruleresult.getCreatedEdges().add(tFieldSignature__tPrimitiv____type);
		mSignature__ePrimitiveType____type.setSrc(mSignature);
		mSignature__ePrimitiveType____type.setTrg(ePrimitiveType);
		ruleresult.getTranslatedEdges().add(mSignature__ePrimitiveType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tFieldSignature__tPrimitiv____type.setName(tFieldSignature__tPrimitiv____type_name_prime);
		mSignature__ePrimitiveType____type.setName(mSignature__ePrimitiveType____type_name_prime);
		return new Object[] { ruleresult, tFieldSignature, ePrimitiveType, tPrimitiv, mSignature,
				tFieldSignature__tPrimitiv____type, mSignature__ePrimitiveType____type };
	}

	public static final void pattern_FieldType_1_5_registerobjects_expressionBBBBBBBB(FieldType _this,
			PerformRuleResult ruleresult, EObject tFieldSignature, EObject ePrimitiveType, EObject tPrimitiv,
			EObject ePrimitiveTypeToTPrimitiv, EObject mSignatureToTFieldSignature, EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature);

	}

	public static final PerformRuleResult pattern_FieldType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldType_2_1_preparereturnvalue_bindingFB(FieldType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_2_1_preparereturnvalue_blackFBB(EClass eClass, FieldType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldType_2_1_preparereturnvalue_bindingAndBlackFFB(FieldType _this) {
		Object[] result_pattern_FieldType_2_1_preparereturnvalue_binding = pattern_FieldType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldType_2_1_preparereturnvalue_black = pattern_FieldType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldType_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("ePrimitiveType");
		EObject _localVariable_1 = match.getObject("mSignature");
		EObject tmpEPrimitiveType = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		if (tmpEPrimitiveType instanceof Type) {
			Type ePrimitiveType = (Type) tmpEPrimitiveType;
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				return new Object[] { ePrimitiveType, mSignature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldType_2_2_corematch_blackFBFFFBB(Type ePrimitiveType,
			MFieldSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType ePrimitiveTypeToTPrimitiv : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ePrimitiveType, TypeToTAbstractType.class, "source")) {
			TAbstractType tPrimitiv = ePrimitiveTypeToTPrimitiv.getTarget();
			if (tPrimitiv != null) {
				for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
					TSignature tmpTFieldSignature = mSignatureToTFieldSignature.getTarget();
					if (tmpTFieldSignature instanceof TFieldSignature) {
						TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
						_result.add(new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv,
								ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldType_2_3_findcontext_blackBBBBBB(
			TFieldSignature tFieldSignature, Type ePrimitiveType, TAbstractType tPrimitiv,
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (ePrimitiveType.equals(ePrimitiveTypeToTPrimitiv.getSource())) {
			if (tPrimitiv.equals(ePrimitiveTypeToTPrimitiv.getTarget())) {
				if (mSignature.equals(mSignatureToTFieldSignature.getSource())) {
					if (tFieldSignature.equals(mSignatureToTFieldSignature.getTarget())) {
						if (ePrimitiveType.equals(mSignature.getType())) {
							_result.add(new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv,
									ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldType_2_3_findcontext_greenBBBBBBFFFFFF(TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ePrimitiveTypeToTPrimitiv__ePrimitiveType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ePrimitiveTypeToTPrimitiv__tPrimitiv____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignature__ePrimitiveType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ePrimitiveTypeToTPrimitiv__ePrimitiveType____source_name_prime = "source";
		String ePrimitiveTypeToTPrimitiv__tPrimitiv____target_name_prime = "target";
		String mSignatureToTFieldSignature__mSignature____source_name_prime = "source";
		String mSignatureToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String mSignature__ePrimitiveType____type_name_prime = "type";
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(tPrimitiv);
		isApplicableMatch.getAllContextElements().add(ePrimitiveTypeToTPrimitiv);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignature);
		ePrimitiveTypeToTPrimitiv__ePrimitiveType____source.setSrc(ePrimitiveTypeToTPrimitiv);
		ePrimitiveTypeToTPrimitiv__ePrimitiveType____source.setTrg(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(ePrimitiveTypeToTPrimitiv__ePrimitiveType____source);
		ePrimitiveTypeToTPrimitiv__tPrimitiv____target.setSrc(ePrimitiveTypeToTPrimitiv);
		ePrimitiveTypeToTPrimitiv__tPrimitiv____target.setTrg(tPrimitiv);
		isApplicableMatch.getAllContextElements().add(ePrimitiveTypeToTPrimitiv__tPrimitiv____target);
		mSignatureToTFieldSignature__mSignature____source.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__mSignature____source);
		mSignatureToTFieldSignature__tFieldSignature____target.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__tFieldSignature____target.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__tFieldSignature____target);
		mSignature__ePrimitiveType____type.setSrc(mSignature);
		mSignature__ePrimitiveType____type.setTrg(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(mSignature__ePrimitiveType____type);
		ePrimitiveTypeToTPrimitiv__ePrimitiveType____source
				.setName(ePrimitiveTypeToTPrimitiv__ePrimitiveType____source_name_prime);
		ePrimitiveTypeToTPrimitiv__tPrimitiv____target
				.setName(ePrimitiveTypeToTPrimitiv__tPrimitiv____target_name_prime);
		mSignatureToTFieldSignature__mSignature____source
				.setName(mSignatureToTFieldSignature__mSignature____source_name_prime);
		mSignatureToTFieldSignature__tFieldSignature____target
				.setName(mSignatureToTFieldSignature__tFieldSignature____target_name_prime);
		mSignature__ePrimitiveType____type.setName(mSignature__ePrimitiveType____type_name_prime);
		return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature, isApplicableMatch,
				ePrimitiveTypeToTPrimitiv__ePrimitiveType____source, ePrimitiveTypeToTPrimitiv__tPrimitiv____target,
				mSignatureToTFieldSignature__mSignature____source,
				mSignatureToTFieldSignature__tFieldSignature____target, mSignature__ePrimitiveType____type };
	}

	public static final Object[] pattern_FieldType_2_4_solveCSP_bindingFBBBBBBBB(FieldType _this,
			IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType,
			TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tFieldSignature, ePrimitiveType,
				tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv,
					ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(FieldType _this,
			IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType,
			TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {
		Object[] result_pattern_FieldType_2_4_solveCSP_binding = pattern_FieldType_2_4_solveCSP_bindingFBBBBBBBB(_this,
				isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature);
		if (result_pattern_FieldType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldType_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldType_2_4_solveCSP_black = pattern_FieldType_2_4_solveCSP_blackB(csp);
			if (result_pattern_FieldType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv,
						ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldType_2_5_checkCSP_expressionFBB(FieldType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldType_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldType_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldType_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldType_10_1_initialbindings_blackBBBB(FieldType _this, Match match,
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		return new Object[] { _this, match, tFieldSignature, tPrimitiv };
	}

	public static final Object[] pattern_FieldType_10_2_SolveCSP_bindingFBBBB(FieldType _this, Match match,
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tFieldSignature, tPrimitiv);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tFieldSignature, tPrimitiv };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldType_10_2_SolveCSP_bindingAndBlackFBBBB(FieldType _this, Match match,
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		Object[] result_pattern_FieldType_10_2_SolveCSP_binding = pattern_FieldType_10_2_SolveCSP_bindingFBBBB(_this,
				match, tFieldSignature, tPrimitiv);
		if (result_pattern_FieldType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldType_10_2_SolveCSP_black = pattern_FieldType_10_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tFieldSignature, tPrimitiv };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldType_10_3_CheckCSP_expressionFBB(FieldType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldType_10_4_collectelementstobetranslated_blackBBB(Match match,
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		return new Object[] { match, tFieldSignature, tPrimitiv };
	}

	public static final Object[] pattern_FieldType_10_4_collectelementstobetranslated_greenBBBF(Match match,
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		EMoflonEdge tFieldSignature__tPrimitiv____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tFieldSignature__tPrimitiv____type_name_prime = "type";
		tFieldSignature__tPrimitiv____type.setSrc(tFieldSignature);
		tFieldSignature__tPrimitiv____type.setTrg(tPrimitiv);
		match.getToBeTranslatedEdges().add(tFieldSignature__tPrimitiv____type);
		tFieldSignature__tPrimitiv____type.setName(tFieldSignature__tPrimitiv____type_name_prime);
		return new Object[] { match, tFieldSignature, tPrimitiv, tFieldSignature__tPrimitiv____type };
	}

	public static final Object[] pattern_FieldType_10_5_collectcontextelements_blackBBB(Match match,
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		return new Object[] { match, tFieldSignature, tPrimitiv };
	}

	public static final Object[] pattern_FieldType_10_5_collectcontextelements_greenBBB(Match match,
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		match.getContextNodes().add(tFieldSignature);
		match.getContextNodes().add(tPrimitiv);
		return new Object[] { match, tFieldSignature, tPrimitiv };
	}

	public static final void pattern_FieldType_10_6_registerobjectstomatch_expressionBBBB(FieldType _this, Match match,
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		_this.registerObjectsToMatch_BWD(match, tFieldSignature, tPrimitiv);

	}

	public static final boolean pattern_FieldType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldType_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldType_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tFieldSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("ePrimitiveType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPrimitiv");
		EObject _localVariable_3 = isApplicableMatch.getObject("ePrimitiveTypeToTPrimitiv");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignatureToTFieldSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSignature");
		EObject tmpTFieldSignature = _localVariable_0;
		EObject tmpEPrimitiveType = _localVariable_1;
		EObject tmpTPrimitiv = _localVariable_2;
		EObject tmpEPrimitiveTypeToTPrimitiv = _localVariable_3;
		EObject tmpMSignatureToTFieldSignature = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			if (tmpEPrimitiveType instanceof Type) {
				Type ePrimitiveType = (Type) tmpEPrimitiveType;
				if (tmpTPrimitiv instanceof TAbstractType) {
					TAbstractType tPrimitiv = (TAbstractType) tmpTPrimitiv;
					if (tmpEPrimitiveTypeToTPrimitiv instanceof TypeToTAbstractType) {
						TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) tmpEPrimitiveTypeToTPrimitiv;
						if (tmpMSignatureToTFieldSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) tmpMSignatureToTFieldSignature;
							if (tmpMSignature instanceof MFieldSignature) {
								MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
								return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv,
										ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_11_1_performtransformation_blackBBBBBBFBB(
			TFieldSignature tFieldSignature, Type ePrimitiveType, TAbstractType tPrimitiv,
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldSignature mSignature, FieldType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
						mSignatureToTFieldSignature, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(FieldType _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldType_11_1_performtransformation_binding = pattern_FieldType_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldType_11_1_performtransformation_binding != null) {
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldType_11_1_performtransformation_binding[0];
			Type ePrimitiveType = (Type) result_pattern_FieldType_11_1_performtransformation_binding[1];
			TAbstractType tPrimitiv = (TAbstractType) result_pattern_FieldType_11_1_performtransformation_binding[2];
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) result_pattern_FieldType_11_1_performtransformation_binding[3];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result_pattern_FieldType_11_1_performtransformation_binding[4];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldType_11_1_performtransformation_binding[5];

			Object[] result_pattern_FieldType_11_1_performtransformation_black = pattern_FieldType_11_1_performtransformation_blackBBBBBBFBB(
					tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature,
					mSignature, _this, isApplicableMatch);
			if (result_pattern_FieldType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldType_11_1_performtransformation_black[6];

				return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
						mSignatureToTFieldSignature, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_11_1_performtransformation_greenBB(Type ePrimitiveType,
			MFieldSignature mSignature) {
		mSignature.setType(ePrimitiveType);
		return new Object[] { ePrimitiveType, mSignature };
	}

	public static final Object[] pattern_FieldType_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_FieldType_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject tFieldSignature, EObject ePrimitiveType, EObject tPrimitiv, EObject ePrimitiveTypeToTPrimitiv,
			EObject mSignatureToTFieldSignature, EObject mSignature) {
		if (!tFieldSignature.equals(tPrimitiv)) {
			if (!ePrimitiveType.equals(tFieldSignature)) {
				if (!ePrimitiveType.equals(tPrimitiv)) {
					if (!ePrimitiveType.equals(ePrimitiveTypeToTPrimitiv)) {
						if (!ePrimitiveType.equals(mSignatureToTFieldSignature)) {
							if (!ePrimitiveType.equals(mSignature)) {
								if (!ePrimitiveTypeToTPrimitiv.equals(tFieldSignature)) {
									if (!ePrimitiveTypeToTPrimitiv.equals(tPrimitiv)) {
										if (!ePrimitiveTypeToTPrimitiv.equals(mSignatureToTFieldSignature)) {
											if (!ePrimitiveTypeToTPrimitiv.equals(mSignature)) {
												if (!mSignatureToTFieldSignature.equals(tFieldSignature)) {
													if (!mSignatureToTFieldSignature.equals(tPrimitiv)) {
														if (!mSignature.equals(tFieldSignature)) {
															if (!mSignature.equals(tPrimitiv)) {
																if (!mSignature.equals(mSignatureToTFieldSignature)) {
																	return new Object[] { ruleresult, tFieldSignature,
																			ePrimitiveType, tPrimitiv,
																			ePrimitiveTypeToTPrimitiv,
																			mSignatureToTFieldSignature, mSignature };
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

	public static final Object[] pattern_FieldType_11_3_bookkeepingforedges_greenBBBBBFF(PerformRuleResult ruleresult,
			EObject tFieldSignature, EObject ePrimitiveType, EObject tPrimitiv, EObject mSignature) {
		EMoflonEdge tFieldSignature__tPrimitiv____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__ePrimitiveType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldType";
		String tFieldSignature__tPrimitiv____type_name_prime = "type";
		String mSignature__ePrimitiveType____type_name_prime = "type";
		tFieldSignature__tPrimitiv____type.setSrc(tFieldSignature);
		tFieldSignature__tPrimitiv____type.setTrg(tPrimitiv);
		ruleresult.getTranslatedEdges().add(tFieldSignature__tPrimitiv____type);
		mSignature__ePrimitiveType____type.setSrc(mSignature);
		mSignature__ePrimitiveType____type.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(mSignature__ePrimitiveType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tFieldSignature__tPrimitiv____type.setName(tFieldSignature__tPrimitiv____type_name_prime);
		mSignature__ePrimitiveType____type.setName(mSignature__ePrimitiveType____type_name_prime);
		return new Object[] { ruleresult, tFieldSignature, ePrimitiveType, tPrimitiv, mSignature,
				tFieldSignature__tPrimitiv____type, mSignature__ePrimitiveType____type };
	}

	public static final void pattern_FieldType_11_5_registerobjects_expressionBBBBBBBB(FieldType _this,
			PerformRuleResult ruleresult, EObject tFieldSignature, EObject ePrimitiveType, EObject tPrimitiv,
			EObject ePrimitiveTypeToTPrimitiv, EObject mSignatureToTFieldSignature, EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature);

	}

	public static final PerformRuleResult pattern_FieldType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldType_12_1_preparereturnvalue_bindingFB(FieldType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_12_1_preparereturnvalue_blackFBB(EClass eClass, FieldType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldType_12_1_preparereturnvalue_bindingAndBlackFFB(FieldType _this) {
		Object[] result_pattern_FieldType_12_1_preparereturnvalue_binding = pattern_FieldType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldType_12_1_preparereturnvalue_black = pattern_FieldType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldType_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tFieldSignature");
		EObject _localVariable_1 = match.getObject("tPrimitiv");
		EObject tmpTFieldSignature = _localVariable_0;
		EObject tmpTPrimitiv = _localVariable_1;
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			if (tmpTPrimitiv instanceof TAbstractType) {
				TAbstractType tPrimitiv = (TAbstractType) tmpTPrimitiv;
				return new Object[] { tFieldSignature, tPrimitiv, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldType_12_2_corematch_blackBFBFFFB(
			TFieldSignature tFieldSignature, TAbstractType tPrimitiv, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType ePrimitiveTypeToTPrimitiv : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiv, TypeToTAbstractType.class, "target")) {
			Type ePrimitiveType = ePrimitiveTypeToTPrimitiv.getSource();
			if (ePrimitiveType != null) {
				for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tFieldSignature, MSignatureToTSignature.class, "target")) {
					MSignature tmpMSignature = mSignatureToTFieldSignature.getSource();
					if (tmpMSignature instanceof MFieldSignature) {
						MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
						_result.add(new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv,
								ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldType_12_3_findcontext_blackBBBBBB(
			TFieldSignature tFieldSignature, Type ePrimitiveType, TAbstractType tPrimitiv,
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tPrimitiv.equals(tFieldSignature.getType())) {
			if (ePrimitiveType.equals(ePrimitiveTypeToTPrimitiv.getSource())) {
				if (tPrimitiv.equals(ePrimitiveTypeToTPrimitiv.getTarget())) {
					if (mSignature.equals(mSignatureToTFieldSignature.getSource())) {
						if (tFieldSignature.equals(mSignatureToTFieldSignature.getTarget())) {
							_result.add(new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv,
									ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldType_12_3_findcontext_greenBBBBBBFFFFFF(TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tFieldSignature__tPrimitiv____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ePrimitiveTypeToTPrimitiv__ePrimitiveType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ePrimitiveTypeToTPrimitiv__tPrimitiv____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tFieldSignature__tPrimitiv____type_name_prime = "type";
		String ePrimitiveTypeToTPrimitiv__ePrimitiveType____source_name_prime = "source";
		String ePrimitiveTypeToTPrimitiv__tPrimitiv____target_name_prime = "target";
		String mSignatureToTFieldSignature__mSignature____source_name_prime = "source";
		String mSignatureToTFieldSignature__tFieldSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(tPrimitiv);
		isApplicableMatch.getAllContextElements().add(ePrimitiveTypeToTPrimitiv);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignature);
		tFieldSignature__tPrimitiv____type.setSrc(tFieldSignature);
		tFieldSignature__tPrimitiv____type.setTrg(tPrimitiv);
		isApplicableMatch.getAllContextElements().add(tFieldSignature__tPrimitiv____type);
		ePrimitiveTypeToTPrimitiv__ePrimitiveType____source.setSrc(ePrimitiveTypeToTPrimitiv);
		ePrimitiveTypeToTPrimitiv__ePrimitiveType____source.setTrg(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(ePrimitiveTypeToTPrimitiv__ePrimitiveType____source);
		ePrimitiveTypeToTPrimitiv__tPrimitiv____target.setSrc(ePrimitiveTypeToTPrimitiv);
		ePrimitiveTypeToTPrimitiv__tPrimitiv____target.setTrg(tPrimitiv);
		isApplicableMatch.getAllContextElements().add(ePrimitiveTypeToTPrimitiv__tPrimitiv____target);
		mSignatureToTFieldSignature__mSignature____source.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__mSignature____source);
		mSignatureToTFieldSignature__tFieldSignature____target.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__tFieldSignature____target.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__tFieldSignature____target);
		tFieldSignature__tPrimitiv____type.setName(tFieldSignature__tPrimitiv____type_name_prime);
		ePrimitiveTypeToTPrimitiv__ePrimitiveType____source
				.setName(ePrimitiveTypeToTPrimitiv__ePrimitiveType____source_name_prime);
		ePrimitiveTypeToTPrimitiv__tPrimitiv____target
				.setName(ePrimitiveTypeToTPrimitiv__tPrimitiv____target_name_prime);
		mSignatureToTFieldSignature__mSignature____source
				.setName(mSignatureToTFieldSignature__mSignature____source_name_prime);
		mSignatureToTFieldSignature__tFieldSignature____target
				.setName(mSignatureToTFieldSignature__tFieldSignature____target_name_prime);
		return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature, isApplicableMatch, tFieldSignature__tPrimitiv____type,
				ePrimitiveTypeToTPrimitiv__ePrimitiveType____source, ePrimitiveTypeToTPrimitiv__tPrimitiv____target,
				mSignatureToTFieldSignature__mSignature____source,
				mSignatureToTFieldSignature__tFieldSignature____target };
	}

	public static final Object[] pattern_FieldType_12_4_solveCSP_bindingFBBBBBBBB(FieldType _this,
			IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType,
			TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tFieldSignature, ePrimitiveType,
				tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv,
					ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(FieldType _this,
			IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType,
			TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {
		Object[] result_pattern_FieldType_12_4_solveCSP_binding = pattern_FieldType_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature);
		if (result_pattern_FieldType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldType_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldType_12_4_solveCSP_black = pattern_FieldType_12_4_solveCSP_blackB(csp);
			if (result_pattern_FieldType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv,
						ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldType_12_5_checkCSP_expressionFBB(FieldType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldType_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldType_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldType_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldType_20_1_preparereturnvalue_bindingFB(FieldType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_20_1_preparereturnvalue_blackFBBF(EClass __eClass, FieldType _this) {
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

	public static final Object[] pattern_FieldType_20_1_preparereturnvalue_bindingAndBlackFFBF(FieldType _this) {
		Object[] result_pattern_FieldType_20_1_preparereturnvalue_binding = pattern_FieldType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldType_20_1_preparereturnvalue_black = pattern_FieldType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldType_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_type.getSrc();
		if (tmpMSignature instanceof MFieldSignature) {
			MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
			EObject tmpEPrimitiveType = _edge_type.getTrg();
			if (tmpEPrimitiveType instanceof Type) {
				Type ePrimitiveType = (Type) tmpEPrimitiveType;
				if (ePrimitiveType.equals(mSignature.getType())) {
					_result.add(new Object[] { ePrimitiveType, mSignature, _edge_type });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldType _this, Match match, Type ePrimitiveType, MFieldSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ePrimitiveType, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldType_21_1_preparereturnvalue_bindingFB(FieldType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_21_1_preparereturnvalue_blackFBBF(EClass __eClass, FieldType _this) {
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

	public static final Object[] pattern_FieldType_21_1_preparereturnvalue_bindingAndBlackFFBF(FieldType _this) {
		Object[] result_pattern_FieldType_21_1_preparereturnvalue_binding = pattern_FieldType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldType_21_1_preparereturnvalue_black = pattern_FieldType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldType_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTFieldSignature = _edge_type.getSrc();
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			EObject tmpTPrimitiv = _edge_type.getTrg();
			if (tmpTPrimitiv instanceof TAbstractType) {
				TAbstractType tPrimitiv = (TAbstractType) tmpTPrimitiv;
				if (tPrimitiv.equals(tFieldSignature.getType())) {
					_result.add(new Object[] { tFieldSignature, tPrimitiv, _edge_type });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldType _this, Match match, TFieldSignature tFieldSignature, TAbstractType tPrimitiv) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tFieldSignature, tPrimitiv);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldType_24_1_prepare_blackB(FieldType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldType_24_2_matchcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tFieldSignature");
		EObject _localVariable_1 = sourceMatch.getObject("ePrimitiveType");
		EObject _localVariable_2 = targetMatch.getObject("tPrimitiv");
		EObject _localVariable_3 = sourceMatch.getObject("mSignature");
		EObject tmpTFieldSignature = _localVariable_0;
		EObject tmpEPrimitiveType = _localVariable_1;
		EObject tmpTPrimitiv = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			if (tmpEPrimitiveType instanceof Type) {
				Type ePrimitiveType = (Type) tmpEPrimitiveType;
				if (tmpTPrimitiv instanceof TAbstractType) {
					TAbstractType tPrimitiv = (TAbstractType) tmpTPrimitiv;
					if (tmpMSignature instanceof MFieldSignature) {
						MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
						return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, mSignature, targetMatch,
								sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldType_24_2_matchcontext_blackBBBFFBBB(
			TFieldSignature tFieldSignature, Type ePrimitiveType, TAbstractType tPrimitiv, MFieldSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tPrimitiv.equals(tFieldSignature.getType())) {
				if (ePrimitiveType.equals(mSignature.getType())) {
					for (TypeToTAbstractType ePrimitiveTypeToTPrimitiv : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ePrimitiveType, TypeToTAbstractType.class, "source")) {
						if (tPrimitiv.equals(ePrimitiveTypeToTPrimitiv.getTarget())) {
							for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
								if (tFieldSignature.equals(mSignatureToTFieldSignature.getTarget())) {
									_result.add(new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv,
											ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature,
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

	public static final Object[] pattern_FieldType_24_2_matchcontext_greenBBBBBBBFB(TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature, Match sourceMatch,
			Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "FieldType";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(tPrimitiv);
		isApplicableMatch.getAllContextElements().add(ePrimitiveTypeToTPrimitiv);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_FieldType_24_3_checkcsp_bindingFBBBBBBBBBB(FieldType _this,
			CCMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType, TAbstractType tPrimitiv,
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldSignature mSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, tFieldSignature, ePrimitiveType,
				tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv,
					ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(FieldType _this,
			CCMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType, TAbstractType tPrimitiv,
			TypeToTAbstractType ePrimitiveTypeToTPrimitiv, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldSignature mSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldType_24_3_checkcsp_binding = pattern_FieldType_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature, sourceMatch, targetMatch);
		if (result_pattern_FieldType_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldType_24_3_checkcsp_binding[0];

			Object[] result_pattern_FieldType_24_3_checkcsp_black = pattern_FieldType_24_3_checkcsp_blackB(csp);
			if (result_pattern_FieldType_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv,
						ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldType_24_4_createcorrespondence_blackBBBBB(TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, MFieldSignature mSignature, CCMatch isApplicableMatch) {
		return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, mSignature, isApplicableMatch };
	}

	public static final Object[] pattern_FieldType_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_FieldType_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldType_24_6_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldType_27_1_matchtggpattern_blackBB(Type ePrimitiveType,
			MFieldSignature mSignature) {
		if (ePrimitiveType.equals(mSignature.getType())) {
			return new Object[] { ePrimitiveType, mSignature };
		}
		return null;
	}

	public static final boolean pattern_FieldType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldType_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldType_28_1_matchtggpattern_blackBB(TFieldSignature tFieldSignature,
			TAbstractType tPrimitiv) {
		if (tPrimitiv.equals(tFieldSignature.getType())) {
			return new Object[] { tFieldSignature, tPrimitiv };
		}
		return null;
	}

	public static final boolean pattern_FieldType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldType_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldType_29_1_createresult_blackB(FieldType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TFieldSignature tFieldSignature) {
		if (ruleResult.getTargetObjects().contains(tFieldSignature)) {
			return new Object[] { ruleResult, tFieldSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTFieldSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTFieldSignature)) {
			return new Object[] { ruleResult, mSignatureToTFieldSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MFieldSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Type ePrimitiveType) {
		if (ruleResult.getSourceObjects().contains(ePrimitiveType)) {
			return new Object[] { ruleResult, ePrimitiveType };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType ePrimitiveTypeToTPrimitiv) {
		if (ruleResult.getCorrObjects().contains(ePrimitiveTypeToTPrimitiv)) {
			return new Object[] { ruleResult, ePrimitiveTypeToTPrimitiv };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tPrimitiv) {
		if (ruleResult.getTargetObjects().contains(tPrimitiv)) {
			return new Object[] { ruleResult, tPrimitiv };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldType_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSignatureToTFieldSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList ePrimitiveTypeToTPrimitivList : ruleEntryContainer.getRuleEntryList()) {
				if (!ePrimitiveTypeToTPrimitivList.equals(mSignatureToTFieldSignatureList)) {
					for (EObject tmpMSignatureToTFieldSignature : mSignatureToTFieldSignatureList.getEntryObjects()) {
						if (tmpMSignatureToTFieldSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) tmpMSignatureToTFieldSignature;
							TSignature tmpTFieldSignature = mSignatureToTFieldSignature.getTarget();
							if (tmpTFieldSignature instanceof TFieldSignature) {
								TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
								MSignature tmpMSignature = mSignatureToTFieldSignature.getSource();
								if (tmpMSignature instanceof MFieldSignature) {
									MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
									if (pattern_FieldType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mSignatureToTFieldSignature) == null) {
										if (pattern_FieldType_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												tFieldSignature) == null) {
											if (pattern_FieldType_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													mSignature) == null) {
												for (EObject tmpEPrimitiveTypeToTPrimitiv : ePrimitiveTypeToTPrimitivList
														.getEntryObjects()) {
													if (tmpEPrimitiveTypeToTPrimitiv instanceof TypeToTAbstractType) {
														TypeToTAbstractType ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) tmpEPrimitiveTypeToTPrimitiv;
														Type ePrimitiveType = ePrimitiveTypeToTPrimitiv.getSource();
														if (ePrimitiveType != null) {
															TAbstractType tPrimitiv = ePrimitiveTypeToTPrimitiv
																	.getTarget();
															if (tPrimitiv != null) {
																if (pattern_FieldType_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult,
																		ePrimitiveTypeToTPrimitiv) == null) {
																	if (pattern_FieldType_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, ePrimitiveType) == null) {
																		if (pattern_FieldType_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, tPrimitiv) == null) {
																			_result.add(new Object[] {
																					mSignatureToTFieldSignatureList,
																					tFieldSignature,
																					mSignatureToTFieldSignature,
																					mSignature,
																					ePrimitiveTypeToTPrimitivList,
																					ePrimitiveType,
																					ePrimitiveTypeToTPrimitiv,
																					tPrimitiv, ruleEntryContainer,
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

	public static final Object[] pattern_FieldType_29_3_solveCSP_bindingFBBBBBBBBB(FieldType _this,
			IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType,
			TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tFieldSignature, ePrimitiveType,
				tPrimitiv, ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv,
					ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(FieldType _this,
			IsApplicableMatch isApplicableMatch, TFieldSignature tFieldSignature, Type ePrimitiveType,
			TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldType_29_3_solveCSP_binding = pattern_FieldType_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature, ruleResult);
		if (result_pattern_FieldType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldType_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldType_29_3_solveCSP_black = pattern_FieldType_29_3_solveCSP_blackB(csp);
			if (result_pattern_FieldType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tFieldSignature, ePrimitiveType, tPrimitiv,
						ePrimitiveTypeToTPrimitiv, mSignatureToTFieldSignature, mSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldType_29_4_checkCSP_expressionFBB(FieldType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldType_29_5_checknacs_blackBBBBBB(TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature) {
		return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature };
	}

	public static final Object[] pattern_FieldType_29_6_perform_blackBBBBBBB(TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, TypeToTAbstractType ePrimitiveTypeToTPrimitiv,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, ePrimitiveTypeToTPrimitiv,
				mSignatureToTFieldSignature, mSignature, ruleResult };
	}

	public static final Object[] pattern_FieldType_29_6_perform_greenBBBBB(TFieldSignature tFieldSignature,
			Type ePrimitiveType, TAbstractType tPrimitiv, MFieldSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		tFieldSignature.setType(tPrimitiv);
		mSignature.setType(ePrimitiveType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tFieldSignature, ePrimitiveType, tPrimitiv, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FieldType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldTypeImpl
