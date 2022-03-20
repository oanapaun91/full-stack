package temaAdnotari;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main (String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAdnotari.xml");
        ITeacher myTeacher = context.getBean("webDevTeacher", WebDevTeacher.class);
        ITeacher secondTeacher = context.getBean("javaTeacher", ITeacher.class);

        System.out.println(myTeacher.getHomeWork());

        System.out.println(secondTeacher.getHomeWork());

        context.close();
    }
}
