package com.exam.app;

import java.util.Date;

public interface Service {
    public void AddEmployee(Employee employee);

    public void EditEmployee();

    public void FireEmployee(long id, Date date);

    public void ListEmployees();

    public void SearchEmployees();
}
