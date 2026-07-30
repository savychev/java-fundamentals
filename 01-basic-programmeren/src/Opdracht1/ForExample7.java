package Opdracht1;

public class ForExample7 {
    public static void main(String[] args) {
        int result;

        for (int i = 0; i < 10000; i++) {
            if (i % 6 == 0 && i % 28 == 0)
                System.out.println(i);
        }
    }
}