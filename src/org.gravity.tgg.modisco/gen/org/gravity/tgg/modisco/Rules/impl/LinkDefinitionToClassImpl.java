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

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Type;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.MDefinitionToTMember;

import org.gravity.tgg.modisco.Rules.LinkDefinitionToClass;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Link Definition To Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LinkDefinitionToClassImpl extends AbstractRuleImpl implements LinkDefinitionToClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkDefinitionToClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLinkDefinitionToClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		// initial bindings
		Object[] result1_black = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_0_1_initialbindings_blackBBBB(this, match, mDefinition, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mType] = " + mType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mDefinition, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mType] = "
					+ mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_0_4_collectelementstobetranslated_blackBBB(match, mDefinition,
							mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mType] = " + mType + ".");
			}
			LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_0_4_collectelementstobetranslated_greenBBBFF(match,
					mDefinition, mType);
			// EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result4_green[3];
			// EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_0_5_collectcontextelements_blackBBB(match, mDefinition, mType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
			}
			LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_0_5_collectcontextelements_greenBBB(match,
					mDefinition, mType);

			// register objects to match
			LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mDefinition, mType);
			return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_0_7_expressionF();
		} else {
			return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[0];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TMember tDefinition = (TMember) result1_bindingAndBlack[4];
		MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_1_1_performtransformation_greenBB(tType, tDefinition);

		// collect translated elements
		Object[] result2_green = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mDefinition, mType,
						tType, mTypeToTType, tDefinition, mDefinitionToTDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mDefinition] = " + mDefinition + ", " + "[mType] = "
					+ mType + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[mDefinitionToTDefinition] = "
					+ mDefinitionToTDefinition + ".");
		}
		LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				mDefinition, mType, tType, tDefinition);
		// EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[5];
		// EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition);
		return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MDefinition mDefinition = (MDefinition) result2_binding[0];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_2_2_corematch_blackBBFFFFB(mDefinition, mType, match)) {
			TAbstractType tType = (TAbstractType) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			TMember tDefinition = (TMember) result2_black[4];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_2_3_findcontext_blackBBBBBB(mDefinition, mType, tType, mTypeToTType,
							tDefinition, mDefinitionToTDefinition)) {
				Object[] result3_green = LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_2_3_findcontext_greenBBBBBBFFFFFFF(mDefinition, mType, tType,
								mTypeToTType, tDefinition, mDefinitionToTDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mDefinitionToTDefinition__mDefinition____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mDefinitionToTDefinition__tDefinition____target = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ", " + "[tType] = "
							+ tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LinkDefinitionToClassImpl
							.pattern_LinkDefinitionToClass_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MDefinition mDefinition, AbstractTypeDeclaration mType) {// Create CSP
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
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mDefinition, EObject mType, EObject tType,
			EObject mTypeToTType, EObject tDefinition, EObject mDefinitionToTDefinition) {
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
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
	public boolean isAppropriate_BWD(Match match, TAbstractType tType, TMember tDefinition) {
		// initial bindings
		Object[] result1_black = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_10_1_initialbindings_blackBBBB(this, match, tType, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tType] = " + tType + ", "
					+ "[tDefinition] = " + tDefinition + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tType, tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tDefinition] = "
					+ tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_10_4_collectelementstobetranslated_blackBBB(match, tType,
							tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_10_4_collectelementstobetranslated_greenBBBFF(match,
					tType, tDefinition);
			// EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_10_5_collectcontextelements_blackBBB(match, tType, tDefinition);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[tType] = " + tType + ", " + "[tDefinition] = " + tDefinition + ".");
			}
			LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_10_5_collectcontextelements_greenBBB(match, tType,
					tDefinition);

			// register objects to match
			LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_10_6_registerobjectstomatch_expressionBBBB(this,
					match, tType, tDefinition);
			return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_10_7_expressionF();
		} else {
			return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[0];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TMember tDefinition = (TMember) result1_bindingAndBlack[4];
		MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_11_1_performtransformation_greenBB(mDefinition, mType);

		// collect translated elements
		Object[] result2_green = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mDefinition, mType,
						tType, mTypeToTType, tDefinition, mDefinitionToTDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mDefinition] = " + mDefinition + ", " + "[mType] = "
					+ mType + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[mDefinitionToTDefinition] = "
					+ mDefinitionToTDefinition + ".");
		}
		LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				mDefinition, mType, tType, tDefinition);
		// EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[5];
		// EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[7];
		// EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[8];

		// perform postprocessing story node is empty
		// register objects
		LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition);
		return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tType = (TAbstractType) result2_binding[0];
		TMember tDefinition = (TMember) result2_binding[1];
		for (Object[] result2_black : LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_12_2_corematch_blackFFBFBFB(tType, tDefinition, match)) {
			MDefinition mDefinition = (MDefinition) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_12_3_findcontext_blackBBBBBB(mDefinition, mType, tType, mTypeToTType,
							tDefinition, mDefinitionToTDefinition)) {
				Object[] result3_green = LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_12_3_findcontext_greenBBBBBBFFFFFFF(mDefinition, mType, tType,
								mTypeToTType, tDefinition, mDefinitionToTDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[7];
				// EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mDefinitionToTDefinition__mDefinition____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mDefinitionToTDefinition__tDefinition____target = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ", " + "[tType] = "
							+ tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LinkDefinitionToClassImpl
							.pattern_LinkDefinitionToClass_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tType, TMember tDefinition) {
		match.registerObject("tType", tType);
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tType, TMember tDefinition) {// Create CSP
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
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mDefinition, EObject mType, EObject tType,
			EObject mTypeToTType, EObject tDefinition, EObject mDefinitionToTDefinition) {
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_20(EMoflonEdge _edge_bodyDeclarations) {
		// prepare return value
		Object[] result1_bindingAndBlack = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_20_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			MDefinition mDefinition = (MDefinition) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mDefinition, mType)) {
				// Ensure that the correct types of elements are matched
				if (LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = LinkDefinitionToClassImpl
							.pattern_LinkDefinitionToClass_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_18(EMoflonEdge _edge_definedBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_21_2_testcorematchandDECs_blackFFB(_edge_definedBy)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TMember tDefinition = (TMember) result2_black[1];
			Object[] result2_green = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tType, tDefinition)) {
				// Ensure that the correct types of elements are matched
				if (LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = LinkDefinitionToClassImpl
							.pattern_LinkDefinitionToClass_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LinkDefinitionToClass");
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
		ruleResult.setRule("LinkDefinitionToClass");
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
		Object[] result1_black = LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_24_2_matchcontext_bindingFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result2_binding[0];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[1];
		TAbstractType tType = (TAbstractType) result2_binding[2];
		TMember tDefinition = (TMember) result2_binding[3];
		for (Object[] result2_black : LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_24_2_matchcontext_blackBBBFBFBB(mDefinition, mType, tType, tDefinition,
						sourceMatch, targetMatch)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[5];
			Object[] result2_green = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_24_2_matchcontext_greenBBBBBBBFB(mDefinition, mType, tType,
							mTypeToTType, tDefinition, mDefinitionToTDefinition, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_24_4_createcorrespondence_blackBBBBB(mDefinition, mType, tType,
								tDefinition, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ", "
							+ "[tType] = " + tType + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public boolean checkDEC_FWD(MDefinition mDefinition, AbstractTypeDeclaration mType) {// match tgg pattern
		Object[] result1_black = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_27_1_matchtggpattern_blackBB(mDefinition, mType);
		if (result1_black != null) {
			return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_27_2_expressionF();
		} else {
			return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tType, TMember tDefinition) {// match tgg pattern
		Object[] result1_black = LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_28_1_matchtggpattern_blackBB(tType, tDefinition);
		if (result1_black != null) {
			return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_28_2_expressionF();
		} else {
			return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mDefinitionToTDefinitionParameter, TypeToTAbstractType mTypeToTTypeParameter) {
		// create result
		Object[] result1_black = LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : LinkDefinitionToClassImpl
				.pattern_LinkDefinitionToClass_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mDefinitionToTDefinitionList = (RuleEntryList) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result2_black[2];
			TMember tDefinition = (TMember) result2_black[3];
			// RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[4];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			TAbstractType tType = (TAbstractType) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = LinkDefinitionToClassImpl
					.pattern_LinkDefinitionToClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinition] = "
						+ mDefinition + ", " + "[mType] = " + mType + ", " + "[tType] = " + tType + ", "
						+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tDefinition] = " + tDefinition + ", "
						+ "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = LinkDefinitionToClassImpl
						.pattern_LinkDefinitionToClass_29_5_checknacs_blackBBBBBB(mDefinition, mType, tType,
								mTypeToTType, tDefinition, mDefinitionToTDefinition);
				if (result5_black != null) {

					// perform
					Object[] result6_black = LinkDefinitionToClassImpl
							.pattern_LinkDefinitionToClass_29_6_perform_blackBBBBBBB(mDefinition, mType, tType,
									mTypeToTType, tDefinition, mDefinitionToTDefinition, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ", " + "[tType] = "
								+ tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tDefinition] = "
								+ tDefinition + ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_29_6_perform_greenBBBBB(mDefinition, mType,
							tType, tDefinition, ruleResult);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToClassImpl.pattern_LinkDefinitionToClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPROPRIATE_FWD__MATCH_MDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MDEFINITION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MDEFINITION_ABSTRACTTYPEDECLARATION_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TMEMBER_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TMember) arguments.get(5),
					(MDefinitionToTMember) arguments.get(6));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMember) arguments.get(2));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITION_ABSTRACTTYPEDECLARATION_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TMEMBER_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TMember) arguments.get(5),
					(MDefinitionToTMember) arguments.get(6));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_20((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_18((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MDEFINITION_ABSTRACTTYPEDECLARATION_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TMEMBER_MDEFINITIONTOTMEMBER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TMember) arguments.get(5),
					(MDefinitionToTMember) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___CHECK_DEC_FWD__MDEFINITION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MDefinition) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___CHECK_DEC_BWD__TABSTRACTTYPE_TMEMBER:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TMember) arguments.get(1));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITION_ABSTRACTTYPEDECLARATION_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TMEMBER_MDEFINITIONTOTMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TMember) arguments.get(5),
					(MDefinitionToTMember) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.LINK_DEFINITION_TO_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LinkDefinitionToClass_0_1_initialbindings_blackBBBB(
			LinkDefinitionToClass _this, Match match, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		return new Object[] { _this, match, mDefinition, mType };
	}

	public static final Object[] pattern_LinkDefinitionToClass_0_2_SolveCSP_bindingFBBBB(LinkDefinitionToClass _this,
			Match match, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToClass_0_2_SolveCSP_bindingAndBlackFBBBB(
			LinkDefinitionToClass _this, Match match, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		Object[] result_pattern_LinkDefinitionToClass_0_2_SolveCSP_binding = pattern_LinkDefinitionToClass_0_2_SolveCSP_bindingFBBBB(
				_this, match, mDefinition, mType);
		if (result_pattern_LinkDefinitionToClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_0_2_SolveCSP_black = pattern_LinkDefinitionToClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToClass_0_3_CheckCSP_expressionFBB(LinkDefinitionToClass _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_0_4_collectelementstobetranslated_blackBBB(Match match,
			MDefinition mDefinition, AbstractTypeDeclaration mType) {
		return new Object[] { match, mDefinition, mType };
	}

	public static final Object[] pattern_LinkDefinitionToClass_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MDefinition mDefinition, AbstractTypeDeclaration mType) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		match.getToBeTranslatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mDefinition, mType, mType__mDefinition____bodyDeclarations,
				mDefinition__mType____abstractTypeDeclaration };
	}

	public static final Object[] pattern_LinkDefinitionToClass_0_5_collectcontextelements_blackBBB(Match match,
			MDefinition mDefinition, AbstractTypeDeclaration mType) {
		return new Object[] { match, mDefinition, mType };
	}

	public static final Object[] pattern_LinkDefinitionToClass_0_5_collectcontextelements_greenBBB(Match match,
			MDefinition mDefinition, AbstractTypeDeclaration mType) {
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mType);
		return new Object[] { match, mDefinition, mType };
	}

	public static final void pattern_LinkDefinitionToClass_0_6_registerobjectstomatch_expressionBBBB(
			LinkDefinitionToClass _this, Match match, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mType);

	}

	public static final boolean pattern_LinkDefinitionToClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToClass_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("mType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mDefinitionToTDefinition");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpTDefinition = _localVariable_4;
		EObject tmpMDefinitionToTDefinition = _localVariable_5;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpTDefinition instanceof TMember) {
							TMember tDefinition = (TMember) tmpTDefinition;
							if (tmpMDefinitionToTDefinition instanceof MDefinitionToTMember) {
								MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) tmpMDefinitionToTDefinition;
								return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition,
										mDefinitionToTDefinition, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_1_1_performtransformation_blackBBBBBBFBB(
			MDefinition mDefinition, AbstractTypeDeclaration mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToClass_1_1_performtransformation_binding = pattern_LinkDefinitionToClass_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToClass_1_1_performtransformation_binding != null) {
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToClass_1_1_performtransformation_binding[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkDefinitionToClass_1_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_LinkDefinitionToClass_1_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_LinkDefinitionToClass_1_1_performtransformation_binding[3];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToClass_1_1_performtransformation_binding[4];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result_pattern_LinkDefinitionToClass_1_1_performtransformation_binding[5];

			Object[] result_pattern_LinkDefinitionToClass_1_1_performtransformation_black = pattern_LinkDefinitionToClass_1_1_performtransformation_blackBBBBBBFBB(
					mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition, _this,
					isApplicableMatch);
			if (result_pattern_LinkDefinitionToClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToClass_1_1_performtransformation_black[6];

				return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_1_1_performtransformation_greenBB(TAbstractType tType,
			TMember tDefinition) {
		tDefinition.setDefinedBy(tType);
		return new Object[] { tType, tDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToClass_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToClass_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinition, EObject mType, EObject tType, EObject mTypeToTType,
			EObject tDefinition, EObject mDefinitionToTDefinition) {
		if (!mDefinition.equals(mType)) {
			if (!mDefinition.equals(tType)) {
				if (!mDefinition.equals(mTypeToTType)) {
					if (!mDefinition.equals(tDefinition)) {
						if (!mDefinition.equals(mDefinitionToTDefinition)) {
							if (!mType.equals(tType)) {
								if (!mType.equals(mTypeToTType)) {
									if (!mType.equals(tDefinition)) {
										if (!mTypeToTType.equals(tType)) {
											if (!mTypeToTType.equals(tDefinition)) {
												if (!tDefinition.equals(tType)) {
													if (!mDefinitionToTDefinition.equals(mType)) {
														if (!mDefinitionToTDefinition.equals(tType)) {
															if (!mDefinitionToTDefinition.equals(mTypeToTType)) {
																if (!mDefinitionToTDefinition.equals(tDefinition)) {
																	return new Object[] { ruleresult, mDefinition,
																			mType, tType, mTypeToTType, tDefinition,
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
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mDefinition, EObject mType, EObject tType, EObject tDefinition) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToClass";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tDefinition____defines_name_prime = "defines";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		ruleresult.getCreatedEdges().add(tDefinition__tType____definedBy);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tType__tDefinition____defines);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		return new Object[] { ruleresult, mDefinition, mType, tType, tDefinition,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration,
				tDefinition__tType____definedBy, tType__tDefinition____defines };
	}

	public static final void pattern_LinkDefinitionToClass_1_5_registerobjects_expressionBBBBBBBB(
			LinkDefinitionToClass _this, PerformRuleResult ruleresult, EObject mDefinition, EObject mType,
			EObject tType, EObject mTypeToTType, EObject tDefinition, EObject mDefinitionToTDefinition) {
		_this.registerObjects_FWD(ruleresult, mDefinition, mType, tType, mTypeToTType, tDefinition,
				mDefinitionToTDefinition);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToClass_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_1_preparereturnvalue_bindingFB(
			LinkDefinitionToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToClass _this) {
		Object[] result_pattern_LinkDefinitionToClass_2_1_preparereturnvalue_binding = pattern_LinkDefinitionToClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_2_1_preparereturnvalue_black = pattern_LinkDefinitionToClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LinkDefinitionToClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				return new Object[] { mDefinition, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToClass_2_2_corematch_blackBBFFFFB(
			MDefinition mDefinition, AbstractTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tType = mTypeToTType.getTarget();
			if (tType != null) {
				for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
					TMember tDefinition = mDefinitionToTDefinition.getTarget();
					if (tDefinition != null) {
						_result.add(new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition,
								mDefinitionToTDefinition, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToClass_2_3_findcontext_blackBBBBBB(
			MDefinition mDefinition, AbstractTypeDeclaration mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.getBodyDeclarations().contains(mDefinition)) {
			if (mType.equals(mTypeToTType.getSource())) {
				if (tType.equals(mTypeToTType.getTarget())) {
					if (mDefinition.equals(mDefinitionToTDefinition.getSource())) {
						if (tDefinition.equals(mDefinitionToTDefinition.getTarget())) {
							_result.add(new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition,
									mDefinitionToTDefinition });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_3_findcontext_greenBBBBBBFFFFFFF(
			MDefinition mDefinition, AbstractTypeDeclaration mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String mDefinitionToTDefinition__mDefinition____source_name_prime = "source";
		String mDefinitionToTDefinition__tDefinition____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mDefinition__mType____abstractTypeDeclaration);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mDefinitionToTDefinition__mDefinition____source.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition__mDefinition____source);
		mDefinitionToTDefinition__tDefinition____target.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition__tDefinition____target);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mDefinitionToTDefinition__mDefinition____source
				.setName(mDefinitionToTDefinition__mDefinition____source_name_prime);
		mDefinitionToTDefinition__tDefinition____target
				.setName(mDefinitionToTDefinition__tDefinition____target_name_prime);
		return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition,
				isApplicableMatch, mType__mDefinition____bodyDeclarations,
				mDefinition__mType____abstractTypeDeclaration, mTypeToTType__mType____source,
				mTypeToTType__tType____target, mDefinitionToTDefinition__mDefinition____source,
				mDefinitionToTDefinition__tDefinition____target };
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_4_solveCSP_bindingFBBBBBBBB(
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mDefinition, mType, tType,
				mTypeToTType, tDefinition, mDefinitionToTDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType, tDefinition,
					mDefinitionToTDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition) {
		Object[] result_pattern_LinkDefinitionToClass_2_4_solveCSP_binding = pattern_LinkDefinitionToClass_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType, tDefinition,
				mDefinitionToTDefinition);
		if (result_pattern_LinkDefinitionToClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_2_4_solveCSP_black = pattern_LinkDefinitionToClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType,
						tDefinition, mDefinitionToTDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToClass_2_5_checkCSP_expressionFBB(LinkDefinitionToClass _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_10_1_initialbindings_blackBBBB(
			LinkDefinitionToClass _this, Match match, TAbstractType tType, TMember tDefinition) {
		return new Object[] { _this, match, tType, tDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToClass_10_2_SolveCSP_bindingFBBBB(LinkDefinitionToClass _this,
			Match match, TAbstractType tType, TMember tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToClass_10_2_SolveCSP_bindingAndBlackFBBBB(
			LinkDefinitionToClass _this, Match match, TAbstractType tType, TMember tDefinition) {
		Object[] result_pattern_LinkDefinitionToClass_10_2_SolveCSP_binding = pattern_LinkDefinitionToClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, tType, tDefinition);
		if (result_pattern_LinkDefinitionToClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_10_2_SolveCSP_black = pattern_LinkDefinitionToClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToClass_10_3_CheckCSP_expressionFBB(LinkDefinitionToClass _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_10_4_collectelementstobetranslated_blackBBB(Match match,
			TAbstractType tType, TMember tDefinition) {
		return new Object[] { match, tType, tDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToClass_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TAbstractType tType, TMember tDefinition) {
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tDefinition____defines_name_prime = "defines";
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		match.getToBeTranslatedEdges().add(tDefinition__tType____definedBy);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		return new Object[] { match, tType, tDefinition, tDefinition__tType____definedBy,
				tType__tDefinition____defines };
	}

	public static final Object[] pattern_LinkDefinitionToClass_10_5_collectcontextelements_blackBBB(Match match,
			TAbstractType tType, TMember tDefinition) {
		return new Object[] { match, tType, tDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToClass_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TMember tDefinition) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tDefinition);
		return new Object[] { match, tType, tDefinition };
	}

	public static final void pattern_LinkDefinitionToClass_10_6_registerobjectstomatch_expressionBBBB(
			LinkDefinitionToClass _this, Match match, TAbstractType tType, TMember tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tType, tDefinition);

	}

	public static final boolean pattern_LinkDefinitionToClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToClass_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("mType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mDefinitionToTDefinition");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpTDefinition = _localVariable_4;
		EObject tmpMDefinitionToTDefinition = _localVariable_5;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpTDefinition instanceof TMember) {
							TMember tDefinition = (TMember) tmpTDefinition;
							if (tmpMDefinitionToTDefinition instanceof MDefinitionToTMember) {
								MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) tmpMDefinitionToTDefinition;
								return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition,
										mDefinitionToTDefinition, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_11_1_performtransformation_blackBBBBBBFBB(
			MDefinition mDefinition, AbstractTypeDeclaration mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition,
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToClass_11_1_performtransformation_binding = pattern_LinkDefinitionToClass_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToClass_11_1_performtransformation_binding != null) {
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToClass_11_1_performtransformation_binding[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkDefinitionToClass_11_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_LinkDefinitionToClass_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_LinkDefinitionToClass_11_1_performtransformation_binding[3];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToClass_11_1_performtransformation_binding[4];
			MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) result_pattern_LinkDefinitionToClass_11_1_performtransformation_binding[5];

			Object[] result_pattern_LinkDefinitionToClass_11_1_performtransformation_black = pattern_LinkDefinitionToClass_11_1_performtransformation_blackBBBBBBFBB(
					mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition, _this,
					isApplicableMatch);
			if (result_pattern_LinkDefinitionToClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToClass_11_1_performtransformation_black[6];

				return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_11_1_performtransformation_greenBB(
			MDefinition mDefinition, AbstractTypeDeclaration mType) {
		mType.getBodyDeclarations().add(mDefinition);
		return new Object[] { mDefinition, mType };
	}

	public static final Object[] pattern_LinkDefinitionToClass_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToClass_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinition, EObject mType, EObject tType, EObject mTypeToTType,
			EObject tDefinition, EObject mDefinitionToTDefinition) {
		if (!mDefinition.equals(mType)) {
			if (!mDefinition.equals(tType)) {
				if (!mDefinition.equals(mTypeToTType)) {
					if (!mDefinition.equals(tDefinition)) {
						if (!mDefinition.equals(mDefinitionToTDefinition)) {
							if (!mType.equals(tType)) {
								if (!mType.equals(mTypeToTType)) {
									if (!mType.equals(tDefinition)) {
										if (!mTypeToTType.equals(tType)) {
											if (!mTypeToTType.equals(tDefinition)) {
												if (!tDefinition.equals(tType)) {
													if (!mDefinitionToTDefinition.equals(mType)) {
														if (!mDefinitionToTDefinition.equals(tType)) {
															if (!mDefinitionToTDefinition.equals(mTypeToTType)) {
																if (!mDefinitionToTDefinition.equals(tDefinition)) {
																	return new Object[] { ruleresult, mDefinition,
																			mType, tType, mTypeToTType, tDefinition,
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
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mDefinition, EObject mType, EObject tType, EObject tDefinition) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToClass";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tDefinition____defines_name_prime = "defines";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		ruleresult.getCreatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tDefinition__tType____definedBy);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tType__tDefinition____defines);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		return new Object[] { ruleresult, mDefinition, mType, tType, tDefinition,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration,
				tDefinition__tType____definedBy, tType__tDefinition____defines };
	}

	public static final void pattern_LinkDefinitionToClass_11_5_registerobjects_expressionBBBBBBBB(
			LinkDefinitionToClass _this, PerformRuleResult ruleresult, EObject mDefinition, EObject mType,
			EObject tType, EObject mTypeToTType, EObject tDefinition, EObject mDefinitionToTDefinition) {
		_this.registerObjects_BWD(ruleresult, mDefinition, mType, tType, mTypeToTType, tDefinition,
				mDefinitionToTDefinition);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToClass_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_1_preparereturnvalue_bindingFB(
			LinkDefinitionToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToClass _this) {
		Object[] result_pattern_LinkDefinitionToClass_12_1_preparereturnvalue_binding = pattern_LinkDefinitionToClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_12_1_preparereturnvalue_black = pattern_LinkDefinitionToClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LinkDefinitionToClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tDefinition");
		EObject tmpTType = _localVariable_0;
		EObject tmpTDefinition = _localVariable_1;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				return new Object[] { tType, tDefinition, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToClass_12_2_corematch_blackFFBFBFB(
			TAbstractType tType, TMember tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
			Type tmpMType = mTypeToTType.getSource();
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
					MDefinition mDefinition = mDefinitionToTDefinition.getSource();
					if (mDefinition != null) {
						_result.add(new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition,
								mDefinitionToTDefinition, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToClass_12_3_findcontext_blackBBBBBB(
			MDefinition mDefinition, AbstractTypeDeclaration mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.equals(tDefinition.getDefinedBy())) {
			if (mType.equals(mTypeToTType.getSource())) {
				if (tType.equals(mTypeToTType.getTarget())) {
					if (mDefinition.equals(mDefinitionToTDefinition.getSource())) {
						if (tDefinition.equals(mDefinitionToTDefinition.getTarget())) {
							_result.add(new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition,
									mDefinitionToTDefinition });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_3_findcontext_greenBBBBBBFFFFFFF(
			MDefinition mDefinition, AbstractTypeDeclaration mType, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMember tDefinition, MDefinitionToTMember mDefinitionToTDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tDefinition____defines_name_prime = "defines";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String mDefinitionToTDefinition__mDefinition____source_name_prime = "source";
		String mDefinitionToTDefinition__tDefinition____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tDefinition__tType____definedBy);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tType__tDefinition____defines);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mDefinitionToTDefinition__mDefinition____source.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition__mDefinition____source);
		mDefinitionToTDefinition__tDefinition____target.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition__tDefinition____target);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mDefinitionToTDefinition__mDefinition____source
				.setName(mDefinitionToTDefinition__mDefinition____source_name_prime);
		mDefinitionToTDefinition__tDefinition____target
				.setName(mDefinitionToTDefinition__tDefinition____target_name_prime);
		return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition,
				isApplicableMatch, tDefinition__tType____definedBy, tType__tDefinition____defines,
				mTypeToTType__mType____source, mTypeToTType__tType____target,
				mDefinitionToTDefinition__mDefinition____source, mDefinitionToTDefinition__tDefinition____target };
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_4_solveCSP_bindingFBBBBBBBB(
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mDefinition, mType, tType,
				mTypeToTType, tDefinition, mDefinitionToTDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType, tDefinition,
					mDefinitionToTDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition) {
		Object[] result_pattern_LinkDefinitionToClass_12_4_solveCSP_binding = pattern_LinkDefinitionToClass_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType, tDefinition,
				mDefinitionToTDefinition);
		if (result_pattern_LinkDefinitionToClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_12_4_solveCSP_black = pattern_LinkDefinitionToClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType,
						tDefinition, mDefinitionToTDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToClass_12_5_checkCSP_expressionFBB(LinkDefinitionToClass _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_20_1_preparereturnvalue_bindingFB(
			LinkDefinitionToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToClass _this) {
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

	public static final Object[] pattern_LinkDefinitionToClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToClass _this) {
		Object[] result_pattern_LinkDefinitionToClass_20_1_preparereturnvalue_binding = pattern_LinkDefinitionToClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_20_1_preparereturnvalue_black = pattern_LinkDefinitionToClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToClass_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMType = _edge_bodyDeclarations.getSrc();
		if (tmpMType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
			EObject tmpMDefinition = _edge_bodyDeclarations.getTrg();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (mType.getBodyDeclarations().contains(mDefinition)) {
					_result.add(new Object[] { mDefinition, mType, _edge_bodyDeclarations });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			LinkDefinitionToClass _this, Match match, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToClass_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_21_1_preparereturnvalue_bindingFB(
			LinkDefinitionToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToClass _this) {
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

	public static final Object[] pattern_LinkDefinitionToClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToClass _this) {
		Object[] result_pattern_LinkDefinitionToClass_21_1_preparereturnvalue_binding = pattern_LinkDefinitionToClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_21_1_preparereturnvalue_black = pattern_LinkDefinitionToClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToClass_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_definedBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTDefinition = _edge_definedBy.getSrc();
		if (tmpTDefinition instanceof TMember) {
			TMember tDefinition = (TMember) tmpTDefinition;
			EObject tmpTType = _edge_definedBy.getTrg();
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tType.equals(tDefinition.getDefinedBy())) {
					_result.add(new Object[] { tType, tDefinition, _edge_definedBy });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			LinkDefinitionToClass _this, Match match, TAbstractType tType, TMember tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToClass_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_1_prepare_blackB(LinkDefinitionToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_2_matchcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_1 = sourceMatch.getObject("mType");
		EObject _localVariable_2 = targetMatch.getObject("tType");
		EObject _localVariable_3 = targetMatch.getObject("tDefinition");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpTDefinition instanceof TMember) {
						TMember tDefinition = (TMember) tmpTDefinition;
						return new Object[] { mDefinition, mType, tType, tDefinition, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToClass_24_2_matchcontext_blackBBBFBFBB(
			MDefinition mDefinition, AbstractTypeDeclaration mType, TAbstractType tType, TMember tDefinition,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (mType.getBodyDeclarations().contains(mDefinition)) {
				if (tType.equals(tDefinition.getDefinedBy())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
						if (tType.equals(mTypeToTType.getTarget())) {
							for (MDefinitionToTMember mDefinitionToTDefinition : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
								if (tDefinition.equals(mDefinitionToTDefinition.getTarget())) {
									_result.add(new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition,
											mDefinitionToTDefinition, sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_2_matchcontext_greenBBBBBBBFB(MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToClass";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTDefinition);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition,
				sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_3_checkcsp_bindingFBBBBBBBBBB(
			LinkDefinitionToClass _this, CCMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mDefinition, mType, tType,
				mTypeToTType, tDefinition, mDefinitionToTDefinition, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType, tDefinition,
					mDefinitionToTDefinition, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(
			LinkDefinitionToClass _this, CCMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToClass_24_3_checkcsp_binding = pattern_LinkDefinitionToClass_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType, tDefinition,
				mDefinitionToTDefinition, sourceMatch, targetMatch);
		if (result_pattern_LinkDefinitionToClass_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToClass_24_3_checkcsp_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_24_3_checkcsp_black = pattern_LinkDefinitionToClass_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_LinkDefinitionToClass_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType,
						tDefinition, mDefinitionToTDefinition, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_4_createcorrespondence_blackBBBBB(
			MDefinition mDefinition, AbstractTypeDeclaration mType, TAbstractType tType, TMember tDefinition,
			CCMatch isApplicableMatch) {
		return new Object[] { mDefinition, mType, tType, tDefinition, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToClass_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToClass_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_27_1_matchtggpattern_blackBB(MDefinition mDefinition,
			AbstractTypeDeclaration mType) {
		if (mType.getBodyDeclarations().contains(mDefinition)) {
			return new Object[] { mDefinition, mType };
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToClass_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_28_1_matchtggpattern_blackBB(TAbstractType tType,
			TMember tDefinition) {
		if (tType.equals(tDefinition.getDefinedBy())) {
			return new Object[] { tType, tDefinition };
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToClass_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_1_createresult_blackB(LinkDefinitionToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTDefinition) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTDefinition)) {
			return new Object[] { ruleResult, mDefinitionToTDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMember tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToClass_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mDefinitionToTDefinitionList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mDefinitionToTDefinitionList.equals(mTypeToTTypeList)) {
					for (EObject tmpMDefinitionToTDefinition : mDefinitionToTDefinitionList.getEntryObjects()) {
						if (tmpMDefinitionToTDefinition instanceof MDefinitionToTMember) {
							MDefinitionToTMember mDefinitionToTDefinition = (MDefinitionToTMember) tmpMDefinitionToTDefinition;
							MDefinition mDefinition = mDefinitionToTDefinition.getSource();
							if (mDefinition != null) {
								TMember tDefinition = mDefinitionToTDefinition.getTarget();
								if (tDefinition != null) {
									if (pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mDefinitionToTDefinition) == null) {
										if (pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, mDefinition) == null) {
											if (pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tDefinition) == null) {
												for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
													if (tmpMTypeToTType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
														Type tmpMType = mTypeToTType.getSource();
														if (tmpMType instanceof AbstractTypeDeclaration) {
															AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
															TAbstractType tType = mTypeToTType.getTarget();
															if (tType != null) {
																if (pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mTypeToTType) == null) {
																	if (pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, mType) == null) {
																		if (pattern_LinkDefinitionToClass_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, tType) == null) {
																			_result.add(new Object[] {
																					mDefinitionToTDefinitionList,
																					mDefinition,
																					mDefinitionToTDefinition,
																					tDefinition, mTypeToTTypeList,
																					mType, mTypeToTType, tType,
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

	public static final Object[] pattern_LinkDefinitionToClass_29_3_solveCSP_bindingFBBBBBBBBB(
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mDefinition, mType, tType,
				mTypeToTType, tDefinition, mDefinitionToTDefinition, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType, tDefinition,
					mDefinitionToTDefinition, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			LinkDefinitionToClass _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LinkDefinitionToClass_29_3_solveCSP_binding = pattern_LinkDefinitionToClass_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType, tDefinition,
				mDefinitionToTDefinition, ruleResult);
		if (result_pattern_LinkDefinitionToClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToClass_29_3_solveCSP_black = pattern_LinkDefinitionToClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, mType, tType, mTypeToTType,
						tDefinition, mDefinitionToTDefinition, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToClass_29_4_checkCSP_expressionFBB(LinkDefinitionToClass _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_5_checknacs_blackBBBBBB(MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition) {
		return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_6_perform_blackBBBBBBB(MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TypeToTAbstractType mTypeToTType, TMember tDefinition,
			MDefinitionToTMember mDefinitionToTDefinition, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mDefinition, mType, tType, mTypeToTType, tDefinition, mDefinitionToTDefinition,
				ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToClass_29_6_perform_greenBBBBB(MDefinition mDefinition,
			AbstractTypeDeclaration mType, TAbstractType tType, TMember tDefinition,
			ModelgeneratorRuleResult ruleResult) {
		mType.getBodyDeclarations().add(mDefinition);
		tDefinition.setDefinedBy(tType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mDefinition, mType, tType, tDefinition, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LinkDefinitionToClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkDefinitionToClassImpl
