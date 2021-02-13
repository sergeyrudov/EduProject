package Multithreading;

public class ThreadInterruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");

        InterruptedThread t1 = new InterruptedThread();
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();

        t1.join();
        System.out.println("Main ends");
    }
}


class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            if(isInterrupted()) {
                System.out.println("Thread want to be interrupt");
                return;
            }
                sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread want to interrupt during sleep, lets stop it");
                e.printStackTrace();
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println("Sum is: " + sqrtSum);
    }
}
