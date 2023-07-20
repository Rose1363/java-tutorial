package com.java.tutorial.beginner.chapter01_oop.shape;

import java.util.ArrayList;

public class ShapeManagement {
    private ArrayList<Shape> shapes;

    public ShapeManagement() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void displayShapeInformation() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i + 1) + ". "
                    + shapes.get(i)
                    + "Area = " + shapes.get(i).calculateArea()
                    + ", "
                    + "Perimeter = " + shapes.get(i).calculatePerimeter() + "}");
        }
    }
}
