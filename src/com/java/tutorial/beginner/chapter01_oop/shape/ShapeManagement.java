package com.java.tutorial.beginner.chapter01_oop.shape;

public class ShapeManagement {
    private int n;
    private Shape shapeArr[];

    public ShapeManagement() {
        n = 0;
        shapeArr = new Shape[5];
    }

    public void addShape(Shape shape) {
        shapeArr[n] = shape;
        n++;
    }

    public void displayShapeInformation() {
        double area, perimeter;
        for (Shape s : shapeArr) {
            if (s == null) break;
            area = s.calculateArea();
            perimeter = s.calculatePerimeter();
            System.out.println("A " + s.name + " with area " + area + " and perimeter " + perimeter);
        }
    }
}
