package be.intecbrussel.les1.Oefening4;

/**
 * Oefening 4.3 - Math.random() + modulo.
 * Genereer een willekeurig getal tussen 1 en 60 en bepaal of het
 * even of oneven is.
 */
public class Oefening4_3 {
    public static void main(String[] args) {
        int bovengrens = 60;
        int randNumber;
        String evenOrOdd;
        String result = "";

        // Math.random() geeft [0.0, 1.0) -> schalen naar 1..60
        randNumber = (int) (Math.random() * bovengrens) + 1;

        // rest bij deling door 2: 0 -> even, anders oneven
        evenOrOdd = randNumber % 2 == 0 ? "even" : "odd";

        switch (evenOrOdd) {
            case "even":
                result = "The number " + randNumber + " is even.";
                break;
            case "odd":
                result = "The number " + randNumber + " is odd.";
        }

        System.out.println(result);
    }
}
