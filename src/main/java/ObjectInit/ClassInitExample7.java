package ObjectInit;

public class ClassInitExample7 {
    String s = "ok";

    {
        System.out.println(s);
    }

    static int i = 0;

    static {
        System.out.println(i);
    }

    {
        System.out.println(++i);
    }

    ClassInitExample7() {
        System.out.println("Eto constructor");
    }

    public static void main(String[] args) {
        System.out.println("Privet vsem");
        ClassInitExample7 c1 = new ClassInitExample7();
    }
}
    // очередность:
    // 1. статическая инициализация
    // 2. стейтменты в методе main
    // 3. стейтменты в классе
    // 4. блок инициализации
    // 5. конструктор



