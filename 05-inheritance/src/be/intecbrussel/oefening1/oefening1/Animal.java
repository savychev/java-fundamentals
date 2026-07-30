package be.intecbrussel.oefening1.oefening1;

public class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Animal is making sound.");
    }
}
