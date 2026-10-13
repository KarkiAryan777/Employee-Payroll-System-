import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter employee name: ");
        String name = scan.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursworked = scan.nextDouble();

        System.out.print("Enter hourly pay: ");
        double hourlypay = scan.nextDouble();

        HourlyEmployee employee = new HourlyEmployee(employeeId, name, hoursworked, hourlypay);

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Hourly Pay: " + employee.getHourlyRate());
        System.out.println("Total Pay: $" + employee.calculatePay());

        scan.close();
    }
}