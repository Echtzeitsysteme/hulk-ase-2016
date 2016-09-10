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

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MGravityModel;

import org.gravity.tgg.modisco.MFieldNameToTField;
import org.gravity.tgg.modisco.ModelToTypeGraph;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.FieldName;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TField;
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
 * An implementation of the model object '<em><b>Field Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldNameImpl extends AbstractRuleImpl implements FieldName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFieldName mFieldName, MGravityModel model) {
		// initial bindings
		Object[] result1_black = FieldNameImpl.pattern_FieldName_0_1_initialbindings_blackBBBB(this, match, mFieldName,
				model);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", "
					+ "[model] = " + model + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldNameImpl.pattern_FieldName_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mFieldName, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", " + "[model] = "
					+ model + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldNameImpl.pattern_FieldName_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldNameImpl.pattern_FieldName_0_4_collectelementstobetranslated_blackBBB(match,
					mFieldName, model);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", "
						+ "[model] = " + model + ".");
			}
			FieldNameImpl.pattern_FieldName_0_4_collectelementstobetranslated_greenBBBFFF(match, mFieldName, model);
			// EMoflonEdge model__mFieldName____mFieldNames = (EMoflonEdge) result4_green[3];
			// EMoflonEdge mFieldName__model____model = (EMoflonEdge) result4_green[4];
			// EMoflonEdge model__mFieldName____mNames = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = FieldNameImpl.pattern_FieldName_0_5_collectcontextelements_blackBBB(match,
					mFieldName, model);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[mFieldName] = " + mFieldName + ", " + "[model] = " + model + ".");
			}
			FieldNameImpl.pattern_FieldName_0_5_collectcontextelements_greenBB(match, model);

			// register objects to match
			FieldNameImpl.pattern_FieldName_0_6_registerobjectstomatch_expressionBBBB(this, match, mFieldName, model);
			return FieldNameImpl.pattern_FieldName_0_7_expressionF();
		} else {
			return FieldNameImpl.pattern_FieldName_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[0];
		MGravityModel model = (MGravityModel) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_1_1_performtransformation_greenBFBFB(mFieldName,
				typeGraph, csp);
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_green[1];
		TField tField = (TField) result1_green[3];

		// collect translated elements
		Object[] result2_black = FieldNameImpl.pattern_FieldName_1_2_collecttranslatedelements_blackBBB(mFieldName,
				eFieldDeclarationToTField, tField);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mFieldName] = " + mFieldName + ", " + "[eFieldDeclarationToTField] = "
					+ eFieldDeclarationToTField + ", " + "[tField] = " + tField + ".");
		}
		Object[] result2_green = FieldNameImpl.pattern_FieldName_1_2_collecttranslatedelements_greenFBBB(mFieldName,
				eFieldDeclarationToTField, tField);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldNameImpl.pattern_FieldName_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				mFieldName, eFieldDeclarationToTField, model, typeGraph, tField, modelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mFieldName] = " + mFieldName + ", "
					+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[model] = " + model + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField + ", " + "[modelToTypeGraph] = "
					+ modelToTypeGraph + ".");
		}
		FieldNameImpl.pattern_FieldName_1_3_bookkeepingforedges_greenBBBBBBFFFFFFF(ruleresult, mFieldName,
				eFieldDeclarationToTField, model, typeGraph, tField);
		// EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge model__mFieldName____mFieldNames = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mFieldName__model____model = (EMoflonEdge) result3_green[9];
		// EMoflonEdge model__mFieldName____mNames = (EMoflonEdge) result3_green[10];
		// EMoflonEdge typeGraph__tField____fields = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tField__typeGraph____pg = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		FieldNameImpl.pattern_FieldName_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mFieldName,
				eFieldDeclarationToTField, model, typeGraph, tField, modelToTypeGraph);
		return FieldNameImpl.pattern_FieldName_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldNameImpl.pattern_FieldName_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFieldName mFieldName = (MFieldName) result2_binding[0];
		MGravityModel model = (MGravityModel) result2_binding[1];
		for (Object[] result2_black : FieldNameImpl.pattern_FieldName_2_2_corematch_blackBBFFB(mFieldName, model,
				match)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : FieldNameImpl.pattern_FieldName_2_3_findcontext_blackBBBB(mFieldName, model,
					typeGraph, modelToTypeGraph)) {
				Object[] result3_green = FieldNameImpl.pattern_FieldName_2_3_findcontext_greenBBBBFFFFFF(mFieldName,
						model, typeGraph, modelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge model__mFieldName____mFieldNames = (EMoflonEdge) result3_green[5];
				// EMoflonEdge mFieldName__model____model = (EMoflonEdge) result3_green[6];
				// EMoflonEdge model__mFieldName____mNames = (EMoflonEdge) result3_green[7];
				// EMoflonEdge modelToTypeGraph__model____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge modelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldNameImpl.pattern_FieldName_2_4_solveCSP_bindingAndBlackFBBBBBB(
						this, isApplicableMatch, mFieldName, model, typeGraph, modelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mFieldName] = " + mFieldName + ", " + "[model] = " + model + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[modelToTypeGraph] = " + modelToTypeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldNameImpl.pattern_FieldName_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldNameImpl
							.pattern_FieldName_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldNameImpl.pattern_FieldName_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldNameImpl.pattern_FieldName_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFieldName mFieldName, MGravityModel model) {
		match.registerObject("mFieldName", mFieldName);
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldName mFieldName, MGravityModel model) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName.mName", true, csp);
		var_mFieldName_mName.setValue(mFieldName.getMName());
		var_mFieldName_mName.setType("String");

		// Create unbound variables
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField.tName", csp);
		var_tField_tName.setType("String");
		Variable var_tField_ID = CSPFactoryHelper.eINSTANCE.createVariable("tField.ID", csp);
		var_tField_ID.setType("int");

		// Create constraints
		Eq eq = new Eq();
		CreateID createID = new CreateID();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(createID);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mFieldName_mName, var_tField_tName);
		createID.setRuleName("");
		createID.solve(var_tField_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mFieldName, EObject eFieldDeclarationToTField,
			EObject model, EObject typeGraph, EObject tField, EObject modelToTypeGraph) {
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("modelToTypeGraph", modelToTypeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mFieldName").eClass())
				.equals("modisco.MFieldName.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph, TField tField) {
		// initial bindings
		Object[] result1_black = FieldNameImpl.pattern_FieldName_10_1_initialbindings_blackBBBB(this, match, typeGraph,
				tField);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[tField] = " + tField + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldNameImpl.pattern_FieldName_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, typeGraph, tField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tField] = "
					+ tField + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldNameImpl.pattern_FieldName_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldNameImpl.pattern_FieldName_10_4_collectelementstobetranslated_blackBBB(match,
					typeGraph, tField);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[tField] = " + tField + ".");
			}
			FieldNameImpl.pattern_FieldName_10_4_collectelementstobetranslated_greenBBBFF(match, typeGraph, tField);
			// EMoflonEdge typeGraph__tField____fields = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tField__typeGraph____pg = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = FieldNameImpl.pattern_FieldName_10_5_collectcontextelements_blackBBB(match,
					typeGraph, tField);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField + ".");
			}
			FieldNameImpl.pattern_FieldName_10_5_collectcontextelements_greenBB(match, typeGraph);

			// register objects to match
			FieldNameImpl.pattern_FieldName_10_6_registerobjectstomatch_expressionBBBB(this, match, typeGraph, tField);
			return FieldNameImpl.pattern_FieldName_10_7_expressionF();
		} else {
			return FieldNameImpl.pattern_FieldName_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel model = (MGravityModel) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TField tField = (TField) result1_bindingAndBlack[2];
		ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_11_1_performtransformation_greenFFBBB(model, tField,
				csp);
		MFieldName mFieldName = (MFieldName) result1_green[0];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_green[1];

		// collect translated elements
		Object[] result2_black = FieldNameImpl.pattern_FieldName_11_2_collecttranslatedelements_blackBBB(mFieldName,
				eFieldDeclarationToTField, tField);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mFieldName] = " + mFieldName + ", " + "[eFieldDeclarationToTField] = "
					+ eFieldDeclarationToTField + ", " + "[tField] = " + tField + ".");
		}
		Object[] result2_green = FieldNameImpl.pattern_FieldName_11_2_collecttranslatedelements_greenFBBB(mFieldName,
				eFieldDeclarationToTField, tField);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldNameImpl.pattern_FieldName_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				mFieldName, eFieldDeclarationToTField, model, typeGraph, tField, modelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mFieldName] = " + mFieldName + ", "
					+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[model] = " + model + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField + ", " + "[modelToTypeGraph] = "
					+ modelToTypeGraph + ".");
		}
		FieldNameImpl.pattern_FieldName_11_3_bookkeepingforedges_greenBBBBBBFFFFFFF(ruleresult, mFieldName,
				eFieldDeclarationToTField, model, typeGraph, tField);
		// EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[6];
		// EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[7];
		// EMoflonEdge model__mFieldName____mFieldNames = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mFieldName__model____model = (EMoflonEdge) result3_green[9];
		// EMoflonEdge model__mFieldName____mNames = (EMoflonEdge) result3_green[10];
		// EMoflonEdge typeGraph__tField____fields = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tField__typeGraph____pg = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		FieldNameImpl.pattern_FieldName_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mFieldName,
				eFieldDeclarationToTField, model, typeGraph, tField, modelToTypeGraph);
		return FieldNameImpl.pattern_FieldName_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldNameImpl.pattern_FieldName_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result2_binding[0];
		TField tField = (TField) result2_binding[1];
		for (Object[] result2_black : FieldNameImpl.pattern_FieldName_12_2_corematch_blackFBBFB(typeGraph, tField,
				match)) {
			MGravityModel model = (MGravityModel) result2_black[0];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : FieldNameImpl.pattern_FieldName_12_3_findcontext_blackBBBB(model, typeGraph,
					tField, modelToTypeGraph)) {
				Object[] result3_green = FieldNameImpl.pattern_FieldName_12_3_findcontext_greenBBBBFFFFF(model,
						typeGraph, tField, modelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge typeGraph__tField____fields = (EMoflonEdge) result3_green[5];
				// EMoflonEdge tField__typeGraph____pg = (EMoflonEdge) result3_green[6];
				// EMoflonEdge modelToTypeGraph__model____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge modelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[8];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldNameImpl.pattern_FieldName_12_4_solveCSP_bindingAndBlackFBBBBBB(
						this, isApplicableMatch, model, typeGraph, tField, modelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[model] = " + model + ", " + "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField
							+ ", " + "[modelToTypeGraph] = " + modelToTypeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldNameImpl.pattern_FieldName_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldNameImpl
							.pattern_FieldName_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldNameImpl.pattern_FieldName_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldNameImpl.pattern_FieldName_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph, TField tField) {
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph, TField tField) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tField_ID = CSPFactoryHelper.eINSTANCE.createVariable("tField.ID", true, csp);
		var_tField_ID.setValue(tField.getID());
		var_tField_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tField_ID);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			TField tField, ModelToTypeGraph modelToTypeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField.tName", true, csp);
		var_tField_tName.setValue(tField.getTName());
		var_tField_tName.setType("String");

		// Create unbound variables
		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName.mName", csp);
		var_mFieldName_mName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mFieldName_mName, var_tField_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mFieldName, EObject eFieldDeclarationToTField,
			EObject model, EObject typeGraph, EObject tField, EObject modelToTypeGraph) {
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("modelToTypeGraph", modelToTypeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tField").eClass()).equals("basic.TField.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_18(EMoflonEdge _edge_mFieldNames) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameImpl
				.pattern_FieldName_20_2_testcorematchandDECs_blackFFB(_edge_mFieldNames)) {
			MFieldName mFieldName = (MFieldName) result2_black[0];
			MGravityModel model = (MGravityModel) result2_black[1];
			Object[] result2_green = FieldNameImpl.pattern_FieldName_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameImpl.pattern_FieldName_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, mFieldName, model)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameImpl.pattern_FieldName_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameImpl.pattern_FieldName_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldNameImpl.pattern_FieldName_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldNameImpl.pattern_FieldName_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_16(EMoflonEdge _edge_fields) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldNameImpl
				.pattern_FieldName_21_2_testcorematchandDECs_blackFFB(_edge_fields)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[0];
			TField tField = (TField) result2_black[1];
			Object[] result2_green = FieldNameImpl.pattern_FieldName_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldNameImpl.pattern_FieldName_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, typeGraph, tField)) {
				// Ensure that the correct types of elements are matched
				if (FieldNameImpl.pattern_FieldName_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = FieldNameImpl.pattern_FieldName_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldNameImpl.pattern_FieldName_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldNameImpl.pattern_FieldName_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldName");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName", true, csp);
		var_mFieldName_mName.setValue(__helper.getValue("mFieldName", "mName"));
		var_mFieldName_mName.setType("String");

		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField", true, csp);
		var_tField_tName.setValue(__helper.getValue("tField", "tName"));
		var_tField_tName.setType("String");

		Variable var_tField_ID = CSPFactoryHelper.eINSTANCE.createVariable("tField", true, csp);
		var_tField_ID.setValue(__helper.getValue("tField", "ID"));
		var_tField_ID.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		eq0.setRuleName("FieldName");
		eq0.solve(var_mFieldName_mName, var_tField_tName);

		createID1.setRuleName("FieldName");
		createID1.solve(var_tField_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tField_tName.setBound(false);
			var_tField_ID.setBound(false);
			eq0.solve(var_mFieldName_mName, var_tField_tName);
			createID1.solve(var_tField_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tField", "tName", var_tField_tName.getValue());
				__helper.setValue("tField", "ID", var_tField_ID.getValue());
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
		ruleResult.setRule("FieldName");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName", true, csp);
		var_mFieldName_mName.setValue(__helper.getValue("mFieldName", "mName"));
		var_mFieldName_mName.setType("String");

		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField", true, csp);
		var_tField_tName.setValue(__helper.getValue("tField", "tName"));
		var_tField_tName.setType("String");

		Variable var_tField_ID = CSPFactoryHelper.eINSTANCE.createVariable("tField", true, csp);
		var_tField_ID.setValue(__helper.getValue("tField", "ID"));
		var_tField_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		createID0.setRuleName("FieldName");
		createID0.solve(var_tField_ID);

		eq1.setRuleName("FieldName");
		eq1.solve(var_mFieldName_mName, var_tField_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mFieldName_mName.setBound(false);
			createID0.solve(var_tField_ID);
			eq1.solve(var_mFieldName_mName, var_tField_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mFieldName", "mName", var_mFieldName_mName.getValue());
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
		Object[] result1_black = FieldNameImpl.pattern_FieldName_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldNameImpl.pattern_FieldName_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = FieldNameImpl.pattern_FieldName_24_2_matchcontext_bindingFFFFBB(sourceMatch,
				targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MFieldName mFieldName = (MFieldName) result2_binding[0];
		MGravityModel model = (MGravityModel) result2_binding[1];
		TypeGraph typeGraph = (TypeGraph) result2_binding[2];
		TField tField = (TField) result2_binding[3];
		for (Object[] result2_black : FieldNameImpl.pattern_FieldName_24_2_matchcontext_blackBBBBFBB(mFieldName, model,
				typeGraph, tField, sourceMatch, targetMatch)) {
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[4];
			Object[] result2_green = FieldNameImpl.pattern_FieldName_24_2_matchcontext_greenBBBBBBFB(mFieldName, model,
					typeGraph, tField, modelToTypeGraph, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[6];

			// check csp
			Object[] result3_bindingAndBlack = FieldNameImpl.pattern_FieldName_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(
					this, isApplicableMatch, mFieldName, model, typeGraph, tField, modelToTypeGraph, sourceMatch,
					targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = FieldNameImpl.pattern_FieldName_24_4_createcorrespondence_blackBBBBB(
						mFieldName, model, typeGraph, tField, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mFieldName] = " + mFieldName + ", " + "[model] = " + model + ", "
							+ "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldNameImpl.pattern_FieldName_24_4_createcorrespondence_greenBFBB(mFieldName, tField,
						isApplicableMatch);
				// MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result4_green[1];

				// add to returned result
				Object[] result5_black = FieldNameImpl.pattern_FieldName_24_5_addtoreturnedresult_blackBB(result,
						isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldNameImpl.pattern_FieldName_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return FieldNameImpl.pattern_FieldName_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MFieldName mFieldName, MGravityModel model,
			TypeGraph typeGraph, TField tField, ModelToTypeGraph modelToTypeGraph, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName.mName", true, csp);
		var_mFieldName_mName.setValue(mFieldName.getMName());
		var_mFieldName_mName.setType("String");
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField.tName", true, csp);
		var_tField_tName.setValue(tField.getTName());
		var_tField_tName.setType("String");
		Variable var_tField_ID = CSPFactoryHelper.eINSTANCE.createVariable("tField.ID", true, csp);
		var_tField_ID.setValue(tField.getID());
		var_tField_ID.setType("int");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		CreateID createID = new CreateID();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(createID);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mFieldName_mName, var_tField_tName);
		createID.setRuleName("");
		createID.solve(var_tField_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
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
	public boolean checkDEC_FWD(MFieldName mFieldName, MGravityModel model) {// match tgg pattern
		Object[] result1_black = FieldNameImpl.pattern_FieldName_27_1_matchtggpattern_blackBB(mFieldName, model);
		if (result1_black != null) {
			return FieldNameImpl.pattern_FieldName_27_2_expressionF();
		} else {
			return FieldNameImpl.pattern_FieldName_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TField tField) {// match tgg pattern
		Object[] result1_black = FieldNameImpl.pattern_FieldName_28_1_matchtggpattern_blackBB(typeGraph, tField);
		if (result1_black != null) {
			return FieldNameImpl.pattern_FieldName_28_2_expressionF();
		} else {
			return FieldNameImpl.pattern_FieldName_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph modelToTypeGraphParameter) {
		// create result
		Object[] result1_black = FieldNameImpl.pattern_FieldName_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldNameImpl.pattern_FieldName_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : FieldNameImpl
				.pattern_FieldName_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList modelToTypeGraphList = (RuleEntryList) result2_black[0];
			MGravityModel model = (MGravityModel) result2_black[1];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[2];
			TypeGraph typeGraph = (TypeGraph) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = FieldNameImpl.pattern_FieldName_29_3_solveCSP_bindingAndBlackFBBBBBB(
					this, isApplicableMatch, model, typeGraph, modelToTypeGraph, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model
						+ ", " + "[typeGraph] = " + typeGraph + ", " + "[modelToTypeGraph] = " + modelToTypeGraph + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (FieldNameImpl.pattern_FieldName_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = FieldNameImpl.pattern_FieldName_29_5_checknacs_blackBBB(model, typeGraph,
						modelToTypeGraph);
				if (result5_black != null) {

					// perform
					Object[] result6_black = FieldNameImpl.pattern_FieldName_29_6_perform_blackBBBB(model, typeGraph,
							modelToTypeGraph, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed." + " Variables: " + "[model] = " + model
										+ ", " + "[typeGraph] = " + typeGraph + ", " + "[modelToTypeGraph] = "
										+ modelToTypeGraph + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldNameImpl.pattern_FieldName_29_6_perform_greenFFBBFBB(model, typeGraph, ruleResult, csp);
					// MFieldName mFieldName = (MFieldName) result6_green[0];
					// MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result6_green[1];
					// TField tField = (TField) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return FieldNameImpl.pattern_FieldName_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName.mName", csp);
		var_mFieldName_mName.setType("String");
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField.tName", csp);
		var_tField_tName.setType("String");
		Variable var_tField_ID = CSPFactoryHelper.eINSTANCE.createVariable("tField.ID", csp);
		var_tField_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();
		Eq eq = new Eq();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(eq);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tField_ID);
		eq.setRuleName("");
		eq.solve(var_mFieldName_mName, var_tField_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
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
		case RulesPackage.FIELD_NAME___IS_APPROPRIATE_FWD__MATCH_MFIELDNAME_MGRAVITYMODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MGravityModel) arguments.get(2));
		case RulesPackage.FIELD_NAME___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDNAME_MGRAVITYMODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MGravityModel) arguments.get(2));
			return null;
		case RulesPackage.FIELD_NAME___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDNAME_MGRAVITYMODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MGravityModel) arguments.get(2));
		case RulesPackage.FIELD_NAME___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MFIELDNAME_MGRAVITYMODEL_TYPEGRAPH_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(MGravityModel) arguments.get(2), (TypeGraph) arguments.get(3),
					(ModelToTypeGraph) arguments.get(4));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_NAME___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TFIELD:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1), (TField) arguments.get(2));
		case RulesPackage.FIELD_NAME___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TFIELD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TField) arguments.get(2));
			return null;
		case RulesPackage.FIELD_NAME___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TFIELD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TField) arguments.get(2));
		case RulesPackage.FIELD_NAME___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TYPEGRAPH_TFIELD_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(TypeGraph) arguments.get(2), (TField) arguments.get(3), (ModelToTypeGraph) arguments.get(4));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_NAME___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_NAME___IS_APPROPRIATE_FWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_18((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_NAME___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_16((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_NAME___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MFIELDNAME_MGRAVITYMODEL_TYPEGRAPH_TFIELD_MODELTOTYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(MGravityModel) arguments.get(2), (TypeGraph) arguments.get(3), (TField) arguments.get(4),
					(ModelToTypeGraph) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.FIELD_NAME___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_NAME___CHECK_DEC_FWD__MFIELDNAME_MGRAVITYMODEL:
			return checkDEC_FWD((MFieldName) arguments.get(0), (MGravityModel) arguments.get(1));
		case RulesPackage.FIELD_NAME___CHECK_DEC_BWD__TYPEGRAPH_TFIELD:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TField) arguments.get(1));
		case RulesPackage.FIELD_NAME___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.FIELD_NAME___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TYPEGRAPH_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(TypeGraph) arguments.get(2), (ModelToTypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIELD_NAME___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldName_0_1_initialbindings_blackBBBB(FieldName _this, Match match,
			MFieldName mFieldName, MGravityModel model) {
		return new Object[] { _this, match, mFieldName, model };
	}

	public static final Object[] pattern_FieldName_0_2_SolveCSP_bindingFBBBB(FieldName _this, Match match,
			MFieldName mFieldName, MGravityModel model) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mFieldName, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mFieldName, model };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_0_2_SolveCSP_bindingAndBlackFBBBB(FieldName _this, Match match,
			MFieldName mFieldName, MGravityModel model) {
		Object[] result_pattern_FieldName_0_2_SolveCSP_binding = pattern_FieldName_0_2_SolveCSP_bindingFBBBB(_this,
				match, mFieldName, model);
		if (result_pattern_FieldName_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldName_0_2_SolveCSP_black = pattern_FieldName_0_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldName_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mFieldName, model };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_0_3_CheckCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_0_4_collectelementstobetranslated_blackBBB(Match match,
			MFieldName mFieldName, MGravityModel model) {
		return new Object[] { match, mFieldName, model };
	}

	public static final Object[] pattern_FieldName_0_4_collectelementstobetranslated_greenBBBFFF(Match match,
			MFieldName mFieldName, MGravityModel model) {
		EMoflonEdge model__mFieldName____mFieldNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mFieldName____mNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mFieldName);
		String model__mFieldName____mFieldNames_name_prime = "mFieldNames";
		String mFieldName__model____model_name_prime = "model";
		String model__mFieldName____mNames_name_prime = "mNames";
		model__mFieldName____mFieldNames.setSrc(model);
		model__mFieldName____mFieldNames.setTrg(mFieldName);
		match.getToBeTranslatedEdges().add(model__mFieldName____mFieldNames);
		mFieldName__model____model.setSrc(mFieldName);
		mFieldName__model____model.setTrg(model);
		match.getToBeTranslatedEdges().add(mFieldName__model____model);
		model__mFieldName____mNames.setSrc(model);
		model__mFieldName____mNames.setTrg(mFieldName);
		match.getToBeTranslatedEdges().add(model__mFieldName____mNames);
		model__mFieldName____mFieldNames.setName(model__mFieldName____mFieldNames_name_prime);
		mFieldName__model____model.setName(mFieldName__model____model_name_prime);
		model__mFieldName____mNames.setName(model__mFieldName____mNames_name_prime);
		return new Object[] { match, mFieldName, model, model__mFieldName____mFieldNames, mFieldName__model____model,
				model__mFieldName____mNames };
	}

	public static final Object[] pattern_FieldName_0_5_collectcontextelements_blackBBB(Match match,
			MFieldName mFieldName, MGravityModel model) {
		return new Object[] { match, mFieldName, model };
	}

	public static final Object[] pattern_FieldName_0_5_collectcontextelements_greenBB(Match match,
			MGravityModel model) {
		match.getContextNodes().add(model);
		return new Object[] { match, model };
	}

	public static final void pattern_FieldName_0_6_registerobjectstomatch_expressionBBBB(FieldName _this, Match match,
			MFieldName mFieldName, MGravityModel model) {
		_this.registerObjectsToMatch_FWD(match, mFieldName, model);

	}

	public static final boolean pattern_FieldName_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldName_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldName_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_1 = isApplicableMatch.getObject("model");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("modelToTypeGraph");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpModelToTypeGraph = _localVariable_3;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpModel instanceof MGravityModel) {
				MGravityModel model = (MGravityModel) tmpModel;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpModelToTypeGraph instanceof ModelToTypeGraph) {
						ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) tmpModelToTypeGraph;
						return new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_1_1_performtransformation_blackBBBBFBB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph, FieldName _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_1_1_performtransformation_bindingAndBlackFFFFFBB(FieldName _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldName_1_1_performtransformation_binding = pattern_FieldName_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldName_1_1_performtransformation_binding != null) {
			MFieldName mFieldName = (MFieldName) result_pattern_FieldName_1_1_performtransformation_binding[0];
			MGravityModel model = (MGravityModel) result_pattern_FieldName_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_FieldName_1_1_performtransformation_binding[2];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result_pattern_FieldName_1_1_performtransformation_binding[3];

			Object[] result_pattern_FieldName_1_1_performtransformation_black = pattern_FieldName_1_1_performtransformation_blackBBBBFBB(
					mFieldName, model, typeGraph, modelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_FieldName_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldName_1_1_performtransformation_black[4];

				return new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_1_1_performtransformation_greenBFBFB(MFieldName mFieldName,
			TypeGraph typeGraph, CSP csp) {
		MFieldNameToTField eFieldDeclarationToTField = ModiscoFactory.eINSTANCE.createMFieldNameToTField();
		TField tField = BasicFactory.eINSTANCE.createTField();
		Object _localVariable_0 = csp.getValue("tField", "tName");
		Object _localVariable_1 = csp.getValue("tField", "ID");
		eFieldDeclarationToTField.setSource(mFieldName);
		eFieldDeclarationToTField.setTarget(tField);
		typeGraph.getFields().add(tField);
		String tField_tName_prime = (String) _localVariable_0;
		int tField_ID_prime = (int) _localVariable_1;
		tField.setTName(tField_tName_prime);
		tField.setID(Integer.valueOf(tField_ID_prime));
		return new Object[] { mFieldName, eFieldDeclarationToTField, typeGraph, tField, csp };
	}

	public static final Object[] pattern_FieldName_1_2_collecttranslatedelements_blackBBB(MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField) {
		return new Object[] { mFieldName, eFieldDeclarationToTField, tField };
	}

	public static final Object[] pattern_FieldName_1_2_collecttranslatedelements_greenFBBB(MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mFieldName);
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTField);
		ruleresult.getCreatedElements().add(tField);
		return new Object[] { ruleresult, mFieldName, eFieldDeclarationToTField, tField };
	}

	public static final Object[] pattern_FieldName_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject mFieldName, EObject eFieldDeclarationToTField, EObject model, EObject typeGraph, EObject tField,
			EObject modelToTypeGraph) {
		if (!mFieldName.equals(model)) {
			if (!mFieldName.equals(typeGraph)) {
				if (!mFieldName.equals(tField)) {
					if (!mFieldName.equals(modelToTypeGraph)) {
						if (!eFieldDeclarationToTField.equals(mFieldName)) {
							if (!eFieldDeclarationToTField.equals(model)) {
								if (!eFieldDeclarationToTField.equals(typeGraph)) {
									if (!eFieldDeclarationToTField.equals(tField)) {
										if (!eFieldDeclarationToTField.equals(modelToTypeGraph)) {
											if (!model.equals(typeGraph)) {
												if (!model.equals(tField)) {
													if (!model.equals(modelToTypeGraph)) {
														if (!tField.equals(typeGraph)) {
															if (!modelToTypeGraph.equals(typeGraph)) {
																if (!modelToTypeGraph.equals(tField)) {
																	return new Object[] { ruleresult, mFieldName,
																			eFieldDeclarationToTField, model, typeGraph,
																			tField, modelToTypeGraph };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldName_1_3_bookkeepingforedges_greenBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject mFieldName, EObject eFieldDeclarationToTField, EObject model,
			EObject typeGraph, EObject tField) {
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mFieldName____mFieldNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mFieldName____mNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tField____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldName";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String model__mFieldName____mFieldNames_name_prime = "mFieldNames";
		String mFieldName__model____model_name_prime = "model";
		String model__mFieldName____mNames_name_prime = "mNames";
		String typeGraph__tField____fields_name_prime = "fields";
		String tField__typeGraph____pg_name_prime = "pg";
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__mFieldName____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__tField____target);
		model__mFieldName____mFieldNames.setSrc(model);
		model__mFieldName____mFieldNames.setTrg(mFieldName);
		ruleresult.getTranslatedEdges().add(model__mFieldName____mFieldNames);
		mFieldName__model____model.setSrc(mFieldName);
		mFieldName__model____model.setTrg(model);
		ruleresult.getTranslatedEdges().add(mFieldName__model____model);
		model__mFieldName____mNames.setSrc(model);
		model__mFieldName____mNames.setTrg(mFieldName);
		ruleresult.getTranslatedEdges().add(model__mFieldName____mNames);
		typeGraph__tField____fields.setSrc(typeGraph);
		typeGraph__tField____fields.setTrg(tField);
		ruleresult.getCreatedEdges().add(typeGraph__tField____fields);
		tField__typeGraph____pg.setSrc(tField);
		tField__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tField__typeGraph____pg);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		model__mFieldName____mFieldNames.setName(model__mFieldName____mFieldNames_name_prime);
		mFieldName__model____model.setName(mFieldName__model____model_name_prime);
		model__mFieldName____mNames.setName(model__mFieldName____mNames_name_prime);
		typeGraph__tField____fields.setName(typeGraph__tField____fields_name_prime);
		tField__typeGraph____pg.setName(tField__typeGraph____pg_name_prime);
		return new Object[] { ruleresult, mFieldName, eFieldDeclarationToTField, model, typeGraph, tField,
				eFieldDeclarationToTField__mFieldName____source, eFieldDeclarationToTField__tField____target,
				model__mFieldName____mFieldNames, mFieldName__model____model, model__mFieldName____mNames,
				typeGraph__tField____fields, tField__typeGraph____pg };
	}

	public static final void pattern_FieldName_1_5_registerobjects_expressionBBBBBBBB(FieldName _this,
			PerformRuleResult ruleresult, EObject mFieldName, EObject eFieldDeclarationToTField, EObject model,
			EObject typeGraph, EObject tField, EObject modelToTypeGraph) {
		_this.registerObjects_FWD(ruleresult, mFieldName, eFieldDeclarationToTField, model, typeGraph, tField,
				modelToTypeGraph);

	}

	public static final PerformRuleResult pattern_FieldName_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldName_2_1_preparereturnvalue_bindingFB(FieldName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_2_1_preparereturnvalue_blackFBB(EClass eClass, FieldName _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldName_2_1_preparereturnvalue_bindingAndBlackFFB(FieldName _this) {
		Object[] result_pattern_FieldName_2_1_preparereturnvalue_binding = pattern_FieldName_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldName_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldName_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldName_2_1_preparereturnvalue_black = pattern_FieldName_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldName_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldName_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldName";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldName_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mFieldName");
		EObject _localVariable_1 = match.getObject("model");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpModel instanceof MGravityModel) {
				MGravityModel model = (MGravityModel) tmpModel;
				return new Object[] { mFieldName, model, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_2_2_corematch_blackBBFFB(MFieldName mFieldName,
			MGravityModel model, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph modelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(model, ModelToTypeGraph.class, "source")) {
			TypeGraph typeGraph = modelToTypeGraph.getTarget();
			if (typeGraph != null) {
				_result.add(new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldName_2_3_findcontext_blackBBBB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.getMFieldNames().contains(mFieldName)) {
			if (model.getMNames().contains(mFieldName)) {
				if (model.equals(modelToTypeGraph.getSource())) {
					if (typeGraph.equals(modelToTypeGraph.getTarget())) {
						_result.add(new Object[] { mFieldName, model, typeGraph, modelToTypeGraph });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldName_2_3_findcontext_greenBBBBFFFFFF(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__mFieldName____mFieldNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mFieldName____mNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__mFieldName____mFieldNames_name_prime = "mFieldNames";
		String mFieldName__model____model_name_prime = "model";
		String model__mFieldName____mNames_name_prime = "mNames";
		String modelToTypeGraph__model____source_name_prime = "source";
		String modelToTypeGraph__typeGraph____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph);
		model__mFieldName____mFieldNames.setSrc(model);
		model__mFieldName____mFieldNames.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(model__mFieldName____mFieldNames);
		mFieldName__model____model.setSrc(mFieldName);
		mFieldName__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(mFieldName__model____model);
		model__mFieldName____mNames.setSrc(model);
		model__mFieldName____mNames.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(model__mFieldName____mNames);
		modelToTypeGraph__model____source.setSrc(modelToTypeGraph);
		modelToTypeGraph__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__model____source);
		modelToTypeGraph__typeGraph____target.setSrc(modelToTypeGraph);
		modelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__typeGraph____target);
		model__mFieldName____mFieldNames.setName(model__mFieldName____mFieldNames_name_prime);
		mFieldName__model____model.setName(mFieldName__model____model_name_prime);
		model__mFieldName____mNames.setName(model__mFieldName____mNames_name_prime);
		modelToTypeGraph__model____source.setName(modelToTypeGraph__model____source_name_prime);
		modelToTypeGraph__typeGraph____target.setName(modelToTypeGraph__typeGraph____target_name_prime);
		return new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, isApplicableMatch,
				model__mFieldName____mFieldNames, mFieldName__model____model, model__mFieldName____mNames,
				modelToTypeGraph__model____source, modelToTypeGraph__typeGraph____target };
	}

	public static final Object[] pattern_FieldName_2_4_solveCSP_bindingFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mFieldName, model, typeGraph,
				modelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, model, typeGraph, modelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_2_4_solveCSP_bindingAndBlackFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph) {
		Object[] result_pattern_FieldName_2_4_solveCSP_binding = pattern_FieldName_2_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, mFieldName, model, typeGraph, modelToTypeGraph);
		if (result_pattern_FieldName_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldName_2_4_solveCSP_black = pattern_FieldName_2_4_solveCSP_blackB(csp);
			if (result_pattern_FieldName_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, model, typeGraph, modelToTypeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_2_5_checkCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldName_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldName";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldName_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldName_10_1_initialbindings_blackBBBB(FieldName _this, Match match,
			TypeGraph typeGraph, TField tField) {
		return new Object[] { _this, match, typeGraph, tField };
	}

	public static final Object[] pattern_FieldName_10_2_SolveCSP_bindingFBBBB(FieldName _this, Match match,
			TypeGraph typeGraph, TField tField) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, typeGraph, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_10_2_SolveCSP_bindingAndBlackFBBBB(FieldName _this, Match match,
			TypeGraph typeGraph, TField tField) {
		Object[] result_pattern_FieldName_10_2_SolveCSP_binding = pattern_FieldName_10_2_SolveCSP_bindingFBBBB(_this,
				match, typeGraph, tField);
		if (result_pattern_FieldName_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldName_10_2_SolveCSP_black = pattern_FieldName_10_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldName_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeGraph, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_10_3_CheckCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph typeGraph, TField tField) {
		return new Object[] { match, typeGraph, tField };
	}

	public static final Object[] pattern_FieldName_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TypeGraph typeGraph, TField tField) {
		EMoflonEdge typeGraph__tField____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tField);
		String typeGraph__tField____fields_name_prime = "fields";
		String tField__typeGraph____pg_name_prime = "pg";
		typeGraph__tField____fields.setSrc(typeGraph);
		typeGraph__tField____fields.setTrg(tField);
		match.getToBeTranslatedEdges().add(typeGraph__tField____fields);
		tField__typeGraph____pg.setSrc(tField);
		tField__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tField__typeGraph____pg);
		typeGraph__tField____fields.setName(typeGraph__tField____fields_name_prime);
		tField__typeGraph____pg.setName(tField__typeGraph____pg_name_prime);
		return new Object[] { match, typeGraph, tField, typeGraph__tField____fields, tField__typeGraph____pg };
	}

	public static final Object[] pattern_FieldName_10_5_collectcontextelements_blackBBB(Match match,
			TypeGraph typeGraph, TField tField) {
		return new Object[] { match, typeGraph, tField };
	}

	public static final Object[] pattern_FieldName_10_5_collectcontextelements_greenBB(Match match,
			TypeGraph typeGraph) {
		match.getContextNodes().add(typeGraph);
		return new Object[] { match, typeGraph };
	}

	public static final void pattern_FieldName_10_6_registerobjectstomatch_expressionBBBB(FieldName _this, Match match,
			TypeGraph typeGraph, TField tField) {
		_this.registerObjectsToMatch_BWD(match, typeGraph, tField);

	}

	public static final boolean pattern_FieldName_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldName_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldName_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tField");
		EObject _localVariable_3 = isApplicableMatch.getObject("modelToTypeGraph");
		EObject tmpModel = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		EObject tmpModelToTypeGraph = _localVariable_3;
		if (tmpModel instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) tmpModel;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					if (tmpModelToTypeGraph instanceof ModelToTypeGraph) {
						ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) tmpModelToTypeGraph;
						return new Object[] { model, typeGraph, tField, modelToTypeGraph, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_11_1_performtransformation_blackBBBBFBB(MGravityModel model,
			TypeGraph typeGraph, TField tField, ModelToTypeGraph modelToTypeGraph, FieldName _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, typeGraph, tField, modelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_11_1_performtransformation_bindingAndBlackFFFFFBB(FieldName _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldName_11_1_performtransformation_binding = pattern_FieldName_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldName_11_1_performtransformation_binding != null) {
			MGravityModel model = (MGravityModel) result_pattern_FieldName_11_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_FieldName_11_1_performtransformation_binding[1];
			TField tField = (TField) result_pattern_FieldName_11_1_performtransformation_binding[2];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result_pattern_FieldName_11_1_performtransformation_binding[3];

			Object[] result_pattern_FieldName_11_1_performtransformation_black = pattern_FieldName_11_1_performtransformation_blackBBBBFBB(
					model, typeGraph, tField, modelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_FieldName_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldName_11_1_performtransformation_black[4];

				return new Object[] { model, typeGraph, tField, modelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_11_1_performtransformation_greenFFBBB(MGravityModel model,
			TField tField, CSP csp) {
		MFieldName mFieldName = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMFieldName();
		MFieldNameToTField eFieldDeclarationToTField = ModiscoFactory.eINSTANCE.createMFieldNameToTField();
		Object _localVariable_0 = csp.getValue("mFieldName", "mName");
		model.getMFieldNames().add(mFieldName);
		model.getMNames().add(mFieldName);
		eFieldDeclarationToTField.setSource(mFieldName);
		eFieldDeclarationToTField.setTarget(tField);
		String mFieldName_mName_prime = (String) _localVariable_0;
		mFieldName.setMName(mFieldName_mName_prime);
		return new Object[] { mFieldName, eFieldDeclarationToTField, model, tField, csp };
	}

	public static final Object[] pattern_FieldName_11_2_collecttranslatedelements_blackBBB(MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField) {
		return new Object[] { mFieldName, eFieldDeclarationToTField, tField };
	}

	public static final Object[] pattern_FieldName_11_2_collecttranslatedelements_greenFBBB(MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mFieldName);
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTField);
		ruleresult.getTranslatedElements().add(tField);
		return new Object[] { ruleresult, mFieldName, eFieldDeclarationToTField, tField };
	}

	public static final Object[] pattern_FieldName_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject mFieldName, EObject eFieldDeclarationToTField, EObject model, EObject typeGraph, EObject tField,
			EObject modelToTypeGraph) {
		if (!mFieldName.equals(model)) {
			if (!mFieldName.equals(typeGraph)) {
				if (!mFieldName.equals(tField)) {
					if (!mFieldName.equals(modelToTypeGraph)) {
						if (!eFieldDeclarationToTField.equals(mFieldName)) {
							if (!eFieldDeclarationToTField.equals(model)) {
								if (!eFieldDeclarationToTField.equals(typeGraph)) {
									if (!eFieldDeclarationToTField.equals(tField)) {
										if (!eFieldDeclarationToTField.equals(modelToTypeGraph)) {
											if (!model.equals(typeGraph)) {
												if (!model.equals(tField)) {
													if (!model.equals(modelToTypeGraph)) {
														if (!tField.equals(typeGraph)) {
															if (!modelToTypeGraph.equals(typeGraph)) {
																if (!modelToTypeGraph.equals(tField)) {
																	return new Object[] { ruleresult, mFieldName,
																			eFieldDeclarationToTField, model, typeGraph,
																			tField, modelToTypeGraph };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldName_11_3_bookkeepingforedges_greenBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject mFieldName, EObject eFieldDeclarationToTField, EObject model,
			EObject typeGraph, EObject tField) {
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mFieldName____mFieldNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mFieldName____mNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tField____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldName";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String model__mFieldName____mFieldNames_name_prime = "mFieldNames";
		String mFieldName__model____model_name_prime = "model";
		String model__mFieldName____mNames_name_prime = "mNames";
		String typeGraph__tField____fields_name_prime = "fields";
		String tField__typeGraph____pg_name_prime = "pg";
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__mFieldName____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__tField____target);
		model__mFieldName____mFieldNames.setSrc(model);
		model__mFieldName____mFieldNames.setTrg(mFieldName);
		ruleresult.getCreatedEdges().add(model__mFieldName____mFieldNames);
		mFieldName__model____model.setSrc(mFieldName);
		mFieldName__model____model.setTrg(model);
		ruleresult.getCreatedEdges().add(mFieldName__model____model);
		model__mFieldName____mNames.setSrc(model);
		model__mFieldName____mNames.setTrg(mFieldName);
		ruleresult.getCreatedEdges().add(model__mFieldName____mNames);
		typeGraph__tField____fields.setSrc(typeGraph);
		typeGraph__tField____fields.setTrg(tField);
		ruleresult.getTranslatedEdges().add(typeGraph__tField____fields);
		tField__typeGraph____pg.setSrc(tField);
		tField__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tField__typeGraph____pg);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		model__mFieldName____mFieldNames.setName(model__mFieldName____mFieldNames_name_prime);
		mFieldName__model____model.setName(mFieldName__model____model_name_prime);
		model__mFieldName____mNames.setName(model__mFieldName____mNames_name_prime);
		typeGraph__tField____fields.setName(typeGraph__tField____fields_name_prime);
		tField__typeGraph____pg.setName(tField__typeGraph____pg_name_prime);
		return new Object[] { ruleresult, mFieldName, eFieldDeclarationToTField, model, typeGraph, tField,
				eFieldDeclarationToTField__mFieldName____source, eFieldDeclarationToTField__tField____target,
				model__mFieldName____mFieldNames, mFieldName__model____model, model__mFieldName____mNames,
				typeGraph__tField____fields, tField__typeGraph____pg };
	}

	public static final void pattern_FieldName_11_5_registerobjects_expressionBBBBBBBB(FieldName _this,
			PerformRuleResult ruleresult, EObject mFieldName, EObject eFieldDeclarationToTField, EObject model,
			EObject typeGraph, EObject tField, EObject modelToTypeGraph) {
		_this.registerObjects_BWD(ruleresult, mFieldName, eFieldDeclarationToTField, model, typeGraph, tField,
				modelToTypeGraph);

	}

	public static final PerformRuleResult pattern_FieldName_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldName_12_1_preparereturnvalue_bindingFB(FieldName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_12_1_preparereturnvalue_blackFBB(EClass eClass, FieldName _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldName_12_1_preparereturnvalue_bindingAndBlackFFB(FieldName _this) {
		Object[] result_pattern_FieldName_12_1_preparereturnvalue_binding = pattern_FieldName_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldName_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldName_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldName_12_1_preparereturnvalue_black = pattern_FieldName_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldName_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldName_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldName";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldName_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeGraph");
		EObject _localVariable_1 = match.getObject("tField");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTField = _localVariable_1;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				return new Object[] { typeGraph, tField, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_12_2_corematch_blackFBBFB(TypeGraph typeGraph,
			TField tField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph modelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeGraph, ModelToTypeGraph.class, "target")) {
			Model tmpModel = modelToTypeGraph.getSource();
			if (tmpModel instanceof MGravityModel) {
				MGravityModel model = (MGravityModel) tmpModel;
				_result.add(new Object[] { model, typeGraph, tField, modelToTypeGraph, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldName_12_3_findcontext_blackBBBB(MGravityModel model,
			TypeGraph typeGraph, TField tField, ModelToTypeGraph modelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeGraph.getFields().contains(tField)) {
			if (model.equals(modelToTypeGraph.getSource())) {
				if (typeGraph.equals(modelToTypeGraph.getTarget())) {
					_result.add(new Object[] { model, typeGraph, tField, modelToTypeGraph });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldName_12_3_findcontext_greenBBBBFFFFF(MGravityModel model,
			TypeGraph typeGraph, TField tField, ModelToTypeGraph modelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge typeGraph__tField____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String typeGraph__tField____fields_name_prime = "fields";
		String tField__typeGraph____pg_name_prime = "pg";
		String modelToTypeGraph__model____source_name_prime = "source";
		String modelToTypeGraph__typeGraph____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph);
		typeGraph__tField____fields.setSrc(typeGraph);
		typeGraph__tField____fields.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(typeGraph__tField____fields);
		tField__typeGraph____pg.setSrc(tField);
		tField__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tField__typeGraph____pg);
		modelToTypeGraph__model____source.setSrc(modelToTypeGraph);
		modelToTypeGraph__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__model____source);
		modelToTypeGraph__typeGraph____target.setSrc(modelToTypeGraph);
		modelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__typeGraph____target);
		typeGraph__tField____fields.setName(typeGraph__tField____fields_name_prime);
		tField__typeGraph____pg.setName(tField__typeGraph____pg_name_prime);
		modelToTypeGraph__model____source.setName(modelToTypeGraph__model____source_name_prime);
		modelToTypeGraph__typeGraph____target.setName(modelToTypeGraph__typeGraph____target_name_prime);
		return new Object[] { model, typeGraph, tField, modelToTypeGraph, isApplicableMatch,
				typeGraph__tField____fields, tField__typeGraph____pg, modelToTypeGraph__model____source,
				modelToTypeGraph__typeGraph____target };
	}

	public static final Object[] pattern_FieldName_12_4_solveCSP_bindingFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph, TField tField,
			ModelToTypeGraph modelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, model, typeGraph, tField,
				modelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, typeGraph, tField, modelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_12_4_solveCSP_bindingAndBlackFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph, TField tField,
			ModelToTypeGraph modelToTypeGraph) {
		Object[] result_pattern_FieldName_12_4_solveCSP_binding = pattern_FieldName_12_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, model, typeGraph, tField, modelToTypeGraph);
		if (result_pattern_FieldName_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldName_12_4_solveCSP_black = pattern_FieldName_12_4_solveCSP_blackB(csp);
			if (result_pattern_FieldName_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, typeGraph, tField, modelToTypeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_12_5_checkCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldName_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldName";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldName_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldName_20_1_preparereturnvalue_bindingFB(FieldName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_20_1_preparereturnvalue_blackFBBF(EClass __eClass, FieldName _this) {
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

	public static final Object[] pattern_FieldName_20_1_preparereturnvalue_bindingAndBlackFFBF(FieldName _this) {
		Object[] result_pattern_FieldName_20_1_preparereturnvalue_binding = pattern_FieldName_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldName_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldName_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldName_20_1_preparereturnvalue_black = pattern_FieldName_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldName_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldName_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldName_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldName_20_2_testcorematchandDECs_black_nac_0BB(MFieldName mFieldName,
			MGravityModel model) {
		for (MGravityModel __DEC_mFieldName_mNames_488731 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mFieldName, MGravityModel.class, "mNames")) {
			if (!model.equals(__DEC_mFieldName_mNames_488731)) {
				return new Object[] { mFieldName, model };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mFieldNames) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_mFieldNames.getSrc();
		if (tmpModel instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) tmpModel;
			EObject tmpMFieldName = _edge_mFieldNames.getTrg();
			if (tmpMFieldName instanceof MFieldName) {
				MFieldName mFieldName = (MFieldName) tmpMFieldName;
				if (model.getMFieldNames().contains(mFieldName)) {
					if (model.getMNames().contains(mFieldName)) {
						if (pattern_FieldName_20_2_testcorematchandDECs_black_nac_0BB(mFieldName, model) == null) {
							_result.add(new Object[] { mFieldName, model, _edge_mFieldNames });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldName_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldName_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldName _this, Match match, MFieldName mFieldName, MGravityModel model) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mFieldName, model);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldName_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldName _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldName_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldName_21_1_preparereturnvalue_bindingFB(FieldName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_21_1_preparereturnvalue_blackFBBF(EClass __eClass, FieldName _this) {
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

	public static final Object[] pattern_FieldName_21_1_preparereturnvalue_bindingAndBlackFFBF(FieldName _this) {
		Object[] result_pattern_FieldName_21_1_preparereturnvalue_binding = pattern_FieldName_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldName_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldName_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldName_21_1_preparereturnvalue_black = pattern_FieldName_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldName_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldName_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldName_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldName_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_fields) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_fields.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTField = _edge_fields.getTrg();
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (typeGraph.getFields().contains(tField)) {
					_result.add(new Object[] { typeGraph, tField, _edge_fields });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldName_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldName_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldName _this, Match match, TypeGraph typeGraph, TField tField) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldName_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldName _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldName_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldName_24_1_prepare_blackB(FieldName _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldName_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldName_24_2_matchcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mFieldName");
		EObject _localVariable_1 = sourceMatch.getObject("model");
		EObject _localVariable_2 = targetMatch.getObject("typeGraph");
		EObject _localVariable_3 = targetMatch.getObject("tField");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpModel instanceof MGravityModel) {
				MGravityModel model = (MGravityModel) tmpModel;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpTField instanceof TField) {
						TField tField = (TField) tmpTField;
						return new Object[] { mFieldName, model, typeGraph, tField, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_24_2_matchcontext_blackBBBBFBB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, TField tField, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (model.getMFieldNames().contains(mFieldName)) {
				if (model.getMNames().contains(mFieldName)) {
					if (typeGraph.getFields().contains(tField)) {
						for (ModelToTypeGraph modelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(model, ModelToTypeGraph.class, "source")) {
							if (typeGraph.equals(modelToTypeGraph.getTarget())) {
								_result.add(new Object[] { mFieldName, model, typeGraph, tField, modelToTypeGraph,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldName_24_2_matchcontext_greenBBBBBBFB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, TField tField, ModelToTypeGraph modelToTypeGraph,
			Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "FieldName";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mFieldName, model, typeGraph, tField, modelToTypeGraph, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_FieldName_24_3_checkcsp_bindingFBBBBBBBBB(FieldName _this,
			CCMatch isApplicableMatch, MFieldName mFieldName, MGravityModel model, TypeGraph typeGraph, TField tField,
			ModelToTypeGraph modelToTypeGraph, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mFieldName, model, typeGraph, tField,
				modelToTypeGraph, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, model, typeGraph, tField, modelToTypeGraph,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_24_3_checkcsp_bindingAndBlackFBBBBBBBBB(FieldName _this,
			CCMatch isApplicableMatch, MFieldName mFieldName, MGravityModel model, TypeGraph typeGraph, TField tField,
			ModelToTypeGraph modelToTypeGraph, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldName_24_3_checkcsp_binding = pattern_FieldName_24_3_checkcsp_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mFieldName, model, typeGraph, tField, modelToTypeGraph, sourceMatch,
				targetMatch);
		if (result_pattern_FieldName_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_24_3_checkcsp_binding[0];

			Object[] result_pattern_FieldName_24_3_checkcsp_black = pattern_FieldName_24_3_checkcsp_blackB(csp);
			if (result_pattern_FieldName_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, model, typeGraph, tField,
						modelToTypeGraph, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_24_4_createcorrespondence_blackBBBBB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, TField tField, CCMatch isApplicableMatch) {
		return new Object[] { mFieldName, model, typeGraph, tField, isApplicableMatch };
	}

	public static final Object[] pattern_FieldName_24_4_createcorrespondence_greenBFBB(MFieldName mFieldName,
			TField tField, CCMatch isApplicableMatch) {
		MFieldNameToTField eFieldDeclarationToTField = ModiscoFactory.eINSTANCE.createMFieldNameToTField();
		eFieldDeclarationToTField.setSource(mFieldName);
		eFieldDeclarationToTField.setTarget(tField);
		isApplicableMatch.getCreateCorr().add(eFieldDeclarationToTField);
		return new Object[] { mFieldName, eFieldDeclarationToTField, tField, isApplicableMatch };
	}

	public static final Object[] pattern_FieldName_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_FieldName_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldName";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldName_24_6_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldName_27_1_matchtggpattern_black_nac_0BB(MFieldName mFieldName,
			MGravityModel model) {
		for (MGravityModel __DEC_mFieldName_mNames_189680 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mFieldName, MGravityModel.class, "mNames")) {
			if (!model.equals(__DEC_mFieldName_mNames_189680)) {
				return new Object[] { mFieldName, model };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_27_1_matchtggpattern_blackBB(MFieldName mFieldName,
			MGravityModel model) {
		if (model.getMFieldNames().contains(mFieldName)) {
			if (model.getMNames().contains(mFieldName)) {
				if (pattern_FieldName_27_1_matchtggpattern_black_nac_0BB(mFieldName, model) == null) {
					return new Object[] { mFieldName, model };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldName_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldName_28_1_matchtggpattern_blackBB(TypeGraph typeGraph, TField tField) {
		if (typeGraph.getFields().contains(tField)) {
			return new Object[] { typeGraph, tField };
		}
		return null;
	}

	public static final boolean pattern_FieldName_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldName_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldName_29_1_createresult_blackB(FieldName _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldName_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldName_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MGravityModel model) {
		if (ruleResult.getSourceObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph modelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(modelToTypeGraph)) {
			return new Object[] { ruleResult, modelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList modelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpModelToTypeGraph : modelToTypeGraphList.getEntryObjects()) {
				if (tmpModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) tmpModelToTypeGraph;
					Model tmpModel = modelToTypeGraph.getSource();
					if (tmpModel instanceof MGravityModel) {
						MGravityModel model = (MGravityModel) tmpModel;
						TypeGraph typeGraph = modelToTypeGraph.getTarget();
						if (typeGraph != null) {
							if (pattern_FieldName_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									modelToTypeGraph) == null) {
								if (pattern_FieldName_29_2_isapplicablecore_black_nac_0BB(ruleResult, model) == null) {
									if (pattern_FieldName_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											typeGraph) == null) {
										_result.add(new Object[] { modelToTypeGraphList, model, modelToTypeGraph,
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

	public static final Object[] pattern_FieldName_29_3_solveCSP_bindingFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, model, typeGraph, modelToTypeGraph,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, typeGraph, modelToTypeGraph, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_29_3_solveCSP_bindingAndBlackFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldName_29_3_solveCSP_binding = pattern_FieldName_29_3_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, model, typeGraph, modelToTypeGraph, ruleResult);
		if (result_pattern_FieldName_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldName_29_3_solveCSP_black = pattern_FieldName_29_3_solveCSP_blackB(csp);
			if (result_pattern_FieldName_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, typeGraph, modelToTypeGraph, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_29_4_checkCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_29_5_checknacs_blackBBB(MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph) {
		return new Object[] { model, typeGraph, modelToTypeGraph };
	}

	public static final Object[] pattern_FieldName_29_6_perform_blackBBBB(MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { model, typeGraph, modelToTypeGraph, ruleResult };
	}

	public static final Object[] pattern_FieldName_29_6_perform_greenFFBBFBB(MGravityModel model, TypeGraph typeGraph,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MFieldName mFieldName = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMFieldName();
		MFieldNameToTField eFieldDeclarationToTField = ModiscoFactory.eINSTANCE.createMFieldNameToTField();
		TField tField = BasicFactory.eINSTANCE.createTField();
		Object _localVariable_0 = csp.getValue("mFieldName", "mName");
		Object _localVariable_1 = csp.getValue("tField", "tName");
		Object _localVariable_2 = csp.getValue("tField", "ID");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		model.getMFieldNames().add(mFieldName);
		model.getMNames().add(mFieldName);
		ruleResult.getSourceObjects().add(mFieldName);
		eFieldDeclarationToTField.setSource(mFieldName);
		ruleResult.getCorrObjects().add(eFieldDeclarationToTField);
		eFieldDeclarationToTField.setTarget(tField);
		typeGraph.getFields().add(tField);
		ruleResult.getTargetObjects().add(tField);
		String mFieldName_mName_prime = (String) _localVariable_0;
		String tField_tName_prime = (String) _localVariable_1;
		int tField_ID_prime = (int) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		mFieldName.setMName(mFieldName_mName_prime);
		tField.setTName(tField_tName_prime);
		tField.setID(Integer.valueOf(tField_ID_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mFieldName, eFieldDeclarationToTField, model, typeGraph, tField, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldName_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldNameImpl
