package com.example.curs15.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/author")
public class AuthorController {

    @RequestMapping(value = "/all-books", method = RequestMethod.GET)
    public String viewAllBooks() {
        return "";
    }
}
