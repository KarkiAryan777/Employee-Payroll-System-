public class Employee { //creates a class for employees to input their info
    private final int employeeId; String name; double hoursworked; double hourlypay; //initializes an employee ID, name, hours worked, and hourly pay

    public Employee(int employeeId, String name, double hoursworked, double hourlypay) {//creates the employee using this info
        this.employeeId = employeeId;
        this.name = name;
        this.hoursworked = hoursworked;
        this.hourlypay = hourlypay;
    }

    public int getEmployeeId() { //returns the employee ID
        return employeeId;
    }

    public String getName() { //returns the employee name
        return name;
    }

    public double gethoursworked() { //returns the hours worked
        return hoursworked;
    }

    public double gethourlypay() { //returns the hourly pay
        return hourlypay;
    }
}