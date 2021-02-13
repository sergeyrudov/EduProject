package Equals;

import java.util.ArrayList;

public class BoxingUnboxing {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5); // autoboxing
        int a = list.get(0); // unboxing

        Integer b = new Integer(10);
        int c = (Integer) b;
        int c1 = (int) b;

        String s1 = "50";
        int b4 = Integer.parseInt(s1);


        System.out.println(1);
    }
}
