public class BankAccount {
    // Attributes of the bank account
    private String accountHolder;
    private long accountNumber;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accountHolder, long accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money only if sufficient balance exists
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn $" + amount + " successfully.");
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display current balance and basic account info
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ravi Sharma", 1234567890L, 10000.0);

        // Display initial balance
        account1.displayBalance();
        System.out.println();

        // Perform deposit
        account1.deposit(5000);
        account1.displayBalance();
        System.out.println();

        // Perform withdrawal
        account1.withdraw(3000);
        account1.displayBalance();
        System.out.println();

        // Try withdrawing more than balance
        account1.withdraw(20000);
        account1.displayBalance();
    }
}
