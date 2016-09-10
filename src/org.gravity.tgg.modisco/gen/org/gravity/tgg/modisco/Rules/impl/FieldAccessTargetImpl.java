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

import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;

import org.gravity.tgg.modisco.MDefinitionToTMember;

import org.gravity.tgg.modisco.Rules.FieldAccessTarget;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.SingleVariableAccessToTAccess;
import org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;

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
 * An implementation of the model object '<em><b>Field Access Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldAccessTargetImpl extends AbstractRuleImpl implements FieldAccessTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldAccessTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldAccessTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MDefinition mDefinition, MFieldDefinition mField,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag) {
		// initial bindings
		Object[] result1_black = FieldAccessTargetImpl.pattern_FieldAccessTarget_0_1_initialbindings_blackBBBBBB(this,
				match, mDefinition, mField, varAccess, varDeclFrag);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mField] = " + mField + ", " + "[varAccess] = " + varAccess + ", " + "[varDeclFrag] = "
					+ varDeclFrag + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mDefinition, mField,
						varAccess, varDeclFrag);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mField] = " + mField + ", " + "[varAccess] = " + varAccess + ", " + "[varDeclFrag] = "
					+ varDeclFrag + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldAccessTargetImpl.pattern_FieldAccessTarget_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_0_4_collectelementstobetranslated_blackBBBBB(match, mDefinition, mField,
							varAccess, varDeclFrag);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mField] = " + mField + ", " + "[varAccess] = " + varAccess + ", " + "[varDeclFrag] = "
						+ varDeclFrag + ".");
			}
			FieldAccessTargetImpl.pattern_FieldAccessTarget_0_4_collectelementstobetranslated_greenBBBFF(match,
					varAccess, varDeclFrag);
			// EMoflonEdge varAccess__varDeclFrag____variable = (EMoflonEdge) result4_green[3];
			// EMoflonEdge varDeclFrag__varAccess____usageInVariableAccess = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_0_5_collectcontextelements_blackBBBBB(match, mDefinition, mField,
							varAccess, varDeclFrag);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mField] = " + mField + ", "
								+ "[varAccess] = " + varAccess + ", " + "[varDeclFrag] = " + varDeclFrag + ".");
			}
			FieldAccessTargetImpl.pattern_FieldAccessTarget_0_5_collectcontextelements_greenBBBBBFFF(match, mDefinition,
					mField, varAccess, varDeclFrag);
			// EMoflonEdge mDefinition__varAccess____mAbstractFieldAccess = (EMoflonEdge) result5_green[5];
			// EMoflonEdge varDeclFrag__mField____variablesContainer = (EMoflonEdge) result5_green[6];
			// EMoflonEdge mField__varDeclFrag____fragments = (EMoflonEdge) result5_green[7];

			// register objects to match
			FieldAccessTargetImpl.pattern_FieldAccessTarget_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					mDefinition, mField, varAccess, varDeclFrag);
			return FieldAccessTargetImpl.pattern_FieldAccessTarget_0_7_expressionF();
		} else {
			return FieldAccessTargetImpl.pattern_FieldAccessTarget_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[0];
		TMember tDefinition = (TMember) result1_bindingAndBlack[1];
		TAccess tAccess = (TAccess) result1_bindingAndBlack[2];
		TFieldDefinition tField = (TFieldDefinition) result1_bindingAndBlack[3];
		MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result1_bindingAndBlack[4];
		MFieldDefinition mField = (MFieldDefinition) result1_bindingAndBlack[5];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[6];
		SingleVariableAccess varAccess = (SingleVariableAccess) result1_bindingAndBlack[7];
		VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result1_bindingAndBlack[8];
		VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) result1_bindingAndBlack[9];
		SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) result1_bindingAndBlack[10];
		// CSP csp = (CSP) result1_bindingAndBlack[11];
		FieldAccessTargetImpl.pattern_FieldAccessTarget_1_1_performtransformation_greenBB(tAccess, tField);

		// collect translated elements
		Object[] result2_green = FieldAccessTargetImpl.pattern_FieldAccessTarget_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, mDefinition,
						tDefinition, tAccess, tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess,
						varDeclFrag, varDeclFragToTField, varAccessToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[tAccess] = " + tAccess + ", " + "[tField] = " + tField
					+ ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", " + "[mField] = " + mField
					+ ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[varAccess] = " + varAccess + ", "
					+ "[varDeclFrag] = " + varDeclFrag + ", " + "[varDeclFragToTField] = " + varDeclFragToTField + ", "
					+ "[varAccessToTAccess] = " + varAccessToTAccess + ".");
		}
		FieldAccessTargetImpl.pattern_FieldAccessTarget_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, tAccess,
				tField, varAccess, varDeclFrag);
		// EMoflonEdge tField__tAccess____accessedBy = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tAccess__tField____tTarget = (EMoflonEdge) result3_green[6];
		// EMoflonEdge varAccess__varDeclFrag____variable = (EMoflonEdge) result3_green[7];
		// EMoflonEdge varDeclFrag__varAccess____usageInVariableAccess = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		FieldAccessTargetImpl.pattern_FieldAccessTarget_1_5_registerobjects_expressionBBBBBBBBBBBBB(this, ruleresult,
				mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField, mMethodToTMethod,
				varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);
		return FieldAccessTargetImpl.pattern_FieldAccessTarget_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldAccessTargetImpl.pattern_FieldAccessTarget_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MDefinition mDefinition = (MDefinition) result2_binding[0];
		MFieldDefinition mField = (MFieldDefinition) result2_binding[1];
		SingleVariableAccess varAccess = (SingleVariableAccess) result2_binding[2];
		VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_binding[3];
		for (Object[] result2_black : FieldAccessTargetImpl.pattern_FieldAccessTarget_2_2_corematch_blackBFFFFBFBBFFB(
				mDefinition, mField, varAccess, varDeclFrag, match)) {
			TMember tDefinition = (TMember) result2_black[1];
			TAccess tAccess = (TAccess) result2_black[2];
			TFieldDefinition tField = (TFieldDefinition) result2_black[3];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[4];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[6];
			VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) result2_black[9];
			SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : FieldAccessTargetImpl
					.pattern_FieldAccessTarget_2_3_findcontext_blackBBBBBBBBBBB(mDefinition, tDefinition, tAccess,
							tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag,
							varDeclFragToTField, varAccessToTAccess)) {
				Object[] result3_green = FieldAccessTargetImpl
						.pattern_FieldAccessTarget_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(mDefinition,
								tDefinition, tAccess, tField, mDefinitionToTDefinition, mField, mMethodToTMethod,
								varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge mDefinition__varAccess____mAbstractFieldAccess = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tDefinition__tAccess____tAccessing = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tAccess__tDefinition____tSource = (EMoflonEdge) result3_green[14];
				// EMoflonEdge mDefinitionToTDefinition__mDefinition____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge mDefinitionToTDefinition__tDefinition____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge mMethodToTMethod__mField____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge mMethodToTMethod__tField____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge varAccess__varDeclFrag____variable = (EMoflonEdge) result3_green[19];
				// EMoflonEdge varDeclFrag__varAccess____usageInVariableAccess = (EMoflonEdge) result3_green[20];
				// EMoflonEdge varDeclFrag__mField____variablesContainer = (EMoflonEdge) result3_green[21];
				// EMoflonEdge mField__varDeclFrag____fragments = (EMoflonEdge) result3_green[22];
				// EMoflonEdge varDeclFragToTField__varDeclFrag____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge varDeclFragToTField__tField____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge varAccessToTAccess__varAccess____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge varAccessToTAccess__tAccess____target = (EMoflonEdge) result3_green[26];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldAccessTargetImpl
						.pattern_FieldAccessTarget_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch,
								mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
								mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ", "
							+ "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", " + "[mField] = " + mField
							+ ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[varAccess] = " + varAccess
							+ ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[varDeclFragToTField] = "
							+ varDeclFragToTField + ", " + "[varAccessToTAccess] = " + varAccessToTAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldAccessTargetImpl.pattern_FieldAccessTarget_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldAccessTargetImpl
							.pattern_FieldAccessTarget_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldAccessTargetImpl.pattern_FieldAccessTarget_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldAccessTargetImpl.pattern_FieldAccessTarget_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MDefinition mDefinition, MFieldDefinition mField,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mField", mField);
		match.registerObject("varAccess", varAccess);
		match.registerObject("varDeclFrag", varDeclFrag);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MDefinition mDefinition, MFieldDefinition mField,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
		isApplicableMatch.registerObject("mField", mField);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("varAccess", varAccess);
		isApplicableMatch.registerObject("varDeclFrag", varDeclFrag);
		isApplicableMatch.registerObject("varDeclFragToTField", varDeclFragToTField);
		isApplicableMatch.registerObject("varAccessToTAccess", varAccessToTAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mDefinition, EObject tDefinition,
			EObject tAccess, EObject tField, EObject mDefinitionToTDefinition, EObject mField, EObject mMethodToTMethod,
			EObject varAccess, EObject varDeclFrag, EObject varDeclFragToTField, EObject varAccessToTAccess) {
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
		ruleresult.registerObject("mField", mField);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("varAccess", varAccess);
		ruleresult.registerObject("varDeclFrag", varDeclFrag);
		ruleresult.registerObject("varDeclFragToTField", varDeclFragToTField);
		ruleresult.registerObject("varAccessToTAccess", varAccessToTAccess);

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
	public boolean isAppropriate_BWD(Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		// initial bindings
		Object[] result1_black = FieldAccessTargetImpl.pattern_FieldAccessTarget_10_1_initialbindings_blackBBBBB(this,
				match, tDefinition, tAccess, tField);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tDefinition, tAccess,
						tField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldAccessTargetImpl.pattern_FieldAccessTarget_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_10_4_collectelementstobetranslated_blackBBBB(match, tDefinition, tAccess,
							tField);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ", "
						+ "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ".");
			}
			FieldAccessTargetImpl.pattern_FieldAccessTarget_10_4_collectelementstobetranslated_greenBBBFF(match,
					tAccess, tField);
			// EMoflonEdge tField__tAccess____accessedBy = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tAccess__tField____tTarget = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_10_5_collectcontextelements_blackBBBB(match, tDefinition, tAccess,
							tField);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ", "
						+ "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ".");
			}
			FieldAccessTargetImpl.pattern_FieldAccessTarget_10_5_collectcontextelements_greenBBBBFF(match, tDefinition,
					tAccess, tField);
			// EMoflonEdge tDefinition__tAccess____tAccessing = (EMoflonEdge) result5_green[4];
			// EMoflonEdge tAccess__tDefinition____tSource = (EMoflonEdge) result5_green[5];

			// register objects to match
			FieldAccessTargetImpl.pattern_FieldAccessTarget_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tDefinition, tAccess, tField);
			return FieldAccessTargetImpl.pattern_FieldAccessTarget_10_7_expressionF();
		} else {
			return FieldAccessTargetImpl.pattern_FieldAccessTarget_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[0];
		TMember tDefinition = (TMember) result1_bindingAndBlack[1];
		TAccess tAccess = (TAccess) result1_bindingAndBlack[2];
		TFieldDefinition tField = (TFieldDefinition) result1_bindingAndBlack[3];
		MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result1_bindingAndBlack[4];
		MFieldDefinition mField = (MFieldDefinition) result1_bindingAndBlack[5];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[6];
		SingleVariableAccess varAccess = (SingleVariableAccess) result1_bindingAndBlack[7];
		VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result1_bindingAndBlack[8];
		VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) result1_bindingAndBlack[9];
		SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) result1_bindingAndBlack[10];
		// CSP csp = (CSP) result1_bindingAndBlack[11];
		FieldAccessTargetImpl.pattern_FieldAccessTarget_11_1_performtransformation_greenBB(varAccess, varDeclFrag);

		// collect translated elements
		Object[] result2_green = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, mDefinition,
						tDefinition, tAccess, tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess,
						varDeclFrag, varDeclFragToTField, varAccessToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[tAccess] = " + tAccess + ", " + "[tField] = " + tField
					+ ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", " + "[mField] = " + mField
					+ ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[varAccess] = " + varAccess + ", "
					+ "[varDeclFrag] = " + varDeclFrag + ", " + "[varDeclFragToTField] = " + varDeclFragToTField + ", "
					+ "[varAccessToTAccess] = " + varAccessToTAccess + ".");
		}
		FieldAccessTargetImpl.pattern_FieldAccessTarget_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, tAccess,
				tField, varAccess, varDeclFrag);
		// EMoflonEdge tField__tAccess____accessedBy = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tAccess__tField____tTarget = (EMoflonEdge) result3_green[6];
		// EMoflonEdge varAccess__varDeclFrag____variable = (EMoflonEdge) result3_green[7];
		// EMoflonEdge varDeclFrag__varAccess____usageInVariableAccess = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		FieldAccessTargetImpl.pattern_FieldAccessTarget_11_5_registerobjects_expressionBBBBBBBBBBBBB(this, ruleresult,
				mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField, mMethodToTMethod,
				varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);
		return FieldAccessTargetImpl.pattern_FieldAccessTarget_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldAccessTargetImpl.pattern_FieldAccessTarget_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tDefinition = (TMember) result2_binding[0];
		TAccess tAccess = (TAccess) result2_binding[1];
		TFieldDefinition tField = (TFieldDefinition) result2_binding[2];
		for (Object[] result2_black : FieldAccessTargetImpl
				.pattern_FieldAccessTarget_12_2_corematch_blackFBBBFFFFFFFB(tDefinition, tAccess, tField, match)) {
			MDefinition mDefinition = (MDefinition) result2_black[0];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[4];
			MFieldDefinition mField = (MFieldDefinition) result2_black[5];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[6];
			SingleVariableAccess varAccess = (SingleVariableAccess) result2_black[7];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_black[8];
			VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) result2_black[9];
			SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : FieldAccessTargetImpl
					.pattern_FieldAccessTarget_12_3_findcontext_blackBBBBBBBBBBB(mDefinition, tDefinition, tAccess,
							tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag,
							varDeclFragToTField, varAccessToTAccess)) {
				Object[] result3_green = FieldAccessTargetImpl
						.pattern_FieldAccessTarget_12_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(mDefinition,
								tDefinition, tAccess, tField, mDefinitionToTDefinition, mField, mMethodToTMethod,
								varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge mDefinition__varAccess____mAbstractFieldAccess = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tDefinition__tAccess____tAccessing = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tAccess__tDefinition____tSource = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tField__tAccess____accessedBy = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tAccess__tField____tTarget = (EMoflonEdge) result3_green[16];
				// EMoflonEdge mDefinitionToTDefinition__mDefinition____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge mDefinitionToTDefinition__tDefinition____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge mMethodToTMethod__mField____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge mMethodToTMethod__tField____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge varDeclFrag__mField____variablesContainer = (EMoflonEdge) result3_green[21];
				// EMoflonEdge mField__varDeclFrag____fragments = (EMoflonEdge) result3_green[22];
				// EMoflonEdge varDeclFragToTField__varDeclFrag____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge varDeclFragToTField__tField____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge varAccessToTAccess__varAccess____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge varAccessToTAccess__tAccess____target = (EMoflonEdge) result3_green[26];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldAccessTargetImpl
						.pattern_FieldAccessTarget_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch,
								mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
								mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ", "
							+ "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", " + "[mField] = " + mField
							+ ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[varAccess] = " + varAccess
							+ ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[varDeclFragToTField] = "
							+ varDeclFragToTField + ", " + "[varAccessToTAccess] = " + varAccessToTAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldAccessTargetImpl.pattern_FieldAccessTarget_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldAccessTargetImpl
							.pattern_FieldAccessTarget_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldAccessTargetImpl.pattern_FieldAccessTarget_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldAccessTargetImpl.pattern_FieldAccessTarget_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		match.registerObject("tDefinition", tDefinition);
		match.registerObject("tAccess", tAccess);
		match.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
		isApplicableMatch.registerObject("mField", mField);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("varAccess", varAccess);
		isApplicableMatch.registerObject("varDeclFrag", varDeclFrag);
		isApplicableMatch.registerObject("varDeclFragToTField", varDeclFragToTField);
		isApplicableMatch.registerObject("varAccessToTAccess", varAccessToTAccess);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mDefinition, EObject tDefinition,
			EObject tAccess, EObject tField, EObject mDefinitionToTDefinition, EObject mField, EObject mMethodToTMethod,
			EObject varAccess, EObject varDeclFrag, EObject varDeclFragToTField, EObject varAccessToTAccess) {
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
		ruleresult.registerObject("mField", mField);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("varAccess", varAccess);
		ruleresult.registerObject("varDeclFrag", varDeclFrag);
		ruleresult.registerObject("varDeclFragToTField", varDeclFragToTField);
		ruleresult.registerObject("varAccessToTAccess", varAccessToTAccess);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_46(EMoflonEdge _edge_variable) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldAccessTargetImpl.pattern_FieldAccessTarget_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldAccessTargetImpl
				.pattern_FieldAccessTarget_20_2_testcorematchandDECs_blackFFFFB(_edge_variable)) {
			MDefinition mDefinition = (MDefinition) result2_black[0];
			MFieldDefinition mField = (MFieldDefinition) result2_black[1];
			SingleVariableAccess varAccess = (SingleVariableAccess) result2_black[2];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_black[3];
			Object[] result2_green = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldAccessTargetImpl
					.pattern_FieldAccessTarget_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, mDefinition, mField, varAccess, varDeclFrag)) {
				// Ensure that the correct types of elements are matched
				if (FieldAccessTargetImpl
						.pattern_FieldAccessTarget_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldAccessTargetImpl
							.pattern_FieldAccessTarget_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldAccessTargetImpl.pattern_FieldAccessTarget_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldAccessTargetImpl.pattern_FieldAccessTarget_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_43(EMoflonEdge _edge_accessedBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldAccessTargetImpl.pattern_FieldAccessTarget_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldAccessTargetImpl
				.pattern_FieldAccessTarget_21_2_testcorematchandDECs_blackFFFB(_edge_accessedBy)) {
			TMember tDefinition = (TMember) result2_black[0];
			TAccess tAccess = (TAccess) result2_black[1];
			TFieldDefinition tField = (TFieldDefinition) result2_black[2];
			Object[] result2_green = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldAccessTargetImpl
					.pattern_FieldAccessTarget_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tDefinition, tAccess, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldAccessTargetImpl
						.pattern_FieldAccessTarget_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldAccessTargetImpl
							.pattern_FieldAccessTarget_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldAccessTargetImpl.pattern_FieldAccessTarget_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldAccessTargetImpl.pattern_FieldAccessTarget_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldAccessTarget");
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
		ruleResult.setRule("FieldAccessTarget");
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
		Object[] result1_black = FieldAccessTargetImpl.pattern_FieldAccessTarget_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldAccessTargetImpl.pattern_FieldAccessTarget_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_24_2_matchcontext_bindingFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result2_binding[0];
		TMember tDefinition = (TMember) result2_binding[1];
		TAccess tAccess = (TAccess) result2_binding[2];
		TFieldDefinition tField = (TFieldDefinition) result2_binding[3];
		MFieldDefinition mField = (MFieldDefinition) result2_binding[4];
		SingleVariableAccess varAccess = (SingleVariableAccess) result2_binding[5];
		VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_binding[6];
		for (Object[] result2_black : FieldAccessTargetImpl
				.pattern_FieldAccessTarget_24_2_matchcontext_blackBBBBFBFBBFFBB(mDefinition, tDefinition, tAccess,
						tField, mField, varAccess, varDeclFrag, sourceMatch, targetMatch)) {
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[4];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[6];
			VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) result2_black[9];
			SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) result2_black[10];
			Object[] result2_green = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_24_2_matchcontext_greenBBBBBBBBBBBBFB(mDefinition, tDefinition, tAccess,
							tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag,
							varDeclFragToTField, varAccessToTAccess, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[12];

			// check csp
			Object[] result3_bindingAndBlack = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBB(this, isApplicableMatch,
							mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
							mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess,
							sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = FieldAccessTargetImpl
						.pattern_FieldAccessTarget_24_4_createcorrespondence_blackBBBBBBBB(mDefinition, tDefinition,
								tAccess, tField, mField, varAccess, varDeclFrag, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ", "
							+ "[mField] = " + mField + ", " + "[varAccess] = " + varAccess + ", " + "[varDeclFrag] = "
							+ varDeclFrag + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = FieldAccessTargetImpl
						.pattern_FieldAccessTarget_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldAccessTargetImpl.pattern_FieldAccessTarget_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return FieldAccessTargetImpl.pattern_FieldAccessTarget_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
		isApplicableMatch.registerObject("mField", mField);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("varAccess", varAccess);
		isApplicableMatch.registerObject("varDeclFrag", varDeclFrag);
		isApplicableMatch.registerObject("varDeclFragToTField", varDeclFragToTField);
		isApplicableMatch.registerObject("varAccessToTAccess", varAccessToTAccess);
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
	public boolean checkDEC_FWD(MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag) {// match tgg pattern
		Object[] result1_black = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_27_1_matchtggpattern_blackBBBB(mDefinition, mField, varAccess, varDeclFrag);
		if (result1_black != null) {
			return FieldAccessTargetImpl.pattern_FieldAccessTarget_27_2_expressionF();
		} else {
			return FieldAccessTargetImpl.pattern_FieldAccessTarget_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {// match tgg pattern
		Object[] result1_black = FieldAccessTargetImpl
				.pattern_FieldAccessTarget_28_1_matchtggpattern_blackBBB(tDefinition, tAccess, tField);
		if (result1_black != null) {
			return FieldAccessTargetImpl.pattern_FieldAccessTarget_28_2_expressionF();
		} else {
			return FieldAccessTargetImpl.pattern_FieldAccessTarget_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			SingleVariableAccessToTAccess varAccessToTAccessParameter, MDefinitionToTMember mMethodToTMethodParameter) {
		// create result
		Object[] result1_black = FieldAccessTargetImpl.pattern_FieldAccessTarget_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldAccessTargetImpl.pattern_FieldAccessTarget_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : FieldAccessTargetImpl
				.pattern_FieldAccessTarget_29_2_isapplicablecore_blackFFFFFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList varAccessToTAccessList = (RuleEntryList) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			SingleVariableAccess varAccess = (SingleVariableAccess) result2_black[2];
			SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) result2_black[3];
			TAccess tAccess = (TAccess) result2_black[4];
			TMember tDefinition = (TMember) result2_black[5];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[6];
			// RuleEntryList mMethodToTMethodList = (RuleEntryList) result2_black[7];
			TFieldDefinition tField = (TFieldDefinition) result2_black[8];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[9];
			MFieldDefinition mField = (MFieldDefinition) result2_black[10];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_black[11];
			VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) result2_black[12];

			// solve CSP
			Object[] result3_bindingAndBlack = FieldAccessTargetImpl
					.pattern_FieldAccessTarget_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBBB(this, isApplicableMatch,
							mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
							mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinition] = "
						+ mDefinition + ", " + "[tDefinition] = " + tDefinition + ", " + "[tAccess] = " + tAccess + ", "
						+ "[tField] = " + tField + ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition
						+ ", " + "[mField] = " + mField + ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", "
						+ "[varAccess] = " + varAccess + ", " + "[varDeclFrag] = " + varDeclFrag + ", "
						+ "[varDeclFragToTField] = " + varDeclFragToTField + ", " + "[varAccessToTAccess] = "
						+ varAccessToTAccess + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (FieldAccessTargetImpl.pattern_FieldAccessTarget_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = FieldAccessTargetImpl
						.pattern_FieldAccessTarget_29_5_checknacs_blackBBBBBBBBBBB(mDefinition, tDefinition, tAccess,
								tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag,
								varDeclFragToTField, varAccessToTAccess);
				if (result5_black != null) {

					// perform
					Object[] result6_black = FieldAccessTargetImpl
							.pattern_FieldAccessTarget_29_6_perform_blackBBBBBBBBBBBB(mDefinition, tDefinition, tAccess,
									tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag,
									varDeclFragToTField, varAccessToTAccess, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
								+ "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ", "
								+ "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", " + "[mField] = "
								+ mField + ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[varAccess] = "
								+ varAccess + ", " + "[varDeclFrag] = " + varDeclFrag + ", "
								+ "[varDeclFragToTField] = " + varDeclFragToTField + ", " + "[varAccessToTAccess] = "
								+ varAccessToTAccess + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldAccessTargetImpl.pattern_FieldAccessTarget_29_6_perform_greenBBBBB(tAccess, tField, varAccess,
							varDeclFrag, ruleResult);

				} else {
				}

			} else {
			}

		}
		return FieldAccessTargetImpl.pattern_FieldAccessTarget_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
		isApplicableMatch.registerObject("mField", mField);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("varAccess", varAccess);
		isApplicableMatch.registerObject("varDeclFrag", varDeclFrag);
		isApplicableMatch.registerObject("varDeclFragToTField", varDeclFragToTField);
		isApplicableMatch.registerObject("varAccessToTAccess", varAccessToTAccess);
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
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPROPRIATE_FWD__MATCH_MDEFINITION_MFIELDDEFINITION_SINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (SingleVariableAccess) arguments.get(3),
					(VariableDeclarationFragment) arguments.get(4));
		case RulesPackage.FIELD_ACCESS_TARGET___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MDEFINITION_MFIELDDEFINITION_SINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (SingleVariableAccess) arguments.get(3),
					(VariableDeclarationFragment) arguments.get(4));
			return null;
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MDEFINITION_MFIELDDEFINITION_SINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (SingleVariableAccess) arguments.get(3),
					(VariableDeclarationFragment) arguments.get(4));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MDEFINITION_TMEMBER_TACCESS_TFIELDDEFINITION_MDEFINITIONTOTMEMBER_MFIELDDEFINITION_MDEFINITIONTOTMEMBER_SINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_VARIABLEDECLARATIONFRAGMENTTOTFIELDDEFINITION_SINGLEVARIABLEACCESSTOTACCESS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
					(TMember) arguments.get(2), (TAccess) arguments.get(3), (TFieldDefinition) arguments.get(4),
					(MDefinitionToTMember) arguments.get(5), (MFieldDefinition) arguments.get(6),
					(MDefinitionToTMember) arguments.get(7), (SingleVariableAccess) arguments.get(8),
					(VariableDeclarationFragment) arguments.get(9),
					(VariableDeclarationFragmentToTFieldDefinition) arguments.get(10),
					(SingleVariableAccessToTAccess) arguments.get(11));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.FIELD_ACCESS_TARGET___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TACCESS_TFIELDDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TAccess) arguments.get(2),
					(TFieldDefinition) arguments.get(3));
		case RulesPackage.FIELD_ACCESS_TARGET___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TACCESS_TFIELDDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TAccess) arguments.get(2),
					(TFieldDefinition) arguments.get(3));
			return null;
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TACCESS_TFIELDDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TAccess) arguments.get(2), (TFieldDefinition) arguments.get(3));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITION_TMEMBER_TACCESS_TFIELDDEFINITION_MDEFINITIONTOTMEMBER_MFIELDDEFINITION_MDEFINITIONTOTMEMBER_SINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_VARIABLEDECLARATIONFRAGMENTTOTFIELDDEFINITION_SINGLEVARIABLEACCESSTOTACCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
					(TMember) arguments.get(2), (TAccess) arguments.get(3), (TFieldDefinition) arguments.get(4),
					(MDefinitionToTMember) arguments.get(5), (MFieldDefinition) arguments.get(6),
					(MDefinitionToTMember) arguments.get(7), (SingleVariableAccess) arguments.get(8),
					(VariableDeclarationFragment) arguments.get(9),
					(VariableDeclarationFragmentToTFieldDefinition) arguments.get(10),
					(SingleVariableAccessToTAccess) arguments.get(11));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.FIELD_ACCESS_TARGET___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPROPRIATE_FWD_EMOFLON_EDGE_46__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_46((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPROPRIATE_BWD_EMOFLON_EDGE_43__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_43((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MDEFINITION_TMEMBER_TACCESS_TFIELDDEFINITION_MDEFINITIONTOTMEMBER_MFIELDDEFINITION_MDEFINITIONTOTMEMBER_SINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_VARIABLEDECLARATIONFRAGMENTTOTFIELDDEFINITION_SINGLEVARIABLEACCESSTOTACCESS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MDefinition) arguments.get(1),
					(TMember) arguments.get(2), (TAccess) arguments.get(3), (TFieldDefinition) arguments.get(4),
					(MDefinitionToTMember) arguments.get(5), (MFieldDefinition) arguments.get(6),
					(MDefinitionToTMember) arguments.get(7), (SingleVariableAccess) arguments.get(8),
					(VariableDeclarationFragment) arguments.get(9),
					(VariableDeclarationFragmentToTFieldDefinition) arguments.get(10),
					(SingleVariableAccessToTAccess) arguments.get(11), (Match) arguments.get(12),
					(Match) arguments.get(13));
		case RulesPackage.FIELD_ACCESS_TARGET___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_TARGET___CHECK_DEC_FWD__MDEFINITION_MFIELDDEFINITION_SINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT:
			return checkDEC_FWD((MDefinition) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(SingleVariableAccess) arguments.get(2), (VariableDeclarationFragment) arguments.get(3));
		case RulesPackage.FIELD_ACCESS_TARGET___CHECK_DEC_BWD__TMEMBER_TACCESS_TFIELDDEFINITION:
			return checkDEC_BWD((TMember) arguments.get(0), (TAccess) arguments.get(1),
					(TFieldDefinition) arguments.get(2));
		case RulesPackage.FIELD_ACCESS_TARGET___GENERATE_MODEL__RULEENTRYCONTAINER_SINGLEVARIABLEACCESSTOTACCESS_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SingleVariableAccessToTAccess) arguments.get(1), (MDefinitionToTMember) arguments.get(2));
		case RulesPackage.FIELD_ACCESS_TARGET___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITION_TMEMBER_TACCESS_TFIELDDEFINITION_MDEFINITIONTOTMEMBER_MFIELDDEFINITION_MDEFINITIONTOTMEMBER_SINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_VARIABLEDECLARATIONFRAGMENTTOTFIELDDEFINITION_SINGLEVARIABLEACCESSTOTACCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
					(TMember) arguments.get(2), (TAccess) arguments.get(3), (TFieldDefinition) arguments.get(4),
					(MDefinitionToTMember) arguments.get(5), (MFieldDefinition) arguments.get(6),
					(MDefinitionToTMember) arguments.get(7), (SingleVariableAccess) arguments.get(8),
					(VariableDeclarationFragment) arguments.get(9),
					(VariableDeclarationFragmentToTFieldDefinition) arguments.get(10),
					(SingleVariableAccessToTAccess) arguments.get(11), (ModelgeneratorRuleResult) arguments.get(12));
		case RulesPackage.FIELD_ACCESS_TARGET___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldAccessTarget_0_1_initialbindings_blackBBBBBB(FieldAccessTarget _this,
			Match match, MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag) {
		if (!mDefinition.equals(mField)) {
			return new Object[] { _this, match, mDefinition, mField, varAccess, varDeclFrag };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_0_2_SolveCSP_bindingFBBBBBB(FieldAccessTarget _this,
			Match match, MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mField, varAccess, varDeclFrag);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mField, varAccess, varDeclFrag };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessTarget_0_2_SolveCSP_bindingAndBlackFBBBBBB(FieldAccessTarget _this,
			Match match, MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag) {
		Object[] result_pattern_FieldAccessTarget_0_2_SolveCSP_binding = pattern_FieldAccessTarget_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mDefinition, mField, varAccess, varDeclFrag);
		if (result_pattern_FieldAccessTarget_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessTarget_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldAccessTarget_0_2_SolveCSP_black = pattern_FieldAccessTarget_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessTarget_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mField, varAccess, varDeclFrag };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessTarget_0_3_CheckCSP_expressionFBB(FieldAccessTarget _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag) {
		if (!mDefinition.equals(mField)) {
			return new Object[] { match, mDefinition, mField, varAccess, varDeclFrag };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag) {
		EMoflonEdge varAccess__varDeclFrag____variable = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__varAccess____usageInVariableAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String varAccess__varDeclFrag____variable_name_prime = "variable";
		String varDeclFrag__varAccess____usageInVariableAccess_name_prime = "usageInVariableAccess";
		varAccess__varDeclFrag____variable.setSrc(varAccess);
		varAccess__varDeclFrag____variable.setTrg(varDeclFrag);
		match.getToBeTranslatedEdges().add(varAccess__varDeclFrag____variable);
		varDeclFrag__varAccess____usageInVariableAccess.setSrc(varDeclFrag);
		varDeclFrag__varAccess____usageInVariableAccess.setTrg(varAccess);
		match.getToBeTranslatedEdges().add(varDeclFrag__varAccess____usageInVariableAccess);
		varAccess__varDeclFrag____variable.setName(varAccess__varDeclFrag____variable_name_prime);
		varDeclFrag__varAccess____usageInVariableAccess
				.setName(varDeclFrag__varAccess____usageInVariableAccess_name_prime);
		return new Object[] { match, varAccess, varDeclFrag, varAccess__varDeclFrag____variable,
				varDeclFrag__varAccess____usageInVariableAccess };
	}

	public static final Object[] pattern_FieldAccessTarget_0_5_collectcontextelements_blackBBBBB(Match match,
			MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag) {
		if (!mDefinition.equals(mField)) {
			return new Object[] { match, mDefinition, mField, varAccess, varDeclFrag };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_0_5_collectcontextelements_greenBBBBBFFF(Match match,
			MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag) {
		EMoflonEdge mDefinition__varAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__mField____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mField__varDeclFrag____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mField);
		match.getContextNodes().add(varAccess);
		match.getContextNodes().add(varDeclFrag);
		String mDefinition__varAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String varDeclFrag__mField____variablesContainer_name_prime = "variablesContainer";
		String mField__varDeclFrag____fragments_name_prime = "fragments";
		mDefinition__varAccess____mAbstractFieldAccess.setSrc(mDefinition);
		mDefinition__varAccess____mAbstractFieldAccess.setTrg(varAccess);
		match.getContextEdges().add(mDefinition__varAccess____mAbstractFieldAccess);
		varDeclFrag__mField____variablesContainer.setSrc(varDeclFrag);
		varDeclFrag__mField____variablesContainer.setTrg(mField);
		match.getContextEdges().add(varDeclFrag__mField____variablesContainer);
		mField__varDeclFrag____fragments.setSrc(mField);
		mField__varDeclFrag____fragments.setTrg(varDeclFrag);
		match.getContextEdges().add(mField__varDeclFrag____fragments);
		mDefinition__varAccess____mAbstractFieldAccess
				.setName(mDefinition__varAccess____mAbstractFieldAccess_name_prime);
		varDeclFrag__mField____variablesContainer.setName(varDeclFrag__mField____variablesContainer_name_prime);
		mField__varDeclFrag____fragments.setName(mField__varDeclFrag____fragments_name_prime);
		return new Object[] { match, mDefinition, mField, varAccess, varDeclFrag,
				mDefinition__varAccess____mAbstractFieldAccess, varDeclFrag__mField____variablesContainer,
				mField__varDeclFrag____fragments };
	}

	public static final void pattern_FieldAccessTarget_0_6_registerobjectstomatch_expressionBBBBBB(
			FieldAccessTarget _this, Match match, MDefinition mDefinition, MFieldDefinition mField,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mField, varAccess, varDeclFrag);

	}

	public static final boolean pattern_FieldAccessTarget_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessTarget_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_1_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tField");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinitionToTDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mField");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_7 = isApplicableMatch.getObject("varAccess");
		EObject _localVariable_8 = isApplicableMatch.getObject("varDeclFrag");
		EObject _localVariable_9 = isApplicableMatch.getObject("varDeclFragToTField");
		EObject _localVariable_10 = isApplicableMatch.getObject("varAccessToTAccess");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpTDefinition = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		EObject tmpMDefinitionToTDefinition = _localVariable_4;
		EObject tmpMField = _localVariable_5;
		EObject tmpMMethodToTMethod = _localVariable_6;
		EObject tmpVarAccess = _localVariable_7;
		EObject tmpVarDeclFrag = _localVariable_8;
		EObject tmpVarDeclFragToTField = _localVariable_9;
		EObject tmpVarAccessToTAccess = _localVariable_10;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tmpTAccess instanceof TAccess) {
					TAccess tAccess = (TAccess) tmpTAccess;
					if (tmpTField instanceof TFieldDefinition) {
						TFieldDefinition tField = (TFieldDefinition) tmpTField;
						if (tmpMDefinitionToTDefinition instanceof MDefinitionToTMember) {
							MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) tmpMDefinitionToTDefinition;
							if (tmpMField instanceof MFieldDefinition) {
								MFieldDefinition mField = (MFieldDefinition) tmpMField;
								if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
									MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
									if (tmpVarAccess instanceof SingleVariableAccess) {
										SingleVariableAccess varAccess = (SingleVariableAccess) tmpVarAccess;
										if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
											VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
											if (tmpVarDeclFragToTField instanceof VariableDeclarationFragmentToTFieldDefinition) {
												VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) tmpVarDeclFragToTField;
												if (tmpVarAccessToTAccess instanceof SingleVariableAccessToTAccess) {
													SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) tmpVarAccessToTAccess;
													return new Object[] { mDefinition, tDefinition, tAccess, tField,
															mDefinitionToTDefinition, mField, mMethodToTMethod,
															varAccess, varDeclFrag, varDeclFragToTField,
															varAccessToTAccess, isApplicableMatch };
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

	public static final Object[] pattern_FieldAccessTarget_1_1_performtransformation_blackBBBBBBBBBBBFBB(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, FieldAccessTarget _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mDefinition.equals(mField)) {
			if (!tDefinition.equals(tField)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition,
									mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
									varAccessToTAccess, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			FieldAccessTarget _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldAccessTarget_1_1_performtransformation_binding = pattern_FieldAccessTarget_1_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldAccessTarget_1_1_performtransformation_binding != null) {
			MDefinition mDefinition = (MDefinition) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[0];
			TMember tDefinition = (TMember) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[1];
			TAccess tAccess = (TAccess) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[2];
			TFieldDefinition tField = (TFieldDefinition) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[3];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[4];
			MFieldDefinition mField = (MFieldDefinition) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[5];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[6];
			SingleVariableAccess varAccess = (SingleVariableAccess) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[7];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[8];
			VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[9];
			SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) result_pattern_FieldAccessTarget_1_1_performtransformation_binding[10];

			Object[] result_pattern_FieldAccessTarget_1_1_performtransformation_black = pattern_FieldAccessTarget_1_1_performtransformation_blackBBBBBBBBBBBFBB(
					mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField, mMethodToTMethod,
					varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, _this, isApplicableMatch);
			if (result_pattern_FieldAccessTarget_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldAccessTarget_1_1_performtransformation_black[11];

				return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
						mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_1_1_performtransformation_greenBB(TAccess tAccess,
			TFieldDefinition tField) {
		tField.getAccessedBy().add(tAccess);
		return new Object[] { tAccess, tField };
	}

	public static final Object[] pattern_FieldAccessTarget_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_FieldAccessTarget_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinition, EObject tDefinition, EObject tAccess, EObject tField,
			EObject mDefinitionToTDefinition, EObject mField, EObject mMethodToTMethod, EObject varAccess,
			EObject varDeclFrag, EObject varDeclFragToTField, EObject varAccessToTAccess) {
		if (!mDefinition.equals(tDefinition)) {
			if (!mDefinition.equals(tAccess)) {
				if (!mDefinition.equals(tField)) {
					if (!mDefinition.equals(mDefinitionToTDefinition)) {
						if (!mDefinition.equals(mField)) {
							if (!mDefinition.equals(mMethodToTMethod)) {
								if (!mDefinition.equals(varAccess)) {
									if (!mDefinition.equals(varDeclFrag)) {
										if (!mDefinition.equals(varDeclFragToTField)) {
											if (!mDefinition.equals(varAccessToTAccess)) {
												if (!tDefinition.equals(tField)) {
													if (!tDefinition.equals(varAccess)) {
														if (!tDefinition.equals(varDeclFrag)) {
															if (!tDefinition.equals(varDeclFragToTField)) {
																if (!tDefinition.equals(varAccessToTAccess)) {
																	if (!tAccess.equals(tDefinition)) {
																		if (!tAccess.equals(tField)) {
																			if (!tAccess.equals(varAccess)) {
																				if (!tAccess.equals(varDeclFrag)) {
																					if (!tAccess.equals(
																							varDeclFragToTField)) {
																						if (!tAccess.equals(
																								varAccessToTAccess)) {
																							if (!tField.equals(
																									varAccess)) {
																								if (!tField.equals(
																										varDeclFrag)) {
																									if (!tField.equals(
																											varDeclFragToTField)) {
																										if (!tField
																												.equals(varAccessToTAccess)) {
																											if (!mDefinitionToTDefinition
																													.equals(tDefinition)) {
																												if (!mDefinitionToTDefinition
																														.equals(tAccess)) {
																													if (!mDefinitionToTDefinition
																															.equals(tField)) {
																														if (!mDefinitionToTDefinition
																																.equals(mField)) {
																															if (!mDefinitionToTDefinition
																																	.equals(mMethodToTMethod)) {
																																if (!mDefinitionToTDefinition
																																		.equals(varAccess)) {
																																	if (!mDefinitionToTDefinition
																																			.equals(varDeclFrag)) {
																																		if (!mDefinitionToTDefinition
																																				.equals(varDeclFragToTField)) {
																																			if (!mDefinitionToTDefinition
																																					.equals(varAccessToTAccess)) {
																																				if (!mField
																																						.equals(tDefinition)) {
																																					if (!mField
																																							.equals(tAccess)) {
																																						if (!mField
																																								.equals(tField)) {
																																							if (!mField
																																									.equals(mMethodToTMethod)) {
																																								if (!mField
																																										.equals(varAccess)) {
																																									if (!mField
																																											.equals(varDeclFrag)) {
																																										if (!mField
																																												.equals(varDeclFragToTField)) {
																																											if (!mField
																																													.equals(varAccessToTAccess)) {
																																												if (!mMethodToTMethod
																																														.equals(tDefinition)) {
																																													if (!mMethodToTMethod
																																															.equals(tAccess)) {
																																														if (!mMethodToTMethod
																																																.equals(tField)) {
																																															if (!mMethodToTMethod
																																																	.equals(varAccess)) {
																																																if (!mMethodToTMethod
																																																		.equals(varDeclFrag)) {
																																																	if (!mMethodToTMethod
																																																			.equals(varDeclFragToTField)) {
																																																		if (!mMethodToTMethod
																																																				.equals(varAccessToTAccess)) {
																																																			if (!varAccess
																																																					.equals(varDeclFrag)) {
																																																				if (!varAccess
																																																						.equals(varDeclFragToTField)) {
																																																					if (!varAccess
																																																							.equals(varAccessToTAccess)) {
																																																						if (!varDeclFrag
																																																								.equals(varDeclFragToTField)) {
																																																							if (!varAccessToTAccess
																																																									.equals(varDeclFrag)) {
																																																								if (!varAccessToTAccess
																																																										.equals(varDeclFragToTField)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											mDefinition,
																																																											tDefinition,
																																																											tAccess,
																																																											tField,
																																																											mDefinitionToTDefinition,
																																																											mField,
																																																											mMethodToTMethod,
																																																											varAccess,
																																																											varDeclFrag,
																																																											varDeclFragToTField,
																																																											varAccessToTAccess };
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

	public static final Object[] pattern_FieldAccessTarget_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tAccess, EObject tField, EObject varAccess, EObject varDeclFrag) {
		EMoflonEdge tField__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tField____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varAccess__varDeclFrag____variable = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__varAccess____usageInVariableAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldAccessTarget";
		String tField__tAccess____accessedBy_name_prime = "accessedBy";
		String tAccess__tField____tTarget_name_prime = "tTarget";
		String varAccess__varDeclFrag____variable_name_prime = "variable";
		String varDeclFrag__varAccess____usageInVariableAccess_name_prime = "usageInVariableAccess";
		tField__tAccess____accessedBy.setSrc(tField);
		tField__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tField__tAccess____accessedBy);
		tAccess__tField____tTarget.setSrc(tAccess);
		tAccess__tField____tTarget.setTrg(tField);
		ruleresult.getCreatedEdges().add(tAccess__tField____tTarget);
		varAccess__varDeclFrag____variable.setSrc(varAccess);
		varAccess__varDeclFrag____variable.setTrg(varDeclFrag);
		ruleresult.getTranslatedEdges().add(varAccess__varDeclFrag____variable);
		varDeclFrag__varAccess____usageInVariableAccess.setSrc(varDeclFrag);
		varDeclFrag__varAccess____usageInVariableAccess.setTrg(varAccess);
		ruleresult.getTranslatedEdges().add(varDeclFrag__varAccess____usageInVariableAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tField__tAccess____accessedBy.setName(tField__tAccess____accessedBy_name_prime);
		tAccess__tField____tTarget.setName(tAccess__tField____tTarget_name_prime);
		varAccess__varDeclFrag____variable.setName(varAccess__varDeclFrag____variable_name_prime);
		varDeclFrag__varAccess____usageInVariableAccess
				.setName(varDeclFrag__varAccess____usageInVariableAccess_name_prime);
		return new Object[] { ruleresult, tAccess, tField, varAccess, varDeclFrag, tField__tAccess____accessedBy,
				tAccess__tField____tTarget, varAccess__varDeclFrag____variable,
				varDeclFrag__varAccess____usageInVariableAccess };
	}

	public static final void pattern_FieldAccessTarget_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			FieldAccessTarget _this, PerformRuleResult ruleresult, EObject mDefinition, EObject tDefinition,
			EObject tAccess, EObject tField, EObject mDefinitionToTDefinition, EObject mField, EObject mMethodToTMethod,
			EObject varAccess, EObject varDeclFrag, EObject varDeclFragToTField, EObject varAccessToTAccess) {
		_this.registerObjects_FWD(ruleresult, mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition,
				mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);

	}

	public static final PerformRuleResult pattern_FieldAccessTarget_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_2_1_preparereturnvalue_bindingFB(FieldAccessTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldAccessTarget _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldAccessTarget _this) {
		Object[] result_pattern_FieldAccessTarget_2_1_preparereturnvalue_binding = pattern_FieldAccessTarget_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessTarget_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldAccessTarget_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessTarget_2_1_preparereturnvalue_black = pattern_FieldAccessTarget_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldAccessTarget_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldAccessTarget_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldAccessTarget";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldAccessTarget_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mField");
		EObject _localVariable_2 = match.getObject("varAccess");
		EObject _localVariable_3 = match.getObject("varDeclFrag");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMField = _localVariable_1;
		EObject tmpVarAccess = _localVariable_2;
		EObject tmpVarDeclFrag = _localVariable_3;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpMField instanceof MFieldDefinition) {
				MFieldDefinition mField = (MFieldDefinition) tmpMField;
				if (tmpVarAccess instanceof SingleVariableAccess) {
					SingleVariableAccess varAccess = (SingleVariableAccess) tmpVarAccess;
					if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
						VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
						return new Object[] { mDefinition, mField, varAccess, varDeclFrag, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessTarget_2_2_corematch_blackBFFFFBFBBFFB(
			MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mDefinition.equals(mField)) {
			for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
				TMember tDefinition = mDefinitionToTDefinition.getTarget();
				if (tDefinition != null) {
					for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mField, MDefinitionToTMember.class, "source")) {
						if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
							TMember tmpTField = mMethodToTMethod.getTarget();
							if (tmpTField instanceof TFieldDefinition) {
								TFieldDefinition tField = (TFieldDefinition) tmpTField;
								if (!tDefinition.equals(tField)) {
									for (VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(varDeclFrag,
													VariableDeclarationFragmentToTFieldDefinition.class, "source")) {
										if (tField.equals(varDeclFragToTField.getTarget())) {
											for (SingleVariableAccessToTAccess varAccessToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(varAccess,
															SingleVariableAccessToTAccess.class, "source")) {
												TAccess tAccess = varAccessToTAccess.getTarget();
												if (tAccess != null) {
													_result.add(new Object[] { mDefinition, tDefinition, tAccess,
															tField, mDefinitionToTDefinition, mField, mMethodToTMethod,
															varAccess, varDeclFrag, varDeclFragToTField,
															varAccessToTAccess, match });
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

	public static final Iterable<Object[]> pattern_FieldAccessTarget_2_3_findcontext_blackBBBBBBBBBBB(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mDefinition.equals(mField)) {
			if (!tDefinition.equals(tField)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					if (mDefinition.getMAbstractFieldAccess().contains(varAccess)) {
						if (tDefinition.getTAccessing().contains(tAccess)) {
							if (mDefinition.equals(mDefinitionToTDefinition.getSource())) {
								if (tDefinition.equals(mDefinitionToTDefinition.getTarget())) {
									if (mField.equals(mMethodToTMethod.getSource())) {
										if (tField.equals(mMethodToTMethod.getTarget())) {
											if (varDeclFrag.equals(varAccess.getVariable())) {
												if (mField.equals(varDeclFrag.getVariablesContainer())) {
													if (varDeclFrag.equals(varDeclFragToTField.getSource())) {
														if (tField.equals(varDeclFragToTField.getTarget())) {
															if (varAccess.equals(varAccessToTAccess.getSource())) {
																if (tAccess.equals(varAccessToTAccess.getTarget())) {
																	_result.add(new Object[] { mDefinition, tDefinition,
																			tAccess, tField, mDefinitionToTDefinition,
																			mField, mMethodToTMethod, varAccess,
																			varDeclFrag, varDeclFragToTField,
																			varAccessToTAccess });
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

	public static final Object[] pattern_FieldAccessTarget_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mDefinition__varAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tDefinition____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mField____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varAccess__varDeclFrag____variable = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__varAccess____usageInVariableAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__mField____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mField__varDeclFrag____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragToTField__varDeclFrag____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varAccessToTAccess__varAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varAccessToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mDefinition__varAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String tDefinition__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tDefinition____tSource_name_prime = "tSource";
		String mDefinitionToTDefinition__mDefinition____source_name_prime = "source";
		String mDefinitionToTDefinition__tDefinition____target_name_prime = "target";
		String mMethodToTMethod__mField____source_name_prime = "source";
		String mMethodToTMethod__tField____target_name_prime = "target";
		String varAccess__varDeclFrag____variable_name_prime = "variable";
		String varDeclFrag__varAccess____usageInVariableAccess_name_prime = "usageInVariableAccess";
		String varDeclFrag__mField____variablesContainer_name_prime = "variablesContainer";
		String mField__varDeclFrag____fragments_name_prime = "fragments";
		String varDeclFragToTField__varDeclFrag____source_name_prime = "source";
		String varDeclFragToTField__tField____target_name_prime = "target";
		String varAccessToTAccess__varAccess____source_name_prime = "source";
		String varAccessToTAccess__tAccess____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		isApplicableMatch.getAllContextElements().add(mField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(varAccess);
		isApplicableMatch.getAllContextElements().add(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(varDeclFragToTField);
		isApplicableMatch.getAllContextElements().add(varAccessToTAccess);
		mDefinition__varAccess____mAbstractFieldAccess.setSrc(mDefinition);
		mDefinition__varAccess____mAbstractFieldAccess.setTrg(varAccess);
		isApplicableMatch.getAllContextElements().add(mDefinition__varAccess____mAbstractFieldAccess);
		tDefinition__tAccess____tAccessing.setSrc(tDefinition);
		tDefinition__tAccess____tAccessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tDefinition__tAccess____tAccessing);
		tAccess__tDefinition____tSource.setSrc(tAccess);
		tAccess__tDefinition____tSource.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAccess__tDefinition____tSource);
		mDefinitionToTDefinition__mDefinition____source.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition__mDefinition____source);
		mDefinitionToTDefinition__tDefinition____target.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition__tDefinition____target);
		mMethodToTMethod__mField____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mField____source.setTrg(mField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mField____source);
		mMethodToTMethod__tField____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tField____target);
		varAccess__varDeclFrag____variable.setSrc(varAccess);
		varAccess__varDeclFrag____variable.setTrg(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(varAccess__varDeclFrag____variable);
		varDeclFrag__varAccess____usageInVariableAccess.setSrc(varDeclFrag);
		varDeclFrag__varAccess____usageInVariableAccess.setTrg(varAccess);
		isApplicableMatch.getAllContextElements().add(varDeclFrag__varAccess____usageInVariableAccess);
		varDeclFrag__mField____variablesContainer.setSrc(varDeclFrag);
		varDeclFrag__mField____variablesContainer.setTrg(mField);
		isApplicableMatch.getAllContextElements().add(varDeclFrag__mField____variablesContainer);
		mField__varDeclFrag____fragments.setSrc(mField);
		mField__varDeclFrag____fragments.setTrg(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(mField__varDeclFrag____fragments);
		varDeclFragToTField__varDeclFrag____source.setSrc(varDeclFragToTField);
		varDeclFragToTField__varDeclFrag____source.setTrg(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(varDeclFragToTField__varDeclFrag____source);
		varDeclFragToTField__tField____target.setSrc(varDeclFragToTField);
		varDeclFragToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(varDeclFragToTField__tField____target);
		varAccessToTAccess__varAccess____source.setSrc(varAccessToTAccess);
		varAccessToTAccess__varAccess____source.setTrg(varAccess);
		isApplicableMatch.getAllContextElements().add(varAccessToTAccess__varAccess____source);
		varAccessToTAccess__tAccess____target.setSrc(varAccessToTAccess);
		varAccessToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(varAccessToTAccess__tAccess____target);
		mDefinition__varAccess____mAbstractFieldAccess
				.setName(mDefinition__varAccess____mAbstractFieldAccess_name_prime);
		tDefinition__tAccess____tAccessing.setName(tDefinition__tAccess____tAccessing_name_prime);
		tAccess__tDefinition____tSource.setName(tAccess__tDefinition____tSource_name_prime);
		mDefinitionToTDefinition__mDefinition____source
				.setName(mDefinitionToTDefinition__mDefinition____source_name_prime);
		mDefinitionToTDefinition__tDefinition____target
				.setName(mDefinitionToTDefinition__tDefinition____target_name_prime);
		mMethodToTMethod__mField____source.setName(mMethodToTMethod__mField____source_name_prime);
		mMethodToTMethod__tField____target.setName(mMethodToTMethod__tField____target_name_prime);
		varAccess__varDeclFrag____variable.setName(varAccess__varDeclFrag____variable_name_prime);
		varDeclFrag__varAccess____usageInVariableAccess
				.setName(varDeclFrag__varAccess____usageInVariableAccess_name_prime);
		varDeclFrag__mField____variablesContainer.setName(varDeclFrag__mField____variablesContainer_name_prime);
		mField__varDeclFrag____fragments.setName(mField__varDeclFrag____fragments_name_prime);
		varDeclFragToTField__varDeclFrag____source.setName(varDeclFragToTField__varDeclFrag____source_name_prime);
		varDeclFragToTField__tField____target.setName(varDeclFragToTField__tField____target_name_prime);
		varAccessToTAccess__varAccess____source.setName(varAccessToTAccess__varAccess____source_name_prime);
		varAccessToTAccess__tAccess____target.setName(varAccessToTAccess__tAccess____target_name_prime);
		return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
				mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, isApplicableMatch,
				mDefinition__varAccess____mAbstractFieldAccess, tDefinition__tAccess____tAccessing,
				tAccess__tDefinition____tSource, mDefinitionToTDefinition__mDefinition____source,
				mDefinitionToTDefinition__tDefinition____target, mMethodToTMethod__mField____source,
				mMethodToTMethod__tField____target, varAccess__varDeclFrag____variable,
				varDeclFrag__varAccess____usageInVariableAccess, varDeclFrag__mField____variablesContainer,
				mField__varDeclFrag____fragments, varDeclFragToTField__varDeclFrag____source,
				varDeclFragToTField__tField____target, varAccessToTAccess__varAccess____source,
				varAccessToTAccess__tAccess____target };
	}

	public static final Object[] pattern_FieldAccessTarget_2_4_solveCSP_bindingFBBBBBBBBBBBBB(FieldAccessTarget _this,
			IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition, TAccess tAccess,
			TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mDefinition, tDefinition, tAccess,
				tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
				varAccessToTAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField,
					mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
					varAccessToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessTarget_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			FieldAccessTarget _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		Object[] result_pattern_FieldAccessTarget_2_4_solveCSP_binding = pattern_FieldAccessTarget_2_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
				mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);
		if (result_pattern_FieldAccessTarget_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessTarget_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessTarget_2_4_solveCSP_black = pattern_FieldAccessTarget_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessTarget_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField,
						mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
						varAccessToTAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessTarget_2_5_checkCSP_expressionFBB(FieldAccessTarget _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessTarget_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldAccessTarget";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessTarget_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_10_1_initialbindings_blackBBBBB(FieldAccessTarget _this,
			Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		if (!tDefinition.equals(tField)) {
			return new Object[] { _this, match, tDefinition, tAccess, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_10_2_SolveCSP_bindingFBBBBB(FieldAccessTarget _this,
			Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tDefinition, tAccess, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tDefinition, tAccess, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessTarget_10_2_SolveCSP_bindingAndBlackFBBBBB(FieldAccessTarget _this,
			Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		Object[] result_pattern_FieldAccessTarget_10_2_SolveCSP_binding = pattern_FieldAccessTarget_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tDefinition, tAccess, tField);
		if (result_pattern_FieldAccessTarget_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessTarget_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldAccessTarget_10_2_SolveCSP_black = pattern_FieldAccessTarget_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessTarget_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tDefinition, tAccess, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessTarget_10_3_CheckCSP_expressionFBB(FieldAccessTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		if (!tDefinition.equals(tField)) {
			return new Object[] { match, tDefinition, tAccess, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TAccess tAccess, TFieldDefinition tField) {
		EMoflonEdge tField__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tField____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tField__tAccess____accessedBy_name_prime = "accessedBy";
		String tAccess__tField____tTarget_name_prime = "tTarget";
		tField__tAccess____accessedBy.setSrc(tField);
		tField__tAccess____accessedBy.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tField__tAccess____accessedBy);
		tAccess__tField____tTarget.setSrc(tAccess);
		tAccess__tField____tTarget.setTrg(tField);
		match.getToBeTranslatedEdges().add(tAccess__tField____tTarget);
		tField__tAccess____accessedBy.setName(tField__tAccess____accessedBy_name_prime);
		tAccess__tField____tTarget.setName(tAccess__tField____tTarget_name_prime);
		return new Object[] { match, tAccess, tField, tField__tAccess____accessedBy, tAccess__tField____tTarget };
	}

	public static final Object[] pattern_FieldAccessTarget_10_5_collectcontextelements_blackBBBB(Match match,
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		if (!tDefinition.equals(tField)) {
			return new Object[] { match, tDefinition, tAccess, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_10_5_collectcontextelements_greenBBBBFF(Match match,
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		EMoflonEdge tDefinition__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tDefinition____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tDefinition);
		match.getContextNodes().add(tAccess);
		match.getContextNodes().add(tField);
		String tDefinition__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tDefinition____tSource_name_prime = "tSource";
		tDefinition__tAccess____tAccessing.setSrc(tDefinition);
		tDefinition__tAccess____tAccessing.setTrg(tAccess);
		match.getContextEdges().add(tDefinition__tAccess____tAccessing);
		tAccess__tDefinition____tSource.setSrc(tAccess);
		tAccess__tDefinition____tSource.setTrg(tDefinition);
		match.getContextEdges().add(tAccess__tDefinition____tSource);
		tDefinition__tAccess____tAccessing.setName(tDefinition__tAccess____tAccessing_name_prime);
		tAccess__tDefinition____tSource.setName(tAccess__tDefinition____tSource_name_prime);
		return new Object[] { match, tDefinition, tAccess, tField, tDefinition__tAccess____tAccessing,
				tAccess__tDefinition____tSource };
	}

	public static final void pattern_FieldAccessTarget_10_6_registerobjectstomatch_expressionBBBBB(
			FieldAccessTarget _this, Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		_this.registerObjectsToMatch_BWD(match, tDefinition, tAccess, tField);

	}

	public static final boolean pattern_FieldAccessTarget_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessTarget_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_11_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tField");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinitionToTDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mField");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_7 = isApplicableMatch.getObject("varAccess");
		EObject _localVariable_8 = isApplicableMatch.getObject("varDeclFrag");
		EObject _localVariable_9 = isApplicableMatch.getObject("varDeclFragToTField");
		EObject _localVariable_10 = isApplicableMatch.getObject("varAccessToTAccess");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpTDefinition = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		EObject tmpMDefinitionToTDefinition = _localVariable_4;
		EObject tmpMField = _localVariable_5;
		EObject tmpMMethodToTMethod = _localVariable_6;
		EObject tmpVarAccess = _localVariable_7;
		EObject tmpVarDeclFrag = _localVariable_8;
		EObject tmpVarDeclFragToTField = _localVariable_9;
		EObject tmpVarAccessToTAccess = _localVariable_10;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tmpTAccess instanceof TAccess) {
					TAccess tAccess = (TAccess) tmpTAccess;
					if (tmpTField instanceof TFieldDefinition) {
						TFieldDefinition tField = (TFieldDefinition) tmpTField;
						if (tmpMDefinitionToTDefinition instanceof MDefinitionToTMember) {
							MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) tmpMDefinitionToTDefinition;
							if (tmpMField instanceof MFieldDefinition) {
								MFieldDefinition mField = (MFieldDefinition) tmpMField;
								if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
									MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
									if (tmpVarAccess instanceof SingleVariableAccess) {
										SingleVariableAccess varAccess = (SingleVariableAccess) tmpVarAccess;
										if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
											VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
											if (tmpVarDeclFragToTField instanceof VariableDeclarationFragmentToTFieldDefinition) {
												VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) tmpVarDeclFragToTField;
												if (tmpVarAccessToTAccess instanceof SingleVariableAccessToTAccess) {
													SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) tmpVarAccessToTAccess;
													return new Object[] { mDefinition, tDefinition, tAccess, tField,
															mDefinitionToTDefinition, mField, mMethodToTMethod,
															varAccess, varDeclFrag, varDeclFragToTField,
															varAccessToTAccess, isApplicableMatch };
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

	public static final Object[] pattern_FieldAccessTarget_11_1_performtransformation_blackBBBBBBBBBBBFBB(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, FieldAccessTarget _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mDefinition.equals(mField)) {
			if (!tDefinition.equals(tField)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition,
									mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
									varAccessToTAccess, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			FieldAccessTarget _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldAccessTarget_11_1_performtransformation_binding = pattern_FieldAccessTarget_11_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldAccessTarget_11_1_performtransformation_binding != null) {
			MDefinition mDefinition = (MDefinition) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[0];
			TMember tDefinition = (TMember) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[1];
			TAccess tAccess = (TAccess) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[2];
			TFieldDefinition tField = (TFieldDefinition) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[3];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[4];
			MFieldDefinition mField = (MFieldDefinition) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[5];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[6];
			SingleVariableAccess varAccess = (SingleVariableAccess) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[7];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[8];
			VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField = (VariableDeclarationFragmentToTFieldDefinition) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[9];
			SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) result_pattern_FieldAccessTarget_11_1_performtransformation_binding[10];

			Object[] result_pattern_FieldAccessTarget_11_1_performtransformation_black = pattern_FieldAccessTarget_11_1_performtransformation_blackBBBBBBBBBBBFBB(
					mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField, mMethodToTMethod,
					varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, _this, isApplicableMatch);
			if (result_pattern_FieldAccessTarget_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldAccessTarget_11_1_performtransformation_black[11];

				return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
						mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_11_1_performtransformation_greenBB(
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag) {
		varAccess.setVariable(varDeclFrag);
		return new Object[] { varAccess, varDeclFrag };
	}

	public static final Object[] pattern_FieldAccessTarget_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_FieldAccessTarget_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinition, EObject tDefinition, EObject tAccess, EObject tField,
			EObject mDefinitionToTDefinition, EObject mField, EObject mMethodToTMethod, EObject varAccess,
			EObject varDeclFrag, EObject varDeclFragToTField, EObject varAccessToTAccess) {
		if (!mDefinition.equals(tDefinition)) {
			if (!mDefinition.equals(tAccess)) {
				if (!mDefinition.equals(tField)) {
					if (!mDefinition.equals(mDefinitionToTDefinition)) {
						if (!mDefinition.equals(mField)) {
							if (!mDefinition.equals(mMethodToTMethod)) {
								if (!mDefinition.equals(varAccess)) {
									if (!mDefinition.equals(varDeclFrag)) {
										if (!mDefinition.equals(varDeclFragToTField)) {
											if (!mDefinition.equals(varAccessToTAccess)) {
												if (!tDefinition.equals(tField)) {
													if (!tDefinition.equals(varAccess)) {
														if (!tDefinition.equals(varDeclFrag)) {
															if (!tDefinition.equals(varDeclFragToTField)) {
																if (!tDefinition.equals(varAccessToTAccess)) {
																	if (!tAccess.equals(tDefinition)) {
																		if (!tAccess.equals(tField)) {
																			if (!tAccess.equals(varAccess)) {
																				if (!tAccess.equals(varDeclFrag)) {
																					if (!tAccess.equals(
																							varDeclFragToTField)) {
																						if (!tAccess.equals(
																								varAccessToTAccess)) {
																							if (!tField.equals(
																									varAccess)) {
																								if (!tField.equals(
																										varDeclFrag)) {
																									if (!tField.equals(
																											varDeclFragToTField)) {
																										if (!tField
																												.equals(varAccessToTAccess)) {
																											if (!mDefinitionToTDefinition
																													.equals(tDefinition)) {
																												if (!mDefinitionToTDefinition
																														.equals(tAccess)) {
																													if (!mDefinitionToTDefinition
																															.equals(tField)) {
																														if (!mDefinitionToTDefinition
																																.equals(mField)) {
																															if (!mDefinitionToTDefinition
																																	.equals(mMethodToTMethod)) {
																																if (!mDefinitionToTDefinition
																																		.equals(varAccess)) {
																																	if (!mDefinitionToTDefinition
																																			.equals(varDeclFrag)) {
																																		if (!mDefinitionToTDefinition
																																				.equals(varDeclFragToTField)) {
																																			if (!mDefinitionToTDefinition
																																					.equals(varAccessToTAccess)) {
																																				if (!mField
																																						.equals(tDefinition)) {
																																					if (!mField
																																							.equals(tAccess)) {
																																						if (!mField
																																								.equals(tField)) {
																																							if (!mField
																																									.equals(mMethodToTMethod)) {
																																								if (!mField
																																										.equals(varAccess)) {
																																									if (!mField
																																											.equals(varDeclFrag)) {
																																										if (!mField
																																												.equals(varDeclFragToTField)) {
																																											if (!mField
																																													.equals(varAccessToTAccess)) {
																																												if (!mMethodToTMethod
																																														.equals(tDefinition)) {
																																													if (!mMethodToTMethod
																																															.equals(tAccess)) {
																																														if (!mMethodToTMethod
																																																.equals(tField)) {
																																															if (!mMethodToTMethod
																																																	.equals(varAccess)) {
																																																if (!mMethodToTMethod
																																																		.equals(varDeclFrag)) {
																																																	if (!mMethodToTMethod
																																																			.equals(varDeclFragToTField)) {
																																																		if (!mMethodToTMethod
																																																				.equals(varAccessToTAccess)) {
																																																			if (!varAccess
																																																					.equals(varDeclFrag)) {
																																																				if (!varAccess
																																																						.equals(varDeclFragToTField)) {
																																																					if (!varAccess
																																																							.equals(varAccessToTAccess)) {
																																																						if (!varDeclFrag
																																																								.equals(varDeclFragToTField)) {
																																																							if (!varAccessToTAccess
																																																									.equals(varDeclFrag)) {
																																																								if (!varAccessToTAccess
																																																										.equals(varDeclFragToTField)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											mDefinition,
																																																											tDefinition,
																																																											tAccess,
																																																											tField,
																																																											mDefinitionToTDefinition,
																																																											mField,
																																																											mMethodToTMethod,
																																																											varAccess,
																																																											varDeclFrag,
																																																											varDeclFragToTField,
																																																											varAccessToTAccess };
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

	public static final Object[] pattern_FieldAccessTarget_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tAccess, EObject tField, EObject varAccess, EObject varDeclFrag) {
		EMoflonEdge tField__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tField____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varAccess__varDeclFrag____variable = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__varAccess____usageInVariableAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldAccessTarget";
		String tField__tAccess____accessedBy_name_prime = "accessedBy";
		String tAccess__tField____tTarget_name_prime = "tTarget";
		String varAccess__varDeclFrag____variable_name_prime = "variable";
		String varDeclFrag__varAccess____usageInVariableAccess_name_prime = "usageInVariableAccess";
		tField__tAccess____accessedBy.setSrc(tField);
		tField__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tField__tAccess____accessedBy);
		tAccess__tField____tTarget.setSrc(tAccess);
		tAccess__tField____tTarget.setTrg(tField);
		ruleresult.getTranslatedEdges().add(tAccess__tField____tTarget);
		varAccess__varDeclFrag____variable.setSrc(varAccess);
		varAccess__varDeclFrag____variable.setTrg(varDeclFrag);
		ruleresult.getCreatedEdges().add(varAccess__varDeclFrag____variable);
		varDeclFrag__varAccess____usageInVariableAccess.setSrc(varDeclFrag);
		varDeclFrag__varAccess____usageInVariableAccess.setTrg(varAccess);
		ruleresult.getCreatedEdges().add(varDeclFrag__varAccess____usageInVariableAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tField__tAccess____accessedBy.setName(tField__tAccess____accessedBy_name_prime);
		tAccess__tField____tTarget.setName(tAccess__tField____tTarget_name_prime);
		varAccess__varDeclFrag____variable.setName(varAccess__varDeclFrag____variable_name_prime);
		varDeclFrag__varAccess____usageInVariableAccess
				.setName(varDeclFrag__varAccess____usageInVariableAccess_name_prime);
		return new Object[] { ruleresult, tAccess, tField, varAccess, varDeclFrag, tField__tAccess____accessedBy,
				tAccess__tField____tTarget, varAccess__varDeclFrag____variable,
				varDeclFrag__varAccess____usageInVariableAccess };
	}

	public static final void pattern_FieldAccessTarget_11_5_registerobjects_expressionBBBBBBBBBBBBB(
			FieldAccessTarget _this, PerformRuleResult ruleresult, EObject mDefinition, EObject tDefinition,
			EObject tAccess, EObject tField, EObject mDefinitionToTDefinition, EObject mField, EObject mMethodToTMethod,
			EObject varAccess, EObject varDeclFrag, EObject varDeclFragToTField, EObject varAccessToTAccess) {
		_this.registerObjects_BWD(ruleresult, mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition,
				mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);

	}

	public static final PerformRuleResult pattern_FieldAccessTarget_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_12_1_preparereturnvalue_bindingFB(FieldAccessTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldAccessTarget _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldAccessTarget _this) {
		Object[] result_pattern_FieldAccessTarget_12_1_preparereturnvalue_binding = pattern_FieldAccessTarget_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessTarget_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldAccessTarget_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessTarget_12_1_preparereturnvalue_black = pattern_FieldAccessTarget_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldAccessTarget_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldAccessTarget_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldAccessTarget";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldAccessTarget_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tDefinition");
		EObject _localVariable_1 = match.getObject("tAccess");
		EObject _localVariable_2 = match.getObject("tField");
		EObject tmpTDefinition = _localVariable_0;
		EObject tmpTAccess = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		if (tmpTDefinition instanceof TMember) {
			TMember tDefinition = (TMember) tmpTDefinition;
			if (tmpTAccess instanceof TAccess) {
				TAccess tAccess = (TAccess) tmpTAccess;
				if (tmpTField instanceof TFieldDefinition) {
					TFieldDefinition tField = (TFieldDefinition) tmpTField;
					return new Object[] { tDefinition, tAccess, tField, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessTarget_12_2_corematch_blackFBBBFFFFFFFB(
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tDefinition.equals(tField)) {
			for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
				MDefinition mDefinition = mDefinitionToTDefinition.getSource();
				if (mDefinition != null) {
					for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tField, MDefinitionToTMember.class, "target")) {
						if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
							MDefinition tmpMField = mMethodToTMethod.getSource();
							if (tmpMField instanceof MFieldDefinition) {
								MFieldDefinition mField = (MFieldDefinition) tmpMField;
								if (!mDefinition.equals(mField)) {
									for (VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(tField,
													VariableDeclarationFragmentToTFieldDefinition.class, "target")) {
										VariableDeclarationFragment varDeclFrag = varDeclFragToTField.getSource();
										if (varDeclFrag != null) {
											for (SingleVariableAccessToTAccess varAccessToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(tAccess,
															SingleVariableAccessToTAccess.class, "target")) {
												SingleVariableAccess varAccess = varAccessToTAccess.getSource();
												if (varAccess != null) {
													_result.add(new Object[] { mDefinition, tDefinition, tAccess,
															tField, mDefinitionToTDefinition, mField, mMethodToTMethod,
															varAccess, varDeclFrag, varDeclFragToTField,
															varAccessToTAccess, match });
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

	public static final Iterable<Object[]> pattern_FieldAccessTarget_12_3_findcontext_blackBBBBBBBBBBB(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mDefinition.equals(mField)) {
			if (!tDefinition.equals(tField)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					if (mDefinition.getMAbstractFieldAccess().contains(varAccess)) {
						if (tDefinition.getTAccessing().contains(tAccess)) {
							if (tField.getAccessedBy().contains(tAccess)) {
								if (mDefinition.equals(mDefinitionToTDefinition.getSource())) {
									if (tDefinition.equals(mDefinitionToTDefinition.getTarget())) {
										if (mField.equals(mMethodToTMethod.getSource())) {
											if (tField.equals(mMethodToTMethod.getTarget())) {
												if (mField.equals(varDeclFrag.getVariablesContainer())) {
													if (varDeclFrag.equals(varDeclFragToTField.getSource())) {
														if (tField.equals(varDeclFragToTField.getTarget())) {
															if (varAccess.equals(varAccessToTAccess.getSource())) {
																if (tAccess.equals(varAccessToTAccess.getTarget())) {
																	_result.add(new Object[] { mDefinition, tDefinition,
																			tAccess, tField, mDefinitionToTDefinition,
																			mField, mMethodToTMethod, varAccess,
																			varDeclFrag, varDeclFragToTField,
																			varAccessToTAccess });
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

	public static final Object[] pattern_FieldAccessTarget_12_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mDefinition__varAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tDefinition____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tField____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mField____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__mField____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mField__varDeclFrag____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragToTField__varDeclFrag____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varAccessToTAccess__varAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varAccessToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mDefinition__varAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String tDefinition__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tDefinition____tSource_name_prime = "tSource";
		String tField__tAccess____accessedBy_name_prime = "accessedBy";
		String tAccess__tField____tTarget_name_prime = "tTarget";
		String mDefinitionToTDefinition__mDefinition____source_name_prime = "source";
		String mDefinitionToTDefinition__tDefinition____target_name_prime = "target";
		String mMethodToTMethod__mField____source_name_prime = "source";
		String mMethodToTMethod__tField____target_name_prime = "target";
		String varDeclFrag__mField____variablesContainer_name_prime = "variablesContainer";
		String mField__varDeclFrag____fragments_name_prime = "fragments";
		String varDeclFragToTField__varDeclFrag____source_name_prime = "source";
		String varDeclFragToTField__tField____target_name_prime = "target";
		String varAccessToTAccess__varAccess____source_name_prime = "source";
		String varAccessToTAccess__tAccess____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		isApplicableMatch.getAllContextElements().add(mField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(varAccess);
		isApplicableMatch.getAllContextElements().add(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(varDeclFragToTField);
		isApplicableMatch.getAllContextElements().add(varAccessToTAccess);
		mDefinition__varAccess____mAbstractFieldAccess.setSrc(mDefinition);
		mDefinition__varAccess____mAbstractFieldAccess.setTrg(varAccess);
		isApplicableMatch.getAllContextElements().add(mDefinition__varAccess____mAbstractFieldAccess);
		tDefinition__tAccess____tAccessing.setSrc(tDefinition);
		tDefinition__tAccess____tAccessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tDefinition__tAccess____tAccessing);
		tAccess__tDefinition____tSource.setSrc(tAccess);
		tAccess__tDefinition____tSource.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAccess__tDefinition____tSource);
		tField__tAccess____accessedBy.setSrc(tField);
		tField__tAccess____accessedBy.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tField__tAccess____accessedBy);
		tAccess__tField____tTarget.setSrc(tAccess);
		tAccess__tField____tTarget.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(tAccess__tField____tTarget);
		mDefinitionToTDefinition__mDefinition____source.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition__mDefinition____source);
		mDefinitionToTDefinition__tDefinition____target.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition__tDefinition____target);
		mMethodToTMethod__mField____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mField____source.setTrg(mField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mField____source);
		mMethodToTMethod__tField____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tField____target);
		varDeclFrag__mField____variablesContainer.setSrc(varDeclFrag);
		varDeclFrag__mField____variablesContainer.setTrg(mField);
		isApplicableMatch.getAllContextElements().add(varDeclFrag__mField____variablesContainer);
		mField__varDeclFrag____fragments.setSrc(mField);
		mField__varDeclFrag____fragments.setTrg(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(mField__varDeclFrag____fragments);
		varDeclFragToTField__varDeclFrag____source.setSrc(varDeclFragToTField);
		varDeclFragToTField__varDeclFrag____source.setTrg(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(varDeclFragToTField__varDeclFrag____source);
		varDeclFragToTField__tField____target.setSrc(varDeclFragToTField);
		varDeclFragToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(varDeclFragToTField__tField____target);
		varAccessToTAccess__varAccess____source.setSrc(varAccessToTAccess);
		varAccessToTAccess__varAccess____source.setTrg(varAccess);
		isApplicableMatch.getAllContextElements().add(varAccessToTAccess__varAccess____source);
		varAccessToTAccess__tAccess____target.setSrc(varAccessToTAccess);
		varAccessToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(varAccessToTAccess__tAccess____target);
		mDefinition__varAccess____mAbstractFieldAccess
				.setName(mDefinition__varAccess____mAbstractFieldAccess_name_prime);
		tDefinition__tAccess____tAccessing.setName(tDefinition__tAccess____tAccessing_name_prime);
		tAccess__tDefinition____tSource.setName(tAccess__tDefinition____tSource_name_prime);
		tField__tAccess____accessedBy.setName(tField__tAccess____accessedBy_name_prime);
		tAccess__tField____tTarget.setName(tAccess__tField____tTarget_name_prime);
		mDefinitionToTDefinition__mDefinition____source
				.setName(mDefinitionToTDefinition__mDefinition____source_name_prime);
		mDefinitionToTDefinition__tDefinition____target
				.setName(mDefinitionToTDefinition__tDefinition____target_name_prime);
		mMethodToTMethod__mField____source.setName(mMethodToTMethod__mField____source_name_prime);
		mMethodToTMethod__tField____target.setName(mMethodToTMethod__tField____target_name_prime);
		varDeclFrag__mField____variablesContainer.setName(varDeclFrag__mField____variablesContainer_name_prime);
		mField__varDeclFrag____fragments.setName(mField__varDeclFrag____fragments_name_prime);
		varDeclFragToTField__varDeclFrag____source.setName(varDeclFragToTField__varDeclFrag____source_name_prime);
		varDeclFragToTField__tField____target.setName(varDeclFragToTField__tField____target_name_prime);
		varAccessToTAccess__varAccess____source.setName(varAccessToTAccess__varAccess____source_name_prime);
		varAccessToTAccess__tAccess____target.setName(varAccessToTAccess__tAccess____target_name_prime);
		return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
				mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, isApplicableMatch,
				mDefinition__varAccess____mAbstractFieldAccess, tDefinition__tAccess____tAccessing,
				tAccess__tDefinition____tSource, tField__tAccess____accessedBy, tAccess__tField____tTarget,
				mDefinitionToTDefinition__mDefinition____source, mDefinitionToTDefinition__tDefinition____target,
				mMethodToTMethod__mField____source, mMethodToTMethod__tField____target,
				varDeclFrag__mField____variablesContainer, mField__varDeclFrag____fragments,
				varDeclFragToTField__varDeclFrag____source, varDeclFragToTField__tField____target,
				varAccessToTAccess__varAccess____source, varAccessToTAccess__tAccess____target };
	}

	public static final Object[] pattern_FieldAccessTarget_12_4_solveCSP_bindingFBBBBBBBBBBBBB(FieldAccessTarget _this,
			IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition, TAccess tAccess,
			TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mDefinition, tDefinition, tAccess,
				tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
				varAccessToTAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField,
					mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
					varAccessToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessTarget_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			FieldAccessTarget _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		Object[] result_pattern_FieldAccessTarget_12_4_solveCSP_binding = pattern_FieldAccessTarget_12_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
				mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess);
		if (result_pattern_FieldAccessTarget_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessTarget_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessTarget_12_4_solveCSP_black = pattern_FieldAccessTarget_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessTarget_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField,
						mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
						varAccessToTAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessTarget_12_5_checkCSP_expressionFBB(FieldAccessTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessTarget_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldAccessTarget";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessTarget_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_20_1_preparereturnvalue_bindingFB(FieldAccessTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldAccessTarget _this) {
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

	public static final Object[] pattern_FieldAccessTarget_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldAccessTarget _this) {
		Object[] result_pattern_FieldAccessTarget_20_1_preparereturnvalue_binding = pattern_FieldAccessTarget_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessTarget_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldAccessTarget_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessTarget_20_1_preparereturnvalue_black = pattern_FieldAccessTarget_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldAccessTarget_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldAccessTarget_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldAccessTarget_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldAccessTarget_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_variable) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpVarAccess = _edge_variable.getSrc();
		if (tmpVarAccess instanceof SingleVariableAccess) {
			SingleVariableAccess varAccess = (SingleVariableAccess) tmpVarAccess;
			EObject tmpVarDeclFrag = _edge_variable.getTrg();
			if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
				VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
				if (varDeclFrag.equals(varAccess.getVariable())) {
					AbstractVariablesContainer tmpMField = varDeclFrag.getVariablesContainer();
					if (tmpMField instanceof MFieldDefinition) {
						MFieldDefinition mField = (MFieldDefinition) tmpMField;
						for (MDefinition mDefinition : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(varAccess, MDefinition.class, "mAbstractFieldAccess")) {
							if (!mDefinition.equals(mField)) {
								_result.add(
										new Object[] { mDefinition, mField, varAccess, varDeclFrag, _edge_variable });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldAccessTarget_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			FieldAccessTarget _this, Match match, MDefinition mDefinition, MFieldDefinition mField,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mField, varAccess, varDeclFrag);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldAccessTarget_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldAccessTarget _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldAccessTarget_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_21_1_preparereturnvalue_bindingFB(FieldAccessTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldAccessTarget _this) {
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

	public static final Object[] pattern_FieldAccessTarget_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldAccessTarget _this) {
		Object[] result_pattern_FieldAccessTarget_21_1_preparereturnvalue_binding = pattern_FieldAccessTarget_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessTarget_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldAccessTarget_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessTarget_21_1_preparereturnvalue_black = pattern_FieldAccessTarget_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldAccessTarget_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldAccessTarget_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldAccessTarget_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldAccessTarget_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_accessedBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTField = _edge_accessedBy.getSrc();
		if (tmpTField instanceof TFieldDefinition) {
			TFieldDefinition tField = (TFieldDefinition) tmpTField;
			EObject tmpTAccess = _edge_accessedBy.getTrg();
			if (tmpTAccess instanceof TAccess) {
				TAccess tAccess = (TAccess) tmpTAccess;
				if (tField.getAccessedBy().contains(tAccess)) {
					TMember tDefinition = tAccess.getTSource();
					if (tDefinition != null) {
						if (!tDefinition.equals(tField)) {
							_result.add(new Object[] { tDefinition, tAccess, tField, _edge_accessedBy });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldAccessTarget_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			FieldAccessTarget _this, Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tDefinition, tAccess, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldAccessTarget_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldAccessTarget _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldAccessTarget_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_24_1_prepare_blackB(FieldAccessTarget _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldAccessTarget_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldAccessTarget_24_2_matchcontext_bindingFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_1 = targetMatch.getObject("tDefinition");
		EObject _localVariable_2 = targetMatch.getObject("tAccess");
		EObject _localVariable_3 = targetMatch.getObject("tField");
		EObject _localVariable_4 = sourceMatch.getObject("mField");
		EObject _localVariable_5 = sourceMatch.getObject("varAccess");
		EObject _localVariable_6 = sourceMatch.getObject("varDeclFrag");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpTDefinition = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		EObject tmpMField = _localVariable_4;
		EObject tmpVarAccess = _localVariable_5;
		EObject tmpVarDeclFrag = _localVariable_6;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tmpTAccess instanceof TAccess) {
					TAccess tAccess = (TAccess) tmpTAccess;
					if (tmpTField instanceof TFieldDefinition) {
						TFieldDefinition tField = (TFieldDefinition) tmpTField;
						if (tmpMField instanceof MFieldDefinition) {
							MFieldDefinition mField = (MFieldDefinition) tmpMField;
							if (tmpVarAccess instanceof SingleVariableAccess) {
								SingleVariableAccess varAccess = (SingleVariableAccess) tmpVarAccess;
								if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
									VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
									return new Object[] { mDefinition, tDefinition, tAccess, tField, mField, varAccess,
											varDeclFrag, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessTarget_24_2_matchcontext_blackBBBBFBFBBFFBB(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MFieldDefinition mField, SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mDefinition.equals(mField)) {
			if (!tDefinition.equals(tField)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (mDefinition.getMAbstractFieldAccess().contains(varAccess)) {
						if (tDefinition.getTAccessing().contains(tAccess)) {
							if (tField.getAccessedBy().contains(tAccess)) {
								if (varDeclFrag.equals(varAccess.getVariable())) {
									if (mField.equals(varDeclFrag.getVariablesContainer())) {
										for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class,
														"source")) {
											if (tDefinition.equals(mDefinitionToTDefinition.getTarget())) {
												for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(mField, MDefinitionToTMember.class,
																"source")) {
													if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
														if (tField.equals(mMethodToTMethod.getTarget())) {
															for (VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(varDeclFrag,
																			VariableDeclarationFragmentToTFieldDefinition.class,
																			"source")) {
																if (tField.equals(varDeclFragToTField.getTarget())) {
																	for (SingleVariableAccessToTAccess varAccessToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(varAccess,
																					SingleVariableAccessToTAccess.class,
																					"source")) {
																		if (tAccess.equals(
																				varAccessToTAccess.getTarget())) {
																			_result.add(new Object[] { mDefinition,
																					tDefinition, tAccess, tField,
																					mDefinitionToTDefinition, mField,
																					mMethodToTMethod, varAccess,
																					varDeclFrag, varDeclFragToTField,
																					varAccessToTAccess, sourceMatch,
																					targetMatch });
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

	public static final Object[] pattern_FieldAccessTarget_24_2_matchcontext_greenBBBBBBBBBBBBFB(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "FieldAccessTarget";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mField);
		isApplicableMatch.getAllContextElements().add(varAccess);
		isApplicableMatch.getAllContextElements().add(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(varDeclFragToTField);
		isApplicableMatch.getAllContextElements().add(varAccessToTAccess);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
				mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_FieldAccessTarget_24_3_checkcsp_bindingFBBBBBBBBBBBBBBB(
			FieldAccessTarget _this, CCMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mDefinition, tDefinition, tAccess,
				tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
				varAccessToTAccess, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField,
					mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
					varAccessToTAccess, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessTarget_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBB(
			FieldAccessTarget _this, CCMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldAccessTarget_24_3_checkcsp_binding = pattern_FieldAccessTarget_24_3_checkcsp_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
				mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, sourceMatch,
				targetMatch);
		if (result_pattern_FieldAccessTarget_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessTarget_24_3_checkcsp_binding[0];

			Object[] result_pattern_FieldAccessTarget_24_3_checkcsp_black = pattern_FieldAccessTarget_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_FieldAccessTarget_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField,
						mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
						varAccessToTAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_24_4_createcorrespondence_blackBBBBBBBB(
			MDefinition mDefinition, TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MFieldDefinition mField, SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag,
			CCMatch isApplicableMatch) {
		if (!mDefinition.equals(mField)) {
			if (!tDefinition.equals(tField)) {
				return new Object[] { mDefinition, tDefinition, tAccess, tField, mField, varAccess, varDeclFrag,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessTarget_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldAccessTarget";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessTarget_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_27_1_matchtggpattern_blackBBBB(MDefinition mDefinition,
			MFieldDefinition mField, SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag) {
		if (!mDefinition.equals(mField)) {
			if (mDefinition.getMAbstractFieldAccess().contains(varAccess)) {
				if (varDeclFrag.equals(varAccess.getVariable())) {
					if (mField.equals(varDeclFrag.getVariablesContainer())) {
						return new Object[] { mDefinition, mField, varAccess, varDeclFrag };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessTarget_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessTarget_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_28_1_matchtggpattern_blackBBB(TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField) {
		if (!tDefinition.equals(tField)) {
			if (tDefinition.getTAccessing().contains(tAccess)) {
				if (tField.getAccessedBy().contains(tAccess)) {
					return new Object[] { tDefinition, tAccess, tField };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessTarget_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessTarget_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_29_1_createresult_blackB(FieldAccessTarget _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldAccessTarget_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SingleVariableAccess varAccess) {
		if (ruleResult.getSourceObjects().contains(varAccess)) {
			return new Object[] { ruleResult, varAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SingleVariableAccessToTAccess varAccessToTAccess) {
		if (ruleResult.getCorrObjects().contains(varAccessToTAccess)) {
			return new Object[] { ruleResult, varAccessToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAccess tAccess) {
		if (ruleResult.getTargetObjects().contains(tAccess)) {
			return new Object[] { ruleResult, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TMember tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTDefinition) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTDefinition)) {
			return new Object[] { ruleResult, mDefinitionToTDefinition };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TFieldDefinition tField) {
		if (ruleResult.getTargetObjects().contains(tField)) {
			return new Object[] { ruleResult, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMethodToTMethod) {
		if (ruleResult.getCorrObjects().contains(mMethodToTMethod)) {
			return new Object[] { ruleResult, mMethodToTMethod };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, MFieldDefinition mField) {
		if (ruleResult.getSourceObjects().contains(mField)) {
			return new Object[] { ruleResult, mField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, VariableDeclarationFragment varDeclFrag) {
		if (ruleResult.getSourceObjects().contains(varDeclFrag)) {
			return new Object[] { ruleResult, varDeclFrag };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField) {
		if (ruleResult.getCorrObjects().contains(varDeclFragToTField)) {
			return new Object[] { ruleResult, varDeclFragToTField };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessTarget_29_2_isapplicablecore_blackFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList varAccessToTAccessList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mMethodToTMethodList : ruleEntryContainer.getRuleEntryList()) {
				if (!mMethodToTMethodList.equals(varAccessToTAccessList)) {
					for (EObject tmpVarAccessToTAccess : varAccessToTAccessList.getEntryObjects()) {
						if (tmpVarAccessToTAccess instanceof SingleVariableAccessToTAccess) {
							SingleVariableAccessToTAccess varAccessToTAccess = (SingleVariableAccessToTAccess) tmpVarAccessToTAccess;
							SingleVariableAccess varAccess = varAccessToTAccess.getSource();
							if (varAccess != null) {
								TAccess tAccess = varAccessToTAccess.getTarget();
								if (tAccess != null) {
									TMember tDefinition = tAccess.getTSource();
									if (tDefinition != null) {
										if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												varAccessToTAccess) == null) {
											if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_1BB(
													ruleResult, varAccess) == null) {
												if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_3BB(
														ruleResult, tAccess) == null) {
													if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, tDefinition) == null) {
														for (EObject tmpMMethodToTMethod : mMethodToTMethodList
																.getEntryObjects()) {
															if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
																MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
																TMember tmpTField = mMethodToTMethod.getTarget();
																if (tmpTField instanceof TFieldDefinition) {
																	TFieldDefinition tField = (TFieldDefinition) tmpTField;
																	if (!tDefinition.equals(tField)) {
																		MDefinition tmpMField = mMethodToTMethod
																				.getSource();
																		if (tmpMField instanceof MFieldDefinition) {
																			MFieldDefinition mField = (MFieldDefinition) tmpMField;
																			if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_7BB(
																					ruleResult,
																					mMethodToTMethod) == null) {
																				if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_6BB(
																						ruleResult, tField) == null) {
																					if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_8BB(
																							ruleResult,
																							mField) == null) {
																						for (VariableDeclarationFragment varDeclFrag : mField
																								.getFragments()) {
																							if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_9BB(
																									ruleResult,
																									varDeclFrag) == null) {
																								for (MDefinition mDefinition : org.moflon.core.utilities.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												varAccess,
																												MDefinition.class,
																												"mAbstractFieldAccess")) {
																									if (!mDefinition
																											.equals(mField)) {
																										if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_0BB(
																												ruleResult,
																												mDefinition) == null) {
																											for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
																													.getOppositeReferenceTyped(
																															tDefinition,
																															MDefinitionToTMember.class,
																															"target")) {
																												if (!mDefinitionToTDefinition
																														.equals(mMethodToTMethod)) {
																													if (mDefinition
																															.equals(mDefinitionToTDefinition
																																	.getSource())) {
																														if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_5BB(
																																ruleResult,
																																mDefinitionToTDefinition) == null) {
																															for (VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField : org.moflon.core.utilities.eMoflonEMFUtil
																																	.getOppositeReferenceTyped(
																																			tField,
																																			VariableDeclarationFragmentToTFieldDefinition.class,
																																			"target")) {
																																if (varDeclFrag
																																		.equals(varDeclFragToTField
																																				.getSource())) {
																																	if (pattern_FieldAccessTarget_29_2_isapplicablecore_black_nac_10BB(
																																			ruleResult,
																																			varDeclFragToTField) == null) {
																																		_result.add(
																																				new Object[] {
																																						varAccessToTAccessList,
																																						mDefinition,
																																						varAccess,
																																						varAccessToTAccess,
																																						tAccess,
																																						tDefinition,
																																						mDefinitionToTDefinition,
																																						mMethodToTMethodList,
																																						tField,
																																						mMethodToTMethod,
																																						mField,
																																						varDeclFrag,
																																						varDeclFragToTField,
																																						ruleEntryContainer,
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

	public static final Object[] pattern_FieldAccessTarget_29_3_solveCSP_bindingFBBBBBBBBBBBBBB(FieldAccessTarget _this,
			IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition, TAccess tAccess,
			TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mDefinition, tDefinition, tAccess,
				tField, mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
				varAccessToTAccess, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField,
					mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
					varAccessToTAccess, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessTarget_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBBB(
			FieldAccessTarget _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldAccessTarget_29_3_solveCSP_binding = pattern_FieldAccessTarget_29_3_solveCSP_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
				mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess, ruleResult);
		if (result_pattern_FieldAccessTarget_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessTarget_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessTarget_29_3_solveCSP_black = pattern_FieldAccessTarget_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessTarget_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, tDefinition, tAccess, tField,
						mDefinitionToTDefinition, mField, mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField,
						varAccessToTAccess, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessTarget_29_4_checkCSP_expressionFBB(FieldAccessTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessTarget_29_5_checknacs_blackBBBBBBBBBBB(MDefinition mDefinition,
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess) {
		if (!mDefinition.equals(mField)) {
			if (!tDefinition.equals(tField)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
							mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_6_perform_blackBBBBBBBBBBBB(MDefinition mDefinition,
			TMember tDefinition, TAccess tAccess, TFieldDefinition tField,
			MDefinitionToTMember mDefinitionToTDefinition, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, ModelgeneratorRuleResult ruleResult) {
		if (!mDefinition.equals(mField)) {
			if (!tDefinition.equals(tField)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					return new Object[] { mDefinition, tDefinition, tAccess, tField, mDefinitionToTDefinition, mField,
							mMethodToTMethod, varAccess, varDeclFrag, varDeclFragToTField, varAccessToTAccess,
							ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessTarget_29_6_perform_greenBBBBB(TAccess tAccess,
			TFieldDefinition tField, SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag,
			ModelgeneratorRuleResult ruleResult) {
		tField.getAccessedBy().add(tAccess);
		varAccess.setVariable(varDeclFrag);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAccess, tField, varAccess, varDeclFrag, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FieldAccessTarget_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldAccessTargetImpl
