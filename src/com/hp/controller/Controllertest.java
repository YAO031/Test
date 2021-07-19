package com.hp.controller;


import com.hp.entity.User;
import com.hp.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("/User")
public class Controllertest {

    @Autowired

    private ServiceUser serviceUser;

    @RequestMapping("add")
    public String add(User user, HttpSession session){

        System.out.println(user);

        int i=serviceUser.add(user);
        session.setAttribute("User",user);

        if (i >0) {
            System.out.println("成功");
            return "redirect:/select.jsp";
        }else{
            System.out.println("失败");
            return "redirect:/User/all";
        }




    }

    @RequestMapping("/all")
    public String all(HttpSession session){

        ArrayList<User> user=serviceUser.select();
        session.setAttribute("user",user);

        return "redirect:/user.jsp";
    }
}
