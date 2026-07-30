package be.intecbrussel.les1;

public class Test {
    public static void main(String[] args) {
        String str = "From String to a char array";
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            System.out.print(ch + " | ");
        }
    }
}