/**
 */
package OM.impl;

import OM.Actions;
import OM.CS;
import OM.Context;
import OM.CountsAs;
import OM.OMPackage;
import OM.Ontology;
import OM.PartialStateDescription;
import OM.Term;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OM.impl.CSImpl#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link OM.impl.CSImpl#getOntology <em>Ontology</em>}</li>
 *   <li>{@link OM.impl.CSImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link OM.impl.CSImpl#getCountsAsRules <em>Counts As Rules</em>}</li>
 *   <li>{@link OM.impl.CSImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link OM.impl.CSImpl#getActionLibrary <em>Action Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSImpl extends MinimalEObjectImpl.Container implements CS
{
  /**
   * The cached value of the '{@link #getFormulas() <em>Formulas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormulas()
   * @generated
   * @ordered
   */
  protected EList<PartialStateDescription> formulas;

  /**
   * The cached value of the '{@link #getOntology() <em>Ontology</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntology()
   * @generated
   * @ordered
   */
  protected EList<Ontology> ontology;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected EList<Term> terms;

  /**
   * The cached value of the '{@link #getCountsAsRules() <em>Counts As Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountsAsRules()
   * @generated
   * @ordered
   */
  protected EList<CountsAs> countsAsRules;

  /**
   * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContexts()
   * @generated
   * @ordered
   */
  protected EList<Context> contexts;

  /**
   * The cached value of the '{@link #getActionLibrary() <em>Action Library</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionLibrary()
   * @generated
   * @ordered
   */
  protected Actions actionLibrary;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSImpl()
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
    return OMPackage.Literals.CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PartialStateDescription> getFormulas()
  {
    if (formulas == null)
    {
      formulas = new EObjectContainmentEList.Resolving<PartialStateDescription>(PartialStateDescription.class, this, OMPackage.CS__FORMULAS);
    }
    return formulas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ontology> getOntology()
  {
    if (ontology == null)
    {
      ontology = new EObjectContainmentEList.Resolving<Ontology>(Ontology.class, this, OMPackage.CS__ONTOLOGY);
    }
    return ontology;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Term> getTerms()
  {
    if (terms == null)
    {
      terms = new EObjectContainmentEList.Resolving<Term>(Term.class, this, OMPackage.CS__TERMS);
    }
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CountsAs> getCountsAsRules()
  {
    if (countsAsRules == null)
    {
      countsAsRules = new EObjectContainmentEList.Resolving<CountsAs>(CountsAs.class, this, OMPackage.CS__COUNTS_AS_RULES);
    }
    return countsAsRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Context> getContexts()
  {
    if (contexts == null)
    {
      contexts = new EObjectContainmentEList.Resolving<Context>(Context.class, this, OMPackage.CS__CONTEXTS);
    }
    return contexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions getActionLibrary()
  {
    if (actionLibrary != null && actionLibrary.eIsProxy())
    {
      InternalEObject oldActionLibrary = (InternalEObject)actionLibrary;
      actionLibrary = (Actions)eResolveProxy(oldActionLibrary);
      if (actionLibrary != oldActionLibrary)
      {
        InternalEObject newActionLibrary = (InternalEObject)actionLibrary;
        NotificationChain msgs = oldActionLibrary.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.CS__ACTION_LIBRARY, null, null);
        if (newActionLibrary.eInternalContainer() == null)
        {
          msgs = newActionLibrary.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.CS__ACTION_LIBRARY, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.CS__ACTION_LIBRARY, oldActionLibrary, actionLibrary));
      }
    }
    return actionLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions basicGetActionLibrary()
  {
    return actionLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionLibrary(Actions newActionLibrary, NotificationChain msgs)
  {
    Actions oldActionLibrary = actionLibrary;
    actionLibrary = newActionLibrary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.CS__ACTION_LIBRARY, oldActionLibrary, newActionLibrary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionLibrary(Actions newActionLibrary)
  {
    if (newActionLibrary != actionLibrary)
    {
      NotificationChain msgs = null;
      if (actionLibrary != null)
        msgs = ((InternalEObject)actionLibrary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.CS__ACTION_LIBRARY, null, msgs);
      if (newActionLibrary != null)
        msgs = ((InternalEObject)newActionLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.CS__ACTION_LIBRARY, null, msgs);
      msgs = basicSetActionLibrary(newActionLibrary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.CS__ACTION_LIBRARY, newActionLibrary, newActionLibrary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OMPackage.CS__FORMULAS:
        return ((InternalEList<?>)getFormulas()).basicRemove(otherEnd, msgs);
      case OMPackage.CS__ONTOLOGY:
        return ((InternalEList<?>)getOntology()).basicRemove(otherEnd, msgs);
      case OMPackage.CS__TERMS:
        return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
      case OMPackage.CS__COUNTS_AS_RULES:
        return ((InternalEList<?>)getCountsAsRules()).basicRemove(otherEnd, msgs);
      case OMPackage.CS__CONTEXTS:
        return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
      case OMPackage.CS__ACTION_LIBRARY:
        return basicSetActionLibrary(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OMPackage.CS__FORMULAS:
        return getFormulas();
      case OMPackage.CS__ONTOLOGY:
        return getOntology();
      case OMPackage.CS__TERMS:
        return getTerms();
      case OMPackage.CS__COUNTS_AS_RULES:
        return getCountsAsRules();
      case OMPackage.CS__CONTEXTS:
        return getContexts();
      case OMPackage.CS__ACTION_LIBRARY:
        if (resolve) return getActionLibrary();
        return basicGetActionLibrary();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OMPackage.CS__FORMULAS:
        getFormulas().clear();
        getFormulas().addAll((Collection<? extends PartialStateDescription>)newValue);
        return;
      case OMPackage.CS__ONTOLOGY:
        getOntology().clear();
        getOntology().addAll((Collection<? extends Ontology>)newValue);
        return;
      case OMPackage.CS__TERMS:
        getTerms().clear();
        getTerms().addAll((Collection<? extends Term>)newValue);
        return;
      case OMPackage.CS__COUNTS_AS_RULES:
        getCountsAsRules().clear();
        getCountsAsRules().addAll((Collection<? extends CountsAs>)newValue);
        return;
      case OMPackage.CS__CONTEXTS:
        getContexts().clear();
        getContexts().addAll((Collection<? extends Context>)newValue);
        return;
      case OMPackage.CS__ACTION_LIBRARY:
        setActionLibrary((Actions)newValue);
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
      case OMPackage.CS__FORMULAS:
        getFormulas().clear();
        return;
      case OMPackage.CS__ONTOLOGY:
        getOntology().clear();
        return;
      case OMPackage.CS__TERMS:
        getTerms().clear();
        return;
      case OMPackage.CS__COUNTS_AS_RULES:
        getCountsAsRules().clear();
        return;
      case OMPackage.CS__CONTEXTS:
        getContexts().clear();
        return;
      case OMPackage.CS__ACTION_LIBRARY:
        setActionLibrary((Actions)null);
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
      case OMPackage.CS__FORMULAS:
        return formulas != null && !formulas.isEmpty();
      case OMPackage.CS__ONTOLOGY:
        return ontology != null && !ontology.isEmpty();
      case OMPackage.CS__TERMS:
        return terms != null && !terms.isEmpty();
      case OMPackage.CS__COUNTS_AS_RULES:
        return countsAsRules != null && !countsAsRules.isEmpty();
      case OMPackage.CS__CONTEXTS:
        return contexts != null && !contexts.isEmpty();
      case OMPackage.CS__ACTION_LIBRARY:
        return actionLibrary != null;
    }
    return super.eIsSet(featureID);
  }

} //CSImpl
