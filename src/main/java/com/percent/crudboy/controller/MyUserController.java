package com.percent.crudboy.controller;

import com.percent.crudboy.dao.MyUserDao;
import com.percent.crudboy.entity.MyUser;
import com.percent.crudboy.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/user")
@RestController
public class MyUserController {

    @Autowired
    MyUserService myUserService;

    @GetMapping("/list")
    public List<MyUser> findAll(){
        return myUserService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<MyUser> findById(@PathVariable("id") Integer id){
        return myUserService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        myUserService.deleteById(id);
    }

    @PostMapping("/add")
    public MyUser add(MyUser newUser){
        return myUserService.save(newUser);
    }

    @PutMapping("/update")
    public MyUser update(MyUser updateUser){
        return myUserService.update(updateUser);
    }

}
