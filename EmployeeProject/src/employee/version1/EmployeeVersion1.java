package employee.version1;

public class EmployeeVersion1 {

    public static void main(String[] args) {
        MyDate birthDate = new MyDate(1990, 5, 15);
        MyDate hireDate = new MyDate(2022, 3, 10);

        HourlyEmployee employee1 = new HourlyEmployee(101, "Jeggy Sy", hireDate, birthDate, 45, (float) 15.00);

        System.out.println("Employee Information:");
        employee1.displayInfo();

        System.out.println("\nEmployee Details:");
        System.out.println(employee1.toString());

        MyDate pieceWorkerBirthDate = new MyDate(1995, 8, 20);
        MyDate pieceWorkerHireDate = new MyDate(2021, 7, 5);

        PieceWorkerEmployee employee2 = new PieceWorkerEmployee(102, "James Cheong", pieceWorkerHireDate, pieceWorkerBirthDate, 750, (float) 2.50);

        System.out.println("\nPiece Worker Employee Information:");
        employee2.displayInfo();
        System.out.println("\nEmployee Details:");
        System.out.println(employee2.toString());

        MyDate commissionEmployeeBirthDate = new MyDate(1985, 12, 2);
        MyDate commissionEmployeeHireDate = new MyDate(2021, 8, 15);

        CommissionEmployee employee3 = new CommissionEmployee(103, "Bob Marley", commissionEmployeeHireDate, commissionEmployeeBirthDate, 75000.0);

        System.out.println("\nCommission Employee Information:");
        employee3.displayInfo();
        System.out.println("\nEmployee Details:");
        System.out.println(employee3.toString());

    
        MyDate basePlusCommissionEmployeeBirthDate = new MyDate(1992, 7, 18);
        MyDate basePlusCommissionEmployeeHireDate = new MyDate(2020, 6, 25);

        BasePlusCommissionEmployee employee4 = new BasePlusCommissionEmployee(104, "Sir Gran", basePlusCommissionEmployeeHireDate, basePlusCommissionEmployeeBirthDate, 120000.0, 3000.0);

        System.out.println("\nBase Plus Commission Employee Information:");
        employee4.displayInfo();
        System.out.println("\nEmployee Details:");
        System.out.println(employee4.toString());
        
    }
}
