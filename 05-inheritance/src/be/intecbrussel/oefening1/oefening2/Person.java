package be.intecbrussel.oefening1.oefening2;

public class Person {
    private String name;

    public Person() {
        System.out.println("Person constructor no-args");
    }

    public Person(String name) {
        setName(name);
        System.out.println("Person constructor with argument 'name' = " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
