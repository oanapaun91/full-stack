package com.example.curs15.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class Ex1Controller {
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/jsonfile", method = GET)
    public String parseJson() {
        try {
            Course course = objectMapper.readValue(new File("src/main/java/com/resources/JSONExample.json"), Course.class);
            return course.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    @RequestMapping(value = "/jsonarray", method = GET)
    public String parseJsonArray() {
        try {
            Course[] courses = objectMapper.readValue(new File("src/main/java/com/resources/JSONArrayExample.json"), Course[].class);
            String result = "";
            for (Course course : courses) {
                result += course.toString();
                result += "\n";
            }
            return result;
        } catch (IOException e) {
            return e.toString();
        }
    }

    @RequestMapping(value = "/messages", method = POST)
    public ResponseEntity<Message> showMessage(@RequestBody Message message, @RequestHeader(value = "authentication") String authentication) {
        if (authentication.equals("devmind-api-key")) {
            return new ResponseEntity(message, HttpStatus.CREATED);
        } else {
            return new ResponseEntity(message, HttpStatus.UNAUTHORIZED);
        }
    }

}

