package Multithreading;

public class bankapplication {
    private int balance;

    public bankapplication(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        int currentBalance = balance;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        currentBalance += amount;
        balance = currentBalance;
        System.out.println("Deposited " + amount + ". Current balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        int currentBalance = balance;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (currentBalance >= amount) {
            currentBalance -= amount;
            balance = currentBalance;
            System.out.println("Withdrew " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        bankapplication bankAccount = new bankapplication(0);

        Thread thread1 = new Thread(() -> performTransactions(bankAccount));
        Thread thread2 = new Thread(() -> performTransactions(bankAccount));
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + bankAccount.getBalance());
    }

    public static void performTransactions(bankapplication account) {
        for (int i = 0; i < 3; i++) {
            account.deposit(100);
            account.withdraw(50);
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}
