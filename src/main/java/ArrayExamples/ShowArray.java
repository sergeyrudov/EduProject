package ArrayExamples;

public class ShowArray {

    public static void show (String[][] array) {
        System.out.println("{  ");
        for (int i = 0; i< array.length; i++) {
            System.out.println("{");
            for (int j = 0; j < array[i].length; j++) {
                if(j != array[i].length -1) {
                    System.out.println(array[i][j] + ",  ");
                } else {
                    System.out.println(array[i][j]);
                }
            }
            if(i != array.length -1) {
                System.out.println("], ");
            } else {
                System.out.println("}");
            }
        }
        System.out.println("  }");
    }

    public static void main(String[] args) {
        String array[][] = {{"orange", "apple", "apricot"}, {"juice", "vanilla"}, {"strawberry", "potato"}};
        show(array);
    }
}
