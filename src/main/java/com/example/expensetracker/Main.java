package com.example.expensetracker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creăm proiectele
        Project project1 = new Project("Proiect A");
        Project project2 = new Project("Proiect B");

        // Creăm angajații și coordonatorii de proiect
        Employee employee1 = new Employee("Ion Popescu", "ion.popescu@example.com");
        Employee employee2 = new Employee("Maria Vasile", "maria.vasile@example.com");
        Employee employee3 = new Employee("Andrei Georgescu", "andrei.georgescu@example.com");

        // Creăm trackerul de cheltuieli
        ExpenseTracker tracker = new ExpenseTracker();

        // Înregistrăm 15 cheltuieli
        Receipt[] receipts = {
                new Receipt("Cumpărături birou", 50, LocalDate.now(), project1, 7),
                new Receipt("Echipamente IT", 1000, LocalDate.now(), project2, 9),
                new Receipt("Prânz cu client", 200, LocalDate.now(), project1, 4),
                new Receipt("Călătorie taxi", 30, LocalDate.now(), project1, 6),
                new Receipt("Materiale de construcții", 800, LocalDate.now(), project2, 8),
                new Receipt("Servicii de curățenie", 120, LocalDate.now(), project1, 5),
                new Receipt("Achiziție software", 600, LocalDate.now(), project2, 7),
                new Receipt("Cazare hotel", 1500, LocalDate.now(), project1, 3),
                new Receipt("Transport public", 15, LocalDate.now(), project2, 6),
                new Receipt("Bilete avion", 2500, LocalDate.now(), project1, 9),
                new Receipt("Catering pentru eveniment", 2000, LocalDate.now(), project2, 10),
                new Receipt("Suport tehnic", 450, LocalDate.now(), project1, 7),
                new Receipt("Papetărie", 75, LocalDate.now(), project1, 5),
                new Receipt("Consultanță juridică", 700, LocalDate.now(), project2, 4),
                new Receipt("Publicitate online", 900, LocalDate.now(), project1, 8)
        };

        double totalApprovedExpenses = 0;

        // Procesăm chitanțele pentru fiecare angajat
        for (Receipt receipt : receipts) {
            double amount = receipt.getAmount();
            int importance = receipt.getImportance();

            // Dacă suma este sub 500, este aprobată automat fără cerere de aprobare
            if (amount <= 300) {
                System.out.println("Approved automatically: " + receipt + " | Importanță: " + importance);
                totalApprovedExpenses += amount;
            }
            // Dacă suma este peste 500, verificăm importanța
            else if (amount > 300 && importance > 6) {
                System.out.println("Approved: " + receipt + " | Importanță: " + importance);
                totalApprovedExpenses += amount;
            } else {
                System.out.println("Rejected: " + receipt + " | Importanță: " + importance);
            }
        }

        // Afișăm totalul cheltuielilor aprobate
        System.out.println("\nTotal cheltuieli aprobate: " + totalApprovedExpenses);
    }
}

