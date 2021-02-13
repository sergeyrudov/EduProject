package ObjectInit;

public class ClassInitExample8 {
    static {
        abc(2);
    }
    static void abc(int a) {
        System.out.println(a + " ");
    }
    ClassInitExample8() {
        abc(5);
    }
    static {
        abc(4);
    }

    {
        abc(6);
    }
    static {
        new ClassInitExample8();
    }
    {
        abc(8);
    }

    public static void main(String[] args) {
        ClassInitExample8 c1 = new ClassInitExample8();
    }
}

// очередность:
// 1. статические блоки и переменные родительского класса
// 2. статические блоки и переменные дочернего класса
// 3. нестатические блоки и переменные родительского класса
// 4. конструктор родительского класса
// 5. нестатические блоки и переменные дочернего класса
// 6. конструктор дочернего класса
// !!! инициализация пунктов 3-6 происходит только и при каждом создании объекта

