package com.library.core;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String isbn;

    private static ArrayList<Book> books = new ArrayList<Book>();

    public static void addBook(String title, String author, String isbn) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.isbn = isbn;
        books.add(book);
        System.out.printf("Added book, now have %d books\n", books.size());
    }

    public static void listBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("Book %d: %s (%s) %s\n", i, book.title, book.author, book.isbn);
        }
    }

    public static void removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.title == title) {
                // Found book
                books.remove(i);
                System.out.println("Removed book");
                return;
            }
        }
        System.out.println("Cannot find book");
    }

    public static int bookCount() {
        return books.size();
    }
}
