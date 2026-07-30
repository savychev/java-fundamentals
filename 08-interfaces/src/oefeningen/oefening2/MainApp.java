package oefeningen.oefening2;

/** Demo: gedrag hangt af van de interne toestand van de auto. */
public class MainApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.gas();          // motor staat nog uit
        car.toggleSwitch(); // aanzetten
        car.gas();          // nu rijdt hij
        car.toggleSwitch(); // weer uitzetten
    }
}
