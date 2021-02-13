package Multithreading;

public class SynchronizeExample {
    volatile static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new R2());
        Thread t2 = new Thread(new R2());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter);


    }

    public static void increment() {
        synchronized (SynchronizeExample.class) {
            counter++;
        }
    }
}


class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizeExample.increment();
        }
    }
}
