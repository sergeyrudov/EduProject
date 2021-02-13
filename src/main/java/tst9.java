import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tst9 {
    public static void main(String[] args) {
        String s = "IT academy";
        String s1 = new String("xyz");
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,null);
        System.out.println(map);


        List<String> list = Arrays.asList("1", "2", "3", "4");
        System.out.println(list.get(list.size() -4));
    }
}

