package com.example.SampleWeb.Service;

import org.springframework.stereotype.Service;

@Service
public class Student {
    public String first(){
        return "You are a first year student";
    }
    public String second(){
        return "You are a second year student";
    }
    public String third(){
        return "You are a third year student";
    }
}
