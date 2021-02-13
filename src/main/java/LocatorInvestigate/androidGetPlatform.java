package LocatorInvestigate;

public class androidGetPlatform extends Request {

    @Override
    public String getInfo(OSName value) {
        if (value.equals(OSName.ANDROID)) {
            return "yep, am ANDROID";
        }
        return "My OS is NOT: " + value ;
    }
}

