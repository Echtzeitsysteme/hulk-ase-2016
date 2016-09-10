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

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MName;

import org.gravity.tgg.modisco.MFieldNameToTField;
import org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature;
import org.gravity.tgg.modisco.MSignatureToTSignature;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.FieldSignature;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldSignature;

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
 * An implementation of the model object '<em><b>Field Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldSignatureImpl extends AbstractRuleImpl implements FieldSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFieldName mFieldName, MFieldSignature mSignature) {
		// initial bindings
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_0_1_initialbindings_blackBBBB(this, match,
				mFieldName, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", "
					+ "[mSignature] = " + mSignature + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mFieldName, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldSignatureImpl.pattern_FieldSignature_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldSignatureImpl
					.pattern_FieldSignature_0_4_collectelementstobetranslated_blackBBB(match, mFieldName, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", "
						+ "[mSignature] = " + mSignature + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_0_4_collectelementstobetranslated_greenBBBFFF(match, mFieldName,
					mSignature);
			// EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result4_green[3];
			// EMoflonEdge mSignature__mFieldName____mFieldName = (EMoflonEdge) result4_green[4];
			// EMoflonEdge mFieldName__mSignature____mFieldSignatures = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = FieldSignatureImpl
					.pattern_FieldSignature_0_5_collectcontextelements_blackBBB(match, mFieldName, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", "
						+ "[mSignature] = " + mSignature + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_0_5_collectcontextelements_greenBB(match, mFieldName);

			// register objects to match
			FieldSignatureImpl.pattern_FieldSignature_0_6_registerobjectstomatch_expressionBBBB(this, match, mFieldName,
					mSignature);
			return FieldSignatureImpl.pattern_FieldSignature_0_7_expressionF();
		} else {
			return FieldSignatureImpl.pattern_FieldSignature_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[0];
		TField tField = (TField) result1_bindingAndBlack[1];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_bindingAndBlack[2];
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_1_1_performtransformation_greenFBBFFB(tField,
				mSignature, csp);
		MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = (MFieldSignatureToTFieldSignature) result1_green[0];
		TFieldSignature tSignature = (TFieldSignature) result1_green[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[4];

		// collect translated elements
		Object[] result2_black = FieldSignatureImpl.pattern_FieldSignature_1_2_collecttranslatedelements_blackBBBB(
				mFieldSignatureToTFieldSignature, mSignature, tSignature, mSignatureToTSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mFieldSignatureToTFieldSignature] = " + mFieldSignatureToTFieldSignature + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ".");
		}
		Object[] result2_green = FieldSignatureImpl.pattern_FieldSignature_1_2_collecttranslatedelements_greenFBBBB(
				mFieldSignatureToTFieldSignature, mSignature, tSignature, mSignatureToTSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldSignatureImpl.pattern_FieldSignature_1_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, mFieldSignatureToTFieldSignature, mFieldName, tField, eFieldDeclarationToTField, mSignature,
				tSignature, mSignatureToTSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mFieldSignatureToTFieldSignature] = "
					+ mFieldSignatureToTFieldSignature + ", " + "[mFieldName] = " + mFieldName + ", " + "[tField] = "
					+ tField + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ".");
		}
		FieldSignatureImpl.pattern_FieldSignature_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFFF(ruleresult,
				mFieldSignatureToTFieldSignature, mFieldName, tField, mSignature, tSignature, mSignatureToTSignature);
		// EMoflonEdge mFieldSignatureToTFieldSignature__mSignature____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mFieldSignatureToTFieldSignature__tSignature____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mSignature__mFieldName____mFieldName = (EMoflonEdge) result3_green[10];
		// EMoflonEdge mFieldName__mSignature____mFieldSignatures = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[13];
		// EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		FieldSignatureImpl.pattern_FieldSignature_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				mFieldSignatureToTFieldSignature, mFieldName, tField, eFieldDeclarationToTField, mSignature, tSignature,
				mSignatureToTSignature);
		return FieldSignatureImpl.pattern_FieldSignature_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldSignatureImpl
				.pattern_FieldSignature_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldSignatureImpl.pattern_FieldSignature_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFieldName mFieldName = (MFieldName) result2_binding[0];
		MFieldSignature mSignature = (MFieldSignature) result2_binding[1];
		for (Object[] result2_black : FieldSignatureImpl.pattern_FieldSignature_2_2_corematch_blackBFFBB(mFieldName,
				mSignature, match)) {
			TField tField = (TField) result2_black[1];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : FieldSignatureImpl.pattern_FieldSignature_2_3_findcontext_blackBBBB(
					mFieldName, tField, eFieldDeclarationToTField, mSignature)) {
				Object[] result3_green = FieldSignatureImpl.pattern_FieldSignature_2_3_findcontext_greenBBBBFFFFFF(
						mFieldName, tField, eFieldDeclarationToTField, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[5];
				// EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mSignature__mFieldName____mFieldName = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mFieldName__mSignature____mFieldSignatures = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldSignatureImpl
						.pattern_FieldSignature_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mFieldName,
								tField, eFieldDeclarationToTField, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mFieldName] = " + mFieldName + ", " + "[tField] = " + tField + ", "
							+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[mSignature] = "
							+ mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldSignatureImpl.pattern_FieldSignature_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldSignatureImpl
							.pattern_FieldSignature_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFieldName mFieldName, MFieldSignature mSignature) {
		match.registerObject("mFieldName", mFieldName);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldName mFieldName, MFieldSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.ID", csp);
		var_tSignature_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tSignature_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mFieldSignatureToTFieldSignature,
			EObject mFieldName, EObject tField, EObject eFieldDeclarationToTField, EObject mSignature,
			EObject tSignature, EObject mSignatureToTSignature) {
		ruleresult.registerObject("mFieldSignatureToTFieldSignature", mFieldSignatureToTFieldSignature);
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mSignature").eClass())
				.equals("modisco.MFieldSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TField tField, TFieldSignature tSignature) {
		// initial bindings
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_10_1_initialbindings_blackBBBB(this, match,
				tField, tSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tField] = " + tField + ", "
					+ "[tSignature] = " + tSignature + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tField, tSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tField] = " + tField + ", " + "[tSignature] = "
					+ tSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldSignatureImpl.pattern_FieldSignature_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldSignatureImpl
					.pattern_FieldSignature_10_4_collectelementstobetranslated_blackBBB(match, tField, tSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tField] = " + tField + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_10_4_collectelementstobetranslated_greenBBBFF(match, tField,
					tSignature);
			// EMoflonEdge tSignature__tField____field = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = FieldSignatureImpl
					.pattern_FieldSignature_10_5_collectcontextelements_blackBBB(match, tField, tSignature);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[tField] = " + tField + ", " + "[tSignature] = " + tSignature + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_10_5_collectcontextelements_greenBB(match, tField);

			// register objects to match
			FieldSignatureImpl.pattern_FieldSignature_10_6_registerobjectstomatch_expressionBBBB(this, match, tField,
					tSignature);
			return FieldSignatureImpl.pattern_FieldSignature_10_7_expressionF();
		} else {
			return FieldSignatureImpl.pattern_FieldSignature_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[0];
		TField tField = (TField) result1_bindingAndBlack[1];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_bindingAndBlack[2];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldSignatureImpl
				.pattern_FieldSignature_11_1_performtransformation_greenFBFBF(mFieldName, tSignature);
		MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = (MFieldSignatureToTFieldSignature) result1_green[0];
		MFieldSignature mSignature = (MFieldSignature) result1_green[2];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[4];

		// collect translated elements
		Object[] result2_black = FieldSignatureImpl.pattern_FieldSignature_11_2_collecttranslatedelements_blackBBBB(
				mFieldSignatureToTFieldSignature, mSignature, tSignature, mSignatureToTSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mFieldSignatureToTFieldSignature] = " + mFieldSignatureToTFieldSignature + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ".");
		}
		Object[] result2_green = FieldSignatureImpl.pattern_FieldSignature_11_2_collecttranslatedelements_greenFBBBB(
				mFieldSignatureToTFieldSignature, mSignature, tSignature, mSignatureToTSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldSignatureImpl.pattern_FieldSignature_11_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, mFieldSignatureToTFieldSignature, mFieldName, tField, eFieldDeclarationToTField, mSignature,
				tSignature, mSignatureToTSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mFieldSignatureToTFieldSignature] = "
					+ mFieldSignatureToTFieldSignature + ", " + "[mFieldName] = " + mFieldName + ", " + "[tField] = "
					+ tField + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ".");
		}
		FieldSignatureImpl.pattern_FieldSignature_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFFF(ruleresult,
				mFieldSignatureToTFieldSignature, mFieldName, tField, mSignature, tSignature, mSignatureToTSignature);
		// EMoflonEdge mFieldSignatureToTFieldSignature__mSignature____source = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mFieldSignatureToTFieldSignature__tSignature____target = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mSignature__mFieldName____mFieldName = (EMoflonEdge) result3_green[10];
		// EMoflonEdge mFieldName__mSignature____mFieldSignatures = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[13];
		// EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		FieldSignatureImpl.pattern_FieldSignature_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				mFieldSignatureToTFieldSignature, mFieldName, tField, eFieldDeclarationToTField, mSignature, tSignature,
				mSignatureToTSignature);
		return FieldSignatureImpl.pattern_FieldSignature_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldSignatureImpl
				.pattern_FieldSignature_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldSignatureImpl.pattern_FieldSignature_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TField tField = (TField) result2_binding[0];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[1];
		for (Object[] result2_black : FieldSignatureImpl.pattern_FieldSignature_12_2_corematch_blackFBFBB(tField,
				tSignature, match)) {
			MFieldName mFieldName = (MFieldName) result2_black[0];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : FieldSignatureImpl.pattern_FieldSignature_12_3_findcontext_blackBBBB(
					mFieldName, tField, eFieldDeclarationToTField, tSignature)) {
				Object[] result3_green = FieldSignatureImpl.pattern_FieldSignature_12_3_findcontext_greenBBBBFFFFF(
						mFieldName, tField, eFieldDeclarationToTField, tSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[5];
				// EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[7];
				// EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[8];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldSignatureImpl
						.pattern_FieldSignature_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mFieldName, tField, eFieldDeclarationToTField, tSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mFieldName] = " + mFieldName + ", " + "[tField] = " + tField + ", "
							+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[tSignature] = "
							+ tSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldSignatureImpl.pattern_FieldSignature_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldSignatureImpl
							.pattern_FieldSignature_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TField tField, TFieldSignature tSignature) {
		match.registerObject("tField", tField);
		match.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TField tField, TFieldSignature tSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.ID", true, csp);
		var_tSignature_ID.setValue(tSignature.getID());
		var_tSignature_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tSignature_ID);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, TFieldSignature tSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		isApplicableMatch.registerObject("tSignature", tSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mFieldSignatureToTFieldSignature,
			EObject mFieldName, EObject tField, EObject eFieldDeclarationToTField, EObject mSignature,
			EObject tSignature, EObject mSignatureToTSignature) {
		ruleresult.registerObject("mFieldSignatureToTFieldSignature", mFieldSignatureToTFieldSignature);
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
				.equals("basic.TFieldSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_8(EMoflonEdge _edge_mSignatures) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldSignatureImpl
				.pattern_FieldSignature_20_2_testcorematchandDECs_blackFFB(_edge_mSignatures)) {
			MFieldName mFieldName = (MFieldName) result2_black[0];
			MFieldSignature mSignature = (MFieldSignature) result2_black[1];
			Object[] result2_green = FieldSignatureImpl
					.pattern_FieldSignature_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldSignatureImpl
					.pattern_FieldSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							mFieldName, mSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldSignatureImpl
						.pattern_FieldSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldSignatureImpl
							.pattern_FieldSignature_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_6(EMoflonEdge _edge_field) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldSignatureImpl
				.pattern_FieldSignature_21_2_testcorematchandDECs_blackFFB(_edge_field)) {
			TField tField = (TField) result2_black[0];
			TFieldSignature tSignature = (TFieldSignature) result2_black[1];
			Object[] result2_green = FieldSignatureImpl
					.pattern_FieldSignature_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldSignatureImpl
					.pattern_FieldSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							tField, tSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldSignatureImpl
						.pattern_FieldSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldSignatureImpl
							.pattern_FieldSignature_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldSignature");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_ID.setValue(__helper.getValue("tSignature", "ID"));
		var_tSignature_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		createID0.setRuleName("FieldSignature");
		createID0.solve(var_tSignature_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tSignature_ID.setBound(false);
			createID0.solve(var_tSignature_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tSignature", "ID", var_tSignature_ID.getValue());
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
		ruleResult.setRule("FieldSignature");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_ID.setValue(__helper.getValue("tSignature", "ID"));
		var_tSignature_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		createID0.setRuleName("FieldSignature");
		createID0.solve(var_tSignature_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			createID0.solve(var_tSignature_ID);
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
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = FieldSignatureImpl
				.pattern_FieldSignature_24_2_matchcontext_bindingFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MFieldName mFieldName = (MFieldName) result2_binding[0];
		TField tField = (TField) result2_binding[1];
		MFieldSignature mSignature = (MFieldSignature) result2_binding[2];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[3];
		for (Object[] result2_black : FieldSignatureImpl.pattern_FieldSignature_24_2_matchcontext_blackBBFBBBB(
				mFieldName, tField, mSignature, tSignature, sourceMatch, targetMatch)) {
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[2];
			Object[] result2_green = FieldSignatureImpl.pattern_FieldSignature_24_2_matchcontext_greenBBBBBBFB(
					mFieldName, tField, eFieldDeclarationToTField, mSignature, tSignature, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[6];

			// check csp
			Object[] result3_bindingAndBlack = FieldSignatureImpl
					.pattern_FieldSignature_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mFieldName,
							tField, eFieldDeclarationToTField, mSignature, tSignature, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = FieldSignatureImpl.pattern_FieldSignature_24_4_createcorrespondence_blackBBBBB(
						mFieldName, tField, mSignature, tSignature, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mFieldName] = " + mFieldName + ", " + "[tField] = " + tField + ", "
							+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldSignatureImpl.pattern_FieldSignature_24_4_createcorrespondence_greenFBBFB(mSignature, tSignature,
						isApplicableMatch);
				// MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = (MFieldSignatureToTFieldSignature) result4_green[0];
				// MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result4_green[3];

				// add to returned result
				Object[] result5_black = FieldSignatureImpl
						.pattern_FieldSignature_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldSignatureImpl.pattern_FieldSignature_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature, TFieldSignature tSignature,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.ID", true, csp);
		var_tSignature_ID.setValue(tSignature.getID());
		var_tSignature_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tSignature_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
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
	public boolean checkDEC_FWD(MFieldName mFieldName, MFieldSignature mSignature) {// match tgg pattern
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_27_1_matchtggpattern_blackBB(mFieldName,
				mSignature);
		if (result1_black != null) {
			return FieldSignatureImpl.pattern_FieldSignature_27_2_expressionF();
		} else {
			return FieldSignatureImpl.pattern_FieldSignature_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TField tField, TFieldSignature tSignature) {// match tgg pattern
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_28_1_matchtggpattern_blackBB(tField,
				tSignature);
		if (result1_black != null) {
			return FieldSignatureImpl.pattern_FieldSignature_28_2_expressionF();
		} else {
			return FieldSignatureImpl.pattern_FieldSignature_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MFieldNameToTField eFieldDeclarationToTFieldParameter) {
		// create result
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : FieldSignatureImpl
				.pattern_FieldSignature_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eFieldDeclarationToTFieldList = (RuleEntryList) result2_black[0];
			MFieldName mFieldName = (MFieldName) result2_black[1];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[2];
			TField tField = (TField) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = FieldSignatureImpl
					.pattern_FieldSignature_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mFieldName,
							tField, eFieldDeclarationToTField, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mFieldName] = "
						+ mFieldName + ", " + "[tField] = " + tField + ", " + "[eFieldDeclarationToTField] = "
						+ eFieldDeclarationToTField + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (FieldSignatureImpl.pattern_FieldSignature_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = FieldSignatureImpl.pattern_FieldSignature_29_5_checknacs_blackBBB(mFieldName,
						tField, eFieldDeclarationToTField);
				if (result5_black != null) {

					// perform
					Object[] result6_black = FieldSignatureImpl.pattern_FieldSignature_29_6_perform_blackBBBB(
							mFieldName, tField, eFieldDeclarationToTField, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mFieldName] = " + mFieldName + ", " + "[tField] = " + tField + ", "
								+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_29_6_perform_greenFBBFFFBB(mFieldName, tField, ruleResult,
							csp);
					// MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = (MFieldSignatureToTFieldSignature) result6_green[0];
					// MFieldSignature mSignature = (MFieldSignature) result6_green[3];
					// TFieldSignature tSignature = (TFieldSignature) result6_green[4];
					// MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.ID", csp);
		var_tSignature_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tSignature_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
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
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_MFIELDNAME_MFIELDSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MFieldSignature) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDNAME_MFIELDSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MFieldSignature) arguments.get(2));
			return null;
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDNAME_MFIELDSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MFieldSignature) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MFIELDNAME_TFIELD_MFIELDNAMETOTFIELD_MFIELDSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(TField) arguments.get(2), (MFieldNameToTField) arguments.get(3),
					(MFieldSignature) arguments.get(4));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.FIELD_SIGNATURE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TFIELD_TFIELDSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TField) arguments.get(1),
					(TFieldSignature) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELD_TFIELDSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TField) arguments.get(1),
					(TFieldSignature) arguments.get(2));
			return null;
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELD_TFIELDSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TField) arguments.get(1),
					(TFieldSignature) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MFIELDNAME_TFIELD_MFIELDNAMETOTFIELD_TFIELDSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(TField) arguments.get(2), (MFieldNameToTField) arguments.get(3),
					(TFieldSignature) arguments.get(4));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.FIELD_SIGNATURE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MFIELDNAME_TFIELD_MFIELDNAMETOTFIELD_MFIELDSIGNATURE_TFIELDSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(TField) arguments.get(2), (MFieldNameToTField) arguments.get(3),
					(MFieldSignature) arguments.get(4), (TFieldSignature) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_DEC_FWD__MFIELDNAME_MFIELDSIGNATURE:
			return checkDEC_FWD((MFieldName) arguments.get(0), (MFieldSignature) arguments.get(1));
		case RulesPackage.FIELD_SIGNATURE___CHECK_DEC_BWD__TFIELD_TFIELDSIGNATURE:
			return checkDEC_BWD((TField) arguments.get(0), (TFieldSignature) arguments.get(1));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL__RULEENTRYCONTAINER_MFIELDNAMETOTFIELD:
			return generateModel((RuleEntryContainer) arguments.get(0), (MFieldNameToTField) arguments.get(1));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MFIELDNAME_TFIELD_MFIELDNAMETOTFIELD_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(TField) arguments.get(2), (MFieldNameToTField) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldSignature_0_1_initialbindings_blackBBBB(FieldSignature _this, Match match,
			MFieldName mFieldName, MFieldSignature mSignature) {
		return new Object[] { _this, match, mFieldName, mSignature };
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_bindingFBBBB(FieldSignature _this, Match match,
			MFieldName mFieldName, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mFieldName, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mFieldName, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_bindingAndBlackFBBBB(FieldSignature _this,
			Match match, MFieldName mFieldName, MFieldSignature mSignature) {
		Object[] result_pattern_FieldSignature_0_2_SolveCSP_binding = pattern_FieldSignature_0_2_SolveCSP_bindingFBBBB(
				_this, match, mFieldName, mSignature);
		if (result_pattern_FieldSignature_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldSignature_0_2_SolveCSP_black = pattern_FieldSignature_0_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldSignature_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mFieldName, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_0_3_CheckCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_0_4_collectelementstobetranslated_blackBBB(Match match,
			MFieldName mFieldName, MFieldSignature mSignature) {
		return new Object[] { match, mFieldName, mSignature };
	}

	public static final Object[] pattern_FieldSignature_0_4_collectelementstobetranslated_greenBBBFFF(Match match,
			MFieldName mFieldName, MFieldSignature mSignature) {
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mFieldName____mFieldName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mFieldSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mSignature);
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mFieldName____mFieldName_name_prime = "mFieldName";
		String mFieldName__mSignature____mFieldSignatures_name_prime = "mFieldSignatures";
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mFieldName__mSignature____mSignatures);
		mSignature__mFieldName____mFieldName.setSrc(mSignature);
		mSignature__mFieldName____mFieldName.setTrg(mFieldName);
		match.getToBeTranslatedEdges().add(mSignature__mFieldName____mFieldName);
		mFieldName__mSignature____mFieldSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mFieldSignatures.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mFieldName__mSignature____mFieldSignatures);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignature__mFieldName____mFieldName.setName(mSignature__mFieldName____mFieldName_name_prime);
		mFieldName__mSignature____mFieldSignatures.setName(mFieldName__mSignature____mFieldSignatures_name_prime);
		return new Object[] { match, mFieldName, mSignature, mFieldName__mSignature____mSignatures,
				mSignature__mFieldName____mFieldName, mFieldName__mSignature____mFieldSignatures };
	}

	public static final Object[] pattern_FieldSignature_0_5_collectcontextelements_blackBBB(Match match,
			MFieldName mFieldName, MFieldSignature mSignature) {
		return new Object[] { match, mFieldName, mSignature };
	}

	public static final Object[] pattern_FieldSignature_0_5_collectcontextelements_greenBB(Match match,
			MFieldName mFieldName) {
		match.getContextNodes().add(mFieldName);
		return new Object[] { match, mFieldName };
	}

	public static final void pattern_FieldSignature_0_6_registerobjectstomatch_expressionBBBB(FieldSignature _this,
			Match match, MFieldName mFieldName, MFieldSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mFieldName, mSignature);

	}

	public static final boolean pattern_FieldSignature_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignature_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_1 = isApplicableMatch.getObject("tField");
		EObject _localVariable_2 = isApplicableMatch.getObject("eFieldDeclarationToTField");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignature");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpTField = _localVariable_1;
		EObject tmpEFieldDeclarationToTField = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
					MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
					if (tmpMSignature instanceof MFieldSignature) {
						MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
						return new Object[] { mFieldName, tField, eFieldDeclarationToTField, mSignature,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_blackBBBBFBB(MFieldName mFieldName,
			TField tField, MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature,
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mFieldName, tField, eFieldDeclarationToTField, mSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_bindingAndBlackFFFFFBB(
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldSignature_1_1_performtransformation_binding = pattern_FieldSignature_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldSignature_1_1_performtransformation_binding != null) {
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignature_1_1_performtransformation_binding[0];
			TField tField = (TField) result_pattern_FieldSignature_1_1_performtransformation_binding[1];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result_pattern_FieldSignature_1_1_performtransformation_binding[2];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldSignature_1_1_performtransformation_binding[3];

			Object[] result_pattern_FieldSignature_1_1_performtransformation_black = pattern_FieldSignature_1_1_performtransformation_blackBBBBFBB(
					mFieldName, tField, eFieldDeclarationToTField, mSignature, _this, isApplicableMatch);
			if (result_pattern_FieldSignature_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldSignature_1_1_performtransformation_black[4];

				return new Object[] { mFieldName, tField, eFieldDeclarationToTField, mSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_greenFBBFFB(TField tField,
			MFieldSignature mSignature, CSP csp) {
		MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = ModiscoFactory.eINSTANCE
				.createMFieldSignatureToTFieldSignature();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		MSignatureToTSignature mSignatureToTSignature = ModiscoFactory.eINSTANCE.createMSignatureToTSignature();
		Object _localVariable_0 = csp.getValue("tSignature", "ID");
		mFieldSignatureToTFieldSignature.setSource(mSignature);
		mFieldSignatureToTFieldSignature.setTarget(tSignature);
		tSignature.setField(tField);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		int tSignature_ID_prime = (int) _localVariable_0;
		tSignature.setID(Integer.valueOf(tSignature_ID_prime));
		return new Object[] { mFieldSignatureToTFieldSignature, tField, mSignature, tSignature, mSignatureToTSignature,
				csp };
	}

	public static final Object[] pattern_FieldSignature_1_2_collecttranslatedelements_blackBBBB(
			MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature, MFieldSignature mSignature,
			TFieldSignature tSignature, MSignatureToTSignature mSignatureToTSignature) {
		return new Object[] { mFieldSignatureToTFieldSignature, mSignature, tSignature, mSignatureToTSignature };
	}

	public static final Object[] pattern_FieldSignature_1_2_collecttranslatedelements_greenFBBBB(
			MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature, MFieldSignature mSignature,
			TFieldSignature tSignature, MSignatureToTSignature mSignatureToTSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mFieldSignatureToTFieldSignature);
		ruleresult.getTranslatedElements().add(mSignature);
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		return new Object[] { ruleresult, mFieldSignatureToTFieldSignature, mSignature, tSignature,
				mSignatureToTSignature };
	}

	public static final Object[] pattern_FieldSignature_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mFieldSignatureToTFieldSignature, EObject mFieldName, EObject tField,
			EObject eFieldDeclarationToTField, EObject mSignature, EObject tSignature, EObject mSignatureToTSignature) {
		if (!mFieldSignatureToTFieldSignature.equals(tField)) {
			if (!mFieldSignatureToTFieldSignature.equals(mSignature)) {
				if (!mFieldSignatureToTFieldSignature.equals(tSignature)) {
					if (!mFieldSignatureToTFieldSignature.equals(mSignatureToTSignature)) {
						if (!mFieldName.equals(mFieldSignatureToTFieldSignature)) {
							if (!mFieldName.equals(tField)) {
								if (!mFieldName.equals(mSignature)) {
									if (!mFieldName.equals(tSignature)) {
										if (!mFieldName.equals(mSignatureToTSignature)) {
											if (!tField.equals(tSignature)) {
												if (!eFieldDeclarationToTField
														.equals(mFieldSignatureToTFieldSignature)) {
													if (!eFieldDeclarationToTField.equals(mFieldName)) {
														if (!eFieldDeclarationToTField.equals(tField)) {
															if (!eFieldDeclarationToTField.equals(mSignature)) {
																if (!eFieldDeclarationToTField.equals(tSignature)) {
																	if (!eFieldDeclarationToTField
																			.equals(mSignatureToTSignature)) {
																		if (!mSignature.equals(tField)) {
																			if (!mSignature.equals(tSignature)) {
																				if (!mSignature.equals(
																						mSignatureToTSignature)) {
																					if (!mSignatureToTSignature
																							.equals(tField)) {
																						if (!mSignatureToTSignature
																								.equals(tSignature)) {
																							return new Object[] {
																									ruleresult,
																									mFieldSignatureToTFieldSignature,
																									mFieldName, tField,
																									eFieldDeclarationToTField,
																									mSignature,
																									tSignature,
																									mSignatureToTSignature };
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

	public static final Object[] pattern_FieldSignature_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mFieldSignatureToTFieldSignature, EObject mFieldName, EObject tField,
			EObject mSignature, EObject tSignature, EObject mSignatureToTSignature) {
		EMoflonEdge mFieldSignatureToTFieldSignature__mSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mFieldSignatureToTFieldSignature__tSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mFieldName____mFieldName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mFieldSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldSignature";
		String mFieldSignatureToTFieldSignature__mSignature____source_name_prime = "source";
		String mFieldSignatureToTFieldSignature__tSignature____target_name_prime = "target";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mFieldName____mFieldName_name_prime = "mFieldName";
		String mFieldName__mSignature____mFieldSignatures_name_prime = "mFieldSignatures";
		String tSignature__tField____field_name_prime = "field";
		String tField__tSignature____signatures_name_prime = "signatures";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		mFieldSignatureToTFieldSignature__mSignature____source.setSrc(mFieldSignatureToTFieldSignature);
		mFieldSignatureToTFieldSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFieldSignatureToTFieldSignature__mSignature____source);
		mFieldSignatureToTFieldSignature__tSignature____target.setSrc(mFieldSignatureToTFieldSignature);
		mFieldSignatureToTFieldSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFieldSignatureToTFieldSignature__tSignature____target);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mFieldName__mSignature____mSignatures);
		mSignature__mFieldName____mFieldName.setSrc(mSignature);
		mSignature__mFieldName____mFieldName.setTrg(mFieldName);
		ruleresult.getTranslatedEdges().add(mSignature__mFieldName____mFieldName);
		mFieldName__mSignature____mFieldSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mFieldSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mFieldName__mSignature____mFieldSignatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		ruleresult.getCreatedEdges().add(tSignature__tField____field);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tField__tSignature____signatures);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mFieldSignatureToTFieldSignature__mSignature____source
				.setName(mFieldSignatureToTFieldSignature__mSignature____source_name_prime);
		mFieldSignatureToTFieldSignature__tSignature____target
				.setName(mFieldSignatureToTFieldSignature__tSignature____target_name_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignature__mFieldName____mFieldName.setName(mSignature__mFieldName____mFieldName_name_prime);
		mFieldName__mSignature____mFieldSignatures.setName(mFieldName__mSignature____mFieldSignatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		return new Object[] { ruleresult, mFieldSignatureToTFieldSignature, mFieldName, tField, mSignature, tSignature,
				mSignatureToTSignature, mFieldSignatureToTFieldSignature__mSignature____source,
				mFieldSignatureToTFieldSignature__tSignature____target, mFieldName__mSignature____mSignatures,
				mSignature__mFieldName____mFieldName, mFieldName__mSignature____mFieldSignatures,
				tSignature__tField____field, tField__tSignature____signatures,
				mSignatureToTSignature__mSignature____source, mSignatureToTSignature__tSignature____target };
	}

	public static final void pattern_FieldSignature_1_5_registerobjects_expressionBBBBBBBBB(FieldSignature _this,
			PerformRuleResult ruleresult, EObject mFieldSignatureToTFieldSignature, EObject mFieldName, EObject tField,
			EObject eFieldDeclarationToTField, EObject mSignature, EObject tSignature, EObject mSignatureToTSignature) {
		_this.registerObjects_FWD(ruleresult, mFieldSignatureToTFieldSignature, mFieldName, tField,
				eFieldDeclarationToTField, mSignature, tSignature, mSignatureToTSignature);

	}

	public static final PerformRuleResult pattern_FieldSignature_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_2_1_preparereturnvalue_bindingFB(FieldSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldSignature _this) {
		Object[] result_pattern_FieldSignature_2_1_preparereturnvalue_binding = pattern_FieldSignature_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignature_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldSignature_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignature_2_1_preparereturnvalue_black = pattern_FieldSignature_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldSignature_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldSignature_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldSignature_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mFieldName");
		EObject _localVariable_1 = match.getObject("mSignature");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				return new Object[] { mFieldName, mSignature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_2_2_corematch_blackBFFBB(MFieldName mFieldName,
			MFieldSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mFieldName, MFieldNameToTField.class, "source")) {
			TField tField = eFieldDeclarationToTField.getTarget();
			if (tField != null) {
				_result.add(new Object[] { mFieldName, tField, eFieldDeclarationToTField, mSignature, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_2_3_findcontext_blackBBBB(MFieldName mFieldName,
			TField tField, MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mFieldName.getMSignatures().contains(mSignature)) {
			if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
				if (tField.equals(eFieldDeclarationToTField.getTarget())) {
					if (mFieldName.equals(mSignature.getMFieldName())) {
						_result.add(new Object[] { mFieldName, tField, eFieldDeclarationToTField, mSignature });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignature_2_3_findcontext_greenBBBBFFFFFF(MFieldName mFieldName,
			TField tField, MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mFieldName____mFieldName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mFieldSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String mSignature__mFieldName____mFieldName_name_prime = "mFieldName";
		String mFieldName__mSignature____mFieldSignatures_name_prime = "mFieldSignatures";
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mFieldName__mSignature____mSignatures);
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__mFieldName____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__tField____target);
		mSignature__mFieldName____mFieldName.setSrc(mSignature);
		mSignature__mFieldName____mFieldName.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(mSignature__mFieldName____mFieldName);
		mFieldName__mSignature____mFieldSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mFieldSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mFieldName__mSignature____mFieldSignatures);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		mSignature__mFieldName____mFieldName.setName(mSignature__mFieldName____mFieldName_name_prime);
		mFieldName__mSignature____mFieldSignatures.setName(mFieldName__mSignature____mFieldSignatures_name_prime);
		return new Object[] { mFieldName, tField, eFieldDeclarationToTField, mSignature, isApplicableMatch,
				mFieldName__mSignature____mSignatures, eFieldDeclarationToTField__mFieldName____source,
				eFieldDeclarationToTField__tField____target, mSignature__mFieldName____mFieldName,
				mFieldName__mSignature____mFieldSignatures };
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_bindingFBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mFieldName, tField,
				eFieldDeclarationToTField, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField,
					mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_bindingAndBlackFBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature) {
		Object[] result_pattern_FieldSignature_2_4_solveCSP_binding = pattern_FieldSignature_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField, mSignature);
		if (result_pattern_FieldSignature_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_2_4_solveCSP_black = pattern_FieldSignature_2_4_solveCSP_blackB(csp);
			if (result_pattern_FieldSignature_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField,
						mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_2_5_checkCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignature_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignature_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_10_1_initialbindings_blackBBBB(FieldSignature _this,
			Match match, TField tField, TFieldSignature tSignature) {
		return new Object[] { _this, match, tField, tSignature };
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_bindingFBBBB(FieldSignature _this, Match match,
			TField tField, TFieldSignature tSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tField, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tField, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_bindingAndBlackFBBBB(FieldSignature _this,
			Match match, TField tField, TFieldSignature tSignature) {
		Object[] result_pattern_FieldSignature_10_2_SolveCSP_binding = pattern_FieldSignature_10_2_SolveCSP_bindingFBBBB(
				_this, match, tField, tSignature);
		if (result_pattern_FieldSignature_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldSignature_10_2_SolveCSP_black = pattern_FieldSignature_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tField, tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_10_3_CheckCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_10_4_collectelementstobetranslated_blackBBB(Match match,
			TField tField, TFieldSignature tSignature) {
		return new Object[] { match, tField, tSignature };
	}

	public static final Object[] pattern_FieldSignature_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TField tField, TFieldSignature tSignature) {
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		String tSignature__tField____field_name_prime = "field";
		String tField__tSignature____signatures_name_prime = "signatures";
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		match.getToBeTranslatedEdges().add(tSignature__tField____field);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		return new Object[] { match, tField, tSignature, tSignature__tField____field,
				tField__tSignature____signatures };
	}

	public static final Object[] pattern_FieldSignature_10_5_collectcontextelements_blackBBB(Match match, TField tField,
			TFieldSignature tSignature) {
		return new Object[] { match, tField, tSignature };
	}

	public static final Object[] pattern_FieldSignature_10_5_collectcontextelements_greenBB(Match match,
			TField tField) {
		match.getContextNodes().add(tField);
		return new Object[] { match, tField };
	}

	public static final void pattern_FieldSignature_10_6_registerobjectstomatch_expressionBBBB(FieldSignature _this,
			Match match, TField tField, TFieldSignature tSignature) {
		_this.registerObjectsToMatch_BWD(match, tField, tSignature);

	}

	public static final boolean pattern_FieldSignature_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignature_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_1 = isApplicableMatch.getObject("tField");
		EObject _localVariable_2 = isApplicableMatch.getObject("eFieldDeclarationToTField");
		EObject _localVariable_3 = isApplicableMatch.getObject("tSignature");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpTField = _localVariable_1;
		EObject tmpEFieldDeclarationToTField = _localVariable_2;
		EObject tmpTSignature = _localVariable_3;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
					MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
					if (tmpTSignature instanceof TFieldSignature) {
						TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
						return new Object[] { mFieldName, tField, eFieldDeclarationToTField, tSignature,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_blackBBBBFBB(MFieldName mFieldName,
			TField tField, MFieldNameToTField eFieldDeclarationToTField, TFieldSignature tSignature,
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mFieldName, tField, eFieldDeclarationToTField, tSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_bindingAndBlackFFFFFBB(
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldSignature_11_1_performtransformation_binding = pattern_FieldSignature_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldSignature_11_1_performtransformation_binding != null) {
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignature_11_1_performtransformation_binding[0];
			TField tField = (TField) result_pattern_FieldSignature_11_1_performtransformation_binding[1];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result_pattern_FieldSignature_11_1_performtransformation_binding[2];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_FieldSignature_11_1_performtransformation_binding[3];

			Object[] result_pattern_FieldSignature_11_1_performtransformation_black = pattern_FieldSignature_11_1_performtransformation_blackBBBBFBB(
					mFieldName, tField, eFieldDeclarationToTField, tSignature, _this, isApplicableMatch);
			if (result_pattern_FieldSignature_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldSignature_11_1_performtransformation_black[4];

				return new Object[] { mFieldName, tField, eFieldDeclarationToTField, tSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_greenFBFBF(MFieldName mFieldName,
			TFieldSignature tSignature) {
		MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = ModiscoFactory.eINSTANCE
				.createMFieldSignatureToTFieldSignature();
		MFieldSignature mSignature = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMFieldSignature();
		MSignatureToTSignature mSignatureToTSignature = ModiscoFactory.eINSTANCE.createMSignatureToTSignature();
		mFieldSignatureToTFieldSignature.setTarget(tSignature);
		mFieldSignatureToTFieldSignature.setSource(mSignature);
		mFieldName.getMSignatures().add(mSignature);
		mSignature.setMFieldName(mFieldName);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		return new Object[] { mFieldSignatureToTFieldSignature, mFieldName, mSignature, tSignature,
				mSignatureToTSignature };
	}

	public static final Object[] pattern_FieldSignature_11_2_collecttranslatedelements_blackBBBB(
			MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature, MFieldSignature mSignature,
			TFieldSignature tSignature, MSignatureToTSignature mSignatureToTSignature) {
		return new Object[] { mFieldSignatureToTFieldSignature, mSignature, tSignature, mSignatureToTSignature };
	}

	public static final Object[] pattern_FieldSignature_11_2_collecttranslatedelements_greenFBBBB(
			MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature, MFieldSignature mSignature,
			TFieldSignature tSignature, MSignatureToTSignature mSignatureToTSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mFieldSignatureToTFieldSignature);
		ruleresult.getCreatedElements().add(mSignature);
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		return new Object[] { ruleresult, mFieldSignatureToTFieldSignature, mSignature, tSignature,
				mSignatureToTSignature };
	}

	public static final Object[] pattern_FieldSignature_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mFieldSignatureToTFieldSignature, EObject mFieldName, EObject tField,
			EObject eFieldDeclarationToTField, EObject mSignature, EObject tSignature, EObject mSignatureToTSignature) {
		if (!mFieldSignatureToTFieldSignature.equals(tField)) {
			if (!mFieldSignatureToTFieldSignature.equals(mSignature)) {
				if (!mFieldSignatureToTFieldSignature.equals(tSignature)) {
					if (!mFieldSignatureToTFieldSignature.equals(mSignatureToTSignature)) {
						if (!mFieldName.equals(mFieldSignatureToTFieldSignature)) {
							if (!mFieldName.equals(tField)) {
								if (!mFieldName.equals(mSignature)) {
									if (!mFieldName.equals(tSignature)) {
										if (!mFieldName.equals(mSignatureToTSignature)) {
											if (!tField.equals(tSignature)) {
												if (!eFieldDeclarationToTField
														.equals(mFieldSignatureToTFieldSignature)) {
													if (!eFieldDeclarationToTField.equals(mFieldName)) {
														if (!eFieldDeclarationToTField.equals(tField)) {
															if (!eFieldDeclarationToTField.equals(mSignature)) {
																if (!eFieldDeclarationToTField.equals(tSignature)) {
																	if (!eFieldDeclarationToTField
																			.equals(mSignatureToTSignature)) {
																		if (!mSignature.equals(tField)) {
																			if (!mSignature.equals(tSignature)) {
																				if (!mSignature.equals(
																						mSignatureToTSignature)) {
																					if (!mSignatureToTSignature
																							.equals(tField)) {
																						if (!mSignatureToTSignature
																								.equals(tSignature)) {
																							return new Object[] {
																									ruleresult,
																									mFieldSignatureToTFieldSignature,
																									mFieldName, tField,
																									eFieldDeclarationToTField,
																									mSignature,
																									tSignature,
																									mSignatureToTSignature };
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

	public static final Object[] pattern_FieldSignature_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mFieldSignatureToTFieldSignature, EObject mFieldName, EObject tField,
			EObject mSignature, EObject tSignature, EObject mSignatureToTSignature) {
		EMoflonEdge mFieldSignatureToTFieldSignature__mSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mFieldSignatureToTFieldSignature__tSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mFieldName____mFieldName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mFieldSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldSignature";
		String mFieldSignatureToTFieldSignature__mSignature____source_name_prime = "source";
		String mFieldSignatureToTFieldSignature__tSignature____target_name_prime = "target";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mFieldName____mFieldName_name_prime = "mFieldName";
		String mFieldName__mSignature____mFieldSignatures_name_prime = "mFieldSignatures";
		String tSignature__tField____field_name_prime = "field";
		String tField__tSignature____signatures_name_prime = "signatures";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		mFieldSignatureToTFieldSignature__mSignature____source.setSrc(mFieldSignatureToTFieldSignature);
		mFieldSignatureToTFieldSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFieldSignatureToTFieldSignature__mSignature____source);
		mFieldSignatureToTFieldSignature__tSignature____target.setSrc(mFieldSignatureToTFieldSignature);
		mFieldSignatureToTFieldSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFieldSignatureToTFieldSignature__tSignature____target);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFieldName__mSignature____mSignatures);
		mSignature__mFieldName____mFieldName.setSrc(mSignature);
		mSignature__mFieldName____mFieldName.setTrg(mFieldName);
		ruleresult.getCreatedEdges().add(mSignature__mFieldName____mFieldName);
		mFieldName__mSignature____mFieldSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mFieldSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFieldName__mSignature____mFieldSignatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		ruleresult.getTranslatedEdges().add(tSignature__tField____field);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tField__tSignature____signatures);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mFieldSignatureToTFieldSignature__mSignature____source
				.setName(mFieldSignatureToTFieldSignature__mSignature____source_name_prime);
		mFieldSignatureToTFieldSignature__tSignature____target
				.setName(mFieldSignatureToTFieldSignature__tSignature____target_name_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignature__mFieldName____mFieldName.setName(mSignature__mFieldName____mFieldName_name_prime);
		mFieldName__mSignature____mFieldSignatures.setName(mFieldName__mSignature____mFieldSignatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		return new Object[] { ruleresult, mFieldSignatureToTFieldSignature, mFieldName, tField, mSignature, tSignature,
				mSignatureToTSignature, mFieldSignatureToTFieldSignature__mSignature____source,
				mFieldSignatureToTFieldSignature__tSignature____target, mFieldName__mSignature____mSignatures,
				mSignature__mFieldName____mFieldName, mFieldName__mSignature____mFieldSignatures,
				tSignature__tField____field, tField__tSignature____signatures,
				mSignatureToTSignature__mSignature____source, mSignatureToTSignature__tSignature____target };
	}

	public static final void pattern_FieldSignature_11_5_registerobjects_expressionBBBBBBBBB(FieldSignature _this,
			PerformRuleResult ruleresult, EObject mFieldSignatureToTFieldSignature, EObject mFieldName, EObject tField,
			EObject eFieldDeclarationToTField, EObject mSignature, EObject tSignature, EObject mSignatureToTSignature) {
		_this.registerObjects_BWD(ruleresult, mFieldSignatureToTFieldSignature, mFieldName, tField,
				eFieldDeclarationToTField, mSignature, tSignature, mSignatureToTSignature);

	}

	public static final PerformRuleResult pattern_FieldSignature_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_12_1_preparereturnvalue_bindingFB(FieldSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldSignature _this) {
		Object[] result_pattern_FieldSignature_12_1_preparereturnvalue_binding = pattern_FieldSignature_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignature_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldSignature_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignature_12_1_preparereturnvalue_black = pattern_FieldSignature_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldSignature_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldSignature_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldSignature_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tField");
		EObject _localVariable_1 = match.getObject("tSignature");
		EObject tmpTField = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		if (tmpTField instanceof TField) {
			TField tField = (TField) tmpTField;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				return new Object[] { tField, tSignature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_12_2_corematch_blackFBFBB(TField tField,
			TFieldSignature tSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tField, MFieldNameToTField.class, "target")) {
			MFieldName mFieldName = eFieldDeclarationToTField.getSource();
			if (mFieldName != null) {
				_result.add(new Object[] { mFieldName, tField, eFieldDeclarationToTField, tSignature, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_12_3_findcontext_blackBBBB(MFieldName mFieldName,
			TField tField, MFieldNameToTField eFieldDeclarationToTField, TFieldSignature tSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
			if (tField.equals(eFieldDeclarationToTField.getTarget())) {
				if (tField.equals(tSignature.getField())) {
					_result.add(new Object[] { mFieldName, tField, eFieldDeclarationToTField, tSignature });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignature_12_3_findcontext_greenBBBBFFFFF(MFieldName mFieldName,
			TField tField, MFieldNameToTField eFieldDeclarationToTField, TFieldSignature tSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String tSignature__tField____field_name_prime = "field";
		String tField__tSignature____signatures_name_prime = "signatures";
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		isApplicableMatch.getAllContextElements().add(tSignature);
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__mFieldName____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__tField____target);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(tSignature__tField____field);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tField__tSignature____signatures);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		return new Object[] { mFieldName, tField, eFieldDeclarationToTField, tSignature, isApplicableMatch,
				eFieldDeclarationToTField__mFieldName____source, eFieldDeclarationToTField__tField____target,
				tSignature__tField____field, tField__tSignature____signatures };
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_bindingFBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, TFieldSignature tSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mFieldName, tField,
				eFieldDeclarationToTField, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField,
					tSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_bindingAndBlackFBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, TFieldSignature tSignature) {
		Object[] result_pattern_FieldSignature_12_4_solveCSP_binding = pattern_FieldSignature_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField, tSignature);
		if (result_pattern_FieldSignature_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_12_4_solveCSP_black = pattern_FieldSignature_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField,
						tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_12_5_checkCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignature_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignature_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_20_1_preparereturnvalue_bindingFB(FieldSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldSignature _this) {
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

	public static final Object[] pattern_FieldSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldSignature _this) {
		Object[] result_pattern_FieldSignature_20_1_preparereturnvalue_binding = pattern_FieldSignature_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignature_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldSignature_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignature_20_1_preparereturnvalue_black = pattern_FieldSignature_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldSignature_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldSignature_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldSignature_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldSignature_20_2_testcorematchandDECs_black_nac_0BB(
			MFieldSignature mSignature, MFieldName mFieldName) {
		for (MName __DEC_mSignature_mSignatures_908862 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MName.class, "mSignatures")) {
			if (!mFieldName.equals(__DEC_mSignature_mSignatures_908862)) {
				return new Object[] { mSignature, mFieldName };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mSignatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMFieldName = _edge_mSignatures.getSrc();
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			EObject tmpMSignature = _edge_mSignatures.getTrg();
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				if (mFieldName.getMSignatures().contains(mSignature)) {
					if (mFieldName.equals(mSignature.getMFieldName())) {
						if (pattern_FieldSignature_20_2_testcorematchandDECs_black_nac_0BB(mSignature,
								mFieldName) == null) {
							_result.add(new Object[] { mFieldName, mSignature, _edge_mSignatures });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldSignature_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldSignature _this, Match match, MFieldName mFieldName, MFieldSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mFieldName, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldSignature_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_21_1_preparereturnvalue_bindingFB(FieldSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldSignature _this) {
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

	public static final Object[] pattern_FieldSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldSignature _this) {
		Object[] result_pattern_FieldSignature_21_1_preparereturnvalue_binding = pattern_FieldSignature_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignature_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldSignature_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignature_21_1_preparereturnvalue_black = pattern_FieldSignature_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldSignature_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldSignature_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldSignature_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldSignature_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_field) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSignature = _edge_field.getSrc();
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			EObject tmpTField = _edge_field.getTrg();
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (tField.equals(tSignature.getField())) {
					_result.add(new Object[] { tField, tSignature, _edge_field });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldSignature_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldSignature _this, Match match, TField tField, TFieldSignature tSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tField, tSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldSignature_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_24_1_prepare_blackB(FieldSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldSignature_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldSignature_24_2_matchcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mFieldName");
		EObject _localVariable_1 = targetMatch.getObject("tField");
		EObject _localVariable_2 = sourceMatch.getObject("mSignature");
		EObject _localVariable_3 = targetMatch.getObject("tSignature");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpTField = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		EObject tmpTSignature = _localVariable_3;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (tmpMSignature instanceof MFieldSignature) {
					MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
					if (tmpTSignature instanceof TFieldSignature) {
						TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
						return new Object[] { mFieldName, tField, mSignature, tSignature, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_24_2_matchcontext_blackBBFBBBB(MFieldName mFieldName,
			TField tField, MFieldSignature mSignature, TFieldSignature tSignature, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (mFieldName.getMSignatures().contains(mSignature)) {
				if (mFieldName.equals(mSignature.getMFieldName())) {
					if (tField.equals(tSignature.getField())) {
						for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mFieldName, MFieldNameToTField.class, "source")) {
							if (tField.equals(eFieldDeclarationToTField.getTarget())) {
								_result.add(new Object[] { mFieldName, tField, eFieldDeclarationToTField, mSignature,
										tSignature, sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignature_24_2_matchcontext_greenBBBBBBFB(MFieldName mFieldName,
			TField tField, MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature,
			TFieldSignature tSignature, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "FieldSignature";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mFieldName, tField, eFieldDeclarationToTField, mSignature, tSignature, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_FieldSignature_24_3_checkcsp_bindingFBBBBBBBBB(FieldSignature _this,
			CCMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature, TFieldSignature tSignature,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mFieldName, tField,
				eFieldDeclarationToTField, mSignature, tSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField,
					mSignature, tSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			CCMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, MFieldSignature mSignature, TFieldSignature tSignature,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldSignature_24_3_checkcsp_binding = pattern_FieldSignature_24_3_checkcsp_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField, mSignature, tSignature,
				sourceMatch, targetMatch);
		if (result_pattern_FieldSignature_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_24_3_checkcsp_binding[0];

			Object[] result_pattern_FieldSignature_24_3_checkcsp_black = pattern_FieldSignature_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_FieldSignature_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField,
						mSignature, tSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_4_createcorrespondence_blackBBBBB(MFieldName mFieldName,
			TField tField, MFieldSignature mSignature, TFieldSignature tSignature, CCMatch isApplicableMatch) {
		return new Object[] { mFieldName, tField, mSignature, tSignature, isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignature_24_4_createcorrespondence_greenFBBFB(MFieldSignature mSignature,
			TFieldSignature tSignature, CCMatch isApplicableMatch) {
		MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = ModiscoFactory.eINSTANCE
				.createMFieldSignatureToTFieldSignature();
		MSignatureToTSignature mSignatureToTSignature = ModiscoFactory.eINSTANCE.createMSignatureToTSignature();
		mFieldSignatureToTFieldSignature.setSource(mSignature);
		mFieldSignatureToTFieldSignature.setTarget(tSignature);
		isApplicableMatch.getCreateCorr().add(mFieldSignatureToTFieldSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		isApplicableMatch.getCreateCorr().add(mSignatureToTSignature);
		return new Object[] { mFieldSignatureToTFieldSignature, mSignature, tSignature, mSignatureToTSignature,
				isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignature_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignature_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldSignature";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignature_24_6_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_27_1_matchtggpattern_black_nac_0BB(MFieldSignature mSignature,
			MFieldName mFieldName) {
		for (MName __DEC_mSignature_mSignatures_531532 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MName.class, "mSignatures")) {
			if (!mFieldName.equals(__DEC_mSignature_mSignatures_531532)) {
				return new Object[] { mSignature, mFieldName };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_27_1_matchtggpattern_blackBB(MFieldName mFieldName,
			MFieldSignature mSignature) {
		if (mFieldName.getMSignatures().contains(mSignature)) {
			if (mFieldName.equals(mSignature.getMFieldName())) {
				if (pattern_FieldSignature_27_1_matchtggpattern_black_nac_0BB(mSignature, mFieldName) == null) {
					return new Object[] { mFieldName, mSignature };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignature_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_28_1_matchtggpattern_blackBB(TField tField,
			TFieldSignature tSignature) {
		if (tField.equals(tSignature.getField())) {
			return new Object[] { tField, tSignature };
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignature_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_29_1_createresult_blackB(FieldSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldSignature_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MFieldName mFieldName) {
		if (ruleResult.getSourceObjects().contains(mFieldName)) {
			return new Object[] { ruleResult, mFieldName };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MFieldNameToTField eFieldDeclarationToTField) {
		if (ruleResult.getCorrObjects().contains(eFieldDeclarationToTField)) {
			return new Object[] { ruleResult, eFieldDeclarationToTField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TField tField) {
		if (ruleResult.getTargetObjects().contains(tField)) {
			return new Object[] { ruleResult, tField };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eFieldDeclarationToTFieldList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEFieldDeclarationToTField : eFieldDeclarationToTFieldList.getEntryObjects()) {
				if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
					MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
					MFieldName mFieldName = eFieldDeclarationToTField.getSource();
					if (mFieldName != null) {
						TField tField = eFieldDeclarationToTField.getTarget();
						if (tField != null) {
							if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									eFieldDeclarationToTField) == null) {
								if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mFieldName) == null) {
									if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											tField) == null) {
										_result.add(new Object[] { eFieldDeclarationToTFieldList, mFieldName,
												eFieldDeclarationToTField, tField, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_bindingFBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mFieldName, tField,
				eFieldDeclarationToTField, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_bindingAndBlackFBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldSignature_29_3_solveCSP_binding = pattern_FieldSignature_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField, ruleResult);
		if (result_pattern_FieldSignature_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_29_3_solveCSP_black = pattern_FieldSignature_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, tField, eFieldDeclarationToTField,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_29_4_checkCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_29_5_checknacs_blackBBB(MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField) {
		return new Object[] { mFieldName, tField, eFieldDeclarationToTField };
	}

	public static final Object[] pattern_FieldSignature_29_6_perform_blackBBBB(MFieldName mFieldName, TField tField,
			MFieldNameToTField eFieldDeclarationToTField, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mFieldName, tField, eFieldDeclarationToTField, ruleResult };
	}

	public static final Object[] pattern_FieldSignature_29_6_perform_greenFBBFFFBB(MFieldName mFieldName, TField tField,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = ModiscoFactory.eINSTANCE
				.createMFieldSignatureToTFieldSignature();
		MFieldSignature mSignature = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMFieldSignature();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		MSignatureToTSignature mSignatureToTSignature = ModiscoFactory.eINSTANCE.createMSignatureToTSignature();
		Object _localVariable_0 = csp.getValue("tSignature", "ID");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mFieldSignatureToTFieldSignature);
		mFieldSignatureToTFieldSignature.setSource(mSignature);
		mFieldName.getMSignatures().add(mSignature);
		mSignature.setMFieldName(mFieldName);
		ruleResult.getSourceObjects().add(mSignature);
		mFieldSignatureToTFieldSignature.setTarget(tSignature);
		tSignature.setField(tField);
		ruleResult.getTargetObjects().add(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		int tSignature_ID_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tSignature.setID(Integer.valueOf(tSignature_ID_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mFieldSignatureToTFieldSignature, mFieldName, tField, mSignature, tSignature,
				mSignatureToTSignature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldSignature_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldSignatureImpl
