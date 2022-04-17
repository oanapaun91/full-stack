package com.devmind;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
        Student firstStudent = context.getBean("student", Student.class);
        Student secondStudent = context.getBean("studentPrototype", Student.class);
    }
}
