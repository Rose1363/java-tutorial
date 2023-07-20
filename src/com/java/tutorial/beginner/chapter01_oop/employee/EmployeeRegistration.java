package com.java.tutorial.beginner.chapter01_oop.employee;

import com.java.tutorial.beginner.Registration;

import java.util.Scanner;

public class EmployeeRegistration implements Registration {
    private Employee employee;

    public void EmployeeRegistration() {

    }

    @Override
    public void registerInfo() {
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhan vien Full-time(1), nhan vien Part-time(2)! ");
        k = sc.nextInt();
        if (k == 1) {
            FullTimeEmployee employee = new FullTimeEmployee();
            sc.nextLine();
            System.out.println("Enter employee's name: ");
            employee.setName(sc.nextLine());
            System.out.println("Enter employee's position: ");
            employee.setPosition(sc.nextLine());
            System.out.println("Enter employee's hourly rate: ");
            employee.setHourlyRate(sc.nextLong());
            System.out.println("Enter employee's hours worked: ");
            employee.setHoursWorked(sc.nextInt());
            System.out.println("Enter employee's monthly salary: ");
            employee.setMonthlySalary(sc.nextInt());
            this.employee = employee;
        } else {
            PartTimeEmployee employee = new PartTimeEmployee();
            sc.nextLine();
            System.out.println("Enter employee's name: ");
            employee.setName(sc.nextLine());
            System.out.println("Enter employee's position: ");
            employee.setPosition(sc.nextLine());
            System.out.println("Enter employee's hourly rate: ");
            employee.setHourlyRate(sc.nextLong());
            System.out.println("Enter employee's hours worked: ");
            employee.setHoursWorked(sc.nextInt());
            System.out.println("Enter employee's hourly wage: ");
            employee.setHourlyWage(sc.nextLong());
            this.employee = employee;
        }
    }

    public Employee getEmployee() {
        return employee;
    }
}
