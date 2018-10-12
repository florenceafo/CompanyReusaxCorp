package Reusax;

// Task 1
public class Employee {

    // Employee attributes

     // test




    private int ID;
    private String name;
    private double grossSalary;
    private double netSalary;

    // Constructor method - initialising
    public Employee (int ID, String name, double grossSalary) {

        this.ID = ID;
        this.name = name;
        this.grossSalary = grossSalary;
        this.netSalary = getNetSalary(); // Calculated below

    }
    // Proportion subtracted from gross salary to get net salary
    private static final double INCOME_TAX_PROPORTION = 0.1;

    // Getters and Setters
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public double getGrossSalary() {
        return grossSalary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    // Checks if two employees are equal (have the same ID number)
    // Receives an object and checks if it is of type Employee
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Employee) {
            // Casts the object to type employee to allow comparison
            Employee otherEmployee = (Employee) otherObject;
            // Checks if object is the same as current Employee object, based on ID only
            boolean sameEmployee = this.getID() == otherEmployee.getID();
            return sameEmployee;
        } else {
            return false;
        }
    }

    // Returns the Employee information as a string
    // Returns Employee name and gross salary
    public String toString(){
        String info = this.getName() + "'s gross salary is " + this.getGrossSalary() + " SEK per month.";
        System.out.println(info);
        return info;
    }

    // This is also am attribute of the Employee class
    // Calculates the net salary from the gross salary
    public double getNetSalary() {
        double netSalary = this.getGrossSalary() - ( this.getGrossSalary() * INCOME_TAX_PROPORTION );
        return netSalary;
    }





}



