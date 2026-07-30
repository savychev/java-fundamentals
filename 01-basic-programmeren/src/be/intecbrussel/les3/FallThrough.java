package be.intecbrussel.les3;

/** Les 3: fall-through — zonder break lopen alle volgende cases (incl. default) mee. */
public class FallThrough {
    public static void main(String[] args) {
        String str = "I";

        switch (str) {
            case "I": // match hier: vanaf dit punt wordt ALLES uitgevoerd
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
