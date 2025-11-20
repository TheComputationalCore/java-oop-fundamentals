# Java OOP Foundations

This repository contains Java programs demonstrating **Object-Oriented Programming (OOP)** concepts such as encapsulation, constructors, inheritance, and class design.  
It includes four tasks (1.1 to 1.4), each implemented using separate Java classes.

---

## 📁 Project Structure

```
java-oop-foundations/
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
│   ├── 1.4.png
└── README.md
```

---

## 📘 Task Overview

### **🧩 Task 1.1 — Person Class**
- Implements a `Person` class with:
  - `name`, `age`
  - Constructor + Display method  
- Default age = 18.

📸 **Screenshot:**  
![Task 1.1](screenshots/1.1.png)

---

### **🧩 Task 1.2 — Product Class**
- Defines a `Product` class with:
  - `pid`, `price`, `quantity`
- Includes a main class to:
  - Input 5 products
  - Find product with highest price
  - Calculate total purchase amount

📸 **Screenshot A:**  
![Task 1.2a](screenshots/1.2.a.png)

📸 **Screenshot B:**  
![Task 1.2b](screenshots/1.2.b.png)

---

### **🧩 Task 1.3 — Account Class**
- Balance management using:
  - Default constructor
  - Parameterized constructor
  - Deposit / Withdraw / Display methods

📸 **Screenshot:**  
![Task 1.3](screenshots/1.3.png)

---

### **🧩 Task 1.4 — Inheritance Example**
- `Person` = Base class  
- `Employee` = Derived class  
- Uses:
  - `super()` for constructor chaining
  - Additional fields: employeeID, salary

📸 **Screenshot:**  
![Task 1.4](screenshots/1.4.png)

---

## ▶️ Running the Programs

### **Clone the repository**
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
java Person     # Task 1.1
java Product    # Task 1.2
java Account    # Task 1.3
java XYZ        # Task 1.4
```

---

## 🛠 Requirements
- Java JDK 8 or higher  
- Any IDE or terminal that supports Java  

---

## ✔️ Notes
- All tasks are independent and runnable separately.
- Screenshots of all implementations are included in the `screenshots` folder.

---

If you'd like badges, a CI pipeline, or a reorganized folder structure (e.g., `src/`), just let me know!
