

import java.sql.SQLOutput;

public class BitOperations {
    public static void main(String[] args) {
      /*  System.out.println("45 -> 2 = " + Integer.toBinaryString(45));//00101101
        System.out.println("17 -> 2 = " + Integer.toBinaryString(17));//00010001
        System.out.println("45 & 17 = " + (45 & 17));                    //00000001
        System.out.println("45 | 17 = " + (45 | 17));                    //00111101*/

      //00101101 << 2 -> 10110100
      //00101101 >> 2 -> 00001011

//        System.out.println(45 << 2);// 45 * 2(2) = 180
//        System.out.println(45 >> 2);// 45 / 2(2) = 11

//        System.out.println((int) Math.pow(2, 7));
//        System.out.println(1 << 7);//1 * 2(7), 10000000

        int b = 15;

        byte c = 15;//0000 1111
        int a = 15;//00000000 00000000 00000000 0000 1111

        byte d = (byte)(c + 1);//byte + int

        short s = (short)(d + 2);//down cast

        int r = d;//upper cast

        float f = (float)12.4;


        if (15 > 10 | 15 > 10) {//false && true, 0 & 1 -> 0
            System.out.println();
        }

    }
}

/*
* 45(10) -> 0010 1101(2)
*
* 45 / 2 = 22, ost - 1
* 22 / 2 = 11, ost - 0
* 11 / 2 = 5, ost - 1
* 5 / 2 = 2, ost - 1
* 2 / 2 = 1, ost - 0
*
* 76543210
* 00101101(2) -> (10)
*
* 0 * 2(7) + 0 * 2(6) + 1 * 2(5) + 0 * 2(4) + 1 * 2(3) + 1 * 2(2) + 0 * 2(1) + 1 * 2(0) = 32 + 8 + 4 + 1 = 45
*
* 271 / 2 = 135 ost = 1
* 135 / 2 = 67 ost = 1
* 67 / 2 = 33 ost = 1
* 33 / 2 = 16 ost = 1
* 16 / 2 = 8 ost = 0
* 8/2 = 4 ost =0
* 4/2 = 2 ost = 0
* 2/2 = 1 ost = 0
* 0000 0001 0000 1111
* */