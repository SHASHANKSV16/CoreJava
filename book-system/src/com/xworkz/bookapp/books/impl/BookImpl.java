package com.xworkz.bookapp.books.impl;

import com.xworkz.bookapp.books.Reading;

public class BookImpl implements Reading {
    @Override
    public void Book() {
        System.out.println("Book is selected");
    }

    @Override
    public void openPage() {
        System.out.println("Page opened");
    }

    @Override
    public void closeBook() {
        System.out.println("Book closed");
    }
}
