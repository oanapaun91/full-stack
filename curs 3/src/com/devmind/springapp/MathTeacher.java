package com.devmind.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;


public class MathTeacher implements ITeacher {
    private WisdomWordsService wisdomService;
    private static final String MATH_TEACHER_PREFIX = "Math teacher says: ";



    @Override
    public String getHomework() {
        return "math homework";
    }

    @Override
    public String getHomeworkService() {
        return "...";
    }

    @Override
    public String getWisdom() {
        return MATH_TEACHER_PREFIX + "wisdom " + "\n" + wisdomService.getMessage();
    }


    public void setWisdomService(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

}
