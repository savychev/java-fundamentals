# 📓 11 — Exceptions

Exception handling in Java: try/catch/finally, checked vs unchecked, throw/throws and custom exceptions.

> 🇳🇱 Foutafhandeling in Java: de exception-hiërarchie, try/catch/finally, het verschil tussen checked en unchecked exceptions, `throw`/`throws`, eigen exceptions en een eerste blik op try-with-resources.

## 📖 Theory in short

- **Hiërarchie**:

  ```text
  Throwable
  ├── Error                (JVM-fouten: OutOfMemoryError — niet vangen)
  └── Exception            (checked)
      ├── IOException, FileNotFoundException, ...
      └── RuntimeException (unchecked)
          ├── ArithmeticException
          ├── NullPointerException
          ├── NumberFormatException
          └── ClassCastException, ArrayIndexOutOfBoundsException, ...
  ```

- **Checked vs unchecked**:

  | | Checked | Unchecked |
  |---|---|---|
  | Superklasse | `Exception` (behalve `RuntimeException`) | `RuntimeException` |
  | Compiler dwingt vangen/`throws` af | ✅ ja | ❌ nee |
  | Typisch voor | externe omstandigheden (I/O, netwerk) | programmeerfouten (nul-deling, null) |
  | Voorbeelden | `IOException`, `FileNotFoundException` | `ArithmeticException`, `NumberFormatException` |

- **`throw` vs `throws`** — `throw` gooit een exception-object; `throws` declareert in de signatuur dat de methode er één kan doorgeven.

  ```java
  static void registreer(int leeftijd) throws OngeldigeLeeftijdException {
      if (leeftijd < 18) throw new OngeldigeLeeftijdException("te jong");
  }
  ```

- **`finally`** draait altijd — ook na een `return` of een exception in het try-blok.
- **Multi-catch**: `catch (NumberFormatException | ArithmeticException e)` — één blok voor meerdere types; `e` is impliciet final.
- **Try-with-resources**: alles wat `AutoCloseable` is, wordt automatisch gesloten:

  ```java
  try (var in = new FileInputStream("data.txt")) { ... } // close() gebeurt vanzelf
  ```

## 🗂️ File map

| Bestand | Inhoud |
|---|---|
| `src/ArithmeticExceptions.java` | Delen door nul + finally-blok |
| `src/MainApp.java` | ClassCastException (Object → String) |
| `src/NumberFormatExceptionDemo.java` | parseInt op ongeldige tekst, printStackTrace vs getMessage |
| `src/CheckedVsUncheckedDemo.java` | Checked vs unchecked naast elkaar |
| `src/OngeldigeLeeftijdException.java` | Eigen checked exception (`extends Exception`) |
| `src/CustomExceptionDemo.java` | Eigen exception gooien met throw/throws |
| `src/TryWithResourcesDemo.java` | Try-with-resources met een eigen AutoCloseable |
| `src/Order.java` | Static- en instantie-initialisatieblokken |
| `src/OrderDriver.java` | Volgorde van initialisatie aantonen |
| `checkExceptions/src/ArrayIndexOutOfBound.java` | ArrayIndexOutOfBoundsException opvangen |
| `checkExceptions/src/CheckExceptions.java` | Checked exception doorgeven met `throws` |
| `checkExceptions/src/CheckExceptions1.java` | Checked exception vangen en wrappen in RuntimeException |
| `checkExceptions/src/ExceptionFinally.java` | finally draait altijd (ook na return) |
| `checkExceptions/src/ExceptionsCatch.java` | Meerdere catch-blokken + multi-catch |
| `checkExceptions/src/ExceptionsThrow.java` | throw vs throws |
| `checkExceptions/src/NumberFormatExceptions.java` | Parse-fouten netjes afhandelen |

## ⚠️ Pitfalls & interview notes

- **Catch-volgorde**: specifieke exceptions vóór algemene — `catch (Exception e)` vóór `catch (ArithmeticException e)` is een compileerfout (unreachable code).
- **Lege catch-blokken** verbergen fouten ("exception swallowing") — log of meld altijd iets.
- `finally` draait zelfs na een `return` in het try-blok; een `return` **in** `finally` overschrijft de eerdere return-waarde en verbergt exceptions — vermijd dat.
- Interviewvraag: *checked vs unchecked* — checked = compiler dwingt afhandeling af (`extends Exception`), unchecked = niet (`extends RuntimeException`). `Error` vang je nooit.
- Noem een eigen exception-klasse in het default package nooit exact `NumberFormatException`: hij verbergt dan de JDK-klasse en `catch` compileert niet meer (daarom heet de demo hier `NumberFormatExceptionDemo`).
- Bij multi-catch mogen de types geen subklasse van elkaar zijn (`IOException | FileNotFoundException` compileert niet).
- Try-with-resources sluit resources in **omgekeerde volgorde** van declaratie en heeft de voorkeur boven handmatig `close()` in `finally`.
