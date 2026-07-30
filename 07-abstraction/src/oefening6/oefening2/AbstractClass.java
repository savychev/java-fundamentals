package oefening6.oefening2;

public abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void aMethod();

    public void myMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}
