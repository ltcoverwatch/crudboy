package com.percent.crudboy.service;

import com.percent.crudboy.dao.MyUserDao;
import com.percent.crudboy.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MyUserService {

    List<MyUser> findAll();

    Optional<MyUser> findById(Long id);

    MyUser save(MyUser newUser);

    MyUser update(MyUser myUser);

    void deleteById(Long id);

}
