package be.intecbrussel.oefening4;

/**
 * Oefening: dubbele waarden vinden door elk element te vergelijken
 * met alle elementen die erna komen (geneste lussen).
 */
public class Oefening3 {
    public static void main(String[] args) {
        String[] myArr = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};

        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i].equals(myArr[j])) { // Strings vergelijk je met equals(), niet met ==
                    System.out.println("Dubbel: " + myArr[i]);
                    break; // stoppen na de eerste match voor dit element
                }
            }
        }
    }
}
