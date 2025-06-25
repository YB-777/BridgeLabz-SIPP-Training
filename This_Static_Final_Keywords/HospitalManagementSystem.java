// Patient class to manage hospital patient data
class Patient 
{
    // Static variable shared across all patients
    static String hospitalName = "CityCare Hospital";

    // Static variable to keep track of total admitted patients
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Final variable to ensure unique and immutable patient ID
    final int patientID;

    // Constructor using 'this' to initialize instance variables
    Patient(String name, int age, String ailment, int patientID) 
    {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment total patients on each admission
    }

    // Static method to get total number of admitted patients
    public static void getTotalPatients() 
    {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayDetails() 
    {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

// Main class to test the Patient class
public class HospitalManagementSystem 
{
    public static void main(String[] args) 
    {
        // Create patient objects
        Patient p1 = new Patient("Rohan Mehta", 34, "Flu", 1001);
        Patient p2 = new Patient("Sneha Sharma", 28, "Migraine", 1002);

        // Display total patients
        Patient.getTotalPatients();

        System.out.println();

        // Use instanceof before displaying details of p1
        if (p1 instanceof Patient) 
        {
            p1.displayDetails();
        }

        System.out.println();

        // Use instanceof before displaying details of p2
        if (p2 instanceof Patient) 
	{
            p2.displayDetails();
        }
    }
}
