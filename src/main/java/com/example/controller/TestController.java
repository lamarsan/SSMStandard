package com.example.controller;

import com.example.commons.Config;
import com.example.entity.UserEntity;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String test() {
        return "example";
    }
    @ResponseBody
    @RequestMapping("/a")
    public String index() {
        String temp = Config.CONSTTEST;
        return temp;
    }

    @ResponseBody
    @RequestMapping("/b")
    public String a() {
        userService.update(new UserEntity(2L,"aaa","asfdsadf","asfdsadf","2018-01-12 12:12:12"));
        return userService.listUserAll().toString();
    }
}
