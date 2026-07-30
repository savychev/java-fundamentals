package be.intecbrussel.Oefening1;

/**
 * Oefening 1 - StudieTracker: een klasse met een veld, getter/setter
 * en een methode met een do-while-lus die studie-uren bijhoudt.
 */
public class StudieTracker {
    int numberOfHours;

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public void trackStudy() {
        // do-while: de body wordt minstens een keer uitgevoerd
        do {
            numberOfHours++;
            if (numberOfHours == 3)
                System.out.println("You've been studying for " + numberOfHours + " hours today. That's enough!");
            else if (numberOfHours > 3)
                System.out.println("You've been studying for more than 3 hours today. That's enough. Calm down!");
        } while (this.numberOfHours < 3);
    }
}
