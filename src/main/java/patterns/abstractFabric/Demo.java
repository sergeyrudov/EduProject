package patterns.abstractFabric;

import patterns.abstractFabric.banking.BankingTeamFactory;

public class Demo {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("start project");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

        Boolean bol = null;
        System.out.println(bol);
    }
    
    public void ggTT() {
        return;
    }
}
