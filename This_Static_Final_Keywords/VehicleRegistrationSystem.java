// Vehicle class to manage vehicle registration
class Vehicle 
{
    // Static variable shared by all vehicles
    static double registrationFee = 5000.0;  // Default fee

    // Instance variables
    String ownerName;
    String vehicleType;

    // Final variable for unique registration number
    final String registrationNumber;

    // Constructor using 'this' to initialize values
    Vehicle(String ownerName, String vehicleType, String registrationNumber) 
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) 
    {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: ₹" + registrationFee);
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails() 
    {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }
}

// Main class to test the Vehicle Registration System
public class VehicleRegistrationSystem 
{
    public static void main(String[] args) 
    {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("Aman Verma", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Priya Mehra", "Bike", "DL5SC9988");

        // Update registration fee
        Vehicle.updateRegistrationFee(5500.0);

        System.out.println();

        // Check and display details for v1 using instanceof
        if (v1 instanceof Vehicle) 
        {
            v1.displayRegistrationDetails();
        }

        System.out.println();

        // Check and display details for v2 using instanceof
        if (v2 instanceof Vehicle) 
        {
            v2.displayRegistrationDetails();
        }
    }
}
