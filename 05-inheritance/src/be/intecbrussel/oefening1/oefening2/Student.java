package be.intecbrussel.oefening1.oefening2;

/**
 * Subklasse van Person: laat de impliciete super()-aanroep zien.
 */
public class Student extends Person {
    public Student() {
        // De compiler voert hier eerst impliciet super() uit (Person no-args).
        System.out.println("Student constructor no-args");
    }

    public Student(String name) {
        super(name); // expliciet de Person-constructor met parameter aanroepen
        System.out.println("Student constructor with argument 'name' = " + name);
    }
}
