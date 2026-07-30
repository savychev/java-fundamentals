package oefening6.oefening2;

/**
 * Demo: het REFERENTIETYPE bepaalt welke methodes zichtbaar zijn.
 * Via een AbstractClass-referentie is newMethod() onzichtbaar,
 * ook al is het object een SubClass.
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractClass aClass = new SubClass(); // programmeren tegen het abstracte type
        aClass.aMethod();
        aClass.myMethod();
//        aClass.newMethod(); // compileerfout: bestaat niet in AbstractClass
        System.out.println();

        SubClass aClass2 = new SubClass(); // referentietype SubClass
        aClass2.aMethod();
        aClass2.myMethod();
        aClass2.newMethod(); // nu wel bereikbaar
    }
}
