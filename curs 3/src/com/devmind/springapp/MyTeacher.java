package com.devmind.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("newTeacher")
public class MyTeacher implements ITeacher {
    WisdomWordsService wisdomWordsService;
    Notebook notebook;


    @Autowired
    public MyTeacher(WisdomWordsService wisdomWordsService, Notebook notebook) {
        this.wisdomWordsService = wisdomWordsService;
        this.notebook = notebook;
    }

    public void saySomething() {
        System.out.println("hello");
    }

    @Override
    public String getHomework() {
        return "one homework from my teacher " + "\n" + wisdomWordsService.getMessage();
    }

    @Override
    public String getHomeworkService() {
        return "my teacher: Homework service";
    }

    @Override
    public String getWisdom() {
        return "my teacher: wisdom";
    }

}
