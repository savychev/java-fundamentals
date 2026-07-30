package be.intecbrussel.oefening1;

public class Oefening3 {
    public static void main(String[] args) {
        int[] arrayOfNums = {5, 14, 588, 55241, 78338};

        for (int value : arrayOfNums) {
            if (value % 2 == 0)
                System.out.println(value + " is even number.");
            else
                System.out.println(value + " is odd number.");
        }
    }
}
