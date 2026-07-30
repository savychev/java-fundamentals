package oefening6.oefening2;

/**
 * Een abstracte klasse mag (anders dan een interface) een constructor,
 * velden en gewone methodes hebben. De constructor wordt uitgevoerd
 * via super() wanneer een subklasse wordt aangemaakt.
 */
public abstract class AbstractClass {

    public AbstractClass() {
        // wordt impliciet aangeroepen door de constructor van SubClass
        System.out.println("This is the constructor of the abstract class");
    }

    public abstract void aMethod(); // moet door de subklasse ingevuld worden

    public void myMethod() { // concrete methode: wordt geërfd
        System.out.println("This is a normal method of the abstract class");
    }
}
