package be.intecbrussel.oefening1.oefening2;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("\n");
        Person person1 = new Person("Dimi");

        System.out.println("\n-----\n");

        Student student = new Student();
        System.out.println("\n");
        Student student1 = new Student("Alex");

        System.out.println("\n-----\n");

        Driver driver = new Driver();
        System.out.println("\n");
        Driver driver1 = new Driver("Vova");
    }
}
