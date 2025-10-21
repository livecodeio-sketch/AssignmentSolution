package Week_5_Set_1;

import java.util.Random;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit
    public synchronized void deposit(int amount) throws InsufficientBalanceException {
        if (amount <= 0)
            throw new InsufficientBalanceException("Deposit amount must be positive!");
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited ₹" + amount + " | Balance: ₹" + balance);
    }

    // Synchronized withdraw
    public synchronized void withdraw(int amount) throws InsufficientBalanceException {
        if (amount <= 0)
            throw new InsufficientBalanceException("Withdrawal amount must be positive!");
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance! Tried to withdraw ₹" + amount);
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew ₹" + amount + " | Balance: ₹" + balance);
    }

    public int getBalance() {
        return balance;
    }
}

// Thread for transaction simulation
class TransactionThread extends Thread {
    private BankAccount account;
    private Random random = new Random();

    public TransactionThread(String name, BankAccount account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // 5 random transactions per thread
            int amount = random.nextInt(500) + 1;
            boolean deposit = random.nextBoolean();

            try {
                if (deposit) {
                    account.deposit(amount);
                } else {
                    account.withdraw(amount);
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(Thread.currentThread().getName() + " ERROR: " + e.getMessage());
            }

            try { Thread.sleep(300); } catch (InterruptedException ignored) {}
        }
    }
}

public class BankTransactionSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread user1 = new TransactionThread("User1", account);
        Thread user2 = new TransactionThread("User2", account);
        Thread user3 = new TransactionThread("User3", account);

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException ignored) {}

        System.out.println("\nFinal Balance: ₹" + account.getBalance());
    }
}
