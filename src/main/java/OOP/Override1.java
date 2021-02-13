package OOP;

public class Override1 {

    // 1. перегруженным может быть метод
    // 2. метод должен быть нестатичным, и не final
    // 3. метод должен наследоваться от родительского класса


    void message() {
        System.out.println("Hello");
    }

    static void hello1() {
        System.out.println("hidden method");
    }
}

class Notification extends Override1{

    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.message();
    }

    @Override
    void message() {
        System.out.println("Notification alert");
    }

    static void hello() {
        System.out.println("it is hidded method");
    }
}
