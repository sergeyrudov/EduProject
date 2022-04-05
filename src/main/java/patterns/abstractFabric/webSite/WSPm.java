package patterns.abstractFabric.webSite;

import patterns.abstractFabric.ProjectManager;

public class WSPm implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WS Pm working");
    }
}
