package staticExamples;

public class StaticExampleMainApp {
    public static void main(String[] args) {
        StaticExample.Inner innerClass = new StaticExample.Inner();
        innerClass.run();

        StaticExample outer = new StaticExample();
        outer.print();
    }
}
