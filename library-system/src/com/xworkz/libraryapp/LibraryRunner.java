package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.book.impl.StateLibraryImpl;

public class LibraryRunner {
    public static void main(String[] args) {
        Book state = new StateLibraryImpl();
        state.borrowBook();
        state.searchBook();
        state.returnBook();
    }
}
