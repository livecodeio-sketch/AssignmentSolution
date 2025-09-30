package Week_3_Set_1;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount() {
        accountNumber = "Unknown";
        balance = 0;
    }

    BankAccount(String accNo, double initialBalance) {
        accountNumber = accNo;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("ACC123", 1000);

        a1.deposit(500);
        a1.withdraw(200);
        a1.displayAccount();

        a2.deposit(300);
        a2.withdraw(1500);
        a2.displayAccount();
    }
}
