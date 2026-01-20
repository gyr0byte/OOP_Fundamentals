<div align="center">

![Java OOP Banner](https://capsule-render.vercel.app/api?type=rounded&color=0:2b2d42,100:8d99ae&height=150&text=Java%20OOP%20Practice%20Projects&fontColor=edf2f4&fontSize=32&fontAlign=50&fontAlignY=55)

<br>
<img alt="OOP" src="https://img.shields.io/badge/Focus-OOP-b7e4c7?style=for-the-badge&logo=databricks&logoColor=1b1b1b">
<img alt="Games" src="https://img.shields.io/badge/Console-Games-f9c5d5?style=for-the-badge&logo=gamepad&logoColor=1b1b1b">

</div>

---

## 📑 Table of Contents

- [✨ Highlights](#-highlights)
- [📂 Folder Map](#-folder-map)
- [📋 Prerequisites](#-prerequisites)
- [🚀 Quickstart](#-quickstart)
- [✅ Learning Checklist](#-learning-checklist)
- [📁 Project Structure](#-project-structure)
- [🤝 Contributing](#-contributing)
- [💡 Next Steps](#-next-steps)
- [📄 License](#-license)

## ✨ Highlights

- **17+ Core OOP Concepts**: From basic classes to advanced polymorphism
- **Ready-to-Run**: Each folder is self-contained with compilation instructions
- **Beginner-Friendly**: Clear examples with minimal boilerplate
- 📋 Copy/paste quickstart commands for every package
- 🎮 Console games included for hands-on practice

## 📂 Folder Map

| Folder                   | Focus                                      | Run Entry                                                                                      |
| ------------------------ | ------------------------------------------ | ---------------------------------------------------------------------------------------------- |
| ObjectAndClass/          | Basic class and object creation            | `Demo` (no package)                                                                            |
| arrayObject/             | Arrays of custom objects                   | `arrayObject.Main`                                                                             |
| ArrayList/               | Using `ArrayList` and `Collections`        | `ArrayList.Main`                                                                               |
| constructorsOverloading/ | Multiple constructor signatures            | `constructorsOverloading.Main`                                                                 |
| Composition/             | Has-a relationship (car with engine)       | `Composition.Main`                                                                             |
| Inheritance/             | Parent-child reuse and overriding          | `Inheritance.Main`                                                                             |
| Interface/               | Contracts via interfaces                   | `Interface.Main`                                                                               |
| MethodOverriding/        | Runtime polymorphism via override          | `MethodOverriding.Main`                                                                        |
| RuntimePolymorphism/     | Dynamic dispatch examples                  | `RuntimePolymorphism.Main`, `RuntimePolymorphism.Main2`                                        |
| Polymorphism/            | Single interface, multiple forms           | `Polymorphism.Main`                                                                            |
| Abstraction/             | Abstract classes and methods               | `Abstraction.Main`                                                                             |
| Aggregation/             | Object composition and ownership           | `Aggregation.Main`                                                                             |
| Encapsulation/           | Access control with getters/setters        | `Encapsulation.Main`                                                                           |
| ExceptionHandling/       | Try/catch/finally and common exceptions    | `ExceptionHandling.Main`                                                                       |
| FileHandling/            | File I/O with readers and writers          | `FileHandling.FileReaderr`, `FileHandling.FileWriterr`                                         |
| DatesandTime/            | Java Date/Time API and manipulation        | `DatesandTime.dates`, `DatesandTime.MoreDates`                                                 |
| AnonymousClasses/        | Anonymous inner classes and interfaces     | `AnonymousClasses.Main`                                                                        |
| staticKeyword/           | Class-level members                        | `staticKeyword.Main`, `staticKeyword.MainMath`                                                 |
| SuperKeyword/            | `super` for constructors and methods       | `SuperKeyword.Main`                                                                            |
| toString/                | Object string representation               | `toString.Main`                                                                                |
| TimerTask/               | Scheduling tasks with `Timer`              | `TimerTask.TimerTasks`                                                                         |
| Generics/                | Generics and type safety                   | `Generics.Main`                                                                                |
| HashMap/                 | Using `HashMap` for key-value storage      | `HashMap.Main`                                                                                 |
| MultiThreading/          | Multithreading examples (Thread, Runnable) | `MultiThreading.Main`                                                                          |
| projects/                | Quiz, RPS, Slot, Audio, Hangman, Countdown | `QuizGame`, `RockPaperScissors`, `SlotMachine`, `AudioPlayer`, `HangManGame`, `CountdownTimer` |

## 📋 Prerequisites

- JDK 17+ (any recent LTS works)
- A terminal or Java-friendly editor

## 🚀 Quickstart

From the repo root:

<details>
<summary><b>ObjectAndClass (no package)</b></summary>

```bash
javac ObjectAndClass/*.java
java Demo
```

</details>

<details>
<summary><b>arrayObject</b></summary>

```bash
javac arrayObject/*.java
java arrayObject.Main
```

</details>

<details>
<summary><b>ArrayList</b></summary>

Includes a user-input example in `UserInput` (builds an `ArrayList<String>` from console input).

```bash
javac ArrayList/*.java
java ArrayList.Main
java ArrayList.UserInput
```

</details>

<details>
<summary><b>Composition</b></summary>

```bash
javac Composition/*.java
java Composition.Main
```

</details>

<details>
<summary><b>constructorsOverloading</b></summary>

```bash
javac constructorsOverloading/*.java
java constructorsOverloading.Main
```

</details>

<details>
<summary><b>Inheritance</b></summary>

```bash
javac Inheritance/*.java
java Inheritance.Main
```

</details>

<details>
<summary><b>Interface</b></summary>

```bash
javac Interface/*.java
java Interface.Main
```

</details>

<details>
<summary><b>MethodOverriding</b></summary>

```bash
javac MethodOverriding/*.java
java MethodOverriding.Main
```

</details>

<details>
<summary><b>Polymorphism</b></summary>

```bash
javac Polymorphism/*.java
java Polymorphism.Main
```

</details>

<details>
<summary><b>RuntimePolymorphism</b></summary>

```bash
javac RuntimePolymorphism/*.java
java RuntimePolymorphism.Main
java RuntimePolymorphism.Main2
```

</details>

<details>
<summary><b>Abstraction</b></summary>

```bash
javac Abstraction/*.java
java Abstraction.Main
```

</details>

<details>
<summary><b>Aggregation</b></summary>

```bash
javac Aggregation/*.java
java Aggregation.Main
```

</details>

<details>
<summary><b>Encapsulation</b></summary>

```bash
javac Encapsulation/*.java
java Encapsulation.Main
```

</details>

<details>
<summary><b>ExceptionHandling</b></summary>

```bash
javac ExceptionHandling/*.java
java ExceptionHandling.Main
```

</details>

<details>
<summary><b>FileHandling</b></summary>

Demonstrates file I/O operations with `FileWriter` and `FileReader`.

```bash
javac FileHandling/*.java
java FileHandling.FileWriterr
java FileHandling.FileReaderr
```

</details>

<details>
<summary><b>DatesandTime</b></summary>

Explores Java's Date and Time APIs with practical examples.

```bash
javac DatesandTime/*.java
java DatesandTime.dates
java DatesandTime.MoreDates
```

</details>

<details>
<summary><b>AnonymousClasses</b></summary>

Demonstrates anonymous inner classes and implementing interfaces without explicit class definitions.

```bash
javac AnonymousClasses/*.java
java AnonymousClasses.Main
```

</details>

<details>
<summary><b>staticKeyword</b></summary>

Demonstrates static members, methods, and how they differ from instance members.

```bash
javac staticKeyword/*.java
java staticKeyword.Main
java staticKeyword.MainMath
java staticKeyword.Friend
```

</details>

<details>
<summary><b>SuperKeyword</b></summary>

Explores the `super` keyword for calling parent constructors and methods.

```bash
javac SuperKeyword/*.java
java SuperKeyword.Main
```

</details>

<details>
<summary><b>toString</b></summary>

```bash
javac toString/*.java
java toString.Main
```

</details>

<details>
<summary><b>TimerTask</b></summary>

Demonstrates task scheduling and execution using Java's `Timer` and `TimerTask` classes for delayed and periodic actions.

```bash
javac TimerTask/*.java
java TimerTask.TimerTasks
```

</details>

<details>
<summary><b>Generics</b></summary>

Demonstrates generics for type-safe collections and classes.

```bash
javac Generics/*.java
java Generics.Main
```

</details>

<details>
<summary><b>HashMap</b></summary>

Demonstrates using HashMap for key-value data storage and retrieval.

```bash
javac HashMap/*.java
java HashMap.Main
```

</details>

<details>
<summary><b>MultiThreading</b></summary>

Demonstrates basic thread creation and `Runnable` usage.

```bash
javac MultiThreading/*.java
java MultiThreading.Main
```

</details>

<details>
<summary><b>Games (projects)</b></summary>

```bash
javac projects/*.java
java QuizGame
java RockPaperScissors
java SlotMachine
java AudioPlayer
java HangManGame
java CountdownTimer
```

HangManGame loads its word list from `projects/words.txt`—keep that file alongside the compiled class.

</details>

## ✅ Learning Checklist

- ✅ Classes, objects, and instance vs. static members
- ✅ Arrays of objects and iteration
- ✅ Constructors and overloading patterns
- ✅ Composition (has-a relationship)
- ✅ `ArrayList` operations and `Collections.sort()`
- ✅ Inheritance and method reuse/overriding
- ✅ Interfaces and contract-based design
- ✅ Method overriding and runtime polymorphism
- ✅ Polymorphism and dynamic method dispatch
- ✅ Runtime polymorphism and dynamic dispatch
- ✅ Abstract classes and methods
- ✅ Aggregation and object composition
- ✅ Encapsulation with getters/setters
- ✅ Exception handling with try/catch/finally
- ✅ File handling with readers and writers
- ✅ Date and Time manipulation with Java APIs
- ✅ Anonymous inner classes and interface implementation
- ✅ Static keyword and class-level members
- ✅ Super keyword for constructors and methods
- ✅ toString() method customization
- ✅ Timer and TimerTask for task scheduling
- ✅ Generics for type-safe collections
- ✅ HashMap for key-value data structures
- ✅ Multithreading basics (Thread, Runnable)
- ✅ User-input-driven console games

## 📁 Project Structure

```
OOP/
├── Abstraction/             # Abstract classes and methods
│   ├── Circle.java
│   ├── Main.java
│   ├── Rectangle.java
│   ├── Shape.java
│   └── Triangle.java
├── Aggregation/            # Object composition and ownership
│   ├── Book.java
│   ├── Library.java
│   └── Main.java
├── AnonymousClasses/       # Anonymous inner classes and interfaces
│   ├── Dog.java
│   └── Main.java
├── ArrayList/              # Java ArrayList basics + Collections
│   ├── Main.java
│   └── UserInput.java
├── arrayObject/            # Working with arrays of custom objects
│   ├── Car.java
│   └── Main.java
├── Composition/            # Has-a relationship (car with engine)
│   ├── Car.java
│   ├── Engine.java
│   └── Main.java
├── constructorsOverloading/# Multiple constructor patterns
│   ├── Main.java
│   └── User.java
├── DatesandTime/           # Java Date and Time API examples
│   ├── dates.java
│   └── MoreDates.java
├── Encapsulation/          # Access control with getters/setters
│   ├── Car.java
│   └── Main.java
├── ExceptionHandling/      # Try/catch/finally and exception types
│   └── Main.java
├── FileHandling/           # File I/O with readers and writers
│   ├── FileReaderr.java
│   ├── FileWriterr.java
│   └── output.txt
├── Generics/               # Generics for type-safe collections
│   ├── Box.java
│   ├── Main.java
│   └── Product.java
├── HashMap/                # Key-value data structures with HashMap
│   └── Main.java
├── Inheritance/            # Parent-child class relationships
│   ├── Animal.java
│   ├── Cat.java
│   ├── Dog.java
│   ├── Main.java
│   ├── Organism.java
│   └── Plant.java
├── Interface/              # Contract-based design with interfaces
│   ├── Fish.java
│   ├── Hawk.java
│   ├── Main.java
│   ├── Predator.java
│   ├── Prey.java
│   └── Rabbit.java
├── MethodOverriding/       # Overriding parent methods
│   ├── Animal.java
│   ├── Cat.java
│   ├── Dog.java
│   ├── Fish.java
│   └── Main.java
├── MultiThreading/         # Multithreading examples
│   ├── Main.java
│   └── MultiRunnable.java
├── ObjectAndClass/         # Basic class and object creation
│   ├── Demo.java
│   └── Student.java
├── Polymorphism/           # Single interface, multiple forms
│   ├── Bike.java
│   ├── Boat.java
│   ├── Car.java
│   ├── Main.java
│   └── Vehicle.java
├── projects/               # Console games and utilities
│   ├── AudioPlayer.java
│   ├── CountdownTimer.java
│   ├── HangManGame.java
│   ├── Music.wav
│   ├── QuizGame.java
│   ├── RockPaperScissors.java
│   ├── SlotMachine.java
│   └── words.txt
├── RuntimePolymorphism/    # Dynamic method dispatch
│   ├── Animal.java
│   ├── Cat.java
│   ├── Dog.java
│   ├── Emp.java
│   ├── Main.java
│   ├── Main2.java
│   ├── Person.java
│   └── Ram.java
├── staticKeyword/          # Class-level vs instance members
│   ├── Friend.java
│   ├── Main.java
│   └── MainMath.java
├── SuperKeyword/           # Using super in constructors/methods
│   ├── Employee.java
│   ├── Main.java
│   ├── Person.java
│   └── Student.java
├── TimerTask/              # Task scheduling with Timer and TimerTask
│   └── TimerTasks.java
└── toString/               # Custom string representations
    ├── Car.java
    └── Main.java
```

## 🤝 Contributing

Contributions are welcome! If you'd like to add more examples or improve existing ones:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-example`)
3. Commit your changes (`git commit -m 'Add new OOP example'`)
4. Push to the branch (`git push origin feature/new-example`)
5. Open a Pull Request

## 💡 Next Steps

- Add input validation and user-facing error handling (focus: `projects/` games — input parsing, file I/O, game loops)
- Implement encapsulation examples with clear getters/setters and small usage samples
- Add lightweight tests (recommendation: JUnit 5). Place tests under a `test/` or `src/test/java` layout and include simple unit tests for gameplay logic and utilities
- Create more interactive console projects and document run/usage examples in each project's folder

## 📄 License

This project is open source and available for educational purposes.

---

<div align="center">

**Happy coding!** 🎓

Made with ❤️ for Java learners

</div>
