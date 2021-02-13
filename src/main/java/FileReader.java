/*
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {
    public static void writeToFile(File file, List<User> users) {
        logger.info("Writing data to file " + file.getName());
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(file, false))) {
            users.forEach(user -> {
                try {
                    bf.write(user.getUsername() + ":" + user.getPassword());
                    bf.newLine();
                } catch (IOException e) {
                    logger.error(e.getMessage());
                }
            });
            bf.flush();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        logger.info("Data was wrote successfully.");
    }
}

*/
