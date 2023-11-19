package com.exam.app;

import java.util.Scanner;

public class StaffManager implements Manager {
    private Service service;

    public StaffManager(Service service) {
        this.service = service;
    }

    public static void displayCommands() {
        System.out.println("1. Add employee ");
        System.out.println("2. Edit employee");
        System.out.println("3. Fire Employee");
        System.out.println("4. List Employees");
        System.out.println("5. Search Employee by ID");
        System.out.println("6. Search Employee by name");
        System.out.println("7. Search Employee by Department");
        System.out.println("8. Search Employee by role");
    }

    @Override
    public void execute(String command) {
        Scanner scanner = new Scanner(System.in);
        switch (command) {
            case "1":
                System.out.println("Enter data separated by commas");
                String[] data = scanner.nextLine().split(",");
                id =
                service.AddEmployee();

        }
    }
