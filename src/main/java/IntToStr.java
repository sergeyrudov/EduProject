import java.util.ArrayList;
import java.util.List;

public class IntToStr {
    public static void main(String[] args) {
        String[] arr = new String[]{"1","2", "3", "4", "5", "6"};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }


        for (Integer i: list
             ) {
            System.out.println("element with index: "+ list.indexOf(i) + " is: " + i);
        }
    }
}