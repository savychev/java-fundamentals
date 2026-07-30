# 📘 02 — OOP & core klassen

Working with the core JDK classes: `String`, `StringBuilder`, `Math`, wrapper classes and the `java.time` API.

> 🇳🇱 In deze module leer je werken met de belangrijkste ingebouwde klassen van Java: tekst bewerken met `String` en `StringBuilder`, rekenen met `Math`, primitieven verpakken in wrapper-klassen en datums/tijden beheren met de `java.time`-API.

## 📖 Theory in short

- **String is immutable** — elke methode (`toUpperCase()`, `replace()`, `substring()`, ...) geeft een *nieuw* object terug; het origineel verandert nooit.

  ```java
  String s = "intec";
  s.toUpperCase();          // doet niets met s
  s = s.toUpperCase();      // resultaat zelf opvangen -> "INTEC"
  ```

- **StringBuilder is mutable** — `append()`, `insert()` en `reverse()` wijzigen het object zelf. Veel sneller dan `+` in een lus.

  ```java
  StringBuilder sb = new StringBuilder("Hello");
  sb.append(" world").reverse();   // wijzigt sb zelf
  ```

- **`equals()` vs `==`** — `==` vergelijkt referenties, `equals()` vergelijkt inhoud. Literals delen één object via de *string pool*; `new String(...)` maakt altijd een nieuw object.

- **Wrapper-klassen** — elk primitief type heeft een object-variant (`int` → `Integer`, `char` → `Character`). *Autoboxing* en *unboxing* gebeuren automatisch.

- **`Math` & `Random`** — `Math` heeft enkel `static` methodes (`abs`, `max`, `pow`, `ceil`, `floor`, `random`); `java.util.Random` genereert waarden per type (`nextInt(bound)` is exclusief de bovengrens).

- **`java.time` in één oogopslag**

  | Klasse | Betekenis |
  |---|---|
  | `LocalDate` / `LocalTime` / `LocalDateTime` | datum en/of tijd zonder tijdzone |
  | `Instant` | machinetijdstip op de UTC-tijdlijn (sinds epoch 1970) |
  | `OffsetDateTime` | datum + tijd + UTC-offset (bv. `+02:00`) |
  | `Period` | duur in jaren/maanden/dagen (datum-gebaseerd) |
  | `Duration` | duur in uren/minuten/seconden (tijd-gebaseerd) |
  | `ChronoUnit` | verschil in één gekozen eenheid (`YEARS.between(...)`) |
  | `DateTimeFormatter` | patroon-gebaseerd formatteren (`dd-MM-yyyy HH:mm:ss`) |

  Alle `java.time`-types zijn **immutable**: `plusMonths(6)` geeft een nieuw object terug.

## 🗂️ File map

| Locatie (onder `src/be/intecbrussel/`) | Concept |
|---|---|
| `les1/StringMethods.java` | veelgebruikte `String`-methodes |
| `les1/StringImmutability.java` | waarom een String nooit verandert |
| `les1/StringBuilderMethods.java` | `append`, `insert`, `toString`, `reverse` |
| `les1/StringBuilderVsString.java` | snelheidsverschil `+=` vs `append()` gemeten |
| `les1/Test.java` | valkuil: `reverse()` wijzigt het originele StringBuilder-object |
| `les1/MathMethods.java` | `Math`: `abs`, `round`, `max`, `ceil`, `floor`, `random`, `pow` |
| `les1/MethodOverloading.java` | zelfde naam, andere parameterlijst |
| `les1/StaticMembers.java` | `static` teller gedeeld door alle objecten |
| `les1/Oefening1/` | substring, contains, afwisselend hoofd-/kleine letters (2 oplossingen) |
| `les1/Oefening2/` | palindroomtest met `reverse()`, StringBuilder → String |
| `les1/Oefening4/` | `Math.max`, `Math.pow`, `Math.random` + even/oneven |
| `les2/Method_Equals.java` | `equals()` vs `==`, string pool |
| `les2/WrapperClasses.java` | autoboxing en unboxing van alle acht types |
| `les2/Class_Random.java` | `Random`: nextBoolean/Double/Float/Int |
| `les2/Class_LocalDateTime.java` | `LocalDate`, `LocalTime`, `LocalDateTime` |
| `les2/Class_Instant.java` | `Instant.now()` en `Instant.EPOCH` |
| `les2/Class_OffsetDateTime.java` | datum/tijd met UTC-offset |
| `les2/Class_Period.java` | verschil in jaren/maanden/dagen |
| `les2/Class_Duration.java` | verschil in seconden |
| `les2/Class_ChronoUnit.java` | verschil in één gekozen eenheid |
| `les2/Class_DateTimeFormatter.java` | datum/tijd formatteren met een patroon |
| `les2/Oefening5/` | random-getallen, lotto, raadspelletje met `Scanner` |
| `les2/Oefening6/` | wrapper `toString()` + `equals()` |
| `les2/Oefening7/` | now(), formatteren, leeftijd berekenen met `Period` |
| `les2/Oefening8/` | autoboxing, `Float` → `String` → `length()` |

## ⚠️ Pitfalls & interview notes

- **Vergelijk Strings nooit met `==`** — het werkt "toevallig" bij literals (string pool) maar faalt bij `new String(...)` of runtime-opgebouwde tekst. Altijd `equals()` (of `equalsIgnoreCase()`).
- **`StringBuilder.reverse()` muteert het origineel** — het geeft dezelfde builder terug, geen kopie. Bewaar eerst `toString()` als je het origineel nog nodig hebt (zie `les1/Test.java`).
- **String-concatenatie in een lus is O(n²)** — elke `+=` kopieert de hele string. Gebruik `StringBuilder` zodra je in een lus tekst opbouwt.
- **`substring(begin, end)`: end is exclusief** — `"Hello".substring(0, 3)` geeft `"Hel"`. Zelfde geldt voor `nextInt(bound)`: de bovengrens doet nooit mee.
- **`Period` ≠ `Duration`** — `Period` telt in kalendereenheden (jaren/maanden/dagen), `Duration` in exacte tijd (seconden/nano's). Voor leeftijd gebruik je `Period`, voor doorlooptijd `Duration`.
- **Autoboxing kan `NullPointerException` geven** — een `Integer` die `null` is en naar `int` ge-unboxed wordt, crasht. Wees voorzichtig met wrappers als retourtypes.
