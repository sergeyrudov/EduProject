package PPTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class TC33 {
    public static void main(String[] args) {


        List<String> v = new ArrayList<>();
        System.out.println(rand());


    }

    public static int rand(){
        Random rand = new Random();
        var r = rand.nextInt(4);
        if (r==3){
            return rand();
        } else
            return (int) r;
    }

    public static List<String> st (List<String> v, String value) {
        if(value.equals("drggg")){
            v.add(value);
        }
        return v;
    }
}
