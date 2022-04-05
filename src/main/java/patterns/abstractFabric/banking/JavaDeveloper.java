package patterns.abstractFabric.banking;

import patterns.abstractFabric.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java code writing");
    }
}
