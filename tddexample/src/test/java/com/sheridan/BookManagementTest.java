package com.sheridan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BookManagementTest {
    
    @Test
    void testAddBook(){
        BookManager manager = new BookManager();
        Book book = new Book("Coding in Java", "Jerome Morrow", "1088");

        assertTrue(manager.addBook(book));
    }

    @Test
    void testRetrieveBook(){
        BookManager manager = new BookManager();
        Book bookToAdd = new Book("The Lord of the Flies", "Unknown", "1007");
        manager.addBook(bookToAdd);
        Book retrieved = manager.getBook(bookToAdd.getIsbn());
        assertNotNull(retrieved);
        assertEquals(bookToAdd.getTitle(), retrieved.getTitle());
    }
    @Test
    void testUpdateBookDetails(){
        Book book = new Book("Tale of Two Cities", "Charles Dickens", "1033");
        BookManager manager = new BookManager();
        manager.addBook(book);
        book.setAuthor("George Orwell");
        assertTrue(manager.updateBook(book));
        assertEquals("George Orwell", manager.getBook(book.getIsbn()).getAuthor());

    }

}
