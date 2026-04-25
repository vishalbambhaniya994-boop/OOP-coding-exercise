public class BankAccount {

    
    private String accountHolderName;
    private double balance;

  
    private static double interestRate = 5.0; 

    
    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    
    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    
    public void display() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    
    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to " + interestRate + "%\n");
    }

    
    public static void main(String[] args) {

        
        BankAccount acc1 = new BankAccount("Dharmik", 10000);
        BankAccount acc2 = new BankAccount("Rahul", 20000);

       
        System.out.println("Before updating interest rate:");
        acc1.display();
        acc2.display();

        
        BankAccount.updateInterestRate(7.5);

        
        System.out.println("After updating interest rate:");
        acc1.display();
        acc2.display();
    }
}
