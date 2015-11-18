package com.sorter;
import com.book.library.Book;

public class BubleBookSorter implements BookSorter {

    @Override
    public Book[] sort(Book[] books) {
        for(int i=0;i<=books.length-1; i++)
            for(int j=0;j<=books.length-2; j++){
                Book tempBook;
                if(books[j].compareTo(books[j+1])==1){
                    tempBook = books[j];
                    books[j]=books[j+1];
                    books[j+1]=tempBook;
                }
            }
        return books;
    }
}
