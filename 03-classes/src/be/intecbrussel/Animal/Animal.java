package be.intecbrussel.Animal;

public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100)
            this.age = age;
        else {
            System.out.println("Invalid input. Please enter a valid age (0-100)");
            this.age = age;
        }
    }

    public void eating() {
        int age = getAge();
        if (age < 1)
            System.out.println(getName() + " isn't allowed to eat - it's younger than 1 year");
        else
            System.out.println(getName() + " is eating.");
    }

    public void eating(String food) {
        if (age < 1)
            System.out.println(getName() + " isn't allowed to eat " + food + " - it's younger than 1 year");
        else
            System.out.println(getName() + " ate " + food + ".");
    }

    public String toString() {
        return "Name: " + getName() + " | Age: " + getAge();
    }
}
