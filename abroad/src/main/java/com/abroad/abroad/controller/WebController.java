package com.abroad.abroad.controller;


import com.abroad.abroad.bean.User;
import com.abroad.abroad.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/User")
public class WebController {
    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String addUser(User user){
//        System.out.println(user);
        User user1 = userService.addUser(user);
        return "ok";
    }

}