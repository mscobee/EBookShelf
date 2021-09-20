package com.company;

public class Book {
    private String bookTitle;
    private String author;
    private String publisher;
    private String absPath;

    public Book(String bookTitle, String author, String publisher, String path) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        absPath = path;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAbsPath() {
        return absPath;
    }
    @Override
    public String toString() {
        return "Title: " + bookTitle + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nPath: " + absPath;
    }
}
