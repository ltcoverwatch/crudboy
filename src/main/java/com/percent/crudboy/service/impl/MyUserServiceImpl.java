package com.percent.crudboy.service.impl;

import com.percent.crudboy.dao.MyUserDao;
import com.percent.crudboy.entity.MyUser;
import com.percent.crudboy.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    MyUserDao myUserDao;

    @Override
    public MyUser findUserById(Long id) {
        return myUserDao.findById(id).orElse(null);
    }

    @Override
    public MyUser updateUser(MyUser myUser) {
        return myUserDao.save(myUser);
    }

    @Override
    public void deleteUser(Long id) {
        myUserDao.deleteById(id);
    }

    @Override
    public List<MyUser> findAllUser(){
        return myUserDao.findAll();
    }

    @Override
    public MyUser insertUser(MyUser newUser){
        return myUserDao.save(newUser);
    }
}
