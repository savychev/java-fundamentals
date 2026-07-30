package Opdracht3;

//Schrijf een programma dat een cijfer omzet naar het woord.

public class Oefening1 {
    public static void main(String[] args) {
        String output;

        int input = 2;

        switch (input) {
            case 0:
                output = "Null";
                break;
            case 1:
                output = "One";
                break;
            case 2:
                output = "Two";
                break;
            case 3:
                output = "Three";
                break;
            case 4:
                output = "Four";
                break;
            case 5:
                output = "Five";
                break;
            case 6:
                output = "Six";
                break;
            case 7:
                output = "Seven";
                break;
            case 8:
                output = "Eight";
                break;
            case 9:
                output = "Nine";
                break;
            default:
                output = "Incorrect number.";
        }

        System.out.println(output);

    }
}
