package Multithreading;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

class Clock {

    public static void main(String[] args) throws InterruptedException {
        Tred t1 = new Tred(5);
        t1.getResult();


        TredTwo t2 = new TredTwo("SOMEVAL", 5);
        System.out.println(t2.getResponse());





    }






}

class Tred  {
    private long time;
    volatile String responseResult;

    public Tred(long time) {
        this.time = time;
    }


    void getResult() {

        Timer t = new Timer();
        t.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        responseResult = "TEST";
                        //// close the thread
                        t.cancel();
                    }
                },
                TimeUnit.SECONDS.toMillis(time)
        );
    }

    public String NN() {
        return responseResult;
    }
}

class TredTwo implements Runnable {
    private String request;
    private volatile String response;
    private long time;

    public TredTwo(String request, long time) {
        this.request = request;
        this.time = time;
    }

    public void run() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(time));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        response = "TEST";

    }

    public String getResponse() {
        return response;
    }
}