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
    public Optional<MyUser> findById(Integer id) {
        return myUserDao.findById(id);
    }

    @Override
    public MyUser update(MyUser myUser) {
        return myUserDao.saveAndFlush(myUser);
    }

    @Override
    public void deleteById(Integer id) {
        myUserDao.deleteById(id);
    }

    @Override
    public List<MyUser> findAll(){
        return myUserDao.findAll();
    }

    @Override
    public MyUser save(MyUser newUser){
        //myUserDao.save(newUser);
        return myUserDao.save(newUser);
    }
}
