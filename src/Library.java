import java.util.Arrays;

public class Library {

    Book[] books;
    //Constructor
    public Library(Book[] library){
        this.books=library;
    }
    //Sort
    public void bubleSort(){
    for(int i=0;i<=books.length-1; i++)
        for(int j=0;j<=books.length-2; j++){
            Book tempBook = new Book();
            if(books[j].compareTo(books[j+1])==1){
                tempBook = books[j];
                books[j]=books[j+1];
                books[j+1]=tempBook;
            }
        }
    }
    //toString
    @Override
    public String toString() {
        return "Library{" +
                "library=" + Arrays.toString(books) +
                '}';
    }
}
