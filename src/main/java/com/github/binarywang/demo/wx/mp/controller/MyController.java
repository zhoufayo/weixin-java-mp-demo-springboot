package com.github.binarywang.demo.wx.mp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {

    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
