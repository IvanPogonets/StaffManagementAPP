package com.exam.app;

import java.util.Scanner;

import static com.exam.app.StaffManager.displayCommands;

public class StaffManagementApp {
    public static void main(String[] args) {
        Writer writer = new CSVWriter();
        Reader reader = new CSVReader();
        Service service = new StaffService(reader, writer);
        Manager manager = new StaffManager(service);
        System.out.println("Welcome to Staff Management System");
        displayCommands();
        boolean isRunning = true;
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            manager.execute(command);
        }
    }
}