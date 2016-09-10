/**
 */
package org.gravity.eval.ase.deltas.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Model;

import org.gravity.eval.ase.deltas.DeltasPackage;
import org.gravity.eval.ase.deltas.RenameClass;

import org.gravity.modisco.MGravityModel;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RenameClassImpl extends DeltaImpl implements RenameClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeltasPackage.Literals.RENAME_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {// ActivityNode9 story node is empty
		return RenameClassImpl.pattern_RenameClass_0_2_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void perform(MGravityModel modisco) {
		// ActivityNode10
		Object[] result1_black = RenameClassImpl.pattern_RenameClass_1_1_ActivityNode10_blackBFFB(modisco, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode10] failed." + " Variables: "
					+ "[modisco] = " + modisco + ", " + "[this] = " + this + ".");
		}
		// org.eclipse.gmt.modisco.java.Package p_quj = (org.eclipse.gmt.modisco.java.Package) result1_black[1];
		ClassDeclaration c_boxpanel = (ClassDeclaration) result1_black[2];
		RenameClassImpl.pattern_RenameClass_1_2_expressionBB(this, c_boxpanel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rename(ClassDeclaration mclass) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DeltasPackage.RENAME_CLASS___GET_PROJECT_NAME:
			return getProjectName();
		case DeltasPackage.RENAME_CLASS___PERFORM__MGRAVITYMODEL:
			perform((MGravityModel) arguments.get(0));
			return null;
		case DeltasPackage.RENAME_CLASS___RENAME__CLASSDECLARATION:
			rename((ClassDeclaration) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final String pattern_RenameClass_0_2_expressionF() {
		String _result = "01_QuickUML2001";
		return _result;
	}

	public static final Object[] pattern_RenameClass_1_1_ActivityNode10_blackBFFB(Model modisco, RenameClass _this) {
		for (org.eclipse.gmt.modisco.java.Package p_quj : modisco.getOwnedElements()) {
			String p_quj_name = p_quj.getName();
			if (p_quj_name.equals("quj")) {
				for (AbstractTypeDeclaration tmpC_boxpanel : p_quj.getOwnedElements()) {
					if (tmpC_boxpanel instanceof ClassDeclaration) {
						ClassDeclaration c_boxpanel = (ClassDeclaration) tmpC_boxpanel;
						String c_boxpanel_name = c_boxpanel.getName();
						if (c_boxpanel_name.equals("BoxPanel")) {
							return new Object[] { modisco, p_quj, c_boxpanel, _this };
						}

					}
				}
			}

		}
		return null;
	}

	public static final void pattern_RenameClass_1_2_expressionBB(RenameClass _this, ClassDeclaration c_boxpanel) {
		_this.rename(c_boxpanel);

	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RenameClassImpl
