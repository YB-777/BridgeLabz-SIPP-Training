public class Item {
    // Attributes of the item
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize item attributes
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: $" + price);
    }

    // Method to calculate total cost for given quantity
    public void calculateTotalCost(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Total Cost for " + quantity + " units: $" + totalCost);
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        Item item1 = new Item(101, "Wireless Mouse", 599.99);
        Item item2 = new Item(102, "Keyboard", 899.50);

        System.out.println("Item 1 Details:");
        item1.displayItemDetails();
        item1.calculateTotalCost(3);

        System.out.println("\nItem 2 Details:");
        item2.displayItemDetails();
        item2.calculateTotalCost(2);
    }
}
