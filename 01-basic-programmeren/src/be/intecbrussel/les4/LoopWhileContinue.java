package be.intecbrussel.les4;

/** Les 4: continue in een while-lus — let op: eerst i++ doen, anders oneindige lus! */
public class LoopWhileContinue {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            if (i == 4) {
                i++; // verplicht vóór continue, anders blijft i voor altijd 4
                continue;
            }

            System.out.println(i);
            i++;
        }
    }
}
