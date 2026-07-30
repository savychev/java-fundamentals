package les1;

/**
 * Demo: polymorfisme via een abstracte klasse.
 */
public class MainApp {
    public static void main(String[] args) {
        // Animal a = new Animal(); // compileert NIET: abstracte klasse
        Animal myDog = new Dog();   // referentietype Animal, objecttype Dog
        myDog.animalSound();        // dynamische binding: Dog-versie wordt uitgevoerd
        myDog.sleep();              // geërfd uit Animal
    }
}
