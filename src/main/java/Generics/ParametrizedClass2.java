package Generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet", 20);
       // System.out.println(pair1);
       // System.out.println("First Value is: " + pair1.getFirstValue() + " Second value is: " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(145, 3.14);
       // System.out.println("First Value is: " + pair2.getFirstValue() + " Second value is: " + pair2.getSecondValue());


        OtherPair<String> otherPair = new OtherPair<>("ok", "poka");
        System.out.println("First value is: " + otherPair.getFirstValue() + " Second value is: " + otherPair.getSecondValue());




    }
}




class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;


    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
