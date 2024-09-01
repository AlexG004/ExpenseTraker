package com.example.expensetracker;

public class Employee extends User {
    public Employee(String name, String email) {
        super(name, email);
    }

    public void submitReceipt(Receipt receipt, ExpenseTracker tracker) {
        tracker.addExpense(new Expense(receipt.getDescription(), receipt.getAmount(), receipt.getDate()));
        NotificationService.notifyEmployee(this, "Receipt submitted for approval.");
    }
}

