package RegularExpression;


public class KWARG {
    public static void main(String[] args) {
        kw("ff", "erge", "g3g34g");
    }


    public static void kw(String...kwargs) {
        for (String kwarg : kwargs) {
            System.out.println(kwarg);
        }
    }
}
