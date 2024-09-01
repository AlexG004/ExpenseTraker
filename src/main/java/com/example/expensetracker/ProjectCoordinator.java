package com.example.expensetracker;

public class ProjectCoordinator extends User {
    public ProjectCoordinator(String name, String email) {
        super(name, email);
    }

    public void approveExpense(Expense expense, int importance) {
        boolean approved = ApprovalManager.approveExpense(expense, importance);
        if (approved) {
            System.out.println("Approved: " + expense);
        } else {
            System.out.println("Rejected: " + expense);
        }
    }
}

