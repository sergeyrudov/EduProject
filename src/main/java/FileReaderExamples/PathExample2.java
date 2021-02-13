package FileReaderExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathExample2 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("test10.txt");
        Path directoryPath = Paths.get("/Users/intelpc/desktop/udemy/src/main/java/filereaderexamples");

        Path directoryPath1 = Paths.get("/Users/intelpc/desktop/udemy/src/main/java/lambda");



        Files.copy(filePath, directoryPath.resolve(filePath),
                StandardCopyOption.REPLACE_EXISTING);

        Files.copy(filePath, directoryPath.resolve("test16.txt"));

        Files.copy(directoryPath1, directoryPath.resolve("B"));

        Files.move(filePath, directoryPath.resolve("test1"));

        Files.move(Paths.get("test10.txt"), (Paths.get("test11.txt"))); // "rename" functional, if it's located at the same place

        Files.delete(Paths.get("test11.txt"));

        System.out.println("DONE!");
    }
}
