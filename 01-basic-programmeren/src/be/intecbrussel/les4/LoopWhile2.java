package be.intecbrussel.les4;

public class LoopWhile2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("Summa is: " + sum);
    }
}
