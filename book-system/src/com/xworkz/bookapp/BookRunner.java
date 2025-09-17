package com.xworkz.bookapp;

import com.xworkz.bookapp.books.Reading;
import com.xworkz.bookapp.books.impl.BookImpl;

public class BookRunner {
    public static void main(String[] args) {
        Reading myBook = new BookImpl();
        myBook.Book();
        myBook.openPage();
        myBook.closeBook();
    }
}
