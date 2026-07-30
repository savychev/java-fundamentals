package extra;

/** EXTRA — Tweede invulling: zelfde algoritme, andere stappen. */
public class Thee extends WarmeDrank {

    @Override
    protected void brouw() {
        System.out.println("Theezakje laten trekken");
    }

    @Override
    protected void voegExtraToe() {
        System.out.println("Citroen toevoegen");
    }
}
