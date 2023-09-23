package employee.version3;

public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(int empID, String firstName, String lastName, MyDate empDateHired, MyDate empBirthDate, double totalSales) {
        super(empID, firstName, lastName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double computeSalary() {
        if (totalSales < 50000) {
            return totalSales * 0.05;
        } else if (totalSales < 100000) {
            return totalSales * 0.20;
        } else if (totalSales < 500000) {
            return totalSales * 0.30;
        } else {
            return totalSales * 0.50;
        }
    }
}
