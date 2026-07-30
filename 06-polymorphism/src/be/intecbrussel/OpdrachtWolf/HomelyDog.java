package be.intecbrussel.OpdrachtWolf;

/**
 * Huishond: voegt een vachttype (coat) toe aan Dog.
 */
public class HomelyDog extends Dog {
    private char coat;

    public HomelyDog(String name, int lifespan, char size, char coat) {
        super(name, lifespan, size);
        this.coat = coat;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        if (coat == 'S' || coat == 'L')
            this.coat = coat;
        else
            System.out.println("The coat can be S or L");
    }
}
