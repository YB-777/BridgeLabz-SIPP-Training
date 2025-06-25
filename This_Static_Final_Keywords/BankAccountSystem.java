class BankAccount {
    static String bankName = "National Bank";  // Static variable
    static int totalNumberOfAccounts; // its current value will be default value of the data type i.e 0 here since int, though we can also initialize it as we have done for bankName

    String accountHolderName;
    double balance;

    final long accountNumber;  // Final variable

    // Constructor using 'this' to resolve ambiguity
    BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalNumberOfAccounts++;  // Increment static account counter
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Number Of Bank Accounts: " + totalNumberOfAccounts);
    }

    // Instance method
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: $" + balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("John", 11223344556677L, 50000.0);
        BankAccount bankAccount2 = new BankAccount("Miley", 22445566778899L, 25000.0);


        // Use instanceof to check type before displaying details
        if (bankAccount1 instanceof BankAccount) {
            bankAccount1.displayDetails();
        }

        System.out.println();

        if (bankAccount2 instanceof BankAccount) {
            bankAccount2.displayDetails();
        }

	System.out.println();

	//since getTotalAccounts is a static method,therefore,it is called using class name i.e BankAccount
	BankAccount.getTotalAccounts();  
    }
}
