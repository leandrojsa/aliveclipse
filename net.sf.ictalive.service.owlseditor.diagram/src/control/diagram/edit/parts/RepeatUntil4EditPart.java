/*
 * 
 */
package control.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import control.diagram.edit.policies.OpenDiagramEditPolicy;
import control.diagram.edit.policies.RepeatUntil4ItemSemanticEditPolicy;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class RepeatUntil4EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3058;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public RepeatUntil4EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RepeatUntil4ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		RepeatUntilFigure figure = new RepeatUntilFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RepeatUntilFigure getPrimaryShape() {
		return (RepeatUntilFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RepeatUntilName4EditPart) {
			((RepeatUntilName4EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRepeatUntilLabelFigure());
			return true;
		}
		if (childEditPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getRepeatUntilUntilConditionCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((RepeatUntilRepeatUntilUntilConditionCompartment3EditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getRepeatUntilUntilProcessCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((RepeatUntilRepeatUntilUntilProcessCompartment3EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RepeatUntilName4EditPart) {
			return true;
		}
		if (childEditPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getRepeatUntilUntilConditionCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((RepeatUntilRepeatUntilUntilConditionCompartment3EditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getRepeatUntilUntilProcessCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((RepeatUntilRepeatUntilUntilProcessCompartment3EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof RepeatUntilRepeatUntilUntilConditionCompartment3EditPart) {
			return getPrimaryShape()
					.getRepeatUntilUntilConditionCompartmentFigure();
		}
		if (editPart instanceof RepeatUntilRepeatUntilUntilProcessCompartment3EditPart) {
			return getPrimaryShape()
					.getRepeatUntilUntilProcessCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ControlVisualIDRegistry
				.getType(RepeatUntilName4EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class RepeatUntilFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRepeatUntilLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fRepeatUntilUntilConditionCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fRepeatUntilUntilProcessCompartmentFigure;

		/**
		 * @generated
		 */
		public RepeatUntilFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(1);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRepeatUntilLabelFigure = new WrappingLabel();
			fFigureRepeatUntilLabelFigure.setText("RepeatUntil");
			fFigureRepeatUntilLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureRepeatUntilLabelFigure);

			fRepeatUntilUntilConditionCompartmentFigure = new RectangleFigure();
			fRepeatUntilUntilConditionCompartmentFigure.setOutline(false);
			fRepeatUntilUntilConditionCompartmentFigure.setLineWidth(1);

			this.add(fRepeatUntilUntilConditionCompartmentFigure);

			fRepeatUntilUntilProcessCompartmentFigure = new RectangleFigure();
			fRepeatUntilUntilProcessCompartmentFigure.setOutline(false);
			fRepeatUntilUntilProcessCompartmentFigure.setLineWidth(1);

			this.add(fRepeatUntilUntilProcessCompartmentFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRepeatUntilLabelFigure() {
			return fFigureRepeatUntilLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getRepeatUntilUntilConditionCompartmentFigure() {
			return fRepeatUntilUntilConditionCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getRepeatUntilUntilProcessCompartmentFigure() {
			return fRepeatUntilUntilProcessCompartmentFigure;
		}

	}

}
