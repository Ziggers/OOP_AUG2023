package employee.version4;

public class Employee extends Name {
    private int empID;
    private MyDate empDateHired;
    private MyDate empBirthDate;

    public Employee() {
    }

    public Employee(int empID, String firstName, String lastName, MyDate empDateHired, MyDate empBirthDate) {
        super(firstName, lastName); 
        this.empID = empID;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
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

    public double computeSalary() {
        return 0.0; 
    }

 public void displayInfo() {
    System.out.println("Employee ID: " + empID);
    System.out.println("Name: " + getFirstName() + " " + getLastName());
    System.out.println("Date Hired: " + empDateHired.displayDateToString());
    System.out.println("Date of Birth: " + empBirthDate.displayDateToString());
    System.out.println("Salary: $" + computeSalary());
}


    @Override
    public String toString() {
        return "Employee ID: " + empID + "\n" +
               "Name: " + getFirstName() + " " + getLastName() + "\n" +
               "Date Hired: " + empDateHired + "\n" +
               "Date of Birth: " + empBirthDate;
    }
}
