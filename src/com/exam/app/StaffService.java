package com.exam.app;

import java.util.Date;
import java.util.HashMap;

public class StaffService implements Service{
private Reader reader;
private Writer writer;
private HashMap<Integer, Employee> employees;

    public StaffService(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
        this.employees = new HashMap<Integer, Employee>();
        employees = reader.readData();
    }

    public HashMap<Integer, Employee> getEmployees() {
        return employees;
    }

    @Override
    public void AddEmployee(Employee employee) {

    }

    @Override
    public void EditEmployee() {

    }

    @Override
    public void FireEmployee(long id, Date date) {

    }

    @Override
    public void ListEmployees() {

    }

    @Override
    public void SearchEmployees() {

    }
}
