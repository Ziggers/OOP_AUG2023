package employee.version5;

public class TestMain {
    public static void main(String[] args) {
        // Create MyDate instances for employee birthdates and hire dates
        MyDate empHourBirthDate = new MyDate(1990, 5, 15);
        MyDate empHourHireDate = new MyDate(2022, 3, 10);

        MyDate empPieceBirthDate = new MyDate(1995, 8, 20);
        MyDate empPieceHireDate = new MyDate(2021, 7, 5);

        MyDate empCommBirthDate = new MyDate(1985, 12, 2);
        MyDate empCommHireDate = new MyDate(2021, 8, 15);

        MyDate empBCEBirthDate = new MyDate(1992, 7, 18);
        MyDate empBCEHireDate = new MyDate(2020, 6, 25);

        MyDate empBCE1BirthDate = new MyDate(1989, 3, 6);
        MyDate empBCE1HireDate = new MyDate(2011, 6, 12);

        // Create instances of different employee types
        HourlyEmployee empHour = new HourlyEmployee(
                201,
                "John",
                "Doe",
                empHourHireDate,
                empHourBirthDate,
                45.5f, // float for totalHourWorked
                14.50f // float for ratePerHour
        );

        PieceWorkerEmployee empPiece = new PieceWorkerEmployee(
                202,
                "Alice",
                "Smith",
                empPieceHireDate,
                empPieceBirthDate,
                800.0f, // float for totalPiecesFinished
                2.25f // float for ratePerPiece
        );

        CommissionEmployee empComm = new CommissionEmployee(
                203,
                "Emma",
                "Johnson",
                empCommHireDate,
                empCommBirthDate,
                68000.0 // double for totalSales
        );

        BasePlusCommissionEmployee empBCE = new BasePlusCommissionEmployee(
                204,
                "Michael",
                "Brown",
                empBCEHireDate,
                empBCEBirthDate,
                95000.0, // double for totalSales
                2500.0 // double for baseSalary
        );

        BasePlusCommissionEmployee empBCE1 = new BasePlusCommissionEmployee(
                205,
                "Sophia",
                "Wilson",
                empBCE1HireDate,
                empBCE1BirthDate,
                87000.0, // double for totalSales
                2100.0 // double for baseSalary
        );

        // Create an EmployeeRoster and add employees to it
        EmployeeRoster roster = new EmployeeRoster();

        roster.addEmployee(empHour);
        roster.addEmployee(empPiece);
        roster.addEmployee(empComm);
        roster.addEmployee(empBCE);
        roster.addEmployee(empBCE1);

        // Display all employees in the roster
        roster.displayAllEmployees();
    }
}
