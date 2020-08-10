package com.percent.crudboy.service;

import com.percent.crudboy.dao.MyUserDao;
import com.percent.crudboy.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MyUserService {

    public List<MyUser> findAll();

    public Optional<MyUser> findById(Integer id);

    public MyUser save(MyUser newUser);

    public MyUser update(MyUser myUser);

    public void deleteById(Integer id);

}
