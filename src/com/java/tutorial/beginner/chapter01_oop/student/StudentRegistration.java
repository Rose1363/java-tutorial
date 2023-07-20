package com.java.tutorial.beginner.chapter01_oop.student;

import com.java.tutorial.beginner.Registration;

import java.util.Scanner;

public class StudentRegistration implements Registration {
    private Student student;
    private final Scanner sc;

    public StudentRegistration(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void registerInfo() {
        Student student = new Student();
        sc.nextLine();
        System.out.println("Nhap ID sinh vien: ");
        student.setId(sc.nextLine());
        System.out.println("Nhap ten sinh vien: ");
        student.setName(sc.nextLine());
        System.out.println("Nhap diem trung binh: ");
        student.setGPA(sc.nextFloat());
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
