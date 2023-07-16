package com.java.tutorial.beginner;

import com.java.tutorial.beginner.chapter01_oop.employee.EmployeeRunner;
import com.java.tutorial.beginner.chapter01_oop.library.BookRunner;
import com.java.tutorial.beginner.chapter01_oop.student.StudentRunner;

public class Main {
    public static void main(String[] args) {
        Runner[] runners = new Runner[3];
        runners[0] = new StudentRunner();
        runners[1] = new BookRunner();
        runners[2] = new EmployeeRunner();

        for (Runner runner : runners) {
            runner.run();
        }
    }
}
