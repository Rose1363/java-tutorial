package com.java.tutorial.beginner.chapter01_oop.student;


import com.java.tutorial.beginner.Runner;

import java.util.Scanner;

public class StudentRunner implements Runner {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        StudentRegistration registration = new StudentRegistration(sc);
        System.out.println("Nhap so luong SV");
        int studentQuantity = sc.nextInt();
        for (int i = 0; i < studentQuantity; i++) {
            registration.registerInfo();
            studentManagement.addStudent(registration.getStudent());
        }
        studentManagement.print();
        sc.nextLine();
        System.out.println("id cua sv can tim");
        Student student = studentManagement.find(sc.nextLine());
        System.out.println("Sv can tim: " + student);

        float avgGpa = studentManagement.avgGpa();
        System.out.println("Diem trung binh cua tat ca SV: " + avgGpa);
        //sc.close();
    }
}
