package tema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Task firstTask = context.getBean("myTask", Task.class);
        Task secondTask = context.getBean("myTask", Task.class);

        firstTask.run();

        context.close();
    }
}
