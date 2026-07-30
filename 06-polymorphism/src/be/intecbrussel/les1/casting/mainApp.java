package be.intecbrussel.les1.casting;

/**
 * Upcasting en downcasting tussen Parent en Child.
 */
public class MainApp {
    public static void main(String[] args) {
        // Upcasting: impliciet, altijd veilig (Child IS een Parent)
        Parent parent = new Child();
        parent.name = "Intec Brussel";

        System.out.println(parent.name);

        // De overschreven methode van Child wordt uitgevoerd (dynamic dispatch)
        parent.method();

        // Impliciet downcasten kan niet: dit geeft een compileerfout
        // Child child = new Parent();

        // Downcasting: expliciet, kan alleen als het object echt een Child is
        Child child = (Child) parent;
        System.out.println(child.name);
        child.method();
    }
}
