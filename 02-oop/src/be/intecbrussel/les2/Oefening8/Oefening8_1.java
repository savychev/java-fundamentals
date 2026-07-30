package be.intecbrussel.les2.Oefening8;

/**
 * Oefening 8.1 - autoboxing: primitieve waarden worden automatisch
 * in wrapper-objecten verpakt.
 */
public class Oefening8_1 {
    public static void main(String[] args) {
        int numberInInt = 25;
        double numberInDouble = 2.99;
        char notANumber = 'j';

        // autoboxing: geen expliciete conversie nodig
        Integer numberInObj = numberInInt;
        Double doubleInObj = numberInDouble;
        Character charInObj = notANumber;

        System.out.println(numberInObj);
        System.out.println(doubleInObj);
        System.out.println(charInObj);
    }
}
