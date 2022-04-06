package com.example.quiz6;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlller {
    @RequestMapping(value ="/add/first/{first}/second/{second}", method = RequestMethod.GET)
    public long sum(@PathVariable(value = "first") long first, @PathVariable(value = "second") long second){
        return first+second;
    }

}
