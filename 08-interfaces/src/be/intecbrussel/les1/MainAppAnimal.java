package be.intecbrussel.les1;

/**
 * Eén klasse kan meerdere interfaces implementeren en moet dan
 * ALLE methodes uit de hele interface-hiërarchie invullen
 * (hier: Animal + Hunter + TwoLeggedMammal + FourLeggedMammal).
 */
public class MainAppAnimal implements TwoLeggedMammal, FourLeggedMammal {

    @Override
    public void walkWithFourLegs() {
        System.out.println("Loopt op vier poten");
    }

    @Override
    public void walkWithTwoLegs() {
        System.out.println("Loopt op twee poten");
    }

    @Override
    public void sleep() {
        System.out.println("Slaapt...");
    }

    @Override
    public void eat() {
        System.out.println("Eet...");
    }

    @Override
    public void huntForFood() {
        System.out.println("Jaagt op voedsel");
    }

    public static void main(String[] args) {
        MainAppAnimal dier = new MainAppAnimal();
        dier.eat();
        dier.sleep();
        dier.huntForFood();
        dier.walkWithTwoLegs();
        dier.walkWithFourLegs();

        // Interface als type: hetzelfde object door verschillende "brillen" bekeken.
        Animal alsDier = dier;   // ziet enkel sleep() en eat()
        Hunter alsJager = dier;  // ziet enkel huntForFood()
        alsDier.sleep();
        alsJager.huntForFood();
    }
}
