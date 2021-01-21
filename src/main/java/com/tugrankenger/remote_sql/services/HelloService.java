package com.tugrankenger.remote_sql.services;

import com.tugrankenger.remote_sql.models.Hello;
import com.tugrankenger.remote_sql.repositories.HelloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    @Autowired
    HelloRepository helloRepository;
    @GetMapping("/remote_sql")
    public Iterable<Hello> findAll(){
        return helloRepository.findAll();
    }

}
