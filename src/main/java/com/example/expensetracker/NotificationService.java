package com.example.expensetracker;

public class NotificationService {
    public static void notifyEmployee(User user, String message) {
        // In a real application, this would send an email
        System.out.println("Notification sent to " + user.getEmail() + ": " + message);
    }
}

