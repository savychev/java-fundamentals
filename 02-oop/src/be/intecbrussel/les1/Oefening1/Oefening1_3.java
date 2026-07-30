package be.intecbrussel.les1.Oefening1;

// Maak een string met de volgende waarde "hello world" maak nu een algoritme dat van de huidige waarde het volgende maakt "HeLlO WoRlD".
public class Oefening1_3 {
    public static void main(String[] args) {
        String str = "hello world";
        char symbol;
        String result = "";

        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                symbol = str.charAt(i);
                result += Character.toUpperCase(symbol);
            } else {
                symbol = str.charAt(i);
                result += Character.toLowerCase(symbol);
            }
        }
        System.out.println(result);
    }
}