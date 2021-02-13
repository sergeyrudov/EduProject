package Scanner;

import java.util.Scanner;
import java.util.SortedMap;

public class ScannerExample {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        /*System.out.println("Input some value");
        int i = scanner.nextInt();
        System.out.println("Inputed value is: " + i);*/


       /* System.out.println("Input 2 values");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Result is: " + x/y);
        System.out.println("Ostatok is: " + x%y);*/


        /*System.out.println("Input few words: ");
        String s = scanner.nextLine();
        System.out.println("Vi napisali: " + s);*/


        /*System.out.println("Input two tring rows: ");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.print("Vi napisali: \n" + s1 + "\n" + s2);*/

        /*Scanner scanner = new Scanner("Privet moy drug!");
        String s = scanner.next();
        System.out.println(s);*/

        Scanner scanner = new Scanner("Privet moy drug!\nKak dela?\nKak pojivaesh?\nChto novogo?");
        /*String s = scanner.nextLine();
        System.out.println(s.length());
        System.out.println(s);
        System.out.println(scanner.nextLine() + scanner.length());
        System.out.println(scanner.nextLine().length());*/
        System.out.println(scanner.next().charAt(2));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }

}
