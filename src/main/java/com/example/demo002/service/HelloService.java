package com.example.demo002.service;

import com.example.demo002.dao.HelloDao;
import com.example.demo002.pojo.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HelloService {

    @Autowired(required = false)
    private HelloDao helloDao;

    public ArrayList<PersonEntity> GetHelloEntities() {
        return helloDao.GetHello();
    }
}
