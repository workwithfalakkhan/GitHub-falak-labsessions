package com.practice.scalerlabsession;

public class Member extends User{

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    @Override
    void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Borrowed Books: " + getBorrowedBooksCount());

    }

    @Override
    boolean canBorrowBooks() {

        if(borrowedBooksCount < MAX_BORROW_LIMIT){
            return true;
        }
        return false;
    }
}
