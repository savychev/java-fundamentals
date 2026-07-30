package be.intecbrussel.OpdrachtWolf;

public class Dog extends Wolf {
    private char size;

    public Dog() {
        this("Uknknown", 0, 'M');
    }

    public Dog(String name, int lifespan, char size) {
        super(name, lifespan);
        this.size = size;
    }

    public char getSize() {
        return size;
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
