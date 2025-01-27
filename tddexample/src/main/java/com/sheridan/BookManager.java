package com.sheridan;

import java.util.HashMap;
import java.util.Map;

public class BookManager {
    private Map<String, Book> books = new HashMap<>();

    public boolean addBook(Book book){
        if (book == null)
            return false;
        else{
            books.put(book.getIsbn(), book);
            return true;
        }
    }

    public Book getBook (String isbn){
        return books.get(isbn);
    }

    public boolean updateBook(Book book){
        if (books.containsKey(book.getIsbn())){
            books.put(book.getIsbn(), book);
            return true;
        }
        else
            return false;

    }

}
