package be.intecbrussel.les3.color;

public class MainApp {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);

        Color[] myColorArr = Color.values();
        for (Color col : myColorArr) {
            System.out.println(col + " at index " + col.ordinal());
        }
    }
}