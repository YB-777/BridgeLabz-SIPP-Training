import java.util.*;

public class IllegalargumentException {

    // 1. Method to generate the exception (without handling)
    public static void generateException(String input) {
        System.out.println("\nGenerating exception without handling...");
        // This will cause IllegalArgumentException if start > end
        System.out.println("Substring with start > end: " + input.substring(5, 2));
    }

    // 2. Method to handle the exception using try-catch
    public static void handleException(String input) {
        System.out.println("\nHandling exception with try-catch...");
        try {
            System.out.println("Substring with start > end: " + input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // 3. Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method that throws the exception (can crash)
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program crashed in generateException(): " + e.getMessage());
        }

        // Call the method that handles the exception properly
        handleException(input);
    }
}