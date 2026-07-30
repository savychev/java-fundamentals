# 📔 08 — Interfaces

Interfaces in Java: contracts, multiple implementation, default and static methods, programming to an interface, and a first taste of lambdas.

> 🇳🇱 Interfaces in Java: contracten, meervoudige implementatie, default- en static-methodes, programmeren tegen een interface, en een eerste kennismaking met lambda's.

## 📖 Theory in short

- Een **interface** is een puur contract: methodes zijn impliciet `public abstract`, velden impliciet `public static final` (constanten). Geen toestand, geen constructor.

  ```java
  public interface Lock {
      void lock();   // impliciet public abstract
      void unlock();
  }
  ```

- Een klasse **implementeert** zoveel interfaces als ze wil (`Car implements Motor, Switch1`), en een interface mag **meerdere interfaces extenden** (`FourLeggedMammal extends Animal, Hunter`).
- **Programmeren tegen een interface**: het referentietype is het contract, niet de concrete klasse. Zo werkt `Flashlight` met élk batterijmerk (`oefeningen/oefening5`).

  ```java
  Battery b = new DuracellDoubleA(); // type = interface
  Flashlight lamp = new Flashlight(b); // losse koppeling
  ```

- Sinds Java 8 mag een interface ook **default-** en **static-methodes** bevatten (`extra/Betaalbaar`, `opdrachten/whyPhone/ISimCard`):

  ```java
  interface Betaalbaar {
      double bedrag();                       // abstract
      default void betaal() { /* body */ }   // erven of overriden
      static String valuta() { return "EUR"; } // Betaalbaar.valuta()
  }
  ```

- Een **functionele interface** heeft precies één abstracte methode en kan met een **lambda** geïmplementeerd worden: `Berekening optellen = (a, b) -> a + b;` (`extra/Berekening`).

- **Abstracte klasse vs. interface** (ook gebruikt vanuit [../07-abstraction/README.md](../07-abstraction/README.md)):

  | | Abstracte klasse | Interface |
  |---|---|---|
  | Instantieerbaar | Nee | Nee |
  | Velden | Ja, gewone velden (toestand) | Alleen `public static final` constanten |
  | Constructor | Ja (via `super()`) | Nee |
  | Methodes | Abstract + concreet, elke access modifier | Abstract, `default`, `static` (impliciet `public`) |
  | Erfenis | Eén superklasse (`extends`) | Meerdere interfaces (`implements` / `extends`) |
  | Relatie | "is-een" + gedeelde toestand/code | "kan" — puur gedragscontract |
  | Wanneer | Nauw verwante klassen met gedeelde code | Los gekoppelde types met gelijk gedrag |

## 🗂️ File map

| Path | Wat het toont |
|------|---------------|
| [src/be/intecbrussel/les1/](src/be/intecbrussel/les1/) | Interface-hiërarchie: `Animal`, `Hunter`, `TwoLeggedMammal`, `FourLeggedMammal`, implementatie in `MainAppAnimal` |
| [src/oefeningen/oefening1/](src/oefeningen/oefening1/) | Minimaal contract: `Lock` + `Chest` |
| [src/oefeningen/oefening2/](src/oefeningen/oefening2/) | Eén klasse, twee interfaces: `Car implements Motor, Switch1` |
| [src/oefeningen/oefening3/](src/oefeningen/oefening3/) | `Vehicle extends Motor, Switch1` + interfaceconstante `doors` |
| [src/oefeningen/oefening4/](src/oefeningen/oefening4/) | Drie implementaties van `Battery`, interface als type |
| [src/oefeningen/oefening5/](src/oefeningen/oefening5/) | Programmeren tegen een interface: `Flashlight` + batterijmerken |
| [src/opdrachten/loveShack/](src/opdrachten/loveShack/) | `Mixable`-contract + abstracte `Food`-hiërarchie + `SmoothieRecipe`-enum |
| [src/opdrachten/mediaplayer/](src/opdrachten/mediaplayer/) | Adapter-patroon: `MediaAdapter` vertaalt tussen twee contracten |
| [src/opdrachten/whyPhone/](src/opdrachten/whyPhone/) | Interface-segregatie (5 kleine contracten) + default-methodes in `ISimCard` |
| [src/extra/Betaalbaar.java](src/extra/Betaalbaar.java) | Abstracte, default- én static-methode in één interface |
| [src/extra/Bankkaart.java](src/extra/Bankkaart.java) / [Smartwatch.java](src/extra/Smartwatch.java) / [Draagbaar.java](src/extra/Draagbaar.java) | Default erven vs. overriden; meervoudige implementatie |
| [src/extra/Berekening.java](src/extra/Berekening.java) | `@FunctionalInterface` + lambda-teaser |
| [src/extra/ExtraMainApp.java](src/extra/ExtraMainApp.java) | Demo van alle extra concepten |
| [src/Main.java](src/Main.java) | Startpunt van het hoofdstuk |

## ⚠️ Pitfalls & interview notes

- Interfacemethodes zijn impliciet `public`: bij het implementeren **moet** je `public` schrijven, anders "attempting to assign weaker access privileges".
- Velden in een interface zijn **constanten** (`public static final`) — `Vehicle.doors` is geen instantieveld en kan niet per object verschillen.
- **Diamantprobleem**: erven twee interfaces dezelfde default-methode, dan dwingt de compiler een eigen override af (`InterfaceA.super.methode()` om te kiezen).
- Een interface heeft **geen constructor** en geen instantietoestand; heb je gedeelde velden of code nodig, kies dan een abstracte klasse (zie tabel hierboven).
- `@FunctionalInterface` is niet verplicht voor lambda's, maar bewaakt dat er precies één abstracte methode blijft — extra default/static-methodes mogen wel.
- Interview-klassieker: "waarom programmeren tegen een interface?" → losse koppeling, testbaarheid (mocks), implementaties wisselen zonder de client te wijzigen (`Flashlight`/`Battery`).
