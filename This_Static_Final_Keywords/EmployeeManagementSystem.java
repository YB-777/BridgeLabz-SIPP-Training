// Employee class to represent employee details
class Employee 
{
    // Static variable shared across all employees
    static String companyName = "TechNova Solutions";

    // Static variable to count total employees
    static int totalEmployees = 0;

    // Instance variables
    String name;
    String designation;

    // Final variable to ensure employee ID cannot be changed once assigned
    final int id;

    // Constructor using 'this' to resolve ambiguity and initialize instance variables
    Employee(String name, int id, String designation)
    {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;  // Increment total employee count
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() 
    {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display individual employee details
    public void displayDetails() 
    {
        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

// Main class to demonstrate the Employee class usage
public class EmployeeManagementSystem 
{
    public static void main(String[] args) 
    {
        // Creating Employee objects
        Employee emp1 = new Employee("Alice", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102, "Product Manager");

        // Display total number of employees using static method
        Employee.displayTotalEmployees();

        System.out.println();

        // Check and display details for emp1 using instanceof
        if (emp1 instanceof Employee) 
        {
            emp1.displayDetails();
        }

        System.out.println();

        // Check and display details for emp2 using instanceof
        if (emp2 instanceof Employee) 
        {
            emp2.displayDetails();
        }
    }
}
