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

        Employee employee = new Employee(employeeId, name, hoursworked, hourlypay);

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Hours Worked: " + employee.gethoursworked());
        System.out.println("Hourly Pay: " + employee.gethourlypay());

        scan.close();
    }
}