/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ControlConstructBag4CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class SplitJoinSplitJoinComponentsCompartment3ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SplitJoinSplitJoinComponentsCompartment3ItemSemanticEditPolicy() {
		super(ControlElementTypes.SplitJoin_3025);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ControlConstructBag_3012 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBag4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
