/*
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    public static void main(String[] args) throws IOException{
        PropertyReader propertyReader = new PropertyReader();
        testUserLogin();
    }
    private static String testUserLogin;
    private static String testUserPass;

    private PropertyReader() {
    }

    public static String testUserLogin() {
        return testUserLogin;
    }

    public static String testUserPass() {
        return testUserPass;
    }

    static {
        try (InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties props = new Properties();
            props.load(inputStream);
            testUserLogin = props.getProperty("testuser.login");
            testUserPass = props.getProperty("testuser.password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
