package com.java.tutorial.beginner.chapter01_oop.employee;

import com.java.tutorial.beginner.Runner;

import java.util.Scanner;

public class EmployeeRunner implements Runner {

    @Override
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
        System.out.println("Danh sach nhan vien: ");
        employeeManagement.displayEmployeeInformation();
        sc.nextLine();
        System.out.print("Nhap ten hoac chuc vu cua nv: ");
        System.out.println("Nhan vien can tim la: " + employeeManagement.find(sc.nextLine()));
        System.out.println("Tong luong cua tat ca nhan vien la: " + employeeManagement.calculateTotalSalary());

        //sc.close();
    }
}
