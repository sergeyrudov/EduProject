package Reader;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonReader {

    public static void main(String[] args) throws IOException {
        String content = "src/main/java/Reader/profileInfo.json";

        FileReader name = new FileReader(content);


        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(name);

        // 1
        String username = root.at("/username").asText();
        System.out.println(username);
    }
}