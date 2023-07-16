package com.java.tutorial.beginner.chapter01_oop.employee;

import com.java.tutorial.beginner.Registration;

import java.util.Scanner;

public class EmployeeRegistration implements Registration {
    private Employee employee;

    public void EmployeeRegistration() {
    }

    @Override
    public void registerInfo() {
        Scanner sc = new Scanner(System.in);
//        Employee employee = new Employee();
//        System.out.println("Enter employee's name: ");
//        employee.setName(sc.nextLine());
//        System.out.println("Enter employee's position: ");
//        employee.setPosition(sc.nextLine());
//        System.out.println("Enter employee's salary: ");
//        employee.setSalary(sc.nextInt());
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
