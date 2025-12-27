# Java OOP Learning Projects

A collection of Object-Oriented Programming (OOP) practice projects and examples in Java. This repository showcases fundamental OOP concepts and practical applications.

## 📁 Project Structure

### **arrayObject/**

Introduction to working with arrays and objects in Java.

- `Car.java` - Car class demonstrating object creation and properties
- `Main.java` - Main class to demonstrate array and object usage

### **constructorsOverloading/**

Demonstrates constructor overloading and multiple ways to initialize objects.

- `User.java` - User class with overloaded constructors
- `Main.java` - Test program showing different constructor implementations

### **Inheritance/**

Explores inheritance and the parent-child class relationship.

- `Animal.java` - Parent class defining common animal attributes and behaviors
- `Dog.java` - Child class inheriting from Animal, demonstrating method overriding

### **ObjectAndClass/**

Basic concepts of creating and using classes and objects.

- `Student.java` - Student class with properties and methods
- `Demo.java` - Demonstration of class instantiation and object usage

### **projects/**

Practical projects combining multiple OOP concepts.

- `QuizGame.java` - Interactive quiz game with multiple-choice questions
- `RockPaperScissors.java` - Classic rock-paper-scissors game implementation
- `SlotMachine.java` - Slot machine game simulator

### **staticKeyword/**

Understanding static variables and methods in Java.

- `Friend.java` - Class demonstrating static variables and methods
- `Main.java` - Test program for static keyword usage
- `MainMath.java` - Mathematical operations using static methods

## 🎯 Learning Objectives

This project covers:

- ✅ Object-oriented programming fundamentals
- ✅ Classes and objects creation
- ✅ Constructors and constructor overloading
- ✅ Inheritance and method overriding
- ✅ Static variables and methods
- ✅ Arrays and object collections
- ✅ Practical game development concepts

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command-line tools

### Running a Program

```bash
# Compile
javac ClassName.java

# Run
java ClassName
```

### Running a Project Example

```bash
# Navigate to the desired folder
cd projects

# Compile and run a game
javac QuizGame.java
java QuizGame
```

## 📝 Topics Covered

| Topic                      | Location                 | Description                                    |
| -------------------------- | ------------------------ | ---------------------------------------------- |
| **Classes & Objects**      | ObjectAndClass/          | Basic class structure and object instantiation |
| **Arrays & Objects**       | arrayObject/             | Working with collections of objects            |
| **Constructors**           | constructorsOverloading/ | Constructor overloading patterns               |
| **Inheritance**            | Inheritance/             | Parent-child class relationships               |
| **Static Members**         | staticKeyword/           | Class-level variables and methods              |
| **Practical Applications** | projects/                | Real-world mini-projects                       |

## 💡 Example Usage

### Creating a Student Object

```java
Student student = new Student("John", 20, "CS001");
```

### Using Inheritance

```java
Animal animal = new Dog();
animal.eating(); // Calls the Dog's implementation
```

### Static Method Usage

```java
Friend.staticMethod(); // No object instance needed
```

## 📚 Learning Path

1. Start with `ObjectAndClass/` - Understand basic class structure
2. Move to `arrayObject/` - Learn about object collections
3. Study `constructorsOverloading/` - Master constructor patterns
4. Explore `Inheritance/` - Understand class hierarchies
5. Practice `staticKeyword/` - Learn static members
6. Build with `projects/` - Apply all concepts in real projects

## 🎮 Interactive Projects

Try running the games in the `projects/` folder to see OOP concepts in action!

- **QuizGame** - Test your knowledge with an interactive quiz
- **RockPaperScissors** - Play the classic game against the computer
- **SlotMachine** - Experience a slot machine simulation

## 📖 Notes

- Each folder is self-contained and can be studied independently
- All code follows basic Java conventions and naming standards
- Comments and clear structure make the code beginner-friendly
- Practical projects demonstrate real-world OOP applications

## 🔧 Improvements & Suggestions

Feel free to:

- Add more OOP concepts (polymorphism, encapsulation, abstraction)
- Enhance the projects with more features
- Add JavaDoc comments for better documentation
- Implement exception handling
- Add user input validation

## 📄 License

This project is for educational purposes as part of a Java OOP course.

---

**Happy Learning!** 🎓
