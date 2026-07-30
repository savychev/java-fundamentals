package be.intecbrussel.oefening2;

public class Oefening3 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int i = 0;
        int sum = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }

        double average = sum / numbers.length; // 7.0 (want sum en length zijn integers)

        System.out.println(average); // 7.0
    }
}