package com.example;


import javax.inject.Singleton;

@Singleton
public class GreetingService {

    public String getHelloForUser(String name){
        return "Hello from Greeting Service for "+name;
    }
}
