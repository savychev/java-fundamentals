# 📕 06 — Polymorphism

One object, many forms: the same method call behaves differently depending on the runtime type.

> 🇳🇱 Polymorfisme betekent dat één aanroep via een supertype-referentie verschillend gedrag geeft, afhankelijk van het echte (runtime) type van het object. Deze module behandelt overriding, overloading, up-/downcasting, `instanceof` en `final`.

## 📖 Theory in short

- **Dynamic dispatch (runtime polymorfisme)** — de JVM kiest tijdens runtime de overschreven methode van het echte objecttype, niet van het referentietype:

  ```java
  Animal a = new Cat(); // upcasting
  a.animalSound();      // "Meow" — Cat.animalSound() wint
  ```

- **Upcasting vs downcasting** — upcasten (subtype → supertype) is impliciet en altijd veilig; downcasten (supertype → subtype) vereist een expliciete cast en kan mislukken:

  ```java
  Parent p = new Child();     // upcast: impliciet
  Child c = (Child) p;        // downcast: expliciet, OK want p IS een Child
  // Child x = new Parent();  // compileerfout: impliciet downcasten kan niet
  ```

- **`instanceof` + pattern matching** — controleer vóór het downcasten; sinds Java 16 kan check + cast in één stap:

  ```java
  if (dier instanceof Hond h) { h.apporteer(); } // geen aparte cast nodig
  ```

- **Overriding vs overloading** — overriding: zelfde signatuur in een subklasse, keuze tijdens **runtime**. Overloading: zelfde naam, andere parameterlijst, keuze tijdens **compileren**:

  ```java
  p.print("Hallo"); // overriding: runtime type bepaalt de versie
  p.print(42);      // overloading: compiler koos print(int)
  ```

- **Polymorfe arrays/collecties** — één lus over `Vorm[]` of `List<Vorm>` roept per element automatisch de juiste implementatie aan.

- **`final`** — een `final` variabele krijgt exact één keer een waarde (direct, in een initializer block of in de constructor); een `final` methode kan niet overschreven worden; een `final` klasse niet uitgebreid.

## 🗂️ File map

| Path | Inhoud |
|---|---|
| `src/be/intecbrussel/les1/` | `Animal`/`Cat`/`Duck` + `MainApp` — kernvoorbeeld van dynamic dispatch |
| `src/be/intecbrussel/les1/casting/` | `Parent`/`Child` + `MainApp` — upcasting en downcasting |
| `src/be/intecbrussel/les1/multiplier/` | `Multiplier` — method overloading (2 vs 3 parameters) |
| `src/be/intecbrussel/les1/oefening3/` | `Shape`/`Circle`/`Rectangle`/`Triangle` — overloaded methodes per vorm overschreven |
| `src/be/intecbrussel/les1/overriding/` | `Vehicle`/`Car`/`Bicycle` — method overriding |
| `src/be/intecbrussel/les2/chess/` | `ChessPlayer` (enum) + `ChessAlgorithm` — `final` methode, willekeurige kleur |
| `src/be/intecbrussel/les2/finalTest/` | `IntecBrussel` — alle initialisatiewijzen van `final` variabelen |
| `src/be/intecbrussel/les2/oefening4/` | `Vehicle`/`Car`/`Bike`/`Bicycle` — casting-oefening |
| `src/be/intecbrussel/les2/oefening5/` | Shape-familie + `instanceof`; `Test.java` — veilig downcasten |
| `src/be/intecbrussel/OpdrachtWolf/` | `Wolf` → `Dog` → `HomelyDog`/`WildDog` → rassen — grote overervingshiërarchie |
| `src/be/intecbrussel/oefening7/` | `PlanetaryCircumference` — `final` constanten en methode |
| `src/be/intecbrussel/extra/CastingDemo.java` | Up-/downcasting, `instanceof` en pattern matching (Java 16+) |
| `src/be/intecbrussel/extra/OverridingVsOverloadingDemo.java` | Overriding vs overloading naast elkaar |
| `src/be/intecbrussel/extra/PolymorfeCollectiesDemo.java` | Polymorfe array en `List` met abstracte `Vorm` |

## ⚠️ Pitfalls & interview notes

- **Referentietype bepaalt wat je mág aanroepen, runtime type bepaalt wát er gebeurt.** `Dier d = new Hond();` — `d.apporteer()` compileert niet, ook al is het object een `Hond`.
- **Downcast zonder controle** compileert gewoon, maar gooit een `ClassCastException` tijdens runtime. Altijd eerst `instanceof` (of pattern matching) gebruiken.
- **Overloading is géén runtime polymorfisme** — de compiler kiest de overload op basis van het *declared* type van de argumenten. Klassieke strikvraag in interviews.
- **Velden worden níét polymorf opgezocht.** Een veld met dezelfde naam in een subklasse *shadowt* het superveld; welk veld je ziet hangt af van het referentietype. Vermijd field shadowing (zoals hier opgelost in `Dog`/`HomelyDog`).
- **`private`, `static` en `final` methodes kunnen niet overschreven worden** — een gelijknamige `static` methode in een subklasse is *hiding*, geen overriding.
- **Gebruik altijd `@Override`** — de compiler waarschuwt dan meteen als de signatuur niet klopt (anders maak je per ongeluk een overload in plaats van een override).
