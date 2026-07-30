package be.intecbrussel.oefening2;

public class Oefening2 {
    public static void main(String[] args) {
        String str = "Maak van deze string een char array";
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            System.out.print(ch + " | ");
        }
    }
}
