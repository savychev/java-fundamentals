package be.intecbrussel.oefening1.oefening1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The cat " + getName() + " say: Meow!");
    }
}
