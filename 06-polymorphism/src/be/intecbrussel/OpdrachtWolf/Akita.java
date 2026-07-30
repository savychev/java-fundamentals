package be.intecbrussel.OpdrachtWolf;

public class Akita extends HomelyDog {
    private char gender;
    private char size;

    public Akita(String name, int lifespan, char size, char coat, char gender) {
        super(name, lifespan, size, coat);
        this.gender = gender;
    }

    public void setGender(char gender) {
        if (gender == 'F') {
            this.gender = gender;
            setSize('M');
        } else if (gender == 'M') {
            this.gender = gender;
            setSize('L');
        }
    }

    public void layDown() {
        System.out.println(getName() + " is laying down.");
    }

    public void dance() {
        System.out.println(getName() + " is dancing.");
    }

    public void sing() {
        System.out.println(getName() + " is singing.");
    }

    @Override
    public void sit() {
        System.out.println("Akita refuses to sit.");
    }
}
