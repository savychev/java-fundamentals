package be.intecbrussel.OpdrachtWolf;

/**
 * Basisklasse van de hondenhiërarchie.
 * Toont method overloading: makeNoise() en makeNoise(String).
 */
public class Wolf {
    private String name;
    private int lifespan;

    public Wolf(String name, int lifespan) {
        this.name = name;
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void makeNoise() {
        System.out.println("Auuuuuuuuw");
    }

    // Overloading: zelfde naam, andere parameterlijst (keuze gebeurt tijdens compileren)
    public void makeNoise(String noise) {
        System.out.println(noise);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + getName() + '\'' +
                ", lifespan=" + getLifespan() +
                '}';
    }
}
