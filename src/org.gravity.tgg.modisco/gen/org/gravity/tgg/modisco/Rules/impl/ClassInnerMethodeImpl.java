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
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.ClassInnerMethode;
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
 * An implementation of the model object '<em><b>Class Inner Methode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassInnerMethodeImpl extends AbstractRuleImpl implements ClassInnerMethode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInnerMethodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassInnerMethode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		// initial bindings
		Object[] result1_black = ClassInnerMethodeImpl.pattern_ClassInnerMethode_0_1_initialbindings_blackBBBBBBB(this,
				match, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[eInnerClass] = " + eInnerClass + ", "
					+ "[eCodeBlock] = " + eCodeBlock + ", " + "[typeDeclarationStatement] = " + typeDeclarationStatement
					+ ", " + "[eMethodDeclaration] = " + eMethodDeclaration + ", " + "[eOuterClass] = " + eOuterClass
					+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, eInnerClass, eCodeBlock,
						typeDeclarationStatement, eMethodDeclaration, eOuterClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[eInnerClass] = " + eInnerClass + ", "
					+ "[eCodeBlock] = " + eCodeBlock + ", " + "[typeDeclarationStatement] = " + typeDeclarationStatement
					+ ", " + "[eMethodDeclaration] = " + eMethodDeclaration + ", " + "[eOuterClass] = " + eOuterClass
					+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ClassInnerMethodeImpl.pattern_ClassInnerMethode_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_0_4_collectelementstobetranslated_blackBBBBBB(match, eInnerClass,
							eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eInnerClass] = " + eInnerClass + ", "
						+ "[eCodeBlock] = " + eCodeBlock + ", " + "[typeDeclarationStatement] = "
						+ typeDeclarationStatement + ", " + "[eMethodDeclaration] = " + eMethodDeclaration + ", "
						+ "[eOuterClass] = " + eOuterClass + ".");
			}
			ClassInnerMethodeImpl.pattern_ClassInnerMethode_0_4_collectelementstobetranslated_greenBBBBFF(match,
					eInnerClass, eCodeBlock, typeDeclarationStatement);
			// EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = (EMoflonEdge) result4_green[4];
			// EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_0_5_collectcontextelements_blackBBBBBB(match, eInnerClass, eCodeBlock,
							typeDeclarationStatement, eMethodDeclaration, eOuterClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[eInnerClass] = " + eInnerClass + ", "
						+ "[eCodeBlock] = " + eCodeBlock + ", " + "[typeDeclarationStatement] = "
						+ typeDeclarationStatement + ", " + "[eMethodDeclaration] = " + eMethodDeclaration + ", "
						+ "[eOuterClass] = " + eOuterClass + ".");
			}
			ClassInnerMethodeImpl.pattern_ClassInnerMethode_0_5_collectcontextelements_greenBBBBFFF(match, eCodeBlock,
					eMethodDeclaration, eOuterClass);
			// EMoflonEdge eMethodDeclaration__eCodeBlock____body = (EMoflonEdge) result5_green[4];
			// EMoflonEdge eOuterClass__eMethodDeclaration____bodyDeclarations = (EMoflonEdge) result5_green[5];
			// EMoflonEdge eMethodDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result5_green[6];

			// register objects to match
			ClassInnerMethodeImpl.pattern_ClassInnerMethode_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass);
			return ClassInnerMethodeImpl.pattern_ClassInnerMethode_0_7_expressionF();
		} else {
			return ClassInnerMethodeImpl.pattern_ClassInnerMethode_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[3];
		ClassDeclaration eInnerClass = (ClassDeclaration) result1_bindingAndBlack[4];
		Block eCodeBlock = (Block) result1_bindingAndBlack[5];
		TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result1_bindingAndBlack[6];
		MethodDeclaration eMethodDeclaration = (MethodDeclaration) result1_bindingAndBlack[7];
		ClassDeclaration eOuterClass = (ClassDeclaration) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ClassInnerMethodeImpl.pattern_ClassInnerMethode_1_1_performtransformation_greenFFFBBBB(
				tOuterPackage, typeGraph, eInnerClass, csp);
		TypeToTAbstractType eInnerClassToTInnerClass = (TypeToTAbstractType) result1_green[0];
		TClass tInnerClass = (TClass) result1_green[1];
		TPackage tInnerPackage = (TPackage) result1_green[2];

		// collect translated elements
		Object[] result2_black = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_1_2_collecttranslatedelements_blackBBBBB(eInnerClassToTInnerClass,
						tInnerClass, tInnerPackage, eInnerClass, typeDeclarationStatement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eInnerClassToTInnerClass] = " + eInnerClassToTInnerClass + ", " + "[tInnerClass] = "
					+ tInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[eInnerClass] = "
					+ eInnerClass + ", " + "[typeDeclarationStatement] = " + typeDeclarationStatement + ".");
		}
		Object[] result2_green = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_1_2_collecttranslatedelements_greenFBBBBB(eInnerClassToTInnerClass,
						tInnerClass, tInnerPackage, eInnerClass, typeDeclarationStatement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
						eInnerClassToTInnerClass, eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage,
						typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
						eOuterClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eInnerClassToTInnerClass] = " + eInnerClassToTInnerClass
					+ ", " + "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[tInnerClass] = "
					+ tInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[tOuterPackage] = "
					+ tOuterPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass
					+ ", " + "[eInnerClass] = " + eInnerClass + ", " + "[eCodeBlock] = " + eCodeBlock + ", "
					+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eMethodDeclaration] = "
					+ eMethodDeclaration + ", " + "[eOuterClass] = " + eOuterClass + ".");
		}
		ClassInnerMethodeImpl.pattern_ClassInnerMethode_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				eInnerClassToTInnerClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, eInnerClass, eCodeBlock,
				typeDeclarationStatement);
		// EMoflonEdge eInnerClassToTInnerClass__eInnerClass____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge eInnerClassToTInnerClass__tInnerClass____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[14];
		// EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[17];
		// EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[18];
		// EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = (EMoflonEdge) result3_green[19];
		// EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		ClassInnerMethodeImpl.pattern_ClassInnerMethode_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				eInnerClassToTInnerClass, eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage,
				typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
				eOuterClass);
		return ClassInnerMethodeImpl.pattern_ClassInnerMethode_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ClassInnerMethodeImpl.pattern_ClassInnerMethode_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration eInnerClass = (ClassDeclaration) result2_binding[0];
		Block eCodeBlock = (Block) result2_binding[1];
		TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result2_binding[2];
		MethodDeclaration eMethodDeclaration = (MethodDeclaration) result2_binding[3];
		ClassDeclaration eOuterClass = (ClassDeclaration) result2_binding[4];
		for (Object[] result2_black : ClassInnerMethodeImpl.pattern_ClassInnerMethode_2_2_corematch_blackFFBBBBBB(
				eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass, match)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[0];
			TClass tOuterClass = (TClass) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_2_3_findcontext_blackBFFBBBBBB(eOuterClassToTOuterClass, tOuterClass,
							eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass)) {
				TPackage tOuterPackage = (TPackage) result3_black[1];
				TypeGraph typeGraph = (TypeGraph) result3_black[2];
				Object[] result3_green = ClassInnerMethodeImpl
						.pattern_ClassInnerMethode_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(eOuterClassToTOuterClass,
								tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock,
								typeDeclarationStatement, eMethodDeclaration, eOuterClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result3_green[15];
				// EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = (EMoflonEdge) result3_green[17];
				// EMoflonEdge eMethodDeclaration__eCodeBlock____body = (EMoflonEdge) result3_green[18];
				// EMoflonEdge eOuterClass__eMethodDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[19];
				// EMoflonEdge eMethodDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = ClassInnerMethodeImpl
						.pattern_ClassInnerMethode_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eInnerClass,
								eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[tOuterPackage] = "
							+ tOuterPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = "
							+ tOuterClass + ", " + "[eInnerClass] = " + eInnerClass + ", " + "[eCodeBlock] = "
							+ eCodeBlock + ", " + "[typeDeclarationStatement] = " + typeDeclarationStatement + ", "
							+ "[eMethodDeclaration] = " + eMethodDeclaration + ", " + "[eOuterClass] = " + eOuterClass
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ClassInnerMethodeImpl.pattern_ClassInnerMethode_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ClassInnerMethodeImpl
							.pattern_ClassInnerMethode_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ClassInnerMethodeImpl.pattern_ClassInnerMethode_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInnerMethodeImpl.pattern_ClassInnerMethode_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		match.registerObject("eInnerClass", eInnerClass);
		match.registerObject("eCodeBlock", eCodeBlock);
		match.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		match.registerObject("eMethodDeclaration", eMethodDeclaration);
		match.registerObject("eOuterClass", eOuterClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {// Create CSP
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
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {// Create CSP
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
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eInnerClass", eInnerClass);
		isApplicableMatch.registerObject("eCodeBlock", eCodeBlock);
		isApplicableMatch.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		isApplicableMatch.registerObject("eMethodDeclaration", eMethodDeclaration);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass,
			EObject eOuterClassToTOuterClass, EObject tInnerClass, EObject tInnerPackage, EObject tOuterPackage,
			EObject typeGraph, EObject tOuterClass, EObject eInnerClass, EObject eCodeBlock,
			EObject typeDeclarationStatement, EObject eMethodDeclaration, EObject eOuterClass) {
		ruleresult.registerObject("eInnerClassToTInnerClass", eInnerClassToTInnerClass);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		ruleresult.registerObject("tInnerClass", tInnerClass);
		ruleresult.registerObject("tInnerPackage", tInnerPackage);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("eInnerClass", eInnerClass);
		ruleresult.registerObject("eCodeBlock", eCodeBlock);
		ruleresult.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		ruleresult.registerObject("eMethodDeclaration", eMethodDeclaration);
		ruleresult.registerObject("eOuterClass", eOuterClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eInnerClass").eClass())
						.equals("java.ClassDeclaration.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeDeclarationStatement").eClass())
						.equals("java.TypeDeclarationStatement.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage,
			TypeGraph typeGraph, TClass tOuterClass) {
		// initial bindings
		Object[] result1_black = ClassInnerMethodeImpl.pattern_ClassInnerMethode_10_1_initialbindings_blackBBBBBBB(this,
				match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tInnerClass] = " + tInnerClass + ", "
					+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, tInnerClass,
						tInnerPackage, tOuterPackage, typeGraph, tOuterClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tInnerClass] = " + tInnerClass + ", "
					+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ClassInnerMethodeImpl.pattern_ClassInnerMethode_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_10_4_collectelementstobetranslated_blackBBBBBB(match, tInnerClass,
							tInnerPackage, tOuterPackage, typeGraph, tOuterClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tInnerClass] = " + tInnerClass + ", "
						+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ".");
			}
			ClassInnerMethodeImpl.pattern_ClassInnerMethode_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(match,
					tInnerClass, tInnerPackage, tOuterPackage, typeGraph);
			// EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result4_green[6];
			// EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result4_green[7];
			// EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result4_green[8];
			// EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result4_green[9];
			// EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result4_green[10];
			// EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result4_green[11];
			// EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_10_5_collectcontextelements_blackBBBBBB(match, tInnerClass,
							tInnerPackage, tOuterPackage, typeGraph, tOuterClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tInnerClass] = " + tInnerClass + ", "
						+ "[tInnerPackage] = " + tInnerPackage + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ".");
			}
			ClassInnerMethodeImpl.pattern_ClassInnerMethode_10_5_collectcontextelements_greenBBBBFFFF(match,
					tOuterPackage, typeGraph, tOuterClass);
			// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result5_green[4];
			// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result5_green[5];
			// EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result5_green[6];
			// EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result5_green[7];

			// register objects to match
			ClassInnerMethodeImpl.pattern_ClassInnerMethode_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass);
			return ClassInnerMethodeImpl.pattern_ClassInnerMethode_10_7_expressionF();
		} else {
			return ClassInnerMethodeImpl.pattern_ClassInnerMethode_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TClass tInnerClass = (TClass) result1_bindingAndBlack[1];
		TPackage tInnerPackage = (TPackage) result1_bindingAndBlack[2];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[3];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[4];
		TClass tOuterClass = (TClass) result1_bindingAndBlack[5];
		Block eCodeBlock = (Block) result1_bindingAndBlack[6];
		MethodDeclaration eMethodDeclaration = (MethodDeclaration) result1_bindingAndBlack[7];
		ClassDeclaration eOuterClass = (ClassDeclaration) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_11_1_performtransformation_greenFBFBFB(tInnerClass, eCodeBlock, csp);
		TypeToTAbstractType eInnerClassToTInnerClass = (TypeToTAbstractType) result1_green[0];
		ClassDeclaration eInnerClass = (ClassDeclaration) result1_green[2];
		TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result1_green[4];

		// collect translated elements
		Object[] result2_black = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_11_2_collecttranslatedelements_blackBBBBB(eInnerClassToTInnerClass,
						tInnerClass, tInnerPackage, eInnerClass, typeDeclarationStatement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eInnerClassToTInnerClass] = " + eInnerClassToTInnerClass + ", " + "[tInnerClass] = "
					+ tInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[eInnerClass] = "
					+ eInnerClass + ", " + "[typeDeclarationStatement] = " + typeDeclarationStatement + ".");
		}
		Object[] result2_green = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_11_2_collecttranslatedelements_greenFBBBBB(eInnerClassToTInnerClass,
						tInnerClass, tInnerPackage, eInnerClass, typeDeclarationStatement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
						eInnerClassToTInnerClass, eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage,
						typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
						eOuterClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eInnerClassToTInnerClass] = " + eInnerClassToTInnerClass
					+ ", " + "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[tInnerClass] = "
					+ tInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[tOuterPackage] = "
					+ tOuterPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass
					+ ", " + "[eInnerClass] = " + eInnerClass + ", " + "[eCodeBlock] = " + eCodeBlock + ", "
					+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", " + "[eMethodDeclaration] = "
					+ eMethodDeclaration + ", " + "[eOuterClass] = " + eOuterClass + ".");
		}
		ClassInnerMethodeImpl.pattern_ClassInnerMethode_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				eInnerClassToTInnerClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, eInnerClass, eCodeBlock,
				typeDeclarationStatement);
		// EMoflonEdge eInnerClassToTInnerClass__eInnerClass____source = (EMoflonEdge) result3_green[9];
		// EMoflonEdge eInnerClassToTInnerClass__tInnerClass____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[13];
		// EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[14];
		// EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[17];
		// EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[18];
		// EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = (EMoflonEdge) result3_green[19];
		// EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		ClassInnerMethodeImpl.pattern_ClassInnerMethode_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				eInnerClassToTInnerClass, eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage,
				typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
				eOuterClass);
		return ClassInnerMethodeImpl.pattern_ClassInnerMethode_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ClassInnerMethodeImpl.pattern_ClassInnerMethode_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tInnerClass = (TClass) result2_binding[0];
		TPackage tInnerPackage = (TPackage) result2_binding[1];
		TPackage tOuterPackage = (TPackage) result2_binding[2];
		TypeGraph typeGraph = (TypeGraph) result2_binding[3];
		TClass tOuterClass = (TClass) result2_binding[4];
		for (Object[] result2_black : ClassInnerMethodeImpl.pattern_ClassInnerMethode_12_2_corematch_blackFBBBBBFB(
				tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass, match)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[0];
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_12_3_findcontext_blackBBBBBBFFB(eOuterClassToTOuterClass, tInnerClass,
							tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eOuterClass)) {
				Block eCodeBlock = (Block) result3_black[6];
				MethodDeclaration eMethodDeclaration = (MethodDeclaration) result3_black[7];
				Object[] result3_green = ClassInnerMethodeImpl
						.pattern_ClassInnerMethode_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFFFFFF(
								eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
								tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tInnerClass__tInnerPackage____package = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tInnerPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tOuterPackage__tInnerPackage____subpackage = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tInnerPackage__tInnerClass____classes = (EMoflonEdge) result3_green[16];
				// EMoflonEdge typeGraph__tInnerClass____ownedTypes = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tInnerClass__typeGraph____pg = (EMoflonEdge) result3_green[18];
				// EMoflonEdge typeGraph__tInnerClass____classes = (EMoflonEdge) result3_green[19];
				// EMoflonEdge typeGraph__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[20];
				// EMoflonEdge tOuterClass__typeGraph____pg = (EMoflonEdge) result3_green[21];
				// EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = (EMoflonEdge) result3_green[22];
				// EMoflonEdge tOuterClass__tOuterPackage____package = (EMoflonEdge) result3_green[23];
				// EMoflonEdge eMethodDeclaration__eCodeBlock____body = (EMoflonEdge) result3_green[24];
				// EMoflonEdge eOuterClass__eMethodDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[25];
				// EMoflonEdge eMethodDeclaration__eOuterClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[26];

				// solve CSP
				Object[] result4_bindingAndBlack = ClassInnerMethodeImpl
						.pattern_ClassInnerMethode_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
								tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[tInnerClass] = "
							+ tInnerClass + ", " + "[tInnerPackage] = " + tInnerPackage + ", " + "[tOuterPackage] = "
							+ tOuterPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = "
							+ tOuterClass + ", " + "[eCodeBlock] = " + eCodeBlock + ", " + "[eMethodDeclaration] = "
							+ eMethodDeclaration + ", " + "[eOuterClass] = " + eOuterClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ClassInnerMethodeImpl.pattern_ClassInnerMethode_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ClassInnerMethodeImpl
							.pattern_ClassInnerMethode_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ClassInnerMethodeImpl.pattern_ClassInnerMethode_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInnerMethodeImpl.pattern_ClassInnerMethode_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tInnerClass, TPackage tInnerPackage,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass) {
		match.registerObject("tInnerClass", tInnerClass);
		match.registerObject("tInnerPackage", tInnerPackage);
		match.registerObject("tOuterPackage", tOuterPackage);
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tOuterClass", tOuterClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tInnerClass, TPackage tInnerPackage,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass) {// Create CSP
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
			TypeToTAbstractType eOuterClassToTOuterClass, TClass tInnerClass, TPackage tInnerPackage,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, Block eCodeBlock,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass) {// Create CSP
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
		isApplicableMatch.registerObject("tInnerClass", tInnerClass);
		isApplicableMatch.registerObject("tInnerPackage", tInnerPackage);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eCodeBlock", eCodeBlock);
		isApplicableMatch.registerObject("eMethodDeclaration", eMethodDeclaration);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
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
			EObject eOuterClassToTOuterClass, EObject tInnerClass, EObject tInnerPackage, EObject tOuterPackage,
			EObject typeGraph, EObject tOuterClass, EObject eInnerClass, EObject eCodeBlock,
			EObject typeDeclarationStatement, EObject eMethodDeclaration, EObject eOuterClass) {
		ruleresult.registerObject("eInnerClassToTInnerClass", eInnerClassToTInnerClass);
		ruleresult.registerObject("eOuterClassToTOuterClass", eOuterClassToTOuterClass);
		ruleresult.registerObject("tInnerClass", tInnerClass);
		ruleresult.registerObject("tInnerPackage", tInnerPackage);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tOuterClass", tOuterClass);
		ruleresult.registerObject("eInnerClass", eInnerClass);
		ruleresult.registerObject("eCodeBlock", eCodeBlock);
		ruleresult.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		ruleresult.registerObject("eMethodDeclaration", eMethodDeclaration);
		ruleresult.registerObject("eOuterClass", eOuterClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tInnerClass").eClass())
						.equals("basic.TClass.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tInnerPackage").eClass())
						.equals("basic.TPackage.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_15(EMoflonEdge _edge_statements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInnerMethodeImpl.pattern_ClassInnerMethode_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_20_2_testcorematchandDECs_blackFFFFFB(_edge_statements)) {
			ClassDeclaration eInnerClass = (ClassDeclaration) result2_black[0];
			Block eCodeBlock = (Block) result2_black[1];
			TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result2_black[2];
			MethodDeclaration eMethodDeclaration = (MethodDeclaration) result2_black[3];
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[4];
			Object[] result2_green = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
							eOuterClass)) {
				// Ensure that the correct types of elements are matched
				if (ClassInnerMethodeImpl
						.pattern_ClassInnerMethode_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassInnerMethodeImpl
							.pattern_ClassInnerMethode_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ClassInnerMethodeImpl.pattern_ClassInnerMethode_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInnerMethodeImpl.pattern_ClassInnerMethode_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_13(EMoflonEdge _edge_ownedTypes) {
		// prepare return value
		Object[] result1_bindingAndBlack = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInnerMethodeImpl.pattern_ClassInnerMethode_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_21_2_testcorematchandDECs_blackFFFFFB(_edge_ownedTypes)) {
			TClass tInnerClass = (TClass) result2_black[0];
			TPackage tInnerPackage = (TPackage) result2_black[1];
			TPackage tOuterPackage = (TPackage) result2_black[2];
			TypeGraph typeGraph = (TypeGraph) result2_black[3];
			TClass tOuterClass = (TClass) result2_black[4];
			Object[] result2_green = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass)) {
				// Ensure that the correct types of elements are matched
				if (ClassInnerMethodeImpl
						.pattern_ClassInnerMethode_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ClassInnerMethodeImpl
							.pattern_ClassInnerMethode_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					ClassInnerMethodeImpl.pattern_ClassInnerMethode_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInnerMethodeImpl.pattern_ClassInnerMethode_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassInnerMethode");
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

		createID0.setRuleName("ClassInnerMethode");
		createID0.solve(var_tInnerClass_ID);

		createID1.setRuleName("ClassInnerMethode");
		createID1.solve(var_tInnerPackage_ID);

		eq2.setRuleName("ClassInnerMethode");
		eq2.solve(var_eInnerClass_name, var_tInnerClass_tName);

		addSuffix3.setRuleName("ClassInnerMethode");
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
		ruleResult.setRule("ClassInnerMethode");
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

		createID0.setRuleName("ClassInnerMethode");
		createID0.solve(var_tInnerClass_ID);

		createID1.setRuleName("ClassInnerMethode");
		createID1.solve(var_tInnerPackage_ID);

		addSuffix2.setRuleName("ClassInnerMethode");
		addSuffix2.solve(var_tOuterClass_tName, var_literal0, var_tInnerPackage_tName);

		eq3.setRuleName("ClassInnerMethode");
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
		Object[] result1_black = ClassInnerMethodeImpl.pattern_ClassInnerMethode_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInnerMethodeImpl.pattern_ClassInnerMethode_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_24_2_matchcontext_bindingFFFFFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TClass tInnerClass = (TClass) result2_binding[0];
		TPackage tInnerPackage = (TPackage) result2_binding[1];
		TPackage tOuterPackage = (TPackage) result2_binding[2];
		TypeGraph typeGraph = (TypeGraph) result2_binding[3];
		TClass tOuterClass = (TClass) result2_binding[4];
		ClassDeclaration eInnerClass = (ClassDeclaration) result2_binding[5];
		Block eCodeBlock = (Block) result2_binding[6];
		TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result2_binding[7];
		MethodDeclaration eMethodDeclaration = (MethodDeclaration) result2_binding[8];
		ClassDeclaration eOuterClass = (ClassDeclaration) result2_binding[9];
		for (Object[] result2_black : ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_24_2_matchcontext_blackFBBBBBBBBBBBB(tInnerClass, tInnerPackage,
						tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement,
						eMethodDeclaration, eOuterClass, sourceMatch, targetMatch)) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[0];
			Object[] result2_green = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_24_2_matchcontext_greenBBBBBBBBBBBBFB(eOuterClassToTOuterClass,
							tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock,
							typeDeclarationStatement, eMethodDeclaration, eOuterClass, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[12];

			// check csp
			Object[] result3_bindingAndBlack = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBB(this, isApplicableMatch,
							eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass,
							eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass,
							sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = ClassInnerMethodeImpl
						.pattern_ClassInnerMethode_24_4_createcorrespondence_blackBBBBBBBBBBB(tInnerClass,
								tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock,
								typeDeclarationStatement, eMethodDeclaration, eOuterClass, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tInnerClass] = " + tInnerClass + ", " + "[tInnerPackage] = "
							+ tInnerPackage + ", " + "[tOuterPackage] = " + tOuterPackage + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[tOuterClass] = " + tOuterClass + ", " + "[eInnerClass] = "
							+ eInnerClass + ", " + "[eCodeBlock] = " + eCodeBlock + ", "
							+ "[typeDeclarationStatement] = " + typeDeclarationStatement + ", "
							+ "[eMethodDeclaration] = " + eMethodDeclaration + ", " + "[eOuterClass] = " + eOuterClass
							+ ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ClassInnerMethodeImpl.pattern_ClassInnerMethode_24_4_createcorrespondence_greenFBBB(tInnerClass,
						eInnerClass, isApplicableMatch);
				// TypeToTAbstractType eInnerClassToTInnerClass = (TypeToTAbstractType) result4_green[0];

				// add to returned result
				Object[] result5_black = ClassInnerMethodeImpl
						.pattern_ClassInnerMethode_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ClassInnerMethodeImpl.pattern_ClassInnerMethode_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return ClassInnerMethodeImpl.pattern_ClassInnerMethode_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass,
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass, Match sourceMatch, Match targetMatch) {// Create CSP
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
		isApplicableMatch.registerObject("tInnerClass", tInnerClass);
		isApplicableMatch.registerObject("tInnerPackage", tInnerPackage);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eInnerClass", eInnerClass);
		isApplicableMatch.registerObject("eCodeBlock", eCodeBlock);
		isApplicableMatch.registerObject("typeDeclarationStatement", typeDeclarationStatement);
		isApplicableMatch.registerObject("eMethodDeclaration", eMethodDeclaration);
		isApplicableMatch.registerObject("eOuterClass", eOuterClass);
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
	public boolean checkDEC_FWD(ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {// match tgg pattern
		Object[] result1_black = ClassInnerMethodeImpl.pattern_ClassInnerMethode_27_1_matchtggpattern_blackBBBBB(
				eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass);
		if (result1_black != null) {
			return ClassInnerMethodeImpl.pattern_ClassInnerMethode_27_2_expressionF();
		} else {
			return ClassInnerMethodeImpl.pattern_ClassInnerMethode_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass) {// match tgg pattern
		Object[] result1_black = ClassInnerMethodeImpl.pattern_ClassInnerMethode_28_1_matchtggpattern_blackBBBBB(
				tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass);
		if (result1_black != null) {
			return ClassInnerMethodeImpl.pattern_ClassInnerMethode_28_2_expressionF();
		} else {
			return ClassInnerMethodeImpl.pattern_ClassInnerMethode_28_3_expressionF();
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
		Object[] result1_black = ClassInnerMethodeImpl.pattern_ClassInnerMethode_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInnerMethodeImpl.pattern_ClassInnerMethode_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ClassInnerMethodeImpl
				.pattern_ClassInnerMethode_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eOuterClassToTOuterClassList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result2_black[1];
			ClassDeclaration eOuterClass = (ClassDeclaration) result2_black[2];
			MethodDeclaration eMethodDeclaration = (MethodDeclaration) result2_black[3];
			Block eCodeBlock = (Block) result2_black[4];
			TClass tOuterClass = (TClass) result2_black[5];
			TypeGraph typeGraph = (TypeGraph) result2_black[6];
			TPackage tOuterPackage = (TPackage) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = ClassInnerMethodeImpl
					.pattern_ClassInnerMethode_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eCodeBlock,
							eMethodDeclaration, eOuterClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", " + "[tOuterPackage] = "
						+ tOuterPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterClass] = " + tOuterClass
						+ ", " + "[eCodeBlock] = " + eCodeBlock + ", " + "[eMethodDeclaration] = " + eMethodDeclaration
						+ ", " + "[eOuterClass] = " + eOuterClass + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ClassInnerMethodeImpl.pattern_ClassInnerMethode_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ClassInnerMethodeImpl.pattern_ClassInnerMethode_29_5_checknacs_blackBBBBBBB(
						eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eCodeBlock, eMethodDeclaration,
						eOuterClass);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ClassInnerMethodeImpl.pattern_ClassInnerMethode_29_6_perform_blackBBBBBBBB(
							eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eCodeBlock,
							eMethodDeclaration, eOuterClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[eOuterClassToTOuterClass] = " + eOuterClassToTOuterClass + ", "
								+ "[tOuterPackage] = " + tOuterPackage + ", " + "[typeGraph] = " + typeGraph + ", "
								+ "[tOuterClass] = " + tOuterClass + ", " + "[eCodeBlock] = " + eCodeBlock + ", "
								+ "[eMethodDeclaration] = " + eMethodDeclaration + ", " + "[eOuterClass] = "
								+ eOuterClass + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ClassInnerMethodeImpl.pattern_ClassInnerMethode_29_6_perform_greenFFFBBFBFBB(tOuterPackage,
							typeGraph, eCodeBlock, ruleResult, csp);
					// TypeToTAbstractType eInnerClassToTInnerClass = (TypeToTAbstractType) result6_green[0];
					// TClass tInnerClass = (TClass) result6_green[1];
					// TPackage tInnerPackage = (TPackage) result6_green[2];
					// ClassDeclaration eInnerClass = (ClassDeclaration) result6_green[5];
					// TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return ClassInnerMethodeImpl.pattern_ClassInnerMethode_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass, Block eCodeBlock, MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterClass", tOuterClass);
		isApplicableMatch.registerObject("eCodeBlock", eCodeBlock);
		isApplicableMatch.registerObject("eMethodDeclaration", eMethodDeclaration);
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
		case RulesPackage.CLASS_INNER_METHODE___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_BLOCK_TYPEDECLARATIONSTATEMENT_METHODDECLARATION_CLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(Block) arguments.get(2), (TypeDeclarationStatement) arguments.get(3),
					(MethodDeclaration) arguments.get(4), (ClassDeclaration) arguments.get(5));
		case RulesPackage.CLASS_INNER_METHODE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_BLOCK_TYPEDECLARATIONSTATEMENT_METHODDECLARATION_CLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(Block) arguments.get(2), (TypeDeclarationStatement) arguments.get(3),
					(MethodDeclaration) arguments.get(4), (ClassDeclaration) arguments.get(5));
			return null;
		case RulesPackage.CLASS_INNER_METHODE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_BLOCK_TYPEDECLARATIONSTATEMENT_METHODDECLARATION_CLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(Block) arguments.get(2), (TypeDeclarationStatement) arguments.get(3),
					(MethodDeclaration) arguments.get(4), (ClassDeclaration) arguments.get(5));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TPACKAGE_TYPEGRAPH_TCLASS_CLASSDECLARATION_BLOCK_TYPEDECLARATIONSTATEMENT_METHODDECLARATION_CLASSDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TPackage) arguments.get(2), (TypeGraph) arguments.get(3),
					(TClass) arguments.get(4), (ClassDeclaration) arguments.get(5), (Block) arguments.get(6),
					(TypeDeclarationStatement) arguments.get(7), (MethodDeclaration) arguments.get(8),
					(ClassDeclaration) arguments.get(9));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.CLASS_INNER_METHODE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPROPRIATE_BWD__MATCH_TCLASS_TPACKAGE_TPACKAGE_TYPEGRAPH_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TPackage) arguments.get(3), (TypeGraph) arguments.get(4), (TClass) arguments.get(5));
		case RulesPackage.CLASS_INNER_METHODE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TPACKAGE_TPACKAGE_TYPEGRAPH_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TPackage) arguments.get(3), (TypeGraph) arguments.get(4), (TClass) arguments.get(5));
			return null;
		case RulesPackage.CLASS_INNER_METHODE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TPACKAGE_TPACKAGE_TYPEGRAPH_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TPackage) arguments.get(2), (TPackage) arguments.get(3), (TypeGraph) arguments.get(4),
					(TClass) arguments.get(5));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TCLASS_TPACKAGE_TPACKAGE_TYPEGRAPH_TCLASS_BLOCK_METHODDECLARATION_CLASSDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TClass) arguments.get(2), (TPackage) arguments.get(3),
					(TPackage) arguments.get(4), (TypeGraph) arguments.get(5), (TClass) arguments.get(6),
					(Block) arguments.get(7), (MethodDeclaration) arguments.get(8),
					(ClassDeclaration) arguments.get(9));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.CLASS_INNER_METHODE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_15((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_13((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TYPETOTABSTRACTTYPE_TCLASS_TPACKAGE_TPACKAGE_TYPEGRAPH_TCLASS_CLASSDECLARATION_BLOCK_TYPEDECLARATIONSTATEMENT_METHODDECLARATION_CLASSDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TClass) arguments.get(2), (TPackage) arguments.get(3), (TPackage) arguments.get(4),
					(TypeGraph) arguments.get(5), (TClass) arguments.get(6), (ClassDeclaration) arguments.get(7),
					(Block) arguments.get(8), (TypeDeclarationStatement) arguments.get(9),
					(MethodDeclaration) arguments.get(10), (ClassDeclaration) arguments.get(11),
					(Match) arguments.get(12), (Match) arguments.get(13));
		case RulesPackage.CLASS_INNER_METHODE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_INNER_METHODE___CHECK_DEC_FWD__CLASSDECLARATION_BLOCK_TYPEDECLARATIONSTATEMENT_METHODDECLARATION_CLASSDECLARATION:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (Block) arguments.get(1),
					(TypeDeclarationStatement) arguments.get(2), (MethodDeclaration) arguments.get(3),
					(ClassDeclaration) arguments.get(4));
		case RulesPackage.CLASS_INNER_METHODE___CHECK_DEC_BWD__TCLASS_TPACKAGE_TPACKAGE_TYPEGRAPH_TCLASS:
			return checkDEC_BWD((TClass) arguments.get(0), (TPackage) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3), (TClass) arguments.get(4));
		case RulesPackage.CLASS_INNER_METHODE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.CLASS_INNER_METHODE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TPACKAGE_TYPEGRAPH_TCLASS_BLOCK_METHODDECLARATION_CLASSDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TPackage) arguments.get(2), (TypeGraph) arguments.get(3),
					(TClass) arguments.get(4), (Block) arguments.get(5), (MethodDeclaration) arguments.get(6),
					(ClassDeclaration) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.CLASS_INNER_METHODE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassInnerMethode_0_1_initialbindings_blackBBBBBBB(ClassInnerMethode _this,
			Match match, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		if (!eInnerClass.equals(eOuterClass)) {
			return new Object[] { _this, match, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
					eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_0_2_SolveCSP_bindingFBBBBBBB(ClassInnerMethode _this,
			Match match, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eInnerClass, eCodeBlock,
				typeDeclarationStatement, eMethodDeclaration, eOuterClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eInnerClass, eCodeBlock, typeDeclarationStatement,
					eMethodDeclaration, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerMethode_0_2_SolveCSP_bindingAndBlackFBBBBBBB(ClassInnerMethode _this,
			Match match, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		Object[] result_pattern_ClassInnerMethode_0_2_SolveCSP_binding = pattern_ClassInnerMethode_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass);
		if (result_pattern_ClassInnerMethode_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerMethode_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInnerMethode_0_2_SolveCSP_black = pattern_ClassInnerMethode_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerMethode_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eInnerClass, eCodeBlock, typeDeclarationStatement,
						eMethodDeclaration, eOuterClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerMethode_0_3_CheckCSP_expressionFBB(ClassInnerMethode _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass) {
		if (!eInnerClass.equals(eOuterClass)) {
			return new Object[] { match, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
					eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement) {
		EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eInnerClass);
		match.getToBeTranslatedNodes().add(typeDeclarationStatement);
		String eCodeBlock__typeDeclarationStatement____statements_name_prime = "statements";
		String typeDeclarationStatement__eInnerClass____declaration_name_prime = "declaration";
		eCodeBlock__typeDeclarationStatement____statements.setSrc(eCodeBlock);
		eCodeBlock__typeDeclarationStatement____statements.setTrg(typeDeclarationStatement);
		match.getToBeTranslatedEdges().add(eCodeBlock__typeDeclarationStatement____statements);
		typeDeclarationStatement__eInnerClass____declaration.setSrc(typeDeclarationStatement);
		typeDeclarationStatement__eInnerClass____declaration.setTrg(eInnerClass);
		match.getToBeTranslatedEdges().add(typeDeclarationStatement__eInnerClass____declaration);
		eCodeBlock__typeDeclarationStatement____statements
				.setName(eCodeBlock__typeDeclarationStatement____statements_name_prime);
		typeDeclarationStatement__eInnerClass____declaration
				.setName(typeDeclarationStatement__eInnerClass____declaration_name_prime);
		return new Object[] { match, eInnerClass, eCodeBlock, typeDeclarationStatement,
				eCodeBlock__typeDeclarationStatement____statements,
				typeDeclarationStatement__eInnerClass____declaration };
	}

	public static final Object[] pattern_ClassInnerMethode_0_5_collectcontextelements_blackBBBBBB(Match match,
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass) {
		if (!eInnerClass.equals(eOuterClass)) {
			return new Object[] { match, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
					eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_0_5_collectcontextelements_greenBBBBFFF(Match match,
			Block eCodeBlock, MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass) {
		EMoflonEdge eMethodDeclaration__eCodeBlock____body = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__eMethodDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(eCodeBlock);
		match.getContextNodes().add(eMethodDeclaration);
		match.getContextNodes().add(eOuterClass);
		String eMethodDeclaration__eCodeBlock____body_name_prime = "body";
		String eOuterClass__eMethodDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eMethodDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		eMethodDeclaration__eCodeBlock____body.setSrc(eMethodDeclaration);
		eMethodDeclaration__eCodeBlock____body.setTrg(eCodeBlock);
		match.getContextEdges().add(eMethodDeclaration__eCodeBlock____body);
		eOuterClass__eMethodDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eMethodDeclaration____bodyDeclarations.setTrg(eMethodDeclaration);
		match.getContextEdges().add(eOuterClass__eMethodDeclaration____bodyDeclarations);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eMethodDeclaration);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		match.getContextEdges().add(eMethodDeclaration__eOuterClass____abstractTypeDeclaration);
		eMethodDeclaration__eCodeBlock____body.setName(eMethodDeclaration__eCodeBlock____body_name_prime);
		eOuterClass__eMethodDeclaration____bodyDeclarations
				.setName(eOuterClass__eMethodDeclaration____bodyDeclarations_name_prime);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eMethodDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		return new Object[] { match, eCodeBlock, eMethodDeclaration, eOuterClass,
				eMethodDeclaration__eCodeBlock____body, eOuterClass__eMethodDeclaration____bodyDeclarations,
				eMethodDeclaration__eOuterClass____abstractTypeDeclaration };
	}

	public static final void pattern_ClassInnerMethode_0_6_registerobjectstomatch_expressionBBBBBBB(
			ClassInnerMethode _this, Match match, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		_this.registerObjectsToMatch_FWD(match, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
				eOuterClass);

	}

	public static final boolean pattern_ClassInnerMethode_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerMethode_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("tOuterPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("eInnerClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("eCodeBlock");
		EObject _localVariable_6 = isApplicableMatch.getObject("typeDeclarationStatement");
		EObject _localVariable_7 = isApplicableMatch.getObject("eMethodDeclaration");
		EObject _localVariable_8 = isApplicableMatch.getObject("eOuterClass");
		EObject tmpEOuterClassToTOuterClass = _localVariable_0;
		EObject tmpTOuterPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTOuterClass = _localVariable_3;
		EObject tmpEInnerClass = _localVariable_4;
		EObject tmpECodeBlock = _localVariable_5;
		EObject tmpTypeDeclarationStatement = _localVariable_6;
		EObject tmpEMethodDeclaration = _localVariable_7;
		EObject tmpEOuterClass = _localVariable_8;
		if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
			if (tmpTOuterPackage instanceof TPackage) {
				TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpTOuterClass instanceof TClass) {
						TClass tOuterClass = (TClass) tmpTOuterClass;
						if (tmpEInnerClass instanceof ClassDeclaration) {
							ClassDeclaration eInnerClass = (ClassDeclaration) tmpEInnerClass;
							if (tmpECodeBlock instanceof Block) {
								Block eCodeBlock = (Block) tmpECodeBlock;
								if (tmpTypeDeclarationStatement instanceof TypeDeclarationStatement) {
									TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) tmpTypeDeclarationStatement;
									if (tmpEMethodDeclaration instanceof MethodDeclaration) {
										MethodDeclaration eMethodDeclaration = (MethodDeclaration) tmpEMethodDeclaration;
										if (tmpEOuterClass instanceof ClassDeclaration) {
											ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
											return new Object[] { eOuterClassToTOuterClass, tOuterPackage, typeGraph,
													tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement,
													eMethodDeclaration, eOuterClass, isApplicableMatch };
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

	public static final Object[] pattern_ClassInnerMethode_1_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass, ClassInnerMethode _this, IsApplicableMatch isApplicableMatch) {
		if (!eInnerClass.equals(eOuterClass)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eInnerClass,
							eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			ClassInnerMethode _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInnerMethode_1_1_performtransformation_binding = pattern_ClassInnerMethode_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInnerMethode_1_1_performtransformation_binding != null) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[0];
			TPackage tOuterPackage = (TPackage) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[2];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[3];
			ClassDeclaration eInnerClass = (ClassDeclaration) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[4];
			Block eCodeBlock = (Block) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[5];
			TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[6];
			MethodDeclaration eMethodDeclaration = (MethodDeclaration) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[7];
			ClassDeclaration eOuterClass = (ClassDeclaration) result_pattern_ClassInnerMethode_1_1_performtransformation_binding[8];

			Object[] result_pattern_ClassInnerMethode_1_1_performtransformation_black = pattern_ClassInnerMethode_1_1_performtransformation_blackBBBBBBBBBFBB(
					eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock,
					typeDeclarationStatement, eMethodDeclaration, eOuterClass, _this, isApplicableMatch);
			if (result_pattern_ClassInnerMethode_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInnerMethode_1_1_performtransformation_black[9];

				return new Object[] { eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eInnerClass,
						eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_1_1_performtransformation_greenFFFBBBB(
			TPackage tOuterPackage, TypeGraph typeGraph, ClassDeclaration eInnerClass, CSP csp) {
		TypeToTAbstractType eInnerClassToTInnerClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tInnerClass = BasicFactory.eINSTANCE.createTClass();
		TPackage tInnerPackage = BasicFactory.eINSTANCE.createTPackage();
		Object _localVariable_0 = csp.getValue("tInnerClass", "ID");
		Object _localVariable_1 = csp.getValue("tInnerClass", "tName");
		Object _localVariable_2 = csp.getValue("tInnerPackage", "ID");
		Object _localVariable_3 = csp.getValue("tInnerPackage", "tName");
		eInnerClassToTInnerClass.setSource(eInnerClass);
		eInnerClassToTInnerClass.setTarget(tInnerClass);
		typeGraph.getOwnedTypes().add(tInnerClass);
		typeGraph.getClasses().add(tInnerClass);
		tInnerPackage.getOwnedTypes().add(tInnerClass);
		tInnerPackage.setParent(tOuterPackage);
		tInnerPackage.getClasses().add(tInnerClass);
		int tInnerClass_ID_prime = (int) _localVariable_0;
		String tInnerClass_tName_prime = (String) _localVariable_1;
		int tInnerPackage_ID_prime = (int) _localVariable_2;
		String tInnerPackage_tName_prime = (String) _localVariable_3;
		tInnerClass.setID(Integer.valueOf(tInnerClass_ID_prime));
		tInnerClass.setTName(tInnerClass_tName_prime);
		tInnerPackage.setID(Integer.valueOf(tInnerPackage_ID_prime));
		tInnerPackage.setTName(tInnerPackage_tName_prime);
		return new Object[] { eInnerClassToTInnerClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
				eInnerClass, csp };
	}

	public static final Object[] pattern_ClassInnerMethode_1_2_collecttranslatedelements_blackBBBBB(
			TypeToTAbstractType eInnerClassToTInnerClass, TClass tInnerClass, TPackage tInnerPackage,
			ClassDeclaration eInnerClass, TypeDeclarationStatement typeDeclarationStatement) {
		return new Object[] { eInnerClassToTInnerClass, tInnerClass, tInnerPackage, eInnerClass,
				typeDeclarationStatement };
	}

	public static final Object[] pattern_ClassInnerMethode_1_2_collecttranslatedelements_greenFBBBBB(
			TypeToTAbstractType eInnerClassToTInnerClass, TClass tInnerClass, TPackage tInnerPackage,
			ClassDeclaration eInnerClass, TypeDeclarationStatement typeDeclarationStatement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eInnerClassToTInnerClass);
		ruleresult.getCreatedElements().add(tInnerClass);
		ruleresult.getCreatedElements().add(tInnerPackage);
		ruleresult.getTranslatedElements().add(eInnerClass);
		ruleresult.getTranslatedElements().add(typeDeclarationStatement);
		return new Object[] { ruleresult, eInnerClassToTInnerClass, tInnerClass, tInnerPackage, eInnerClass,
				typeDeclarationStatement };
	}

	public static final Object[] pattern_ClassInnerMethode_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass, EObject eOuterClassToTOuterClass,
			EObject tInnerClass, EObject tInnerPackage, EObject tOuterPackage, EObject typeGraph, EObject tOuterClass,
			EObject eInnerClass, EObject eCodeBlock, EObject typeDeclarationStatement, EObject eMethodDeclaration,
			EObject eOuterClass) {
		if (!eInnerClassToTInnerClass.equals(eOuterClassToTOuterClass)) {
			if (!eInnerClassToTInnerClass.equals(tInnerClass)) {
				if (!eInnerClassToTInnerClass.equals(tInnerPackage)) {
					if (!eInnerClassToTInnerClass.equals(tOuterPackage)) {
						if (!eInnerClassToTInnerClass.equals(typeGraph)) {
							if (!eInnerClassToTInnerClass.equals(tOuterClass)) {
								if (!eInnerClassToTInnerClass.equals(typeDeclarationStatement)) {
									if (!eInnerClassToTInnerClass.equals(eMethodDeclaration)) {
										if (!eInnerClassToTInnerClass.equals(eOuterClass)) {
											if (!eOuterClassToTOuterClass.equals(tInnerClass)) {
												if (!eOuterClassToTOuterClass.equals(tInnerPackage)) {
													if (!eOuterClassToTOuterClass.equals(tOuterPackage)) {
														if (!eOuterClassToTOuterClass.equals(typeGraph)) {
															if (!eOuterClassToTOuterClass.equals(tOuterClass)) {
																if (!eOuterClassToTOuterClass
																		.equals(typeDeclarationStatement)) {
																	if (!tInnerClass.equals(tInnerPackage)) {
																		if (!tInnerClass.equals(tOuterPackage)) {
																			if (!tInnerClass.equals(typeGraph)) {
																				if (!tInnerClass.equals(tOuterClass)) {
																					if (!tInnerClass.equals(
																							typeDeclarationStatement)) {
																						if (!tInnerPackage.equals(
																								tOuterPackage)) {
																							if (!tInnerPackage.equals(
																									typeGraph)) {
																								if (!tInnerPackage
																										.equals(tOuterClass)) {
																									if (!tInnerPackage
																											.equals(typeDeclarationStatement)) {
																										if (!tOuterPackage
																												.equals(typeGraph)) {
																											if (!tOuterPackage
																													.equals(typeDeclarationStatement)) {
																												if (!tOuterClass
																														.equals(tOuterPackage)) {
																													if (!tOuterClass
																															.equals(typeGraph)) {
																														if (!tOuterClass
																																.equals(typeDeclarationStatement)) {
																															if (!eInnerClass
																																	.equals(eInnerClassToTInnerClass)) {
																																if (!eInnerClass
																																		.equals(eOuterClassToTOuterClass)) {
																																	if (!eInnerClass
																																			.equals(tInnerClass)) {
																																		if (!eInnerClass
																																				.equals(tInnerPackage)) {
																																			if (!eInnerClass
																																					.equals(tOuterPackage)) {
																																				if (!eInnerClass
																																						.equals(typeGraph)) {
																																					if (!eInnerClass
																																							.equals(tOuterClass)) {
																																						if (!eInnerClass
																																								.equals(typeDeclarationStatement)) {
																																							if (!eInnerClass
																																									.equals(eMethodDeclaration)) {
																																								if (!eInnerClass
																																										.equals(eOuterClass)) {
																																									if (!eCodeBlock
																																											.equals(eInnerClassToTInnerClass)) {
																																										if (!eCodeBlock
																																												.equals(eOuterClassToTOuterClass)) {
																																											if (!eCodeBlock
																																													.equals(tInnerClass)) {
																																												if (!eCodeBlock
																																														.equals(tInnerPackage)) {
																																													if (!eCodeBlock
																																															.equals(tOuterPackage)) {
																																														if (!eCodeBlock
																																																.equals(typeGraph)) {
																																															if (!eCodeBlock
																																																	.equals(tOuterClass)) {
																																																if (!eCodeBlock
																																																		.equals(eInnerClass)) {
																																																	if (!eCodeBlock
																																																			.equals(typeDeclarationStatement)) {
																																																		if (!eCodeBlock
																																																				.equals(eMethodDeclaration)) {
																																																			if (!eCodeBlock
																																																					.equals(eOuterClass)) {
																																																				if (!typeDeclarationStatement
																																																						.equals(typeGraph)) {
																																																					if (!eMethodDeclaration
																																																							.equals(eOuterClassToTOuterClass)) {
																																																						if (!eMethodDeclaration
																																																								.equals(tInnerClass)) {
																																																							if (!eMethodDeclaration
																																																									.equals(tInnerPackage)) {
																																																								if (!eMethodDeclaration
																																																										.equals(tOuterPackage)) {
																																																									if (!eMethodDeclaration
																																																											.equals(typeGraph)) {
																																																										if (!eMethodDeclaration
																																																												.equals(tOuterClass)) {
																																																											if (!eMethodDeclaration
																																																													.equals(typeDeclarationStatement)) {
																																																												if (!eMethodDeclaration
																																																														.equals(eOuterClass)) {
																																																													if (!eOuterClass
																																																															.equals(eOuterClassToTOuterClass)) {
																																																														if (!eOuterClass
																																																																.equals(tInnerClass)) {
																																																															if (!eOuterClass
																																																																	.equals(tInnerPackage)) {
																																																																if (!eOuterClass
																																																																		.equals(tOuterPackage)) {
																																																																	if (!eOuterClass
																																																																			.equals(typeGraph)) {
																																																																		if (!eOuterClass
																																																																				.equals(tOuterClass)) {
																																																																			if (!eOuterClass
																																																																					.equals(typeDeclarationStatement)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						eInnerClassToTInnerClass,
																																																																						eOuterClassToTOuterClass,
																																																																						tInnerClass,
																																																																						tInnerPackage,
																																																																						tOuterPackage,
																																																																						typeGraph,
																																																																						tOuterClass,
																																																																						eInnerClass,
																																																																						eCodeBlock,
																																																																						typeDeclarationStatement,
																																																																						eMethodDeclaration,
																																																																						eOuterClass };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerMethode_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass, EObject tInnerClass, EObject tInnerPackage,
			EObject tOuterPackage, EObject typeGraph, EObject eInnerClass, EObject eCodeBlock,
			EObject typeDeclarationStatement) {
		EMoflonEdge eInnerClassToTInnerClass__eInnerClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInnerClassToTInnerClass__tInnerClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInnerMethode";
		String eInnerClassToTInnerClass__eInnerClass____source_name_prime = "source";
		String eInnerClassToTInnerClass__tInnerClass____target_name_prime = "target";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String eCodeBlock__typeDeclarationStatement____statements_name_prime = "statements";
		String typeDeclarationStatement__eInnerClass____declaration_name_prime = "declaration";
		eInnerClassToTInnerClass__eInnerClass____source.setSrc(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass__eInnerClass____source.setTrg(eInnerClass);
		ruleresult.getCreatedEdges().add(eInnerClassToTInnerClass__eInnerClass____source);
		eInnerClassToTInnerClass__tInnerClass____target.setSrc(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(eInnerClassToTInnerClass__tInnerClass____target);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		ruleresult.getCreatedEdges().add(tInnerClass__tInnerPackage____package);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getCreatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		ruleresult.getCreatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(tInnerPackage__tInnerClass____classes);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tInnerClass__typeGraph____pg);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(typeGraph__tInnerClass____classes);
		eCodeBlock__typeDeclarationStatement____statements.setSrc(eCodeBlock);
		eCodeBlock__typeDeclarationStatement____statements.setTrg(typeDeclarationStatement);
		ruleresult.getTranslatedEdges().add(eCodeBlock__typeDeclarationStatement____statements);
		typeDeclarationStatement__eInnerClass____declaration.setSrc(typeDeclarationStatement);
		typeDeclarationStatement__eInnerClass____declaration.setTrg(eInnerClass);
		ruleresult.getTranslatedEdges().add(typeDeclarationStatement__eInnerClass____declaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eInnerClassToTInnerClass__eInnerClass____source
				.setName(eInnerClassToTInnerClass__eInnerClass____source_name_prime);
		eInnerClassToTInnerClass__tInnerClass____target
				.setName(eInnerClassToTInnerClass__tInnerClass____target_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		eCodeBlock__typeDeclarationStatement____statements
				.setName(eCodeBlock__typeDeclarationStatement____statements_name_prime);
		typeDeclarationStatement__eInnerClass____declaration
				.setName(typeDeclarationStatement__eInnerClass____declaration_name_prime);
		return new Object[] { ruleresult, eInnerClassToTInnerClass, tInnerClass, tInnerPackage, tOuterPackage,
				typeGraph, eInnerClass, eCodeBlock, typeDeclarationStatement,
				eInnerClassToTInnerClass__eInnerClass____source, eInnerClassToTInnerClass__tInnerClass____target,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package,
				tInnerPackage__tOuterPackage____parent, tOuterPackage__tInnerPackage____subpackage,
				tInnerPackage__tInnerClass____classes, typeGraph__tInnerClass____ownedTypes,
				tInnerClass__typeGraph____pg, typeGraph__tInnerClass____classes,
				eCodeBlock__typeDeclarationStatement____statements,
				typeDeclarationStatement__eInnerClass____declaration };
	}

	public static final void pattern_ClassInnerMethode_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			ClassInnerMethode _this, PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass,
			EObject eOuterClassToTOuterClass, EObject tInnerClass, EObject tInnerPackage, EObject tOuterPackage,
			EObject typeGraph, EObject tOuterClass, EObject eInnerClass, EObject eCodeBlock,
			EObject typeDeclarationStatement, EObject eMethodDeclaration, EObject eOuterClass) {
		_this.registerObjects_FWD(ruleresult, eInnerClassToTInnerClass, eOuterClassToTOuterClass, tInnerClass,
				tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement,
				eMethodDeclaration, eOuterClass);

	}

	public static final PerformRuleResult pattern_ClassInnerMethode_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_2_1_preparereturnvalue_bindingFB(ClassInnerMethode _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInnerMethode _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInnerMethode _this) {
		Object[] result_pattern_ClassInnerMethode_2_1_preparereturnvalue_binding = pattern_ClassInnerMethode_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerMethode_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInnerMethode_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerMethode_2_1_preparereturnvalue_black = pattern_ClassInnerMethode_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInnerMethode_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInnerMethode_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ClassInnerMethode";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInnerMethode_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eInnerClass");
		EObject _localVariable_1 = match.getObject("eCodeBlock");
		EObject _localVariable_2 = match.getObject("typeDeclarationStatement");
		EObject _localVariable_3 = match.getObject("eMethodDeclaration");
		EObject _localVariable_4 = match.getObject("eOuterClass");
		EObject tmpEInnerClass = _localVariable_0;
		EObject tmpECodeBlock = _localVariable_1;
		EObject tmpTypeDeclarationStatement = _localVariable_2;
		EObject tmpEMethodDeclaration = _localVariable_3;
		EObject tmpEOuterClass = _localVariable_4;
		if (tmpEInnerClass instanceof ClassDeclaration) {
			ClassDeclaration eInnerClass = (ClassDeclaration) tmpEInnerClass;
			if (tmpECodeBlock instanceof Block) {
				Block eCodeBlock = (Block) tmpECodeBlock;
				if (tmpTypeDeclarationStatement instanceof TypeDeclarationStatement) {
					TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) tmpTypeDeclarationStatement;
					if (tmpEMethodDeclaration instanceof MethodDeclaration) {
						MethodDeclaration eMethodDeclaration = (MethodDeclaration) tmpEMethodDeclaration;
						if (tmpEOuterClass instanceof ClassDeclaration) {
							ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
							return new Object[] { eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
									eOuterClass, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerMethode_2_2_corematch_blackFFBBBBBB(
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInnerClass.equals(eOuterClass)) {
			for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterClass, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTOuterClass = eOuterClassToTOuterClass.getTarget();
				if (tmpTOuterClass instanceof TClass) {
					TClass tOuterClass = (TClass) tmpTOuterClass;
					_result.add(new Object[] { eOuterClassToTOuterClass, tOuterClass, eInnerClass, eCodeBlock,
							typeDeclarationStatement, eMethodDeclaration, eOuterClass, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerMethode_2_3_findcontext_blackBFFBBBBBB(
			TypeToTAbstractType eOuterClassToTOuterClass, TClass tOuterClass, ClassDeclaration eInnerClass,
			Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInnerClass.equals(eOuterClass)) {
			if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
				if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
					if (eCodeBlock.getStatements().contains(typeDeclarationStatement)) {
						if (eInnerClass.equals(typeDeclarationStatement.getDeclaration())) {
							if (eCodeBlock.equals(eMethodDeclaration.getBody())) {
								if (eOuterClass.getBodyDeclarations().contains(eMethodDeclaration)) {
									TypeGraph typeGraph = tOuterClass.getPg();
									if (typeGraph != null) {
										TPackage tOuterPackage = tOuterClass.getPackage();
										if (tOuterPackage != null) {
											_result.add(new Object[] { eOuterClassToTOuterClass, tOuterPackage,
													typeGraph, tOuterClass, eInnerClass, eCodeBlock,
													typeDeclarationStatement, eMethodDeclaration, eOuterClass });
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

	public static final Object[] pattern_ClassInnerMethode_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__eCodeBlock____body = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__eMethodDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__tOuterPackage____package_name_prime = "package";
		String eCodeBlock__typeDeclarationStatement____statements_name_prime = "statements";
		String typeDeclarationStatement__eInnerClass____declaration_name_prime = "declaration";
		String eMethodDeclaration__eCodeBlock____body_name_prime = "body";
		String eOuterClass__eMethodDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eMethodDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eInnerClass);
		isApplicableMatch.getAllContextElements().add(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(typeDeclarationStatement);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration);
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
		tOuterPackage__tOuterClass____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterClass____ownedTypes.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterClass____ownedTypes);
		tOuterClass__tOuterPackage____package.setSrc(tOuterClass);
		tOuterClass__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterClass__tOuterPackage____package);
		eCodeBlock__typeDeclarationStatement____statements.setSrc(eCodeBlock);
		eCodeBlock__typeDeclarationStatement____statements.setTrg(typeDeclarationStatement);
		isApplicableMatch.getAllContextElements().add(eCodeBlock__typeDeclarationStatement____statements);
		typeDeclarationStatement__eInnerClass____declaration.setSrc(typeDeclarationStatement);
		typeDeclarationStatement__eInnerClass____declaration.setTrg(eInnerClass);
		isApplicableMatch.getAllContextElements().add(typeDeclarationStatement__eInnerClass____declaration);
		eMethodDeclaration__eCodeBlock____body.setSrc(eMethodDeclaration);
		eMethodDeclaration__eCodeBlock____body.setTrg(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration__eCodeBlock____body);
		eOuterClass__eMethodDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eMethodDeclaration____bodyDeclarations.setTrg(eMethodDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass__eMethodDeclaration____bodyDeclarations);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eMethodDeclaration);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration__eOuterClass____abstractTypeDeclaration);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tOuterPackage__tOuterClass____ownedTypes.setName(tOuterPackage__tOuterClass____ownedTypes_name_prime);
		tOuterClass__tOuterPackage____package.setName(tOuterClass__tOuterPackage____package_name_prime);
		eCodeBlock__typeDeclarationStatement____statements
				.setName(eCodeBlock__typeDeclarationStatement____statements_name_prime);
		typeDeclarationStatement__eInnerClass____declaration
				.setName(typeDeclarationStatement__eInnerClass____declaration_name_prime);
		eMethodDeclaration__eCodeBlock____body.setName(eMethodDeclaration__eCodeBlock____body_name_prime);
		eOuterClass__eMethodDeclaration____bodyDeclarations
				.setName(eOuterClass__eMethodDeclaration____bodyDeclarations_name_prime);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eMethodDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		return new Object[] { eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock,
				typeDeclarationStatement, eMethodDeclaration, eOuterClass, isApplicableMatch,
				eOuterClassToTOuterClass__eOuterClass____source, eOuterClassToTOuterClass__tOuterClass____target,
				typeGraph__tOuterClass____ownedTypes, tOuterClass__typeGraph____pg,
				tOuterPackage__tOuterClass____ownedTypes, tOuterClass__tOuterPackage____package,
				eCodeBlock__typeDeclarationStatement____statements,
				typeDeclarationStatement__eInnerClass____declaration, eMethodDeclaration__eCodeBlock____body,
				eOuterClass__eMethodDeclaration____bodyDeclarations,
				eMethodDeclaration__eOuterClass____abstractTypeDeclaration };
	}

	public static final Object[] pattern_ClassInnerMethode_2_4_solveCSP_bindingFBBBBBBBBBBB(ClassInnerMethode _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage,
			TypeGraph typeGraph, TClass tOuterClass, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eOuterClassToTOuterClass,
				tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement,
				eMethodDeclaration, eOuterClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, tOuterPackage, typeGraph,
					tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerMethode_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			ClassInnerMethode _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, ClassDeclaration eInnerClass,
			Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		Object[] result_pattern_ClassInnerMethode_2_4_solveCSP_binding = pattern_ClassInnerMethode_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eInnerClass,
				eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass);
		if (result_pattern_ClassInnerMethode_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerMethode_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerMethode_2_4_solveCSP_black = pattern_ClassInnerMethode_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerMethode_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, tOuterPackage, typeGraph,
						tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
						eOuterClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerMethode_2_5_checkCSP_expressionFBB(ClassInnerMethode _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerMethode_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerMethode";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerMethode_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_10_1_initialbindings_blackBBBBBBB(ClassInnerMethode _this,
			Match match, TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				return new Object[] { _this, match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_10_2_SolveCSP_bindingFBBBBBBB(ClassInnerMethode _this,
			Match match, TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tInnerClass, tInnerPackage, tOuterPackage,
				typeGraph, tOuterClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
					tOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerMethode_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			ClassInnerMethode _this, Match match, TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage,
			TypeGraph typeGraph, TClass tOuterClass) {
		Object[] result_pattern_ClassInnerMethode_10_2_SolveCSP_binding = pattern_ClassInnerMethode_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass);
		if (result_pattern_ClassInnerMethode_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerMethode_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInnerMethode_10_2_SolveCSP_black = pattern_ClassInnerMethode_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerMethode_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
						tOuterClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerMethode_10_3_CheckCSP_expressionFBB(ClassInnerMethode _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				return new Object[] { match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(
			Match match, TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph) {
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tInnerClass);
		match.getToBeTranslatedNodes().add(tInnerPackage);
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		match.getToBeTranslatedEdges().add(tInnerClass__tInnerPackage____package);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		match.getToBeTranslatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		match.getToBeTranslatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(tInnerPackage__tInnerClass____classes);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tInnerClass__typeGraph____pg);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		match.getToBeTranslatedEdges().add(typeGraph__tInnerClass____classes);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		return new Object[] { match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package,
				tInnerPackage__tOuterPackage____parent, tOuterPackage__tInnerPackage____subpackage,
				tInnerPackage__tInnerClass____classes, typeGraph__tInnerClass____ownedTypes,
				tInnerClass__typeGraph____pg, typeGraph__tInnerClass____classes };
	}

	public static final Object[] pattern_ClassInnerMethode_10_5_collectcontextelements_blackBBBBBB(Match match,
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				return new Object[] { match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_10_5_collectcontextelements_greenBBBBFFFF(Match match,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass) {
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tOuterPackage);
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterClass);
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
		return new Object[] { match, tOuterPackage, typeGraph, tOuterClass, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg, tOuterPackage__tOuterClass____ownedTypes,
				tOuterClass__tOuterPackage____package };
	}

	public static final void pattern_ClassInnerMethode_10_6_registerobjectstomatch_expressionBBBBBBB(
			ClassInnerMethode _this, Match match, TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage,
			TypeGraph typeGraph, TClass tOuterClass) {
		_this.registerObjectsToMatch_BWD(match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass);

	}

	public static final boolean pattern_ClassInnerMethode_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerMethode_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eOuterClassToTOuterClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("tInnerClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("tInnerPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("tOuterPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOuterClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("eCodeBlock");
		EObject _localVariable_7 = isApplicableMatch.getObject("eMethodDeclaration");
		EObject _localVariable_8 = isApplicableMatch.getObject("eOuterClass");
		EObject tmpEOuterClassToTOuterClass = _localVariable_0;
		EObject tmpTInnerClass = _localVariable_1;
		EObject tmpTInnerPackage = _localVariable_2;
		EObject tmpTOuterPackage = _localVariable_3;
		EObject tmpTypeGraph = _localVariable_4;
		EObject tmpTOuterClass = _localVariable_5;
		EObject tmpECodeBlock = _localVariable_6;
		EObject tmpEMethodDeclaration = _localVariable_7;
		EObject tmpEOuterClass = _localVariable_8;
		if (tmpEOuterClassToTOuterClass instanceof TypeToTAbstractType) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) tmpEOuterClassToTOuterClass;
			if (tmpTInnerClass instanceof TClass) {
				TClass tInnerClass = (TClass) tmpTInnerClass;
				if (tmpTInnerPackage instanceof TPackage) {
					TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
					if (tmpTOuterPackage instanceof TPackage) {
						TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
						if (tmpTypeGraph instanceof TypeGraph) {
							TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
							if (tmpTOuterClass instanceof TClass) {
								TClass tOuterClass = (TClass) tmpTOuterClass;
								if (tmpECodeBlock instanceof Block) {
									Block eCodeBlock = (Block) tmpECodeBlock;
									if (tmpEMethodDeclaration instanceof MethodDeclaration) {
										MethodDeclaration eMethodDeclaration = (MethodDeclaration) tmpEMethodDeclaration;
										if (tmpEOuterClass instanceof ClassDeclaration) {
											ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
											return new Object[] { eOuterClassToTOuterClass, tInnerClass, tInnerPackage,
													tOuterPackage, typeGraph, tOuterClass, eCodeBlock,
													eMethodDeclaration, eOuterClass, isApplicableMatch };
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

	public static final Object[] pattern_ClassInnerMethode_11_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType eOuterClassToTOuterClass, TClass tInnerClass, TPackage tInnerPackage,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, Block eCodeBlock,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass, ClassInnerMethode _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage,
								typeGraph, tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass, csp, _this,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			ClassInnerMethode _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInnerMethode_11_1_performtransformation_binding = pattern_ClassInnerMethode_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInnerMethode_11_1_performtransformation_binding != null) {
			TypeToTAbstractType eOuterClassToTOuterClass = (TypeToTAbstractType) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[0];
			TClass tInnerClass = (TClass) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[1];
			TPackage tInnerPackage = (TPackage) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[2];
			TPackage tOuterPackage = (TPackage) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[3];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[4];
			TClass tOuterClass = (TClass) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[5];
			Block eCodeBlock = (Block) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[6];
			MethodDeclaration eMethodDeclaration = (MethodDeclaration) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[7];
			ClassDeclaration eOuterClass = (ClassDeclaration) result_pattern_ClassInnerMethode_11_1_performtransformation_binding[8];

			Object[] result_pattern_ClassInnerMethode_11_1_performtransformation_black = pattern_ClassInnerMethode_11_1_performtransformation_blackBBBBBBBBBFBB(
					eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass,
					eCodeBlock, eMethodDeclaration, eOuterClass, _this, isApplicableMatch);
			if (result_pattern_ClassInnerMethode_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInnerMethode_11_1_performtransformation_black[9];

				return new Object[] { eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
						tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_11_1_performtransformation_greenFBFBFB(TClass tInnerClass,
			Block eCodeBlock, CSP csp) {
		TypeToTAbstractType eInnerClassToTInnerClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		ClassDeclaration eInnerClass = JavaFactory.eINSTANCE.createClassDeclaration();
		TypeDeclarationStatement typeDeclarationStatement = JavaFactory.eINSTANCE.createTypeDeclarationStatement();
		Object _localVariable_0 = csp.getValue("eInnerClass", "name");
		eInnerClassToTInnerClass.setTarget(tInnerClass);
		eInnerClassToTInnerClass.setSource(eInnerClass);
		eCodeBlock.getStatements().add(typeDeclarationStatement);
		typeDeclarationStatement.setDeclaration(eInnerClass);
		String eInnerClass_name_prime = (String) _localVariable_0;
		eInnerClass.setName(eInnerClass_name_prime);
		return new Object[] { eInnerClassToTInnerClass, tInnerClass, eInnerClass, eCodeBlock, typeDeclarationStatement,
				csp };
	}

	public static final Object[] pattern_ClassInnerMethode_11_2_collecttranslatedelements_blackBBBBB(
			TypeToTAbstractType eInnerClassToTInnerClass, TClass tInnerClass, TPackage tInnerPackage,
			ClassDeclaration eInnerClass, TypeDeclarationStatement typeDeclarationStatement) {
		return new Object[] { eInnerClassToTInnerClass, tInnerClass, tInnerPackage, eInnerClass,
				typeDeclarationStatement };
	}

	public static final Object[] pattern_ClassInnerMethode_11_2_collecttranslatedelements_greenFBBBBB(
			TypeToTAbstractType eInnerClassToTInnerClass, TClass tInnerClass, TPackage tInnerPackage,
			ClassDeclaration eInnerClass, TypeDeclarationStatement typeDeclarationStatement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eInnerClassToTInnerClass);
		ruleresult.getTranslatedElements().add(tInnerClass);
		ruleresult.getTranslatedElements().add(tInnerPackage);
		ruleresult.getCreatedElements().add(eInnerClass);
		ruleresult.getCreatedElements().add(typeDeclarationStatement);
		return new Object[] { ruleresult, eInnerClassToTInnerClass, tInnerClass, tInnerPackage, eInnerClass,
				typeDeclarationStatement };
	}

	public static final Object[] pattern_ClassInnerMethode_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass, EObject eOuterClassToTOuterClass,
			EObject tInnerClass, EObject tInnerPackage, EObject tOuterPackage, EObject typeGraph, EObject tOuterClass,
			EObject eInnerClass, EObject eCodeBlock, EObject typeDeclarationStatement, EObject eMethodDeclaration,
			EObject eOuterClass) {
		if (!eInnerClassToTInnerClass.equals(eOuterClassToTOuterClass)) {
			if (!eInnerClassToTInnerClass.equals(tInnerClass)) {
				if (!eInnerClassToTInnerClass.equals(tInnerPackage)) {
					if (!eInnerClassToTInnerClass.equals(tOuterPackage)) {
						if (!eInnerClassToTInnerClass.equals(typeGraph)) {
							if (!eInnerClassToTInnerClass.equals(tOuterClass)) {
								if (!eInnerClassToTInnerClass.equals(typeDeclarationStatement)) {
									if (!eInnerClassToTInnerClass.equals(eMethodDeclaration)) {
										if (!eInnerClassToTInnerClass.equals(eOuterClass)) {
											if (!eOuterClassToTOuterClass.equals(tInnerClass)) {
												if (!eOuterClassToTOuterClass.equals(tInnerPackage)) {
													if (!eOuterClassToTOuterClass.equals(tOuterPackage)) {
														if (!eOuterClassToTOuterClass.equals(typeGraph)) {
															if (!eOuterClassToTOuterClass.equals(tOuterClass)) {
																if (!eOuterClassToTOuterClass
																		.equals(typeDeclarationStatement)) {
																	if (!tInnerClass.equals(tInnerPackage)) {
																		if (!tInnerClass.equals(tOuterPackage)) {
																			if (!tInnerClass.equals(typeGraph)) {
																				if (!tInnerClass.equals(tOuterClass)) {
																					if (!tInnerClass.equals(
																							typeDeclarationStatement)) {
																						if (!tInnerPackage.equals(
																								tOuterPackage)) {
																							if (!tInnerPackage.equals(
																									typeGraph)) {
																								if (!tInnerPackage
																										.equals(tOuterClass)) {
																									if (!tInnerPackage
																											.equals(typeDeclarationStatement)) {
																										if (!tOuterPackage
																												.equals(typeGraph)) {
																											if (!tOuterPackage
																													.equals(typeDeclarationStatement)) {
																												if (!tOuterClass
																														.equals(tOuterPackage)) {
																													if (!tOuterClass
																															.equals(typeGraph)) {
																														if (!tOuterClass
																																.equals(typeDeclarationStatement)) {
																															if (!eInnerClass
																																	.equals(eInnerClassToTInnerClass)) {
																																if (!eInnerClass
																																		.equals(eOuterClassToTOuterClass)) {
																																	if (!eInnerClass
																																			.equals(tInnerClass)) {
																																		if (!eInnerClass
																																				.equals(tInnerPackage)) {
																																			if (!eInnerClass
																																					.equals(tOuterPackage)) {
																																				if (!eInnerClass
																																						.equals(typeGraph)) {
																																					if (!eInnerClass
																																							.equals(tOuterClass)) {
																																						if (!eInnerClass
																																								.equals(typeDeclarationStatement)) {
																																							if (!eInnerClass
																																									.equals(eMethodDeclaration)) {
																																								if (!eInnerClass
																																										.equals(eOuterClass)) {
																																									if (!eCodeBlock
																																											.equals(eInnerClassToTInnerClass)) {
																																										if (!eCodeBlock
																																												.equals(eOuterClassToTOuterClass)) {
																																											if (!eCodeBlock
																																													.equals(tInnerClass)) {
																																												if (!eCodeBlock
																																														.equals(tInnerPackage)) {
																																													if (!eCodeBlock
																																															.equals(tOuterPackage)) {
																																														if (!eCodeBlock
																																																.equals(typeGraph)) {
																																															if (!eCodeBlock
																																																	.equals(tOuterClass)) {
																																																if (!eCodeBlock
																																																		.equals(eInnerClass)) {
																																																	if (!eCodeBlock
																																																			.equals(typeDeclarationStatement)) {
																																																		if (!eCodeBlock
																																																				.equals(eMethodDeclaration)) {
																																																			if (!eCodeBlock
																																																					.equals(eOuterClass)) {
																																																				if (!typeDeclarationStatement
																																																						.equals(typeGraph)) {
																																																					if (!eMethodDeclaration
																																																							.equals(eOuterClassToTOuterClass)) {
																																																						if (!eMethodDeclaration
																																																								.equals(tInnerClass)) {
																																																							if (!eMethodDeclaration
																																																									.equals(tInnerPackage)) {
																																																								if (!eMethodDeclaration
																																																										.equals(tOuterPackage)) {
																																																									if (!eMethodDeclaration
																																																											.equals(typeGraph)) {
																																																										if (!eMethodDeclaration
																																																												.equals(tOuterClass)) {
																																																											if (!eMethodDeclaration
																																																													.equals(typeDeclarationStatement)) {
																																																												if (!eMethodDeclaration
																																																														.equals(eOuterClass)) {
																																																													if (!eOuterClass
																																																															.equals(eOuterClassToTOuterClass)) {
																																																														if (!eOuterClass
																																																																.equals(tInnerClass)) {
																																																															if (!eOuterClass
																																																																	.equals(tInnerPackage)) {
																																																																if (!eOuterClass
																																																																		.equals(tOuterPackage)) {
																																																																	if (!eOuterClass
																																																																			.equals(typeGraph)) {
																																																																		if (!eOuterClass
																																																																				.equals(tOuterClass)) {
																																																																			if (!eOuterClass
																																																																					.equals(typeDeclarationStatement)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						eInnerClassToTInnerClass,
																																																																						eOuterClassToTOuterClass,
																																																																						tInnerClass,
																																																																						tInnerPackage,
																																																																						tOuterPackage,
																																																																						typeGraph,
																																																																						tOuterClass,
																																																																						eInnerClass,
																																																																						eCodeBlock,
																																																																						typeDeclarationStatement,
																																																																						eMethodDeclaration,
																																																																						eOuterClass };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerMethode_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass, EObject tInnerClass, EObject tInnerPackage,
			EObject tOuterPackage, EObject typeGraph, EObject eInnerClass, EObject eCodeBlock,
			EObject typeDeclarationStatement) {
		EMoflonEdge eInnerClassToTInnerClass__eInnerClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInnerClassToTInnerClass__tInnerClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eCodeBlock__typeDeclarationStatement____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeDeclarationStatement__eInnerClass____declaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInnerMethode";
		String eInnerClassToTInnerClass__eInnerClass____source_name_prime = "source";
		String eInnerClassToTInnerClass__tInnerClass____target_name_prime = "target";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String eCodeBlock__typeDeclarationStatement____statements_name_prime = "statements";
		String typeDeclarationStatement__eInnerClass____declaration_name_prime = "declaration";
		eInnerClassToTInnerClass__eInnerClass____source.setSrc(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass__eInnerClass____source.setTrg(eInnerClass);
		ruleresult.getCreatedEdges().add(eInnerClassToTInnerClass__eInnerClass____source);
		eInnerClassToTInnerClass__tInnerClass____target.setSrc(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass__tInnerClass____target.setTrg(tInnerClass);
		ruleresult.getCreatedEdges().add(eInnerClassToTInnerClass__tInnerClass____target);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		ruleresult.getTranslatedEdges().add(tInnerClass__tInnerPackage____package);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(tInnerPackage__tInnerClass____classes);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tInnerClass__typeGraph____pg);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tInnerClass____classes);
		eCodeBlock__typeDeclarationStatement____statements.setSrc(eCodeBlock);
		eCodeBlock__typeDeclarationStatement____statements.setTrg(typeDeclarationStatement);
		ruleresult.getCreatedEdges().add(eCodeBlock__typeDeclarationStatement____statements);
		typeDeclarationStatement__eInnerClass____declaration.setSrc(typeDeclarationStatement);
		typeDeclarationStatement__eInnerClass____declaration.setTrg(eInnerClass);
		ruleresult.getCreatedEdges().add(typeDeclarationStatement__eInnerClass____declaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eInnerClassToTInnerClass__eInnerClass____source
				.setName(eInnerClassToTInnerClass__eInnerClass____source_name_prime);
		eInnerClassToTInnerClass__tInnerClass____target
				.setName(eInnerClassToTInnerClass__tInnerClass____target_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		eCodeBlock__typeDeclarationStatement____statements
				.setName(eCodeBlock__typeDeclarationStatement____statements_name_prime);
		typeDeclarationStatement__eInnerClass____declaration
				.setName(typeDeclarationStatement__eInnerClass____declaration_name_prime);
		return new Object[] { ruleresult, eInnerClassToTInnerClass, tInnerClass, tInnerPackage, tOuterPackage,
				typeGraph, eInnerClass, eCodeBlock, typeDeclarationStatement,
				eInnerClassToTInnerClass__eInnerClass____source, eInnerClassToTInnerClass__tInnerClass____target,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package,
				tInnerPackage__tOuterPackage____parent, tOuterPackage__tInnerPackage____subpackage,
				tInnerPackage__tInnerClass____classes, typeGraph__tInnerClass____ownedTypes,
				tInnerClass__typeGraph____pg, typeGraph__tInnerClass____classes,
				eCodeBlock__typeDeclarationStatement____statements,
				typeDeclarationStatement__eInnerClass____declaration };
	}

	public static final void pattern_ClassInnerMethode_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			ClassInnerMethode _this, PerformRuleResult ruleresult, EObject eInnerClassToTInnerClass,
			EObject eOuterClassToTOuterClass, EObject tInnerClass, EObject tInnerPackage, EObject tOuterPackage,
			EObject typeGraph, EObject tOuterClass, EObject eInnerClass, EObject eCodeBlock,
			EObject typeDeclarationStatement, EObject eMethodDeclaration, EObject eOuterClass) {
		_this.registerObjects_BWD(ruleresult, eInnerClassToTInnerClass, eOuterClassToTOuterClass, tInnerClass,
				tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement,
				eMethodDeclaration, eOuterClass);

	}

	public static final PerformRuleResult pattern_ClassInnerMethode_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_12_1_preparereturnvalue_bindingFB(ClassInnerMethode _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInnerMethode _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInnerMethode _this) {
		Object[] result_pattern_ClassInnerMethode_12_1_preparereturnvalue_binding = pattern_ClassInnerMethode_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerMethode_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInnerMethode_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerMethode_12_1_preparereturnvalue_black = pattern_ClassInnerMethode_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInnerMethode_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInnerMethode_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ClassInnerMethode";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInnerMethode_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tInnerClass");
		EObject _localVariable_1 = match.getObject("tInnerPackage");
		EObject _localVariable_2 = match.getObject("tOuterPackage");
		EObject _localVariable_3 = match.getObject("typeGraph");
		EObject _localVariable_4 = match.getObject("tOuterClass");
		EObject tmpTInnerClass = _localVariable_0;
		EObject tmpTInnerPackage = _localVariable_1;
		EObject tmpTOuterPackage = _localVariable_2;
		EObject tmpTypeGraph = _localVariable_3;
		EObject tmpTOuterClass = _localVariable_4;
		if (tmpTInnerClass instanceof TClass) {
			TClass tInnerClass = (TClass) tmpTInnerClass;
			if (tmpTInnerPackage instanceof TPackage) {
				TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
				if (tmpTOuterPackage instanceof TPackage) {
					TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
					if (tmpTypeGraph instanceof TypeGraph) {
						TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							return new Object[] { tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass,
									match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerMethode_12_2_corematch_blackFBBBBBFB(TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tOuterClass, TypeToTAbstractType.class, "target")) {
					Type tmpEOuterClass = eOuterClassToTOuterClass.getSource();
					if (tmpEOuterClass instanceof ClassDeclaration) {
						ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
						_result.add(new Object[] { eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage,
								typeGraph, tOuterClass, eOuterClass, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInnerMethode_12_3_findcontext_blackBBBBBBFFB(
			TypeToTAbstractType eOuterClassToTOuterClass, TClass tInnerClass, TPackage tInnerPackage,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, ClassDeclaration eOuterClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				if (eOuterClass.equals(eOuterClassToTOuterClass.getSource())) {
					if (tOuterClass.equals(eOuterClassToTOuterClass.getTarget())) {
						if (tInnerPackage.getOwnedTypes().contains(tInnerClass)) {
							if (tOuterPackage.equals(tInnerPackage.getParent())) {
								if (tInnerPackage.getClasses().contains(tInnerClass)) {
									if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
										if (typeGraph.getClasses().contains(tInnerClass)) {
											if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
												if (tOuterPackage.getOwnedTypes().contains(tOuterClass)) {
													for (BodyDeclaration tmpEMethodDeclaration : eOuterClass
															.getBodyDeclarations()) {
														if (tmpEMethodDeclaration instanceof MethodDeclaration) {
															MethodDeclaration eMethodDeclaration = (MethodDeclaration) tmpEMethodDeclaration;
															Block eCodeBlock = eMethodDeclaration.getBody();
															if (eCodeBlock != null) {
																_result.add(new Object[] { eOuterClassToTOuterClass,
																		tInnerClass, tInnerPackage, tOuterPackage,
																		typeGraph, tOuterClass, eCodeBlock,
																		eMethodDeclaration, eOuterClass });
															}

														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInnerMethode_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			TypeToTAbstractType eOuterClassToTOuterClass, TClass tInnerClass, TPackage tInnerPackage,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, Block eCodeBlock,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterClassToTOuterClass__eOuterClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClassToTOuterClass__tOuterClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__tInnerPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tInnerPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerPackage__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInnerClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tInnerClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterClass__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__eCodeBlock____body = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterClass__eMethodDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eMethodDeclaration__eOuterClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eOuterClassToTOuterClass__eOuterClass____source_name_prime = "source";
		String eOuterClassToTOuterClass__tOuterClass____target_name_prime = "target";
		String tInnerPackage__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__tInnerPackage____package_name_prime = "package";
		String tInnerPackage__tOuterPackage____parent_name_prime = "parent";
		String tOuterPackage__tInnerPackage____subpackage_name_prime = "subpackage";
		String tInnerPackage__tInnerClass____classes_name_prime = "classes";
		String typeGraph__tInnerClass____ownedTypes_name_prime = "ownedTypes";
		String tInnerClass__typeGraph____pg_name_prime = "pg";
		String typeGraph__tInnerClass____classes_name_prime = "classes";
		String typeGraph__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterClass____ownedTypes_name_prime = "ownedTypes";
		String tOuterClass__tOuterPackage____package_name_prime = "package";
		String eMethodDeclaration__eCodeBlock____body_name_prime = "body";
		String eOuterClass__eMethodDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String eMethodDeclaration__eOuterClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.getAllContextElements().add(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__eOuterClass____source.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__eOuterClass____source);
		eOuterClassToTOuterClass__tOuterClass____target.setSrc(eOuterClassToTOuterClass);
		eOuterClassToTOuterClass__tOuterClass____target.setTrg(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass__tOuterClass____target);
		tInnerPackage__tInnerClass____ownedTypes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____ownedTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tInnerClass____ownedTypes);
		tInnerClass__tInnerPackage____package.setSrc(tInnerClass);
		tInnerClass__tInnerPackage____package.setTrg(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tInnerClass__tInnerPackage____package);
		tInnerPackage__tOuterPackage____parent.setSrc(tInnerPackage);
		tInnerPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tOuterPackage____parent);
		tOuterPackage__tInnerPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tInnerPackage____subpackage.setTrg(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tInnerPackage____subpackage);
		tInnerPackage__tInnerClass____classes.setSrc(tInnerPackage);
		tInnerPackage__tInnerClass____classes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage__tInnerClass____classes);
		typeGraph__tInnerClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tInnerClass____ownedTypes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tInnerClass____ownedTypes);
		tInnerClass__typeGraph____pg.setSrc(tInnerClass);
		tInnerClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tInnerClass__typeGraph____pg);
		typeGraph__tInnerClass____classes.setSrc(typeGraph);
		typeGraph__tInnerClass____classes.setTrg(tInnerClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tInnerClass____classes);
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
		eMethodDeclaration__eCodeBlock____body.setSrc(eMethodDeclaration);
		eMethodDeclaration__eCodeBlock____body.setTrg(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration__eCodeBlock____body);
		eOuterClass__eMethodDeclaration____bodyDeclarations.setSrc(eOuterClass);
		eOuterClass__eMethodDeclaration____bodyDeclarations.setTrg(eMethodDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass__eMethodDeclaration____bodyDeclarations);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration.setSrc(eMethodDeclaration);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration.setTrg(eOuterClass);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration__eOuterClass____abstractTypeDeclaration);
		eOuterClassToTOuterClass__eOuterClass____source
				.setName(eOuterClassToTOuterClass__eOuterClass____source_name_prime);
		eOuterClassToTOuterClass__tOuterClass____target
				.setName(eOuterClassToTOuterClass__tOuterClass____target_name_prime);
		tInnerPackage__tInnerClass____ownedTypes.setName(tInnerPackage__tInnerClass____ownedTypes_name_prime);
		tInnerClass__tInnerPackage____package.setName(tInnerClass__tInnerPackage____package_name_prime);
		tInnerPackage__tOuterPackage____parent.setName(tInnerPackage__tOuterPackage____parent_name_prime);
		tOuterPackage__tInnerPackage____subpackage.setName(tOuterPackage__tInnerPackage____subpackage_name_prime);
		tInnerPackage__tInnerClass____classes.setName(tInnerPackage__tInnerClass____classes_name_prime);
		typeGraph__tInnerClass____ownedTypes.setName(typeGraph__tInnerClass____ownedTypes_name_prime);
		tInnerClass__typeGraph____pg.setName(tInnerClass__typeGraph____pg_name_prime);
		typeGraph__tInnerClass____classes.setName(typeGraph__tInnerClass____classes_name_prime);
		typeGraph__tOuterClass____ownedTypes.setName(typeGraph__tOuterClass____ownedTypes_name_prime);
		tOuterClass__typeGraph____pg.setName(tOuterClass__typeGraph____pg_name_prime);
		tOuterPackage__tOuterClass____ownedTypes.setName(tOuterPackage__tOuterClass____ownedTypes_name_prime);
		tOuterClass__tOuterPackage____package.setName(tOuterClass__tOuterPackage____package_name_prime);
		eMethodDeclaration__eCodeBlock____body.setName(eMethodDeclaration__eCodeBlock____body_name_prime);
		eOuterClass__eMethodDeclaration____bodyDeclarations
				.setName(eOuterClass__eMethodDeclaration____bodyDeclarations_name_prime);
		eMethodDeclaration__eOuterClass____abstractTypeDeclaration
				.setName(eMethodDeclaration__eOuterClass____abstractTypeDeclaration_name_prime);
		return new Object[] { eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
				tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass, isApplicableMatch,
				eOuterClassToTOuterClass__eOuterClass____source, eOuterClassToTOuterClass__tOuterClass____target,
				tInnerPackage__tInnerClass____ownedTypes, tInnerClass__tInnerPackage____package,
				tInnerPackage__tOuterPackage____parent, tOuterPackage__tInnerPackage____subpackage,
				tInnerPackage__tInnerClass____classes, typeGraph__tInnerClass____ownedTypes,
				tInnerClass__typeGraph____pg, typeGraph__tInnerClass____classes, typeGraph__tOuterClass____ownedTypes,
				tOuterClass__typeGraph____pg, tOuterPackage__tOuterClass____ownedTypes,
				tOuterClass__tOuterPackage____package, eMethodDeclaration__eCodeBlock____body,
				eOuterClass__eMethodDeclaration____bodyDeclarations,
				eMethodDeclaration__eOuterClass____abstractTypeDeclaration };
	}

	public static final Object[] pattern_ClassInnerMethode_12_4_solveCSP_bindingFBBBBBBBBBBB(ClassInnerMethode _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass, TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, Block eCodeBlock,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eOuterClassToTOuterClass, tInnerClass,
				tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, tInnerClass, tInnerPackage,
					tOuterPackage, typeGraph, tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerMethode_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			ClassInnerMethode _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass,
			Block eCodeBlock, MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass) {
		Object[] result_pattern_ClassInnerMethode_12_4_solveCSP_binding = pattern_ClassInnerMethode_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage,
				typeGraph, tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass);
		if (result_pattern_ClassInnerMethode_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerMethode_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerMethode_12_4_solveCSP_black = pattern_ClassInnerMethode_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerMethode_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, tInnerClass,
						tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eCodeBlock, eMethodDeclaration,
						eOuterClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerMethode_12_5_checkCSP_expressionFBB(ClassInnerMethode _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerMethode_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerMethode";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerMethode_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_20_1_preparereturnvalue_bindingFB(ClassInnerMethode _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInnerMethode _this) {
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

	public static final Object[] pattern_ClassInnerMethode_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInnerMethode _this) {
		Object[] result_pattern_ClassInnerMethode_20_1_preparereturnvalue_binding = pattern_ClassInnerMethode_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerMethode_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInnerMethode_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerMethode_20_1_preparereturnvalue_black = pattern_ClassInnerMethode_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInnerMethode_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInnerMethode_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInnerMethode_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassInnerMethode_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_statements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpECodeBlock = _edge_statements.getSrc();
		if (tmpECodeBlock instanceof Block) {
			Block eCodeBlock = (Block) tmpECodeBlock;
			EObject tmpTypeDeclarationStatement = _edge_statements.getTrg();
			if (tmpTypeDeclarationStatement instanceof TypeDeclarationStatement) {
				TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) tmpTypeDeclarationStatement;
				if (eCodeBlock.getStatements().contains(typeDeclarationStatement)) {
					AbstractTypeDeclaration tmpEInnerClass = typeDeclarationStatement.getDeclaration();
					if (tmpEInnerClass instanceof ClassDeclaration) {
						ClassDeclaration eInnerClass = (ClassDeclaration) tmpEInnerClass;
						for (AbstractMethodDeclaration tmpEMethodDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(eCodeBlock, AbstractMethodDeclaration.class, "body")) {
							if (tmpEMethodDeclaration instanceof MethodDeclaration) {
								MethodDeclaration eMethodDeclaration = (MethodDeclaration) tmpEMethodDeclaration;
								AbstractTypeDeclaration tmpEOuterClass = eMethodDeclaration
										.getAbstractTypeDeclaration();
								if (tmpEOuterClass instanceof ClassDeclaration) {
									ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
									if (!eInnerClass.equals(eOuterClass)) {
										_result.add(new Object[] { eInnerClass, eCodeBlock, typeDeclarationStatement,
												eMethodDeclaration, eOuterClass, _edge_statements });
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

	public static final Object[] pattern_ClassInnerMethode_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInnerMethode_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ClassInnerMethode _this, Match match, ClassDeclaration eInnerClass, Block eCodeBlock,
			TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eInnerClass, eCodeBlock, typeDeclarationStatement,
				eMethodDeclaration, eOuterClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInnerMethode_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInnerMethode _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInnerMethode_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_21_1_preparereturnvalue_bindingFB(ClassInnerMethode _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInnerMethode _this) {
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

	public static final Object[] pattern_ClassInnerMethode_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInnerMethode _this) {
		Object[] result_pattern_ClassInnerMethode_21_1_preparereturnvalue_binding = pattern_ClassInnerMethode_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInnerMethode_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInnerMethode_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInnerMethode_21_1_preparereturnvalue_black = pattern_ClassInnerMethode_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInnerMethode_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInnerMethode_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInnerMethode_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_0BBB(TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tInnerClass_classes_583334 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tInnerClass, TPackage.class, "classes")) {
				if (!tInnerPackage.equals(__DEC_tInnerClass_classes_583334)) {
					if (!tOuterPackage.equals(__DEC_tInnerClass_classes_583334)) {
						return new Object[] { tInnerClass, tInnerPackage, tOuterPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_1BB(TClass tInnerClass,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tInnerClass_classes_553735 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tInnerClass_classes_553735)) {
				return new Object[] { tInnerClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_2BBB(TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerClass_ownedTypes_503944 = tInnerClass.getPackage();
			if (__DEC_tInnerClass_ownedTypes_503944 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerClass_ownedTypes_503944)) {
					if (!tOuterPackage.equals(__DEC_tInnerClass_ownedTypes_503944)) {
						return new Object[] { tInnerClass, tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_3BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_typeGraph_886093 = tInnerPackage.getTypeGraph();
		if (__DEC_tInnerPackage_typeGraph_886093 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_typeGraph_886093)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_4BB(
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerPackage_subpackage_648426 = tInnerPackage.getParent();
			if (__DEC_tInnerPackage_subpackage_648426 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerPackage_subpackage_648426)) {
					if (!tOuterPackage.equals(__DEC_tInnerPackage_subpackage_648426)) {
						return new Object[] { tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_5BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_packages_660731 = tInnerPackage.getPg();
		if (__DEC_tInnerPackage_packages_660731 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_packages_660731)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_6BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getClasses().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_7BB(
			TPackage tOuterPackage, TClass tInnerClass) {
		if (tOuterPackage.getOwnedTypes().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_8BB(
			TPackage tInnerPackage, TypeGraph typeGraph) {
		if (typeGraph.equals(tInnerPackage.getTypeGraph())) {
			return new Object[] { tInnerPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_9BB(TypeGraph typeGraph,
			TPackage tInnerPackage) {
		if (typeGraph.getPackages().contains(tInnerPackage)) {
			return new Object[] { typeGraph, tInnerPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerMethode_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTInnerPackage = _edge_ownedTypes.getSrc();
		if (tmpTInnerPackage instanceof TPackage) {
			TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
			EObject tmpTInnerClass = _edge_ownedTypes.getTrg();
			if (tmpTInnerClass instanceof TClass) {
				TClass tInnerClass = (TClass) tmpTInnerClass;
				if (tInnerPackage.getOwnedTypes().contains(tInnerClass)) {
					if (tInnerPackage.getClasses().contains(tInnerClass)) {
						TPackage tOuterPackage = tInnerPackage.getParent();
						if (tOuterPackage != null) {
							if (!tInnerPackage.equals(tOuterPackage)) {
								TypeGraph typeGraph = tInnerClass.getPg();
								if (typeGraph != null) {
									if (typeGraph.getClasses().contains(tInnerClass)) {
										if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_0BBB(
												tInnerClass, tInnerPackage, tOuterPackage) == null) {
											if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_2BBB(
													tInnerClass, tInnerPackage, tOuterPackage) == null) {
												if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_4BB(
														tInnerPackage, tOuterPackage) == null) {
													if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_6BB(
															tOuterPackage, tInnerClass) == null) {
														if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_7BB(
																tOuterPackage, tInnerClass) == null) {
															if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_1BB(
																	tInnerClass, typeGraph) == null) {
																if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_3BB(
																		tInnerPackage, typeGraph) == null) {
																	if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_5BB(
																			tInnerPackage, typeGraph) == null) {
																		if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_8BB(
																				tInnerPackage, typeGraph) == null) {
																			if (pattern_ClassInnerMethode_21_2_testcorematchandDECs_black_nac_9BB(
																					typeGraph, tInnerPackage) == null) {
																				for (TAbstractType tmpTOuterClass : tOuterPackage
																						.getOwnedTypes()) {
																					if (tmpTOuterClass instanceof TClass) {
																						TClass tOuterClass = (TClass) tmpTOuterClass;
																						if (!tInnerClass
																								.equals(tOuterClass)) {
																							if (typeGraph
																									.getOwnedTypes()
																									.contains(
																											tOuterClass)) {
																								_result.add(
																										new Object[] {
																												tInnerClass,
																												tInnerPackage,
																												tOuterPackage,
																												typeGraph,
																												tOuterClass,
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

	public static final Object[] pattern_ClassInnerMethode_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInnerMethode_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ClassInnerMethode _this, Match match, TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage,
			TypeGraph typeGraph, TClass tOuterClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
				tOuterClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInnerMethode_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInnerMethode _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInnerMethode_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_24_1_prepare_blackB(ClassInnerMethode _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInnerMethode_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassInnerMethode_24_2_matchcontext_bindingFFFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tInnerClass");
		EObject _localVariable_1 = targetMatch.getObject("tInnerPackage");
		EObject _localVariable_2 = targetMatch.getObject("tOuterPackage");
		EObject _localVariable_3 = targetMatch.getObject("typeGraph");
		EObject _localVariable_4 = targetMatch.getObject("tOuterClass");
		EObject _localVariable_5 = sourceMatch.getObject("eInnerClass");
		EObject _localVariable_6 = sourceMatch.getObject("eCodeBlock");
		EObject _localVariable_7 = sourceMatch.getObject("typeDeclarationStatement");
		EObject _localVariable_8 = sourceMatch.getObject("eMethodDeclaration");
		EObject _localVariable_9 = sourceMatch.getObject("eOuterClass");
		EObject tmpTInnerClass = _localVariable_0;
		EObject tmpTInnerPackage = _localVariable_1;
		EObject tmpTOuterPackage = _localVariable_2;
		EObject tmpTypeGraph = _localVariable_3;
		EObject tmpTOuterClass = _localVariable_4;
		EObject tmpEInnerClass = _localVariable_5;
		EObject tmpECodeBlock = _localVariable_6;
		EObject tmpTypeDeclarationStatement = _localVariable_7;
		EObject tmpEMethodDeclaration = _localVariable_8;
		EObject tmpEOuterClass = _localVariable_9;
		if (tmpTInnerClass instanceof TClass) {
			TClass tInnerClass = (TClass) tmpTInnerClass;
			if (tmpTInnerPackage instanceof TPackage) {
				TPackage tInnerPackage = (TPackage) tmpTInnerPackage;
				if (tmpTOuterPackage instanceof TPackage) {
					TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
					if (tmpTypeGraph instanceof TypeGraph) {
						TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
						if (tmpTOuterClass instanceof TClass) {
							TClass tOuterClass = (TClass) tmpTOuterClass;
							if (tmpEInnerClass instanceof ClassDeclaration) {
								ClassDeclaration eInnerClass = (ClassDeclaration) tmpEInnerClass;
								if (tmpECodeBlock instanceof Block) {
									Block eCodeBlock = (Block) tmpECodeBlock;
									if (tmpTypeDeclarationStatement instanceof TypeDeclarationStatement) {
										TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) tmpTypeDeclarationStatement;
										if (tmpEMethodDeclaration instanceof MethodDeclaration) {
											MethodDeclaration eMethodDeclaration = (MethodDeclaration) tmpEMethodDeclaration;
											if (tmpEOuterClass instanceof ClassDeclaration) {
												ClassDeclaration eOuterClass = (ClassDeclaration) tmpEOuterClass;
												return new Object[] { tInnerClass, tInnerPackage, tOuterPackage,
														typeGraph, tOuterClass, eInnerClass, eCodeBlock,
														typeDeclarationStatement, eMethodDeclaration, eOuterClass,
														targetMatch, sourceMatch };
											}
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

	public static final Iterable<Object[]> pattern_ClassInnerMethode_24_2_matchcontext_blackFBBBBBBBBBBBB(
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass,
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				if (!eInnerClass.equals(eOuterClass)) {
					if (!sourceMatch.equals(targetMatch)) {
						if (tInnerPackage.getOwnedTypes().contains(tInnerClass)) {
							if (tOuterPackage.equals(tInnerPackage.getParent())) {
								if (tInnerPackage.getClasses().contains(tInnerClass)) {
									if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
										if (typeGraph.getClasses().contains(tInnerClass)) {
											if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
												if (tOuterPackage.getOwnedTypes().contains(tOuterClass)) {
													if (eCodeBlock.getStatements().contains(typeDeclarationStatement)) {
														if (eInnerClass
																.equals(typeDeclarationStatement.getDeclaration())) {
															if (eCodeBlock.equals(eMethodDeclaration.getBody())) {
																if (eOuterClass.getBodyDeclarations()
																		.contains(eMethodDeclaration)) {
																	for (TypeToTAbstractType eOuterClassToTOuterClass : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(eOuterClass,
																					TypeToTAbstractType.class,
																					"source")) {
																		if (tOuterClass.equals(
																				eOuterClassToTOuterClass.getTarget())) {
																			_result.add(new Object[] {
																					eOuterClassToTOuterClass,
																					tInnerClass, tInnerPackage,
																					tOuterPackage, typeGraph,
																					tOuterClass, eInnerClass,
																					eCodeBlock,
																					typeDeclarationStatement,
																					eMethodDeclaration, eOuterClass,
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
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_24_2_matchcontext_greenBBBBBBBBBBBBFB(
			TypeToTAbstractType eOuterClassToTOuterClass, TClass tInnerClass, TPackage tInnerPackage,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, ClassDeclaration eInnerClass,
			Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "ClassInnerMethode";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(eInnerClass);
		isApplicableMatch.getAllContextElements().add(eCodeBlock);
		isApplicableMatch.getAllContextElements().add(typeDeclarationStatement);
		isApplicableMatch.getAllContextElements().add(eMethodDeclaration);
		isApplicableMatch.getAllContextElements().add(eOuterClass);
		isApplicableMatch.getAllContextElements().add(tInnerClass);
		isApplicableMatch.getAllContextElements().add(tInnerPackage);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterClass);
		isApplicableMatch.getAllContextElements().add(eOuterClassToTOuterClass);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
				tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass,
				sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_ClassInnerMethode_24_3_checkcsp_bindingFBBBBBBBBBBBBBBB(
			ClassInnerMethode _this, CCMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass,
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, eOuterClassToTOuterClass, tInnerClass,
				tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement,
				eMethodDeclaration, eOuterClass, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, tInnerClass, tInnerPackage,
					tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement,
					eMethodDeclaration, eOuterClass, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerMethode_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBB(
			ClassInnerMethode _this, CCMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass,
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassInnerMethode_24_3_checkcsp_binding = pattern_ClassInnerMethode_24_3_checkcsp_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, tInnerClass, tInnerPackage, tOuterPackage,
				typeGraph, tOuterClass, eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
				eOuterClass, sourceMatch, targetMatch);
		if (result_pattern_ClassInnerMethode_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerMethode_24_3_checkcsp_binding[0];

			Object[] result_pattern_ClassInnerMethode_24_3_checkcsp_black = pattern_ClassInnerMethode_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_ClassInnerMethode_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, tInnerClass,
						tInnerPackage, tOuterPackage, typeGraph, tOuterClass, eInnerClass, eCodeBlock,
						typeDeclarationStatement, eMethodDeclaration, eOuterClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_24_4_createcorrespondence_blackBBBBBBBBBBB(
			TClass tInnerClass, TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass,
			ClassDeclaration eInnerClass, Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass, CCMatch isApplicableMatch) {
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				if (!eInnerClass.equals(eOuterClass)) {
					return new Object[] { tInnerClass, tInnerPackage, tOuterPackage, typeGraph, tOuterClass,
							eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration, eOuterClass,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_24_4_createcorrespondence_greenFBBB(TClass tInnerClass,
			ClassDeclaration eInnerClass, CCMatch isApplicableMatch) {
		TypeToTAbstractType eInnerClassToTInnerClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		eInnerClassToTInnerClass.setSource(eInnerClass);
		eInnerClassToTInnerClass.setTarget(tInnerClass);
		isApplicableMatch.getCreateCorr().add(eInnerClassToTInnerClass);
		return new Object[] { eInnerClassToTInnerClass, tInnerClass, eInnerClass, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerMethode_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInnerMethode_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInnerMethode";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInnerMethode_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_27_1_matchtggpattern_blackBBBBB(ClassDeclaration eInnerClass,
			Block eCodeBlock, TypeDeclarationStatement typeDeclarationStatement, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass) {
		if (!eInnerClass.equals(eOuterClass)) {
			if (eCodeBlock.getStatements().contains(typeDeclarationStatement)) {
				if (eInnerClass.equals(typeDeclarationStatement.getDeclaration())) {
					if (eCodeBlock.equals(eMethodDeclaration.getBody())) {
						if (eOuterClass.getBodyDeclarations().contains(eMethodDeclaration)) {
							return new Object[] { eInnerClass, eCodeBlock, typeDeclarationStatement, eMethodDeclaration,
									eOuterClass };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerMethode_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerMethode_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_0BBB(TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tInnerClass_classes_6630 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tInnerClass, TPackage.class, "classes")) {
				if (!tInnerPackage.equals(__DEC_tInnerClass_classes_6630)) {
					if (!tOuterPackage.equals(__DEC_tInnerClass_classes_6630)) {
						return new Object[] { tInnerClass, tInnerPackage, tOuterPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_1BB(TClass tInnerClass,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tInnerClass_classes_461612 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInnerClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tInnerClass_classes_461612)) {
				return new Object[] { tInnerClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_2BBB(TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerClass_ownedTypes_357416 = tInnerClass.getPackage();
			if (__DEC_tInnerClass_ownedTypes_357416 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerClass_ownedTypes_357416)) {
					if (!tOuterPackage.equals(__DEC_tInnerClass_ownedTypes_357416)) {
						return new Object[] { tInnerClass, tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_3BB(TPackage tInnerPackage,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_typeGraph_849734 = tInnerPackage.getTypeGraph();
		if (__DEC_tInnerPackage_typeGraph_849734 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_typeGraph_849734)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_4BB(TPackage tInnerPackage,
			TPackage tOuterPackage) {
		if (!tInnerPackage.equals(tOuterPackage)) {
			TPackage __DEC_tInnerPackage_subpackage_409922 = tInnerPackage.getParent();
			if (__DEC_tInnerPackage_subpackage_409922 != null) {
				if (!tInnerPackage.equals(__DEC_tInnerPackage_subpackage_409922)) {
					if (!tOuterPackage.equals(__DEC_tInnerPackage_subpackage_409922)) {
						return new Object[] { tInnerPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_5BB(TPackage tInnerPackage,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tInnerPackage_packages_257599 = tInnerPackage.getPg();
		if (__DEC_tInnerPackage_packages_257599 != null) {
			if (!typeGraph.equals(__DEC_tInnerPackage_packages_257599)) {
				return new Object[] { tInnerPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_6BB(TPackage tOuterPackage,
			TClass tInnerClass) {
		if (tOuterPackage.getClasses().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_7BB(TPackage tOuterPackage,
			TClass tInnerClass) {
		if (tOuterPackage.getOwnedTypes().contains(tInnerClass)) {
			return new Object[] { tOuterPackage, tInnerClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_8BB(TPackage tInnerPackage,
			TypeGraph typeGraph) {
		if (typeGraph.equals(tInnerPackage.getTypeGraph())) {
			return new Object[] { tInnerPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_9BB(TypeGraph typeGraph,
			TPackage tInnerPackage) {
		if (typeGraph.getPackages().contains(tInnerPackage)) {
			return new Object[] { typeGraph, tInnerPackage };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_28_1_matchtggpattern_blackBBBBB(TClass tInnerClass,
			TPackage tInnerPackage, TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass) {
		if (!tInnerClass.equals(tOuterClass)) {
			if (!tInnerPackage.equals(tOuterPackage)) {
				if (tInnerPackage.getOwnedTypes().contains(tInnerClass)) {
					if (tOuterPackage.equals(tInnerPackage.getParent())) {
						if (tInnerPackage.getClasses().contains(tInnerClass)) {
							if (typeGraph.getOwnedTypes().contains(tInnerClass)) {
								if (typeGraph.getClasses().contains(tInnerClass)) {
									if (typeGraph.getOwnedTypes().contains(tOuterClass)) {
										if (tOuterPackage.getOwnedTypes().contains(tOuterClass)) {
											if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_0BBB(
													tInnerClass, tInnerPackage, tOuterPackage) == null) {
												if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_1BB(
														tInnerClass, typeGraph) == null) {
													if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_2BBB(
															tInnerClass, tInnerPackage, tOuterPackage) == null) {
														if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_3BB(
																tInnerPackage, typeGraph) == null) {
															if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_4BB(
																	tInnerPackage, tOuterPackage) == null) {
																if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_5BB(
																		tInnerPackage, typeGraph) == null) {
																	if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_6BB(
																			tOuterPackage, tInnerClass) == null) {
																		if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_7BB(
																				tOuterPackage, tInnerClass) == null) {
																			if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_8BB(
																					tInnerPackage, typeGraph) == null) {
																				if (pattern_ClassInnerMethode_28_1_matchtggpattern_black_nac_9BB(
																						typeGraph,
																						tInnerPackage) == null) {
																					return new Object[] { tInnerClass,
																							tInnerPackage,
																							tOuterPackage, typeGraph,
																							tOuterClass };
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_ClassInnerMethode_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInnerMethode_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_29_1_createresult_blackB(ClassInnerMethode _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInnerMethode_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterClassToTOuterClass) {
		if (ruleResult.getCorrObjects().contains(eOuterClassToTOuterClass)) {
			return new Object[] { ruleResult, eOuterClassToTOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration eOuterClass) {
		if (ruleResult.getSourceObjects().contains(eOuterClass)) {
			return new Object[] { ruleResult, eOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MethodDeclaration eMethodDeclaration) {
		if (ruleResult.getSourceObjects().contains(eMethodDeclaration)) {
			return new Object[] { ruleResult, eMethodDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Block eCodeBlock) {
		if (ruleResult.getSourceObjects().contains(eCodeBlock)) {
			return new Object[] { ruleResult, eCodeBlock };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TClass tOuterClass) {
		if (ruleResult.getTargetObjects().contains(tOuterClass)) {
			return new Object[] { ruleResult, tOuterClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TPackage tOuterPackage) {
		if (ruleResult.getTargetObjects().contains(tOuterPackage)) {
			return new Object[] { ruleResult, tOuterPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInnerMethode_29_2_isapplicablecore_blackFFFFFFFFBB(
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
									if (pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											eOuterClassToTOuterClass) == null) {
										if (pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												eOuterClass) == null) {
											if (pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, tOuterClass) == null) {
												if (pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_5BB(
														ruleResult, typeGraph) == null) {
													if (pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_6BB(
															ruleResult, tOuterPackage) == null) {
														for (BodyDeclaration tmpEMethodDeclaration : eOuterClass
																.getBodyDeclarations()) {
															if (tmpEMethodDeclaration instanceof MethodDeclaration) {
																MethodDeclaration eMethodDeclaration = (MethodDeclaration) tmpEMethodDeclaration;
																Block eCodeBlock = eMethodDeclaration.getBody();
																if (eCodeBlock != null) {
																	if (pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_2BB(
																			ruleResult, eMethodDeclaration) == null) {
																		if (pattern_ClassInnerMethode_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, eCodeBlock) == null) {
																			_result.add(new Object[] {
																					eOuterClassToTOuterClassList,
																					eOuterClassToTOuterClass,
																					eOuterClass, eMethodDeclaration,
																					eCodeBlock, tOuterClass, typeGraph,
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

	public static final Object[] pattern_ClassInnerMethode_29_3_solveCSP_bindingFBBBBBBBBBB(ClassInnerMethode _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage,
			TypeGraph typeGraph, TClass tOuterClass, Block eCodeBlock, MethodDeclaration eMethodDeclaration,
			ClassDeclaration eOuterClass, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eOuterClassToTOuterClass,
				tOuterPackage, typeGraph, tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, tOuterPackage, typeGraph,
					tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassInnerMethode_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInnerMethode_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ClassInnerMethode _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType eOuterClassToTOuterClass,
			TPackage tOuterPackage, TypeGraph typeGraph, TClass tOuterClass, Block eCodeBlock,
			MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassInnerMethode_29_3_solveCSP_binding = pattern_ClassInnerMethode_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eCodeBlock,
				eMethodDeclaration, eOuterClass, ruleResult);
		if (result_pattern_ClassInnerMethode_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInnerMethode_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassInnerMethode_29_3_solveCSP_black = pattern_ClassInnerMethode_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInnerMethode_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eOuterClassToTOuterClass, tOuterPackage, typeGraph,
						tOuterClass, eCodeBlock, eMethodDeclaration, eOuterClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInnerMethode_29_4_checkCSP_expressionFBB(ClassInnerMethode _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInnerMethode_29_5_checknacs_blackBBBBBBB(
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass, Block eCodeBlock, MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass) {
		return new Object[] { eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eCodeBlock,
				eMethodDeclaration, eOuterClass };
	}

	public static final Object[] pattern_ClassInnerMethode_29_6_perform_blackBBBBBBBB(
			TypeToTAbstractType eOuterClassToTOuterClass, TPackage tOuterPackage, TypeGraph typeGraph,
			TClass tOuterClass, Block eCodeBlock, MethodDeclaration eMethodDeclaration, ClassDeclaration eOuterClass,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eOuterClassToTOuterClass, tOuterPackage, typeGraph, tOuterClass, eCodeBlock,
				eMethodDeclaration, eOuterClass, ruleResult };
	}

	public static final Object[] pattern_ClassInnerMethode_29_6_perform_greenFFFBBFBFBB(TPackage tOuterPackage,
			TypeGraph typeGraph, Block eCodeBlock, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeToTAbstractType eInnerClassToTInnerClass = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tInnerClass = BasicFactory.eINSTANCE.createTClass();
		TPackage tInnerPackage = BasicFactory.eINSTANCE.createTPackage();
		ClassDeclaration eInnerClass = JavaFactory.eINSTANCE.createClassDeclaration();
		TypeDeclarationStatement typeDeclarationStatement = JavaFactory.eINSTANCE.createTypeDeclarationStatement();
		Object _localVariable_0 = csp.getValue("tInnerClass", "ID");
		Object _localVariable_1 = csp.getValue("tInnerClass", "tName");
		Object _localVariable_2 = csp.getValue("tInnerPackage", "ID");
		Object _localVariable_3 = csp.getValue("tInnerPackage", "tName");
		Object _localVariable_4 = csp.getValue("eInnerClass", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(eInnerClassToTInnerClass);
		eInnerClassToTInnerClass.setTarget(tInnerClass);
		typeGraph.getOwnedTypes().add(tInnerClass);
		typeGraph.getClasses().add(tInnerClass);
		ruleResult.getTargetObjects().add(tInnerClass);
		tInnerPackage.getOwnedTypes().add(tInnerClass);
		tInnerPackage.setParent(tOuterPackage);
		tInnerPackage.getClasses().add(tInnerClass);
		ruleResult.getTargetObjects().add(tInnerPackage);
		eInnerClassToTInnerClass.setSource(eInnerClass);
		ruleResult.getSourceObjects().add(eInnerClass);
		eCodeBlock.getStatements().add(typeDeclarationStatement);
		typeDeclarationStatement.setDeclaration(eInnerClass);
		ruleResult.getSourceObjects().add(typeDeclarationStatement);
		int tInnerClass_ID_prime = (int) _localVariable_0;
		String tInnerClass_tName_prime = (String) _localVariable_1;
		int tInnerPackage_ID_prime = (int) _localVariable_2;
		String tInnerPackage_tName_prime = (String) _localVariable_3;
		String eInnerClass_name_prime = (String) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		tInnerClass.setID(Integer.valueOf(tInnerClass_ID_prime));
		tInnerClass.setTName(tInnerClass_tName_prime);
		tInnerPackage.setID(Integer.valueOf(tInnerPackage_ID_prime));
		tInnerPackage.setTName(tInnerPackage_tName_prime);
		eInnerClass.setName(eInnerClass_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eInnerClassToTInnerClass, tInnerClass, tInnerPackage, tOuterPackage, typeGraph,
				eInnerClass, eCodeBlock, typeDeclarationStatement, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ClassInnerMethode_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassInnerMethodeImpl
