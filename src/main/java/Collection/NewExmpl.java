package Collection;

import java.util.ArrayList;

public class NewExmpl {
    public static void main(String[] args) {
        Book book1 = new Book("redBook","Test1", 2020 );
        Book book2 = new Book("violetBook", "Test2", 2019);
        Book book3 = new Book("Yellow Book", "Test3", 1990);


        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);

        bookArrayList.remove(book1);


        for (Book s: bookArrayList
             ) {
            System.out.println(s);
        }
    }
}



class Book{
    public String name;
    public String author;
    public int yearOfRelease;

    Book(String name, String author, int yearOfRelease) {
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public String toString() {
        return name + " " + author + " " + yearOfRelease;
    }
}
