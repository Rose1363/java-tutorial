package com.java.tutorial.beginner.chapter01_oop.shape;

import com.java.tutorial.beginner.Registration;

import java.util.Scanner;

public class ShapeRegistration implements Registration {
    private Shape shape;
   // private final Scanner sc;

    public ShapeRegistration(){
        //this.sc = sc;
    }
    @Override
    public void registerInfo() {
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.println("Vuong(1), Chu nhat(2), Tron(3)!");
        k = sc.nextInt();
        if(k == 1){
            Square shape = new Square();
            System.out.println("Mhap chieu dai canh hinh vuong: ");
            shape.setSide(sc.nextFloat());
            this.shape = shape;
        } else if (k == 2) {
            Rectangle shape = new Rectangle();
            System.out.println("Mhap chieu dai canh hinh chu nhat: ");
            shape.setLength(sc.nextFloat());
            System.out.println("Mhap chieu rong canh hinh chu nhat: ");
            shape.setWidth(sc.nextFloat());
            this.shape = shape;
        }else {
            Circle shape = new Circle();
            System.out.println("Mhap chieu dai ban kinh cua hinh tron: ");
            shape.setRadius(sc.nextFloat());
            this.shape = shape;
        }
    }

    public Shape getShape() {
        return shape;
    }
}
