package com.java.tutorial.beginner.chapter01_oop.student;

import com.java.tutorial.beginner.Registration;

import java.util.Scanner;

public class StudentRegistration implements Registration {
    private Student student;

    public StudentRegistration() {
    }

    @Override
    public void registerInfo() {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's ID: ");
        student.setId(sc.nextLine());
        System.out.println("Enter name: ");
        student.setName(sc.nextLine());
        System.out.println("Enter student's gpa: ");
        student.setGPA(sc.nextFloat());
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
