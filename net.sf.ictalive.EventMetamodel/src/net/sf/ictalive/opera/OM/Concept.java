/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.Concept#getConcept <em>Concept</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Concept#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends EObject
{
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' attribute.
	 * @see #setConcept(String)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getConcept_Concept()
	 * @model required="true"
	 * @generated
	 */
	String getConcept();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Concept#getConcept <em>Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' attribute.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getConcept_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Concept#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // Concept
