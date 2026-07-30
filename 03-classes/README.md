# 📘 03 — Classes & encapsulatie

Writing your own classes: fields, constructors, `this`, encapsulation with getters/setters, static members and `toString()`.

> 🇳🇱 In deze module schrijf je je eigen klassen: velden en methodes, (overloaded) constructors, het sleutelwoord `this`, encapsulatie met `private` + getters/setters, `static` leden en een eigen `toString()`.

## 📖 Theory in short

- **Klasse = blauwdruk, object = instantie** — `new` roept een constructor aan en maakt een object op de heap.

  ```java
  Car car = new Car("green", 70);   // constructor met 2 argumenten
  ```

- **Constructor-overloading & chaining** — meerdere constructors met verschillende parameterlijsten; `this(...)` delegeert naar een andere constructor (moet de eerste instructie zijn).

  ```java
  public Rectangle() { this(1, 1, 1, 1); }        // chaining
  public Rectangle(Rectangle obj) { ... }          // copy-constructor
  ```

- **`this`** — verwijst naar het huidige object: `this.naam = naam` onderscheidt veld van parameter; `return this` maakt method-chaining mogelijk.

- **Encapsulatie** — velden `private`, toegang via getters/setters. De setter is de plek voor validatie:

  ```java
  public void setAge(int age) {
      if (age >= 0 && age <= 100) this.age = age;
      else System.out.println("Invalid input...");
  }
  ```

- **`static`** — hoort bij de klasse, niet bij een object. Eén gedeelde teller voor alle instanties (`Circle.getCount()`), aanroepen via de klassenaam.

- **`toString()`** — override deze methode om een leesbare weergave te krijgen; `System.out.println(obj)` roept ze automatisch aan.

- **Compositie ("has-a")** — een klasse gebruikt een ander object als veld: een `Bestelling` heeft een `Klant`, een `Klant` heeft een `Adres`.

## 🗂️ File map

| Locatie (onder `src/be/intecbrussel/`) | Concept |
|---|---|
| `Animal/` | encapsulatie: private velden, setter met validatie, overloaded `eating()` |
| `Car/` | vier overloaded constructors, static teller, gedrag (speedUp, toggleLights, nummerplaat) |
| `Circle/` | constructor-chaining met `this(...)`, copy-constructor, static `count`, oppervlakte/omtrek |
| `Rectangle/` | copy-constructor, setters met `Math.abs()`-validatie, `toString()`, `grow()` |
| `Auto.java` + `MainApp.java` | private constructor: object kan enkel mét argumenten gemaakt worden |
| `OefeningRectangle.java` + `MainRectangle.java` | eenvoudige klasse met berekende waarden (area/perimeter) |
| `Oefening1/StudieTracker.java` | veld + getter/setter + do-while in een instantiemethode |
| `Oefening1/Oefening1_1/` | `MinFinder`: kleinste van drie getallen |
| `Oefening1/Oefening1_2/` | `EvenOdd`: zijn alle cijfers even? + `ArithmeticException`-experiment |
| `Oefening1/Oefening1_3/` | `Calculator`: vijf rekenmethodes op één object |
| `Test.java` | expliciete no-arg constructor (wat Java anders impliciet doet) |
| `les3/HerhalingsOpdracht/` | placeholders voor de herhalingsopdracht |
| `extra/ThisDemo.java` | drie toepassingen van `this` (veld, chaining, `return this`) |
| `extra/CompositieDemo.java` | object-compositie: Bestelling → Klant → Adres |

## ⚠️ Pitfalls & interview notes

- **Zodra je zélf een constructor schrijft, verdwijnt de impliciete no-arg constructor** — `new Auto()` compileert niet meer als er enkel `Auto(String, String)` bestaat (of als de no-arg private is).
- **`this(...)` moet de eerste instructie in een constructor zijn** — en je kunt maar één andere constructor per constructor aanroepen.
- **Publieke velden breken encapsulatie** — met `cat.age = -5` omzeil je elke validatie. Maak velden `private` en valideer in de setter (zie `Animal`).
- **`static` methodes kunnen geen instantievelden lezen** — er is immers geen `this`. Vanuit `main` heb je dus altijd eerst een object nodig voor instantiemethodes.
- **Vergeet `@Override` niet bij `toString()`** — zonder override print `println(obj)` iets als `Car@1b6d3586` (klassenaam + hashcode).
- **Copy-constructor maakt een ondiepe kopie** — primitieve velden worden gekopieerd, maar referentievelden zouden naar hetzelfde object blijven wijzen; let daarop zodra je klasse objectvelden heeft.
