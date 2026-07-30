package be.intecbrussel.les1;

/**
 * Superklasse met twee constructors, die elkaar aanroepen via this(...).
 * Zo zie je de volgorde van constructor-aanroepen in de output.
 */
public class Vehicle2 {
    private String typeOfVehicle;

    public Vehicle2() {
        this("Car"); // eerst de constructor met parameter aanroepen
        System.out.println("Vehicle class no-args constructor");
    }

    public Vehicle2(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        System.out.println("Vehicle constructor met parameters");
    }
}
