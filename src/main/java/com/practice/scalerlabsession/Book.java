package com.practice.scalerlabsession;

import com.practice.scalerlabsession.interfaces.Lendable;

public class Book implements Lendable {


    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;

    }

    @Override
    public boolean lend(User user) {
        if(!isAvailable) {
            isAvailable = false;
        }
        isAvailable = false;
        return true;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;

    }

    @Override
    public boolean isAvailable() {

        return isAvailable;
    }
    public String getTitle() {
        return title;
    }
}
