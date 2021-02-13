package Multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);

        Consumer consumer = new Consumer(market);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}


class Market {
    private int breadCounter = 0;

    public synchronized void getBread() {
        while (breadCounter < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCounter--;
        System.out.println("Consumer buy 1 bread");
        System.out.println("Quantity of bread is: " + breadCounter);
        notify();
    }


    public synchronized void putBread() {
        while (breadCounter >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCounter++;
        System.out.println("Factory added 1 bread");
        System.out.println("Bread quantity is: " + breadCounter);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    Producer (Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    Consumer (Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}