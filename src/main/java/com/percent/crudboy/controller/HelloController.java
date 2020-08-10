package com.percent.crudboy.controller;

import com.percent.crudboy.entity.MyUser;
import com.percent.crudboy.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sayhello")
    public String sayHello(){
        return "hello";
    }

    @RequestMapping("/hellouser/{id}")
    public MyUser sayHelloUser(@PathVariable Integer id){
        MyUser user = new MyUser();
        if(id == 1){
            user.setUserId(1);
            user.setUserName("xiaoming");
            user.setPassword("123456");
        }else {
            user.setUserId(2);
            user.setUserName("ming");
            user.setPassword("123");
        }
        return user;
    }

    @Autowired
    MyUserService myUserService;

    @RequestMapping("/list")
    public List<MyUser> findAll(){
        return myUserService.findAll();
    }
}
