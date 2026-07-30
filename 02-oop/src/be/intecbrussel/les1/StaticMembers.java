package be.intecbrussel.les1;

/**
 * static: leden die bij de KLASSE horen in plaats van bij een object.
 * Alle instanties delen dezelfde static variabele; static methodes
 * roep je aan via de klassenaam, zonder object.
 */
public class StaticMembers {

    private static int teller = 0; // gedeeld door ALLE objecten
    private final String naam;     // instantievariabele: per object

    public StaticMembers(String naam) {
        this.naam = naam;
        teller++; // elke nieuwe instantie verhoogt de gedeelde teller
    }

    // static methode: geen object nodig, kan enkel static leden gebruiken
    public static int getTeller() {
        return teller;
    }

    public String getNaam() {
        return naam;
    }

    public static void main(String[] args) {
        System.out.println("Aantal objecten: " + StaticMembers.getTeller()); // 0

        StaticMembers a = new StaticMembers("eerste");
        StaticMembers b = new StaticMembers("tweede");

        // de teller is gedeeld: beide objecten zien dezelfde waarde
        System.out.println("Aantal objecten: " + StaticMembers.getTeller()); // 2
        System.out.println(a.getNaam() + " en " + b.getNaam());

        // bekend voorbeeld uit de JDK: Math heeft enkel static leden
        System.out.println(Math.max(3, 7));
    }
}
