package be.intecbrussel.les1;

/**
 * Kern van polymorfisme: dezelfde aanroep, verschillend gedrag per runtime type.
 */
public class MainApp {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.animalSound(); // gedrag van Animal zelf

        Animal myCat = new Cat(); // upcasting: Cat in een Animal-referentie
        myCat.animalSound();      // dynamic dispatch -> "Meow"

        Animal myDuck = new Duck();
        myDuck.animalSound();     // dynamic dispatch -> "Kwak"
    }
}
