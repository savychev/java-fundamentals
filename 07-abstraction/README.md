# 📔 07 — Abstraction

Abstract classes and methods in Java: hiding implementation details behind a common contract, plus the Null Object and Template Method patterns.

> 🇳🇱 Abstracte klassen en methodes in Java: implementatiedetails verbergen achter een gemeenschappelijk contract, met daarbovenop het Null Object- en het Template Method-patroon.

## 📖 Theory in short

- Een **abstracte klasse** kan **niet geïnstantieerd** worden — `new Animal()` is een compileerfout. Ze dient als sjabloon voor subklassen.

  ```java
  abstract class Animal {
      public abstract void animalSound(); // geen body
      public void sleep() { System.out.println("Zzz"); }
  }
  Animal a = new Dog(); // OK — referentietype abstract, objecttype concreet
  ```

- Een **abstracte methode** heeft geen body en **dwingt** elke concrete subklasse tot een implementatie. Wie niet implementeert, moet zelf abstract worden.
- Een abstracte klasse mag (anders dan een interface) **velden, constructors en concrete methodes** bevatten. De constructor wordt via `super()` uitgevoerd bij het aanmaken van een subklasse (`oefening6/oefening2`).
- **Null Object-patroon** (`customer`): geef nooit `null` terug, maar een neutraal "leeg" object (`NullCustomer`). De aanroeper hoeft dan nergens op `null` te testen:

  ```java
  AbstractCustomer klant = CustomerFactory.getCustomer("Bob"); // nooit null
  System.out.println(klant.getName()); // veilig, geen NullPointerException
  ```

- **Template Method-patroon** (`les1/WarmeDrank`): een `final` methode legt de volgorde van het algoritme vast; subklassen vullen alleen de variabele stappen in.
- **Abstracte klasse vs. interface**: zie de vergelijkingstabel in [../08-interfaces/README.md](../08-interfaces/README.md#-theory-in-short) en het gecombineerde voorbeeld `les1/AbstractVsInterfaceDemo.java`.

## 🗂️ File map

| Path | Wat het toont |
|------|---------------|
| [src/les1/Animal.java](src/les1/Animal.java) / [Dog.java](src/les1/Dog.java) / [MainApp.java](src/les1/MainApp.java) | Basis: abstracte methode + concrete methode + polymorfisme |
| [src/les1/Vorm.java](src/les1/Vorm.java) / [Cirkel.java](src/les1/Cirkel.java) / [Rechthoek.java](src/les1/Rechthoek.java) | Abstract vs. concreet; verplichte implementatie |
| [src/les1/WarmeDrank.java](src/les1/WarmeDrank.java) / [Koffie.java](src/les1/Koffie.java) / [Thee.java](src/les1/Thee.java) | Template Method-patroon |
| [src/les1/AbstractVsInterfaceDemo.java](src/les1/AbstractVsInterfaceDemo.java) | Abstracte klasse en interface in één voorbeeld |
| [src/les1/VormenMainApp.java](src/les1/VormenMainApp.java) | Demo van de Vorm- en WarmeDrank-voorbeelden |
| [src/oefening6/oefening1/](src/oefening6/oefening1/) | `Bank` abstract, `BankA/B/C` concrete invullingen |
| [src/oefening6/oefening2/](src/oefening6/oefening2/) | Constructor van een abstracte klasse; referentietype bepaalt zichtbaarheid |
| [src/customer/AbstractCustomer.java](src/customer/AbstractCustomer.java) | Abstracte basisklasse van het Null Object-patroon |
| [src/customer/RealCustomer.java](src/customer/RealCustomer.java) | De "echte" klant |
| [src/customer/NullCustomer.java](src/customer/NullCustomer.java) | Het null object: veilig standaardgedrag i.p.v. `null` |
| [src/customer/CustomerFactory.java](src/customer/CustomerFactory.java) | Factory die nooit `null` teruggeeft |
| [src/customer/MainApp.java](src/customer/MainApp.java) | Demo zonder één null-check |
| [src/robots/](src/robots/) | Overerving met `Robot`, `BendingRobot`, `LiftingRobot`, `CrazyRobot` (override in constructor!) |
| [src/Main.java](src/Main.java) | Startpunt van het hoofdstuk |

## ⚠️ Pitfalls & interview notes

- `new` op een abstracte klasse compileert niet — maar een abstracte klasse **heeft wel een constructor**, die via `super()` loopt. Klassieke strikvraag.
- Een subklasse die niet **alle** abstracte methodes implementeert, moet zelf `abstract` verklaard worden.
- Een abstracte klasse **zonder** abstracte methodes is toegestaan (handig om instantiatie te blokkeren); een abstracte methode kan alleen in een abstracte klasse.
- Overridebare methodes aanroepen in een constructor (zoals `Robot.boot()`) is riskant: de override draait terwijl de subklasse nog niet volledig geïnitialiseerd is — zie `CrazyRobot`.
- `abstract` combineert niet met `final`, `private` of `static`: die drie sluiten overriding juist uit.
- Null Object-patroon: ideaal antwoord op "hoe vermijd je `NullPointerException` zonder overal `if (x != null)` te schrijven?"
