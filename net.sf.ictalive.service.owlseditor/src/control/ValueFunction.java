/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.ValueFunction#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getValueFunction()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ValueFunction extends NamedElement, ValueSpecifierElement
{
  /**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see control.ControlPackage#getValueFunction_Body()
	 * @model
	 * @generated
	 */
  String getBody();

  /**
	 * Sets the value of the '{@link control.ValueFunction#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
  void setBody(String value);

} // ValueFunction
