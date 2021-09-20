package com.company;

public class BookNotFoundException extends Exception{

    BookNotFoundException(String book) {
        super("Unable to locate book: " + book);
    }
}
