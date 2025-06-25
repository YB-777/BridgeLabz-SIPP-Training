// Product class to represent items in a shopping cart
class Product {
    // Static variable: shared discount for all products
    static double discount = 10.0; // Default 10% discount

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Final variable: unique and immutable product ID
    final int productID;

    // Constructor using 'this' to initialize instance variables
    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the shared discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to calculate and return total price after discount
    public double getTotalPrice() {
        double total = price * quantity;
        double discountedTotal = total - (total * discount / 100);
        return discountedTotal;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price after Discount: $" + getTotalPrice());
    }
}

// Main class to demonstrate the Shopping Cart System
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Creating Product objects
        Product p1 = new Product("Laptop", 75000.0, 1, 101);
        Product p2 = new Product("Headphones", 1500.0, 2, 102);

        // Update the shared discount for all products
        Product.updateDiscount(15.0);

        System.out.println();

        // Check and display details of p1 using instanceof
        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }

        System.out.println();

        // Check and display details of p2 using instanceof
        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }
    }
}
