package LocatorInvestigate;

public class Action {
    public static void main(String[] args) {
        Request android = new androidGetPlatform();
        Request ios = new iosGetPlatform();

        System.out.println(android.getInfo(OSName.ANDROID));

        System.out.println(ios.getInfo(OSName.IOS));

        System.out.println(android.getInfo(OSName.BLACKBERRY_OS));
        System.out.println(ios.getInfo(OSName.SYMBIAN));
    }
}
