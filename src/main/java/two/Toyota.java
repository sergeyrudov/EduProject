package two;

public class Toyota extends Car{
    @Override
    public void color() {
        System.out.println("black");
    }

    @Override
    public int power() {
        return 220;
    }

    public void name() {
        System.out.println("sedan");
    }

}
