package com.java.tutorial.beginner.chapter01_oop.employee;


import java.util.ArrayList;

public class EmployeeManagement {
    private final ArrayList<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public Employee find(String keyword) {
        for (Employee employee : employees) {
            if (employee.getPosition().equals(keyword))
                return employee;
            if (employee.getName().equals(keyword))
                return employee;
        }
        return null;
    }

    public void displayEmployeeInformation() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public float totalSalary() {
        float total = 0;
        for (Employee employee : employees) {
            total += employee.calculateSalary();
        }
        return total;
    }
}
