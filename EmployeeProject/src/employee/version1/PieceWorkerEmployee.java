package employee.version1;


public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private float totalPiecesFinished;
    private float ratePerPiece;

 public PieceWorkerEmployee() {
        empID = 0;
        empName = "";
        empDateHired = new MyDate();
        empBirthDate = new MyDate();
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }
public PieceWorkerEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }
public PieceWorkerEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate,
                                float totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
public double computeSalary() {
        double baseSalary = totalPiecesFinished * ratePerPiece;
        double bonus = (int) (totalPiecesFinished / 100) * 10 * ratePerPiece;
        return baseSalary + bonus;
    }
public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: ");
        empDateHired.displayDate();
        System.out.println("Date of Birth: ");
        empBirthDate.displayDate();
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);
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