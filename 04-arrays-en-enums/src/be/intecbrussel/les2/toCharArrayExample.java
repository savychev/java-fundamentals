package be.intecbrussel.les2;

public class toCharArrayExample {
    public static void main(String[] args) {
        String str = "From String to a char array";
        char[] charArr = str.toCharArray();

        for (char ch : charArr) {
            System.out.print(ch + "|");
        }
    }
}
