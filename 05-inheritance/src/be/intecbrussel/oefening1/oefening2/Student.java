package be.intecbrussel.oefening1.oefening2;

public class Student extends Person {
    public Student() {
        System.out.println("Student constructor no-args"); // maar eerst een regel 'super()' word uitgevoerd
    }

    public Student(String name) {
        super(name);
        System.out.println("Student constructor with argument 'name' = " + name);
    }
}
