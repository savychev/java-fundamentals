package be.intecbrussel.les1;

public class MainApp {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("This vehicle is an: " + myCar.getTypeOfVehicle() +
                "\nThe brand is: " + myCar.getBrandName());

        myCar.sound();
        myCar.honk();

        Car2 myCar2 = new Car2();
    }
}
