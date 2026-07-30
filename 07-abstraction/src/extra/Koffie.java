package extra;

/** EXTRA — Concrete stap-invulling voor het Template Method-voorbeeld. */
public class Koffie extends WarmeDrank {

    @Override
    protected void brouw() {
        System.out.println("Koffie zetten met gemalen bonen");
    }

    @Override
    protected void voegExtraToe() {
        System.out.println("Melk en suiker toevoegen");
    }
}
