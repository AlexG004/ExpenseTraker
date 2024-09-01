package com.example.expensetracker;

import java.time.LocalDate;

public class Receipt {
    private String description;
    private double amount;
    private LocalDate date;
    private Project project;
    private int importance; // 1 to 10 scale

    public Receipt(String description, double amount, LocalDate date, Project project, int importance) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.project = project;
        this.importance = importance;
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

    public Project getProject() {
        return project;
    }

    public int getImportance() {
        return importance;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", project=" + project.getName() +
                ", importance=" + importance +
                '}';
    }
}
