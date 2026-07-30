# 📓 10 — Nested Classes

Inner, static nested, local and anonymous classes — when each one fits and what it can access.

> 🇳🇱 Geneste klassen in Java: inner classes, static nested classes, lokale en anonieme klassen — wanneer je welke gebruikt en wat elke soort kan zien van de omringende klasse.

## 📖 Theory in short

- **Inner class (niet-static)** — hoort bij een *instantie* van de outer class en leest haar velden rechtstreeks. Aanmaken: `outer.new Inner()`.

  ```java
  OuterClass outer = new OuterClass();
  OuterClass.MathFunctions f = outer.new MathFunctions(); // outer-instantie verplicht
  ```

- **Static nested class** — hoort bij de *klasse*, niet bij een instantie. Geen toegang tot instantievelden van de outer class; wel tot haar `static` leden. Aanmaken zonder outer-instantie:

  ```java
  var f = new OuterClassWithStaticInnerClass.MathFunctionsStatic(3, 4);
  ```

- **Lokale klasse** — gedeclareerd *binnen een methode*; alleen daar zichtbaar en mag effectief-finale lokale variabelen lezen.
- **Anonieme inner class** — klasse zonder naam die ter plekke een interface implementeert of een klasse uitbreidt; sinds Java 8 vaak vervangen door een lambda.

  ```java
  Greeting g = new Greeting() {              // anonieme klasse
      public void greet(String n) { System.out.println("Hoi " + n); }
  };
  Greeting h = n -> System.out.println("Hoi " + n); // lambda-equivalent
  ```

- **Vuistregel**: maak een geneste klasse standaard `static`; laat `static` alleen weg als de klasse echt de outer-instantie nodig heeft.

## 🗂️ File map

| Bestand | Inhoud |
|---|---|
| `src/labWerk/MyMath.java` | Interface voor de rekenoefening (product, division) |
| `src/labWerk/OuterClass.java` | Niet-statische inner class die outer-velden leest |
| `src/labWerk/OuterClassWithStaticInnerClass.java` | Static nested class met eigen velden + overloads |
| `src/labWerk/MainApp.java` | Demo: beide varianten aanmaken en gebruiken |
| `src/labWerk/LocalClassExample.java` | Lokale klasse binnen een methode |
| `src/labWerk/AnonymousInnerClassExample.java` | Anonieme inner class + lambda-equivalent |
| `src/labWerk1/ArithmeticOperations.java` | Interface met alle vijf bewerkingen |
| `src/labWerk1/OuterClass.java` | Inner-class-variant, met bescherming tegen delen door nul |
| `src/labWerk1/OuterClassWithStaticInnerClass.java` | Static-nested-variant |
| `src/labWerk1/OperationPrinter.java` | Print alle bewerkingen via het interface (polymorfisme) |
| `src/labWerk1/MainApp.java` | Demo: beide varianten achter hetzelfde interface |
| `src/staticExamples/OuterClass1.java` | Static nested class naast een instantieveld |
| `src/staticExamples/StaticExample.java` | Wat een static nested class wel/niet kan zien |
| `src/staticExamples/MainApp.java` | Demo bij OuterClass1 |
| `src/staticExamples/StaticExampleMainApp.java` | Demo bij StaticExample |
| `src/staticExamples/StaticNestedVsInnerNote.java` | Wanneer static nested vs. inner (met codevoorbeeld) |

## ⚠️ Pitfalls & interview notes

- Een niet-statische inner class bewaart een **verborgen referentie** naar de outer-instantie (`Outer.this`) — dat kost geheugen en kan een geheugenlek veroorzaken als het inner-object langer leeft dan de outer.
- `outer.new Inner()` is de enige manier om een niet-statische inner class buiten de outer class aan te maken; `new Outer.Inner()` werkt alleen voor **static** nested classes.
- Een static nested class kan **geen** instantievelden van de outer class lezen — wel `static` velden (zie `StaticExample`).
- Lokale en anonieme klassen mogen alleen **effectief-finale** lokale variabelen gebruiken.
- Interviewvraag: *"Waarom is `Map.Entry` een static nested interface?"* — namespacing zonder koppeling aan een `Map`-instantie; hetzelfde patroon als hier.
- Een anonieme klasse kan precies **één** interface implementeren of **één** klasse uitbreiden en heeft geen eigen constructor.
