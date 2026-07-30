package be.intecbrussel.oefening1.oefening1;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The cow " + getName() + " say: Moo!");
    }
}
