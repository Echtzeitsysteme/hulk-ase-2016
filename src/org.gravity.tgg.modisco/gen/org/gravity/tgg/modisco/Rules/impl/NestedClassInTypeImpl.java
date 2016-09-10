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
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Type;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.NestedClassInType;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
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
 * An implementation of the model object '<em><b>Nested Class In Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NestedClassInTypeImpl extends AbstractRuleImpl implements NestedClassInType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedClassInTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getNestedClassInType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		// initial bindings
		Object[] result1_black = NestedClassInTypeImpl.pattern_NestedClassInType_0_1_initialbindings_blackBBBB(this,
				match, eNestedType, eOuterType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[eNestedType] = " + eNestedType + ", "
					+ "[eOuterType] = " + eOuterType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = NestedClassInTypeImpl
				.pattern_NestedClassInType_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, eNestedType, eOuterType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[eNestedType] = " + eNestedType + ", "
					+ "[eOuterType] = " + eOuterType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (NestedClassInTypeImpl.pattern_NestedClassInType_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = NestedClassInTypeImpl
					.pattern_NestedClassInType_0_4_collectelementstobetranslated_blackBBB(match, eNestedType,
							eOuterType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eNestedType] = " + eNestedType + ", "
						+ "[eOuterType] = " + eOuterType + ".");
			}
			NestedClassInTypeImpl.pattern_NestedClassInType_0_4_collectelementstobetranslated_greenBBBFF(match,
					eNestedType, eOuterType);
			// EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result4_green[3];
			// EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = NestedClassInTypeImpl
					.pattern_NestedClassInType_0_5_collectcontextelements_blackBBB(match, eNestedType, eOuterType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eNestedType] = " + eNestedType + ", "
						+ "[eOuterType] = " + eOuterType + ".");
			}
			NestedClassInTypeImpl.pattern_NestedClassInType_0_5_collectcontextelements_greenBB(match, eOuterType);

			// register objects to match
			NestedClassInTypeImpl.pattern_NestedClassInType_0_6_registerobjectstomatch_expressionBBBB(this, match,
					eNestedType, eOuterType);
			return NestedClassInTypeImpl.pattern_NestedClassInType_0_7_expressionF();
		} else {
			return NestedClassInTypeImpl.pattern_NestedClassInType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = NestedClassInTypeImpl
				.pattern_NestedClassInType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration eNestedType = (ClassDeclaration) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TAbstractType tOuterType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = NestedClassInTypeImpl
				.pattern_NestedClassInType_1_1_performtransformation_greenBFFBFFBB(eNestedType, typeGraph,
						tOuterPackage, csp);
		TPackage tNestedPackage = (TPackage) result1_green[1];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[2];
		TClass tNestedType = (TClass) result1_green[4];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[5];

		// collect translated elements
		Object[] result2_black = NestedClassInTypeImpl
				.pattern_NestedClassInType_1_2_collecttranslatedelements_blackBBBBB(eNestedType, tNestedPackage,
						eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eNestedType] = " + eNestedType + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
					+ "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", " + "[tNestedType] = "
					+ tNestedType + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		Object[] result2_green = NestedClassInTypeImpl
				.pattern_NestedClassInType_1_2_collecttranslatedelements_greenFBBBBB(eNestedType, tNestedPackage,
						eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = NestedClassInTypeImpl
				.pattern_NestedClassInType_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, eNestedType,
						tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eNestedType] = " + eNestedType + ", "
					+ "[tNestedPackage] = " + tNestedPackage + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = "
					+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
					+ eOuterTypeToTOuterInterface + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		NestedClassInTypeImpl.pattern_NestedClassInType_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFFFF(
				ruleresult, eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType,
				mBodyToTAnnotation, eOuterType, tOuterPackage);
		// EMoflonEdge tNestedPackage__tNestedType____classes = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mBodyToTAnnotation__eNestedType____source = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[14];
		// EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mBodyToTAnnotation__tNestedType____target = (EMoflonEdge) result3_green[18];
		// EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[20];
		// EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[21];
		// EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[22];
		// EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[23];

		// perform postprocessing story node is empty
		// register objects
		NestedClassInTypeImpl.pattern_NestedClassInType_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		return NestedClassInTypeImpl.pattern_NestedClassInType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = NestedClassInTypeImpl
				.pattern_NestedClassInType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NestedClassInTypeImpl
				.pattern_NestedClassInType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = NestedClassInTypeImpl.pattern_NestedClassInType_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration eNestedType = (ClassDeclaration) result2_binding[0];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : NestedClassInTypeImpl
				.pattern_NestedClassInType_2_2_corematch_blackBFFBB(eNestedType, eOuterType, match)) {
			TAbstractType tOuterType = (TAbstractType) result2_black[1];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : NestedClassInTypeImpl.pattern_NestedClassInType_2_3_findcontext_blackBFBBBF(
					eNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[1];
				TPackage tOuterPackage = (TPackage) result3_black[5];
				Object[] result3_green = NestedClassInTypeImpl
						.pattern_NestedClassInType_2_3_findcontext_greenBBBBBBFFFFFFFFFF(eNestedType, typeGraph,
								tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[14];
				// EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = NestedClassInTypeImpl
						.pattern_NestedClassInType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
								tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eNestedType] = " + eNestedType + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
							+ eOuterTypeToTOuterInterface + ", " + "[eOuterType] = " + eOuterType + ", "
							+ "[tOuterPackage] = " + tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (NestedClassInTypeImpl.pattern_NestedClassInType_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = NestedClassInTypeImpl
							.pattern_NestedClassInType_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					NestedClassInTypeImpl.pattern_NestedClassInType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return NestedClassInTypeImpl.pattern_NestedClassInType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		match.registerObject("eNestedType", eNestedType);
		match.registerObject("eOuterType", eOuterType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDeclaration eNestedType,
			TypeGraph typeGraph, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", true, csp);
		var_eNestedType_proxy.setValue(eNestedType.isProxy());
		var_eNestedType_proxy.setType("Boolean");

		// Create unbound variables
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");
		Variable var_tNestedType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.ID", csp);
		var_tNestedType_ID.setType("int");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", csp);
		var_tNestedPackage_tName.setType("String");
		Variable var_tNestedPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.ID", csp);
		var_tNestedPackage_ID.setType("int");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();
		CreateID createID = new CreateID();
		AddSuffix addSuffix = new AddSuffix();
		CreateID createID_0 = new CreateID();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(createID);
		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		createID.setRuleName("");
		createID.solve(var_tNestedType_ID);
		addSuffix.setRuleName("");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
		createID_0.setRuleName("");
		createID_0.solve(var_tNestedPackage_ID);
		eq_0.setRuleName("");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eNestedType", eNestedType);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eNestedType, EObject tNestedPackage,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("tNestedPackage", tNestedPackage);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("eOuterType", eOuterType);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eNestedType").eClass())
				.equals("java.ClassDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		// initial bindings
		Object[] result1_black = NestedClassInTypeImpl.pattern_NestedClassInType_10_1_initialbindings_blackBBBBBBB(this,
				match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tNestedPackage] = " + tNestedPackage
					+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
					+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = NestedClassInTypeImpl
				.pattern_NestedClassInType_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, tNestedPackage, typeGraph,
						tNestedType, tOuterType, tOuterPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = "
					+ tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (NestedClassInTypeImpl.pattern_NestedClassInType_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = NestedClassInTypeImpl
					.pattern_NestedClassInType_10_4_collectelementstobetranslated_blackBBBBBB(match, tNestedPackage,
							typeGraph, tNestedType, tOuterType, tOuterPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
			}
			NestedClassInTypeImpl.pattern_NestedClassInType_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFFF(
					match, tNestedPackage, typeGraph, tNestedType, tOuterPackage);
			// EMoflonEdge tNestedPackage__tNestedType____classes = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result4_green[6];
			// EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result4_green[7];
			// EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result4_green[8];
			// EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result4_green[9];
			// EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result4_green[10];
			// EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result4_green[11];
			// EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result4_green[12];
			// EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = NestedClassInTypeImpl
					.pattern_NestedClassInType_10_5_collectcontextelements_blackBBBBBB(match, tNestedPackage, typeGraph,
							tNestedType, tOuterType, tOuterPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
			}
			NestedClassInTypeImpl.pattern_NestedClassInType_10_5_collectcontextelements_greenBBBBFFFFF(match, typeGraph,
					tOuterType, tOuterPackage);
			// EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result5_green[4];
			// EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result5_green[5];
			// EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result5_green[6];
			// EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result5_green[7];
			// EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result5_green[8];

			// register objects to match
			NestedClassInTypeImpl.pattern_NestedClassInType_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
			return NestedClassInTypeImpl.pattern_NestedClassInType_10_7_expressionF();
		} else {
			return NestedClassInTypeImpl.pattern_NestedClassInType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = NestedClassInTypeImpl
				.pattern_NestedClassInType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tNestedPackage = (TPackage) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TClass tNestedType = (TClass) result1_bindingAndBlack[2];
		TAbstractType tOuterType = (TAbstractType) result1_bindingAndBlack[3];
		TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result1_bindingAndBlack[4];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = NestedClassInTypeImpl
				.pattern_NestedClassInType_11_1_performtransformation_greenFFBFBB(tNestedType, eOuterType, csp);
		ClassDeclaration eNestedType = (ClassDeclaration) result1_green[0];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[1];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[3];

		// collect translated elements
		Object[] result2_black = NestedClassInTypeImpl
				.pattern_NestedClassInType_11_2_collecttranslatedelements_blackBBBBB(eNestedType, tNestedPackage,
						eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eNestedType] = " + eNestedType + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
					+ "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", " + "[tNestedType] = "
					+ tNestedType + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		Object[] result2_green = NestedClassInTypeImpl
				.pattern_NestedClassInType_11_2_collecttranslatedelements_greenFBBBBB(eNestedType, tNestedPackage,
						eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = NestedClassInTypeImpl
				.pattern_NestedClassInType_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, eNestedType,
						tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eNestedType] = " + eNestedType + ", "
					+ "[tNestedPackage] = " + tNestedPackage + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = "
					+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
					+ eOuterTypeToTOuterInterface + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		NestedClassInTypeImpl.pattern_NestedClassInType_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFFFF(
				ruleresult, eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType,
				mBodyToTAnnotation, eOuterType, tOuterPackage);
		// EMoflonEdge tNestedPackage__tNestedType____classes = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mBodyToTAnnotation__eNestedType____source = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[14];
		// EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mBodyToTAnnotation__tNestedType____target = (EMoflonEdge) result3_green[18];
		// EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[20];
		// EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[21];
		// EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[22];
		// EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[23];

		// perform postprocessing story node is empty
		// register objects
		NestedClassInTypeImpl.pattern_NestedClassInType_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		return NestedClassInTypeImpl.pattern_NestedClassInType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = NestedClassInTypeImpl
				.pattern_NestedClassInType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NestedClassInTypeImpl
				.pattern_NestedClassInType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = NestedClassInTypeImpl.pattern_NestedClassInType_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tNestedPackage = (TPackage) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		TClass tNestedType = (TClass) result2_binding[2];
		TAbstractType tOuterType = (TAbstractType) result2_binding[3];
		TPackage tOuterPackage = (TPackage) result2_binding[4];
		for (Object[] result2_black : NestedClassInTypeImpl.pattern_NestedClassInType_12_2_corematch_blackBBBBFFBB(
				tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage, match)) {
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : NestedClassInTypeImpl.pattern_NestedClassInType_12_3_findcontext_blackBBBBBBB(
					tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
					tOuterPackage)) {
				Object[] result3_green = NestedClassInTypeImpl
						.pattern_NestedClassInType_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFFF(tNestedPackage,
								typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
								tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge tNestedPackage__tNestedType____classes = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result3_green[15];
				// EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result3_green[18];
				// EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[19];
				// EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[20];
				// EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[21];
				// EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[22];
				// EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = NestedClassInTypeImpl
						.pattern_NestedClassInType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
								eOuterType, tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
							+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
							+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (NestedClassInTypeImpl.pattern_NestedClassInType_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = NestedClassInTypeImpl
							.pattern_NestedClassInType_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					NestedClassInTypeImpl.pattern_NestedClassInType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return NestedClassInTypeImpl.pattern_NestedClassInType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		match.registerObject("tNestedPackage", tNestedPackage);
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tNestedType", tNestedType);
		match.registerObject("tOuterType", tOuterType);
		match.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tNestedType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.ID", true, csp);
		var_tNestedType_ID.setValue(tNestedType.getID());
		var_tNestedType_ID.setType("int");
		Variable var_tNestedPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.ID", true, csp);
		var_tNestedPackage_ID.setValue(tNestedPackage.getID());
		var_tNestedPackage_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tNestedType_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tNestedPackage_ID);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tNestedPackage,
			TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", true,
				csp);
		var_tNestedPackage_tName.setValue(tNestedPackage.getTName());
		var_tNestedPackage_tName.setType("String");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");

		// Create unbound variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", csp);
		var_eNestedType_proxy.setType("Boolean");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		addSuffix.setRuleName("");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
		eq.setRuleName("");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tNestedPackage", tNestedPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tNestedType", tNestedType);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eNestedType, EObject tNestedPackage,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("tNestedPackage", tNestedPackage);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("eOuterType", eOuterType);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedPackage").eClass())
						.equals("basic.TPackage.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedType").eClass())
						.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_5(EMoflonEdge _edge_abstractTypeDeclaration) {
		// prepare return value
		Object[] result1_bindingAndBlack = NestedClassInTypeImpl
				.pattern_NestedClassInType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = NestedClassInTypeImpl.pattern_NestedClassInType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : NestedClassInTypeImpl
				.pattern_NestedClassInType_20_2_testcorematchandDECs_blackFFB(_edge_abstractTypeDeclaration)) {
			ClassDeclaration eNestedType = (ClassDeclaration) result2_black[0];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = NestedClassInTypeImpl
					.pattern_NestedClassInType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (NestedClassInTypeImpl
					.pattern_NestedClassInType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, eNestedType, eOuterType)) {
				// Ensure that the correct types of elements are matched
				if (NestedClassInTypeImpl
						.pattern_NestedClassInType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = NestedClassInTypeImpl
							.pattern_NestedClassInType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					NestedClassInTypeImpl.pattern_NestedClassInType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return NestedClassInTypeImpl.pattern_NestedClassInType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(EMoflonEdge _edge_classes) {
		// prepare return value
		Object[] result1_bindingAndBlack = NestedClassInTypeImpl
				.pattern_NestedClassInType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = NestedClassInTypeImpl.pattern_NestedClassInType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : NestedClassInTypeImpl
				.pattern_NestedClassInType_21_2_testcorematchandDECs_blackFFFFFB(_edge_classes)) {
			TPackage tNestedPackage = (TPackage) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TClass tNestedType = (TClass) result2_black[2];
			TAbstractType tOuterType = (TAbstractType) result2_black[3];
			TPackage tOuterPackage = (TPackage) result2_black[4];
			Object[] result2_green = NestedClassInTypeImpl
					.pattern_NestedClassInType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (NestedClassInTypeImpl
					.pattern_NestedClassInType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage)) {
				// Ensure that the correct types of elements are matched
				if (NestedClassInTypeImpl
						.pattern_NestedClassInType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = NestedClassInTypeImpl
							.pattern_NestedClassInType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					NestedClassInTypeImpl.pattern_NestedClassInType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return NestedClassInTypeImpl.pattern_NestedClassInType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("NestedClassInType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_name.setValue(__helper.getValue("eNestedType", "name"));
		var_eNestedType_name.setType("String");

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Variable var_tNestedType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_ID.setValue(__helper.getValue("tNestedType", "ID"));
		var_tNestedType_ID.setType("int");

		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType", true, csp);
		var_eOuterType_name.setValue(__helper.getValue("eOuterType", "name"));
		var_eOuterType_name.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage", true, csp);
		var_tNestedPackage_tName.setValue(__helper.getValue("tNestedPackage", "tName"));
		var_tNestedPackage_tName.setType("String");

		Variable var_tNestedPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage", true, csp);
		var_tNestedPackage_ID.setValue(__helper.getValue("tNestedPackage", "ID"));
		var_tNestedPackage_ID.setType("int");

		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_proxy.setValue(__helper.getValue("eNestedType", "proxy"));
		var_eNestedType_proxy.setType("boolean");

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		AddSuffix addSuffix2 = new AddSuffix();
		csp.getConstraints().add(addSuffix2);

		CreateID createID3 = new CreateID();
		csp.getConstraints().add(createID3);

		Eq eq4 = new Eq();
		csp.getConstraints().add(eq4);

		eq0.setRuleName("NestedClassInType");
		eq0.solve(var_eNestedType_name, var_tNestedType_tName);

		createID1.setRuleName("NestedClassInType");
		createID1.solve(var_tNestedType_ID);

		addSuffix2.setRuleName("NestedClassInType");
		addSuffix2.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);

		createID3.setRuleName("NestedClassInType");
		createID3.solve(var_tNestedPackage_ID);

		eq4.setRuleName("NestedClassInType");
		eq4.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tNestedType_tName.setBound(false);
			var_tNestedType_ID.setBound(false);
			var_tNestedPackage_tName.setBound(false);
			var_tNestedPackage_ID.setBound(false);
			var_tNestedType_tLib.setBound(false);
			eq0.solve(var_eNestedType_name, var_tNestedType_tName);
			createID1.solve(var_tNestedType_ID);
			addSuffix2.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);
			createID3.solve(var_tNestedPackage_ID);
			eq4.solve(var_eNestedType_proxy, var_tNestedType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tNestedType", "tName", var_tNestedType_tName.getValue());
				__helper.setValue("tNestedType", "ID", var_tNestedType_ID.getValue());
				__helper.setValue("tNestedPackage", "tName", var_tNestedPackage_tName.getValue());
				__helper.setValue("tNestedPackage", "ID", var_tNestedPackage_ID.getValue());
				__helper.setValue("tNestedType", "tLib", var_tNestedType_tLib.getValue());
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
		ruleResult.setRule("NestedClassInType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_name.setValue(__helper.getValue("eNestedType", "name"));
		var_eNestedType_name.setType("String");

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Variable var_tNestedType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_ID.setValue(__helper.getValue("tNestedType", "ID"));
		var_tNestedType_ID.setType("int");

		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType", true, csp);
		var_eOuterType_name.setValue(__helper.getValue("eOuterType", "name"));
		var_eOuterType_name.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage", true, csp);
		var_tNestedPackage_tName.setValue(__helper.getValue("tNestedPackage", "tName"));
		var_tNestedPackage_tName.setType("String");

		Variable var_tNestedPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage", true, csp);
		var_tNestedPackage_ID.setValue(__helper.getValue("tNestedPackage", "ID"));
		var_tNestedPackage_ID.setType("int");

		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_proxy.setValue(__helper.getValue("eNestedType", "proxy"));
		var_eNestedType_proxy.setType("boolean");

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		AddSuffix addSuffix1 = new AddSuffix();
		csp.getConstraints().add(addSuffix1);

		CreateID createID2 = new CreateID();
		csp.getConstraints().add(createID2);

		Eq eq3 = new Eq();
		csp.getConstraints().add(eq3);

		Eq eq4 = new Eq();
		csp.getConstraints().add(eq4);

		createID0.setRuleName("NestedClassInType");
		createID0.solve(var_tNestedType_ID);

		addSuffix1.setRuleName("NestedClassInType");
		addSuffix1.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);

		createID2.setRuleName("NestedClassInType");
		createID2.solve(var_tNestedPackage_ID);

		eq3.setRuleName("NestedClassInType");
		eq3.solve(var_eNestedType_name, var_tNestedType_tName);

		eq4.setRuleName("NestedClassInType");
		eq4.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_eNestedType_name.setBound(false);
			var_eNestedType_proxy.setBound(false);
			createID0.solve(var_tNestedType_ID);
			addSuffix1.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);
			createID2.solve(var_tNestedPackage_ID);
			eq3.solve(var_eNestedType_name, var_tNestedType_tName);
			eq4.solve(var_eNestedType_proxy, var_tNestedType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("eNestedType", "name", var_eNestedType_name.getValue());
				__helper.setValue("eNestedType", "proxy", var_eNestedType_proxy.getValue());
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
		Object[] result1_black = NestedClassInTypeImpl.pattern_NestedClassInType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = NestedClassInTypeImpl.pattern_NestedClassInType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = NestedClassInTypeImpl
				.pattern_NestedClassInType_24_2_matchcontext_bindingFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassDeclaration eNestedType = (ClassDeclaration) result2_binding[0];
		TPackage tNestedPackage = (TPackage) result2_binding[1];
		TypeGraph typeGraph = (TypeGraph) result2_binding[2];
		TClass tNestedType = (TClass) result2_binding[3];
		TAbstractType tOuterType = (TAbstractType) result2_binding[4];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_binding[5];
		TPackage tOuterPackage = (TPackage) result2_binding[6];
		for (Object[] result2_black : NestedClassInTypeImpl.pattern_NestedClassInType_24_2_matchcontext_blackBBBBBFBBBB(
				eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch,
				targetMatch)) {
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[5];
			Object[] result2_green = NestedClassInTypeImpl.pattern_NestedClassInType_24_2_matchcontext_greenBBBBBBBBBFB(
					eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
					eOuterType, tOuterPackage, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[9];

			// check csp
			Object[] result3_bindingAndBlack = NestedClassInTypeImpl
					.pattern_NestedClassInType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
							eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = NestedClassInTypeImpl
						.pattern_NestedClassInType_24_4_createcorrespondence_blackBBBBBBBB(eNestedType, tNestedPackage,
								typeGraph, tNestedType, tOuterType, eOuterType, tOuterPackage, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[eNestedType] = " + eNestedType + ", " + "[tNestedPackage] = "
							+ tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = "
							+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterType] = "
							+ eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", " + "[isApplicableMatch] = "
							+ isApplicableMatch + ".");
				}
				NestedClassInTypeImpl.pattern_NestedClassInType_24_4_createcorrespondence_greenBFBFB(eNestedType,
						tNestedType, isApplicableMatch);
				// TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result4_green[1];
				// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result4_green[3];

				// add to returned result
				Object[] result5_black = NestedClassInTypeImpl
						.pattern_NestedClassInType_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				NestedClassInTypeImpl.pattern_NestedClassInType_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return NestedClassInTypeImpl.pattern_NestedClassInType_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, ClassDeclaration eNestedType,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");
		Variable var_tNestedType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.ID", true, csp);
		var_tNestedType_ID.setValue(tNestedType.getID());
		var_tNestedType_ID.setType("int");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", true,
				csp);
		var_tNestedPackage_tName.setValue(tNestedPackage.getTName());
		var_tNestedPackage_tName.setType("String");
		Variable var_tNestedPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.ID", true, csp);
		var_tNestedPackage_ID.setValue(tNestedPackage.getID());
		var_tNestedPackage_ID.setType("int");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", true, csp);
		var_eNestedType_proxy.setValue(eNestedType.isProxy());
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		CreateID createID = new CreateID();
		AddSuffix addSuffix = new AddSuffix();
		CreateID createID_0 = new CreateID();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(createID);
		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		createID.setRuleName("");
		createID.solve(var_tNestedType_ID);
		addSuffix.setRuleName("");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
		createID_0.setRuleName("");
		createID_0.solve(var_tNestedPackage_ID);
		eq_0.setRuleName("");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eNestedType", eNestedType);
		isApplicableMatch.registerObject("tNestedPackage", tNestedPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tNestedType", tNestedType);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
	public boolean checkDEC_FWD(ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {// match tgg pattern
		Object[] result1_black = NestedClassInTypeImpl
				.pattern_NestedClassInType_27_1_matchtggpattern_blackBB(eNestedType, eOuterType);
		if (result1_black != null) {
			return NestedClassInTypeImpl.pattern_NestedClassInType_27_2_expressionF();
		} else {
			return NestedClassInTypeImpl.pattern_NestedClassInType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {// match tgg pattern
		Object[] result1_black = NestedClassInTypeImpl.pattern_NestedClassInType_28_1_matchtggpattern_blackBBBBB(
				tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result1_black != null) {
			return NestedClassInTypeImpl.pattern_NestedClassInType_28_2_expressionF();
		} else {
			return NestedClassInTypeImpl.pattern_NestedClassInType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eOuterTypeToTOuterInterfaceParameter) {
		// create result
		Object[] result1_black = NestedClassInTypeImpl.pattern_NestedClassInType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = NestedClassInTypeImpl.pattern_NestedClassInType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : NestedClassInTypeImpl
				.pattern_NestedClassInType_29_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eOuterTypeToTOuterInterfaceList = (RuleEntryList) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TAbstractType tOuterType = (TAbstractType) result2_black[2];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[4];
			TPackage tOuterPackage = (TPackage) result2_black[5];

			// solve CSP
			Object[] result3_bindingAndBlack = NestedClassInTypeImpl
					.pattern_NestedClassInType_29_3_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
							typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeGraph] = "
						+ typeGraph + ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
						+ eOuterTypeToTOuterInterface + ", " + "[eOuterType] = " + eOuterType + ", "
						+ "[tOuterPackage] = " + tOuterPackage + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (NestedClassInTypeImpl.pattern_NestedClassInType_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = NestedClassInTypeImpl.pattern_NestedClassInType_29_5_checknacs_blackBBBBB(
						typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				if (result5_black != null) {

					// perform
					Object[] result6_black = NestedClassInTypeImpl.pattern_NestedClassInType_29_6_perform_blackBBBBBB(
							typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[typeGraph] = " + typeGraph + ", " + "[tOuterType] = " + tOuterType + ", "
								+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
								+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					NestedClassInTypeImpl.pattern_NestedClassInType_29_6_perform_greenFFFBFFBBBB(typeGraph, eOuterType,
							tOuterPackage, ruleResult, csp);
					// ClassDeclaration eNestedType = (ClassDeclaration) result6_green[0];
					// TPackage tNestedPackage = (TPackage) result6_green[1];
					// TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[2];
					// TClass tNestedType = (TClass) result6_green[4];
					// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return NestedClassInTypeImpl.pattern_NestedClassInType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");

		// Create unbound variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");
		Variable var_tNestedType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.ID", csp);
		var_tNestedType_ID.setType("int");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", csp);
		var_tNestedPackage_tName.setType("String");
		Variable var_tNestedPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.ID", csp);
		var_tNestedPackage_ID.setType("int");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", csp);
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");

		// Create constraints
		CreateID createID = new CreateID();
		AddSuffix addSuffix = new AddSuffix();
		CreateID createID_0 = new CreateID();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tNestedType_ID);
		addSuffix.setRuleName("");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
		createID_0.setRuleName("");
		createID_0.solve(var_tNestedPackage_ID);
		eq.setRuleName("");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.NESTED_CLASS_IN_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeGraph) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(TPackage) arguments.get(6));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.NESTED_CLASS_IN_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
					(TPackage) arguments.get(5));
		case RulesPackage.NESTED_CLASS_IN_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
					(TPackage) arguments.get(5));
			return null;
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
					(TPackage) arguments.get(5));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(TPackage) arguments.get(7));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.NESTED_CLASS_IN_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_CLASSDECLARATION_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3), (TClass) arguments.get(4),
					(TAbstractType) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(AbstractTypeDeclaration) arguments.get(7), (TPackage) arguments.get(8), (Match) arguments.get(9),
					(Match) arguments.get(10));
		case RulesPackage.NESTED_CLASS_IN_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.NESTED_CLASS_IN_TYPE___CHECK_DEC_FWD__CLASSDECLARATION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.NESTED_CLASS_IN_TYPE___CHECK_DEC_BWD__TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TPACKAGE:
			return checkDEC_BWD((TPackage) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TAbstractType) arguments.get(3), (TPackage) arguments.get(4));
		case RulesPackage.NESTED_CLASS_IN_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.NESTED_CLASS_IN_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4), (TPackage) arguments.get(5),
					(ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.NESTED_CLASS_IN_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_NestedClassInType_0_1_initialbindings_blackBBBB(NestedClassInType _this,
			Match match, ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { _this, match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_0_2_SolveCSP_bindingFBBBB(NestedClassInType _this,
			Match match, ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eNestedType, eOuterType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedClassInType_0_2_SolveCSP_bindingAndBlackFBBBB(NestedClassInType _this,
			Match match, ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		Object[] result_pattern_NestedClassInType_0_2_SolveCSP_binding = pattern_NestedClassInType_0_2_SolveCSP_bindingFBBBB(
				_this, match, eNestedType, eOuterType);
		if (result_pattern_NestedClassInType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedClassInType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_NestedClassInType_0_2_SolveCSP_black = pattern_NestedClassInType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_NestedClassInType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eNestedType, eOuterType };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedClassInType_0_3_CheckCSP_expressionFBB(NestedClassInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_0_4_collectelementstobetranslated_blackBBB(Match match,
			ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eNestedType);
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		match.getToBeTranslatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		match.getToBeTranslatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		return new Object[] { match, eNestedType, eOuterType, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations };
	}

	public static final Object[] pattern_NestedClassInType_0_5_collectcontextelements_blackBBB(Match match,
			ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_0_5_collectcontextelements_greenBB(Match match,
			AbstractTypeDeclaration eOuterType) {
		match.getContextNodes().add(eOuterType);
		return new Object[] { match, eOuterType };
	}

	public static final void pattern_NestedClassInType_0_6_registerobjectstomatch_expressionBBBB(
			NestedClassInType _this, Match match, ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		_this.registerObjectsToMatch_FWD(match, eNestedType, eOuterType);

	}

	public static final boolean pattern_NestedClassInType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedClassInType_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eNestedType");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tOuterType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eOuterTypeToTOuterInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTOuterType = _localVariable_2;
		EObject tmpEOuterTypeToTOuterInterface = _localVariable_3;
		EObject tmpEOuterType = _localVariable_4;
		EObject tmpTOuterPackage = _localVariable_5;
		if (tmpENestedType instanceof ClassDeclaration) {
			ClassDeclaration eNestedType = (ClassDeclaration) tmpENestedType;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTOuterType instanceof TAbstractType) {
					TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
					if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
						TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
						if (tmpEOuterType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
							if (tmpTOuterPackage instanceof TPackage) {
								TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
								return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
										eOuterType, tOuterPackage, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_1_1_performtransformation_blackBBBBBBFBB(
			ClassDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			NestedClassInType _this, IsApplicableMatch isApplicableMatch) {
		if (!eNestedType.equals(eOuterType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
							tOuterPackage, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			NestedClassInType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NestedClassInType_1_1_performtransformation_binding = pattern_NestedClassInType_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_NestedClassInType_1_1_performtransformation_binding != null) {
			ClassDeclaration eNestedType = (ClassDeclaration) result_pattern_NestedClassInType_1_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_NestedClassInType_1_1_performtransformation_binding[1];
			TAbstractType tOuterType = (TAbstractType) result_pattern_NestedClassInType_1_1_performtransformation_binding[2];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_NestedClassInType_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_NestedClassInType_1_1_performtransformation_binding[4];
			TPackage tOuterPackage = (TPackage) result_pattern_NestedClassInType_1_1_performtransformation_binding[5];

			Object[] result_pattern_NestedClassInType_1_1_performtransformation_black = pattern_NestedClassInType_1_1_performtransformation_blackBBBBBBFBB(
					eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, _this,
					isApplicableMatch);
			if (result_pattern_NestedClassInType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_NestedClassInType_1_1_performtransformation_black[6];

				return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
						tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_1_1_performtransformation_greenBFFBFFBB(
			ClassDeclaration eNestedType, TypeGraph typeGraph, TPackage tOuterPackage, CSP csp) {
		TPackage tNestedPackage = BasicFactory.eINSTANCE.createTPackage();
		TypeToTAbstractType eNestedTypeToTNestedType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tNestedType = BasicFactory.eINSTANCE.createTClass();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tNestedPackage", "tName");
		Object _localVariable_1 = csp.getValue("tNestedPackage", "ID");
		Object _localVariable_2 = csp.getValue("tNestedType", "tName");
		Object _localVariable_3 = csp.getValue("tNestedType", "ID");
		Object _localVariable_4 = csp.getValue("tNestedType", "tLib");
		tOuterPackage.getSubpackage().add(tNestedPackage);
		tNestedPackage.setTypeGraph(typeGraph);
		eNestedTypeToTNestedType.setSource(eNestedType);
		tNestedPackage.getClasses().add(tNestedType);
		tNestedPackage.getOwnedTypes().add(tNestedType);
		typeGraph.getOwnedTypes().add(tNestedType);
		typeGraph.getClasses().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		String tNestedPackage_tName_prime = (String) _localVariable_0;
		int tNestedPackage_ID_prime = (int) _localVariable_1;
		String tNestedType_tName_prime = (String) _localVariable_2;
		int tNestedType_ID_prime = (int) _localVariable_3;
		boolean tNestedType_tLib_prime = (boolean) _localVariable_4;
		tNestedPackage.setTName(tNestedPackage_tName_prime);
		tNestedPackage.setID(Integer.valueOf(tNestedPackage_ID_prime));
		tNestedType.setTName(tNestedType_tName_prime);
		tNestedType.setID(Integer.valueOf(tNestedType_ID_prime));
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		return new Object[] { eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType,
				mBodyToTAnnotation, tOuterPackage, csp };
	}

	public static final Object[] pattern_NestedClassInType_1_2_collecttranslatedelements_blackBBBBB(
			ClassDeclaration eNestedType, TPackage tNestedPackage, TypeToTAbstractType eNestedTypeToTNestedType,
			TClass tNestedType, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { eNestedType, tNestedPackage, eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation };
	}

	public static final Object[] pattern_NestedClassInType_1_2_collecttranslatedelements_greenFBBBBB(
			ClassDeclaration eNestedType, TPackage tNestedPackage, TypeToTAbstractType eNestedTypeToTNestedType,
			TClass tNestedType, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eNestedType);
		ruleresult.getCreatedElements().add(tNestedPackage);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getCreatedElements().add(tNestedType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, eNestedType, tNestedPackage, eNestedTypeToTNestedType, tNestedType,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_NestedClassInType_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eNestedType, EObject tNestedPackage, EObject eNestedTypeToTNestedType,
			EObject typeGraph, EObject tNestedType, EObject tOuterType, EObject eOuterTypeToTOuterInterface,
			EObject mBodyToTAnnotation, EObject eOuterType, EObject tOuterPackage) {
		if (!eNestedType.equals(tNestedPackage)) {
			if (!eNestedType.equals(eNestedTypeToTNestedType)) {
				if (!eNestedType.equals(typeGraph)) {
					if (!eNestedType.equals(tNestedType)) {
						if (!eNestedType.equals(tOuterType)) {
							if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
								if (!eNestedType.equals(mBodyToTAnnotation)) {
									if (!eNestedType.equals(eOuterType)) {
										if (!eNestedType.equals(tOuterPackage)) {
											if (!tNestedPackage.equals(typeGraph)) {
												if (!tNestedPackage.equals(tNestedType)) {
													if (!tNestedPackage.equals(tOuterType)) {
														if (!tNestedPackage.equals(tOuterPackage)) {
															if (!eNestedTypeToTNestedType.equals(tNestedPackage)) {
																if (!eNestedTypeToTNestedType.equals(typeGraph)) {
																	if (!eNestedTypeToTNestedType.equals(tNestedType)) {
																		if (!eNestedTypeToTNestedType
																				.equals(tOuterType)) {
																			if (!eNestedTypeToTNestedType.equals(
																					eOuterTypeToTOuterInterface)) {
																				if (!eNestedTypeToTNestedType
																						.equals(mBodyToTAnnotation)) {
																					if (!eNestedTypeToTNestedType
																							.equals(eOuterType)) {
																						if (!eNestedTypeToTNestedType
																								.equals(tOuterPackage)) {
																							if (!tNestedType.equals(
																									typeGraph)) {
																								if (!tNestedType.equals(
																										tOuterType)) {
																									if (!tNestedType
																											.equals(tOuterPackage)) {
																										if (!tOuterType
																												.equals(typeGraph)) {
																											if (!eOuterTypeToTOuterInterface
																													.equals(tNestedPackage)) {
																												if (!eOuterTypeToTOuterInterface
																														.equals(typeGraph)) {
																													if (!eOuterTypeToTOuterInterface
																															.equals(tNestedType)) {
																														if (!eOuterTypeToTOuterInterface
																																.equals(tOuterType)) {
																															if (!eOuterTypeToTOuterInterface
																																	.equals(mBodyToTAnnotation)) {
																																if (!eOuterTypeToTOuterInterface
																																		.equals(tOuterPackage)) {
																																	if (!mBodyToTAnnotation
																																			.equals(tNestedPackage)) {
																																		if (!mBodyToTAnnotation
																																				.equals(typeGraph)) {
																																			if (!mBodyToTAnnotation
																																					.equals(tNestedType)) {
																																				if (!mBodyToTAnnotation
																																						.equals(tOuterType)) {
																																					if (!mBodyToTAnnotation
																																							.equals(tOuterPackage)) {
																																						if (!eOuterType
																																								.equals(tNestedPackage)) {
																																							if (!eOuterType
																																									.equals(typeGraph)) {
																																								if (!eOuterType
																																										.equals(tNestedType)) {
																																									if (!eOuterType
																																											.equals(tOuterType)) {
																																										if (!eOuterType
																																												.equals(eOuterTypeToTOuterInterface)) {
																																											if (!eOuterType
																																													.equals(mBodyToTAnnotation)) {
																																												if (!eOuterType
																																														.equals(tOuterPackage)) {
																																													if (!tOuterPackage
																																															.equals(typeGraph)) {
																																														if (!tOuterPackage
																																																.equals(tOuterType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	eNestedType,
																																																	tNestedPackage,
																																																	eNestedTypeToTNestedType,
																																																	typeGraph,
																																																	tNestedType,
																																																	tOuterType,
																																																	eOuterTypeToTOuterInterface,
																																																	mBodyToTAnnotation,
																																																	eOuterType,
																																																	tOuterPackage };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_NestedClassInType_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eNestedType, EObject tNestedPackage, EObject eNestedTypeToTNestedType,
			EObject typeGraph, EObject tNestedType, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		EMoflonEdge tNestedPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NestedClassInType";
		String tNestedPackage__tNestedType____classes_name_prime = "classes";
		String mBodyToTAnnotation__eNestedType____source_name_prime = "source";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String mBodyToTAnnotation__tNestedType____target_name_prime = "target";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		tNestedPackage__tNestedType____classes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tNestedPackage__tNestedType____classes);
		mBodyToTAnnotation__eNestedType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eNestedType____source);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		ruleresult.getCreatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getCreatedEdges().add(tNestedPackage__tOuterPackage____parent);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		ruleresult.getCreatedEdges().add(tNestedType__tNestedPackage____package);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tNestedType__typeGraph____pg);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		mBodyToTAnnotation__tNestedType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tNestedType____target);
		eNestedTypeToTNestedType__eNestedType____source.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__eNestedType____source);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		ruleresult.getTranslatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		ruleresult.getTranslatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____classes);
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tNestedPackage__tNestedType____classes.setName(tNestedPackage__tNestedType____classes_name_prime);
		mBodyToTAnnotation__eNestedType____source.setName(mBodyToTAnnotation__eNestedType____source_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		mBodyToTAnnotation__tNestedType____target.setName(mBodyToTAnnotation__tNestedType____target_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType,
				mBodyToTAnnotation, eOuterType, tOuterPackage, tNestedPackage__tNestedType____classes,
				mBodyToTAnnotation__eNestedType____source, tOuterPackage__tNestedPackage____subpackage,
				tNestedPackage__tOuterPackage____parent, tNestedPackage__tNestedType____ownedTypes,
				tNestedType__tNestedPackage____package, typeGraph__tNestedType____ownedTypes,
				tNestedType__typeGraph____pg, tNestedPackage__typeGraph____typeGraph,
				mBodyToTAnnotation__tNestedType____target, eNestedTypeToTNestedType__eNestedType____source,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				typeGraph__tNestedType____classes, eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_NestedClassInType_1_5_registerobjects_expressionBBBBBBBBBBBB(
			NestedClassInType _this, PerformRuleResult ruleresult, EObject eNestedType, EObject tNestedPackage,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		_this.registerObjects_FWD(ruleresult, eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);

	}

	public static final PerformRuleResult pattern_NestedClassInType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_2_1_preparereturnvalue_bindingFB(NestedClassInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			NestedClassInType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_2_1_preparereturnvalue_bindingAndBlackFFB(
			NestedClassInType _this) {
		Object[] result_pattern_NestedClassInType_2_1_preparereturnvalue_binding = pattern_NestedClassInType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedClassInType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_NestedClassInType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedClassInType_2_1_preparereturnvalue_black = pattern_NestedClassInType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_NestedClassInType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NestedClassInType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "NestedClassInType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NestedClassInType_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eNestedType");
		EObject _localVariable_1 = match.getObject("eOuterType");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpEOuterType = _localVariable_1;
		if (tmpENestedType instanceof ClassDeclaration) {
			ClassDeclaration eNestedType = (ClassDeclaration) tmpENestedType;
			if (tmpEOuterType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
				return new Object[] { eNestedType, eOuterType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedClassInType_2_2_corematch_blackBFFBB(
			ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eNestedType.equals(eOuterType)) {
			for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterType, TypeToTAbstractType.class, "source")) {
				TAbstractType tOuterType = eOuterTypeToTOuterInterface.getTarget();
				if (tOuterType != null) {
					_result.add(
							new Object[] { eNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_NestedClassInType_2_3_findcontext_blackBFBBBF(
			ClassDeclaration eNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eNestedType.equals(eOuterType)) {
			if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
				if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
					if (tOuterType.equals(eOuterTypeToTOuterInterface.getTarget())) {
						TypeGraph typeGraph = tOuterType.getPg();
						if (typeGraph != null) {
							TPackage tOuterPackage = tOuterType.getPackage();
							if (tOuterPackage != null) {
								if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
									_result.add(new Object[] { eNestedType, typeGraph, tOuterType,
											eOuterTypeToTOuterInterface, eOuterType, tOuterPackage });
								}
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_2_3_findcontext_greenBBBBBBFFFFFFFFFF(
			ClassDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____pg);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		isApplicableMatch.getAllContextElements().add(eOuterType__eNestedType____bodyDeclarations);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____typeGraph);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage, isApplicableMatch, eOuterTypeToTOuterInterface__eOuterType____source,
				typeGraph__tOuterType____ownedTypes, tOuterType__typeGraph____pg,
				tOuterPackage__tOuterType____ownedTypes, tOuterType__tOuterPackage____package,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				tOuterPackage__typeGraph____typeGraph, eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_NestedClassInType_2_4_solveCSP_bindingFBBBBBBBB(NestedClassInType _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration eNestedType, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eNestedType, typeGraph, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eNestedType, typeGraph, tOuterType,
					eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedClassInType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			NestedClassInType _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eNestedType,
			TypeGraph typeGraph, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_NestedClassInType_2_4_solveCSP_binding = pattern_NestedClassInType_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage);
		if (result_pattern_NestedClassInType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedClassInType_2_4_solveCSP_binding[0];

			Object[] result_pattern_NestedClassInType_2_4_solveCSP_black = pattern_NestedClassInType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_NestedClassInType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eNestedType, typeGraph, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedClassInType_2_5_checkCSP_expressionFBB(NestedClassInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NestedClassInType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NestedClassInType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedClassInType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_10_1_initialbindings_blackBBBBBBB(NestedClassInType _this,
			Match match, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { _this, match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_10_2_SolveCSP_bindingFBBBBBBB(NestedClassInType _this,
			Match match, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tNestedPackage, typeGraph, tNestedType,
				tOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tNestedPackage, typeGraph, tNestedType, tOuterType,
					tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedClassInType_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			NestedClassInType _this, Match match, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_NestedClassInType_10_2_SolveCSP_binding = pattern_NestedClassInType_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result_pattern_NestedClassInType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedClassInType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_NestedClassInType_10_2_SolveCSP_black = pattern_NestedClassInType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_NestedClassInType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tNestedPackage, typeGraph, tNestedType, tOuterType,
						tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedClassInType_10_3_CheckCSP_expressionFBB(NestedClassInType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFFF(
			Match match, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TPackage tOuterPackage) {
		EMoflonEdge tNestedPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tNestedPackage);
		match.getToBeTranslatedNodes().add(tNestedType);
		String tNestedPackage__tNestedType____classes_name_prime = "classes";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		tNestedPackage__tNestedType____classes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____classes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tNestedPackage__tNestedType____classes);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		match.getToBeTranslatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		match.getToBeTranslatedEdges().add(tNestedPackage__tOuterPackage____parent);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		match.getToBeTranslatedEdges().add(tNestedType__tNestedPackage____package);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tNestedType__typeGraph____pg);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____classes);
		tNestedPackage__tNestedType____classes.setName(tNestedPackage__tNestedType____classes_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		return new Object[] { match, tNestedPackage, typeGraph, tNestedType, tOuterPackage,
				tNestedPackage__tNestedType____classes, tOuterPackage__tNestedPackage____subpackage,
				tNestedPackage__tOuterPackage____parent, tNestedPackage__tNestedType____ownedTypes,
				tNestedType__tNestedPackage____package, typeGraph__tNestedType____ownedTypes,
				tNestedType__typeGraph____pg, tNestedPackage__typeGraph____typeGraph,
				typeGraph__tNestedType____classes };
	}

	public static final Object[] pattern_NestedClassInType_10_5_collectcontextelements_blackBBBBBB(Match match,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_10_5_collectcontextelements_greenBBBBFFFFF(Match match,
			TypeGraph typeGraph, TAbstractType tOuterType, TPackage tOuterPackage) {
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterType);
		match.getContextNodes().add(tOuterPackage);
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		match.getContextEdges().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		match.getContextEdges().add(tOuterType__typeGraph____pg);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		match.getContextEdges().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		match.getContextEdges().add(tOuterType__tOuterPackage____package);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		match.getContextEdges().add(tOuterPackage__typeGraph____typeGraph);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		return new Object[] { match, typeGraph, tOuterType, tOuterPackage, typeGraph__tOuterType____ownedTypes,
				tOuterType__typeGraph____pg, tOuterPackage__tOuterType____ownedTypes,
				tOuterType__tOuterPackage____package, tOuterPackage__typeGraph____typeGraph };
	}

	public static final void pattern_NestedClassInType_10_6_registerobjectstomatch_expressionBBBBBBB(
			NestedClassInType _this, Match match, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		_this.registerObjectsToMatch_BWD(match, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);

	}

	public static final boolean pattern_NestedClassInType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedClassInType_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tNestedPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tNestedType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tOuterType");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterTypeToTOuterInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("eOuterType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpTNestedPackage = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		EObject tmpTOuterType = _localVariable_3;
		EObject tmpEOuterTypeToTOuterInterface = _localVariable_4;
		EObject tmpEOuterType = _localVariable_5;
		EObject tmpTOuterPackage = _localVariable_6;
		if (tmpTNestedPackage instanceof TPackage) {
			TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTNestedType instanceof TClass) {
					TClass tNestedType = (TClass) tmpTNestedType;
					if (tmpTOuterType instanceof TAbstractType) {
						TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
						if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
							TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
							if (tmpEOuterType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
								if (tmpTOuterPackage instanceof TPackage) {
									TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
									return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType,
											eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_11_1_performtransformation_blackBBBBBBBFBB(
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			NestedClassInType _this, IsApplicableMatch isApplicableMatch) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType,
								eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			NestedClassInType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NestedClassInType_11_1_performtransformation_binding = pattern_NestedClassInType_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_NestedClassInType_11_1_performtransformation_binding != null) {
			TPackage tNestedPackage = (TPackage) result_pattern_NestedClassInType_11_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_NestedClassInType_11_1_performtransformation_binding[1];
			TClass tNestedType = (TClass) result_pattern_NestedClassInType_11_1_performtransformation_binding[2];
			TAbstractType tOuterType = (TAbstractType) result_pattern_NestedClassInType_11_1_performtransformation_binding[3];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_NestedClassInType_11_1_performtransformation_binding[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_NestedClassInType_11_1_performtransformation_binding[5];
			TPackage tOuterPackage = (TPackage) result_pattern_NestedClassInType_11_1_performtransformation_binding[6];

			Object[] result_pattern_NestedClassInType_11_1_performtransformation_black = pattern_NestedClassInType_11_1_performtransformation_blackBBBBBBBFBB(
					tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
					tOuterPackage, _this, isApplicableMatch);
			if (result_pattern_NestedClassInType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_NestedClassInType_11_1_performtransformation_black[7];

				return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
						eOuterType, tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_11_1_performtransformation_greenFFBFBB(TClass tNestedType,
			AbstractTypeDeclaration eOuterType, CSP csp) {
		ClassDeclaration eNestedType = JavaFactory.eINSTANCE.createClassDeclaration();
		TypeToTAbstractType eNestedTypeToTNestedType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("eNestedType", "name");
		Object _localVariable_1 = csp.getValue("eNestedType", "proxy");
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		String eNestedType_name_prime = (String) _localVariable_0;
		boolean eNestedType_proxy_prime = (boolean) _localVariable_1;
		eNestedType.setName(eNestedType_name_prime);
		eNestedType.setProxy(Boolean.valueOf(eNestedType_proxy_prime));
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation, eOuterType, csp };
	}

	public static final Object[] pattern_NestedClassInType_11_2_collecttranslatedelements_blackBBBBB(
			ClassDeclaration eNestedType, TPackage tNestedPackage, TypeToTAbstractType eNestedTypeToTNestedType,
			TClass tNestedType, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { eNestedType, tNestedPackage, eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation };
	}

	public static final Object[] pattern_NestedClassInType_11_2_collecttranslatedelements_greenFBBBBB(
			ClassDeclaration eNestedType, TPackage tNestedPackage, TypeToTAbstractType eNestedTypeToTNestedType,
			TClass tNestedType, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eNestedType);
		ruleresult.getTranslatedElements().add(tNestedPackage);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getTranslatedElements().add(tNestedType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, eNestedType, tNestedPackage, eNestedTypeToTNestedType, tNestedType,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_NestedClassInType_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eNestedType, EObject tNestedPackage, EObject eNestedTypeToTNestedType,
			EObject typeGraph, EObject tNestedType, EObject tOuterType, EObject eOuterTypeToTOuterInterface,
			EObject mBodyToTAnnotation, EObject eOuterType, EObject tOuterPackage) {
		if (!eNestedType.equals(tNestedPackage)) {
			if (!eNestedType.equals(eNestedTypeToTNestedType)) {
				if (!eNestedType.equals(typeGraph)) {
					if (!eNestedType.equals(tNestedType)) {
						if (!eNestedType.equals(tOuterType)) {
							if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
								if (!eNestedType.equals(mBodyToTAnnotation)) {
									if (!eNestedType.equals(eOuterType)) {
										if (!eNestedType.equals(tOuterPackage)) {
											if (!tNestedPackage.equals(typeGraph)) {
												if (!tNestedPackage.equals(tNestedType)) {
													if (!tNestedPackage.equals(tOuterType)) {
														if (!tNestedPackage.equals(tOuterPackage)) {
															if (!eNestedTypeToTNestedType.equals(tNestedPackage)) {
																if (!eNestedTypeToTNestedType.equals(typeGraph)) {
																	if (!eNestedTypeToTNestedType.equals(tNestedType)) {
																		if (!eNestedTypeToTNestedType
																				.equals(tOuterType)) {
																			if (!eNestedTypeToTNestedType.equals(
																					eOuterTypeToTOuterInterface)) {
																				if (!eNestedTypeToTNestedType
																						.equals(mBodyToTAnnotation)) {
																					if (!eNestedTypeToTNestedType
																							.equals(eOuterType)) {
																						if (!eNestedTypeToTNestedType
																								.equals(tOuterPackage)) {
																							if (!tNestedType.equals(
																									typeGraph)) {
																								if (!tNestedType.equals(
																										tOuterType)) {
																									if (!tNestedType
																											.equals(tOuterPackage)) {
																										if (!tOuterType
																												.equals(typeGraph)) {
																											if (!eOuterTypeToTOuterInterface
																													.equals(tNestedPackage)) {
																												if (!eOuterTypeToTOuterInterface
																														.equals(typeGraph)) {
																													if (!eOuterTypeToTOuterInterface
																															.equals(tNestedType)) {
																														if (!eOuterTypeToTOuterInterface
																																.equals(tOuterType)) {
																															if (!eOuterTypeToTOuterInterface
																																	.equals(mBodyToTAnnotation)) {
																																if (!eOuterTypeToTOuterInterface
																																		.equals(tOuterPackage)) {
																																	if (!mBodyToTAnnotation
																																			.equals(tNestedPackage)) {
																																		if (!mBodyToTAnnotation
																																				.equals(typeGraph)) {
																																			if (!mBodyToTAnnotation
																																					.equals(tNestedType)) {
																																				if (!mBodyToTAnnotation
																																						.equals(tOuterType)) {
																																					if (!mBodyToTAnnotation
																																							.equals(tOuterPackage)) {
																																						if (!eOuterType
																																								.equals(tNestedPackage)) {
																																							if (!eOuterType
																																									.equals(typeGraph)) {
																																								if (!eOuterType
																																										.equals(tNestedType)) {
																																									if (!eOuterType
																																											.equals(tOuterType)) {
																																										if (!eOuterType
																																												.equals(eOuterTypeToTOuterInterface)) {
																																											if (!eOuterType
																																													.equals(mBodyToTAnnotation)) {
																																												if (!eOuterType
																																														.equals(tOuterPackage)) {
																																													if (!tOuterPackage
																																															.equals(typeGraph)) {
																																														if (!tOuterPackage
																																																.equals(tOuterType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	eNestedType,
																																																	tNestedPackage,
																																																	eNestedTypeToTNestedType,
																																																	typeGraph,
																																																	tNestedType,
																																																	tOuterType,
																																																	eOuterTypeToTOuterInterface,
																																																	mBodyToTAnnotation,
																																																	eOuterType,
																																																	tOuterPackage };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_NestedClassInType_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eNestedType, EObject tNestedPackage, EObject eNestedTypeToTNestedType,
			EObject typeGraph, EObject tNestedType, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		EMoflonEdge tNestedPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NestedClassInType";
		String tNestedPackage__tNestedType____classes_name_prime = "classes";
		String mBodyToTAnnotation__eNestedType____source_name_prime = "source";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String mBodyToTAnnotation__tNestedType____target_name_prime = "target";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		tNestedPackage__tNestedType____classes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tNestedPackage__tNestedType____classes);
		mBodyToTAnnotation__eNestedType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eNestedType____source);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getTranslatedEdges().add(tNestedPackage__tOuterPackage____parent);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		ruleresult.getTranslatedEdges().add(tNestedType__tNestedPackage____package);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tNestedType__typeGraph____pg);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		mBodyToTAnnotation__tNestedType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tNestedType____target);
		eNestedTypeToTNestedType__eNestedType____source.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__eNestedType____source);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		ruleresult.getCreatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____classes);
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tNestedPackage__tNestedType____classes.setName(tNestedPackage__tNestedType____classes_name_prime);
		mBodyToTAnnotation__eNestedType____source.setName(mBodyToTAnnotation__eNestedType____source_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		mBodyToTAnnotation__tNestedType____target.setName(mBodyToTAnnotation__tNestedType____target_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType,
				mBodyToTAnnotation, eOuterType, tOuterPackage, tNestedPackage__tNestedType____classes,
				mBodyToTAnnotation__eNestedType____source, tOuterPackage__tNestedPackage____subpackage,
				tNestedPackage__tOuterPackage____parent, tNestedPackage__tNestedType____ownedTypes,
				tNestedType__tNestedPackage____package, typeGraph__tNestedType____ownedTypes,
				tNestedType__typeGraph____pg, tNestedPackage__typeGraph____typeGraph,
				mBodyToTAnnotation__tNestedType____target, eNestedTypeToTNestedType__eNestedType____source,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				typeGraph__tNestedType____classes, eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_NestedClassInType_11_5_registerobjects_expressionBBBBBBBBBBBB(
			NestedClassInType _this, PerformRuleResult ruleresult, EObject eNestedType, EObject tNestedPackage,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		_this.registerObjects_BWD(ruleresult, eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);

	}

	public static final PerformRuleResult pattern_NestedClassInType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_12_1_preparereturnvalue_bindingFB(NestedClassInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			NestedClassInType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_12_1_preparereturnvalue_bindingAndBlackFFB(
			NestedClassInType _this) {
		Object[] result_pattern_NestedClassInType_12_1_preparereturnvalue_binding = pattern_NestedClassInType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedClassInType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_NestedClassInType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedClassInType_12_1_preparereturnvalue_black = pattern_NestedClassInType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_NestedClassInType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NestedClassInType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "NestedClassInType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NestedClassInType_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tNestedPackage");
		EObject _localVariable_1 = match.getObject("typeGraph");
		EObject _localVariable_2 = match.getObject("tNestedType");
		EObject _localVariable_3 = match.getObject("tOuterType");
		EObject _localVariable_4 = match.getObject("tOuterPackage");
		EObject tmpTNestedPackage = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		EObject tmpTOuterType = _localVariable_3;
		EObject tmpTOuterPackage = _localVariable_4;
		if (tmpTNestedPackage instanceof TPackage) {
			TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTNestedType instanceof TClass) {
					TClass tNestedType = (TClass) tmpTNestedType;
					if (tmpTOuterType instanceof TAbstractType) {
						TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
						if (tmpTOuterPackage instanceof TPackage) {
							TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
							return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage,
									match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedClassInType_12_2_corematch_blackBBBBFFBB(
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tOuterType, TypeToTAbstractType.class, "target")) {
					Type tmpEOuterType = eOuterTypeToTOuterInterface.getSource();
					if (tmpEOuterType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
						_result.add(new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType,
								eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_NestedClassInType_12_3_findcontext_blackBBBBBBB(
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				if (tNestedPackage.getClasses().contains(tNestedType)) {
					if (tOuterPackage.getSubpackage().contains(tNestedPackage)) {
						if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
							if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
								if (typeGraph.getOwnedTypes().contains(tOuterType)) {
									if (typeGraph.getOwnedTypes().contains(tNestedType)) {
										if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
											if (typeGraph.equals(tNestedPackage.getTypeGraph())) {
												if (typeGraph.getClasses().contains(tNestedType)) {
													if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
														if (tOuterType
																.equals(eOuterTypeToTOuterInterface.getTarget())) {
															_result.add(new Object[] { tNestedPackage, typeGraph,
																	tNestedType, tOuterType,
																	eOuterTypeToTOuterInterface, eOuterType,
																	tOuterPackage });
														}
													}
												}
											}
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

	public static final Object[] pattern_NestedClassInType_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFFF(
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tNestedPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tNestedPackage__tNestedType____classes_name_prime = "classes";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		tNestedPackage__tNestedType____classes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____classes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__tNestedType____classes);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__tOuterPackage____parent);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(tNestedType__tNestedPackage____package);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____pg);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType__typeGraph____pg);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__typeGraph____typeGraph);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____classes);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____typeGraph);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		tNestedPackage__tNestedType____classes.setName(tNestedPackage__tNestedType____classes_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
				eOuterType, tOuterPackage, isApplicableMatch, tNestedPackage__tNestedType____classes,
				tOuterPackage__tNestedPackage____subpackage, tNestedPackage__tOuterPackage____parent,
				tNestedPackage__tNestedType____ownedTypes, tNestedType__tNestedPackage____package,
				eOuterTypeToTOuterInterface__eOuterType____source, typeGraph__tOuterType____ownedTypes,
				tOuterType__typeGraph____pg, typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____pg,
				tOuterPackage__tOuterType____ownedTypes, tOuterType__tOuterPackage____package,
				tNestedPackage__typeGraph____typeGraph, typeGraph__tNestedType____classes,
				tOuterPackage__typeGraph____typeGraph, eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_NestedClassInType_12_4_solveCSP_bindingFBBBBBBBBB(NestedClassInType _this,
			IsApplicableMatch isApplicableMatch, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tNestedPackage, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tNestedPackage, typeGraph, tNestedType, tOuterType,
					eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedClassInType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			NestedClassInType _this, IsApplicableMatch isApplicableMatch, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_NestedClassInType_12_4_solveCSP_binding = pattern_NestedClassInType_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		if (result_pattern_NestedClassInType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedClassInType_12_4_solveCSP_binding[0];

			Object[] result_pattern_NestedClassInType_12_4_solveCSP_black = pattern_NestedClassInType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_NestedClassInType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tNestedPackage, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedClassInType_12_5_checkCSP_expressionFBB(NestedClassInType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NestedClassInType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NestedClassInType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedClassInType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_20_1_preparereturnvalue_bindingFB(NestedClassInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			NestedClassInType _this) {
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

	public static final Object[] pattern_NestedClassInType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			NestedClassInType _this) {
		Object[] result_pattern_NestedClassInType_20_1_preparereturnvalue_binding = pattern_NestedClassInType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedClassInType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_NestedClassInType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedClassInType_20_1_preparereturnvalue_black = pattern_NestedClassInType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_NestedClassInType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NestedClassInType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_NestedClassInType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_NestedClassInType_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_abstractTypeDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpENestedType = _edge_abstractTypeDeclaration.getSrc();
		if (tmpENestedType instanceof ClassDeclaration) {
			ClassDeclaration eNestedType = (ClassDeclaration) tmpENestedType;
			EObject tmpEOuterType = _edge_abstractTypeDeclaration.getTrg();
			if (tmpEOuterType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
				if (!eNestedType.equals(eOuterType)) {
					if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
						_result.add(new Object[] { eNestedType, eOuterType, _edge_abstractTypeDeclaration });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_NestedClassInType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NestedClassInType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			NestedClassInType _this, Match match, ClassDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eNestedType, eOuterType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NestedClassInType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			NestedClassInType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_NestedClassInType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_21_1_preparereturnvalue_bindingFB(NestedClassInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			NestedClassInType _this) {
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

	public static final Object[] pattern_NestedClassInType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			NestedClassInType _this) {
		Object[] result_pattern_NestedClassInType_21_1_preparereturnvalue_binding = pattern_NestedClassInType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedClassInType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_NestedClassInType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedClassInType_21_1_preparereturnvalue_black = pattern_NestedClassInType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_NestedClassInType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NestedClassInType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_NestedClassInType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_0BB(
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedPackage_parent_972813 = tNestedPackage.getParent();
			if (__DEC_tNestedPackage_parent_972813 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedPackage_parent_972813)) {
					if (!tOuterPackage.equals(__DEC_tNestedPackage_parent_972813)) {
						return new Object[] { tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_1BB(
			TPackage tNestedPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tNestedPackage_packages_603482 = tNestedPackage.getPg();
		if (__DEC_tNestedPackage_packages_603482 != null) {
			if (!typeGraph.equals(__DEC_tNestedPackage_packages_603482)) {
				return new Object[] { tNestedPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_2BBB(TClass tNestedType,
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tNestedType_classes_26831 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tNestedType, TPackage.class, "classes")) {
				if (!tNestedPackage.equals(__DEC_tNestedType_classes_26831)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_classes_26831)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_3BB(TClass tNestedType,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_classes_795950 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tNestedType_classes_795950)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_4BBB(TClass tNestedType,
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedType_ownedTypes_74968 = tNestedType.getPackage();
			if (__DEC_tNestedType_ownedTypes_74968 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedType_ownedTypes_74968)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_ownedTypes_74968)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_5BB(TypeGraph typeGraph,
			TPackage tNestedPackage) {
		if (typeGraph.getPackages().contains(tNestedPackage)) {
			return new Object[] { typeGraph, tNestedPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_6BB(
			TPackage tOuterPackage, TClass tNestedType) {
		if (tOuterPackage.getClasses().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_7BB(
			TPackage tOuterPackage, TClass tNestedType) {
		if (tOuterPackage.getOwnedTypes().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedClassInType_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTNestedPackage = _edge_classes.getSrc();
		if (tmpTNestedPackage instanceof TPackage) {
			TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
			EObject tmpTNestedType = _edge_classes.getTrg();
			if (tmpTNestedType instanceof TClass) {
				TClass tNestedType = (TClass) tmpTNestedType;
				if (tNestedPackage.getClasses().contains(tNestedType)) {
					if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
						TPackage tOuterPackage = tNestedPackage.getParent();
						if (tOuterPackage != null) {
							if (!tNestedPackage.equals(tOuterPackage)) {
								TypeGraph typeGraph = tNestedPackage.getTypeGraph();
								if (typeGraph != null) {
									if (typeGraph.getOwnedTypes().contains(tNestedType)) {
										if (typeGraph.getClasses().contains(tNestedType)) {
											if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
												if (pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_0BB(
														tNestedPackage, tOuterPackage) == null) {
													if (pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_2BBB(
															tNestedType, tNestedPackage, tOuterPackage) == null) {
														if (pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_4BBB(
																tNestedType, tNestedPackage, tOuterPackage) == null) {
															if (pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_6BB(
																	tOuterPackage, tNestedType) == null) {
																if (pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_7BB(
																		tOuterPackage, tNestedType) == null) {
																	if (pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_1BB(
																			tNestedPackage, typeGraph) == null) {
																		if (pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_3BB(
																				tNestedType, typeGraph) == null) {
																			if (pattern_NestedClassInType_21_2_testcorematchandDECs_black_nac_5BB(
																					typeGraph,
																					tNestedPackage) == null) {
																				for (TAbstractType tOuterType : tOuterPackage
																						.getOwnedTypes()) {
																					if (!tNestedType
																							.equals(tOuterType)) {
																						if (typeGraph.getOwnedTypes()
																								.contains(tOuterType)) {
																							_result.add(new Object[] {
																									tNestedPackage,
																									typeGraph,
																									tNestedType,
																									tOuterType,
																									tOuterPackage,
																									_edge_classes });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_NestedClassInType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NestedClassInType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			NestedClassInType _this, Match match, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tNestedPackage, typeGraph, tNestedType, tOuterType,
				tOuterPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NestedClassInType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			NestedClassInType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_NestedClassInType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_24_1_prepare_blackB(NestedClassInType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_NestedClassInType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_NestedClassInType_24_2_matchcontext_bindingFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eNestedType");
		EObject _localVariable_1 = targetMatch.getObject("tNestedPackage");
		EObject _localVariable_2 = targetMatch.getObject("typeGraph");
		EObject _localVariable_3 = targetMatch.getObject("tNestedType");
		EObject _localVariable_4 = targetMatch.getObject("tOuterType");
		EObject _localVariable_5 = sourceMatch.getObject("eOuterType");
		EObject _localVariable_6 = targetMatch.getObject("tOuterPackage");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpTNestedPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTNestedType = _localVariable_3;
		EObject tmpTOuterType = _localVariable_4;
		EObject tmpEOuterType = _localVariable_5;
		EObject tmpTOuterPackage = _localVariable_6;
		if (tmpENestedType instanceof ClassDeclaration) {
			ClassDeclaration eNestedType = (ClassDeclaration) tmpENestedType;
			if (tmpTNestedPackage instanceof TPackage) {
				TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpTNestedType instanceof TClass) {
						TClass tNestedType = (TClass) tmpTNestedType;
						if (tmpTOuterType instanceof TAbstractType) {
							TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
							if (tmpEOuterType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
								if (tmpTOuterPackage instanceof TPackage) {
									TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
									return new Object[] { eNestedType, tNestedPackage, typeGraph, tNestedType,
											tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedClassInType_24_2_matchcontext_blackBBBBBFBBBB(
			ClassDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedPackage.equals(tOuterPackage)) {
				if (!tNestedType.equals(tOuterType)) {
					if (!sourceMatch.equals(targetMatch)) {
						if (tNestedPackage.getClasses().contains(tNestedType)) {
							if (tOuterPackage.getSubpackage().contains(tNestedPackage)) {
								if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
									if (typeGraph.getOwnedTypes().contains(tOuterType)) {
										if (typeGraph.getOwnedTypes().contains(tNestedType)) {
											if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
												if (typeGraph.equals(tNestedPackage.getTypeGraph())) {
													if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
														if (typeGraph.getClasses().contains(tNestedType)) {
															if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
																for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(eOuterType,
																				TypeToTAbstractType.class, "source")) {
																	if (tOuterType.equals(
																			eOuterTypeToTOuterInterface.getTarget())) {
																		_result.add(new Object[] { eNestedType,
																				tNestedPackage, typeGraph, tNestedType,
																				tOuterType, eOuterTypeToTOuterInterface,
																				eOuterType, tOuterPackage, sourceMatch,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_24_2_matchcontext_greenBBBBBBBBBFB(
			ClassDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "NestedClassInType";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(eNestedType);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_NestedClassInType_24_3_checkcsp_bindingFBBBBBBBBBBBB(NestedClassInType _this,
			CCMatch isApplicableMatch, ClassDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, eNestedType, tNestedPackage, typeGraph,
				tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eNestedType, tNestedPackage, typeGraph, tNestedType,
					tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedClassInType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBB(
			NestedClassInType _this, CCMatch isApplicableMatch, ClassDeclaration eNestedType, TPackage tNestedPackage,
			TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_NestedClassInType_24_3_checkcsp_binding = pattern_NestedClassInType_24_3_checkcsp_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, sourceMatch, targetMatch);
		if (result_pattern_NestedClassInType_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_NestedClassInType_24_3_checkcsp_binding[0];

			Object[] result_pattern_NestedClassInType_24_3_checkcsp_black = pattern_NestedClassInType_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_NestedClassInType_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eNestedType, tNestedPackage, typeGraph,
						tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_24_4_createcorrespondence_blackBBBBBBBB(
			ClassDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			CCMatch isApplicableMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedPackage.equals(tOuterPackage)) {
				if (!tNestedType.equals(tOuterType)) {
					return new Object[] { eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType,
							tOuterPackage, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_24_4_createcorrespondence_greenBFBFB(
			ClassDeclaration eNestedType, TClass tNestedType, CCMatch isApplicableMatch) {
		TypeToTAbstractType eNestedTypeToTNestedType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		isApplicableMatch.getCreateCorr().add(eNestedTypeToTNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		isApplicableMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation,
				isApplicableMatch };
	}

	public static final Object[] pattern_NestedClassInType_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_NestedClassInType_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NestedClassInType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedClassInType_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_27_1_matchtggpattern_blackBB(ClassDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
				return new Object[] { eNestedType, eOuterType };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedClassInType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedClassInType_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_black_nac_0BB(TPackage tNestedPackage,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedPackage_parent_32373 = tNestedPackage.getParent();
			if (__DEC_tNestedPackage_parent_32373 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedPackage_parent_32373)) {
					if (!tOuterPackage.equals(__DEC_tNestedPackage_parent_32373)) {
						return new Object[] { tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_black_nac_1BB(TPackage tNestedPackage,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tNestedPackage_packages_400649 = tNestedPackage.getPg();
		if (__DEC_tNestedPackage_packages_400649 != null) {
			if (!typeGraph.equals(__DEC_tNestedPackage_packages_400649)) {
				return new Object[] { tNestedPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_black_nac_2BBB(TClass tNestedType,
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tNestedType_classes_848400 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tNestedType, TPackage.class, "classes")) {
				if (!tNestedPackage.equals(__DEC_tNestedType_classes_848400)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_classes_848400)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_black_nac_3BB(TClass tNestedType,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_classes_461961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tNestedType_classes_461961)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_black_nac_4BBB(TClass tNestedType,
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedType_ownedTypes_17479 = tNestedType.getPackage();
			if (__DEC_tNestedType_ownedTypes_17479 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedType_ownedTypes_17479)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_ownedTypes_17479)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_black_nac_5BB(TypeGraph typeGraph,
			TPackage tNestedPackage) {
		if (typeGraph.getPackages().contains(tNestedPackage)) {
			return new Object[] { typeGraph, tNestedPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_black_nac_6BB(TPackage tOuterPackage,
			TClass tNestedType) {
		if (tOuterPackage.getClasses().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_black_nac_7BB(TPackage tOuterPackage,
			TClass tNestedType) {
		if (tOuterPackage.getOwnedTypes().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_28_1_matchtggpattern_blackBBBBB(TPackage tNestedPackage,
			TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				if (tNestedPackage.getClasses().contains(tNestedType)) {
					if (tOuterPackage.getSubpackage().contains(tNestedPackage)) {
						if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
							if (typeGraph.getOwnedTypes().contains(tOuterType)) {
								if (typeGraph.getOwnedTypes().contains(tNestedType)) {
									if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
										if (typeGraph.equals(tNestedPackage.getTypeGraph())) {
											if (typeGraph.getClasses().contains(tNestedType)) {
												if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
													if (pattern_NestedClassInType_28_1_matchtggpattern_black_nac_0BB(
															tNestedPackage, tOuterPackage) == null) {
														if (pattern_NestedClassInType_28_1_matchtggpattern_black_nac_1BB(
																tNestedPackage, typeGraph) == null) {
															if (pattern_NestedClassInType_28_1_matchtggpattern_black_nac_2BBB(
																	tNestedType, tNestedPackage,
																	tOuterPackage) == null) {
																if (pattern_NestedClassInType_28_1_matchtggpattern_black_nac_3BB(
																		tNestedType, typeGraph) == null) {
																	if (pattern_NestedClassInType_28_1_matchtggpattern_black_nac_4BBB(
																			tNestedType, tNestedPackage,
																			tOuterPackage) == null) {
																		if (pattern_NestedClassInType_28_1_matchtggpattern_black_nac_5BB(
																				typeGraph, tNestedPackage) == null) {
																			if (pattern_NestedClassInType_28_1_matchtggpattern_black_nac_6BB(
																					tOuterPackage,
																					tNestedType) == null) {
																				if (pattern_NestedClassInType_28_1_matchtggpattern_black_nac_7BB(
																						tOuterPackage,
																						tNestedType) == null) {
																					return new Object[] {
																							tNestedPackage, typeGraph,
																							tNestedType, tOuterType,
																							tOuterPackage };
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_NestedClassInType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedClassInType_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_29_1_createresult_blackB(NestedClassInType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_NestedClassInType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_NestedClassInType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tOuterType) {
		if (ruleResult.getTargetObjects().contains(tOuterType)) {
			return new Object[] { ruleResult, tOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterTypeToTOuterInterface) {
		if (ruleResult.getCorrObjects().contains(eOuterTypeToTOuterInterface)) {
			return new Object[] { ruleResult, eOuterTypeToTOuterInterface };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration eOuterType) {
		if (ruleResult.getSourceObjects().contains(eOuterType)) {
			return new Object[] { ruleResult, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TPackage tOuterPackage) {
		if (ruleResult.getTargetObjects().contains(tOuterPackage)) {
			return new Object[] { ruleResult, tOuterPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedClassInType_29_2_isapplicablecore_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eOuterTypeToTOuterInterfaceList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEOuterTypeToTOuterInterface : eOuterTypeToTOuterInterfaceList.getEntryObjects()) {
				if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
					TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
					TAbstractType tOuterType = eOuterTypeToTOuterInterface.getTarget();
					if (tOuterType != null) {
						Type tmpEOuterType = eOuterTypeToTOuterInterface.getSource();
						if (tmpEOuterType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
							TypeGraph typeGraph = tOuterType.getPg();
							if (typeGraph != null) {
								TPackage tOuterPackage = tOuterType.getPackage();
								if (tOuterPackage != null) {
									if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
										if (pattern_NestedClassInType_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												eOuterTypeToTOuterInterface) == null) {
											if (pattern_NestedClassInType_29_2_isapplicablecore_black_nac_1BB(
													ruleResult, tOuterType) == null) {
												if (pattern_NestedClassInType_29_2_isapplicablecore_black_nac_3BB(
														ruleResult, eOuterType) == null) {
													if (pattern_NestedClassInType_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, typeGraph) == null) {
														if (pattern_NestedClassInType_29_2_isapplicablecore_black_nac_4BB(
																ruleResult, tOuterPackage) == null) {
															_result.add(new Object[] { eOuterTypeToTOuterInterfaceList,
																	typeGraph, tOuterType, eOuterTypeToTOuterInterface,
																	eOuterType, tOuterPackage, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_29_3_solveCSP_bindingFBBBBBBBB(NestedClassInType _this,
			IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, typeGraph, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
					eOuterType, tOuterPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_NestedClassInType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedClassInType_29_3_solveCSP_bindingAndBlackFBBBBBBBB(
			NestedClassInType _this, IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_NestedClassInType_29_3_solveCSP_binding = pattern_NestedClassInType_29_3_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
				ruleResult);
		if (result_pattern_NestedClassInType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedClassInType_29_3_solveCSP_binding[0];

			Object[] result_pattern_NestedClassInType_29_3_solveCSP_black = pattern_NestedClassInType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_NestedClassInType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
						eOuterType, tOuterPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedClassInType_29_4_checkCSP_expressionFBB(NestedClassInType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedClassInType_29_5_checknacs_blackBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		return new Object[] { typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
	}

	public static final Object[] pattern_NestedClassInType_29_6_perform_blackBBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
				ruleResult };
	}

	public static final Object[] pattern_NestedClassInType_29_6_perform_greenFFFBFFBBBB(TypeGraph typeGraph,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ClassDeclaration eNestedType = JavaFactory.eINSTANCE.createClassDeclaration();
		TPackage tNestedPackage = BasicFactory.eINSTANCE.createTPackage();
		TypeToTAbstractType eNestedTypeToTNestedType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tNestedType = BasicFactory.eINSTANCE.createTClass();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("eNestedType", "name");
		Object _localVariable_1 = csp.getValue("eNestedType", "proxy");
		Object _localVariable_2 = csp.getValue("tNestedPackage", "tName");
		Object _localVariable_3 = csp.getValue("tNestedPackage", "ID");
		Object _localVariable_4 = csp.getValue("tNestedType", "tName");
		Object _localVariable_5 = csp.getValue("tNestedType", "ID");
		Object _localVariable_6 = csp.getValue("tNestedType", "tLib");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_7 = ruleResult.getIncrementedPerformCount();
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		ruleResult.getSourceObjects().add(eNestedType);
		tOuterPackage.getSubpackage().add(tNestedPackage);
		tNestedPackage.setTypeGraph(typeGraph);
		ruleResult.getTargetObjects().add(tNestedPackage);
		eNestedTypeToTNestedType.setSource(eNestedType);
		ruleResult.getCorrObjects().add(eNestedTypeToTNestedType);
		tNestedPackage.getClasses().add(tNestedType);
		tNestedPackage.getOwnedTypes().add(tNestedType);
		typeGraph.getOwnedTypes().add(tNestedType);
		typeGraph.getClasses().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ruleResult.getTargetObjects().add(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		String eNestedType_name_prime = (String) _localVariable_0;
		boolean eNestedType_proxy_prime = (boolean) _localVariable_1;
		String tNestedPackage_tName_prime = (String) _localVariable_2;
		int tNestedPackage_ID_prime = (int) _localVariable_3;
		String tNestedType_tName_prime = (String) _localVariable_4;
		int tNestedType_ID_prime = (int) _localVariable_5;
		boolean tNestedType_tLib_prime = (boolean) _localVariable_6;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_7);
		eNestedType.setName(eNestedType_name_prime);
		eNestedType.setProxy(Boolean.valueOf(eNestedType_proxy_prime));
		tNestedPackage.setTName(tNestedPackage_tName_prime);
		tNestedPackage.setID(Integer.valueOf(tNestedPackage_ID_prime));
		tNestedType.setTName(tNestedType_tName_prime);
		tNestedType.setID(Integer.valueOf(tNestedType_ID_prime));
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eNestedType, tNestedPackage, eNestedTypeToTNestedType, typeGraph, tNestedType,
				mBodyToTAnnotation, eOuterType, tOuterPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_NestedClassInType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NestedClassInTypeImpl
