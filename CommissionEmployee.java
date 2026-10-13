public class CommissionEmployee extends Employee {

    private double sales;
    private double commissionRate;

    public CommissionEmployee(int employeeId, String name, 
                             double sales, double commisionRate) {

        super(employeeId, name);

        this.sales = sales;
        this.commissionRate = commisionRate;
    }

    public double getSales() {
        return sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double calculatePay() {
        return sales * commissionRate / 100;
    }
}
