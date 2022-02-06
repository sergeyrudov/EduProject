import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import netscape.javascript.JSObject;
import nonapi.io.github.classgraph.json.*;

public class GG {
    public static void main(String[] args) {
        //verify("heloo");
       // phone("1234567890");
        checkPalindrome("Hwllo world str");
       //final JSONObject wrapperJsonObj = new JSONObject(1);

        //JSONObject[""]
    }

    static boolean verify(String value) {
        try {
            Integer.parseInt(value);
            System.out.println("true");
            return true;
        } catch (Exception e) {
            System.out.println("false");
            return false;


        }
    }

    static boolean phone(String value) {
        if(value.length() ==  10) {
            System.out.println("true");
            return true;
        } else{
            System.out.println("false");
            return false;
        }
    }

    static void checkPalindrome(String value) {
        for (int i=0; i<=value.length();i--) {
            System.out.println(value.charAt(i));        }

    }

   // final JSONObject wrapperJsonObj = new JSONObject(1);
   // static void getData() {
       // final JSONObject wrapperJsonObj = new JSONObject(1);
    }

//}
