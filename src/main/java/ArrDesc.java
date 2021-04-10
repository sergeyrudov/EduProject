
//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

import java.util.Random;

public class ArrDesc {
    public static void main(String[] args) {
        int[] arr = new int[50];

        Random random = new Random();

        for (int i = 0, j = 1; i < arr.length && j <= 99; i++, j += 2) {
//            arr[i] = random.nextInt(100) + 1;
            arr[i] = j;
 //           System.out.print(arr[i] + "\t");
        }

 //       System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
 //           System.out.print(arr[i] + "\t");
//            System.out.print("\n");
        }


    }
}

/*
 * 0 ... 98 -> right
 * 98 ... 0 -> reverse
 *
 * */

//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[15];

        Random random = new Random();

        int countEven = 0;
        int countNotEven=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);

            if (arr[i] % 2 == 0) {
                countEven++;
            }
            else{
                countNotEven++;
            }


            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nCount even = " + countEven);
        System.out.println("Count odd1 = " + countNotEven);
//        for (int i=0; i<arr)


    }
}
