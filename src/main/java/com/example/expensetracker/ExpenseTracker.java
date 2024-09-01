package com.example.expensetracker;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses;
    private List<Receipt> receipts;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
        receipts = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        if (isEligibleForReimbursement(expense)) {
            expenses.add(expense);
        } else {
            System.out.println("Expense not eligible for reimbursement: " + expense);
        }
    }

    private boolean isEligibleForReimbursement(Expense expense) {
        // Implement logic for eligibility check here
        // For simplicity, let's assume all expenses under $100 are eligible
        return expense.getAmount() <= 100;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
}
