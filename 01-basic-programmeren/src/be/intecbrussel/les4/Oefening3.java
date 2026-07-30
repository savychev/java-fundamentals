package be.intecbrussel.les4;

public class Oefening3 {
    public static void main(String[] args) {
        int age = 0; // initialisatie van 'age'

        do {
            age++; // het luisblock wordt minstens èèn keer uitgevoerd, ongeacht de voorwaarde; vervolgens wordt het uitgevoerd als de voorwaarde waar is
        }
        while (age < 33); // voorwaarde

        System.out.println("Mijn naam is Dimi");
        System.out.println("Mijn leeftijd is " + age);
    }
}
