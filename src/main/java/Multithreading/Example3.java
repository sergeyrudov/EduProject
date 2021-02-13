package Multithreading;

public class Example3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());

        thread1.start();
        thread2.start();


    }


    static class MyThread3 implements Runnable {
        public void run() {
            for (int i = 1; i <= 1000; i++) {
                System.out.println(i);
            }
        }
    }

    static class MyThread4 implements Runnable {
        public void run() {
            for (int i = 1000; i > 0; i--) {
                System.out.println(i);
            }
        }
    }
}

