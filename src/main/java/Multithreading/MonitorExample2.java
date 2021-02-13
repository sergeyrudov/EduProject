package Multithreading;

public class MonitorExample2 {
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableImplMobile());
        Thread t2 = new Thread(new RunnableImplSkype());
        Thread t3 = new Thread(new RunnableImplWhatsapp());

        t1.start();
        t2.start();
        t3.start();



    }
    void mobileCall() {
        System.out.println(this);

        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

     void skypeCall(){
        System.out.println(this);

        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

     void whatsappCall(){
        System.out.println(this);

        synchronized (lock) {
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsapp call ends");
        }
    }

}

class RunnableImplMobile implements Runnable {

    @Override
    public void run() {
        new MonitorExample2().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {

    @Override
    public void run() {
        new MonitorExample2().skypeCall();
    }
}

class RunnableImplWhatsapp implements Runnable {

    @Override
    public void run() {
        new MonitorExample2().whatsappCall();
    }
}