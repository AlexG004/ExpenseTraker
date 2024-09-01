package com.example.expensetracker;

import java.time.LocalDate;

public class Expense {
    private String description;
    private double amount;
    private LocalDate date;

    public Expense(String description, double amount, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}

