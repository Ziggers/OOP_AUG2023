package employee.version1;


public class CommissionEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private double totalSales;

    public CommissionEmployee() {
        empID = 0;
        empName = "";
        empDateHired = new MyDate();
        empBirthDate = new MyDate();
        totalSales = 0;
    }

    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        totalSales = 0;
    }

    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate,
                              double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    // Getters and setters for all fields

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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

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

   public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: ");
        empDateHired.displayDate();
        System.out.println("Date of Birth: ");
        empBirthDate.displayDate();
        System.out.println("Total Sales: $" + totalSales);
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