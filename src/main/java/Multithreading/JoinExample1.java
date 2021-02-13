package Multithreading;

public class JoinExample1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Method main begins!");
        Thread thread = new Thread(new Worker());

        System.out.println("Thread status is: " + thread.getState());
        Thread.State a = thread.getState();
        if(a== Thread.State.NEW) {
            System.out.println("Thread is new");
        }

        thread.start();

        System.out.println("Thread status is: " + thread.getState());

        thread.join();

        System.out.println("Thread status is: " + thread.getState());


        System.out.println("Method main ends");


    }
}


class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}
