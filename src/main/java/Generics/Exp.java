package Generics;

import java.util.HashMap;

public class Exp {
    public static void main(String[] args) {
        Data<Integer, String> t1 = new Data<>(777, "Hello");
        System.out.println(t1);
        System.out.println(t1.getI() + " " + t1.getT());
        HashMap<Integer, String> mp1 = new HashMap<>();
        mp1.put(1, "Test");
        mp1.put(2, "OK");
        mp1.put(3, "privet");

        System.out.println(mp1.get(2));
    }

    // type erasure
    //abc (Inform1 info) is looks like for JVM
    /*public void abc(Inform1<String> inform1){
        String s = inform1.getValue();
    }*/

    public void abc(Inform1<Integer> inform1){
        Integer i = inform1.getValue();
    }
}


class Data <I, T> {
    private I data1;
    private T data2;

    public Data(I data1, T data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public String toString() {
        return "data 1 is: " + data1 + " and data 2 is: " + data2;
    }

    public I getI() {
        return data1;
    }

    public T getT() {
        return data2;
    }
}

class Inform1 <T>{
    // <T> type placeholder
    private T value;

    public Inform1(T value){
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

class Parent1{
    public void abc(Inform1<String> inform1){
        String s = inform1.getValue();
    }
}

class Child1 extends Parent1{
    // type erasure
    /*public void abc(Inform1<Integer> inform1) {
        Integer i = inform1.getValue();
    }*/
}