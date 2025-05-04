import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SupplierExample {
    @Test
    @ParameterizedTest(name = "get worker test")
    @MethodSource("getWorker")
    void testWorker(Computer computer1){
        System.out.println("WAIT");
        System.out.println(computer1);
    }



    public Stream<Arguments> getWorker() {
        Computer computer1 = new Computer("Intel", "GeForce", 1203);
        //Computer computer2 = new Computer("AMD", "Radeon", 2344);
         return Stream.of(Arguments.of(computer1));


    }
}

class Computer {
    String cpu;
    String video;
    Integer hddSpace;

    public Computer(String cpu, String video, Integer hddSpace) {
        this.cpu = cpu;
        this.video = video;
        this.hddSpace = hddSpace;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", video='" + video + '\'' +
                ", hddSpace=" + hddSpace +
                '}';
    }
}



