package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATMTest {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Petr", lock);
        new Employee("Vasiliy", lock);
        new Employee("Marina", lock);
        Thread.sleep(5000);
        new Employee("Viktor", lock);
        new Employee("Masha", lock);

    }
}

class Employee extends Thread {
    String name;
    private Lock lock;


    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                //System.out.println(name + " is waiting");
                //lock.lock();
                System.out.println(name + " is using AMT");

                Thread.sleep(3000);
                System.out.println(name + " finish working with ATM");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " would not wait for ATM");
        }
    }
}
