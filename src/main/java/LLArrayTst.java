import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class LLArrayTst {
    public LLArrayTst() throws IOException {
    }

    public static void main(String[] args) throws IOException {


        final URL url = new URL("http://jsonplaceholder.typicode.com/posts?_limit=10");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setConnectTimeout(100);
        connection.setReadTimeout(100);

        StringBuilder s = new StringBuilder("hi");
        System.out.println(s);


        Animal animal = new Animal();
        animal.sound();

        Cat cat = new Cat();
        cat.sound();
        var hi = "sno";
        List<String> stringList = new ArrayList<>();

        ArrayList<String> stringArrayList = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        HashMap<Integer, String> hashMap = new HashMap<>();

        TreeSet<Integer> integers = new TreeSet<>();



        stringList.add("hello");
        stringList.add("Poka");

        stringArrayList.add("Kak dela");
        stringArrayList.add("Normalno");

        linkedList.add("yasno");
        linkedList.add("ponyatno");

        hashMap.put(1, "znachenie");
        hashMap.put(2, "aga nu da");

        integers.add(1);
        integers.add(10);
        integers.add(1000);

        String inputString = "java";
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println(reversedString);

        /*for (String v : stringList
        ) {
            System.out.println(v);
        }

        for (String s : stringArrayList
        ) {
            System.out.println(s);
        }

        for (String c : linkedList) {
            System.out.println(c);
        }
        System.out.println(hashMap.containsKey(1));

        for (Integer is: integers){
            System.out.println(is);
        }*/


        show(1,2);
        System.out.println(revers("Privet"));
    }


    // overload
    public static void show(int a){
        System.out.println(a);
    }

    public static void show(int a, int b){
        System.out.println(a+b);
    }

    public static void show(String a, int b, int c){
        System.out.println(a+b+c);
    }


    public static String revers(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            result = s.charAt(i) + result;
        }
        return result;
    }



}

// override
class Animal{
    public void sound(){
        System.out.println("sound");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }
}
