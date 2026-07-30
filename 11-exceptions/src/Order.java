/**
 * Demo: initialisatievolgorde van een klasse.
 * - static-blok: een keer, bij het laden van de klasse.
 * - instantie-initblokken: bij ELKE new, in de volgorde waarin ze in
 *   de broncode staan, voor de constructor.
 */
public class Order {
    static String result = "";
    { result += "(init block 1) "; }        // instantieblok, draait per object
    static { result += "(static block) "; } // klasseblok, draait een keer
    { result += "(init block 2) "; }        // tweede instantieblok
}
