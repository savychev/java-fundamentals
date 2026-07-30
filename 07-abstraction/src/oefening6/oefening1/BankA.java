package oefening6.oefening1;

/** Concrete bank: geeft zijn eigen invulling aan getBalance(). */
public class BankA extends Bank {
    @Override
    int getBalance() {
        return 1000;
    }
}
