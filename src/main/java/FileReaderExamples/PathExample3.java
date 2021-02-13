package FileReaderExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathExample3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test10.txt");

        Files.createFile(path);

        String dialog = "-privet\n-privet\n-kak dela\n-norm\n";

        Files.write(path, dialog.getBytes());

        List<String> list = Files.readAllLines(path);

        for (String s:list
             ) {
            System.out.println(s);
        }
    }
}
