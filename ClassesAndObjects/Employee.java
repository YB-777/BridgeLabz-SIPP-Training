// Employee class that holds details for each employee
public class Employee
{
    // Private fields to store employee name, ID, and salary
    private String employee_name;
    private int employee_id;
    private double employee_salary;
    
    // Constructor to initialize employee object with provided values
    public Employee(String employee_name, int employee_id, double employee_salary)
    { 
        this.employee_name = employee_name;
        this.employee_id = employee_id;  
        this.employee_salary = employee_salary;
    }
    
    // Method to display employee details
    public void displayEmployeeDetails(){
        System.out.println("Employee Name:- " + employee_name);
        System.out.println("Employee Id:- " + employee_id);
        System.out.println("Employee Salary:- " + employee_salary);
    }

    // main method: program execution starts here
    public static void main(String[] args) {
	    
	// Creating first Employee object with name, ID, and salary
	Employee employee1 = new Employee("Joshua", 7, 25000.0);
	    
        // Creating second Employee object with name, ID, and salary
        Employee employee2 = new Employee("Margaret", 8, 30000.0);
	    
        // Displaying details of Employee 1
        System.out.println("Employee 1 Details :-");
        employee1.displayEmployeeDetails();
		
	// Displaying details of Employee 2
        System.out.println("\nEmployee 2 Details :-");
        employee2.displayEmployeeDetails();
     }
}

