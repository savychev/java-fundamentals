# 📙 04 — Arrays & Enums

Working with fixed-size collections (`int[]`, `String[]`, 2D arrays), the `java.util.Arrays` helper class and type-safe constant sets with `enum`.

> 🇳🇱 Arrays zijn vaste rijen van waarden van hetzelfde type; enums zijn een vaste lijst van constanten.
> Deze module toont declareren, itereren, sorteren, zoeken en het gebruik van enums in een switch.

## 📖 Theory in short

- **Declaratie**: `int[] a = new int[10];` (defaultwaarden) of `int[] a = {1, 2, 3};` — de lengte ligt daarna vast.
- **Indexen** starten bij 0; `a.length` is een **veld** (bij `String` is `length()` een methode).
- **Itereren**: klassieke `for` (als je de index nodig hebt), for-each en `while`:

  ```java
  for (int value : myArray) { System.out.println(value); }
  ```

- **`java.util.Arrays`**: `toString()`, `sort()`, `binarySearch()` (enkel op gesorteerde arrays!), `copyOf()`, `equals()`, `fill()`, `deepToString()` voor geneste arrays.
- **2D-arrays**: `new int[2][5]` = 2 rijen van 5 kolommen; itereren met geneste lussen.
- **String ↔ array**: `split()`, `String.join()`, `toCharArray()`.
- **Enum**: vaste set constanten, impliciet `public static final`:

  ```java
  public enum Level { LOW, MEDIUM, HIGH }
  Level l = Level.valueOf("LOW"); // String -> constante
  for (Level x : Level.values()) { System.out.println(x.ordinal()); }
  ```

- Enums kunnen ook **velden, een (private) constructor en methodes** hebben — zie `extra/Planeet.java`.

## 🗂️ File map

| Path | Content |
|---|---|
| `src/be/intecbrussel/les1/ArrayVoorbeeld.java` | Declaratie, initialisatie, element wijzigen, drie manieren van itereren |
| `src/be/intecbrussel/les1/Test.java` | `String.toCharArray()` |
| `src/be/intecbrussel/les2/ArraysClass.java` | `Arrays`: `toString`, `copyOf`, `equals`, `fill`, `sort`, `binarySearch` |
| `src/be/intecbrussel/les2/MultidimensionaleArray.java` | 2D-array met geneste lussen |
| `src/be/intecbrussel/les2/SplitExample.java` / `JoinExample.java` / `ToCharArrayExample.java` | String ↔ array conversies |
| `src/be/intecbrussel/les3/color/` | Eenvoudige enum + `values()`/`ordinal()` |
| `src/be/intecbrussel/les3/level/` | Enum in een `switch` |
| `src/be/intecbrussel/les3/Test.java` | `valueOf()`, `name()`, `ordinal()`, vergelijken met `==` |
| `src/be/intecbrussel/oefening1/` | Basis: declaratie, `charAt`/`length`, even/oneven met for-each |
| `src/be/intecbrussel/oefening2/` | Som (for-each), char-array, gemiddelde met while + cast |
| `src/be/intecbrussel/oefening3/` | Char-array met index, twee arrays element per element swappen |
| `src/be/intecbrussel/oefening4/` | Sorteren op- en aflopend, `copyOf` met langere lengte, duplicaten zoeken |
| `src/be/intecbrussel/oefening5/` | 3D-array + `deepToString`, for-each over 2D-rijen |
| `src/be/intecbrussel/oefening6/` | Enum `Week`: `values()`/`ordinal()` en `valueOf()` + switch met Scanner |
| `src/be/intecbrussel/opdracht1/` | Punten normaliseren (ternaire operator), `ShoePair`-objecten filteren |
| `src/be/intecbrussel/opdracht2/` | `IntArrayTools`: `isSorted`, bubble sort, lineair zoeken |
| `src/be/intecbrussel/test/` | `IntegerArrayUtils`: sorteren, omkeren, statistieken, duplicaten |
| `src/be/intecbrussel/extra/Planeet.java` | Enum met velden, constructor en methodes |

## ⚠️ Pitfalls & interview notes

- `Arrays.binarySearch()` geeft alleen een betrouwbaar resultaat op een **gesorteerde** array; anders is de uitkomst ongedefinieerd.
- `array.length` is een veld, `string.length()` een methode en `list.size()` weer een methode — een klassieke instapvraag.
- `int / int` is integer-deling: cast eerst naar `double` voor een gemiddelde (`(double) sum / n`).
- Arrays zijn objecten: `==` vergelijkt referenties; gebruik `Arrays.equals()` (of `deepEquals()` voor geneste arrays).
- `Collections.reverseOrder()` werkt enkel met object-arrays (`Integer[]`, `String[]`), niet met primitieve arrays zoals `int[]`.
- Enum-constanten mag je wél veilig met `==` vergelijken; `valueOf()` is hoofdlettergevoelig en gooit `IllegalArgumentException` bij een onbekende naam.
- Een lees-index buiten het bereik geeft een `ArrayIndexOutOfBoundsException` — de lengte van een array is na creatie onveranderlijk.
