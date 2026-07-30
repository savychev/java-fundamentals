package be.intecbrussel.les2.finalTest;

public class FinalMainApp {
    public static void main(String[] args) {
        System.out.println(IntecBrussel.PI);
        System.out.println(IntecBrussel.DAYS_OF_THE_WEEK);

        System.out.println("");

        IntecBrussel obj = new IntecBrussel();
        System.out.println(obj.THRESHOLD);
        System.out.println(obj.CAPACITY);
        System.out.println(obj.MINIMUM);

        System.out.println("");

        int[] arr = {1, 2, 3};
        // final with for-each statement
        for (final int numbers : arr) {
            System.out.println(numbers);
        }
    }
}
