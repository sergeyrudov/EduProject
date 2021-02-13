package Multithreading;

public class SynchronizedExample1 {
    volatile static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter);


    }

    public static synchronized void increment() {
        counter++;
    }
}


class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizedExample1.increment();
        }
    }
}
