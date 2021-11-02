package com.company;

public class Book extends Stock
{
    private String author;
    private String title;

    public Book(double price, String articuleNumber, String author, String title) {
        super(price, articuleNumber);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
