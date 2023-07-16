package com.java.tutorial.beginner.chapter01_oop.library;


import com.java.tutorial.beginner.Runner;

import java.util.Scanner;

public class BookRunner implements Runner {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        BookRegistration registration = new BookRegistration(sc);
        System.out.println("Nhap so luong sach");
        int bookQuantity;
        bookQuantity = sc.nextInt();
        for (int i = 0; i < bookQuantity; i++) {
            registration.registerInfo();
            library.add(registration.getBook());
        }
        sc.nextLine();
        System.out.println("Sach can tim la" + library.findBook(sc.nextLine()));
        library.displayBook();
        sc.close();
    }
}
