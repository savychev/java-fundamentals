package be.intecbrussel.Oefening1.Oefening1_2;

/**
 * Oefening 1.2 - controleer of ELK cijfer van een geheel getal even is.
 * Retourneer true als elk cijfer even is, anders false.
 *
 * Opmerking: 1, 3, 5, 7, 9 zijn oneven cijfers; 0, 2, 4, 6 en 8 zijn even.
 * Voorbeelddata: (8642) -> true, (123) -> false, (200) -> true.
 */
public class EvenOdd {

    public EvenOdd() {
    }

    public boolean areAllNumsEven(int num) {
        while (num > 0) {
            int digit = num % 10; // laatste cijfer afsplitsen
            if (digit % 2 != 0) {
                return false;     // een oneven cijfer volstaat om te stoppen
            }
            num /= 10;            // laatste cijfer verwijderen
        }
        return true;
    }
}
