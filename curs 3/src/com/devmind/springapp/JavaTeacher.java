package com.devmind.springapp;

public class JavaTeacher implements ITeacher{
    private WisdomWordsService wisdomService;
    private HomeworkService homeworkService;

    public JavaTeacher(WisdomWordsService wisdomService, HomeworkService homeworkService) {
        this.wisdomService = wisdomService;
        this.homeworkService = homeworkService;
    }

    @Override
    public String getHomework() {
        return "Create 100 classes";
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
