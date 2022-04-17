package com.devmind.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfiguration.class);
//      ClassPathXmlApplicationContext contextXML = new ClassPathXmlApplicationContext("applicationContext.xml");

        ITeacher myTeacher = context.getBean("newTeacher", MyTeacher.class);

        MathTeacher mathTeacher = context.getBean("mathTeacher", MathTeacher.class);

        ITeacher javaTeacher = context.getBean("javaTeacher", JavaTeacher.class);

        System.out.println(myTeacher.getHomework());

        System.out.println(myTeacher.getWisdom());

        System.out.println(myTeacher.getHomeworkService());

        System.out.println(mathTeacher.getWisdom());

        System.out.println(javaTeacher.getHomework());

        context.close();
    }

}
