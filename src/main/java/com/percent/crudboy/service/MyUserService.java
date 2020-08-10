package com.percent.crudboy.service;

import com.percent.crudboy.dao.MyUserDao;
import com.percent.crudboy.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserService {
    @Autowired
    MyUserDao myUserDao;

    public List<MyUser> findAll(){
        return myUserDao.findAll();
    }
}
