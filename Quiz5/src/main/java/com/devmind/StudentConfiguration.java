package com.devmind;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentConfiguration {
    String firstName;
    String lastName;
    int grade;

    @Bean
    public Student student(){
        return new Student(lastName, firstName, grade);
    }

    @Bean("studentPrototype")
    @Scope("prototype")
    public Student student(){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setGrade(grade);
        return student;
    }

}
