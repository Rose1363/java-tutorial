package com.java.tutorial.beginner.chapter01_oop.library;

import com.java.tutorial.beginner.Registration;

import java.util.Scanner;

public class BookRegistration implements Registration {
    private Book book;
    private final Scanner sc;

    public BookRegistration(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void registerInfo() {
        Book book = new Book();
        System.out.println("Enter title: ");
        book.setTitle(sc.nextLine());
        System.out.println("Enter name's author: ");
        book.setAuthor(sc.nextLine());
        System.out.println("Enter year of publication: ");
        book.setPublishingYear(sc.nextInt());
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
