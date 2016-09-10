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

import org.eclipse.gmt.modisco.java.SingleVariableAccess;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.MDefinitionToTMember;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.FieldAccessSource;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.SingleVariableAccessToTAccess;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAccess;
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
 * An implementation of the model object '<em><b>Field Access Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldAccessSourceImpl extends AbstractRuleImpl implements FieldAccessSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldAccessSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldAccessSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SingleVariableAccess mAccess, MDefinition mMember) {
		// initial bindings
		Object[] result1_black = FieldAccessSourceImpl.pattern_FieldAccessSource_0_1_initialbindings_blackBBBB(this,
				match, mAccess, mMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mAccess] = " + mAccess + ", "
					+ "[mMember] = " + mMember + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldAccessSourceImpl
				.pattern_FieldAccessSource_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mAccess, mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mAccess] = " + mAccess + ", " + "[mMember] = "
					+ mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldAccessSourceImpl.pattern_FieldAccessSource_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldAccessSourceImpl
					.pattern_FieldAccessSource_0_4_collectelementstobetranslated_blackBBB(match, mAccess, mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mAccess] = " + mAccess + ", "
						+ "[mMember] = " + mMember + ".");
			}
			FieldAccessSourceImpl.pattern_FieldAccessSource_0_4_collectelementstobetranslated_greenBBBF(match, mAccess,
					mMember);
			// EMoflonEdge mMember__mAccess____mAbstractFieldAccess = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = FieldAccessSourceImpl
					.pattern_FieldAccessSource_0_5_collectcontextelements_blackBBB(match, mAccess, mMember);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[mAccess] = " + mAccess + ", " + "[mMember] = " + mMember + ".");
			}
			FieldAccessSourceImpl.pattern_FieldAccessSource_0_5_collectcontextelements_greenBB(match, mMember);

			// register objects to match
			FieldAccessSourceImpl.pattern_FieldAccessSource_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mAccess, mMember);
			return FieldAccessSourceImpl.pattern_FieldAccessSource_0_7_expressionF();
		} else {
			return FieldAccessSourceImpl.pattern_FieldAccessSource_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldAccessSourceImpl
				.pattern_FieldAccessSource_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SingleVariableAccess mAccess = (SingleVariableAccess) result1_bindingAndBlack[0];
		TMember tMember = (TMember) result1_bindingAndBlack[1];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[2];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldAccessSourceImpl
				.pattern_FieldAccessSource_1_1_performtransformation_greenFBBF(mAccess, tMember);
		TAccess tAccess = (TAccess) result1_green[0];
		SingleVariableAccessToTAccess mAccessToTAccess = (SingleVariableAccessToTAccess) result1_green[3];

		// collect translated elements
		Object[] result2_black = FieldAccessSourceImpl
				.pattern_FieldAccessSource_1_2_collecttranslatedelements_blackBBB(tAccess, mAccess, mAccessToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[tAccess] = " + tAccess + ", " + "[mAccess] = " + mAccess + ", " + "[mAccessToTAccess] = "
					+ mAccessToTAccess + ".");
		}
		Object[] result2_green = FieldAccessSourceImpl
				.pattern_FieldAccessSource_1_2_collecttranslatedelements_greenFBBB(tAccess, mAccess, mAccessToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldAccessSourceImpl.pattern_FieldAccessSource_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, tAccess, mAccess, tMember, mMember, mMemberToTMember, mAccessToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tAccess] = " + tAccess + ", " + "[mAccess] = " + mAccess
					+ ", " + "[tMember] = " + tMember + ", " + "[mMember] = " + mMember + ", " + "[mMemberToTMember] = "
					+ mMemberToTMember + ", " + "[mAccessToTAccess] = " + mAccessToTAccess + ".");
		}
		FieldAccessSourceImpl.pattern_FieldAccessSource_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, tAccess,
				mAccess, tMember, mMember, mAccessToTAccess);
		// EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mMember__mAccess____mAbstractFieldAccess = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mAccessToTAccess__mAccess____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mAccessToTAccess__tAccess____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		FieldAccessSourceImpl.pattern_FieldAccessSource_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				tAccess, mAccess, tMember, mMember, mMemberToTMember, mAccessToTAccess);
		return FieldAccessSourceImpl.pattern_FieldAccessSource_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldAccessSourceImpl
				.pattern_FieldAccessSource_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldAccessSourceImpl
				.pattern_FieldAccessSource_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldAccessSourceImpl.pattern_FieldAccessSource_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SingleVariableAccess mAccess = (SingleVariableAccess) result2_binding[0];
		MDefinition mMember = (MDefinition) result2_binding[1];
		for (Object[] result2_black : FieldAccessSourceImpl.pattern_FieldAccessSource_2_2_corematch_blackBFBFB(mAccess,
				mMember, match)) {
			TMember tMember = (TMember) result2_black[1];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : FieldAccessSourceImpl
					.pattern_FieldAccessSource_2_3_findcontext_blackBBBB(mAccess, tMember, mMember, mMemberToTMember)) {
				Object[] result3_green = FieldAccessSourceImpl.pattern_FieldAccessSource_2_3_findcontext_greenBBBBFFFF(
						mAccess, tMember, mMember, mMemberToTMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge mMember__mAccess____mAbstractFieldAccess = (EMoflonEdge) result3_green[5];
				// EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldAccessSourceImpl
						.pattern_FieldAccessSource_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mAccess,
								tMember, mMember, mMemberToTMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mAccess] = " + mAccess + ", " + "[tMember] = " + tMember + ", " + "[mMember] = "
							+ mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldAccessSourceImpl.pattern_FieldAccessSource_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldAccessSourceImpl
							.pattern_FieldAccessSource_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldAccessSourceImpl.pattern_FieldAccessSource_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldAccessSourceImpl.pattern_FieldAccessSource_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SingleVariableAccess mAccess, MDefinition mMember) {
		match.registerObject("mAccess", mAccess);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SingleVariableAccess mAccess, MDefinition mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SingleVariableAccess mAccess,
			TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAccess", mAccess);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tAccess, EObject mAccess, EObject tMember,
			EObject mMember, EObject mMemberToTMember, EObject mAccessToTAccess) {
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("mAccessToTAccess", mAccessToTAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAccess").eClass())
				.equals("java.SingleVariableAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAccess tAccess, TMember tMember) {
		// initial bindings
		Object[] result1_black = FieldAccessSourceImpl.pattern_FieldAccessSource_10_1_initialbindings_blackBBBB(this,
				match, tAccess, tMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", "
					+ "[tMember] = " + tMember + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldAccessSourceImpl
				.pattern_FieldAccessSource_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tAccess, tMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", " + "[tMember] = "
					+ tMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldAccessSourceImpl.pattern_FieldAccessSource_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldAccessSourceImpl
					.pattern_FieldAccessSource_10_4_collectelementstobetranslated_blackBBB(match, tAccess, tMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", "
						+ "[tMember] = " + tMember + ".");
			}
			FieldAccessSourceImpl.pattern_FieldAccessSource_10_4_collectelementstobetranslated_greenBBBFF(match,
					tAccess, tMember);
			// EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = FieldAccessSourceImpl
					.pattern_FieldAccessSource_10_5_collectcontextelements_blackBBB(match, tAccess, tMember);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[tAccess] = " + tAccess + ", " + "[tMember] = " + tMember + ".");
			}
			FieldAccessSourceImpl.pattern_FieldAccessSource_10_5_collectcontextelements_greenBB(match, tMember);

			// register objects to match
			FieldAccessSourceImpl.pattern_FieldAccessSource_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tAccess, tMember);
			return FieldAccessSourceImpl.pattern_FieldAccessSource_10_7_expressionF();
		} else {
			return FieldAccessSourceImpl.pattern_FieldAccessSource_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldAccessSourceImpl
				.pattern_FieldAccessSource_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAccess tAccess = (TAccess) result1_bindingAndBlack[0];
		TMember tMember = (TMember) result1_bindingAndBlack[1];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[2];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldAccessSourceImpl
				.pattern_FieldAccessSource_11_1_performtransformation_greenBFBF(tAccess, mMember);
		SingleVariableAccess mAccess = (SingleVariableAccess) result1_green[1];
		SingleVariableAccessToTAccess mAccessToTAccess = (SingleVariableAccessToTAccess) result1_green[3];

		// collect translated elements
		Object[] result2_black = FieldAccessSourceImpl
				.pattern_FieldAccessSource_11_2_collecttranslatedelements_blackBBB(tAccess, mAccess, mAccessToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[tAccess] = " + tAccess + ", " + "[mAccess] = " + mAccess + ", " + "[mAccessToTAccess] = "
					+ mAccessToTAccess + ".");
		}
		Object[] result2_green = FieldAccessSourceImpl
				.pattern_FieldAccessSource_11_2_collecttranslatedelements_greenFBBB(tAccess, mAccess, mAccessToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldAccessSourceImpl.pattern_FieldAccessSource_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, tAccess, mAccess, tMember, mMember, mMemberToTMember, mAccessToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tAccess] = " + tAccess + ", " + "[mAccess] = " + mAccess
					+ ", " + "[tMember] = " + tMember + ", " + "[mMember] = " + mMember + ", " + "[mMemberToTMember] = "
					+ mMemberToTMember + ", " + "[mAccessToTAccess] = " + mAccessToTAccess + ".");
		}
		FieldAccessSourceImpl.pattern_FieldAccessSource_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, tAccess,
				mAccess, tMember, mMember, mAccessToTAccess);
		// EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mMember__mAccess____mAbstractFieldAccess = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mAccessToTAccess__mAccess____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mAccessToTAccess__tAccess____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		FieldAccessSourceImpl.pattern_FieldAccessSource_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				tAccess, mAccess, tMember, mMember, mMemberToTMember, mAccessToTAccess);
		return FieldAccessSourceImpl.pattern_FieldAccessSource_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldAccessSourceImpl
				.pattern_FieldAccessSource_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldAccessSourceImpl
				.pattern_FieldAccessSource_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldAccessSourceImpl.pattern_FieldAccessSource_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAccess tAccess = (TAccess) result2_binding[0];
		TMember tMember = (TMember) result2_binding[1];
		for (Object[] result2_black : FieldAccessSourceImpl.pattern_FieldAccessSource_12_2_corematch_blackBBFFB(tAccess,
				tMember, match)) {
			MDefinition mMember = (MDefinition) result2_black[2];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : FieldAccessSourceImpl.pattern_FieldAccessSource_12_3_findcontext_blackBBBB(
					tAccess, tMember, mMember, mMemberToTMember)) {
				Object[] result3_green = FieldAccessSourceImpl
						.pattern_FieldAccessSource_12_3_findcontext_greenBBBBFFFFF(tAccess, tMember, mMember,
								mMemberToTMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[5];
				// EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[8];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldAccessSourceImpl
						.pattern_FieldAccessSource_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								tAccess, tMember, mMember, mMemberToTMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tAccess] = " + tAccess + ", " + "[tMember] = " + tMember + ", " + "[mMember] = "
							+ mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldAccessSourceImpl.pattern_FieldAccessSource_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldAccessSourceImpl
							.pattern_FieldAccessSource_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldAccessSourceImpl.pattern_FieldAccessSource_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldAccessSourceImpl.pattern_FieldAccessSource_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAccess tAccess, TMember tMember) {
		match.registerObject("tAccess", tAccess);
		match.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAccess tAccess, TMember tMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAccess tAccess, TMember tMember,
			MDefinition mMember, MDefinitionToTMember mMemberToTMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tAccess, EObject mAccess, EObject tMember,
			EObject mMember, EObject mMemberToTMember, EObject mAccessToTAccess) {
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("mAccessToTAccess", mAccessToTAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAccess").eClass()).equals("basic.TAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_11(EMoflonEdge _edge_mAbstractFieldAccess) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldAccessSourceImpl
				.pattern_FieldAccessSource_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldAccessSourceImpl.pattern_FieldAccessSource_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldAccessSourceImpl
				.pattern_FieldAccessSource_20_2_testcorematchandDECs_blackFFB(_edge_mAbstractFieldAccess)) {
			SingleVariableAccess mAccess = (SingleVariableAccess) result2_black[0];
			MDefinition mMember = (MDefinition) result2_black[1];
			Object[] result2_green = FieldAccessSourceImpl
					.pattern_FieldAccessSource_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldAccessSourceImpl
					.pattern_FieldAccessSource_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mAccess, mMember)) {
				// Ensure that the correct types of elements are matched
				if (FieldAccessSourceImpl
						.pattern_FieldAccessSource_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldAccessSourceImpl
							.pattern_FieldAccessSource_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldAccessSourceImpl.pattern_FieldAccessSource_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldAccessSourceImpl.pattern_FieldAccessSource_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_9(EMoflonEdge _edge_tAccessing) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldAccessSourceImpl
				.pattern_FieldAccessSource_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldAccessSourceImpl.pattern_FieldAccessSource_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldAccessSourceImpl
				.pattern_FieldAccessSource_21_2_testcorematchandDECs_blackFFB(_edge_tAccessing)) {
			TAccess tAccess = (TAccess) result2_black[0];
			TMember tMember = (TMember) result2_black[1];
			Object[] result2_green = FieldAccessSourceImpl
					.pattern_FieldAccessSource_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldAccessSourceImpl
					.pattern_FieldAccessSource_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tAccess, tMember)) {
				// Ensure that the correct types of elements are matched
				if (FieldAccessSourceImpl
						.pattern_FieldAccessSource_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldAccessSourceImpl
							.pattern_FieldAccessSource_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldAccessSourceImpl.pattern_FieldAccessSource_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldAccessSourceImpl.pattern_FieldAccessSource_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldAccessSource");
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
		ruleResult.setRule("FieldAccessSource");
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
		Object[] result1_black = FieldAccessSourceImpl.pattern_FieldAccessSource_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldAccessSourceImpl.pattern_FieldAccessSource_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = FieldAccessSourceImpl
				.pattern_FieldAccessSource_24_2_matchcontext_bindingFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TAccess tAccess = (TAccess) result2_binding[0];
		SingleVariableAccess mAccess = (SingleVariableAccess) result2_binding[1];
		TMember tMember = (TMember) result2_binding[2];
		MDefinition mMember = (MDefinition) result2_binding[3];
		for (Object[] result2_black : FieldAccessSourceImpl.pattern_FieldAccessSource_24_2_matchcontext_blackBBBBFBB(
				tAccess, mAccess, tMember, mMember, sourceMatch, targetMatch)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[4];
			Object[] result2_green = FieldAccessSourceImpl.pattern_FieldAccessSource_24_2_matchcontext_greenBBBBBBFB(
					tAccess, mAccess, tMember, mMember, mMemberToTMember, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[6];

			// check csp
			Object[] result3_bindingAndBlack = FieldAccessSourceImpl
					.pattern_FieldAccessSource_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, tAccess,
							mAccess, tMember, mMember, mMemberToTMember, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = FieldAccessSourceImpl
						.pattern_FieldAccessSource_24_4_createcorrespondence_blackBBBBB(tAccess, mAccess, tMember,
								mMember, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tAccess] = " + tAccess + ", " + "[mAccess] = " + mAccess + ", "
							+ "[tMember] = " + tMember + ", " + "[mMember] = " + mMember + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldAccessSourceImpl.pattern_FieldAccessSource_24_4_createcorrespondence_greenBBFB(tAccess, mAccess,
						isApplicableMatch);
				// SingleVariableAccessToTAccess mAccessToTAccess = (SingleVariableAccessToTAccess) result4_green[2];

				// add to returned result
				Object[] result5_black = FieldAccessSourceImpl
						.pattern_FieldAccessSource_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldAccessSourceImpl.pattern_FieldAccessSource_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return FieldAccessSourceImpl.pattern_FieldAccessSource_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TAccess tAccess, SingleVariableAccess mAccess,
			TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("mAccess", mAccess);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
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
	public boolean checkDEC_FWD(SingleVariableAccess mAccess, MDefinition mMember) {// match tgg pattern
		Object[] result1_black = FieldAccessSourceImpl.pattern_FieldAccessSource_27_1_matchtggpattern_blackBB(mAccess,
				mMember);
		if (result1_black != null) {
			return FieldAccessSourceImpl.pattern_FieldAccessSource_27_2_expressionF();
		} else {
			return FieldAccessSourceImpl.pattern_FieldAccessSource_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAccess tAccess, TMember tMember) {// match tgg pattern
		Object[] result1_black = FieldAccessSourceImpl.pattern_FieldAccessSource_28_1_matchtggpattern_blackBB(tAccess,
				tMember);
		if (result1_black != null) {
			return FieldAccessSourceImpl.pattern_FieldAccessSource_28_2_expressionF();
		} else {
			return FieldAccessSourceImpl.pattern_FieldAccessSource_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter) {
		// create result
		Object[] result1_black = FieldAccessSourceImpl.pattern_FieldAccessSource_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldAccessSourceImpl.pattern_FieldAccessSource_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : FieldAccessSourceImpl
				.pattern_FieldAccessSource_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			TMember tMember = (TMember) result2_black[1];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[2];
			MDefinition mMember = (MDefinition) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = FieldAccessSourceImpl
					.pattern_FieldAccessSource_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, tMember,
							mMember, mMemberToTMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMember] = " + tMember
						+ ", " + "[mMember] = " + mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (FieldAccessSourceImpl.pattern_FieldAccessSource_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = FieldAccessSourceImpl
						.pattern_FieldAccessSource_29_5_checknacs_blackBBB(tMember, mMember, mMemberToTMember);
				if (result5_black != null) {

					// perform
					Object[] result6_black = FieldAccessSourceImpl.pattern_FieldAccessSource_29_6_perform_blackBBBB(
							tMember, mMember, mMemberToTMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed." + " Variables: " + "[tMember] = " + tMember
										+ ", " + "[mMember] = " + mMember + ", " + "[mMemberToTMember] = "
										+ mMemberToTMember + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldAccessSourceImpl.pattern_FieldAccessSource_29_6_perform_greenFFBBFB(tMember, mMember,
							ruleResult);
					// TAccess tAccess = (TAccess) result6_green[0];
					// SingleVariableAccess mAccess = (SingleVariableAccess) result6_green[1];
					// SingleVariableAccessToTAccess mAccessToTAccess = (SingleVariableAccessToTAccess) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return FieldAccessSourceImpl.pattern_FieldAccessSource_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
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
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPROPRIATE_FWD__MATCH_SINGLEVARIABLEACCESS_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (SingleVariableAccess) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.FIELD_ACCESS_SOURCE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SINGLEVARIABLEACCESS_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SingleVariableAccess) arguments.get(1),
					(MDefinition) arguments.get(2));
			return null;
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SINGLEVARIABLEACCESS_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SingleVariableAccess) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SINGLEVARIABLEACCESS_TMEMBER_MDEFINITION_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(SingleVariableAccess) arguments.get(1), (TMember) arguments.get(2), (MDefinition) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_ACCESS_SOURCE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPROPRIATE_BWD__MATCH_TACCESS_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TAccess) arguments.get(1), (TMember) arguments.get(2));
		case RulesPackage.FIELD_ACCESS_SOURCE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TACCESS_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAccess) arguments.get(1),
					(TMember) arguments.get(2));
			return null;
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TACCESS_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAccess) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TACCESS_TMEMBER_MDEFINITION_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAccess) arguments.get(1),
					(TMember) arguments.get(2), (MDefinition) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_ACCESS_SOURCE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TACCESS_SINGLEVARIABLEACCESS_TMEMBER_MDEFINITION_MDEFINITIONTOTMEMBER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TAccess) arguments.get(1),
					(SingleVariableAccess) arguments.get(2), (TMember) arguments.get(3), (MDefinition) arguments.get(4),
					(MDefinitionToTMember) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.FIELD_ACCESS_SOURCE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_SOURCE___CHECK_DEC_FWD__SINGLEVARIABLEACCESS_MDEFINITION:
			return checkDEC_FWD((SingleVariableAccess) arguments.get(0), (MDefinition) arguments.get(1));
		case RulesPackage.FIELD_ACCESS_SOURCE___CHECK_DEC_BWD__TACCESS_TMEMBER:
			return checkDEC_BWD((TAccess) arguments.get(0), (TMember) arguments.get(1));
		case RulesPackage.FIELD_ACCESS_SOURCE___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.FIELD_ACCESS_SOURCE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMEMBER_MDEFINITION_MDEFINITIONTOTMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMember) arguments.get(1),
					(MDefinition) arguments.get(2), (MDefinitionToTMember) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIELD_ACCESS_SOURCE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldAccessSource_0_1_initialbindings_blackBBBB(FieldAccessSource _this,
			Match match, SingleVariableAccess mAccess, MDefinition mMember) {
		return new Object[] { _this, match, mAccess, mMember };
	}

	public static final Object[] pattern_FieldAccessSource_0_2_SolveCSP_bindingFBBBB(FieldAccessSource _this,
			Match match, SingleVariableAccess mAccess, MDefinition mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAccess, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAccess, mMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessSource_0_2_SolveCSP_bindingAndBlackFBBBB(FieldAccessSource _this,
			Match match, SingleVariableAccess mAccess, MDefinition mMember) {
		Object[] result_pattern_FieldAccessSource_0_2_SolveCSP_binding = pattern_FieldAccessSource_0_2_SolveCSP_bindingFBBBB(
				_this, match, mAccess, mMember);
		if (result_pattern_FieldAccessSource_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessSource_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldAccessSource_0_2_SolveCSP_black = pattern_FieldAccessSource_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessSource_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAccess, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessSource_0_3_CheckCSP_expressionFBB(FieldAccessSource _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_0_4_collectelementstobetranslated_blackBBB(Match match,
			SingleVariableAccess mAccess, MDefinition mMember) {
		return new Object[] { match, mAccess, mMember };
	}

	public static final Object[] pattern_FieldAccessSource_0_4_collectelementstobetranslated_greenBBBF(Match match,
			SingleVariableAccess mAccess, MDefinition mMember) {
		EMoflonEdge mMember__mAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAccess);
		String mMember__mAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		mMember__mAccess____mAbstractFieldAccess.setSrc(mMember);
		mMember__mAccess____mAbstractFieldAccess.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mMember__mAccess____mAbstractFieldAccess);
		mMember__mAccess____mAbstractFieldAccess.setName(mMember__mAccess____mAbstractFieldAccess_name_prime);
		return new Object[] { match, mAccess, mMember, mMember__mAccess____mAbstractFieldAccess };
	}

	public static final Object[] pattern_FieldAccessSource_0_5_collectcontextelements_blackBBB(Match match,
			SingleVariableAccess mAccess, MDefinition mMember) {
		return new Object[] { match, mAccess, mMember };
	}

	public static final Object[] pattern_FieldAccessSource_0_5_collectcontextelements_greenBB(Match match,
			MDefinition mMember) {
		match.getContextNodes().add(mMember);
		return new Object[] { match, mMember };
	}

	public static final void pattern_FieldAccessSource_0_6_registerobjectstomatch_expressionBBBB(
			FieldAccessSource _this, Match match, SingleVariableAccess mAccess, MDefinition mMember) {
		_this.registerObjectsToMatch_FWD(match, mAccess, mMember);

	}

	public static final boolean pattern_FieldAccessSource_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessSource_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMemberToTMember");
		EObject tmpMAccess = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpMMemberToTMember = _localVariable_3;
		if (tmpMAccess instanceof SingleVariableAccess) {
			SingleVariableAccess mAccess = (SingleVariableAccess) tmpMAccess;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpMMember instanceof MDefinition) {
					MDefinition mMember = (MDefinition) tmpMMember;
					if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
						MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
						return new Object[] { mAccess, tMember, mMember, mMemberToTMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_1_1_performtransformation_blackBBBBFBB(
			SingleVariableAccess mAccess, TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			FieldAccessSource _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mAccess, tMember, mMember, mMemberToTMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_1_1_performtransformation_bindingAndBlackFFFFFBB(
			FieldAccessSource _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldAccessSource_1_1_performtransformation_binding = pattern_FieldAccessSource_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldAccessSource_1_1_performtransformation_binding != null) {
			SingleVariableAccess mAccess = (SingleVariableAccess) result_pattern_FieldAccessSource_1_1_performtransformation_binding[0];
			TMember tMember = (TMember) result_pattern_FieldAccessSource_1_1_performtransformation_binding[1];
			MDefinition mMember = (MDefinition) result_pattern_FieldAccessSource_1_1_performtransformation_binding[2];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_FieldAccessSource_1_1_performtransformation_binding[3];

			Object[] result_pattern_FieldAccessSource_1_1_performtransformation_black = pattern_FieldAccessSource_1_1_performtransformation_blackBBBBFBB(
					mAccess, tMember, mMember, mMemberToTMember, _this, isApplicableMatch);
			if (result_pattern_FieldAccessSource_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldAccessSource_1_1_performtransformation_black[4];

				return new Object[] { mAccess, tMember, mMember, mMemberToTMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_1_1_performtransformation_greenFBBF(
			SingleVariableAccess mAccess, TMember tMember) {
		TAccess tAccess = BasicFactory.eINSTANCE.createTAccess();
		SingleVariableAccessToTAccess mAccessToTAccess = ModiscoFactory.eINSTANCE.createSingleVariableAccessToTAccess();
		tMember.getTAccessing().add(tAccess);
		mAccessToTAccess.setSource(mAccess);
		mAccessToTAccess.setTarget(tAccess);
		return new Object[] { tAccess, mAccess, tMember, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessSource_1_2_collecttranslatedelements_blackBBB(TAccess tAccess,
			SingleVariableAccess mAccess, SingleVariableAccessToTAccess mAccessToTAccess) {
		return new Object[] { tAccess, mAccess, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessSource_1_2_collecttranslatedelements_greenFBBB(TAccess tAccess,
			SingleVariableAccess mAccess, SingleVariableAccessToTAccess mAccessToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tAccess);
		ruleresult.getTranslatedElements().add(mAccess);
		ruleresult.getCreatedLinkElements().add(mAccessToTAccess);
		return new Object[] { ruleresult, tAccess, mAccess, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessSource_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject tAccess, EObject mAccess, EObject tMember, EObject mMember,
			EObject mMemberToTMember, EObject mAccessToTAccess) {
		if (!tAccess.equals(tMember)) {
			if (!mAccess.equals(tAccess)) {
				if (!mAccess.equals(tMember)) {
					if (!mAccess.equals(mMember)) {
						if (!mAccess.equals(mMemberToTMember)) {
							if (!mAccess.equals(mAccessToTAccess)) {
								if (!mMember.equals(tAccess)) {
									if (!mMember.equals(tMember)) {
										if (!mMember.equals(mMemberToTMember)) {
											if (!mMemberToTMember.equals(tAccess)) {
												if (!mMemberToTMember.equals(tMember)) {
													if (!mAccessToTAccess.equals(tAccess)) {
														if (!mAccessToTAccess.equals(tMember)) {
															if (!mAccessToTAccess.equals(mMember)) {
																if (!mAccessToTAccess.equals(mMemberToTMember)) {
																	return new Object[] { ruleresult, tAccess, mAccess,
																			tMember, mMember, mMemberToTMember,
																			mAccessToTAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldAccessSource_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tAccess, EObject mAccess, EObject tMember, EObject mMember,
			EObject mAccessToTAccess) {
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccessToTAccess__mAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccessToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldAccessSource";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mMember__mAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String mAccessToTAccess__mAccess____source_name_prime = "source";
		String mAccessToTAccess__tAccess____target_name_prime = "target";
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAccess__tMember____tSource);
		mMember__mAccess____mAbstractFieldAccess.setSrc(mMember);
		mMember__mAccess____mAbstractFieldAccess.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(mMember__mAccess____mAbstractFieldAccess);
		mAccessToTAccess__mAccess____source.setSrc(mAccessToTAccess);
		mAccessToTAccess__mAccess____source.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mAccessToTAccess__mAccess____source);
		mAccessToTAccess__tAccess____target.setSrc(mAccessToTAccess);
		mAccessToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mAccessToTAccess__tAccess____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mMember__mAccess____mAbstractFieldAccess.setName(mMember__mAccess____mAbstractFieldAccess_name_prime);
		mAccessToTAccess__mAccess____source.setName(mAccessToTAccess__mAccess____source_name_prime);
		mAccessToTAccess__tAccess____target.setName(mAccessToTAccess__tAccess____target_name_prime);
		return new Object[] { ruleresult, tAccess, mAccess, tMember, mMember, mAccessToTAccess,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource, mMember__mAccess____mAbstractFieldAccess,
				mAccessToTAccess__mAccess____source, mAccessToTAccess__tAccess____target };
	}

	public static final void pattern_FieldAccessSource_1_5_registerobjects_expressionBBBBBBBB(FieldAccessSource _this,
			PerformRuleResult ruleresult, EObject tAccess, EObject mAccess, EObject tMember, EObject mMember,
			EObject mMemberToTMember, EObject mAccessToTAccess) {
		_this.registerObjects_FWD(ruleresult, tAccess, mAccess, tMember, mMember, mMemberToTMember, mAccessToTAccess);

	}

	public static final PerformRuleResult pattern_FieldAccessSource_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_2_1_preparereturnvalue_bindingFB(FieldAccessSource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldAccessSource _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldAccessSource _this) {
		Object[] result_pattern_FieldAccessSource_2_1_preparereturnvalue_binding = pattern_FieldAccessSource_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessSource_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldAccessSource_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessSource_2_1_preparereturnvalue_black = pattern_FieldAccessSource_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldAccessSource_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldAccessSource_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldAccessSource";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldAccessSource_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAccess");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject tmpMAccess = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		if (tmpMAccess instanceof SingleVariableAccess) {
			SingleVariableAccess mAccess = (SingleVariableAccess) tmpMAccess;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				return new Object[] { mAccess, mMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessSource_2_2_corematch_blackBFBFB(
			SingleVariableAccess mAccess, MDefinition mMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
			TMember tMember = mMemberToTMember.getTarget();
			if (tMember != null) {
				_result.add(new Object[] { mAccess, tMember, mMember, mMemberToTMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldAccessSource_2_3_findcontext_blackBBBB(
			SingleVariableAccess mAccess, TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.getMAbstractFieldAccess().contains(mAccess)) {
			if (mMember.equals(mMemberToTMember.getSource())) {
				if (tMember.equals(mMemberToTMember.getTarget())) {
					_result.add(new Object[] { mAccess, tMember, mMember, mMemberToTMember });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_2_3_findcontext_greenBBBBFFFF(SingleVariableAccess mAccess,
			TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMember__mAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMember__mAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMemberToTMember__tMember____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mAccess);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		mMember__mAccess____mAbstractFieldAccess.setSrc(mMember);
		mMember__mAccess____mAbstractFieldAccess.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(mMember__mAccess____mAbstractFieldAccess);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMember__mAccess____mAbstractFieldAccess.setName(mMember__mAccess____mAbstractFieldAccess_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		return new Object[] { mAccess, tMember, mMember, mMemberToTMember, isApplicableMatch,
				mMember__mAccess____mAbstractFieldAccess, mMemberToTMember__mMember____source,
				mMemberToTMember__tMember____target };
	}

	public static final Object[] pattern_FieldAccessSource_2_4_solveCSP_bindingFBBBBBB(FieldAccessSource _this,
			IsApplicableMatch isApplicableMatch, SingleVariableAccess mAccess, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mAccess, tMember, mMember,
				mMemberToTMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAccess, tMember, mMember, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessSource_2_4_solveCSP_bindingAndBlackFBBBBBB(FieldAccessSource _this,
			IsApplicableMatch isApplicableMatch, SingleVariableAccess mAccess, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember) {
		Object[] result_pattern_FieldAccessSource_2_4_solveCSP_binding = pattern_FieldAccessSource_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mAccess, tMember, mMember, mMemberToTMember);
		if (result_pattern_FieldAccessSource_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessSource_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessSource_2_4_solveCSP_black = pattern_FieldAccessSource_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessSource_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAccess, tMember, mMember, mMemberToTMember };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessSource_2_5_checkCSP_expressionFBB(FieldAccessSource _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessSource_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldAccessSource";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessSource_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_10_1_initialbindings_blackBBBB(FieldAccessSource _this,
			Match match, TAccess tAccess, TMember tMember) {
		return new Object[] { _this, match, tAccess, tMember };
	}

	public static final Object[] pattern_FieldAccessSource_10_2_SolveCSP_bindingFBBBB(FieldAccessSource _this,
			Match match, TAccess tAccess, TMember tMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAccess, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAccess, tMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessSource_10_2_SolveCSP_bindingAndBlackFBBBB(FieldAccessSource _this,
			Match match, TAccess tAccess, TMember tMember) {
		Object[] result_pattern_FieldAccessSource_10_2_SolveCSP_binding = pattern_FieldAccessSource_10_2_SolveCSP_bindingFBBBB(
				_this, match, tAccess, tMember);
		if (result_pattern_FieldAccessSource_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessSource_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldAccessSource_10_2_SolveCSP_black = pattern_FieldAccessSource_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessSource_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAccess, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessSource_10_3_CheckCSP_expressionFBB(FieldAccessSource _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_10_4_collectelementstobetranslated_blackBBB(Match match,
			TAccess tAccess, TMember tMember) {
		return new Object[] { match, tAccess, tMember };
	}

	public static final Object[] pattern_FieldAccessSource_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TAccess tAccess, TMember tMember) {
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAccess);
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAccess__tMember____tSource);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		return new Object[] { match, tAccess, tMember, tMember__tAccess____tAccessing, tAccess__tMember____tSource };
	}

	public static final Object[] pattern_FieldAccessSource_10_5_collectcontextelements_blackBBB(Match match,
			TAccess tAccess, TMember tMember) {
		return new Object[] { match, tAccess, tMember };
	}

	public static final Object[] pattern_FieldAccessSource_10_5_collectcontextelements_greenBB(Match match,
			TMember tMember) {
		match.getContextNodes().add(tMember);
		return new Object[] { match, tMember };
	}

	public static final void pattern_FieldAccessSource_10_6_registerobjectstomatch_expressionBBBB(
			FieldAccessSource _this, Match match, TAccess tAccess, TMember tMember) {
		_this.registerObjectsToMatch_BWD(match, tAccess, tMember);

	}

	public static final boolean pattern_FieldAccessSource_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessSource_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMemberToTMember");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpMMemberToTMember = _localVariable_3;
		if (tmpTAccess instanceof TAccess) {
			TAccess tAccess = (TAccess) tmpTAccess;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpMMember instanceof MDefinition) {
					MDefinition mMember = (MDefinition) tmpMMember;
					if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
						MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
						return new Object[] { tAccess, tMember, mMember, mMemberToTMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_11_1_performtransformation_blackBBBBFBB(TAccess tAccess,
			TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember, FieldAccessSource _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAccess, tMember, mMember, mMemberToTMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_11_1_performtransformation_bindingAndBlackFFFFFBB(
			FieldAccessSource _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldAccessSource_11_1_performtransformation_binding = pattern_FieldAccessSource_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldAccessSource_11_1_performtransformation_binding != null) {
			TAccess tAccess = (TAccess) result_pattern_FieldAccessSource_11_1_performtransformation_binding[0];
			TMember tMember = (TMember) result_pattern_FieldAccessSource_11_1_performtransformation_binding[1];
			MDefinition mMember = (MDefinition) result_pattern_FieldAccessSource_11_1_performtransformation_binding[2];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_FieldAccessSource_11_1_performtransformation_binding[3];

			Object[] result_pattern_FieldAccessSource_11_1_performtransformation_black = pattern_FieldAccessSource_11_1_performtransformation_blackBBBBFBB(
					tAccess, tMember, mMember, mMemberToTMember, _this, isApplicableMatch);
			if (result_pattern_FieldAccessSource_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldAccessSource_11_1_performtransformation_black[4];

				return new Object[] { tAccess, tMember, mMember, mMemberToTMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_11_1_performtransformation_greenBFBF(TAccess tAccess,
			MDefinition mMember) {
		SingleVariableAccess mAccess = JavaFactory.eINSTANCE.createSingleVariableAccess();
		SingleVariableAccessToTAccess mAccessToTAccess = ModiscoFactory.eINSTANCE.createSingleVariableAccessToTAccess();
		mMember.getMAbstractFieldAccess().add(mAccess);
		mAccessToTAccess.setSource(mAccess);
		mAccessToTAccess.setTarget(tAccess);
		return new Object[] { tAccess, mAccess, mMember, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessSource_11_2_collecttranslatedelements_blackBBB(TAccess tAccess,
			SingleVariableAccess mAccess, SingleVariableAccessToTAccess mAccessToTAccess) {
		return new Object[] { tAccess, mAccess, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessSource_11_2_collecttranslatedelements_greenFBBB(TAccess tAccess,
			SingleVariableAccess mAccess, SingleVariableAccessToTAccess mAccessToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tAccess);
		ruleresult.getCreatedElements().add(mAccess);
		ruleresult.getCreatedLinkElements().add(mAccessToTAccess);
		return new Object[] { ruleresult, tAccess, mAccess, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessSource_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject tAccess, EObject mAccess, EObject tMember, EObject mMember,
			EObject mMemberToTMember, EObject mAccessToTAccess) {
		if (!tAccess.equals(tMember)) {
			if (!mAccess.equals(tAccess)) {
				if (!mAccess.equals(tMember)) {
					if (!mAccess.equals(mMember)) {
						if (!mAccess.equals(mMemberToTMember)) {
							if (!mAccess.equals(mAccessToTAccess)) {
								if (!mMember.equals(tAccess)) {
									if (!mMember.equals(tMember)) {
										if (!mMember.equals(mMemberToTMember)) {
											if (!mMemberToTMember.equals(tAccess)) {
												if (!mMemberToTMember.equals(tMember)) {
													if (!mAccessToTAccess.equals(tAccess)) {
														if (!mAccessToTAccess.equals(tMember)) {
															if (!mAccessToTAccess.equals(mMember)) {
																if (!mAccessToTAccess.equals(mMemberToTMember)) {
																	return new Object[] { ruleresult, tAccess, mAccess,
																			tMember, mMember, mMemberToTMember,
																			mAccessToTAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldAccessSource_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tAccess, EObject mAccess, EObject tMember, EObject mMember,
			EObject mAccessToTAccess) {
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccessToTAccess__mAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccessToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldAccessSource";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mMember__mAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String mAccessToTAccess__mAccess____source_name_prime = "source";
		String mAccessToTAccess__tAccess____target_name_prime = "target";
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAccess__tMember____tSource);
		mMember__mAccess____mAbstractFieldAccess.setSrc(mMember);
		mMember__mAccess____mAbstractFieldAccess.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mMember__mAccess____mAbstractFieldAccess);
		mAccessToTAccess__mAccess____source.setSrc(mAccessToTAccess);
		mAccessToTAccess__mAccess____source.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mAccessToTAccess__mAccess____source);
		mAccessToTAccess__tAccess____target.setSrc(mAccessToTAccess);
		mAccessToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mAccessToTAccess__tAccess____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mMember__mAccess____mAbstractFieldAccess.setName(mMember__mAccess____mAbstractFieldAccess_name_prime);
		mAccessToTAccess__mAccess____source.setName(mAccessToTAccess__mAccess____source_name_prime);
		mAccessToTAccess__tAccess____target.setName(mAccessToTAccess__tAccess____target_name_prime);
		return new Object[] { ruleresult, tAccess, mAccess, tMember, mMember, mAccessToTAccess,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource, mMember__mAccess____mAbstractFieldAccess,
				mAccessToTAccess__mAccess____source, mAccessToTAccess__tAccess____target };
	}

	public static final void pattern_FieldAccessSource_11_5_registerobjects_expressionBBBBBBBB(FieldAccessSource _this,
			PerformRuleResult ruleresult, EObject tAccess, EObject mAccess, EObject tMember, EObject mMember,
			EObject mMemberToTMember, EObject mAccessToTAccess) {
		_this.registerObjects_BWD(ruleresult, tAccess, mAccess, tMember, mMember, mMemberToTMember, mAccessToTAccess);

	}

	public static final PerformRuleResult pattern_FieldAccessSource_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_12_1_preparereturnvalue_bindingFB(FieldAccessSource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldAccessSource _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldAccessSource _this) {
		Object[] result_pattern_FieldAccessSource_12_1_preparereturnvalue_binding = pattern_FieldAccessSource_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessSource_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldAccessSource_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessSource_12_1_preparereturnvalue_black = pattern_FieldAccessSource_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldAccessSource_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldAccessSource_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldAccessSource";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldAccessSource_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAccess");
		EObject _localVariable_1 = match.getObject("tMember");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		if (tmpTAccess instanceof TAccess) {
			TAccess tAccess = (TAccess) tmpTAccess;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				return new Object[] { tAccess, tMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessSource_12_2_corematch_blackBBFFB(TAccess tAccess,
			TMember tMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			MDefinition mMember = mMemberToTMember.getSource();
			if (mMember != null) {
				_result.add(new Object[] { tAccess, tMember, mMember, mMemberToTMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldAccessSource_12_3_findcontext_blackBBBB(TAccess tAccess,
			TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMember.getTAccessing().contains(tAccess)) {
			if (mMember.equals(mMemberToTMember.getSource())) {
				if (tMember.equals(mMemberToTMember.getTarget())) {
					_result.add(new Object[] { tAccess, tMember, mMember, mMemberToTMember });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_12_3_findcontext_greenBBBBFFFFF(TAccess tAccess,
			TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMemberToTMember__tMember____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____tSource);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		return new Object[] { tAccess, tMember, mMember, mMemberToTMember, isApplicableMatch,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource, mMemberToTMember__mMember____source,
				mMemberToTMember__tMember____target };
	}

	public static final Object[] pattern_FieldAccessSource_12_4_solveCSP_bindingFBBBBBB(FieldAccessSource _this,
			IsApplicableMatch isApplicableMatch, TAccess tAccess, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAccess, tMember, mMember,
				mMemberToTMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, tMember, mMember, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessSource_12_4_solveCSP_bindingAndBlackFBBBBBB(FieldAccessSource _this,
			IsApplicableMatch isApplicableMatch, TAccess tAccess, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember) {
		Object[] result_pattern_FieldAccessSource_12_4_solveCSP_binding = pattern_FieldAccessSource_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tAccess, tMember, mMember, mMemberToTMember);
		if (result_pattern_FieldAccessSource_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessSource_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessSource_12_4_solveCSP_black = pattern_FieldAccessSource_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessSource_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, tMember, mMember, mMemberToTMember };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessSource_12_5_checkCSP_expressionFBB(FieldAccessSource _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessSource_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldAccessSource";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessSource_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_20_1_preparereturnvalue_bindingFB(FieldAccessSource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldAccessSource _this) {
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

	public static final Object[] pattern_FieldAccessSource_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldAccessSource _this) {
		Object[] result_pattern_FieldAccessSource_20_1_preparereturnvalue_binding = pattern_FieldAccessSource_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessSource_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldAccessSource_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessSource_20_1_preparereturnvalue_black = pattern_FieldAccessSource_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldAccessSource_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldAccessSource_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldAccessSource_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldAccessSource_20_2_testcorematchandDECs_black_nac_0BB(
			SingleVariableAccess mAccess, MDefinition mMember) {
		for (MDefinition __DEC_mAccess_mAbstractFieldAccess_724111 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MDefinition.class, "mAbstractFieldAccess")) {
			if (!mMember.equals(__DEC_mAccess_mAbstractFieldAccess_724111)) {
				return new Object[] { mAccess, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_20_2_testcorematchandDECs_black_nac_1BB(
			SingleVariableAccess mAccess, MDefinition mMember) {
		for (MDefinition __DEC_mAccess_mAbstractFieldAccess_530595 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MDefinition.class, "mAbstractFieldAccess")) {
			if (!mMember.equals(__DEC_mAccess_mAbstractFieldAccess_530595)) {
				return new Object[] { mAccess, mMember };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessSource_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mAbstractFieldAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_mAbstractFieldAccess.getSrc();
		if (tmpMMember instanceof MDefinition) {
			MDefinition mMember = (MDefinition) tmpMMember;
			EObject tmpMAccess = _edge_mAbstractFieldAccess.getTrg();
			if (tmpMAccess instanceof SingleVariableAccess) {
				SingleVariableAccess mAccess = (SingleVariableAccess) tmpMAccess;
				if (mMember.getMAbstractFieldAccess().contains(mAccess)) {
					if (pattern_FieldAccessSource_20_2_testcorematchandDECs_black_nac_0BB(mAccess, mMember) == null) {
						if (pattern_FieldAccessSource_20_2_testcorematchandDECs_black_nac_1BB(mAccess,
								mMember) == null) {
							_result.add(new Object[] { mAccess, mMember, _edge_mAbstractFieldAccess });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldAccessSource_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldAccessSource _this, Match match, SingleVariableAccess mAccess, MDefinition mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAccess, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldAccessSource_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldAccessSource _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldAccessSource_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_21_1_preparereturnvalue_bindingFB(FieldAccessSource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldAccessSource _this) {
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

	public static final Object[] pattern_FieldAccessSource_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldAccessSource _this) {
		Object[] result_pattern_FieldAccessSource_21_1_preparereturnvalue_binding = pattern_FieldAccessSource_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessSource_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldAccessSource_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessSource_21_1_preparereturnvalue_black = pattern_FieldAccessSource_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldAccessSource_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldAccessSource_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldAccessSource_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldAccessSource_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tAccessing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_tAccessing.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTAccess = _edge_tAccessing.getTrg();
			if (tmpTAccess instanceof TAccess) {
				TAccess tAccess = (TAccess) tmpTAccess;
				if (tMember.getTAccessing().contains(tAccess)) {
					_result.add(new Object[] { tAccess, tMember, _edge_tAccessing });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldAccessSource_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldAccessSource _this, Match match, TAccess tAccess, TMember tMember) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAccess, tMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldAccessSource_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldAccessSource _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldAccessSource_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_24_1_prepare_blackB(FieldAccessSource _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldAccessSource_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldAccessSource_24_2_matchcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAccess");
		EObject _localVariable_1 = sourceMatch.getObject("mAccess");
		EObject _localVariable_2 = targetMatch.getObject("tMember");
		EObject _localVariable_3 = sourceMatch.getObject("mMember");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpTAccess instanceof TAccess) {
			TAccess tAccess = (TAccess) tmpTAccess;
			if (tmpMAccess instanceof SingleVariableAccess) {
				SingleVariableAccess mAccess = (SingleVariableAccess) tmpMAccess;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { tAccess, mAccess, tMember, mMember, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessSource_24_2_matchcontext_blackBBBBFBB(TAccess tAccess,
			SingleVariableAccess mAccess, TMember tMember, MDefinition mMember, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tMember.getTAccessing().contains(tAccess)) {
				if (mMember.getMAbstractFieldAccess().contains(mAccess)) {
					for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
						if (tMember.equals(mMemberToTMember.getTarget())) {
							_result.add(new Object[] { tAccess, mAccess, tMember, mMember, mMemberToTMember,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_24_2_matchcontext_greenBBBBBBFB(TAccess tAccess,
			SingleVariableAccess mAccess, TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "FieldAccessSource";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mAccess);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { tAccess, mAccess, tMember, mMember, mMemberToTMember, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_FieldAccessSource_24_3_checkcsp_bindingFBBBBBBBBB(FieldAccessSource _this,
			CCMatch isApplicableMatch, TAccess tAccess, SingleVariableAccess mAccess, TMember tMember,
			MDefinition mMember, MDefinitionToTMember mMemberToTMember, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, tAccess, mAccess, tMember, mMember,
				mMemberToTMember, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, mAccess, tMember, mMember, mMemberToTMember,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessSource_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(
			FieldAccessSource _this, CCMatch isApplicableMatch, TAccess tAccess, SingleVariableAccess mAccess,
			TMember tMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_FieldAccessSource_24_3_checkcsp_binding = pattern_FieldAccessSource_24_3_checkcsp_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tAccess, mAccess, tMember, mMember, mMemberToTMember, sourceMatch,
				targetMatch);
		if (result_pattern_FieldAccessSource_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessSource_24_3_checkcsp_binding[0];

			Object[] result_pattern_FieldAccessSource_24_3_checkcsp_black = pattern_FieldAccessSource_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_FieldAccessSource_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, mAccess, tMember, mMember,
						mMemberToTMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_24_4_createcorrespondence_blackBBBBB(TAccess tAccess,
			SingleVariableAccess mAccess, TMember tMember, MDefinition mMember, CCMatch isApplicableMatch) {
		return new Object[] { tAccess, mAccess, tMember, mMember, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessSource_24_4_createcorrespondence_greenBBFB(TAccess tAccess,
			SingleVariableAccess mAccess, CCMatch isApplicableMatch) {
		SingleVariableAccessToTAccess mAccessToTAccess = ModiscoFactory.eINSTANCE.createSingleVariableAccessToTAccess();
		mAccessToTAccess.setSource(mAccess);
		mAccessToTAccess.setTarget(tAccess);
		isApplicableMatch.getCreateCorr().add(mAccessToTAccess);
		return new Object[] { tAccess, mAccess, mAccessToTAccess, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessSource_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessSource_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldAccessSource";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessSource_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_27_1_matchtggpattern_black_nac_0BB(
			SingleVariableAccess mAccess, MDefinition mMember) {
		for (MDefinition __DEC_mAccess_mAbstractFieldAccess_878945 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MDefinition.class, "mAbstractFieldAccess")) {
			if (!mMember.equals(__DEC_mAccess_mAbstractFieldAccess_878945)) {
				return new Object[] { mAccess, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_27_1_matchtggpattern_black_nac_1BB(
			SingleVariableAccess mAccess, MDefinition mMember) {
		for (MDefinition __DEC_mAccess_mAbstractFieldAccess_302092 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MDefinition.class, "mAbstractFieldAccess")) {
			if (!mMember.equals(__DEC_mAccess_mAbstractFieldAccess_302092)) {
				return new Object[] { mAccess, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_27_1_matchtggpattern_blackBB(SingleVariableAccess mAccess,
			MDefinition mMember) {
		if (mMember.getMAbstractFieldAccess().contains(mAccess)) {
			if (pattern_FieldAccessSource_27_1_matchtggpattern_black_nac_0BB(mAccess, mMember) == null) {
				if (pattern_FieldAccessSource_27_1_matchtggpattern_black_nac_1BB(mAccess, mMember) == null) {
					return new Object[] { mAccess, mMember };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessSource_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessSource_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_28_1_matchtggpattern_blackBB(TAccess tAccess,
			TMember tMember) {
		if (tMember.getTAccessing().contains(tAccess)) {
			return new Object[] { tAccess, tMember };
		}
		return null;
	}

	public static final boolean pattern_FieldAccessSource_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessSource_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_29_1_createresult_blackB(FieldAccessSource _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldAccessSource_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldAccessSource_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessSource_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					TMember tMember = mMemberToTMember.getTarget();
					if (tMember != null) {
						MDefinition mMember = mMemberToTMember.getSource();
						if (mMember != null) {
							if (pattern_FieldAccessSource_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									mMemberToTMember) == null) {
								if (pattern_FieldAccessSource_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										tMember) == null) {
									if (pattern_FieldAccessSource_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											mMember) == null) {
										_result.add(new Object[] { mMemberToTMemberList, tMember, mMemberToTMember,
												mMember, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_FieldAccessSource_29_3_solveCSP_bindingFBBBBBB(FieldAccessSource _this,
			IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tMember, mMember, mMemberToTMember,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMember, mMember, mMemberToTMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessSource_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessSource_29_3_solveCSP_bindingAndBlackFBBBBBB(FieldAccessSource _this,
			IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldAccessSource_29_3_solveCSP_binding = pattern_FieldAccessSource_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tMember, mMember, mMemberToTMember, ruleResult);
		if (result_pattern_FieldAccessSource_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessSource_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessSource_29_3_solveCSP_black = pattern_FieldAccessSource_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessSource_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMember, mMember, mMemberToTMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessSource_29_4_checkCSP_expressionFBB(FieldAccessSource _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessSource_29_5_checknacs_blackBBB(TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember) {
		return new Object[] { tMember, mMember, mMemberToTMember };
	}

	public static final Object[] pattern_FieldAccessSource_29_6_perform_blackBBBB(TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tMember, mMember, mMemberToTMember, ruleResult };
	}

	public static final Object[] pattern_FieldAccessSource_29_6_perform_greenFFBBFB(TMember tMember,
			MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		TAccess tAccess = BasicFactory.eINSTANCE.createTAccess();
		SingleVariableAccess mAccess = JavaFactory.eINSTANCE.createSingleVariableAccess();
		SingleVariableAccessToTAccess mAccessToTAccess = ModiscoFactory.eINSTANCE.createSingleVariableAccessToTAccess();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		tMember.getTAccessing().add(tAccess);
		ruleResult.getTargetObjects().add(tAccess);
		mMember.getMAbstractFieldAccess().add(mAccess);
		ruleResult.getSourceObjects().add(mAccess);
		mAccessToTAccess.setSource(mAccess);
		mAccessToTAccess.setTarget(tAccess);
		ruleResult.getCorrObjects().add(mAccessToTAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAccess, mAccess, tMember, mMember, mAccessToTAccess, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FieldAccessSource_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldAccessSourceImpl
