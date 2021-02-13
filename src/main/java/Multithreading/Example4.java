package Multithreading;

public class Example4 extends Thread{

    public static void main(String[] args) {
        Example4 t1 = new Example4();
        t1.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }

    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
