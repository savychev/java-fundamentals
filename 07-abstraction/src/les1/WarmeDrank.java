package les1;

/**
 * Template Method-patroon met een abstracte klasse.
 * De methode bereid() legt het ALGORITME vast (de volgorde van de stappen);
 * de subklassen vullen alleen de variabele stappen in.
 * "final" verhindert dat een subklasse de volgorde verandert.
 */
public abstract class WarmeDrank {

    public final void bereid() { // template method: vaste volgorde
        kookWater();
        brouw();        // variabele stap
        schenkIn();
        voegSmaakmakerToe(); // variabele stap
    }

    private void kookWater() {
        System.out.println("Water koken");
    }

    private void schenkIn() {
        System.out.println("In een kop schenken");
    }

    protected abstract void brouw();        // subklasse bepaalt HOE

    protected abstract void voegSmaakmakerToe(); // subklasse bepaalt WAT
}
