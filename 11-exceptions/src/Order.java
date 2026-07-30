public class Order {
    static String result = "";
    { result += "(init block 1) "; }
    static { result += "(static block) "; }
    { result += "(init block 2) "; }
}

