package Generics;

import java.util.ArrayList;
import java.util.List;

public class Class5 {
    public static void main(String[] args) {
        //error
        /*List<Number> list = new ArrayList<Integer>();
        List<Object> list1 = new ArrayList<Integer>();*/
        List<? extends String> list1 = new ArrayList<String>();
        //list1.add("Hello");

        List<? extends Number> al = new ArrayList<Integer>();

        List<Double> list = new ArrayList<>();
        list.add(3.14);
        list.add(4.15);
        list.add(6.17);
        showListInfo(list);

        List<String> list2 = new ArrayList<>();
        list2.add("OK");
        list2.add("PRIVET");
        list2.add("POKA");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(77.14);
        ald.add(88.15);
        ald.add(99.17);
        System.out.println(summ(ald));

        ArrayList<Integer> ald1 = new ArrayList<>();
        ald1.add(3);
        ald1.add(30);
        ald1.add(300);
        System.out.println(summ(ald1));

        ArrayList<String> als = new ArrayList<>();
        als.add("3345");
        als.add("3033");
        als.add("303450");
        // error
        //System.out.println(summ(als));

        List<? super Number> supNumber = new ArrayList<Object>();






    }

    public static double summ(ArrayList <? extends Number> al) {
        double summ = 0;
        for (Number n: al) {
            summ+=n.doubleValue();
        }
        return summ;
    }

    static void showListInfo(List<?> list){
        System.out.println("Text: " + list);
    }


}
