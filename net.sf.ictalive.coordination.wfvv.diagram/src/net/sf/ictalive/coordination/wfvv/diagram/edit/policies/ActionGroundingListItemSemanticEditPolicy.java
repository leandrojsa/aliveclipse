package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionGroundingListRestCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionGroundingListRestReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.PlanHasAtomicProcessGroundingListCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.PlanHasAtomicProcessGroundingListReorientCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListActionGroundingListCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionCoordActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanHasAtomicProcessGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ActionGroundingListItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActionGroundingListItemSemanticEditPolicy() {
		super(WfvvElementTypes.ActionGroundingList_2022);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WfvvVisualIDRegistry.getVisualID(incomingLink) == ActionGroundingListRestEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == ActionGroundingListRestEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (WfvvVisualIDRegistry.getVisualID(node)) {
			case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (WfvvVisualIDRegistry.getVisualID(cnode)) {
					case ActionGroundingEditPart.VISUAL_ID:
						for (Iterator it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (WfvvVisualIDRegistry.getVisualID(incomingLink) == CoordinationActionCoordActionEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (WfvvVisualIDRegistry.getVisualID(outgoingLink) == ActionGroundingOwlsProcessEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WfvvElementTypes.PlanHasAtomicProcessGroundingList_4021 == req
				.getElementType()) {
			return null;
		}
		if (WfvvElementTypes.ActionGroundingListRest_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ActionGroundingListRestCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WfvvElementTypes.PlanHasAtomicProcessGroundingList_4021 == req
				.getElementType()) {
			return getGEFWrapper(new PlanHasAtomicProcessGroundingListCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (WfvvElementTypes.ActionGroundingListRest_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ActionGroundingListRestCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			return getGEFWrapper(new PlanHasAtomicProcessGroundingListReorientCommand(
					req));
		case ActionGroundingListRestEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionGroundingListRestReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
