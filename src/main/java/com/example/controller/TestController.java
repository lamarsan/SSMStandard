package com.example.controller;

import com.example.commons.Config;
import com.example.entity.UserEntity;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String test() {
        return "test";
    }

    @ResponseBody
    @RequestMapping("/a")
    public String index() {
        String temp = Config.CONSTTEST;
        System.out.println(temp);
        return temp;
    }

    @ResponseBody
    @RequestMapping("/b")
    public String a() {
        userService.update(new UserEntity(2L,"aaa","asfdsadf","asfdsadf","2018-01-12 12:12:12"));
        return userService.listUserAll().toString();
    }

    @ResponseBody
    @RequestMapping(value = "/zdjsb", method = RequestMethod.POST)
    public Map<String, Object> zdjsb(@RequestParam("imgs") List<MultipartFile> imgs, String username, String password) {
        Map<String, Object> result = new HashMap<>();
        result.put("username", username);
        result.put("password", password);
        System.out.println(result);
        System.out.println(imgs);
        for ( int i = 0; i < imgs.size();i++) {
            MultipartFile file = imgs.get(i);
            System.out.println(( file instanceof MultipartFile));
            result.put("img" + i, imgs.get(i).getOriginalFilename());
        }
        System.out.println(result);
        return result;
    }


    @ResponseBody
    @RequestMapping(value = "/zdjsb1", method = RequestMethod.POST)
    public Map<String, Object> zdjsbb(@RequestParam("img") MultipartFile img) {
        Map<String, Object> result = new HashMap<>();

        result.put("img", img.getOriginalFilename());
        System.out.println(img.getOriginalFilename());
        return result;
    }
}
