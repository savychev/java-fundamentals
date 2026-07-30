package oefening6.oefening1;

/**
 * Demo: het referentietype is telkens Bank (abstract),
 * maar het gedrag komt van de concrete subklasse.
 */
public class MainApp {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        System.out.println(bankA.getBalance()); // 1000

        Bank bankB = new BankB();
        System.out.println(bankB.getBalance()); // 1500

        Bank bankC = new BankC();
        System.out.println(bankC.getBalance()); // 2000
    }
}
