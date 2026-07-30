package be.intecbrussel.les2;

public class SplitExample {
    public static void main(String[] args) {
        String myStr = "Java is the best!";

        String[] strArray = myStr.split(" ");

        System.out.println("String: " + myStr);

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Index: " + i + " value of element: " + strArray[i]);
        }
    }
}
