<div align="center">

![Java OOP Banner](https://capsule-render.vercel.app/api?type=rounded&color=0:2b2d42,100:8d99ae&height=150&text=Java%20OOP%20Practice%20Projects&fontColor=edf2f4&fontSize=32&fontAlign=50&fontAlignY=55)

<sub>Hands-on mini-samples + quick games to sharpen fundamentals.</sub>

<br>

<img alt="Java" src="https://img.shields.io/badge/JDK-17%2B-6cace4?style=for-the-badge&logo=openjdk&logoColor=1b1b1b">
<img alt="OOP" src="https://img.shields.io/badge/Focus-OOP-b7e4c7?style=for-the-badge&logo=databricks&logoColor=1b1b1b">
<img alt="Games" src="https://img.shields.io/badge/Console-Games-f9c5d5?style=for-the-badge&logo=gamepad&logoColor=1b1b1b">

</div>

---

> Clean, runnable examples for classes, constructors, inheritance, statics, and a few games to make practice fun.

## 📑 Table of Contents

- [Highlights](#highlights)
- [Features](#features)
- [Folder Map](#folder-map)
- [Prerequisites](#prerequisites)
- [Quickstart](#quickstart)
- [Learning Checklist](#learning-checklist)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## ✨ Highlights

- 🗂️ Sleek folder map with quick run targets
- 📋 Copy/paste quickstart commands for every package
- 🎮 Game trio (Quiz, RPS, Slot) to apply concepts immediately

## 🚀 Features

- **14 Core OOP Concepts**: From basic classes to advanced polymorphism
- **Interactive Games**: 3 console games (Quiz, Rock-Paper-Scissors, Slot Machine)
- **Ready-to-Run**: Each folder is self-contained with compilation instructions
- **Beginner-Friendly**: Clear examples with minimal boilerplate
- **Modern Java**: Compatible with JDK 17+

## 📂 Folder Map

| Folder                   | Focus                                   | Run Entry                                               |
| ------------------------ | --------------------------------------- | ------------------------------------------------------- |
| ObjectAndClass/          | Constructors, fields, and methods       | `Demo`                                                  |
| arrayObject/             | Arrays of custom objects                | `arrayObject.Main`                                      |
| constructorsOverloading/ | Multiple constructor signatures         | `constructorsOverloading.Main`                          |
| Inheritance/             | Parent-child reuse and overriding       | `Inheritance.Main`                                      |
| Interface/               | Contracts and multiple implementation   | `Interface.Main`                                        |
| MethodOverriding/        | Runtime polymorphism via override       | `MethodOverriding.Main`                                 |
| Polymorphism/            | Single interface, multiple forms        | `Polymorphism.Main`                                     |
| RuntimePolymorphism/     | Dynamic method dispatch at runtime      | `RuntimePolymorphism.Main`, `RuntimePolymorphism.Main2` |
| Abstraction/             | Abstract classes and methods            | `Abstraction.Main`                                      |
| Aggregation/             | Object composition and ownership        | `Aggregation.Main`                                      |
| Encapsulation/           | Access control with getters/setters     | `Encapsulation.Main`                                    |
| staticKeyword/           | Class-level members                     | `staticKeyword.Main`, `staticKeyword.MainMath`          |
| SuperKeyword/            | `super` for constructors and methods    | `SuperKeyword.Main`                                     |
| toString/                | Object string representation            | `toString.Main`                                         |
| projects/                | Quiz, Rock-Paper-Scissors, Slot Machine | `QuizGame`, `RockPaperScissors`, `SlotMachine`          |

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
<summary><b>staticKeyword</b></summary>

```bash
javac staticKeyword/*.java
java staticKeyword.Main
java staticKeyword.MainMath
```

</details>

<details>
<summary><b>SuperKeyword</b></summary>

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
<summary><b>Games (projects)</b></summary>

```bash
javac projects/*.java
java QuizGame
java RockPaperScissors
java SlotMachine
```

</details>

## ✅ Learning Checklist

- ✅ Classes, objects, and instance vs. static members
- ✅ Constructors and overloading patterns
- ✅ Inheritance and method reuse/overriding
- ✅ Interfaces and contract-based design
- ✅ Method overriding and runtime polymorphism
- ✅ Polymorphism and dynamic method dispatch
- ✅ Abstract classes and methods
- ✅ Aggregation and object composition
- ✅ Encapsulation with getters/setters
- ✅ toString() method customization
- ✅ Arrays of objects and iteration
- ✅ User-input-driven console games

## 📁 Project Structure

```
OOP/
├── ObjectAndClass/          # Basic class and object creation
├── arrayObject/             # Working with arrays of custom objects
├── constructorsOverloading/ # Multiple constructor patterns
├── Inheritance/             # Parent-child class relationships
├── Interface/               # Contract-based design with interfaces
├── MethodOverriding/        # Overriding parent methods
├── Polymorphism/            # Single interface, multiple forms
├── RuntimePolymorphism/     # Dynamic method dispatch
├── Abstraction/             # Abstract classes and methods
├── Aggregation/             # Object composition and ownership
├── Encapsulation/           # Access control with getters/setters
├── staticKeyword/           # Class-level vs instance members
├── SuperKeyword/            # Using super in constructors/methods
├── toString/                # Custom string representations
└── projects/                # Console games for practice
    ├── QuizGame.java
    ├── RockPaperScissors.java
    └── SlotMachine.java
```

## 🤝 Contributing

Contributions are welcome! If you'd like to add more examples or improve existing ones:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-example`)
3. Commit your changes (`git commit -m 'Add new OOP example'`)
4. Push to the branch (`git push origin feature/new-example`)
5. Open a Pull Request

## 💡 Next Steps

- Add input validation and error handling (especially in the games)
- Implement encapsulation examples with getters/setters
- Add lightweight tests for gameplay and utility methods
- Create more interactive console projects

## 📄 License

This project is open source and available for educational purposes.

---

<div align="center">

**Happy coding!** 🎓

Made with ❤️ for Java learners

</div>
