package oefening6.oefening2;

/**
 * Concrete subklasse: implementeert de abstracte methode en
 * voegt een eigen bijkomende methode toe.
 */
public class SubClass extends AbstractClass {

    @Override
    public void aMethod() {
        System.out.println("This is the implemented abstract method");
    }

    public void newMethod() { // eigen methode, niet zichtbaar via AbstractClass-referentie
        System.out.println("NEW");
    }
}
