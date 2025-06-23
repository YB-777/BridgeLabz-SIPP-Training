public class MovieTicket 
{
    // Attributes to store ticket details
    private String movieName;
    private int seatNumber;
    private double price;

    // Method to book a ticket by setting values
    public void bookTicket(String movieName, int seatNumber, double price) 
    {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display the ticket details
    public void displayTicketDetails() 
    {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: $" + price);
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) 
    {
        // Create a ticket object
        MovieTicket ticket1 = new MovieTicket();

        // Book the ticket
        ticket1.bookTicket("Inception", 42, 250.0);

        // Display the ticket details
        System.out.println("\n--- Ticket Details ---");
        ticket1.displayTicketDetails();
    }
}
