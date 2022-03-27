package com.devmind;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentConfiguration {

    @Bean
    public Student student(){
        return new Student("Paun", "Oana", 2);
    }

    @Bean
    @Scope("prototype")
    public Student studentPrototype(){
        Student student = new Student();
        student.setFirstName("Oana");
        student.setLastName("Paun");
        student.setGrade(2);
        return student;
    }

}
