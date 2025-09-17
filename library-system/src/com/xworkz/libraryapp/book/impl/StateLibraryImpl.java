package com.xworkz.libraryapp.book.impl;

import com.xworkz.libraryapp.book.Book;

public class StateLibraryImpl implements Book {
    @Override
    public void borrowBook() {
        System.out.println("book borrowed");
    }

    @Override
    public void returnBook() {
        System.out.println("book returned");
    }

    @Override
    public void searchBook() {
        System.out.println("book searched");
    }
}
