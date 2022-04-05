package Singletone;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public final class DataBaseSingleTone {
    private static DataBaseSingleTone instance;
    public String value;

    private DataBaseSingleTone(String value) {
        this.value = value;
    }

    public static DataBaseSingleTone getInstance(String value) {
        if (instance == null) {
            instance = new DataBaseSingleTone(value);
        }
        return instance;
    }
}

class Demo {
    public static void main(String[] args) {
        DataBaseSingleTone singleton = DataBaseSingleTone.getInstance("FOO");
        DataBaseSingleTone anotherSingleton = DataBaseSingleTone.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);


    }
}
