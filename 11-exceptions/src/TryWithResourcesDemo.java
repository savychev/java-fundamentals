/**
 * Teaser: try-with-resources.
 * Alles wat AutoCloseable implementeert mag in de try(...) staan en
 * wordt automatisch gesloten - ook bij een exception. Dit vervangt het
 * klassieke patroon met een finally-blok vol close()-aanroepen.
 */
public class TryWithResourcesDemo {

    /** Eenvoudige eigen resource zodat de demo zonder bestanden werkt. */
    static class DemoResource implements AutoCloseable {
        void gebruik() {
            System.out.println("Resource wordt gebruikt");
        }

        @Override
        public void close() {
            // Wordt automatisch aangeroepen aan het einde van de try.
            System.out.println("Resource automatisch gesloten");
        }
    }

    public static void main(String[] args) {
        // Geen expliciete close() en geen finally nodig.
        try (DemoResource resource = new DemoResource()) {
            resource.gebruik();
        }
        System.out.println("Klaar.");
    }
}
