# Java OOP Practice Projects

Short, self-contained Java examples to practice core OOP concepts and a few small console games.

## What's Inside

- **ObjectAndClass/** – basics of classes, constructors, and methods
- **arrayObject/** – working with arrays of custom objects
- **constructorsOverloading/** – multiple ways to construct the same class
- **Inheritance/** – parent/child relationships and method reuse
- **staticKeyword/** – class-level fields/methods
- **SuperKeyword/** – using `super` to reuse parent constructors and methods
- **projects/** – small playable games (Quiz, Rock-Paper-Scissors, Slot Machine)

## Prerequisites

- JDK 17+ (any recent LTS works)
- Java-friendly editor or terminal

## How to Run

From the repo root, compile then run the desired package:

```bash
# Classes without packages
javac ObjectAndClass/*.java
java Demo

# With packages (compile all files in the folder first)
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
- ✅ Basic arrays and object collections
- ✅ Simple user-input driven games

## Next Steps

- Add error handling and validation (especially in the game inputs)
- Extend examples to cover encapsulation, abstraction, and interfaces
- Add unit tests for the games and utility methods

---

Happy coding! 🎓
