public class PalindromeChecker {
    // Attribute to hold the input text
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //regex
        int left = 0;
        int right = cleaned.length() - 1;
	
        while (left < right) {
	    // here two pointers approach has been used
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("Input text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        PalindromeChecker checker3 = new PalindromeChecker("A man, a plan, a canal, Panama");

        checker1.displayResult();
        System.out.println();

        checker2.displayResult();
        System.out.println();

        checker3.displayResult();
    }
}
