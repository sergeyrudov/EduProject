package ObjectInit;

public class Ext1 {
    public static void main(String[] args) {
        PersonalProfileEditTest p1 = new PersonalProfileEditTest();
    }
}


class PersonalProfileEditTest {

    String name;
    void print() {
        System.out.println(name);
    }
}

class Button extends PersonalProfileEditTest {
    void voice() {
        System.out.println("I am a man");
    }
}
