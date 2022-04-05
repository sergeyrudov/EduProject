package patterns.abstractFabric.banking;


import patterns.abstractFabric.ProjectManager;

public class PM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Project manager working");
    }
}
