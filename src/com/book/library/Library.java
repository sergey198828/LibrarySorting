package com.book.library;

import java.util.Arrays;
import com.sorter.*;

public class Library {

    private Book[] books;
    private BookSorter sorter;
    //Constructor
    public Library(Book[] library){
        this.books=library;
    }
    //Sort setter
    public void setSorter(BookSorter sorter){
        this.sorter=sorter;
    }
    //Sort
    public void sort(){
    this.books = this.sorter.sort(this.books);
    }
    //toString
    @Override
    public String toString() {
        return "Library{" +
                "library=" + Arrays.toString(books) +
                '}';
    }
}
