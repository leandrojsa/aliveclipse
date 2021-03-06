package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands;

import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;
import net.sf.ictalive.coordination.wfannotation.mapping.SequenceToSequenceMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.MappingBaseItemSemanticEditPolicy;

import org.eclipse.bpel.model.Sequence;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class SequenceToSequenceMappingReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public SequenceToSequenceMappingReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof SequenceToSequenceMapping) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Sequence && newEnd instanceof Sequence)) {
			return false;
		}
		net.sf.ictalive.owls.process.Sequence target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof MappingContainer)) {
			return false;
		}
		MappingContainer container = (MappingContainer) getLink().eContainer();
		return MappingBaseItemSemanticEditPolicy.LinkConstraints
				.canExistSequenceToSequenceMapping_4016(container,
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof net.sf.ictalive.owls.process.Sequence && newEnd instanceof net.sf.ictalive.owls.process.Sequence)) {
			return false;
		}
		Sequence source = getLink().getSource();
		if (!(getLink().eContainer() instanceof MappingContainer)) {
			return false;
		}
		MappingContainer container = (MappingContainer) getLink().eContainer();
		return MappingBaseItemSemanticEditPolicy.LinkConstraints
				.canExistSequenceToSequenceMapping_4016(container, source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected SequenceToSequenceMapping getLink() {
		return (SequenceToSequenceMapping) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Sequence getOldSource() {
		return (Sequence) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Sequence getNewSource() {
		return (Sequence) newEnd;
	}

	/**
	 * @generated
	 */
	protected net.sf.ictalive.owls.process.Sequence getOldTarget() {
		return (net.sf.ictalive.owls.process.Sequence) oldEnd;
	}

	/**
	 * @generated
	 */
	protected net.sf.ictalive.owls.process.Sequence getNewTarget() {
		return (net.sf.ictalive.owls.process.Sequence) newEnd;
	}
}
