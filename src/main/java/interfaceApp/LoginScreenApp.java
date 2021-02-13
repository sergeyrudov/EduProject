package interfaceApp;

public class LoginScreenApp implements Header, Footer{

    public static void main(String[] args) {
        LoginScreenApp loginScreenApp = new LoginScreenApp();
        System.out.println(loginScreenApp.isDisplayedFooter(2));
        loginScreenApp.name();
        System.out.println(loginScreenApp.headerTitle("k"));
    }
    @Override
    public boolean isDisplayedFooter(int input) {
        return input > 1;
    }

    @Override
    public void name() {
        headerTitle("Main screen");
    }

    @Override
    public String headerTitle(String value) {
        return value;
    }

    @Override
    public int quantityOfRow(int value) {
        return 0;
    }

    @Override
    public int screenSize() {
        return 0;
    }
}
