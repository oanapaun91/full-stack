package com.devmind.annotation.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        WebDevTeacher teacher = context.getBean("webDevTeacher", WebDevTeacher.class);

        System.out.println("Context closing and all beans are being destroyed");
        context.close();
    }
}
