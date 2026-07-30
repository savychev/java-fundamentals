package be.intecbrussel.les1;

public class ArrayVoorbeeld {
    public static void main(String[] args) {
        int[] myFirstArray = new int[10];

        int[] mySecondArray = {10, 20, 30, 40, 50};

        System.out.println("Voor de aanpassing: " + mySecondArray[0] + "\n");

        mySecondArray[0] = 10000;

        System.out.println("Na de aanpassing: " + mySecondArray[0] + "\n");

        System.out.println("The length of mySecondArray is: " + mySecondArray.length);

        for (int i = 0; i < mySecondArray.length; i++) {
            System.out.println("This is mySecondArray and the index is: " + i + " with the value of " + mySecondArray[i]);
        }

        System.out.println("\n");

        for (int value : mySecondArray) {
            System.out.println("This is a for each loop: " + value);
        }

        System.out.println("\n");

        int[] numbersArr = {2, 4, 6, 8, 10};

        int i = 0;

        while (i < numbersArr.length) {
            System.out.println("This iteration is done by While loop: " + numbersArr[i]);
            i++;
        }
    }
}
