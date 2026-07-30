# 📗 01 — Basic Programmeren

The absolute basics of Java: variables, primitive types, operators, conditions (`if`/`switch`), loops and console input with `Scanner`.

> 🇳🇱 De absolute basis van Java: variabelen, primitieve types, operatoren, voorwaarden (`if`/`switch`), lussen en console-invoer met `Scanner`. Elke les bevat voorbeelden plus bijhorende oefeningen.

## 📖 Theory in short

- **Variabelen & primitieve types** — 8 primitieven; let op de suffixen: `long x = 10_000_000L;`, `float f = 12.5f;`. `char` is een numeriek type (`'A' + 1 == 'B'`), `boolean` is `true`/`false`. `String` is géén primitief maar een klasse.
- **Rekenkundige operatoren** — `+ - * / %`. Gehele deling kapt af: `10 / 20 == 0`; `%` geeft de rest: `10 % 3 == 1`. Pre-increment `++b` verhoogt eerst en geeft dan de waarde terug.
- **Samengestelde toewijzing** — `c += a` is kort voor `c = c + a`; idem `-=`, `*=`, `/=`, `%=`.
- **Vergelijkings- en logische operatoren** — `== != > < >= <=` leveren een `boolean` op; combineren met `&&` (EN), `||` (OF), `!` (NIET). `&&`/`||` zijn short-circuit: de rechterkant wordt alleen geëvalueerd als dat nog nodig is.
- **Condities** — `if / else if / else`: de eerste ware tak wint. Ternaire operator als korte if/else: `String s = n % 2 == 0 ? "even" : "odd";`
- **Switch** — `switch (day) { case 1: ...; break; default: ...; }`. Zonder `break` treedt *fall-through* op: alle volgende cases lopen mee. Meerdere labels mogen bewust één blok delen (zie `les3/Oefening3.java`).
- **Lussen** — `for (init; voorwaarde; update)` voor een gekend aantal iteraties; `while` controleert de voorwaarde vóóraf; `do-while` controleert achteraf en draait dus **altijd minstens één keer**. `break` stopt de hele lus, `continue` slaat één iteratie over.
- **Scanner-invoer** — `new Scanner(System.in)` met `nextLine()`, `nextInt()`, `nextDouble()`. Valideer met `hasNextInt()` vóór je `nextInt()` aanroept.
- **Casting** — *widening* gaat automatisch (`double d = 253;`), *narrowing* vereist een expliciete cast en kapt af: `(int) 10.99 == 10`.
- **Methoden & overloading** — zelfde naam, verschillende parameterlijst; de compiler kiest op basis van de argumenten (zie `extra/MethodenEnOverloading.java`).

## 🗂️ File map

| Locatie | Concept |
|---|---|
| `src/be/intecbrussel/` (`Les1`, `Les2`, `MyArithmetic`, `MyScanner`, `Oefening1-5`) | Variabelen, primitieve types (`int`, `long`, `char`, `boolean`, `String`), rekenkundige operatoren, Scanner-invoer |
| `src/be/intecbrussel/les2/` (`Voorbeeld1-3`, `Oefening1-4`) | Vergelijkings-, logische en samengestelde toewijzingsoperatoren; `float`/`short`; impliciete conversie |
| `src/be/intecbrussel/les3/` (`IfCondition`, `IfElseCondition`, `IfElseIfCondition`, `Operator*`, `ConditionalOperator`, `StatementSwitch`, `FallThrough`, `Oefening1-5`, `Test`) | `if`/`else`, logische operatoren in condities, ternaire operator, `switch` + fall-through, invoervalidatie |
| `src/be/intecbrussel/les4/` (`LoopFor*`, `LoopWhile*`, `LoopDoWhile*`, `Oefening1-5`, `Test`) | `for`, `while`, `do-while`, `break`/`continue`, widening en expliciete casts |
| `src/be/intecbrussel/extra/MethodenEnOverloading.java` | Methoden definiëren, returnwaarden, method overloading |
| `src/Opdracht1/` (`ForExample1-7`, `WhileExample1-5`) | Lusvariaties: aftellen, modulo-filters, exponentiële stappen, `char`-lussen, invoervalidatie in een oneindige lus |
| `src/Opdracht2/` (`Opd1LoopFor` … `Opd7Geometry`) | Toegepaste opgaven: nettoloon (if/else), korting (gestapelde if's), samengestelde interest (while), examenlogica (`&&`), oppervlakte-menu (switch) |
| `src/Opdracht3/` (`Oefening1-4`) | Switch cijfer-naar-woord, geneste ternaire operatoren, even/oneven, slagen/zakken |

## ⚠️ Pitfalls & interview notes

- **`int / int` is gehele deling** — `(a + b) / 5` gooit decimalen weg; cast eerst naar `double` als je een echt gemiddelde wilt.
- **`==` vergelijkt, `=` wijst toe** — en voor `String`-inhoud gebruik je `.equals()`, nooit `==`.
- **Vergeten `break` in een `switch`** — veroorzaakt fall-through door álle volgende cases; soms gewenst (gedeelde labels), meestal een bug.
- **`do-while` draait altijd minstens één keer** — ook als de voorwaarde vanaf het begin onwaar is (zie `les4/LoopDoWhile2.java`); klassieke examenvraag.
- **`continue` in een `while`-lus** — verhoog de teller vóór `continue`, anders krijg je een oneindige lus (in een `for` gebeurt de update automatisch).
- **`Scanner.nextInt()` laat de newline staan** — een volgende `nextLine()` leest dan een lege string; valideer bovendien met `hasNextInt()` om een `InputMismatchException` te vermijden.
