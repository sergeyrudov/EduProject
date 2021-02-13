package LocalVariablesInference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "Poka", "Kak dela", "Vse normalno");
        final String str = "hello";

        for (String s : list) {
            Predicate<String> p = z -> {
                System.out.println(str.length());
                return z.length() > 4;
            };
         //   System.out.println(p);
        }


      /*  for (String s : list) {
            System.out.println(s);
        }*/

      //  list.forEach(s -> System.out.println(s));

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(4);
        a1.add(2);
        a1.add(1);
        a1.add(7);
        a1.add(9);
        a1.add(11);
        a1.add(0);
/*       способ 1
        a1.removeIf(element -> element % 3 == 0);
*/
        // способ 2
/*  Predicate<Integer> p = element ->element %3 ==0;
        a1.removeIf(p);
*/
       // System.out.println(a1);
        // 1 способ
        //  a1.sort(Integer::compareTo);
        // 2 способ
        //a1.sort((x, y) -> x.compareTo(y));
        // сортировка в обратном порядке
      //  a1.sort((x, y) -> -x.compareTo(y));


      //  System.out.println(a1);
    }
}
