/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcTask;
import org.bimserver.models.ifc2x3.Tristate;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTaskImpl#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTaskImpl#getWorkMethod <em>Work Method</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTaskImpl#getIsMilestone <em>Is Milestone</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTaskImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTaskImpl extends IfcProcessImpl implements IfcTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskId() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcTask_TaskId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskId(String newTaskId) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTask_TaskId(), newTaskId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcTask_Status(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTask_Status(), newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTask_Status());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTask_Status());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkMethod() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcTask_WorkMethod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkMethod(String newWorkMethod) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTask_WorkMethod(), newWorkMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkMethod() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTask_WorkMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkMethod() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTask_WorkMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getIsMilestone() {
		return (Tristate)eGet(Ifc2x3Package.eINSTANCE.getIfcTask_IsMilestone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMilestone(Tristate newIsMilestone) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTask_IsMilestone(), newIsMilestone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return (Integer)eGet(Ifc2x3Package.eINSTANCE.getIfcTask_Priority(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTask_Priority(), newPriority);
	}

} //IfcTaskImpl
