package Multithreading;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class MakeRequestAfterTime {


    static long waitForTime;


    public MakeRequestAfterTime() {
    }

    public static void main(String[] args) {

    }


    @Test
    public void makeCall() throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("HERE I AM");
                synchronized (this) {
                    waitForTime = 0;
                    for (long i = 999999; i < 5; i++) {
                        waitForTime = waitForTime + 1;
                        System.out.println(Thread.currentThread().getName() + ": " + waitForTime);
                    }
                }

            }
        };

        Thread thread1 = new Thread(runnable);
        //Thread thread2 = new Thread(runnable);



        thread1.start();
       // thread2.start();
       // thread2.wait(500, 500);
    }
}
