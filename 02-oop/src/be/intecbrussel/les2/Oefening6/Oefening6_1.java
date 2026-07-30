package be.intecbrussel.les2.Oefening6;

/**
 * Oefening 6.1 - wrapper-objecten omzetten naar String met toString()
 * en vergelijken met equals().
 */
public class Oefening6_1 {
    public static void main(String[] args) {
        String str = "a";
        String str1 = "123";
        String str2 = "55.99";
        String str3 = "false";

        Character c = 'a';
        Integer i = 123;
        Float f = 55.99f;
        Boolean b = false;

        // elke wrapper heeft een toString() die de waarde als tekst teruggeeft
        boolean equal1 = str.equals(c.toString());  // true
        boolean equal2 = str1.equals(i.toString()); // true
        boolean equal3 = str2.equals(f.toString()); // true
        boolean equal4 = str3.equals(b.toString()); // true

        System.out.println(equal1);
        System.out.println(equal2);
        System.out.println(equal3);
        System.out.println(equal4);
    }
}
