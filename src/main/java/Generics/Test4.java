package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        //X x = new Y();
        // Error in sybtype List<X> list1 = new ArrayList<Y>();
        //List<X> list1 = new ArrayList<X>();
        //List<Number> list = new ArrayList<Integer>();
        //list.add(18);
        //list.add(3.14);

    }
}

class X{

}

class Y extends X{

}


