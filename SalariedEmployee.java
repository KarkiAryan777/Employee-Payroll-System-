
public class SalariedEmployee extends Employee {

    private double annualSalary;

    // Constructor
    public SalariedEmployee(int employeeId, String name,
                            double annualSalary) {

        super(employeeId, name);

        this.annualSalary = annualSalary;
    }

    // Getter
    public double getAnnualSalary() {
        return annualSalary;
    }

    // Calculate monthly pay
    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }
}