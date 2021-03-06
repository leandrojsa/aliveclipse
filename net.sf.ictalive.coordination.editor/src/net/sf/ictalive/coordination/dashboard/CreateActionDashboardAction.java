/**
 * 
 */
package net.sf.ictalive.coordination.dashboard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.coordination.actions.presentation.ActionsModelWizard;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.IWizard;

/**
 * @author dcorsar
 *
 */
public class CreateActionDashboardAction extends PluggedInWizardDashboardAction<AliveDashboardState> {

	/* (non-Javadoc)
	 * @see net.sf.ictalive.dashboard.action.WizardDashboardAction#createWizard(net.sf.ictalive.dashboard.DashboardState)
	 */
	@Override
	protected IWizard createWizard(AliveDashboardState state) {
		return new ActionsModelWizard();
	}

	
	
	/* (non-Javadoc)
	 * @see net.sf.ictalive.dashboard.action.WizardDashboardAction#wizardFinished(org.eclipse.jface.wizard.IWizard, net.sf.ictalive.dashboard.DashboardState)
	 */
	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		URI newTarget = URI.createPlatformResourceURI(((ActionsModelWizard)wizard).getModelFile().getFullPath().toOSString(), true);
		if (newTarget!=null){
			state.setAction(newTarget);
		}
	}

	/* (non-Javadoc)
	 * @see net.sf.ictalive.dashboard.action.DashboardAction#dashboardActionId()
	 */
	@Override
	public String dashboardActionId() {
		return AliveDashboardState.CreateActionId;
	}
	
	@Override
	public String getProblems(AliveDashboardState state) {
		return null;//always active
	}
}
