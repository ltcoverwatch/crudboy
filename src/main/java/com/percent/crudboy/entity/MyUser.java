package com.percent.crudboy.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "myuser")
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column
    private String userName;

    @Column
    private String password;

}
