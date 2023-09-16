package employee.version1;

public class HourlyEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private float totalHourWorked;
    private float ratePerHour;


    public HourlyEmployee() {
        empID = 0;
        empName = "";
        empDateHired = new MyDate();
        empBirthDate = new MyDate();
        totalHourWorked = 0;
        ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        totalHourWorked = 0;
        ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate,
                          float totalHourWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHourWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;
    }

   
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public MyDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(MyDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public MyDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(MyDate empBirthDate) {
        this.empBirthDate = empBirthDate;
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

    public double computeSalary() {
        double baseSalary = totalHourWorked * ratePerHour;
        double overtimeHours = Math.max(totalHourWorked - 40, 0);
        double overtimePay = overtimeHours * ratePerHour * 1.5;
        return baseSalary + overtimePay;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: ");
        empDateHired.displayDate();
        System.out.println("Date of Birth: ");
        empBirthDate.displayDate();
        System.out.println("Total Hours Worked: " + totalHourWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Salary: $" + computeSalary());
    }
    @Override
    public String toString() {
    return "Employee ID: " + empID + "\n" +
           "Employee Name: " + empName + "\n" +
           "Date Hired: " + empDateHired.displayDateToString() + "\n" +
           "Date of Birth: " + empBirthDate.displayDateToString();
}
}