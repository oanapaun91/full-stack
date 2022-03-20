package tema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Automobil myCar = context.getBean("masina", Masina.class);
        System.out.println(myCar.travel());

        DriveTest driveTest = context.getBean("driveTest", DriveTest.class);
        System.out.println(driveTest.getMasina().travel());
        System.out.println(driveTest.getMotocicleta().travel());
        System.out.println(driveTest.getAutocar().travel());

        Parking parking = context.getBean("parking", Parking.class);
        System.out.println(parking.getAutomobil().travel());

    }
}
