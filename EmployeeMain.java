import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("=== Employee Payroll System ===");
        System.out.print(" Choose 1 for Hourly Employee, 2 for Salaried Employee, or 3 for Commission Employee: ");
        int choice = scan.nextInt();

        System.out.print("Enter employee ID: ");
        int employeeId = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter employee name: ");
        String name = scan.nextLine();


        // Hourly Employee
        if (choice == 1) {

            System.out.print("Enter hours worked: ");
            double hoursWorked = scan.nextDouble();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = scan.nextDouble();

            HourlyEmployee employee =
                    new HourlyEmployee(employeeId, name, hoursWorked, hourlyRate);

            System.out.println("\n--- Hourly Employee ---");
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Hours Worked: " + employee.getHoursWorked());
            System.out.println("Hourly Rate: $" + employee.getHourlyRate());
            System.out.println("Monthly Pay: $" + employee.calculatePay());
        }

        // Salaried Employee
        else if (choice == 2) {

            System.out.print("Enter annual salary: ");
            double annualSalary = scan.nextDouble();

            SalariedEmployee employee =
                    new SalariedEmployee(employeeId, name, annualSalary);

            System.out.println("\n--- Salaried Employee ---");
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Annual Salary: $" + employee.getAnnualSalary());
            System.out.println("Monthly Pay: $" + employee.calculatePay());
        }

        // Commission Employee
        else if (choice == 3) {

            System.out.print("Enter sales: ");
            double sales = scan.nextDouble();

            System.out.print("Enter commission rate: ");
            double commissionRate = scan.nextDouble();

            CommissionEmployee employee = 
                    new CommissionEmployee(employeeId, name, sales, commissionRate);

            System.out.println("\n--- Commission Employee ---");
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Sales: $" + employee.getSales());
            System.out.println("Commission Rate:" + employee.getCommissionRate() + "%");
            System.out.println("Monthly Pay: $" + employee.calculatePay());
        }


        else {
            System.out.println("Invalid choice.");
        }

        scan.close();
    }
}
