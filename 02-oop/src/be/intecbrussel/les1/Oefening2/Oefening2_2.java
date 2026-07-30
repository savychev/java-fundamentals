package be.intecbrussel.les1.Oefening2;

/**
 * Oefening 2.2 - StringBuilder omzetten naar String met toString()
 * en daarna een String-methode (toLowerCase) gebruiken.
 */
public class Oefening2_2 {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder("The Quick BroWn FoX!");
        String str = strB.toString(); // StringBuilder heeft zelf geen toLowerCase()

        System.out.println(str.toLowerCase());
    }
}
