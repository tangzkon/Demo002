package com.example.demo002.controller;

import com.example.demo002.pojo.PersonEntity;
import com.example.demo002.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/say")
    public ArrayList say() {
        ArrayList<PersonEntity> list = helloService.GetHelloEntities();
        list.forEach(System.out::println);
        return helloService.GetHelloEntities();
    }

    @RequestMapping("/do")
    public String welcome() {
        return "Welcome to SpringBoot!";
    }
}
