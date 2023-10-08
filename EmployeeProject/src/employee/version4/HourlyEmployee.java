package employee.version4;

public class HourlyEmployee extends Employee {
    private float totalHourWorked;
    private float ratePerHour;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(int empID, String firstName, String lastName, MyDate empDateHired, MyDate empBirthDate,
                          float totalHourWorked, float ratePerHour) {
        super(empID, firstName, lastName, empDateHired, empBirthDate);
        this.totalHourWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHourWorked() {
        return totalHourWorked;
    }

    public void setTotalHourWorked(float totalHourWorked) {
        this.totalHourWorked = totalHourWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double computeSalary() {
        return totalHourWorked * ratePerHour;
    }
}
