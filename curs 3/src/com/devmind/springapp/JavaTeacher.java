package com.devmind.springapp;

import org.springframework.stereotype.Component;


public class JavaTeacher implements ITeacher{
    private WisdomWordsService wisdomService;
    private HomeworkService homeworkService;

    public JavaTeacher(WisdomWordsService wisdomService, HomeworkService homeworkService) {
        this.wisdomService = wisdomService;
        this.homeworkService = homeworkService;
    }

    @Override
    public String getHomework() {
        return "java homework";
    }

    @Override
    public String getWisdom(){
    return wisdomService.getMessage();
    }

    @Override
    public String getHomeworkService(){
        return homeworkService.getHomeworkService();
    }
}
