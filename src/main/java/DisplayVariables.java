import java.util.ArrayList;

public class DisplayVariables {

    int a = 1;
    static int b = 2;

    void abc (int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(DisplayVariables.b);
    }

    ArrayList data() {
        ArrayList names = new ArrayList<>();
        names.add("John");
        names.add("John");
        names.add("Roman");
        names.add("Ivan");
        return names;
    }

    public static void main(String[] args) {
        DisplayVariables cls = new DisplayVariables();
        cls.abc(4);
        System.out.println(cls.data());
    }
}
