package Multithreading;

public class VolatileExample extends Thread{
    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();
        Thread.sleep(3000);
        System.out.println("after 3 seconds it is time to wake up");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }


        volatile boolean b = true; // This var stored in main memory, and appeal to main memory, instead of cache.

        public void run() {
            long counter = 0;
            while (b) {
                counter++;
            }
            System.out.println("Loop is finished. Counter = " + counter);
        }




}
