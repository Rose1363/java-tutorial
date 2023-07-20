package com.java.tutorial.beginner.chapter01_oop.shape;

public class Circle extends Shape {
    private float radius;

    public Circle() {
        super();
        radius = 0;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius + ", ";
    }

    public double calculateArea() {
        return radius * radius * 3.14;
    }

    public double calculatePerimeter() {
        return radius * 2 * 3.14;
    }
}