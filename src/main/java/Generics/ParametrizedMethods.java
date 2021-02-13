package Generics;

import java.util.ArrayList;

public class ParametrizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(2);
        al1.add(345);
        al1.add(4556);

        int a = GenMethods1.getSecondElement(al1);

        ArrayList <String> st2 = new ArrayList<>();
        st2.add("Hello1");
        st2.add("Privet1");
        st2.add("Kak Dela1");
        String b = GenMethods.getSecondElement(st2);
        System.out.println(b);
    }
}


class GenMethods1{
    //                T is return type
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
