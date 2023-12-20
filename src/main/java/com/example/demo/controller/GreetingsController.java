package com.example.demo.controller;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping(value = {"/", "/{username}"})
    public String greetings(@PathVariable(name = "username", required = false) String username){
        return Strings.isBlank(username) || Strings.isEmpty(username)
                ? "Hello, Stranger!"
                : "Hello, " + username;
    }

}
