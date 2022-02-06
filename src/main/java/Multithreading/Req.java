package Multithreading;


import lombok.Getter;
import lombok.SneakyThrows;

import java.time.Clock;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Req {


    public static void main(String[] args) throws InterruptedException {
      //  WaitForRequest printer = new WaitForRequest("Hello", 8);
      //  Thread thread = new Thread(printer);
      //  thread.start();

        WaitForRequest o = new WaitForRequest("3", 8);
        Thread thread = new Thread(o);
        thread.start();
        //Thread.sleep(1000);
        thread.join();
        System.out.println(o.getResponse());


       // WaitForRequest s1 = new WaitForRequest("5", 5);
      //  System.out.println(s1.getMessage());

        //WaitForRequest s2 = WaitForRequest.builder().time(4).request(4).build();



    }

}

// main   ---- object.res // sleep +
// object -----------





@Getter
class WaitForRequest implements Runnable {
    private String request; // GET
    private long time; // 5
    volatile String response;

    public WaitForRequest(String request, long time) {
        this.request = request;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(time));
                response = "33";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


      public String getMessage() {
        Thread thread = new Thread(new WaitForRequest(request, time));
        thread.start();
        //setResponse();
        return response;
    }



}

