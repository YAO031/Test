package com.hp.service;


import com.hp.dao.Userdao;
import com.hp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class ServiceUserimpl implements ServiceUser {

    @Autowired
    private Userdao userdao;
    @Override
    public int  add(User user) {
        int i=userdao.add(user);

        return i;


    }

    @Override
    public ArrayList<User> select() {
        ArrayList<User> users=userdao.select();


        return  users;

    }
}
