package com.example.expensetracker;

public class ApprovalManager {
    private static final double AUTOMATIC_APPROVAL_LIMIT = 300;

    public static boolean approveExpense(Expense expense, int importance) {
        if (expense.getAmount() <= AUTOMATIC_APPROVAL_LIMIT) {
            return true; // Aprobat automat dacă suma este sub limita automată
        } else {
            // Dacă suma depășește limita, aprobat doar dacă importanța este peste 6
            return importance > 6;
        }
    }
}
