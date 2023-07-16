package com.java.tutorial.beginner.chapter01_oop.student;

import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student find(String id) {
        for (Student student : students) {
            if (student.getID().equals(id))
                return student;
        }
        return null;
    }

    public void print() {
        for (Student t : students) {
            System.out.println(t);
        }
    }

    public float avgGpa() {
        if (students.size() == 0)
            return 0;
        float sum = 0;
        for (Student student : students) {
            sum += student.getGPA();
        }
        return sum / students.size();
    }
}