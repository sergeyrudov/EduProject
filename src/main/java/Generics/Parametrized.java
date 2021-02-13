package Generics;

public class Parametrized {
    public static void main(String[] args) {
        Inform<String> info1 = new Inform<>("privet");
        Inform<StringBuilder> info2 = new Inform<>(new StringBuilder("OK"));
        Inform<Character> info3 = new Inform<>('B');
        Inform<Integer> info4 = new Inform<>(44);

        String s = info1.getValue();
        Integer s1 = info4.getValue();

        System.out.println("values are " + s + s1);


        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info3);
        System.out.println(info4);

        Inform<Bus> inform4 = new Inform<>(new Bus());
        System.out.println(inform4);
        Bus b1 = inform4.getValue();
    }
}




class Inform <T>{
    // <T> type placeholder
    private T value;

    public Inform(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

class Bus{}
