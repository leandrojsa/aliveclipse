package net.sf.ictalive.service.serviceui;

import org.eclipse.jface.wizard.IWizard;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.dashboard.PluggedInWizardDashboardAction;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;

public class RepositoryImportServiceAction extends
		PluggedInWizardDashboardAction<AliveDashboardState> {
	public static final String ActionID = AliveDashboardState.ImportServiceId;

	@Override
	protected IWizard createWizard(AliveDashboardState state) {

		return new RepositoryImportWizard(DiscoverySearch.search().inSection(
				"semanticservices"));
	}

	@Override
	protected void wizardFinished(IWizard wizard, AliveDashboardState state) {
		// TODO Auto-generated method stub

	}

	@Override
	public String dashboardActionId() {

		return ActionID;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		// TODO Auto-generated method stub
		return null;
	}
}