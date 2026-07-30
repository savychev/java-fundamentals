package be.intecbrussel.opdracht1.opdracht1_2;

public class MainApp {
    public static void main(String[] args) {
        ShoePair nike = new ShoePair("Nike", false, "white", 41, 69.99);
        ShoePair timberLand = new ShoePair("TimberLand", true, "brown", 41, 219.99);
        ShoePair balenciaga = new ShoePair("Balenciaga", true, "black", 45, 429.99);
        ShoePair nike2 = new ShoePair("Nike", true, "white", 42, 29.99);
        ShoePair timberLand2 = new ShoePair("TimberLand", true, "black", 39, 170);
        ShoePair balenciaga2 = new ShoePair("Balenciaga", false, "black", 45, 50);
        ShoePair nike3 = new ShoePair("Nike", true, "white", 41, 79.99);
        ShoePair timberLand3 = new ShoePair("TimberLand", true, "yellow", 41, 80);
        ShoePair balenciaga3 = new ShoePair("Balenciaga", false, "black", 37, 349.99);

        ShoePair[] shoePairs = {nike, timberLand, balenciaga, nike2, timberLand2, balenciaga2, nike3, timberLand3, balenciaga3};

        // Ik wil graag alle paar schoenen er uithalen die maatje 41 zijn, en die compleet zijn.
        // Print al die schoenen af.
        for (ShoePair obj : shoePairs) {
            if (obj.getSize() == 41 && obj.isComplete()) {
                System.out.println(obj.toString());
            }
        }

        System.out.println("\n");

        // Via een tweede iteratie wil ik ook dat je me optelt hoeveel van die schoenen niet compleet zijn, en
        // bereken me hoeveel geld ik hierdoor verloren ben.
        int count = 0;
        double sum = 0;
        for (ShoePair obj : shoePairs) {
            if (!obj.isComplete()) {
                count++;
                sum += obj.getPrice();
            }
        }
        System.out.println(count + " paar schoenen zijn nog niet klaar. Ik heb hierdoor al " + sum + "€ verloren!");
    }
}
