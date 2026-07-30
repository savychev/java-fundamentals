package be.intecbrussel.les1.casting;

public class mainApp {
    public static void main(String[] args) {
        // Upcasting
        Parent parent = new Child();
        parent.name = "Intec Brussel";

        // Printing the parent class name
        System.out.println(parent.name);

        // Parent class method is overridden method hence this will be executed
        parent.method();

        // Trying to Downcasting Implicitly. You will get a compile time error.
        // Child child = new Parent();
        // Downcasting Explicitly
        Child child = (Child) parent;
        System.out.println(child.name);
        child.method();
    }
}
