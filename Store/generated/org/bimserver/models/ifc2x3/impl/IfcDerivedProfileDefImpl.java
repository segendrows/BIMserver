/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator2D;
import org.bimserver.models.ifc2x3.IfcDerivedProfileDef;
import org.bimserver.models.ifc2x3.IfcProfileDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Derived Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDerivedProfileDefImpl#getParentProfile <em>Parent Profile</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDerivedProfileDefImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDerivedProfileDefImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDerivedProfileDefImpl extends IfcProfileDefImpl implements IfcDerivedProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDerivedProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getParentProfile() {
		return (IfcProfileDef)eGet(Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef_ParentProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentProfile(IfcProfileDef newParentProfile) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef_ParentProfile(), newParentProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D getOperator() {
		return (IfcCartesianTransformationOperator2D)eGet(Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef_Operator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(IfcCartesianTransformationOperator2D newOperator) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef_Operator(), newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef_Label(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef_Label(), newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLabel() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLabel() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDerivedProfileDef_Label());
	}

} //IfcDerivedProfileDefImpl
