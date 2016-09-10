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

import org.eclipse.gmt.modisco.java.ConstructorInvocation;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess;
import org.gravity.tgg.modisco.MDefinitionToTMember;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.ConstructorInvocationSource;
import org.gravity.tgg.modisco.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Constructor Invocation Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstructorInvocationSourceImpl extends AbstractRuleImpl implements ConstructorInvocationSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorInvocationSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getConstructorInvocationSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ConstructorInvocation invocation, MDefinition mMember) {
		// initial bindings
		Object[] result1_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_0_1_initialbindings_blackBBBB(this, match, invocation, mMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[invocation] = " + invocation + ", "
					+ "[mMember] = " + mMember + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, invocation,
						mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[invocation] = " + invocation + ", " + "[mMember] = "
					+ mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_0_4_collectelementstobetranslated_blackBBB(match, invocation,
							mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[invocation] = " + invocation + ", "
						+ "[mMember] = " + mMember + ".");
			}
			ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_0_4_collectelementstobetranslated_greenBBBF(match, invocation,
							mMember);
			// EMoflonEdge mMember__invocation____abstractMethodInvocations = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_0_5_collectcontextelements_blackBBB(match, invocation,
							mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[invocation] = " + invocation + ", "
						+ "[mMember] = " + mMember + ".");
			}
			ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_0_5_collectcontextelements_greenBB(match, mMember);

			// register objects to match
			ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_0_6_registerobjectstomatch_expressionBBBB(this, match,
							invocation, mMember);
			return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_0_7_expressionF();
		} else {
			return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ConstructorInvocation invocation = (ConstructorInvocation) result1_bindingAndBlack[0];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_1_1_performtransformation_greenBBFF(invocation, tMember);
		TAccess tAccess = (TAccess) result1_green[2];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_green[3];

		// collect translated elements
		Object[] result2_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_1_2_collecttranslatedelements_blackBBB(invocation, tAccess,
						invocationToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[invocation] = " + invocation + ", " + "[tAccess] = " + tAccess + ", "
					+ "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		Object[] result2_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_1_2_collecttranslatedelements_greenFBBB(invocation, tAccess,
						invocationToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, invocation,
						mMemberToTMember, tMember, tAccess, mMember, invocationToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[invocation] = " + invocation + ", "
					+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
					+ "[tAccess] = " + tAccess + ", " + "[mMember] = " + mMember + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ".");
		}
		ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, invocation, tMember, tAccess, mMember, invocationToTAccess);
		// EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mMember__invocation____abstractMethodInvocations = (EMoflonEdge) result3_green[8];
		// EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMember, invocationToTAccess);
		return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ConstructorInvocation invocation = (ConstructorInvocation) result2_binding[0];
		MDefinition mMember = (MDefinition) result2_binding[1];
		for (Object[] result2_black : ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_2_2_corematch_blackBFFBB(invocation, mMember, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_2_3_findcontext_blackBBBB(invocation, mMemberToTMember,
							tMember, mMember)) {
				Object[] result3_green = ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_2_3_findcontext_greenBBBBFFFF(invocation, mMemberToTMember,
								tMember, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge mMember__invocation____abstractMethodInvocations = (EMoflonEdge) result3_green[5];
				// EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, invocation, mMemberToTMember, tMember, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[invocation] = " + invocation + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
							+ "[tMember] = " + tMember + ", " + "[mMember] = " + mMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_2_5_checkCSP_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ConstructorInvocation invocation, MDefinition mMember) {
		match.registerObject("invocation", invocation);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ConstructorInvocation invocation, MDefinition mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ConstructorInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mMember", mMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember,
			EObject tMember, EObject tAccess, EObject mMember, EObject invocationToTAccess) {
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("invocation").eClass())
				.equals("java.ConstructorInvocation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMember tMember, TAccess tAccess) {
		// initial bindings
		Object[] result1_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_10_1_initialbindings_blackBBBB(this, match, tMember, tAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tMember] = " + tMember + ", "
					+ "[tAccess] = " + tAccess + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tMember, tAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = "
					+ tAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_10_4_collectelementstobetranslated_blackBBB(match, tMember,
							tAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tMember] = " + tMember + ", "
						+ "[tAccess] = " + tAccess + ".");
			}
			ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_10_4_collectelementstobetranslated_greenBBBFF(match, tMember,
							tAccess);
			// EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_10_5_collectcontextelements_blackBBB(match, tMember, tAccess);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
			}
			ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_10_5_collectcontextelements_greenBB(match, tMember);

			// register objects to match
			ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_10_6_registerobjectstomatch_expressionBBBB(this, match,
							tMember, tAccess);
			return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_10_7_expressionF();
		} else {
			return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		TMember tMember = (TMember) result1_bindingAndBlack[1];
		TAccess tAccess = (TAccess) result1_bindingAndBlack[2];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_11_1_performtransformation_greenFBBF(tAccess, mMember);
		ConstructorInvocation invocation = (ConstructorInvocation) result1_green[0];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_green[3];

		// collect translated elements
		Object[] result2_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_11_2_collecttranslatedelements_blackBBB(invocation, tAccess,
						invocationToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[invocation] = " + invocation + ", " + "[tAccess] = " + tAccess + ", "
					+ "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		Object[] result2_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_11_2_collecttranslatedelements_greenFBBB(invocation, tAccess,
						invocationToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, invocation,
						mMemberToTMember, tMember, tAccess, mMember, invocationToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[invocation] = " + invocation + ", "
					+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
					+ "[tAccess] = " + tAccess + ", " + "[mMember] = " + mMember + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ".");
		}
		ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, invocation, tMember, tAccess, mMember, invocationToTAccess);
		// EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mMember__invocation____abstractMethodInvocations = (EMoflonEdge) result3_green[8];
		// EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_11_5_registerobjects_expressionBBBBBBBB(
				this, ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMember, invocationToTAccess);
		return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tMember = (TMember) result2_binding[0];
		TAccess tAccess = (TAccess) result2_binding[1];
		for (Object[] result2_black : ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_12_2_corematch_blackFBBFB(tMember, tAccess, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			MDefinition mMember = (MDefinition) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_12_3_findcontext_blackBBBB(mMemberToTMember, tMember, tAccess,
							mMember)) {
				Object[] result3_green = ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_12_3_findcontext_greenBBBBFFFFF(mMemberToTMember, tMember,
								tAccess, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[5];
				// EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[8];

				// solve CSP
				Object[] result4_bindingAndBlack = ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, mMemberToTMember, tMember, tAccess, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
							+ "[tAccess] = " + tAccess + ", " + "[mMember] = " + mMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tMember, TAccess tAccess) {
		match.registerObject("tMember", tMember);
		match.registerObject("tAccess", tAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tMember, TAccess tAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			TMember tMember, TAccess tAccess, MDefinition mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("mMember", mMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember,
			EObject tMember, EObject tAccess, EObject mMember, EObject invocationToTAccess) {
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_50(EMoflonEdge _edge_abstractMethodInvocations) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_20_2_testcorematchandDECs_blackFFB(
						_edge_abstractMethodInvocations)) {
			ConstructorInvocation invocation = (ConstructorInvocation) result2_black[0];
			MDefinition mMember = (MDefinition) result2_black[1];
			Object[] result2_green = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, invocation, mMember)) {
				// Ensure that the correct types of elements are matched
				if (ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_47(EMoflonEdge _edge_tAccessing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_21_2_testcorematchandDECs_blackFFB(_edge_tAccessing)) {
			TMember tMember = (TMember) result2_black[0];
			TAccess tAccess = (TAccess) result2_black[1];
			Object[] result2_green = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tMember, tAccess)) {
				// Ensure that the correct types of elements are matched
				if (ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ConstructorInvocationSource");
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
		ruleResult.setRule("ConstructorInvocationSource");
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
		Object[] result1_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_24_2_matchcontext_bindingFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ConstructorInvocation invocation = (ConstructorInvocation) result2_binding[0];
		TMember tMember = (TMember) result2_binding[1];
		TAccess tAccess = (TAccess) result2_binding[2];
		MDefinition mMember = (MDefinition) result2_binding[3];
		for (Object[] result2_black : ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_24_2_matchcontext_blackBFBBBBB(invocation, tMember, tAccess,
						mMember, sourceMatch, targetMatch)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			Object[] result2_green = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_24_2_matchcontext_greenBBBBBBFB(invocation, mMemberToTMember,
							tMember, tAccess, mMember, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[6];

			// check csp
			Object[] result3_bindingAndBlack = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, invocation, mMemberToTMember, tMember, tAccess, mMember, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_24_4_createcorrespondence_blackBBBBB(invocation, tMember,
								tAccess, mMember, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[invocation] = " + invocation + ", " + "[tMember] = " + tMember + ", "
							+ "[tAccess] = " + tAccess + ", " + "[mMember] = " + mMember + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_24_4_createcorrespondence_greenBBFB(
						invocation, tAccess, isApplicableMatch);
				// AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result4_green[2];

				// add to returned result
				Object[] result5_black = ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_24_5_addtoreturnedresult_blackBB(result,
								isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_24_5_addtoreturnedresult_greenBB(
						result, isApplicableMatch);

			} else {
			}

		}
		return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, ConstructorInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess, MDefinition mMember,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("mMember", mMember);
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
	public boolean checkDEC_FWD(ConstructorInvocation invocation, MDefinition mMember) {// match tgg pattern
		Object[] result1_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_27_1_matchtggpattern_blackBB(invocation, mMember);
		if (result1_black != null) {
			return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_27_2_expressionF();
		} else {
			return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tMember, TAccess tAccess) {// match tgg pattern
		Object[] result1_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_28_1_matchtggpattern_blackBB(tMember, tAccess);
		if (result1_black != null) {
			return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_28_2_expressionF();
		} else {
			return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_28_3_expressionF();
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
		Object[] result1_black = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ConstructorInvocationSourceImpl
				.pattern_ConstructorInvocationSource_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			TMember tMember = (TMember) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = ConstructorInvocationSourceImpl
					.pattern_ConstructorInvocationSource_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mMemberToTMember, tMember, mMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
						+ mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[mMember] = " + mMember + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = ConstructorInvocationSourceImpl
						.pattern_ConstructorInvocationSource_29_5_checknacs_blackBBB(mMemberToTMember, tMember,
								mMember);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_29_6_perform_blackBBBB(mMemberToTMember, tMember,
									mMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
								+ "[mMember] = " + mMember + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ConstructorInvocationSourceImpl
							.pattern_ConstructorInvocationSource_29_6_perform_greenFBFBFB(tMember, mMember, ruleResult);
					// ConstructorInvocation invocation = (ConstructorInvocation) result6_green[0];
					// TAccess tAccess = (TAccess) result6_green[2];
					// AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return ConstructorInvocationSourceImpl.pattern_ConstructorInvocationSource_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			TMember tMember, MDefinition mMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mMember", mMember);
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
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPROPRIATE_FWD__MATCH_CONSTRUCTORINVOCATION_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (ConstructorInvocation) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONSTRUCTORINVOCATION_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ConstructorInvocation) arguments.get(1),
					(MDefinition) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONSTRUCTORINVOCATION_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ConstructorInvocation) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONSTRUCTORINVOCATION_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(ConstructorInvocation) arguments.get(1), (MDefinitionToTMember) arguments.get(2),
					(TMember) arguments.get(3), (MDefinition) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TACCESS:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TAccess) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TACCESS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TAccess) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TACCESS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TAccess) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TMEMBER_TACCESS_MDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TMember) arguments.get(2), (TAccess) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_50((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_47__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_47((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_CONSTRUCTORINVOCATION_MDEFINITIONTOTMEMBER_TMEMBER_TACCESS_MDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (ConstructorInvocation) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2), (TMember) arguments.get(3), (TAccess) arguments.get(4),
					(MDefinition) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___CHECK_DEC_FWD__CONSTRUCTORINVOCATION_MDEFINITION:
			return checkDEC_FWD((ConstructorInvocation) arguments.get(0), (MDefinition) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___CHECK_DEC_BWD__TMEMBER_TACCESS:
			return checkDEC_BWD((TMember) arguments.get(0), (TAccess) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TMember) arguments.get(2), (MDefinition) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConstructorInvocationSource_0_1_initialbindings_blackBBBB(
			ConstructorInvocationSource _this, Match match, ConstructorInvocation invocation, MDefinition mMember) {
		return new Object[] { _this, match, invocation, mMember };
	}

	public static final Object[] pattern_ConstructorInvocationSource_0_2_SolveCSP_bindingFBBBB(
			ConstructorInvocationSource _this, Match match, ConstructorInvocation invocation, MDefinition mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, invocation, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, invocation, mMember };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorInvocationSource_0_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorInvocationSource _this, Match match, ConstructorInvocation invocation, MDefinition mMember) {
		Object[] result_pattern_ConstructorInvocationSource_0_2_SolveCSP_binding = pattern_ConstructorInvocationSource_0_2_SolveCSP_bindingFBBBB(
				_this, match, invocation, mMember);
		if (result_pattern_ConstructorInvocationSource_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorInvocationSource_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_0_2_SolveCSP_black = pattern_ConstructorInvocationSource_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorInvocationSource_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, invocation, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorInvocationSource_0_3_CheckCSP_expressionFBB(
			ConstructorInvocationSource _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_0_4_collectelementstobetranslated_blackBBB(
			Match match, ConstructorInvocation invocation, MDefinition mMember) {
		return new Object[] { match, invocation, mMember };
	}

	public static final Object[] pattern_ConstructorInvocationSource_0_4_collectelementstobetranslated_greenBBBF(
			Match match, ConstructorInvocation invocation, MDefinition mMember) {
		EMoflonEdge mMember__invocation____abstractMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(invocation);
		String mMember__invocation____abstractMethodInvocations_name_prime = "abstractMethodInvocations";
		mMember__invocation____abstractMethodInvocations.setSrc(mMember);
		mMember__invocation____abstractMethodInvocations.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mMember__invocation____abstractMethodInvocations);
		mMember__invocation____abstractMethodInvocations
				.setName(mMember__invocation____abstractMethodInvocations_name_prime);
		return new Object[] { match, invocation, mMember, mMember__invocation____abstractMethodInvocations };
	}

	public static final Object[] pattern_ConstructorInvocationSource_0_5_collectcontextelements_blackBBB(Match match,
			ConstructorInvocation invocation, MDefinition mMember) {
		return new Object[] { match, invocation, mMember };
	}

	public static final Object[] pattern_ConstructorInvocationSource_0_5_collectcontextelements_greenBB(Match match,
			MDefinition mMember) {
		match.getContextNodes().add(mMember);
		return new Object[] { match, mMember };
	}

	public static final void pattern_ConstructorInvocationSource_0_6_registerobjectstomatch_expressionBBBB(
			ConstructorInvocationSource _this, Match match, ConstructorInvocation invocation, MDefinition mMember) {
		_this.registerObjectsToMatch_FWD(match, invocation, mMember);

	}

	public static final boolean pattern_ConstructorInvocationSource_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorInvocationSource_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMember");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMMemberToTMember = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpInvocation instanceof ConstructorInvocation) {
			ConstructorInvocation invocation = (ConstructorInvocation) tmpInvocation;
			if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { invocation, mMemberToTMember, tMember, mMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_1_1_performtransformation_blackBBBBFBB(
			ConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinition mMember, ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { invocation, mMemberToTMember, tMember, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_1_1_performtransformation_bindingAndBlackFFFFFBB(
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorInvocationSource_1_1_performtransformation_binding = pattern_ConstructorInvocationSource_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorInvocationSource_1_1_performtransformation_binding != null) {
			ConstructorInvocation invocation = (ConstructorInvocation) result_pattern_ConstructorInvocationSource_1_1_performtransformation_binding[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_ConstructorInvocationSource_1_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_ConstructorInvocationSource_1_1_performtransformation_binding[2];
			MDefinition mMember = (MDefinition) result_pattern_ConstructorInvocationSource_1_1_performtransformation_binding[3];

			Object[] result_pattern_ConstructorInvocationSource_1_1_performtransformation_black = pattern_ConstructorInvocationSource_1_1_performtransformation_blackBBBBFBB(
					invocation, mMemberToTMember, tMember, mMember, _this, isApplicableMatch);
			if (result_pattern_ConstructorInvocationSource_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorInvocationSource_1_1_performtransformation_black[4];

				return new Object[] { invocation, mMemberToTMember, tMember, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_1_1_performtransformation_greenBBFF(
			ConstructorInvocation invocation, TMember tMember) {
		TAccess tAccess = BasicFactory.eINSTANCE.createTAccess();
		AbstractMethodInvocationToTAccess invocationToTAccess = ModiscoFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		tMember.getTAccessing().add(tAccess);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		return new Object[] { invocation, tMember, tAccess, invocationToTAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_1_2_collecttranslatedelements_blackBBB(
			ConstructorInvocation invocation, TAccess tAccess, AbstractMethodInvocationToTAccess invocationToTAccess) {
		return new Object[] { invocation, tAccess, invocationToTAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_1_2_collecttranslatedelements_greenFBBB(
			ConstructorInvocation invocation, TAccess tAccess, AbstractMethodInvocationToTAccess invocationToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(invocation);
		ruleresult.getCreatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(invocationToTAccess);
		return new Object[] { ruleresult, invocation, tAccess, invocationToTAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember, EObject tMember,
			EObject tAccess, EObject mMember, EObject invocationToTAccess) {
		if (!invocation.equals(mMemberToTMember)) {
			if (!invocation.equals(tMember)) {
				if (!invocation.equals(tAccess)) {
					if (!invocation.equals(mMember)) {
						if (!invocation.equals(invocationToTAccess)) {
							if (!mMemberToTMember.equals(tMember)) {
								if (!mMemberToTMember.equals(tAccess)) {
									if (!tAccess.equals(tMember)) {
										if (!mMember.equals(mMemberToTMember)) {
											if (!mMember.equals(tMember)) {
												if (!mMember.equals(tAccess)) {
													if (!invocationToTAccess.equals(mMemberToTMember)) {
														if (!invocationToTAccess.equals(tMember)) {
															if (!invocationToTAccess.equals(tAccess)) {
																if (!invocationToTAccess.equals(mMember)) {
																	return new Object[] { ruleresult, invocation,
																			mMemberToTMember, tMember, tAccess, mMember,
																			invocationToTAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ConstructorInvocationSource_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tMember, EObject tAccess, EObject mMember,
			EObject invocationToTAccess) {
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____abstractMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorInvocationSource";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mMember__invocation____abstractMethodInvocations_name_prime = "abstractMethodInvocations";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAccess__tMember____tSource);
		mMember__invocation____abstractMethodInvocations.setSrc(mMember);
		mMember__invocation____abstractMethodInvocations.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mMember__invocation____abstractMethodInvocations);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(invocationToTAccess__invocation____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(invocationToTAccess__tAccess____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mMember__invocation____abstractMethodInvocations
				.setName(mMember__invocation____abstractMethodInvocations_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		return new Object[] { ruleresult, invocation, tMember, tAccess, mMember, invocationToTAccess,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource,
				mMember__invocation____abstractMethodInvocations, invocationToTAccess__invocation____source,
				invocationToTAccess__tAccess____target };
	}

	public static final void pattern_ConstructorInvocationSource_1_5_registerobjects_expressionBBBBBBBB(
			ConstructorInvocationSource _this, PerformRuleResult ruleresult, EObject invocation,
			EObject mMemberToTMember, EObject tMember, EObject tAccess, EObject mMember, EObject invocationToTAccess) {
		_this.registerObjects_FWD(ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMember,
				invocationToTAccess);

	}

	public static final PerformRuleResult pattern_ConstructorInvocationSource_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_1_preparereturnvalue_bindingFB(
			ConstructorInvocationSource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ConstructorInvocationSource _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorInvocationSource _this) {
		Object[] result_pattern_ConstructorInvocationSource_2_1_preparereturnvalue_binding = pattern_ConstructorInvocationSource_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorInvocationSource_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorInvocationSource_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_2_1_preparereturnvalue_black = pattern_ConstructorInvocationSource_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorInvocationSource_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorInvocationSource_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ConstructorInvocationSource";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("invocation");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		if (tmpInvocation instanceof ConstructorInvocation) {
			ConstructorInvocation invocation = (ConstructorInvocation) tmpInvocation;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				return new Object[] { invocation, mMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorInvocationSource_2_2_corematch_blackBFFBB(
			ConstructorInvocation invocation, MDefinition mMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
			TMember tMember = mMemberToTMember.getTarget();
			if (tMember != null) {
				_result.add(new Object[] { invocation, mMemberToTMember, tMember, mMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorInvocationSource_2_3_findcontext_blackBBBB(
			ConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinition mMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.getAbstractMethodInvocations().contains(invocation)) {
			if (tMember.equals(mMemberToTMember.getTarget())) {
				if (mMember.equals(mMemberToTMember.getSource())) {
					_result.add(new Object[] { invocation, mMemberToTMember, tMember, mMember });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_3_findcontext_greenBBBBFFFF(
			ConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinition mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMember__invocation____abstractMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMember__invocation____abstractMethodInvocations_name_prime = "abstractMethodInvocations";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mMemberToTMember__mMember____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		mMember__invocation____abstractMethodInvocations.setSrc(mMember);
		mMember__invocation____abstractMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____abstractMethodInvocations);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMember__invocation____abstractMethodInvocations
				.setName(mMember__invocation____abstractMethodInvocations_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		return new Object[] { invocation, mMemberToTMember, tMember, mMember, isApplicableMatch,
				mMember__invocation____abstractMethodInvocations, mMemberToTMember__tMember____target,
				mMemberToTMember__mMember____source };
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_4_solveCSP_bindingFBBBBBB(
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch, ConstructorInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, invocation, mMemberToTMember, tMember,
				mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, invocation, mMemberToTMember, tMember, mMember };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_4_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch, ConstructorInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember) {
		Object[] result_pattern_ConstructorInvocationSource_2_4_solveCSP_binding = pattern_ConstructorInvocationSource_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, invocation, mMemberToTMember, tMember, mMember);
		if (result_pattern_ConstructorInvocationSource_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorInvocationSource_2_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_2_4_solveCSP_black = pattern_ConstructorInvocationSource_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorInvocationSource_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, invocation, mMemberToTMember, tMember, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorInvocationSource_2_5_checkCSP_expressionFBB(
			ConstructorInvocationSource _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorInvocationSource_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorInvocationSource";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorInvocationSource_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_10_1_initialbindings_blackBBBB(
			ConstructorInvocationSource _this, Match match, TMember tMember, TAccess tAccess) {
		return new Object[] { _this, match, tMember, tAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_10_2_SolveCSP_bindingFBBBB(
			ConstructorInvocationSource _this, Match match, TMember tMember, TAccess tAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorInvocationSource_10_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorInvocationSource _this, Match match, TMember tMember, TAccess tAccess) {
		Object[] result_pattern_ConstructorInvocationSource_10_2_SolveCSP_binding = pattern_ConstructorInvocationSource_10_2_SolveCSP_bindingFBBBB(
				_this, match, tMember, tAccess);
		if (result_pattern_ConstructorInvocationSource_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorInvocationSource_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_10_2_SolveCSP_black = pattern_ConstructorInvocationSource_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorInvocationSource_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorInvocationSource_10_3_CheckCSP_expressionFBB(
			ConstructorInvocationSource _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_10_4_collectelementstobetranslated_blackBBB(
			Match match, TMember tMember, TAccess tAccess) {
		return new Object[] { match, tMember, tAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TMember tMember, TAccess tAccess) {
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
		return new Object[] { match, tMember, tAccess, tMember__tAccess____tAccessing, tAccess__tMember____tSource };
	}

	public static final Object[] pattern_ConstructorInvocationSource_10_5_collectcontextelements_blackBBB(Match match,
			TMember tMember, TAccess tAccess) {
		return new Object[] { match, tMember, tAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_10_5_collectcontextelements_greenBB(Match match,
			TMember tMember) {
		match.getContextNodes().add(tMember);
		return new Object[] { match, tMember };
	}

	public static final void pattern_ConstructorInvocationSource_10_6_registerobjectstomatch_expressionBBBB(
			ConstructorInvocationSource _this, Match match, TMember tMember, TAccess tAccess) {
		_this.registerObjectsToMatch_BWD(match, tMember, tAccess);

	}

	public static final boolean pattern_ConstructorInvocationSource_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorInvocationSource_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMember");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTAccess instanceof TAccess) {
					TAccess tAccess = (TAccess) tmpTAccess;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { mMemberToTMember, tMember, tAccess, mMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_11_1_performtransformation_blackBBBBFBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess, MDefinition mMember,
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMemberToTMember, tMember, tAccess, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_11_1_performtransformation_bindingAndBlackFFFFFBB(
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorInvocationSource_11_1_performtransformation_binding = pattern_ConstructorInvocationSource_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorInvocationSource_11_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_ConstructorInvocationSource_11_1_performtransformation_binding[0];
			TMember tMember = (TMember) result_pattern_ConstructorInvocationSource_11_1_performtransformation_binding[1];
			TAccess tAccess = (TAccess) result_pattern_ConstructorInvocationSource_11_1_performtransformation_binding[2];
			MDefinition mMember = (MDefinition) result_pattern_ConstructorInvocationSource_11_1_performtransformation_binding[3];

			Object[] result_pattern_ConstructorInvocationSource_11_1_performtransformation_black = pattern_ConstructorInvocationSource_11_1_performtransformation_blackBBBBFBB(
					mMemberToTMember, tMember, tAccess, mMember, _this, isApplicableMatch);
			if (result_pattern_ConstructorInvocationSource_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorInvocationSource_11_1_performtransformation_black[4];

				return new Object[] { mMemberToTMember, tMember, tAccess, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_11_1_performtransformation_greenFBBF(
			TAccess tAccess, MDefinition mMember) {
		ConstructorInvocation invocation = JavaFactory.eINSTANCE.createConstructorInvocation();
		AbstractMethodInvocationToTAccess invocationToTAccess = ModiscoFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		mMember.getAbstractMethodInvocations().add(invocation);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		return new Object[] { invocation, tAccess, mMember, invocationToTAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_11_2_collecttranslatedelements_blackBBB(
			ConstructorInvocation invocation, TAccess tAccess, AbstractMethodInvocationToTAccess invocationToTAccess) {
		return new Object[] { invocation, tAccess, invocationToTAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_11_2_collecttranslatedelements_greenFBBB(
			ConstructorInvocation invocation, TAccess tAccess, AbstractMethodInvocationToTAccess invocationToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(invocation);
		ruleresult.getTranslatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(invocationToTAccess);
		return new Object[] { ruleresult, invocation, tAccess, invocationToTAccess };
	}

	public static final Object[] pattern_ConstructorInvocationSource_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember, EObject tMember,
			EObject tAccess, EObject mMember, EObject invocationToTAccess) {
		if (!invocation.equals(mMemberToTMember)) {
			if (!invocation.equals(tMember)) {
				if (!invocation.equals(tAccess)) {
					if (!invocation.equals(mMember)) {
						if (!invocation.equals(invocationToTAccess)) {
							if (!mMemberToTMember.equals(tMember)) {
								if (!mMemberToTMember.equals(tAccess)) {
									if (!tAccess.equals(tMember)) {
										if (!mMember.equals(mMemberToTMember)) {
											if (!mMember.equals(tMember)) {
												if (!mMember.equals(tAccess)) {
													if (!invocationToTAccess.equals(mMemberToTMember)) {
														if (!invocationToTAccess.equals(tMember)) {
															if (!invocationToTAccess.equals(tAccess)) {
																if (!invocationToTAccess.equals(mMember)) {
																	return new Object[] { ruleresult, invocation,
																			mMemberToTMember, tMember, tAccess, mMember,
																			invocationToTAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ConstructorInvocationSource_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tMember, EObject tAccess, EObject mMember,
			EObject invocationToTAccess) {
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____abstractMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorInvocationSource";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mMember__invocation____abstractMethodInvocations_name_prime = "abstractMethodInvocations";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAccess__tMember____tSource);
		mMember__invocation____abstractMethodInvocations.setSrc(mMember);
		mMember__invocation____abstractMethodInvocations.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mMember__invocation____abstractMethodInvocations);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(invocationToTAccess__invocation____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(invocationToTAccess__tAccess____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mMember__invocation____abstractMethodInvocations
				.setName(mMember__invocation____abstractMethodInvocations_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		return new Object[] { ruleresult, invocation, tMember, tAccess, mMember, invocationToTAccess,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource,
				mMember__invocation____abstractMethodInvocations, invocationToTAccess__invocation____source,
				invocationToTAccess__tAccess____target };
	}

	public static final void pattern_ConstructorInvocationSource_11_5_registerobjects_expressionBBBBBBBB(
			ConstructorInvocationSource _this, PerformRuleResult ruleresult, EObject invocation,
			EObject mMemberToTMember, EObject tMember, EObject tAccess, EObject mMember, EObject invocationToTAccess) {
		_this.registerObjects_BWD(ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMember,
				invocationToTAccess);

	}

	public static final PerformRuleResult pattern_ConstructorInvocationSource_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_1_preparereturnvalue_bindingFB(
			ConstructorInvocationSource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ConstructorInvocationSource _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorInvocationSource _this) {
		Object[] result_pattern_ConstructorInvocationSource_12_1_preparereturnvalue_binding = pattern_ConstructorInvocationSource_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorInvocationSource_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorInvocationSource_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_12_1_preparereturnvalue_black = pattern_ConstructorInvocationSource_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorInvocationSource_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorInvocationSource_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ConstructorInvocationSource";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMember");
		EObject _localVariable_1 = match.getObject("tAccess");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTAccess = _localVariable_1;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTAccess instanceof TAccess) {
				TAccess tAccess = (TAccess) tmpTAccess;
				return new Object[] { tMember, tAccess, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorInvocationSource_12_2_corematch_blackFBBFB(
			TMember tMember, TAccess tAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			MDefinition mMember = mMemberToTMember.getSource();
			if (mMember != null) {
				_result.add(new Object[] { mMemberToTMember, tMember, tAccess, mMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorInvocationSource_12_3_findcontext_blackBBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess, MDefinition mMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMember.getTAccessing().contains(tAccess)) {
			if (tMember.equals(mMemberToTMember.getTarget())) {
				if (mMember.equals(mMemberToTMember.getSource())) {
					_result.add(new Object[] { mMemberToTMember, tMember, tAccess, mMember });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_3_findcontext_greenBBBBFFFFF(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess, MDefinition mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mMemberToTMember__mMember____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(mMember);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____tSource);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		return new Object[] { mMemberToTMember, tMember, tAccess, mMember, isApplicableMatch,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource, mMemberToTMember__tMember____target,
				mMemberToTMember__mMember____source };
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_4_solveCSP_bindingFBBBBBB(
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess, MDefinition mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMemberToTMember, tMember, tAccess,
				mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, tAccess, mMember };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_4_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess, MDefinition mMember) {
		Object[] result_pattern_ConstructorInvocationSource_12_4_solveCSP_binding = pattern_ConstructorInvocationSource_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, tMember, tAccess, mMember);
		if (result_pattern_ConstructorInvocationSource_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorInvocationSource_12_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_12_4_solveCSP_black = pattern_ConstructorInvocationSource_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorInvocationSource_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, tAccess, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorInvocationSource_12_5_checkCSP_expressionFBB(
			ConstructorInvocationSource _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorInvocationSource_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorInvocationSource";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorInvocationSource_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_20_1_preparereturnvalue_bindingFB(
			ConstructorInvocationSource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ConstructorInvocationSource _this) {
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

	public static final Object[] pattern_ConstructorInvocationSource_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorInvocationSource _this) {
		Object[] result_pattern_ConstructorInvocationSource_20_1_preparereturnvalue_binding = pattern_ConstructorInvocationSource_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorInvocationSource_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorInvocationSource_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_20_1_preparereturnvalue_black = pattern_ConstructorInvocationSource_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorInvocationSource_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorInvocationSource_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorInvocationSource_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConstructorInvocationSource_20_2_testcorematchandDECs_black_nac_0BB(
			ConstructorInvocation invocation, MDefinition mMember) {
		for (MDefinition __DEC_invocation_abstractMethodInvocations_579338 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "abstractMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_abstractMethodInvocations_579338)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_20_2_testcorematchandDECs_black_nac_1BB(
			ConstructorInvocation invocation, MDefinition mMember) {
		for (MDefinition __DEC_invocation_abstractMethodInvocations_989962 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "abstractMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_abstractMethodInvocations_989962)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorInvocationSource_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_abstractMethodInvocations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_abstractMethodInvocations.getSrc();
		if (tmpMMember instanceof MDefinition) {
			MDefinition mMember = (MDefinition) tmpMMember;
			EObject tmpInvocation = _edge_abstractMethodInvocations.getTrg();
			if (tmpInvocation instanceof ConstructorInvocation) {
				ConstructorInvocation invocation = (ConstructorInvocation) tmpInvocation;
				if (mMember.getAbstractMethodInvocations().contains(invocation)) {
					if (pattern_ConstructorInvocationSource_20_2_testcorematchandDECs_black_nac_0BB(invocation,
							mMember) == null) {
						if (pattern_ConstructorInvocationSource_20_2_testcorematchandDECs_black_nac_1BB(invocation,
								mMember) == null) {
							_result.add(new Object[] { invocation, mMember, _edge_abstractMethodInvocations });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorInvocationSource_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorInvocationSource _this, Match match, ConstructorInvocation invocation, MDefinition mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, invocation, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorInvocationSource_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorInvocationSource _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorInvocationSource_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_21_1_preparereturnvalue_bindingFB(
			ConstructorInvocationSource _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ConstructorInvocationSource _this) {
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

	public static final Object[] pattern_ConstructorInvocationSource_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorInvocationSource _this) {
		Object[] result_pattern_ConstructorInvocationSource_21_1_preparereturnvalue_binding = pattern_ConstructorInvocationSource_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorInvocationSource_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorInvocationSource_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_21_1_preparereturnvalue_black = pattern_ConstructorInvocationSource_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorInvocationSource_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorInvocationSource_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorInvocationSource_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ConstructorInvocationSource_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tAccessing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_tAccessing.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTAccess = _edge_tAccessing.getTrg();
			if (tmpTAccess instanceof TAccess) {
				TAccess tAccess = (TAccess) tmpTAccess;
				if (tMember.getTAccessing().contains(tAccess)) {
					_result.add(new Object[] { tMember, tAccess, _edge_tAccessing });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorInvocationSource_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorInvocationSource _this, Match match, TMember tMember, TAccess tAccess) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorInvocationSource_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorInvocationSource _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorInvocationSource_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_1_prepare_blackB(
			ConstructorInvocationSource _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_2_matchcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("invocation");
		EObject _localVariable_1 = targetMatch.getObject("tMember");
		EObject _localVariable_2 = targetMatch.getObject("tAccess");
		EObject _localVariable_3 = sourceMatch.getObject("mMember");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpInvocation instanceof ConstructorInvocation) {
			ConstructorInvocation invocation = (ConstructorInvocation) tmpInvocation;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTAccess instanceof TAccess) {
					TAccess tAccess = (TAccess) tmpTAccess;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { invocation, tMember, tAccess, mMember, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorInvocationSource_24_2_matchcontext_blackBFBBBBB(
			ConstructorInvocation invocation, TMember tMember, TAccess tAccess, MDefinition mMember, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tMember.getTAccessing().contains(tAccess)) {
				if (mMember.getAbstractMethodInvocations().contains(invocation)) {
					for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
						if (mMember.equals(mMemberToTMember.getSource())) {
							_result.add(new Object[] { invocation, mMemberToTMember, tMember, tAccess, mMember,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_2_matchcontext_greenBBBBBBFB(
			ConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess,
			MDefinition mMember, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "ConstructorInvocationSource";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { invocation, mMemberToTMember, tMember, tAccess, mMember, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_3_checkcsp_bindingFBBBBBBBBB(
			ConstructorInvocationSource _this, CCMatch isApplicableMatch, ConstructorInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess, MDefinition mMember,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, invocation, mMemberToTMember, tMember,
				tAccess, mMember, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, invocation, mMemberToTMember, tMember, tAccess,
					mMember, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(
			ConstructorInvocationSource _this, CCMatch isApplicableMatch, ConstructorInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TAccess tAccess, MDefinition mMember,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ConstructorInvocationSource_24_3_checkcsp_binding = pattern_ConstructorInvocationSource_24_3_checkcsp_bindingFBBBBBBBBB(
				_this, isApplicableMatch, invocation, mMemberToTMember, tMember, tAccess, mMember, sourceMatch,
				targetMatch);
		if (result_pattern_ConstructorInvocationSource_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorInvocationSource_24_3_checkcsp_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_24_3_checkcsp_black = pattern_ConstructorInvocationSource_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_ConstructorInvocationSource_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, invocation, mMemberToTMember, tMember, tAccess,
						mMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_4_createcorrespondence_blackBBBBB(
			ConstructorInvocation invocation, TMember tMember, TAccess tAccess, MDefinition mMember,
			CCMatch isApplicableMatch) {
		return new Object[] { invocation, tMember, tAccess, mMember, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_4_createcorrespondence_greenBBFB(
			ConstructorInvocation invocation, TAccess tAccess, CCMatch isApplicableMatch) {
		AbstractMethodInvocationToTAccess invocationToTAccess = ModiscoFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		isApplicableMatch.getCreateCorr().add(invocationToTAccess);
		return new Object[] { invocation, tAccess, invocationToTAccess, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorInvocationSource_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorInvocationSource";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorInvocationSource_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_27_1_matchtggpattern_black_nac_0BB(
			ConstructorInvocation invocation, MDefinition mMember) {
		for (MDefinition __DEC_invocation_abstractMethodInvocations_568392 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "abstractMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_abstractMethodInvocations_568392)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_27_1_matchtggpattern_black_nac_1BB(
			ConstructorInvocation invocation, MDefinition mMember) {
		for (MDefinition __DEC_invocation_abstractMethodInvocations_95807 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "abstractMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_abstractMethodInvocations_95807)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_27_1_matchtggpattern_blackBB(
			ConstructorInvocation invocation, MDefinition mMember) {
		if (mMember.getAbstractMethodInvocations().contains(invocation)) {
			if (pattern_ConstructorInvocationSource_27_1_matchtggpattern_black_nac_0BB(invocation, mMember) == null) {
				if (pattern_ConstructorInvocationSource_27_1_matchtggpattern_black_nac_1BB(invocation,
						mMember) == null) {
					return new Object[] { invocation, mMember };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorInvocationSource_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorInvocationSource_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_28_1_matchtggpattern_blackBB(TMember tMember,
			TAccess tAccess) {
		if (tMember.getTAccessing().contains(tAccess)) {
			return new Object[] { tMember, tAccess };
		}
		return null;
	}

	public static final boolean pattern_ConstructorInvocationSource_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorInvocationSource_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_1_createresult_blackB(
			ConstructorInvocationSource _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorInvocationSource_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					MDefinition mMember = mMemberToTMember.getSource();
					if (mMember != null) {
						TMember tMember = mMemberToTMember.getTarget();
						if (tMember != null) {
							if (pattern_ConstructorInvocationSource_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mMemberToTMember) == null) {
								if (pattern_ConstructorInvocationSource_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mMember) == null) {
									if (pattern_ConstructorInvocationSource_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, tMember) == null) {
										_result.add(new Object[] { mMemberToTMemberList, mMemberToTMember, mMember,
												tMember, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_ConstructorInvocationSource_29_3_solveCSP_bindingFBBBBBB(
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMemberToTMember, tMember, mMember,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, mMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_3_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorInvocationSource _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ConstructorInvocationSource_29_3_solveCSP_binding = pattern_ConstructorInvocationSource_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, tMember, mMember, ruleResult);
		if (result_pattern_ConstructorInvocationSource_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorInvocationSource_29_3_solveCSP_binding[0];

			Object[] result_pattern_ConstructorInvocationSource_29_3_solveCSP_black = pattern_ConstructorInvocationSource_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorInvocationSource_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, mMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorInvocationSource_29_4_checkCSP_expressionFBB(
			ConstructorInvocationSource _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_5_checknacs_blackBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember) {
		return new Object[] { mMemberToTMember, tMember, mMember };
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_6_perform_blackBBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mMemberToTMember, tMember, mMember, ruleResult };
	}

	public static final Object[] pattern_ConstructorInvocationSource_29_6_perform_greenFBFBFB(TMember tMember,
			MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		ConstructorInvocation invocation = JavaFactory.eINSTANCE.createConstructorInvocation();
		TAccess tAccess = BasicFactory.eINSTANCE.createTAccess();
		AbstractMethodInvocationToTAccess invocationToTAccess = ModiscoFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mMember.getAbstractMethodInvocations().add(invocation);
		ruleResult.getSourceObjects().add(invocation);
		tMember.getTAccessing().add(tAccess);
		ruleResult.getTargetObjects().add(tAccess);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		ruleResult.getCorrObjects().add(invocationToTAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { invocation, tMember, tAccess, mMember, invocationToTAccess, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ConstructorInvocationSource_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConstructorInvocationSourceImpl