package FileReaderExamples;

import java.io.*;

public class BufferedWriterAndReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("test2.txt"));

             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("test3.txt"));
        ) {
            /*int character;
            while ((character = reader.read())!=-1) {
                writer.write(character);
            }*/

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
                //writer.write("\n");
            }
            System.out.println("DONE!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
