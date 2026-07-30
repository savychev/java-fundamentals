package be.intecbrussel.oefening3;

public class Oefening1 {
    public static void main(String[] args) {
        String str = "Char Array!";

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.print("|" + i + "=" + charArray[i]);
        }
        System.out.print("|");
    }
}