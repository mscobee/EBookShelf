package com.company;

import java.io.File;

public class BookShelf {
    private File bookFile; // a file pointing towards a book currently being used.
    private Book currentBook;

    // addBook method is responsible for adding the book that pathToBook points to into the bookshelf database.
    public void addBook(String pathToBook) {

    }

    // removeBook method is responsible for removing bookName from bookshelf database.
    // will throw BookNotFoundException if bookName does not exist inside database.
    public void removeBook(String bookName) throws BookNotFoundException{

    }
    public void setBook(String bookTitle, String author, String publisher) {
        currentBook = new Book(bookTitle, author, publisher, bookFile.getAbsolutePath());
    }
    public void setBookFile(File f ) {
      bookFile = f;
    }
}
