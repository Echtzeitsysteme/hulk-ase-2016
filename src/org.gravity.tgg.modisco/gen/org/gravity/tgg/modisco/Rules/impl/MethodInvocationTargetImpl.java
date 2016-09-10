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

import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MMethodDefinition;

import org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess;
import org.gravity.tgg.modisco.MDefinitionToTMember;

import org.gravity.tgg.modisco.Rules.MethodInvocationTarget;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;

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
 * An implementation of the model object '<em><b>Method Invocation Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodInvocationTargetImpl extends AbstractRuleImpl implements MethodInvocationTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodInvocationTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition) {
		// initial bindings
		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_0_1_initialbindings_blackBBBBB(this, match, mMethod, invocation,
						mDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mMethod] = " + mMethod + ", "
					+ "[invocation] = " + invocation + ", " + "[mDefinition] = " + mDefinition + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mMethod, invocation,
						mDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mMethod] = " + mMethod + ", " + "[invocation] = "
					+ invocation + ", " + "[mDefinition] = " + mDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_0_4_collectelementstobetranslated_blackBBBB(match, mMethod,
							invocation, mDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mMethod] = " + mMethod + ", "
						+ "[invocation] = " + invocation + ", " + "[mDefinition] = " + mDefinition + ".");
			}
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_4_collectelementstobetranslated_greenBBBFF(
					match, mMethod, invocation);
			// EMoflonEdge invocation__mMethod____method = (EMoflonEdge) result4_green[3];
			// EMoflonEdge mMethod__invocation____usages = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_0_5_collectcontextelements_blackBBBB(match, mMethod, invocation,
							mDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mMethod] = " + mMethod + ", "
						+ "[invocation] = " + invocation + ", " + "[mDefinition] = " + mDefinition + ".");
			}
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_5_collectcontextelements_greenBBBBF(match,
					mMethod, invocation, mDefinition);
			// EMoflonEdge mDefinition__invocation____abstractMethodInvocations = (EMoflonEdge) result5_green[4];

			// register objects to match
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, mMethod, invocation, mDefinition);
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_7_expressionF();
		} else {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAccess tAccess = (TAccess) result1_bindingAndBlack[0];
		TMethodDefinition tMethod = (TMethodDefinition) result1_bindingAndBlack[1];
		MMethodDefinition mMethod = (MMethodDefinition) result1_bindingAndBlack[2];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result1_bindingAndBlack[3];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[4];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[5];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[6];
		TMember tDefinition = (TMember) result1_bindingAndBlack[7];
		MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_1_1_performtransformation_greenBB(tAccess, tMethod);

		// collect translated elements
		Object[] result2_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tAccess, tMethod,
						mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
						mDefinitionToTDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tAccess] = " + tAccess + ", " + "[tMethod] = " + tMethod
					+ ", " + "[mMethod] = " + mMethod + ", " + "[invocation] = " + invocation + ", "
					+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ".");
		}
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				tAccess, tMethod, mMethod, invocation);
		// EMoflonEdge tMethod__tAccess____accessedBy = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tAccess__tMethod____tTarget = (EMoflonEdge) result3_green[6];
		// EMoflonEdge invocation__mMethod____method = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mMethod__invocation____usages = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
				tDefinition, mDefinitionToTDefinition);
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition mMethod = (MMethodDefinition) result2_binding[0];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_binding[1];
		MDefinition mDefinition = (MDefinition) result2_binding[2];
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_2_2_corematch_blackFFBBFFBFFB(mMethod, invocation, mDefinition,
						match)) {
			TAccess tAccess = (TAccess) result2_black[0];
			TMethodDefinition tMethod = (TMethodDefinition) result2_black[1];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[5];
			TMember tDefinition = (TMember) result2_black[7];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_2_3_findcontext_blackBBBBBBBBB(tAccess, tMethod, mMethod,
							invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
							mDefinitionToTDefinition)) {
				Object[] result3_green = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(tAccess, tMethod,
								mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
								mDefinitionToTDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge invocation__mMethod____method = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mMethod__invocation____usages = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mMethodToTMethod__mMethod____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge mDefinition__invocation____abstractMethodInvocations = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tDefinition__tAccess____tAccessing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tAccess__tDefinition____tSource = (EMoflonEdge) result3_green[18];
				// EMoflonEdge mDefinitionToTDefinition__mDefinition____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge mDefinitionToTDefinition__tDefinition____target = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tAccess, tMethod, mMethod, invocation, mMethodToTMethod,
								invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tAccess] = " + tAccess + ", " + "[tMethod] = " + tMethod + ", " + "[mMethod] = "
							+ mMethod + ", " + "[invocation] = " + invocation + ", " + "[mMethodToTMethod] = "
							+ mMethodToTMethod + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition) {
		match.registerObject("mMethod", mMethod);
		match.registerObject("invocation", invocation);
		match.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mMethod", mMethod);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tAccess, EObject tMethod, EObject mMethod,
			EObject invocation, EObject mMethodToTMethod, EObject invocationToTAccess, EObject mDefinition,
			EObject tDefinition, EObject mDefinitionToTDefinition) {
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("mMethod", mMethod);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);

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
	public boolean isAppropriate_BWD(Match match, TAccess tAccess, TMethodDefinition tMethod, TMember tDefinition) {
		// initial bindings
		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_10_1_initialbindings_blackBBBBB(this, match, tAccess, tMethod,
						tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", "
					+ "[tMethod] = " + tMethod + ", " + "[tDefinition] = " + tDefinition + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAccess, tMethod,
						tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", " + "[tMethod] = "
					+ tMethod + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_10_4_collectelementstobetranslated_blackBBBB(match, tAccess,
							tMethod, tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", "
						+ "[tMethod] = " + tMethod + ", " + "[tDefinition] = " + tDefinition + ".");
			}
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_4_collectelementstobetranslated_greenBBBFF(
					match, tAccess, tMethod);
			// EMoflonEdge tMethod__tAccess____accessedBy = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tAccess__tMethod____tTarget = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_10_5_collectcontextelements_blackBBBB(match, tAccess, tMethod,
							tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", "
						+ "[tMethod] = " + tMethod + ", " + "[tDefinition] = " + tDefinition + ".");
			}
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_5_collectcontextelements_greenBBBBFF(match,
					tAccess, tMethod, tDefinition);
			// EMoflonEdge tDefinition__tAccess____tAccessing = (EMoflonEdge) result5_green[4];
			// EMoflonEdge tAccess__tDefinition____tSource = (EMoflonEdge) result5_green[5];

			// register objects to match
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tAccess, tMethod, tDefinition);
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_7_expressionF();
		} else {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAccess tAccess = (TAccess) result1_bindingAndBlack[0];
		TMethodDefinition tMethod = (TMethodDefinition) result1_bindingAndBlack[1];
		MMethodDefinition mMethod = (MMethodDefinition) result1_bindingAndBlack[2];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result1_bindingAndBlack[3];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[4];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[5];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[6];
		TMember tDefinition = (TMember) result1_bindingAndBlack[7];
		MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_11_1_performtransformation_greenBB(mMethod,
				invocation);

		// collect translated elements
		Object[] result2_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tAccess, tMethod,
						mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
						mDefinitionToTDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tAccess] = " + tAccess + ", " + "[tMethod] = " + tMethod
					+ ", " + "[mMethod] = " + mMethod + ", " + "[invocation] = " + invocation + ", "
					+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ".");
		}
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				tAccess, tMethod, mMethod, invocation);
		// EMoflonEdge tMethod__tAccess____accessedBy = (EMoflonEdge) result3_green[5];
		// EMoflonEdge tAccess__tMethod____tTarget = (EMoflonEdge) result3_green[6];
		// EMoflonEdge invocation__mMethod____method = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mMethod__invocation____usages = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
				tDefinition, mDefinitionToTDefinition);
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAccess tAccess = (TAccess) result2_binding[0];
		TMethodDefinition tMethod = (TMethodDefinition) result2_binding[1];
		TMember tDefinition = (TMember) result2_binding[2];
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_12_2_corematch_blackBBFFFFFBFB(tAccess, tMethod, tDefinition, match)) {
			MMethodDefinition mMethod = (MMethodDefinition) result2_black[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[3];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[5];
			MDefinition mDefinition = (MDefinition) result2_black[6];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_12_3_findcontext_blackBBBBBBBBB(tAccess, tMethod, mMethod,
							invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
							mDefinitionToTDefinition)) {
				Object[] result3_green = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(tAccess, tMethod,
								mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
								mDefinitionToTDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge tMethod__tAccess____accessedBy = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tAccess__tMethod____tTarget = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mMethodToTMethod__mMethod____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge mDefinition__invocation____abstractMethodInvocations = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tDefinition__tAccess____tAccessing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tAccess__tDefinition____tSource = (EMoflonEdge) result3_green[18];
				// EMoflonEdge mDefinitionToTDefinition__mDefinition____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge mDefinitionToTDefinition__tDefinition____target = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tAccess, tMethod, mMethod, invocation, mMethodToTMethod,
								invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tAccess] = " + tAccess + ", " + "[tMethod] = " + tMethod + ", " + "[mMethod] = "
							+ mMethod + ", " + "[invocation] = " + invocation + ", " + "[mMethodToTMethod] = "
							+ mMethodToTMethod + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAccess tAccess, TMethodDefinition tMethod,
			TMember tDefinition) {
		match.registerObject("tAccess", tAccess);
		match.registerObject("tMethod", tMethod);
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAccess tAccess, TMethodDefinition tMethod,
			TMember tDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mMethod", mMethod);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tAccess, EObject tMethod, EObject mMethod,
			EObject invocation, EObject mMethodToTMethod, EObject invocationToTAccess, EObject mDefinition,
			EObject tDefinition, EObject mDefinitionToTDefinition) {
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("mMethod", mMethod);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_17(EMoflonEdge _edge_method) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_20_2_testcorematchandDECs_blackFFFB(_edge_method)) {
			MMethodDefinition mMethod = (MMethodDefinition) result2_black[0];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			Object[] result2_green = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mMethod, invocation, mDefinition)) {
				// Ensure that the correct types of elements are matched
				if (MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_15(EMoflonEdge _edge_accessedBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_21_2_testcorematchandDECs_blackFFFB(_edge_accessedBy)) {
			TAccess tAccess = (TAccess) result2_black[0];
			TMethodDefinition tMethod = (TMethodDefinition) result2_black[1];
			TMember tDefinition = (TMember) result2_black[2];
			Object[] result2_green = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tAccess, tMethod, tDefinition)) {
				// Ensure that the correct types of elements are matched
				if (MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodInvocationTarget");
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
		ruleResult.setRule("MethodInvocationTarget");
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
		Object[] result1_black = MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_24_2_matchcontext_bindingFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TAccess tAccess = (TAccess) result2_binding[0];
		TMethodDefinition tMethod = (TMethodDefinition) result2_binding[1];
		MMethodDefinition mMethod = (MMethodDefinition) result2_binding[2];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_binding[3];
		MDefinition mDefinition = (MDefinition) result2_binding[4];
		TMember tDefinition = (TMember) result2_binding[5];
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_24_2_matchcontext_blackBBBBFFBBFBB(tAccess, tMethod, mMethod,
						invocation, mDefinition, tDefinition, sourceMatch, targetMatch)) {
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[5];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[8];
			Object[] result2_green = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_24_2_matchcontext_greenBBBBBBBBBBFB(tAccess, tMethod, mMethod,
							invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
							mDefinitionToTDefinition, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[10];

			// check csp
			Object[] result3_bindingAndBlack = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch,
							tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
							tDefinition, mDefinitionToTDefinition, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_24_4_createcorrespondence_blackBBBBBBB(tAccess, tMethod,
								mMethod, invocation, mDefinition, tDefinition, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tAccess] = " + tAccess + ", " + "[tMethod] = " + tMethod + ", "
							+ "[mMethod] = " + mMethod + ", " + "[invocation] = " + invocation + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TAccess tAccess, TMethodDefinition tMethod,
			MMethodDefinition mMethod, AbstractMethodInvocation invocation, MDefinitionToTMember mMethodToTMethod,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinition mDefinition, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mMethod", mMethod);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
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
	public boolean checkDEC_FWD(MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition) {// match tgg pattern
		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_27_1_matchtggpattern_blackBBB(mMethod, invocation, mDefinition);
		if (result1_black != null) {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_27_2_expressionF();
		} else {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAccess tAccess, TMethodDefinition tMethod, TMember tDefinition) {// match tgg pattern
		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_28_1_matchtggpattern_blackBBB(tAccess, tMethod, tDefinition);
		if (result1_black != null) {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_28_2_expressionF();
		} else {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AbstractMethodInvocationToTAccess invocationToTAccessParameter,
			MDefinitionToTMember mMethodToTMethodParameter) {
		// create result
		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationTargetImpl.pattern_MethodInvocationTarget_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_29_2_isapplicablecore_blackFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList invocationToTAccessList = (RuleEntryList) result2_black[0];
			TAccess tAccess = (TAccess) result2_black[1];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[3];
			MDefinition mDefinition = (MDefinition) result2_black[4];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[5];
			TMember tDefinition = (TMember) result2_black[6];
			// RuleEntryList mMethodToTMethodList = (RuleEntryList) result2_black[7];
			TMethodDefinition tMethod = (TMethodDefinition) result2_black[8];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[9];
			MMethodDefinition mMethod = (MMethodDefinition) result2_black[10];

			// solve CSP
			Object[] result3_bindingAndBlack = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
							tDefinition, mDefinitionToTDefinition, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAccess] = " + tAccess
						+ ", " + "[tMethod] = " + tMethod + ", " + "[mMethod] = " + mMethod + ", " + "[invocation] = "
						+ invocation + ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", "
						+ "[invocationToTAccess] = " + invocationToTAccess + ", " + "[mDefinition] = " + mDefinition
						+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinitionToTDefinition] = "
						+ mDefinitionToTDefinition + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_29_5_checknacs_blackBBBBBBBBB(tAccess, tMethod, mMethod,
								invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
								mDefinitionToTDefinition);
				if (result5_black != null) {

					// perform
					Object[] result6_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_29_6_perform_blackBBBBBBBBBB(tAccess, tMethod, mMethod,
									invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
									mDefinitionToTDefinition, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[tAccess] = " + tAccess + ", " + "[tMethod] = " + tMethod + ", " + "[mMethod] = "
								+ mMethod + ", " + "[invocation] = " + invocation + ", " + "[mMethodToTMethod] = "
								+ mMethodToTMethod + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
								+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
								+ "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_29_6_perform_greenBBBBB(tAccess, tMethod,
							mMethod, invocation, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mMethod", mMethod);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
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
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_ABSTRACTMETHODINVOCATION_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(AbstractMethodInvocation) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.METHOD_INVOCATION_TARGET___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_ABSTRACTMETHODINVOCATION_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(AbstractMethodInvocation) arguments.get(2), (MDefinition) arguments.get(3));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_ABSTRACTMETHODINVOCATION_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(AbstractMethodInvocation) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TACCESS_TMETHODDEFINITION_MMETHODDEFINITION_ABSTRACTMETHODINVOCATION_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_MDEFINITION_TMEMBER_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TAccess) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3),
					(AbstractMethodInvocation) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(AbstractMethodInvocationToTAccess) arguments.get(6), (MDefinition) arguments.get(7),
					(TMember) arguments.get(8), (MDefinitionToTMember) arguments.get(9));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_BWD__MATCH_TACCESS_TMETHODDEFINITION_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TAccess) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.METHOD_INVOCATION_TARGET___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TACCESS_TMETHODDEFINITION_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAccess) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TACCESS_TMETHODDEFINITION_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAccess) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TACCESS_TMETHODDEFINITION_MMETHODDEFINITION_ABSTRACTMETHODINVOCATION_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_MDEFINITION_TMEMBER_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAccess) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3),
					(AbstractMethodInvocation) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(AbstractMethodInvocationToTAccess) arguments.get(6), (MDefinition) arguments.get(7),
					(TMember) arguments.get(8), (MDefinitionToTMember) arguments.get(9));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_FWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_17((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_15((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TACCESS_TMETHODDEFINITION_MMETHODDEFINITION_ABSTRACTMETHODINVOCATION_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_MDEFINITION_TMEMBER_MDEFINITIONTOTMEMBER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TAccess) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3),
					(AbstractMethodInvocation) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(AbstractMethodInvocationToTAccess) arguments.get(6), (MDefinition) arguments.get(7),
					(TMember) arguments.get(8), (MDefinitionToTMember) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_DEC_FWD__MMETHODDEFINITION_ABSTRACTMETHODINVOCATION_MDEFINITION:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0), (AbstractMethodInvocation) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_DEC_BWD__TACCESS_TMETHODDEFINITION_TMEMBER:
			return checkDEC_BWD((TAccess) arguments.get(0), (TMethodDefinition) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET___GENERATE_MODEL__RULEENTRYCONTAINER_ABSTRACTMETHODINVOCATIONTOTACCESS_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AbstractMethodInvocationToTAccess) arguments.get(1), (MDefinitionToTMember) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TACCESS_TMETHODDEFINITION_MMETHODDEFINITION_ABSTRACTMETHODINVOCATION_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_MDEFINITION_TMEMBER_MDEFINITIONTOTMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAccess) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3),
					(AbstractMethodInvocation) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(AbstractMethodInvocationToTAccess) arguments.get(6), (MDefinition) arguments.get(7),
					(TMember) arguments.get(8), (MDefinitionToTMember) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.METHOD_INVOCATION_TARGET___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodInvocationTarget_0_1_initialbindings_blackBBBBB(
			MethodInvocationTarget _this, Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition) {
		if (!mDefinition.equals(mMethod)) {
			return new Object[] { _this, match, mMethod, invocation, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_0_2_SolveCSP_bindingFBBBBB(MethodInvocationTarget _this,
			Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation, MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mMethod, invocation, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mMethod, invocation, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodInvocationTarget _this, Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition) {
		Object[] result_pattern_MethodInvocationTarget_0_2_SolveCSP_binding = pattern_MethodInvocationTarget_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mMethod, invocation, mDefinition);
		if (result_pattern_MethodInvocationTarget_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_0_2_SolveCSP_black = pattern_MethodInvocationTarget_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mMethod, invocation, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_0_3_CheckCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MMethodDefinition mMethod, AbstractMethodInvocation invocation, MDefinition mDefinition) {
		if (!mDefinition.equals(mMethod)) {
			return new Object[] { match, mMethod, invocation, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation) {
		EMoflonEdge invocation__mMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethod__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocation__mMethod____method_name_prime = "method";
		String mMethod__invocation____usages_name_prime = "usages";
		invocation__mMethod____method.setSrc(invocation);
		invocation__mMethod____method.setTrg(mMethod);
		match.getToBeTranslatedEdges().add(invocation__mMethod____method);
		mMethod__invocation____usages.setSrc(mMethod);
		mMethod__invocation____usages.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mMethod__invocation____usages);
		invocation__mMethod____method.setName(invocation__mMethod____method_name_prime);
		mMethod__invocation____usages.setName(mMethod__invocation____usages_name_prime);
		return new Object[] { match, mMethod, invocation, invocation__mMethod____method,
				mMethod__invocation____usages };
	}

	public static final Object[] pattern_MethodInvocationTarget_0_5_collectcontextelements_blackBBBB(Match match,
			MMethodDefinition mMethod, AbstractMethodInvocation invocation, MDefinition mDefinition) {
		if (!mDefinition.equals(mMethod)) {
			return new Object[] { match, mMethod, invocation, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_0_5_collectcontextelements_greenBBBBF(Match match,
			MMethodDefinition mMethod, AbstractMethodInvocation invocation, MDefinition mDefinition) {
		EMoflonEdge mDefinition__invocation____abstractMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mMethod);
		match.getContextNodes().add(invocation);
		match.getContextNodes().add(mDefinition);
		String mDefinition__invocation____abstractMethodInvocations_name_prime = "abstractMethodInvocations";
		mDefinition__invocation____abstractMethodInvocations.setSrc(mDefinition);
		mDefinition__invocation____abstractMethodInvocations.setTrg(invocation);
		match.getContextEdges().add(mDefinition__invocation____abstractMethodInvocations);
		mDefinition__invocation____abstractMethodInvocations
				.setName(mDefinition__invocation____abstractMethodInvocations_name_prime);
		return new Object[] { match, mMethod, invocation, mDefinition,
				mDefinition__invocation____abstractMethodInvocations };
	}

	public static final void pattern_MethodInvocationTarget_0_6_registerobjectstomatch_expressionBBBBB(
			MethodInvocationTarget _this, Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition) {
		_this.registerObjectsToMatch_FWD(match, mMethod, invocation, mDefinition);

	}

	public static final boolean pattern_MethodInvocationTarget_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMethod");
		EObject _localVariable_3 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_5 = isApplicableMatch.getObject("invocationToTAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_7 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_8 = isApplicableMatch.getObject("mDefinitionToTDefinition");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		EObject tmpMMethod = _localVariable_2;
		EObject tmpInvocation = _localVariable_3;
		EObject tmpMMethodToTMethod = _localVariable_4;
		EObject tmpInvocationToTAccess = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		EObject tmpTDefinition = _localVariable_7;
		EObject tmpMDefinitionToTDefinition = _localVariable_8;
		if (tmpTAccess instanceof TAccess) {
			TAccess tAccess = (TAccess) tmpTAccess;
			if (tmpTMethod instanceof TMethodDefinition) {
				TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
				if (tmpMMethod instanceof MMethodDefinition) {
					MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
					if (tmpInvocation instanceof AbstractMethodInvocation) {
						AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
						if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
							MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
							if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
								AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									if (tmpTDefinition instanceof TMember) {
										TMember tDefinition = (TMember) tmpTDefinition;
										if (tmpMDefinitionToTDefinition instanceof MDefinitionToTMember) {
											MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) tmpMDefinitionToTDefinition;
											return new Object[] { tAccess, tMethod, mMethod, invocation,
													mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
													mDefinitionToTDefinition, isApplicableMatch };
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

	public static final Object[] pattern_MethodInvocationTarget_1_1_performtransformation_blackBBBBBBBBBFBB(
			TAccess tAccess, TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch) {
		if (!mDefinition.equals(mMethod)) {
			if (!tDefinition.equals(tMethod)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod,
									invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationTarget_1_1_performtransformation_binding = pattern_MethodInvocationTarget_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationTarget_1_1_performtransformation_binding != null) {
			TAccess tAccess = (TAccess) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[0];
			TMethodDefinition tMethod = (TMethodDefinition) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[1];
			MMethodDefinition mMethod = (MMethodDefinition) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[3];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[5];
			MDefinition mDefinition = (MDefinition) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[6];
			TMember tDefinition = (TMember) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[7];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[8];

			Object[] result_pattern_MethodInvocationTarget_1_1_performtransformation_black = pattern_MethodInvocationTarget_1_1_performtransformation_blackBBBBBBBBBFBB(
					tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
					tDefinition, mDefinitionToTDefinition, _this, isApplicableMatch);
			if (result_pattern_MethodInvocationTarget_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationTarget_1_1_performtransformation_black[9];

				return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess,
						mDefinition, tDefinition, mDefinitionToTDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_1_1_performtransformation_greenBB(TAccess tAccess,
			TMethodDefinition tMethod) {
		tMethod.getAccessedBy().add(tAccess);
		return new Object[] { tAccess, tMethod };
	}

	public static final Object[] pattern_MethodInvocationTarget_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTarget_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAccess, EObject tMethod, EObject mMethod, EObject invocation,
			EObject mMethodToTMethod, EObject invocationToTAccess, EObject mDefinition, EObject tDefinition,
			EObject mDefinitionToTDefinition) {
		if (!tAccess.equals(tMethod)) {
			if (!tAccess.equals(tDefinition)) {
				if (!mMethod.equals(tAccess)) {
					if (!mMethod.equals(tMethod)) {
						if (!mMethod.equals(mMethodToTMethod)) {
							if (!mMethod.equals(tDefinition)) {
								if (!invocation.equals(tAccess)) {
									if (!invocation.equals(tMethod)) {
										if (!invocation.equals(mMethod)) {
											if (!invocation.equals(mMethodToTMethod)) {
												if (!invocation.equals(invocationToTAccess)) {
													if (!invocation.equals(mDefinition)) {
														if (!invocation.equals(tDefinition)) {
															if (!invocation.equals(mDefinitionToTDefinition)) {
																if (!mMethodToTMethod.equals(tAccess)) {
																	if (!mMethodToTMethod.equals(tMethod)) {
																		if (!mMethodToTMethod.equals(tDefinition)) {
																			if (!invocationToTAccess.equals(tAccess)) {
																				if (!invocationToTAccess
																						.equals(tMethod)) {
																					if (!invocationToTAccess
																							.equals(mMethod)) {
																						if (!invocationToTAccess.equals(
																								mMethodToTMethod)) {
																							if (!invocationToTAccess
																									.equals(mDefinition)) {
																								if (!invocationToTAccess
																										.equals(tDefinition)) {
																									if (!invocationToTAccess
																											.equals(mDefinitionToTDefinition)) {
																										if (!mDefinition
																												.equals(tAccess)) {
																											if (!mDefinition
																													.equals(tMethod)) {
																												if (!mDefinition
																														.equals(mMethod)) {
																													if (!mDefinition
																															.equals(mMethodToTMethod)) {
																														if (!mDefinition
																																.equals(tDefinition)) {
																															if (!mDefinition
																																	.equals(mDefinitionToTDefinition)) {
																																if (!tDefinition
																																		.equals(tMethod)) {
																																	if (!mDefinitionToTDefinition
																																			.equals(tAccess)) {
																																		if (!mDefinitionToTDefinition
																																				.equals(tMethod)) {
																																			if (!mDefinitionToTDefinition
																																					.equals(mMethod)) {
																																				if (!mDefinitionToTDefinition
																																						.equals(mMethodToTMethod)) {
																																					if (!mDefinitionToTDefinition
																																							.equals(tDefinition)) {
																																						return new Object[] {
																																								ruleresult,
																																								tAccess,
																																								tMethod,
																																								mMethod,
																																								invocation,
																																								mMethodToTMethod,
																																								invocationToTAccess,
																																								mDefinition,
																																								tDefinition,
																																								mDefinitionToTDefinition };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationTarget_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tAccess, EObject tMethod, EObject mMethod, EObject invocation) {
		EMoflonEdge tMethod__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMethod____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethod__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationTarget";
		String tMethod__tAccess____accessedBy_name_prime = "accessedBy";
		String tAccess__tMethod____tTarget_name_prime = "tTarget";
		String invocation__mMethod____method_name_prime = "method";
		String mMethod__invocation____usages_name_prime = "usages";
		tMethod__tAccess____accessedBy.setSrc(tMethod);
		tMethod__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMethod__tAccess____accessedBy);
		tAccess__tMethod____tTarget.setSrc(tAccess);
		tAccess__tMethod____tTarget.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(tAccess__tMethod____tTarget);
		invocation__mMethod____method.setSrc(invocation);
		invocation__mMethod____method.setTrg(mMethod);
		ruleresult.getTranslatedEdges().add(invocation__mMethod____method);
		mMethod__invocation____usages.setSrc(mMethod);
		mMethod__invocation____usages.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mMethod__invocation____usages);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethod__tAccess____accessedBy.setName(tMethod__tAccess____accessedBy_name_prime);
		tAccess__tMethod____tTarget.setName(tAccess__tMethod____tTarget_name_prime);
		invocation__mMethod____method.setName(invocation__mMethod____method_name_prime);
		mMethod__invocation____usages.setName(mMethod__invocation____usages_name_prime);
		return new Object[] { ruleresult, tAccess, tMethod, mMethod, invocation, tMethod__tAccess____accessedBy,
				tAccess__tMethod____tTarget, invocation__mMethod____method, mMethod__invocation____usages };
	}

	public static final void pattern_MethodInvocationTarget_1_5_registerobjects_expressionBBBBBBBBBBB(
			MethodInvocationTarget _this, PerformRuleResult ruleresult, EObject tAccess, EObject tMethod,
			EObject mMethod, EObject invocation, EObject mMethodToTMethod, EObject invocationToTAccess,
			EObject mDefinition, EObject tDefinition, EObject mDefinitionToTDefinition) {
		_this.registerObjects_FWD(ruleresult, tAccess, tMethod, mMethod, invocation, mMethodToTMethod,
				invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition);

	}

	public static final PerformRuleResult pattern_MethodInvocationTarget_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_1_preparereturnvalue_bindingFB(
			MethodInvocationTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationTarget _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationTarget _this) {
		Object[] result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_binding = pattern_MethodInvocationTarget_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_black = pattern_MethodInvocationTarget_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodInvocationTarget";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTarget_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mMethod");
		EObject _localVariable_1 = match.getObject("invocation");
		EObject _localVariable_2 = match.getObject("mDefinition");
		EObject tmpMMethod = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		if (tmpMMethod instanceof MMethodDefinition) {
			MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
			if (tmpInvocation instanceof AbstractMethodInvocation) {
				AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					return new Object[] { mMethod, invocation, mDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_2_2_corematch_blackFFBBFFBFFB(
			MMethodDefinition mMethod, AbstractMethodInvocation invocation, MDefinition mDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mDefinition.equals(mMethod)) {
			for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mMethod, MDefinitionToTMember.class, "source")) {
				TMember tmpTMethod = mMethodToTMethod.getTarget();
				if (tmpTMethod instanceof TMethodDefinition) {
					TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
					for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(invocation, AbstractMethodInvocationToTAccess.class, "source")) {
						TAccess tAccess = invocationToTAccess.getTarget();
						if (tAccess != null) {
							for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
								if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
									TMember tDefinition = mDefinitionToTDefinition.getTarget();
									if (tDefinition != null) {
										if (!tDefinition.equals(tMethod)) {
											_result.add(new Object[] { tAccess, tMethod, mMethod, invocation,
													mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
													mDefinitionToTDefinition, match });
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

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_2_3_findcontext_blackBBBBBBBBB(
			TAccess tAccess, TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mDefinition.equals(mMethod)) {
			if (!tDefinition.equals(tMethod)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					if (mMethod.equals(invocation.getMethod())) {
						if (mMethod.equals(mMethodToTMethod.getSource())) {
							if (tMethod.equals(mMethodToTMethod.getTarget())) {
								if (invocation.equals(invocationToTAccess.getSource())) {
									if (tAccess.equals(invocationToTAccess.getTarget())) {
										if (mDefinition.getAbstractMethodInvocations().contains(invocation)) {
											if (tDefinition.getTAccessing().contains(tAccess)) {
												if (mDefinition.equals(mDefinitionToTDefinition.getSource())) {
													if (tDefinition.equals(mDefinitionToTDefinition.getTarget())) {
														_result.add(new Object[] { tAccess, tMethod, mMethod,
																invocation, mMethodToTMethod, invocationToTAccess,
																mDefinition, tDefinition, mDefinitionToTDefinition });
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationTarget_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			TAccess tAccess, TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge invocation__mMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethod__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mMethod____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tMethod____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__invocation____abstractMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tDefinition____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocation__mMethod____method_name_prime = "method";
		String mMethod__invocation____usages_name_prime = "usages";
		String mMethodToTMethod__mMethod____source_name_prime = "source";
		String mMethodToTMethod__tMethod____target_name_prime = "target";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String mDefinition__invocation____abstractMethodInvocations_name_prime = "abstractMethodInvocations";
		String tDefinition__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tDefinition____tSource_name_prime = "tSource";
		String mDefinitionToTDefinition__mDefinition____source_name_prime = "source";
		String mDefinitionToTDefinition__tDefinition____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(mMethod);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		invocation__mMethod____method.setSrc(invocation);
		invocation__mMethod____method.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(invocation__mMethod____method);
		mMethod__invocation____usages.setSrc(mMethod);
		mMethod__invocation____usages.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMethod__invocation____usages);
		mMethodToTMethod__mMethod____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mMethod____source.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mMethod____source);
		mMethodToTMethod__tMethod____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tMethod____target);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		mDefinition__invocation____abstractMethodInvocations.setSrc(mDefinition);
		mDefinition__invocation____abstractMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mDefinition__invocation____abstractMethodInvocations);
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
		invocation__mMethod____method.setName(invocation__mMethod____method_name_prime);
		mMethod__invocation____usages.setName(mMethod__invocation____usages_name_prime);
		mMethodToTMethod__mMethod____source.setName(mMethodToTMethod__mMethod____source_name_prime);
		mMethodToTMethod__tMethod____target.setName(mMethodToTMethod__tMethod____target_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		mDefinition__invocation____abstractMethodInvocations
				.setName(mDefinition__invocation____abstractMethodInvocations_name_prime);
		tDefinition__tAccess____tAccessing.setName(tDefinition__tAccess____tAccessing_name_prime);
		tAccess__tDefinition____tSource.setName(tAccess__tDefinition____tSource_name_prime);
		mDefinitionToTDefinition__mDefinition____source
				.setName(mDefinitionToTDefinition__mDefinition____source_name_prime);
		mDefinitionToTDefinition__tDefinition____target
				.setName(mDefinitionToTDefinition__tDefinition____target_name_prime);
		return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
				tDefinition, mDefinitionToTDefinition, isApplicableMatch, invocation__mMethod____method,
				mMethod__invocation____usages, mMethodToTMethod__mMethod____source, mMethodToTMethod__tMethod____target,
				invocationToTAccess__invocation____source, invocationToTAccess__tAccess____target,
				mDefinition__invocation____abstractMethodInvocations, tDefinition__tAccess____tAccessing,
				tAccess__tDefinition____tSource, mDefinitionToTDefinition__mDefinition____source,
				mDefinitionToTDefinition__tDefinition____target };
	}

	public static final Object[] pattern_MethodInvocationTarget_2_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tAccess, tMethod, mMethod, invocation,
				mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, tMethod, mMethod, invocation,
					mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		Object[] result_pattern_MethodInvocationTarget_2_4_solveCSP_binding = pattern_MethodInvocationTarget_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess,
				mDefinition, tDefinition, mDefinitionToTDefinition);
		if (result_pattern_MethodInvocationTarget_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_2_4_solveCSP_black = pattern_MethodInvocationTarget_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, tMethod, mMethod, invocation,
						mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_2_5_checkCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationTarget_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationTarget";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTarget_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_1_initialbindings_blackBBBBB(
			MethodInvocationTarget _this, Match match, TAccess tAccess, TMethodDefinition tMethod,
			TMember tDefinition) {
		if (!tDefinition.equals(tMethod)) {
			return new Object[] { _this, match, tAccess, tMethod, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_2_SolveCSP_bindingFBBBBB(
			MethodInvocationTarget _this, Match match, TAccess tAccess, TMethodDefinition tMethod,
			TMember tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAccess, tMethod, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAccess, tMethod, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodInvocationTarget _this, Match match, TAccess tAccess, TMethodDefinition tMethod,
			TMember tDefinition) {
		Object[] result_pattern_MethodInvocationTarget_10_2_SolveCSP_binding = pattern_MethodInvocationTarget_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAccess, tMethod, tDefinition);
		if (result_pattern_MethodInvocationTarget_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_10_2_SolveCSP_black = pattern_MethodInvocationTarget_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAccess, tMethod, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_10_3_CheckCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TAccess tAccess, TMethodDefinition tMethod, TMember tDefinition) {
		if (!tDefinition.equals(tMethod)) {
			return new Object[] { match, tAccess, tMethod, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TAccess tAccess, TMethodDefinition tMethod) {
		EMoflonEdge tMethod__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMethod____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethod__tAccess____accessedBy_name_prime = "accessedBy";
		String tAccess__tMethod____tTarget_name_prime = "tTarget";
		tMethod__tAccess____accessedBy.setSrc(tMethod);
		tMethod__tAccess____accessedBy.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMethod__tAccess____accessedBy);
		tAccess__tMethod____tTarget.setSrc(tAccess);
		tAccess__tMethod____tTarget.setTrg(tMethod);
		match.getToBeTranslatedEdges().add(tAccess__tMethod____tTarget);
		tMethod__tAccess____accessedBy.setName(tMethod__tAccess____accessedBy_name_prime);
		tAccess__tMethod____tTarget.setName(tAccess__tMethod____tTarget_name_prime);
		return new Object[] { match, tAccess, tMethod, tMethod__tAccess____accessedBy, tAccess__tMethod____tTarget };
	}

	public static final Object[] pattern_MethodInvocationTarget_10_5_collectcontextelements_blackBBBB(Match match,
			TAccess tAccess, TMethodDefinition tMethod, TMember tDefinition) {
		if (!tDefinition.equals(tMethod)) {
			return new Object[] { match, tAccess, tMethod, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_5_collectcontextelements_greenBBBBFF(Match match,
			TAccess tAccess, TMethodDefinition tMethod, TMember tDefinition) {
		EMoflonEdge tDefinition__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tDefinition____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAccess);
		match.getContextNodes().add(tMethod);
		match.getContextNodes().add(tDefinition);
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
		return new Object[] { match, tAccess, tMethod, tDefinition, tDefinition__tAccess____tAccessing,
				tAccess__tDefinition____tSource };
	}

	public static final void pattern_MethodInvocationTarget_10_6_registerobjectstomatch_expressionBBBBB(
			MethodInvocationTarget _this, Match match, TAccess tAccess, TMethodDefinition tMethod,
			TMember tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tAccess, tMethod, tDefinition);

	}

	public static final boolean pattern_MethodInvocationTarget_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMethod");
		EObject _localVariable_3 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_5 = isApplicableMatch.getObject("invocationToTAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_7 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_8 = isApplicableMatch.getObject("mDefinitionToTDefinition");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		EObject tmpMMethod = _localVariable_2;
		EObject tmpInvocation = _localVariable_3;
		EObject tmpMMethodToTMethod = _localVariable_4;
		EObject tmpInvocationToTAccess = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		EObject tmpTDefinition = _localVariable_7;
		EObject tmpMDefinitionToTDefinition = _localVariable_8;
		if (tmpTAccess instanceof TAccess) {
			TAccess tAccess = (TAccess) tmpTAccess;
			if (tmpTMethod instanceof TMethodDefinition) {
				TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
				if (tmpMMethod instanceof MMethodDefinition) {
					MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
					if (tmpInvocation instanceof AbstractMethodInvocation) {
						AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
						if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
							MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
							if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
								AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									if (tmpTDefinition instanceof TMember) {
										TMember tDefinition = (TMember) tmpTDefinition;
										if (tmpMDefinitionToTDefinition instanceof MDefinitionToTMember) {
											MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) tmpMDefinitionToTDefinition;
											return new Object[] { tAccess, tMethod, mMethod, invocation,
													mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
													mDefinitionToTDefinition, isApplicableMatch };
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

	public static final Object[] pattern_MethodInvocationTarget_11_1_performtransformation_blackBBBBBBBBBFBB(
			TAccess tAccess, TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch) {
		if (!mDefinition.equals(mMethod)) {
			if (!tDefinition.equals(tMethod)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod,
									invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationTarget_11_1_performtransformation_binding = pattern_MethodInvocationTarget_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationTarget_11_1_performtransformation_binding != null) {
			TAccess tAccess = (TAccess) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[0];
			TMethodDefinition tMethod = (TMethodDefinition) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[1];
			MMethodDefinition mMethod = (MMethodDefinition) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[3];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[5];
			MDefinition mDefinition = (MDefinition) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[6];
			TMember tDefinition = (TMember) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[7];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[8];

			Object[] result_pattern_MethodInvocationTarget_11_1_performtransformation_black = pattern_MethodInvocationTarget_11_1_performtransformation_blackBBBBBBBBBFBB(
					tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
					tDefinition, mDefinitionToTDefinition, _this, isApplicableMatch);
			if (result_pattern_MethodInvocationTarget_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationTarget_11_1_performtransformation_black[9];

				return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess,
						mDefinition, tDefinition, mDefinitionToTDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_11_1_performtransformation_greenBB(
			MMethodDefinition mMethod, AbstractMethodInvocation invocation) {
		invocation.setMethod(mMethod);
		return new Object[] { mMethod, invocation };
	}

	public static final Object[] pattern_MethodInvocationTarget_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTarget_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAccess, EObject tMethod, EObject mMethod, EObject invocation,
			EObject mMethodToTMethod, EObject invocationToTAccess, EObject mDefinition, EObject tDefinition,
			EObject mDefinitionToTDefinition) {
		if (!tAccess.equals(tMethod)) {
			if (!tAccess.equals(tDefinition)) {
				if (!mMethod.equals(tAccess)) {
					if (!mMethod.equals(tMethod)) {
						if (!mMethod.equals(mMethodToTMethod)) {
							if (!mMethod.equals(tDefinition)) {
								if (!invocation.equals(tAccess)) {
									if (!invocation.equals(tMethod)) {
										if (!invocation.equals(mMethod)) {
											if (!invocation.equals(mMethodToTMethod)) {
												if (!invocation.equals(invocationToTAccess)) {
													if (!invocation.equals(mDefinition)) {
														if (!invocation.equals(tDefinition)) {
															if (!invocation.equals(mDefinitionToTDefinition)) {
																if (!mMethodToTMethod.equals(tAccess)) {
																	if (!mMethodToTMethod.equals(tMethod)) {
																		if (!mMethodToTMethod.equals(tDefinition)) {
																			if (!invocationToTAccess.equals(tAccess)) {
																				if (!invocationToTAccess
																						.equals(tMethod)) {
																					if (!invocationToTAccess
																							.equals(mMethod)) {
																						if (!invocationToTAccess.equals(
																								mMethodToTMethod)) {
																							if (!invocationToTAccess
																									.equals(mDefinition)) {
																								if (!invocationToTAccess
																										.equals(tDefinition)) {
																									if (!invocationToTAccess
																											.equals(mDefinitionToTDefinition)) {
																										if (!mDefinition
																												.equals(tAccess)) {
																											if (!mDefinition
																													.equals(tMethod)) {
																												if (!mDefinition
																														.equals(mMethod)) {
																													if (!mDefinition
																															.equals(mMethodToTMethod)) {
																														if (!mDefinition
																																.equals(tDefinition)) {
																															if (!mDefinition
																																	.equals(mDefinitionToTDefinition)) {
																																if (!tDefinition
																																		.equals(tMethod)) {
																																	if (!mDefinitionToTDefinition
																																			.equals(tAccess)) {
																																		if (!mDefinitionToTDefinition
																																				.equals(tMethod)) {
																																			if (!mDefinitionToTDefinition
																																					.equals(mMethod)) {
																																				if (!mDefinitionToTDefinition
																																						.equals(mMethodToTMethod)) {
																																					if (!mDefinitionToTDefinition
																																							.equals(tDefinition)) {
																																						return new Object[] {
																																								ruleresult,
																																								tAccess,
																																								tMethod,
																																								mMethod,
																																								invocation,
																																								mMethodToTMethod,
																																								invocationToTAccess,
																																								mDefinition,
																																								tDefinition,
																																								mDefinitionToTDefinition };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationTarget_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tAccess, EObject tMethod, EObject mMethod, EObject invocation) {
		EMoflonEdge tMethod__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMethod____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethod__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationTarget";
		String tMethod__tAccess____accessedBy_name_prime = "accessedBy";
		String tAccess__tMethod____tTarget_name_prime = "tTarget";
		String invocation__mMethod____method_name_prime = "method";
		String mMethod__invocation____usages_name_prime = "usages";
		tMethod__tAccess____accessedBy.setSrc(tMethod);
		tMethod__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMethod__tAccess____accessedBy);
		tAccess__tMethod____tTarget.setSrc(tAccess);
		tAccess__tMethod____tTarget.setTrg(tMethod);
		ruleresult.getTranslatedEdges().add(tAccess__tMethod____tTarget);
		invocation__mMethod____method.setSrc(invocation);
		invocation__mMethod____method.setTrg(mMethod);
		ruleresult.getCreatedEdges().add(invocation__mMethod____method);
		mMethod__invocation____usages.setSrc(mMethod);
		mMethod__invocation____usages.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mMethod__invocation____usages);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethod__tAccess____accessedBy.setName(tMethod__tAccess____accessedBy_name_prime);
		tAccess__tMethod____tTarget.setName(tAccess__tMethod____tTarget_name_prime);
		invocation__mMethod____method.setName(invocation__mMethod____method_name_prime);
		mMethod__invocation____usages.setName(mMethod__invocation____usages_name_prime);
		return new Object[] { ruleresult, tAccess, tMethod, mMethod, invocation, tMethod__tAccess____accessedBy,
				tAccess__tMethod____tTarget, invocation__mMethod____method, mMethod__invocation____usages };
	}

	public static final void pattern_MethodInvocationTarget_11_5_registerobjects_expressionBBBBBBBBBBB(
			MethodInvocationTarget _this, PerformRuleResult ruleresult, EObject tAccess, EObject tMethod,
			EObject mMethod, EObject invocation, EObject mMethodToTMethod, EObject invocationToTAccess,
			EObject mDefinition, EObject tDefinition, EObject mDefinitionToTDefinition) {
		_this.registerObjects_BWD(ruleresult, tAccess, tMethod, mMethod, invocation, mMethodToTMethod,
				invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition);

	}

	public static final PerformRuleResult pattern_MethodInvocationTarget_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_1_preparereturnvalue_bindingFB(
			MethodInvocationTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationTarget _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationTarget _this) {
		Object[] result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_binding = pattern_MethodInvocationTarget_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_black = pattern_MethodInvocationTarget_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodInvocationTarget";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTarget_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAccess");
		EObject _localVariable_1 = match.getObject("tMethod");
		EObject _localVariable_2 = match.getObject("tDefinition");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		if (tmpTAccess instanceof TAccess) {
			TAccess tAccess = (TAccess) tmpTAccess;
			if (tmpTMethod instanceof TMethodDefinition) {
				TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
				if (tmpTDefinition instanceof TMember) {
					TMember tDefinition = (TMember) tmpTDefinition;
					return new Object[] { tAccess, tMethod, tDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_12_2_corematch_blackBBFFFFFBFB(
			TAccess tAccess, TMethodDefinition tMethod, TMember tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tDefinition.equals(tMethod)) {
			for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMethod, MDefinitionToTMember.class, "target")) {
				MDefinition tmpMMethod = mMethodToTMethod.getSource();
				if (tmpMMethod instanceof MMethodDefinition) {
					MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
					for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAccess, AbstractMethodInvocationToTAccess.class, "target")) {
						AbstractMethodInvocation invocation = invocationToTAccess.getSource();
						if (invocation != null) {
							for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
								if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
									MDefinition mDefinition = mDefinitionToTDefinition.getSource();
									if (mDefinition != null) {
										if (!mDefinition.equals(mMethod)) {
											_result.add(new Object[] { tAccess, tMethod, mMethod, invocation,
													mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition,
													mDefinitionToTDefinition, match });
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

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_12_3_findcontext_blackBBBBBBBBB(
			TAccess tAccess, TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mDefinition.equals(mMethod)) {
			if (!tDefinition.equals(tMethod)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					if (tMethod.getAccessedBy().contains(tAccess)) {
						if (mMethod.equals(mMethodToTMethod.getSource())) {
							if (tMethod.equals(mMethodToTMethod.getTarget())) {
								if (invocation.equals(invocationToTAccess.getSource())) {
									if (tAccess.equals(invocationToTAccess.getTarget())) {
										if (mDefinition.getAbstractMethodInvocations().contains(invocation)) {
											if (tDefinition.getTAccessing().contains(tAccess)) {
												if (mDefinition.equals(mDefinitionToTDefinition.getSource())) {
													if (tDefinition.equals(mDefinitionToTDefinition.getTarget())) {
														_result.add(new Object[] { tAccess, tMethod, mMethod,
																invocation, mMethodToTMethod, invocationToTAccess,
																mDefinition, tDefinition, mDefinitionToTDefinition });
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationTarget_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			TAccess tAccess, TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethod__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMethod____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mMethod____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tMethod____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__invocation____abstractMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tDefinition____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethod__tAccess____accessedBy_name_prime = "accessedBy";
		String tAccess__tMethod____tTarget_name_prime = "tTarget";
		String mMethodToTMethod__mMethod____source_name_prime = "source";
		String mMethodToTMethod__tMethod____target_name_prime = "target";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String mDefinition__invocation____abstractMethodInvocations_name_prime = "abstractMethodInvocations";
		String tDefinition__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tDefinition____tSource_name_prime = "tSource";
		String mDefinitionToTDefinition__mDefinition____source_name_prime = "source";
		String mDefinitionToTDefinition__tDefinition____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(mMethod);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		tMethod__tAccess____accessedBy.setSrc(tMethod);
		tMethod__tAccess____accessedBy.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMethod__tAccess____accessedBy);
		tAccess__tMethod____tTarget.setSrc(tAccess);
		tAccess__tMethod____tTarget.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(tAccess__tMethod____tTarget);
		mMethodToTMethod__mMethod____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mMethod____source.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mMethod____source);
		mMethodToTMethod__tMethod____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tMethod____target);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		mDefinition__invocation____abstractMethodInvocations.setSrc(mDefinition);
		mDefinition__invocation____abstractMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mDefinition__invocation____abstractMethodInvocations);
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
		tMethod__tAccess____accessedBy.setName(tMethod__tAccess____accessedBy_name_prime);
		tAccess__tMethod____tTarget.setName(tAccess__tMethod____tTarget_name_prime);
		mMethodToTMethod__mMethod____source.setName(mMethodToTMethod__mMethod____source_name_prime);
		mMethodToTMethod__tMethod____target.setName(mMethodToTMethod__tMethod____target_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		mDefinition__invocation____abstractMethodInvocations
				.setName(mDefinition__invocation____abstractMethodInvocations_name_prime);
		tDefinition__tAccess____tAccessing.setName(tDefinition__tAccess____tAccessing_name_prime);
		tAccess__tDefinition____tSource.setName(tAccess__tDefinition____tSource_name_prime);
		mDefinitionToTDefinition__mDefinition____source
				.setName(mDefinitionToTDefinition__mDefinition____source_name_prime);
		mDefinitionToTDefinition__tDefinition____target
				.setName(mDefinitionToTDefinition__tDefinition____target_name_prime);
		return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
				tDefinition, mDefinitionToTDefinition, isApplicableMatch, tMethod__tAccess____accessedBy,
				tAccess__tMethod____tTarget, mMethodToTMethod__mMethod____source, mMethodToTMethod__tMethod____target,
				invocationToTAccess__invocation____source, invocationToTAccess__tAccess____target,
				mDefinition__invocation____abstractMethodInvocations, tDefinition__tAccess____tAccessing,
				tAccess__tDefinition____tSource, mDefinitionToTDefinition__mDefinition____source,
				mDefinitionToTDefinition__tDefinition____target };
	}

	public static final Object[] pattern_MethodInvocationTarget_12_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAccess, tMethod, mMethod, invocation,
				mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, tMethod, mMethod, invocation,
					mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		Object[] result_pattern_MethodInvocationTarget_12_4_solveCSP_binding = pattern_MethodInvocationTarget_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess,
				mDefinition, tDefinition, mDefinitionToTDefinition);
		if (result_pattern_MethodInvocationTarget_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_12_4_solveCSP_black = pattern_MethodInvocationTarget_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, tMethod, mMethod, invocation,
						mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_12_5_checkCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationTarget_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationTarget";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTarget_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_1_preparereturnvalue_bindingFB(
			MethodInvocationTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodInvocationTarget _this) {
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

	public static final Object[] pattern_MethodInvocationTarget_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationTarget _this) {
		Object[] result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_binding = pattern_MethodInvocationTarget_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_black = pattern_MethodInvocationTarget_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_method) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInvocation = _edge_method.getSrc();
		if (tmpInvocation instanceof AbstractMethodInvocation) {
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
			EObject tmpMMethod = _edge_method.getTrg();
			if (tmpMMethod instanceof MMethodDefinition) {
				MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
				if (mMethod.equals(invocation.getMethod())) {
					for (MDefinition mDefinition : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(invocation, MDefinition.class, "abstractMethodInvocations")) {
						if (!mDefinition.equals(mMethod)) {
							_result.add(new Object[] { mMethod, invocation, mDefinition, _edge_method });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationTarget_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodInvocationTarget _this, Match match, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mMethod, invocation, mDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationTarget _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationTarget_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_1_preparereturnvalue_bindingFB(
			MethodInvocationTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodInvocationTarget _this) {
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

	public static final Object[] pattern_MethodInvocationTarget_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationTarget _this) {
		Object[] result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_binding = pattern_MethodInvocationTarget_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_black = pattern_MethodInvocationTarget_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_accessedBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethod = _edge_accessedBy.getSrc();
		if (tmpTMethod instanceof TMethodDefinition) {
			TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
			EObject tmpTAccess = _edge_accessedBy.getTrg();
			if (tmpTAccess instanceof TAccess) {
				TAccess tAccess = (TAccess) tmpTAccess;
				if (tMethod.getAccessedBy().contains(tAccess)) {
					TMember tDefinition = tAccess.getTSource();
					if (tDefinition != null) {
						if (!tDefinition.equals(tMethod)) {
							_result.add(new Object[] { tAccess, tMethod, tDefinition, _edge_accessedBy });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationTarget_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodInvocationTarget _this, Match match, TAccess tAccess, TMethodDefinition tMethod,
			TMember tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAccess, tMethod, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationTarget _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationTarget_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_1_prepare_blackB(MethodInvocationTarget _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_2_matchcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAccess");
		EObject _localVariable_1 = targetMatch.getObject("tMethod");
		EObject _localVariable_2 = sourceMatch.getObject("mMethod");
		EObject _localVariable_3 = sourceMatch.getObject("invocation");
		EObject _localVariable_4 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_5 = targetMatch.getObject("tDefinition");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		EObject tmpMMethod = _localVariable_2;
		EObject tmpInvocation = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpTDefinition = _localVariable_5;
		if (tmpTAccess instanceof TAccess) {
			TAccess tAccess = (TAccess) tmpTAccess;
			if (tmpTMethod instanceof TMethodDefinition) {
				TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
				if (tmpMMethod instanceof MMethodDefinition) {
					MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
					if (tmpInvocation instanceof AbstractMethodInvocation) {
						AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpTDefinition instanceof TMember) {
								TMember tDefinition = (TMember) tmpTDefinition;
								return new Object[] { tAccess, tMethod, mMethod, invocation, mDefinition, tDefinition,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_24_2_matchcontext_blackBBBBFFBBFBB(
			TAccess tAccess, TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition, TMember tDefinition, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mDefinition.equals(mMethod)) {
			if (!tDefinition.equals(tMethod)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (tMethod.getAccessedBy().contains(tAccess)) {
						if (mMethod.equals(invocation.getMethod())) {
							if (mDefinition.getAbstractMethodInvocations().contains(invocation)) {
								if (tDefinition.getTAccessing().contains(tAccess)) {
									for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(mMethod, MDefinitionToTMember.class, "source")) {
										if (tMethod.equals(mMethodToTMethod.getTarget())) {
											for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(invocation,
															AbstractMethodInvocationToTAccess.class, "source")) {
												if (tAccess.equals(invocationToTAccess.getTarget())) {
													for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(mDefinition,
																	MDefinitionToTMember.class, "source")) {
														if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
															if (tDefinition
																	.equals(mDefinitionToTDefinition.getTarget())) {
																_result.add(new Object[] { tAccess, tMethod, mMethod,
																		invocation, mMethodToTMethod,
																		invocationToTAccess, mDefinition, tDefinition,
																		mDefinitionToTDefinition, sourceMatch,
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
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_2_matchcontext_greenBBBBBBBBBBFB(TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "MethodInvocationTarget";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mMethod);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess, mDefinition,
				tDefinition, mDefinitionToTDefinition, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_3_checkcsp_bindingFBBBBBBBBBBBBB(
			MethodInvocationTarget _this, CCMatch isApplicableMatch, TAccess tAccess, TMethodDefinition tMethod,
			MMethodDefinition mMethod, AbstractMethodInvocation invocation, MDefinitionToTMember mMethodToTMethod,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinition mDefinition, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, tAccess, tMethod, mMethod, invocation,
				mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, tMethod, mMethod, invocation,
					mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBB(
			MethodInvocationTarget _this, CCMatch isApplicableMatch, TAccess tAccess, TMethodDefinition tMethod,
			MMethodDefinition mMethod, AbstractMethodInvocation invocation, MDefinitionToTMember mMethodToTMethod,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinition mDefinition, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationTarget_24_3_checkcsp_binding = pattern_MethodInvocationTarget_24_3_checkcsp_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess,
				mDefinition, tDefinition, mDefinitionToTDefinition, sourceMatch, targetMatch);
		if (result_pattern_MethodInvocationTarget_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_24_3_checkcsp_binding[0];

			Object[] result_pattern_MethodInvocationTarget_24_3_checkcsp_black = pattern_MethodInvocationTarget_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, tMethod, mMethod, invocation,
						mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_4_createcorrespondence_blackBBBBBBB(TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinition mDefinition, TMember tDefinition, CCMatch isApplicableMatch) {
		if (!mDefinition.equals(mMethod)) {
			if (!tDefinition.equals(tMethod)) {
				return new Object[] { tAccess, tMethod, mMethod, invocation, mDefinition, tDefinition,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationTarget";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTarget_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_27_1_matchtggpattern_blackBBB(MMethodDefinition mMethod,
			AbstractMethodInvocation invocation, MDefinition mDefinition) {
		if (!mDefinition.equals(mMethod)) {
			if (mMethod.equals(invocation.getMethod())) {
				if (mDefinition.getAbstractMethodInvocations().contains(invocation)) {
					return new Object[] { mMethod, invocation, mDefinition };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_28_1_matchtggpattern_blackBBB(TAccess tAccess,
			TMethodDefinition tMethod, TMember tDefinition) {
		if (!tDefinition.equals(tMethod)) {
			if (tMethod.getAccessedBy().contains(tAccess)) {
				if (tDefinition.getTAccessing().contains(tAccess)) {
					return new Object[] { tAccess, tMethod, tDefinition };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_1_createresult_blackB(MethodInvocationTarget _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationTarget_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TAccess tAccess) {
		if (ruleResult.getTargetObjects().contains(tAccess)) {
			return new Object[] { ruleResult, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodInvocationToTAccess invocationToTAccess) {
		if (ruleResult.getCorrObjects().contains(invocationToTAccess)) {
			return new Object[] { ruleResult, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodInvocation invocation) {
		if (ruleResult.getSourceObjects().contains(invocation)) {
			return new Object[] { ruleResult, invocation };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTDefinition) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTDefinition)) {
			return new Object[] { ruleResult, mDefinitionToTDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TMember tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TMethodDefinition tMethod) {
		if (ruleResult.getTargetObjects().contains(tMethod)) {
			return new Object[] { ruleResult, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMethodToTMethod) {
		if (ruleResult.getCorrObjects().contains(mMethodToTMethod)) {
			return new Object[] { ruleResult, mMethodToTMethod };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, MMethodDefinition mMethod) {
		if (ruleResult.getSourceObjects().contains(mMethod)) {
			return new Object[] { ruleResult, mMethod };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList invocationToTAccessList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mMethodToTMethodList : ruleEntryContainer.getRuleEntryList()) {
				if (!invocationToTAccessList.equals(mMethodToTMethodList)) {
					for (EObject tmpInvocationToTAccess : invocationToTAccessList.getEntryObjects()) {
						if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
							AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
							TAccess tAccess = invocationToTAccess.getTarget();
							if (tAccess != null) {
								AbstractMethodInvocation invocation = invocationToTAccess.getSource();
								if (invocation != null) {
									TMember tDefinition = tAccess.getTSource();
									if (tDefinition != null) {
										if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, invocationToTAccess) == null) {
											if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, tAccess) == null) {
												if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_2BB(
														ruleResult, invocation) == null) {
													if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_5BB(
															ruleResult, tDefinition) == null) {
														for (EObject tmpMMethodToTMethod : mMethodToTMethodList
																.getEntryObjects()) {
															if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
																MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
																TMember tmpTMethod = mMethodToTMethod.getTarget();
																if (tmpTMethod instanceof TMethodDefinition) {
																	TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
																	if (!tDefinition.equals(tMethod)) {
																		MDefinition tmpMMethod = mMethodToTMethod
																				.getSource();
																		if (tmpMMethod instanceof MMethodDefinition) {
																			MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
																			if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_7BB(
																					ruleResult,
																					mMethodToTMethod) == null) {
																				if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_6BB(
																						ruleResult, tMethod) == null) {
																					if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_8BB(
																							ruleResult,
																							mMethod) == null) {
																						for (MDefinition mDefinition : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										invocation,
																										MDefinition.class,
																										"abstractMethodInvocations")) {
																							if (!mDefinition
																									.equals(mMethod)) {
																								if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_3BB(
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
																												if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_4BB(
																														ruleResult,
																														mDefinitionToTDefinition) == null) {
																													_result.add(
																															new Object[] {
																																	invocationToTAccessList,
																																	tAccess,
																																	invocationToTAccess,
																																	invocation,
																																	mDefinition,
																																	mDefinitionToTDefinition,
																																	tDefinition,
																																	mMethodToTMethodList,
																																	tMethod,
																																	mMethodToTMethod,
																																	mMethod,
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
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tAccess, tMethod, mMethod,
				invocation, mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, tMethod, mMethod, invocation,
					mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodInvocationTarget_29_3_solveCSP_binding = pattern_MethodInvocationTarget_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess,
				mDefinition, tDefinition, mDefinitionToTDefinition, ruleResult);
		if (result_pattern_MethodInvocationTarget_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_29_3_solveCSP_black = pattern_MethodInvocationTarget_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, tMethod, mMethod, invocation,
						mMethodToTMethod, invocationToTAccess, mDefinition, tDefinition, mDefinitionToTDefinition,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_29_4_checkCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_5_checknacs_blackBBBBBBBBB(TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		if (!mDefinition.equals(mMethod)) {
			if (!tDefinition.equals(tMethod)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess,
							mDefinition, tDefinition, mDefinitionToTDefinition };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_6_perform_blackBBBBBBBBBB(TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			MDefinitionToTMember mMethodToTMethod, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinition mDefinition, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			ModelgeneratorRuleResult ruleResult) {
		if (!mDefinition.equals(mMethod)) {
			if (!tDefinition.equals(tMethod)) {
				if (!mDefinitionToTDefinition.equals(mMethodToTMethod)) {
					return new Object[] { tAccess, tMethod, mMethod, invocation, mMethodToTMethod, invocationToTAccess,
							mDefinition, tDefinition, mDefinitionToTDefinition, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_6_perform_greenBBBBB(TAccess tAccess,
			TMethodDefinition tMethod, MMethodDefinition mMethod, AbstractMethodInvocation invocation,
			ModelgeneratorRuleResult ruleResult) {
		tMethod.getAccessedBy().add(tAccess);
		invocation.setMethod(mMethod);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAccess, tMethod, mMethod, invocation, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodInvocationTarget_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodInvocationTargetImpl
