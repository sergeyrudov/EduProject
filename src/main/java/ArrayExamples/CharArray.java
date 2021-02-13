package ArrayExamples;

public class CharArray {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array1 = {'w', 'o', 'r', 'l', 'd'};
        char[] array2 = {'j', 'a', 'v', 'a', '8'};

        /*String s1 = new String(arr1);
        System.out.println(s1);*/

        StringBuilder sb = new StringBuilder("Hello world");
        sb.append(array, 2, 3);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append(array1, 0,2);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java version is: ");
        sb2.insert(16, array2,4,1);
        System.out.println(sb2);
    }
}
