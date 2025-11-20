# Java OOP Foundations

This repository contains Java programs demonstrating fundamental Object-Oriented Programming (OOP) concepts such as encapsulation, constructors, inheritance, and class design. It includes four foundational tasks (1.1 to 1.4), each focusing on a specific OOP principle.

---

## 📌 Project Structure

```
java-oop-foundations/
├── Account.java        # Task 1.3 – Account class with deposit/withdraw operations
├── Person.java         # Task 1.1 – Basic Person class
├── Person_2.java       # Updated/alternate Person version
├── Product.java        # Task 1.2 – Product class & product management logic
├── XYZ.java            # Task 1.4 – Inheritance example (Person → Employee)
├── screenshots/        # Output/code screenshots for all tasks
│   ├── 1.1.png
│   ├── 1.2.a.png
│   ├── 1.2.b.png
│   ├── 1.3.png
│   ├── 1.4.png
└── README.md
```

---

## 📘 Task Overview

### **🧩 Task 1.1 — Person Class**
- Defines a `Person` with `name` and `age`.
- Default age is set to **18**.
- Features:
  - Constructor initialization
  - Display method  
- 📸 Screenshot: `screenshots/1.1.png`

---

### **🛒 Task 1.2 — Product Class**
- Contains product fields: `pid`, `price`, `quantity`.
- Includes a main program that:
  - Accepts **5 products**
  - Finds the **highest-priced product**
  - Calculates **total spending = price × quantity**
- 📸 Screenshots:  
  - `screenshots/1.2.a.png`  
  - `screenshots/1.2.b.png`

---

### **🏦 Task 1.3 — Account Class**
- Demonstrates encapsulation with:
  - `balance` field  
  - Default & parameterized constructors  
  - `deposit()`, `withdraw()`, `displayBalance()`  
- 📸 Screenshot: `screenshots/1.3.png`

---

### **🧑‍💼 Task 1.4 — Inheritance (Person → Employee)**
- `Employee` extends `Person`
- Adds:
  - `employeeID`
  - `salary`
- Uses `super()` to initialize parent class data.
- 📸 Screenshot: `screenshots/1.4.png`

---

## ▶️ Running the Programs

### **Clone Repository**
```bash
git clone https://github.com/TheComputationalCore/java-oop-foundations.git
cd java-oop-foundations
```

### **Compile**
```bash
javac *.java
```

### **Run**
```bash
java Person      # Task 1.1
java Product     # Task 1.2
java Account     # Task 1.3
java XYZ         # Task 1.4
```

---

## 🛠 Requirements
- **JDK 8 or higher**
- Any Java IDE or terminal with javac

---

## 🖼 Screenshots
Stored inside: `/screenshots`

```
1.1.png       – Person class
1.2.a.png     – Product class part A
1.2.b.png     – Product class part B
1.3.png       – Account class
1.4.png       – Inheritance example
```

---

## ✔️ Notes
This repository focuses on essential OOP concepts and serves as a solid foundation for more advanced Java development.

