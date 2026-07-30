package be.intecbrussel.les3;

public class OperatorNot {
    public static void main(String[] args) {
        int num = 0;

        if (num != 0) {
            System.out.println("Number is not equal to 0");
        }

        if (!(num == 0)) {
            System.out.println("Number is not equal to 0");
        } else {
            System.out.println("Number is 0!");
        }
    }
}
