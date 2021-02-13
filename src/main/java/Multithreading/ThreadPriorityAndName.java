package Multithreading;

public class ThreadPriorityAndName {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        MyThread5 t2 = new MyThread5();

        t1.setName("my thread");
        t1.setPriority(9);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Name of thread: " + t1.getName() + " and priority is: " + t1.getPriority());
        System.out.println("Name of thread: " + t2.getName() + " and priority is: " + t2.getPriority());


    }
}


class MyThread5 extends Thread {
    public void run() {
        System.out.println("Hello!");
    }
}
