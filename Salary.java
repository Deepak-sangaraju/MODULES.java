class Employee {
    // Properties
    private int salary;
    private String name;

    // Constructor
    Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    // Method: returns salary
    public int getSalary() {
        return salary;
    }

    // Method: returns name
    public String getName() {
        return name;
    }

    // Method: changes name
    public void setName(String newName) {
        this.name = newName;
    }

    // Display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee(30000, "Ramakrishna");

        // Display original details
        emp.display();

        // Change name using setName
        emp.setName("Rama");

        System.out.println("\nAfter changing name:");
        emp.display();
    }
}
