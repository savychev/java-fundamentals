package oefeningen.oefening1;

/** Contract: alles wat op slot kan, moet lock() en unlock() aanbieden. */
public interface Lock {
    void lock();
    void unlock();
}
