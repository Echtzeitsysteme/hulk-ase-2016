/**
 */
package org.gravity.eval.ase.deltas.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.Model;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.eval.ase.deltas.CreateClass;
import org.gravity.eval.ase.deltas.DeltasPackage;

import org.gravity.modisco.MGravityModel;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CreateClassImpl extends DeltaImpl implements CreateClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeltasPackage.Literals.CREATE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {// ActivityNode16 story node is empty
		return CreateClassImpl.pattern_CreateClass_0_2_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void perform(MGravityModel modisco) {
		// ActivityNode17
		Object[] result1_black = CreateClassImpl.pattern_CreateClass_1_1_ActivityNode17_blackBFF(modisco);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode17] failed." + " Variables: "
					+ "[modisco] = " + modisco + ".");
		}
		// org.eclipse.gmt.modisco.java.Package p_org = (org.eclipse.gmt.modisco.java.Package) result1_black[1];
		org.eclipse.gmt.modisco.java.Package p_jhotdraw = (org.eclipse.gmt.modisco.java.Package) result1_black[2];
		CreateClassImpl.pattern_CreateClass_1_1_ActivityNode17_greenBBFF(modisco, p_jhotdraw);
		// ClassDeclaration c_new = (ClassDeclaration) result1_green[2];
		// CompilationUnit cu_new = (CompilationUnit) result1_green[3];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DeltasPackage.CREATE_CLASS___GET_PROJECT_NAME:
			return getProjectName();
		case DeltasPackage.CREATE_CLASS___PERFORM__MGRAVITYMODEL:
			perform((MGravityModel) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final String pattern_CreateClass_0_2_expressionF() {
		String _result = "07_JHotDraw7.6";
		return _result;
	}

	public static final Object[] pattern_CreateClass_1_1_ActivityNode17_blackBFF(Model modisco) {
		for (org.eclipse.gmt.modisco.java.Package p_org : modisco.getOwnedElements()) {
			String p_org_name = p_org.getName();
			if (p_org_name.equals("org")) {
				for (org.eclipse.gmt.modisco.java.Package p_jhotdraw : p_org.getOwnedPackages()) {
					if (!p_jhotdraw.equals(p_org)) {
						String p_jhotdraw_name = p_jhotdraw.getName();
						if (p_jhotdraw_name.equals("jhotdraw")) {
							return new Object[] { modisco, p_org, p_jhotdraw };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_CreateClass_1_1_ActivityNode17_greenBBFF(Model modisco,
			org.eclipse.gmt.modisco.java.Package p_jhotdraw) {
		ClassDeclaration c_new = JavaFactory.eINSTANCE.createClassDeclaration();
		CompilationUnit cu_new = JavaFactory.eINSTANCE.createCompilationUnit();
		String c_new_name_prime = "NewClass";
		boolean c_new_proxy_prime = false;
		String cu_new_name_prime = "NewClass.java";
		boolean cu_new_proxy_prime = false;
		p_jhotdraw.getOwnedElements().add(c_new);
		modisco.getCompilationUnits().add(cu_new);
		c_new.setOriginalCompilationUnit(cu_new);
		cu_new.setPackage(p_jhotdraw);
		cu_new.getTypes().add(c_new);
		c_new.setName(c_new_name_prime);
		c_new.setProxy(Boolean.valueOf(c_new_proxy_prime));
		cu_new.setName(cu_new_name_prime);
		cu_new.setProxy(Boolean.valueOf(cu_new_proxy_prime));
		return new Object[] { modisco, p_jhotdraw, c_new, cu_new };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CreateClassImpl
