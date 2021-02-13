package RegularExpression;

public class ReplaceAllAndGroup {
    public static void main(String[] args) {
        String s1 = "Privet,        moy drug!    Kak urok         uvas prohodit      ?   ";

        System.out.println(s1);

        //s1 = s1.replaceAll("urok", "zanyatie");
        //System.out.println(s1);

        //s1 = s1.replaceAll(" {2,}", " ");

        //s1 = s1.replaceAll("\\bu\\w+", "4444");

        s1 = s1.replaceFirst("\\bu\\w+", "4444");

        System.out.println(s1);

    }
}
