import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {
    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);

        System.out.println(theTeacher.getWisdom());

        context.close();
    }
}