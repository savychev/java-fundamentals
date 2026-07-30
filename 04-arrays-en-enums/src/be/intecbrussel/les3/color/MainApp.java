package be.intecbrussel.les3.color;

/**
 * Demo van values() en ordinal():
 * values() geeft alle constanten terug als array, in declaratievolgorde.
 */
public class MainApp {
    public static void main(String[] args) {
        Color c1 = Color.RED; // een enum-variabele wijst naar een van de constanten
        System.out.println(c1);

        Color[] myColorArr = Color.values(); // alle constanten als array
        for (Color col : myColorArr) {
            System.out.println(col + " at index " + col.ordinal()); // ordinal() = positie (vanaf 0)
        }
    }
}
