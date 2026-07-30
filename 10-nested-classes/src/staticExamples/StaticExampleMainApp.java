package staticExamples;

/**
 * Demo: de static nested class Inner gebruiken en het verschil
 * met de outer class StaticExample laten zien.
 */
public class StaticExampleMainApp {
    public static void main(String[] args) {
        // Nested class direct aanmaken, zonder StaticExample-instantie.
        StaticExample.Inner innerClass = new StaticExample.Inner();
        innerClass.run();

        // De outer class zelf gedraagt zich als een gewone klasse.
        StaticExample outer = new StaticExample();
        outer.print();
    }
}
