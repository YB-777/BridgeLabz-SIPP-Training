public class Circle 
{
    double radius;

    // Default constructor uses constructor chaining
    Circle() 
    {
        this(2.0); // Calls the parameterized constructor with 2.0
    }

    // Parameterized constructor
    Circle(double radius) 
    {
        this.radius = radius;
    }

    // Method to display the radius
    void displayRadius() 
    {
        System.out.println("Radius of the circle is: " + radius);
    }

    // Main method
    public static void main(String[] args) 
    {
        Circle circle1 = new Circle();        // Uses default constructor
        Circle circle2 = new Circle(4.0);     // Uses parameterized constructor

        System.out.println("Default Constructor call:");
        circle1.displayRadius();

        System.out.println();

        System.out.println("Parameterized Constructor call:");
        circle2.displayRadius();
    }
}
