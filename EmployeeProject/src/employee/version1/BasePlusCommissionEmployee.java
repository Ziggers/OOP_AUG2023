package employee.version1;

public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private double totalSales;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        empID = 0;
        empName = "";
        empDateHired = new MyDate();
        empBirthDate = new MyDate();
        totalSales = 0;
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Method to compute the salary
    public double computeSalary() {
        if (totalSales < 50000) {
            return baseSalary + (totalSales * 0.05);
        } else if (totalSales < 100000) {
            return baseSalary + (totalSales * 0.20);
        } else if (totalSales < 500000) {
            return baseSalary + (totalSales * 0.30);
        } else {
            return baseSalary + (totalSales * 0.50);
        }
    }


    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: ");
        empDateHired.displayDate(); // Display date using the MyDate class's displayDate() method
        System.out.println("Date of Birth: ");
        empBirthDate.displayDate(); // Display date using the MyDate class's displayDate() method
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Base Salary: $" + baseSalary);
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