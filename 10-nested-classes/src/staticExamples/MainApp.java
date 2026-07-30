package staticExamples;

public class MainApp {
    public static void main(String[] args) {
        OuterClass1.InnerClass innerClass = new OuterClass1.InnerClass();
        System.out.println("Static inner x = " + innerClass.getStaticInnerX());
    }
}
