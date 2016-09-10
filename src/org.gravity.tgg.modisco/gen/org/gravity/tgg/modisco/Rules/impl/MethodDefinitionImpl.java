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

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodSignature;

import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.MDefinitionToTMember;
import org.gravity.tgg.modisco.MDefinitionToTSignature;
import org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature;
import org.gravity.tgg.modisco.MethodDeclarationToTMethod;
import org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition;
import org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.MethodDefinition;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
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
 * An implementation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionImpl extends AbstractRuleImpl implements MethodDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		// initial bindings
		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_0_1_initialbindings_blackBBBB(this,
				match, mSignature, eMethodDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
					+ "[eMethodDeclaration] = " + eMethodDeclaration + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mSignature,
						eMethodDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
					+ "[eMethodDeclaration] = " + eMethodDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodDefinitionImpl.pattern_MethodDefinition_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodDefinitionImpl
					.pattern_MethodDefinition_0_4_collectelementstobetranslated_blackBBB(match, mSignature,
							eMethodDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
						+ "[eMethodDeclaration] = " + eMethodDeclaration + ".");
			}
			MethodDefinitionImpl.pattern_MethodDefinition_0_4_collectelementstobetranslated_greenBBBFF(match,
					mSignature, eMethodDeclaration);
			// EMoflonEdge mSignature__eMethodDeclaration____mMethodDefinitions = (EMoflonEdge) result4_green[3];
			// EMoflonEdge eMethodDeclaration__mSignature____mMethodSignature = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = MethodDefinitionImpl.pattern_MethodDefinition_0_5_collectcontextelements_blackBBB(
					match, mSignature, eMethodDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
						+ "[eMethodDeclaration] = " + eMethodDeclaration + ".");
			}
			MethodDefinitionImpl.pattern_MethodDefinition_0_5_collectcontextelements_greenBB(match, mSignature);

			// register objects to match
			MethodDefinitionImpl.pattern_MethodDefinition_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mSignature, eMethodDeclaration);
			return MethodDefinitionImpl.pattern_MethodDefinition_0_7_expressionF();
		} else {
			return MethodDefinitionImpl.pattern_MethodDefinition_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[0];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[1];
		MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result1_bindingAndBlack[2];
		TMethod tMethod = (TMethod) result1_bindingAndBlack[3];
		MMethodDefinition eMethodDeclaration = (MMethodDefinition) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = MethodDefinitionImpl
				.pattern_MethodDefinition_1_1_performtransformation_greenFBFFBBFFFFB(tMethodSignature, tMethod,
						eMethodDeclaration, csp);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[0];
		MethodDeclarationToTMethodDefinition mDeclarationToTDefinition = (MethodDeclarationToTMethodDefinition) result1_green[2];
		MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature = (MethodDeclarationToTMethodSignature) result1_green[3];
		MethodDeclarationToTMethod eMethodDeclarationToTMethod = (MethodDeclarationToTMethod) result1_green[6];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_green[7];
		MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) result1_green[8];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[9];

		// collect translated elements
		Object[] result2_black = MethodDefinitionImpl
				.pattern_MethodDefinition_1_2_collecttranslatedelements_blackBBBBBBBB(mDefinitionToTMember,
						mDeclarationToTDefinition, eMethodDeclarationToTMethodSignature, eMethodDeclaration,
						eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDeclarationToTDefinition] = "
					+ mDeclarationToTDefinition + ", " + "[eMethodDeclarationToTMethodSignature] = "
					+ eMethodDeclarationToTMethodSignature + ", " + "[eMethodDeclaration] = " + eMethodDeclaration
					+ ", " + "[eMethodDeclarationToTMethod] = " + eMethodDeclarationToTMethod + ", "
					+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[mDefinitionToTSignature] = "
					+ mDefinitionToTSignature + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		Object[] result2_green = MethodDefinitionImpl
				.pattern_MethodDefinition_1_2_collecttranslatedelements_greenFBBBBBBBB(mDefinitionToTMember,
						mDeclarationToTDefinition, eMethodDeclarationToTMethodSignature, eMethodDeclaration,
						eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodDefinitionImpl
				.pattern_MethodDefinition_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, mDefinitionToTMember,
						tMethodSignature, mDeclarationToTDefinition, mSignature, mSignatureToTMethodSignature,
						eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
						tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mDeclarationToTDefinition] = "
					+ mDeclarationToTDefinition + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
					+ "[eMethodDeclarationToTMethodSignature] = " + eMethodDeclarationToTMethodSignature + ", "
					+ "[tMethod] = " + tMethod + ", " + "[eMethodDeclaration] = " + eMethodDeclaration + ", "
					+ "[eMethodDeclarationToTMethod] = " + eMethodDeclarationToTMethod + ", " + "[tMethodDefinition] = "
					+ tMethodDefinition + ", " + "[mDefinitionToTSignature] = " + mDefinitionToTSignature + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		MethodDefinitionImpl.pattern_MethodDefinition_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition, mSignature,
				eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		// EMoflonEdge mDefinitionToTMember__eMethodDeclaration____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mDefinitionToTMember__tMethodDefinition____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[14];
		// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[15];
		// EMoflonEdge mDeclarationToTDefinition__eMethodDeclaration____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge mDeclarationToTDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mSignature__eMethodDeclaration____mMethodDefinitions = (EMoflonEdge) result3_green[18];
		// EMoflonEdge eMethodDeclaration__mSignature____mMethodSignature = (EMoflonEdge) result3_green[19];
		// EMoflonEdge eMethodDeclarationToTMethodSignature__eMethodDeclaration____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge eMethodDeclarationToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge eMethodDeclarationToTMethod__eMethodDeclaration____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge eMethodDeclarationToTMethod__tMethod____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge mDefinitionToTSignature__eMethodDeclaration____source = (EMoflonEdge) result3_green[24];
		// EMoflonEdge mDefinitionToTSignature__tMethodSignature____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge mBodyToTAnnotation__eMethodDeclaration____source = (EMoflonEdge) result3_green[26];
		// EMoflonEdge mBodyToTAnnotation__tMethodDefinition____target = (EMoflonEdge) result3_green[27];

		// perform postprocessing story node is empty
		// register objects
		MethodDefinitionImpl.pattern_MethodDefinition_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition, mSignature,
				mSignatureToTMethodSignature, eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration,
				eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		return MethodDefinitionImpl.pattern_MethodDefinition_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionImpl
				.pattern_MethodDefinition_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodDefinitionImpl.pattern_MethodDefinition_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodSignature mSignature = (MMethodSignature) result2_binding[0];
		MMethodDefinition eMethodDeclaration = (MMethodDefinition) result2_binding[1];
		for (Object[] result2_black : MethodDefinitionImpl.pattern_MethodDefinition_2_2_corematch_blackFBFBB(mSignature,
				eMethodDeclaration, match)) {
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[0];
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : MethodDefinitionImpl.pattern_MethodDefinition_2_3_findcontext_blackBBBFB(
					tMethodSignature, mSignature, mSignatureToTMethodSignature, eMethodDeclaration)) {
				TMethod tMethod = (TMethod) result3_black[3];
				Object[] result3_green = MethodDefinitionImpl
						.pattern_MethodDefinition_2_3_findcontext_greenBBBBBFFFFFFF(tMethodSignature, mSignature,
								mSignatureToTMethodSignature, tMethod, eMethodDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mSignature__eMethodDeclaration____mMethodDefinitions = (EMoflonEdge) result3_green[8];
				// EMoflonEdge eMethodDeclaration__mSignature____mMethodSignature = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodDefinitionImpl
						.pattern_MethodDefinition_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
								eMethodDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mSignature] = " + mSignature + ", "
							+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", " + "[tMethod] = "
							+ tMethod + ", " + "[eMethodDeclaration] = " + eMethodDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodDefinitionImpl.pattern_MethodDefinition_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodDefinitionImpl
							.pattern_MethodDefinition_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mSignature,
			MMethodDefinition eMethodDeclaration) {
		match.registerObject("mSignature", mSignature);
		match.registerObject("eMethodDeclaration", eMethodDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mSignature,
			MMethodDefinition eMethodDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature,
			MMethodSignature mSignature, MMethodSignatureToTMethodSignature mSignatureToTMethodSignature,
			TMethod tMethod, MMethodDefinition eMethodDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tMethodDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tMethodDefinition.ID", csp);
		var_tMethodDefinition_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tMethodDefinition_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("eMethodDeclaration", eMethodDeclaration);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mDefinitionToTMember,
			EObject tMethodSignature, EObject mDeclarationToTDefinition, EObject mSignature,
			EObject mSignatureToTMethodSignature, EObject eMethodDeclarationToTMethodSignature, EObject tMethod,
			EObject eMethodDeclaration, EObject eMethodDeclarationToTMethod, EObject tMethodDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("mDeclarationToTDefinition", mDeclarationToTDefinition);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("eMethodDeclarationToTMethodSignature", eMethodDeclarationToTMethodSignature);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("eMethodDeclaration", eMethodDeclaration);
		ruleresult.registerObject("eMethodDeclarationToTMethod", eMethodDeclarationToTMethod);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("mDefinitionToTSignature", mDefinitionToTSignature);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eMethodDeclaration").eClass())
				.equals("modisco.MMethodDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMethodSignature tMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		// initial bindings
		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_10_1_initialbindings_blackBBBBB(this,
				match, tMethodSignature, tMethod, tMethodDefinition);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
							+ "[tMethod] = " + tMethod + ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tMethodSignature, tMethod,
						tMethodDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[tMethod] = " + tMethod + ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodDefinitionImpl.pattern_MethodDefinition_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodDefinitionImpl
					.pattern_MethodDefinition_10_4_collectelementstobetranslated_blackBBBB(match, tMethodSignature,
							tMethod, tMethodDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tMethodSignature] = " + tMethodSignature
						+ ", " + "[tMethod] = " + tMethod + ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
			}
			MethodDefinitionImpl.pattern_MethodDefinition_10_4_collectelementstobetranslated_greenBBBFF(match,
					tMethodSignature, tMethodDefinition);
			// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = MethodDefinitionImpl
					.pattern_MethodDefinition_10_5_collectcontextelements_blackBBBB(match, tMethodSignature, tMethod,
							tMethodDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tMethodSignature] = " + tMethodSignature
						+ ", " + "[tMethod] = " + tMethod + ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
			}
			MethodDefinitionImpl.pattern_MethodDefinition_10_5_collectcontextelements_greenBBBFF(match,
					tMethodSignature, tMethod);
			// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result5_green[3];
			// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result5_green[4];

			// register objects to match
			MethodDefinitionImpl.pattern_MethodDefinition_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tMethodSignature, tMethod, tMethodDefinition);
			return MethodDefinitionImpl.pattern_MethodDefinition_10_7_expressionF();
		} else {
			return MethodDefinitionImpl.pattern_MethodDefinition_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[0];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[1];
		MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result1_bindingAndBlack[2];
		TMethod tMethod = (TMethod) result1_bindingAndBlack[3];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[4];
		// CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = MethodDefinitionImpl
				.pattern_MethodDefinition_11_1_performtransformation_greenFBFBFBFFBFF(tMethodSignature, mSignature,
						tMethod, tMethodDefinition);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[0];
		MethodDeclarationToTMethodDefinition mDeclarationToTDefinition = (MethodDeclarationToTMethodDefinition) result1_green[2];
		MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature = (MethodDeclarationToTMethodSignature) result1_green[4];
		MMethodDefinition eMethodDeclaration = (MMethodDefinition) result1_green[6];
		MethodDeclarationToTMethod eMethodDeclarationToTMethod = (MethodDeclarationToTMethod) result1_green[7];
		MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) result1_green[9];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[10];

		// collect translated elements
		Object[] result2_black = MethodDefinitionImpl
				.pattern_MethodDefinition_11_2_collecttranslatedelements_blackBBBBBBBB(mDefinitionToTMember,
						mDeclarationToTDefinition, eMethodDeclarationToTMethodSignature, eMethodDeclaration,
						eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDeclarationToTDefinition] = "
					+ mDeclarationToTDefinition + ", " + "[eMethodDeclarationToTMethodSignature] = "
					+ eMethodDeclarationToTMethodSignature + ", " + "[eMethodDeclaration] = " + eMethodDeclaration
					+ ", " + "[eMethodDeclarationToTMethod] = " + eMethodDeclarationToTMethod + ", "
					+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[mDefinitionToTSignature] = "
					+ mDefinitionToTSignature + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		Object[] result2_green = MethodDefinitionImpl
				.pattern_MethodDefinition_11_2_collecttranslatedelements_greenFBBBBBBBB(mDefinitionToTMember,
						mDeclarationToTDefinition, eMethodDeclarationToTMethodSignature, eMethodDeclaration,
						eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodDefinitionImpl
				.pattern_MethodDefinition_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, mDefinitionToTMember,
						tMethodSignature, mDeclarationToTDefinition, mSignature, mSignatureToTMethodSignature,
						eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
						tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mDeclarationToTDefinition] = "
					+ mDeclarationToTDefinition + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
					+ "[eMethodDeclarationToTMethodSignature] = " + eMethodDeclarationToTMethodSignature + ", "
					+ "[tMethod] = " + tMethod + ", " + "[eMethodDeclaration] = " + eMethodDeclaration + ", "
					+ "[eMethodDeclarationToTMethod] = " + eMethodDeclarationToTMethod + ", " + "[tMethodDefinition] = "
					+ tMethodDefinition + ", " + "[mDefinitionToTSignature] = " + mDefinitionToTSignature + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		MethodDefinitionImpl.pattern_MethodDefinition_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition, mSignature,
				eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		// EMoflonEdge mDefinitionToTMember__eMethodDeclaration____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mDefinitionToTMember__tMethodDefinition____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[14];
		// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[15];
		// EMoflonEdge mDeclarationToTDefinition__eMethodDeclaration____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge mDeclarationToTDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mSignature__eMethodDeclaration____mMethodDefinitions = (EMoflonEdge) result3_green[18];
		// EMoflonEdge eMethodDeclaration__mSignature____mMethodSignature = (EMoflonEdge) result3_green[19];
		// EMoflonEdge eMethodDeclarationToTMethodSignature__eMethodDeclaration____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge eMethodDeclarationToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[21];
		// EMoflonEdge eMethodDeclarationToTMethod__eMethodDeclaration____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge eMethodDeclarationToTMethod__tMethod____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge mDefinitionToTSignature__eMethodDeclaration____source = (EMoflonEdge) result3_green[24];
		// EMoflonEdge mDefinitionToTSignature__tMethodSignature____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge mBodyToTAnnotation__eMethodDeclaration____source = (EMoflonEdge) result3_green[26];
		// EMoflonEdge mBodyToTAnnotation__tMethodDefinition____target = (EMoflonEdge) result3_green[27];

		// perform postprocessing story node is empty
		// register objects
		MethodDefinitionImpl.pattern_MethodDefinition_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition, mSignature,
				mSignatureToTMethodSignature, eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration,
				eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		return MethodDefinitionImpl.pattern_MethodDefinition_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionImpl
				.pattern_MethodDefinition_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodDefinitionImpl.pattern_MethodDefinition_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[0];
		TMethod tMethod = (TMethod) result2_binding[1];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[2];
		for (Object[] result2_black : MethodDefinitionImpl.pattern_MethodDefinition_12_2_corematch_blackBFFBBB(
				tMethodSignature, tMethod, tMethodDefinition, match)) {
			MMethodSignature mSignature = (MMethodSignature) result2_black[1];
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : MethodDefinitionImpl.pattern_MethodDefinition_12_3_findcontext_blackBBBBB(
					tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, tMethodDefinition)) {
				Object[] result3_green = MethodDefinitionImpl
						.pattern_MethodDefinition_12_3_findcontext_greenBBBBBFFFFFFF(tMethodSignature, mSignature,
								mSignatureToTMethodSignature, tMethod, tMethodDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge tMethodSignature__tMethod____method = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tMethod__tMethodSignature____signatures = (EMoflonEdge) result3_green[7];
				// EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodDefinitionImpl
						.pattern_MethodDefinition_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, tMethodDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mSignature] = " + mSignature + ", "
							+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", " + "[tMethod] = "
							+ tMethod + ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodDefinitionImpl.pattern_MethodDefinition_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodDefinitionImpl
							.pattern_MethodDefinition_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tMethod", tMethod);
		match.registerObject("tMethodDefinition", tMethodDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tMethodDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tMethodDefinition.ID", true,
				csp);
		var_tMethodDefinition_ID.setValue(tMethodDefinition.getID());
		var_tMethodDefinition_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tMethodDefinition_ID);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature,
			MMethodSignature mSignature, MMethodSignatureToTMethodSignature mSignatureToTMethodSignature,
			TMethod tMethod, TMethodDefinition tMethodDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("tMethodDefinition", tMethodDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mDefinitionToTMember,
			EObject tMethodSignature, EObject mDeclarationToTDefinition, EObject mSignature,
			EObject mSignatureToTMethodSignature, EObject eMethodDeclarationToTMethodSignature, EObject tMethod,
			EObject eMethodDeclaration, EObject eMethodDeclarationToTMethod, EObject tMethodDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("mDeclarationToTDefinition", mDeclarationToTDefinition);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("eMethodDeclarationToTMethodSignature", eMethodDeclarationToTMethodSignature);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("eMethodDeclaration", eMethodDeclaration);
		ruleresult.registerObject("eMethodDeclarationToTMethod", eMethodDeclarationToTMethod);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("mDefinitionToTSignature", mDefinitionToTSignature);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tMethodDefinition").eClass())
				.equals("basic.TMethodDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_37(EMoflonEdge _edge_mMethodDefinitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodDefinitionImpl
				.pattern_MethodDefinition_20_2_testcorematchandDECs_blackFFB(_edge_mMethodDefinitions)) {
			MMethodSignature mSignature = (MMethodSignature) result2_black[0];
			MMethodDefinition eMethodDeclaration = (MMethodDefinition) result2_black[1];
			Object[] result2_green = MethodDefinitionImpl
					.pattern_MethodDefinition_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodDefinitionImpl
					.pattern_MethodDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mSignature, eMethodDeclaration)) {
				// Ensure that the correct types of elements are matched
				if (MethodDefinitionImpl
						.pattern_MethodDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodDefinitionImpl
							.pattern_MethodDefinition_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_34(EMoflonEdge _edge_definitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodDefinitionImpl
				.pattern_MethodDefinition_21_2_testcorematchandDECs_blackFFFB(_edge_definitions)) {
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[0];
			TMethod tMethod = (TMethod) result2_black[1];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[2];
			Object[] result2_green = MethodDefinitionImpl
					.pattern_MethodDefinition_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodDefinitionImpl
					.pattern_MethodDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tMethodSignature, tMethod, tMethodDefinition)) {
				// Ensure that the correct types of elements are matched
				if (MethodDefinitionImpl
						.pattern_MethodDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodDefinitionImpl
							.pattern_MethodDefinition_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tMethodDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tMethodDefinition", true, csp);
		var_tMethodDefinition_ID.setValue(__helper.getValue("tMethodDefinition", "ID"));
		var_tMethodDefinition_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		createID0.setRuleName("MethodDefinition");
		createID0.solve(var_tMethodDefinition_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tMethodDefinition_ID.setBound(false);
			createID0.solve(var_tMethodDefinition_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tMethodDefinition", "ID", var_tMethodDefinition_ID.getValue());
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
		ruleResult.setRule("MethodDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tMethodDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tMethodDefinition", true, csp);
		var_tMethodDefinition_ID.setValue(__helper.getValue("tMethodDefinition", "ID"));
		var_tMethodDefinition_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		createID0.setRuleName("MethodDefinition");
		createID0.solve(var_tMethodDefinition_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			createID0.solve(var_tMethodDefinition_ID);
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
		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = MethodDefinitionImpl
				.pattern_MethodDefinition_24_2_matchcontext_bindingFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[0];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[1];
		TMethod tMethod = (TMethod) result2_binding[2];
		MMethodDefinition eMethodDeclaration = (MMethodDefinition) result2_binding[3];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[4];
		for (Object[] result2_black : MethodDefinitionImpl.pattern_MethodDefinition_24_2_matchcontext_blackBBFBBBBB(
				tMethodSignature, mSignature, tMethod, eMethodDeclaration, tMethodDefinition, sourceMatch,
				targetMatch)) {
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result2_black[2];
			Object[] result2_green = MethodDefinitionImpl.pattern_MethodDefinition_24_2_matchcontext_greenBBBBBBBFB(
					tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, eMethodDeclaration,
					tMethodDefinition, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = MethodDefinitionImpl
					.pattern_MethodDefinition_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, eMethodDeclaration,
							tMethodDefinition, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = MethodDefinitionImpl
						.pattern_MethodDefinition_24_4_createcorrespondence_blackBBBBBB(tMethodSignature, mSignature,
								tMethod, eMethodDeclaration, tMethodDefinition, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tMethodSignature] = " + tMethodSignature + ", " + "[mSignature] = "
							+ mSignature + ", " + "[tMethod] = " + tMethod + ", " + "[eMethodDeclaration] = "
							+ eMethodDeclaration + ", " + "[tMethodDefinition] = " + tMethodDefinition + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodDefinitionImpl.pattern_MethodDefinition_24_4_createcorrespondence_greenFBFFBBFBFFB(
						tMethodSignature, tMethod, eMethodDeclaration, tMethodDefinition, isApplicableMatch);
				// MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result4_green[0];
				// MethodDeclarationToTMethodDefinition mDeclarationToTDefinition = (MethodDeclarationToTMethodDefinition) result4_green[2];
				// MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature = (MethodDeclarationToTMethodSignature) result4_green[3];
				// MethodDeclarationToTMethod eMethodDeclarationToTMethod = (MethodDeclarationToTMethod) result4_green[6];
				// MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) result4_green[8];
				// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result4_green[9];

				// add to returned result
				Object[] result5_black = MethodDefinitionImpl
						.pattern_MethodDefinition_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodDefinitionImpl.pattern_MethodDefinition_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TMethodSignature tMethodSignature,
			MMethodSignature mSignature, MMethodSignatureToTMethodSignature mSignatureToTMethodSignature,
			TMethod tMethod, MMethodDefinition eMethodDeclaration, TMethodDefinition tMethodDefinition,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tMethodDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tMethodDefinition.ID", true,
				csp);
		var_tMethodDefinition_ID.setValue(tMethodDefinition.getID());
		var_tMethodDefinition_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tMethodDefinition_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("eMethodDeclaration", eMethodDeclaration);
		isApplicableMatch.registerObject("tMethodDefinition", tMethodDefinition);
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
	public boolean checkDEC_FWD(MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {// match tgg pattern
		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_27_1_matchtggpattern_blackBB(mSignature,
				eMethodDeclaration);
		if (result1_black != null) {
			return MethodDefinitionImpl.pattern_MethodDefinition_27_2_expressionF();
		} else {
			return MethodDefinitionImpl.pattern_MethodDefinition_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {// match tgg pattern
		Object[] result1_black = MethodDefinitionImpl
				.pattern_MethodDefinition_28_1_matchtggpattern_blackBBB(tMethodSignature, tMethod, tMethodDefinition);
		if (result1_black != null) {
			return MethodDefinitionImpl.pattern_MethodDefinition_28_2_expressionF();
		} else {
			return MethodDefinitionImpl.pattern_MethodDefinition_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignatureParameter) {
		// create result
		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : MethodDefinitionImpl
				.pattern_MethodDefinition_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mSignatureToTMethodSignatureList = (RuleEntryList) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TMethod tMethod = (TMethod) result2_black[2];
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result2_black[3];
			MMethodSignature mSignature = (MMethodSignature) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = MethodDefinitionImpl
					.pattern_MethodDefinition_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMethodSignature] = "
						+ tMethodSignature + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", " + "[tMethod] = "
						+ tMethod + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (MethodDefinitionImpl.pattern_MethodDefinition_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = MethodDefinitionImpl.pattern_MethodDefinition_29_5_checknacs_blackBBBB(
						tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod);
				if (result5_black != null) {

					// perform
					Object[] result6_black = MethodDefinitionImpl.pattern_MethodDefinition_29_6_perform_blackBBBBB(
							tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mSignature] = " + mSignature
								+ ", " + "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
								+ "[tMethod] = " + tMethod + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_29_6_perform_greenFBFBFBFFFFFBB(tMethodSignature,
							mSignature, tMethod, ruleResult, csp);
					// MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[0];
					// MethodDeclarationToTMethodDefinition mDeclarationToTDefinition = (MethodDeclarationToTMethodDefinition) result6_green[2];
					// MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature = (MethodDeclarationToTMethodSignature) result6_green[4];
					// MMethodDefinition eMethodDeclaration = (MMethodDefinition) result6_green[6];
					// MethodDeclarationToTMethod eMethodDeclarationToTMethod = (MethodDeclarationToTMethod) result6_green[7];
					// TMethodDefinition tMethodDefinition = (TMethodDefinition) result6_green[8];
					// MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) result6_green[9];
					// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature,
			MMethodSignature mSignature, MMethodSignatureToTMethodSignature mSignatureToTMethodSignature,
			TMethod tMethod, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tMethodDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tMethodDefinition.ID", csp);
		var_tMethodDefinition_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tMethodDefinition_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethod", tMethod);
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
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_MMETHODDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_MMETHODDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodDefinition) arguments.get(2));
			return null;
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_MMETHODDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_MMETHODSIGNATURE_MMETHODSIGNATURETOTMETHODSIGNATURE_TMETHOD_MMETHODDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(MMethodSignature) arguments.get(2), (MMethodSignatureToTMethodSignature) arguments.get(3),
					(TMethod) arguments.get(4), (MMethodDefinition) arguments.get(5));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_DEFINITION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TMETHOD_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2), (TMethodDefinition) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TMETHOD_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2), (TMethodDefinition) arguments.get(3));
			return null;
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TMETHOD_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2), (TMethodDefinition) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_MMETHODSIGNATURE_MMETHODSIGNATURETOTMETHODSIGNATURE_TMETHOD_TMETHODDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(MMethodSignature) arguments.get(2), (MMethodSignatureToTMethodSignature) arguments.get(3),
					(TMethod) arguments.get(4), (TMethodDefinition) arguments.get(5));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_DEFINITION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_34__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_34((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TMETHODSIGNATURE_MMETHODSIGNATURE_MMETHODSIGNATURETOTMETHODSIGNATURE_TMETHOD_MMETHODDEFINITION_TMETHODDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(MMethodSignature) arguments.get(2), (MMethodSignatureToTMethodSignature) arguments.get(3),
					(TMethod) arguments.get(4), (MMethodDefinition) arguments.get(5),
					(TMethodDefinition) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___CHECK_DEC_FWD__MMETHODSIGNATURE_MMETHODDEFINITION:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (MMethodDefinition) arguments.get(1));
		case RulesPackage.METHOD_DEFINITION___CHECK_DEC_BWD__TMETHODSIGNATURE_TMETHOD_TMETHODDEFINITION:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TMethod) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION___GENERATE_MODEL__RULEENTRYCONTAINER_MMETHODSIGNATURETOTMETHODSIGNATURE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(MMethodSignatureToTMethodSignature) arguments.get(1));
		case RulesPackage.METHOD_DEFINITION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_MMETHODSIGNATURE_MMETHODSIGNATURETOTMETHODSIGNATURE_TMETHOD_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(MMethodSignature) arguments.get(2), (MMethodSignatureToTMethodSignature) arguments.get(3),
					(TMethod) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.METHOD_DEFINITION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodDefinition_0_1_initialbindings_blackBBBB(MethodDefinition _this,
			Match match, MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		return new Object[] { _this, match, mSignature, eMethodDeclaration };
	}

	public static final Object[] pattern_MethodDefinition_0_2_SolveCSP_bindingFBBBB(MethodDefinition _this, Match match,
			MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSignature, eMethodDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSignature, eMethodDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_0_2_SolveCSP_bindingAndBlackFBBBB(MethodDefinition _this,
			Match match, MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		Object[] result_pattern_MethodDefinition_0_2_SolveCSP_binding = pattern_MethodDefinition_0_2_SolveCSP_bindingFBBBB(
				_this, match, mSignature, eMethodDeclaration);
		if (result_pattern_MethodDefinition_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_0_2_SolveCSP_black = pattern_MethodDefinition_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSignature, eMethodDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_0_3_CheckCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_0_4_collectelementstobetranslated_blackBBB(Match match,
			MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		return new Object[] { match, mSignature, eMethodDeclaration };
	}

	public static final Object[] pattern_MethodDefinition_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		EMoflonEdge mSignature__eMethodDeclaration____mMethodDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__mSignature____mMethodSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eMethodDeclaration);
		String mSignature__eMethodDeclaration____mMethodDefinitions_name_prime = "mMethodDefinitions";
		String eMethodDeclaration__mSignature____mMethodSignature_name_prime = "mMethodSignature";
		mSignature__eMethodDeclaration____mMethodDefinitions.setSrc(mSignature);
		mSignature__eMethodDeclaration____mMethodDefinitions.setTrg(eMethodDeclaration);
		match.getToBeTranslatedEdges().add(mSignature__eMethodDeclaration____mMethodDefinitions);
		eMethodDeclaration__mSignature____mMethodSignature.setSrc(eMethodDeclaration);
		eMethodDeclaration__mSignature____mMethodSignature.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(eMethodDeclaration__mSignature____mMethodSignature);
		mSignature__eMethodDeclaration____mMethodDefinitions
				.setName(mSignature__eMethodDeclaration____mMethodDefinitions_name_prime);
		eMethodDeclaration__mSignature____mMethodSignature
				.setName(eMethodDeclaration__mSignature____mMethodSignature_name_prime);
		return new Object[] { match, mSignature, eMethodDeclaration,
				mSignature__eMethodDeclaration____mMethodDefinitions,
				eMethodDeclaration__mSignature____mMethodSignature };
	}

	public static final Object[] pattern_MethodDefinition_0_5_collectcontextelements_blackBBB(Match match,
			MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		return new Object[] { match, mSignature, eMethodDeclaration };
	}

	public static final Object[] pattern_MethodDefinition_0_5_collectcontextelements_greenBB(Match match,
			MMethodSignature mSignature) {
		match.getContextNodes().add(mSignature);
		return new Object[] { match, mSignature };
	}

	public static final void pattern_MethodDefinition_0_6_registerobjectstomatch_expressionBBBB(MethodDefinition _this,
			Match match, MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		_this.registerObjectsToMatch_FWD(match, mSignature, eMethodDeclaration);

	}

	public static final boolean pattern_MethodDefinition_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_4 = isApplicableMatch.getObject("eMethodDeclaration");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		EObject tmpMSignatureToTMethodSignature = _localVariable_2;
		EObject tmpTMethod = _localVariable_3;
		EObject tmpEMethodDeclaration = _localVariable_4;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				if (tmpMSignatureToTMethodSignature instanceof MMethodSignatureToTMethodSignature) {
					MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) tmpMSignatureToTMethodSignature;
					if (tmpTMethod instanceof TMethod) {
						TMethod tMethod = (TMethod) tmpTMethod;
						if (tmpEMethodDeclaration instanceof MMethodDefinition) {
							MMethodDefinition eMethodDeclaration = (MMethodDefinition) tmpEMethodDeclaration;
							return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
									eMethodDeclaration, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_1_1_performtransformation_blackBBBBBFBB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			MMethodDefinition eMethodDeclaration, MethodDefinition _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
						eMethodDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			MethodDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinition_1_1_performtransformation_binding = pattern_MethodDefinition_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDefinition_1_1_performtransformation_binding != null) {
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinition_1_1_performtransformation_binding[0];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinition_1_1_performtransformation_binding[1];
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result_pattern_MethodDefinition_1_1_performtransformation_binding[2];
			TMethod tMethod = (TMethod) result_pattern_MethodDefinition_1_1_performtransformation_binding[3];
			MMethodDefinition eMethodDeclaration = (MMethodDefinition) result_pattern_MethodDefinition_1_1_performtransformation_binding[4];

			Object[] result_pattern_MethodDefinition_1_1_performtransformation_black = pattern_MethodDefinition_1_1_performtransformation_blackBBBBBFBB(
					tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, eMethodDeclaration, _this,
					isApplicableMatch);
			if (result_pattern_MethodDefinition_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinition_1_1_performtransformation_black[5];

				return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
						eMethodDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_1_1_performtransformation_greenFBFFBBFFFFB(
			TMethodSignature tMethodSignature, TMethod tMethod, MMethodDefinition eMethodDeclaration, CSP csp) {
		MDefinitionToTMember mDefinitionToTMember = ModiscoFactory.eINSTANCE.createMDefinitionToTMember();
		MethodDeclarationToTMethodDefinition mDeclarationToTDefinition = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethodDefinition();
		MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethodSignature();
		MethodDeclarationToTMethod eMethodDeclarationToTMethod = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethod();
		TMethodDefinition tMethodDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		MDefinitionToTSignature mDefinitionToTSignature = ModiscoFactory.eINSTANCE.createMDefinitionToTSignature();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tMethodDefinition", "ID");
		mDefinitionToTMember.setSource(eMethodDeclaration);
		mDeclarationToTDefinition.setSource(eMethodDeclaration);
		eMethodDeclarationToTMethodSignature.setSource(eMethodDeclaration);
		eMethodDeclarationToTMethodSignature.setTarget(tMethodSignature);
		eMethodDeclarationToTMethod.setSource(eMethodDeclaration);
		eMethodDeclarationToTMethod.setTarget(tMethod);
		mDefinitionToTMember.setTarget(tMethodDefinition);
		tMethodSignature.getDefinitions().add(tMethodDefinition);
		mDeclarationToTDefinition.setTarget(tMethodDefinition);
		mDefinitionToTSignature.setSource(eMethodDeclaration);
		mDefinitionToTSignature.setTarget(tMethodSignature);
		mBodyToTAnnotation.setSource(eMethodDeclaration);
		mBodyToTAnnotation.setTarget(tMethodDefinition);
		int tMethodDefinition_ID_prime = (int) _localVariable_0;
		tMethodDefinition.setID(Integer.valueOf(tMethodDefinition_ID_prime));
		return new Object[] { mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition,
				eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation, csp };
	}

	public static final Object[] pattern_MethodDefinition_1_2_collecttranslatedelements_blackBBBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, MethodDeclarationToTMethodDefinition mDeclarationToTDefinition,
			MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature,
			MMethodDefinition eMethodDeclaration, MethodDeclarationToTMethod eMethodDeclarationToTMethod,
			TMethodDefinition tMethodDefinition, MDefinitionToTSignature mDefinitionToTSignature,
			BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { mDefinitionToTMember, mDeclarationToTDefinition, eMethodDeclarationToTMethodSignature,
				eMethodDeclaration, eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_MethodDefinition_1_2_collecttranslatedelements_greenFBBBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, MethodDeclarationToTMethodDefinition mDeclarationToTDefinition,
			MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature,
			MMethodDefinition eMethodDeclaration, MethodDeclarationToTMethod eMethodDeclarationToTMethod,
			TMethodDefinition tMethodDefinition, MDefinitionToTSignature mDefinitionToTSignature,
			BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedLinkElements().add(mDeclarationToTDefinition);
		ruleresult.getCreatedLinkElements().add(eMethodDeclarationToTMethodSignature);
		ruleresult.getTranslatedElements().add(eMethodDeclaration);
		ruleresult.getCreatedLinkElements().add(eMethodDeclarationToTMethod);
		ruleresult.getCreatedElements().add(tMethodDefinition);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTSignature);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, mDefinitionToTMember, mDeclarationToTDefinition,
				eMethodDeclarationToTMethodSignature, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation };
	}

	public static final Object[] pattern_MethodDefinition_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject mDeclarationToTDefinition, EObject mSignature, EObject mSignatureToTMethodSignature,
			EObject eMethodDeclarationToTMethodSignature, EObject tMethod, EObject eMethodDeclaration,
			EObject eMethodDeclarationToTMethod, EObject tMethodDefinition, EObject mDefinitionToTSignature,
			EObject mBodyToTAnnotation) {
		if (!mDefinitionToTMember.equals(tMethodSignature)) {
			if (!mDefinitionToTMember.equals(mSignature)) {
				if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
					if (!mDefinitionToTMember.equals(tMethod)) {
						if (!mDefinitionToTMember.equals(tMethodDefinition)) {
							if (!mDefinitionToTMember.equals(mDefinitionToTSignature)) {
								if (!mDeclarationToTDefinition.equals(mDefinitionToTMember)) {
									if (!mDeclarationToTDefinition.equals(tMethodSignature)) {
										if (!mDeclarationToTDefinition.equals(mSignature)) {
											if (!mDeclarationToTDefinition.equals(mSignatureToTMethodSignature)) {
												if (!mDeclarationToTDefinition.equals(tMethod)) {
													if (!mDeclarationToTDefinition.equals(tMethodDefinition)) {
														if (!mDeclarationToTDefinition
																.equals(mDefinitionToTSignature)) {
															if (!mSignature.equals(tMethodSignature)) {
																if (!mSignature.equals(mSignatureToTMethodSignature)) {
																	if (!mSignature.equals(tMethod)) {
																		if (!mSignature.equals(tMethodDefinition)) {
																			if (!mSignatureToTMethodSignature
																					.equals(tMethodSignature)) {
																				if (!mSignatureToTMethodSignature
																						.equals(tMethod)) {
																					if (!mSignatureToTMethodSignature
																							.equals(tMethodDefinition)) {
																						if (!eMethodDeclarationToTMethodSignature
																								.equals(mDefinitionToTMember)) {
																							if (!eMethodDeclarationToTMethodSignature
																									.equals(tMethodSignature)) {
																								if (!eMethodDeclarationToTMethodSignature
																										.equals(mDeclarationToTDefinition)) {
																									if (!eMethodDeclarationToTMethodSignature
																											.equals(mSignature)) {
																										if (!eMethodDeclarationToTMethodSignature
																												.equals(mSignatureToTMethodSignature)) {
																											if (!eMethodDeclarationToTMethodSignature
																													.equals(tMethod)) {
																												if (!eMethodDeclarationToTMethodSignature
																														.equals(tMethodDefinition)) {
																													if (!eMethodDeclarationToTMethodSignature
																															.equals(mDefinitionToTSignature)) {
																														if (!eMethodDeclarationToTMethodSignature
																																.equals(mBodyToTAnnotation)) {
																															if (!tMethod
																																	.equals(tMethodSignature)) {
																																if (!tMethod
																																		.equals(tMethodDefinition)) {
																																	if (!eMethodDeclaration
																																			.equals(mDefinitionToTMember)) {
																																		if (!eMethodDeclaration
																																				.equals(tMethodSignature)) {
																																			if (!eMethodDeclaration
																																					.equals(mDeclarationToTDefinition)) {
																																				if (!eMethodDeclaration
																																						.equals(mSignature)) {
																																					if (!eMethodDeclaration
																																							.equals(mSignatureToTMethodSignature)) {
																																						if (!eMethodDeclaration
																																								.equals(eMethodDeclarationToTMethodSignature)) {
																																							if (!eMethodDeclaration
																																									.equals(tMethod)) {
																																								if (!eMethodDeclaration
																																										.equals(eMethodDeclarationToTMethod)) {
																																									if (!eMethodDeclaration
																																											.equals(tMethodDefinition)) {
																																										if (!eMethodDeclaration
																																												.equals(mDefinitionToTSignature)) {
																																											if (!eMethodDeclaration
																																													.equals(mBodyToTAnnotation)) {
																																												if (!eMethodDeclarationToTMethod
																																														.equals(mDefinitionToTMember)) {
																																													if (!eMethodDeclarationToTMethod
																																															.equals(tMethodSignature)) {
																																														if (!eMethodDeclarationToTMethod
																																																.equals(mDeclarationToTDefinition)) {
																																															if (!eMethodDeclarationToTMethod
																																																	.equals(mSignature)) {
																																																if (!eMethodDeclarationToTMethod
																																																		.equals(mSignatureToTMethodSignature)) {
																																																	if (!eMethodDeclarationToTMethod
																																																			.equals(eMethodDeclarationToTMethodSignature)) {
																																																		if (!eMethodDeclarationToTMethod
																																																				.equals(tMethod)) {
																																																			if (!eMethodDeclarationToTMethod
																																																					.equals(tMethodDefinition)) {
																																																				if (!eMethodDeclarationToTMethod
																																																						.equals(mDefinitionToTSignature)) {
																																																					if (!eMethodDeclarationToTMethod
																																																							.equals(mBodyToTAnnotation)) {
																																																						if (!tMethodDefinition
																																																								.equals(tMethodSignature)) {
																																																							if (!mDefinitionToTSignature
																																																									.equals(tMethodSignature)) {
																																																								if (!mDefinitionToTSignature
																																																										.equals(mSignature)) {
																																																									if (!mDefinitionToTSignature
																																																											.equals(mSignatureToTMethodSignature)) {
																																																										if (!mDefinitionToTSignature
																																																												.equals(tMethod)) {
																																																											if (!mDefinitionToTSignature
																																																													.equals(tMethodDefinition)) {
																																																												if (!mBodyToTAnnotation
																																																														.equals(mDefinitionToTMember)) {
																																																													if (!mBodyToTAnnotation
																																																															.equals(tMethodSignature)) {
																																																														if (!mBodyToTAnnotation
																																																																.equals(mDeclarationToTDefinition)) {
																																																															if (!mBodyToTAnnotation
																																																																	.equals(mSignature)) {
																																																																if (!mBodyToTAnnotation
																																																																		.equals(mSignatureToTMethodSignature)) {
																																																																	if (!mBodyToTAnnotation
																																																																			.equals(tMethod)) {
																																																																		if (!mBodyToTAnnotation
																																																																				.equals(tMethodDefinition)) {
																																																																			if (!mBodyToTAnnotation
																																																																					.equals(mDefinitionToTSignature)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						mDefinitionToTMember,
																																																																						tMethodSignature,
																																																																						mDeclarationToTDefinition,
																																																																						mSignature,
																																																																						mSignatureToTMethodSignature,
																																																																						eMethodDeclarationToTMethodSignature,
																																																																						tMethod,
																																																																						eMethodDeclaration,
																																																																						eMethodDeclarationToTMethod,
																																																																						tMethodDefinition,
																																																																						mDefinitionToTSignature,
																																																																						mBodyToTAnnotation };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDefinition_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject mDeclarationToTDefinition, EObject mSignature, EObject eMethodDeclarationToTMethodSignature,
			EObject tMethod, EObject eMethodDeclaration, EObject eMethodDeclarationToTMethod, EObject tMethodDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		EMoflonEdge mDefinitionToTMember__eMethodDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tMethodDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDeclarationToTDefinition__eMethodDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDeclarationToTDefinition__tMethodDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignature__eMethodDeclaration____mMethodDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__mSignature____mMethodSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethodSignature__eMethodDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethod__eMethodDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethod__tMethod____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTSignature__eMethodDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDefinitionToTSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eMethodDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tMethodDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDefinition";
		String mDefinitionToTMember__eMethodDeclaration____source_name_prime = "source";
		String mDefinitionToTMember__tMethodDefinition____target_name_prime = "target";
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String mDeclarationToTDefinition__eMethodDeclaration____source_name_prime = "source";
		String mDeclarationToTDefinition__tMethodDefinition____target_name_prime = "target";
		String mSignature__eMethodDeclaration____mMethodDefinitions_name_prime = "mMethodDefinitions";
		String eMethodDeclaration__mSignature____mMethodSignature_name_prime = "mMethodSignature";
		String eMethodDeclarationToTMethodSignature__eMethodDeclaration____source_name_prime = "source";
		String eMethodDeclarationToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String eMethodDeclarationToTMethod__eMethodDeclaration____source_name_prime = "source";
		String eMethodDeclarationToTMethod__tMethod____target_name_prime = "target";
		String mDefinitionToTSignature__eMethodDeclaration____source_name_prime = "source";
		String mDefinitionToTSignature__tMethodSignature____target_name_prime = "target";
		String mBodyToTAnnotation__eMethodDeclaration____source_name_prime = "source";
		String mBodyToTAnnotation__tMethodDefinition____target_name_prime = "target";
		mDefinitionToTMember__eMethodDeclaration____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__eMethodDeclaration____source);
		mDefinitionToTMember__tMethodDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tMethodDefinition____target.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tMethodDefinition____target);
		tMethodSignature__tMethodDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(tMethodDefinition__tMethodSignature____signature);
		mDeclarationToTDefinition__eMethodDeclaration____source.setSrc(mDeclarationToTDefinition);
		mDeclarationToTDefinition__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mDeclarationToTDefinition__eMethodDeclaration____source);
		mDeclarationToTDefinition__tMethodDefinition____target.setSrc(mDeclarationToTDefinition);
		mDeclarationToTDefinition__tMethodDefinition____target.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(mDeclarationToTDefinition__tMethodDefinition____target);
		mSignature__eMethodDeclaration____mMethodDefinitions.setSrc(mSignature);
		mSignature__eMethodDeclaration____mMethodDefinitions.setTrg(eMethodDeclaration);
		ruleresult.getTranslatedEdges().add(mSignature__eMethodDeclaration____mMethodDefinitions);
		eMethodDeclaration__mSignature____mMethodSignature.setSrc(eMethodDeclaration);
		eMethodDeclaration__mSignature____mMethodSignature.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(eMethodDeclaration__mSignature____mMethodSignature);
		eMethodDeclarationToTMethodSignature__eMethodDeclaration____source.setSrc(eMethodDeclarationToTMethodSignature);
		eMethodDeclarationToTMethodSignature__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(eMethodDeclarationToTMethodSignature__eMethodDeclaration____source);
		eMethodDeclarationToTMethodSignature__tMethodSignature____target.setSrc(eMethodDeclarationToTMethodSignature);
		eMethodDeclarationToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(eMethodDeclarationToTMethodSignature__tMethodSignature____target);
		eMethodDeclarationToTMethod__eMethodDeclaration____source.setSrc(eMethodDeclarationToTMethod);
		eMethodDeclarationToTMethod__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(eMethodDeclarationToTMethod__eMethodDeclaration____source);
		eMethodDeclarationToTMethod__tMethod____target.setSrc(eMethodDeclarationToTMethod);
		eMethodDeclarationToTMethod__tMethod____target.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(eMethodDeclarationToTMethod__tMethod____target);
		mDefinitionToTSignature__eMethodDeclaration____source.setSrc(mDefinitionToTSignature);
		mDefinitionToTSignature__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mDefinitionToTSignature__eMethodDeclaration____source);
		mDefinitionToTSignature__tMethodSignature____target.setSrc(mDefinitionToTSignature);
		mDefinitionToTSignature__tMethodSignature____target.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(mDefinitionToTSignature__tMethodSignature____target);
		mBodyToTAnnotation__eMethodDeclaration____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eMethodDeclaration____source);
		mBodyToTAnnotation__tMethodDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tMethodDefinition____target.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tMethodDefinition____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinitionToTMember__eMethodDeclaration____source
				.setName(mDefinitionToTMember__eMethodDeclaration____source_name_prime);
		mDefinitionToTMember__tMethodDefinition____target
				.setName(mDefinitionToTMember__tMethodDefinition____target_name_prime);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		mDeclarationToTDefinition__eMethodDeclaration____source
				.setName(mDeclarationToTDefinition__eMethodDeclaration____source_name_prime);
		mDeclarationToTDefinition__tMethodDefinition____target
				.setName(mDeclarationToTDefinition__tMethodDefinition____target_name_prime);
		mSignature__eMethodDeclaration____mMethodDefinitions
				.setName(mSignature__eMethodDeclaration____mMethodDefinitions_name_prime);
		eMethodDeclaration__mSignature____mMethodSignature
				.setName(eMethodDeclaration__mSignature____mMethodSignature_name_prime);
		eMethodDeclarationToTMethodSignature__eMethodDeclaration____source
				.setName(eMethodDeclarationToTMethodSignature__eMethodDeclaration____source_name_prime);
		eMethodDeclarationToTMethodSignature__tMethodSignature____target
				.setName(eMethodDeclarationToTMethodSignature__tMethodSignature____target_name_prime);
		eMethodDeclarationToTMethod__eMethodDeclaration____source
				.setName(eMethodDeclarationToTMethod__eMethodDeclaration____source_name_prime);
		eMethodDeclarationToTMethod__tMethod____target
				.setName(eMethodDeclarationToTMethod__tMethod____target_name_prime);
		mDefinitionToTSignature__eMethodDeclaration____source
				.setName(mDefinitionToTSignature__eMethodDeclaration____source_name_prime);
		mDefinitionToTSignature__tMethodSignature____target
				.setName(mDefinitionToTSignature__tMethodSignature____target_name_prime);
		mBodyToTAnnotation__eMethodDeclaration____source
				.setName(mBodyToTAnnotation__eMethodDeclaration____source_name_prime);
		mBodyToTAnnotation__tMethodDefinition____target
				.setName(mBodyToTAnnotation__tMethodDefinition____target_name_prime);
		return new Object[] { ruleresult, mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition, mSignature,
				eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation,
				mDefinitionToTMember__eMethodDeclaration____source, mDefinitionToTMember__tMethodDefinition____target,
				tMethodSignature__tMethodDefinition____definitions, tMethodDefinition__tMethodSignature____signature,
				mDeclarationToTDefinition__eMethodDeclaration____source,
				mDeclarationToTDefinition__tMethodDefinition____target,
				mSignature__eMethodDeclaration____mMethodDefinitions,
				eMethodDeclaration__mSignature____mMethodSignature,
				eMethodDeclarationToTMethodSignature__eMethodDeclaration____source,
				eMethodDeclarationToTMethodSignature__tMethodSignature____target,
				eMethodDeclarationToTMethod__eMethodDeclaration____source,
				eMethodDeclarationToTMethod__tMethod____target, mDefinitionToTSignature__eMethodDeclaration____source,
				mDefinitionToTSignature__tMethodSignature____target, mBodyToTAnnotation__eMethodDeclaration____source,
				mBodyToTAnnotation__tMethodDefinition____target };
	}

	public static final void pattern_MethodDefinition_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodDefinition _this, PerformRuleResult ruleresult, EObject mDefinitionToTMember,
			EObject tMethodSignature, EObject mDeclarationToTDefinition, EObject mSignature,
			EObject mSignatureToTMethodSignature, EObject eMethodDeclarationToTMethodSignature, EObject tMethod,
			EObject eMethodDeclaration, EObject eMethodDeclarationToTMethod, EObject tMethodDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		_this.registerObjects_FWD(ruleresult, mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition,
				mSignature, mSignatureToTMethodSignature, eMethodDeclarationToTMethodSignature, tMethod,
				eMethodDeclaration, eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature,
				mBodyToTAnnotation);

	}

	public static final PerformRuleResult pattern_MethodDefinition_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_2_1_preparereturnvalue_bindingFB(MethodDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDefinition _this) {
		Object[] result_pattern_MethodDefinition_2_1_preparereturnvalue_binding = pattern_MethodDefinition_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinition_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinition_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinition_2_1_preparereturnvalue_black = pattern_MethodDefinition_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinition_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinition_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinition_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mSignature");
		EObject _localVariable_1 = match.getObject("eMethodDeclaration");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpEMethodDeclaration = _localVariable_1;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpEMethodDeclaration instanceof MMethodDefinition) {
				MMethodDefinition eMethodDeclaration = (MMethodDefinition) tmpEMethodDeclaration;
				return new Object[] { mSignature, eMethodDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_2_2_corematch_blackFBFBB(
			MMethodSignature mSignature, MMethodDefinition eMethodDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignatureToTMethodSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MMethodSignatureToTMethodSignature.class, "source")) {
			TMethodSignature tMethodSignature = mSignatureToTMethodSignature.getTarget();
			if (tMethodSignature != null) {
				_result.add(new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature,
						eMethodDeclaration, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_2_3_findcontext_blackBBBFB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, MMethodDefinition eMethodDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mSignature.getMMethodDefinitions().contains(eMethodDeclaration)) {
			if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
				if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
					TMethod tMethod = tMethodSignature.getMethod();
					if (tMethod != null) {
						_result.add(new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
								eMethodDeclaration });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_2_3_findcontext_greenBBBBBFFFFFFF(
			TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			MMethodDefinition eMethodDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__eMethodDeclaration____mMethodDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__mSignature____mMethodSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String mSignature__eMethodDeclaration____mMethodDefinitions_name_prime = "mMethodDefinitions";
		String eMethodDeclaration__mSignature____mMethodSignature_name_prime = "mMethodSignature";
		String mSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		String mSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethod__tMethodSignature____signatures);
		mSignature__eMethodDeclaration____mMethodDefinitions.setSrc(mSignature);
		mSignature__eMethodDeclaration____mMethodDefinitions.setTrg(eMethodDeclaration);
		isApplicableMatch.getAllContextElements().add(mSignature__eMethodDeclaration____mMethodDefinitions);
		eMethodDeclaration__mSignature____mMethodSignature.setSrc(eMethodDeclaration);
		eMethodDeclaration__mSignature____mMethodSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration__mSignature____mMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__mSignature____source);
		mSignatureToTMethodSignature__tMethodSignature____target.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__tMethodSignature____target);
		tMethodSignature__tMethod____method.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures.setName(tMethod__tMethodSignature____signatures_name_prime);
		mSignature__eMethodDeclaration____mMethodDefinitions
				.setName(mSignature__eMethodDeclaration____mMethodDefinitions_name_prime);
		eMethodDeclaration__mSignature____mMethodSignature
				.setName(eMethodDeclaration__mSignature____mMethodSignature_name_prime);
		mSignatureToTMethodSignature__mSignature____source
				.setName(mSignatureToTMethodSignature__mSignature____source_name_prime);
		mSignatureToTMethodSignature__tMethodSignature____target
				.setName(mSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, eMethodDeclaration,
				isApplicableMatch, tMethodSignature__tMethod____method, tMethod__tMethodSignature____signatures,
				mSignature__eMethodDeclaration____mMethodDefinitions,
				eMethodDeclaration__mSignature____mMethodSignature, mSignatureToTMethodSignature__mSignature____source,
				mSignatureToTMethodSignature__tMethodSignature____target };
	}

	public static final Object[] pattern_MethodDefinition_2_4_solveCSP_bindingFBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			MMethodDefinition eMethodDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tMethodSignature, mSignature,
				mSignatureToTMethodSignature, tMethod, eMethodDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mSignature,
					mSignatureToTMethodSignature, tMethod, eMethodDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_2_4_solveCSP_bindingAndBlackFBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			MMethodDefinition eMethodDeclaration) {
		Object[] result_pattern_MethodDefinition_2_4_solveCSP_binding = pattern_MethodDefinition_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
				eMethodDeclaration);
		if (result_pattern_MethodDefinition_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_2_4_solveCSP_black = pattern_MethodDefinition_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mSignature,
						mSignatureToTMethodSignature, tMethod, eMethodDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_2_5_checkCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinition_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinition_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_10_1_initialbindings_blackBBBBB(MethodDefinition _this,
			Match match, TMethodSignature tMethodSignature, TMethod tMethod, TMethodDefinition tMethodDefinition) {
		return new Object[] { _this, match, tMethodSignature, tMethod, tMethodDefinition };
	}

	public static final Object[] pattern_MethodDefinition_10_2_SolveCSP_bindingFBBBBB(MethodDefinition _this,
			Match match, TMethodSignature tMethodSignature, TMethod tMethod, TMethodDefinition tMethodDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMethodSignature, tMethod, tMethodDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodSignature, tMethod, tMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_10_2_SolveCSP_bindingAndBlackFBBBBB(MethodDefinition _this,
			Match match, TMethodSignature tMethodSignature, TMethod tMethod, TMethodDefinition tMethodDefinition) {
		Object[] result_pattern_MethodDefinition_10_2_SolveCSP_binding = pattern_MethodDefinition_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tMethodSignature, tMethod, tMethodDefinition);
		if (result_pattern_MethodDefinition_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_10_2_SolveCSP_black = pattern_MethodDefinition_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMethodSignature, tMethod, tMethodDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_10_3_CheckCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMethodSignature tMethodSignature, TMethod tMethod, TMethodDefinition tMethodDefinition) {
		return new Object[] { match, tMethodSignature, tMethod, tMethodDefinition };
	}

	public static final Object[] pattern_MethodDefinition_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TMethodSignature tMethodSignature, TMethodDefinition tMethodDefinition) {
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tMethodDefinition);
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		tMethodSignature__tMethodDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions.setTrg(tMethodDefinition);
		match.getToBeTranslatedEdges().add(tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		match.getToBeTranslatedEdges().add(tMethodDefinition__tMethodSignature____signature);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		return new Object[] { match, tMethodSignature, tMethodDefinition,
				tMethodSignature__tMethodDefinition____definitions, tMethodDefinition__tMethodSignature____signature };
	}

	public static final Object[] pattern_MethodDefinition_10_5_collectcontextelements_blackBBBB(Match match,
			TMethodSignature tMethodSignature, TMethod tMethod, TMethodDefinition tMethodDefinition) {
		return new Object[] { match, tMethodSignature, tMethod, tMethodDefinition };
	}

	public static final Object[] pattern_MethodDefinition_10_5_collectcontextelements_greenBBBFF(Match match,
			TMethodSignature tMethodSignature, TMethod tMethod) {
		EMoflonEdge tMethodSignature__tMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tMethodSignature);
		match.getContextNodes().add(tMethod);
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		match.getContextEdges().add(tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		match.getContextEdges().add(tMethod__tMethodSignature____signatures);
		tMethodSignature__tMethod____method.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures.setName(tMethod__tMethodSignature____signatures_name_prime);
		return new Object[] { match, tMethodSignature, tMethod, tMethodSignature__tMethod____method,
				tMethod__tMethodSignature____signatures };
	}

	public static final void pattern_MethodDefinition_10_6_registerobjectstomatch_expressionBBBBB(
			MethodDefinition _this, Match match, TMethodSignature tMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		_this.registerObjectsToMatch_BWD(match, tMethodSignature, tMethod, tMethodDefinition);

	}

	public static final boolean pattern_MethodDefinition_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMethodDefinition");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		EObject tmpMSignatureToTMethodSignature = _localVariable_2;
		EObject tmpTMethod = _localVariable_3;
		EObject tmpTMethodDefinition = _localVariable_4;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				if (tmpMSignatureToTMethodSignature instanceof MMethodSignatureToTMethodSignature) {
					MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) tmpMSignatureToTMethodSignature;
					if (tmpTMethod instanceof TMethod) {
						TMethod tMethod = (TMethod) tmpTMethod;
						if (tmpTMethodDefinition instanceof TMethodDefinition) {
							TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
							return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
									tMethodDefinition, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_11_1_performtransformation_blackBBBBBFBB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition, MethodDefinition _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
						tMethodDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			MethodDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinition_11_1_performtransformation_binding = pattern_MethodDefinition_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDefinition_11_1_performtransformation_binding != null) {
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinition_11_1_performtransformation_binding[0];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinition_11_1_performtransformation_binding[1];
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result_pattern_MethodDefinition_11_1_performtransformation_binding[2];
			TMethod tMethod = (TMethod) result_pattern_MethodDefinition_11_1_performtransformation_binding[3];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_MethodDefinition_11_1_performtransformation_binding[4];

			Object[] result_pattern_MethodDefinition_11_1_performtransformation_black = pattern_MethodDefinition_11_1_performtransformation_blackBBBBBFBB(
					tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, tMethodDefinition, _this,
					isApplicableMatch);
			if (result_pattern_MethodDefinition_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinition_11_1_performtransformation_black[5];

				return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
						tMethodDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_11_1_performtransformation_greenFBFBFBFFBFF(
			TMethodSignature tMethodSignature, MMethodSignature mSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		MDefinitionToTMember mDefinitionToTMember = ModiscoFactory.eINSTANCE.createMDefinitionToTMember();
		MethodDeclarationToTMethodDefinition mDeclarationToTDefinition = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethodDefinition();
		MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethodSignature();
		MMethodDefinition eMethodDeclaration = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMMethodDefinition();
		MethodDeclarationToTMethod eMethodDeclarationToTMethod = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethod();
		MDefinitionToTSignature mDefinitionToTSignature = ModiscoFactory.eINSTANCE.createMDefinitionToTSignature();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		mDefinitionToTMember.setTarget(tMethodDefinition);
		mDeclarationToTDefinition.setTarget(tMethodDefinition);
		eMethodDeclarationToTMethodSignature.setTarget(tMethodSignature);
		mDefinitionToTMember.setSource(eMethodDeclaration);
		mDeclarationToTDefinition.setSource(eMethodDeclaration);
		mSignature.getMMethodDefinitions().add(eMethodDeclaration);
		eMethodDeclarationToTMethodSignature.setSource(eMethodDeclaration);
		eMethodDeclarationToTMethod.setSource(eMethodDeclaration);
		eMethodDeclarationToTMethod.setTarget(tMethod);
		mDefinitionToTSignature.setSource(eMethodDeclaration);
		mDefinitionToTSignature.setTarget(tMethodSignature);
		mBodyToTAnnotation.setSource(eMethodDeclaration);
		mBodyToTAnnotation.setTarget(tMethodDefinition);
		return new Object[] { mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition, mSignature,
				eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation };
	}

	public static final Object[] pattern_MethodDefinition_11_2_collecttranslatedelements_blackBBBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, MethodDeclarationToTMethodDefinition mDeclarationToTDefinition,
			MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature,
			MMethodDefinition eMethodDeclaration, MethodDeclarationToTMethod eMethodDeclarationToTMethod,
			TMethodDefinition tMethodDefinition, MDefinitionToTSignature mDefinitionToTSignature,
			BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { mDefinitionToTMember, mDeclarationToTDefinition, eMethodDeclarationToTMethodSignature,
				eMethodDeclaration, eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_MethodDefinition_11_2_collecttranslatedelements_greenFBBBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, MethodDeclarationToTMethodDefinition mDeclarationToTDefinition,
			MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature,
			MMethodDefinition eMethodDeclaration, MethodDeclarationToTMethod eMethodDeclarationToTMethod,
			TMethodDefinition tMethodDefinition, MDefinitionToTSignature mDefinitionToTSignature,
			BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedLinkElements().add(mDeclarationToTDefinition);
		ruleresult.getCreatedLinkElements().add(eMethodDeclarationToTMethodSignature);
		ruleresult.getCreatedElements().add(eMethodDeclaration);
		ruleresult.getCreatedLinkElements().add(eMethodDeclarationToTMethod);
		ruleresult.getTranslatedElements().add(tMethodDefinition);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTSignature);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, mDefinitionToTMember, mDeclarationToTDefinition,
				eMethodDeclarationToTMethodSignature, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation };
	}

	public static final Object[] pattern_MethodDefinition_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject mDeclarationToTDefinition, EObject mSignature, EObject mSignatureToTMethodSignature,
			EObject eMethodDeclarationToTMethodSignature, EObject tMethod, EObject eMethodDeclaration,
			EObject eMethodDeclarationToTMethod, EObject tMethodDefinition, EObject mDefinitionToTSignature,
			EObject mBodyToTAnnotation) {
		if (!mDefinitionToTMember.equals(tMethodSignature)) {
			if (!mDefinitionToTMember.equals(mSignature)) {
				if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
					if (!mDefinitionToTMember.equals(tMethod)) {
						if (!mDefinitionToTMember.equals(tMethodDefinition)) {
							if (!mDefinitionToTMember.equals(mDefinitionToTSignature)) {
								if (!mDeclarationToTDefinition.equals(mDefinitionToTMember)) {
									if (!mDeclarationToTDefinition.equals(tMethodSignature)) {
										if (!mDeclarationToTDefinition.equals(mSignature)) {
											if (!mDeclarationToTDefinition.equals(mSignatureToTMethodSignature)) {
												if (!mDeclarationToTDefinition.equals(tMethod)) {
													if (!mDeclarationToTDefinition.equals(tMethodDefinition)) {
														if (!mDeclarationToTDefinition
																.equals(mDefinitionToTSignature)) {
															if (!mSignature.equals(tMethodSignature)) {
																if (!mSignature.equals(mSignatureToTMethodSignature)) {
																	if (!mSignature.equals(tMethod)) {
																		if (!mSignature.equals(tMethodDefinition)) {
																			if (!mSignatureToTMethodSignature
																					.equals(tMethodSignature)) {
																				if (!mSignatureToTMethodSignature
																						.equals(tMethod)) {
																					if (!mSignatureToTMethodSignature
																							.equals(tMethodDefinition)) {
																						if (!eMethodDeclarationToTMethodSignature
																								.equals(mDefinitionToTMember)) {
																							if (!eMethodDeclarationToTMethodSignature
																									.equals(tMethodSignature)) {
																								if (!eMethodDeclarationToTMethodSignature
																										.equals(mDeclarationToTDefinition)) {
																									if (!eMethodDeclarationToTMethodSignature
																											.equals(mSignature)) {
																										if (!eMethodDeclarationToTMethodSignature
																												.equals(mSignatureToTMethodSignature)) {
																											if (!eMethodDeclarationToTMethodSignature
																													.equals(tMethod)) {
																												if (!eMethodDeclarationToTMethodSignature
																														.equals(tMethodDefinition)) {
																													if (!eMethodDeclarationToTMethodSignature
																															.equals(mDefinitionToTSignature)) {
																														if (!eMethodDeclarationToTMethodSignature
																																.equals(mBodyToTAnnotation)) {
																															if (!tMethod
																																	.equals(tMethodSignature)) {
																																if (!tMethod
																																		.equals(tMethodDefinition)) {
																																	if (!eMethodDeclaration
																																			.equals(mDefinitionToTMember)) {
																																		if (!eMethodDeclaration
																																				.equals(tMethodSignature)) {
																																			if (!eMethodDeclaration
																																					.equals(mDeclarationToTDefinition)) {
																																				if (!eMethodDeclaration
																																						.equals(mSignature)) {
																																					if (!eMethodDeclaration
																																							.equals(mSignatureToTMethodSignature)) {
																																						if (!eMethodDeclaration
																																								.equals(eMethodDeclarationToTMethodSignature)) {
																																							if (!eMethodDeclaration
																																									.equals(tMethod)) {
																																								if (!eMethodDeclaration
																																										.equals(eMethodDeclarationToTMethod)) {
																																									if (!eMethodDeclaration
																																											.equals(tMethodDefinition)) {
																																										if (!eMethodDeclaration
																																												.equals(mDefinitionToTSignature)) {
																																											if (!eMethodDeclaration
																																													.equals(mBodyToTAnnotation)) {
																																												if (!eMethodDeclarationToTMethod
																																														.equals(mDefinitionToTMember)) {
																																													if (!eMethodDeclarationToTMethod
																																															.equals(tMethodSignature)) {
																																														if (!eMethodDeclarationToTMethod
																																																.equals(mDeclarationToTDefinition)) {
																																															if (!eMethodDeclarationToTMethod
																																																	.equals(mSignature)) {
																																																if (!eMethodDeclarationToTMethod
																																																		.equals(mSignatureToTMethodSignature)) {
																																																	if (!eMethodDeclarationToTMethod
																																																			.equals(eMethodDeclarationToTMethodSignature)) {
																																																		if (!eMethodDeclarationToTMethod
																																																				.equals(tMethod)) {
																																																			if (!eMethodDeclarationToTMethod
																																																					.equals(tMethodDefinition)) {
																																																				if (!eMethodDeclarationToTMethod
																																																						.equals(mDefinitionToTSignature)) {
																																																					if (!eMethodDeclarationToTMethod
																																																							.equals(mBodyToTAnnotation)) {
																																																						if (!tMethodDefinition
																																																								.equals(tMethodSignature)) {
																																																							if (!mDefinitionToTSignature
																																																									.equals(tMethodSignature)) {
																																																								if (!mDefinitionToTSignature
																																																										.equals(mSignature)) {
																																																									if (!mDefinitionToTSignature
																																																											.equals(mSignatureToTMethodSignature)) {
																																																										if (!mDefinitionToTSignature
																																																												.equals(tMethod)) {
																																																											if (!mDefinitionToTSignature
																																																													.equals(tMethodDefinition)) {
																																																												if (!mBodyToTAnnotation
																																																														.equals(mDefinitionToTMember)) {
																																																													if (!mBodyToTAnnotation
																																																															.equals(tMethodSignature)) {
																																																														if (!mBodyToTAnnotation
																																																																.equals(mDeclarationToTDefinition)) {
																																																															if (!mBodyToTAnnotation
																																																																	.equals(mSignature)) {
																																																																if (!mBodyToTAnnotation
																																																																		.equals(mSignatureToTMethodSignature)) {
																																																																	if (!mBodyToTAnnotation
																																																																			.equals(tMethod)) {
																																																																		if (!mBodyToTAnnotation
																																																																				.equals(tMethodDefinition)) {
																																																																			if (!mBodyToTAnnotation
																																																																					.equals(mDefinitionToTSignature)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						mDefinitionToTMember,
																																																																						tMethodSignature,
																																																																						mDeclarationToTDefinition,
																																																																						mSignature,
																																																																						mSignatureToTMethodSignature,
																																																																						eMethodDeclarationToTMethodSignature,
																																																																						tMethod,
																																																																						eMethodDeclaration,
																																																																						eMethodDeclarationToTMethod,
																																																																						tMethodDefinition,
																																																																						mDefinitionToTSignature,
																																																																						mBodyToTAnnotation };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDefinition_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject mDeclarationToTDefinition, EObject mSignature, EObject eMethodDeclarationToTMethodSignature,
			EObject tMethod, EObject eMethodDeclaration, EObject eMethodDeclarationToTMethod, EObject tMethodDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		EMoflonEdge mDefinitionToTMember__eMethodDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tMethodDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDeclarationToTDefinition__eMethodDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDeclarationToTDefinition__tMethodDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignature__eMethodDeclaration____mMethodDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__mSignature____mMethodSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethodSignature__eMethodDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethod__eMethodDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethod__tMethod____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTSignature__eMethodDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDefinitionToTSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eMethodDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tMethodDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDefinition";
		String mDefinitionToTMember__eMethodDeclaration____source_name_prime = "source";
		String mDefinitionToTMember__tMethodDefinition____target_name_prime = "target";
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String mDeclarationToTDefinition__eMethodDeclaration____source_name_prime = "source";
		String mDeclarationToTDefinition__tMethodDefinition____target_name_prime = "target";
		String mSignature__eMethodDeclaration____mMethodDefinitions_name_prime = "mMethodDefinitions";
		String eMethodDeclaration__mSignature____mMethodSignature_name_prime = "mMethodSignature";
		String eMethodDeclarationToTMethodSignature__eMethodDeclaration____source_name_prime = "source";
		String eMethodDeclarationToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String eMethodDeclarationToTMethod__eMethodDeclaration____source_name_prime = "source";
		String eMethodDeclarationToTMethod__tMethod____target_name_prime = "target";
		String mDefinitionToTSignature__eMethodDeclaration____source_name_prime = "source";
		String mDefinitionToTSignature__tMethodSignature____target_name_prime = "target";
		String mBodyToTAnnotation__eMethodDeclaration____source_name_prime = "source";
		String mBodyToTAnnotation__tMethodDefinition____target_name_prime = "target";
		mDefinitionToTMember__eMethodDeclaration____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__eMethodDeclaration____source);
		mDefinitionToTMember__tMethodDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tMethodDefinition____target.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tMethodDefinition____target);
		tMethodSignature__tMethodDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions.setTrg(tMethodDefinition);
		ruleresult.getTranslatedEdges().add(tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getTranslatedEdges().add(tMethodDefinition__tMethodSignature____signature);
		mDeclarationToTDefinition__eMethodDeclaration____source.setSrc(mDeclarationToTDefinition);
		mDeclarationToTDefinition__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mDeclarationToTDefinition__eMethodDeclaration____source);
		mDeclarationToTDefinition__tMethodDefinition____target.setSrc(mDeclarationToTDefinition);
		mDeclarationToTDefinition__tMethodDefinition____target.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(mDeclarationToTDefinition__tMethodDefinition____target);
		mSignature__eMethodDeclaration____mMethodDefinitions.setSrc(mSignature);
		mSignature__eMethodDeclaration____mMethodDefinitions.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mSignature__eMethodDeclaration____mMethodDefinitions);
		eMethodDeclaration__mSignature____mMethodSignature.setSrc(eMethodDeclaration);
		eMethodDeclaration__mSignature____mMethodSignature.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(eMethodDeclaration__mSignature____mMethodSignature);
		eMethodDeclarationToTMethodSignature__eMethodDeclaration____source.setSrc(eMethodDeclarationToTMethodSignature);
		eMethodDeclarationToTMethodSignature__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(eMethodDeclarationToTMethodSignature__eMethodDeclaration____source);
		eMethodDeclarationToTMethodSignature__tMethodSignature____target.setSrc(eMethodDeclarationToTMethodSignature);
		eMethodDeclarationToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(eMethodDeclarationToTMethodSignature__tMethodSignature____target);
		eMethodDeclarationToTMethod__eMethodDeclaration____source.setSrc(eMethodDeclarationToTMethod);
		eMethodDeclarationToTMethod__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(eMethodDeclarationToTMethod__eMethodDeclaration____source);
		eMethodDeclarationToTMethod__tMethod____target.setSrc(eMethodDeclarationToTMethod);
		eMethodDeclarationToTMethod__tMethod____target.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(eMethodDeclarationToTMethod__tMethod____target);
		mDefinitionToTSignature__eMethodDeclaration____source.setSrc(mDefinitionToTSignature);
		mDefinitionToTSignature__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mDefinitionToTSignature__eMethodDeclaration____source);
		mDefinitionToTSignature__tMethodSignature____target.setSrc(mDefinitionToTSignature);
		mDefinitionToTSignature__tMethodSignature____target.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(mDefinitionToTSignature__tMethodSignature____target);
		mBodyToTAnnotation__eMethodDeclaration____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eMethodDeclaration____source.setTrg(eMethodDeclaration);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eMethodDeclaration____source);
		mBodyToTAnnotation__tMethodDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tMethodDefinition____target.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tMethodDefinition____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinitionToTMember__eMethodDeclaration____source
				.setName(mDefinitionToTMember__eMethodDeclaration____source_name_prime);
		mDefinitionToTMember__tMethodDefinition____target
				.setName(mDefinitionToTMember__tMethodDefinition____target_name_prime);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		mDeclarationToTDefinition__eMethodDeclaration____source
				.setName(mDeclarationToTDefinition__eMethodDeclaration____source_name_prime);
		mDeclarationToTDefinition__tMethodDefinition____target
				.setName(mDeclarationToTDefinition__tMethodDefinition____target_name_prime);
		mSignature__eMethodDeclaration____mMethodDefinitions
				.setName(mSignature__eMethodDeclaration____mMethodDefinitions_name_prime);
		eMethodDeclaration__mSignature____mMethodSignature
				.setName(eMethodDeclaration__mSignature____mMethodSignature_name_prime);
		eMethodDeclarationToTMethodSignature__eMethodDeclaration____source
				.setName(eMethodDeclarationToTMethodSignature__eMethodDeclaration____source_name_prime);
		eMethodDeclarationToTMethodSignature__tMethodSignature____target
				.setName(eMethodDeclarationToTMethodSignature__tMethodSignature____target_name_prime);
		eMethodDeclarationToTMethod__eMethodDeclaration____source
				.setName(eMethodDeclarationToTMethod__eMethodDeclaration____source_name_prime);
		eMethodDeclarationToTMethod__tMethod____target
				.setName(eMethodDeclarationToTMethod__tMethod____target_name_prime);
		mDefinitionToTSignature__eMethodDeclaration____source
				.setName(mDefinitionToTSignature__eMethodDeclaration____source_name_prime);
		mDefinitionToTSignature__tMethodSignature____target
				.setName(mDefinitionToTSignature__tMethodSignature____target_name_prime);
		mBodyToTAnnotation__eMethodDeclaration____source
				.setName(mBodyToTAnnotation__eMethodDeclaration____source_name_prime);
		mBodyToTAnnotation__tMethodDefinition____target
				.setName(mBodyToTAnnotation__tMethodDefinition____target_name_prime);
		return new Object[] { ruleresult, mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition, mSignature,
				eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation,
				mDefinitionToTMember__eMethodDeclaration____source, mDefinitionToTMember__tMethodDefinition____target,
				tMethodSignature__tMethodDefinition____definitions, tMethodDefinition__tMethodSignature____signature,
				mDeclarationToTDefinition__eMethodDeclaration____source,
				mDeclarationToTDefinition__tMethodDefinition____target,
				mSignature__eMethodDeclaration____mMethodDefinitions,
				eMethodDeclaration__mSignature____mMethodSignature,
				eMethodDeclarationToTMethodSignature__eMethodDeclaration____source,
				eMethodDeclarationToTMethodSignature__tMethodSignature____target,
				eMethodDeclarationToTMethod__eMethodDeclaration____source,
				eMethodDeclarationToTMethod__tMethod____target, mDefinitionToTSignature__eMethodDeclaration____source,
				mDefinitionToTSignature__tMethodSignature____target, mBodyToTAnnotation__eMethodDeclaration____source,
				mBodyToTAnnotation__tMethodDefinition____target };
	}

	public static final void pattern_MethodDefinition_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodDefinition _this, PerformRuleResult ruleresult, EObject mDefinitionToTMember,
			EObject tMethodSignature, EObject mDeclarationToTDefinition, EObject mSignature,
			EObject mSignatureToTMethodSignature, EObject eMethodDeclarationToTMethodSignature, EObject tMethod,
			EObject eMethodDeclaration, EObject eMethodDeclarationToTMethod, EObject tMethodDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		_this.registerObjects_BWD(ruleresult, mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition,
				mSignature, mSignatureToTMethodSignature, eMethodDeclarationToTMethodSignature, tMethod,
				eMethodDeclaration, eMethodDeclarationToTMethod, tMethodDefinition, mDefinitionToTSignature,
				mBodyToTAnnotation);

	}

	public static final PerformRuleResult pattern_MethodDefinition_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_12_1_preparereturnvalue_bindingFB(MethodDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDefinition _this) {
		Object[] result_pattern_MethodDefinition_12_1_preparereturnvalue_binding = pattern_MethodDefinition_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinition_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinition_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinition_12_1_preparereturnvalue_black = pattern_MethodDefinition_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinition_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinition_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinition_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMethodSignature");
		EObject _localVariable_1 = match.getObject("tMethod");
		EObject _localVariable_2 = match.getObject("tMethodDefinition");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		EObject tmpTMethodDefinition = _localVariable_2;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpTMethod instanceof TMethod) {
				TMethod tMethod = (TMethod) tmpTMethod;
				if (tmpTMethodDefinition instanceof TMethodDefinition) {
					TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
					return new Object[] { tMethodSignature, tMethod, tMethodDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_12_2_corematch_blackBFFBBB(
			TMethodSignature tMethodSignature, TMethod tMethod, TMethodDefinition tMethodDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignatureToTMethodSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMethodSignature, MMethodSignatureToTMethodSignature.class, "target")) {
			MMethodSignature mSignature = mSignatureToTMethodSignature.getSource();
			if (mSignature != null) {
				_result.add(new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
						tMethodDefinition, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_12_3_findcontext_blackBBBBB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethod.equals(tMethodSignature.getMethod())) {
			if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
				if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
					if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
						_result.add(new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
								tMethodDefinition });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_12_3_findcontext_greenBBBBBFFFFFFF(
			TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tMethodSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tMethod____method_name_prime = "method";
		String tMethod__tMethodSignature____signatures_name_prime = "signatures";
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String mSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		String mSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		tMethodSignature__tMethod____method.setSrc(tMethodSignature);
		tMethodSignature__tMethod____method.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(tMethodSignature__tMethod____method);
		tMethod__tMethodSignature____signatures.setSrc(tMethod);
		tMethod__tMethodSignature____signatures.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethod__tMethodSignature____signatures);
		tMethodSignature__tMethodDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition__tMethodSignature____signature);
		mSignatureToTMethodSignature__mSignature____source.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__mSignature____source);
		mSignatureToTMethodSignature__tMethodSignature____target.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__tMethodSignature____target);
		tMethodSignature__tMethod____method.setName(tMethodSignature__tMethod____method_name_prime);
		tMethod__tMethodSignature____signatures.setName(tMethod__tMethodSignature____signatures_name_prime);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		mSignatureToTMethodSignature__mSignature____source
				.setName(mSignatureToTMethodSignature__mSignature____source_name_prime);
		mSignatureToTMethodSignature__tMethodSignature____target
				.setName(mSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, tMethodDefinition,
				isApplicableMatch, tMethodSignature__tMethod____method, tMethod__tMethodSignature____signatures,
				tMethodSignature__tMethodDefinition____definitions, tMethodDefinition__tMethodSignature____signature,
				mSignatureToTMethodSignature__mSignature____source,
				mSignatureToTMethodSignature__tMethodSignature____target };
	}

	public static final Object[] pattern_MethodDefinition_12_4_solveCSP_bindingFBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tMethodSignature, mSignature,
				mSignatureToTMethodSignature, tMethod, tMethodDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mSignature,
					mSignatureToTMethodSignature, tMethod, tMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_12_4_solveCSP_bindingAndBlackFBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		Object[] result_pattern_MethodDefinition_12_4_solveCSP_binding = pattern_MethodDefinition_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
				tMethodDefinition);
		if (result_pattern_MethodDefinition_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_12_4_solveCSP_black = pattern_MethodDefinition_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mSignature,
						mSignatureToTMethodSignature, tMethod, tMethodDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_12_5_checkCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinition_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinition_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_20_1_preparereturnvalue_bindingFB(MethodDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDefinition _this) {
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

	public static final Object[] pattern_MethodDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDefinition _this) {
		Object[] result_pattern_MethodDefinition_20_1_preparereturnvalue_binding = pattern_MethodDefinition_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinition_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinition_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinition_20_1_preparereturnvalue_black = pattern_MethodDefinition_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDefinition_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinition_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDefinition_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDefinition_20_2_testcorematchandDECs_black_nac_0BB(
			MMethodDefinition eMethodDeclaration, MMethodSignature mSignature) {
		MMethodSignature __DEC_eMethodDeclaration_mMethodDefinitions_806336 = eMethodDeclaration.getMMethodSignature();
		if (__DEC_eMethodDeclaration_mMethodDefinitions_806336 != null) {
			if (!mSignature.equals(__DEC_eMethodDeclaration_mMethodDefinitions_806336)) {
				return new Object[] { eMethodDeclaration, mSignature };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mMethodDefinitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_mMethodDefinitions.getSrc();
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			EObject tmpEMethodDeclaration = _edge_mMethodDefinitions.getTrg();
			if (tmpEMethodDeclaration instanceof MMethodDefinition) {
				MMethodDefinition eMethodDeclaration = (MMethodDefinition) tmpEMethodDeclaration;
				if (mSignature.getMMethodDefinitions().contains(eMethodDeclaration)) {
					if (pattern_MethodDefinition_20_2_testcorematchandDECs_black_nac_0BB(eMethodDeclaration,
							mSignature) == null) {
						_result.add(new Object[] { mSignature, eMethodDeclaration, _edge_mMethodDefinitions });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinition_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodDefinition _this, Match match, MMethodSignature mSignature, MMethodDefinition eMethodDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSignature, eMethodDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDefinition_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_21_1_preparereturnvalue_bindingFB(MethodDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDefinition _this) {
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

	public static final Object[] pattern_MethodDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDefinition _this) {
		Object[] result_pattern_MethodDefinition_21_1_preparereturnvalue_binding = pattern_MethodDefinition_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinition_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinition_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinition_21_1_preparereturnvalue_black = pattern_MethodDefinition_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDefinition_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinition_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDefinition_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodSignature = _edge_definitions.getSrc();
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			EObject tmpTMethodDefinition = _edge_definitions.getTrg();
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
					TMethod tMethod = tMethodSignature.getMethod();
					if (tMethod != null) {
						_result.add(new Object[] { tMethodSignature, tMethod, tMethodDefinition, _edge_definitions });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodDefinition _this, Match match, TMethodSignature tMethodSignature, TMethod tMethod,
			TMethodDefinition tMethodDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMethodSignature, tMethod, tMethodDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDefinition_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_24_1_prepare_blackB(MethodDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDefinition_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodDefinition_24_2_matchcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tMethodSignature");
		EObject _localVariable_1 = sourceMatch.getObject("mSignature");
		EObject _localVariable_2 = targetMatch.getObject("tMethod");
		EObject _localVariable_3 = sourceMatch.getObject("eMethodDeclaration");
		EObject _localVariable_4 = targetMatch.getObject("tMethodDefinition");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		EObject tmpTMethod = _localVariable_2;
		EObject tmpEMethodDeclaration = _localVariable_3;
		EObject tmpTMethodDefinition = _localVariable_4;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				if (tmpTMethod instanceof TMethod) {
					TMethod tMethod = (TMethod) tmpTMethod;
					if (tmpEMethodDeclaration instanceof MMethodDefinition) {
						MMethodDefinition eMethodDeclaration = (MMethodDefinition) tmpEMethodDeclaration;
						if (tmpTMethodDefinition instanceof TMethodDefinition) {
							TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
							return new Object[] { tMethodSignature, mSignature, tMethod, eMethodDeclaration,
									tMethodDefinition, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_24_2_matchcontext_blackBBFBBBBB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature, TMethod tMethod,
			MMethodDefinition eMethodDeclaration, TMethodDefinition tMethodDefinition, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tMethod.equals(tMethodSignature.getMethod())) {
				if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
					if (mSignature.getMMethodDefinitions().contains(eMethodDeclaration)) {
						for (MMethodSignatureToTMethodSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mSignature, MMethodSignatureToTMethodSignature.class,
										"source")) {
							if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
								_result.add(new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature,
										tMethod, eMethodDeclaration, tMethodDefinition, sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_24_2_matchcontext_greenBBBBBBBFB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			MMethodDefinition eMethodDeclaration, TMethodDefinition tMethodDefinition, Match sourceMatch,
			Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "MethodDefinition";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, eMethodDeclaration,
				tMethodDefinition, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_MethodDefinition_24_3_checkcsp_bindingFBBBBBBBBBB(MethodDefinition _this,
			CCMatch isApplicableMatch, TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			MMethodDefinition eMethodDeclaration, TMethodDefinition tMethodDefinition, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, tMethodSignature, mSignature,
				mSignatureToTMethodSignature, tMethod, eMethodDeclaration, tMethodDefinition, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mSignature,
					mSignatureToTMethodSignature, tMethod, eMethodDeclaration, tMethodDefinition, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(
			MethodDefinition _this, CCMatch isApplicableMatch, TMethodSignature tMethodSignature,
			MMethodSignature mSignature, MMethodSignatureToTMethodSignature mSignatureToTMethodSignature,
			TMethod tMethod, MMethodDefinition eMethodDeclaration, TMethodDefinition tMethodDefinition,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDefinition_24_3_checkcsp_binding = pattern_MethodDefinition_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
				eMethodDeclaration, tMethodDefinition, sourceMatch, targetMatch);
		if (result_pattern_MethodDefinition_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_24_3_checkcsp_binding[0];

			Object[] result_pattern_MethodDefinition_24_3_checkcsp_black = pattern_MethodDefinition_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_MethodDefinition_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mSignature,
						mSignatureToTMethodSignature, tMethod, eMethodDeclaration, tMethodDefinition, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_24_4_createcorrespondence_blackBBBBBB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature, TMethod tMethod,
			MMethodDefinition eMethodDeclaration, TMethodDefinition tMethodDefinition, CCMatch isApplicableMatch) {
		return new Object[] { tMethodSignature, mSignature, tMethod, eMethodDeclaration, tMethodDefinition,
				isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinition_24_4_createcorrespondence_greenFBFFBBFBFFB(
			TMethodSignature tMethodSignature, TMethod tMethod, MMethodDefinition eMethodDeclaration,
			TMethodDefinition tMethodDefinition, CCMatch isApplicableMatch) {
		MDefinitionToTMember mDefinitionToTMember = ModiscoFactory.eINSTANCE.createMDefinitionToTMember();
		MethodDeclarationToTMethodDefinition mDeclarationToTDefinition = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethodDefinition();
		MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethodSignature();
		MethodDeclarationToTMethod eMethodDeclarationToTMethod = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethod();
		MDefinitionToTSignature mDefinitionToTSignature = ModiscoFactory.eINSTANCE.createMDefinitionToTSignature();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		mDefinitionToTMember.setSource(eMethodDeclaration);
		mDefinitionToTMember.setTarget(tMethodDefinition);
		isApplicableMatch.getCreateCorr().add(mDefinitionToTMember);
		mDeclarationToTDefinition.setSource(eMethodDeclaration);
		mDeclarationToTDefinition.setTarget(tMethodDefinition);
		isApplicableMatch.getCreateCorr().add(mDeclarationToTDefinition);
		eMethodDeclarationToTMethodSignature.setSource(eMethodDeclaration);
		eMethodDeclarationToTMethodSignature.setTarget(tMethodSignature);
		isApplicableMatch.getCreateCorr().add(eMethodDeclarationToTMethodSignature);
		eMethodDeclarationToTMethod.setSource(eMethodDeclaration);
		eMethodDeclarationToTMethod.setTarget(tMethod);
		isApplicableMatch.getCreateCorr().add(eMethodDeclarationToTMethod);
		mDefinitionToTSignature.setSource(eMethodDeclaration);
		mDefinitionToTSignature.setTarget(tMethodSignature);
		isApplicableMatch.getCreateCorr().add(mDefinitionToTSignature);
		mBodyToTAnnotation.setSource(eMethodDeclaration);
		mBodyToTAnnotation.setTarget(tMethodDefinition);
		isApplicableMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition,
				eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinition_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinition_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinition";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinition_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_0BB(
			MMethodDefinition eMethodDeclaration, MMethodSignature mSignature) {
		MMethodSignature __DEC_eMethodDeclaration_mMethodDefinitions_858944 = eMethodDeclaration.getMMethodSignature();
		if (__DEC_eMethodDeclaration_mMethodDefinitions_858944 != null) {
			if (!mSignature.equals(__DEC_eMethodDeclaration_mMethodDefinitions_858944)) {
				return new Object[] { eMethodDeclaration, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_blackBB(MMethodSignature mSignature,
			MMethodDefinition eMethodDeclaration) {
		if (mSignature.getMMethodDefinitions().contains(eMethodDeclaration)) {
			if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_0BB(eMethodDeclaration, mSignature) == null) {
				return new Object[] { mSignature, eMethodDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_28_1_matchtggpattern_blackBBB(
			TMethodSignature tMethodSignature, TMethod tMethod, TMethodDefinition tMethodDefinition) {
		if (tMethod.equals(tMethodSignature.getMethod())) {
			if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
				return new Object[] { tMethodSignature, tMethod, tMethodDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_29_1_createresult_blackB(MethodDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDefinition_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tMethodSignature) {
		if (ruleResult.getTargetObjects().contains(tMethodSignature)) {
			return new Object[] { ruleResult, tMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TMethod tMethod) {
		if (ruleResult.getTargetObjects().contains(tMethod)) {
			return new Object[] { ruleResult, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignatureToTMethodSignature mSignatureToTMethodSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTMethodSignature)) {
			return new Object[] { ruleResult, mSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSignatureToTMethodSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMSignatureToTMethodSignature : mSignatureToTMethodSignatureList.getEntryObjects()) {
				if (tmpMSignatureToTMethodSignature instanceof MMethodSignatureToTMethodSignature) {
					MMethodSignatureToTMethodSignature mSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) tmpMSignatureToTMethodSignature;
					TMethodSignature tMethodSignature = mSignatureToTMethodSignature.getTarget();
					if (tMethodSignature != null) {
						MMethodSignature mSignature = mSignatureToTMethodSignature.getSource();
						if (mSignature != null) {
							TMethod tMethod = tMethodSignature.getMethod();
							if (tMethod != null) {
								if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										mSignatureToTMethodSignature) == null) {
									if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											tMethodSignature) == null) {
										if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_3BB(ruleResult,
												mSignature) == null) {
											if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_1BB(ruleResult,
													tMethod) == null) {
												_result.add(new Object[] { mSignatureToTMethodSignatureList,
														tMethodSignature, tMethod, mSignatureToTMethodSignature,
														mSignature, ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_MethodDefinition_29_3_solveCSP_bindingFBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tMethodSignature, mSignature,
				mSignatureToTMethodSignature, tMethod, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mSignature,
					mSignatureToTMethodSignature, tMethod, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_29_3_solveCSP_bindingAndBlackFBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature, MMethodSignature mSignature,
			MMethodSignatureToTMethodSignature mSignatureToTMethodSignature, TMethod tMethod,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodDefinition_29_3_solveCSP_binding = pattern_MethodDefinition_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod,
				ruleResult);
		if (result_pattern_MethodDefinition_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_29_3_solveCSP_black = pattern_MethodDefinition_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mSignature,
						mSignatureToTMethodSignature, tMethod, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_29_4_checkCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_29_5_checknacs_blackBBBB(TMethodSignature tMethodSignature,
			MMethodSignature mSignature, MMethodSignatureToTMethodSignature mSignatureToTMethodSignature,
			TMethod tMethod) {
		return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod };
	}

	public static final Object[] pattern_MethodDefinition_29_6_perform_blackBBBBB(TMethodSignature tMethodSignature,
			MMethodSignature mSignature, MMethodSignatureToTMethodSignature mSignatureToTMethodSignature,
			TMethod tMethod, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tMethodSignature, mSignature, mSignatureToTMethodSignature, tMethod, ruleResult };
	}

	public static final Object[] pattern_MethodDefinition_29_6_perform_greenFBFBFBFFFFFBB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature, TMethod tMethod,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MDefinitionToTMember mDefinitionToTMember = ModiscoFactory.eINSTANCE.createMDefinitionToTMember();
		MethodDeclarationToTMethodDefinition mDeclarationToTDefinition = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethodDefinition();
		MethodDeclarationToTMethodSignature eMethodDeclarationToTMethodSignature = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethodSignature();
		MMethodDefinition eMethodDeclaration = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMMethodDefinition();
		MethodDeclarationToTMethod eMethodDeclarationToTMethod = ModiscoFactory.eINSTANCE
				.createMethodDeclarationToTMethod();
		TMethodDefinition tMethodDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		MDefinitionToTSignature mDefinitionToTSignature = ModiscoFactory.eINSTANCE.createMDefinitionToTSignature();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tMethodDefinition", "ID");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		ruleResult.getCorrObjects().add(mDeclarationToTDefinition);
		eMethodDeclarationToTMethodSignature.setTarget(tMethodSignature);
		ruleResult.getCorrObjects().add(eMethodDeclarationToTMethodSignature);
		mDefinitionToTMember.setSource(eMethodDeclaration);
		mDeclarationToTDefinition.setSource(eMethodDeclaration);
		mSignature.getMMethodDefinitions().add(eMethodDeclaration);
		eMethodDeclarationToTMethodSignature.setSource(eMethodDeclaration);
		ruleResult.getSourceObjects().add(eMethodDeclaration);
		eMethodDeclarationToTMethod.setSource(eMethodDeclaration);
		eMethodDeclarationToTMethod.setTarget(tMethod);
		ruleResult.getCorrObjects().add(eMethodDeclarationToTMethod);
		mDefinitionToTMember.setTarget(tMethodDefinition);
		tMethodSignature.getDefinitions().add(tMethodDefinition);
		mDeclarationToTDefinition.setTarget(tMethodDefinition);
		ruleResult.getTargetObjects().add(tMethodDefinition);
		mDefinitionToTSignature.setSource(eMethodDeclaration);
		mDefinitionToTSignature.setTarget(tMethodSignature);
		ruleResult.getCorrObjects().add(mDefinitionToTSignature);
		mBodyToTAnnotation.setSource(eMethodDeclaration);
		mBodyToTAnnotation.setTarget(tMethodDefinition);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		int tMethodDefinition_ID_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tMethodDefinition.setID(Integer.valueOf(tMethodDefinition_ID_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mDefinitionToTMember, tMethodSignature, mDeclarationToTDefinition, mSignature,
				eMethodDeclarationToTMethodSignature, tMethod, eMethodDeclaration, eMethodDeclarationToTMethod,
				tMethodDefinition, mDefinitionToTSignature, mBodyToTAnnotation, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodDefinition_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodDefinitionImpl
