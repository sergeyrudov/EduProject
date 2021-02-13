package FileReaderExamples;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigRDR {
    public static void main(String[] args) {
        final String login;
        final String pass;

        try (InputStream inputStream = new FileInputStream(
                "src/main/java/FileReaderExamples/config.properties")) {

            Properties properties = new Properties();

            properties.load(inputStream);

            login = properties.getProperty("login");

            pass = properties.getProperty("password");

            System.out.print("DONE! " + login + " " + pass);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
