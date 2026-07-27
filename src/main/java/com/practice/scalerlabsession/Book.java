package com.practice.scalerlabsession;

import com.practice.scalerlabsession.interfaces.Lendable;

public class Book implements Lendable {
    @Override
    public boolean lend(User user) {
        return false;
    }

    @Override
    public void returnBook(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
