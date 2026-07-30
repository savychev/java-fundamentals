package Opdracht1;

/** Demonstreert dat char een numeriek type is: het alfabet printen met letter++. */
public class WhileExample4 {
    public static void main(String[] args) {
        char letter = 'A';

        while (letter <= 'Z') {
            System.out.println(letter);
            letter++; // char kan worden opgehoogd: 'A' -> 'B' -> ... -> 'Z'
        }
    }
}
