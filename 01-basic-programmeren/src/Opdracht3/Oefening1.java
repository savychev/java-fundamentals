package Opdracht3;

/** Oefening: zet een cijfer (0-9) om naar het bijbehorende woord met een switch. */
public class Oefening1 {
    public static void main(String[] args) {
        String output;
        int input = 2;

        switch (input) {
            case 0:
                output = "Zero";
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
                output = "Incorrect number."; // alles buiten 0-9
        }

        System.out.println(output);
    }
}
