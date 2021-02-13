package Multithreading;

public class ThreadRun implements Runnable{

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRun());
        thread.run();
        System.out.println("Method main. Thread name is: " + Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println("Method run. Thread name is: " + Thread.currentThread().getName());
    }
}
