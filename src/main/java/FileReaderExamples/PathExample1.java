package FileReaderExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathExample1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
        Path directoryPath = Paths.get("/Users/intelpc/desktop/udemy/src/main/java/filereaderexamples/test_created_dir");

        /*System.out.println(filePath.getFileName());

        System.out.println(directoryPath.getParent());

        System.out.println(directoryPath.getRoot());

        System.out.println(filePath.getRoot());


        System.out.println(directoryPath.isAbsolute());

        System.out.println(filePath.isAbsolute());

        System.out.println(directoryPath.toAbsolutePath());

        System.out.println(filePath.toAbsolutePath());


        System.out.println(filePath.toAbsolutePath().getParent());
        System.out.println(directoryPath.toAbsolutePath().getParent());

        System.out.println(directoryPath.resolve(filePath)); // concat path

        Path anotherPAth = Paths.get("/Users/intelpc/desktop/udemy/src/main/java/Lambda");
        System.out.println(directoryPath.relativize(anotherPAth));

        if(!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if(!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));

        Path filePath2 = Paths.get("test10.txt");

        System.out.println(Files.isSameFile(filePath, filePath2));
        System.out.println(Files.size(filePath2));*/

        System.out.println(Files.getAttribute(filePath, "creationTime"));
        System.out.println(Files.getAttribute(filePath, "size"));

        Map<String, Object> attributes = Files.readAttributes(filePath, "*");

        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
