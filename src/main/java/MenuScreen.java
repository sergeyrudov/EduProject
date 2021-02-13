public abstract class MenuScreen{
    public abstract void selectLocator(String s);
}




class Android extends MenuScreen{

    @Override
    public void selectLocator(String s) {
        System.out.println("android locator selected" + s);
    }
}

class iOS extends MenuScreen {

    @Override
    public void selectLocator(String s) {
        System.out.println("ios locator selected" + s);
    }
}



class Test extends MenuScreen{

    public static void main(String[] args) {
        String androidLocator = "android Locator";
        String iOSLocator = "iOS Locator";

        Test t1 = new Test();

        t1.selectLocator(iOSLocator);
        t1.selectLocator(androidLocator);
    }

    @Override
    public void selectLocator(String s) {
        iOS iOS = new iOS();
        iOS.selectLocator("344");
        Android android = new Android();
        android.selectLocator("11");
    }
}

