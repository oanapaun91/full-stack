package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component
public class HomeworkService {
    private String homeworkService = "This is a homework service";

    public String getHomeworkService() {
        return homeworkService;
    }
}
