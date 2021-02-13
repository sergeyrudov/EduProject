package StringExample;

public class StrImmutable {

    String color;
    String engine;

    StrImmutable(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public StrImmutable abc (String cvet) {
        StrImmutable st10 = new StrImmutable(cvet, "V4");
        return st10;
    }

    public static void main(String[] args) {
        StrImmutable st1 = new StrImmutable("red", "V6");
        StrImmutable st2 = st1.abc("black");
        System.out.println(st1.color);
    }
}
