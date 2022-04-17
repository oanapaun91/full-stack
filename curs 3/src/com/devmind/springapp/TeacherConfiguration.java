package com.devmind.springapp;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.devmind.springapp")
public class TeacherConfiguration {
    @Autowired
    HomeworkService homeworkService;

    @Bean
    public JavaTeacher javaTeacher() {
        JavaTeacher java = new JavaTeacher(wisdomWordsService(), homeworkService);
        return java;
    }

    @Bean
    public WisdomWordsService wisdomWordsService() {
        WisdomWordsService wisdomWordsService = new WisdomWordsService();
        wisdomWordsService.setMessage("This is a new wisdom message.");
        return wisdomWordsService;
    }

    @Bean
    public MathTeacher mathTeacher() {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setWisdomService(wisdomWordsService());
        return mathTeacher;
    }

}
