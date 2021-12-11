import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {

        ArrayList<Integer> original = new ArrayList<>(List.of(1,2,3,4,5));


        ArrayList<Integer> copy = new ArrayList<>();
        for(int i=original.size()-1; i>=0; i--){
            copy.add(original.get(i));

        }

        System.out.println(copy);
    }
}
