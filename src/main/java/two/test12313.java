package two;

import java.awt.*;
import java.util.Arrays;

public class test12313 {
    public static void main(String[] args) {
        int[] myArray = new int[]{3,4,3,1};

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}

class A {
    protected int v = 1;
}

class B extends A {
    protected int v = 2;
    {
        System.out.println(v);
    }

    public static void main(String[] args) {
        new B();
    }
}




class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Runnnn");
    }

    public static void main(String[] args) throws  InterruptedException{
        Runnable r = new MyThread();
        Thread myThread = new Thread(r);
        myThread.start();
    }
}




abstract class Graphic {
    abstract void draw();
}

abstract class Circle extends Graphic {
    @Override
    void draw() {
        System.out.println("Circle");
    }
}
class Runner {
    public static void main(String[] args) {
       // Graphic mng = new Circle();
        //mng.draw();

    }
}

class Main123 {
    public static void main(String[] args) throws Exception{
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.run();
        System.out.println(Thread.currentThread().getName());
    }
}


class Main {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("1");
        System.out.println(i1+i2);
    }
}

class  Test123 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Bon");
        sb1.insert(2, 'r');
        System.out.println(sb1);

        Integer i = 5000;
        System.out.println(i.hashCode());
    }
}

class AB {
    void job() {
        System.out.println("A");
    }
}
class  BB extends AB {
    @Override
    void job() {
        System.out.println("B");
    }
}


class T {
    public void job() {
        System.out.println("T");
    }
}

class V extends  T {
    List list = new List();
}