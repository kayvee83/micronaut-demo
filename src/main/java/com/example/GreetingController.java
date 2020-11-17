package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.annotation.RequestAttribute;

import javax.inject.Inject;

@Controller("/greetings")
public class GreetingController {

    @Inject
    GreetingService greetingService;

    @Get
    public String greeting(@QueryValue String name){
        return "Hello "+name;
    }

    @Get("/{name}")
    public String greetingByPathParam(@RequestAttribute(name = "name") String name){
        return greetingService.getHelloForUser(name);
    }
}
