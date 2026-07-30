package be.intecbrussel.les3;

public class FallThrough {
    public static void main(String[] args) {
        String str = "I";

        switch(str) {
            case "I":
                System.out.println("First line...");
            case "we":
                System.out.println("Second line...");
            case "you":
                System.out.println("Third line...");
            case "our":
                System.out.println("Fourth line...");
            default:
                System.out.println("The last line...");
        }
    }
}
