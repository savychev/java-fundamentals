package be.intecbrussel.les2;

/**
 * String.join(): een String-array samenvoegen tot een enkele String,
 * met een zelfgekozen scheidingsteken (delimiter).
 */
public class JoinExample {
    public static void main(String[] args) {
        String[] strArr = {"Intec", "Brussels", "is", "the", "best!"};

        // Elementen samenvoegen met een spatie ertussen.
        String str = String.join(" ", strArr);

        // Hetzelfde, maar nu met een koppelteken als delimiter.
        String strWithHyphen = String.join("-", strArr);

        System.out.println(str);
        System.out.println(strWithHyphen);
    }
}
