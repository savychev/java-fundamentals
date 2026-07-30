package be.intecbrussel.OpdrachtWolf;

public class MainApp {
    public static void main(String[] args) {
        Dog akita = new Dog();
        akita.makeNoise();

        System.out.println(akita.toString());
    }
}
