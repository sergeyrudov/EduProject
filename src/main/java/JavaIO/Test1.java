package JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
    public static void main(String[] args) throws Exception{

        File f = new File("src/main/resources/test9.txt");


        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("Bil poymann - " + e);

        } finally {
            System.out.println("finally block");
        }






    }
}
