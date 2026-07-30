package les1;

/**
 * Abstracte klasse: mix van abstracte methodes (zonder body) en
 * gewone methodes (met body). Kan zelf niet geïnstantieerd worden.
 */
abstract class Animal {

    public abstract void animalSound(); // abstract: subklasse MOET dit invullen

    public void sleep() { // gewone methode: wordt gewoon geërfd
        System.out.println("Zzz Zzz Zzz");
    }
}
