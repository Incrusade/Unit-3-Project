package com.library.services;
import com.library.core.Book;
import com.library.core.Member;

public class Main {
    public static void main(String[] args) {
        Book.addBook("My Title", "My Author");
        Member.addMember("Matt");
    }
}