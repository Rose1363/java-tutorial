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
        for (int i = 0; i < employees.size(); i++) {
            System.out.println((i+1) + ". " + employees.get(i));
        }
    }

    public long calculateTotalSalary() {
        long total = 0;
        for (Employee employee : employees) {
            total += employee.calculateSalary();
        }
        return total;
    }
}
