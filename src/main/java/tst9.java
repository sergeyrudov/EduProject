

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.Serializable;
import java.util.*;

public class tst9 {
    public static void main(String[] args) {
        String s = "IT academy";
        String s1 = new String("xyz");
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,null);
      //  System.out.println(map);
        XmlMapper m = new XmlMapper();



        List<String> list = Arrays.asList("1", "2", "3", "4");
        //System.out.println(list.get(list.size() -4));

        // List<String> lst = new ArrayList<>("one", "two");
        List<String> lst = new ArrayList<>(2);

        lst.add("123");
        lst.add("456");
        lst.add("4443");
        lst.add("5755655");
       // System.out.println(Arrays.asList(lst));

        int[] numbers = new int[5];
        Arrays.fill(numbers, 100);

        int[] ints = new int[2];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        System.out.println(Arrays.toString(ints));




    }
}

