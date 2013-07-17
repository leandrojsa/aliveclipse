/**
 */
package OM.impl;

import OM.OMPackage;
import OM.PathDisjunction;
import OM.PathFormula;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Disjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.PathDisjunctionImpl#getLeftPathFormula <em>Left Path Formula</em>}</li>
 *   <li>{@link OM.impl.PathDisjunctionImpl#getRightPathFormula <em>Right Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathDisjunctionImpl extends PathFormulaImpl implements PathDisjunction
{
  /**
   * The cached value of the '{@link #getLeftPathFormula() <em>Left Path Formula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftPathFormula()
   * @generated
   * @ordered
   */
  protected PathFormula leftPathFormula;

  /**
   * The cached value of the '{@link #getRightPathFormula() <em>Right Path Formula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPathFormula()
   * @generated
   * @ordered
   */
  protected PathFormula rightPathFormula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathDisjunctionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OMPackage.Literals.PATH_DISJUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula getLeftPathFormula()
  {
    if (leftPathFormula != null && leftPathFormula.eIsProxy())
    {
      InternalEObject oldLeftPathFormula = (InternalEObject)leftPathFormula;
      leftPathFormula = (PathFormula)eResolveProxy(oldLeftPathFormula);
      if (leftPathFormula != oldLeftPathFormula)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.PATH_DISJUNCTION__LEFT_PATH_FORMULA, oldLeftPathFormula, leftPathFormula));
      }
    }
    return leftPathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula basicGetLeftPathFormula()
  {
    return leftPathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftPathFormula(PathFormula newLeftPathFormula)
  {
    PathFormula oldLeftPathFormula = leftPathFormula;
    leftPathFormula = newLeftPathFormula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.PATH_DISJUNCTION__LEFT_PATH_FORMULA, oldLeftPathFormula, leftPathFormula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula getRightPathFormula()
  {
    if (rightPathFormula != null && rightPathFormula.eIsProxy())
    {
      InternalEObject oldRightPathFormula = (InternalEObject)rightPathFormula;
      rightPathFormula = (PathFormula)eResolveProxy(oldRightPathFormula);
      if (rightPathFormula != oldRightPathFormula)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.PATH_DISJUNCTION__RIGHT_PATH_FORMULA, oldRightPathFormula, rightPathFormula));
      }
    }
    return rightPathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula basicGetRightPathFormula()
  {
    return rightPathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightPathFormula(PathFormula newRightPathFormula)
  {
    PathFormula oldRightPathFormula = rightPathFormula;
    rightPathFormula = newRightPathFormula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.PATH_DISJUNCTION__RIGHT_PATH_FORMULA, oldRightPathFormula, rightPathFormula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OMPackage.PATH_DISJUNCTION__LEFT_PATH_FORMULA:
        if (resolve) return getLeftPathFormula();
        return basicGetLeftPathFormula();
      case OMPackage.PATH_DISJUNCTION__RIGHT_PATH_FORMULA:
        if (resolve) return getRightPathFormula();
        return basicGetRightPathFormula();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OMPackage.PATH_DISJUNCTION__LEFT_PATH_FORMULA:
        setLeftPathFormula((PathFormula)newValue);
        return;
      case OMPackage.PATH_DISJUNCTION__RIGHT_PATH_FORMULA:
        setRightPathFormula((PathFormula)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OMPackage.PATH_DISJUNCTION__LEFT_PATH_FORMULA:
        setLeftPathFormula((PathFormula)null);
        return;
      case OMPackage.PATH_DISJUNCTION__RIGHT_PATH_FORMULA:
        setRightPathFormula((PathFormula)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OMPackage.PATH_DISJUNCTION__LEFT_PATH_FORMULA:
        return leftPathFormula != null;
      case OMPackage.PATH_DISJUNCTION__RIGHT_PATH_FORMULA:
        return rightPathFormula != null;
    }
    return super.eIsSet(featureID);
  }

} //PathDisjunctionImpl