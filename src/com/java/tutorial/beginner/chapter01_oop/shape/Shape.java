package com.java.tutorial.beginner.chapter01_oop.shape;

public abstract class Shape {
    protected String name;

    public Shape() {
        this.name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
