# Java OOP Fundamentals

![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

![Java Build](https://github.com/TheComputationalCore/java-oop-foundations/actions/workflows/java-build.yml/badge.svg)


This repository contains Java programs demonstrating fundamental Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, and basic class design. It includes four tasks (1.1 to 1.4), each illustrating a different OOP principle.

---

## 📁 Project Structure

```
src/
├── Account.java
├── Person.java
├── Person_2.java
├── Product.java
├── XYZ.java
├── screenshots/
│   ├── 1.1.png
│   ├── 1.2.a.png
│   ├── 1.2.b.png
│   ├── 1.3.png
│   └── 1.4.png
└── README.md
└── LICENSE
```

---

## 📝 Tasks Overview

### **Task 1.1 – Person Class**
- Implements a `Person` class with `name` and `age`.
- Default age is set to **18**.
- Uses constructors and a display method.

📸 **Screenshot:**  
![Task 1.1](screenshots/1.1.png)

---

### **Task 1.2 – Product Class**
Defines a `Product` class and a main driver that:
- Accepts details of **5 products**
- Finds the product with the **highest price**
- Computes **total amount spent** (price × quantity)

📸 **Screenshots:**  
![1.2.a](screenshots/1.2.a.png)  
![1.2.b](screenshots/1.2.b.png)

---

### **Task 1.3 – Account Class**
Implements:
- Default & parameterized constructors
- Deposit and withdraw methods
- Balance display

📸 **Screenshot:**  
![Task 1.3](screenshots/1.3.png)

---

### **Task 1.4 – Inheritance (Person → Employee)**
Contains `XYZ.java`:
- Base class: `Person`
- Subclass: `Employee`
- Demonstrates constructor chaining using `super`

📸 **Screenshot:**  
![Task 1.4](screenshots/1.4.png)

---

## ▶️ How to Run

```bash
javac *.java
```

Run a specific task:

| Task | Command |
|------|---------|
| 1.1  | `java Person` |
| 1.2  | `java Product` |
| 1.3  | `java Account` |
| 1.4  | `java XYZ` |

---

## 🧩 Requirements
- Java JDK **8 or higher**
- Any IDE or terminal

---

