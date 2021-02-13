package Multithreading;

public class ExampleSleepJoin {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(2000);
        }

        Thread t1 = new Thread(new MyRunnable1());
        Thread t2 = new MyRunnable2();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("End!");
    }
}


class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable2 extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
