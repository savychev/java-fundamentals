package oefening6.oefening1;

/**
 * Abstracte basisklasse: legt het contract vast (getBalance),
 * maar laat de invulling over aan elke concrete bank.
 */
abstract class Bank {
    abstract int getBalance(); // elke bank MOET een saldo kunnen geven
}
