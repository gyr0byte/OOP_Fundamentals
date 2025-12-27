# Java OOP Practice Projects

Short, self-contained Java examples to practice core OOP concepts and a few small console games.

## What's Inside

# Java OOP Practice Projects

Hands-on Java OOP mini-samples plus a few console games to practice fundamentals fast.

## Highlights

- Clear, bite-sized examples for each concept
- Ready-to-run commands for every folder
- Small games to make learning stick

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
javac arrayObject/*.java
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
