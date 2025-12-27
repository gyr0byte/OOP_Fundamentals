<div align="center">

# Java OOP Practice Projects

<sub>Hands-on mini-samples + quick games to sharpen fundamentals.</sub>

<br>

`Java` · `OOP` · `Console Games`

</div>

---

> Clean, runnable examples for classes, constructors, inheritance, statics, and a few games to make practice fun.

## Highlights

- Sleek folder map with one-click run targets
- Copy/paste quickstart commands for every package
- Game trio (Quiz, RPS, Slot) to apply concepts immediately

## Folder Map

| Folder                   | Focus                                   | Run Entry                                      |
| ------------------------ | --------------------------------------- | ---------------------------------------------- |
| ObjectAndClass/          | Constructors, fields, and methods       | `Demo`                                         |
| arrayObject/             | Arrays of custom objects                | `arrayObject.Main`                             |
| constructorsOverloading/ | Multiple constructor signatures         | `constructorsOverloading.Main`                 |
| Inheritance/             | Parent-child reuse and overriding       | `Inheritance.Main`                             |
| staticKeyword/           | Class-level members                     | `staticKeyword.Main`, `staticKeyword.MainMath` |
| SuperKeyword/            | `super` for constructors and methods    | `SuperKeyword.Main`                            |
| projects/                | Quiz, Rock-Paper-Scissors, Slot Machine | `QuizGame`, `RockPaperScissors`, `SlotMachine` |

## Prerequisites

- JDK 17+ (any recent LTS works)
- A terminal or Java-friendly editor

## Quickstart

From the repo root:

```bash
# Classes without packages
javac ObjectAndClass/*.java
java Demo

# With packages (compile first, then run)

java arrayObject.Main

javac constructorsOverloading/*.java
java constructorsOverloading.Main

javac Inheritance/*.java
java Inheritance.Main

javac staticKeyword/*.java
java staticKeyword.Main
java staticKeyword.MainMath

javac SuperKeyword/*.java
java SuperKeyword.Main

# Games
javac projects/*.java
java QuizGame
java RockPaperScissors
java SlotMachine
```

## Learning Checklist

- ✅ Classes, objects, and instance vs. static members
- ✅ Constructors and overloading patterns
- ✅ Inheritance and method reuse/overriding
- ✅ Arrays of objects and iteration
- ✅ User-input-driven console games

## Next Steps

- Add input validation and error handling (especially in the games)
- Extend examples to encapsulation, abstraction, interfaces, and polymorphism
- Add lightweight tests for gameplay and utility methods

---

Happy coding! 🎓
