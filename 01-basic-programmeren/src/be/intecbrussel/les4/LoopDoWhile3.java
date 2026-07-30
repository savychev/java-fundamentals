package be.intecbrussel.les4;

public class LoopDoWhile3 {
    public static void main(String[] args) {
        int x = 21;
        int sum = 0;

        do {
            sum += x;
            x--;
        }
        while (x > 10);

        System.out.println("Summation: " + sum);
    }
}
