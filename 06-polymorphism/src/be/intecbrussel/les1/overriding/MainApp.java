package be.intecbrussel.les1.overriding;

public class MainApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.makeASound();

        Vehicle bicycle = new Bicycle();
        bicycle.makeASound();
    }
}
