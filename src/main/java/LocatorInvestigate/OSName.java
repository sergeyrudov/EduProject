package LocatorInvestigate;

public enum OSName {

    ANDROID ("android"),
    IOS ("ios"),
    BLACKBERRY_OS("blackberry"),
    SYMBIAN("symbian");


    private String displayName;

    OSName(String displayName) {
        this.displayName = displayName;
    }
    public String toString() {
        return displayName;
    }
}
