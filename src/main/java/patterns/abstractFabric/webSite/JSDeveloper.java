package patterns.abstractFabric.webSite;

import patterns.abstractFabric.Developer;

public class JSDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JS coder writing");
    }
}
