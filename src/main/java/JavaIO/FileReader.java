package JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("src/main/resources/test9.txt");
            System.out.println("Object created");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream created");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("File is readed");
                if (counter == 3) {
                    fis.close();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exceprion 2");
        } finally {
            System.out.println("finally");
        }
    }
}
