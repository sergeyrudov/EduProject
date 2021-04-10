
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int resultArr2 = 0;
        int resultArr1 = 0;

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(5);
            arr2[i] = random.nextInt(5);
            resultArr1 += arr1[i];
            resultArr2 = resultArr2 + arr2[i];
        }
        if (resultArr1 > resultArr2) {
            System.out.println("Resul1 is larger than result 2");
        } else if (resultArr1 < resultArr2) {
            System.out.println("Result1 is smaller than result2");
        } else {
            System.out.println("result1 is equal to result2");
        }
    }
}
