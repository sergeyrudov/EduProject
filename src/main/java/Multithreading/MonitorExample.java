package Multithreading;

public class MonitorExample {
    public static void main(String[] args) {
        MyRunnable4 runnable = new MyRunnable4();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);



        t1.start();
        t2.start();
        t3.start();

    }
}

class Counter4 {
    volatile static int count = 0;
}

class MyRunnable4 implements Runnable {

    public void doWork2() {
        System.out.println("Hooray!");
    }

    private void doWork() {
        doWork2();
        synchronized (this) {
            Counter4.count++;
            System.out.println(Counter4.count + " ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork();
        }
    }
}
