package com.java.tutorial.beginner.chapter01_oop.employee;

public class PartTimeEmployee extends Employee {
    private long hourlyWage;

    public PartTimeEmployee() {
        super();
        hourlyWage = 0;
    }

    public void setHourlyWage(long hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public long getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    public long calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}
