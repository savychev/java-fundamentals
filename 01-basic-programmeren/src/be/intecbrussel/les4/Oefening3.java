package be.intecbrussel.les4;

/** Oefening: een teller ophogen met do-while tot de gewenste waarde bereikt is. */
public class Oefening3 {
    public static void main(String[] args) {
        int age = 0; // initialisatie van 'age'

        do {
            age++; // het lusblok wordt minstens één keer uitgevoerd, ongeacht de voorwaarde
        }
        while (age < 33); // daarna herhaald zolang de voorwaarde waar is

        System.out.println("Mijn naam is Dimi");
        System.out.println("Mijn leeftijd is " + age);
    }
}
