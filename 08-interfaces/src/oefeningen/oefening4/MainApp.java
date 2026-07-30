package oefeningen.oefening4;

/**
 * Demo: dezelfde Battery-referentie kan naar elke implementatie wijzen
 * (programmeren tegen een interface).
 */
public class MainApp {
    public static void main(String[] args) {
        Battery[] batterijen = {new First(), new Second(), new Third()};

        for (Battery batterij : batterijen) {
            // zelfde aanroep, ander resultaat per implementatie
            System.out.println(batterij.getClass().getSimpleName()
                    + " levert " + batterij.deliverPower());
        }
    }
}
