package com.example.quiz6;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class Controlller {
    @RequestMapping(value = "/add/first/{first}/second/{second}", method = RequestMethod.GET)
    public long sum(@PathVariable(value = "first") long first, @PathVariable(value = "second") long second) {
        return first + second;
    }

    @PostMapping(value = "/register")
    public User registerUser(@Valid @RequestBody User user) {
        return user;
    }

}
