package be.intecbrussel.les1;

import java.util.Objects;

public class Vehicle {
    private String typeOfVehicle = "Car";

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public Vehicle() {
        System.out.println("Vehicle class constructor");
    }

    public void honk() {
        System.out.println("Toet toet! I'm super!");
    }
}
    

