package com.java.tutorial.beginner.chapter01_oop.employee;

public class FullTimeEmployee extends Employee {
    private long monthlySalary;

    public FullTimeEmployee() {
        super();
        monthlySalary = 0;
    }

    public void setMonthlySalary(long monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public long getMonthlySalary() {
        return monthlySalary;
    }

    public long calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
