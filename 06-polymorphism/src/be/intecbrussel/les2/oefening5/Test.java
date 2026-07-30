package be.intecbrussel.les2.oefening5;

/**
 * Veilig downcasten: altijd eerst controleren met instanceof.
 */
class Parent {
}

class Child extends Parent {
    public static void method01(Parent test) {
        if (test instanceof Child) {      // controle voor de cast
            Child dtc = (Child) test;     // downcasting: nu gegarandeerd veilig
            System.out.println("Downcasting works! (" + dtc.getClass().getSimpleName() + ")");
        } else {
            System.out.println("Geen Child: downcast overgeslagen.");
        }
    }
}

class TestApp {
    public static void main(String[] args) {
        Child.method01(new Child());  // instanceof is true -> downcast lukt
        Child.method01(new Parent()); // instanceof is false -> geen ClassCastException
    }
}
