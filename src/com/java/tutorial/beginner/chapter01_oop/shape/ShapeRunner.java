package com.java.tutorial.beginner.chapter01_oop.shape;

import com.java.tutorial.beginner.Runner;

import java.util.Scanner;

public class ShapeRunner implements Runner {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        ShapeManagement shapeManagement = new ShapeManagement();
        ShapeRegistration shapeRegistration = new ShapeRegistration();
        System.out.println("Ban muon tinh dien tich va chu vi cua may hinh? ");
        int shapeQuantity;
        shapeQuantity = sc.nextInt();
        for (int i = 0; i < shapeQuantity; i++) {
            shapeRegistration.registerInfo();
            shapeManagement.addShape(shapeRegistration.getShape());
        }
        shapeManagement.displayShapeInformation();
       // sc.close();
    }
}
