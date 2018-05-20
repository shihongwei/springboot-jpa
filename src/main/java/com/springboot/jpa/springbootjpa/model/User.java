package com.springboot.jpa.springbootjpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: shihongwei
 * @Created: 21:16 2018/5/20
 * @Modified
 * @Description:
 */
@Data
@Entity //this tells hibernate to make a table out of this class
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

}
