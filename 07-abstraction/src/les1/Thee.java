package les1;

/** Tweede invulling: zelfde algoritme, andere stappen. */
public class Thee extends WarmeDrank {

    @Override
    protected void brouw() {
        System.out.println("Theezakje laten trekken");
    }

    @Override
    protected void voegSmaakmakerToe() {
        System.out.println("Citroen toevoegen");
    }
}
