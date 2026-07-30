package be.intecbrussel.les2;

public class JoinExample {
    public static void main(String[] args) {
        String[] strArr = {"Intec", "Brussels", "is", "the", "best!"};

        String str = String.join(" ", strArr);

        String strWithHyphen = String.join("-", strArr);

        System.out.println(str);
        System.out.println(strWithHyphen);
    }
}
