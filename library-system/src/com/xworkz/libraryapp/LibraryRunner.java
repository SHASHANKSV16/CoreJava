package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Publications;
import com.xworkz.libraryapp.library.Library;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of books to be add :");
        int size = scanner.nextInt();

        Library library = new Library(size);
        System.out.println("the no of books available are :"+library.books.length);
        for (int index=0;index<size;index++){
            Book book = new Book();

            System.out.println("Enter book id :");
            book.setBookId(scanner.nextInt());

            System.out.println("Enter bookName :");
            book.setBookName(scanner.next());

            System.out.println("Enter book price");
            book.setBookPrice(scanner.nextDouble());

            System.out.println("enter publication name  from : PENGUIN, OXFORD, HARPERCOLLINS, MACMILLAN, RANDOM_HOUSE");
            book.setPublication(Publications.valueOf(scanner.next().toUpperCase()));

            System.out.println("Author name :");
            book.setAuthorName(scanner.next());

            System.out.println("no of pages");
            book.setNoOfPages(scanner.nextInt());

            library.addBook(book);
        }

        library.getAllBooksInfo();


        System.out.println("want to get Book Name by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            System.out.println("Book Name: " + library.getBookNameByBookId(scanner.nextInt()));
        }
        System.out.println("want to get Book ID by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book Name");
            System.out.println("Book ID: " + library.getBookIdByBookName(scanner.next()));
        }
        System.out.println("want to get Author Name by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            System.out.println("Author Name: " + library.getAuthorNameByBookId(scanner.nextInt()));
        }
        System.out.println("want to get Author Name by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book Name");
            System.out.println("Author Name: " + library.getAuthorNameByBookName(scanner.next()));
        }
        System.out.println("want to get No. of Pages by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            System.out.println("No. of Pages: " + library.getNoOfPagesByBookId(scanner.nextInt()));
        }
        System.out.println("want to get No. of Pages by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book Name");
            System.out.println("No. of Pages: " + library.getNoOfPagesByBookName(scanner.next()));
        }
        System.out.println("want to get Publication by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            System.out.println("Publication: " + library.getPublicationNameByBookId(scanner.nextInt()));
        }
        System.out.println("want to get Publication by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book Name");
            System.out.println("Publication: " + library.getPublicationByBookName(scanner.next()));
        }
        System.out.println("want to get Book Price by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            System.out.println("Book Price: " + library.getBookPriceByBookId(scanner.nextInt()));
        }
        System.out.println("want to get Book Price by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book Name");
            System.out.println("Book Price: " + library.getBookPriceByBookName(scanner.next()));
        }


        System.out.println("want to update Book Name by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            int bookId = scanner.nextInt();
            System.out.println("enter new Book Name");
            String newBookName = scanner.next();
            if(library.updateBookNameByBookId(bookId, newBookName))
                System.out.println("Book Name updated successfully");
            else
                System.out.println("Book Name not updated");
        }
        System.out.println("want to update Author Name by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            int bookId = scanner.nextInt();
            System.out.println("enter new Author Name");
            String newAuthorName = scanner.next();
            if(library.updateAuthorNameByBookId(bookId, newAuthorName))
                System.out.println("Author Name updated successfully");
            else
                System.out.println("Author Name not updated");
        }
        System.out.println("want to update No. of Pages by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            int bookId = scanner.nextInt();
            System.out.println("enter new No. of Pages");
            int newNoOfPages = scanner.nextInt();
            if(library.updateNoOfPagesByBookId(bookId, newNoOfPages))
                System.out.println("No. of Pages updated successfully");
            else
                System.out.println("No. of Pages not updated");
        }
        System.out.println("want to update Publication by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            int bookId = scanner.nextInt();
            System.out.println("enter new Publication from PENGUIN, OXFORD, HARPERCOLLINS, MACMILLAN, RANDOM_HOUSE");
            Publications publication = Publications.valueOf(scanner.next().toUpperCase());
            if(library.updatePublicationByBookId(bookId, publication))
                System.out.println("Publication updated successfully");
            else
                System.out.println("Publication not updated");
        }
        System.out.println("want to update Book Price by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Book ID");
            int bookId = scanner.nextInt();
            System.out.println("enter new Book Price");
            double newBookPrice = scanner.nextDouble();
            if(library.updateBookPriceByBookId(bookId, newBookPrice))
                System.out.println("Book Price updated successfully");
            else
                System.out.println("Book Price not updated");
        }



    }
}
