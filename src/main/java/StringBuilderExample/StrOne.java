package StringBuilderExample;

public class StrOne {
    public static void main(String[] args) {
        name();
    }

    static void name() {
        String var = "Hello";
        String var2 = "Hi";
        StringBuilder sb1 = new StringBuilder(var+var2);

        System.out.println(sb1);
    }
}
