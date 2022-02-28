package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // create the object
        ITeacher theTeacher = (ITeacher) context.getBean("myTeacher", ITeacher.class);

        // use the object
        System.out.println(theTeacher.getHomework());

        System.out.println(theTeacher.getWisdom());

        System.out.println(theTeacher.getHomeworkService());

        context.close();
    }

}
