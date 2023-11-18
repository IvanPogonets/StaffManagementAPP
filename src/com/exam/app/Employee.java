package com.exam.app;

import java.util.Date;

public class Employee {
    private static long nextID;
    private long id;
    private String name;
    private Date startDate;
    private Department department;
    private String role;
    private double salary;
    private Date endDate;

    public Employee(long id, String name, Date startDate, Department department, String role, double salary) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.department = department;
        this.role = role;
        this.salary = salary;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String info() {
         String info = "ID: " + id +
                        "%n Name: " + name +
                        "%n Hire date: " + startDate +
                        "%n Department: " + department +
                        "%n Role: " + role +
                        "%n Salary: " + salary +
                        "Dismissal date" + endDate;
         if (endDate != null){
             return info + "Dismissal date" + endDate;
         }
         else return info;
    }

    public String toString() {
        return id + "," + name + "," + startDate + ","
                + department + "," + role + "," + salary + "," + endDate;
    }
}
