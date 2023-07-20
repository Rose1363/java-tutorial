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
        sc.nextLine();
        System.out.println("Nhap tua sach: ");
        book.setTitle(sc.nextLine());
        System.out.println("Nhap ten tac gia: ");
        book.setAuthor(sc.nextLine());
        System.out.println("Nhap nam phat hanh sach: ");
        book.setPublishingYear(sc.nextInt());
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
