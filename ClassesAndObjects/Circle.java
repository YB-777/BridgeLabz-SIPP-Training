public class Circle {
    private double radius;

    // Constructor to initialize the circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and display the area using the object's own radius
    public void calculateAndDisplayArea() {
        double area_of_circle = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area_of_circle);
    }

    // Method to calculate and display the circumference using the object's own radius
    public void calculateAndDisplayCircumference() {
        double circumference_of_circle = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference_of_circle);
    }

    // Main method inside the same class
    public static void main(String[] args) {
        Circle circle1 = new Circle(22.0);
        Circle circle2 = new Circle(30.0);

        System.out.println("Circle 1 Area and Circumference :-");
        circle1.calculateAndDisplayArea();
        circle1.calculateAndDisplayCircumference();

        System.out.println("\nCircle 2 Area and Circumference :-");
        circle2.calculateAndDisplayArea();
        circle2.calculateAndDisplayCircumference();
    }
}
