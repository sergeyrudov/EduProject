

import java.util.Random;

public class TryOneDimArray {
    public static void main(String[] args) {
        int[] massive = new int[10];// 1 2 3 4 3 6

        int r = 3;

        Random random = new Random();

        massive[0] = random.nextInt(20);//0 - 19
        massive[1] = random.nextInt(20);//0 - 19

        int[][] array = new int[4][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

            }
        }

        /*
        * iter 0(outer loop); i == 0
        * iter 0(inner loop); i == 0; j == 0
        * iter 1(inner loop); i == 0; j == 1
        *
        * */

        for (int i = 0; i < massive.length; i++) {//0 - 9
            massive[i] = random.nextInt(20);//0 - 19
            System.out.println(massive[i]);
        }

        /*
        * iter 0: i == 0; massive[0] = 12
        * iter 1: i == 1; massive[1] = 18
        *
        * */

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == r) {
                System.out.println("Index = " + i);
                break;
            }
            System.out.println("Hello " + i);
        }
    }
}

/*
* {4, 5, 9,     8} -> [0][0], [0][1], [0][2]
* {6, 2, 1,     8} -> [1][0], [1][1], [1][2]
* {59, 15, 7,   8}
* {12, 54, 19, 18}
*
* */