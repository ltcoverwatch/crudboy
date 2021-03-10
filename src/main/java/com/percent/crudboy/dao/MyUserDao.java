package com.percent.crudboy.dao;

import com.percent.crudboy.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MyUserDao extends JpaRepository<MyUser, Long> {

}
