# 📒 09 — Analyse

This module contains no Java code on purpose: it is about the step that comes *before* code. Analysis means understanding and modelling the problem — who the actors are, what the system must do, how objects collaborate — and writing that down in diagrams that can be discussed and corrected cheaply. Changing a box in a diagram costs a minute; changing a wrongly designed class hierarchy after three sprints costs days. All diagrams here are written in [PlantUML](https://plantuml.com/) (`.puml` files), a text format that renders to UML images (IntelliJ PlantUML plugin, VS Code extension, or plantuml.com).

> 🇳🇱 Deze module bevat bewust geen Java-code: ze gaat over de stap die vóór het coderen komt. Analyse betekent het probleem begrijpen en modelleren — wie de actoren zijn, wat het systeem moet doen, hoe objecten samenwerken — en dat vastleggen in diagrammen die goedkoop te bespreken en te corrigeren zijn.

## 🗂️ The diagrams

### `src/be/intecbrussel/diagrams/classdiagrammMediaplayer.puml` — Class diagram: Adapter pattern

Models the classic **Adapter pattern** with a media player. Two incompatible interfaces exist: `MediaPlayer` (one `play(audioType, fileName)` method) and `AdvancedMediaPlayer` (`playVlc`/`playMp4`). The `MediaAdapter` implements `MediaPlayer` but internally delegates to an `AdvancedMediaPlayer` implementation (`VlcPlayer` or `Mp4Player`), so the client-facing `AudioPlayer` can play formats it doesn't natively support. `AdapterPatternDemo` is the entry point. The diagram shows the realization arrows (`<|..`): who implements which interface.

### `src/be/intecbrussel/diagrams/sequenceDiagramMediaplayer.puml` — Sequence diagram: playing an mp4 through the adapter

The dynamic counterpart of the class diagram above. It traces one call through time: the user starts `main()`, `AdapterPatternDemo` calls `AudioPlayer.play("mp4", "alone.mp4")`, the `AudioPlayer` constructs a `MediaAdapter("mp4")`, which in turn instantiates an `Mp4Player` and forwards the call as `playMp4("alone.mp4")`. Activation bars show which object is "alive" at each moment — a class diagram tells you *who exists*, a sequence diagram tells you *who calls whom, in what order*.

### `src/be/intecbrussel/diagrams/flowchartSportclub.puml` — Flowchart (activity diagram): paying the bill

A small decision flow for checkout at a sports club: the guest asks for the bill, then a decision node splits on payment method — **cash** (receive cash, return change) versus **card** (process the transaction) — after which both branches rejoin to hand over the receipt. Demonstrates the basic flowchart vocabulary: start/stop, actions, and an if/else decision.

### `src/be/intecbrussel/diagrams/usecaseSportclub.puml` — Use-case diagram: the sports club

The bird's-eye view of the same sports club as a system. Four actors — **Leden** (members), **Instructeurs**, **Manager**, and **Receptie** (front desk) — are connected to what they need from the system: members use the sport facilities (pool, gym, tennis courts), manage a subscription and pay (cash or credit card); instructors consult lesson availability; the front desk registers subscriptions and verifies them; the manager oversees operations and plans lessons and events. It also shows the two standard UML relations: `<<include>>` (a subscription always involves the facilities) and `<<extend>>` (optional coaching on top of facility use).

### `src/be/intecbrussel/opdrachten/opdracht1/opdracht1.puml` — Assignment 1: user registration sequence

A sequence diagram for a **user registration flow** with three participants behind the user: a registration service, a user database, and an e-mail service. It models both the happy path (open form → submit data → check username availability → save account → send confirmation mail → confirm to user) and the failure path (username already exists → error message). A good example of why analysis matters: the error branch is designed *before* anyone writes an `if`.

## 🧭 Why analysis before code

- **Cheap iteration** — stakeholders can veto a use-case diagram in a meeting; they cannot review 2,000 lines of Java.
- **Shared vocabulary** — actors, use cases, and class names agreed in diagrams become the names in the code (ubiquitous language).
- **Edge cases surface early** — the registration assignment models the "username taken" path explicitly; flows force you to ask "and what if not?".
- **Right diagram, right question** — use case = *what and for whom*, class diagram = *static structure*, sequence = *interaction over time*, flowchart = *decision logic*. Together they describe a system before it exists.
