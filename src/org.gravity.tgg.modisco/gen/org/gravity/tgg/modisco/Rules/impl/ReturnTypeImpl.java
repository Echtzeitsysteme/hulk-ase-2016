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

import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MMethodDefinition;

import org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition;

import org.gravity.tgg.modisco.Rules.ReturnType;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Return Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReturnTypeImpl extends AbstractRuleImpl implements ReturnType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getReturnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition mDefinition, TypeAccess eTypeAccess,
			Type eReturnType) {
		// initial bindings
		Object[] result1_black = ReturnTypeImpl.pattern_ReturnType_0_1_initialbindings_blackBBBBB(this, match,
				mDefinition, eTypeAccess, eReturnType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eReturnType] = " + eReturnType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ReturnTypeImpl.pattern_ReturnType_0_2_SolveCSP_bindingAndBlackFBBBBB(this,
				match, mDefinition, eTypeAccess, eReturnType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eReturnType] = " + eReturnType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ReturnTypeImpl.pattern_ReturnType_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ReturnTypeImpl.pattern_ReturnType_0_4_collectelementstobetranslated_blackBBBB(
					match, mDefinition, eTypeAccess, eReturnType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eReturnType] = " + eReturnType + ".");
			}
			ReturnTypeImpl.pattern_ReturnType_0_4_collectelementstobetranslated_greenBBBBFFF(match, mDefinition,
					eTypeAccess, eReturnType);
			// EMoflonEdge mDefinition__eTypeAccess____returnType = (EMoflonEdge) result4_green[4];
			// EMoflonEdge eTypeAccess__eReturnType____type = (EMoflonEdge) result4_green[5];
			// EMoflonEdge eReturnType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = ReturnTypeImpl.pattern_ReturnType_0_5_collectcontextelements_blackBBBB(match,
					mDefinition, eTypeAccess, eReturnType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eReturnType] = " + eReturnType + ".");
			}
			ReturnTypeImpl.pattern_ReturnType_0_5_collectcontextelements_greenBBB(match, mDefinition, eReturnType);

			// register objects to match
			ReturnTypeImpl.pattern_ReturnType_0_6_registerobjectstomatch_expressionBBBBB(this, match, mDefinition,
					eTypeAccess, eReturnType);
			return ReturnTypeImpl.pattern_ReturnType_0_7_expressionF();
		} else {
			return ReturnTypeImpl.pattern_ReturnType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ReturnTypeImpl
				.pattern_ReturnType_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition mDefinition = (MMethodDefinition) result1_bindingAndBlack[0];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[1];
		Type eReturnType = (Type) result1_bindingAndBlack[2];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[3];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[4];
		TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[5];
		MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		ReturnTypeImpl.pattern_ReturnType_1_1_performtransformation_greenBB(tAbstractType, tMethodDefinition);

		// collect translated elements
		Object[] result2_black = ReturnTypeImpl.pattern_ReturnType_1_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ReturnTypeImpl.pattern_ReturnType_1_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ReturnTypeImpl.pattern_ReturnType_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
				mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
				eMethodDeclarationToTMethodDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eReturnType] = " + eReturnType + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[tMethodDefinition] = " + tMethodDefinition + ", "
					+ "[eReturnTypeToTAbstractType] = " + eReturnTypeToTAbstractType + ", "
					+ "[eMethodDeclarationToTMethodDefinition] = " + eMethodDeclarationToTMethodDefinition + ".");
		}
		ReturnTypeImpl.pattern_ReturnType_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, mDefinition, eTypeAccess,
				eReturnType, tAbstractType, tMethodDefinition);
		// EMoflonEdge mDefinition__eTypeAccess____returnType = (EMoflonEdge) result3_green[6];
		// EMoflonEdge eTypeAccess__eReturnType____type = (EMoflonEdge) result3_green[7];
		// EMoflonEdge eReturnType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tMethodDefinition__tAbstractType____returnType = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		ReturnTypeImpl.pattern_ReturnType_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, mDefinition,
				eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
				eMethodDeclarationToTMethodDefinition);
		return ReturnTypeImpl.pattern_ReturnType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeImpl
				.pattern_ReturnType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeImpl.pattern_ReturnType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ReturnTypeImpl.pattern_ReturnType_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition mDefinition = (MMethodDefinition) result2_binding[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[1];
		Type eReturnType = (Type) result2_binding[2];
		for (Object[] result2_black : ReturnTypeImpl.pattern_ReturnType_2_2_corematch_blackBBBFFFFB(mDefinition,
				eTypeAccess, eReturnType, match)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[3];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[4];
			TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) result2_black[5];
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ReturnTypeImpl.pattern_ReturnType_2_3_findcontext_blackBBBBBBB(mDefinition,
					eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
					eMethodDeclarationToTMethodDefinition)) {
				Object[] result3_green = ReturnTypeImpl.pattern_ReturnType_2_3_findcontext_greenBBBBBBBFFFFFFFF(
						mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
						eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge mDefinition__eTypeAccess____returnType = (EMoflonEdge) result3_green[8];
				// EMoflonEdge eTypeAccess__eReturnType____type = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eReturnType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eReturnTypeToTAbstractType__eReturnType____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eReturnTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eMethodDeclarationToTMethodDefinition__mDefinition____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge eMethodDeclarationToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = ReturnTypeImpl
						.pattern_ReturnType_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mDefinition,
								eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
								eMethodDeclarationToTMethodDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
							+ "[eReturnType] = " + eReturnType + ", " + "[tAbstractType] = " + tAbstractType + ", "
							+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[eReturnTypeToTAbstractType] = "
							+ eReturnTypeToTAbstractType + ", " + "[eMethodDeclarationToTMethodDefinition] = "
							+ eMethodDeclarationToTMethodDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ReturnTypeImpl.pattern_ReturnType_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ReturnTypeImpl
							.pattern_ReturnType_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ReturnTypeImpl.pattern_ReturnType_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ReturnTypeImpl.pattern_ReturnType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition mDefinition, TypeAccess eTypeAccess,
			Type eReturnType) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eReturnType", eReturnType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition mDefinition, TypeAccess eTypeAccess,
			Type eReturnType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition,
			TypeAccess eTypeAccess, Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eReturnType", eReturnType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("eReturnTypeToTAbstractType", eReturnTypeToTAbstractType);
		isApplicableMatch.registerObject("eMethodDeclarationToTMethodDefinition",
				eMethodDeclarationToTMethodDefinition);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mDefinition, EObject eTypeAccess,
			EObject eReturnType, EObject tAbstractType, EObject tMethodDefinition, EObject eReturnTypeToTAbstractType,
			EObject eMethodDeclarationToTMethodDefinition) {
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eReturnType", eReturnType);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("eReturnTypeToTAbstractType", eReturnTypeToTAbstractType);
		ruleresult.registerObject("eMethodDeclarationToTMethodDefinition", eMethodDeclarationToTMethodDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		// initial bindings
		Object[] result1_black = ReturnTypeImpl.pattern_ReturnType_10_1_initialbindings_blackBBBB(this, match,
				tAbstractType, tMethodDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType
					+ ", " + "[tMethodDefinition] = " + tMethodDefinition + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ReturnTypeImpl.pattern_ReturnType_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, tAbstractType, tMethodDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[tMethodDefinition] = " + tMethodDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ReturnTypeImpl.pattern_ReturnType_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ReturnTypeImpl.pattern_ReturnType_10_4_collectelementstobetranslated_blackBBB(
					match, tAbstractType, tMethodDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tMethodDefinition] = " + tMethodDefinition + ".");
			}
			ReturnTypeImpl.pattern_ReturnType_10_4_collectelementstobetranslated_greenBBBF(match, tAbstractType,
					tMethodDefinition);
			// EMoflonEdge tMethodDefinition__tAbstractType____returnType = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ReturnTypeImpl.pattern_ReturnType_10_5_collectcontextelements_blackBBB(match,
					tAbstractType, tMethodDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tMethodDefinition] = " + tMethodDefinition + ".");
			}
			ReturnTypeImpl.pattern_ReturnType_10_5_collectcontextelements_greenBBB(match, tAbstractType,
					tMethodDefinition);

			// register objects to match
			ReturnTypeImpl.pattern_ReturnType_10_6_registerobjectstomatch_expressionBBBB(this, match, tAbstractType,
					tMethodDefinition);
			return ReturnTypeImpl.pattern_ReturnType_10_7_expressionF();
		} else {
			return ReturnTypeImpl.pattern_ReturnType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ReturnTypeImpl
				.pattern_ReturnType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition mDefinition = (MMethodDefinition) result1_bindingAndBlack[0];
		Type eReturnType = (Type) result1_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[2];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[3];
		TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[4];
		MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ReturnTypeImpl.pattern_ReturnType_11_1_performtransformation_greenBFB(mDefinition,
				eReturnType);
		TypeAccess eTypeAccess = (TypeAccess) result1_green[1];

		// collect translated elements
		Object[] result2_black = ReturnTypeImpl.pattern_ReturnType_11_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ReturnTypeImpl.pattern_ReturnType_11_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ReturnTypeImpl.pattern_ReturnType_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
				mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
				eMethodDeclarationToTMethodDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eReturnType] = " + eReturnType + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[tMethodDefinition] = " + tMethodDefinition + ", "
					+ "[eReturnTypeToTAbstractType] = " + eReturnTypeToTAbstractType + ", "
					+ "[eMethodDeclarationToTMethodDefinition] = " + eMethodDeclarationToTMethodDefinition + ".");
		}
		ReturnTypeImpl.pattern_ReturnType_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, mDefinition, eTypeAccess,
				eReturnType, tAbstractType, tMethodDefinition);
		// EMoflonEdge mDefinition__eTypeAccess____returnType = (EMoflonEdge) result3_green[6];
		// EMoflonEdge eTypeAccess__eReturnType____type = (EMoflonEdge) result3_green[7];
		// EMoflonEdge eReturnType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tMethodDefinition__tAbstractType____returnType = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		ReturnTypeImpl.pattern_ReturnType_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, mDefinition,
				eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
				eMethodDeclarationToTMethodDefinition);
		return ReturnTypeImpl.pattern_ReturnType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeImpl
				.pattern_ReturnType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReturnTypeImpl.pattern_ReturnType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ReturnTypeImpl.pattern_ReturnType_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tAbstractType = (TAbstractType) result2_binding[0];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[1];
		for (Object[] result2_black : ReturnTypeImpl.pattern_ReturnType_12_2_corematch_blackFFBBFFB(tAbstractType,
				tMethodDefinition, match)) {
			MMethodDefinition mDefinition = (MMethodDefinition) result2_black[0];
			Type eReturnType = (Type) result2_black[1];
			TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) result2_black[4];
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ReturnTypeImpl.pattern_ReturnType_12_3_findcontext_blackBBBBBB(mDefinition,
					eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
					eMethodDeclarationToTMethodDefinition)) {
				Object[] result3_green = ReturnTypeImpl.pattern_ReturnType_12_3_findcontext_greenBBBBBBFFFFFF(
						mDefinition, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
						eMethodDeclarationToTMethodDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge tMethodDefinition__tAbstractType____returnType = (EMoflonEdge) result3_green[7];
				// EMoflonEdge eReturnTypeToTAbstractType__eReturnType____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge eReturnTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eMethodDeclarationToTMethodDefinition__mDefinition____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eMethodDeclarationToTMethodDefinition__tMethodDefinition____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = ReturnTypeImpl
						.pattern_ReturnType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, mDefinition,
								eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
								eMethodDeclarationToTMethodDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[eReturnType] = " + eReturnType + ", "
							+ "[tAbstractType] = " + tAbstractType + ", " + "[tMethodDefinition] = " + tMethodDefinition
							+ ", " + "[eReturnTypeToTAbstractType] = " + eReturnTypeToTAbstractType + ", "
							+ "[eMethodDeclarationToTMethodDefinition] = " + eMethodDeclarationToTMethodDefinition
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ReturnTypeImpl.pattern_ReturnType_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ReturnTypeImpl
							.pattern_ReturnType_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ReturnTypeImpl.pattern_ReturnType_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ReturnTypeImpl.pattern_ReturnType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition) {
		match.registerObject("tAbstractType", tAbstractType);
		match.registerObject("tMethodDefinition", tMethodDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition,
			Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("eReturnType", eReturnType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("eReturnTypeToTAbstractType", eReturnTypeToTAbstractType);
		isApplicableMatch.registerObject("eMethodDeclarationToTMethodDefinition",
				eMethodDeclarationToTMethodDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mDefinition, EObject eTypeAccess,
			EObject eReturnType, EObject tAbstractType, EObject tMethodDefinition, EObject eReturnTypeToTAbstractType,
			EObject eMethodDeclarationToTMethodDefinition) {
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eReturnType", eReturnType);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("eReturnTypeToTAbstractType", eReturnTypeToTAbstractType);
		ruleresult.registerObject("eMethodDeclarationToTMethodDefinition", eMethodDeclarationToTMethodDefinition);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_41(EMoflonEdge _edge_returnType) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeImpl
				.pattern_ReturnType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ReturnTypeImpl.pattern_ReturnType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ReturnTypeImpl
				.pattern_ReturnType_20_2_testcorematchandDECs_blackFFFB(_edge_returnType)) {
			MMethodDefinition mDefinition = (MMethodDefinition) result2_black[0];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[1];
			Type eReturnType = (Type) result2_black[2];
			Object[] result2_green = ReturnTypeImpl.pattern_ReturnType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ReturnTypeImpl.pattern_ReturnType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
					match, mDefinition, eTypeAccess, eReturnType)) {
				// Ensure that the correct types of elements are matched
				if (ReturnTypeImpl.pattern_ReturnType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = ReturnTypeImpl.pattern_ReturnType_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ReturnTypeImpl.pattern_ReturnType_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ReturnTypeImpl.pattern_ReturnType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_38(EMoflonEdge _edge_returnType) {
		// prepare return value
		Object[] result1_bindingAndBlack = ReturnTypeImpl
				.pattern_ReturnType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ReturnTypeImpl.pattern_ReturnType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ReturnTypeImpl
				.pattern_ReturnType_21_2_testcorematchandDECs_blackFFB(_edge_returnType)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[0];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[1];
			Object[] result2_green = ReturnTypeImpl.pattern_ReturnType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ReturnTypeImpl.pattern_ReturnType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, tAbstractType, tMethodDefinition)) {
				// Ensure that the correct types of elements are matched
				if (ReturnTypeImpl.pattern_ReturnType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = ReturnTypeImpl.pattern_ReturnType_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ReturnTypeImpl.pattern_ReturnType_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ReturnTypeImpl.pattern_ReturnType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ReturnType");
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
		ruleResult.setRule("ReturnType");
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
		Object[] result1_black = ReturnTypeImpl.pattern_ReturnType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ReturnTypeImpl.pattern_ReturnType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ReturnTypeImpl.pattern_ReturnType_24_2_matchcontext_bindingFFFFFBB(sourceMatch,
				targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodDefinition mDefinition = (MMethodDefinition) result2_binding[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[1];
		Type eReturnType = (Type) result2_binding[2];
		TAbstractType tAbstractType = (TAbstractType) result2_binding[3];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[4];
		for (Object[] result2_black : ReturnTypeImpl.pattern_ReturnType_24_2_matchcontext_blackBBBBBFFBB(mDefinition,
				eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, sourceMatch, targetMatch)) {
			TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) result2_black[5];
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) result2_black[6];
			Object[] result2_green = ReturnTypeImpl.pattern_ReturnType_24_2_matchcontext_greenBBBBBBBBFB(mDefinition,
					eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
					eMethodDeclarationToTMethodDefinition, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[8];

			// check csp
			Object[] result3_bindingAndBlack = ReturnTypeImpl
					.pattern_ReturnType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, mDefinition,
							eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
							eMethodDeclarationToTMethodDefinition, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = ReturnTypeImpl.pattern_ReturnType_24_4_createcorrespondence_blackBBBBBB(
						mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mDefinition] = " + mDefinition + ", " + "[eTypeAccess] = "
							+ eTypeAccess + ", " + "[eReturnType] = " + eReturnType + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[tMethodDefinition] = " + tMethodDefinition + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = ReturnTypeImpl.pattern_ReturnType_24_5_addtoreturnedresult_blackBB(result,
						isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ReturnTypeImpl.pattern_ReturnType_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return ReturnTypeImpl.pattern_ReturnType_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MMethodDefinition mDefinition,
			TypeAccess eTypeAccess, Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eReturnType", eReturnType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("eReturnTypeToTAbstractType", eReturnTypeToTAbstractType);
		isApplicableMatch.registerObject("eMethodDeclarationToTMethodDefinition",
				eMethodDeclarationToTMethodDefinition);
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
	public boolean checkDEC_FWD(MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {// match tgg pattern
		Object[] result1_black = ReturnTypeImpl.pattern_ReturnType_27_1_matchtggpattern_blackBBB(mDefinition,
				eTypeAccess, eReturnType);
		if (result1_black != null) {
			return ReturnTypeImpl.pattern_ReturnType_27_2_expressionF();
		} else {
			return ReturnTypeImpl.pattern_ReturnType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {// match tgg pattern
		Object[] result1_black = ReturnTypeImpl.pattern_ReturnType_28_1_matchtggpattern_blackBB(tAbstractType,
				tMethodDefinition);
		if (result1_black != null) {
			return ReturnTypeImpl.pattern_ReturnType_28_2_expressionF();
		} else {
			return ReturnTypeImpl.pattern_ReturnType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinitionParameter,
			TypeToTAbstractType eReturnTypeToTAbstractTypeParameter) {
		// create result
		Object[] result1_black = ReturnTypeImpl.pattern_ReturnType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ReturnTypeImpl.pattern_ReturnType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ReturnTypeImpl
				.pattern_ReturnType_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eMethodDeclarationToTMethodDefinitionList = (RuleEntryList) result2_black[0];
			MMethodDefinition mDefinition = (MMethodDefinition) result2_black[1];
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) result2_black[2];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[3];
			// RuleEntryList eReturnTypeToTAbstractTypeList = (RuleEntryList) result2_black[4];
			Type eReturnType = (Type) result2_black[5];
			TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) result2_black[6];
			TAbstractType tAbstractType = (TAbstractType) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = ReturnTypeImpl
					.pattern_ReturnType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mDefinition,
							eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
							eMethodDeclarationToTMethodDefinition, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinition] = "
						+ mDefinition + ", " + "[eReturnType] = " + eReturnType + ", " + "[tAbstractType] = "
						+ tAbstractType + ", " + "[tMethodDefinition] = " + tMethodDefinition + ", "
						+ "[eReturnTypeToTAbstractType] = " + eReturnTypeToTAbstractType + ", "
						+ "[eMethodDeclarationToTMethodDefinition] = " + eMethodDeclarationToTMethodDefinition + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ReturnTypeImpl.pattern_ReturnType_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ReturnTypeImpl.pattern_ReturnType_29_5_checknacs_blackBBBBBB(mDefinition,
						eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
						eMethodDeclarationToTMethodDefinition);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ReturnTypeImpl.pattern_ReturnType_29_6_perform_blackBBBBBBB(mDefinition,
							eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
							eMethodDeclarationToTMethodDefinition, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mDefinition] = " + mDefinition + ", " + "[eReturnType] = " + eReturnType + ", "
								+ "[tAbstractType] = " + tAbstractType + ", " + "[tMethodDefinition] = "
								+ tMethodDefinition + ", " + "[eReturnTypeToTAbstractType] = "
								+ eReturnTypeToTAbstractType + ", " + "[eMethodDeclarationToTMethodDefinition] = "
								+ eMethodDeclarationToTMethodDefinition + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ReturnTypeImpl.pattern_ReturnType_29_6_perform_greenBFBBBB(mDefinition, eReturnType, tAbstractType,
							tMethodDefinition, ruleResult);
					// TypeAccess eTypeAccess = (TypeAccess) result6_green[1];

				} else {
				}

			} else {
			}

		}
		return ReturnTypeImpl.pattern_ReturnType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition,
			Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("eReturnType", eReturnType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("eReturnTypeToTAbstractType", eReturnTypeToTAbstractType);
		isApplicableMatch.registerObject("eMethodDeclarationToTMethodDefinition",
				eMethodDeclarationToTMethodDefinition);
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
		case RulesPackage.RETURN_TYPE___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.RETURN_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.RETURN_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.RETURN_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TYPEACCESS_TYPE_TABSTRACTTYPE_TMETHODDEFINITION_TYPETOTABSTRACTTYPE_METHODDECLARATIONTOTMETHODDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (TAbstractType) arguments.get(4),
					(TMethodDefinition) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(MethodDeclarationToTMethodDefinition) arguments.get(7));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.RETURN_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.RETURN_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
			return null;
		case RulesPackage.RETURN_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.RETURN_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TYPE_TABSTRACTTYPE_TMETHODDEFINITION_TYPETOTABSTRACTTYPE_METHODDECLARATIONTOTMETHODDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(Type) arguments.get(2), (TAbstractType) arguments.get(3), (TMethodDefinition) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (MethodDeclarationToTMethodDefinition) arguments.get(6));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.RETURN_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.RETURN_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_41((EMoflonEdge) arguments.get(0));
		case RulesPackage.RETURN_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.RETURN_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MMETHODDEFINITION_TYPEACCESS_TYPE_TABSTRACTTYPE_TMETHODDEFINITION_TYPETOTABSTRACTTYPE_METHODDECLARATIONTOTMETHODDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (TAbstractType) arguments.get(4),
					(TMethodDefinition) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(MethodDeclarationToTMethodDefinition) arguments.get(7), (Match) arguments.get(8),
					(Match) arguments.get(9));
		case RulesPackage.RETURN_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.RETURN_TYPE___CHECK_DEC_FWD__MMETHODDEFINITION_TYPEACCESS_TYPE:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.RETURN_TYPE___CHECK_DEC_BWD__TABSTRACTTYPE_TMETHODDEFINITION:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TMethodDefinition) arguments.get(1));
		case RulesPackage.RETURN_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_METHODDECLARATIONTOTMETHODDEFINITION_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(MethodDeclarationToTMethodDefinition) arguments.get(1), (TypeToTAbstractType) arguments.get(2));
		case RulesPackage.RETURN_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TYPE_TABSTRACTTYPE_TMETHODDEFINITION_TYPETOTABSTRACTTYPE_METHODDECLARATIONTOTMETHODDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodDefinition) arguments.get(1), (Type) arguments.get(2), (TAbstractType) arguments.get(3),
					(TMethodDefinition) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(MethodDeclarationToTMethodDefinition) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.RETURN_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ReturnType_0_1_initialbindings_blackBBBBB(ReturnType _this, Match match,
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {
		return new Object[] { _this, match, mDefinition, eTypeAccess, eReturnType };
	}

	public static final Object[] pattern_ReturnType_0_2_SolveCSP_bindingFBBBBB(ReturnType _this, Match match,
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, eTypeAccess, eReturnType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, eTypeAccess, eReturnType };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnType_0_2_SolveCSP_bindingAndBlackFBBBBB(ReturnType _this, Match match,
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {
		Object[] result_pattern_ReturnType_0_2_SolveCSP_binding = pattern_ReturnType_0_2_SolveCSP_bindingFBBBBB(_this,
				match, mDefinition, eTypeAccess, eReturnType);
		if (result_pattern_ReturnType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ReturnType_0_2_SolveCSP_black = pattern_ReturnType_0_2_SolveCSP_blackB(csp);
			if (result_pattern_ReturnType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, eTypeAccess, eReturnType };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnType_0_3_CheckCSP_expressionFBB(ReturnType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnType_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {
		return new Object[] { match, mDefinition, eTypeAccess, eReturnType };
	}

	public static final Object[] pattern_ReturnType_0_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {
		EMoflonEdge mDefinition__eTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eReturnType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eReturnType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String mDefinition__eTypeAccess____returnType_name_prime = "returnType";
		String eTypeAccess__eReturnType____type_name_prime = "type";
		String eReturnType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		mDefinition__eTypeAccess____returnType.setSrc(mDefinition);
		mDefinition__eTypeAccess____returnType.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(mDefinition__eTypeAccess____returnType);
		eTypeAccess__eReturnType____type.setSrc(eTypeAccess);
		eTypeAccess__eReturnType____type.setTrg(eReturnType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eReturnType____type);
		eReturnType__eTypeAccess____usagesInTypeAccess.setSrc(eReturnType);
		eReturnType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eReturnType__eTypeAccess____usagesInTypeAccess);
		mDefinition__eTypeAccess____returnType.setName(mDefinition__eTypeAccess____returnType_name_prime);
		eTypeAccess__eReturnType____type.setName(eTypeAccess__eReturnType____type_name_prime);
		eReturnType__eTypeAccess____usagesInTypeAccess
				.setName(eReturnType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, mDefinition, eTypeAccess, eReturnType, mDefinition__eTypeAccess____returnType,
				eTypeAccess__eReturnType____type, eReturnType__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ReturnType_0_5_collectcontextelements_blackBBBB(Match match,
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {
		return new Object[] { match, mDefinition, eTypeAccess, eReturnType };
	}

	public static final Object[] pattern_ReturnType_0_5_collectcontextelements_greenBBB(Match match,
			MMethodDefinition mDefinition, Type eReturnType) {
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(eReturnType);
		return new Object[] { match, mDefinition, eReturnType };
	}

	public static final void pattern_ReturnType_0_6_registerobjectstomatch_expressionBBBBB(ReturnType _this,
			Match match, MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, eTypeAccess, eReturnType);

	}

	public static final boolean pattern_ReturnType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReturnType_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ReturnType_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("eReturnType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMethodDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("eReturnTypeToTAbstractType");
		EObject _localVariable_6 = isApplicableMatch.getObject("eMethodDeclarationToTMethodDefinition");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpEReturnType = _localVariable_2;
		EObject tmpTAbstractType = _localVariable_3;
		EObject tmpTMethodDefinition = _localVariable_4;
		EObject tmpEReturnTypeToTAbstractType = _localVariable_5;
		EObject tmpEMethodDeclarationToTMethodDefinition = _localVariable_6;
		if (tmpMDefinition instanceof MMethodDefinition) {
			MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpEReturnType instanceof Type) {
					Type eReturnType = (Type) tmpEReturnType;
					if (tmpTAbstractType instanceof TAbstractType) {
						TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
						if (tmpTMethodDefinition instanceof TMethodDefinition) {
							TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
							if (tmpEReturnTypeToTAbstractType instanceof TypeToTAbstractType) {
								TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) tmpEReturnTypeToTAbstractType;
								if (tmpEMethodDeclarationToTMethodDefinition instanceof MethodDeclarationToTMethodDefinition) {
									MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) tmpEMethodDeclarationToTMethodDefinition;
									return new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType,
											tMethodDefinition, eReturnTypeToTAbstractType,
											eMethodDeclarationToTMethodDefinition, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_1_1_performtransformation_blackBBBBBBBFBB(
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType, TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition, TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition, ReturnType _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
						eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ReturnType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReturnType_1_1_performtransformation_binding = pattern_ReturnType_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ReturnType_1_1_performtransformation_binding != null) {
			MMethodDefinition mDefinition = (MMethodDefinition) result_pattern_ReturnType_1_1_performtransformation_binding[0];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ReturnType_1_1_performtransformation_binding[1];
			Type eReturnType = (Type) result_pattern_ReturnType_1_1_performtransformation_binding[2];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ReturnType_1_1_performtransformation_binding[3];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_ReturnType_1_1_performtransformation_binding[4];
			TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) result_pattern_ReturnType_1_1_performtransformation_binding[5];
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) result_pattern_ReturnType_1_1_performtransformation_binding[6];

			Object[] result_pattern_ReturnType_1_1_performtransformation_black = pattern_ReturnType_1_1_performtransformation_blackBBBBBBBFBB(
					mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
					eMethodDeclarationToTMethodDefinition, _this, isApplicableMatch);
			if (result_pattern_ReturnType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ReturnType_1_1_performtransformation_black[7];

				return new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
						eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_1_1_performtransformation_greenBB(TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition) {
		tMethodDefinition.setReturnType(tAbstractType);
		return new Object[] { tAbstractType, tMethodDefinition };
	}

	public static final Object[] pattern_ReturnType_1_2_collecttranslatedelements_blackB(TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ReturnType_1_2_collecttranslatedelements_greenFB(TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ReturnType_1_3_bookkeepingforedges_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject mDefinition, EObject eTypeAccess, EObject eReturnType, EObject tAbstractType,
			EObject tMethodDefinition, EObject eReturnTypeToTAbstractType,
			EObject eMethodDeclarationToTMethodDefinition) {
		if (!mDefinition.equals(tAbstractType)) {
			if (!mDefinition.equals(tMethodDefinition)) {
				if (!eTypeAccess.equals(mDefinition)) {
					if (!eTypeAccess.equals(tAbstractType)) {
						if (!eTypeAccess.equals(tMethodDefinition)) {
							if (!eReturnType.equals(mDefinition)) {
								if (!eReturnType.equals(eTypeAccess)) {
									if (!eReturnType.equals(tAbstractType)) {
										if (!eReturnType.equals(tMethodDefinition)) {
											if (!eReturnType.equals(eReturnTypeToTAbstractType)) {
												if (!tAbstractType.equals(tMethodDefinition)) {
													if (!eReturnTypeToTAbstractType.equals(mDefinition)) {
														if (!eReturnTypeToTAbstractType.equals(eTypeAccess)) {
															if (!eReturnTypeToTAbstractType.equals(tAbstractType)) {
																if (!eReturnTypeToTAbstractType
																		.equals(tMethodDefinition)) {
																	if (!eMethodDeclarationToTMethodDefinition
																			.equals(mDefinition)) {
																		if (!eMethodDeclarationToTMethodDefinition
																				.equals(eTypeAccess)) {
																			if (!eMethodDeclarationToTMethodDefinition
																					.equals(eReturnType)) {
																				if (!eMethodDeclarationToTMethodDefinition
																						.equals(tAbstractType)) {
																					if (!eMethodDeclarationToTMethodDefinition
																							.equals(tMethodDefinition)) {
																						if (!eMethodDeclarationToTMethodDefinition
																								.equals(eReturnTypeToTAbstractType)) {
																							return new Object[] {
																									ruleresult,
																									mDefinition,
																									eTypeAccess,
																									eReturnType,
																									tAbstractType,
																									tMethodDefinition,
																									eReturnTypeToTAbstractType,
																									eMethodDeclarationToTMethodDefinition };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ReturnType_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mDefinition, EObject eTypeAccess, EObject eReturnType,
			EObject tAbstractType, EObject tMethodDefinition) {
		EMoflonEdge mDefinition__eTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eReturnType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eReturnType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReturnType";
		String mDefinition__eTypeAccess____returnType_name_prime = "returnType";
		String eTypeAccess__eReturnType____type_name_prime = "type";
		String eReturnType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tMethodDefinition__tAbstractType____returnType_name_prime = "returnType";
		mDefinition__eTypeAccess____returnType.setSrc(mDefinition);
		mDefinition__eTypeAccess____returnType.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(mDefinition__eTypeAccess____returnType);
		eTypeAccess__eReturnType____type.setSrc(eTypeAccess);
		eTypeAccess__eReturnType____type.setTrg(eReturnType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eReturnType____type);
		eReturnType__eTypeAccess____usagesInTypeAccess.setSrc(eReturnType);
		eReturnType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eReturnType__eTypeAccess____usagesInTypeAccess);
		tMethodDefinition__tAbstractType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tAbstractType____returnType.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tMethodDefinition__tAbstractType____returnType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinition__eTypeAccess____returnType.setName(mDefinition__eTypeAccess____returnType_name_prime);
		eTypeAccess__eReturnType____type.setName(eTypeAccess__eReturnType____type_name_prime);
		eReturnType__eTypeAccess____usagesInTypeAccess
				.setName(eReturnType__eTypeAccess____usagesInTypeAccess_name_prime);
		tMethodDefinition__tAbstractType____returnType
				.setName(tMethodDefinition__tAbstractType____returnType_name_prime);
		return new Object[] { ruleresult, mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				mDefinition__eTypeAccess____returnType, eTypeAccess__eReturnType____type,
				eReturnType__eTypeAccess____usagesInTypeAccess, tMethodDefinition__tAbstractType____returnType };
	}

	public static final void pattern_ReturnType_1_5_registerobjects_expressionBBBBBBBBB(ReturnType _this,
			PerformRuleResult ruleresult, EObject mDefinition, EObject eTypeAccess, EObject eReturnType,
			EObject tAbstractType, EObject tMethodDefinition, EObject eReturnTypeToTAbstractType,
			EObject eMethodDeclarationToTMethodDefinition) {
		_this.registerObjects_FWD(ruleresult, mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition);

	}

	public static final PerformRuleResult pattern_ReturnType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnType_2_1_preparereturnvalue_bindingFB(ReturnType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_2_1_preparereturnvalue_blackFBB(EClass eClass, ReturnType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnType_2_1_preparereturnvalue_bindingAndBlackFFB(ReturnType _this) {
		Object[] result_pattern_ReturnType_2_1_preparereturnvalue_binding = pattern_ReturnType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReturnType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ReturnType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReturnType_2_1_preparereturnvalue_black = pattern_ReturnType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ReturnType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReturnType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ReturnType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReturnType_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("eTypeAccess");
		EObject _localVariable_2 = match.getObject("eReturnType");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpEReturnType = _localVariable_2;
		if (tmpMDefinition instanceof MMethodDefinition) {
			MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpEReturnType instanceof Type) {
					Type eReturnType = (Type) tmpEReturnType;
					return new Object[] { mDefinition, eTypeAccess, eReturnType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnType_2_2_corematch_blackBBBFFFFB(MMethodDefinition mDefinition,
			TypeAccess eTypeAccess, Type eReturnType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType eReturnTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eReturnType, TypeToTAbstractType.class, "source")) {
			TAbstractType tAbstractType = eReturnTypeToTAbstractType.getTarget();
			if (tAbstractType != null) {
				for (MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mDefinition, MethodDeclarationToTMethodDefinition.class, "source")) {
					TMethodDefinition tMethodDefinition = eMethodDeclarationToTMethodDefinition.getTarget();
					if (tMethodDefinition != null) {
						_result.add(
								new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
										eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReturnType_2_3_findcontext_blackBBBBBBB(
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType, TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition, TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eTypeAccess.equals(mDefinition.getReturnType())) {
			if (eReturnType.equals(eTypeAccess.getType())) {
				if (eReturnType.equals(eReturnTypeToTAbstractType.getSource())) {
					if (tAbstractType.equals(eReturnTypeToTAbstractType.getTarget())) {
						if (mDefinition.equals(eMethodDeclarationToTMethodDefinition.getSource())) {
							if (tMethodDefinition.equals(eMethodDeclarationToTMethodDefinition.getTarget())) {
								_result.add(new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType,
										tMethodDefinition, eReturnTypeToTAbstractType,
										eMethodDeclarationToTMethodDefinition });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReturnType_2_3_findcontext_greenBBBBBBBFFFFFFFF(MMethodDefinition mDefinition,
			TypeAccess eTypeAccess, Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mDefinition__eTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eReturnType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eReturnType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eReturnTypeToTAbstractType__eReturnType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eReturnTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethodDefinition__mDefinition____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethodDefinition__tMethodDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String mDefinition__eTypeAccess____returnType_name_prime = "returnType";
		String eTypeAccess__eReturnType____type_name_prime = "type";
		String eReturnType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eReturnTypeToTAbstractType__eReturnType____source_name_prime = "source";
		String eReturnTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String eMethodDeclarationToTMethodDefinition__mDefinition____source_name_prime = "source";
		String eMethodDeclarationToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eReturnType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(eReturnTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(eMethodDeclarationToTMethodDefinition);
		mDefinition__eTypeAccess____returnType.setSrc(mDefinition);
		mDefinition__eTypeAccess____returnType.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(mDefinition__eTypeAccess____returnType);
		eTypeAccess__eReturnType____type.setSrc(eTypeAccess);
		eTypeAccess__eReturnType____type.setTrg(eReturnType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eReturnType____type);
		eReturnType__eTypeAccess____usagesInTypeAccess.setSrc(eReturnType);
		eReturnType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eReturnType__eTypeAccess____usagesInTypeAccess);
		eReturnTypeToTAbstractType__eReturnType____source.setSrc(eReturnTypeToTAbstractType);
		eReturnTypeToTAbstractType__eReturnType____source.setTrg(eReturnType);
		isApplicableMatch.getAllContextElements().add(eReturnTypeToTAbstractType__eReturnType____source);
		eReturnTypeToTAbstractType__tAbstractType____target.setSrc(eReturnTypeToTAbstractType);
		eReturnTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eReturnTypeToTAbstractType__tAbstractType____target);
		eMethodDeclarationToTMethodDefinition__mDefinition____source.setSrc(eMethodDeclarationToTMethodDefinition);
		eMethodDeclarationToTMethodDefinition__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(eMethodDeclarationToTMethodDefinition__mDefinition____source);
		eMethodDeclarationToTMethodDefinition__tMethodDefinition____target
				.setSrc(eMethodDeclarationToTMethodDefinition);
		eMethodDeclarationToTMethodDefinition__tMethodDefinition____target.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements()
				.add(eMethodDeclarationToTMethodDefinition__tMethodDefinition____target);
		mDefinition__eTypeAccess____returnType.setName(mDefinition__eTypeAccess____returnType_name_prime);
		eTypeAccess__eReturnType____type.setName(eTypeAccess__eReturnType____type_name_prime);
		eReturnType__eTypeAccess____usagesInTypeAccess
				.setName(eReturnType__eTypeAccess____usagesInTypeAccess_name_prime);
		eReturnTypeToTAbstractType__eReturnType____source
				.setName(eReturnTypeToTAbstractType__eReturnType____source_name_prime);
		eReturnTypeToTAbstractType__tAbstractType____target
				.setName(eReturnTypeToTAbstractType__tAbstractType____target_name_prime);
		eMethodDeclarationToTMethodDefinition__mDefinition____source
				.setName(eMethodDeclarationToTMethodDefinition__mDefinition____source_name_prime);
		eMethodDeclarationToTMethodDefinition__tMethodDefinition____target
				.setName(eMethodDeclarationToTMethodDefinition__tMethodDefinition____target_name_prime);
		return new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, isApplicableMatch,
				mDefinition__eTypeAccess____returnType, eTypeAccess__eReturnType____type,
				eReturnType__eTypeAccess____usagesInTypeAccess, eReturnTypeToTAbstractType__eReturnType____source,
				eReturnTypeToTAbstractType__tAbstractType____target,
				eMethodDeclarationToTMethodDefinition__mDefinition____source,
				eMethodDeclarationToTMethodDefinition__tMethodDefinition____target };
	}

	public static final Object[] pattern_ReturnType_2_4_solveCSP_bindingFBBBBBBBBB(ReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition, TypeAccess eTypeAccess,
			Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mDefinition, eTypeAccess, eReturnType,
				tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, eTypeAccess, eReturnType, tAbstractType,
					tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnType_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(ReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition, TypeAccess eTypeAccess,
			Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		Object[] result_pattern_ReturnType_2_4_solveCSP_binding = pattern_ReturnType_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition);
		if (result_pattern_ReturnType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnType_2_4_solveCSP_binding[0];

			Object[] result_pattern_ReturnType_2_4_solveCSP_black = pattern_ReturnType_2_4_solveCSP_blackB(csp);
			if (result_pattern_ReturnType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, eTypeAccess, eReturnType,
						tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
						eMethodDeclarationToTMethodDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnType_2_5_checkCSP_expressionFBB(ReturnType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnType_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReturnType_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReturnType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReturnType_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnType_10_1_initialbindings_blackBBBB(ReturnType _this, Match match,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		return new Object[] { _this, match, tAbstractType, tMethodDefinition };
	}

	public static final Object[] pattern_ReturnType_10_2_SolveCSP_bindingFBBBB(ReturnType _this, Match match,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAbstractType, tMethodDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAbstractType, tMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnType_10_2_SolveCSP_bindingAndBlackFBBBB(ReturnType _this, Match match,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		Object[] result_pattern_ReturnType_10_2_SolveCSP_binding = pattern_ReturnType_10_2_SolveCSP_bindingFBBBB(_this,
				match, tAbstractType, tMethodDefinition);
		if (result_pattern_ReturnType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ReturnType_10_2_SolveCSP_black = pattern_ReturnType_10_2_SolveCSP_blackB(csp);
			if (result_pattern_ReturnType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAbstractType, tMethodDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnType_10_3_CheckCSP_expressionFBB(ReturnType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnType_10_4_collectelementstobetranslated_blackBBB(Match match,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		return new Object[] { match, tAbstractType, tMethodDefinition };
	}

	public static final Object[] pattern_ReturnType_10_4_collectelementstobetranslated_greenBBBF(Match match,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		EMoflonEdge tMethodDefinition__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethodDefinition__tAbstractType____returnType_name_prime = "returnType";
		tMethodDefinition__tAbstractType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tAbstractType____returnType.setTrg(tAbstractType);
		match.getToBeTranslatedEdges().add(tMethodDefinition__tAbstractType____returnType);
		tMethodDefinition__tAbstractType____returnType
				.setName(tMethodDefinition__tAbstractType____returnType_name_prime);
		return new Object[] { match, tAbstractType, tMethodDefinition, tMethodDefinition__tAbstractType____returnType };
	}

	public static final Object[] pattern_ReturnType_10_5_collectcontextelements_blackBBB(Match match,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		return new Object[] { match, tAbstractType, tMethodDefinition };
	}

	public static final Object[] pattern_ReturnType_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		match.getContextNodes().add(tAbstractType);
		match.getContextNodes().add(tMethodDefinition);
		return new Object[] { match, tAbstractType, tMethodDefinition };
	}

	public static final void pattern_ReturnType_10_6_registerobjectstomatch_expressionBBBB(ReturnType _this,
			Match match, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		_this.registerObjectsToMatch_BWD(match, tAbstractType, tMethodDefinition);

	}

	public static final boolean pattern_ReturnType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReturnType_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ReturnType_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("eReturnType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMethodDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("eReturnTypeToTAbstractType");
		EObject _localVariable_5 = isApplicableMatch.getObject("eMethodDeclarationToTMethodDefinition");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpEReturnType = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpTMethodDefinition = _localVariable_3;
		EObject tmpEReturnTypeToTAbstractType = _localVariable_4;
		EObject tmpEMethodDeclarationToTMethodDefinition = _localVariable_5;
		if (tmpMDefinition instanceof MMethodDefinition) {
			MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
			if (tmpEReturnType instanceof Type) {
				Type eReturnType = (Type) tmpEReturnType;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpTMethodDefinition instanceof TMethodDefinition) {
						TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
						if (tmpEReturnTypeToTAbstractType instanceof TypeToTAbstractType) {
							TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) tmpEReturnTypeToTAbstractType;
							if (tmpEMethodDeclarationToTMethodDefinition instanceof MethodDeclarationToTMethodDefinition) {
								MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) tmpEMethodDeclarationToTMethodDefinition;
								return new Object[] { mDefinition, eReturnType, tAbstractType, tMethodDefinition,
										eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_11_1_performtransformation_blackBBBBBBFBB(
			MMethodDefinition mDefinition, Type eReturnType, TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition, TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition, ReturnType _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinition, eReturnType, tAbstractType, tMethodDefinition,
						eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			ReturnType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReturnType_11_1_performtransformation_binding = pattern_ReturnType_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ReturnType_11_1_performtransformation_binding != null) {
			MMethodDefinition mDefinition = (MMethodDefinition) result_pattern_ReturnType_11_1_performtransformation_binding[0];
			Type eReturnType = (Type) result_pattern_ReturnType_11_1_performtransformation_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ReturnType_11_1_performtransformation_binding[2];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_ReturnType_11_1_performtransformation_binding[3];
			TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) result_pattern_ReturnType_11_1_performtransformation_binding[4];
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) result_pattern_ReturnType_11_1_performtransformation_binding[5];

			Object[] result_pattern_ReturnType_11_1_performtransformation_black = pattern_ReturnType_11_1_performtransformation_blackBBBBBBFBB(
					mDefinition, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
					eMethodDeclarationToTMethodDefinition, _this, isApplicableMatch);
			if (result_pattern_ReturnType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ReturnType_11_1_performtransformation_black[6];

				return new Object[] { mDefinition, eReturnType, tAbstractType, tMethodDefinition,
						eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_11_1_performtransformation_greenBFB(MMethodDefinition mDefinition,
			Type eReturnType) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		mDefinition.setReturnType(eTypeAccess);
		eTypeAccess.setType(eReturnType);
		return new Object[] { mDefinition, eTypeAccess, eReturnType };
	}

	public static final Object[] pattern_ReturnType_11_2_collecttranslatedelements_blackB(TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ReturnType_11_2_collecttranslatedelements_greenFB(TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ReturnType_11_3_bookkeepingforedges_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject mDefinition, EObject eTypeAccess, EObject eReturnType, EObject tAbstractType,
			EObject tMethodDefinition, EObject eReturnTypeToTAbstractType,
			EObject eMethodDeclarationToTMethodDefinition) {
		if (!mDefinition.equals(tAbstractType)) {
			if (!mDefinition.equals(tMethodDefinition)) {
				if (!eTypeAccess.equals(mDefinition)) {
					if (!eTypeAccess.equals(tAbstractType)) {
						if (!eTypeAccess.equals(tMethodDefinition)) {
							if (!eReturnType.equals(mDefinition)) {
								if (!eReturnType.equals(eTypeAccess)) {
									if (!eReturnType.equals(tAbstractType)) {
										if (!eReturnType.equals(tMethodDefinition)) {
											if (!eReturnType.equals(eReturnTypeToTAbstractType)) {
												if (!tAbstractType.equals(tMethodDefinition)) {
													if (!eReturnTypeToTAbstractType.equals(mDefinition)) {
														if (!eReturnTypeToTAbstractType.equals(eTypeAccess)) {
															if (!eReturnTypeToTAbstractType.equals(tAbstractType)) {
																if (!eReturnTypeToTAbstractType
																		.equals(tMethodDefinition)) {
																	if (!eMethodDeclarationToTMethodDefinition
																			.equals(mDefinition)) {
																		if (!eMethodDeclarationToTMethodDefinition
																				.equals(eTypeAccess)) {
																			if (!eMethodDeclarationToTMethodDefinition
																					.equals(eReturnType)) {
																				if (!eMethodDeclarationToTMethodDefinition
																						.equals(tAbstractType)) {
																					if (!eMethodDeclarationToTMethodDefinition
																							.equals(tMethodDefinition)) {
																						if (!eMethodDeclarationToTMethodDefinition
																								.equals(eReturnTypeToTAbstractType)) {
																							return new Object[] {
																									ruleresult,
																									mDefinition,
																									eTypeAccess,
																									eReturnType,
																									tAbstractType,
																									tMethodDefinition,
																									eReturnTypeToTAbstractType,
																									eMethodDeclarationToTMethodDefinition };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ReturnType_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mDefinition, EObject eTypeAccess, EObject eReturnType,
			EObject tAbstractType, EObject tMethodDefinition) {
		EMoflonEdge mDefinition__eTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eReturnType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eReturnType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReturnType";
		String mDefinition__eTypeAccess____returnType_name_prime = "returnType";
		String eTypeAccess__eReturnType____type_name_prime = "type";
		String eReturnType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tMethodDefinition__tAbstractType____returnType_name_prime = "returnType";
		mDefinition__eTypeAccess____returnType.setSrc(mDefinition);
		mDefinition__eTypeAccess____returnType.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(mDefinition__eTypeAccess____returnType);
		eTypeAccess__eReturnType____type.setSrc(eTypeAccess);
		eTypeAccess__eReturnType____type.setTrg(eReturnType);
		ruleresult.getCreatedEdges().add(eTypeAccess__eReturnType____type);
		eReturnType__eTypeAccess____usagesInTypeAccess.setSrc(eReturnType);
		eReturnType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eReturnType__eTypeAccess____usagesInTypeAccess);
		tMethodDefinition__tAbstractType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tAbstractType____returnType.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tMethodDefinition__tAbstractType____returnType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinition__eTypeAccess____returnType.setName(mDefinition__eTypeAccess____returnType_name_prime);
		eTypeAccess__eReturnType____type.setName(eTypeAccess__eReturnType____type_name_prime);
		eReturnType__eTypeAccess____usagesInTypeAccess
				.setName(eReturnType__eTypeAccess____usagesInTypeAccess_name_prime);
		tMethodDefinition__tAbstractType____returnType
				.setName(tMethodDefinition__tAbstractType____returnType_name_prime);
		return new Object[] { ruleresult, mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				mDefinition__eTypeAccess____returnType, eTypeAccess__eReturnType____type,
				eReturnType__eTypeAccess____usagesInTypeAccess, tMethodDefinition__tAbstractType____returnType };
	}

	public static final void pattern_ReturnType_11_5_registerobjects_expressionBBBBBBBBB(ReturnType _this,
			PerformRuleResult ruleresult, EObject mDefinition, EObject eTypeAccess, EObject eReturnType,
			EObject tAbstractType, EObject tMethodDefinition, EObject eReturnTypeToTAbstractType,
			EObject eMethodDeclarationToTMethodDefinition) {
		_this.registerObjects_BWD(ruleresult, mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition);

	}

	public static final PerformRuleResult pattern_ReturnType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnType_12_1_preparereturnvalue_bindingFB(ReturnType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_12_1_preparereturnvalue_blackFBB(EClass eClass, ReturnType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReturnType_12_1_preparereturnvalue_bindingAndBlackFFB(ReturnType _this) {
		Object[] result_pattern_ReturnType_12_1_preparereturnvalue_binding = pattern_ReturnType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReturnType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ReturnType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReturnType_12_1_preparereturnvalue_black = pattern_ReturnType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ReturnType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReturnType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ReturnType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReturnType_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAbstractType");
		EObject _localVariable_1 = match.getObject("tMethodDefinition");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpTMethodDefinition = _localVariable_1;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				return new Object[] { tAbstractType, tMethodDefinition, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnType_12_2_corematch_blackFFBBFFB(TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType eReturnTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
			Type eReturnType = eReturnTypeToTAbstractType.getSource();
			if (eReturnType != null) {
				for (MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMethodDefinition, MethodDeclarationToTMethodDefinition.class,
								"target")) {
					MethodDeclaration tmpMDefinition = eMethodDeclarationToTMethodDefinition.getSource();
					if (tmpMDefinition instanceof MMethodDefinition) {
						MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
						_result.add(new Object[] { mDefinition, eReturnType, tAbstractType, tMethodDefinition,
								eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReturnType_12_3_findcontext_blackBBBBBB(
			MMethodDefinition mDefinition, Type eReturnType, TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition, TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAbstractType.equals(tMethodDefinition.getReturnType())) {
			if (eReturnType.equals(eReturnTypeToTAbstractType.getSource())) {
				if (tAbstractType.equals(eReturnTypeToTAbstractType.getTarget())) {
					if (mDefinition.equals(eMethodDeclarationToTMethodDefinition.getSource())) {
						if (tMethodDefinition.equals(eMethodDeclarationToTMethodDefinition.getTarget())) {
							_result.add(new Object[] { mDefinition, eReturnType, tAbstractType, tMethodDefinition,
									eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReturnType_12_3_findcontext_greenBBBBBBFFFFFF(MMethodDefinition mDefinition,
			Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethodDefinition__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eReturnTypeToTAbstractType__eReturnType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eReturnTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethodDefinition__mDefinition____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eMethodDeclarationToTMethodDefinition__tMethodDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodDefinition__tAbstractType____returnType_name_prime = "returnType";
		String eReturnTypeToTAbstractType__eReturnType____source_name_prime = "source";
		String eReturnTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String eMethodDeclarationToTMethodDefinition__mDefinition____source_name_prime = "source";
		String eMethodDeclarationToTMethodDefinition__tMethodDefinition____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(eReturnType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(eReturnTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(eMethodDeclarationToTMethodDefinition);
		tMethodDefinition__tAbstractType____returnType.setSrc(tMethodDefinition);
		tMethodDefinition__tAbstractType____returnType.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition__tAbstractType____returnType);
		eReturnTypeToTAbstractType__eReturnType____source.setSrc(eReturnTypeToTAbstractType);
		eReturnTypeToTAbstractType__eReturnType____source.setTrg(eReturnType);
		isApplicableMatch.getAllContextElements().add(eReturnTypeToTAbstractType__eReturnType____source);
		eReturnTypeToTAbstractType__tAbstractType____target.setSrc(eReturnTypeToTAbstractType);
		eReturnTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eReturnTypeToTAbstractType__tAbstractType____target);
		eMethodDeclarationToTMethodDefinition__mDefinition____source.setSrc(eMethodDeclarationToTMethodDefinition);
		eMethodDeclarationToTMethodDefinition__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(eMethodDeclarationToTMethodDefinition__mDefinition____source);
		eMethodDeclarationToTMethodDefinition__tMethodDefinition____target
				.setSrc(eMethodDeclarationToTMethodDefinition);
		eMethodDeclarationToTMethodDefinition__tMethodDefinition____target.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements()
				.add(eMethodDeclarationToTMethodDefinition__tMethodDefinition____target);
		tMethodDefinition__tAbstractType____returnType
				.setName(tMethodDefinition__tAbstractType____returnType_name_prime);
		eReturnTypeToTAbstractType__eReturnType____source
				.setName(eReturnTypeToTAbstractType__eReturnType____source_name_prime);
		eReturnTypeToTAbstractType__tAbstractType____target
				.setName(eReturnTypeToTAbstractType__tAbstractType____target_name_prime);
		eMethodDeclarationToTMethodDefinition__mDefinition____source
				.setName(eMethodDeclarationToTMethodDefinition__mDefinition____source_name_prime);
		eMethodDeclarationToTMethodDefinition__tMethodDefinition____target
				.setName(eMethodDeclarationToTMethodDefinition__tMethodDefinition____target_name_prime);
		return new Object[] { mDefinition, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
				eMethodDeclarationToTMethodDefinition, isApplicableMatch,
				tMethodDefinition__tAbstractType____returnType, eReturnTypeToTAbstractType__eReturnType____source,
				eReturnTypeToTAbstractType__tAbstractType____target,
				eMethodDeclarationToTMethodDefinition__mDefinition____source,
				eMethodDeclarationToTMethodDefinition__tMethodDefinition____target };
	}

	public static final Object[] pattern_ReturnType_12_4_solveCSP_bindingFBBBBBBBB(ReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition, Type eReturnType,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mDefinition, eReturnType,
				tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, eReturnType, tAbstractType,
					tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(ReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition, Type eReturnType,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		Object[] result_pattern_ReturnType_12_4_solveCSP_binding = pattern_ReturnType_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mDefinition, eReturnType, tAbstractType, tMethodDefinition,
				eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition);
		if (result_pattern_ReturnType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnType_12_4_solveCSP_binding[0];

			Object[] result_pattern_ReturnType_12_4_solveCSP_black = pattern_ReturnType_12_4_solveCSP_blackB(csp);
			if (result_pattern_ReturnType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, eReturnType, tAbstractType,
						tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnType_12_5_checkCSP_expressionFBB(ReturnType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnType_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReturnType_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReturnType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReturnType_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReturnType_20_1_preparereturnvalue_bindingFB(ReturnType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ReturnType _this) {
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

	public static final Object[] pattern_ReturnType_20_1_preparereturnvalue_bindingAndBlackFFBF(ReturnType _this) {
		Object[] result_pattern_ReturnType_20_1_preparereturnvalue_binding = pattern_ReturnType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReturnType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReturnType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReturnType_20_1_preparereturnvalue_black = pattern_ReturnType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ReturnType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReturnType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ReturnType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReturnType_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_returnType.getSrc();
		if (tmpMDefinition instanceof MMethodDefinition) {
			MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
			EObject tmpETypeAccess = _edge_returnType.getTrg();
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (eTypeAccess.equals(mDefinition.getReturnType())) {
					Type eReturnType = eTypeAccess.getType();
					if (eReturnType != null) {
						_result.add(new Object[] { mDefinition, eTypeAccess, eReturnType, _edge_returnType });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ReturnType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReturnType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ReturnType _this, Match match, MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, eTypeAccess, eReturnType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReturnType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ReturnType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ReturnType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReturnType_21_1_preparereturnvalue_bindingFB(ReturnType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ReturnType _this) {
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

	public static final Object[] pattern_ReturnType_21_1_preparereturnvalue_bindingAndBlackFFBF(ReturnType _this) {
		Object[] result_pattern_ReturnType_21_1_preparereturnvalue_binding = pattern_ReturnType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReturnType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReturnType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReturnType_21_1_preparereturnvalue_black = pattern_ReturnType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ReturnType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReturnType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ReturnType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReturnType_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodDefinition = _edge_returnType.getSrc();
		if (tmpTMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
			EObject tmpTAbstractType = _edge_returnType.getTrg();
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tAbstractType.equals(tMethodDefinition.getReturnType())) {
					_result.add(new Object[] { tAbstractType, tMethodDefinition, _edge_returnType });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ReturnType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReturnType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ReturnType _this, Match match, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAbstractType, tMethodDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReturnType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ReturnType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ReturnType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReturnType_24_1_prepare_blackB(ReturnType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReturnType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ReturnType_24_2_matchcontext_bindingFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_1 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_2 = sourceMatch.getObject("eReturnType");
		EObject _localVariable_3 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_4 = targetMatch.getObject("tMethodDefinition");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpEReturnType = _localVariable_2;
		EObject tmpTAbstractType = _localVariable_3;
		EObject tmpTMethodDefinition = _localVariable_4;
		if (tmpMDefinition instanceof MMethodDefinition) {
			MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpEReturnType instanceof Type) {
					Type eReturnType = (Type) tmpEReturnType;
					if (tmpTAbstractType instanceof TAbstractType) {
						TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
						if (tmpTMethodDefinition instanceof TMethodDefinition) {
							TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
							return new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType,
									tMethodDefinition, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnType_24_2_matchcontext_blackBBBBBFFBB(
			MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType, TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (eTypeAccess.equals(mDefinition.getReturnType())) {
				if (eReturnType.equals(eTypeAccess.getType())) {
					if (tAbstractType.equals(tMethodDefinition.getReturnType())) {
						for (TypeToTAbstractType eReturnTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(eReturnType, TypeToTAbstractType.class, "source")) {
							if (tAbstractType.equals(eReturnTypeToTAbstractType.getTarget())) {
								for (MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(mDefinition,
												MethodDeclarationToTMethodDefinition.class, "source")) {
									if (tMethodDefinition.equals(eMethodDeclarationToTMethodDefinition.getTarget())) {
										_result.add(new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType,
												tMethodDefinition, eReturnTypeToTAbstractType,
												eMethodDeclarationToTMethodDefinition, sourceMatch, targetMatch });
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

	public static final Object[] pattern_ReturnType_24_2_matchcontext_greenBBBBBBBBFB(MMethodDefinition mDefinition,
			TypeAccess eTypeAccess, Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition, Match sourceMatch,
			Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "ReturnType";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eReturnType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(eReturnTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(eMethodDeclarationToTMethodDefinition);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_ReturnType_24_3_checkcsp_bindingFBBBBBBBBBBB(ReturnType _this,
			CCMatch isApplicableMatch, MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mDefinition, eTypeAccess, eReturnType,
				tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, eTypeAccess, eReturnType, tAbstractType,
					tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBB(ReturnType _this,
			CCMatch isApplicableMatch, MMethodDefinition mDefinition, TypeAccess eTypeAccess, Type eReturnType,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ReturnType_24_3_checkcsp_binding = pattern_ReturnType_24_3_checkcsp_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, sourceMatch, targetMatch);
		if (result_pattern_ReturnType_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnType_24_3_checkcsp_binding[0];

			Object[] result_pattern_ReturnType_24_3_checkcsp_black = pattern_ReturnType_24_3_checkcsp_blackB(csp);
			if (result_pattern_ReturnType_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, eTypeAccess, eReturnType,
						tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
						eMethodDeclarationToTMethodDefinition, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_24_4_createcorrespondence_blackBBBBBB(MMethodDefinition mDefinition,
			TypeAccess eTypeAccess, Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			CCMatch isApplicableMatch) {
		return new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition,
				isApplicableMatch };
	}

	public static final Object[] pattern_ReturnType_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ReturnType_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReturnType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReturnType_24_6_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ReturnType_27_1_matchtggpattern_blackBBB(MMethodDefinition mDefinition,
			TypeAccess eTypeAccess, Type eReturnType) {
		if (eTypeAccess.equals(mDefinition.getReturnType())) {
			if (eReturnType.equals(eTypeAccess.getType())) {
				return new Object[] { mDefinition, eTypeAccess, eReturnType };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReturnType_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ReturnType_28_1_matchtggpattern_blackBB(TAbstractType tAbstractType,
			TMethodDefinition tMethodDefinition) {
		if (tAbstractType.equals(tMethodDefinition.getReturnType())) {
			return new Object[] { tAbstractType, tMethodDefinition };
		}
		return null;
	}

	public static final boolean pattern_ReturnType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReturnType_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ReturnType_29_1_createresult_blackB(ReturnType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReturnType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ReturnType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		if (ruleResult.getCorrObjects().contains(eMethodDeclarationToTMethodDefinition)) {
			return new Object[] { ruleResult, eMethodDeclarationToTMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethodDefinition tMethodDefinition) {
		if (ruleResult.getTargetObjects().contains(tMethodDefinition)) {
			return new Object[] { ruleResult, tMethodDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Type eReturnType) {
		if (ruleResult.getSourceObjects().contains(eReturnType)) {
			return new Object[] { ruleResult, eReturnType };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eReturnTypeToTAbstractType) {
		if (ruleResult.getCorrObjects().contains(eReturnTypeToTAbstractType)) {
			return new Object[] { ruleResult, eReturnTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReturnType_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eMethodDeclarationToTMethodDefinitionList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eReturnTypeToTAbstractTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!eMethodDeclarationToTMethodDefinitionList.equals(eReturnTypeToTAbstractTypeList)) {
					for (EObject tmpEMethodDeclarationToTMethodDefinition : eMethodDeclarationToTMethodDefinitionList
							.getEntryObjects()) {
						if (tmpEMethodDeclarationToTMethodDefinition instanceof MethodDeclarationToTMethodDefinition) {
							MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) tmpEMethodDeclarationToTMethodDefinition;
							MethodDeclaration tmpMDefinition = eMethodDeclarationToTMethodDefinition.getSource();
							if (tmpMDefinition instanceof MMethodDefinition) {
								MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
								TMethodDefinition tMethodDefinition = eMethodDeclarationToTMethodDefinition.getTarget();
								if (tMethodDefinition != null) {
									if (pattern_ReturnType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											eMethodDeclarationToTMethodDefinition) == null) {
										if (pattern_ReturnType_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mDefinition) == null) {
											if (pattern_ReturnType_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tMethodDefinition) == null) {
												for (EObject tmpEReturnTypeToTAbstractType : eReturnTypeToTAbstractTypeList
														.getEntryObjects()) {
													if (tmpEReturnTypeToTAbstractType instanceof TypeToTAbstractType) {
														TypeToTAbstractType eReturnTypeToTAbstractType = (TypeToTAbstractType) tmpEReturnTypeToTAbstractType;
														Type eReturnType = eReturnTypeToTAbstractType.getSource();
														if (eReturnType != null) {
															TAbstractType tAbstractType = eReturnTypeToTAbstractType
																	.getTarget();
															if (tAbstractType != null) {
																if (pattern_ReturnType_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult,
																		eReturnTypeToTAbstractType) == null) {
																	if (pattern_ReturnType_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, eReturnType) == null) {
																		if (pattern_ReturnType_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, tAbstractType) == null) {
																			_result.add(new Object[] {
																					eMethodDeclarationToTMethodDefinitionList,
																					mDefinition,
																					eMethodDeclarationToTMethodDefinition,
																					tMethodDefinition,
																					eReturnTypeToTAbstractTypeList,
																					eReturnType,
																					eReturnTypeToTAbstractType,
																					tAbstractType, ruleEntryContainer,
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

	public static final Object[] pattern_ReturnType_29_3_solveCSP_bindingFBBBBBBBBB(ReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition, Type eReturnType,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mDefinition, eReturnType,
				tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, eReturnType, tAbstractType,
					tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ReturnType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReturnType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(ReturnType _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mDefinition, Type eReturnType,
			TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ReturnType_29_3_solveCSP_binding = pattern_ReturnType_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, eReturnType, tAbstractType, tMethodDefinition,
				eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition, ruleResult);
		if (result_pattern_ReturnType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReturnType_29_3_solveCSP_binding[0];

			Object[] result_pattern_ReturnType_29_3_solveCSP_black = pattern_ReturnType_29_3_solveCSP_blackB(csp);
			if (result_pattern_ReturnType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, eReturnType, tAbstractType,
						tMethodDefinition, eReturnTypeToTAbstractType, eMethodDeclarationToTMethodDefinition,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ReturnType_29_4_checkCSP_expressionFBB(ReturnType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReturnType_29_5_checknacs_blackBBBBBB(MMethodDefinition mDefinition,
			Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition) {
		return new Object[] { mDefinition, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
				eMethodDeclarationToTMethodDefinition };
	}

	public static final Object[] pattern_ReturnType_29_6_perform_blackBBBBBBB(MMethodDefinition mDefinition,
			Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			TypeToTAbstractType eReturnTypeToTAbstractType,
			MethodDeclarationToTMethodDefinition eMethodDeclarationToTMethodDefinition,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mDefinition, eReturnType, tAbstractType, tMethodDefinition, eReturnTypeToTAbstractType,
				eMethodDeclarationToTMethodDefinition, ruleResult };
	}

	public static final Object[] pattern_ReturnType_29_6_perform_greenBFBBBB(MMethodDefinition mDefinition,
			Type eReturnType, TAbstractType tAbstractType, TMethodDefinition tMethodDefinition,
			ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tMethodDefinition.setReturnType(tAbstractType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mDefinition.setReturnType(eTypeAccess);
		eTypeAccess.setType(eReturnType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mDefinition, eTypeAccess, eReturnType, tAbstractType, tMethodDefinition, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ReturnType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ReturnTypeImpl
