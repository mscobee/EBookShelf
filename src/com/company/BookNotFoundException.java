package com.company;
// Throws if given book is not found in database.
public class BookNotFoundException extends Exception{

    BookNotFoundException(String book) {
        super("Unable to locate book: " + book);
    }
}
