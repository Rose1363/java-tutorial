package com.java.tutorial.beginner.chapter01_oop.library;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public Book findBook(String info) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(info))
                return book;
            if (book.getTitle().equals(info))
                return book;
        }
        return null;
    }

    public void displayBook() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

