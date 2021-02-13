package Equals;

public class ValueOf {
    public static void main(String[] args) {
        String s1 = "3.44";
        String s2 = "22";
        Byte b1 = new Byte((byte)3);
        Byte b2 = (byte)4;

        Double d3 = Double.valueOf(s1);
        Integer i3 = Integer.valueOf(s2);
        Integer i4 = Integer.valueOf(b1 + b2);
        Byte b3 = Byte.valueOf((byte)4);



        System.out.println(i3);
        System.out.println(d3);
        System.out.println(i4);
        System.out.println(b3);
    }
}
