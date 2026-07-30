package be.intecbrussel.Car;

/**
 * Demo bij Car: elk object via een andere overloaded constructor;
 * ontbrekende waarden krijgen de standaardwaarde.
 */
public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("purple"); // snelheid en vermogen = standaard
        System.out.println(car1);

        Car car2 = new Car("green", 70); // vermogen = standaard
        System.out.println(car2);

        Car car3 = new Car("yellow", 160, 200); // alles zelf gekozen
        System.out.println(car3);
    }
}
