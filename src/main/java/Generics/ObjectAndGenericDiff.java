package Generics;

import java.util.List;

public class ObjectAndGenericDiff {
    public static void main(String[] args) {
        Account a1 = new Account(5.97, 150, List.of(1));
        Account a2 = new Account(44, 800, List.of(2));

        System.out.println(a1.getId());
        System.out.println(a2.getId());


    }
}






class Account <T extends Number>{

    T id;
    private int sum;
    private List<?> dt;

    public Account(T id, int sum, List<?> dt) {
        this.id = id;
        this.sum = sum;
        this.dt = dt;
    }

    public Object getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
