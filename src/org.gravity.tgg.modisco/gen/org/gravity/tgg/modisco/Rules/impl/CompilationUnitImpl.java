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

import org.eclipse.gmt.modisco.java.Model;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.ModelToTypeGraph;

import org.gravity.tgg.modisco.Rules.CompilationUnit;
import org.gravity.tgg.modisco.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CompilationUnitImpl extends AbstractRuleImpl implements CompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getCompilationUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model eModel,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		// initial bindings
		Object[] result1_black = CompilationUnitImpl.pattern_CompilationUnit_0_1_initialbindings_blackBBBB(this, match,
				eModel, compilationUnit);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[eModel] = " + eModel + ", "
					+ "[compilationUnit] = " + compilationUnit + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = CompilationUnitImpl
				.pattern_CompilationUnit_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, eModel, compilationUnit);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[eModel] = " + eModel + ", " + "[compilationUnit] = "
					+ compilationUnit + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (CompilationUnitImpl.pattern_CompilationUnit_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = CompilationUnitImpl
					.pattern_CompilationUnit_0_4_collectelementstobetranslated_blackBBB(match, eModel, compilationUnit);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eModel] = " + eModel + ", "
						+ "[compilationUnit] = " + compilationUnit + ".");
			}
			CompilationUnitImpl.pattern_CompilationUnit_0_4_collectelementstobetranslated_greenBBBF(match, eModel,
					compilationUnit);
			// EMoflonEdge eModel__compilationUnit____compilationUnits = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = CompilationUnitImpl
					.pattern_CompilationUnit_0_5_collectcontextelements_blackBBB(match, eModel, compilationUnit);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eModel] = " + eModel + ", "
						+ "[compilationUnit] = " + compilationUnit + ".");
			}
			CompilationUnitImpl.pattern_CompilationUnit_0_5_collectcontextelements_greenBB(match, eModel);

			// register objects to match
			CompilationUnitImpl.pattern_CompilationUnit_0_6_registerobjectstomatch_expressionBBBB(this, match, eModel,
					compilationUnit);
			return CompilationUnitImpl.pattern_CompilationUnit_0_7_expressionF();
		} else {
			return CompilationUnitImpl.pattern_CompilationUnit_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = CompilationUnitImpl
				.pattern_CompilationUnit_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model eModel = (Model) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) result1_bindingAndBlack[2];
		ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[3];
		// CSP csp = (CSP) result1_bindingAndBlack[4];

		// collect translated elements
		Object[] result2_black = CompilationUnitImpl
				.pattern_CompilationUnit_1_2_collecttranslatedelements_blackB(compilationUnit);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[compilationUnit] = " + compilationUnit + ".");
		}
		Object[] result2_green = CompilationUnitImpl
				.pattern_CompilationUnit_1_2_collecttranslatedelements_greenFB(compilationUnit);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = CompilationUnitImpl.pattern_CompilationUnit_1_3_bookkeepingforedges_blackBBBBB(
				ruleresult, eModel, typeGraph, compilationUnit, eModelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eModel] = " + eModel + ", " + "[typeGraph] = "
					+ typeGraph + ", " + "[compilationUnit] = " + compilationUnit + ", " + "[eModelToTypeGraph] = "
					+ eModelToTypeGraph + ".");
		}
		CompilationUnitImpl.pattern_CompilationUnit_1_3_bookkeepingforedges_greenBBBF(ruleresult, eModel,
				compilationUnit);
		// EMoflonEdge eModel__compilationUnit____compilationUnits = (EMoflonEdge) result3_green[3];

		// perform postprocessing story node is empty
		// register objects
		CompilationUnitImpl.pattern_CompilationUnit_1_5_registerobjects_expressionBBBBBB(this, ruleresult, eModel,
				typeGraph, compilationUnit, eModelToTypeGraph);
		return CompilationUnitImpl.pattern_CompilationUnit_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = CompilationUnitImpl
				.pattern_CompilationUnit_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CompilationUnitImpl
				.pattern_CompilationUnit_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = CompilationUnitImpl.pattern_CompilationUnit_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model eModel = (Model) result2_binding[0];
		org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) result2_binding[1];
		for (Object[] result2_black : CompilationUnitImpl.pattern_CompilationUnit_2_2_corematch_blackBFBFB(eModel,
				compilationUnit, match)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : CompilationUnitImpl.pattern_CompilationUnit_2_3_findcontext_blackBBBB(eModel,
					typeGraph, compilationUnit, eModelToTypeGraph)) {
				Object[] result3_green = CompilationUnitImpl.pattern_CompilationUnit_2_3_findcontext_greenBBBBFFFF(
						eModel, typeGraph, compilationUnit, eModelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge eModel__compilationUnit____compilationUnits = (EMoflonEdge) result3_green[5];
				// EMoflonEdge eModelToTypeGraph__eModel____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge eModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = CompilationUnitImpl
						.pattern_CompilationUnit_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, eModel,
								typeGraph, compilationUnit, eModelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModel] = " + eModel
									+ ", " + "[typeGraph] = " + typeGraph + ", " + "[compilationUnit] = "
									+ compilationUnit + ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (CompilationUnitImpl.pattern_CompilationUnit_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = CompilationUnitImpl
							.pattern_CompilationUnit_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					CompilationUnitImpl.pattern_CompilationUnit_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return CompilationUnitImpl.pattern_CompilationUnit_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model eModel,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		match.registerObject("eModel", eModel);
		match.registerObject("compilationUnit", compilationUnit);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model eModel,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph typeGraph,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit, ModelToTypeGraph eModelToTypeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eModel, EObject typeGraph,
			EObject compilationUnit, EObject eModelToTypeGraph) {
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("eModelToTypeGraph", eModelToTypeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("compilationUnit").eClass())
				.equals("java.CompilationUnit.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(EMoflonEdge _edge_compilationUnits) {
		// prepare return value
		Object[] result1_bindingAndBlack = CompilationUnitImpl
				.pattern_CompilationUnit_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = CompilationUnitImpl.pattern_CompilationUnit_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : CompilationUnitImpl
				.pattern_CompilationUnit_10_2_testcorematchandDECs_blackFFB(_edge_compilationUnits)) {
			Model eModel = (Model) result2_black[0];
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) result2_black[1];
			Object[] result2_green = CompilationUnitImpl
					.pattern_CompilationUnit_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (CompilationUnitImpl
					.pattern_CompilationUnit_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							eModel, compilationUnit)) {
				// Ensure that the correct types of elements are matched
				if (CompilationUnitImpl
						.pattern_CompilationUnit_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = CompilationUnitImpl
							.pattern_CompilationUnit_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					CompilationUnitImpl.pattern_CompilationUnit_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return CompilationUnitImpl.pattern_CompilationUnit_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("CompilationUnit");
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
		ruleResult.setRule("CompilationUnit");
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
		Object[] result1_black = CompilationUnitImpl.pattern_CompilationUnit_13_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CompilationUnitImpl.pattern_CompilationUnit_13_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = CompilationUnitImpl
				.pattern_CompilationUnit_13_2_matchcontext_bindingFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model eModel = (Model) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) result2_binding[2];
		for (Object[] result2_black : CompilationUnitImpl.pattern_CompilationUnit_13_2_matchcontext_blackBBBFBB(eModel,
				typeGraph, compilationUnit, sourceMatch, targetMatch)) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			Object[] result2_green = CompilationUnitImpl.pattern_CompilationUnit_13_2_matchcontext_greenBBBBBFB(eModel,
					typeGraph, compilationUnit, eModelToTypeGraph, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[5];

			// check csp
			Object[] result3_bindingAndBlack = CompilationUnitImpl
					.pattern_CompilationUnit_13_3_checkcsp_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, eModel,
							typeGraph, compilationUnit, eModelToTypeGraph, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = CompilationUnitImpl
						.pattern_CompilationUnit_13_4_createcorrespondence_blackBBBB(eModel, typeGraph, compilationUnit,
								isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [create correspondence] failed." + " Variables: " + "[eModel] = "
									+ eModel + ", " + "[typeGraph] = " + typeGraph + ", " + "[compilationUnit] = "
									+ compilationUnit + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = CompilationUnitImpl
						.pattern_CompilationUnit_13_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				CompilationUnitImpl.pattern_CompilationUnit_13_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return CompilationUnitImpl.pattern_CompilationUnit_13_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, Model eModel, TypeGraph typeGraph,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit, ModelToTypeGraph eModelToTypeGraph,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
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
	public boolean checkDEC_FWD(Model eModel, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {// match tgg pattern
		Object[] result1_black = CompilationUnitImpl.pattern_CompilationUnit_16_1_matchtggpattern_blackBB(eModel,
				compilationUnit);
		if (result1_black != null) {
			return CompilationUnitImpl.pattern_CompilationUnit_16_2_expressionF();
		} else {
			return CompilationUnitImpl.pattern_CompilationUnit_16_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph) {// match tgg pattern
		Object[] result1_black = CompilationUnitImpl.pattern_CompilationUnit_17_1_matchtggpattern_blackB(typeGraph);
		if (result1_black != null) {
			return CompilationUnitImpl.pattern_CompilationUnit_17_2_expressionF();
		} else {
			return CompilationUnitImpl.pattern_CompilationUnit_17_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph eModelToTypeGraphParameter) {
		// create result
		Object[] result1_black = CompilationUnitImpl.pattern_CompilationUnit_18_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CompilationUnitImpl.pattern_CompilationUnit_18_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : CompilationUnitImpl
				.pattern_CompilationUnit_18_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eModelToTypeGraphList = (RuleEntryList) result2_black[0];
			Model eModel = (Model) result2_black[1];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[2];
			TypeGraph typeGraph = (TypeGraph) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = CompilationUnitImpl
					.pattern_CompilationUnit_18_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, eModel,
							typeGraph, eModelToTypeGraph, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModel] = " + eModel
						+ ", " + "[typeGraph] = " + typeGraph + ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (CompilationUnitImpl.pattern_CompilationUnit_18_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = CompilationUnitImpl.pattern_CompilationUnit_18_5_checknacs_blackBBB(eModel,
						typeGraph, eModelToTypeGraph);
				if (result5_black != null) {

					// perform
					Object[] result6_black = CompilationUnitImpl.pattern_CompilationUnit_18_6_perform_blackBBBB(eModel,
							typeGraph, eModelToTypeGraph, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed." + " Variables: " + "[eModel] = " + eModel
										+ ", " + "[typeGraph] = " + typeGraph + ", " + "[eModelToTypeGraph] = "
										+ eModelToTypeGraph + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					CompilationUnitImpl.pattern_CompilationUnit_18_6_perform_greenBFB(eModel, ruleResult);
					// org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) result6_green[1];

				} else {
				}

			} else {
			}

		}
		return CompilationUnitImpl.pattern_CompilationUnit_18_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
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
		case RulesPackage.COMPILATION_UNIT___IS_APPROPRIATE_FWD__MATCH_MODEL_COMPILATIONUNIT:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.gmt.modisco.java.CompilationUnit) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_COMPILATIONUNIT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.gmt.modisco.java.CompilationUnit) arguments.get(2));
			return null;
		case RulesPackage.COMPILATION_UNIT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_COMPILATIONUNIT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.gmt.modisco.java.CompilationUnit) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_TYPEGRAPH_COMPILATIONUNIT_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (org.eclipse.gmt.modisco.java.CompilationUnit) arguments.get(3),
					(ModelToTypeGraph) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.COMPILATION_UNIT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MODEL_TYPEGRAPH_COMPILATIONUNIT_MODELTOTYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (org.eclipse.gmt.modisco.java.CompilationUnit) arguments.get(3),
					(ModelToTypeGraph) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.COMPILATION_UNIT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___CHECK_DEC_FWD__MODEL_COMPILATIONUNIT:
			return checkDEC_FWD((Model) arguments.get(0),
					(org.eclipse.gmt.modisco.java.CompilationUnit) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT___CHECK_DEC_BWD__TYPEGRAPH:
			return checkDEC_BWD((TypeGraph) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_TYPEGRAPH_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (ModelToTypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_CompilationUnit_0_1_initialbindings_blackBBBB(CompilationUnit _this,
			Match match, Model eModel, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		return new Object[] { _this, match, eModel, compilationUnit };
	}

	public static final Object[] pattern_CompilationUnit_0_2_SolveCSP_bindingFBBBB(CompilationUnit _this, Match match,
			Model eModel, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eModel, compilationUnit);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eModel, compilationUnit };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit_0_2_SolveCSP_bindingAndBlackFBBBB(CompilationUnit _this,
			Match match, Model eModel, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		Object[] result_pattern_CompilationUnit_0_2_SolveCSP_binding = pattern_CompilationUnit_0_2_SolveCSP_bindingFBBBB(
				_this, match, eModel, compilationUnit);
		if (result_pattern_CompilationUnit_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit_0_2_SolveCSP_binding[0];

			Object[] result_pattern_CompilationUnit_0_2_SolveCSP_black = pattern_CompilationUnit_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eModel, compilationUnit };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit_0_3_CheckCSP_expressionFBB(CompilationUnit _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_0_4_collectelementstobetranslated_blackBBB(Match match,
			Model eModel, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		return new Object[] { match, eModel, compilationUnit };
	}

	public static final Object[] pattern_CompilationUnit_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Model eModel, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		EMoflonEdge eModel__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(compilationUnit);
		String eModel__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		eModel__compilationUnit____compilationUnits.setSrc(eModel);
		eModel__compilationUnit____compilationUnits.setTrg(compilationUnit);
		match.getToBeTranslatedEdges().add(eModel__compilationUnit____compilationUnits);
		eModel__compilationUnit____compilationUnits.setName(eModel__compilationUnit____compilationUnits_name_prime);
		return new Object[] { match, eModel, compilationUnit, eModel__compilationUnit____compilationUnits };
	}

	public static final Object[] pattern_CompilationUnit_0_5_collectcontextelements_blackBBB(Match match, Model eModel,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		return new Object[] { match, eModel, compilationUnit };
	}

	public static final Object[] pattern_CompilationUnit_0_5_collectcontextelements_greenBB(Match match, Model eModel) {
		match.getContextNodes().add(eModel);
		return new Object[] { match, eModel };
	}

	public static final void pattern_CompilationUnit_0_6_registerobjectstomatch_expressionBBBB(CompilationUnit _this,
			Match match, Model eModel, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		_this.registerObjectsToMatch_FWD(match, eModel, compilationUnit);

	}

	public static final boolean pattern_CompilationUnit_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("compilationUnit");
		EObject _localVariable_3 = isApplicableMatch.getObject("eModelToTypeGraph");
		EObject tmpEModel = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpCompilationUnit = _localVariable_2;
		EObject tmpEModelToTypeGraph = _localVariable_3;
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpCompilationUnit instanceof org.eclipse.gmt.modisco.java.CompilationUnit) {
					org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) tmpCompilationUnit;
					if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
						ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
						return new Object[] { eModel, typeGraph, compilationUnit, eModelToTypeGraph,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_1_1_performtransformation_blackBBBBFBB(Model eModel,
			TypeGraph typeGraph, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit,
			ModelToTypeGraph eModelToTypeGraph, CompilationUnit _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { eModel, typeGraph, compilationUnit, eModelToTypeGraph, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_1_1_performtransformation_bindingAndBlackFFFFFBB(
			CompilationUnit _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CompilationUnit_1_1_performtransformation_binding = pattern_CompilationUnit_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_CompilationUnit_1_1_performtransformation_binding != null) {
			Model eModel = (Model) result_pattern_CompilationUnit_1_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_CompilationUnit_1_1_performtransformation_binding[1];
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) result_pattern_CompilationUnit_1_1_performtransformation_binding[2];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result_pattern_CompilationUnit_1_1_performtransformation_binding[3];

			Object[] result_pattern_CompilationUnit_1_1_performtransformation_black = pattern_CompilationUnit_1_1_performtransformation_blackBBBBFBB(
					eModel, typeGraph, compilationUnit, eModelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_CompilationUnit_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_CompilationUnit_1_1_performtransformation_black[4];

				return new Object[] { eModel, typeGraph, compilationUnit, eModelToTypeGraph, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_1_2_collecttranslatedelements_blackB(
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		return new Object[] { compilationUnit };
	}

	public static final Object[] pattern_CompilationUnit_1_2_collecttranslatedelements_greenFB(
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(compilationUnit);
		return new Object[] { ruleresult, compilationUnit };
	}

	public static final Object[] pattern_CompilationUnit_1_3_bookkeepingforedges_blackBBBBB(
			PerformRuleResult ruleresult, EObject eModel, EObject typeGraph, EObject compilationUnit,
			EObject eModelToTypeGraph) {
		if (!eModel.equals(typeGraph)) {
			if (!eModel.equals(eModelToTypeGraph)) {
				if (!compilationUnit.equals(eModel)) {
					if (!compilationUnit.equals(typeGraph)) {
						if (!compilationUnit.equals(eModelToTypeGraph)) {
							if (!eModelToTypeGraph.equals(typeGraph)) {
								return new Object[] { ruleresult, eModel, typeGraph, compilationUnit,
										eModelToTypeGraph };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_1_3_bookkeepingforedges_greenBBBF(PerformRuleResult ruleresult,
			EObject eModel, EObject compilationUnit) {
		EMoflonEdge eModel__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CompilationUnit";
		String eModel__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		eModel__compilationUnit____compilationUnits.setSrc(eModel);
		eModel__compilationUnit____compilationUnits.setTrg(compilationUnit);
		ruleresult.getTranslatedEdges().add(eModel__compilationUnit____compilationUnits);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__compilationUnit____compilationUnits.setName(eModel__compilationUnit____compilationUnits_name_prime);
		return new Object[] { ruleresult, eModel, compilationUnit, eModel__compilationUnit____compilationUnits };
	}

	public static final void pattern_CompilationUnit_1_5_registerobjects_expressionBBBBBB(CompilationUnit _this,
			PerformRuleResult ruleresult, EObject eModel, EObject typeGraph, EObject compilationUnit,
			EObject eModelToTypeGraph) {
		_this.registerObjects_FWD(ruleresult, eModel, typeGraph, compilationUnit, eModelToTypeGraph);

	}

	public static final PerformRuleResult pattern_CompilationUnit_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_2_1_preparereturnvalue_bindingFB(CompilationUnit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_2_1_preparereturnvalue_blackFBB(EClass eClass,
			CompilationUnit _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_2_1_preparereturnvalue_bindingAndBlackFFB(
			CompilationUnit _this) {
		Object[] result_pattern_CompilationUnit_2_1_preparereturnvalue_binding = pattern_CompilationUnit_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_CompilationUnit_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit_2_1_preparereturnvalue_black = pattern_CompilationUnit_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_CompilationUnit_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CompilationUnit_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "CompilationUnit";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CompilationUnit_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eModel");
		EObject _localVariable_1 = match.getObject("compilationUnit");
		EObject tmpEModel = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			if (tmpCompilationUnit instanceof org.eclipse.gmt.modisco.java.CompilationUnit) {
				org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) tmpCompilationUnit;
				return new Object[] { eModel, compilationUnit, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit_2_2_corematch_blackBFBFB(Model eModel,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
			TypeGraph typeGraph = eModelToTypeGraph.getTarget();
			if (typeGraph != null) {
				_result.add(new Object[] { eModel, typeGraph, compilationUnit, eModelToTypeGraph, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit_2_3_findcontext_blackBBBB(Model eModel,
			TypeGraph typeGraph, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit,
			ModelToTypeGraph eModelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eModel.getCompilationUnits().contains(compilationUnit)) {
			if (eModel.equals(eModelToTypeGraph.getSource())) {
				if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { eModel, typeGraph, compilationUnit, eModelToTypeGraph });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_2_3_findcontext_greenBBBBFFFF(Model eModel,
			TypeGraph typeGraph, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit,
			ModelToTypeGraph eModelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModel__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModel__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		String eModelToTypeGraph__eModel____source_name_prime = "source";
		String eModelToTypeGraph__typeGraph____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		eModel__compilationUnit____compilationUnits.setSrc(eModel);
		eModel__compilationUnit____compilationUnits.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(eModel__compilationUnit____compilationUnits);
		eModelToTypeGraph__eModel____source.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__eModel____source);
		eModelToTypeGraph__typeGraph____target.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__typeGraph____target);
		eModel__compilationUnit____compilationUnits.setName(eModel__compilationUnit____compilationUnits_name_prime);
		eModelToTypeGraph__eModel____source.setName(eModelToTypeGraph__eModel____source_name_prime);
		eModelToTypeGraph__typeGraph____target.setName(eModelToTypeGraph__typeGraph____target_name_prime);
		return new Object[] { eModel, typeGraph, compilationUnit, eModelToTypeGraph, isApplicableMatch,
				eModel__compilationUnit____compilationUnits, eModelToTypeGraph__eModel____source,
				eModelToTypeGraph__typeGraph____target };
	}

	public static final Object[] pattern_CompilationUnit_2_4_solveCSP_bindingFBBBBBB(CompilationUnit _this,
			IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph typeGraph,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit, ModelToTypeGraph eModelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eModel, typeGraph, compilationUnit,
				eModelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModel, typeGraph, compilationUnit,
					eModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit_2_4_solveCSP_bindingAndBlackFBBBBBB(CompilationUnit _this,
			IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph typeGraph,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit, ModelToTypeGraph eModelToTypeGraph) {
		Object[] result_pattern_CompilationUnit_2_4_solveCSP_binding = pattern_CompilationUnit_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModel, typeGraph, compilationUnit, eModelToTypeGraph);
		if (result_pattern_CompilationUnit_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit_2_4_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnit_2_4_solveCSP_black = pattern_CompilationUnit_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModel, typeGraph, compilationUnit,
						eModelToTypeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit_2_5_checkCSP_expressionFBB(CompilationUnit _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnit_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CompilationUnit";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnit_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_10_1_preparereturnvalue_bindingFB(CompilationUnit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			CompilationUnit _this) {
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

	public static final Object[] pattern_CompilationUnit_10_1_preparereturnvalue_bindingAndBlackFFBF(
			CompilationUnit _this) {
		Object[] result_pattern_CompilationUnit_10_1_preparereturnvalue_binding = pattern_CompilationUnit_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_CompilationUnit_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit_10_1_preparereturnvalue_black = pattern_CompilationUnit_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_CompilationUnit_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CompilationUnit_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_CompilationUnit_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CompilationUnit_10_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_compilationUnits) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_compilationUnits.getSrc();
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			EObject tmpCompilationUnit = _edge_compilationUnits.getTrg();
			if (tmpCompilationUnit instanceof org.eclipse.gmt.modisco.java.CompilationUnit) {
				org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) tmpCompilationUnit;
				if (eModel.getCompilationUnits().contains(compilationUnit)) {
					_result.add(new Object[] { eModel, compilationUnit, _edge_compilationUnits });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_CompilationUnit_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CompilationUnit_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			CompilationUnit _this, Match match, Model eModel,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eModel, compilationUnit);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CompilationUnit_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			CompilationUnit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_CompilationUnit_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_13_1_prepare_blackB(CompilationUnit _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CompilationUnit_13_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_CompilationUnit_13_2_matchcontext_bindingFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eModel");
		EObject _localVariable_1 = targetMatch.getObject("typeGraph");
		EObject _localVariable_2 = sourceMatch.getObject("compilationUnit");
		EObject tmpEModel = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpCompilationUnit = _localVariable_2;
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpCompilationUnit instanceof org.eclipse.gmt.modisco.java.CompilationUnit) {
					org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = (org.eclipse.gmt.modisco.java.CompilationUnit) tmpCompilationUnit;
					return new Object[] { eModel, typeGraph, compilationUnit, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit_13_2_matchcontext_blackBBBFBB(Model eModel,
			TypeGraph typeGraph, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (eModel.getCompilationUnits().contains(compilationUnit)) {
				for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
					if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
						_result.add(new Object[] { eModel, typeGraph, compilationUnit, eModelToTypeGraph, sourceMatch,
								targetMatch });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_13_2_matchcontext_greenBBBBBFB(Model eModel,
			TypeGraph typeGraph, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit,
			ModelToTypeGraph eModelToTypeGraph, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "CompilationUnit";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { eModel, typeGraph, compilationUnit, eModelToTypeGraph, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_CompilationUnit_13_3_checkcsp_bindingFBBBBBBBB(CompilationUnit _this,
			CCMatch isApplicableMatch, Model eModel, TypeGraph typeGraph,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit, ModelToTypeGraph eModelToTypeGraph,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, eModel, typeGraph, compilationUnit,
				eModelToTypeGraph, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModel, typeGraph, compilationUnit, eModelToTypeGraph,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_13_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit_13_3_checkcsp_bindingAndBlackFBBBBBBBB(CompilationUnit _this,
			CCMatch isApplicableMatch, Model eModel, TypeGraph typeGraph,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit, ModelToTypeGraph eModelToTypeGraph,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_CompilationUnit_13_3_checkcsp_binding = pattern_CompilationUnit_13_3_checkcsp_bindingFBBBBBBBB(
				_this, isApplicableMatch, eModel, typeGraph, compilationUnit, eModelToTypeGraph, sourceMatch,
				targetMatch);
		if (result_pattern_CompilationUnit_13_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit_13_3_checkcsp_binding[0];

			Object[] result_pattern_CompilationUnit_13_3_checkcsp_black = pattern_CompilationUnit_13_3_checkcsp_blackB(
					csp);
			if (result_pattern_CompilationUnit_13_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModel, typeGraph, compilationUnit,
						eModelToTypeGraph, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_13_4_createcorrespondence_blackBBBB(Model eModel,
			TypeGraph typeGraph, org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit,
			CCMatch isApplicableMatch) {
		return new Object[] { eModel, typeGraph, compilationUnit, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnit_13_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnit_13_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CompilationUnit";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnit_13_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_16_1_matchtggpattern_blackBB(Model eModel,
			org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit) {
		if (eModel.getCompilationUnits().contains(compilationUnit)) {
			return new Object[] { eModel, compilationUnit };
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit_16_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit_16_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_17_1_matchtggpattern_blackB(TypeGraph typeGraph) {
		return new Object[] { typeGraph };
	}

	public static final boolean pattern_CompilationUnit_17_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit_17_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_18_1_createresult_blackB(CompilationUnit _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CompilationUnit_18_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_CompilationUnit_18_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_18_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(eModelToTypeGraph)) {
			return new Object[] { ruleResult, eModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_18_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit_18_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eModelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEModelToTypeGraph : eModelToTypeGraphList.getEntryObjects()) {
				if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
					Model eModel = eModelToTypeGraph.getSource();
					if (eModel != null) {
						TypeGraph typeGraph = eModelToTypeGraph.getTarget();
						if (typeGraph != null) {
							if (pattern_CompilationUnit_18_2_isapplicablecore_black_nac_1BB(ruleResult,
									eModelToTypeGraph) == null) {
								if (pattern_CompilationUnit_18_2_isapplicablecore_black_nac_0BB(ruleResult,
										eModel) == null) {
									if (pattern_CompilationUnit_18_2_isapplicablecore_black_nac_2BB(ruleResult,
											typeGraph) == null) {
										_result.add(new Object[] { eModelToTypeGraphList, eModel, eModelToTypeGraph,
												typeGraph, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_CompilationUnit_18_3_solveCSP_bindingFBBBBBB(CompilationUnit _this,
			IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eModel, typeGraph, eModelToTypeGraph,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModel, typeGraph, eModelToTypeGraph, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit_18_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit_18_3_solveCSP_bindingAndBlackFBBBBBB(CompilationUnit _this,
			IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph typeGraph, ModelToTypeGraph eModelToTypeGraph,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_CompilationUnit_18_3_solveCSP_binding = pattern_CompilationUnit_18_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModel, typeGraph, eModelToTypeGraph, ruleResult);
		if (result_pattern_CompilationUnit_18_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit_18_3_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnit_18_3_solveCSP_black = pattern_CompilationUnit_18_3_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit_18_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModel, typeGraph, eModelToTypeGraph, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit_18_4_checkCSP_expressionFBB(CompilationUnit _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit_18_5_checknacs_blackBBB(Model eModel, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph) {
		return new Object[] { eModel, typeGraph, eModelToTypeGraph };
	}

	public static final Object[] pattern_CompilationUnit_18_6_perform_blackBBBB(Model eModel, TypeGraph typeGraph,
			ModelToTypeGraph eModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eModel, typeGraph, eModelToTypeGraph, ruleResult };
	}

	public static final Object[] pattern_CompilationUnit_18_6_perform_greenBFB(Model eModel,
			ModelgeneratorRuleResult ruleResult) {
		org.eclipse.gmt.modisco.java.CompilationUnit compilationUnit = JavaFactory.eINSTANCE.createCompilationUnit();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eModel.getCompilationUnits().add(compilationUnit);
		ruleResult.getSourceObjects().add(compilationUnit);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eModel, compilationUnit, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_CompilationUnit_18_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CompilationUnitImpl
