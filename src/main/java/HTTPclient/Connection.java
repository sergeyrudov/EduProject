package HTTPclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class Connection {
    public static void main(String[] args) throws IOException {
        Connection connection = new Connection();
        System.out.print(connection.request() + "\n");
        //connection.request();

        Map<Integer, String> params = new HashMap();
        params.put(1, "one");
        params.put(2, "two");
        params.put(3, "three");
        System.out.println(params.get(1));
    }

    String request() throws IOException {
        final URL url = new URL("http://jsonplaceholder.typicode.com/posts?_limit=10");
        final HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setConnectTimeout(10000);
        con.setReadTimeout(10000);

        try (final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            final StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } catch (final Exception ex) {
            ex.printStackTrace();
            return "";
        }
    }
}
