package be.intecbrussel.OpdrachtWolf;

/**
 * Hond erft van Wolf en voegt een maat (size) toe.
 * Toont constructor chaining met this(...) en super(...).
 */
public class Dog extends Wolf {
    private char size;

    public Dog() {
        this("Unknown", 0, 'M'); // constructor chaining: roept de andere constructor aan
    }

    public Dog(String name, int lifespan, char size) {
        super(name, lifespan); // eerst de superklasse initialiseren
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    // Setter staat hier zodat subklassen het echte veld aanpassen (geen field shadowing)
    public void setSize(char size) {
        if (size == 'S' || size == 'M' || size == 'L')
            this.size = size;
        else
            System.out.println("The size can be S, M or L");
    }

    public void bark() {
        System.out.println("wow wow wow");
    }

    public void sit() {
        System.out.println(getName() + " is sitting.");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + getName() + '\'' +
                ", lifespan=" + getLifespan() + "}, Dog{" +
                "size=" + getSize() +
                '}';
    }
}
