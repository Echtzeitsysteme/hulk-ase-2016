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
import org.eclipse.gmt.modisco.java.InterfaceDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.Rules.InterfaceExtendsInterface;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TInterface;

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
 * An implementation of the model object '<em><b>Interface Extends Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterfaceExtendsInterfaceImpl extends AbstractRuleImpl implements InterfaceExtendsInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceExtendsInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInterfaceExtendsInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration,
			InterfaceDeclaration eSuperInterface) {
		// initial bindings
		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_0_1_initialbindings_blackBBBBB(this, match, eTypeAccess,
						eInterfaceDeclaration, eSuperInterface);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eSuperInterface] = "
					+ eSuperInterface + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, eTypeAccess,
						eInterfaceDeclaration, eSuperInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eSuperInterface] = "
					+ eSuperInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_0_4_collectelementstobetranslated_blackBBBB(match, eTypeAccess,
							eInterfaceDeclaration, eSuperInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eSuperInterface] = "
						+ eSuperInterface + ".");
			}
			InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							eTypeAccess, eInterfaceDeclaration, eSuperInterface);
			// EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result4_green[4];
			// EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			// EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_0_5_collectcontextelements_blackBBBB(match, eTypeAccess,
							eInterfaceDeclaration, eSuperInterface);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eInterfaceDeclaration] = "
								+ eInterfaceDeclaration + ", " + "[eSuperInterface] = " + eSuperInterface + ".");
			}
			InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_5_collectcontextelements_greenBBB(match,
					eInterfaceDeclaration, eSuperInterface);

			// register objects to match
			InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, eTypeAccess, eInterfaceDeclaration, eSuperInterface);
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_7_expressionF();
		} else {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TInterface tInterface = (TInterface) result1_bindingAndBlack[1];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[2];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[3];
		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result1_bindingAndBlack[4];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result1_bindingAndBlack[5];
		TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_1_1_performtransformation_greenBB(tInterface,
				tSuperInterface);

		// collect translated elements
		Object[] result2_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
						eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eSuperInterfaceToTSuperInterface] = "
					+ eSuperInterfaceToTSuperInterface + ", " + "[tInterface] = " + tInterface + ", "
					+ "[tSuperInterface] = " + tSuperInterface + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eSuperInterface] = "
					+ eSuperInterface + ", " + "[eInterfaceDeclarationToTInterface] = "
					+ eInterfaceDeclarationToTInterface + ".");
		}
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface);
		// EMoflonEdge tInterface__tSuperInterface____parentInterfaces = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tSuperInterface__tInterface____childInterfaces = (EMoflonEdge) result3_green[7];
		// EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[8];
		// EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[9];
		// EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
				eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[0];
		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_binding[1];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_binding[2];
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_2_2_corematch_blackFFFBBBFB(eTypeAccess, eInterfaceDeclaration,
						eSuperInterface, match)) {
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[0];
			TInterface tInterface = (TInterface) result2_black[1];
			TInterface tSuperInterface = (TInterface) result2_black[2];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_2_3_findcontext_blackBBBBBBB(eSuperInterfaceToTSuperInterface,
							tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
							eInterfaceDeclarationToTInterface)) {
				Object[] result3_green = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_2_3_findcontext_greenBBBBBBBFFFFFFFF(
								eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
								eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge eInterfaceDeclarationToTInterface__tInterface____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
								eTypeAccess, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
							+ "[tInterface] = " + tInterface + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
							+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eInterfaceDeclaration] = "
							+ eInterfaceDeclaration + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
							+ "[eInterfaceDeclarationToTInterface] = " + eInterfaceDeclarationToTInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_2_5_checkCSP_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		match.registerObject("eSuperInterface", eSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eSuperInterfaceToTSuperInterface,
			EObject tInterface, EObject tSuperInterface, EObject eTypeAccess, EObject eInterfaceDeclaration,
			EObject eSuperInterface, EObject eInterfaceDeclarationToTInterface) {
		ruleresult.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		ruleresult.registerObject("tInterface", tInterface);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);
		ruleresult.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);

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
	public boolean isAppropriate_BWD(Match match, TInterface tInterface, TInterface tSuperInterface) {
		// initial bindings
		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_10_1_initialbindings_blackBBBB(this, match, tInterface,
						tSuperInterface);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tInterface] = " + tInterface + ", "
					+ "[tSuperInterface] = " + tSuperInterface + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tInterface,
						tSuperInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tInterface] = " + tInterface + ", "
					+ "[tSuperInterface] = " + tSuperInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_10_4_collectelementstobetranslated_blackBBB(match, tInterface,
							tSuperInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tInterface] = " + tInterface + ", "
						+ "[tSuperInterface] = " + tSuperInterface + ".");
			}
			InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_10_4_collectelementstobetranslated_greenBBBFF(match, tInterface,
							tSuperInterface);
			// EMoflonEdge tInterface__tSuperInterface____parentInterfaces = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tSuperInterface__tInterface____childInterfaces = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_10_5_collectcontextelements_blackBBB(match, tInterface,
							tSuperInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tInterface] = " + tInterface + ", "
						+ "[tSuperInterface] = " + tSuperInterface + ".");
			}
			InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_5_collectcontextelements_greenBBB(match,
					tInterface, tSuperInterface);

			// register objects to match
			InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_6_registerobjectstomatch_expressionBBBB(
					this, match, tInterface, tSuperInterface);
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_7_expressionF();
		} else {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TInterface tInterface = (TInterface) result1_bindingAndBlack[1];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[2];
		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result1_bindingAndBlack[3];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result1_bindingAndBlack[4];
		TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_1_performtransformation_greenFBB(eInterfaceDeclaration,
						eSuperInterface);
		TypeAccess eTypeAccess = (TypeAccess) result1_green[0];

		// collect translated elements
		Object[] result2_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
						eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eSuperInterfaceToTSuperInterface] = "
					+ eSuperInterfaceToTSuperInterface + ", " + "[tInterface] = " + tInterface + ", "
					+ "[tSuperInterface] = " + tSuperInterface + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eSuperInterface] = "
					+ eSuperInterface + ", " + "[eInterfaceDeclarationToTInterface] = "
					+ eInterfaceDeclarationToTInterface + ".");
		}
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface);
		// EMoflonEdge tInterface__tSuperInterface____parentInterfaces = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tSuperInterface__tInterface____childInterfaces = (EMoflonEdge) result3_green[7];
		// EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[8];
		// EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[9];
		// EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[10];

		// perform postprocessing story node is empty
		// register objects
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
				eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TInterface tInterface = (TInterface) result2_binding[0];
		TInterface tSuperInterface = (TInterface) result2_binding[1];
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_12_2_corematch_blackFBBFFFB(tInterface, tSuperInterface, match)) {
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[0];
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_black[3];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[4];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_12_3_findcontext_blackBBBBBB(eSuperInterfaceToTSuperInterface,
							tInterface, tSuperInterface, eInterfaceDeclaration, eSuperInterface,
							eInterfaceDeclarationToTInterface)) {
				Object[] result3_green = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_12_3_findcontext_greenBBBBBBFFFFFFF(
								eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eInterfaceDeclaration,
								eSuperInterface, eInterfaceDeclarationToTInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tInterface__tSuperInterface____parentInterfaces = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tSuperInterface__tInterface____childInterfaces = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eInterfaceDeclarationToTInterface__tInterface____target = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
								eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
							+ "[tInterface] = " + tInterface + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
							+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eSuperInterface] = "
							+ eSuperInterface + ", " + "[eInterfaceDeclarationToTInterface] = "
							+ eInterfaceDeclarationToTInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_12_5_checkCSP_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TInterface tInterface, TInterface tSuperInterface) {
		match.registerObject("tInterface", tInterface);
		match.registerObject("tSuperInterface", tSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TInterface tInterface, TInterface tSuperInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eSuperInterfaceToTSuperInterface,
			EObject tInterface, EObject tSuperInterface, EObject eTypeAccess, EObject eInterfaceDeclaration,
			EObject eSuperInterface, EObject eInterfaceDeclarationToTInterface) {
		ruleresult.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		ruleresult.registerObject("tInterface", tInterface);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);
		ruleresult.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_12(EMoflonEdge _edge_type) {
		// prepare return value
		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_20_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			TypeAccess eTypeAccess = (TypeAccess) result2_black[0];
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_black[1];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[2];
			Object[] result2_green = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, eTypeAccess, eInterfaceDeclaration, eSuperInterface)) {
				// Ensure that the correct types of elements are matched
				if (InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_10(EMoflonEdge _edge_parentInterfaces) {
		// prepare return value
		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_blackFFB(_edge_parentInterfaces)) {
			TInterface tInterface = (TInterface) result2_black[0];
			TInterface tSuperInterface = (TInterface) result2_black[1];
			Object[] result2_green = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tInterface, tSuperInterface)) {
				// Ensure that the correct types of elements are matched
				if (InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InterfaceExtendsInterface");
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
		ruleResult.setRule("InterfaceExtendsInterface");
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
		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_24_2_matchcontext_bindingFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TInterface tInterface = (TInterface) result2_binding[0];
		TInterface tSuperInterface = (TInterface) result2_binding[1];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[2];
		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_binding[3];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_binding[4];
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_24_2_matchcontext_blackFBBBBBFBB(tInterface, tSuperInterface,
						eTypeAccess, eInterfaceDeclaration, eSuperInterface, sourceMatch, targetMatch)) {
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[0];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result2_black[6];
			Object[] result2_green = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_24_2_matchcontext_greenBBBBBBBBFB(
							eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
							eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, sourceMatch,
							targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[8];

			// check csp
			Object[] result3_bindingAndBlack = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBB(this,
							isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
							eTypeAccess, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface,
							sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_24_4_createcorrespondence_blackBBBBBB(tInterface,
								tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
								isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tInterface] = " + tInterface + ", " + "[tSuperInterface] = "
							+ tSuperInterface + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
							+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eSuperInterface] = "
							+ eSuperInterface + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			TInterface tInterface, TInterface tSuperInterface, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
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
	public boolean checkDEC_FWD(TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration,
			InterfaceDeclaration eSuperInterface) {// match tgg pattern
		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_27_1_matchtggpattern_blackBBB(eTypeAccess, eInterfaceDeclaration,
						eSuperInterface);
		if (result1_black != null) {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_27_2_expressionF();
		} else {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TInterface tInterface, TInterface tSuperInterface) {// match tgg pattern
		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_28_1_matchtggpattern_blackBB(tInterface, tSuperInterface);
		if (result1_black != null) {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_28_2_expressionF();
		} else {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eSuperInterfaceToTSuperInterfaceParameter,
			TypeToTAbstractType eInterfaceDeclarationToTInterfaceParameter) {
		// create result
		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList eSuperInterfaceToTSuperInterfaceList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[1];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[2];
			TInterface tSuperInterface = (TInterface) result2_black[3];
			// RuleEntryList eInterfaceDeclarationToTInterfaceList = (RuleEntryList) result2_black[4];
			TInterface tInterface = (TInterface) result2_black[5];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result2_black[6];
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eInterfaceDeclaration,
							eSuperInterface, eInterfaceDeclarationToTInterface, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
						+ "[tInterface] = " + tInterface + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
						+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eSuperInterface] = "
						+ eSuperInterface + ", " + "[eInterfaceDeclarationToTInterface] = "
						+ eInterfaceDeclarationToTInterface + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_29_5_checknacs_blackBBBBBB(eSuperInterfaceToTSuperInterface,
								tInterface, tSuperInterface, eInterfaceDeclaration, eSuperInterface,
								eInterfaceDeclarationToTInterface);
				if (result5_black != null) {

					// perform
					Object[] result6_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_29_6_perform_blackBBBBBBB(
									eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
									eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
								+ "[tInterface] = " + tInterface + ", " + "[tSuperInterface] = " + tSuperInterface
								+ ", " + "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", "
								+ "[eSuperInterface] = " + eSuperInterface + ", "
								+ "[eInterfaceDeclarationToTInterface] = " + eInterfaceDeclarationToTInterface + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_29_6_perform_greenBBFBBB(tInterface,
							tSuperInterface, eInterfaceDeclaration, eSuperInterface, ruleResult);
					// TypeAccess eTypeAccess = (TypeAccess) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
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
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_INTERFACEDECLARATION_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_INTERFACEDECLARATION_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_INTERFACEDECLARATION_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TINTERFACE_TINTERFACE_TYPEACCESS_INTERFACEDECLARATION_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TInterface) arguments.get(2),
					(TInterface) arguments.get(3), (TypeAccess) arguments.get(4),
					(InterfaceDeclaration) arguments.get(5), (InterfaceDeclaration) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_BWD__MATCH_TINTERFACE_TINTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TINTERFACE_TINTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TInterface) arguments.get(2));
			return null;
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TINTERFACE_TINTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TINTERFACE_TINTERFACE_INTERFACEDECLARATION_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TInterface) arguments.get(2),
					(TInterface) arguments.get(3), (InterfaceDeclaration) arguments.get(4),
					(InterfaceDeclaration) arguments.get(5), (TypeToTAbstractType) arguments.get(6));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_12((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TYPETOTABSTRACTTYPE_TINTERFACE_TINTERFACE_TYPEACCESS_INTERFACEDECLARATION_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TInterface) arguments.get(2), (TInterface) arguments.get(3), (TypeAccess) arguments.get(4),
					(InterfaceDeclaration) arguments.get(5), (InterfaceDeclaration) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7), (Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_DEC_FWD__TYPEACCESS_INTERFACEDECLARATION_INTERFACEDECLARATION:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_DEC_BWD__TINTERFACE_TINTERFACE:
			return checkDEC_BWD((TInterface) arguments.get(0), (TInterface) arguments.get(1));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TINTERFACE_TINTERFACE_INTERFACEDECLARATION_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TInterface) arguments.get(2),
					(TInterface) arguments.get(3), (InterfaceDeclaration) arguments.get(4),
					(InterfaceDeclaration) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_1_initialbindings_blackBBBBB(
			InterfaceExtendsInterface _this, Match match, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			return new Object[] { _this, match, eTypeAccess, eInterfaceDeclaration, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_2_SolveCSP_bindingFBBBBB(
			InterfaceExtendsInterface _this, Match match, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eTypeAccess, eInterfaceDeclaration,
				eSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eTypeAccess, eInterfaceDeclaration, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_2_SolveCSP_bindingAndBlackFBBBBB(
			InterfaceExtendsInterface _this, Match match, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		Object[] result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_binding = pattern_InterfaceExtendsInterface_0_2_SolveCSP_bindingFBBBBB(
				_this, match, eTypeAccess, eInterfaceDeclaration, eSuperInterface);
		if (result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_black = pattern_InterfaceExtendsInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eTypeAccess, eInterfaceDeclaration, eSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_0_3_CheckCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_4_collectelementstobetranslated_blackBBBB(
			Match match, TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration,
			InterfaceDeclaration eSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			return new Object[] { match, eTypeAccess, eInterfaceDeclaration, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration,
			InterfaceDeclaration eSuperInterface) {
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		match.getToBeTranslatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setSrc(eInterfaceDeclaration);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eInterfaceDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eInterfaceDeclaration__eTypeAccess____superInterfaces
				.setName(eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime);
		return new Object[] { match, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
				eTypeAccess__eSuperInterface____type, eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eInterfaceDeclaration__eTypeAccess____superInterfaces };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_5_collectcontextelements_blackBBBB(Match match,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			return new Object[] { match, eTypeAccess, eInterfaceDeclaration, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_5_collectcontextelements_greenBBB(Match match,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		match.getContextNodes().add(eInterfaceDeclaration);
		match.getContextNodes().add(eSuperInterface);
		return new Object[] { match, eInterfaceDeclaration, eSuperInterface };
	}

	public static final void pattern_InterfaceExtendsInterface_0_6_registerobjectstomatch_expressionBBBBB(
			InterfaceExtendsInterface _this, Match match, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		_this.registerObjectsToMatch_FWD(match, eTypeAccess, eInterfaceDeclaration, eSuperInterface);

	}

	public static final boolean pattern_InterfaceExtendsInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject _localVariable_1 = isApplicableMatch.getObject("tInterface");
		EObject _localVariable_2 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_4 = isApplicableMatch.getObject("eInterfaceDeclaration");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSuperInterface");
		EObject _localVariable_6 = isApplicableMatch.getObject("eInterfaceDeclarationToTInterface");
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_0;
		EObject tmpTInterface = _localVariable_1;
		EObject tmpTSuperInterface = _localVariable_2;
		EObject tmpETypeAccess = _localVariable_3;
		EObject tmpEInterfaceDeclaration = _localVariable_4;
		EObject tmpESuperInterface = _localVariable_5;
		EObject tmpEInterfaceDeclarationToTInterface = _localVariable_6;
		if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
			if (tmpTInterface instanceof TInterface) {
				TInterface tInterface = (TInterface) tmpTInterface;
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					if (tmpETypeAccess instanceof TypeAccess) {
						TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
						if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
							InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
							if (tmpESuperInterface instanceof InterfaceDeclaration) {
								InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
								if (tmpEInterfaceDeclarationToTInterface instanceof TypeToTAbstractType) {
									TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) tmpEInterfaceDeclarationToTInterface;
									return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
											eTypeAccess, eInterfaceDeclaration, eSuperInterface,
											eInterfaceDeclarationToTInterface, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_1_performtransformation_blackBBBBBBBFBB(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceExtendsInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tInterface.equals(tSuperInterface)) {
			if (!eInterfaceDeclaration.equals(eSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
									eTypeAccess, eInterfaceDeclaration, eSuperInterface,
									eInterfaceDeclarationToTInterface, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding = pattern_InterfaceExtendsInterface_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding != null) {
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[0];
			TInterface tInterface = (TInterface) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[1];
			TInterface tSuperInterface = (TInterface) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[2];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[3];
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[4];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[5];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[6];

			Object[] result_pattern_InterfaceExtendsInterface_1_1_performtransformation_black = pattern_InterfaceExtendsInterface_1_1_performtransformation_blackBBBBBBBFBB(
					eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration,
					eSuperInterface, eInterfaceDeclarationToTInterface, _this, isApplicableMatch);
			if (result_pattern_InterfaceExtendsInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_black[7];

				return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
						eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_1_performtransformation_greenBB(
			TInterface tInterface, TInterface tSuperInterface) {
		tInterface.getParentInterfaces().add(tSuperInterface);
		return new Object[] { tInterface, tSuperInterface };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject eSuperInterfaceToTSuperInterface, EObject tInterface,
			EObject tSuperInterface, EObject eTypeAccess, EObject eInterfaceDeclaration, EObject eSuperInterface,
			EObject eInterfaceDeclarationToTInterface) {
		if (!eSuperInterfaceToTSuperInterface.equals(tInterface)) {
			if (!eSuperInterfaceToTSuperInterface.equals(tSuperInterface)) {
				if (!eSuperInterfaceToTSuperInterface.equals(eTypeAccess)) {
					if (!tInterface.equals(tSuperInterface)) {
						if (!eTypeAccess.equals(tInterface)) {
							if (!eTypeAccess.equals(tSuperInterface)) {
								if (!eInterfaceDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
									if (!eInterfaceDeclaration.equals(tInterface)) {
										if (!eInterfaceDeclaration.equals(tSuperInterface)) {
											if (!eInterfaceDeclaration.equals(eTypeAccess)) {
												if (!eInterfaceDeclaration.equals(eSuperInterface)) {
													if (!eInterfaceDeclaration
															.equals(eInterfaceDeclarationToTInterface)) {
														if (!eSuperInterface.equals(eSuperInterfaceToTSuperInterface)) {
															if (!eSuperInterface.equals(tInterface)) {
																if (!eSuperInterface.equals(tSuperInterface)) {
																	if (!eSuperInterface.equals(eTypeAccess)) {
																		if (!eInterfaceDeclarationToTInterface.equals(
																				eSuperInterfaceToTSuperInterface)) {
																			if (!eInterfaceDeclarationToTInterface
																					.equals(tInterface)) {
																				if (!eInterfaceDeclarationToTInterface
																						.equals(tSuperInterface)) {
																					if (!eInterfaceDeclarationToTInterface
																							.equals(eTypeAccess)) {
																						if (!eInterfaceDeclarationToTInterface
																								.equals(eSuperInterface)) {
																							return new Object[] {
																									ruleresult,
																									eSuperInterfaceToTSuperInterface,
																									tInterface,
																									tSuperInterface,
																									eTypeAccess,
																									eInterfaceDeclaration,
																									eSuperInterface,
																									eInterfaceDeclarationToTInterface };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InterfaceExtendsInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tInterface, EObject tSuperInterface, EObject eTypeAccess,
			EObject eInterfaceDeclaration, EObject eSuperInterface) {
		EMoflonEdge tInterface__tSuperInterface____parentInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tInterface____childInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceExtendsInterface";
		String tInterface__tSuperInterface____parentInterfaces_name_prime = "parentInterfaces";
		String tSuperInterface__tInterface____childInterfaces_name_prime = "childInterfaces";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		tInterface__tSuperInterface____parentInterfaces.setSrc(tInterface);
		tInterface__tSuperInterface____parentInterfaces.setTrg(tSuperInterface);
		ruleresult.getCreatedEdges().add(tInterface__tSuperInterface____parentInterfaces);
		tSuperInterface__tInterface____childInterfaces.setSrc(tSuperInterface);
		tSuperInterface__tInterface____childInterfaces.setTrg(tInterface);
		ruleresult.getCreatedEdges().add(tSuperInterface__tInterface____childInterfaces);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setSrc(eInterfaceDeclaration);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eInterfaceDeclaration__eTypeAccess____superInterfaces);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tInterface__tSuperInterface____parentInterfaces
				.setName(tInterface__tSuperInterface____parentInterfaces_name_prime);
		tSuperInterface__tInterface____childInterfaces
				.setName(tSuperInterface__tInterface____childInterfaces_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eInterfaceDeclaration__eTypeAccess____superInterfaces
				.setName(eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime);
		return new Object[] { ruleresult, tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration,
				eSuperInterface, tInterface__tSuperInterface____parentInterfaces,
				tSuperInterface__tInterface____childInterfaces, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eInterfaceDeclaration__eTypeAccess____superInterfaces };
	}

	public static final void pattern_InterfaceExtendsInterface_1_5_registerobjects_expressionBBBBBBBBB(
			InterfaceExtendsInterface _this, PerformRuleResult ruleresult, EObject eSuperInterfaceToTSuperInterface,
			EObject tInterface, EObject tSuperInterface, EObject eTypeAccess, EObject eInterfaceDeclaration,
			EObject eSuperInterface, EObject eInterfaceDeclarationToTInterface) {
		_this.registerObjects_FWD(ruleresult, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
				eTypeAccess, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);

	}

	public static final PerformRuleResult pattern_InterfaceExtendsInterface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_bindingFB(
			InterfaceExtendsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceExtendsInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceExtendsInterface _this) {
		Object[] result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_binding = pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_black = pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "InterfaceExtendsInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eTypeAccess");
		EObject _localVariable_1 = match.getObject("eInterfaceDeclaration");
		EObject _localVariable_2 = match.getObject("eSuperInterface");
		EObject tmpETypeAccess = _localVariable_0;
		EObject tmpEInterfaceDeclaration = _localVariable_1;
		EObject tmpESuperInterface = _localVariable_2;
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
				InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
				if (tmpESuperInterface instanceof InterfaceDeclaration) {
					InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
					return new Object[] { eTypeAccess, eInterfaceDeclaration, eSuperInterface, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_2_2_corematch_blackFFFBBBFB(
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eSuperInterface, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface.getTarget();
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					for (TypeToTAbstractType eInterfaceDeclarationToTInterface : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eInterfaceDeclaration, TypeToTAbstractType.class, "source")) {
						if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
							TAbstractType tmpTInterface = eInterfaceDeclarationToTInterface.getTarget();
							if (tmpTInterface instanceof TInterface) {
								TInterface tInterface = (TInterface) tmpTInterface;
								if (!tInterface.equals(tSuperInterface)) {
									_result.add(new Object[] { eSuperInterfaceToTSuperInterface, tInterface,
											tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
											eInterfaceDeclarationToTInterface, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_2_3_findcontext_blackBBBBBBB(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInterface.equals(tSuperInterface)) {
			if (!eInterfaceDeclaration.equals(eSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
						if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
							if (eSuperInterface.equals(eTypeAccess.getType())) {
								if (eInterfaceDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
									if (eInterfaceDeclaration.equals(eInterfaceDeclarationToTInterface.getSource())) {
										if (tInterface.equals(eInterfaceDeclarationToTInterface.getTarget())) {
											_result.add(new Object[] { eSuperInterfaceToTSuperInterface, tInterface,
													tSuperInterface, eTypeAccess, eInterfaceDeclaration,
													eSuperInterface, eInterfaceDeclarationToTInterface });
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

	public static final Object[] pattern_InterfaceExtendsInterface_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclarationToTInterface__tInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source_name_prime = "source";
		String eInterfaceDeclarationToTInterface__tInterface____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setSrc(eInterfaceDeclaration);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclaration__eTypeAccess____superInterfaces);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source.setSrc(eInterfaceDeclarationToTInterface);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source.setTrg(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements()
				.add(eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source);
		eInterfaceDeclarationToTInterface__tInterface____target.setSrc(eInterfaceDeclarationToTInterface);
		eInterfaceDeclarationToTInterface__tInterface____target.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface__tInterface____target);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eInterfaceDeclaration__eTypeAccess____superInterfaces
				.setName(eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source
				.setName(eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source_name_prime);
		eInterfaceDeclarationToTInterface__tInterface____target
				.setName(eInterfaceDeclarationToTInterface__tInterface____target_name_prime);
		return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
				eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, isApplicableMatch,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eInterfaceDeclaration__eTypeAccess____superInterfaces,
				eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source,
				eInterfaceDeclarationToTInterface__tInterface____target };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_4_solveCSP_bindingFBBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eSuperInterfaceToTSuperInterface,
				tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
				eInterfaceDeclarationToTInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface,
					tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
					eInterfaceDeclarationToTInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		Object[] result_pattern_InterfaceExtendsInterface_2_4_solveCSP_binding = pattern_InterfaceExtendsInterface_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
				eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
		if (result_pattern_InterfaceExtendsInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_2_4_solveCSP_black = pattern_InterfaceExtendsInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface,
						tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
						eInterfaceDeclarationToTInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_2_5_checkCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceExtendsInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceExtendsInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_1_initialbindings_blackBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tInterface, TInterface tSuperInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			return new Object[] { _this, match, tInterface, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_2_SolveCSP_bindingFBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tInterface, TInterface tSuperInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tInterface, tSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tInterface, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_2_SolveCSP_bindingAndBlackFBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tInterface, TInterface tSuperInterface) {
		Object[] result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_binding = pattern_InterfaceExtendsInterface_10_2_SolveCSP_bindingFBBBB(
				_this, match, tInterface, tSuperInterface);
		if (result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_black = pattern_InterfaceExtendsInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tInterface, tSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_10_3_CheckCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_4_collectelementstobetranslated_blackBBB(
			Match match, TInterface tInterface, TInterface tSuperInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			return new Object[] { match, tInterface, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TInterface tInterface, TInterface tSuperInterface) {
		EMoflonEdge tInterface__tSuperInterface____parentInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tInterface____childInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tInterface__tSuperInterface____parentInterfaces_name_prime = "parentInterfaces";
		String tSuperInterface__tInterface____childInterfaces_name_prime = "childInterfaces";
		tInterface__tSuperInterface____parentInterfaces.setSrc(tInterface);
		tInterface__tSuperInterface____parentInterfaces.setTrg(tSuperInterface);
		match.getToBeTranslatedEdges().add(tInterface__tSuperInterface____parentInterfaces);
		tSuperInterface__tInterface____childInterfaces.setSrc(tSuperInterface);
		tSuperInterface__tInterface____childInterfaces.setTrg(tInterface);
		match.getToBeTranslatedEdges().add(tSuperInterface__tInterface____childInterfaces);
		tInterface__tSuperInterface____parentInterfaces
				.setName(tInterface__tSuperInterface____parentInterfaces_name_prime);
		tSuperInterface__tInterface____childInterfaces
				.setName(tSuperInterface__tInterface____childInterfaces_name_prime);
		return new Object[] { match, tInterface, tSuperInterface, tInterface__tSuperInterface____parentInterfaces,
				tSuperInterface__tInterface____childInterfaces };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_5_collectcontextelements_blackBBB(Match match,
			TInterface tInterface, TInterface tSuperInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			return new Object[] { match, tInterface, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_5_collectcontextelements_greenBBB(Match match,
			TInterface tInterface, TInterface tSuperInterface) {
		match.getContextNodes().add(tInterface);
		match.getContextNodes().add(tSuperInterface);
		return new Object[] { match, tInterface, tSuperInterface };
	}

	public static final void pattern_InterfaceExtendsInterface_10_6_registerobjectstomatch_expressionBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tInterface, TInterface tSuperInterface) {
		_this.registerObjectsToMatch_BWD(match, tInterface, tSuperInterface);

	}

	public static final boolean pattern_InterfaceExtendsInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject _localVariable_1 = isApplicableMatch.getObject("tInterface");
		EObject _localVariable_2 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("eInterfaceDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("eSuperInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("eInterfaceDeclarationToTInterface");
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_0;
		EObject tmpTInterface = _localVariable_1;
		EObject tmpTSuperInterface = _localVariable_2;
		EObject tmpEInterfaceDeclaration = _localVariable_3;
		EObject tmpESuperInterface = _localVariable_4;
		EObject tmpEInterfaceDeclarationToTInterface = _localVariable_5;
		if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
			if (tmpTInterface instanceof TInterface) {
				TInterface tInterface = (TInterface) tmpTInterface;
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
						InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
						if (tmpESuperInterface instanceof InterfaceDeclaration) {
							InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
							if (tmpEInterfaceDeclarationToTInterface instanceof TypeToTAbstractType) {
								TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) tmpEInterfaceDeclarationToTInterface;
								return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
										eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_1_performtransformation_blackBBBBBBFBB(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceExtendsInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tInterface.equals(tSuperInterface)) {
			if (!eInterfaceDeclaration.equals(eSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
									eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, csp,
									_this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding = pattern_InterfaceExtendsInterface_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding != null) {
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[0];
			TInterface tInterface = (TInterface) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[1];
			TInterface tSuperInterface = (TInterface) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[2];
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[3];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[4];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[5];

			Object[] result_pattern_InterfaceExtendsInterface_11_1_performtransformation_black = pattern_InterfaceExtendsInterface_11_1_performtransformation_blackBBBBBBFBB(
					eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eInterfaceDeclaration,
					eSuperInterface, eInterfaceDeclarationToTInterface, _this, isApplicableMatch);
			if (result_pattern_InterfaceExtendsInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_black[6];

				return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
						eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_1_performtransformation_greenFBB(
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		eTypeAccess.setType(eSuperInterface);
		eInterfaceDeclaration.getSuperInterfaces().add(eTypeAccess);
		return new Object[] { eTypeAccess, eInterfaceDeclaration, eSuperInterface };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject eSuperInterfaceToTSuperInterface, EObject tInterface,
			EObject tSuperInterface, EObject eTypeAccess, EObject eInterfaceDeclaration, EObject eSuperInterface,
			EObject eInterfaceDeclarationToTInterface) {
		if (!eSuperInterfaceToTSuperInterface.equals(tInterface)) {
			if (!eSuperInterfaceToTSuperInterface.equals(tSuperInterface)) {
				if (!eSuperInterfaceToTSuperInterface.equals(eTypeAccess)) {
					if (!tInterface.equals(tSuperInterface)) {
						if (!eTypeAccess.equals(tInterface)) {
							if (!eTypeAccess.equals(tSuperInterface)) {
								if (!eInterfaceDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
									if (!eInterfaceDeclaration.equals(tInterface)) {
										if (!eInterfaceDeclaration.equals(tSuperInterface)) {
											if (!eInterfaceDeclaration.equals(eTypeAccess)) {
												if (!eInterfaceDeclaration.equals(eSuperInterface)) {
													if (!eInterfaceDeclaration
															.equals(eInterfaceDeclarationToTInterface)) {
														if (!eSuperInterface.equals(eSuperInterfaceToTSuperInterface)) {
															if (!eSuperInterface.equals(tInterface)) {
																if (!eSuperInterface.equals(tSuperInterface)) {
																	if (!eSuperInterface.equals(eTypeAccess)) {
																		if (!eInterfaceDeclarationToTInterface.equals(
																				eSuperInterfaceToTSuperInterface)) {
																			if (!eInterfaceDeclarationToTInterface
																					.equals(tInterface)) {
																				if (!eInterfaceDeclarationToTInterface
																						.equals(tSuperInterface)) {
																					if (!eInterfaceDeclarationToTInterface
																							.equals(eTypeAccess)) {
																						if (!eInterfaceDeclarationToTInterface
																								.equals(eSuperInterface)) {
																							return new Object[] {
																									ruleresult,
																									eSuperInterfaceToTSuperInterface,
																									tInterface,
																									tSuperInterface,
																									eTypeAccess,
																									eInterfaceDeclaration,
																									eSuperInterface,
																									eInterfaceDeclarationToTInterface };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InterfaceExtendsInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tInterface, EObject tSuperInterface, EObject eTypeAccess,
			EObject eInterfaceDeclaration, EObject eSuperInterface) {
		EMoflonEdge tInterface__tSuperInterface____parentInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tInterface____childInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceExtendsInterface";
		String tInterface__tSuperInterface____parentInterfaces_name_prime = "parentInterfaces";
		String tSuperInterface__tInterface____childInterfaces_name_prime = "childInterfaces";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		tInterface__tSuperInterface____parentInterfaces.setSrc(tInterface);
		tInterface__tSuperInterface____parentInterfaces.setTrg(tSuperInterface);
		ruleresult.getTranslatedEdges().add(tInterface__tSuperInterface____parentInterfaces);
		tSuperInterface__tInterface____childInterfaces.setSrc(tSuperInterface);
		tSuperInterface__tInterface____childInterfaces.setTrg(tInterface);
		ruleresult.getTranslatedEdges().add(tSuperInterface__tInterface____childInterfaces);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		ruleresult.getCreatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setSrc(eInterfaceDeclaration);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eInterfaceDeclaration__eTypeAccess____superInterfaces);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tInterface__tSuperInterface____parentInterfaces
				.setName(tInterface__tSuperInterface____parentInterfaces_name_prime);
		tSuperInterface__tInterface____childInterfaces
				.setName(tSuperInterface__tInterface____childInterfaces_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eInterfaceDeclaration__eTypeAccess____superInterfaces
				.setName(eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime);
		return new Object[] { ruleresult, tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration,
				eSuperInterface, tInterface__tSuperInterface____parentInterfaces,
				tSuperInterface__tInterface____childInterfaces, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eInterfaceDeclaration__eTypeAccess____superInterfaces };
	}

	public static final void pattern_InterfaceExtendsInterface_11_5_registerobjects_expressionBBBBBBBBB(
			InterfaceExtendsInterface _this, PerformRuleResult ruleresult, EObject eSuperInterfaceToTSuperInterface,
			EObject tInterface, EObject tSuperInterface, EObject eTypeAccess, EObject eInterfaceDeclaration,
			EObject eSuperInterface, EObject eInterfaceDeclarationToTInterface) {
		_this.registerObjects_BWD(ruleresult, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
				eTypeAccess, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);

	}

	public static final PerformRuleResult pattern_InterfaceExtendsInterface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_bindingFB(
			InterfaceExtendsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceExtendsInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceExtendsInterface _this) {
		Object[] result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_binding = pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_black = pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "InterfaceExtendsInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tInterface");
		EObject _localVariable_1 = match.getObject("tSuperInterface");
		EObject tmpTInterface = _localVariable_0;
		EObject tmpTSuperInterface = _localVariable_1;
		if (tmpTInterface instanceof TInterface) {
			TInterface tInterface = (TInterface) tmpTInterface;
			if (tmpTSuperInterface instanceof TInterface) {
				TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
				return new Object[] { tInterface, tSuperInterface, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_12_2_corematch_blackFBBFFFB(
			TInterface tInterface, TInterface tSuperInterface, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInterface.equals(tSuperInterface)) {
			for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tSuperInterface, TypeToTAbstractType.class, "target")) {
				Type tmpESuperInterface = eSuperInterfaceToTSuperInterface.getSource();
				if (tmpESuperInterface instanceof InterfaceDeclaration) {
					InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
					for (TypeToTAbstractType eInterfaceDeclarationToTInterface : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tInterface, TypeToTAbstractType.class, "target")) {
						if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
							Type tmpEInterfaceDeclaration = eInterfaceDeclarationToTInterface.getSource();
							if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
								InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
								if (!eInterfaceDeclaration.equals(eSuperInterface)) {
									_result.add(new Object[] { eSuperInterfaceToTSuperInterface, tInterface,
											tSuperInterface, eInterfaceDeclaration, eSuperInterface,
											eInterfaceDeclarationToTInterface, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_12_3_findcontext_blackBBBBBB(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInterface.equals(tSuperInterface)) {
			if (!eInterfaceDeclaration.equals(eSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
						if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
							if (tInterface.getParentInterfaces().contains(tSuperInterface)) {
								if (eInterfaceDeclaration.equals(eInterfaceDeclarationToTInterface.getSource())) {
									if (tInterface.equals(eInterfaceDeclarationToTInterface.getTarget())) {
										_result.add(new Object[] { eSuperInterfaceToTSuperInterface, tInterface,
												tSuperInterface, eInterfaceDeclaration, eSuperInterface,
												eInterfaceDeclarationToTInterface });
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

	public static final Object[] pattern_InterfaceExtendsInterface_12_3_findcontext_greenBBBBBBFFFFFFF(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tInterface__tSuperInterface____parentInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tInterface____childInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclarationToTInterface__tInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		String tInterface__tSuperInterface____parentInterfaces_name_prime = "parentInterfaces";
		String tSuperInterface__tInterface____childInterfaces_name_prime = "childInterfaces";
		String eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source_name_prime = "source";
		String eInterfaceDeclarationToTInterface__tInterface____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		tInterface__tSuperInterface____parentInterfaces.setSrc(tInterface);
		tInterface__tSuperInterface____parentInterfaces.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(tInterface__tSuperInterface____parentInterfaces);
		tSuperInterface__tInterface____childInterfaces.setSrc(tSuperInterface);
		tSuperInterface__tInterface____childInterfaces.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(tSuperInterface__tInterface____childInterfaces);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source.setSrc(eInterfaceDeclarationToTInterface);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source.setTrg(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements()
				.add(eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source);
		eInterfaceDeclarationToTInterface__tInterface____target.setSrc(eInterfaceDeclarationToTInterface);
		eInterfaceDeclarationToTInterface__tInterface____target.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface__tInterface____target);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		tInterface__tSuperInterface____parentInterfaces
				.setName(tInterface__tSuperInterface____parentInterfaces_name_prime);
		tSuperInterface__tInterface____childInterfaces
				.setName(tSuperInterface__tInterface____childInterfaces_name_prime);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source
				.setName(eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source_name_prime);
		eInterfaceDeclarationToTInterface__tInterface____target
				.setName(eInterfaceDeclarationToTInterface__tInterface____target_name_prime);
		return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eInterfaceDeclaration,
				eSuperInterface, eInterfaceDeclarationToTInterface, isApplicableMatch,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target,
				tInterface__tSuperInterface____parentInterfaces, tSuperInterface__tInterface____childInterfaces,
				eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source,
				eInterfaceDeclarationToTInterface__tInterface____target };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_4_solveCSP_bindingFBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eSuperInterfaceToTSuperInterface,
				tInterface, tSuperInterface, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface,
					tSuperInterface, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		Object[] result_pattern_InterfaceExtendsInterface_12_4_solveCSP_binding = pattern_InterfaceExtendsInterface_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
				eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface);
		if (result_pattern_InterfaceExtendsInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_12_4_solveCSP_black = pattern_InterfaceExtendsInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface,
						tSuperInterface, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_12_5_checkCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceExtendsInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceExtendsInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_bindingFB(
			InterfaceExtendsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceExtendsInterface _this) {
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

	public static final Object[] pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceExtendsInterface _this) {
		Object[] result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_binding = pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_black = pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpETypeAccess = _edge_type.getSrc();
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			EObject tmpESuperInterface = _edge_type.getTrg();
			if (tmpESuperInterface instanceof InterfaceDeclaration) {
				InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
				if (eSuperInterface.equals(eTypeAccess.getType())) {
					for (AbstractTypeDeclaration tmpEInterfaceDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
						if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
							InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
							if (!eInterfaceDeclaration.equals(eSuperInterface)) {
								_result.add(new Object[] { eTypeAccess, eInterfaceDeclaration, eSuperInterface,
										_edge_type });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceExtendsInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InterfaceExtendsInterface _this, Match match, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eTypeAccess, eInterfaceDeclaration, eSuperInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceExtendsInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceExtendsInterface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_bindingFB(
			InterfaceExtendsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceExtendsInterface _this) {
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

	public static final Object[] pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceExtendsInterface _this) {
		Object[] result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_binding = pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_black = pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_parentInterfaces) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTInterface = _edge_parentInterfaces.getSrc();
		if (tmpTInterface instanceof TInterface) {
			TInterface tInterface = (TInterface) tmpTInterface;
			EObject tmpTSuperInterface = _edge_parentInterfaces.getTrg();
			if (tmpTSuperInterface instanceof TInterface) {
				TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
				if (!tInterface.equals(tSuperInterface)) {
					if (tInterface.getParentInterfaces().contains(tSuperInterface)) {
						_result.add(new Object[] { tInterface, tSuperInterface, _edge_parentInterfaces });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceExtendsInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tInterface, TInterface tSuperInterface) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tInterface, tSuperInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceExtendsInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceExtendsInterface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_1_prepare_blackB(
			InterfaceExtendsInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_2_matchcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tInterface");
		EObject _localVariable_1 = targetMatch.getObject("tSuperInterface");
		EObject _localVariable_2 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_3 = sourceMatch.getObject("eInterfaceDeclaration");
		EObject _localVariable_4 = sourceMatch.getObject("eSuperInterface");
		EObject tmpTInterface = _localVariable_0;
		EObject tmpTSuperInterface = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpEInterfaceDeclaration = _localVariable_3;
		EObject tmpESuperInterface = _localVariable_4;
		if (tmpTInterface instanceof TInterface) {
			TInterface tInterface = (TInterface) tmpTInterface;
			if (tmpTSuperInterface instanceof TInterface) {
				TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
						InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
						if (tmpESuperInterface instanceof InterfaceDeclaration) {
							InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
							return new Object[] { tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration,
									eSuperInterface, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_24_2_matchcontext_blackFBBBBBFBB(
			TInterface tInterface, TInterface tSuperInterface, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInterface.equals(tSuperInterface)) {
			if (!eInterfaceDeclaration.equals(eSuperInterface)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (tInterface.getParentInterfaces().contains(tSuperInterface)) {
						if (eSuperInterface.equals(eTypeAccess.getType())) {
							if (eInterfaceDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
								for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(eSuperInterface, TypeToTAbstractType.class,
												"source")) {
									if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
										for (TypeToTAbstractType eInterfaceDeclarationToTInterface : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(eInterfaceDeclaration,
														TypeToTAbstractType.class, "source")) {
											if (!eInterfaceDeclarationToTInterface
													.equals(eSuperInterfaceToTSuperInterface)) {
												if (tInterface.equals(eInterfaceDeclarationToTInterface.getTarget())) {
													_result.add(
															new Object[] { eSuperInterfaceToTSuperInterface, tInterface,
																	tSuperInterface, eTypeAccess, eInterfaceDeclaration,
																	eSuperInterface, eInterfaceDeclarationToTInterface,
																	sourceMatch, targetMatch });
												}
											}
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

	public static final Object[] pattern_InterfaceExtendsInterface_24_2_matchcontext_greenBBBBBBBBFB(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "InterfaceExtendsInterface";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
				eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_3_checkcsp_bindingFBBBBBBBBBBB(
			InterfaceExtendsInterface _this, CCMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, eSuperInterfaceToTSuperInterface,
				tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
				eInterfaceDeclarationToTInterface, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface,
					tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
					eInterfaceDeclarationToTInterface, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBB(
			InterfaceExtendsInterface _this, CCMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			TypeAccess eTypeAccess, InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceExtendsInterface_24_3_checkcsp_binding = pattern_InterfaceExtendsInterface_24_3_checkcsp_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface, eTypeAccess,
				eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, sourceMatch, targetMatch);
		if (result_pattern_InterfaceExtendsInterface_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_24_3_checkcsp_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_24_3_checkcsp_black = pattern_InterfaceExtendsInterface_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface,
						tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
						eInterfaceDeclarationToTInterface, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_4_createcorrespondence_blackBBBBBB(
			TInterface tInterface, TInterface tSuperInterface, TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			CCMatch isApplicableMatch) {
		if (!tInterface.equals(tSuperInterface)) {
			if (!eInterfaceDeclaration.equals(eSuperInterface)) {
				return new Object[] { tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceExtendsInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceExtendsInterface_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_blackBBB(TypeAccess eTypeAccess,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (eSuperInterface.equals(eTypeAccess.getType())) {
				if (eInterfaceDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
					return new Object[] { eTypeAccess, eInterfaceDeclaration, eSuperInterface };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_28_1_matchtggpattern_blackBB(TInterface tInterface,
			TInterface tSuperInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			if (tInterface.getParentInterfaces().contains(tSuperInterface)) {
				return new Object[] { tInterface, tSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_1_createresult_blackB(
			InterfaceExtendsInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		if (ruleResult.getCorrObjects().contains(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration eSuperInterface) {
		if (ruleResult.getSourceObjects().contains(eSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TInterface tSuperInterface) {
		if (ruleResult.getTargetObjects().contains(tSuperInterface)) {
			return new Object[] { ruleResult, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TInterface tInterface) {
		if (ruleResult.getTargetObjects().contains(tInterface)) {
			return new Object[] { ruleResult, tInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		if (ruleResult.getCorrObjects().contains(eInterfaceDeclarationToTInterface)) {
			return new Object[] { ruleResult, eInterfaceDeclarationToTInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration eInterfaceDeclaration) {
		if (ruleResult.getSourceObjects().contains(eInterfaceDeclaration)) {
			return new Object[] { ruleResult, eInterfaceDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eSuperInterfaceToTSuperInterfaceList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eInterfaceDeclarationToTInterfaceList : ruleEntryContainer.getRuleEntryList()) {
				if (!eInterfaceDeclarationToTInterfaceList.equals(eSuperInterfaceToTSuperInterfaceList)) {
					for (EObject tmpESuperInterfaceToTSuperInterface : eSuperInterfaceToTSuperInterfaceList
							.getEntryObjects()) {
						if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
							TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
							Type tmpESuperInterface = eSuperInterfaceToTSuperInterface.getSource();
							if (tmpESuperInterface instanceof InterfaceDeclaration) {
								InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
								TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface.getTarget();
								if (tmpTSuperInterface instanceof TInterface) {
									TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
									if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, eSuperInterfaceToTSuperInterface) == null) {
										if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, eSuperInterface) == null) {
											if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tSuperInterface) == null) {
												for (EObject tmpEInterfaceDeclarationToTInterface : eInterfaceDeclarationToTInterfaceList
														.getEntryObjects()) {
													if (tmpEInterfaceDeclarationToTInterface instanceof TypeToTAbstractType) {
														TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) tmpEInterfaceDeclarationToTInterface;
														if (!eInterfaceDeclarationToTInterface
																.equals(eSuperInterfaceToTSuperInterface)) {
															TAbstractType tmpTInterface = eInterfaceDeclarationToTInterface
																	.getTarget();
															if (tmpTInterface instanceof TInterface) {
																TInterface tInterface = (TInterface) tmpTInterface;
																if (!tInterface.equals(tSuperInterface)) {
																	Type tmpEInterfaceDeclaration = eInterfaceDeclarationToTInterface
																			.getSource();
																	if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
																		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
																		if (!eInterfaceDeclaration
																				.equals(eSuperInterface)) {
																			if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult,
																					eInterfaceDeclarationToTInterface) == null) {
																				if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult,
																						tInterface) == null) {
																					if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							eInterfaceDeclaration) == null) {
																						_result.add(new Object[] {
																								eSuperInterfaceToTSuperInterfaceList,
																								eSuperInterfaceToTSuperInterface,
																								eSuperInterface,
																								tSuperInterface,
																								eInterfaceDeclarationToTInterfaceList,
																								tInterface,
																								eInterfaceDeclarationToTInterface,
																								eInterfaceDeclaration,
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
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_3_solveCSP_bindingFBBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eSuperInterfaceToTSuperInterface,
				tInterface, tSuperInterface, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface,
					tSuperInterface, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InterfaceExtendsInterface_29_3_solveCSP_binding = pattern_InterfaceExtendsInterface_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
				eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, ruleResult);
		if (result_pattern_InterfaceExtendsInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_29_3_solveCSP_black = pattern_InterfaceExtendsInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eSuperInterfaceToTSuperInterface, tInterface,
						tSuperInterface, eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_29_4_checkCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_5_checknacs_blackBBBBBB(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			if (!eInterfaceDeclaration.equals(eSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
							eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_6_perform_blackBBBBBBB(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TInterface tInterface, TInterface tSuperInterface,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, ModelgeneratorRuleResult ruleResult) {
		if (!tInterface.equals(tSuperInterface)) {
			if (!eInterfaceDeclaration.equals(eSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					return new Object[] { eSuperInterfaceToTSuperInterface, tInterface, tSuperInterface,
							eInterfaceDeclaration, eSuperInterface, eInterfaceDeclarationToTInterface, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_6_perform_greenBBFBBB(TInterface tInterface,
			TInterface tSuperInterface, InterfaceDeclaration eInterfaceDeclaration,
			InterfaceDeclaration eSuperInterface, ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tInterface.getParentInterfaces().add(tSuperInterface);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eTypeAccess.setType(eSuperInterface);
		eInterfaceDeclaration.getSuperInterfaces().add(eTypeAccess);
		ruleResult.getSourceObjects().add(eTypeAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tInterface, tSuperInterface, eTypeAccess, eInterfaceDeclaration, eSuperInterface,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_InterfaceExtendsInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InterfaceExtendsInterfaceImpl
