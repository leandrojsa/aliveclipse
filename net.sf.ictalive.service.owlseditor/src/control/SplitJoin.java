/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.SplitJoin#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getSplitJoin()
 * @model
 * @generated
 */
public interface SplitJoin extends ControlConstruct
{
  /**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(ControlConstructBag)
	 * @see control.ControlPackage#getSplitJoin_Components()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ControlConstructBag getComponents();

  /**
	 * Sets the value of the '{@link control.SplitJoin#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
  void setComponents(ControlConstructBag value);

} // SplitJoin
