package FileReaderExamples;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
    public static void main(String[] args) throws IOException {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, \n" +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \n" +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris \n" +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in \n" +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla \n" +
                "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa \n" +
                "qui officia deserunt mollit anim id est laborum.\n";

        String s = "Privet";

        try (FileWriter writer = new FileWriter("test2.txt", true);
             FileReader reader = new FileReader("test2.txt")
        ) {
            writer.write(text);
            //writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
