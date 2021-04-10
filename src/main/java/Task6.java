
import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(90) + 10;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {//5 6 7 8
            if (arr[i] < arr[i + 1]) {
                System.out.println("Array is возрастающий");
            } else if (arr[i] > arr[i + 1]) {
                System.out.println("последовательность уменьшения");
            } else {
                System.out.println("значение одинаково");
            }

        }
    }
}
