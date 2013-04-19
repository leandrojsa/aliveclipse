/*
 * 
 */
package control.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import control.ControlPackage;
import control.diagram.edit.parts.ValueForm2EditPart;
import control.diagram.edit.parts.ValueFormEditPart;
import control.diagram.edit.parts.ValueFunction2EditPart;
import control.diagram.edit.parts.ValueFunctionEditPart;
import control.diagram.edit.parts.ValueSource2EditPart;
import control.diagram.edit.parts.ValueSourceEditPart;
import control.diagram.part.ControlDiagramUpdater;
import control.diagram.part.ControlNodeDescriptor;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class ProduceProduceProducedBindingValueSpecifierCompartment2CanonicalEditPolicy
		extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = ControlDiagramUpdater
				.getProduceProduceProducedBindingValueSpecifierCompartment_7061SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((ControlNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = ControlVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ValueSource2EditPart.VISUAL_ID:
		case ValueForm2EditPart.VISUAL_ID:
		case ValueFunction2EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(ControlPackage.eINSTANCE
					.getProduce_ProducedBindingValueSpecifier());
		}
		return myFeaturesToSynchronize;
	}

}
