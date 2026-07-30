package be.intecbrussel.les4;

public class Oefening1 {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) { // 'i' begint met waarde 100; het lusblock word uitgevoerd totdat 'i' groter dan 0 is;
            if (i % 7 == 0)
                System.out.println(i);
        }
    }
}
