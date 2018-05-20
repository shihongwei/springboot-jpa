package com.springboot.jpa.springbootjpa.controller;

import com.springboot.jpa.springbootjpa.model.User;
import com.springboot.jpa.springbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

/**
 * @Author: shihongwei
 * @Created: 21:26 2018/5/20
 * @Modified
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add") //map only get requests
    public String addUser(@RequestParam String name,@RequestParam String email){

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);



        return "saved";
    }

    @GetMapping("/all")
    public Iterable<User> getAllUsers(){

        Iterable<User> all = userRepository.findAll();
        for (Iterator iterator = all.iterator(); iterator.hasNext(); ) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }
        return all;
    }


}
