package Args;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {0,6,1,4};
        for (int a: array) {
            System.out.print(" "+ a);
        }
        System.out.println();
        String[] array1 = {"hi", "privet", "lol"};

        for (String a: array1) {
            System.out.print(" "+ a);
        }
        System.out.println();

        int summ = 0;
        for (int a:array) {
            summ+=a;
        }
        System.out.println(summ);

    }
}
