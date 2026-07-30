/**
 * Demo: ClassCastException (unchecked).
 * Een Integer laat zich niet naar String casten; de compiler laat de
 * cast toe (Object -> String), maar tijdens runtime gaat het mis.
 */
public class MainApp {
    public static void main(String[] args) {
        Object obj = Integer.valueOf(3); // statisch type Object, echt type Integer

        try {
            String str = (String) obj; // runtime: ClassCastException
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("Cast mislukt: " + e.getMessage());
        }
    }
}
