package com.hp.service;

import com.hp.entity.User;

import java.util.ArrayList;

public interface ServiceUser {
    public  int add(User user);
    public ArrayList<User> select();

}
