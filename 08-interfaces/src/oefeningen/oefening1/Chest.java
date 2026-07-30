package oefeningen.oefening1;

/** Een kist implementeert het Lock-contract met eigen gedrag. */
public class Chest implements Lock {

    @Override
    public void lock() {
        System.out.println("De kist is op slot.");
    }

    @Override
    public void unlock() {
        System.out.println("De kist is open.");
    }

    public static void main(String[] args) {
        Lock kist = new Chest(); // programmeren tegen de interface
        kist.lock();
        kist.unlock();
    }
}
