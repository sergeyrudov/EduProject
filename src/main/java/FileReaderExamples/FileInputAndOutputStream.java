package FileReaderExamples;

import java.io.*;

public class FileInputAndOutputStream {
    public static void main(String[] args) {

        try (FileInputStream inputStream =
                     new FileInputStream(("dog.jpg"));

             FileOutputStream outputStream =
                     new FileOutputStream(("dog1.jpg"));
        ) {

            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("DONE!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

