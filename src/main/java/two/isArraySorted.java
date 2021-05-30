package two;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class isArraySorted {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<Integer>(List.of(1,2,3,4));
        System.out.println(isSortedAscending(integers));
        //System.out.println(LocalTime.now().getSecond());

        long finishTime = LocalTime.now().getSecond() + Duration.ofSeconds(10).getSeconds();
        System.out.println(finishTime);
        System.out.println(time());
        ArrayList <String>list = new ArrayList <String> ();


    }

    public static boolean time() {
        long finishTime = LocalTime.now().getSecond() + Duration.ofSeconds(10).getSeconds();
        while (LocalTime.now().getSecond() < finishTime) {
            return true;
        }
        return false;
    }






    public static boolean isSortedAscending(List<Integer> list) {
        if(list == null) {
            //Depends on what you have to return for null condition
            return false;
        }
        else if(list.size() == 0) {
            return true;
        }
        //If we find any element which is greater then its next element we return false.
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                return false;
            }
        }
        //If array is finished processing then return true as all elements passed the test.
        return true;
}
}
