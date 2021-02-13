package Abstract;

import InterfaceVerify.Info;
import InterfaceVerify.Printable;

public class Abstr extends VerifyAbstr implements Printable, Info {
    public static void main(String[] args) {
        Abstr abstr = new Abstr();
        abstr.summ(4);
        abstr.print();
        abstr.realizedMethod();
    }


    @Override
    public void print() {
        System.out.println("HELLO");
    }

    @Override
    public void summ(int a) {
        System.out.println("Summ: "+ a);
    }

    @Override
    public void realizedMethod() {
        super.realizedMethod();
    }

    @Override
    public void showDate() {

    }

    @Override
    public boolean isReleased() {
        return false;
    }

    @Override
    public int quantityOfPages() {
        return 0;
    }

    @Override
    public String year() {
        return null;
    }
}
