// Student class to manage student data
class Student 
{
    // Static variable shared among all students
    static String universityName = "Global University";

    // Static variable to track the number of students
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;

    // Final variable to ensure roll number is immutable
    final int rollNumber;

    // Constructor using 'this' to initialize fields
    Student(String name, int rollNumber, String grade) 
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;  // Increment when a student is created
    }

    // Static method to display total enrolled students
    public static void displayTotalStudents() 
    {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() 
    {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade (for demonstration)
    public void updateGrade(String newGrade) 
    {
        this.grade = newGrade;
        System.out.println(name + "'s grade updated to: " + grade);
    }
}

// Main class to demonstrate the student management system
public class UniversityManagementSystem 
{
    public static void main(String[] args) 
    {
        // Creating Student objects
        Student s1 = new Student("Ananya", 101, "A");
        Student s2 = new Student("Ravi", 102, "B");

        // Display total students using static method
        Student.displayTotalStudents();

        System.out.println();

        // Check if s1 is instance of Student before displaying details
        if (s1 instanceof Student) 
        {
            s1.displayDetails();
        }

        System.out.println();

        // Check if s2 is instance of Student before displaying and updating
        if (s2 instanceof Student) 
        {
            s2.displayDetails();
            s2.updateGrade("A+"); // Updating grade
        }
    }
}
