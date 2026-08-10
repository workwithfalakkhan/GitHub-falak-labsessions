package com.practice.scalerlabsession;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private List<Book>  bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem() {
        this.bookInventory = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book){
        bookInventory.add(book);

    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

}
