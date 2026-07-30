package be.intecbrussel.les2;

/** Oefening: logische operatoren combineren op twee boolean-variabelen. */
public class Oefening2 {
    public static void main(String[] args) {
        boolean bool01 = true;
        boolean bool02 = false;

        boolean result01 = (bool01 && bool02); // false: niet beide true
        boolean result02 = (bool01 || bool02); // true: minstens één true
        boolean result03 = (!(bool01 && bool02)); // true: omkering van false

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
    }
}
