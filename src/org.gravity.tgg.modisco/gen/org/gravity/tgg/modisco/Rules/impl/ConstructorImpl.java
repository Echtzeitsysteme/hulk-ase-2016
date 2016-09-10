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
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.Type;

import org.gravity.modisco.MConstructorDefinition;

import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.ConstructorDeclarationToTMethod;
import org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature;
import org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList;
import org.gravity.tgg.modisco.MDefinitionToTMember;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.Constructor;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameterList;
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
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstructorImpl extends AbstractRuleImpl implements Constructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getConstructor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MConstructorDefinition eConstructorDeclaration,
			AbstractTypeDeclaration eOuterClass) {
		// initial bindings
		Object[] result1_black = ConstructorImpl.pattern_Constructor_0_1_initialbindings_blackBBBB(this, match,
				eConstructorDeclaration, eOuterClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[eConstructorDeclaration] = "
					+ eConstructorDeclaration + ", " + "[eOuterClass] = " + eOuterClass + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ConstructorImpl.pattern_Constructor_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, eConstructorDeclaration, eOuterClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[eConstructorDeclaration] = "
					+ eConstructorDeclaration + ", " + "[eOuterClass] = " + eOuterClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ConstructorImpl.pattern_Constructor_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ConstructorImpl.pattern_Constructor_0_4_collectelementstobetranslated_blackBBB(
					match, eConstructorDeclaration, eOuterClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eConstructorDeclaration] = "
						+ eConstructorDeclaration + ", " + "[eOuterClass] = " + eOuterClass + ".");
			}
			ConstructorImpl.pattern_Constructor_0_4_collectelementstobetranslated_greenBBBFF(match,
					eConstructorDeclaration, eOuterClass);
			// EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			// EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ConstructorImpl.pattern_Constructor_0_5_collectcontextelements_blackBBB(match,
					eConstructorDeclaration, eOuterClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eConstructorDeclaration] = "
						+ eConstructorDeclaration + ", " + "[eOuterClass] = " + eOuterClass + ".");
			}
			ConstructorImpl.pattern_Constructor_0_5_collectcontextelements_greenBB(match, eOuterClass);

			// register objects to match
			ConstructorImpl.pattern_Constructor_0_6_registerobjectstomatch_expressionBBBB(this, match,
					eConstructorDeclaration, eOuterClass);
			return ConstructorImpl.pattern_Constructor_0_7_expressionF();
		} else {
			return ConstructorImpl.pattern_Constructor_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ConstructorImpl
				.pattern_Constructor_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[2];
		MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) result1_bindingAndBlack[3];
		AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = ConstructorImpl.pattern_Constructor_1_1_performtransformation_greenFFFFBBBFFFFFB(
				typeGraph, tOuterClass, eConstructorDeclaration, csp);
		TParameterList tParameterList = (TParameterList) result1_green[0];
		MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList = (MConstructorDefinitionToTParameterList) result1_green[1];
		MDefinitionToTMember eConstructorDeclarationToTConstructorDef = (MDefinitionToTMember) result1_green[2];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[3];
		TMethodDefinition tConstructorDef = (TMethodDefinition) result1_green[7];
		TMethodSignature tSig = (TMethodSignature) result1_green[8];
		TMethod tName = (TMethod) result1_green[9];
		ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig = (ConstructorDeclarationToTMethodSignature) result1_green[10];
		ConstructorDeclarationToTMethod eConstructorDeclarationToTName = (ConstructorDeclarationToTMethod) result1_green[11];

		// collect translated elements
		Object[] result2_black = ConstructorImpl.pattern_Constructor_1_2_collecttranslatedelements_blackBBBBBBBBBB(
				tParameterList, eConstructorDeclarationToTParameterList, eConstructorDeclarationToTConstructorDef,
				mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef, tSig, tName,
				eConstructorDeclarationToTSig, eConstructorDeclarationToTName);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[tParameterList] = " + tParameterList + ", " + "[eConstructorDeclarationToTParameterList] = "
					+ eConstructorDeclarationToTParameterList + ", " + "[eConstructorDeclarationToTConstructorDef] = "
					+ eConstructorDeclarationToTConstructorDef + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation
					+ ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", " + "[tConstructorDef] = "
					+ tConstructorDef + ", " + "[tSig] = " + tSig + ", " + "[tName] = " + tName + ", "
					+ "[eConstructorDeclarationToTSig] = " + eConstructorDeclarationToTSig + ", "
					+ "[eConstructorDeclarationToTName] = " + eConstructorDeclarationToTName + ".");
		}
		Object[] result2_green = ConstructorImpl.pattern_Constructor_1_2_collecttranslatedelements_greenFBBBBBBBBBB(
				tParameterList, eConstructorDeclarationToTParameterList, eConstructorDeclarationToTConstructorDef,
				mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef, tSig, tName,
				eConstructorDeclarationToTSig, eConstructorDeclarationToTName);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ConstructorImpl.pattern_Constructor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
				ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, eOuterClassToTOuterClass, mBodyToTAnnotation, typeGraph,
				tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName,
				eConstructorDeclarationToTSig, eConstructorDeclarationToTName);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tParameterList] = " + tParameterList + ", "
					+ "[eConstructorDeclarationToTParameterList] = " + eConstructorDeclarationToTParameterList + ", "
					+ "[eConstructorDeclarationToTConstructorDef] = " + eConstructorDeclarationToTConstructorDef + ", "
					+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass
					+ ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[tConstructorDef] = " + tConstructorDef + ", " + "[tSig] = " + tSig + ", "
					+ "[tName] = " + tName + ", " + "[eConstructorDeclarationToTSig] = " + eConstructorDeclarationToTSig
					+ ", " + "[eConstructorDeclarationToTName] = " + eConstructorDeclarationToTName + ".");
		}
		ConstructorImpl.pattern_Constructor_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFF(
				ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, typeGraph, tOuterClass,
				eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName, eConstructorDeclarationToTSig,
				eConstructorDeclarationToTName);
		// EMoflonEdge eConstructorDeclarationToTParameterList__eConstructorDeclaration____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge eConstructorDeclarationToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[15];
		// EMoflonEdge eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge eConstructorDeclarationToTConstructorDef__tConstructorDef____target = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mBodyToTAnnotation__eConstructorDeclaration____source = (EMoflonEdge) result3_green[18];
		// EMoflonEdge mBodyToTAnnotation__tConstructorDef____target = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tOuterClass__tSig____signature = (EMoflonEdge) result3_green[20];
		// EMoflonEdge tConstructorDef__tOuterClass____definedBy = (EMoflonEdge) result3_green[21];
		// EMoflonEdge tOuterClass__tConstructorDef____defines = (EMoflonEdge) result3_green[22];
		// EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[23];
		// EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[24];
		// EMoflonEdge tConstructorDef__tOuterClass____returnType = (EMoflonEdge) result3_green[25];
		// EMoflonEdge tSig__tParameterList____paramList = (EMoflonEdge) result3_green[26];
		// EMoflonEdge tSig__tConstructorDef____definitions = (EMoflonEdge) result3_green[27];
		// EMoflonEdge tConstructorDef__tSig____signature = (EMoflonEdge) result3_green[28];
		// EMoflonEdge tSig__tName____method = (EMoflonEdge) result3_green[29];
		// EMoflonEdge tName__tSig____signatures = (EMoflonEdge) result3_green[30];
		// EMoflonEdge typeGraph__tName____methods = (EMoflonEdge) result3_green[31];
		// EMoflonEdge tName__typeGraph____pg = (EMoflonEdge) result3_green[32];
		// EMoflonEdge eConstructorDeclarationToTSig__eConstructorDeclaration____source = (EMoflonEdge) result3_green[33];
		// EMoflonEdge eConstructorDeclarationToTSig__tSig____target = (EMoflonEdge) result3_green[34];
		// EMoflonEdge eConstructorDeclarationToTName__eConstructorDeclaration____source = (EMoflonEdge) result3_green[35];
		// EMoflonEdge eConstructorDeclarationToTName__tName____target = (EMoflonEdge) result3_green[36];

		// perform postprocessing story node is empty
		// register objects
		ConstructorImpl.pattern_Constructor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this, ruleresult,
				tParameterList, eConstructorDeclarationToTParameterList, eConstructorDeclarationToTConstructorDef,
				eOuterClassToTOuterClass, mBodyToTAnnotation, typeGraph, tOuterClass, eConstructorDeclaration,
				eOuterClass, tConstructorDef, tSig, tName, eConstructorDeclarationToTSig,
				eConstructorDeclarationToTName);
		return ConstructorImpl.pattern_Constructor_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConstructorImpl
				.pattern_Constructor_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorImpl.pattern_Constructor_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ConstructorImpl.pattern_Constructor_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) result2_binding[0];
		AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : ConstructorImpl
				.pattern_Constructor_2_2_corematch_blackFFBBB(eConstructorDeclaration, eOuterClass, match)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[0];
			TClass tOuterClass = (TClass) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : ConstructorImpl.pattern_Constructor_2_3_findcontext_blackBFBBB(
					eOuterClassToTOuterClass, tOuterClass, eConstructorDeclaration, eOuterClass)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[1];
				Object[] result3_green = ConstructorImpl.pattern_Constructor_2_3_findcontext_greenBBBBBFFFFFFF(
						eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = ConstructorImpl
						.pattern_Constructor_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", "
							+ "[eConstructorDeclaration] = " + eConstructorDeclaration + ", " + "[eOuterClass] = "
							+ eOuterClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ConstructorImpl.pattern_Constructor_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ConstructorImpl
							.pattern_Constructor_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ConstructorImpl.pattern_Constructor_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorImpl.pattern_Constructor_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MConstructorDefinition eConstructorDeclaration,
			AbstractTypeDeclaration eOuterClass) {
		match.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		match.registerObject("eOuterClass", eOuterClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MConstructorDefinition eConstructorDeclaration,
			AbstractTypeDeclaration eOuterClass) {// Create CSP
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
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_eConstructorDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eConstructorDeclaration.name", true, csp);
		var_eConstructorDeclaration_name.setValue(eConstructorDeclaration.getName());
		var_eConstructorDeclaration_name.setType("String");

		// Create unbound variables
		Variable var_tName_ID = CSPFactoryHelper.eINSTANCE.createVariable("tName.ID", csp);
		var_tName_ID.setType("int");
		Variable var_tSig_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSig.ID", csp);
		var_tSig_ID.setType("int");
		Variable var_tConstructorDef_ID = CSPFactoryHelper.eINSTANCE.createVariable("tConstructorDef.ID", csp);
		var_tConstructorDef_ID.setType("int");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();
		CreateID createID_1 = new CreateID();
		Eq eq = new Eq();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(createID_1);
		csp.getConstraints().add(eq);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tName_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tSig_ID);
		createID_1.setRuleName("");
		createID_1.solve(var_tConstructorDef_ID);
		eq.setRuleName("");
		eq.solve(var_eConstructorDeclaration_name, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tParameterList,
			EObject eConstructorDeclarationToTParameterList, EObject eConstructorDeclarationToTConstructorDef,
			EObject eOuterClassToTOuterClass, EObject mBodyToTAnnotation, EObject typeGraph, EObject tOuterClass,
			EObject eConstructorDeclaration, EObject eOuterClass, EObject tConstructorDef, EObject tSig, EObject tName,
			EObject eConstructorDeclarationToTSig, EObject eConstructorDeclarationToTName) {
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("eConstructorDeclarationToTParameterList", eConstructorDeclarationToTParameterList);
		ruleresult.registerObject("eConstructorDeclarationToTConstructorDef", eConstructorDeclarationToTConstructorDef);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		ruleresult.registerObject("eOuterClass", eOuterClass);
		ruleresult.registerObject("tConstructorDef", tConstructorDef);
		ruleresult.registerObject("tSig", tSig);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("eConstructorDeclarationToTSig", eConstructorDeclarationToTSig);
		ruleresult.registerObject("eConstructorDeclarationToTName", eConstructorDeclarationToTName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eConstructorDeclaration").eClass())
				.equals("modisco.MConstructorDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TParameterList tParameterList, TypeGraph typeGraph,
			TClass tOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName) {
		// initial bindings
		Object[] result1_black = ConstructorImpl.pattern_Constructor_10_1_initialbindings_blackBBBBBBBB(this, match,
				tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tParameterList] = " + tParameterList
					+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", "
					+ "[tConstructorDef] = " + tConstructorDef + ", " + "[tSig] = " + tSig + ", " + "[tName] = " + tName
					+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ConstructorImpl.pattern_Constructor_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(
				this, match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tParameterList] = " + tParameterList + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", "
					+ "[tConstructorDef] = " + tConstructorDef + ", " + "[tSig] = " + tSig + ", " + "[tName] = " + tName
					+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ConstructorImpl.pattern_Constructor_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ConstructorImpl
					.pattern_Constructor_10_4_collectelementstobetranslated_blackBBBBBBB(match, tParameterList,
							typeGraph, tOuterClass, tConstructorDef, tSig, tName);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tParameterList] = " + tParameterList + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", "
						+ "[tConstructorDef] = " + tConstructorDef + ", " + "[tSig] = " + tSig + ", " + "[tName] = "
						+ tName + ".");
			}
			ConstructorImpl.pattern_Constructor_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFFF(match,
					tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName);
			// EMoflonEdge tOuterClass__tSig____signature = (EMoflonEdge) result4_green[7];
			// EMoflonEdge tConstructorDef__tOuterClass____definedBy = (EMoflonEdge) result4_green[8];
			// EMoflonEdge tOuterClass__tConstructorDef____defines = (EMoflonEdge) result4_green[9];
			// EMoflonEdge tConstructorDef__tOuterClass____returnType = (EMoflonEdge) result4_green[10];
			// EMoflonEdge tSig__tParameterList____paramList = (EMoflonEdge) result4_green[11];
			// EMoflonEdge tSig__tConstructorDef____definitions = (EMoflonEdge) result4_green[12];
			// EMoflonEdge tConstructorDef__tSig____signature = (EMoflonEdge) result4_green[13];
			// EMoflonEdge tSig__tName____method = (EMoflonEdge) result4_green[14];
			// EMoflonEdge tName__tSig____signatures = (EMoflonEdge) result4_green[15];
			// EMoflonEdge typeGraph__tName____methods = (EMoflonEdge) result4_green[16];
			// EMoflonEdge tName__typeGraph____pg = (EMoflonEdge) result4_green[17];

			// collect context elements
			Object[] result5_black = ConstructorImpl.pattern_Constructor_10_5_collectcontextelements_blackBBBBBBB(match,
					tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[tParameterList] = " + tParameterList + ", " + "[typeGraph] = "
								+ typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[tConstructorDef] = "
								+ tConstructorDef + ", " + "[tSig] = " + tSig + ", " + "[tName] = " + tName + ".");
			}
			ConstructorImpl.pattern_Constructor_10_5_collectcontextelements_greenBBBFF(match, typeGraph, tOuterClass);
			// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result5_green[3];
			// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result5_green[4];

			// register objects to match
			ConstructorImpl.pattern_Constructor_10_6_registerobjectstomatch_expressionBBBBBBBB(this, match,
					tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName);
			return ConstructorImpl.pattern_Constructor_10_7_expressionF();
		} else {
			return ConstructorImpl.pattern_Constructor_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ConstructorImpl
				.pattern_Constructor_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[0];
		TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[3];
		AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		TMethodDefinition tConstructorDef = (TMethodDefinition) result1_bindingAndBlack[5];
		TMethodSignature tSig = (TMethodSignature) result1_bindingAndBlack[6];
		TMethod tName = (TMethod) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ConstructorImpl.pattern_Constructor_11_1_performtransformation_greenBFFFFBBBBFFB(
				tParameterList, eOuterClass, tConstructorDef, tSig, tName, csp);
		MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList = (MConstructorDefinitionToTParameterList) result1_green[1];
		MDefinitionToTMember eConstructorDeclarationToTConstructorDef = (MDefinitionToTMember) result1_green[2];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[3];
		MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) result1_green[4];
		ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig = (ConstructorDeclarationToTMethodSignature) result1_green[9];
		ConstructorDeclarationToTMethod eConstructorDeclarationToTName = (ConstructorDeclarationToTMethod) result1_green[10];

		// collect translated elements
		Object[] result2_black = ConstructorImpl.pattern_Constructor_11_2_collecttranslatedelements_blackBBBBBBBBBB(
				tParameterList, eConstructorDeclarationToTParameterList, eConstructorDeclarationToTConstructorDef,
				mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef, tSig, tName,
				eConstructorDeclarationToTSig, eConstructorDeclarationToTName);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[tParameterList] = " + tParameterList + ", " + "[eConstructorDeclarationToTParameterList] = "
					+ eConstructorDeclarationToTParameterList + ", " + "[eConstructorDeclarationToTConstructorDef] = "
					+ eConstructorDeclarationToTConstructorDef + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation
					+ ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", " + "[tConstructorDef] = "
					+ tConstructorDef + ", " + "[tSig] = " + tSig + ", " + "[tName] = " + tName + ", "
					+ "[eConstructorDeclarationToTSig] = " + eConstructorDeclarationToTSig + ", "
					+ "[eConstructorDeclarationToTName] = " + eConstructorDeclarationToTName + ".");
		}
		Object[] result2_green = ConstructorImpl.pattern_Constructor_11_2_collecttranslatedelements_greenFBBBBBBBBBB(
				tParameterList, eConstructorDeclarationToTParameterList, eConstructorDeclarationToTConstructorDef,
				mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef, tSig, tName,
				eConstructorDeclarationToTSig, eConstructorDeclarationToTName);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ConstructorImpl.pattern_Constructor_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
				ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, eOuterClassToTOuterClass, mBodyToTAnnotation, typeGraph,
				tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName,
				eConstructorDeclarationToTSig, eConstructorDeclarationToTName);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tParameterList] = " + tParameterList + ", "
					+ "[eConstructorDeclarationToTParameterList] = " + eConstructorDeclarationToTParameterList + ", "
					+ "[eConstructorDeclarationToTConstructorDef] = " + eConstructorDeclarationToTConstructorDef + ", "
					+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass
					+ ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[tConstructorDef] = " + tConstructorDef + ", " + "[tSig] = " + tSig + ", "
					+ "[tName] = " + tName + ", " + "[eConstructorDeclarationToTSig] = " + eConstructorDeclarationToTSig
					+ ", " + "[eConstructorDeclarationToTName] = " + eConstructorDeclarationToTName + ".");
		}
		ConstructorImpl.pattern_Constructor_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFF(
				ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, typeGraph, tOuterClass,
				eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName, eConstructorDeclarationToTSig,
				eConstructorDeclarationToTName);
		// EMoflonEdge eConstructorDeclarationToTParameterList__eConstructorDeclaration____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge eConstructorDeclarationToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[15];
		// EMoflonEdge eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge eConstructorDeclarationToTConstructorDef__tConstructorDef____target = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mBodyToTAnnotation__eConstructorDeclaration____source = (EMoflonEdge) result3_green[18];
		// EMoflonEdge mBodyToTAnnotation__tConstructorDef____target = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tOuterClass__tSig____signature = (EMoflonEdge) result3_green[20];
		// EMoflonEdge tConstructorDef__tOuterClass____definedBy = (EMoflonEdge) result3_green[21];
		// EMoflonEdge tOuterClass__tConstructorDef____defines = (EMoflonEdge) result3_green[22];
		// EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[23];
		// EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[24];
		// EMoflonEdge tConstructorDef__tOuterClass____returnType = (EMoflonEdge) result3_green[25];
		// EMoflonEdge tSig__tParameterList____paramList = (EMoflonEdge) result3_green[26];
		// EMoflonEdge tSig__tConstructorDef____definitions = (EMoflonEdge) result3_green[27];
		// EMoflonEdge tConstructorDef__tSig____signature = (EMoflonEdge) result3_green[28];
		// EMoflonEdge tSig__tName____method = (EMoflonEdge) result3_green[29];
		// EMoflonEdge tName__tSig____signatures = (EMoflonEdge) result3_green[30];
		// EMoflonEdge typeGraph__tName____methods = (EMoflonEdge) result3_green[31];
		// EMoflonEdge tName__typeGraph____pg = (EMoflonEdge) result3_green[32];
		// EMoflonEdge eConstructorDeclarationToTSig__eConstructorDeclaration____source = (EMoflonEdge) result3_green[33];
		// EMoflonEdge eConstructorDeclarationToTSig__tSig____target = (EMoflonEdge) result3_green[34];
		// EMoflonEdge eConstructorDeclarationToTName__eConstructorDeclaration____source = (EMoflonEdge) result3_green[35];
		// EMoflonEdge eConstructorDeclarationToTName__tName____target = (EMoflonEdge) result3_green[36];

		// perform postprocessing story node is empty
		// register objects
		ConstructorImpl.pattern_Constructor_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this, ruleresult,
				tParameterList, eConstructorDeclarationToTParameterList, eConstructorDeclarationToTConstructorDef,
				eOuterClassToTOuterClass, mBodyToTAnnotation, typeGraph, tOuterClass, eConstructorDeclaration,
				eOuterClass, tConstructorDef, tSig, tName, eConstructorDeclarationToTSig,
				eConstructorDeclarationToTName);
		return ConstructorImpl.pattern_Constructor_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConstructorImpl
				.pattern_Constructor_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorImpl.pattern_Constructor_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ConstructorImpl.pattern_Constructor_12_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TParameterList tParameterList = (TParameterList) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		TClass tOuterClass = (TClass) result2_binding[2];
		TMethodDefinition tConstructorDef = (TMethodDefinition) result2_binding[3];
		TMethodSignature tSig = (TMethodSignature) result2_binding[4];
		TMethod tName = (TMethod) result2_binding[5];
		for (Object[] result2_black : ConstructorImpl.pattern_Constructor_12_2_corematch_blackBFBBFBBBB(tParameterList,
				typeGraph, tOuterClass, tConstructorDef, tSig, tName, match)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[1];
			AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : ConstructorImpl.pattern_Constructor_12_3_findcontext_blackBBBBBBBB(
					tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass, tConstructorDef,
					tSig, tName)) {
				Object[] result3_green = ConstructorImpl
						.pattern_Constructor_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFFFFF(tParameterList,
								eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass, tConstructorDef, tSig,
								tName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tOuterClass__tSig____signature = (EMoflonEdge) result3_green[11];
				// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tConstructorDef__tOuterClass____definedBy = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tOuterClass__tConstructorDef____defines = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tConstructorDef__tOuterClass____returnType = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tSig__tParameterList____paramList = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tSig__tConstructorDef____definitions = (EMoflonEdge) result3_green[18];
				// EMoflonEdge tConstructorDef__tSig____signature = (EMoflonEdge) result3_green[19];
				// EMoflonEdge tSig__tName____method = (EMoflonEdge) result3_green[20];
				// EMoflonEdge tName__tSig____signatures = (EMoflonEdge) result3_green[21];
				// EMoflonEdge typeGraph__tName____methods = (EMoflonEdge) result3_green[22];
				// EMoflonEdge tName__typeGraph____pg = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = ConstructorImpl
						.pattern_Constructor_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass,
								tConstructorDef, tSig, tName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tParameterList] = " + tParameterList + ", " + "[eOuterClassToTOuterClass] = "
							+ eOuterClassToTOuterClass + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = "
							+ tOuterClass + ", " + "[eOuterClass] = " + eOuterClass + ", " + "[tConstructorDef] = "
							+ tConstructorDef + ", " + "[tSig] = " + tSig + ", " + "[tName] = " + tName + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ConstructorImpl.pattern_Constructor_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ConstructorImpl
							.pattern_Constructor_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ConstructorImpl.pattern_Constructor_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorImpl.pattern_Constructor_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TParameterList tParameterList, TypeGraph typeGraph,
			TClass tOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName) {
		match.registerObject("tParameterList", tParameterList);
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tOuterClass", tOuterClass);
		match.registerObject("tConstructorDef", tConstructorDef);
		match.registerObject("tSig", tSig);
		match.registerObject("tName", tName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TParameterList tParameterList, TypeGraph typeGraph,
			TClass tOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tName_ID = CSPFactoryHelper.eINSTANCE.createVariable("tName.ID", true, csp);
		var_tName_ID.setValue(tName.getID());
		var_tName_ID.setType("int");
		Variable var_tSig_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSig.ID", true, csp);
		var_tSig_ID.setValue(tSig.getID());
		var_tSig_ID.setType("int");
		Variable var_tConstructorDef_ID = CSPFactoryHelper.eINSTANCE.createVariable("tConstructorDef.ID", true, csp);
		var_tConstructorDef_ID.setValue(tConstructorDef.getID());
		var_tConstructorDef_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();
		CreateID createID_1 = new CreateID();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(createID_1);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tName_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tSig_ID);
		createID_1.setRuleName("");
		createID_1.solve(var_tConstructorDef_ID);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TParameterList tParameterList,
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig,
			TMethod tName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");

		// Create unbound variables
		Variable var_eConstructorDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eConstructorDeclaration.name", csp);
		var_eConstructorDeclaration_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eConstructorDeclaration_name, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("tConstructorDef", tConstructorDef);
		isApplicableMatch.registerObject("tSig", tSig);
		isApplicableMatch.registerObject("tName", tName);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tParameterList,
			EObject eConstructorDeclarationToTParameterList, EObject eConstructorDeclarationToTConstructorDef,
			EObject eOuterClassToTOuterClass, EObject mBodyToTAnnotation, EObject typeGraph, EObject tOuterClass,
			EObject eConstructorDeclaration, EObject eOuterClass, EObject tConstructorDef, EObject tSig, EObject tName,
			EObject eConstructorDeclarationToTSig, EObject eConstructorDeclarationToTName) {
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("eConstructorDeclarationToTParameterList", eConstructorDeclarationToTParameterList);
		ruleresult.registerObject("eConstructorDeclarationToTConstructorDef", eConstructorDeclarationToTConstructorDef);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		ruleresult.registerObject("eOuterClass", eOuterClass);
		ruleresult.registerObject("tConstructorDef", tConstructorDef);
		ruleresult.registerObject("tSig", tSig);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("eConstructorDeclarationToTSig", eConstructorDeclarationToTSig);
		ruleresult.registerObject("eConstructorDeclarationToTName", eConstructorDeclarationToTName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tParameterList").eClass())
						.equals("basic.TParameterList.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tConstructorDef").eClass())
						.equals("basic.TMethodDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSig").eClass())
						.equals("basic.TMethodSignature.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tName").eClass()).equals("basic.TMethod.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_53(EMoflonEdge _edge_bodyDeclarations) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConstructorImpl
				.pattern_Constructor_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorImpl.pattern_Constructor_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ConstructorImpl
				.pattern_Constructor_20_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) result2_black[0];
			AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = ConstructorImpl.pattern_Constructor_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ConstructorImpl.pattern_Constructor_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, eConstructorDeclaration, eOuterClass)) {
				// Ensure that the correct types of elements are matched
				if (ConstructorImpl
						.pattern_Constructor_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ConstructorImpl.pattern_Constructor_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ConstructorImpl.pattern_Constructor_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorImpl.pattern_Constructor_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_50(EMoflonEdge _edge_signature) {
		// prepare return value
		Object[] result1_bindingAndBlack = ConstructorImpl
				.pattern_Constructor_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorImpl.pattern_Constructor_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ConstructorImpl
				.pattern_Constructor_21_2_testcorematchandDECs_blackFFFFFFB(_edge_signature)) {
			TParameterList tParameterList = (TParameterList) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TClass tOuterClass = (TClass) result2_black[2];
			TMethodDefinition tConstructorDef = (TMethodDefinition) result2_black[3];
			TMethodSignature tSig = (TMethodSignature) result2_black[4];
			TMethod tName = (TMethod) result2_black[5];
			Object[] result2_green = ConstructorImpl.pattern_Constructor_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ConstructorImpl.pattern_Constructor_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
					this, match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName)) {
				// Ensure that the correct types of elements are matched
				if (ConstructorImpl
						.pattern_Constructor_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = ConstructorImpl.pattern_Constructor_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ConstructorImpl.pattern_Constructor_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorImpl.pattern_Constructor_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Constructor");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tName_ID = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_ID.setValue(__helper.getValue("tName", "ID"));
		var_tName_ID.setType("int");

		Variable var_tSig_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSig", true, csp);
		var_tSig_ID.setValue(__helper.getValue("tSig", "ID"));
		var_tSig_ID.setType("int");

		Variable var_tConstructorDef_ID = CSPFactoryHelper.eINSTANCE.createVariable("tConstructorDef", true, csp);
		var_tConstructorDef_ID.setValue(__helper.getValue("tConstructorDef", "ID"));
		var_tConstructorDef_ID.setType("int");

		Variable var_eConstructorDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("eConstructorDeclaration",
				true, csp);
		var_eConstructorDeclaration_name.setValue(__helper.getValue("eConstructorDeclaration", "name"));
		var_eConstructorDeclaration_name.setType("String");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		CreateID createID2 = new CreateID();
		csp.getConstraints().add(createID2);

		Eq eq3 = new Eq();
		csp.getConstraints().add(eq3);

		createID0.setRuleName("Constructor");
		createID0.solve(var_tName_ID);

		createID1.setRuleName("Constructor");
		createID1.solve(var_tSig_ID);

		createID2.setRuleName("Constructor");
		createID2.solve(var_tConstructorDef_ID);

		eq3.setRuleName("Constructor");
		eq3.solve(var_eConstructorDeclaration_name, var_tName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tName_ID.setBound(false);
			var_tSig_ID.setBound(false);
			var_tConstructorDef_ID.setBound(false);
			var_tName_tName.setBound(false);
			createID0.solve(var_tName_ID);
			createID1.solve(var_tSig_ID);
			createID2.solve(var_tConstructorDef_ID);
			eq3.solve(var_eConstructorDeclaration_name, var_tName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tName", "ID", var_tName_ID.getValue());
				__helper.setValue("tSig", "ID", var_tSig_ID.getValue());
				__helper.setValue("tConstructorDef", "ID", var_tConstructorDef_ID.getValue());
				__helper.setValue("tName", "tName", var_tName_tName.getValue());
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
		ruleResult.setRule("Constructor");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tName_ID = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_ID.setValue(__helper.getValue("tName", "ID"));
		var_tName_ID.setType("int");

		Variable var_tSig_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSig", true, csp);
		var_tSig_ID.setValue(__helper.getValue("tSig", "ID"));
		var_tSig_ID.setType("int");

		Variable var_tConstructorDef_ID = CSPFactoryHelper.eINSTANCE.createVariable("tConstructorDef", true, csp);
		var_tConstructorDef_ID.setValue(__helper.getValue("tConstructorDef", "ID"));
		var_tConstructorDef_ID.setType("int");

		Variable var_eConstructorDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("eConstructorDeclaration",
				true, csp);
		var_eConstructorDeclaration_name.setValue(__helper.getValue("eConstructorDeclaration", "name"));
		var_eConstructorDeclaration_name.setType("String");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		CreateID createID2 = new CreateID();
		csp.getConstraints().add(createID2);

		Eq eq3 = new Eq();
		csp.getConstraints().add(eq3);

		createID0.setRuleName("Constructor");
		createID0.solve(var_tName_ID);

		createID1.setRuleName("Constructor");
		createID1.solve(var_tSig_ID);

		createID2.setRuleName("Constructor");
		createID2.solve(var_tConstructorDef_ID);

		eq3.setRuleName("Constructor");
		eq3.solve(var_eConstructorDeclaration_name, var_tName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_eConstructorDeclaration_name.setBound(false);
			createID0.solve(var_tName_ID);
			createID1.solve(var_tSig_ID);
			createID2.solve(var_tConstructorDef_ID);
			eq3.solve(var_eConstructorDeclaration_name, var_tName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("eConstructorDeclaration", "name", var_eConstructorDeclaration_name.getValue());
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
		Object[] result1_black = ConstructorImpl.pattern_Constructor_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorImpl.pattern_Constructor_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ConstructorImpl.pattern_Constructor_24_2_matchcontext_bindingFFFFFFFFBB(targetMatch,
				sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TParameterList tParameterList = (TParameterList) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		TClass tOuterClass = (TClass) result2_binding[2];
		MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) result2_binding[3];
		AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result2_binding[4];
		TMethodDefinition tConstructorDef = (TMethodDefinition) result2_binding[5];
		TMethodSignature tSig = (TMethodSignature) result2_binding[6];
		TMethod tName = (TMethod) result2_binding[7];
		for (Object[] result2_black : ConstructorImpl.pattern_Constructor_24_2_matchcontext_blackBFBBBBBBBBB(
				tParameterList, typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef, tSig,
				tName, sourceMatch, targetMatch)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[1];
			Object[] result2_green = ConstructorImpl.pattern_Constructor_24_2_matchcontext_greenBBBBBBBBBBFB(
					tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration,
					eOuterClass, tConstructorDef, tSig, tName, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[10];

			// check csp
			Object[] result3_bindingAndBlack = ConstructorImpl
					.pattern_Constructor_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch,
							tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration,
							eOuterClass, tConstructorDef, tSig, tName, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = ConstructorImpl.pattern_Constructor_24_4_createcorrespondence_blackBBBBBBBBB(
						tParameterList, typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef,
						tSig, tName, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tParameterList] = " + tParameterList + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", "
							+ "[eConstructorDeclaration] = " + eConstructorDeclaration + ", " + "[eOuterClass] = "
							+ eOuterClass + ", " + "[tConstructorDef] = " + tConstructorDef + ", " + "[tSig] = " + tSig
							+ ", " + "[tName] = " + tName + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ConstructorImpl.pattern_Constructor_24_4_createcorrespondence_greenBFFFBBBBFFB(tParameterList,
						eConstructorDeclaration, tConstructorDef, tSig, tName, isApplicableMatch);
				// MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList = (MConstructorDefinitionToTParameterList) result4_green[1];
				// MDefinitionToTMember eConstructorDeclarationToTConstructorDef = (MDefinitionToTMember) result4_green[2];
				// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result4_green[3];
				// ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig = (ConstructorDeclarationToTMethodSignature) result4_green[8];
				// ConstructorDeclarationToTMethod eConstructorDeclarationToTName = (ConstructorDeclarationToTMethod) result4_green[9];

				// add to returned result
				Object[] result5_black = ConstructorImpl.pattern_Constructor_24_5_addtoreturnedresult_blackBB(result,
						isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ConstructorImpl.pattern_Constructor_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return ConstructorImpl.pattern_Constructor_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TParameterList tParameterList,
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tName_ID = CSPFactoryHelper.eINSTANCE.createVariable("tName.ID", true, csp);
		var_tName_ID.setValue(tName.getID());
		var_tName_ID.setType("int");
		Variable var_tSig_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSig.ID", true, csp);
		var_tSig_ID.setValue(tSig.getID());
		var_tSig_ID.setType("int");
		Variable var_tConstructorDef_ID = CSPFactoryHelper.eINSTANCE.createVariable("tConstructorDef.ID", true, csp);
		var_tConstructorDef_ID.setValue(tConstructorDef.getID());
		var_tConstructorDef_ID.setType("int");
		Variable var_eConstructorDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eConstructorDeclaration.name", true, csp);
		var_eConstructorDeclaration_name.setValue(eConstructorDeclaration.getName());
		var_eConstructorDeclaration_name.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();
		CreateID createID_1 = new CreateID();
		Eq eq = new Eq();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(createID_1);
		csp.getConstraints().add(eq);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tName_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tSig_ID);
		createID_1.setRuleName("");
		createID_1.solve(var_tConstructorDef_ID);
		eq.setRuleName("");
		eq.solve(var_eConstructorDeclaration_name, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("tConstructorDef", tConstructorDef);
		isApplicableMatch.registerObject("tSig", tSig);
		isApplicableMatch.registerObject("tName", tName);
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
	public boolean checkDEC_FWD(MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {// match tgg pattern
		Object[] result1_black = ConstructorImpl
				.pattern_Constructor_27_1_matchtggpattern_blackBB(eConstructorDeclaration, eOuterClass);
		if (result1_black != null) {
			return ConstructorImpl.pattern_Constructor_27_2_expressionF();
		} else {
			return ConstructorImpl.pattern_Constructor_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName) {// match tgg pattern
		Object[] result1_black = ConstructorImpl.pattern_Constructor_28_1_matchtggpattern_blackBBBBBB(tParameterList,
				typeGraph, tOuterClass, tConstructorDef, tSig, tName);
		if (result1_black != null) {
			return ConstructorImpl.pattern_Constructor_28_2_expressionF();
		} else {
			return ConstructorImpl.pattern_Constructor_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eOuterClassToTOuterClassParameter) {
		// create result
		Object[] result1_black = ConstructorImpl.pattern_Constructor_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorImpl.pattern_Constructor_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ConstructorImpl
				.pattern_Constructor_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eOuterClassToTOuterClassList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[1];
			AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result2_black[2];
			TClass tOuterClass = (TClass) result2_black[3];
			TypeGraph typeGraph = (TypeGraph) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = ConstructorImpl
					.pattern_Constructor_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[typeGraph] = "
						+ typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[eOuterClass] = " + eOuterClass
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ConstructorImpl.pattern_Constructor_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ConstructorImpl.pattern_Constructor_29_5_checknacs_blackBBBB(eOuterClass,
						eOuterClassToTOuterClass, typeGraph, tOuterClass);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ConstructorImpl.pattern_Constructor_29_6_perform_blackBBBBB(
							eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[typeGraph] = "
								+ typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[eOuterClass] = "
								+ eOuterClass + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ConstructorImpl.pattern_Constructor_29_6_perform_greenFFFFBBFBFFFFFBB(typeGraph, tOuterClass,
							eOuterClass, ruleResult, csp);
					// TParameterList tParameterList = (TParameterList) result6_green[0];
					// MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList = (MConstructorDefinitionToTParameterList) result6_green[1];
					// MDefinitionToTMember eConstructorDeclarationToTConstructorDef = (MDefinitionToTMember) result6_green[2];
					// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result6_green[3];
					// MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) result6_green[6];
					// TMethodDefinition tConstructorDef = (TMethodDefinition) result6_green[8];
					// TMethodSignature tSig = (TMethodSignature) result6_green[9];
					// TMethod tName = (TMethod) result6_green[10];
					// ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig = (ConstructorDeclarationToTMethodSignature) result6_green[11];
					// ConstructorDeclarationToTMethod eConstructorDeclarationToTName = (ConstructorDeclarationToTMethod) result6_green[12];

				} else {
				}

			} else {
			}

		}
		return ConstructorImpl.pattern_Constructor_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			AbstractTypeDeclaration eOuterClass, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tName_ID = CSPFactoryHelper.eINSTANCE.createVariable("tName.ID", csp);
		var_tName_ID.setType("int");
		Variable var_tSig_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSig.ID", csp);
		var_tSig_ID.setType("int");
		Variable var_tConstructorDef_ID = CSPFactoryHelper.eINSTANCE.createVariable("tConstructorDef.ID", csp);
		var_tConstructorDef_ID.setType("int");
		Variable var_eConstructorDeclaration_name = CSPFactoryHelper.eINSTANCE
				.createVariable("eConstructorDeclaration.name", csp);
		var_eConstructorDeclaration_name.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();
		CreateID createID_1 = new CreateID();
		Eq eq = new Eq();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(createID_1);
		csp.getConstraints().add(eq);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tName_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tSig_ID);
		createID_1.setRuleName("");
		createID_1.solve(var_tConstructorDef_ID);
		eq.setRuleName("");
		eq.solve(var_eConstructorDeclaration_name, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
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
		case RulesPackage.CONSTRUCTOR___IS_APPROPRIATE_FWD__MATCH_MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.CONSTRUCTOR___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.CONSTRUCTOR___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TYPEGRAPH_TCLASS_MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TypeGraph) arguments.get(2), (TClass) arguments.get(3),
					(MConstructorDefinition) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.CONSTRUCTOR___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___IS_APPROPRIATE_BWD__MATCH_TPARAMETERLIST_TYPEGRAPH_TCLASS_TMETHODDEFINITION_TMETHODSIGNATURE_TMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0), (TParameterList) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TMethodDefinition) arguments.get(4),
					(TMethodSignature) arguments.get(5), (TMethod) arguments.get(6));
		case RulesPackage.CONSTRUCTOR___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETERLIST_TYPEGRAPH_TCLASS_TMETHODDEFINITION_TMETHODSIGNATURE_TMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TParameterList) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TMethodDefinition) arguments.get(4),
					(TMethodSignature) arguments.get(5), (TMethod) arguments.get(6));
			return null;
		case RulesPackage.CONSTRUCTOR___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETERLIST_TYPEGRAPH_TCLASS_TMETHODDEFINITION_TMETHODSIGNATURE_TMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TParameterList) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TMethodDefinition) arguments.get(4),
					(TMethodSignature) arguments.get(5), (TMethod) arguments.get(6));
		case RulesPackage.CONSTRUCTOR___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPARAMETERLIST_TYPETOTABSTRACTTYPE_TYPEGRAPH_TCLASS_ABSTRACTTYPEDECLARATION_TMETHODDEFINITION_TMETHODSIGNATURE_TMETHOD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TParameterList) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TypeGraph) arguments.get(3), (TClass) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (TMethodDefinition) arguments.get(6),
					(TMethodSignature) arguments.get(7), (TMethod) arguments.get(8));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.CONSTRUCTOR___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___IS_APPROPRIATE_FWD_EMOFLON_EDGE_53__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_53((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_50((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TPARAMETERLIST_TYPETOTABSTRACTTYPE_TYPEGRAPH_TCLASS_MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION_TMETHODDEFINITION_TMETHODSIGNATURE_TMETHOD_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TParameterList) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TypeGraph) arguments.get(3), (TClass) arguments.get(4),
					(MConstructorDefinition) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(TMethodDefinition) arguments.get(7), (TMethodSignature) arguments.get(8),
					(TMethod) arguments.get(9), (Match) arguments.get(10), (Match) arguments.get(11));
		case RulesPackage.CONSTRUCTOR___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR___CHECK_DEC_FWD__MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MConstructorDefinition) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.CONSTRUCTOR___CHECK_DEC_BWD__TPARAMETERLIST_TYPEGRAPH_TCLASS_TMETHODDEFINITION_TMETHODSIGNATURE_TMETHOD:
			return checkDEC_BWD((TParameterList) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2), (TMethodDefinition) arguments.get(3),
					(TMethodSignature) arguments.get(4), (TMethod) arguments.get(5));
		case RulesPackage.CONSTRUCTOR___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.CONSTRUCTOR___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TYPEGRAPH_TCLASS_ABSTRACTTYPEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TypeGraph) arguments.get(2), (TClass) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.CONSTRUCTOR___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Constructor_0_1_initialbindings_blackBBBB(Constructor _this, Match match,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		return new Object[] { _this, match, eConstructorDeclaration, eOuterClass };
	}

	public static final Object[] pattern_Constructor_0_2_SolveCSP_bindingFBBBB(Constructor _this, Match match,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eConstructorDeclaration, eOuterClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eConstructorDeclaration, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Constructor_0_2_SolveCSP_bindingAndBlackFBBBB(Constructor _this, Match match,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		Object[] result_pattern_Constructor_0_2_SolveCSP_binding = pattern_Constructor_0_2_SolveCSP_bindingFBBBB(_this,
				match, eConstructorDeclaration, eOuterClass);
		if (result_pattern_Constructor_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Constructor_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Constructor_0_2_SolveCSP_black = pattern_Constructor_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Constructor_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eConstructorDeclaration, eOuterClass };
			}
		}
		return null;
	}

	public static final boolean pattern_Constructor_0_3_CheckCSP_expressionFBB(Constructor _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Constructor_0_4_collectelementstobetranslated_blackBBB(Match match,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		return new Object[] { match, eConstructorDeclaration, eOuterClass };
	}

	public static final Object[] pattern_Constructor_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eConstructorDeclaration);
		String eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setTrg(eConstructorDeclaration);
		match.getToBeTranslatedEdges().add(eOuterClass__eConstructorDeclaration____bodyDeclarations);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		match.getToBeTranslatedEdges().add(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration);
		eOuterClass__eConstructorDeclaration____bodyDeclarations
				.setName(eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		return new Object[] { match, eConstructorDeclaration, eOuterClass,
				eOuterClass__eConstructorDeclaration____bodyDeclarations,
				eConstructorDeclaration__eOuterClass____abstractTypeDeclaration };
	}

	public static final Object[] pattern_Constructor_0_5_collectcontextelements_blackBBB(Match match,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		return new Object[] { match, eConstructorDeclaration, eOuterClass };
	}

	public static final Object[] pattern_Constructor_0_5_collectcontextelements_greenBB(Match match,
			AbstractTypeDeclaration eOuterClass) {
		match.getContextNodes().add(eOuterClass);
		return new Object[] { match, eOuterClass };
	}

	public static final void pattern_Constructor_0_6_registerobjectstomatch_expressionBBBB(Constructor _this,
			Match match, MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		_this.registerObjectsToMatch_FWD(match, eConstructorDeclaration, eOuterClass);

	}

	public static final boolean pattern_Constructor_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Constructor_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Constructor_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("eConstructorDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterClass");
		EObject tmpEOuterClassToTOuterClass = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTOuterClass = _localVariable_2;
		EObject tmpEConstructorDeclaration = _localVariable_3;
		EObject tmpEOuterClass = _localVariable_4;
		if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTOuterClass instanceof TClass) {
					TClass tOuterClass = (TClass) tmpTOuterClass;
					if (tmpEConstructorDeclaration instanceof MConstructorDefinition) {
						MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) tmpEConstructorDeclaration;
						if (tmpEOuterClass instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) tmpEOuterClass;
							return new Object[] { eOuterClassToTOuterClass, typeGraph, tOuterClass,
									eConstructorDeclaration, eOuterClass, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_1_1_performtransformation_blackBBBBBFBB(
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass, Constructor _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration,
						eOuterClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			Constructor _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Constructor_1_1_performtransformation_binding = pattern_Constructor_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Constructor_1_1_performtransformation_binding != null) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result_pattern_Constructor_1_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_Constructor_1_1_performtransformation_binding[1];
			TClass tOuterClass = (TClass) result_pattern_Constructor_1_1_performtransformation_binding[2];
			MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) result_pattern_Constructor_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result_pattern_Constructor_1_1_performtransformation_binding[4];

			Object[] result_pattern_Constructor_1_1_performtransformation_black = pattern_Constructor_1_1_performtransformation_blackBBBBBFBB(
					eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass, _this,
					isApplicableMatch);
			if (result_pattern_Constructor_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Constructor_1_1_performtransformation_black[5];

				return new Object[] { eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration,
						eOuterClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_1_1_performtransformation_greenFFFFBBBFFFFFB(TypeGraph typeGraph,
			TClass tOuterClass, MConstructorDefinition eConstructorDeclaration, CSP csp) {
		TParameterList tParameterList = BasicFactory.eINSTANCE.createTParameterList();
		MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList = ModiscoFactory.eINSTANCE
				.createMConstructorDefinitionToTParameterList();
		MDefinitionToTMember eConstructorDeclarationToTConstructorDef = ModiscoFactory.eINSTANCE
				.createMDefinitionToTMember();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		TMethodDefinition tConstructorDef = BasicFactory.eINSTANCE.createTMethodDefinition();
		TMethodSignature tSig = BasicFactory.eINSTANCE.createTMethodSignature();
		TMethod tName = BasicFactory.eINSTANCE.createTMethod();
		ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig = ModiscoFactory.eINSTANCE
				.createConstructorDeclarationToTMethodSignature();
		ConstructorDeclarationToTMethod eConstructorDeclarationToTName = ModiscoFactory.eINSTANCE
				.createConstructorDeclarationToTMethod();
		Object _localVariable_0 = csp.getValue("tConstructorDef", "ID");
		Object _localVariable_1 = csp.getValue("tSig", "ID");
		Object _localVariable_2 = csp.getValue("tName", "ID");
		Object _localVariable_3 = csp.getValue("tName", "tName");
		eConstructorDeclarationToTParameterList.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTParameterList.setTarget(tParameterList);
		eConstructorDeclarationToTConstructorDef.setSource(eConstructorDeclaration);
		mBodyToTAnnotation.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTConstructorDef.setTarget(tConstructorDef);
		mBodyToTAnnotation.setTarget(tConstructorDef);
		tConstructorDef.setDefinedBy(tOuterClass);
		tConstructorDef.setReturnType(tOuterClass);
		tOuterClass.getSignature().add(tSig);
		tSig.setParamList(tParameterList);
		tSig.getDefinitions().add(tConstructorDef);
		tSig.setMethod(tName);
		typeGraph.getMethods().add(tName);
		eConstructorDeclarationToTSig.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTSig.setTarget(tSig);
		eConstructorDeclarationToTName.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTName.setTarget(tName);
		int tConstructorDef_ID_prime = (int) _localVariable_0;
		int tSig_ID_prime = (int) _localVariable_1;
		int tName_ID_prime = (int) _localVariable_2;
		String tName_tName_prime = (String) _localVariable_3;
		tConstructorDef.setID(Integer.valueOf(tConstructorDef_ID_prime));
		tSig.setID(Integer.valueOf(tSig_ID_prime));
		tName.setID(Integer.valueOf(tName_ID_prime));
		tName.setTName(tName_tName_prime);
		return new Object[] { tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, typeGraph, tOuterClass,
				eConstructorDeclaration, tConstructorDef, tSig, tName, eConstructorDeclarationToTSig,
				eConstructorDeclarationToTName, csp };
	}

	public static final Object[] pattern_Constructor_1_2_collecttranslatedelements_blackBBBBBBBBBB(
			TParameterList tParameterList,
			MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList,
			MDefinitionToTMember eConstructorDeclarationToTConstructorDef,
			BodyDeclarationToTAnnotatable mBodyToTAnnotation, MConstructorDefinition eConstructorDeclaration,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName,
			ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig,
			ConstructorDeclarationToTMethod eConstructorDeclarationToTName) {
		return new Object[] { tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef,
				tSig, tName, eConstructorDeclarationToTSig, eConstructorDeclarationToTName };
	}

	public static final Object[] pattern_Constructor_1_2_collecttranslatedelements_greenFBBBBBBBBBB(
			TParameterList tParameterList,
			MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList,
			MDefinitionToTMember eConstructorDeclarationToTConstructorDef,
			BodyDeclarationToTAnnotatable mBodyToTAnnotation, MConstructorDefinition eConstructorDeclaration,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName,
			ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig,
			ConstructorDeclarationToTMethod eConstructorDeclarationToTName) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tParameterList);
		ruleresult.getCreatedLinkElements().add(eConstructorDeclarationToTParameterList);
		ruleresult.getCreatedLinkElements().add(eConstructorDeclarationToTConstructorDef);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(eConstructorDeclaration);
		ruleresult.getCreatedElements().add(tConstructorDef);
		ruleresult.getCreatedElements().add(tSig);
		ruleresult.getCreatedElements().add(tName);
		ruleresult.getCreatedLinkElements().add(eConstructorDeclarationToTSig);
		ruleresult.getCreatedLinkElements().add(eConstructorDeclarationToTName);
		return new Object[] { ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef,
				tSig, tName, eConstructorDeclarationToTSig, eConstructorDeclarationToTName };
	}

	public static final Object[] pattern_Constructor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tParameterList, EObject eConstructorDeclarationToTParameterList,
			EObject eConstructorDeclarationToTConstructorDef, EObject eOuterClassToTOuterClass,
			EObject mBodyToTAnnotation, EObject typeGraph, EObject tOuterClass, EObject eConstructorDeclaration,
			EObject eOuterClass, EObject tConstructorDef, EObject tSig, EObject tName,
			EObject eConstructorDeclarationToTSig, EObject eConstructorDeclarationToTName) {
		if (!tParameterList.equals(typeGraph)) {
			if (!tParameterList.equals(tSig)) {
				if (!eConstructorDeclarationToTParameterList.equals(tParameterList)) {
					if (!eConstructorDeclarationToTParameterList.equals(eOuterClassToTOuterClass)) {
						if (!eConstructorDeclarationToTParameterList.equals(mBodyToTAnnotation)) {
							if (!eConstructorDeclarationToTParameterList.equals(typeGraph)) {
								if (!eConstructorDeclarationToTParameterList.equals(tOuterClass)) {
									if (!eConstructorDeclarationToTParameterList.equals(eOuterClass)) {
										if (!eConstructorDeclarationToTParameterList.equals(tConstructorDef)) {
											if (!eConstructorDeclarationToTParameterList.equals(tSig)) {
												if (!eConstructorDeclarationToTParameterList.equals(tName)) {
													if (!eConstructorDeclarationToTParameterList
															.equals(eConstructorDeclarationToTSig)) {
														if (!eConstructorDeclarationToTConstructorDef
																.equals(tParameterList)) {
															if (!eConstructorDeclarationToTConstructorDef
																	.equals(eConstructorDeclarationToTParameterList)) {
																if (!eConstructorDeclarationToTConstructorDef
																		.equals(eOuterClassToTOuterClass)) {
																	if (!eConstructorDeclarationToTConstructorDef
																			.equals(mBodyToTAnnotation)) {
																		if (!eConstructorDeclarationToTConstructorDef
																				.equals(typeGraph)) {
																			if (!eConstructorDeclarationToTConstructorDef
																					.equals(tOuterClass)) {
																				if (!eConstructorDeclarationToTConstructorDef
																						.equals(eOuterClass)) {
																					if (!eConstructorDeclarationToTConstructorDef
																							.equals(tConstructorDef)) {
																						if (!eConstructorDeclarationToTConstructorDef
																								.equals(tSig)) {
																							if (!eConstructorDeclarationToTConstructorDef
																									.equals(tName)) {
																								if (!eConstructorDeclarationToTConstructorDef
																										.equals(eConstructorDeclarationToTSig)) {
																									if (!eConstructorDeclarationToTConstructorDef
																											.equals(eConstructorDeclarationToTName)) {
																										if (!eOuterClassToTOuterClass
																												.equals(tParameterList)) {
																											if (!eOuterClassToTOuterClass
																													.equals(mBodyToTAnnotation)) {
																												if (!eOuterClassToTOuterClass
																														.equals(typeGraph)) {
																													if (!eOuterClassToTOuterClass
																															.equals(tOuterClass)) {
																														if (!eOuterClassToTOuterClass
																																.equals(tConstructorDef)) {
																															if (!eOuterClassToTOuterClass
																																	.equals(tSig)) {
																																if (!eOuterClassToTOuterClass
																																		.equals(tName)) {
																																	if (!mBodyToTAnnotation
																																			.equals(tParameterList)) {
																																		if (!mBodyToTAnnotation
																																				.equals(typeGraph)) {
																																			if (!mBodyToTAnnotation
																																					.equals(tOuterClass)) {
																																				if (!mBodyToTAnnotation
																																						.equals(tConstructorDef)) {
																																					if (!mBodyToTAnnotation
																																							.equals(tSig)) {
																																						if (!mBodyToTAnnotation
																																								.equals(tName)) {
																																							if (!tOuterClass
																																									.equals(tParameterList)) {
																																								if (!tOuterClass
																																										.equals(typeGraph)) {
																																									if (!tOuterClass
																																											.equals(tSig)) {
																																										if (!eConstructorDeclaration
																																												.equals(tParameterList)) {
																																											if (!eConstructorDeclaration
																																													.equals(eConstructorDeclarationToTParameterList)) {
																																												if (!eConstructorDeclaration
																																														.equals(eConstructorDeclarationToTConstructorDef)) {
																																													if (!eConstructorDeclaration
																																															.equals(eOuterClassToTOuterClass)) {
																																														if (!eConstructorDeclaration
																																																.equals(mBodyToTAnnotation)) {
																																															if (!eConstructorDeclaration
																																																	.equals(typeGraph)) {
																																																if (!eConstructorDeclaration
																																																		.equals(tOuterClass)) {
																																																	if (!eConstructorDeclaration
																																																			.equals(eOuterClass)) {
																																																		if (!eConstructorDeclaration
																																																				.equals(tConstructorDef)) {
																																																			if (!eConstructorDeclaration
																																																					.equals(tSig)) {
																																																				if (!eConstructorDeclaration
																																																						.equals(tName)) {
																																																					if (!eConstructorDeclaration
																																																							.equals(eConstructorDeclarationToTSig)) {
																																																						if (!eConstructorDeclaration
																																																								.equals(eConstructorDeclarationToTName)) {
																																																							if (!eOuterClass
																																																									.equals(tParameterList)) {
																																																								if (!eOuterClass
																																																										.equals(eOuterClassToTOuterClass)) {
																																																									if (!eOuterClass
																																																											.equals(mBodyToTAnnotation)) {
																																																										if (!eOuterClass
																																																												.equals(typeGraph)) {
																																																											if (!eOuterClass
																																																													.equals(tOuterClass)) {
																																																												if (!eOuterClass
																																																														.equals(tConstructorDef)) {
																																																													if (!eOuterClass
																																																															.equals(tSig)) {
																																																														if (!eOuterClass
																																																																.equals(tName)) {
																																																															if (!tConstructorDef
																																																																	.equals(tParameterList)) {
																																																																if (!tConstructorDef
																																																																		.equals(typeGraph)) {
																																																																	if (!tConstructorDef
																																																																			.equals(tOuterClass)) {
																																																																		if (!tConstructorDef
																																																																				.equals(tSig)) {
																																																																			if (!tConstructorDef
																																																																					.equals(tName)) {
																																																																				if (!tSig
																																																																						.equals(typeGraph)) {
																																																																					if (!tName
																																																																							.equals(tParameterList)) {
																																																																						if (!tName
																																																																								.equals(typeGraph)) {
																																																																							if (!tName
																																																																									.equals(tOuterClass)) {
																																																																								if (!tName
																																																																										.equals(tSig)) {
																																																																									if (!eConstructorDeclarationToTSig
																																																																											.equals(tParameterList)) {
																																																																										if (!eConstructorDeclarationToTSig
																																																																												.equals(eOuterClassToTOuterClass)) {
																																																																											if (!eConstructorDeclarationToTSig
																																																																													.equals(mBodyToTAnnotation)) {
																																																																												if (!eConstructorDeclarationToTSig
																																																																														.equals(typeGraph)) {
																																																																													if (!eConstructorDeclarationToTSig
																																																																															.equals(tOuterClass)) {
																																																																														if (!eConstructorDeclarationToTSig
																																																																																.equals(eOuterClass)) {
																																																																															if (!eConstructorDeclarationToTSig
																																																																																	.equals(tConstructorDef)) {
																																																																																if (!eConstructorDeclarationToTSig
																																																																																		.equals(tSig)) {
																																																																																	if (!eConstructorDeclarationToTSig
																																																																																			.equals(tName)) {
																																																																																		if (!eConstructorDeclarationToTName
																																																																																				.equals(tParameterList)) {
																																																																																			if (!eConstructorDeclarationToTName
																																																																																					.equals(eConstructorDeclarationToTParameterList)) {
																																																																																				if (!eConstructorDeclarationToTName
																																																																																						.equals(eOuterClassToTOuterClass)) {
																																																																																					if (!eConstructorDeclarationToTName
																																																																																							.equals(mBodyToTAnnotation)) {
																																																																																						if (!eConstructorDeclarationToTName
																																																																																								.equals(typeGraph)) {
																																																																																							if (!eConstructorDeclarationToTName
																																																																																									.equals(tOuterClass)) {
																																																																																								if (!eConstructorDeclarationToTName
																																																																																										.equals(eOuterClass)) {
																																																																																									if (!eConstructorDeclarationToTName
																																																																																											.equals(tConstructorDef)) {
																																																																																										if (!eConstructorDeclarationToTName
																																																																																												.equals(tSig)) {
																																																																																											if (!eConstructorDeclarationToTName
																																																																																													.equals(tName)) {
																																																																																												if (!eConstructorDeclarationToTName
																																																																																														.equals(eConstructorDeclarationToTSig)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															tParameterList,
																																																																																															eConstructorDeclarationToTParameterList,
																																																																																															eConstructorDeclarationToTConstructorDef,
																																																																																															eOuterClassToTOuterClass,
																																																																																															mBodyToTAnnotation,
																																																																																															typeGraph,
																																																																																															tOuterClass,
																																																																																															eConstructorDeclaration,
																																																																																															eOuterClass,
																																																																																															tConstructorDef,
																																																																																															tSig,
																																																																																															tName,
																																																																																															eConstructorDeclarationToTSig,
																																																																																															eConstructorDeclarationToTName };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Constructor_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tParameterList, EObject eConstructorDeclarationToTParameterList,
			EObject eConstructorDeclarationToTConstructorDef, EObject mBodyToTAnnotation, EObject typeGraph,
			EObject tOuterClass, EObject eConstructorDeclaration, EObject eOuterClass, EObject tConstructorDef,
			EObject tSig, EObject tName, EObject eConstructorDeclarationToTSig,
			EObject eConstructorDeclarationToTName) {
		EMoflonEdge eConstructorDeclarationToTParameterList__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTParameterList__tParameterList____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTConstructorDef__tConstructorDef____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tConstructorDef____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tOuterClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tConstructorDef____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tOuterClass____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tParameterList____paramList = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tConstructorDef____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSig____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTSig__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTSig__tSig____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTName__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Constructor";
		String eConstructorDeclarationToTParameterList__eConstructorDeclaration____source_name_prime = "source";
		String eConstructorDeclarationToTParameterList__tParameterList____target_name_prime = "target";
		String eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source_name_prime = "source";
		String eConstructorDeclarationToTConstructorDef__tConstructorDef____target_name_prime = "target";
		String mBodyToTAnnotation__eConstructorDeclaration____source_name_prime = "source";
		String mBodyToTAnnotation__tConstructorDef____target_name_prime = "target";
		String tOuterClass__tSig____signature_name_prime = "signature";
		String tConstructorDef__tOuterClass____definedBy_name_prime = "definedBy";
		String tOuterClass__tConstructorDef____defines_name_prime = "defines";
		String eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tConstructorDef__tOuterClass____returnType_name_prime = "returnType";
		String tSig__tParameterList____paramList_name_prime = "paramList";
		String tSig__tConstructorDef____definitions_name_prime = "definitions";
		String tConstructorDef__tSig____signature_name_prime = "signature";
		String tSig__tName____method_name_prime = "method";
		String tName__tSig____signatures_name_prime = "signatures";
		String typeGraph__tName____methods_name_prime = "methods";
		String tName__typeGraph____pg_name_prime = "pg";
		String eConstructorDeclarationToTSig__eConstructorDeclaration____source_name_prime = "source";
		String eConstructorDeclarationToTSig__tSig____target_name_prime = "target";
		String eConstructorDeclarationToTName__eConstructorDeclaration____source_name_prime = "source";
		String eConstructorDeclarationToTName__tName____target_name_prime = "target";
		eConstructorDeclarationToTParameterList__eConstructorDeclaration____source
				.setSrc(eConstructorDeclarationToTParameterList);
		eConstructorDeclarationToTParameterList__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTParameterList__eConstructorDeclaration____source);
		eConstructorDeclarationToTParameterList__tParameterList____target
				.setSrc(eConstructorDeclarationToTParameterList);
		eConstructorDeclarationToTParameterList__tParameterList____target.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTParameterList__tParameterList____target);
		eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source
				.setSrc(eConstructorDeclarationToTConstructorDef);
		eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source);
		eConstructorDeclarationToTConstructorDef__tConstructorDef____target
				.setSrc(eConstructorDeclarationToTConstructorDef);
		eConstructorDeclarationToTConstructorDef__tConstructorDef____target.setTrg(tConstructorDef);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTConstructorDef__tConstructorDef____target);
		mBodyToTAnnotation__eConstructorDeclaration____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eConstructorDeclaration____source);
		mBodyToTAnnotation__tConstructorDef____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tConstructorDef____target.setTrg(tConstructorDef);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tConstructorDef____target);
		tOuterClass__tSig____signature.setSrc(tOuterClass);
		tOuterClass__tSig____signature.setTrg(tSig);
		ruleresult.getCreatedEdges().add(tOuterClass__tSig____signature);
		tConstructorDef__tOuterClass____definedBy.setSrc(tConstructorDef);
		tConstructorDef__tOuterClass____definedBy.setTrg(tOuterClass);
		ruleresult.getCreatedEdges().add(tConstructorDef__tOuterClass____definedBy);
		tOuterClass__tConstructorDef____defines.setSrc(tOuterClass);
		tOuterClass__tConstructorDef____defines.setTrg(tConstructorDef);
		ruleresult.getCreatedEdges().add(tOuterClass__tConstructorDef____defines);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setTrg(eConstructorDeclaration);
		ruleresult.getTranslatedEdges().add(eOuterClass__eConstructorDeclaration____bodyDeclarations);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		ruleresult.getTranslatedEdges().add(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration);
		tConstructorDef__tOuterClass____returnType.setSrc(tConstructorDef);
		tConstructorDef__tOuterClass____returnType.setTrg(tOuterClass);
		ruleresult.getCreatedEdges().add(tConstructorDef__tOuterClass____returnType);
		tSig__tParameterList____paramList.setSrc(tSig);
		tSig__tParameterList____paramList.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(tSig__tParameterList____paramList);
		tSig__tConstructorDef____definitions.setSrc(tSig);
		tSig__tConstructorDef____definitions.setTrg(tConstructorDef);
		ruleresult.getCreatedEdges().add(tSig__tConstructorDef____definitions);
		tConstructorDef__tSig____signature.setSrc(tConstructorDef);
		tConstructorDef__tSig____signature.setTrg(tSig);
		ruleresult.getCreatedEdges().add(tConstructorDef__tSig____signature);
		tSig__tName____method.setSrc(tSig);
		tSig__tName____method.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSig__tName____method);
		tName__tSig____signatures.setSrc(tName);
		tName__tSig____signatures.setTrg(tSig);
		ruleresult.getCreatedEdges().add(tName__tSig____signatures);
		typeGraph__tName____methods.setSrc(typeGraph);
		typeGraph__tName____methods.setTrg(tName);
		ruleresult.getCreatedEdges().add(typeGraph__tName____methods);
		tName__typeGraph____pg.setSrc(tName);
		tName__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tName__typeGraph____pg);
		eConstructorDeclarationToTSig__eConstructorDeclaration____source.setSrc(eConstructorDeclarationToTSig);
		eConstructorDeclarationToTSig__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTSig__eConstructorDeclaration____source);
		eConstructorDeclarationToTSig__tSig____target.setSrc(eConstructorDeclarationToTSig);
		eConstructorDeclarationToTSig__tSig____target.setTrg(tSig);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTSig__tSig____target);
		eConstructorDeclarationToTName__eConstructorDeclaration____source.setSrc(eConstructorDeclarationToTName);
		eConstructorDeclarationToTName__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTName__eConstructorDeclaration____source);
		eConstructorDeclarationToTName__tName____target.setSrc(eConstructorDeclarationToTName);
		eConstructorDeclarationToTName__tName____target.setTrg(tName);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTName__tName____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eConstructorDeclarationToTParameterList__eConstructorDeclaration____source
				.setName(eConstructorDeclarationToTParameterList__eConstructorDeclaration____source_name_prime);
		eConstructorDeclarationToTParameterList__tParameterList____target
				.setName(eConstructorDeclarationToTParameterList__tParameterList____target_name_prime);
		eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source
				.setName(eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source_name_prime);
		eConstructorDeclarationToTConstructorDef__tConstructorDef____target
				.setName(eConstructorDeclarationToTConstructorDef__tConstructorDef____target_name_prime);
		mBodyToTAnnotation__eConstructorDeclaration____source
				.setName(mBodyToTAnnotation__eConstructorDeclaration____source_name_prime);
		mBodyToTAnnotation__tConstructorDef____target.setName(mBodyToTAnnotation__tConstructorDef____target_name_prime);
		tOuterClass__tSig____signature.setName(tOuterClass__tSig____signature_name_prime);
		tConstructorDef__tOuterClass____definedBy.setName(tConstructorDef__tOuterClass____definedBy_name_prime);
		tOuterClass__tConstructorDef____defines.setName(tOuterClass__tConstructorDef____defines_name_prime);
		eOuterClass__eConstructorDeclaration____bodyDeclarations
				.setName(eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		tConstructorDef__tOuterClass____returnType.setName(tConstructorDef__tOuterClass____returnType_name_prime);
		tSig__tParameterList____paramList.setName(tSig__tParameterList____paramList_name_prime);
		tSig__tConstructorDef____definitions.setName(tSig__tConstructorDef____definitions_name_prime);
		tConstructorDef__tSig____signature.setName(tConstructorDef__tSig____signature_name_prime);
		tSig__tName____method.setName(tSig__tName____method_name_prime);
		tName__tSig____signatures.setName(tName__tSig____signatures_name_prime);
		typeGraph__tName____methods.setName(typeGraph__tName____methods_name_prime);
		tName__typeGraph____pg.setName(tName__typeGraph____pg_name_prime);
		eConstructorDeclarationToTSig__eConstructorDeclaration____source
				.setName(eConstructorDeclarationToTSig__eConstructorDeclaration____source_name_prime);
		eConstructorDeclarationToTSig__tSig____target.setName(eConstructorDeclarationToTSig__tSig____target_name_prime);
		eConstructorDeclarationToTName__eConstructorDeclaration____source
				.setName(eConstructorDeclarationToTName__eConstructorDeclaration____source_name_prime);
		eConstructorDeclarationToTName__tName____target
				.setName(eConstructorDeclarationToTName__tName____target_name_prime);
		return new Object[] { ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, typeGraph, tOuterClass,
				eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName, eConstructorDeclarationToTSig,
				eConstructorDeclarationToTName,
				eConstructorDeclarationToTParameterList__eConstructorDeclaration____source,
				eConstructorDeclarationToTParameterList__tParameterList____target,
				eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source,
				eConstructorDeclarationToTConstructorDef__tConstructorDef____target,
				mBodyToTAnnotation__eConstructorDeclaration____source, mBodyToTAnnotation__tConstructorDef____target,
				tOuterClass__tSig____signature, tConstructorDef__tOuterClass____definedBy,
				tOuterClass__tConstructorDef____defines, eOuterClass__eConstructorDeclaration____bodyDeclarations,
				eConstructorDeclaration__eOuterClass____abstractTypeDeclaration,
				tConstructorDef__tOuterClass____returnType, tSig__tParameterList____paramList,
				tSig__tConstructorDef____definitions, tConstructorDef__tSig____signature, tSig__tName____method,
				tName__tSig____signatures, typeGraph__tName____methods, tName__typeGraph____pg,
				eConstructorDeclarationToTSig__eConstructorDeclaration____source,
				eConstructorDeclarationToTSig__tSig____target,
				eConstructorDeclarationToTName__eConstructorDeclaration____source,
				eConstructorDeclarationToTName__tName____target };
	}

	public static final void pattern_Constructor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(Constructor _this,
			PerformRuleResult ruleresult, EObject tParameterList, EObject eConstructorDeclarationToTParameterList,
			EObject eConstructorDeclarationToTConstructorDef, EObject eOuterClassToTOuterClass,
			EObject mBodyToTAnnotation, EObject typeGraph, EObject tOuterClass, EObject eConstructorDeclaration,
			EObject eOuterClass, EObject tConstructorDef, EObject tSig, EObject tName,
			EObject eConstructorDeclarationToTSig, EObject eConstructorDeclarationToTName) {
		_this.registerObjects_FWD(ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, eOuterClassToTOuterClass, mBodyToTAnnotation, typeGraph,
				tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName,
				eConstructorDeclarationToTSig, eConstructorDeclarationToTName);

	}

	public static final PerformRuleResult pattern_Constructor_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Constructor_2_1_preparereturnvalue_bindingFB(Constructor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_2_1_preparereturnvalue_blackFBB(EClass eClass, Constructor _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Constructor_2_1_preparereturnvalue_bindingAndBlackFFB(Constructor _this) {
		Object[] result_pattern_Constructor_2_1_preparereturnvalue_binding = pattern_Constructor_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Constructor_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Constructor_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Constructor_2_1_preparereturnvalue_black = pattern_Constructor_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Constructor_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Constructor_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Constructor";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Constructor_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eConstructorDeclaration");
		EObject _localVariable_1 = match.getObject("eOuterClass");
		EObject tmpEConstructorDeclaration = _localVariable_0;
		EObject tmpEOuterClass = _localVariable_1;
		if (tmpEConstructorDeclaration instanceof MConstructorDefinition) {
			MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) tmpEConstructorDeclaration;
			if (tmpEOuterClass instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) tmpEOuterClass;
				return new Object[] { eConstructorDeclaration, eOuterClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Constructor_2_2_corematch_blackFFBBB(
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eOuterClass, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTOuterClass = eOuterClassToTOuterClass.getTarget();
			if (tmpTOuterClass instanceof TClass) {
				TClass tOuterClass = (TClass) tmpTOuterClass;
				_result.add(new Object[] { eOuterClassToTOuterClass, tOuterClass, eConstructorDeclaration, eOuterClass,
						match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Constructor_2_3_findcontext_blackBFBBB(
			TypeToTAbstractType eOuterClassToTOuterClass, TClass tOuterClass,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
			if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
				if (eOuterClass.getBodyDeclarations().contains(eConstructorDeclaration)) {
					TypeGraph typeGraph = tOuterClass.getPg();
					if (typeGraph != null) {
						_result.add(new Object[] { eOuterClassToTOuterClass, typeGraph, tOuterClass,
								eConstructorDeclaration, eOuterClass });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Constructor_2_3_findcontext_greenBBBBBFFFFFFF(
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass__typeGraph____pg);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setTrg(eConstructorDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass__eConstructorDeclaration____bodyDeclarations);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		eOuterClass__eConstructorDeclaration____bodyDeclarations
				.setName(eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		return new Object[] { eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass,
				isApplicableMatch, eOuterClassToTOuterClass__eOuterClass____source,
				eOuterClassToTOuterClass__tOuterClass____target, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg, eOuterClass__eConstructorDeclaration____bodyDeclarations,
				eConstructorDeclaration__eOuterClass____abstractTypeDeclaration };
	}

	public static final Object[] pattern_Constructor_2_4_solveCSP_bindingFBBBBBBB(Constructor _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph,
			TClass tOuterClass, MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eOuterClassToTOuterClass, typeGraph,
				tOuterClass, eConstructorDeclaration, eOuterClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, typeGraph, tOuterClass,
					eConstructorDeclaration, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Constructor_2_4_solveCSP_bindingAndBlackFBBBBBBB(Constructor _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph,
			TClass tOuterClass, MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		Object[] result_pattern_Constructor_2_4_solveCSP_binding = pattern_Constructor_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration,
				eOuterClass);
		if (result_pattern_Constructor_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Constructor_2_4_solveCSP_binding[0];

			Object[] result_pattern_Constructor_2_4_solveCSP_black = pattern_Constructor_2_4_solveCSP_blackB(csp);
			if (result_pattern_Constructor_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, typeGraph, tOuterClass,
						eConstructorDeclaration, eOuterClass };
			}
		}
		return null;
	}

	public static final boolean pattern_Constructor_2_5_checkCSP_expressionFBB(Constructor _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Constructor_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Constructor_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Constructor";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Constructor_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Constructor_10_1_initialbindings_blackBBBBBBBB(Constructor _this, Match match,
			TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName) {
		return new Object[] { _this, match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName };
	}

	public static final Object[] pattern_Constructor_10_2_SolveCSP_bindingFBBBBBBBB(Constructor _this, Match match,
			TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tParameterList, typeGraph, tOuterClass,
				tConstructorDef, tSig, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig,
					tName };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Constructor_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(Constructor _this,
			Match match, TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName) {
		Object[] result_pattern_Constructor_10_2_SolveCSP_binding = pattern_Constructor_10_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName);
		if (result_pattern_Constructor_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Constructor_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Constructor_10_2_SolveCSP_black = pattern_Constructor_10_2_SolveCSP_blackB(csp);
			if (result_pattern_Constructor_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig,
						tName };
			}
		}
		return null;
	}

	public static final boolean pattern_Constructor_10_3_CheckCSP_expressionFBB(Constructor _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Constructor_10_4_collectelementstobetranslated_blackBBBBBBB(Match match,
			TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName) {
		return new Object[] { match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName };
	}

	public static final Object[] pattern_Constructor_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFFF(
			Match match, TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName) {
		EMoflonEdge tOuterClass__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tOuterClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tConstructorDef____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tOuterClass____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tParameterList____paramList = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tConstructorDef____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSig____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tParameterList);
		match.getToBeTranslatedNodes().add(tConstructorDef);
		match.getToBeTranslatedNodes().add(tSig);
		match.getToBeTranslatedNodes().add(tName);
		String tOuterClass__tSig____signature_name_prime = "signature";
		String tConstructorDef__tOuterClass____definedBy_name_prime = "definedBy";
		String tOuterClass__tConstructorDef____defines_name_prime = "defines";
		String tConstructorDef__tOuterClass____returnType_name_prime = "returnType";
		String tSig__tParameterList____paramList_name_prime = "paramList";
		String tSig__tConstructorDef____definitions_name_prime = "definitions";
		String tConstructorDef__tSig____signature_name_prime = "signature";
		String tSig__tName____method_name_prime = "method";
		String tName__tSig____signatures_name_prime = "signatures";
		String typeGraph__tName____methods_name_prime = "methods";
		String tName__typeGraph____pg_name_prime = "pg";
		tOuterClass__tSig____signature.setSrc(tOuterClass);
		tOuterClass__tSig____signature.setTrg(tSig);
		match.getToBeTranslatedEdges().add(tOuterClass__tSig____signature);
		tConstructorDef__tOuterClass____definedBy.setSrc(tConstructorDef);
		tConstructorDef__tOuterClass____definedBy.setTrg(tOuterClass);
		match.getToBeTranslatedEdges().add(tConstructorDef__tOuterClass____definedBy);
		tOuterClass__tConstructorDef____defines.setSrc(tOuterClass);
		tOuterClass__tConstructorDef____defines.setTrg(tConstructorDef);
		match.getToBeTranslatedEdges().add(tOuterClass__tConstructorDef____defines);
		tConstructorDef__tOuterClass____returnType.setSrc(tConstructorDef);
		tConstructorDef__tOuterClass____returnType.setTrg(tOuterClass);
		match.getToBeTranslatedEdges().add(tConstructorDef__tOuterClass____returnType);
		tSig__tParameterList____paramList.setSrc(tSig);
		tSig__tParameterList____paramList.setTrg(tParameterList);
		match.getToBeTranslatedEdges().add(tSig__tParameterList____paramList);
		tSig__tConstructorDef____definitions.setSrc(tSig);
		tSig__tConstructorDef____definitions.setTrg(tConstructorDef);
		match.getToBeTranslatedEdges().add(tSig__tConstructorDef____definitions);
		tConstructorDef__tSig____signature.setSrc(tConstructorDef);
		tConstructorDef__tSig____signature.setTrg(tSig);
		match.getToBeTranslatedEdges().add(tConstructorDef__tSig____signature);
		tSig__tName____method.setSrc(tSig);
		tSig__tName____method.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSig__tName____method);
		tName__tSig____signatures.setSrc(tName);
		tName__tSig____signatures.setTrg(tSig);
		match.getToBeTranslatedEdges().add(tName__tSig____signatures);
		typeGraph__tName____methods.setSrc(typeGraph);
		typeGraph__tName____methods.setTrg(tName);
		match.getToBeTranslatedEdges().add(typeGraph__tName____methods);
		tName__typeGraph____pg.setSrc(tName);
		tName__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tName__typeGraph____pg);
		tOuterClass__tSig____signature.setName(tOuterClass__tSig____signature_name_prime);
		tConstructorDef__tOuterClass____definedBy.setName(tConstructorDef__tOuterClass____definedBy_name_prime);
		tOuterClass__tConstructorDef____defines.setName(tOuterClass__tConstructorDef____defines_name_prime);
		tConstructorDef__tOuterClass____returnType.setName(tConstructorDef__tOuterClass____returnType_name_prime);
		tSig__tParameterList____paramList.setName(tSig__tParameterList____paramList_name_prime);
		tSig__tConstructorDef____definitions.setName(tSig__tConstructorDef____definitions_name_prime);
		tConstructorDef__tSig____signature.setName(tConstructorDef__tSig____signature_name_prime);
		tSig__tName____method.setName(tSig__tName____method_name_prime);
		tName__tSig____signatures.setName(tName__tSig____signatures_name_prime);
		typeGraph__tName____methods.setName(typeGraph__tName____methods_name_prime);
		tName__typeGraph____pg.setName(tName__typeGraph____pg_name_prime);
		return new Object[] { match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName,
				tOuterClass__tSig____signature, tConstructorDef__tOuterClass____definedBy,
				tOuterClass__tConstructorDef____defines, tConstructorDef__tOuterClass____returnType,
				tSig__tParameterList____paramList, tSig__tConstructorDef____definitions,
				tConstructorDef__tSig____signature, tSig__tName____method, tName__tSig____signatures,
				typeGraph__tName____methods, tName__typeGraph____pg };
	}

	public static final Object[] pattern_Constructor_10_5_collectcontextelements_blackBBBBBBB(Match match,
			TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName) {
		return new Object[] { match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName };
	}

	public static final Object[] pattern_Constructor_10_5_collectcontextelements_greenBBBFF(Match match,
			TypeGraph typeGraph, TClass tOuterClass) {
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterClass);
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		match.getContextEdges().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		match.getContextEdges().add(tOuterClass__typeGraph____pg);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		return new Object[] { match, typeGraph, tOuterClass, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg };
	}

	public static final void pattern_Constructor_10_6_registerobjectstomatch_expressionBBBBBBBB(Constructor _this,
			Match match, TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName) {
		_this.registerObjectsToMatch_BWD(match, tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig, tName);

	}

	public static final boolean pattern_Constructor_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Constructor_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Constructor_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tParameterList");
		EObject _localVariable_1 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("tConstructorDef");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSig");
		EObject _localVariable_7 = isApplicableMatch.getObject("tName");
		EObject tmpTParameterList = _localVariable_0;
		EObject tmpEOuterClassToTOuterClass = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTOuterClass = _localVariable_3;
		EObject tmpEOuterClass = _localVariable_4;
		EObject tmpTConstructorDef = _localVariable_5;
		EObject tmpTSig = _localVariable_6;
		EObject tmpTName = _localVariable_7;
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
				TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpTOuterClass instanceof TClass) {
						TClass tOuterClass = (TClass) tmpTOuterClass;
						if (tmpEOuterClass instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) tmpEOuterClass;
							if (tmpTConstructorDef instanceof TMethodDefinition) {
								TMethodDefinition tConstructorDef = (TMethodDefinition) tmpTConstructorDef;
								if (tmpTSig instanceof TMethodSignature) {
									TMethodSignature tSig = (TMethodSignature) tmpTSig;
									if (tmpTName instanceof TMethod) {
										TMethod tName = (TMethod) tmpTName;
										return new Object[] { tParameterList, eOuterClassToTOuterClass, typeGraph,
												tOuterClass, eOuterClass, tConstructorDef, tSig, tName,
												isApplicableMatch };
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

	public static final Object[] pattern_Constructor_11_1_performtransformation_blackBBBBBBBBFBB(
			TParameterList tParameterList, TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph,
			TClass tOuterClass, AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName, Constructor _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass,
						tConstructorDef, tSig, tName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			Constructor _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Constructor_11_1_performtransformation_binding = pattern_Constructor_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Constructor_11_1_performtransformation_binding != null) {
			TParameterList tParameterList = (TParameterList) result_pattern_Constructor_11_1_performtransformation_binding[0];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result_pattern_Constructor_11_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_Constructor_11_1_performtransformation_binding[2];
			TClass tOuterClass = (TClass) result_pattern_Constructor_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) result_pattern_Constructor_11_1_performtransformation_binding[4];
			TMethodDefinition tConstructorDef = (TMethodDefinition) result_pattern_Constructor_11_1_performtransformation_binding[5];
			TMethodSignature tSig = (TMethodSignature) result_pattern_Constructor_11_1_performtransformation_binding[6];
			TMethod tName = (TMethod) result_pattern_Constructor_11_1_performtransformation_binding[7];

			Object[] result_pattern_Constructor_11_1_performtransformation_black = pattern_Constructor_11_1_performtransformation_blackBBBBBBBBFBB(
					tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass, tConstructorDef,
					tSig, tName, _this, isApplicableMatch);
			if (result_pattern_Constructor_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Constructor_11_1_performtransformation_black[8];

				return new Object[] { tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass,
						tConstructorDef, tSig, tName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_11_1_performtransformation_greenBFFFFBBBBFFB(
			TParameterList tParameterList, AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName, CSP csp) {
		MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList = ModiscoFactory.eINSTANCE
				.createMConstructorDefinitionToTParameterList();
		MDefinitionToTMember eConstructorDeclarationToTConstructorDef = ModiscoFactory.eINSTANCE
				.createMDefinitionToTMember();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		MConstructorDefinition eConstructorDeclaration = org.gravity.modisco.ModiscoFactory.eINSTANCE
				.createMConstructorDefinition();
		ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig = ModiscoFactory.eINSTANCE
				.createConstructorDeclarationToTMethodSignature();
		ConstructorDeclarationToTMethod eConstructorDeclarationToTName = ModiscoFactory.eINSTANCE
				.createConstructorDeclarationToTMethod();
		Object _localVariable_0 = csp.getValue("eConstructorDeclaration", "name");
		eConstructorDeclarationToTParameterList.setTarget(tParameterList);
		eConstructorDeclarationToTConstructorDef.setTarget(tConstructorDef);
		mBodyToTAnnotation.setTarget(tConstructorDef);
		eConstructorDeclarationToTParameterList.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTConstructorDef.setSource(eConstructorDeclaration);
		mBodyToTAnnotation.setSource(eConstructorDeclaration);
		eOuterClass.getBodyDeclarations().add(eConstructorDeclaration);
		eConstructorDeclarationToTSig.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTSig.setTarget(tSig);
		eConstructorDeclarationToTName.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTName.setTarget(tName);
		String eConstructorDeclaration_name_prime = (String) _localVariable_0;
		eConstructorDeclaration.setName(eConstructorDeclaration_name_prime);
		return new Object[] { tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, eConstructorDeclaration, eOuterClass,
				tConstructorDef, tSig, tName, eConstructorDeclarationToTSig, eConstructorDeclarationToTName, csp };
	}

	public static final Object[] pattern_Constructor_11_2_collecttranslatedelements_blackBBBBBBBBBB(
			TParameterList tParameterList,
			MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList,
			MDefinitionToTMember eConstructorDeclarationToTConstructorDef,
			BodyDeclarationToTAnnotatable mBodyToTAnnotation, MConstructorDefinition eConstructorDeclaration,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName,
			ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig,
			ConstructorDeclarationToTMethod eConstructorDeclarationToTName) {
		return new Object[] { tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef,
				tSig, tName, eConstructorDeclarationToTSig, eConstructorDeclarationToTName };
	}

	public static final Object[] pattern_Constructor_11_2_collecttranslatedelements_greenFBBBBBBBBBB(
			TParameterList tParameterList,
			MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList,
			MDefinitionToTMember eConstructorDeclarationToTConstructorDef,
			BodyDeclarationToTAnnotatable mBodyToTAnnotation, MConstructorDefinition eConstructorDeclaration,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName,
			ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig,
			ConstructorDeclarationToTMethod eConstructorDeclarationToTName) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tParameterList);
		ruleresult.getCreatedLinkElements().add(eConstructorDeclarationToTParameterList);
		ruleresult.getCreatedLinkElements().add(eConstructorDeclarationToTConstructorDef);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(eConstructorDeclaration);
		ruleresult.getTranslatedElements().add(tConstructorDef);
		ruleresult.getTranslatedElements().add(tSig);
		ruleresult.getTranslatedElements().add(tName);
		ruleresult.getCreatedLinkElements().add(eConstructorDeclarationToTSig);
		ruleresult.getCreatedLinkElements().add(eConstructorDeclarationToTName);
		return new Object[] { ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef,
				tSig, tName, eConstructorDeclarationToTSig, eConstructorDeclarationToTName };
	}

	public static final Object[] pattern_Constructor_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tParameterList, EObject eConstructorDeclarationToTParameterList,
			EObject eConstructorDeclarationToTConstructorDef, EObject eOuterClassToTOuterClass,
			EObject mBodyToTAnnotation, EObject typeGraph, EObject tOuterClass, EObject eConstructorDeclaration,
			EObject eOuterClass, EObject tConstructorDef, EObject tSig, EObject tName,
			EObject eConstructorDeclarationToTSig, EObject eConstructorDeclarationToTName) {
		if (!tParameterList.equals(typeGraph)) {
			if (!tParameterList.equals(tSig)) {
				if (!eConstructorDeclarationToTParameterList.equals(tParameterList)) {
					if (!eConstructorDeclarationToTParameterList.equals(eOuterClassToTOuterClass)) {
						if (!eConstructorDeclarationToTParameterList.equals(mBodyToTAnnotation)) {
							if (!eConstructorDeclarationToTParameterList.equals(typeGraph)) {
								if (!eConstructorDeclarationToTParameterList.equals(tOuterClass)) {
									if (!eConstructorDeclarationToTParameterList.equals(eOuterClass)) {
										if (!eConstructorDeclarationToTParameterList.equals(tConstructorDef)) {
											if (!eConstructorDeclarationToTParameterList.equals(tSig)) {
												if (!eConstructorDeclarationToTParameterList.equals(tName)) {
													if (!eConstructorDeclarationToTParameterList
															.equals(eConstructorDeclarationToTSig)) {
														if (!eConstructorDeclarationToTConstructorDef
																.equals(tParameterList)) {
															if (!eConstructorDeclarationToTConstructorDef
																	.equals(eConstructorDeclarationToTParameterList)) {
																if (!eConstructorDeclarationToTConstructorDef
																		.equals(eOuterClassToTOuterClass)) {
																	if (!eConstructorDeclarationToTConstructorDef
																			.equals(mBodyToTAnnotation)) {
																		if (!eConstructorDeclarationToTConstructorDef
																				.equals(typeGraph)) {
																			if (!eConstructorDeclarationToTConstructorDef
																					.equals(tOuterClass)) {
																				if (!eConstructorDeclarationToTConstructorDef
																						.equals(eOuterClass)) {
																					if (!eConstructorDeclarationToTConstructorDef
																							.equals(tConstructorDef)) {
																						if (!eConstructorDeclarationToTConstructorDef
																								.equals(tSig)) {
																							if (!eConstructorDeclarationToTConstructorDef
																									.equals(tName)) {
																								if (!eConstructorDeclarationToTConstructorDef
																										.equals(eConstructorDeclarationToTSig)) {
																									if (!eConstructorDeclarationToTConstructorDef
																											.equals(eConstructorDeclarationToTName)) {
																										if (!eOuterClassToTOuterClass
																												.equals(tParameterList)) {
																											if (!eOuterClassToTOuterClass
																													.equals(mBodyToTAnnotation)) {
																												if (!eOuterClassToTOuterClass
																														.equals(typeGraph)) {
																													if (!eOuterClassToTOuterClass
																															.equals(tOuterClass)) {
																														if (!eOuterClassToTOuterClass
																																.equals(tConstructorDef)) {
																															if (!eOuterClassToTOuterClass
																																	.equals(tSig)) {
																																if (!eOuterClassToTOuterClass
																																		.equals(tName)) {
																																	if (!mBodyToTAnnotation
																																			.equals(tParameterList)) {
																																		if (!mBodyToTAnnotation
																																				.equals(typeGraph)) {
																																			if (!mBodyToTAnnotation
																																					.equals(tOuterClass)) {
																																				if (!mBodyToTAnnotation
																																						.equals(tConstructorDef)) {
																																					if (!mBodyToTAnnotation
																																							.equals(tSig)) {
																																						if (!mBodyToTAnnotation
																																								.equals(tName)) {
																																							if (!tOuterClass
																																									.equals(tParameterList)) {
																																								if (!tOuterClass
																																										.equals(typeGraph)) {
																																									if (!tOuterClass
																																											.equals(tSig)) {
																																										if (!eConstructorDeclaration
																																												.equals(tParameterList)) {
																																											if (!eConstructorDeclaration
																																													.equals(eConstructorDeclarationToTParameterList)) {
																																												if (!eConstructorDeclaration
																																														.equals(eConstructorDeclarationToTConstructorDef)) {
																																													if (!eConstructorDeclaration
																																															.equals(eOuterClassToTOuterClass)) {
																																														if (!eConstructorDeclaration
																																																.equals(mBodyToTAnnotation)) {
																																															if (!eConstructorDeclaration
																																																	.equals(typeGraph)) {
																																																if (!eConstructorDeclaration
																																																		.equals(tOuterClass)) {
																																																	if (!eConstructorDeclaration
																																																			.equals(eOuterClass)) {
																																																		if (!eConstructorDeclaration
																																																				.equals(tConstructorDef)) {
																																																			if (!eConstructorDeclaration
																																																					.equals(tSig)) {
																																																				if (!eConstructorDeclaration
																																																						.equals(tName)) {
																																																					if (!eConstructorDeclaration
																																																							.equals(eConstructorDeclarationToTSig)) {
																																																						if (!eConstructorDeclaration
																																																								.equals(eConstructorDeclarationToTName)) {
																																																							if (!eOuterClass
																																																									.equals(tParameterList)) {
																																																								if (!eOuterClass
																																																										.equals(eOuterClassToTOuterClass)) {
																																																									if (!eOuterClass
																																																											.equals(mBodyToTAnnotation)) {
																																																										if (!eOuterClass
																																																												.equals(typeGraph)) {
																																																											if (!eOuterClass
																																																													.equals(tOuterClass)) {
																																																												if (!eOuterClass
																																																														.equals(tConstructorDef)) {
																																																													if (!eOuterClass
																																																															.equals(tSig)) {
																																																														if (!eOuterClass
																																																																.equals(tName)) {
																																																															if (!tConstructorDef
																																																																	.equals(tParameterList)) {
																																																																if (!tConstructorDef
																																																																		.equals(typeGraph)) {
																																																																	if (!tConstructorDef
																																																																			.equals(tOuterClass)) {
																																																																		if (!tConstructorDef
																																																																				.equals(tSig)) {
																																																																			if (!tConstructorDef
																																																																					.equals(tName)) {
																																																																				if (!tSig
																																																																						.equals(typeGraph)) {
																																																																					if (!tName
																																																																							.equals(tParameterList)) {
																																																																						if (!tName
																																																																								.equals(typeGraph)) {
																																																																							if (!tName
																																																																									.equals(tOuterClass)) {
																																																																								if (!tName
																																																																										.equals(tSig)) {
																																																																									if (!eConstructorDeclarationToTSig
																																																																											.equals(tParameterList)) {
																																																																										if (!eConstructorDeclarationToTSig
																																																																												.equals(eOuterClassToTOuterClass)) {
																																																																											if (!eConstructorDeclarationToTSig
																																																																													.equals(mBodyToTAnnotation)) {
																																																																												if (!eConstructorDeclarationToTSig
																																																																														.equals(typeGraph)) {
																																																																													if (!eConstructorDeclarationToTSig
																																																																															.equals(tOuterClass)) {
																																																																														if (!eConstructorDeclarationToTSig
																																																																																.equals(eOuterClass)) {
																																																																															if (!eConstructorDeclarationToTSig
																																																																																	.equals(tConstructorDef)) {
																																																																																if (!eConstructorDeclarationToTSig
																																																																																		.equals(tSig)) {
																																																																																	if (!eConstructorDeclarationToTSig
																																																																																			.equals(tName)) {
																																																																																		if (!eConstructorDeclarationToTName
																																																																																				.equals(tParameterList)) {
																																																																																			if (!eConstructorDeclarationToTName
																																																																																					.equals(eConstructorDeclarationToTParameterList)) {
																																																																																				if (!eConstructorDeclarationToTName
																																																																																						.equals(eOuterClassToTOuterClass)) {
																																																																																					if (!eConstructorDeclarationToTName
																																																																																							.equals(mBodyToTAnnotation)) {
																																																																																						if (!eConstructorDeclarationToTName
																																																																																								.equals(typeGraph)) {
																																																																																							if (!eConstructorDeclarationToTName
																																																																																									.equals(tOuterClass)) {
																																																																																								if (!eConstructorDeclarationToTName
																																																																																										.equals(eOuterClass)) {
																																																																																									if (!eConstructorDeclarationToTName
																																																																																											.equals(tConstructorDef)) {
																																																																																										if (!eConstructorDeclarationToTName
																																																																																												.equals(tSig)) {
																																																																																											if (!eConstructorDeclarationToTName
																																																																																													.equals(tName)) {
																																																																																												if (!eConstructorDeclarationToTName
																																																																																														.equals(eConstructorDeclarationToTSig)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															tParameterList,
																																																																																															eConstructorDeclarationToTParameterList,
																																																																																															eConstructorDeclarationToTConstructorDef,
																																																																																															eOuterClassToTOuterClass,
																																																																																															mBodyToTAnnotation,
																																																																																															typeGraph,
																																																																																															tOuterClass,
																																																																																															eConstructorDeclaration,
																																																																																															eOuterClass,
																																																																																															tConstructorDef,
																																																																																															tSig,
																																																																																															tName,
																																																																																															eConstructorDeclarationToTSig,
																																																																																															eConstructorDeclarationToTName };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Constructor_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tParameterList, EObject eConstructorDeclarationToTParameterList,
			EObject eConstructorDeclarationToTConstructorDef, EObject mBodyToTAnnotation, EObject typeGraph,
			EObject tOuterClass, EObject eConstructorDeclaration, EObject eOuterClass, EObject tConstructorDef,
			EObject tSig, EObject tName, EObject eConstructorDeclarationToTSig,
			EObject eConstructorDeclarationToTName) {
		EMoflonEdge eConstructorDeclarationToTParameterList__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTParameterList__tParameterList____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTConstructorDef__tConstructorDef____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tConstructorDef____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tOuterClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tConstructorDef____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tOuterClass____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tParameterList____paramList = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tConstructorDef____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSig____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTSig__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTSig__tSig____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTName__eConstructorDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclarationToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Constructor";
		String eConstructorDeclarationToTParameterList__eConstructorDeclaration____source_name_prime = "source";
		String eConstructorDeclarationToTParameterList__tParameterList____target_name_prime = "target";
		String eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source_name_prime = "source";
		String eConstructorDeclarationToTConstructorDef__tConstructorDef____target_name_prime = "target";
		String mBodyToTAnnotation__eConstructorDeclaration____source_name_prime = "source";
		String mBodyToTAnnotation__tConstructorDef____target_name_prime = "target";
		String tOuterClass__tSig____signature_name_prime = "signature";
		String tConstructorDef__tOuterClass____definedBy_name_prime = "definedBy";
		String tOuterClass__tConstructorDef____defines_name_prime = "defines";
		String eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tConstructorDef__tOuterClass____returnType_name_prime = "returnType";
		String tSig__tParameterList____paramList_name_prime = "paramList";
		String tSig__tConstructorDef____definitions_name_prime = "definitions";
		String tConstructorDef__tSig____signature_name_prime = "signature";
		String tSig__tName____method_name_prime = "method";
		String tName__tSig____signatures_name_prime = "signatures";
		String typeGraph__tName____methods_name_prime = "methods";
		String tName__typeGraph____pg_name_prime = "pg";
		String eConstructorDeclarationToTSig__eConstructorDeclaration____source_name_prime = "source";
		String eConstructorDeclarationToTSig__tSig____target_name_prime = "target";
		String eConstructorDeclarationToTName__eConstructorDeclaration____source_name_prime = "source";
		String eConstructorDeclarationToTName__tName____target_name_prime = "target";
		eConstructorDeclarationToTParameterList__eConstructorDeclaration____source
				.setSrc(eConstructorDeclarationToTParameterList);
		eConstructorDeclarationToTParameterList__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTParameterList__eConstructorDeclaration____source);
		eConstructorDeclarationToTParameterList__tParameterList____target
				.setSrc(eConstructorDeclarationToTParameterList);
		eConstructorDeclarationToTParameterList__tParameterList____target.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTParameterList__tParameterList____target);
		eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source
				.setSrc(eConstructorDeclarationToTConstructorDef);
		eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source);
		eConstructorDeclarationToTConstructorDef__tConstructorDef____target
				.setSrc(eConstructorDeclarationToTConstructorDef);
		eConstructorDeclarationToTConstructorDef__tConstructorDef____target.setTrg(tConstructorDef);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTConstructorDef__tConstructorDef____target);
		mBodyToTAnnotation__eConstructorDeclaration____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eConstructorDeclaration____source);
		mBodyToTAnnotation__tConstructorDef____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tConstructorDef____target.setTrg(tConstructorDef);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tConstructorDef____target);
		tOuterClass__tSig____signature.setSrc(tOuterClass);
		tOuterClass__tSig____signature.setTrg(tSig);
		ruleresult.getTranslatedEdges().add(tOuterClass__tSig____signature);
		tConstructorDef__tOuterClass____definedBy.setSrc(tConstructorDef);
		tConstructorDef__tOuterClass____definedBy.setTrg(tOuterClass);
		ruleresult.getTranslatedEdges().add(tConstructorDef__tOuterClass____definedBy);
		tOuterClass__tConstructorDef____defines.setSrc(tOuterClass);
		tOuterClass__tConstructorDef____defines.setTrg(tConstructorDef);
		ruleresult.getTranslatedEdges().add(tOuterClass__tConstructorDef____defines);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eOuterClass__eConstructorDeclaration____bodyDeclarations);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		ruleresult.getCreatedEdges().add(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration);
		tConstructorDef__tOuterClass____returnType.setSrc(tConstructorDef);
		tConstructorDef__tOuterClass____returnType.setTrg(tOuterClass);
		ruleresult.getTranslatedEdges().add(tConstructorDef__tOuterClass____returnType);
		tSig__tParameterList____paramList.setSrc(tSig);
		tSig__tParameterList____paramList.setTrg(tParameterList);
		ruleresult.getTranslatedEdges().add(tSig__tParameterList____paramList);
		tSig__tConstructorDef____definitions.setSrc(tSig);
		tSig__tConstructorDef____definitions.setTrg(tConstructorDef);
		ruleresult.getTranslatedEdges().add(tSig__tConstructorDef____definitions);
		tConstructorDef__tSig____signature.setSrc(tConstructorDef);
		tConstructorDef__tSig____signature.setTrg(tSig);
		ruleresult.getTranslatedEdges().add(tConstructorDef__tSig____signature);
		tSig__tName____method.setSrc(tSig);
		tSig__tName____method.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSig__tName____method);
		tName__tSig____signatures.setSrc(tName);
		tName__tSig____signatures.setTrg(tSig);
		ruleresult.getTranslatedEdges().add(tName__tSig____signatures);
		typeGraph__tName____methods.setSrc(typeGraph);
		typeGraph__tName____methods.setTrg(tName);
		ruleresult.getTranslatedEdges().add(typeGraph__tName____methods);
		tName__typeGraph____pg.setSrc(tName);
		tName__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tName__typeGraph____pg);
		eConstructorDeclarationToTSig__eConstructorDeclaration____source.setSrc(eConstructorDeclarationToTSig);
		eConstructorDeclarationToTSig__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTSig__eConstructorDeclaration____source);
		eConstructorDeclarationToTSig__tSig____target.setSrc(eConstructorDeclarationToTSig);
		eConstructorDeclarationToTSig__tSig____target.setTrg(tSig);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTSig__tSig____target);
		eConstructorDeclarationToTName__eConstructorDeclaration____source.setSrc(eConstructorDeclarationToTName);
		eConstructorDeclarationToTName__eConstructorDeclaration____source.setTrg(eConstructorDeclaration);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTName__eConstructorDeclaration____source);
		eConstructorDeclarationToTName__tName____target.setSrc(eConstructorDeclarationToTName);
		eConstructorDeclarationToTName__tName____target.setTrg(tName);
		ruleresult.getCreatedEdges().add(eConstructorDeclarationToTName__tName____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eConstructorDeclarationToTParameterList__eConstructorDeclaration____source
				.setName(eConstructorDeclarationToTParameterList__eConstructorDeclaration____source_name_prime);
		eConstructorDeclarationToTParameterList__tParameterList____target
				.setName(eConstructorDeclarationToTParameterList__tParameterList____target_name_prime);
		eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source
				.setName(eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source_name_prime);
		eConstructorDeclarationToTConstructorDef__tConstructorDef____target
				.setName(eConstructorDeclarationToTConstructorDef__tConstructorDef____target_name_prime);
		mBodyToTAnnotation__eConstructorDeclaration____source
				.setName(mBodyToTAnnotation__eConstructorDeclaration____source_name_prime);
		mBodyToTAnnotation__tConstructorDef____target.setName(mBodyToTAnnotation__tConstructorDef____target_name_prime);
		tOuterClass__tSig____signature.setName(tOuterClass__tSig____signature_name_prime);
		tConstructorDef__tOuterClass____definedBy.setName(tConstructorDef__tOuterClass____definedBy_name_prime);
		tOuterClass__tConstructorDef____defines.setName(tOuterClass__tConstructorDef____defines_name_prime);
		eOuterClass__eConstructorDeclaration____bodyDeclarations
				.setName(eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		tConstructorDef__tOuterClass____returnType.setName(tConstructorDef__tOuterClass____returnType_name_prime);
		tSig__tParameterList____paramList.setName(tSig__tParameterList____paramList_name_prime);
		tSig__tConstructorDef____definitions.setName(tSig__tConstructorDef____definitions_name_prime);
		tConstructorDef__tSig____signature.setName(tConstructorDef__tSig____signature_name_prime);
		tSig__tName____method.setName(tSig__tName____method_name_prime);
		tName__tSig____signatures.setName(tName__tSig____signatures_name_prime);
		typeGraph__tName____methods.setName(typeGraph__tName____methods_name_prime);
		tName__typeGraph____pg.setName(tName__typeGraph____pg_name_prime);
		eConstructorDeclarationToTSig__eConstructorDeclaration____source
				.setName(eConstructorDeclarationToTSig__eConstructorDeclaration____source_name_prime);
		eConstructorDeclarationToTSig__tSig____target.setName(eConstructorDeclarationToTSig__tSig____target_name_prime);
		eConstructorDeclarationToTName__eConstructorDeclaration____source
				.setName(eConstructorDeclarationToTName__eConstructorDeclaration____source_name_prime);
		eConstructorDeclarationToTName__tName____target
				.setName(eConstructorDeclarationToTName__tName____target_name_prime);
		return new Object[] { ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, typeGraph, tOuterClass,
				eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName, eConstructorDeclarationToTSig,
				eConstructorDeclarationToTName,
				eConstructorDeclarationToTParameterList__eConstructorDeclaration____source,
				eConstructorDeclarationToTParameterList__tParameterList____target,
				eConstructorDeclarationToTConstructorDef__eConstructorDeclaration____source,
				eConstructorDeclarationToTConstructorDef__tConstructorDef____target,
				mBodyToTAnnotation__eConstructorDeclaration____source, mBodyToTAnnotation__tConstructorDef____target,
				tOuterClass__tSig____signature, tConstructorDef__tOuterClass____definedBy,
				tOuterClass__tConstructorDef____defines, eOuterClass__eConstructorDeclaration____bodyDeclarations,
				eConstructorDeclaration__eOuterClass____abstractTypeDeclaration,
				tConstructorDef__tOuterClass____returnType, tSig__tParameterList____paramList,
				tSig__tConstructorDef____definitions, tConstructorDef__tSig____signature, tSig__tName____method,
				tName__tSig____signatures, typeGraph__tName____methods, tName__typeGraph____pg,
				eConstructorDeclarationToTSig__eConstructorDeclaration____source,
				eConstructorDeclarationToTSig__tSig____target,
				eConstructorDeclarationToTName__eConstructorDeclaration____source,
				eConstructorDeclarationToTName__tName____target };
	}

	public static final void pattern_Constructor_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(Constructor _this,
			PerformRuleResult ruleresult, EObject tParameterList, EObject eConstructorDeclarationToTParameterList,
			EObject eConstructorDeclarationToTConstructorDef, EObject eOuterClassToTOuterClass,
			EObject mBodyToTAnnotation, EObject typeGraph, EObject tOuterClass, EObject eConstructorDeclaration,
			EObject eOuterClass, EObject tConstructorDef, EObject tSig, EObject tName,
			EObject eConstructorDeclarationToTSig, EObject eConstructorDeclarationToTName) {
		_this.registerObjects_BWD(ruleresult, tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, eOuterClassToTOuterClass, mBodyToTAnnotation, typeGraph,
				tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName,
				eConstructorDeclarationToTSig, eConstructorDeclarationToTName);

	}

	public static final PerformRuleResult pattern_Constructor_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Constructor_12_1_preparereturnvalue_bindingFB(Constructor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_12_1_preparereturnvalue_blackFBB(EClass eClass,
			Constructor _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Constructor_12_1_preparereturnvalue_bindingAndBlackFFB(Constructor _this) {
		Object[] result_pattern_Constructor_12_1_preparereturnvalue_binding = pattern_Constructor_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Constructor_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Constructor_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Constructor_12_1_preparereturnvalue_black = pattern_Constructor_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Constructor_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Constructor_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Constructor";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Constructor_12_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tParameterList");
		EObject _localVariable_1 = match.getObject("typeGraph");
		EObject _localVariable_2 = match.getObject("tOuterClass");
		EObject _localVariable_3 = match.getObject("tConstructorDef");
		EObject _localVariable_4 = match.getObject("tSig");
		EObject _localVariable_5 = match.getObject("tName");
		EObject tmpTParameterList = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTOuterClass = _localVariable_2;
		EObject tmpTConstructorDef = _localVariable_3;
		EObject tmpTSig = _localVariable_4;
		EObject tmpTName = _localVariable_5;
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTOuterClass instanceof TClass) {
					TClass tOuterClass = (TClass) tmpTOuterClass;
					if (tmpTConstructorDef instanceof TMethodDefinition) {
						TMethodDefinition tConstructorDef = (TMethodDefinition) tmpTConstructorDef;
						if (tmpTSig instanceof TMethodSignature) {
							TMethodSignature tSig = (TMethodSignature) tmpTSig;
							if (tmpTName instanceof TMethod) {
								TMethod tName = (TMethod) tmpTName;
								return new Object[] { tParameterList, typeGraph, tOuterClass, tConstructorDef, tSig,
										tName, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Constructor_12_2_corematch_blackBFBBFBBBB(
			TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tOuterClass, TypeToTAbstractType.class, "target")) {
			Type tmpEOuterClass = eOuterClassToTOuterClass.getSource();
			if (tmpEOuterClass instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) tmpEOuterClass;
				_result.add(new Object[] { tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass,
						eOuterClass, tConstructorDef, tSig, tName, match });
			}

		}
		return _result;
	}

	public static final Object[] pattern_Constructor_12_3_findcontext_black_nac_0B(
			AbstractTypeDeclaration eOuterClass) {
		AnonymousClassDeclaration anonymousClassDeclaration = eOuterClass.getAnonymousClassDeclarationOwner();
		if (anonymousClassDeclaration != null) {
			return new Object[] { eOuterClass };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_Constructor_12_3_findcontext_blackBBBBBBBB(
			TParameterList tParameterList, TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph,
			TClass tOuterClass, AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
			if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
				if (tOuterClass.getSignature().contains(tSig)) {
					if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
						if (tOuterClass.equals(tConstructorDef.getDefinedBy())) {
							if (tOuterClass.equals(tConstructorDef.getReturnType())) {
								if (tParameterList.equals(tSig.getParamList())) {
									if (tSig.getDefinitions().contains(tConstructorDef)) {
										if (tName.equals(tSig.getMethod())) {
											if (typeGraph.getMethods().contains(tName)) {
												if (pattern_Constructor_12_3_findcontext_black_nac_0B(
														eOuterClass) == null) {
													_result.add(new Object[] { tParameterList, eOuterClassToTOuterClass,
															typeGraph, tOuterClass, eOuterClass, tConstructorDef, tSig,
															tName });
												}
											}
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

	public static final Object[] pattern_Constructor_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFFFFF(
			TParameterList tParameterList, TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph,
			TClass tOuterClass, AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef,
			TMethodSignature tSig, TMethod tName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tOuterClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tConstructorDef____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tOuterClass____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tParameterList____paramList = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tConstructorDef____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tConstructorDef__tSig____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSig__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSig____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String tOuterClass__tSig____signature_name_prime = "signature";
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tConstructorDef__tOuterClass____definedBy_name_prime = "definedBy";
		String tOuterClass__tConstructorDef____defines_name_prime = "defines";
		String tConstructorDef__tOuterClass____returnType_name_prime = "returnType";
		String tSig__tParameterList____paramList_name_prime = "paramList";
		String tSig__tConstructorDef____definitions_name_prime = "definitions";
		String tConstructorDef__tSig____signature_name_prime = "signature";
		String tSig__tName____method_name_prime = "method";
		String tName__tSig____signatures_name_prime = "signatures";
		String typeGraph__tName____methods_name_prime = "methods";
		String tName__typeGraph____pg_name_prime = "pg";
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(tConstructorDef);
		isApplicableMatch.getAllContextElements().add(tSig);
		isApplicableMatch.getAllContextElements().add(tName);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		tOuterClass__tSig____signature.setSrc(tOuterClass);
		tOuterClass__tSig____signature.setTrg(tSig);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tSig____signature);
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass__typeGraph____pg);
		tConstructorDef__tOuterClass____definedBy.setSrc(tConstructorDef);
		tConstructorDef__tOuterClass____definedBy.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tConstructorDef__tOuterClass____definedBy);
		tOuterClass__tConstructorDef____defines.setSrc(tOuterClass);
		tOuterClass__tConstructorDef____defines.setTrg(tConstructorDef);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tConstructorDef____defines);
		tConstructorDef__tOuterClass____returnType.setSrc(tConstructorDef);
		tConstructorDef__tOuterClass____returnType.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tConstructorDef__tOuterClass____returnType);
		tSig__tParameterList____paramList.setSrc(tSig);
		tSig__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(tSig__tParameterList____paramList);
		tSig__tConstructorDef____definitions.setSrc(tSig);
		tSig__tConstructorDef____definitions.setTrg(tConstructorDef);
		isApplicableMatch.getAllContextElements().add(tSig__tConstructorDef____definitions);
		tConstructorDef__tSig____signature.setSrc(tConstructorDef);
		tConstructorDef__tSig____signature.setTrg(tSig);
		isApplicableMatch.getAllContextElements().add(tConstructorDef__tSig____signature);
		tSig__tName____method.setSrc(tSig);
		tSig__tName____method.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSig__tName____method);
		tName__tSig____signatures.setSrc(tName);
		tName__tSig____signatures.setTrg(tSig);
		isApplicableMatch.getAllContextElements().add(tName__tSig____signatures);
		typeGraph__tName____methods.setSrc(typeGraph);
		typeGraph__tName____methods.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(typeGraph__tName____methods);
		tName__typeGraph____pg.setSrc(tName);
		tName__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tName__typeGraph____pg);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		tOuterClass__tSig____signature.setName(tOuterClass__tSig____signature_name_prime);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tConstructorDef__tOuterClass____definedBy.setName(tConstructorDef__tOuterClass____definedBy_name_prime);
		tOuterClass__tConstructorDef____defines.setName(tOuterClass__tConstructorDef____defines_name_prime);
		tConstructorDef__tOuterClass____returnType.setName(tConstructorDef__tOuterClass____returnType_name_prime);
		tSig__tParameterList____paramList.setName(tSig__tParameterList____paramList_name_prime);
		tSig__tConstructorDef____definitions.setName(tSig__tConstructorDef____definitions_name_prime);
		tConstructorDef__tSig____signature.setName(tConstructorDef__tSig____signature_name_prime);
		tSig__tName____method.setName(tSig__tName____method_name_prime);
		tName__tSig____signatures.setName(tName__tSig____signatures_name_prime);
		typeGraph__tName____methods.setName(typeGraph__tName____methods_name_prime);
		tName__typeGraph____pg.setName(tName__typeGraph____pg_name_prime);
		return new Object[] { tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass,
				tConstructorDef, tSig, tName, isApplicableMatch, eOuterClassToTOuterClass__eOuterClass____source,
				eOuterClassToTOuterClass__tOuterClass____target, tOuterClass__tSig____signature,
				typeGraph__tOuterClass____ownedTypes, tOuterClass__typeGraph____pg,
				tConstructorDef__tOuterClass____definedBy, tOuterClass__tConstructorDef____defines,
				tConstructorDef__tOuterClass____returnType, tSig__tParameterList____paramList,
				tSig__tConstructorDef____definitions, tConstructorDef__tSig____signature, tSig__tName____method,
				tName__tSig____signatures, typeGraph__tName____methods, tName__typeGraph____pg };
	}

	public static final Object[] pattern_Constructor_12_4_solveCSP_bindingFBBBBBBBBBB(Constructor _this,
			IsApplicableMatch isApplicableMatch, TParameterList tParameterList,
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig,
			TMethod tName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tParameterList,
				eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass, tConstructorDef, tSig, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tParameterList, eOuterClassToTOuterClass, typeGraph,
					tOuterClass, eOuterClass, tConstructorDef, tSig, tName };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Constructor_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(Constructor _this,
			IsApplicableMatch isApplicableMatch, TParameterList tParameterList,
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig,
			TMethod tName) {
		Object[] result_pattern_Constructor_12_4_solveCSP_binding = pattern_Constructor_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass,
				tConstructorDef, tSig, tName);
		if (result_pattern_Constructor_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Constructor_12_4_solveCSP_binding[0];

			Object[] result_pattern_Constructor_12_4_solveCSP_black = pattern_Constructor_12_4_solveCSP_blackB(csp);
			if (result_pattern_Constructor_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tParameterList, eOuterClassToTOuterClass,
						typeGraph, tOuterClass, eOuterClass, tConstructorDef, tSig, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_Constructor_12_5_checkCSP_expressionFBB(Constructor _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Constructor_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Constructor_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Constructor";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Constructor_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Constructor_20_1_preparereturnvalue_bindingFB(Constructor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			Constructor _this) {
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

	public static final Object[] pattern_Constructor_20_1_preparereturnvalue_bindingAndBlackFFBF(Constructor _this) {
		Object[] result_pattern_Constructor_20_1_preparereturnvalue_binding = pattern_Constructor_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Constructor_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Constructor_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Constructor_20_1_preparereturnvalue_black = pattern_Constructor_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Constructor_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Constructor_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Constructor_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Constructor_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEOuterClass = _edge_bodyDeclarations.getSrc();
		if (tmpEOuterClass instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) tmpEOuterClass;
			EObject tmpEConstructorDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpEConstructorDeclaration instanceof MConstructorDefinition) {
				MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) tmpEConstructorDeclaration;
				if (eOuterClass.getBodyDeclarations().contains(eConstructorDeclaration)) {
					_result.add(new Object[] { eConstructorDeclaration, eOuterClass, _edge_bodyDeclarations });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Constructor_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Constructor_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			Constructor _this, Match match, MConstructorDefinition eConstructorDeclaration,
			AbstractTypeDeclaration eOuterClass) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eConstructorDeclaration, eOuterClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Constructor_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Constructor _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Constructor_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Constructor_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Constructor_21_1_preparereturnvalue_bindingFB(Constructor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			Constructor _this) {
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

	public static final Object[] pattern_Constructor_21_1_preparereturnvalue_bindingAndBlackFFBF(Constructor _this) {
		Object[] result_pattern_Constructor_21_1_preparereturnvalue_binding = pattern_Constructor_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Constructor_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Constructor_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Constructor_21_1_preparereturnvalue_black = pattern_Constructor_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Constructor_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Constructor_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Constructor_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Constructor_21_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_signature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTOuterClass = _edge_signature.getSrc();
		if (tmpTOuterClass instanceof TClass) {
			TClass tOuterClass = (TClass) tmpTOuterClass;
			EObject tmpTSig = _edge_signature.getTrg();
			if (tmpTSig instanceof TMethodSignature) {
				TMethodSignature tSig = (TMethodSignature) tmpTSig;
				if (tOuterClass.getSignature().contains(tSig)) {
					TypeGraph typeGraph = tOuterClass.getPg();
					if (typeGraph != null) {
						TParameterList tParameterList = tSig.getParamList();
						if (tParameterList != null) {
							TMethod tName = tSig.getMethod();
							if (tName != null) {
								if (typeGraph.getMethods().contains(tName)) {
									for (TMember tmpTConstructorDef : tOuterClass.getDefines()) {
										if (tmpTConstructorDef instanceof TMethodDefinition) {
											TMethodDefinition tConstructorDef = (TMethodDefinition) tmpTConstructorDef;
											if (tOuterClass.equals(tConstructorDef.getReturnType())) {
												if (tSig.getDefinitions().contains(tConstructorDef)) {
													_result.add(new Object[] { tParameterList, typeGraph, tOuterClass,
															tConstructorDef, tSig, tName, _edge_signature });
												}
											}
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

	public static final Object[] pattern_Constructor_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Constructor_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			Constructor _this, Match match, TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParameterList, typeGraph, tOuterClass,
				tConstructorDef, tSig, tName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Constructor_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Constructor _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Constructor_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Constructor_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Constructor_24_1_prepare_blackB(Constructor _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Constructor_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Constructor_24_2_matchcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tParameterList");
		EObject _localVariable_1 = targetMatch.getObject("typeGraph");
		EObject _localVariable_2 = targetMatch.getObject("tOuterClass");
		EObject _localVariable_3 = sourceMatch.getObject("eConstructorDeclaration");
		EObject _localVariable_4 = sourceMatch.getObject("eOuterClass");
		EObject _localVariable_5 = targetMatch.getObject("tConstructorDef");
		EObject _localVariable_6 = targetMatch.getObject("tSig");
		EObject _localVariable_7 = targetMatch.getObject("tName");
		EObject tmpTParameterList = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTOuterClass = _localVariable_2;
		EObject tmpEConstructorDeclaration = _localVariable_3;
		EObject tmpEOuterClass = _localVariable_4;
		EObject tmpTConstructorDef = _localVariable_5;
		EObject tmpTSig = _localVariable_6;
		EObject tmpTName = _localVariable_7;
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTOuterClass instanceof TClass) {
					TClass tOuterClass = (TClass) tmpTOuterClass;
					if (tmpEConstructorDeclaration instanceof MConstructorDefinition) {
						MConstructorDefinition eConstructorDeclaration = (MConstructorDefinition) tmpEConstructorDeclaration;
						if (tmpEOuterClass instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) tmpEOuterClass;
							if (tmpTConstructorDef instanceof TMethodDefinition) {
								TMethodDefinition tConstructorDef = (TMethodDefinition) tmpTConstructorDef;
								if (tmpTSig instanceof TMethodSignature) {
									TMethodSignature tSig = (TMethodSignature) tmpTSig;
									if (tmpTName instanceof TMethod) {
										TMethod tName = (TMethod) tmpTName;
										return new Object[] { tParameterList, typeGraph, tOuterClass,
												eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName,
												targetMatch, sourceMatch };
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

	public static final Iterable<Object[]> pattern_Constructor_24_2_matchcontext_blackBFBBBBBBBBB(
			TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tOuterClass.getSignature().contains(tSig)) {
				if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
					if (tOuterClass.equals(tConstructorDef.getDefinedBy())) {
						if (eOuterClass.getBodyDeclarations().contains(eConstructorDeclaration)) {
							if (tOuterClass.equals(tConstructorDef.getReturnType())) {
								if (tParameterList.equals(tSig.getParamList())) {
									if (tSig.getDefinitions().contains(tConstructorDef)) {
										if (tName.equals(tSig.getMethod())) {
											if (typeGraph.getMethods().contains(tName)) {
												for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(eOuterClass,
																TypeToTAbstractType.class, "source")) {
													if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
														_result.add(new Object[] { tParameterList,
																eOuterClassToTOuterClass, typeGraph, tOuterClass,
																eConstructorDeclaration, eOuterClass, tConstructorDef,
																tSig, tName, sourceMatch, targetMatch });
													}
												}
											}
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

	public static final Object[] pattern_Constructor_24_2_matchcontext_greenBBBBBBBBBBFB(TParameterList tParameterList,
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName, Match sourceMatch,
			Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "Constructor";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tConstructorDef);
		isApplicableMatch.getAllContextElements().add(tSig);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration,
				eOuterClass, tConstructorDef, tSig, tName, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_Constructor_24_3_checkcsp_bindingFBBBBBBBBBBBBB(Constructor _this,
			CCMatch isApplicableMatch, TParameterList tParameterList, TypeToTAbstractType eOuterClassToTOuterClass,
			TypeGraph typeGraph, TClass tOuterClass, MConstructorDefinition eConstructorDeclaration,
			AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig,
			TMethod tName, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, tParameterList,
				eOuterClassToTOuterClass, typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef,
				tSig, tName, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tParameterList, eOuterClassToTOuterClass, typeGraph,
					tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Constructor_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBB(Constructor _this,
			CCMatch isApplicableMatch, TParameterList tParameterList, TypeToTAbstractType eOuterClassToTOuterClass,
			TypeGraph typeGraph, TClass tOuterClass, MConstructorDefinition eConstructorDeclaration,
			AbstractTypeDeclaration eOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig,
			TMethod tName, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Constructor_24_3_checkcsp_binding = pattern_Constructor_24_3_checkcsp_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, tParameterList, eOuterClassToTOuterClass, typeGraph, tOuterClass,
				eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName, sourceMatch, targetMatch);
		if (result_pattern_Constructor_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_Constructor_24_3_checkcsp_binding[0];

			Object[] result_pattern_Constructor_24_3_checkcsp_black = pattern_Constructor_24_3_checkcsp_blackB(csp);
			if (result_pattern_Constructor_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tParameterList, eOuterClassToTOuterClass,
						typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Constructor_24_4_createcorrespondence_blackBBBBBBBBB(
			TParameterList tParameterList, TypeGraph typeGraph, TClass tOuterClass,
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName, CCMatch isApplicableMatch) {
		return new Object[] { tParameterList, typeGraph, tOuterClass, eConstructorDeclaration, eOuterClass,
				tConstructorDef, tSig, tName, isApplicableMatch };
	}

	public static final Object[] pattern_Constructor_24_4_createcorrespondence_greenBFFFBBBBFFB(
			TParameterList tParameterList, MConstructorDefinition eConstructorDeclaration,
			TMethodDefinition tConstructorDef, TMethodSignature tSig, TMethod tName, CCMatch isApplicableMatch) {
		MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList = ModiscoFactory.eINSTANCE
				.createMConstructorDefinitionToTParameterList();
		MDefinitionToTMember eConstructorDeclarationToTConstructorDef = ModiscoFactory.eINSTANCE
				.createMDefinitionToTMember();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig = ModiscoFactory.eINSTANCE
				.createConstructorDeclarationToTMethodSignature();
		ConstructorDeclarationToTMethod eConstructorDeclarationToTName = ModiscoFactory.eINSTANCE
				.createConstructorDeclarationToTMethod();
		eConstructorDeclarationToTParameterList.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTParameterList.setTarget(tParameterList);
		isApplicableMatch.getCreateCorr().add(eConstructorDeclarationToTParameterList);
		eConstructorDeclarationToTConstructorDef.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTConstructorDef.setTarget(tConstructorDef);
		isApplicableMatch.getCreateCorr().add(eConstructorDeclarationToTConstructorDef);
		mBodyToTAnnotation.setSource(eConstructorDeclaration);
		mBodyToTAnnotation.setTarget(tConstructorDef);
		isApplicableMatch.getCreateCorr().add(mBodyToTAnnotation);
		eConstructorDeclarationToTSig.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTSig.setTarget(tSig);
		isApplicableMatch.getCreateCorr().add(eConstructorDeclarationToTSig);
		eConstructorDeclarationToTName.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTName.setTarget(tName);
		isApplicableMatch.getCreateCorr().add(eConstructorDeclarationToTName);
		return new Object[] { tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, eConstructorDeclaration, tConstructorDef,
				tSig, tName, eConstructorDeclarationToTSig, eConstructorDeclarationToTName, isApplicableMatch };
	}

	public static final Object[] pattern_Constructor_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_Constructor_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Constructor";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Constructor_24_6_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Constructor_27_1_matchtggpattern_blackBB(
			MConstructorDefinition eConstructorDeclaration, AbstractTypeDeclaration eOuterClass) {
		if (eOuterClass.getBodyDeclarations().contains(eConstructorDeclaration)) {
			return new Object[] { eConstructorDeclaration, eOuterClass };
		}
		return null;
	}

	public static final boolean pattern_Constructor_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Constructor_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Constructor_28_1_matchtggpattern_blackBBBBBB(TParameterList tParameterList,
			TypeGraph typeGraph, TClass tOuterClass, TMethodDefinition tConstructorDef, TMethodSignature tSig,
			TMethod tName) {
		if (tOuterClass.getSignature().contains(tSig)) {
			if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
				if (tOuterClass.equals(tConstructorDef.getDefinedBy())) {
					if (tOuterClass.equals(tConstructorDef.getReturnType())) {
						if (tParameterList.equals(tSig.getParamList())) {
							if (tSig.getDefinitions().contains(tConstructorDef)) {
								if (tName.equals(tSig.getMethod())) {
									if (typeGraph.getMethods().contains(tName)) {
										return new Object[] { tParameterList, typeGraph, tOuterClass, tConstructorDef,
												tSig, tName };
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

	public static final boolean pattern_Constructor_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Constructor_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Constructor_29_1_createresult_blackB(Constructor _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Constructor_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Constructor_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterClassToTOuterClass) {
		if (ruleResult.getCorrObjects().contains(eOuterClassToTOuterClass)) {
			return new Object[] { ruleResult, eOuterClassToTOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration eOuterClass) {
		if (ruleResult.getSourceObjects().contains(eOuterClass)) {
			return new Object[] { ruleResult, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TClass tOuterClass) {
		if (ruleResult.getTargetObjects().contains(tOuterClass)) {
			return new Object[] { ruleResult, tOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Constructor_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eOuterClassToTOuterClassList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEOuterClassToTOuterClass : eOuterClassToTOuterClassList.getEntryObjects()) {
				if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
					TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
					Type tmpEOuterClass = eOuterClassToTOuterClass.getSource();
					if (tmpEOuterClass instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration eOuterClass = (AbstractTypeDeclaration) tmpEOuterClass;
						TAbstractType tmpTOuterClass = eOuterClassToTOuterClass.getTarget();
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							TypeGraph typeGraph = tOuterClass.getPg();
							if (typeGraph != null) {
								if (pattern_Constructor_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										eOuterClassToTOuterClass) == null) {
									if (pattern_Constructor_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											eOuterClass) == null) {
										if (pattern_Constructor_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												tOuterClass) == null) {
											if (pattern_Constructor_29_2_isapplicablecore_black_nac_3BB(ruleResult,
													typeGraph) == null) {
												_result.add(new Object[] { eOuterClassToTOuterClassList,
														eOuterClassToTOuterClass, eOuterClass, tOuterClass, typeGraph,
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
		return _result;
	}

	public static final Object[] pattern_Constructor_29_3_solveCSP_bindingFBBBBBBB(Constructor _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph,
			TClass tOuterClass, AbstractTypeDeclaration eOuterClass, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eOuterClassToTOuterClass, typeGraph,
				tOuterClass, eOuterClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, typeGraph, tOuterClass,
					eOuterClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Constructor_29_3_solveCSP_bindingAndBlackFBBBBBBB(Constructor _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph,
			TClass tOuterClass, AbstractTypeDeclaration eOuterClass, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Constructor_29_3_solveCSP_binding = pattern_Constructor_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass, ruleResult);
		if (result_pattern_Constructor_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Constructor_29_3_solveCSP_binding[0];

			Object[] result_pattern_Constructor_29_3_solveCSP_black = pattern_Constructor_29_3_solveCSP_blackB(csp);
			if (result_pattern_Constructor_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, typeGraph, tOuterClass,
						eOuterClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Constructor_29_4_checkCSP_expressionFBB(Constructor _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Constructor_29_5_checknacs_black_nac_0B(AbstractTypeDeclaration eOuterClass) {
		AnonymousClassDeclaration anonymousClassDeclaration = eOuterClass.getAnonymousClassDeclarationOwner();
		if (anonymousClassDeclaration != null) {
			return new Object[] { eOuterClass };
		}

		return null;
	}

	public static final Object[] pattern_Constructor_29_5_checknacs_blackBBBB(AbstractTypeDeclaration eOuterClass,
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass) {
		if (pattern_Constructor_29_5_checknacs_black_nac_0B(eOuterClass) == null) {
			return new Object[] { eOuterClass, eOuterClassToTOuterClass, typeGraph, tOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_Constructor_29_6_perform_blackBBBBB(
			TypeToTAbstractType eOuterClassToTOuterClass, TypeGraph typeGraph, TClass tOuterClass,
			AbstractTypeDeclaration eOuterClass, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eOuterClassToTOuterClass, typeGraph, tOuterClass, eOuterClass, ruleResult };
	}

	public static final Object[] pattern_Constructor_29_6_perform_greenFFFFBBFBFFFFFBB(TypeGraph typeGraph,
			TClass tOuterClass, AbstractTypeDeclaration eOuterClass, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TParameterList tParameterList = BasicFactory.eINSTANCE.createTParameterList();
		MConstructorDefinitionToTParameterList eConstructorDeclarationToTParameterList = ModiscoFactory.eINSTANCE
				.createMConstructorDefinitionToTParameterList();
		MDefinitionToTMember eConstructorDeclarationToTConstructorDef = ModiscoFactory.eINSTANCE
				.createMDefinitionToTMember();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		MConstructorDefinition eConstructorDeclaration = org.gravity.modisco.ModiscoFactory.eINSTANCE
				.createMConstructorDefinition();
		TMethodDefinition tConstructorDef = BasicFactory.eINSTANCE.createTMethodDefinition();
		TMethodSignature tSig = BasicFactory.eINSTANCE.createTMethodSignature();
		TMethod tName = BasicFactory.eINSTANCE.createTMethod();
		ConstructorDeclarationToTMethodSignature eConstructorDeclarationToTSig = ModiscoFactory.eINSTANCE
				.createConstructorDeclarationToTMethodSignature();
		ConstructorDeclarationToTMethod eConstructorDeclarationToTName = ModiscoFactory.eINSTANCE
				.createConstructorDeclarationToTMethod();
		Object _localVariable_0 = csp.getValue("eConstructorDeclaration", "name");
		Object _localVariable_1 = csp.getValue("tConstructorDef", "ID");
		Object _localVariable_2 = csp.getValue("tSig", "ID");
		Object _localVariable_3 = csp.getValue("tName", "ID");
		Object _localVariable_4 = csp.getValue("tName", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(tParameterList);
		eConstructorDeclarationToTParameterList.setTarget(tParameterList);
		ruleResult.getCorrObjects().add(eConstructorDeclarationToTParameterList);
		ruleResult.getCorrObjects().add(eConstructorDeclarationToTConstructorDef);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		eConstructorDeclarationToTParameterList.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTConstructorDef.setSource(eConstructorDeclaration);
		mBodyToTAnnotation.setSource(eConstructorDeclaration);
		eOuterClass.getBodyDeclarations().add(eConstructorDeclaration);
		ruleResult.getSourceObjects().add(eConstructorDeclaration);
		eConstructorDeclarationToTConstructorDef.setTarget(tConstructorDef);
		mBodyToTAnnotation.setTarget(tConstructorDef);
		tConstructorDef.setDefinedBy(tOuterClass);
		tConstructorDef.setReturnType(tOuterClass);
		ruleResult.getTargetObjects().add(tConstructorDef);
		tOuterClass.getSignature().add(tSig);
		tSig.setParamList(tParameterList);
		tSig.getDefinitions().add(tConstructorDef);
		ruleResult.getTargetObjects().add(tSig);
		tSig.setMethod(tName);
		typeGraph.getMethods().add(tName);
		ruleResult.getTargetObjects().add(tName);
		eConstructorDeclarationToTSig.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTSig.setTarget(tSig);
		ruleResult.getCorrObjects().add(eConstructorDeclarationToTSig);
		eConstructorDeclarationToTName.setSource(eConstructorDeclaration);
		eConstructorDeclarationToTName.setTarget(tName);
		ruleResult.getCorrObjects().add(eConstructorDeclarationToTName);
		String eConstructorDeclaration_name_prime = (String) _localVariable_0;
		int tConstructorDef_ID_prime = (int) _localVariable_1;
		int tSig_ID_prime = (int) _localVariable_2;
		int tName_ID_prime = (int) _localVariable_3;
		String tName_tName_prime = (String) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		eConstructorDeclaration.setName(eConstructorDeclaration_name_prime);
		tConstructorDef.setID(Integer.valueOf(tConstructorDef_ID_prime));
		tSig.setID(Integer.valueOf(tSig_ID_prime));
		tName.setID(Integer.valueOf(tName_ID_prime));
		tName.setTName(tName_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tParameterList, eConstructorDeclarationToTParameterList,
				eConstructorDeclarationToTConstructorDef, mBodyToTAnnotation, typeGraph, tOuterClass,
				eConstructorDeclaration, eOuterClass, tConstructorDef, tSig, tName, eConstructorDeclarationToTSig,
				eConstructorDeclarationToTName, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Constructor_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConstructorImpl
