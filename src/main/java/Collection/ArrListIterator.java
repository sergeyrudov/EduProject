package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("kak dela");
        arrayList.add("poka");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(arrayList);
    }
}
