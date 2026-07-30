package be.intecbrussel.les2.oefening4;

public class MainApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bicycle = new Bicycle();

        Car car1 = (Car) car;
        Bike bike1 = (Bike) bike;
        Bicycle bicycle1 = (Bicycle) bicycle;
    }
}
