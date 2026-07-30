package be.intecbrussel.OpdrachtWolf;

/**
 * Akita: huishond met geslacht; de maat volgt uit het geslacht.
 */
public class Akita extends HomelyDog {
    private char gender;

    public Akita(String name, int lifespan, char size, char coat, char gender) {
        super(name, lifespan, size, coat);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'F') {
            this.gender = gender;
            setSize('M'); // vrouwtjes zijn kleiner
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
    public void sit() { // overriding: vervangt Dog.sit() tijdens runtime
        System.out.println("Akita refuses to sit.");
    }
}
