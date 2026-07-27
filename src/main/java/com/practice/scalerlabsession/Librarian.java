package com.practice.scalerlabsession;

public class Librarian extends User{



    @Override
    void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());

    }

    @Override
    boolean canBorrowBooks() {
        return true;
    }

   /* void addNewBook(Book book)
    void removeBook(Book book)*/

}
