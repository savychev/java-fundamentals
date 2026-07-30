package be.intecbrussel.les1;

/**
 * Demo: constructor-volgorde bij overerving (eerst super, dan sub),
 * geerfde methodes gebruiken en het verschil tussen de overschreven
 * en de originele versie van honk().
 */
public class MainApp {
    public static void main(String[] args) {
        Car myCar = new Car(); // print eerst "Vehicle...", dan "Car..."

        // getTypeOfVehicle() is geerfd van Vehicle, getBrandName() is eigen aan Car.
        System.out.println("This vehicle is an: " + myCar.getTypeOfVehicle() +
                "\nThe brand is: " + myCar.getBrandName());

        myCar.sound(); // via super.honk(): de versie van Vehicle
        myCar.honk();  // de overschreven versie van Car

        Car2 myCar2 = new Car2(); // volg de constructor-keten in de output
    }
}
