package be.intecbrussel.Animal;

/**
 * Encapsulatie-voorbeeld: private velden, getters/setters met validatie,
 * een overloaded methode eating() en een eigen toString().
 */
public class Animal {
    // private: enkel bereikbaar via getters/setters (encapsulatie)
    private String name;
    private int age;

    // no-arg constructor: velden krijgen hun standaardwaarde (null, 0)
    public Animal() {
    }

    // overloaded constructor: object meteen volledig initialiseren
    public Animal(String name, int age) {
        this.name = name; // this = dit object; onderscheidt veld van parameter
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // setter met validatie: ongeldige leeftijd wordt geweigerd
    public void setAge(int age) {
        if (age >= 0 && age <= 100)
            this.age = age;
        else
            System.out.println("Invalid input. Please enter a valid age (0-100)");
    }

    public void eating() {
        if (getAge() < 1)
            System.out.println(getName() + " isn't allowed to eat - it's younger than 1 year");
        else
            System.out.println(getName() + " is eating.");
    }

    // overloading: zelfde naam, andere parameterlijst
    public void eating(String food) {
        if (age < 1)
            System.out.println(getName() + " isn't allowed to eat " + food + " - it's younger than 1 year");
        else
            System.out.println(getName() + " ate " + food + ".");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " | Age: " + getAge();
    }
}
