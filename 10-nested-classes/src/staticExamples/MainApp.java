package staticExamples;

/**
 * Demo: een static nested class aanmaken zonder instantie
 * van de outer class.
 */
public class MainApp {
    public static void main(String[] args) {
        // Geen new OuterClass1() nodig: de nested class staat op zichzelf.
        OuterClass1.InnerClass innerClass = new OuterClass1.InnerClass();
        System.out.println("Static inner x = " + innerClass.getStaticInnerX());
    }
}
