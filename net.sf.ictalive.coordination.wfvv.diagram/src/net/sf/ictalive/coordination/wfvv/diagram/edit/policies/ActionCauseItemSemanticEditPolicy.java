package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ActionCauseItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActionCauseItemSemanticEditPolicy() {
		super(WfvvElementTypes.ActionCause_4016);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
