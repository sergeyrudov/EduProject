package com;

public class LearnTernaryOperator {
    public static void main(String[] args) {
        int a = 15;

        if (a < 10) {
            System.out.println("a < 10");
        } else if(a > 10) {
            System.out.println("a > 10");
        } else {
            System.out.println("a == 10");
        }

        //condition ? statement if condition is true  : statement if condition is false;

        int r = a < 10 ? 15 : 8;
        int t = a < 10 ? (a < 5 ? 56 : 12) : 8;

        System.out.println(t);
    }
}
