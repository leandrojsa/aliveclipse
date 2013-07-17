/**
 */
package OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OM.PathNegation#getPathFormula <em>Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see OM.OMPackage#getPathNegation()
 * @model
 * @generated
 */
public interface PathNegation extends PathFormula
{
  /**
   * Returns the value of the '<em><b>Path Formula</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path Formula</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Formula</em>' reference.
   * @see #setPathFormula(PathFormula)
   * @see OM.OMPackage#getPathNegation_PathFormula()
   * @model required="true"
   * @generated
   */
  PathFormula getPathFormula();

  /**
   * Sets the value of the '{@link OM.PathNegation#getPathFormula <em>Path Formula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path Formula</em>' reference.
   * @see #getPathFormula()
   * @generated
   */
  void setPathFormula(PathFormula value);

} // PathNegation
