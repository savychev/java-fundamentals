package les1;

/** Concrete stap-invulling voor het Template Method-voorbeeld. */
public class Koffie extends WarmeDrank {

    @Override
    protected void brouw() {
        System.out.println("Koffie zetten met gemalen bonen");
    }

    @Override
    protected void voegSmaakmakerToe() {
        System.out.println("Melk en suiker toevoegen");
    }
}
