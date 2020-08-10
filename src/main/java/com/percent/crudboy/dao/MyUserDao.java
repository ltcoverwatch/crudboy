package com.percent.crudboy.dao;

import com.percent.crudboy.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyUserDao extends JpaRepository<MyUser, Integer> {
    //List<MyUser> findAll();
}
