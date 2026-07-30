package oefening6.oefening1;

/** Concrete bank: geeft zijn eigen invulling aan getBalance(). */
public class BankC extends Bank {
    @Override
    int getBalance() {
        return 2000;
    }
}
