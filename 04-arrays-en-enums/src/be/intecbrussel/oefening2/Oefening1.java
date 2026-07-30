package be.intecbrussel.oefening2;

public class Oefening1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 0;

        for (int value : myArray) {
            result += value;
        }

        System.out.println(result); // 55
    }
}
