package Generics;

public class Parametr1 {
    public static void main(String[] args) {
        OnlyNumbers<Integer> onlyNumbers = new OnlyNumbers<>(4);
        System.out.println(onlyNumbers.getValue());
        OnlyNumbers<Double> onlyNumbers1 = new OnlyNumbers<>(4.1);
        System.out.println(onlyNumbers1.getValue());
        Number a = 3.1;
        System.out.println(a);



    }

}

//class OnlyNumbers <T extends Number&i1&i2>{
class OnlyNumbers <T extends Number>{
    // <T> type placeholder
    private T value;

    public OnlyNumbers(T value){
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

interface i1{}
interface i2{}

