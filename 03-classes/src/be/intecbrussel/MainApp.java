package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
//        Auto auto1 = new Auto(); // constructor zonder argumenten. Error

        Auto auto = new Auto("Toyota", "Camry"); // object maken

        auto.getMessageCreation(); // method aanroepen
    }
}
