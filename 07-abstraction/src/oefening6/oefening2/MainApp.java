package oefening6.oefening2;

public class MainApp {
    public static void main(String[] args) {
        AbstractClass aClass = new SubClass();
        aClass.aMethod();
        aClass.myMethod();
//        aClass.newMethod(); // error
        System.out.println("");

        SubClass aClass2 = new SubClass();
        aClass2.aMethod();
        aClass2.myMethod();
        aClass2.newMethod();
        System.out.println("");
    }
}
