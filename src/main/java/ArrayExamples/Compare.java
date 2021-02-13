package ArrayExamples;

import java.util.Arrays;

public class Compare {
    static class Car {
        String name;
        String engine;
        int horsePower;

        public Car(String name, String engine, int horsePower) {
            this.name = name;
            this.engine = engine;
            this.horsePower = horsePower;
        }
    }

    public static void maxMin (double [] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min: "+ min + " and max: "+ max);
    }


    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        double array5[] = {1.0,-3.14,8.9,5.1};
        maxMin(array5);
        maxMin(new double[]{2.2,-10,99.1});

        int array3[] = array2;
        Object array4[] = new Object[2];

        Car car1 = new Car("BMW", "V6", 330);
        array4[1] = car1;

       /* System.out.println(array1 == array2);
        System.out.println(array2 == array3);*/
       for(int i=1; i<array4.length; i++) {
           Object object = array4[i];
           System.out.println(object);
       }

        // можно ли записать объект в массив?

    }
}
