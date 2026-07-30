package staticExamples;

/**
 * WANNEER GEBRUIK JE EEN STATIC NESTED CLASS?
 *
 * Vuistregel (ook een bekende interviewvraag):
 * - Maak een geneste klasse standaard STATIC. Alleen als de klasse echt
 *   de instantievelden van de outer class nodig heeft, laat je static weg.
 * - Een niet-statische inner class bewaart een verborgen referentie naar
 *   de outer-instantie (Outer.this). Dat kost geheugen en kan objecten
 *   langer in leven houden dan nodig (geheugenlek-risico).
 * - Een static nested class is gewoon een top-level klasse met een
 *   namespace: Outer.Nested. Denk aan Map.Entry in de JDK.
 */
public class StaticNestedVsInnerNote {

    private final String eigenaar = "outer-instantie";

    /** GOED als default: heeft niets van de outer-instantie nodig. */
    public static class Coordinaat {
        final int x;
        final int y;

        Coordinaat(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /** Alleen niet-static omdat hij 'eigenaar' van de outer-instantie leest. */
    public class Label {
        String tekst() {
            return "hoort bij " + eigenaar; // impliciet: StaticNestedVsInnerNote.this.eigenaar
        }
    }

    public static void main(String[] args) {
        // Static nested: geen outer-instantie nodig.
        Coordinaat punt = new Coordinaat(3, 4);
        System.out.println("Punt: (" + punt.x + ", " + punt.y + ")");

        // Inner class: kan alleen via een outer-instantie bestaan.
        StaticNestedVsInnerNote outer = new StaticNestedVsInnerNote();
        Label label = outer.new Label();
        System.out.println("Label: " + label.tekst());
    }
}
