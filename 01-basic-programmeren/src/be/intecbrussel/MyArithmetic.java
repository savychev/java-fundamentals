package be.intecbrussel;

/** Demonstreert de rekenkundige operatoren (+ - * / %) en pre-increment/decrement. */
public class MyArithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b; // gehele deling: 10 / 20 = 0 (rest valt weg)
        int mod = a % b; // modulo: de rest na deling

        System.out.println("+ " + sum);
        System.out.println("- " + sub);
        System.out.println("* " + mul);
        System.out.println("/ " + div);
        System.out.println("% " + mod);

        int inc = ++b; // pre-increment: b wordt eerst 21, daarna toegewezen
        System.out.println("++B " + inc);

        int dec = --b; // pre-decrement: b wordt eerst weer 20
        System.out.println("--B " + dec);
    }
}
