import java.util.*;

public class Test {
    public static void main(String[] args) {
        Book[] books = {new Book("Book 1", "Author 1", 1, 1, 2012), new Book("Book 2", "Author 2", 1, 1, 2011), new Book("Book 3", "Author 3", 1, 1, 2010)};
        Library library = new Library(books);
        System.out.println(library);
        library.bubleSort();
        System.out.println(library);
    }
}
