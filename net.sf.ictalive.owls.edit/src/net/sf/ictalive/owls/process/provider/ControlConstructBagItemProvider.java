/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.owls.expr.provider.OwlsEditPlugin;

import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ProcessFactory;
import net.sf.ictalive.owls.process.ProcessPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.owls.process.ControlConstructBag} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlConstructBagItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstructBagItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlConstructBag_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlConstructBag_id_feature", "_UI_ControlConstructBag_type"),
				 ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlConstructBag_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlConstructBag_version_feature", "_UI_ControlConstructBag_type"),
				 ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST);
			childrenFeatures.add(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__REST);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ControlConstructBag.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlConstructBag"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ControlConstructBag controlConstructBag = (ControlConstructBag)object;
		return getString("_UI_ControlConstructBag_type") + " " + controlConstructBag.getId();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ControlConstructBag.class)) {
			case ProcessPackage.CONTROL_CONSTRUCT_BAG__ID:
			case ProcessPackage.CONTROL_CONSTRUCT_BAG__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProcessPackage.CONTROL_CONSTRUCT_BAG__FIRST:
			case ProcessPackage.CONTROL_CONSTRUCT_BAG__REST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createAnyOrder()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createPerform()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createRepeatUntil()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createRepeatWhile()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST,
				 ProcessFactory.eINSTANCE.createSplitJoin()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.CONTROL_CONSTRUCT_BAG__REST,
				 ProcessFactory.eINSTANCE.createControlConstructBag()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OwlsEditPlugin.INSTANCE;
	}

}
