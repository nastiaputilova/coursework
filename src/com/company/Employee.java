package com.company;

import java.util.Objects;

public class Employee {

    private String familyName;
    private String name;
    private String patronymic;
    private String department;
    private int salary;
    private int id;
    static int counter;

    public Employee(String familyName, String name, String patronymic, String department, int salary, int id) {
        this.familyName = familyName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

   public String getFamilyName(){
        return familyName;
    }

    public String getName() {
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name: " + this.familyName + " " + this.name + " " + this.patronymic + " Department: " + this.department  + " Salary: " + this.salary + " id: " + this.id;
    }

}

