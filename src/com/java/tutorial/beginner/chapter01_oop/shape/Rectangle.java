package com.java.tutorial.beginner.chapter01_oop.shape;

public class Rectangle extends Shape {
    private float length, width;

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}