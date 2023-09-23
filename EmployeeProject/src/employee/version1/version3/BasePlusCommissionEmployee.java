package employee.version3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
    }

    public BasePlusCommissionEmployee(int empID, String firstName, String lastName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        super(empID, firstName, lastName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        double commission = super.computeSalary(); 
        return commission + baseSalary;
    }
}
