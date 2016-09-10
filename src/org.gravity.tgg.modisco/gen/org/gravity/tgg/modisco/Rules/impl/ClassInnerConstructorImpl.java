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

import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.ConstructorDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.ClassInnerConstructor;
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
 * An implementation of the model object '<em><b>Class Inner Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassInnerConstructorImpl extends AbstractRuleImpl implements ClassInnerConstructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInnerConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassInnerConstructor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass) {
		// initial bindings
		Object[] result1_black = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_0_1_initialbindings_blackBBBBBBB(this, match, eOuterClass,
						eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[eOuterClass] = " + eOuterClass + ", "
					+ "[eConstructorDeclaration] = " + eConstructorDeclaration + ", " + "[typeDeclarationStatement] = "
					+ typeDeclarationStatement + ", " + "[eCodeBlock] = " + eCodeBlock + ", " + "[eInnerClass] = "
					+ eInnerClass + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, eOuterClass,
						eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[eOuterClass] = " + eOuterClass + ", "
					+ "[eConstructorDeclaration] = " + eConstructorDeclaration + ", " + "[typeDeclarationStatement] = "
					+ typeDeclarationStatement + ", " + "[eCodeBlock] = " + eCodeBlock + ", " + "[eInnerClass] = "
					+ eInnerClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ClassInnerConstructorImpl.pattern_ClassInnerConstructor_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_0_4_collectelementstobetranslated_blackBBBBBB(match, eOuterClass,
							eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eOuterClass] = " + eOuterClass + ", "
						+ "[eConstructorDeclaration] = " + eConstructorDeclaration + ", "
						+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eCodeBlock] = "
						+ eCodeBlock + ", " + "[eInnerClass] = " + eInnerClass + ".");
			}
			ClassInnerConstructorImpl.pattern_ClassInnerConstructor_0_4_collectelementstobetranslated_greenBBBBFF(match,
					typeDeclarationStatement, eCodeBlock, eInnerClass);
			// EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = (EMoflonEdge) result4_green[4];
			// EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_0_5_collectcontextelements_blackBBBBBB(match, eOuterClass,
							eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eOuterClass] = " + eOuterClass + ", "
						+ "[eConstructorDeclaration] = " + eConstructorDeclaration + ", "
						+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eCodeBlock] = "
						+ eCodeBlock + ", " + "[eInnerClass] = " + eInnerClass + ".");
			}
			ClassInnerConstructorImpl.pattern_ClassInnerConstructor_0_5_collectcontextelements_greenBBBBFFF(match,
					eOuterClass, eConstructorDeclaration, eCodeBlock);
			// EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = (EMoflonEdge) result5_green[4];
			// EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result5_green[5];
			// EMoflonEdge eConstructorDeclaration__eCodeBlock____body = (EMoflonEdge) result5_green[6];

			// register objects to match
			ClassInnerConstructorImpl.pattern_ClassInnerConstructor_0_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass);
			return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_0_7_expressionF();
		} else {
			return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result1_bindingAndBlack[0];
		ClassDeclaration eOuterClass = (ClassDeclaration) result1_bindingAndBlack[1];
		ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result1_bindingAndBlack[2];
		TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result1_bindingAndBlack[3];
		Block eCodeBlock = (Block) result1_bindingAndBlack[4];
		ClassDeclaration eInnerClass = (ClassDeclaration) result1_bindingAndBlack[5];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[6];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[7];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_1_1_performtransformation_greenFBBBFFB(eInnerClass, typeGraph,
						tOuterPackage, csp);
		TypeToTAbstractType eInnerClassToTInnerClass = (TypeToTAbstractType) result1_green[0];
		TPackage tInnerPackage = (TPackage) result1_green[4];
		TClass tInnerClass = (TClass) result1_green[5];

		// collect translated elements
		Object[] result2_black = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_1_2_collecttranslatedelements_blackBBBBB(eInnerClassToTInnerClass,
						typeDeclarationStatement, eInnerClass, tInnerPackage, tInnerClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eInnerClassToTInnerClass] = " + eInnerClassToTInnerClass + ", "
					+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eInnerClass] = "
					+ eInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = "
					+ tInnerClass + ".");
		}
		Object[] result2_green = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_1_2_collecttranslatedelements_greenFBBBBB(eInnerClassToTInnerClass,
						typeDeclarationStatement, eInnerClass, tInnerPackage, tInnerClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
						eInnerClassToTInnerClass, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
						typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage,
						tInnerPackage, tInnerClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eInnerClassToTInnerClass] = " + eInnerClassToTInnerClass
					+ ", " + "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", "
					+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eCodeBlock] = " + eCodeBlock
					+ ", " + "[eInnerClass] = " + eInnerClass + ", " + "[tOuterClass] = " + tOuterClass + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
					+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = " + tInnerClass + ".");
		}
		ClassInnerConstructorImpl.pattern_ClassInnerConstructor_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
				ruleresult, eInnerClassToTInnerClass, typeDeclarationStatement, eCodeBlock, eInnerClass, typeGraph,
				tOuterPackage, tInnerPackage, tInnerClass);
		// EMoflonEdge eInnerClassToTInnerClass__eInnerClass____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge eInnerClassToTInnerClass__tInnerClass____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = (EMoflonEdge) result3_green[11];
		// EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[14];
		// EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[18];
		// EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		ClassInnerConstructorImpl.pattern_ClassInnerConstructor_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, eInnerClassToTInnerClass, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
				typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage, tInnerPackage,
				tInnerClass);
		return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration eOuterClass = (ClassDeclaration) result2_binding[0];
		ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result2_binding[1];
		TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result2_binding[2];
		Block eCodeBlock = (Block) result2_binding[3];
		ClassDeclaration eInnerClass = (ClassDeclaration) result2_binding[4];
		for (Object[] result2_black : ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_2_2_corematch_blackFBBBBBFB(eOuterClass, eConstructorDeclaration,
						typeDeclarationStatement, eCodeBlock, eInnerClass, match)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[0];
			TClass tOuterClass = (TClass) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_2_3_findcontext_blackBBBBBBBFF(eOuterClassToTOuterClass, eOuterClass,
							eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[7];
				TPackage tOuterPackage = (TPackage) result3_black[8];
				Object[] result3_green = ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
								eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
								typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph,
								tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
				// EMoflonEdge eConstructorDeclaration__eCodeBlock____body = (EMoflonEdge) result3_green[14];
				// EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = (EMoflonEdge) result3_green[15];
				// EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result3_green[18];
				// EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[19];
				// EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
								typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph,
								tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[eOuterClass] = "
							+ eOuterClass + ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", "
							+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eCodeBlock] = "
							+ eCodeBlock + ", " + "[eInnerClass] = " + eInnerClass + ", " + "[tOuterClass] = "
							+ tOuterClass + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = "
							+ tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ClassInnerConstructorImpl.pattern_ClassInnerConstructor_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ClassInnerConstructorImpl
							.pattern_ClassInnerConstructor_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ClassInnerConstructorImpl.pattern_ClassInnerConstructor_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass) {
		match.registerObject("eOuterClass", eOuterClass);
		match.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		match.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		match.registerObject("eCodeBlock", eCodeBlock);
		match.registerObject("eInnerClass", eInnerClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass) {// Create CSP
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
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_eInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("eInnerClass.name", true, csp);
		var_eInnerClass_name.setValue(eInnerClass.getName());
		var_eInnerClass_name.setType("String");
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");

		// Create unbound variables
		Variable var_tInnerClass_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.ID", csp);
		var_tInnerClass_ID.setType("int");
		Variable var_tInnerPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.ID", csp);
		var_tInnerPackage_ID.setType("int");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", csp);
		var_tInnerClass_tName.setType("String");
		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.tName", csp);
		var_tInnerPackage_tName.setType("String");

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();
		Eq eq = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tInnerClass_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tInnerPackage_ID);
		eq.setRuleName("");
		eq.solve(var_eInnerClass_name, var_tInnerClass_tName);
		addSuffix.setRuleName("");
		addSuffix.solve(var_tOuterClass_tName, literal0, var_tInnerPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		isApplicableMatch.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		isApplicableMatch.registerObject("eCodeBlock", eCodeBlock);
		isApplicableMatch.registerObject("eInnerClass", eInnerClass);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass,
			EObject eOuterClassToTOuterClass, EObject eOuterClass, EObject eConstructorDeclaration,
			EObject typeDeclarationStatement, EObject eCodeBlock, EObject eInnerClass, EObject tOuterClass,
			EObject typeGraph, EObject tOuterPackage, EObject tInnerPackage, EObject tInnerClass) {
		ruleresult.registerObject("eInnerClassToTInnerClass", eInnerClassToTInnerClass);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		ruleresult.registerObject("eOuterClass", eOuterClass);
		ruleresult.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		ruleresult.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		ruleresult.registerObject("eCodeBlock", eCodeBlock);
		ruleresult.registerObject("eInnerClass", eInnerClass);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);
		ruleresult.registerObject("tInnerPackage", tInnerPackage);
		ruleresult.registerObject("tInnerClass", tInnerClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeDeclarationStatement").eClass())
						.equals("java.TypeDeclarationStatement.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eInnerClass").eClass())
						.equals("java.ClassDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage,
			TPackage tInnerPackage, TClass tInnerClass) {
		// initial bindings
		Object[] result1_black = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_10_1_initialbindings_blackBBBBBBB(this, match, tOuterClass, typeGraph,
						tOuterPackage, tInnerPackage, tInnerClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tOuterClass] = " + tOuterClass + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
					+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = " + tInnerClass + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, tOuterClass,
						typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tOuterClass] = " + tOuterClass + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
					+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = " + tInnerClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ClassInnerConstructorImpl.pattern_ClassInnerConstructor_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_10_4_collectelementstobetranslated_blackBBBBBB(match, tOuterClass,
							typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tOuterClass] = " + tOuterClass + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
						+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = " + tInnerClass + ".");
			}
			ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(match,
							typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
			// EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result4_green[6];
			// EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result4_green[7];
			// EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result4_green[8];
			// EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result4_green[9];
			// EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result4_green[10];
			// EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result4_green[11];
			// EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_10_5_collectcontextelements_blackBBBBBB(match, tOuterClass,
							typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tOuterClass] = " + tOuterClass + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
						+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = " + tInnerClass + ".");
			}
			ClassInnerConstructorImpl.pattern_ClassInnerConstructor_10_5_collectcontextelements_greenBBBBFFFF(match,
					tOuterClass, typeGraph, tOuterPackage);
			// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result5_green[4];
			// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result5_green[5];
			// EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result5_green[6];
			// EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result5_green[7];

			// register objects to match
			ClassInnerConstructorImpl.pattern_ClassInnerConstructor_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
			return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_10_7_expressionF();
		} else {
			return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result1_bindingAndBlack[0];
		ClassDeclaration eOuterClass = (ClassDeclaration) result1_bindingAndBlack[1];
		ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result1_bindingAndBlack[2];
		Block eCodeBlock = (Block) result1_bindingAndBlack[3];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[4];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[5];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[6];
		TPackage tInnerPackage = (TPackage) result1_bindingAndBlack[7];
		TClass tInnerClass = (TClass) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_11_1_performtransformation_greenFFBFBB(eCodeBlock, tInnerClass, csp);
		TypeToTAbstractType eInnerClassToTInnerClass = (TypeToTAbstractType) result1_green[0];
		TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result1_green[1];
		ClassDeclaration eInnerClass = (ClassDeclaration) result1_green[3];

		// collect translated elements
		Object[] result2_black = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_11_2_collecttranslatedelements_blackBBBBB(eInnerClassToTInnerClass,
						typeDeclarationStatement, eInnerClass, tInnerPackage, tInnerClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eInnerClassToTInnerClass] = " + eInnerClassToTInnerClass + ", "
					+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eInnerClass] = "
					+ eInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = "
					+ tInnerClass + ".");
		}
		Object[] result2_green = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_11_2_collecttranslatedelements_greenFBBBBB(eInnerClassToTInnerClass,
						typeDeclarationStatement, eInnerClass, tInnerPackage, tInnerClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
						eInnerClassToTInnerClass, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
						typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage,
						tInnerPackage, tInnerClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eInnerClassToTInnerClass] = " + eInnerClassToTInnerClass
					+ ", " + "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[eOuterClass] = "
					+ eOuterClass + ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", "
					+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eCodeBlock] = " + eCodeBlock
					+ ", " + "[eInnerClass] = " + eInnerClass + ", " + "[tOuterClass] = " + tOuterClass + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
					+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = " + tInnerClass + ".");
		}
		ClassInnerConstructorImpl.pattern_ClassInnerConstructor_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
				ruleresult, eInnerClassToTInnerClass, typeDeclarationStatement, eCodeBlock, eInnerClass, typeGraph,
				tOuterPackage, tInnerPackage, tInnerClass);
		// EMoflonEdge eInnerClassToTInnerClass__eInnerClass____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge eInnerClassToTInnerClass__tInnerClass____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = (EMoflonEdge) result3_green[11];
		// EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[14];
		// EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[18];
		// EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		ClassInnerConstructorImpl.pattern_ClassInnerConstructor_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, eInnerClassToTInnerClass, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
				typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage, tInnerPackage,
				tInnerClass);
		return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tOuterClass = (TClass) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		TPackage tOuterPackage = (TPackage) result2_binding[2];
		TPackage tInnerPackage = (TPackage) result2_binding[3];
		TClass tInnerClass = (TClass) result2_binding[4];
		for (Object[] result2_black : ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_12_2_corematch_blackFFBBBBBB(tOuterClass, typeGraph, tOuterPackage,
						tInnerPackage, tInnerClass, match)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[0];
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_12_3_findcontext_blackBBFFBBBBB(eOuterClassToTOuterClass,
							eOuterClass, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass)) {
				ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result3_black[2];
				Block eCodeBlock = (Block) result3_black[3];
				Object[] result3_green = ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFFFFFF(
								eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass,
								typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
				// EMoflonEdge eConstructorDeclaration__eCodeBlock____body = (EMoflonEdge) result3_green[14];
				// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result3_green[18];
				// EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[19];
				// EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[20];
				// EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[21];
				// EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[22];
				// EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[23];
				// EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[24];
				// EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[25];
				// EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[26];

				// solve CSP
				Object[] result4_bindingAndBlack = ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
								eCodeBlock, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[eOuterClass] = "
							+ eOuterClass + ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", "
							+ "[eCodeBlock] = " + eCodeBlock + ", " + "[tOuterClass] = " + tOuterClass + ", "
							+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
							+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = " + tInnerClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ClassInnerConstructorImpl.pattern_ClassInnerConstructor_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ClassInnerConstructorImpl
							.pattern_ClassInnerConstructor_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ClassInnerConstructorImpl.pattern_ClassInnerConstructor_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage,
			TPackage tInnerPackage, TClass tInnerClass) {
		match.registerObject("tOuterClass", tOuterClass);
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tOuterPackage", tOuterPackage);
		match.registerObject("tInnerPackage", tInnerPackage);
		match.registerObject("tInnerClass", tInnerClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage,
			TPackage tInnerPackage, TClass tInnerClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tInnerClass_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.ID", true, csp);
		var_tInnerClass_ID.setValue(tInnerClass.getID());
		var_tInnerClass_ID.setType("int");
		Variable var_tInnerPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.ID", true, csp);
		var_tInnerPackage_ID.setValue(tInnerPackage.getID());
		var_tInnerPackage_ID.setType("int");
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");
		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.tName", true, csp);
		var_tInnerPackage_tName.setValue(tInnerPackage.getTName());
		var_tInnerPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tInnerClass_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tInnerPackage_ID);
		addSuffix.setRuleName("");
		addSuffix.solve(var_tOuterClass_tName, literal0, var_tInnerPackage_tName);
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
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", true, csp);
		var_tInnerClass_tName.setValue(tInnerClass.getTName());
		var_tInnerClass_tName.setType("String");

		// Create unbound variables
		Variable var_eInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("eInnerClass.name", csp);
		var_eInnerClass_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_eInnerClass_name, var_tInnerClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		isApplicableMatch.registerObject("eCodeBlock", eCodeBlock);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
		isApplicableMatch.registerObject("tInnerPackage", tInnerPackage);
		isApplicableMatch.registerObject("tInnerClass", tInnerClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass,
			EObject eOuterClassToTOuterClass, EObject eOuterClass, EObject eConstructorDeclaration,
			EObject typeDeclarationStatement, EObject eCodeBlock, EObject eInnerClass, EObject tOuterClass,
			EObject typeGraph, EObject tOuterPackage, EObject tInnerPackage, EObject tInnerClass) {
		ruleresult.registerObject("eInnerClassToTInnerClass", eInnerClassToTInnerClass);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		ruleresult.registerObject("eOuterClass", eOuterClass);
		ruleresult.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		ruleresult.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		ruleresult.registerObject("eCodeBlock", eCodeBlock);
		ruleresult.registerObject("eInnerClass", eInnerClass);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);
		ruleresult.registerObject("tInnerPackage", tInnerPackage);
		ruleresult.registerObject("tInnerClass", tInnerClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tInnerPackage").eClass())
						.equals("basic.TPackage.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tInnerClass").eClass())
						.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_16(EMoflonEdge _edge_declaration) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_20_2_testcorematchandDECs_blackFFFFFB(_edge_declaration)) {
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[0];
			ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result2_black[1];
			TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result2_black[2];
			Block eCodeBlock = (Block) result2_black[3];
			ClassDeclaration eInnerClass = (ClassDeclaration) result2_black[4];
			Object[] result2_green = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement, eCodeBlock,
							eInnerClass)) {
				// Ensure that the correct types of elements are matched
				if (ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassInnerConstructorImpl
							.pattern_ClassInnerConstructor_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ClassInnerConstructorImpl.pattern_ClassInnerConstructor_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_14(EMoflonEdge _edge_ownedTypes) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_21_2_testcorematchandDECs_blackFFFFFB(_edge_ownedTypes)) {
			TClass tOuterClass = (TClass) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TPackage tOuterPackage = (TPackage) result2_black[2];
			TPackage tInnerPackage = (TPackage) result2_black[3];
			TClass tInnerClass = (TClass) result2_black[4];
			Object[] result2_green = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass)) {
				// Ensure that the correct types of elements are matched
				if (ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassInnerConstructorImpl
							.pattern_ClassInnerConstructor_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ClassInnerConstructorImpl.pattern_ClassInnerConstructor_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassInnerConstructor");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tInnerClass_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_ID.setValue(__helper.getValue("tInnerClass", "ID"));
		var_tInnerClass_ID.setType("int");

		Variable var_tInnerPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage", true, csp);
		var_tInnerPackage_ID.setValue(__helper.getValue("tInnerPackage", "ID"));
		var_tInnerPackage_ID.setType("int");

		Variable var_eInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("eInnerClass", true, csp);
		var_eInnerClass_name.setValue(__helper.getValue("eInnerClass", "name"));
		var_eInnerClass_name.setType("String");

		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_tName.setValue(__helper.getValue("tInnerClass", "tName"));
		var_tInnerClass_tName.setType("String");

		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass", true, csp);
		var_tOuterClass_tName.setValue(__helper.getValue("tOuterClass", "tName"));
		var_tOuterClass_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$1");
		var_literal0.setType("");

		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage", true, csp);
		var_tInnerPackage_tName.setValue(__helper.getValue("tInnerPackage", "tName"));
		var_tInnerPackage_tName.setType("String");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		AddSuffix addSuffix3 = new AddSuffix();
		csp.getConstraints().add(addSuffix3);

		createID0.setRuleName("ClassInnerConstructor");
		createID0.solve(var_tInnerClass_ID);

		createID1.setRuleName("ClassInnerConstructor");
		createID1.solve(var_tInnerPackage_ID);

		eq2.setRuleName("ClassInnerConstructor");
		eq2.solve(var_eInnerClass_name, var_tInnerClass_tName);

		addSuffix3.setRuleName("ClassInnerConstructor");
		addSuffix3.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tInnerClass_ID.setBound(false);
			var_tInnerPackage_ID.setBound(false);
			var_tInnerClass_tName.setBound(false);
			var_tInnerPackage_tName.setBound(false);
			createID0.solve(var_tInnerClass_ID);
			createID1.solve(var_tInnerPackage_ID);
			eq2.solve(var_eInnerClass_name, var_tInnerClass_tName);
			addSuffix3.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tInnerClass", "ID", var_tInnerClass_ID.getValue());
				__helper.setValue("tInnerPackage", "ID", var_tInnerPackage_ID.getValue());
				__helper.setValue("tInnerClass", "tName", var_tInnerClass_tName.getValue());
				__helper.setValue("tInnerPackage", "tName", var_tInnerPackage_tName.getValue());
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
		ruleResult.setRule("ClassInnerConstructor");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tInnerClass_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_ID.setValue(__helper.getValue("tInnerClass", "ID"));
		var_tInnerClass_ID.setType("int");

		Variable var_tInnerPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage", true, csp);
		var_tInnerPackage_ID.setValue(__helper.getValue("tInnerPackage", "ID"));
		var_tInnerPackage_ID.setType("int");

		Variable var_eInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("eInnerClass", true, csp);
		var_eInnerClass_name.setValue(__helper.getValue("eInnerClass", "name"));
		var_eInnerClass_name.setType("String");

		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass", true, csp);
		var_tInnerClass_tName.setValue(__helper.getValue("tInnerClass", "tName"));
		var_tInnerClass_tName.setType("String");

		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass", true, csp);
		var_tOuterClass_tName.setValue(__helper.getValue("tOuterClass", "tName"));
		var_tOuterClass_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$1");
		var_literal0.setType("");

		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage", true, csp);
		var_tInnerPackage_tName.setValue(__helper.getValue("tInnerPackage", "tName"));
		var_tInnerPackage_tName.setType("String");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		AddSuffix addSuffix2 = new AddSuffix();
		csp.getConstraints().add(addSuffix2);

		Eq eq3 = new Eq();
		csp.getConstraints().add(eq3);

		createID0.setRuleName("ClassInnerConstructor");
		createID0.solve(var_tInnerClass_ID);

		createID1.setRuleName("ClassInnerConstructor");
		createID1.solve(var_tInnerPackage_ID);

		addSuffix2.setRuleName("ClassInnerConstructor");
		addSuffix2.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);

		eq3.setRuleName("ClassInnerConstructor");
		eq3.solve(var_eInnerClass_name, var_tInnerClass_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_eInnerClass_name.setBound(false);
			createID0.solve(var_tInnerClass_ID);
			createID1.solve(var_tInnerPackage_ID);
			addSuffix2.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);
			eq3.solve(var_eInnerClass_name, var_tInnerClass_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("eInnerClass", "name", var_eInnerClass_name.getValue());
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
		Object[] result1_black = ClassInnerConstructorImpl.pattern_ClassInnerConstructor_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInnerConstructorImpl.pattern_ClassInnerConstructor_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_24_2_matchcontext_bindingFFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassDeclaration eOuterClass = (ClassDeclaration) result2_binding[0];
		ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result2_binding[1];
		TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result2_binding[2];
		Block eCodeBlock = (Block) result2_binding[3];
		ClassDeclaration eInnerClass = (ClassDeclaration) result2_binding[4];
		TClass tOuterClass = (TClass) result2_binding[5];
		TypeGraph typeGraph = (TypeGraph) result2_binding[6];
		TPackage tOuterPackage = (TPackage) result2_binding[7];
		TPackage tInnerPackage = (TPackage) result2_binding[8];
		TClass tInnerClass = (TClass) result2_binding[9];
		for (Object[] result2_black : ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_24_2_matchcontext_blackFBBBBBBBBBBBB(eOuterClass,
						eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass,
						typeGraph, tOuterPackage, tInnerPackage, tInnerClass, sourceMatch, targetMatch)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[0];
			Object[] result2_green = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_24_2_matchcontext_greenBBBBBBBBBBBBFB(eOuterClassToTOuterClass,
							eOuterClass, eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass,
							tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass, sourceMatch,
							targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[12];

			// check csp
			Object[] result3_bindingAndBlack = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBB(this,
							isApplicableMatch, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
							typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage,
							tInnerPackage, tInnerClass, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_24_4_createcorrespondence_blackBBBBBBBBBBB(eOuterClass,
								eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass,
								typeGraph, tOuterPackage, tInnerPackage, tInnerClass, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[eOuterClass] = " + eOuterClass + ", " + "[eConstructorDeclaration] = "
							+ eConstructorDeclaration + ", " + "[typeDeclarationStatement] = "
							+ typeDeclarationStatement + ", " + "[eCodeBlock] = " + eCodeBlock + ", "
							+ "[eInnerClass] = " + eInnerClass + ", " + "[tOuterClass] = " + tOuterClass + ", "
							+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
							+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tInnerClass] = " + tInnerClass + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ClassInnerConstructorImpl.pattern_ClassInnerConstructor_24_4_createcorrespondence_greenFBBB(eInnerClass,
						tInnerClass, isApplicableMatch);
				// TypeToTAbstractType eInnerClassToTInnerClass = (TypeToTAbstractType) result4_green[0];

				// add to returned result
				Object[] result5_black = ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ClassInnerConstructorImpl.pattern_ClassInnerConstructor_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass,
			TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tInnerClass_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.ID", true, csp);
		var_tInnerClass_ID.setValue(tInnerClass.getID());
		var_tInnerClass_ID.setType("int");
		Variable var_tInnerPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.ID", true, csp);
		var_tInnerPackage_ID.setValue(tInnerPackage.getID());
		var_tInnerPackage_ID.setType("int");
		Variable var_eInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("eInnerClass.name", true, csp);
		var_eInnerClass_name.setValue(eInnerClass.getName());
		var_eInnerClass_name.setType("String");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", true, csp);
		var_tInnerClass_tName.setValue(tInnerClass.getTName());
		var_tInnerClass_tName.setType("String");
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");
		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.tName", true, csp);
		var_tInnerPackage_tName.setValue(tInnerPackage.getTName());
		var_tInnerPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();
		Eq eq = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tInnerClass_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tInnerPackage_ID);
		eq.setRuleName("");
		eq.solve(var_eInnerClass_name, var_tInnerClass_tName);
		addSuffix.setRuleName("");
		addSuffix.solve(var_tOuterClass_tName, literal0, var_tInnerPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		isApplicableMatch.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		isApplicableMatch.registerObject("eCodeBlock", eCodeBlock);
		isApplicableMatch.registerObject("eInnerClass", eInnerClass);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
		isApplicableMatch.registerObject("tInnerPackage", tInnerPackage);
		isApplicableMatch.registerObject("tInnerClass", tInnerClass);
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
	public boolean checkDEC_FWD(ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass) {// match tgg pattern
		Object[] result1_black = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_27_1_matchtggpattern_blackBBBBB(eOuterClass, eConstructorDeclaration,
						typeDeclarationStatement, eCodeBlock, eInnerClass);
		if (result1_black != null) {
			return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_27_2_expressionF();
		} else {
			return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage,
			TClass tInnerClass) {// match tgg pattern
		Object[] result1_black = ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_28_1_matchtggpattern_blackBBBBB(tOuterClass, typeGraph, tOuterPackage,
						tInnerPackage, tInnerClass);
		if (result1_black != null) {
			return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_28_2_expressionF();
		} else {
			return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_28_3_expressionF();
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
		Object[] result1_black = ClassInnerConstructorImpl.pattern_ClassInnerConstructor_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInnerConstructorImpl.pattern_ClassInnerConstructor_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ClassInnerConstructorImpl
				.pattern_ClassInnerConstructor_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eOuterClassToTOuterClassList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[1];
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[2];
			ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result2_black[3];
			Block eCodeBlock = (Block) result2_black[4];
			TClass tOuterClass = (TClass) result2_black[5];
			TypeGraph typeGraph = (TypeGraph) result2_black[6];
			TPackage tOuterPackage = (TPackage) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = ClassInnerConstructorImpl
					.pattern_ClassInnerConstructor_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass,
							typeGraph, tOuterPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[eOuterClass] = "
						+ eOuterClass + ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", "
						+ "[eCodeBlock] = " + eCodeBlock + ", " + "[tOuterClass] = " + tOuterClass + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ClassInnerConstructorImpl.pattern_ClassInnerConstructor_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ClassInnerConstructorImpl
						.pattern_ClassInnerConstructor_29_5_checknacs_blackBBBBBBB(eOuterClassToTOuterClass,
								eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph,
								tOuterPackage);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ClassInnerConstructorImpl
							.pattern_ClassInnerConstructor_29_6_perform_blackBBBBBBBB(eOuterClassToTOuterClass,
									eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph,
									tOuterPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[eOuterClass] = "
								+ eOuterClass + ", " + "[eConstructorDeclaration] = " + eConstructorDeclaration + ", "
								+ "[eCodeBlock] = " + eCodeBlock + ", " + "[tOuterClass] = " + tOuterClass + ", "
								+ "[typeGraph] = " + typeGraph + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ClassInnerConstructorImpl.pattern_ClassInnerConstructor_29_6_perform_greenFFBFBBFFBB(eCodeBlock,
							typeGraph, tOuterPackage, ruleResult, csp);
					// TypeToTAbstractType eInnerClassToTInnerClass = (TypeToTAbstractType) result6_green[0];
					// TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result6_green[1];
					// ClassDeclaration eInnerClass = (ClassDeclaration) result6_green[3];
					// TPackage tInnerPackage = (TPackage) result6_green[6];
					// TClass tInnerClass = (TClass) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return ClassInnerConstructorImpl.pattern_ClassInnerConstructor_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterClass.tName", true, csp);
		var_tOuterClass_tName.setValue(tOuterClass.getTName());
		var_tOuterClass_tName.setType("String");

		// Create unbound variables
		Variable var_tInnerClass_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.ID", csp);
		var_tInnerClass_ID.setType("int");
		Variable var_tInnerPackage_ID = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.ID", csp);
		var_tInnerPackage_ID.setType("int");
		Variable var_eInnerClass_name = CSPFactoryHelper.eINSTANCE.createVariable("eInnerClass.name", csp);
		var_eInnerClass_name.setType("String");
		Variable var_tInnerClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerClass.tName", csp);
		var_tInnerClass_tName.setType("String");
		Variable var_tInnerPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tInnerPackage.tName", csp);
		var_tInnerPackage_tName.setType("String");

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();
		AddSuffix addSuffix = new AddSuffix();
		Eq eq = new Eq();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);
		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(eq);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tInnerClass_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tInnerPackage_ID);
		addSuffix.setRuleName("");
		addSuffix.solve(var_tOuterClass_tName, literal0, var_tInnerPackage_tName);
		eq.setRuleName("");
		eq.solve(var_eInnerClass_name, var_tInnerClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
		isApplicableMatch.registerObject("eConstructorDeclaration", eConstructorDeclaration);
		isApplicableMatch.registerObject("eCodeBlock", eCodeBlock);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_CONSTRUCTORDECLARATION_TYPEDECLARATIONSTATEMENT_BLOCK_CLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ConstructorDeclaration) arguments.get(2), (TypeDeclarationStatement) arguments.get(3),
					(Block) arguments.get(4), (ClassDeclaration) arguments.get(5));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_CONSTRUCTORDECLARATION_TYPEDECLARATIONSTATEMENT_BLOCK_CLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ConstructorDeclaration) arguments.get(2), (TypeDeclarationStatement) arguments.get(3),
					(Block) arguments.get(4), (ClassDeclaration) arguments.get(5));
			return null;
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_CONSTRUCTORDECLARATION_TYPEDECLARATIONSTATEMENT_BLOCK_CLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ConstructorDeclaration) arguments.get(2), (TypeDeclarationStatement) arguments.get(3),
					(Block) arguments.get(4), (ClassDeclaration) arguments.get(5));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_CLASSDECLARATION_CONSTRUCTORDECLARATION_TYPEDECLARATIONSTATEMENT_BLOCK_CLASSDECLARATION_TCLASS_TYPEGRAPH_TPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (ClassDeclaration) arguments.get(2),
					(ConstructorDeclaration) arguments.get(3), (TypeDeclarationStatement) arguments.get(4),
					(Block) arguments.get(5), (ClassDeclaration) arguments.get(6), (TClass) arguments.get(7),
					(TypeGraph) arguments.get(8), (TPackage) arguments.get(9));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPROPRIATE_BWD__MATCH_TCLASS_TYPEGRAPH_TPACKAGE_TPACKAGE_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TypeGraph) arguments.get(2),
					(TPackage) arguments.get(3), (TPackage) arguments.get(4), (TClass) arguments.get(5));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TYPEGRAPH_TPACKAGE_TPACKAGE_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (TPackage) arguments.get(3), (TPackage) arguments.get(4),
					(TClass) arguments.get(5));
			return null;
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TYPEGRAPH_TPACKAGE_TPACKAGE_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (TPackage) arguments.get(3), (TPackage) arguments.get(4),
					(TClass) arguments.get(5));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_CLASSDECLARATION_CONSTRUCTORDECLARATION_BLOCK_TCLASS_TYPEGRAPH_TPACKAGE_TPACKAGE_TCLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (ClassDeclaration) arguments.get(2),
					(ConstructorDeclaration) arguments.get(3), (Block) arguments.get(4), (TClass) arguments.get(5),
					(TypeGraph) arguments.get(6), (TPackage) arguments.get(7), (TPackage) arguments.get(8),
					(TClass) arguments.get(9));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPROPRIATE_FWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_16((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_14((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TYPETOTABSTRACTTYPE_CLASSDECLARATION_CONSTRUCTORDECLARATION_TYPEDECLARATIONSTATEMENT_BLOCK_CLASSDECLARATION_TCLASS_TYPEGRAPH_TPACKAGE_TPACKAGE_TCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (ConstructorDeclaration) arguments.get(3),
					(TypeDeclarationStatement) arguments.get(4), (Block) arguments.get(5),
					(ClassDeclaration) arguments.get(6), (TClass) arguments.get(7), (TypeGraph) arguments.get(8),
					(TPackage) arguments.get(9), (TPackage) arguments.get(10), (TClass) arguments.get(11),
					(Match) arguments.get(12), (Match) arguments.get(13));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___CHECK_DEC_FWD__CLASSDECLARATION_CONSTRUCTORDECLARATION_TYPEDECLARATIONSTATEMENT_BLOCK_CLASSDECLARATION:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (ConstructorDeclaration) arguments.get(1),
					(TypeDeclarationStatement) arguments.get(2), (Block) arguments.get(3),
					(ClassDeclaration) arguments.get(4));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___CHECK_DEC_BWD__TCLASS_TYPEGRAPH_TPACKAGE_TPACKAGE_TCLASS:
			return checkDEC_BWD((TClass) arguments.get(0), (TypeGraph) arguments.get(1), (TPackage) arguments.get(2),
					(TPackage) arguments.get(3), (TClass) arguments.get(4));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_CLASSDECLARATION_CONSTRUCTORDECLARATION_BLOCK_TCLASS_TYPEGRAPH_TPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (ClassDeclaration) arguments.get(2),
					(ConstructorDeclaration) arguments.get(3), (Block) arguments.get(4), (TClass) arguments.get(5),
					(TypeGraph) arguments.get(6), (TPackage) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.CLASS_INNER_CONSTRUCTOR___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassInnerConstructor_0_1_initialbindings_blackBBBBBBB(
			ClassInnerConstructor _this, Match match, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass) {
		if (!eInnerClass.equals(eOuterClass)) {
			return new Object[] { _this, match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
					eCodeBlock, eInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_0_2_SolveCSP_bindingFBBBBBBB(ClassInnerConstructor _this,
			Match match, ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eOuterClass, eConstructorDeclaration,
				typeDeclarationStatement, eCodeBlock, eInnerClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
					eCodeBlock, eInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerConstructor_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			ClassInnerConstructor _this, Match match, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass) {
		Object[] result_pattern_ClassInnerConstructor_0_2_SolveCSP_binding = pattern_ClassInnerConstructor_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass);
		if (result_pattern_ClassInnerConstructor_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerConstructor_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInnerConstructor_0_2_SolveCSP_black = pattern_ClassInnerConstructor_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerConstructor_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
						eCodeBlock, eInnerClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerConstructor_0_3_CheckCSP_expressionFBB(ClassInnerConstructor _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass) {
		if (!eInnerClass.equals(eOuterClass)) {
			return new Object[] { match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement, eCodeBlock,
					eInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock,
			ClassDeclaration eInnerClass) {
		EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeDeclarationStatement);
		match.getToBeTranslatedNodes().add(eInnerClass);
		String typeDeclarationStatement__eInnerClass____declaration_name_prime = "declaration";
		String eCodeBlock__typeDeclarationStatement____statements_name_prime = "statements";
		typeDeclarationStatement__eInnerClass____declaration.setSrc(typeDeclarationStatement);
		typeDeclarationStatement__eInnerClass____declaration.setTrg(eInnerClass);
		match.getToBeTranslatedEdges().add(typeDeclarationStatement__eInnerClass____declaration);
		eCodeBlock__typeDeclarationStatement____statements.setSrc(eCodeBlock);
		eCodeBlock__typeDeclarationStatement____statements.setTrg(typeDeclarationStatement);
		match.getToBeTranslatedEdges().add(eCodeBlock__typeDeclarationStatement____statements);
		typeDeclarationStatement__eInnerClass____declaration
				.setName(typeDeclarationStatement__eInnerClass____declaration_name_prime);
		eCodeBlock__typeDeclarationStatement____statements
				.setName(eCodeBlock__typeDeclarationStatement____statements_name_prime);
		return new Object[] { match, typeDeclarationStatement, eCodeBlock, eInnerClass,
				typeDeclarationStatement__eInnerClass____declaration,
				eCodeBlock__typeDeclarationStatement____statements };
	}

	public static final Object[] pattern_ClassInnerConstructor_0_5_collectcontextelements_blackBBBBBB(Match match,
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass) {
		if (!eInnerClass.equals(eOuterClass)) {
			return new Object[] { match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement, eCodeBlock,
					eInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_0_5_collectcontextelements_greenBBBBFFF(Match match,
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock) {
		EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eCodeBlock____body = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(eOuterClass);
		match.getContextNodes().add(eConstructorDeclaration);
		match.getContextNodes().add(eCodeBlock);
		String eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eConstructorDeclaration__eCodeBlock____body_name_prime = "body";
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setTrg(eConstructorDeclaration);
		match.getContextEdges().add(eOuterClass__eConstructorDeclaration____bodyDeclarations);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		match.getContextEdges().add(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration);
		eConstructorDeclaration__eCodeBlock____body.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eCodeBlock____body.setTrg(eCodeBlock);
		match.getContextEdges().add(eConstructorDeclaration__eCodeBlock____body);
		eOuterClass__eConstructorDeclaration____bodyDeclarations
				.setName(eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		eConstructorDeclaration__eCodeBlock____body.setName(eConstructorDeclaration__eCodeBlock____body_name_prime);
		return new Object[] { match, eOuterClass, eConstructorDeclaration, eCodeBlock,
				eOuterClass__eConstructorDeclaration____bodyDeclarations,
				eConstructorDeclaration__eOuterClass____abstractTypeDeclaration,
				eConstructorDeclaration__eCodeBlock____body };
	}

	public static final void pattern_ClassInnerConstructor_0_6_registerobjectstomatch_expressionBBBBBBB(
			ClassInnerConstructor _this, Match match, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass) {
		_this.registerObjectsToMatch_FWD(match, eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
				eCodeBlock, eInnerClass);

	}

	public static final boolean pattern_ClassInnerConstructor_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerConstructor_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("eOuterClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("eConstructorDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeDeclarationStatement");
		EObject _localVariable_4 = isApplicableMatch.getObject("eCodeBlock");
		EObject _localVariable_5 = isApplicableMatch.getObject("eInnerClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_7 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_8 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpEOuterClassToTOuterClass = _localVariable_0;
		EObject tmpEOuterClass = _localVariable_1;
		EObject tmpEConstructorDeclaration = _localVariable_2;
		EObject tmpTypeDeclarationStatement = _localVariable_3;
		EObject tmpECodeBlock = _localVariable_4;
		EObject tmpEInnerClass = _localVariable_5;
		EObject tmpTOuterClass = _localVariable_6;
		EObject tmpTypeGraph = _localVariable_7;
		EObject tmpTOuterPackage = _localVariable_8;
		if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
			if (tmpEOuterClass instanceof ClassDeclaration) {
				ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
				if (tmpEConstructorDeclaration instanceof ConstructorDeclaration) {
					ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) tmpEConstructorDeclaration;
					if (tmpTypeDeclarationStatement instanceof TypeDeclarationStatement) {
						TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) tmpTypeDeclarationStatement;
						if (tmpECodeBlock instanceof Block) {
							Block eCodeBlock = (Block) tmpECodeBlock;
							if (tmpEInnerClass instanceof ClassDeclaration) {
								ClassDeclaration eInnerClass = (ClassDeclaration) tmpEInnerClass;
								if (tmpTOuterClass instanceof TClass) {
									TClass tOuterClass = (TClass) tmpTOuterClass;
									if (tmpTypeGraph instanceof TypeGraph) {
										TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
										if (tmpTOuterPackage instanceof TPackage) {
											TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
											return new Object[] { eOuterClassToTOuterClass, eOuterClass,
													eConstructorDeclaration, typeDeclarationStatement, eCodeBlock,
													eInnerClass, tOuterClass, typeGraph, tOuterPackage,
													isApplicableMatch };
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

	public static final Object[] pattern_ClassInnerConstructor_1_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch) {
		if (!eInnerClass.equals(eOuterClass)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
							typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage,
							csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInnerConstructor_1_1_performtransformation_binding = pattern_ClassInnerConstructor_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInnerConstructor_1_1_performtransformation_binding != null) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[0];
			ClassDeclaration eOuterClass = (ClassDeclaration) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[1];
			ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[2];
			TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[3];
			Block eCodeBlock = (Block) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[4];
			ClassDeclaration eInnerClass = (ClassDeclaration) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[5];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[6];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[7];
			TPackage tOuterPackage = (TPackage) result_pattern_ClassInnerConstructor_1_1_performtransformation_binding[8];

			Object[] result_pattern_ClassInnerConstructor_1_1_performtransformation_black = pattern_ClassInnerConstructor_1_1_performtransformation_blackBBBBBBBBBFBB(
					eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
					eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage, _this, isApplicableMatch);
			if (result_pattern_ClassInnerConstructor_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInnerConstructor_1_1_performtransformation_black[9];

				return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
						typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_1_1_performtransformation_greenFBBBFFB(
			ClassDeclaration eInnerClass, TypeGraph typeGraph, TPackage tOuterPackage, CSP csp) {
		TypeToTAbstractType eInnerClassToTInnerClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TPackage tInnerPackage = BasicFactory.eINSTANCE.createTPackage();
		TClass tInnerClass = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("tInnerPackage", "ID");
		Object _localVariable_1 = csp.getValue("tInnerPackage", "tName");
		Object _localVariable_2 = csp.getValue("tInnerClass", "ID");
		Object _localVariable_3 = csp.getValue("tInnerClass", "tName");
		eInnerClassToTInnerClass.setSource(eInnerClass);
		tInnerPackage.setParent(tOuterPackage);
		eInnerClassToTInnerClass.setTarget(tInnerClass);
		typeGraph.getOwnedTypes().add(tInnerClass);
		typeGraph.getClasses().add(tInnerClass);
		tInnerPackage.getClasses().add(tInnerClass);
		tInnerPackage.getOwnedTypes().add(tInnerClass);
		int tInnerPackage_ID_prime = (int) _localVariable_0;
		String tInnerPackage_tName_prime = (String) _localVariable_1;
		int tInnerClass_ID_prime = (int) _localVariable_2;
		String tInnerClass_tName_prime = (String) _localVariable_3;
		tInnerPackage.setID(Integer.valueOf(tInnerPackage_ID_prime));
		tInnerPackage.setTName(tInnerPackage_tName_prime);
		tInnerClass.setID(Integer.valueOf(tInnerClass_ID_prime));
		tInnerClass.setTName(tInnerClass_tName_prime);
		return new Object[] { eInnerClassToTInnerClass, eInnerClass, typeGraph, tOuterPackage, tInnerPackage,
				tInnerClass, csp };
	}

	public static final Object[] pattern_ClassInnerConstructor_1_2_collecttranslatedelements_blackBBBBB(
			TypeToTAbstractType eInnerClassToTInnerClass, TypeDeclarationStatement typeDeclarationStatement,
			ClassDeclaration eInnerClass, TPackage tInnerPackage, TClass tInnerClass) {
		return new Object[] { eInnerClassToTInnerClass, typeDeclarationStatement, eInnerClass, tInnerPackage,
				tInnerClass };
	}

	public static final Object[] pattern_ClassInnerConstructor_1_2_collecttranslatedelements_greenFBBBBB(
			TypeToTAbstractType eInnerClassToTInnerClass, TypeDeclarationStatement typeDeclarationStatement,
			ClassDeclaration eInnerClass, TPackage tInnerPackage, TClass tInnerClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eInnerClassToTInnerClass);
		ruleresult.getTranslatedElements().add(typeDeclarationStatement);
		ruleresult.getTranslatedElements().add(eInnerClass);
		ruleresult.getCreatedElements().add(tInnerPackage);
		ruleresult.getCreatedElements().add(tInnerClass);
		return new Object[] { ruleresult, eInnerClassToTInnerClass, typeDeclarationStatement, eInnerClass,
				tInnerPackage, tInnerClass };
	}

	public static final Object[] pattern_ClassInnerConstructor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass, EObject eOuterClassToTOuterClass,
			EObject eOuterClass, EObject eConstructorDeclaration, EObject typeDeclarationStatement, EObject eCodeBlock,
			EObject eInnerClass, EObject tOuterClass, EObject typeGraph, EObject tOuterPackage, EObject tInnerPackage,
			EObject tInnerClass) {
		if (!eInnerClassToTInnerClass.equals(eOuterClassToTOuterClass)) {
			if (!eInnerClassToTInnerClass.equals(eOuterClass)) {
				if (!eInnerClassToTInnerClass.equals(typeDeclarationStatement)) {
					if (!eInnerClassToTInnerClass.equals(tOuterClass)) {
						if (!eInnerClassToTInnerClass.equals(typeGraph)) {
							if (!eInnerClassToTInnerClass.equals(tOuterPackage)) {
								if (!eInnerClassToTInnerClass.equals(tInnerPackage)) {
									if (!eInnerClassToTInnerClass.equals(tInnerClass)) {
										if (!eOuterClassToTOuterClass.equals(typeDeclarationStatement)) {
											if (!eOuterClassToTOuterClass.equals(tOuterClass)) {
												if (!eOuterClassToTOuterClass.equals(typeGraph)) {
													if (!eOuterClassToTOuterClass.equals(tOuterPackage)) {
														if (!eOuterClassToTOuterClass.equals(tInnerPackage)) {
															if (!eOuterClassToTOuterClass.equals(tInnerClass)) {
																if (!eOuterClass.equals(eOuterClassToTOuterClass)) {
																	if (!eOuterClass.equals(typeDeclarationStatement)) {
																		if (!eOuterClass.equals(tOuterClass)) {
																			if (!eOuterClass.equals(typeGraph)) {
																				if (!eOuterClass
																						.equals(tOuterPackage)) {
																					if (!eOuterClass
																							.equals(tInnerPackage)) {
																						if (!eOuterClass
																								.equals(tInnerClass)) {
																							if (!eConstructorDeclaration
																									.equals(eInnerClassToTInnerClass)) {
																								if (!eConstructorDeclaration
																										.equals(eOuterClassToTOuterClass)) {
																									if (!eConstructorDeclaration
																											.equals(eOuterClass)) {
																										if (!eConstructorDeclaration
																												.equals(typeDeclarationStatement)) {
																											if (!eConstructorDeclaration
																													.equals(eInnerClass)) {
																												if (!eConstructorDeclaration
																														.equals(tOuterClass)) {
																													if (!eConstructorDeclaration
																															.equals(typeGraph)) {
																														if (!eConstructorDeclaration
																																.equals(tOuterPackage)) {
																															if (!eConstructorDeclaration
																																	.equals(tInnerPackage)) {
																																if (!eConstructorDeclaration
																																		.equals(tInnerClass)) {
																																	if (!typeDeclarationStatement
																																			.equals(typeGraph)) {
																																		if (!eCodeBlock
																																				.equals(eInnerClassToTInnerClass)) {
																																			if (!eCodeBlock
																																					.equals(eOuterClassToTOuterClass)) {
																																				if (!eCodeBlock
																																						.equals(eOuterClass)) {
																																					if (!eCodeBlock
																																							.equals(eConstructorDeclaration)) {
																																						if (!eCodeBlock
																																								.equals(typeDeclarationStatement)) {
																																							if (!eCodeBlock
																																									.equals(eInnerClass)) {
																																								if (!eCodeBlock
																																										.equals(tOuterClass)) {
																																									if (!eCodeBlock
																																											.equals(typeGraph)) {
																																										if (!eCodeBlock
																																												.equals(tOuterPackage)) {
																																											if (!eCodeBlock
																																													.equals(tInnerPackage)) {
																																												if (!eCodeBlock
																																														.equals(tInnerClass)) {
																																													if (!eInnerClass
																																															.equals(eInnerClassToTInnerClass)) {
																																														if (!eInnerClass
																																																.equals(eOuterClassToTOuterClass)) {
																																															if (!eInnerClass
																																																	.equals(eOuterClass)) {
																																																if (!eInnerClass
																																																		.equals(typeDeclarationStatement)) {
																																																	if (!eInnerClass
																																																			.equals(tOuterClass)) {
																																																		if (!eInnerClass
																																																				.equals(typeGraph)) {
																																																			if (!eInnerClass
																																																					.equals(tOuterPackage)) {
																																																				if (!eInnerClass
																																																						.equals(tInnerPackage)) {
																																																					if (!eInnerClass
																																																							.equals(tInnerClass)) {
																																																						if (!tOuterClass
																																																								.equals(typeDeclarationStatement)) {
																																																							if (!tOuterClass
																																																									.equals(typeGraph)) {
																																																								if (!tOuterClass
																																																										.equals(tOuterPackage)) {
																																																									if (!tOuterPackage
																																																											.equals(typeDeclarationStatement)) {
																																																										if (!tOuterPackage
																																																												.equals(typeGraph)) {
																																																											if (!tInnerPackage
																																																													.equals(typeDeclarationStatement)) {
																																																												if (!tInnerPackage
																																																														.equals(tOuterClass)) {
																																																													if (!tInnerPackage
																																																															.equals(typeGraph)) {
																																																														if (!tInnerPackage
																																																																.equals(tOuterPackage)) {
																																																															if (!tInnerClass
																																																																	.equals(typeDeclarationStatement)) {
																																																																if (!tInnerClass
																																																																		.equals(tOuterClass)) {
																																																																	if (!tInnerClass
																																																																			.equals(typeGraph)) {
																																																																		if (!tInnerClass
																																																																				.equals(tOuterPackage)) {
																																																																			if (!tInnerClass
																																																																					.equals(tInnerPackage)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						eInnerClassToTInnerClass,
																																																																						eOuterClassToTOuterClass,
																																																																						eOuterClass,
																																																																						eConstructorDeclaration,
																																																																						typeDeclarationStatement,
																																																																						eCodeBlock,
																																																																						eInnerClass,
																																																																						tOuterClass,
																																																																						typeGraph,
																																																																						tOuterPackage,
																																																																						tInnerPackage,
																																																																						tInnerClass };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerConstructor_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass, EObject typeDeclarationStatement,
			EObject eCodeBlock, EObject eInnerClass, EObject typeGraph, EObject tOuterPackage, EObject tInnerPackage,
			EObject tInnerClass) {
		EMoflonEdge eInnerClassToTInnerClass__eInnerClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInnerClassToTInnerClass__tInnerClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInnerConstructor";
		String eInnerClassToTInnerClass__eInnerClass____source_name_prime = "source";
		String eInnerClassToTInnerClass__tInnerClass____target_name_prime = "target";
		String typeDeclarationStatement__eInnerClass____declaration_name_prime = "declaration";
		String eCodeBlock__typeDeclarationStatement____statements_name_prime = "statements";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		eInnerClassToTInnerClass__eInnerClass____source.setSrc(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass__eInnerClass____source.setTrg(eInnerClass);
		ruleresult.getCreatedEdges().add(eInnerClassToTInnerClass__eInnerClass____source);
		eInnerClassToTInnerClass__tInnerClass____target.setSrc(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(eInnerClassToTInnerClass__tInnerClass____target);
		typeDeclarationStatement__eInnerClass____declaration.setSrc(typeDeclarationStatement);
		typeDeclarationStatement__eInnerClass____declaration.setTrg(eInnerClass);
		ruleresult.getTranslatedEdges().add(typeDeclarationStatement__eInnerClass____declaration);
		eCodeBlock__typeDeclarationStatement____statements.setSrc(eCodeBlock);
		eCodeBlock__typeDeclarationStatement____statements.setTrg(typeDeclarationStatement);
		ruleresult.getTranslatedEdges().add(eCodeBlock__typeDeclarationStatement____statements);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tInnerClass__typeGraph____pg);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getCreatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		ruleresult.getCreatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerPackage__tInnerClass____classes);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		ruleresult.getCreatedEdges().add(tInnerClass__tInnerPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eInnerClassToTInnerClass__eInnerClass____source
				.setName(eInnerClassToTInnerClass__eInnerClass____source_name_prime);
		eInnerClassToTInnerClass__tInnerClass____target
				.setName(eInnerClassToTInnerClass__tInnerClass____target_name_prime);
		typeDeclarationStatement__eInnerClass____declaration
				.setName(typeDeclarationStatement__eInnerClass____declaration_name_prime);
		eCodeBlock__typeDeclarationStatement____statements
				.setName(eCodeBlock__typeDeclarationStatement____statements_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		return new Object[] { ruleresult, eInnerClassToTInnerClass, typeDeclarationStatement, eCodeBlock, eInnerClass,
				typeGraph, tOuterPackage, tInnerPackage, tInnerClass, eInnerClassToTInnerClass__eInnerClass____source,
				eInnerClassToTInnerClass__tInnerClass____target, typeDeclarationStatement__eInnerClass____declaration,
				eCodeBlock__typeDeclarationStatement____statements, typeGraph__tInnerClass____ownedTypes,
				tInnerClass__typeGraph____pg, typeGraph__tInnerClass____classes, tInnerPackage__tOuterPackage____parent,
				tOuterPackage__tInnerPackage____subpackage, tInnerPackage__tInnerClass____classes,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package };
	}

	public static final void pattern_ClassInnerConstructor_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			ClassInnerConstructor _this, PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass,
			EObject eOuterClassToTOuterClass, EObject eOuterClass, EObject eConstructorDeclaration,
			EObject typeDeclarationStatement, EObject eCodeBlock, EObject eInnerClass, EObject tOuterClass,
			EObject typeGraph, EObject tOuterPackage, EObject tInnerPackage, EObject tInnerClass) {
		_this.registerObjects_FWD(ruleresult, eInnerClassToTInnerClass, eOuterClassToTOuterClass, eOuterClass,
				eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph,
				tOuterPackage, tInnerPackage, tInnerClass);

	}

	public static final PerformRuleResult pattern_ClassInnerConstructor_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_2_1_preparereturnvalue_bindingFB(
			ClassInnerConstructor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInnerConstructor _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInnerConstructor _this) {
		Object[] result_pattern_ClassInnerConstructor_2_1_preparereturnvalue_binding = pattern_ClassInnerConstructor_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerConstructor_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInnerConstructor_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerConstructor_2_1_preparereturnvalue_black = pattern_ClassInnerConstructor_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInnerConstructor_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInnerConstructor_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ClassInnerConstructor";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInnerConstructor_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eOuterClass");
		EObject _localVariable_1 = match.getObject("eConstructorDeclaration");
		EObject _localVariable_2 = match.getObject("typeDeclarationStatement");
		EObject _localVariable_3 = match.getObject("eCodeBlock");
		EObject _localVariable_4 = match.getObject("eInnerClass");
		EObject tmpEOuterClass = _localVariable_0;
		EObject tmpEConstructorDeclaration = _localVariable_1;
		EObject tmpTypeDeclarationStatement = _localVariable_2;
		EObject tmpECodeBlock = _localVariable_3;
		EObject tmpEInnerClass = _localVariable_4;
		if (tmpEOuterClass instanceof ClassDeclaration) {
			ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
			if (tmpEConstructorDeclaration instanceof ConstructorDeclaration) {
				ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) tmpEConstructorDeclaration;
				if (tmpTypeDeclarationStatement instanceof TypeDeclarationStatement) {
					TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) tmpTypeDeclarationStatement;
					if (tmpECodeBlock instanceof Block) {
						Block eCodeBlock = (Block) tmpECodeBlock;
						if (tmpEInnerClass instanceof ClassDeclaration) {
							ClassDeclaration eInnerClass = (ClassDeclaration) tmpEInnerClass;
							return new Object[] { eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
									eCodeBlock, eInnerClass, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerConstructor_2_2_corematch_blackFBBBBBFB(
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInnerClass.equals(eOuterClass)) {
			for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterClass, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTOuterClass = eOuterClassToTOuterClass.getTarget();
				if (tmpTOuterClass instanceof TClass) {
					TClass tOuterClass = (TClass) tmpTOuterClass;
					_result.add(new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
							typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerConstructor_2_3_findcontext_blackBBBBBBBFF(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass, TClass tOuterClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInnerClass.equals(eOuterClass)) {
			if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
				if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
					if (eOuterClass.getBodyDeclarations().contains(eConstructorDeclaration)) {
						if (eCodeBlock.equals(eConstructorDeclaration.getBody())) {
							if (eInnerClass.equals(typeDeclarationStatement.getDeclaration())) {
								if (eCodeBlock.getStatements().contains(typeDeclarationStatement)) {
									TypeGraph typeGraph = tOuterClass.getPg();
									if (typeGraph != null) {
										TPackage tOuterPackage = tOuterClass.getPackage();
										if (tOuterPackage != null) {
											_result.add(new Object[] { eOuterClassToTOuterClass, eOuterClass,
													eConstructorDeclaration, typeDeclarationStatement, eCodeBlock,
													eInnerClass, tOuterClass, typeGraph, tOuterPackage });
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

	public static final Object[] pattern_ClassInnerConstructor_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eCodeBlock____body = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eConstructorDeclaration__eCodeBlock____body_name_prime = "body";
		String typeDeclarationStatement__eInnerClass____declaration_name_prime = "declaration";
		String eCodeBlock__typeDeclarationStatement____statements_name_prime = "statements";
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__tOuterPackage____package_name_prime = "package";
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration);
		isApplicableMatch.getAllContextElements().add(typeDeclarationStatement);
		isApplicableMatch.getAllContextElements().add(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(eInnerClass);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setTrg(eConstructorDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass__eConstructorDeclaration____bodyDeclarations);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration);
		eConstructorDeclaration__eCodeBlock____body.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eCodeBlock____body.setTrg(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration__eCodeBlock____body);
		typeDeclarationStatement__eInnerClass____declaration.setSrc(typeDeclarationStatement);
		typeDeclarationStatement__eInnerClass____declaration.setTrg(eInnerClass);
		isApplicableMatch.getAllContextElements().add(typeDeclarationStatement__eInnerClass____declaration);
		eCodeBlock__typeDeclarationStatement____statements.setSrc(eCodeBlock);
		eCodeBlock__typeDeclarationStatement____statements.setTrg(typeDeclarationStatement);
		isApplicableMatch.getAllContextElements().add(eCodeBlock__typeDeclarationStatement____statements);
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass__typeGraph____pg);
		tOuterPackage__tOuterClass____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterClass____ownedTypes);
		tOuterClass__tOuterPackage____package.setSrc(tOuterClass);
		tOuterClass__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tOuterPackage____package);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		eOuterClass__eConstructorDeclaration____bodyDeclarations
				.setName(eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		eConstructorDeclaration__eCodeBlock____body.setName(eConstructorDeclaration__eCodeBlock____body_name_prime);
		typeDeclarationStatement__eInnerClass____declaration
				.setName(typeDeclarationStatement__eInnerClass____declaration_name_prime);
		eCodeBlock__typeDeclarationStatement____statements
				.setName(eCodeBlock__typeDeclarationStatement____statements_name_prime);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tOuterPackage__tOuterClass____ownedTypes.setName(tOuterPackage__tOuterClass____ownedTypes_name_prime);
		tOuterClass__tOuterPackage____package.setName(tOuterClass__tOuterPackage____package_name_prime);
		return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
				eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage, isApplicableMatch,
				eOuterClassToTOuterClass__eOuterClass____source, eOuterClassToTOuterClass__tOuterClass____target,
				eOuterClass__eConstructorDeclaration____bodyDeclarations,
				eConstructorDeclaration__eOuterClass____abstractTypeDeclaration,
				eConstructorDeclaration__eCodeBlock____body, typeDeclarationStatement__eInnerClass____declaration,
				eCodeBlock__typeDeclarationStatement____statements, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg, tOuterPackage__tOuterClass____ownedTypes,
				tOuterClass__tOuterPackage____package };
	}

	public static final Object[] pattern_ClassInnerConstructor_2_4_solveCSP_bindingFBBBBBBBBBBB(
			ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
				eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph,
				tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
					eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph,
					tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerConstructor_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage) {
		Object[] result_pattern_ClassInnerConstructor_2_4_solveCSP_binding = pattern_ClassInnerConstructor_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
				typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage);
		if (result_pattern_ClassInnerConstructor_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerConstructor_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerConstructor_2_4_solveCSP_black = pattern_ClassInnerConstructor_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerConstructor_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
						eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass,
						typeGraph, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerConstructor_2_5_checkCSP_expressionFBB(ClassInnerConstructor _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerConstructor_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerConstructor";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerConstructor_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_10_1_initialbindings_blackBBBBBBB(
			ClassInnerConstructor _this, Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage,
			TPackage tInnerPackage, TClass tInnerClass) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				return new Object[] { _this, match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_10_2_SolveCSP_bindingFBBBBBBB(
			ClassInnerConstructor _this, Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage,
			TPackage tInnerPackage, TClass tInnerClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tOuterClass, typeGraph, tOuterPackage,
				tInnerPackage, tInnerClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage,
					tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerConstructor_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			ClassInnerConstructor _this, Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage,
			TPackage tInnerPackage, TClass tInnerClass) {
		Object[] result_pattern_ClassInnerConstructor_10_2_SolveCSP_binding = pattern_ClassInnerConstructor_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
		if (result_pattern_ClassInnerConstructor_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerConstructor_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInnerConstructor_10_2_SolveCSP_black = pattern_ClassInnerConstructor_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerConstructor_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage,
						tInnerClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerConstructor_10_3_CheckCSP_expressionFBB(ClassInnerConstructor _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage,
			TClass tInnerClass) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				return new Object[] { match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(
			Match match, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass) {
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tInnerPackage);
		match.getToBeTranslatedNodes().add(tInnerClass);
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tInnerClass__typeGraph____pg);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		match.getToBeTranslatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		match.getToBeTranslatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tInnerPackage__tInnerClass____classes);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		match.getToBeTranslatedEdges().add(tInnerClass__tInnerPackage____package);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		return new Object[] { match, typeGraph, tOuterPackage, tInnerPackage, tInnerClass,
				typeGraph__tInnerClass____ownedTypes, tInnerClass__typeGraph____pg, typeGraph__tInnerClass____classes,
				tInnerPackage__tOuterPackage____parent, tOuterPackage__tInnerPackage____subpackage,
				tInnerPackage__tInnerClass____classes, tInnerPackage__tInnerClass____ownedTypes,
				tInnerClass__tInnerPackage____package };
	}

	public static final Object[] pattern_ClassInnerConstructor_10_5_collectcontextelements_blackBBBBBB(Match match,
			TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage,
			TClass tInnerClass) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				return new Object[] { match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_10_5_collectcontextelements_greenBBBBFFFF(Match match,
			TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage) {
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tOuterClass);
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterPackage);
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__tOuterPackage____package_name_prime = "package";
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		match.getContextEdges().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		match.getContextEdges().add(tOuterClass__typeGraph____pg);
		tOuterPackage__tOuterClass____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterClass____ownedTypes.setTrg(tOuterClass);
		match.getContextEdges().add(tOuterPackage__tOuterClass____ownedTypes);
		tOuterClass__tOuterPackage____package.setSrc(tOuterClass);
		tOuterClass__tOuterPackage____package.setTrg(tOuterPackage);
		match.getContextEdges().add(tOuterClass__tOuterPackage____package);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tOuterPackage__tOuterClass____ownedTypes.setName(tOuterPackage__tOuterClass____ownedTypes_name_prime);
		tOuterClass__tOuterPackage____package.setName(tOuterClass__tOuterPackage____package_name_prime);
		return new Object[] { match, tOuterClass, typeGraph, tOuterPackage, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg, tOuterPackage__tOuterClass____ownedTypes,
				tOuterClass__tOuterPackage____package };
	}

	public static final void pattern_ClassInnerConstructor_10_6_registerobjectstomatch_expressionBBBBBBB(
			ClassInnerConstructor _this, Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage,
			TPackage tInnerPackage, TClass tInnerClass) {
		_this.registerObjectsToMatch_BWD(match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass);

	}

	public static final boolean pattern_ClassInnerConstructor_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerConstructor_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("eOuterClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("eConstructorDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("eCodeBlock");
		EObject _localVariable_4 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_6 = isApplicableMatch.getObject("tOuterPackage");
		EObject _localVariable_7 = isApplicableMatch.getObject("tInnerPackage");
		EObject _localVariable_8 = isApplicableMatch.getObject("tInnerClass");
		EObject tmpEOuterClassToTOuterClass = _localVariable_0;
		EObject tmpEOuterClass = _localVariable_1;
		EObject tmpEConstructorDeclaration = _localVariable_2;
		EObject tmpECodeBlock = _localVariable_3;
		EObject tmpTOuterClass = _localVariable_4;
		EObject tmpTypeGraph = _localVariable_5;
		EObject tmpTOuterPackage = _localVariable_6;
		EObject tmpTInnerPackage = _localVariable_7;
		EObject tmpTInnerClass = _localVariable_8;
		if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
			if (tmpEOuterClass instanceof ClassDeclaration) {
				ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
				if (tmpEConstructorDeclaration instanceof ConstructorDeclaration) {
					ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) tmpEConstructorDeclaration;
					if (tmpECodeBlock instanceof Block) {
						Block eCodeBlock = (Block) tmpECodeBlock;
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							if (tmpTypeGraph instanceof TypeGraph) {
								TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
								if (tmpTOuterPackage instanceof TPackage) {
									TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
									if (tmpTInnerPackage instanceof TPackage) {
										TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
										if (tmpTInnerClass instanceof TClass) {
											TClass tInnerClass = (TClass) tmpTInnerClass;
											return new Object[] { eOuterClassToTOuterClass, eOuterClass,
													eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph,
													tOuterPackage, tInnerPackage, tInnerClass, isApplicableMatch };
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

	public static final Object[] pattern_ClassInnerConstructor_11_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass, ClassInnerConstructor _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
								eCodeBlock, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass, csp,
								_this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInnerConstructor_11_1_performtransformation_binding = pattern_ClassInnerConstructor_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInnerConstructor_11_1_performtransformation_binding != null) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[0];
			ClassDeclaration eOuterClass = (ClassDeclaration) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[1];
			ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[2];
			Block eCodeBlock = (Block) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[3];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[4];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[5];
			TPackage tOuterPackage = (TPackage) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[6];
			TPackage tInnerPackage = (TPackage) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[7];
			TClass tInnerClass = (TClass) result_pattern_ClassInnerConstructor_11_1_performtransformation_binding[8];

			Object[] result_pattern_ClassInnerConstructor_11_1_performtransformation_black = pattern_ClassInnerConstructor_11_1_performtransformation_blackBBBBBBBBBFBB(
					eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph,
					tOuterPackage, tInnerPackage, tInnerClass, _this, isApplicableMatch);
			if (result_pattern_ClassInnerConstructor_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInnerConstructor_11_1_performtransformation_black[9];

				return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock,
						tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_11_1_performtransformation_greenFFBFBB(Block eCodeBlock,
			TClass tInnerClass, CSP csp) {
		TypeToTAbstractType eInnerClassToTInnerClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TypeDeclarationStatement typeDeclarationStatement = JavaFactory.eINSTANCE.createTypeDeclarationStatement();
		ClassDeclaration eInnerClass = JavaFactory.eINSTANCE.createClassDeclaration();
		Object _localVariable_0 = csp.getValue("eInnerClass", "name");
		eInnerClassToTInnerClass.setTarget(tInnerClass);
		eCodeBlock.getStatements().add(typeDeclarationStatement);
		eInnerClassToTInnerClass.setSource(eInnerClass);
		typeDeclarationStatement.setDeclaration(eInnerClass);
		String eInnerClass_name_prime = (String) _localVariable_0;
		eInnerClass.setName(eInnerClass_name_prime);
		return new Object[] { eInnerClassToTInnerClass, typeDeclarationStatement, eCodeBlock, eInnerClass, tInnerClass,
				csp };
	}

	public static final Object[] pattern_ClassInnerConstructor_11_2_collecttranslatedelements_blackBBBBB(
			TypeToTAbstractType eInnerClassToTInnerClass, TypeDeclarationStatement typeDeclarationStatement,
			ClassDeclaration eInnerClass, TPackage tInnerPackage, TClass tInnerClass) {
		return new Object[] { eInnerClassToTInnerClass, typeDeclarationStatement, eInnerClass, tInnerPackage,
				tInnerClass };
	}

	public static final Object[] pattern_ClassInnerConstructor_11_2_collecttranslatedelements_greenFBBBBB(
			TypeToTAbstractType eInnerClassToTInnerClass, TypeDeclarationStatement typeDeclarationStatement,
			ClassDeclaration eInnerClass, TPackage tInnerPackage, TClass tInnerClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eInnerClassToTInnerClass);
		ruleresult.getCreatedElements().add(typeDeclarationStatement);
		ruleresult.getCreatedElements().add(eInnerClass);
		ruleresult.getTranslatedElements().add(tInnerPackage);
		ruleresult.getTranslatedElements().add(tInnerClass);
		return new Object[] { ruleresult, eInnerClassToTInnerClass, typeDeclarationStatement, eInnerClass,
				tInnerPackage, tInnerClass };
	}

	public static final Object[] pattern_ClassInnerConstructor_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass, EObject eOuterClassToTOuterClass,
			EObject eOuterClass, EObject eConstructorDeclaration, EObject typeDeclarationStatement, EObject eCodeBlock,
			EObject eInnerClass, EObject tOuterClass, EObject typeGraph, EObject tOuterPackage, EObject tInnerPackage,
			EObject tInnerClass) {
		if (!eInnerClassToTInnerClass.equals(eOuterClassToTOuterClass)) {
			if (!eInnerClassToTInnerClass.equals(eOuterClass)) {
				if (!eInnerClassToTInnerClass.equals(typeDeclarationStatement)) {
					if (!eInnerClassToTInnerClass.equals(tOuterClass)) {
						if (!eInnerClassToTInnerClass.equals(typeGraph)) {
							if (!eInnerClassToTInnerClass.equals(tOuterPackage)) {
								if (!eInnerClassToTInnerClass.equals(tInnerPackage)) {
									if (!eInnerClassToTInnerClass.equals(tInnerClass)) {
										if (!eOuterClassToTOuterClass.equals(typeDeclarationStatement)) {
											if (!eOuterClassToTOuterClass.equals(tOuterClass)) {
												if (!eOuterClassToTOuterClass.equals(typeGraph)) {
													if (!eOuterClassToTOuterClass.equals(tOuterPackage)) {
														if (!eOuterClassToTOuterClass.equals(tInnerPackage)) {
															if (!eOuterClassToTOuterClass.equals(tInnerClass)) {
																if (!eOuterClass.equals(eOuterClassToTOuterClass)) {
																	if (!eOuterClass.equals(typeDeclarationStatement)) {
																		if (!eOuterClass.equals(tOuterClass)) {
																			if (!eOuterClass.equals(typeGraph)) {
																				if (!eOuterClass
																						.equals(tOuterPackage)) {
																					if (!eOuterClass
																							.equals(tInnerPackage)) {
																						if (!eOuterClass
																								.equals(tInnerClass)) {
																							if (!eConstructorDeclaration
																									.equals(eInnerClassToTInnerClass)) {
																								if (!eConstructorDeclaration
																										.equals(eOuterClassToTOuterClass)) {
																									if (!eConstructorDeclaration
																											.equals(eOuterClass)) {
																										if (!eConstructorDeclaration
																												.equals(typeDeclarationStatement)) {
																											if (!eConstructorDeclaration
																													.equals(eInnerClass)) {
																												if (!eConstructorDeclaration
																														.equals(tOuterClass)) {
																													if (!eConstructorDeclaration
																															.equals(typeGraph)) {
																														if (!eConstructorDeclaration
																																.equals(tOuterPackage)) {
																															if (!eConstructorDeclaration
																																	.equals(tInnerPackage)) {
																																if (!eConstructorDeclaration
																																		.equals(tInnerClass)) {
																																	if (!typeDeclarationStatement
																																			.equals(typeGraph)) {
																																		if (!eCodeBlock
																																				.equals(eInnerClassToTInnerClass)) {
																																			if (!eCodeBlock
																																					.equals(eOuterClassToTOuterClass)) {
																																				if (!eCodeBlock
																																						.equals(eOuterClass)) {
																																					if (!eCodeBlock
																																							.equals(eConstructorDeclaration)) {
																																						if (!eCodeBlock
																																								.equals(typeDeclarationStatement)) {
																																							if (!eCodeBlock
																																									.equals(eInnerClass)) {
																																								if (!eCodeBlock
																																										.equals(tOuterClass)) {
																																									if (!eCodeBlock
																																											.equals(typeGraph)) {
																																										if (!eCodeBlock
																																												.equals(tOuterPackage)) {
																																											if (!eCodeBlock
																																													.equals(tInnerPackage)) {
																																												if (!eCodeBlock
																																														.equals(tInnerClass)) {
																																													if (!eInnerClass
																																															.equals(eInnerClassToTInnerClass)) {
																																														if (!eInnerClass
																																																.equals(eOuterClassToTOuterClass)) {
																																															if (!eInnerClass
																																																	.equals(eOuterClass)) {
																																																if (!eInnerClass
																																																		.equals(typeDeclarationStatement)) {
																																																	if (!eInnerClass
																																																			.equals(tOuterClass)) {
																																																		if (!eInnerClass
																																																				.equals(typeGraph)) {
																																																			if (!eInnerClass
																																																					.equals(tOuterPackage)) {
																																																				if (!eInnerClass
																																																						.equals(tInnerPackage)) {
																																																					if (!eInnerClass
																																																							.equals(tInnerClass)) {
																																																						if (!tOuterClass
																																																								.equals(typeDeclarationStatement)) {
																																																							if (!tOuterClass
																																																									.equals(typeGraph)) {
																																																								if (!tOuterClass
																																																										.equals(tOuterPackage)) {
																																																									if (!tOuterPackage
																																																											.equals(typeDeclarationStatement)) {
																																																										if (!tOuterPackage
																																																												.equals(typeGraph)) {
																																																											if (!tInnerPackage
																																																													.equals(typeDeclarationStatement)) {
																																																												if (!tInnerPackage
																																																														.equals(tOuterClass)) {
																																																													if (!tInnerPackage
																																																															.equals(typeGraph)) {
																																																														if (!tInnerPackage
																																																																.equals(tOuterPackage)) {
																																																															if (!tInnerClass
																																																																	.equals(typeDeclarationStatement)) {
																																																																if (!tInnerClass
																																																																		.equals(tOuterClass)) {
																																																																	if (!tInnerClass
																																																																			.equals(typeGraph)) {
																																																																		if (!tInnerClass
																																																																				.equals(tOuterPackage)) {
																																																																			if (!tInnerClass
																																																																					.equals(tInnerPackage)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						eInnerClassToTInnerClass,
																																																																						eOuterClassToTOuterClass,
																																																																						eOuterClass,
																																																																						eConstructorDeclaration,
																																																																						typeDeclarationStatement,
																																																																						eCodeBlock,
																																																																						eInnerClass,
																																																																						tOuterClass,
																																																																						typeGraph,
																																																																						tOuterPackage,
																																																																						tInnerPackage,
																																																																						tInnerClass };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerConstructor_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass, EObject typeDeclarationStatement,
			EObject eCodeBlock, EObject eInnerClass, EObject typeGraph, EObject tOuterPackage, EObject tInnerPackage,
			EObject tInnerClass) {
		EMoflonEdge eInnerClassToTInnerClass__eInnerClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInnerClassToTInnerClass__tInnerClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInnerConstructor";
		String eInnerClassToTInnerClass__eInnerClass____source_name_prime = "source";
		String eInnerClassToTInnerClass__tInnerClass____target_name_prime = "target";
		String typeDeclarationStatement__eInnerClass____declaration_name_prime = "declaration";
		String eCodeBlock__typeDeclarationStatement____statements_name_prime = "statements";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		eInnerClassToTInnerClass__eInnerClass____source.setSrc(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass__eInnerClass____source.setTrg(eInnerClass);
		ruleresult.getCreatedEdges().add(eInnerClassToTInnerClass__eInnerClass____source);
		eInnerClassToTInnerClass__tInnerClass____target.setSrc(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(eInnerClassToTInnerClass__tInnerClass____target);
		typeDeclarationStatement__eInnerClass____declaration.setSrc(typeDeclarationStatement);
		typeDeclarationStatement__eInnerClass____declaration.setTrg(eInnerClass);
		ruleresult.getCreatedEdges().add(typeDeclarationStatement__eInnerClass____declaration);
		eCodeBlock__typeDeclarationStatement____statements.setSrc(eCodeBlock);
		eCodeBlock__typeDeclarationStatement____statements.setTrg(typeDeclarationStatement);
		ruleresult.getCreatedEdges().add(eCodeBlock__typeDeclarationStatement____statements);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tInnerClass__typeGraph____pg);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tInnerClass____classes);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		ruleresult.getTranslatedEdges().add(tInnerClass__tInnerPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eInnerClassToTInnerClass__eInnerClass____source
				.setName(eInnerClassToTInnerClass__eInnerClass____source_name_prime);
		eInnerClassToTInnerClass__tInnerClass____target
				.setName(eInnerClassToTInnerClass__tInnerClass____target_name_prime);
		typeDeclarationStatement__eInnerClass____declaration
				.setName(typeDeclarationStatement__eInnerClass____declaration_name_prime);
		eCodeBlock__typeDeclarationStatement____statements
				.setName(eCodeBlock__typeDeclarationStatement____statements_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		return new Object[] { ruleresult, eInnerClassToTInnerClass, typeDeclarationStatement, eCodeBlock, eInnerClass,
				typeGraph, tOuterPackage, tInnerPackage, tInnerClass, eInnerClassToTInnerClass__eInnerClass____source,
				eInnerClassToTInnerClass__tInnerClass____target, typeDeclarationStatement__eInnerClass____declaration,
				eCodeBlock__typeDeclarationStatement____statements, typeGraph__tInnerClass____ownedTypes,
				tInnerClass__typeGraph____pg, typeGraph__tInnerClass____classes, tInnerPackage__tOuterPackage____parent,
				tOuterPackage__tInnerPackage____subpackage, tInnerPackage__tInnerClass____classes,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package };
	}

	public static final void pattern_ClassInnerConstructor_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			ClassInnerConstructor _this, PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass,
			EObject eOuterClassToTOuterClass, EObject eOuterClass, EObject eConstructorDeclaration,
			EObject typeDeclarationStatement, EObject eCodeBlock, EObject eInnerClass, EObject tOuterClass,
			EObject typeGraph, EObject tOuterPackage, EObject tInnerPackage, EObject tInnerClass) {
		_this.registerObjects_BWD(ruleresult, eInnerClassToTInnerClass, eOuterClassToTOuterClass, eOuterClass,
				eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph,
				tOuterPackage, tInnerPackage, tInnerClass);

	}

	public static final PerformRuleResult pattern_ClassInnerConstructor_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_12_1_preparereturnvalue_bindingFB(
			ClassInnerConstructor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInnerConstructor _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInnerConstructor _this) {
		Object[] result_pattern_ClassInnerConstructor_12_1_preparereturnvalue_binding = pattern_ClassInnerConstructor_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerConstructor_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInnerConstructor_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerConstructor_12_1_preparereturnvalue_black = pattern_ClassInnerConstructor_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInnerConstructor_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInnerConstructor_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ClassInnerConstructor";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInnerConstructor_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tOuterClass");
		EObject _localVariable_1 = match.getObject("typeGraph");
		EObject _localVariable_2 = match.getObject("tOuterPackage");
		EObject _localVariable_3 = match.getObject("tInnerPackage");
		EObject _localVariable_4 = match.getObject("tInnerClass");
		EObject tmpTOuterClass = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTOuterPackage = _localVariable_2;
		EObject tmpTInnerPackage = _localVariable_3;
		EObject tmpTInnerClass = _localVariable_4;
		if (tmpTOuterClass instanceof TClass) {
			TClass tOuterClass = (TClass) tmpTOuterClass;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTOuterPackage instanceof TPackage) {
					TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
					if (tmpTInnerPackage instanceof TPackage) {
						TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
						if (tmpTInnerClass instanceof TClass) {
							TClass tInnerClass = (TClass) tmpTInnerClass;
							return new Object[] { tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass,
									match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerConstructor_12_2_corematch_blackFFBBBBBB(
			TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tOuterClass, TypeToTAbstractType.class, "target")) {
					Type tmpEOuterClass = eOuterClassToTOuterClass.getSource();
					if (tmpEOuterClass instanceof ClassDeclaration) {
						ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
						_result.add(new Object[] { eOuterClassToTOuterClass, eOuterClass, tOuterClass, typeGraph,
								tOuterPackage, tInnerPackage, tInnerClass, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerConstructor_12_3_findcontext_blackBBFFBBBBB(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass, TClass tOuterClass,
			TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
					if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
						if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
							if (tOuterPackage.getOwnedTypes().contains(tOuterClass)) {
								if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
									if (typeGraph.getClasses().contains(tInnerClass)) {
										if (tOuterPackage.equals(tInnerPackage.getParent())) {
											if (tInnerPackage.getClasses().contains(tInnerClass)) {
												if (tInnerPackage.getOwnedTypes().contains(tInnerClass)) {
													for (BodyDeclaration tmpEConstructorDeclaration : eOuterClass
															.getBodyDeclarations()) {
														if (tmpEConstructorDeclaration instanceof ConstructorDeclaration) {
															ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) tmpEConstructorDeclaration;
															Block eCodeBlock = eConstructorDeclaration.getBody();
															if (eCodeBlock != null) {
																_result.add(new Object[] { eOuterClassToTOuterClass,
																		eOuterClass, eConstructorDeclaration,
																		eCodeBlock, tOuterClass, typeGraph,
																		tOuterPackage, tInnerPackage, tInnerClass });
															}

														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerConstructor_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__eConstructorDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eConstructorDeclaration__eCodeBlock____body = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eConstructorDeclaration__eCodeBlock____body_name_prime = "body";
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__tOuterPackage____package_name_prime = "package";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration);
		isApplicableMatch.getAllContextElements().add(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tInnerClass);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eConstructorDeclaration____bodyDeclarations.setTrg(eConstructorDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass__eConstructorDeclaration____bodyDeclarations);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration);
		eConstructorDeclaration__eCodeBlock____body.setSrc(eConstructorDeclaration);
		eConstructorDeclaration__eCodeBlock____body.setTrg(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration__eCodeBlock____body);
		typeGraph__tOuterClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterClass____ownedTypes);
		tOuterClass__typeGraph____pg.setSrc(tOuterClass);
		tOuterClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass__typeGraph____pg);
		tOuterPackage__tOuterClass____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterClass____ownedTypes);
		tOuterClass__tOuterPackage____package.setSrc(tOuterClass);
		tOuterClass__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tOuterPackage____package);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tInnerClass__typeGraph____pg);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tInnerClass____classes);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tInnerClass__tInnerPackage____package);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		eOuterClass__eConstructorDeclaration____bodyDeclarations
				.setName(eOuterClass__eConstructorDeclaration____bodyDeclarations_name_prime);
		eConstructorDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eConstructorDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		eConstructorDeclaration__eCodeBlock____body.setName(eConstructorDeclaration__eCodeBlock____body_name_prime);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tOuterPackage__tOuterClass____ownedTypes.setName(tOuterPackage__tOuterClass____ownedTypes_name_prime);
		tOuterClass__tOuterPackage____package.setName(tOuterClass__tOuterPackage____package_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass,
				typeGraph, tOuterPackage, tInnerPackage, tInnerClass, isApplicableMatch,
				eOuterClassToTOuterClass__eOuterClass____source, eOuterClassToTOuterClass__tOuterClass____target,
				eOuterClass__eConstructorDeclaration____bodyDeclarations,
				eConstructorDeclaration__eOuterClass____abstractTypeDeclaration,
				eConstructorDeclaration__eCodeBlock____body, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg, tOuterPackage__tOuterClass____ownedTypes,
				tOuterClass__tOuterPackage____package, typeGraph__tInnerClass____ownedTypes,
				tInnerClass__typeGraph____pg, typeGraph__tInnerClass____classes, tInnerPackage__tOuterPackage____parent,
				tOuterPackage__tInnerPackage____subpackage, tInnerPackage__tInnerClass____classes,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package };
	}

	public static final Object[] pattern_ClassInnerConstructor_12_4_solveCSP_bindingFBBBBBBBBBBB(
			ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
				eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
					eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph, tOuterPackage, tInnerPackage,
					tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerConstructor_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass) {
		Object[] result_pattern_ClassInnerConstructor_12_4_solveCSP_binding = pattern_ClassInnerConstructor_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock,
				tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass);
		if (result_pattern_ClassInnerConstructor_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerConstructor_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerConstructor_12_4_solveCSP_black = pattern_ClassInnerConstructor_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerConstructor_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
						eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph, tOuterPackage, tInnerPackage,
						tInnerClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerConstructor_12_5_checkCSP_expressionFBB(ClassInnerConstructor _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerConstructor_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerConstructor";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerConstructor_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_20_1_preparereturnvalue_bindingFB(
			ClassInnerConstructor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInnerConstructor _this) {
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

	public static final Object[] pattern_ClassInnerConstructor_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInnerConstructor _this) {
		Object[] result_pattern_ClassInnerConstructor_20_1_preparereturnvalue_binding = pattern_ClassInnerConstructor_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerConstructor_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInnerConstructor_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerConstructor_20_1_preparereturnvalue_black = pattern_ClassInnerConstructor_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInnerConstructor_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInnerConstructor_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInnerConstructor_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassInnerConstructor_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_declaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeDeclarationStatement = _edge_declaration.getSrc();
		if (tmpTypeDeclarationStatement instanceof TypeDeclarationStatement) {
			TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) tmpTypeDeclarationStatement;
			EObject tmpEInnerClass = _edge_declaration.getTrg();
			if (tmpEInnerClass instanceof ClassDeclaration) {
				ClassDeclaration eInnerClass = (ClassDeclaration) tmpEInnerClass;
				if (eInnerClass.equals(typeDeclarationStatement.getDeclaration())) {
					for (Block eCodeBlock : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(typeDeclarationStatement, Block.class, "statements")) {
						for (AbstractMethodDeclaration tmpEConstructorDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(eCodeBlock, AbstractMethodDeclaration.class, "body")) {
							if (tmpEConstructorDeclaration instanceof ConstructorDeclaration) {
								ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) tmpEConstructorDeclaration;
								AbstractTypeDeclaration tmpEOuterClass = eConstructorDeclaration
										.getAbstractTypeDeclaration();
								if (tmpEOuterClass instanceof ClassDeclaration) {
									ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
									if (!eInnerClass.equals(eOuterClass)) {
										_result.add(new Object[] { eOuterClass, eConstructorDeclaration,
												typeDeclarationStatement, eCodeBlock, eInnerClass, _edge_declaration });
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

	public static final Object[] pattern_ClassInnerConstructor_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInnerConstructor_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ClassInnerConstructor _this, Match match, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eOuterClass, eConstructorDeclaration,
				typeDeclarationStatement, eCodeBlock, eInnerClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInnerConstructor_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInnerConstructor _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInnerConstructor_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_1_preparereturnvalue_bindingFB(
			ClassInnerConstructor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInnerConstructor _this) {
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

	public static final Object[] pattern_ClassInnerConstructor_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInnerConstructor _this) {
		Object[] result_pattern_ClassInnerConstructor_21_1_preparereturnvalue_binding = pattern_ClassInnerConstructor_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerConstructor_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInnerConstructor_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerConstructor_21_1_preparereturnvalue_black = pattern_ClassInnerConstructor_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInnerConstructor_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInnerConstructor_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInnerConstructor_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_0BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_typeGraph_178071 = tInnerPackage.getTypeGraph();
		if (__DEC_tInnerPackage_typeGraph_178071 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_typeGraph_178071)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_1BB(
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerPackage_subpackage_422358 = tInnerPackage.getParent();
			if (__DEC_tInnerPackage_subpackage_422358 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerPackage_subpackage_422358)) {
					if (!tOuterPackage.equals(__DEC_tInnerPackage_subpackage_422358)) {
						return new Object[] { tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_2BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_packages_298918 = tInnerPackage.getPg();
		if (__DEC_tInnerPackage_packages_298918 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_packages_298918)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_3BBB(
			TClass tInnerClass, TPackage tOuterPackage, TPackage tInnerPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tInnerClass_classes_195199 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tInnerClass, TPackage.class, "classes")) {
				if (!tOuterPackage.equals(__DEC_tInnerClass_classes_195199)) {
					if (!tInnerPackage.equals(__DEC_tInnerClass_classes_195199)) {
						return new Object[] { tInnerClass, tOuterPackage, tInnerPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_4BB(
			TClass tInnerClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tInnerClass_classes_179582 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tInnerClass_classes_179582)) {
				return new Object[] { tInnerClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_5BBB(
			TClass tInnerClass, TPackage tOuterPackage, TPackage tInnerPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerClass_ownedTypes_918078 = tInnerClass.getPackage();
			if (__DEC_tInnerClass_ownedTypes_918078 != null) {
				if (!tOuterPackage.equals(__DEC_tInnerClass_ownedTypes_918078)) {
					if (!tInnerPackage.equals(__DEC_tInnerClass_ownedTypes_918078)) {
						return new Object[] { tInnerClass, tOuterPackage, tInnerPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_6BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		if (typeGraph.equals(tInnerPackage.getTypeGraph())) {
			return new Object[] { tInnerPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_7BB(
			TypeGraph typeGraph, TPackage tInnerPackage) {
		if (typeGraph.getPackages().contains(tInnerPackage)) {
			return new Object[] { typeGraph, tInnerPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_8BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getClasses().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_9BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getOwnedTypes().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerConstructor_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_ownedTypes.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTInnerClass = _edge_ownedTypes.getTrg();
			if (tmpTInnerClass instanceof TClass) {
				TClass tInnerClass = (TClass) tmpTInnerClass;
				if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
					if (typeGraph.getClasses().contains(tInnerClass)) {
						TPackage tInnerPackage = tInnerClass.getPackage();
						if (tInnerPackage != null) {
							if (tInnerPackage.getClasses().contains(tInnerClass)) {
								TPackage tOuterPackage = tInnerPackage.getParent();
								if (tOuterPackage != null) {
									if (!tInnerPackage.equals(tOuterPackage)) {
										if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_4BB(
												tInnerClass, typeGraph) == null) {
											if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_0BB(
													tInnerPackage, typeGraph) == null) {
												if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_2BB(
														tInnerPackage, typeGraph) == null) {
													if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_6BB(
															tInnerPackage, typeGraph) == null) {
														if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_7BB(
																typeGraph, tInnerPackage) == null) {
															if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_1BB(
																	tInnerPackage, tOuterPackage) == null) {
																if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_3BBB(
																		tInnerClass, tOuterPackage,
																		tInnerPackage) == null) {
																	if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_5BBB(
																			tInnerClass, tOuterPackage,
																			tInnerPackage) == null) {
																		if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_8BB(
																				tOuterPackage, tInnerClass) == null) {
																			if (pattern_ClassInnerConstructor_21_2_testcorematchandDECs_black_nac_9BB(
																					tOuterPackage,
																					tInnerClass) == null) {
																				for (TAbstractType tmpTOuterClass : typeGraph
																						.getOwnedTypes()) {
																					if (tmpTOuterClass instanceof TClass) {
																						TClass tOuterClass = (TClass) tmpTOuterClass;
																						if (!tInnerClass
																								.equals(tOuterClass)) {
																							if (tOuterPackage
																									.getOwnedTypes()
																									.contains(
																											tOuterClass)) {
																								_result.add(
																										new Object[] {
																												tOuterClass,
																												typeGraph,
																												tOuterPackage,
																												tInnerPackage,
																												tInnerClass,
																												_edge_ownedTypes });
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerConstructor_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInnerConstructor_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ClassInnerConstructor _this, Match match, TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage,
			TPackage tInnerPackage, TClass tInnerClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tOuterClass, typeGraph, tOuterPackage, tInnerPackage,
				tInnerClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInnerConstructor_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInnerConstructor _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInnerConstructor_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_24_1_prepare_blackB(ClassInnerConstructor _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInnerConstructor_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassInnerConstructor_24_2_matchcontext_bindingFFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eOuterClass");
		EObject _localVariable_1 = sourceMatch.getObject("eConstructorDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("typeDeclarationStatement");
		EObject _localVariable_3 = sourceMatch.getObject("eCodeBlock");
		EObject _localVariable_4 = sourceMatch.getObject("eInnerClass");
		EObject _localVariable_5 = targetMatch.getObject("tOuterClass");
		EObject _localVariable_6 = targetMatch.getObject("typeGraph");
		EObject _localVariable_7 = targetMatch.getObject("tOuterPackage");
		EObject _localVariable_8 = targetMatch.getObject("tInnerPackage");
		EObject _localVariable_9 = targetMatch.getObject("tInnerClass");
		EObject tmpEOuterClass = _localVariable_0;
		EObject tmpEConstructorDeclaration = _localVariable_1;
		EObject tmpTypeDeclarationStatement = _localVariable_2;
		EObject tmpECodeBlock = _localVariable_3;
		EObject tmpEInnerClass = _localVariable_4;
		EObject tmpTOuterClass = _localVariable_5;
		EObject tmpTypeGraph = _localVariable_6;
		EObject tmpTOuterPackage = _localVariable_7;
		EObject tmpTInnerPackage = _localVariable_8;
		EObject tmpTInnerClass = _localVariable_9;
		if (tmpEOuterClass instanceof ClassDeclaration) {
			ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
			if (tmpEConstructorDeclaration instanceof ConstructorDeclaration) {
				ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) tmpEConstructorDeclaration;
				if (tmpTypeDeclarationStatement instanceof TypeDeclarationStatement) {
					TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) tmpTypeDeclarationStatement;
					if (tmpECodeBlock instanceof Block) {
						Block eCodeBlock = (Block) tmpECodeBlock;
						if (tmpEInnerClass instanceof ClassDeclaration) {
							ClassDeclaration eInnerClass = (ClassDeclaration) tmpEInnerClass;
							if (tmpTOuterClass instanceof TClass) {
								TClass tOuterClass = (TClass) tmpTOuterClass;
								if (tmpTypeGraph instanceof TypeGraph) {
									TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
									if (tmpTOuterPackage instanceof TPackage) {
										TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
										if (tmpTInnerPackage instanceof TPackage) {
											TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
											if (tmpTInnerClass instanceof TClass) {
												TClass tInnerClass = (TClass) tmpTInnerClass;
												return new Object[] { eOuterClass, eConstructorDeclaration,
														typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass,
														typeGraph, tOuterPackage, tInnerPackage, tInnerClass,
														sourceMatch, targetMatch };
											}
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

	public static final Iterable<Object[]> pattern_ClassInnerConstructor_24_2_matchcontext_blackFBBBBBBBBBBBB(
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass,
			TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInnerClass.equals(eOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				if (!tInnerClass.equals(tOuterClass)) {
					if (!sourceMatch.equals(targetMatch)) {
						if (eOuterClass.getBodyDeclarations().contains(eConstructorDeclaration)) {
							if (eCodeBlock.equals(eConstructorDeclaration.getBody())) {
								if (eInnerClass.equals(typeDeclarationStatement.getDeclaration())) {
									if (eCodeBlock.getStatements().contains(typeDeclarationStatement)) {
										if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
											if (tOuterPackage.getOwnedTypes().contains(tOuterClass)) {
												if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
													if (typeGraph.getClasses().contains(tInnerClass)) {
														if (tOuterPackage.equals(tInnerPackage.getParent())) {
															if (tInnerPackage.getClasses().contains(tInnerClass)) {
																if (tInnerPackage.getOwnedTypes()
																		.contains(tInnerClass)) {
																	for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(eOuterClass,
																					TypeToTAbstractType.class,
																					"source")) {
																		if (tOuterClass.equals(
																				eOuterClassToTOuterClass.getTarget())) {
																			_result.add(new Object[] {
																					eOuterClassToTOuterClass,
																					eOuterClass,
																					eConstructorDeclaration,
																					typeDeclarationStatement,
																					eCodeBlock, eInnerClass,
																					tOuterClass, typeGraph,
																					tOuterPackage, tInnerPackage,
																					tInnerClass, sourceMatch,
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
		}
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_24_2_matchcontext_greenBBBBBBBBBBBBFB(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, TypeDeclarationStatement typeDeclarationStatement,
			Block eCodeBlock, ClassDeclaration eInnerClass, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "ClassInnerConstructor";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eConstructorDeclaration);
		isApplicableMatch.getAllContextElements().add(typeDeclarationStatement);
		isApplicableMatch.getAllContextElements().add(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(eInnerClass);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tInnerClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
				eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_ClassInnerConstructor_24_3_checkcsp_bindingFBBBBBBBBBBBBBBB(
			ClassInnerConstructor _this, CCMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass,
			TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
				eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph,
				tOuterPackage, tInnerPackage, tInnerClass, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
					eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph,
					tOuterPackage, tInnerPackage, tInnerClass, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerConstructor_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBB(
			ClassInnerConstructor _this, CCMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass,
			TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassInnerConstructor_24_3_checkcsp_binding = pattern_ClassInnerConstructor_24_3_checkcsp_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration,
				typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass, typeGraph, tOuterPackage, tInnerPackage,
				tInnerClass, sourceMatch, targetMatch);
		if (result_pattern_ClassInnerConstructor_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerConstructor_24_3_checkcsp_binding[0];

			Object[] result_pattern_ClassInnerConstructor_24_3_checkcsp_black = pattern_ClassInnerConstructor_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_ClassInnerConstructor_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
						eConstructorDeclaration, typeDeclarationStatement, eCodeBlock, eInnerClass, tOuterClass,
						typeGraph, tOuterPackage, tInnerPackage, tInnerClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_24_4_createcorrespondence_blackBBBBBBBBBBB(
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass,
			TClass tOuterClass, TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass,
			CCMatch isApplicableMatch) {
		if (!eInnerClass.equals(eOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				if (!tInnerClass.equals(tOuterClass)) {
					return new Object[] { eOuterClass, eConstructorDeclaration, typeDeclarationStatement, eCodeBlock,
							eInnerClass, tOuterClass, typeGraph, tOuterPackage, tInnerPackage, tInnerClass,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_24_4_createcorrespondence_greenFBBB(
			ClassDeclaration eInnerClass, TClass tInnerClass, CCMatch isApplicableMatch) {
		TypeToTAbstractType eInnerClassToTInnerClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		eInnerClassToTInnerClass.setSource(eInnerClass);
		eInnerClassToTInnerClass.setTarget(tInnerClass);
		isApplicableMatch.getCreateCorr().add(eInnerClassToTInnerClass);
		return new Object[] { eInnerClassToTInnerClass, eInnerClass, tInnerClass, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerConstructor_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerConstructor_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerConstructor";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerConstructor_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_27_1_matchtggpattern_blackBBBBB(
			ClassDeclaration eOuterClass, ConstructorDeclaration eConstructorDeclaration,
			TypeDeclarationStatement typeDeclarationStatement, Block eCodeBlock, ClassDeclaration eInnerClass) {
		if (!eInnerClass.equals(eOuterClass)) {
			if (eOuterClass.getBodyDeclarations().contains(eConstructorDeclaration)) {
				if (eCodeBlock.equals(eConstructorDeclaration.getBody())) {
					if (eInnerClass.equals(typeDeclarationStatement.getDeclaration())) {
						if (eCodeBlock.getStatements().contains(typeDeclarationStatement)) {
							return new Object[] { eOuterClass, eConstructorDeclaration, typeDeclarationStatement,
									eCodeBlock, eInnerClass };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerConstructor_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerConstructor_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_0BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_typeGraph_185342 = tInnerPackage.getTypeGraph();
		if (__DEC_tInnerPackage_typeGraph_185342 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_typeGraph_185342)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_1BB(
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerPackage_subpackage_748989 = tInnerPackage.getParent();
			if (__DEC_tInnerPackage_subpackage_748989 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerPackage_subpackage_748989)) {
					if (!tOuterPackage.equals(__DEC_tInnerPackage_subpackage_748989)) {
						return new Object[] { tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_2BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_packages_594209 = tInnerPackage.getPg();
		if (__DEC_tInnerPackage_packages_594209 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_packages_594209)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_3BBB(TClass tInnerClass,
			TPackage tOuterPackage, TPackage tInnerPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tInnerClass_classes_116083 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tInnerClass, TPackage.class, "classes")) {
				if (!tOuterPackage.equals(__DEC_tInnerClass_classes_116083)) {
					if (!tInnerPackage.equals(__DEC_tInnerClass_classes_116083)) {
						return new Object[] { tInnerClass, tOuterPackage, tInnerPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_4BB(TClass tInnerClass,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tInnerClass_classes_269252 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tInnerClass_classes_269252)) {
				return new Object[] { tInnerClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_5BBB(TClass tInnerClass,
			TPackage tOuterPackage, TPackage tInnerPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerClass_ownedTypes_491807 = tInnerClass.getPackage();
			if (__DEC_tInnerClass_ownedTypes_491807 != null) {
				if (!tOuterPackage.equals(__DEC_tInnerClass_ownedTypes_491807)) {
					if (!tInnerPackage.equals(__DEC_tInnerClass_ownedTypes_491807)) {
						return new Object[] { tInnerClass, tOuterPackage, tInnerPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_6BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		if (typeGraph.equals(tInnerPackage.getTypeGraph())) {
			return new Object[] { tInnerPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_7BB(TypeGraph typeGraph,
			TPackage tInnerPackage) {
		if (typeGraph.getPackages().contains(tInnerPackage)) {
			return new Object[] { typeGraph, tInnerPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_8BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getClasses().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_9BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getOwnedTypes().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_28_1_matchtggpattern_blackBBBBB(TClass tOuterClass,
			TypeGraph typeGraph, TPackage tOuterPackage, TPackage tInnerPackage, TClass tInnerClass) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			if (!tInnerClass.equals(tOuterClass)) {
				if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
					if (tOuterPackage.getOwnedTypes().contains(tOuterClass)) {
						if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
							if (typeGraph.getClasses().contains(tInnerClass)) {
								if (tOuterPackage.equals(tInnerPackage.getParent())) {
									if (tInnerPackage.getClasses().contains(tInnerClass)) {
										if (tInnerPackage.getOwnedTypes().contains(tInnerClass)) {
											if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_0BB(
													tInnerPackage, typeGraph) == null) {
												if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_1BB(
														tInnerPackage, tOuterPackage) == null) {
													if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_2BB(
															tInnerPackage, typeGraph) == null) {
														if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_3BBB(
																tInnerClass, tOuterPackage, tInnerPackage) == null) {
															if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_4BB(
																	tInnerClass, typeGraph) == null) {
																if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_5BBB(
																		tInnerClass, tOuterPackage,
																		tInnerPackage) == null) {
																	if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_6BB(
																			tInnerPackage, typeGraph) == null) {
																		if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_7BB(
																				typeGraph, tInnerPackage) == null) {
																			if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_8BB(
																					tOuterPackage,
																					tInnerClass) == null) {
																				if (pattern_ClassInnerConstructor_28_1_matchtggpattern_black_nac_9BB(
																						tOuterPackage,
																						tInnerClass) == null) {
																					return new Object[] { tOuterClass,
																							typeGraph, tOuterPackage,
																							tInnerPackage,
																							tInnerClass };
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_ClassInnerConstructor_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerConstructor_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_1_createresult_blackB(ClassInnerConstructor _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInnerConstructor_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterClassToTOuterClass) {
		if (ruleResult.getCorrObjects().contains(eOuterClassToTOuterClass)) {
			return new Object[] { ruleResult, eOuterClassToTOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration eOuterClass) {
		if (ruleResult.getSourceObjects().contains(eOuterClass)) {
			return new Object[] { ruleResult, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ConstructorDeclaration eConstructorDeclaration) {
		if (ruleResult.getSourceObjects().contains(eConstructorDeclaration)) {
			return new Object[] { ruleResult, eConstructorDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Block eCodeBlock) {
		if (ruleResult.getSourceObjects().contains(eCodeBlock)) {
			return new Object[] { ruleResult, eCodeBlock };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TClass tOuterClass) {
		if (ruleResult.getTargetObjects().contains(tOuterClass)) {
			return new Object[] { ruleResult, tOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TPackage tOuterPackage) {
		if (ruleResult.getTargetObjects().contains(tOuterPackage)) {
			return new Object[] { ruleResult, tOuterPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerConstructor_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eOuterClassToTOuterClassList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEOuterClassToTOuterClass : eOuterClassToTOuterClassList.getEntryObjects()) {
				if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
					TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
					Type tmpEOuterClass = eOuterClassToTOuterClass.getSource();
					if (tmpEOuterClass instanceof ClassDeclaration) {
						ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
						TAbstractType tmpTOuterClass = eOuterClassToTOuterClass.getTarget();
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							TypeGraph typeGraph = tOuterClass.getPg();
							if (typeGraph != null) {
								TPackage tOuterPackage = tOuterClass.getPackage();
								if (tOuterPackage != null) {
									if (pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											eOuterClassToTOuterClass) == null) {
										if (pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, eOuterClass) == null) {
											if (pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, tOuterClass) == null) {
												if (pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_5BB(
														ruleResult, typeGraph) == null) {
													if (pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_6BB(
															ruleResult, tOuterPackage) == null) {
														for (BodyDeclaration tmpEConstructorDeclaration : eOuterClass
																.getBodyDeclarations()) {
															if (tmpEConstructorDeclaration instanceof ConstructorDeclaration) {
																ConstructorDeclaration eConstructorDeclaration = (ConstructorDeclaration) tmpEConstructorDeclaration;
																Block eCodeBlock = eConstructorDeclaration.getBody();
																if (eCodeBlock != null) {
																	if (pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_2BB(
																			ruleResult,
																			eConstructorDeclaration) == null) {
																		if (pattern_ClassInnerConstructor_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, eCodeBlock) == null) {
																			_result.add(new Object[] {
																					eOuterClassToTOuterClassList,
																					eOuterClassToTOuterClass,
																					eOuterClass,
																					eConstructorDeclaration, eCodeBlock,
																					tOuterClass, typeGraph,
																					tOuterPackage, ruleEntryContainer,
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

	public static final Object[] pattern_ClassInnerConstructor_29_3_solveCSP_bindingFBBBBBBBBBB(
			ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eOuterClassToTOuterClass,
				eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph, tOuterPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
					eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph, tOuterPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerConstructor_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ClassInnerConstructor _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassInnerConstructor_29_3_solveCSP_binding = pattern_ClassInnerConstructor_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock,
				tOuterClass, typeGraph, tOuterPackage, ruleResult);
		if (result_pattern_ClassInnerConstructor_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerConstructor_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerConstructor_29_3_solveCSP_black = pattern_ClassInnerConstructor_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerConstructor_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, eOuterClass,
						eConstructorDeclaration, eCodeBlock, tOuterClass, typeGraph, tOuterPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerConstructor_29_4_checkCSP_expressionFBB(ClassInnerConstructor _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerConstructor_29_5_checknacs_blackBBBBBBB(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage) {
		return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass,
				typeGraph, tOuterPackage };
	}

	public static final Object[] pattern_ClassInnerConstructor_29_6_perform_blackBBBBBBBB(
			TypeToTAbstractType eOuterClassToTOuterClass, ClassDeclaration eOuterClass,
			ConstructorDeclaration eConstructorDeclaration, Block eCodeBlock, TClass tOuterClass, TypeGraph typeGraph,
			TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eOuterClassToTOuterClass, eOuterClass, eConstructorDeclaration, eCodeBlock, tOuterClass,
				typeGraph, tOuterPackage, ruleResult };
	}

	public static final Object[] pattern_ClassInnerConstructor_29_6_perform_greenFFBFBBFFBB(Block eCodeBlock,
			TypeGraph typeGraph, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeToTAbstractType eInnerClassToTInnerClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TypeDeclarationStatement typeDeclarationStatement = JavaFactory.eINSTANCE.createTypeDeclarationStatement();
		ClassDeclaration eInnerClass = JavaFactory.eINSTANCE.createClassDeclaration();
		TPackage tInnerPackage = BasicFactory.eINSTANCE.createTPackage();
		TClass tInnerClass = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("eInnerClass", "name");
		Object _localVariable_1 = csp.getValue("tInnerPackage", "ID");
		Object _localVariable_2 = csp.getValue("tInnerPackage", "tName");
		Object _localVariable_3 = csp.getValue("tInnerClass", "ID");
		Object _localVariable_4 = csp.getValue("tInnerClass", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(eInnerClassToTInnerClass);
		eCodeBlock.getStatements().add(typeDeclarationStatement);
		ruleResult.getSourceObjects().add(typeDeclarationStatement);
		eInnerClassToTInnerClass.setSource(eInnerClass);
		typeDeclarationStatement.setDeclaration(eInnerClass);
		ruleResult.getSourceObjects().add(eInnerClass);
		tInnerPackage.setParent(tOuterPackage);
		ruleResult.getTargetObjects().add(tInnerPackage);
		eInnerClassToTInnerClass.setTarget(tInnerClass);
		typeGraph.getOwnedTypes().add(tInnerClass);
		typeGraph.getClasses().add(tInnerClass);
		tInnerPackage.getClasses().add(tInnerClass);
		tInnerPackage.getOwnedTypes().add(tInnerClass);
		ruleResult.getTargetObjects().add(tInnerClass);
		String eInnerClass_name_prime = (String) _localVariable_0;
		int tInnerPackage_ID_prime = (int) _localVariable_1;
		String tInnerPackage_tName_prime = (String) _localVariable_2;
		int tInnerClass_ID_prime = (int) _localVariable_3;
		String tInnerClass_tName_prime = (String) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		eInnerClass.setName(eInnerClass_name_prime);
		tInnerPackage.setID(Integer.valueOf(tInnerPackage_ID_prime));
		tInnerPackage.setTName(tInnerPackage_tName_prime);
		tInnerClass.setID(Integer.valueOf(tInnerClass_ID_prime));
		tInnerClass.setTName(tInnerClass_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eInnerClassToTInnerClass, typeDeclarationStatement, eCodeBlock, eInnerClass, typeGraph,
				tOuterPackage, tInnerPackage, tInnerClass, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ClassInnerConstructor_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassInnerConstructorImpl
