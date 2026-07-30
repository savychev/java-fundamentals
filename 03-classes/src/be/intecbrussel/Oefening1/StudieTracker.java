package be.intecbrussel.Oefening1;

public class StudieTracker {
    int numberOfHours;

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public void trackStudy() {
        do {
            numberOfHours++;
            if (numberOfHours == 3)
                System.out.println("You've been studying for "+numberOfHours+" hours today. That's enough!");
            else if (numberOfHours > 3)
                System.out.println("You've been studying for more than 3 hours today. That's enough. Calm down!");
        } while (this.numberOfHours < 3);
    }
}