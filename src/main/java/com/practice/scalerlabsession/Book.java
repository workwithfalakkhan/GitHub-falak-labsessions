package com.practice.scalerlabsession;

import com.practice.scalerlabsession.interfaces.Lendable;

public class Book implements Lendable {


    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;



    @Override
    public boolean lend(User user) {
        isAvailable = false;
        return true;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
