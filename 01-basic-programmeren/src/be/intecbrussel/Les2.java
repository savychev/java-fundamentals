package be.intecbrussel;

/** Les 2: de datatypes long (met L-suffix), char en String. */
public class Les2 {
    public static void main(String[] args) {
        long a = 10000000L; // L-suffix maakt van de literal een long
        long b = 20000000L;
        long c = a + b;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The sum of a and b is " + c);

        char firstLetter = 'a'; // char: één teken, tussen enkele quotes
        System.out.println("The value of firstLetter is: " + firstLetter);

        String name = "my name"; // String: tekst, tussen dubbele quotes (geen primitief type)
        System.out.println(name);
    }
}
