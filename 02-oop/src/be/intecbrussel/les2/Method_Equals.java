package be.intecbrussel.les2;

/**
 * equals() versus == bij Strings.
 * == vergelijkt referenties (zelfde object?), equals() vergelijkt de inhoud.
 * String-literals worden gedeeld via de string pool, new String() niet.
 */
public class Method_Equals {
    public static void main(String[] args) {
        String s1 = "intec";
        String s2 = "intec";
        String s3 = "INTEC";
        String s4 = "Java";

        // literals met dezelfde inhoud wijzen naar HETZELFDE object in de string pool
        boolean equal01 = (s1 == s2); // true
        boolean equal02 = (s2 == s3); // false - andere inhoud
        boolean equal03 = (s3 == s4); // false

        System.out.println(equal01);
        System.out.println(equal02);
        System.out.println(equal03);

        System.out.println("--- NEXT ---");

        String str1 = "Hello Intec!";
        String str2 = new String("Hello Intec!"); // new maakt ALTIJD een nieuw object
        String str3 = str2;                       // zelfde referentie als str2

        boolean equal1 = (str1 == str2); // false - twee verschillende objecten
        boolean equal2 = (str2 == str3); // true - zelfde referentie

        System.out.println(equal1);
        System.out.println(equal2);

        // equals() vergelijkt de tekstinhoud -> hier telkens true
        boolean equal3 = str1.equals(str2);
        boolean equal4 = str2.equals(str3);

        System.out.println(equal3);
        System.out.println(equal4);
    }
}
