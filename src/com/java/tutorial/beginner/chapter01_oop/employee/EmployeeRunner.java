package com.java.tutorial.beginner.chapter01_oop.employee;

import com.java.tutorial.beginner.Runner;

import java.util.Scanner;

public class EmployeeRunner implements Runner {
    public void run() {


        Scanner sc = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();
        EmployeeRegistration registration = new EmployeeRegistration();
        System.out.println("Nhap so luong nv");
        int employeeQuantity;
        employeeQuantity = sc.nextInt();
        for (int i = 0; i < employeeQuantity; i++) {
            registration.registerInfo();
            employeeManagement.add(registration.getEmployee());
        }
        employeeManagement.displayEmployeeInformation();

        System.out.println("NV can tim la : " + employeeManagement.find("tram"));
        System.out.println("Tong luong cua tat ca NV: " + employeeManagement.totalSalary());
    }
}
