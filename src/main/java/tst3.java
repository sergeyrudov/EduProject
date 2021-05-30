import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class tst3 {
    public static void main(String[] args) {
        int i;
        int sum = 1;
        for (i = 1; i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);


        Map<String, String> f = new HashMap<String,String>();
        f.put("key", "value");
        f.put("key1", "value1");
        f.put("key1", "value2");
        System.out.println(f);

        Set<Integer> val = new TreeSet<>();
        val.add(1);
        val.add(2);
        System.out.println(val);

    }
}
