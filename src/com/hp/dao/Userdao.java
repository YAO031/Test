package com.hp.dao;

import com.hp.entity.User;

import java.util.ArrayList;

public interface Userdao {

    public int add(User user);
    public ArrayList<User> select();

}
