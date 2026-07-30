# 📘 Java Fundamentals — Study Handbook

<p>
  <img src="https://img.shields.io/badge/Java-17-007396?logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/topics-12%20%2B%20practice-blue" alt="12 topics">
  <img src="https://img.shields.io/badge/examples-380%2B%20files-brightgreen" alt="380+ examples">
  <img src="https://img.shields.io/badge/notes-NL-orange" alt="Dutch notes">
</p>

My complete, structured study of **core Java**, built up lesson by lesson during the Intec
*Java Ontwikkelaar EE* programme — and reworked into a reference handbook. Every topic folder
is a chapter: commented example code (in Dutch) + a `README.md` conspectus with theory notes,
a file map and interview pitfalls.

> 🇳🇱 Mijn volledige, gestructureerde studie van **core Java**, les per les opgebouwd tijdens
> de Intec-opleiding *Java Ontwikkelaar EE* — en uitgewerkt tot een naslagwerk. Elke map is
> een hoofdstuk: becommentarieerde voorbeeldcode (NL) + een `README.md`-samenvatting met
> theorie, bestandsoverzicht en valkuilen.

---

## 🗂️ Chapters / Hoofdstukken

| # | Chapter | What's inside | Files |
|---|---------|---------------|------:|
| 01 | [Basic Programmeren](01-basic-programmeren) | variables & types, operators, if/switch, loops, methods, Scanner, casting | 74 |
| 02 | [OOP](02-oop) | String & StringBuilder, java.time (LocalDateTime, Duration, formatters), static | 37 |
| 03 | [Classes](03-classes) | classes & objects, constructors, encapsulation, this, getters/setters | 27 |
| 04 | [Arrays & Enums](04-arrays-en-enums) | arrays & 2D arrays, `Arrays` API, split/join, enums with fields & methods | 39 |
| 05 | [Inheritance](05-inheritance) | extends, super(), @Override, protected, final, Object as root | 24 |
| 06 | [Polymorphism](06-polymorphism) | dynamic dispatch, up/downcasting, instanceof, overriding vs overloading | 50 |
| 07 | [Abstraction](07-abstraction) | abstract classes & methods, template method, Null Object pattern | 30 |
| 08 | [Interfaces](08-interfaces) | contracts, multiple implementation, default & static methods | 63 |
| 09 | [Analyse](09-analyse) | UML: class, sequence, use-case & flowchart diagrams (PlantUML) | — |
| 10 | [Nested Classes](10-nested-classes) | inner, static nested, anonymous & local classes | 16 |
| 11 | [Exceptions](11-exceptions) | checked vs unchecked, try/catch/finally, throw & throws, custom exceptions | 16 |
| 12 | [IO](12-io) | File, FileReader/Writer, BufferedReader, try-with-resources, NIO `Files` | 9 |
| ⭐ | [Ervaringsweek](ervaringsweek) | practice week: Snake game built with Swing | 1 |

## 🧭 How this repo is organized / Legenda

The folder layout follows the course rhythm — inside each chapter you'll find:

- **`les1`, `les2`, …** — lesson examples (*les* = lesson): one concept per file
- **`oefening…`** — exercises (*oefening* = exercise) solved during class
- **`opdracht…`** — assignments (*opdracht* = assignment), bigger multi-file tasks
- **`labwerk…`** — lab work sessions
- **`extra`** — examples I added while revising, to close gaps in coverage

Every chapter has its own **`README.md`**: theory in short → file map → pitfalls
& interview notes. All code comments are in **Dutch**, the course language.

## ▶️ Running the examples

Requires **Java 17+**. Every example is a self-contained class with its own `main` —
open the repo in your IDE and run any file, or compile a chapter by hand:

```bash
javac -encoding UTF-8 -d out $(find 05-inheritance -name '*.java')
```

## 🔗 Where to go next

The concepts from this handbook are applied in my projects:
[intec-ep-linguacards](https://github.com/savychev/intec-ep-linguacards) (Spring Boot + Angular eindproject) ·
[online-course-api](https://github.com/savychev/online-course-api) (Spring Boot REST API) ·
[simple-banking-system](https://github.com/savychev/simple-banking-system) (Core Java, layered)
