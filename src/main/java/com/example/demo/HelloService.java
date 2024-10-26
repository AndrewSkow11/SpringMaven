package com.example.demo;

import org.springframework.stereotype.Service;


@Service
public class HelloService implements HelloServiceInterface {
    @Override
    public String hello() {
        return "<h1>hello!</h1>";
    }

    @Override
    public String answerHello(String userName) {
        return "<b>Hello Again</b>, " + "<h1>" + userName + "</h1>" + "!";
    }
}
