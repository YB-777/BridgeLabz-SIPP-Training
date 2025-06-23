public class MobilePhone {
    // Attributes to store phone details
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize the mobile phone details
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all details of the mobile phone
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        // Creating mobile phone objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 69999.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 79999.50);

        // Displaying phone details
        phone1.displayDetails();
        System.out.println();  // empty line for better output separation
        phone2.displayDetails();
    }
}
