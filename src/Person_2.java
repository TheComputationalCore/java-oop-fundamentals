package task2;

// Question 1.4
// Creating base class Person_2 with attributes name and age
public class Person_2 {
    String name;
    int age;

    // Correct constructor name (must match class name)
    public Person_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating an object
        Employee e = new Employee("tony", 24, 11000000, 1234567);
        System.out.println(e);
    }
}

// Updated Employee to extend Person_2
class Employee extends Person_2 {
    int employeeID;
    float salary;

    // Using super keyword to initialize the attributes of parent class
    public Employee(String name, int age, float salary, int employeeID) {
        super(name, age);
        this.salary = salary;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
