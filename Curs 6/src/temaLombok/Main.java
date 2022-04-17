package temaLombok;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car differentCar = new Car();
        myCar.setNumber("ABC");
        myCar.setNumberDoors(2);
        System.out.print(myCar);
    }
}
