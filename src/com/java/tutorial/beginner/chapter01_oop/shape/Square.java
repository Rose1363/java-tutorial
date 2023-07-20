package com.java.tutorial.beginner.chapter01_oop.shape;

public class Square extends Shape {
    private float side;

    public Square() {
        side = 0;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + side + ", ";
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return side * 4;
    }
}
