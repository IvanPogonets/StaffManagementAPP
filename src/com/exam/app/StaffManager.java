package com.exam.app;

public class StaffManager implements Manager {
    private Service service;

    public StaffManager(Service service) {
        this.service = service;
    }

    @Override
    public void execute(String command) {

    }

    public static void displayCommands() {

    }
}
