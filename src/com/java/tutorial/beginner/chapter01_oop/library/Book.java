package com.java.tutorial.beginner.chapter01_oop.library;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return year;
    }

    public String toString() {
        return (title + " - " + author + " - " + year);
    }
}