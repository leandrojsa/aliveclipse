/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.ictalive.service.template.util.TemplateAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateItemProviderAdapterFactory extends TemplateAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.ServiceTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTemplateItemProvider serviceTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.ServiceTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceTemplateAdapter() {
		if (serviceTemplateItemProvider == null) {
			serviceTemplateItemProvider = new ServiceTemplateItemProvider(this);
		}

		return serviceTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.TemplateFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateFlowItemProvider templateFlowItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.TemplateFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateFlowAdapter() {
		if (templateFlowItemProvider == null) {
			templateFlowItemProvider = new TemplateFlowItemProvider(this);
		}

		return templateFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.GroundTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundTemplateItemProvider groundTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.GroundTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroundTemplateAdapter() {
		if (groundTemplateItemProvider == null) {
			groundTemplateItemProvider = new GroundTemplateItemProvider(this);
		}

		return groundTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.AbstractProcessModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractProcessModelItemProvider abstractProcessModelItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.AbstractProcessModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractProcessModelAdapter() {
		if (abstractProcessModelItemProvider == null) {
			abstractProcessModelItemProvider = new AbstractProcessModelItemProvider(this);
		}

		return abstractProcessModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.BoundTemplateParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundTemplateParameterItemProvider boundTemplateParameterItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.BoundTemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundTemplateParameterAdapter() {
		if (boundTemplateParameterItemProvider == null) {
			boundTemplateParameterItemProvider = new BoundTemplateParameterItemProvider(this);
		}

		return boundTemplateParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.BoundProcessModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundProcessModelItemProvider boundProcessModelItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.BoundProcessModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundProcessModelAdapter() {
		if (boundProcessModelItemProvider == null) {
			boundProcessModelItemProvider = new BoundProcessModelItemProvider(this);
		}

		return boundProcessModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.TemplateConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateConstraintItemProvider templateConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.TemplateConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateConstraintAdapter() {
		if (templateConstraintItemProvider == null) {
			templateConstraintItemProvider = new TemplateConstraintItemProvider(this);
		}

		return templateConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.AnyOrder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyOrderItemProvider anyOrderItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.AnyOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnyOrderAdapter() {
		if (anyOrderItemProvider == null) {
			anyOrderItemProvider = new AnyOrderItemProvider(this);
		}

		return anyOrderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.Choice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceItemProvider choiceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceAdapter() {
		if (choiceItemProvider == null) {
			choiceItemProvider = new ChoiceItemProvider(this);
		}

		return choiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.IfThenElse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseItemProvider ifThenElseItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfThenElseAdapter() {
		if (ifThenElseItemProvider == null) {
			ifThenElseItemProvider = new IfThenElseItemProvider(this);
		}

		return ifThenElseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.Perform} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformItemProvider performItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.Perform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerformAdapter() {
		if (performItemProvider == null) {
			performItemProvider = new PerformItemProvider(this);
		}

		return performItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.RepeatUntil} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatUntilItemProvider repeatUntilItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.RepeatUntil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatUntilAdapter() {
		if (repeatUntilItemProvider == null) {
			repeatUntilItemProvider = new RepeatUntilItemProvider(this);
		}

		return repeatUntilItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.RepeatWhile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatWhileItemProvider repeatWhileItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.RepeatWhile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatWhileAdapter() {
		if (repeatWhileItemProvider == null) {
			repeatWhileItemProvider = new RepeatWhileItemProvider(this);
		}

		return repeatWhileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.Sequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceItemProvider sequenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceAdapter() {
		if (sequenceItemProvider == null) {
			sequenceItemProvider = new SequenceItemProvider(this);
		}

		return sequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.Split} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitItemProvider splitItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.Split}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplitAdapter() {
		if (splitItemProvider == null) {
			splitItemProvider = new SplitItemProvider(this);
		}

		return splitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.SplitJoin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitJoinItemProvider splitJoinItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.SplitJoin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplitJoinAdapter() {
		if (splitJoinItemProvider == null) {
			splitJoinItemProvider = new SplitJoinItemProvider(this);
		}

		return splitJoinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.ControlConstructList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlConstructListItemProvider controlConstructListItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.ControlConstructList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlConstructListAdapter() {
		if (controlConstructListItemProvider == null) {
			controlConstructListItemProvider = new ControlConstructListItemProvider(this);
		}

		return controlConstructListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.ControlConstructBag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlConstructBagItemProvider controlConstructBagItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.ControlConstructBag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlConstructBagAdapter() {
		if (controlConstructBagItemProvider == null) {
			controlConstructBagItemProvider = new ControlConstructBagItemProvider(this);
		}

		return controlConstructBagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.template.IntervalThing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalThingItemProvider intervalThingItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.template.IntervalThing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntervalThingAdapter() {
		if (intervalThingItemProvider == null) {
			intervalThingItemProvider = new IntervalThingItemProvider(this);
		}

		return intervalThingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (serviceTemplateItemProvider != null) serviceTemplateItemProvider.dispose();
		if (templateFlowItemProvider != null) templateFlowItemProvider.dispose();
		if (groundTemplateItemProvider != null) groundTemplateItemProvider.dispose();
		if (abstractProcessModelItemProvider != null) abstractProcessModelItemProvider.dispose();
		if (boundTemplateParameterItemProvider != null) boundTemplateParameterItemProvider.dispose();
		if (boundProcessModelItemProvider != null) boundProcessModelItemProvider.dispose();
		if (templateConstraintItemProvider != null) templateConstraintItemProvider.dispose();
		if (anyOrderItemProvider != null) anyOrderItemProvider.dispose();
		if (choiceItemProvider != null) choiceItemProvider.dispose();
		if (ifThenElseItemProvider != null) ifThenElseItemProvider.dispose();
		if (performItemProvider != null) performItemProvider.dispose();
		if (repeatUntilItemProvider != null) repeatUntilItemProvider.dispose();
		if (repeatWhileItemProvider != null) repeatWhileItemProvider.dispose();
		if (sequenceItemProvider != null) sequenceItemProvider.dispose();
		if (splitItemProvider != null) splitItemProvider.dispose();
		if (splitJoinItemProvider != null) splitJoinItemProvider.dispose();
		if (controlConstructListItemProvider != null) controlConstructListItemProvider.dispose();
		if (controlConstructBagItemProvider != null) controlConstructBagItemProvider.dispose();
		if (intervalThingItemProvider != null) intervalThingItemProvider.dispose();
	}

}