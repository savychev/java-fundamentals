package be.intecbrussel.oefening1.oefening2;

/**
 * Demo: volg in de output de volgorde van constructor-aanroepen
 * bij Person (super), Student (impliciete super()) en Driver (this + super).
 */
public class MainApp {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("\n");
        Person person1 = new Person("Dimi");

        System.out.println("\n-----\n");

        Student student = new Student();  // eerst Person no-args, dan Student
        System.out.println("\n");
        Student student1 = new Student("Alex"); // Person(String), dan Student(String)

        System.out.println("\n-----\n");

        Driver driver = new Driver();     // this("Unknown") -> super(name) -> terug omhoog
        System.out.println("\n");
        Driver driver1 = new Driver("Vova");
    }
}
