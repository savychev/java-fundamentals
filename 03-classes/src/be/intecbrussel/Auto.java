package be.intecbrussel;

/**
 * Voorbeeld van een private constructor: de no-arg constructor is
 * afgeschermd, dus een Auto KAN enkel met merk en model gemaakt worden.
 */
public class Auto {
    private String mark;
    private String model;
    private int speed;

    // private: new Auto() kan niet van buiten de klasse
    private Auto() {
    }

    public Auto(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public void getMessageCreation() {
        System.out.println("Auto is created!");
    }
}
