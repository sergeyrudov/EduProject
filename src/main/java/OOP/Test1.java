package OOP;

public class Test1 {
    public static void main(String[] args) {
        int i = 2;
        String s = new String [] {"A","B", "C", "D"}[i];
        String[] s1 = new String [] {"A","B", "C", "D"};


        System.out.println(s);
        for (String i1 : s1) {
            System.out.print(i1);
        }
    }
}
