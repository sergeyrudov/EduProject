package Equals;


public class ParseTo {

    public static void main(String[] args) {
        String s1 = " 330 ";
        String s2 = "false";
        String s3 = "3.14F";
        String s4 = "5.15D";

        int v = Integer.parseInt(s1.trim());
        System.out.println(v);

        boolean b = Boolean.parseBoolean(s2);
        System.out.println(b);

        float f = Float.parseFloat(s3);
        System.out.println(f);

        double d = Double.parseDouble(s4);
        System.out.println(d);



    }
}
