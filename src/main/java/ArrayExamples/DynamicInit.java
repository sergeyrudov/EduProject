package ArrayExamples;

public class DynamicInit {
    public static void main(String[] args) {
        String[] array1;
        int[][] array2;
        int[] array3 = new int[5];
        int[] array4 = {2,3,4,6};
        System.out.println(array4[2]);
        int[] array5 = new int[]{4,6,7};
        System.out.println(array5[2]);

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = "Privet" + i;
            System.out.println(array1[i]);
        }

        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

       /* for (int i = 0; i < array2.length; i++) {
            for (int j=0; j< array2[i].length; j++) {
                array2[i][j] = i+j;
                System.out.println(array2[i][j]);
            }
        }*/

        Integer[] integers = new Integer[10];
        System.out.println(integers.length);

        for (int i = 0; i < integers.length; i ++) {
            integers[i] = i+1;
            System.out.println(integers[i]);
        }
    }
}
