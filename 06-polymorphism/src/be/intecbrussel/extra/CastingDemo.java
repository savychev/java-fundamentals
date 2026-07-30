package be.intecbrussel.extra;

/**
 * Extra: upcasting vs downcasting, klassieke instanceof-check
 * en pattern matching for instanceof (Java 16+).
 */
public class CastingDemo {
    public static void main(String[] args) {
        Dier dier = new Hond(); // UPCASTING: impliciet, altijd veilig

        dier.maakGeluid(); // dynamic dispatch -> "Woef!"
        // dier.apporteer(); // compileert NIET: het referentietype Dier kent apporteer() niet

        // Klassieke aanpak: eerst instanceof, dan expliciet casten
        if (dier instanceof Hond) {
            Hond hond = (Hond) dier; // DOWNCASTING: expliciet
            hond.apporteer();
        }

        // Moderne aanpak (Java 16+): pattern matching, check + cast in een stap
        if (dier instanceof Hond h) {
            h.apporteer(); // h is al het juiste type
        }

        Dier kat = new Kat();
        System.out.println(kat instanceof Hond); // false: daarom altijd eerst controleren
        // Hond fout = (Hond) kat; // compileert, maar gooit ClassCastException tijdens runtime
    }
}

class Dier {
    void maakGeluid() {
        System.out.println("...");
    }
}

class Hond extends Dier {
    @Override
    void maakGeluid() {
        System.out.println("Woef!");
    }

    void apporteer() { // bestaat alleen in Hond, niet in Dier
        System.out.println("De hond apporteert de bal.");
    }
}

class Kat extends Dier {
    @Override
    void maakGeluid() {
        System.out.println("Miauw!");
    }
}
