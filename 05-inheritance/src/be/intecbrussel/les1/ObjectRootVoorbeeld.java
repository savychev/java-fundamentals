package be.intecbrussel.les1;

import java.util.Objects;

/**
 * Voorbeeld: Object is de root van elke klassehierarchie.
 * Elke klasse erft (indirect) van java.lang.Object en kan daarom
 * toString(), equals() en hashCode() overschrijven.
 */
public class ObjectRootVoorbeeld {
    public static void main(String[] args) {
        Punt p1 = new Punt(3, 4);
        Punt p2 = new Punt(3, 4);

        // Zonder toString()-override zou dit iets als les1.Punt@1b6d3586 tonen.
        System.out.println(p1);

        System.out.println(p1 == p2);      // false: twee verschillende objecten
        System.out.println(p1.equals(p2)); // true: zelfde inhoud dankzij de override
    }
}

/** Eenvoudige klasse die impliciet 'extends Object' is. */
class Punt {
    private final int x;
    private final int y;

    Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punt{x=" + x + ", y=" + y + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                              // zelfde object
        if (obj == null || getClass() != obj.getClass()) return false; // null of ander type
        Punt other = (Punt) obj;
        return x == other.x && y == other.y;                       // inhoud vergelijken
    }

    @Override
    public int hashCode() {
        // Regel: overschrijf je equals(), overschrijf dan ook hashCode().
        return Objects.hash(x, y);
    }
}
