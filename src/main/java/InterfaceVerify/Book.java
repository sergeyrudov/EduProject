package InterfaceVerify;

public class Book implements Printable {
    public static void main(String[] args) {
        Book book = new Book(2);
            book.showDate();
            book.dateRelease();
        System.out.println(book.isReleased());
    }

    public int id;

    public Book(int id) {
        this.id = id;
    }

    public void dateRelease() {
        System.out.println("OK");
    }

    @Override
    public void showDate() {
        System.out.println("showDate");
    }

    @Override
    public boolean isReleased() {
        return false;
    }

    @Override
    public int quantityOfPages() {
        return 0;
    }
}
