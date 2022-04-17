package com.example.greatreads;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.json.*;


@RestController
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user) {
        return "Bine ai revenit, " + user.getUserName() + "!";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestBody User user) {
        return "Te-am inregistrat, " + user.getUserName() + "!";
    }
}
