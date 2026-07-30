package be.intecbrussel.oefening1.oefening2;

public class Driver extends Person {
    public Driver() {
        this("Unknown"); // calling the constructor WITH argument of the SAME class
        System.out.println("Driver constructor no-args");
    }

    public Driver(String name) {
        super(name); // calling the constructor WITH argument of the SUPER class
        System.out.println("Driver constructor with argument 'name' = " + name);
    }
}
