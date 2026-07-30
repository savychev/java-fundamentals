package be.intecbrussel.les2.oefening5;

class Parent {
}

class Child extends Parent {
    public static void method01(Parent test) {
        if (test instanceof Child) {
            Child dtc = (Child) test;
            System.out.println("Downcasting works!");
        }
    }
}

class TestApp {
    public static void main(String[] args) {

    }
}