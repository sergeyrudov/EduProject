package patterns.abstractFabric.banking;

import patterns.abstractFabric.Developer;
import patterns.abstractFabric.ProjectManager;
import patterns.abstractFabric.ProjectTeamFactory;
import patterns.abstractFabric.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PM();
    }
}
