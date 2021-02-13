package LocatorInvestigate;

public class iosGetPlatform extends Request {

    @Override
    public String getInfo(OSName value) {
        if (value.equals(OSName.IOS)) {
            return "yep, am IOS";
        }
        return "My OS is NOT: " + value;
    }
}

