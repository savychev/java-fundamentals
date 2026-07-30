package staticExamples;

/**
 * Voorbeeld van een static nested class naast een instantieveld
 * in de outer class. De nested class kan outerX NIET lezen,
 * want er is geen outer-instantie aan gekoppeld.
 */
public class OuterClass1 {
    private int outerX = 10;

    /** Static nested class met eigen state, los van OuterClass1-instanties. */
    public static class InnerClass {
        private int staticInnerX = 5;

        public int getStaticInnerX() {
            return staticInnerX;
        }

        public void setStaticInnerX(int staticInnerX) {
            this.staticInnerX = staticInnerX;
        }
    }

    public int getOuterX() {
        return outerX;
    }

    public void setOuterX(int outerX) {
        this.outerX = outerX;
    }
}
