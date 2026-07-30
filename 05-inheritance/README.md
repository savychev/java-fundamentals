# 📙 05 — Inheritance

Reusing and extending classes with `extends`, `super(...)`, method overriding (`@Override`), `protected`, `final` and `Object` as the root of every class hierarchy.

> 🇳🇱 Overerving laat een subklasse velden en methodes van een superklasse hergebruiken en uitbreiden.
> Deze module toont `extends`, de constructor-keten met `super(...)` en overriding met `@Override`.

## 📖 Theory in short

- **`extends`**: een subklasse erft alle (niet-private) leden van precies een superklasse — Java kent geen meervoudige klasse-overerving.

  ```java
  public class Car extends Vehicle { }
  ```

- **Constructor-keten**: bij `new Car()` wordt eerst de constructor van `Vehicle` uitgevoerd. Zonder expliciete aanroep voegt de compiler `super()` toe; heeft de superklasse geen no-args constructor, dan is `super(argument)` verplicht als eerste statement.
- **Overriding**: een subklasse geeft een eigen invulling aan een geerfde methode. Zet er altijd `@Override` boven, dan controleert de compiler de signatuur.

  ```java
  @Override
  public void honk() {
      super.honk(); // eventueel eerst de originele versie
      System.out.println("Tuut tuuut!");
  }
  ```

- **`super.methode()`** roept bewust de superklasse-versie aan; **`this(...)`** delegeert naar een andere constructor van dezelfde klasse.
- **`protected`**: zichtbaar in de eigen klasse, het eigen package en alle subklassen — de tussenstap tussen `private` en `public`.
- **`final`**: een `final class` kan niet geerfd worden (zoals `String`), een `final` methode niet overschreven.
- **`Object` is de root**: elke klasse erft indirect van `java.lang.Object`; daarom kun je overal `toString()`, `equals()` en `hashCode()` overschrijven.

## 🗂️ File map

| Path | Content |
|---|---|
| `src/Main.java` | Startpunt van de module |
| `src/be/intecbrussel/les1/Vehicle.java` / `Car.java` | `extends`, overriding met `@Override`, `super.honk()` |
| `src/be/intecbrussel/les1/Vehicle2.java` / `Car2.java` | Constructor-keten: `this(...)` en `super(...)` met parameter |
| `src/be/intecbrussel/les1/MainApp.java` | Demo van de constructor-volgorde en beide `honk()`-versies |
| `src/be/intecbrussel/oefening1/oefening1/` | `Animal` + `Dog`/`Cat`/`Cow`: overriding die het supergedrag uitbreidt |
| `src/be/intecbrussel/oefening1/oefening2/` | `Person`/`Student`/`Driver`: impliciete `super()`, expliciete `super(naam)` en `this(...)` |
| `src/be/intecbrussel/oefening2/Oefening1.java` | Compacte samenvatting: `extends` + `super(...)` + `@Override` in een bestand |
| `src/be/intecbrussel/opdracht1/Car.java` | Superklasse met gedeelde velden en rijgedrag |
| `src/be/intecbrussel/opdracht1/SUV.java` / `Cabrio.java` / `ElectricCar.java` | Subklassen met eigen gedrag en `toString()` via `super.toString()` |
| `src/be/intecbrussel/opdracht1/MainApp.java` | Demo van de drie autotypes |
| `src/be/intecbrussel/extra/ProtectedVoorbeeld.java` | `protected` velden en methodes in een subklasse |
| `src/be/intecbrussel/extra/FinalVoorbeeld.java` | `final` klassen en methodes |
| `src/be/intecbrussel/extra/ObjectRootVoorbeeld.java` | `Object` als root: `toString()`, `equals()` en `hashCode()` overschrijven |

## ⚠️ Pitfalls & interview notes

- `super(...)` of `this(...)` moet altijd het **eerste statement** in een constructor zijn; beide combineren in een constructor kan niet.
- Heeft de superklasse **geen no-args constructor**, dan compileert een subklasse-constructor zonder expliciete `super(argument)` niet.
- Vergeet `@Override` niet: zonder deze annotatie maakt een typfout in de signatuur stilletjes een **nieuwe** methode aan in plaats van te overriden.
- Overriding vs. overloading: overriding = zelfde signatuur in een subklasse; overloading = zelfde naam, andere parameters in dezelfde klasse.
- `private` leden worden **niet** geerfd zoals `protected`/`public`; de subklasse kan er alleen bij via getters/setters van de superklasse.
- Overschrijf je `equals()`, overschrijf dan **ook** `hashCode()` — anders breken hash-gebaseerde collecties zoals `HashSet` en `HashMap`.
- Java kent geen meervoudige klasse-overerving (diamantprobleem); meerdere types combineer je met interfaces (module 08).
