

import java.util.HashMap;

public class Company {

    // HashMap - to allow search and retrieval based on the ID
    // Key - Employee ID, Value - Employee object
    private HashMap <Integer,Employee> employees;

    // Constructor method - initialising the HashMap
    public Company(){
        this.employees = new HashMap<>();
    }

    // Creates a new Employee object
    public Employee registerEmployee(){

        // Input from user - employee name, ID and gross salary
        System.out.println("Please provide the following to register a new employee:");
        int ID = UserInput.readInt("Employee ID");
        String name = UserInput.readString("Employee name");
        double grossSalary = UserInput.readDouble("Gross salary");

        // Declares an object of type Employee
        // Creates an object of type Employee
        // Connects the reference to the object
        Employee newEmployee = new Employee(ID, name, grossSalary);

        // Puts the new employee into the HashMap. Key - ID, Value - new Employee
        this.employees.put(ID, newEmployee);
        return newEmployee;

    }

    // Search the Employee HashMap, based on ID, returns Employee object
    public Employee searchEmployee (int ID, Employee employee){
        //contains
        // get

        if(this.employees.containsKey(ID)) {
            this.employees.get(ID);
            System.out.println(ID);
            employee.toString();
            return employee;
        } else {
            System.out.println("No employee with this ID");
            return null;
        }
    }

    public void run(){
        registerEmployee();
    }
}
