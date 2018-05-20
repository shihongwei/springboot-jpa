package com.springboot.jpa.springbootjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shihongwei
 * @Created: 21:40 2018/5/20
 * @Modified
 * @Description:
 */
@RestController
public class HealthController {

    @GetMapping("/ok")
    public String ok(){
        return "ok";
    }
}
