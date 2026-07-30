package Opdracht3;

/** Oefening: bepaal met de ternaire operator of een testscore voldoende is om te slagen. */
public class Oefening4 {
    public static void main(String[] args) {
        int score = 59;
        int minScore = 80; // minimaal vereiste score

        String result = score >= minScore ? "You passed the exam" : "You did not pass the exam";

        System.out.println(result);
    }
}
