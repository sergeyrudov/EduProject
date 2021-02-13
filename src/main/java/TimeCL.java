public class TimeCL {

    public static void main(String[] args) {
        // time();
        //hello();
        //timeWhile();
        shortTime();

    }

    private static void time() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                INNER:
                for (int sec = 0; sec < 60; sec++) {

                    System.out.println(hour + ":" + minute + ":" + sec);
                }

            }
        }
    }


    private static void timeWhile() {

        int hour = 0;

        OUTER:
        do {
            int minute = 0;

            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour < 24);
    }

    private static void shortTime() {
        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }
    }


    private static void hello() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
