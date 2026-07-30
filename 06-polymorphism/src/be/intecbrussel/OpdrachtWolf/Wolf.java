package be.intecbrussel.OpdrachtWolf;

public class Wolf {
    private String name;
    private int lifespan;

    public String getName() {
        return name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public Wolf(String name, int lifespan) {
        this.name = name;
        this.lifespan = lifespan;
    }

    public void makeNoise() {
        System.out.println("Auuuuuuuuw");
    }

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
