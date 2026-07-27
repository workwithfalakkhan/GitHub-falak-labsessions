package com.practice.scalerlabsession.interfaces;

import com.practice.scalerlabsession.User;

public interface Lendable {

    public boolean lend(User user);
    public void returnBook(User user);
    public boolean isAvailable();

}
