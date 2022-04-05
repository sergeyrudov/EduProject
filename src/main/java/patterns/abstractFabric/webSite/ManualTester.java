package patterns.abstractFabric.webSite;

import patterns.abstractFabric.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Site is testing");
    }
}
