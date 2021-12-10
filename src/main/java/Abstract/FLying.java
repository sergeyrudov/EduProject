package Abstract;

import com.google.common.collect.ImmutableList;

import java.util.*;

public class FLying implements Flyable{
    public static void main(String[] args) {
        // static interface method
        Flyable.fly();

        // default method
        FLying fLying = new FLying();
        fLying.getFly();
        Map<Integer, LinkedList<Integer>> listMap = new HashMap<>(Map.of(1, new LinkedList<>(List.of(3,4,5))));

        Map<Integer, ArrayList<Integer>> mapList = new HashMap<Integer, ArrayList<Integer>>();

        mapList.put(3, new ArrayList<>(List.of(6,7)));


    }

    @Override
    public void getFly() {
        System.out.println(getId());
    }

    private UUID getId() {
        return UUID.randomUUID();
    }
}
