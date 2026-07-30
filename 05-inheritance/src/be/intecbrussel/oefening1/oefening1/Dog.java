package be.intecbrussel.oefening1.oefening1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The dog " + getName() + " say: Woof!");
    }
}
