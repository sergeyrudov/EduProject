package patterns.abstractFabric.webSite;

import patterns.abstractFabric.Developer;
import patterns.abstractFabric.ProjectManager;
import patterns.abstractFabric.ProjectTeamFactory;
import patterns.abstractFabric.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JSDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WSPm();
    }


}
