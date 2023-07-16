package com.java.tutorial.beginner.chapter01_oop.student;

public class Student {
    private String name;
    private String id;
    private float gpa;

    public Student() {
        this("", "", 0);
    }

    public Student(String id, String name, float gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return id + " - " + name + " - " + gpa;
    }
}
