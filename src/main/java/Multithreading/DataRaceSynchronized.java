package Multithreading;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DataRaceSynchronized {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);



        t1.start();
        t2.start();
        t3.start();
        int stream = IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sum();

    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnable implements Runnable {
    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
