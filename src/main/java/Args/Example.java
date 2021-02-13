package Args;

public class Example {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {2, 1, 4, 0}, {1, 2, 3, 4, 5, 6, 7, 8, 9, -100}};
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println(" ");
        for (int[] array2: array) {
            for (int a: array2) {
                System.out.print(a + " ");
            }
        }
    }
}
