package com.library.core;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void testAddAndRemove() {
        assertEquals(0, Book.bookCount());
        Book.addBook("Test Title", "Test Author", "Test ISBN");
        assertEquals(1, Book.bookCount());
        Book.removeBook("Test Title");
        assertEquals(0, Book.bookCount());
    }

    @Test
    public void testAddAndBadRemove() {
        assertEquals(0, Book.bookCount());
        Book.addBook("Test Title", "Test Author", "Test ISBN");
        assertEquals(1, Book.bookCount());
        Book.removeBook("Not Title");
        assertEquals(1, Book.bookCount());
        Book.removeBook("Test Title");
        assertEquals(0, Book.bookCount());
    }
 }