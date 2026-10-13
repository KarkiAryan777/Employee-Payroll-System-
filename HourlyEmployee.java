
public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(int employeeId, String name,
                          double hoursWorked, double hourlyRate) {

        super(employeeId, name);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}