package com.exam.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataValidation {


    public static class validateName implements DataValidate {
        @Override
        public boolean validData(String input) {
            return input.matches("[a-zA-Z\\s]+") && input.matches(".*\\S.*");
        }

        @Override
        public void printError() {
            System.out.println("Name must contain only characters and space");
        }

    }

    public static class validateDate implements DataValidate {
        @Override
        public boolean validData(String input) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            try {
                LocalDate date = LocalDate.parse(input, formatter);
                return true;
            } catch (Exception error) {
                return false;
            }
        }

        @Override
        public void printError() {
            System.out.println("Date must be in format yyyy.MM.dd");
        }

    }

    public static class validateDepartment implements DataValidate {

        void printDepartment() {
            for (Department department : Department.values()) {
                System.out.println(department.getName());
            }
        }

        @Override
        public boolean validData(String input) {
            try {
                Department department = Department.valueOf(input.toUpperCase());
                return true;
            } catch (IllegalArgumentException e) {
                System.out.println("Enter a department from list:");
                printDepartment();
            }
            return false;
        }

        @Override
        public void printError() {

        }
    }

    public static class validateSalary implements DataValidate {

        @Override
        public boolean validData(String input) {
            if (input.matches("//D+")
                    && Double.parseDouble(input) > 0
                    && Double.parseDouble(input) < 1000000) {
                return true;
            } else
                return false;
        }

        @Override
        public void printError() {
            System.out.println("Data must contain be a number above zero and less than 1000 000");
        }
    }
}

