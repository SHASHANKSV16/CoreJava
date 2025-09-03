package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book1=new Book(1,"Shadows of Eternity","Arjun Mehta",320,"BlueSky Press",399);
        Book book2=new Book(2,"The Crimson Quest","Nisha Rao",280,"Sunrise Publications",299);
        Book book3=new Book(3,"Whispers of the Ocean","Karan Patel",350,"SilverLeaf Books",450);
        Book book4=new Book(4,"Echoes of Tomorrow","Priya Nair",410,"Starline Publishers",520);
        Book book5=new Book(5,"The Lost Chronicle","Rahul Sharma",295,"Evergreen House",275);
        Book book6=new Book(6,"Mystic Realms","Sneha Kulkarni",370,"DreamWorks Publishing",480);
        Book book7=new Book(7,"The Iron Kingdom","Aman Joshi",440,"BrightStar Press",560);
        Book book8=new Book(8,"Winds of Destiny","Meera Iyer",315,"Lotus Publishers",330);
        Book book9=new Book(9,"Beneath the Horizon","Ravi Verma",385,"Golden Gate Books",510);
        Book book10=new Book(10,"Tales of Emberwood","Anjali Desai",425,"Moonlight Press",590);
        Book book11=new Book(11,"The Silent Watcher","Vikram Rao",300,"Riverstone Publications",310);
        Book book12=new Book(12,"Secrets of the Valley","Pooja Menon",345,"BrightMoon Books",460);
        Book book13=new Book(13,"Legends of Solaris","Siddharth Pillai",410,"Crystal House",540);
        Book book14=new Book(14,"The Forgotten Path","Rohini Sen",275,"OceanView Press",280);


        Library library =new Library();

        if(library.addBook(book1)&&library.addBook(book2)&&library.addBook(book3)&&
                library.addBook(book4)&&library.addBook(book5)&&library.addBook(book6)&&
                library.addBook(book7)&&library.addBook(book8)&&library.addBook(book9)&&
                library.addBook(book10)&&library.addBook(book11)&&library.addBook(book12)&&
                library.addBook(book13)&&library.addBook(book14)){
            library.getAllBooksInfo();
        }



    }
}
