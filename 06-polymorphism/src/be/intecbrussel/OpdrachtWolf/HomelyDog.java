package be.intecbrussel.OpdrachtWolf;

public class HomelyDog extends Dog {
    private char size = 'M';
    private char coat;

    public HomelyDog(String name, int lifespan, char size, char coat) {
        super(name, lifespan, size);
        this.coat = coat;
    }

    public void setSize(char size) {
        if (size == 'S' || size == 'M' || size == 'L')
            this.size = size;
        else
            System.out.println("The size can be S, M or L");
    }

    public void setCoat(char coat) {
        if (coat == 'S' || coat == 'L')
            this.coat = coat;
        else
            System.out.println("The coat can be S or L");
    }
}