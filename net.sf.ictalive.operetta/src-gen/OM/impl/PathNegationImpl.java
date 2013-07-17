/**
 */
package OM.impl;

import OM.OMPackage;
import OM.PathFormula;
import OM.PathNegation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Negation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.PathNegationImpl#getPathFormula <em>Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathNegationImpl extends PathFormulaImpl implements PathNegation
{
  /**
   * The cached value of the '{@link #getPathFormula() <em>Path Formula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathFormula()
   * @generated
   * @ordered
   */
  protected PathFormula pathFormula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathNegationImpl()
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
    return OMPackage.Literals.PATH_NEGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula getPathFormula()
  {
    if (pathFormula != null && pathFormula.eIsProxy())
    {
      InternalEObject oldPathFormula = (InternalEObject)pathFormula;
      pathFormula = (PathFormula)eResolveProxy(oldPathFormula);
      if (pathFormula != oldPathFormula)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.PATH_NEGATION__PATH_FORMULA, oldPathFormula, pathFormula));
      }
    }
    return pathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula basicGetPathFormula()
  {
    return pathFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPathFormula(PathFormula newPathFormula)
  {
    PathFormula oldPathFormula = pathFormula;
    pathFormula = newPathFormula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.PATH_NEGATION__PATH_FORMULA, oldPathFormula, pathFormula));
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
      case OMPackage.PATH_NEGATION__PATH_FORMULA:
        if (resolve) return getPathFormula();
        return basicGetPathFormula();
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
      case OMPackage.PATH_NEGATION__PATH_FORMULA:
        setPathFormula((PathFormula)newValue);
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
      case OMPackage.PATH_NEGATION__PATH_FORMULA:
        setPathFormula((PathFormula)null);
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
      case OMPackage.PATH_NEGATION__PATH_FORMULA:
        return pathFormula != null;
    }
    return super.eIsSet(featureID);
  }

} //PathNegationImpl