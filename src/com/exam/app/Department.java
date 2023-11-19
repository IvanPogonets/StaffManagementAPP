package com.exam.app;

public enum Department {
    IT ("IT"),
    SUPPORT ("Support"),
    ADMINISTRATION ("Administration");

    private final String name;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

