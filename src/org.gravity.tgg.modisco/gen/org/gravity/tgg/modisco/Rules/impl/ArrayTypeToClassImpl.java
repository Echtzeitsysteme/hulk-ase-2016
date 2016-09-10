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

import org.eclipse.gmt.modisco.java.ArrayType;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.ModelToTypeGraph;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.ArrayTypeToClass;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;

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
 * An implementation of the model object '<em><b>Array Type To Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArrayTypeToClassImpl extends AbstractRuleImpl implements ArrayTypeToClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeToClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getArrayTypeToClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess eTypeAccess, Type eType, ArrayType eArrayType,
			Model eModel) {
		// initial bindings
		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_1_initialbindings_blackBBBBBB(this,
				match, eTypeAccess, eType, eArrayType, eModel);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = "
							+ eType + ", " + "[eArrayType] = " + eArrayType + ", " + "[eModel] = " + eModel + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, eTypeAccess, eType,
						eArrayType, eModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = "
					+ eType + ", " + "[eArrayType] = " + eArrayType + ", " + "[eModel] = " + eModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(match, eTypeAccess, eType,
							eArrayType, eModel);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = "
								+ eType + ", " + "[eArrayType] = " + eArrayType + ", " + "[eModel] = " + eModel + ".");
			}
			ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					eTypeAccess, eType, eArrayType, eModel);
			// EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result4_green[5];
			// EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];
			// EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result4_green[7];
			// EMoflonEdge eModel__eArrayType____orphanTypes = (EMoflonEdge) result4_green[8];

			// collect context elements
			Object[] result5_black = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_0_5_collectcontextelements_blackBBBBB(match, eTypeAccess, eType,
							eArrayType, eModel);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType + ", "
								+ "[eArrayType] = " + eArrayType + ", " + "[eModel] = " + eModel + ".");
			}
			ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_5_collectcontextelements_greenBBB(match, eType, eModel);

			// register objects to match
			ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					eTypeAccess, eType, eArrayType, eModel);
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_7_expressionF();
		} else {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[0];
		Type eType = (Type) result1_bindingAndBlack[1];
		TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result1_bindingAndBlack[2];
		ArrayType eArrayType = (ArrayType) result1_bindingAndBlack[3];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[4];
		ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[5];
		TAbstractType tArrayClass = (TAbstractType) result1_bindingAndBlack[6];
		Model eModel = (Model) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_1_1_performtransformation_greenBBF(eArrayType, tArrayClass);
		TypeToTAbstractType eArrayTypeToTArrayClass = (TypeToTAbstractType) result1_green[2];

		// collect translated elements
		Object[] result2_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_2_collecttranslatedelements_blackBBB(
				eTypeAccess, eArrayType, eArrayTypeToTArrayClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eArrayType] = " + eArrayType + ", "
					+ "[eArrayTypeToTArrayClass] = " + eArrayTypeToTArrayClass + ".");
		}
		Object[] result2_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_2_collecttranslatedelements_greenFBBB(
				eTypeAccess, eArrayType, eArrayTypeToTArrayClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph,
				tArrayClass, eArrayTypeToTArrayClass, eModel);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = "
					+ eType + ", " + "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", " + "[eArrayType] = "
					+ eArrayType + ", " + "[typeGraph] = " + typeGraph + ", " + "[eModelToTypeGraph] = "
					+ eModelToTypeGraph + ", " + "[tArrayClass] = " + tArrayClass + ", "
					+ "[eArrayTypeToTArrayClass] = " + eArrayTypeToTArrayClass + ", " + "[eModel] = " + eModel + ".");
		}
		ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult,
				eTypeAccess, eType, eArrayType, tArrayClass, eArrayTypeToTArrayClass, eModel);
		// EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[7];
		// EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		// EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result3_green[9];
		// EMoflonEdge eArrayTypeToTArrayClass__eArrayType____source = (EMoflonEdge) result3_green[10];
		// EMoflonEdge eArrayTypeToTArrayClass__tArrayClass____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge eModel__eArrayType____orphanTypes = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph, tArrayClass,
				eArrayTypeToTArrayClass, eModel);
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[0];
		Type eType = (Type) result2_binding[1];
		ArrayType eArrayType = (ArrayType) result2_binding[2];
		Model eModel = (Model) result2_binding[3];
		for (Object[] result2_black : ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_2_2_corematch_blackBBFBFFFBB(eTypeAccess, eType, eArrayType, eModel, match)) {
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result2_black[2];
			TypeGraph typeGraph = (TypeGraph) result2_black[4];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[5];
			TAbstractType tArrayClass = (TAbstractType) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_3_findcontext_blackBBBBBBBB(
					eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph, tArrayClass,
					eModel)) {
				Object[] result3_green = ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(eTypeAccess, eType,
								eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph, tArrayClass, eModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eTypeToTArrayClass__eType____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eTypeToTArrayClass__tArrayClass____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result3_green[13];
				// EMoflonEdge typeGraph__tArrayClass____ownedTypes = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tArrayClass__typeGraph____pg = (EMoflonEdge) result3_green[15];
				// EMoflonEdge eModelToTypeGraph__eModel____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge eModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge eModel__eArrayType____orphanTypes = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph,
								tArrayClass, eModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType + ", "
							+ "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", " + "[eArrayType] = " + eArrayType
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph
							+ ", " + "[tArrayClass] = " + tArrayClass + ", " + "[eModel] = " + eModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ArrayTypeToClassImpl
							.pattern_ArrayTypeToClass_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess eTypeAccess, Type eType, ArrayType eArrayType,
			Model eModel) {
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eType", eType);
		match.registerObject("eArrayType", eArrayType);
		match.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess eTypeAccess, Type eType, ArrayType eArrayType,
			Model eModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeAccess eTypeAccess, Type eType,
			TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		isApplicableMatch.registerObject("eArrayType", eArrayType);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("tArrayClass", tArrayClass);
		isApplicableMatch.registerObject("eModel", eModel);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eTypeAccess, EObject eType,
			EObject eTypeToTArrayClass, EObject eArrayType, EObject typeGraph, EObject eModelToTypeGraph,
			EObject tArrayClass, EObject eArrayTypeToTArrayClass, EObject eModel) {
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		ruleresult.registerObject("eArrayType", eArrayType);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		ruleresult.registerObject("tArrayClass", tArrayClass);
		ruleresult.registerObject("eArrayTypeToTArrayClass", eArrayTypeToTArrayClass);
		ruleresult.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
						.equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eArrayType").eClass())
						.equals("java.ArrayType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(EMoflonEdge _edge_type) {
		// prepare return value
		Object[] result1_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_10_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			TypeAccess eTypeAccess = (TypeAccess) result2_black[0];
			Type eType = (Type) result2_black[1];
			ArrayType eArrayType = (ArrayType) result2_black[2];
			Model eModel = (Model) result2_black[3];
			Object[] result2_green = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, eTypeAccess, eType, eArrayType, eModel)) {
				// Ensure that the correct types of elements are matched
				if (ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ArrayTypeToClassImpl
							.pattern_ArrayTypeToClass_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ArrayTypeToClass");
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
		ruleResult.setRule("ArrayTypeToClass");
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
		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_13_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_13_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_13_2_matchcontext_bindingFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[0];
		Type eType = (Type) result2_binding[1];
		ArrayType eArrayType = (ArrayType) result2_binding[2];
		TypeGraph typeGraph = (TypeGraph) result2_binding[3];
		TAbstractType tArrayClass = (TAbstractType) result2_binding[4];
		Model eModel = (Model) result2_binding[5];
		for (Object[] result2_black : ArrayTypeToClassImpl.pattern_ArrayTypeToClass_13_2_matchcontext_blackBBFBBFBBBB(
				eTypeAccess, eType, eArrayType, typeGraph, tArrayClass, eModel, sourceMatch, targetMatch)) {
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result2_black[2];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[5];
			Object[] result2_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_13_2_matchcontext_greenBBBBBBBBBFB(
					eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph, tArrayClass,
					eModel, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[9];

			// check csp
			Object[] result3_bindingAndBlack = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_13_3_checkcsp_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph,
							tArrayClass, eModel, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_13_4_createcorrespondence_blackBBBBBBB(eTypeAccess, eType, eArrayType,
								typeGraph, tArrayClass, eModel, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType + ", "
							+ "[eArrayType] = " + eArrayType + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[tArrayClass] = " + tArrayClass + ", " + "[eModel] = " + eModel + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ArrayTypeToClassImpl.pattern_ArrayTypeToClass_13_4_createcorrespondence_greenBBFB(eArrayType,
						tArrayClass, isApplicableMatch);
				// TypeToTAbstractType eArrayTypeToTArrayClass = (TypeToTAbstractType) result4_green[2];

				// add to returned result
				Object[] result5_black = ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_13_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ArrayTypeToClassImpl.pattern_ArrayTypeToClass_13_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_13_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TypeAccess eTypeAccess, Type eType,
			TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		isApplicableMatch.registerObject("eArrayType", eArrayType);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("tArrayClass", tArrayClass);
		isApplicableMatch.registerObject("eModel", eModel);
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
	public boolean checkDEC_FWD(TypeAccess eTypeAccess, Type eType, ArrayType eArrayType, Model eModel) {// match tgg pattern
		Object[] result1_black = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_16_1_matchtggpattern_blackBBBB(eTypeAccess, eType, eArrayType, eModel);
		if (result1_black != null) {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_16_2_expressionF();
		} else {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_16_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TAbstractType tArrayClass) {// match tgg pattern
		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_17_1_matchtggpattern_blackBB(typeGraph,
				tArrayClass);
		if (result1_black != null) {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_17_2_expressionF();
		} else {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_17_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eTypeToTArrayClassParameter) {
		// create result
		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_18_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eTypeToTArrayClassList = (RuleEntryList) result2_black[0];
			Type eType = (Type) result2_black[1];
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result2_black[2];
			TAbstractType tArrayClass = (TAbstractType) result2_black[3];
			TypeGraph typeGraph = (TypeGraph) result2_black[4];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[5];
			Model eModel = (Model) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_18_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, eType,
							eTypeToTArrayClass, typeGraph, eModelToTypeGraph, tArrayClass, eModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eType] = " + eType
						+ ", " + "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", " + "[typeGraph] = " + typeGraph
						+ ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph + ", " + "[tArrayClass] = " + tArrayClass
						+ ", " + "[eModel] = " + eModel + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_5_checknacs_blackBBBBBB(eType,
						eTypeToTArrayClass, typeGraph, eModelToTypeGraph, tArrayClass, eModel);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_6_perform_blackBBBBBBB(
							eType, eTypeToTArrayClass, typeGraph, eModelToTypeGraph, tArrayClass, eModel, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[eType] = " + eType + ", " + "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", "
								+ "[typeGraph] = " + typeGraph + ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph
								+ ", " + "[tArrayClass] = " + tArrayClass + ", " + "[eModel] = " + eModel + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_6_perform_greenFBFBFBB(eType, tArrayClass, eModel,
							ruleResult);
					// TypeAccess eTypeAccess = (TypeAccess) result6_green[0];
					// ArrayType eArrayType = (ArrayType) result6_green[2];
					// TypeToTAbstractType eArrayTypeToTArrayClass = (TypeToTAbstractType) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Type eType,
			TypeToTAbstractType eTypeToTArrayClass, TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph,
			TAbstractType tArrayClass, Model eModel, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("tArrayClass", tArrayClass);
		isApplicableMatch.registerObject("eModel", eModel);
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
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_TYPE_ARRAYTYPE_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1), (Type) arguments.get(2),
					(ArrayType) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_TYPE_ARRAYTYPE_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1), (Type) arguments.get(2),
					(ArrayType) arguments.get(3), (Model) arguments.get(4));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_TYPE_ARRAYTYPE_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2), (ArrayType) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEACCESS_TYPE_TYPETOTABSTRACTTYPE_ARRAYTYPE_TYPEGRAPH_MODELTOTYPEGRAPH_TABSTRACTTYPE_MODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2), (TypeToTAbstractType) arguments.get(3), (ArrayType) arguments.get(4),
					(TypeGraph) arguments.get(5), (ModelToTypeGraph) arguments.get(6), (TAbstractType) arguments.get(7),
					(Model) arguments.get(8));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TYPEACCESS_TYPE_TYPETOTABSTRACTTYPE_ARRAYTYPE_TYPEGRAPH_MODELTOTYPEGRAPH_TABSTRACTTYPE_MODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2), (TypeToTAbstractType) arguments.get(3), (ArrayType) arguments.get(4),
					(TypeGraph) arguments.get(5), (ModelToTypeGraph) arguments.get(6), (TAbstractType) arguments.get(7),
					(Model) arguments.get(8), (Match) arguments.get(9), (Match) arguments.get(10));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_DEC_FWD__TYPEACCESS_TYPE_ARRAYTYPE_MODEL:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (Type) arguments.get(1), (ArrayType) arguments.get(2),
					(Model) arguments.get(3));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_DEC_BWD__TYPEGRAPH_TABSTRACTTYPE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPE_TYPETOTABSTRACTTYPE_TYPEGRAPH_MODELTOTYPEGRAPH_TABSTRACTTYPE_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Type) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TypeGraph) arguments.get(3),
					(ModelToTypeGraph) arguments.get(4), (TAbstractType) arguments.get(5), (Model) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ArrayTypeToClass_0_1_initialbindings_blackBBBBBB(ArrayTypeToClass _this,
			Match match, TypeAccess eTypeAccess, Type eType, ArrayType eArrayType, Model eModel) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { _this, match, eTypeAccess, eType, eArrayType, eModel };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_2_SolveCSP_bindingFBBBBBB(ArrayTypeToClass _this,
			Match match, TypeAccess eTypeAccess, Type eType, ArrayType eArrayType, Model eModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eTypeAccess, eType, eArrayType, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eTypeAccess, eType, eArrayType, eModel };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(ArrayTypeToClass _this,
			Match match, TypeAccess eTypeAccess, Type eType, ArrayType eArrayType, Model eModel) {
		Object[] result_pattern_ArrayTypeToClass_0_2_SolveCSP_binding = pattern_ArrayTypeToClass_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, eTypeAccess, eType, eArrayType, eModel);
		if (result_pattern_ArrayTypeToClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToClass_0_2_SolveCSP_black = pattern_ArrayTypeToClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eTypeAccess, eType, eArrayType, eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_0_3_CheckCSP_expressionFBB(ArrayTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			TypeAccess eTypeAccess, Type eType, ArrayType eArrayType, Model eModel) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { match, eTypeAccess, eType, eArrayType, eModel };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			TypeAccess eTypeAccess, Type eType, ArrayType eArrayType, Model eModel) {
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		match.getToBeTranslatedNodes().add(eArrayType);
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String eModel__eArrayType____orphanTypes_name_prime = "orphanTypes";
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eArrayType__eTypeAccess____elementType);
		eModel__eArrayType____orphanTypes.setSrc(eModel);
		eModel__eArrayType____orphanTypes.setTrg(eArrayType);
		match.getToBeTranslatedEdges().add(eModel__eArrayType____orphanTypes);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		eModel__eArrayType____orphanTypes.setName(eModel__eArrayType____orphanTypes_name_prime);
		return new Object[] { match, eTypeAccess, eType, eArrayType, eModel, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, eArrayType__eTypeAccess____elementType,
				eModel__eArrayType____orphanTypes };
	}

	public static final Object[] pattern_ArrayTypeToClass_0_5_collectcontextelements_blackBBBBB(Match match,
			TypeAccess eTypeAccess, Type eType, ArrayType eArrayType, Model eModel) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { match, eTypeAccess, eType, eArrayType, eModel };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_5_collectcontextelements_greenBBB(Match match, Type eType,
			Model eModel) {
		match.getContextNodes().add(eType);
		match.getContextNodes().add(eModel);
		return new Object[] { match, eType, eModel };
	}

	public static final void pattern_ArrayTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(
			ArrayTypeToClass _this, Match match, TypeAccess eTypeAccess, Type eType, ArrayType eArrayType,
			Model eModel) {
		_this.registerObjectsToMatch_FWD(match, eTypeAccess, eType, eArrayType, eModel);

	}

	public static final boolean pattern_ArrayTypeToClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("eType");
		EObject _localVariable_2 = isApplicableMatch.getObject("eTypeToTArrayClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("eArrayType");
		EObject _localVariable_4 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_5 = isApplicableMatch.getObject("eModelToTypeGraph");
		EObject _localVariable_6 = isApplicableMatch.getObject("tArrayClass");
		EObject _localVariable_7 = isApplicableMatch.getObject("eModel");
		EObject tmpETypeAccess = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpETypeToTArrayClass = _localVariable_2;
		EObject tmpEArrayType = _localVariable_3;
		EObject tmpTypeGraph = _localVariable_4;
		EObject tmpEModelToTypeGraph = _localVariable_5;
		EObject tmpTArrayClass = _localVariable_6;
		EObject tmpEModel = _localVariable_7;
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpETypeToTArrayClass instanceof TypeToTAbstractType) {
					TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) tmpETypeToTArrayClass;
					if (tmpEArrayType instanceof ArrayType) {
						ArrayType eArrayType = (ArrayType) tmpEArrayType;
						if (tmpTypeGraph instanceof TypeGraph) {
							TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
							if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
								ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
								if (tmpTArrayClass instanceof TAbstractType) {
									TAbstractType tArrayClass = (TAbstractType) tmpTArrayClass;
									if (tmpEModel instanceof Model) {
										Model eModel = (Model) tmpEModel;
										return new Object[] { eTypeAccess, eType, eTypeToTArrayClass, eArrayType,
												typeGraph, eModelToTypeGraph, tArrayClass, eModel, isApplicableMatch };
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

	public static final Object[] pattern_ArrayTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
			TypeAccess eTypeAccess, Type eType, TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType,
			TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel,
			ArrayTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		if (!eArrayType.equals(eType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph,
							eModelToTypeGraph, tArrayClass, eModel, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ArrayTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ArrayTypeToClass_1_1_performtransformation_binding = pattern_ArrayTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ArrayTypeToClass_1_1_performtransformation_binding != null) {
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[0];
			Type eType = (Type) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[1];
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[2];
			ArrayType eArrayType = (ArrayType) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[3];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[4];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[5];
			TAbstractType tArrayClass = (TAbstractType) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[6];
			Model eModel = (Model) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[7];

			Object[] result_pattern_ArrayTypeToClass_1_1_performtransformation_black = pattern_ArrayTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
					eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph, tArrayClass,
					eModel, _this, isApplicableMatch);
			if (result_pattern_ArrayTypeToClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ArrayTypeToClass_1_1_performtransformation_black[8];

				return new Object[] { eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph,
						tArrayClass, eModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_1_1_performtransformation_greenBBF(ArrayType eArrayType,
			TAbstractType tArrayClass) {
		TypeToTAbstractType eArrayTypeToTArrayClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		eArrayTypeToTArrayClass.setSource(eArrayType);
		eArrayTypeToTArrayClass.setTarget(tArrayClass);
		return new Object[] { eArrayType, tArrayClass, eArrayTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToClass_1_2_collecttranslatedelements_blackBBB(TypeAccess eTypeAccess,
			ArrayType eArrayType, TypeToTAbstractType eArrayTypeToTArrayClass) {
		return new Object[] { eTypeAccess, eArrayType, eArrayTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToClass_1_2_collecttranslatedelements_greenFBBB(
			TypeAccess eTypeAccess, ArrayType eArrayType, TypeToTAbstractType eArrayTypeToTArrayClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		ruleresult.getTranslatedElements().add(eArrayType);
		ruleresult.getCreatedLinkElements().add(eArrayTypeToTArrayClass);
		return new Object[] { ruleresult, eTypeAccess, eArrayType, eArrayTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eType, EObject eTypeToTArrayClass,
			EObject eArrayType, EObject typeGraph, EObject eModelToTypeGraph, EObject tArrayClass,
			EObject eArrayTypeToTArrayClass, EObject eModel) {
		if (!eTypeAccess.equals(eTypeToTArrayClass)) {
			if (!eTypeAccess.equals(typeGraph)) {
				if (!eTypeAccess.equals(tArrayClass)) {
					if (!eType.equals(eTypeAccess)) {
						if (!eType.equals(eTypeToTArrayClass)) {
							if (!eType.equals(typeGraph)) {
								if (!eType.equals(tArrayClass)) {
									if (!eTypeToTArrayClass.equals(typeGraph)) {
										if (!eTypeToTArrayClass.equals(tArrayClass)) {
											if (!eArrayType.equals(eTypeAccess)) {
												if (!eArrayType.equals(eType)) {
													if (!eArrayType.equals(eTypeToTArrayClass)) {
														if (!eArrayType.equals(typeGraph)) {
															if (!eArrayType.equals(eModelToTypeGraph)) {
																if (!eArrayType.equals(tArrayClass)) {
																	if (!eArrayType.equals(eArrayTypeToTArrayClass)) {
																		if (!eArrayType.equals(eModel)) {
																			if (!eModelToTypeGraph
																					.equals(eTypeAccess)) {
																				if (!eModelToTypeGraph.equals(eType)) {
																					if (!eModelToTypeGraph.equals(
																							eTypeToTArrayClass)) {
																						if (!eModelToTypeGraph
																								.equals(typeGraph)) {
																							if (!eModelToTypeGraph
																									.equals(tArrayClass)) {
																								if (!tArrayClass.equals(
																										typeGraph)) {
																									if (!eArrayTypeToTArrayClass
																											.equals(eTypeAccess)) {
																										if (!eArrayTypeToTArrayClass
																												.equals(eType)) {
																											if (!eArrayTypeToTArrayClass
																													.equals(eTypeToTArrayClass)) {
																												if (!eArrayTypeToTArrayClass
																														.equals(typeGraph)) {
																													if (!eArrayTypeToTArrayClass
																															.equals(eModelToTypeGraph)) {
																														if (!eArrayTypeToTArrayClass
																																.equals(tArrayClass)) {
																															if (!eArrayTypeToTArrayClass
																																	.equals(eModel)) {
																																if (!eModel
																																		.equals(eTypeAccess)) {
																																	if (!eModel
																																			.equals(eType)) {
																																		if (!eModel
																																				.equals(eTypeToTArrayClass)) {
																																			if (!eModel
																																					.equals(typeGraph)) {
																																				if (!eModel
																																						.equals(eModelToTypeGraph)) {
																																					if (!eModel
																																							.equals(tArrayClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								eTypeAccess,
																																								eType,
																																								eTypeToTArrayClass,
																																								eArrayType,
																																								typeGraph,
																																								eModelToTypeGraph,
																																								tArrayClass,
																																								eArrayTypeToTArrayClass,
																																								eModel };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ArrayTypeToClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eType, EObject eArrayType, EObject tArrayClass,
			EObject eArrayTypeToTArrayClass, EObject eModel) {
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eArrayTypeToTArrayClass__eArrayType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eArrayTypeToTArrayClass__tArrayClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ArrayTypeToClass";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String eArrayTypeToTArrayClass__eArrayType____source_name_prime = "source";
		String eArrayTypeToTArrayClass__tArrayClass____target_name_prime = "target";
		String eModel__eArrayType____orphanTypes_name_prime = "orphanTypes";
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eArrayType__eTypeAccess____elementType);
		eArrayTypeToTArrayClass__eArrayType____source.setSrc(eArrayTypeToTArrayClass);
		eArrayTypeToTArrayClass__eArrayType____source.setTrg(eArrayType);
		ruleresult.getCreatedEdges().add(eArrayTypeToTArrayClass__eArrayType____source);
		eArrayTypeToTArrayClass__tArrayClass____target.setSrc(eArrayTypeToTArrayClass);
		eArrayTypeToTArrayClass__tArrayClass____target.setTrg(tArrayClass);
		ruleresult.getCreatedEdges().add(eArrayTypeToTArrayClass__tArrayClass____target);
		eModel__eArrayType____orphanTypes.setSrc(eModel);
		eModel__eArrayType____orphanTypes.setTrg(eArrayType);
		ruleresult.getTranslatedEdges().add(eModel__eArrayType____orphanTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		eArrayTypeToTArrayClass__eArrayType____source.setName(eArrayTypeToTArrayClass__eArrayType____source_name_prime);
		eArrayTypeToTArrayClass__tArrayClass____target
				.setName(eArrayTypeToTArrayClass__tArrayClass____target_name_prime);
		eModel__eArrayType____orphanTypes.setName(eModel__eArrayType____orphanTypes_name_prime);
		return new Object[] { ruleresult, eTypeAccess, eType, eArrayType, tArrayClass, eArrayTypeToTArrayClass, eModel,
				eTypeAccess__eType____type, eType__eTypeAccess____usagesInTypeAccess,
				eArrayType__eTypeAccess____elementType, eArrayTypeToTArrayClass__eArrayType____source,
				eArrayTypeToTArrayClass__tArrayClass____target, eModel__eArrayType____orphanTypes };
	}

	public static final void pattern_ArrayTypeToClass_1_5_registerobjects_expressionBBBBBBBBBBB(ArrayTypeToClass _this,
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eType, EObject eTypeToTArrayClass,
			EObject eArrayType, EObject typeGraph, EObject eModelToTypeGraph, EObject tArrayClass,
			EObject eArrayTypeToTArrayClass, EObject eModel) {
		_this.registerObjects_FWD(ruleresult, eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph,
				eModelToTypeGraph, tArrayClass, eArrayTypeToTArrayClass, eModel);

	}

	public static final PerformRuleResult pattern_ArrayTypeToClass_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_1_preparereturnvalue_bindingFB(ArrayTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ArrayTypeToClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			ArrayTypeToClass _this) {
		Object[] result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_binding = pattern_ArrayTypeToClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_black = pattern_ArrayTypeToClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ArrayTypeToClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ArrayTypeToClass_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eTypeAccess");
		EObject _localVariable_1 = match.getObject("eType");
		EObject _localVariable_2 = match.getObject("eArrayType");
		EObject _localVariable_3 = match.getObject("eModel");
		EObject tmpETypeAccess = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpEArrayType = _localVariable_2;
		EObject tmpEModel = _localVariable_3;
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpEArrayType instanceof ArrayType) {
					ArrayType eArrayType = (ArrayType) tmpEArrayType;
					if (tmpEModel instanceof Model) {
						Model eModel = (Model) tmpEModel;
						return new Object[] { eTypeAccess, eType, eArrayType, eModel, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_2_2_corematch_blackBBFBFFFBB(TypeAccess eTypeAccess,
			Type eType, ArrayType eArrayType, Model eModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eArrayType.equals(eType)) {
			for (TypeToTAbstractType eTypeToTArrayClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
				TAbstractType tArrayClass = eTypeToTArrayClass.getTarget();
				if (tArrayClass != null) {
					for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
						TypeGraph typeGraph = eModelToTypeGraph.getTarget();
						if (typeGraph != null) {
							_result.add(new Object[] { eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph,
									eModelToTypeGraph, tArrayClass, eModel, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_2_3_findcontext_blackBBBBBBBB(
			TypeAccess eTypeAccess, Type eType, TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType,
			TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eArrayType.equals(eType)) {
			if (eType.equals(eTypeAccess.getType())) {
				if (eType.equals(eTypeToTArrayClass.getSource())) {
					if (tArrayClass.equals(eTypeToTArrayClass.getTarget())) {
						if (eTypeAccess.equals(eArrayType.getElementType())) {
							if (typeGraph.getOwnedTypes().contains(tArrayClass)) {
								if (eModel.equals(eModelToTypeGraph.getSource())) {
									if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
										if (eModel.getOrphanTypes().contains(eArrayType)) {
											_result.add(new Object[] { eTypeAccess, eType, eTypeToTArrayClass,
													eArrayType, typeGraph, eModelToTypeGraph, tArrayClass, eModel });
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

	public static final Object[] pattern_ArrayTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			TypeAccess eTypeAccess, Type eType, TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType,
			TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTArrayClass__eType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTArrayClass__tArrayClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tArrayClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tArrayClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eTypeToTArrayClass__eType____source_name_prime = "source";
		String eTypeToTArrayClass__tArrayClass____target_name_prime = "target";
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String typeGraph__tArrayClass____ownedTypes_name_prime = "ownedTypes";
		String tArrayClass__typeGraph____pg_name_prime = "pg";
		String eModelToTypeGraph__eModel____source_name_prime = "source";
		String eModelToTypeGraph__typeGraph____target_name_prime = "target";
		String eModel__eArrayType____orphanTypes_name_prime = "orphanTypes";
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass);
		isApplicableMatch.getAllContextElements().add(eArrayType);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(tArrayClass);
		isApplicableMatch.getAllContextElements().add(eModel);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eTypeAccess____usagesInTypeAccess);
		eTypeToTArrayClass__eType____source.setSrc(eTypeToTArrayClass);
		eTypeToTArrayClass__eType____source.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass__eType____source);
		eTypeToTArrayClass__tArrayClass____target.setSrc(eTypeToTArrayClass);
		eTypeToTArrayClass__tArrayClass____target.setTrg(tArrayClass);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass__tArrayClass____target);
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eArrayType__eTypeAccess____elementType);
		typeGraph__tArrayClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tArrayClass____ownedTypes.setTrg(tArrayClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tArrayClass____ownedTypes);
		tArrayClass__typeGraph____pg.setSrc(tArrayClass);
		tArrayClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tArrayClass__typeGraph____pg);
		eModelToTypeGraph__eModel____source.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__eModel____source);
		eModelToTypeGraph__typeGraph____target.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__typeGraph____target);
		eModel__eArrayType____orphanTypes.setSrc(eModel);
		eModel__eArrayType____orphanTypes.setTrg(eArrayType);
		isApplicableMatch.getAllContextElements().add(eModel__eArrayType____orphanTypes);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eTypeToTArrayClass__eType____source.setName(eTypeToTArrayClass__eType____source_name_prime);
		eTypeToTArrayClass__tArrayClass____target.setName(eTypeToTArrayClass__tArrayClass____target_name_prime);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		typeGraph__tArrayClass____ownedTypes.setName(typeGraph__tArrayClass____ownedTypes_name_prime);
		tArrayClass__typeGraph____pg.setName(tArrayClass__typeGraph____pg_name_prime);
		eModelToTypeGraph__eModel____source.setName(eModelToTypeGraph__eModel____source_name_prime);
		eModelToTypeGraph__typeGraph____target.setName(eModelToTypeGraph__typeGraph____target_name_prime);
		eModel__eArrayType____orphanTypes.setName(eModel__eArrayType____orphanTypes_name_prime);
		return new Object[] { eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph,
				tArrayClass, eModel, isApplicableMatch, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, eTypeToTArrayClass__eType____source,
				eTypeToTArrayClass__tArrayClass____target, eArrayType__eTypeAccess____elementType,
				typeGraph__tArrayClass____ownedTypes, tArrayClass__typeGraph____pg, eModelToTypeGraph__eModel____source,
				eModelToTypeGraph__typeGraph____target, eModel__eArrayType____orphanTypes };
	}

	public static final Object[] pattern_ArrayTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(ArrayTypeToClass _this,
			IsApplicableMatch isApplicableMatch, TypeAccess eTypeAccess, Type eType,
			TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eTypeAccess, eType,
				eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph, tArrayClass, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eTypeAccess, eType, eTypeToTArrayClass, eArrayType,
					typeGraph, eModelToTypeGraph, tArrayClass, eModel };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ArrayTypeToClass _this, IsApplicableMatch isApplicableMatch, TypeAccess eTypeAccess, Type eType,
			TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel) {
		Object[] result_pattern_ArrayTypeToClass_2_4_solveCSP_binding = pattern_ArrayTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph,
				eModelToTypeGraph, tArrayClass, eModel);
		if (result_pattern_ArrayTypeToClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToClass_2_4_solveCSP_black = pattern_ArrayTypeToClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eTypeAccess, eType, eTypeToTArrayClass, eArrayType,
						typeGraph, eModelToTypeGraph, tArrayClass, eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_2_5_checkCSP_expressionFBB(ArrayTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ArrayTypeToClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ArrayTypeToClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayTypeToClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_1_preparereturnvalue_bindingFB(ArrayTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayTypeToClass _this) {
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

	public static final Object[] pattern_ArrayTypeToClass_10_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayTypeToClass _this) {
		Object[] result_pattern_ArrayTypeToClass_10_1_preparereturnvalue_binding = pattern_ArrayTypeToClass_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToClass_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayTypeToClass_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToClass_10_1_preparereturnvalue_black = pattern_ArrayTypeToClass_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayTypeToClass_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayTypeToClass_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayTypeToClass_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpETypeAccess = _edge_type.getSrc();
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			EObject tmpEType = _edge_type.getTrg();
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (eType.equals(eTypeAccess.getType())) {
					for (ArrayType eArrayType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
						if (!eArrayType.equals(eType)) {
							for (Model eModel : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(eArrayType, Model.class, "orphanTypes")) {
								_result.add(new Object[] { eTypeAccess, eType, eArrayType, eModel, _edge_type });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayTypeToClass_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ArrayTypeToClass _this, Match match, TypeAccess eTypeAccess, Type eType, ArrayType eArrayType,
			Model eModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eTypeAccess, eType, eArrayType, eModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayTypeToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayTypeToClass_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_13_1_prepare_blackB(ArrayTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayTypeToClass_13_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ArrayTypeToClass_13_2_matchcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_1 = sourceMatch.getObject("eType");
		EObject _localVariable_2 = sourceMatch.getObject("eArrayType");
		EObject _localVariable_3 = targetMatch.getObject("typeGraph");
		EObject _localVariable_4 = targetMatch.getObject("tArrayClass");
		EObject _localVariable_5 = sourceMatch.getObject("eModel");
		EObject tmpETypeAccess = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpEArrayType = _localVariable_2;
		EObject tmpTypeGraph = _localVariable_3;
		EObject tmpTArrayClass = _localVariable_4;
		EObject tmpEModel = _localVariable_5;
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpEArrayType instanceof ArrayType) {
					ArrayType eArrayType = (ArrayType) tmpEArrayType;
					if (tmpTypeGraph instanceof TypeGraph) {
						TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
						if (tmpTArrayClass instanceof TAbstractType) {
							TAbstractType tArrayClass = (TAbstractType) tmpTArrayClass;
							if (tmpEModel instanceof Model) {
								Model eModel = (Model) tmpEModel;
								return new Object[] { eTypeAccess, eType, eArrayType, typeGraph, tArrayClass, eModel,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_13_2_matchcontext_blackBBFBBFBBBB(
			TypeAccess eTypeAccess, Type eType, ArrayType eArrayType, TypeGraph typeGraph, TAbstractType tArrayClass,
			Model eModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eArrayType.equals(eType)) {
			if (!sourceMatch.equals(targetMatch)) {
				if (eType.equals(eTypeAccess.getType())) {
					if (eTypeAccess.equals(eArrayType.getElementType())) {
						if (typeGraph.getOwnedTypes().contains(tArrayClass)) {
							if (eModel.getOrphanTypes().contains(eArrayType)) {
								for (TypeToTAbstractType eTypeToTArrayClass : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
									if (tArrayClass.equals(eTypeToTArrayClass.getTarget())) {
										for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
											if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
												_result.add(new Object[] { eTypeAccess, eType, eTypeToTArrayClass,
														eArrayType, typeGraph, eModelToTypeGraph, tArrayClass, eModel,
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
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_13_2_matchcontext_greenBBBBBBBBBFB(TypeAccess eTypeAccess,
			Type eType, TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel, Match sourceMatch,
			Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "ArrayTypeToClass";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(eArrayType);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tArrayClass);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph, eModelToTypeGraph,
				tArrayClass, eModel, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_ArrayTypeToClass_13_3_checkcsp_bindingFBBBBBBBBBBBB(ArrayTypeToClass _this,
			CCMatch isApplicableMatch, TypeAccess eTypeAccess, Type eType, TypeToTAbstractType eTypeToTArrayClass,
			ArrayType eArrayType, TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass,
			Model eModel, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, eTypeAccess, eType, eTypeToTArrayClass,
				eArrayType, typeGraph, eModelToTypeGraph, tArrayClass, eModel, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eTypeAccess, eType, eTypeToTArrayClass, eArrayType,
					typeGraph, eModelToTypeGraph, tArrayClass, eModel, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_13_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_13_3_checkcsp_bindingAndBlackFBBBBBBBBBBBB(
			ArrayTypeToClass _this, CCMatch isApplicableMatch, TypeAccess eTypeAccess, Type eType,
			TypeToTAbstractType eTypeToTArrayClass, ArrayType eArrayType, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ArrayTypeToClass_13_3_checkcsp_binding = pattern_ArrayTypeToClass_13_3_checkcsp_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, eTypeAccess, eType, eTypeToTArrayClass, eArrayType, typeGraph,
				eModelToTypeGraph, tArrayClass, eModel, sourceMatch, targetMatch);
		if (result_pattern_ArrayTypeToClass_13_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_13_3_checkcsp_binding[0];

			Object[] result_pattern_ArrayTypeToClass_13_3_checkcsp_black = pattern_ArrayTypeToClass_13_3_checkcsp_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_13_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eTypeAccess, eType, eTypeToTArrayClass, eArrayType,
						typeGraph, eModelToTypeGraph, tArrayClass, eModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_13_4_createcorrespondence_blackBBBBBBB(TypeAccess eTypeAccess,
			Type eType, ArrayType eArrayType, TypeGraph typeGraph, TAbstractType tArrayClass, Model eModel,
			CCMatch isApplicableMatch) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { eTypeAccess, eType, eArrayType, typeGraph, tArrayClass, eModel, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_13_4_createcorrespondence_greenBBFB(ArrayType eArrayType,
			TAbstractType tArrayClass, CCMatch isApplicableMatch) {
		TypeToTAbstractType eArrayTypeToTArrayClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		eArrayTypeToTArrayClass.setSource(eArrayType);
		eArrayTypeToTArrayClass.setTarget(tArrayClass);
		isApplicableMatch.getCreateCorr().add(eArrayTypeToTArrayClass);
		return new Object[] { eArrayType, tArrayClass, eArrayTypeToTArrayClass, isApplicableMatch };
	}

	public static final Object[] pattern_ArrayTypeToClass_13_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ArrayTypeToClass_13_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ArrayTypeToClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayTypeToClass_13_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_16_1_matchtggpattern_blackBBBB(TypeAccess eTypeAccess,
			Type eType, ArrayType eArrayType, Model eModel) {
		if (!eArrayType.equals(eType)) {
			if (eType.equals(eTypeAccess.getType())) {
				if (eTypeAccess.equals(eArrayType.getElementType())) {
					if (eModel.getOrphanTypes().contains(eArrayType)) {
						return new Object[] { eTypeAccess, eType, eArrayType, eModel };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_16_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_16_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_17_1_matchtggpattern_blackBB(TypeGraph typeGraph,
			TAbstractType tArrayClass) {
		if (typeGraph.getOwnedTypes().contains(tArrayClass)) {
			return new Object[] { typeGraph, tArrayClass };
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_17_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_17_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_1_createresult_blackB(ArrayTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayTypeToClass_18_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Type eType) {
		if (ruleResult.getSourceObjects().contains(eType)) {
			return new Object[] { ruleResult, eType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eTypeToTArrayClass) {
		if (ruleResult.getCorrObjects().contains(eTypeToTArrayClass)) {
			return new Object[] { ruleResult, eTypeToTArrayClass };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tArrayClass) {
		if (ruleResult.getTargetObjects().contains(tArrayClass)) {
			return new Object[] { ruleResult, tArrayClass };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(eModelToTypeGraph)) {
			return new Object[] { ruleResult, eModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Model eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_18_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eTypeToTArrayClassList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpETypeToTArrayClass : eTypeToTArrayClassList.getEntryObjects()) {
				if (tmpETypeToTArrayClass instanceof TypeToTAbstractType) {
					TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) tmpETypeToTArrayClass;
					Type eType = eTypeToTArrayClass.getSource();
					if (eType != null) {
						TAbstractType tArrayClass = eTypeToTArrayClass.getTarget();
						if (tArrayClass != null) {
							TypeGraph typeGraph = tArrayClass.getPg();
							if (typeGraph != null) {
								if (pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_1BB(ruleResult,
										eTypeToTArrayClass) == null) {
									if (pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_0BB(ruleResult,
											eType) == null) {
										if (pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_2BB(ruleResult,
												tArrayClass) == null) {
											if (pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_3BB(ruleResult,
													typeGraph) == null) {
												for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(typeGraph, ModelToTypeGraph.class,
																"target")) {
													Model eModel = eModelToTypeGraph.getSource();
													if (eModel != null) {
														if (pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_4BB(
																ruleResult, eModelToTypeGraph) == null) {
															if (pattern_ArrayTypeToClass_18_2_isapplicablecore_black_nac_5BB(
																	ruleResult, eModel) == null) {
																_result.add(new Object[] { eTypeToTArrayClassList,
																		eType, eTypeToTArrayClass, tArrayClass,
																		typeGraph, eModelToTypeGraph, eModel,
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
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_3_solveCSP_bindingFBBBBBBBBB(ArrayTypeToClass _this,
			IsApplicableMatch isApplicableMatch, Type eType, TypeToTAbstractType eTypeToTArrayClass,
			TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph, TAbstractType tArrayClass, Model eModel,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eType, eTypeToTArrayClass, typeGraph,
				eModelToTypeGraph, tArrayClass, eModel, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eType, eTypeToTArrayClass, typeGraph,
					eModelToTypeGraph, tArrayClass, eModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_18_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ArrayTypeToClass _this, IsApplicableMatch isApplicableMatch, Type eType,
			TypeToTAbstractType eTypeToTArrayClass, TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph,
			TAbstractType tArrayClass, Model eModel, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ArrayTypeToClass_18_3_solveCSP_binding = pattern_ArrayTypeToClass_18_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eType, eTypeToTArrayClass, typeGraph, eModelToTypeGraph, tArrayClass, eModel,
				ruleResult);
		if (result_pattern_ArrayTypeToClass_18_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_18_3_solveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToClass_18_3_solveCSP_black = pattern_ArrayTypeToClass_18_3_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_18_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eType, eTypeToTArrayClass, typeGraph,
						eModelToTypeGraph, tArrayClass, eModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_18_4_checkCSP_expressionFBB(ArrayTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_5_checknacs_blackBBBBBB(Type eType,
			TypeToTAbstractType eTypeToTArrayClass, TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph,
			TAbstractType tArrayClass, Model eModel) {
		return new Object[] { eType, eTypeToTArrayClass, typeGraph, eModelToTypeGraph, tArrayClass, eModel };
	}

	public static final Object[] pattern_ArrayTypeToClass_18_6_perform_blackBBBBBBB(Type eType,
			TypeToTAbstractType eTypeToTArrayClass, TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph,
			TAbstractType tArrayClass, Model eModel, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eType, eTypeToTArrayClass, typeGraph, eModelToTypeGraph, tArrayClass, eModel,
				ruleResult };
	}

	public static final Object[] pattern_ArrayTypeToClass_18_6_perform_greenFBFBFBB(Type eType,
			TAbstractType tArrayClass, Model eModel, ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ArrayType eArrayType = JavaFactory.eINSTANCE.createArrayType();
		TypeToTAbstractType eArrayTypeToTArrayClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eTypeAccess.setType(eType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		eArrayType.setElementType(eTypeAccess);
		eModel.getOrphanTypes().add(eArrayType);
		ruleResult.getSourceObjects().add(eArrayType);
		eArrayTypeToTArrayClass.setSource(eArrayType);
		eArrayTypeToTArrayClass.setTarget(tArrayClass);
		ruleResult.getCorrObjects().add(eArrayTypeToTArrayClass);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eTypeAccess, eType, eArrayType, tArrayClass, eArrayTypeToTArrayClass, eModel,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ArrayTypeToClass_18_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ArrayTypeToClassImpl
