package com.ASS1;

public class BankAccount {

    private String accountHolderName;
    private int balance;

    // Constructor for initializing account holder and balance
    public BankAccount(String accountHolderName, int initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Non-static method to deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. Current balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Non-static method to withdraw money
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Non-static method to check balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Static methods: For demonstration purposes, they use static variables
    private static String staticAccountHolderName;
    private static int staticBalance;

    // Static method to initialize the account
    public static void initStaticAccount(String name, int initialBalance) {
        staticAccountHolderName = name;
        staticBalance = initialBalance;
        System.out.println("Static account initialized for " + staticAccountHolderName + " with balance: " + staticBalance);
    }

    // Static method to deposit money
    public static void staticDeposit(int amount) {
        if (amount > 0) {
            staticBalance += amount;
            System.out.println(amount + " deposited in static account. Current balance: " + staticBalance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Static method to withdraw money
    public static void staticWithdraw(int amount) {
        if (amount > 0 && amount <= staticBalance) {
            staticBalance -= amount;
            System.out.println(amount + " withdrawn from static account. Current balance: " + staticBalance);
        } else if (amount > staticBalance) {
            System.out.println("Insufficient balance in static account.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Static method to check balance
    public static void staticCheckBalance() {
        System.out.println("Current balance in static account: " + staticBalance);
    }

    public static void main(String[] args) {
        // Non-static method usage
        System.out.println("Non-Static Methods:");
        BankAccount account1 = new BankAccount("Alice", 1000);
        account1.deposit(500);
        account1.withdraw(300);
        account1.checkBalance();

        System.out.println("\nStatic Methods:");
        // Static method usage
        BankAccount.initStaticAccount("Bob", 2000);
        BankAccount.staticDeposit(400);
        BankAccount.staticWithdraw(700);
        BankAccount.staticCheckBalance();
    }
}
