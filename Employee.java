class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    // Constructor for Manager
    Manager(String name, double salary, String department) {
        super(name, salary); // calling parent constructor
        this.department = department;
    }

    // Display manager info
    void displayManagerInfo() {
        displayInfo();  // call Employee method
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating Manager object
        Manager m = new Manager("Ramakrishna", 50000, "Software Development");

        // Printing details
        m.displayManagerInfo();
    }
}
