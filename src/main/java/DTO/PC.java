package DTO;

import java.io.Serializable;

public class PC implements Serializable{
    String cpu;
    String video;
}

class PCGet {
    public static void main(String[] args) {
        String cpuFamily = new PC().cpu = "K6";
        System.out.println(cpuFamily);



    }

    public PC getPC() {
        PC pc = new PC();
        pc.cpu = "k6";
        pc.video = "matrox";
        return pc;

    }
}
