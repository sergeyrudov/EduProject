package ArrayListExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test20 {

    int abc2(int i) {
        if(i>10) {
            return 5;
        } else {
            return 10;
        }
    }

    void test22() {
        int a = 7;
        System.out.println(a > 2 ? a < 5 ? 3 : 6 :9);
    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add(0, "name");
        Test20 test20 = new Test20();
        System.out.println(test20.abc2(3));
        test20.test22();
       // System.out.println(list);
        double a = 0.1 + 0.1 + 0.1+ 0.1+ 0.1+ 0.1+ 0.1+ 0.1+ 0.1+ 0.1;
       // System.out.println(Math.round(a));

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");
       // System.out.println(states.get(1));


        Map<Integer, String> peoples = new HashMap<Integer, String>();
        peoples.put(1, "Adam");
        peoples.put(2, "vasiliy");
        peoples.put(3, "Egor");
      //  System.out.println(peoples.get(1));

        Map<String, String> user = new HashMap<>();
        user.put("1", "Petr");
        user.put("2", "vasiliy");
        user.put("3", "Egor");
      //  System.out.println(user.get("2"));

        Map<Integer, Float> count = new HashMap<>();
        count.put(1, 1.25f);
      //  System.out.println(count.get(1));

        int a1 = 5;
        int b1 = 8;
        int c1 = (a1<6)?a1++:b1++;

        //System.out.println(a1);
       // System.out.println(b1);
       // System.out.println(c1);
       // System.gc();
    }
}
