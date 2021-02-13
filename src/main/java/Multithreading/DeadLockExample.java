package Multithreading;

public class DeadLockExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}


class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread try to catch monitor lock1");
        synchronized (DeadLockExample.lock1) {
            System.out.println("Thread10 monitor catched");

            synchronized (DeadLockExample.lock2) {
                System.out.println("Thread try to catch monitor lock2");
                System.out.println("Thread10 monitor catched");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread try to catch monitor lock2");
        synchronized (DeadLockExample.lock2) {
            System.out.println("Thread20 monitor catched");

            synchronized (DeadLockExample.lock1) {
                System.out.println("Thread try to catch monitor lock1");
                System.out.println("Thread20 monitor catched");
            }
        }
    }
}