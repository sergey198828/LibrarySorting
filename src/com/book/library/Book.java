package com.book.library;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Comparable<Book> {
    private String name = "";
    private String author = "";
    private Calendar datePublished;

   //Constructors
    public Book(){
    }
    public Book(String name, String author, int day, int month, int year) {
        this.name = name;
        this.author = author;
        datePublished = Calendar.getInstance();
        datePublished.set(year, month, day);
    }

    //Comparator
    @Override
    public int compareTo(Book book) {
        //Less
        if (this.datePublished.before(book.datePublished)) {
            return -1;
        }
        //Greater
        if (this.datePublished.after(book.datePublished)) {
            return 1;
        }
        //Equals
            return 0;
    }

    //ToSTring
    @Override
    public String toString() {
        String DATE_FORMAT = "dd-MM-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", datePublished=" + dateFormat.format(datePublished.getTime()) +
                '}';
    }
}
