package animals;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalsApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnimals.xml");

        IAnimal myAnimal = context.getBean("firstAnimal", IAnimal.class);
        System.out.println (myAnimal.makeSound());

        IAnimal yourAnimal = context.getBean("secondAnimal", IAnimal.class);
        System.out.println (yourAnimal.makeSound());
    }
}
