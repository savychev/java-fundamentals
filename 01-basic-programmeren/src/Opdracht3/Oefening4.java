package Opdracht3;

// Schrijf een programma dat je testscore gaat bereken of je geslaagd bent of niet.

public class Oefening4 {
    public static void main(String[] args) {
        int score = 59;
        int minScore = 80;

        String result = score >= minScore ? "You passed the exam" : "You did not pass the exam";

        System.out.println(result);
    }
}