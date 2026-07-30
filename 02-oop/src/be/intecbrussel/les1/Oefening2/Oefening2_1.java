package be.intecbrussel.les1.Oefening2;

public class Oefening2_1 {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("madam");
        String str = input.toString();


        StringBuilder inputReverse = new StringBuilder(input.reverse());
        String strReverse = inputReverse.toString();


        if (str.equals(strReverse))
            System.out.println("The word "+str+" is a palindrome.");
        else
            System.out.println("The word "+str+" is not a palindrome.");
    }
}
