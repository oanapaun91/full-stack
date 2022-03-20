package temaLifecyle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextLifecycle.xml");
        Task myTask = context.getBean("task", Task.class);

        myTask.run();

        context.close();
    }
}
