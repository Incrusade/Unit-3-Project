package com.library.core;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private static ArrayList<Book> books = new ArrayList<Book>();

    public static void addBook(String title, String author) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        books.add(book);
        System.out.printf("Added book, now have %d books\n", books.size());
    }

    public void removeBook(String title) {
        System.out.println("Removed book");
    }
}
