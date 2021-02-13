package ObjectInit;

public class PersonalProfileEditTest5 {
    public static void main(String[] args) {
       PersonalProfileEditScreen screen = new AndroidState();
       screen.getItem("hi");

    }

}


abstract class PersonalProfileEditScreen{
    public String getItem(String a) {
        return a+ "Hello";
    }
}


class iOSState extends PersonalProfileEditScreen{
    @Override
    public String getItem(String a) {
        return super.getItem(a);
    }
}

class AndroidState extends PersonalProfileEditScreen{
    @Override
    public String getItem(String a) {
        return super.getItem(a);
    }
}
